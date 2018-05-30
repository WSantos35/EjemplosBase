/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 *
 * @author Administrador1
 */
public class EjVid59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoDibujos miMarco=new MarcoDibujos();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        miMarco.setVisible(true);
    }
    
}

class MarcoDibujos extends JFrame{
    
    public MarcoDibujos(){
        
        iniciarComponentes();
        
        LaminaFiguras miLamina=new LaminaFiguras();
        
        add(miLamina);
        
    }
    
    public void iniciarComponentes(){
        setTitle("Prueba Dibujos");
        
        setSize(400,400);
    }
    
}

class LaminaFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
//        g.drawRect(50, 50, 200, 200);

//        g.drawLine(100, 100, 300, 200);
        
//          g.drawArc(50, 100, 100, 200, 120, 150);
          
          Graphics2D g2=(Graphics2D) g;
          
          Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
          
          g2.draw(rectangulo);
          
          Ellipse2D elipse=new Ellipse2D.Double();
          
          elipse.setFrame(rectangulo);
          
          g2.draw(elipse);
          
          g2.draw(new Line2D.Double(100,100,300,250));
          
          double centrox=rectangulo.getCenterX();
          
          double centroy=rectangulo.getCenterY();
          
          double radio=150;
          
          Ellipse2D circulo=new Ellipse2D.Double();
          
          circulo.setFrameFromCenter(centrox, centroy, centrox+radio, centroy+radio);
          
          g2.draw(circulo);
    }
    
}
