/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Menu {
    private byte opc;
   
    public void mostrarMenu(){
        Inventario i=new Inventario();
         while(opc!=2){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Agregar producto\n"
                         + "2.Salir\n"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
                i.agregarProducto();
                break;
             } 
             case 2:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
        
    }
}
