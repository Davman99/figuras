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
public class triangulo extends Figura {
 @Override
    public void calcularArea() {
        float hipotenusa=p1.calcularDistancia(p2);
        float altura= (float) (Math.sqrt(3*hipotenusa)/2);
        this.area=(hipotenusa*altura)/2;
    } 

    @Override
    public void calcularPerimetro() {
        float hipotenusa=p1.calcularDistancia(p2);
        this.perimetro=3*hipotenusa;
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
    
