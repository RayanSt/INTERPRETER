/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

import sun.security.provider.PolicyParser;

/**
 *
 * @author chamo
 */
public class EjemploInterpreter {

    String op = "4 5 + 7 *";
    Expresion raiz;
    String finali;
    String temporal1,temporal2;

    public void operacion() {

        String[] partes = op.split(" ");
        for (int j = 0; j <= partes.length; j++) {
            finali = partes[j];
            if (finali == "+"){
                
                raiz = new ExpresionPlus();
                raiz.setLeft(new ExpresionNumber());
                raiz.getLeft().setValue(partes[partes.length-j-2]);
                raiz.setRight(new ExpresionNumber());
                raiz.getRight().setValue(partes[partes.length-j-1]);
                j = j - 3;
                
            }if (finali == "-"){
                raiz = new ExpresionMinus();
            }if (finali == "*"){
                raiz = new ExpresionMul();
                
            }if (finali == "/"){
                raiz = new ExpresionDiv();
            }
        }
        raiz = new ExpresionPlus();
        raiz.setLeft(new ExpresionNumber());
        raiz.getLeft().setValue("15");
        
        raiz.setRight(new ExpresionMinus());
        raiz.getRight().setLeft(new ExpresionNumber());
        raiz.getRight().getLeft().setValue("25");
        raiz.getRight().setRight(new ExpresionNumber());
        raiz.getRight().getRight().setValue("5");
        System.out.println(raiz.evaluate());
    }
}
