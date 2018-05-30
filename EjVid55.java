
package Ejemplos;
import javax.swing.*;
/**
 *
 * @author Administrador1
 */
public class EjVid55 {

    public static void main(String[] args) {
        
        miMarco marco1=new miMarco();
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}


class miMarco extends JFrame{
    
    public miMarco(){
        
//        setSize(500,300);//clase toolkit: almacena metodos para comunicarse con el sistema nativo de ventanas
//        
//        setLocation(500, 300);
          
          setBounds(500, 300, 250, 250);
          
//          setResizable(false);

//            setExtendedState(JFrame.MAXIMIZED_BOTH);// abre el Frame en pantalla completa
            
            setTitle("Mi Ventana");
    }
    
}