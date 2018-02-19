/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.ad.Cuadrado;
import figuras.ad.Figura;
import figuras.ad.Punto;
import figuras.ad.Rectangulo;
import figuras.ad.circulo;
import figuras.ad.triangulo;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

  
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        
        System.out.println("Con que figura desea trabajar");
        System.out.println("1 Cuadrado");
        System.out.println("2 Rectangulo");
        System.out.println("3 Triangulo");
        System.out.println("4 Circulo");
        int opcion = n.nextInt();
        Figura s;
        switch(opcion){
            case 1:
               s =new Cuadrado();
                break;
            case 2:
                s=new Rectangulo();
                break;
            case 3:
                s=new triangulo();
                break;
            default:
                s=new circulo ();
                break;
        }
        
        Punto p1=new Punto();
        Punto p2=new Punto();
       
        System.out.println("Ingrese la coordenada en x del punto a");
        p1.setX(n.nextInt());
        System.out.println("Ingrese la coordenada en y del punto a");
        p1.setY(n.nextInt());
        System.out.println("Ingrese la coordenada en x del punto b");
        p2.setX(n.nextInt());
        System.out.println("Ingrese la coordenada en y del punto b");
        p2.setY(n.nextInt());
        
        s.setP1(p1);
        s.setP2(p2);
        s.calcularArea();
        s.calcularPerimetro();
        System.out.println("El areas es "+s.getArea());
        System.out.println("El perimetro es "+s.getPerimetro());
    }
    
}
