/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.ad;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo extends Figura{

    @Override
    public void calcularArea() {
        float hipotenusa=p1.calcularDistancia(p2);
        float base=(float) (hipotenusa*0.5);
        float altura=(float) (hipotenusa*0.86);
        this.area=base*altura;
    }

    @Override
    public void calcularPerimetro() {
        float hipotenusa=p1.calcularDistancia(p2);
        float base=(float) (hipotenusa*0.5);
        float altura=(float) (hipotenusa*0.86);
        this.perimetro=2*(base+altura);
    }
         @Override
    public float getArea() {
        return area;
    }

    @Override
    public float getPerimetro() {
        return perimetro;
    }

    }
