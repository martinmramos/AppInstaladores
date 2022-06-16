package ProgramacionObjetos;

public class ExArgumentoIncorrecto extends Exception{

    private static String MENSAJE = "EXARGINC: ";

    public ExArgumentoIncorrecto(String message) {
        super(MENSAJE + message);
    }
}
