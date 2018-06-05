/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import jdk.nashorn.internal.objects.NativeRegExp;
/**
 *
 * @author Administrador1
 */
public class EjVid71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoTeclado miMarco=new MarcoTeclado();
    }
    
}

class MarcoTeclado extends JFrame{
    
    public MarcoTeclado(){
        inicializarComponentes();
        
        EventoTeclado tecla=new EventoTeclado();
        
        addKeyListener(tecla);
    }
    
    public void inicializarComponentes(){
        setVisible(true);
        
        setBounds(700, 300, 600, 450);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


class EventoTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        char letra=e.getKeyChar();
        
        System.out.println(letra);
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        int codigo=e.getKeyCode();//devuelve el valo de la tecla presionada
//        System.out.println(codigo);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    
}