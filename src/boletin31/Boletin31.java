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
public class Boletin31
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        // creamos un obxeto de cada unha das clases que temos, no caso de coches crearemos dous para adjudicalos despois:
        Coche c1=new Coche("0012DFC","Audi","A3");
        Coche c2=new Coche("0035FDF","BMW","118D");
        JefeZona jose=new JefeZona("D1","Pedro",c1,"Jose","Dominguez","77777777B","Calle falsa 123","666202020",2500,3,null);
        Secretario pedro=new Secretario("1","986606060","D1","Pedro","Fernandez","77458565W","Avenida de la falsedad 1243","986545454",1100,5,jose);
        Vendedor luis=new Vendedor("666585598","area de redondela",5,c2,"Luis","Fernandez","6658974P","Travesia de la mentira 236","986525232",1200,3,jose);
        //visualizamos los datos añadidos 
        System.out.println(jose.toString());
        System.out.println(pedro.toString());
        System.out.println(luis.toString());
        // llamamos a los metodos 
        jose.incrementarSalario();
        pedro.incrementarSalario();
        luis.anadirCliente("bar furancho os pepes");
        // volvemos a visualizar los datos para ver como funcionan 
         System.out.println(jose.toString());
        System.out.println(pedro.toString());
        System.out.println(luis.toString());
        
    }
    
}
