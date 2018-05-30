/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Administrador1
 */
public class EjVid58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MarcoTexto miMarco=new MarcoTexto();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


class MarcoTexto extends JFrame{
    
    public MarcoTexto(){
        
        initComponents();
        
        Lamina miLamina=new Lamina();
        
        add(miLamina);
    }
    
    public void initComponents(){
        setVisible(true);
        
        setSize(600,450);
        
        setLocation(400,200);
        
        setTitle("Primer Texto");
    }
    
}

//clase de la lamina
class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        g.drawString("Estamos Aprendiendo Swing", 
                100 , 100);
    }
    
}