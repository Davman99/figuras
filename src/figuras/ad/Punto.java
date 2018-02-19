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
public class Punto {
    int x;
    int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
        public float calcularDistancia (Punto p){
         float distancia=(float) ((float) Math.pow((x-p.x),2)+Math.pow((y-p.y),2));
         return (float) Math.sqrt(distancia);
     }

   
}
