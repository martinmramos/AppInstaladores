package ProgramacionObjetos;

import java.util.HashMap;

public class Gestor {
    private String empresa;
    private HashMap<String, Cliente> clientes;

    public Gestor(String empresa, HashMap<String, Cliente> clientes) throws ExArgumentoIncorrecto {
        validarParametros(empresa);
        if (clientes == null) this.clientes = new HashMap<>();
        this.clientes = clientes;
    }

    public Gestor(String empresa, Cliente cliente) throws ExArgumentoIncorrecto {
        validarParametros(empresa);
        if (cliente == null) throw new ExArgumentoIncorrecto("El cliente no puede ser nulo.");
        this.clientes = new HashMap<>();
        this.clientes.put(cliente.getNif(), cliente);
    }

    private void validarParametros(String empresa) throws ExArgumentoIncorrecto {
        if (empresa == null) throw new ExArgumentoIncorrecto("El nombre de la empresa no puede ser nulo.");
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public HashMap<String, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<String, Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.put(cliente.getNif(), cliente);
    }

    public void addParte(ParteDeTrabajo p, String nif) throws ExArgumentoIncorrecto {
        if (p == null) throw new ExArgumentoIncorrecto("El parte no existe.");
        if (!clientes.containsKey(nif))
            throw new ExArgumentoIncorrecto("El cliente no existe en el listado de la empresa.");
        Cliente c = clientes.get(nif);
        c.asignarParte(p);
    }

    public void getFacturasPorFecha(String nif) throws ExArgumentoIncorrecto {
        if (!clientes.containsKey(nif))
            throw new ExArgumentoIncorrecto("El cliente no existe en el listado de la empresa.");
        Cliente c = clientes.get(nif);
        c.getFactura();
    }

    public String getFacturasPorCoste(String nif) throws ExArgumentoIncorrecto {
        if (!clientes.containsKey(nif))
            throw new ExArgumentoIncorrecto("El cliente no existe en el listado de la empresa.");
        Cliente c = clientes.get(nif);
        return c.getFacturasPorCoste();
    }

    public double calcularCosteTotal() {
        double result = 0.0;
        for (String clave : clientes.keySet()) {
            Cliente c = clientes.get(clave);
            result += c.calcularCosteTotal();
        }
        return result;
    }
}
