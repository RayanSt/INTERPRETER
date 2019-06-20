package interpreter;

import java.io.IOException;
import patrones.comportamiento.interpreter.EjemploInterpreter;
import patrones.comportamiento.interpreter.Expresion;

/**
 *
 * @author estudiantes
 */
public class INTERPRETER {

    public static void main(String[] args) throws IOException {
        EjemploInterpreter ej = new EjemploInterpreter();
        ej.operacion("medios/archivo.txt");
    }
}
