/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.comportamiento.interpreter;

/**
 *
 * @author bparr
 */
public class ExpresionDiv extends Expresion {

    @Override
    public int evaluate() {
        return (int) this.left.evaluate() / this.right.evaluate();
    }
    
}
