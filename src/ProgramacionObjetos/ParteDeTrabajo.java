package ProgramacionObjetos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParteDeTrabajo {

    private String descripcion;
    private int horas;
    private double costeHora;
    private long fechaDeCreacion;

    public ParteDeTrabajo(String descripcion, int horas, double costeHora) throws ExArgumentoIncorrecto {
        if (descripcion == null) throw new ExArgumentoIncorrecto("La descripción del trabajo no puede estar vacía.");
        this.descripcion = descripcion;
        if (horas <= 0) throw new ExArgumentoIncorrecto("Las horas de trabajo no pueden ser 0 o inferior.");
        this.horas = horas;
        if (costeHora <= 0) throw new ExArgumentoIncorrecto("El coste no puede ser 0 o inferior.");
        this.costeHora = costeHora;
        Date creacion = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        this.setFechaDeCreacion(Long.parseLong(dateFormat.format(creacion)));
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getCosteHora() {
        return costeHora;
    }

    public void setCosteHora(double costeHora) {
        this.costeHora = costeHora;
    }

    public long getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(long fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public double calcularCosteTotal(){
        return horas * costeHora;
    }

    public String getInfo(){
        return "-PARTE DE TRABAJO-" +
                "\nDescripción del trabajo: " + descripcion +
                "\nHoras de trabajo: " + horas +
                "\nCoste por hora: " + costeHora + " €" +
                "\nCoste total: " + calcularCosteTotal() + " €" +
                "\nFecha: " + fechaDeCreacion;
    }
}