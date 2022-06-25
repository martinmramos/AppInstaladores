package ProgramacionObjetos;

import java.util.HashMap;
import java.util.TreeSet;

public class EmpresaTelecomunicaciones {

    public static void main(String[] args) {
        Gestor g1 = null;
        Cliente c1 = null;
        Cliente c2 = null;
        ParteDeTrabajo p1 = null;
        ParteDeTrabajo p2 = null;
        ParteDeTrabajo p3 = null;
        ParteDeTrabajo p4 = null;
        ParteDeTrabajo p5 = null;

        try {
            g1 = new Gestor("Fibritel, S.L.", new HashMap<>());
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        try {
            c1 = new Cliente("12345678A", "Martin", "Calle Principal, Nº 1", new TreeSet<>());
            c2 = new Cliente("87654321B", "Ana", "Avenida Principal, S/N", new TreeSet<>());
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        g1.addCliente(c1);
        g1.addCliente(c2);

        try {
            p1 = new ParteDeIncidencia("Sustitución de cableado por rotura", 2, 10, 25);
            p2 = new ParteDeTrabajo("Revisión de mantenimiento en CTO", 1, 10);
            p3 = new ParteDeSolicitud("Instalación nueva", 5, 20, 50);
            p4 = new ParteDeSolicitud("Alta de servicio", 2, 15, 25);
            p5 = new ParteDeIncidencia("Fallo de conexión", 3, 10, 10);
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        try {
            g1.addParte(p2, "12345678A");
            g1.addParte(p1, "12345678A");
            g1.addParte(p3, "12345678A");
            g1.addParte(p2, "87654321B");
            g1.addParte(p4, "87654321B");
            g1.addParte(p5, "87654321B");
            g1.addParte(p1, "87654321B");
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        try {
            g1.getFacturasPorFecha("12345678A");
            String facturaCosteC1 = g1.getFacturasPorCoste("12345678A");
            System.out.println(facturaCosteC1);
            g1.getFacturasPorFecha("87654321B");
            String facturaCosteC2 = g1.getFacturasPorCoste("87654321B");
            System.out.println(facturaCosteC2);
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        double coste = g1.calcularCosteTotal();
        System.out.println(coste);

    }
}
