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
public class circulo extends Figura {
    @Override
    public void calcularArea() {
        float n = (float) 3.14;
        float radio=p1.calcularDistancia(p2);
        this.area=(float)(n*Math.pow(radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        float n = (float) 3.14;
        float radio=p1.calcularDistancia(p2);
        this.perimetro=2*n*radio;
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
