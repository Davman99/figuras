
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
public abstract class Figura {

    
    float area;
    float perimetro;
    Punto p1;
    Punto p2;

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro();

    
}
