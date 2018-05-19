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
public class Vendedor extends Empregado {
private String numeroMovil;
private String area;
private int porcentaje;
private Coche coche;
ArrayList<String>clientes=new ArrayList();

    public Vendedor() {
    }

    public Vendedor(String numeroMovil, String area, int porcentaje, Coche coche) {
        this.numeroMovil = numeroMovil;
        this.area = area;
        this.porcentaje = porcentaje;
        this.coche = coche;
    }

    public Vendedor(String numeroMovil, String area, int porcentaje, Coche coche, String nome, String apelidos, String dni, String direccion, String telefono, float salario, int antiguedade, Empregado supervisor) {
        super(nome, apelidos, dni, direccion, telefono, salario, antiguedade, supervisor);
        this.numeroMovil = numeroMovil;
        this.area = area;
        this.porcentaje = porcentaje;
        this.coche = coche;
    }

    public String getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(String numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
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
        return "Vendedor{" + "numeroMovil=" + numeroMovil + ", area=" + area +"salario= "+salario+", porcentaje=" + porcentaje + ", coche=" + coche + ", clientes=" + clientes + '}';
    }


    
    @Override
    public void incrementarSalario() {
        salario=(float) ((antiguedade*0.1)+salario);
    }
    
    public void anadirCliente(String nome){
        clientes.add(nome);
    }
    public void borrarCliente(){
        for(String cli:clientes){
        clientes.remove(cli);
    }
    }
    public void cambiarCoche(Coche coche){
        this.coche=coche;
    }
    
}
