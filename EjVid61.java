/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
/**
 *
 * @author Administrador1
 */
public class EjVid61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoDibujosColor miMarco=new MarcoDibujosColor();
    }
    
}


class MarcoDibujosColor extends JFrame{
    
    public MarcoDibujosColor(){
      
        iniciarComponentes();
        
        LaminaDibujosColores laminaDibujos=new LaminaDibujosColores();
        
        add(laminaDibujos);
        
        laminaDibujos.setBackground(Color.BLACK);//SystemColor.windows le da por defecto el color del sistema operativo
        
    }
    
    public void iniciarComponentes(){
       
        setSize(400,400);
        
        setTitle("Prueba con Colores");
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class LaminaDibujosColores extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2=(Graphics2D)g;
        
        Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
        
        g2.setPaint(Color.YELLOW);
        
        g2.draw(rectangulo);
        
        g2.setPaint(Color.RED);
        
        g2.fill(rectangulo);
        
        Ellipse2D elipse=new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
       
        Color miColor=new Color(125,189,200);
        
        g2.setPaint(miColor);
        
//        g2.setPaint(new Color(109,172,59).darker());//programa de fotoshop para obtener collres en RGB (PS<--nombre programa)
        
        g2.fill(elipse);// en vez de fill se puede utilizar draw para color a los trazos
        
    }
    
}
