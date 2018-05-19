/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

import java.util.ArrayList;

/**
 *
 * @author jose
 */
public class JefeZona extends Empregado {
    private String despacho;
    private String secretario;
    private Coche coche;
    ArrayList<Vendedor>vendedoresJefe=new ArrayList();

    public JefeZona() {
    }

    public JefeZona(String despacho, String secretario, Coche coche) {
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }

    public JefeZona(String despacho, String secretario, Coche coche, String nome, String apelidos, String dni, String direccion, String telefono, float salario, int antiguedade, Empregado supervisor) {
        super(nome, apelidos, dni, direccion, telefono, salario, antiguedade, supervisor);
        this.despacho = despacho;
        this.secretario = secretario;
        this.coche = coche;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getSecretario() {
        return secretario;
    }

    public void setSecretario(String secretario) {
        this.secretario = secretario;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public ArrayList<Vendedor> getVendedoresJefe() {
        return vendedoresJefe;
    }

    public void setVendedoresJefe(ArrayList<Vendedor> vendedoresJefe) {
        this.vendedoresJefe = vendedoresJefe;
    }

    @Override
    public String toString() {
        return "JefeZona{" + "despacho=" + despacho + ", secretario=" + secretario + ", coche=" + coche +"salario= "+salario+" , vendedoresJefe=" + vendedoresJefe + '}';
    }
    
    

    @Override
    public void incrementarSalario() {
        salario=(float) ((0.2*antiguedade)+salario);
    }
    
}
