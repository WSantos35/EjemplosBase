/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
/**
 *
 * @author Administrador1
 */
public class EjVid62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoFuentes miMarco=new MarcoFuentes();
    }
    
}

class MarcoFuentes extends JFrame{
    
    public MarcoFuentes(){
        
        iniciarComponentes();
        
        LaminaFuentes miLamina=new LaminaFuentes();
        
        miLamina.setForeground(Color.BLUE);//todo lo dibujado en la lamina lo pone de color azul
        
        add(miLamina);
        
    }
    
    public void iniciarComponentes(){
        setSize(400,400);
        
        setTitle("Prueba con Fuentes");
        
        setVisible(true);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class LaminaFuentes extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        Graphics2D g2=(Graphics2D)g;
        
        Font miFuente=new Font("Forte", Font.BOLD,26);
        
//        g2.setColor(Color.BLUE);
        
        g2.setFont(miFuente);
        
        g2.drawString("William", 100, 100);
        
        g2.setFont(new Font("Onyx",Font.ITALIC,40));
        
//        g2.setColor(new Color(128,90,50).darker());
        
        g2.drawString("Curso Java", 100, 200);
    }
    
}
