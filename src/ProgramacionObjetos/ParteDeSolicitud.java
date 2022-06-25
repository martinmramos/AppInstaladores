package ProgramacionObjetos;

public class ParteDeSolicitud extends ParteDeTrabajo {

    private int descuento;

    public ParteDeSolicitud(String descripcion, int horas, double costeHora, int descuento) throws ExArgumentoIncorrecto {
        super(descripcion, horas, costeHora);
        if (descuento <= 0 || descuento >= 100)
            throw new ExArgumentoIncorrecto("El descuento tiene que ser mayor de 0 y menor que 100.");
        this.descuento = descuento;
    }

    @Override
    public double calcularCosteTotal() {
        return getHoras() * (getCosteHora() - (((double) descuento / 100) * getCosteHora()));
    }

    @Override
    public String getInfo() {
        return "-PARTE DE SOLICITUD-" +
                "\nDescripción del trabajo: " + getDescripcion() +
                "\nHoras de trabajo: " + getHoras() +
                "\nCoste por hora: " + getCosteHora() + " €" +
                "\nDescuento: " + descuento + "%" +
                "\nCoste total: " + calcularCosteTotal() + " €" +
                "\nFecha: " + getFechaDeCreacion();
    }
}
