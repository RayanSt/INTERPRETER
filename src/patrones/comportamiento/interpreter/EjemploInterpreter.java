/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brayan
 */
public class EjemploInterpreter {
    
    String op;
    Expresion raiz;
    String[] partes;
    String finali;
    ArrayList<String> token = new ArrayList<String>();

    public void operacion(String archivo) throws FileNotFoundException, IOException {
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        op = b.readLine();
        partes = op.split(" ");
        for (int j = 0; j <= partes.length - 1; j++) {
            finali = partes[j];

            if (!finali.equals("+") && !finali.equals("-") && !finali.equals("*") && !finali.equals("/")) {
                token.add(finali);
            }
            if (finali.equals("+")) {
                raiz = new ExpresionPlus();
                raiz.setLeft(new ExpresionNumber());
                raiz.getLeft().setValue(token.get(token.size() - 2));
                raiz.setRight(new ExpresionNumber());
                raiz.getRight().setValue(token.get(token.size() - 1));
                token.set(token.size() - 2, Integer.toString(raiz.evaluate()));
                token.remove(token.size() - 1);
            }
            if (finali.equals("-")) {
                raiz = new ExpresionMinus();
                raiz.setLeft(new ExpresionNumber());
                raiz.getLeft().setValue(token.get(token.size() - 2));
                raiz.setRight(new ExpresionNumber());
                raiz.getRight().setValue(token.get(token.size() - 1));
                token.set(token.size() - 2, Integer.toString(raiz.evaluate()));
                token.remove(token.size() - 1);
            }
            if (finali.equals("*")) {
                raiz = new ExpresionMul();
                raiz.setLeft(new ExpresionNumber());
                raiz.getLeft().setValue(token.get(token.size() - 2));
                raiz.setRight(new ExpresionNumber());
                raiz.getRight().setValue(token.get(token.size() - 1));
                token.set(token.size() - 2, Integer.toString(raiz.evaluate()));
                token.remove(token.size() - 1);

            }
            if (finali.equals("/")) {
                raiz = new ExpresionDiv();
                raiz.setLeft(new ExpresionNumber());
                raiz.getLeft().setValue(token.get(token.size() - 2));
                raiz.setRight(new ExpresionNumber());
                raiz.getRight().setValue(token.get(token.size() - 1));
                token.set(token.size() - 2, Integer.toString(raiz.evaluate()));
                token.remove(token.size() - 1);
            }
        }

        System.out.println(raiz.evaluate());
    }
}
