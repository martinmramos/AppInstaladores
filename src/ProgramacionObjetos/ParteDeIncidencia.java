package ProgramacionObjetos;

public class ParteDeIncidencia extends ParteDeTrabajo {

    private int incremento;

    public ParteDeIncidencia(String descripcion, int horas, double costeHora, int incremento) throws ExArgumentoIncorrecto {
        super(descripcion, horas, costeHora);
        if (incremento <= 0 || incremento >= 100)
            throw new ExArgumentoIncorrecto("El incremento tiene que ser mayor de 0 y menor que 100.");
        this.incremento = incremento;
    }

    @Override
    public double calcularCosteTotal() {
        return getHoras() * (getCosteHora() + (((double) incremento / 100) * getCosteHora()));
    }

    @Override
    public String getInfo() {
        return "-PARTE DE INCIDENCIA-" +
                "\nDescripción del trabajo: " + getDescripcion() +
                "\nHoras de trabajo: " + getHoras() +
                "\nCoste por hora: " + getCosteHora() + " €" +
                "\nIncremento: " + incremento + "%" +
                "\nCoste total: " + calcularCosteTotal() + " €" +
                "\nFecha: " + getFechaDeCreacion();
    }
}
