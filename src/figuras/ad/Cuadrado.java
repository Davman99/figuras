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
public class Cuadrado extends Figura {
    @Override
    public void calcularArea() {
        float lado= p1.calcularDistancia(p2);
        this.area=lado*lado;
        
    }

    @Override
    public void calcularPerimetro() {
        float lado=p1.calcularDistancia(p2);
        this.perimetro=lado*4;
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
