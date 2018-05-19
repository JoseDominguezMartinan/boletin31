/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author jdominguezmartinan
 */
public abstract class Empregado
{
    private String nome;
    private String apelidos;
    private String dni;
    private String direccion;
    private String telefono;
    float salario;
    int antiguedade;
    private Empregado supervisor;

    public Empregado()
    {
    }

    public Empregado(String nome,String apelidos,String dni,String direccion,String telefono,float salario,int antiguedade,Empregado supervisor)
    {
        this.nome = nome;
        this.apelidos = apelidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedade=antiguedade;
        this.supervisor = supervisor;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getApelidos()
    {
        return apelidos;
    }

    public void setApelidos(String apelidos)
    {
        this.apelidos = apelidos;
    }

    public String getDni()
    {
        return dni;
    }

    public void setDni(String dni)
    {
        this.dni = dni;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }

    public float getSalario()
    {
        return salario;
    }

    public void setSalario(float salario)
    {
        this.salario = salario;
    }

    public Empregado getSupervisor()
    {
        return supervisor;
    }
    public int getAntiguedade(){
        return antiguedade;
    }
    public void setAntiguedade(int antiguedade){
        this.antiguedade=antiguedade;
    }

    public void setSupervisor(Empregado supervisor)
    {
        this.supervisor = supervisor;
    }

    @Override
    public String toString()
    {
        return "Empregado{"+"nome="+nome+", apelidos="+apelidos+", dni="+dni+", direccion="+direccion+", telefono="+telefono+", salario="+salario+",antiguedade="+antiguedade+" ,supervisor="+supervisor+'}';
    }
    
  public void cambiarSupervisor(Empregado emp){
      supervisor=emp;
  }
  public abstract void incrementarSalario();
  
    
    
}
