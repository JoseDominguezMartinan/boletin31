/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author jose
 */
public class Secretario extends Empregado {
    private String numero;
    private String fax;
    private String despacho;

    public Secretario() {
    }

    public Secretario(String numero, String fax, String despacho) {
        this.numero = numero;
        this.fax = fax;
        this.despacho = despacho;
    }

    public Secretario(String numero, String fax, String despacho, String nome, String apelidos, String dni, String direccion, String telefono, float salario, int antiguedade, Empregado supervisor) {
        super(nome, apelidos, dni, direccion, telefono, salario, antiguedade, supervisor);
        this.numero = numero;
        this.fax = fax;
        this.despacho = despacho;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getAntiguedade() {
        return antiguedade;
    }

    public void setAntiguedade(int antiguedade) {
        this.antiguedade = antiguedade;
    }

    @Override
    public String toString() {
        return "Secretario{" + "numero=" + numero + ", fax=" + fax +"salario= "+salario+", despacho=" + despacho + '}';
    }
    

    @Override
    public void incrementarSalario() {
       salario=(float) ((0.05*antiguedade)+salario);
    }
    
    
}
