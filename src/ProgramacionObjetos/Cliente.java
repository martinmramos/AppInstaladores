<<<<<<< HEAD
package ProgramacionObjetos;

import java.util.*;

public class Cliente {
    private String nif;
    private String nombre;
    private String direccion;
    private TreeSet<ParteDeTrabajo> partes;
    private ArrayList listadoFacturas = new ArrayList<>();

    public Cliente(String nif, String nombre, String direccion, TreeSet<ParteDeTrabajo> partes) throws ExArgumentoIncorrecto {
        validarParametros(nif, nombre, direccion);
        if (partes == null) this.partes = new TreeSet<>();
        this.partes = partes;
    }

    public Cliente(String nif, String nombre, String direccion, ParteDeTrabajo parte) throws ExArgumentoIncorrecto {
        validarParametros(nif, nombre, direccion);
        if (parte == null) throw new ExArgumentoIncorrecto("El parte no puede ser nulo.");
        this.partes = new TreeSet<>();
        this.partes.add(parte);
    }

    private void validarParametros(String nif, String nombre, String direccion) throws ExArgumentoIncorrecto {
        if (nif == null) throw new ExArgumentoIncorrecto("El NIF no puede ser nulo.");
        this.nif = nif;
        if (nombre == null) throw new ExArgumentoIncorrecto("El nombre no puede ser nulo.");
        this.nombre = nombre;
        if (direccion == null) throw new ExArgumentoIncorrecto("La dirección no puede ser nula.");
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TreeSet<ParteDeTrabajo> getPartes() {
        return partes;
    }

    public void setPartes(TreeSet<ParteDeTrabajo> partes) {
        this.partes = partes;
    }

    public String getPartesDeTrabajo() {
        String listadoPartes = "";
        for (ParteDeTrabajo p : partes) {
            listadoPartes += p.getInfo() + "\n";
        }
        return listadoPartes;
    }

    public void asignarParte(ParteDeTrabajo parte) {
        this.partes.add(parte);
    }

    public double calcularCosteTotal() {
        double result = 0;
        for (ParteDeTrabajo p : partes) {
            result += p.calcularCosteTotal();
        }
        return result;
    }

    public String generarFactura() {
        String factura = getPartesDeTrabajo() + calcularCosteTotal();
        return factura;
    }

    public void getFactura() {
        listadoFacturas.add(generarFactura());
    }

    public String getFacturasPorCoste() {
        String facturasCoste = "";
        Collections.sort(listadoFacturas);
        for (Object factura : listadoFacturas) {
            facturasCoste += factura + "\n";
        }
        return facturasCoste;
    }
}
=======
package ProgramacionObjetos;

import java.util.*;

public class Cliente {
    private String nif;
    private String nombre;
    private String direccion;
    private TreeSet<ParteDeTrabajo> partes;
    private ArrayList listadoFacturas = new ArrayList<>();

    public Cliente(String nif, String nombre, String direccion, TreeSet<ParteDeTrabajo> partes) throws ExArgumentoIncorrecto {
        validarParametros(nif, nombre, direccion);
        if (partes == null) this.partes = new TreeSet<>();
        this.partes = partes;
    }

    public Cliente(String nif, String nombre, String direccion, ParteDeTrabajo parte) throws ExArgumentoIncorrecto {
        validarParametros(nif, nombre, direccion);
        if (parte == null) throw new ExArgumentoIncorrecto("El parte no puede ser nulo.");
        this.partes = new TreeSet<>();
        this.partes.add(parte);
    }

    private void validarParametros(String nif, String nombre, String direccion) throws ExArgumentoIncorrecto {
        if (nif == null) throw new ExArgumentoIncorrecto("El NIF no puede ser nulo.");
        this.nif = nif;
        if (nombre == null) throw new ExArgumentoIncorrecto("El nombre no puede ser nulo.");
        this.nombre = nombre;
        if (direccion == null) throw new ExArgumentoIncorrecto("La dirección no puede ser nula.");
        this.direccion = direccion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TreeSet<ParteDeTrabajo> getPartes() {
        return partes;
    }

    public void setPartes(TreeSet<ParteDeTrabajo> partes) {
        this.partes = partes;
    }

    public String getPartesDeTrabajo() {
        String listadoPartes = "";
        for (ParteDeTrabajo p : partes) {
            listadoPartes += p.getInfo() + "\n";
        }
        return listadoPartes;
    }

    public void asignarParte(ParteDeTrabajo parte) {
        this.partes.add(parte);
    }

    public double calcularCosteTotal() {
        double result = 0;
        for (ParteDeTrabajo p : partes) {
            result += p.calcularCosteTotal();
        }
        return result;
    }

    public String generarFactura() {
        String factura = getPartesDeTrabajo() + calcularCosteTotal();
        return factura;
    }

    public void getFactura() {
        listadoFacturas.add(generarFactura());
    }

    public String getFacturasPorCoste() {
        String facturasCoste = "";
        Collections.sort(listadoFacturas);
        for (Object factura : listadoFacturas) {
            facturasCoste += factura + "\n";
        }
        return facturasCoste;
    }
}
>>>>>>> f80e070d54e33aa1d126648ff5a2f39017c22bc7
