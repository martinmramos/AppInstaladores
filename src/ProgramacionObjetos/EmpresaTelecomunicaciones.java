package ProgramacionObjetos;

public class EmpresaTelecomunicaciones {

    public static void main(String[] args) {
        ParteDeTrabajo p1 = null;
        ParteDeTrabajo p2 = null;
        ParteDeTrabajo p3 = null;

        try {
            p1 = new ParteDeTrabajo("Revisión de mantenimiento en CTO", 1, 10);
            p2 = new ParteDeIncidencia("Sustitución de cableado por rotura", 2, 10, 10);
            p3 = new ParteDeSolicitud("Instalación nueva", 3, 15, 50);
        } catch (ExArgumentoIncorrecto e) {
            e.printStackTrace();
        } catch (Exception e1) {
            System.out.println(e1.getMessage());
        }

        try {
            System.out.println(p1.calcularCosteTotal());
            System.out.println(p2.calcularCosteTotal());
            System.out.println(p3.calcularCosteTotal());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(p1.getInfo());
            System.out.println(p2.getInfo());
            System.out.println(p3.getInfo());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
