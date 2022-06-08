

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
        

/**
 *
 * @author Carlos Guzmán Cabrera
 */
public class MandelSel extends JPanel{

    
    public static void main(String[] args) {
        //Creamos una ventana para nuestro conjunto
        JFrame ventana = new JFrame("Conjunto de Mandelbrot en Java");
        //Operación para cerrarla pulsar X
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().add(new MandelSel());
        //Agregamos dimensión, posición y la activamos
        ventana.setSize(1280,720);
        ventana.setLocation(0, 0);
        ventana.setVisible(true);
        
    }
    
    public void paint(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK); //Fondo negro
        int height = getHeight()/2; int width = getWidth()/2;
        //Puntos
        double px, py, x , y;
        int i = 0; int j = 0;
        for (i = 0; i < getHeight(); i++) {
            for (j = 0; j < getWidth(); j++) {
                px = (j - width) / 240.0 -0.4;
                py = (i - height) / 240.0;
                x = 0; y = 0; int cont = 0;
                //Comprobamos 100 veces si la sucesión da algún elemento cuya distancia sea mayor a 2 con respecto al origen
                while(cont < 100 && x * x + y * y < 4){
                    double auxX = x*x-y*y+px;
                    double auxY = 2*x*y+py;
                    x = auxX; y = auxY;
                    cont++;
                }
                //Si no pertenece al conjunto de Mandelbrot pintamos, en función del número de veces que se ejecuta hasta encontrar que no pertence
                if(cont<100){
                    g.setColor(new Color(255-(cont*32)%256,0,cont*2));
                    g.fillRect(j, i, 1, 1);
                }
            }
        }
    }
    
}
