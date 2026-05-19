/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplointerfaces.Clases;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Asus
 */
public class EsquemaRaton1 implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent evento) {
        Frame MiMarco = new Frame();
        Panel EntradaDatos = new Panel(new FlowLayout());

        TextField Nombre = new TextField(15);
        TextField Apellidos = new TextField(60);
        TextField Nacionalidad = new TextField("Española", 15);

        EntradaDatos.add(Nombre);
        EntradaDatos.add(Apellidos);
        EntradaDatos.add(Nacionalidad);

        MiMarco.add(EntradaDatos);
        MiMarco.setSize(500, 130);
        MiMarco.setTitle("Ventana con campos de texto");
        MiMarco.setVisible(true);
                
    }
    
    @Override
    public void mousePressed(MouseEvent evento) {
        Frame MiMarco = new Frame();

        //Panel EntradaDatos = new Panel(new FlowLayout());
        //Panel gen = new Panel();
        //Panel abajo = new Panel();
        //BorderLayout puntosCardinales = new BorderLayout();
        
        //Button op1 = new Button("Opcion 1");
        //Button op2 = new Button("Opcion 2");
        //Button op3 = new Button("Opcion 3");
        
        //MiMarco.add(abajo);
        
        //abajo.add(op1);
        //abajo.add(op2);
        //abajo.add(op3);

        //TextField Nombre = new TextField(15);
        //TextField Apellidos = new TextField(60);
        //TextField Nacionalidad = new TextField("Española", 15);

        //EntradaDatos.add(Nombre);
        //EntradaDatos.add(Apellidos);
        //EntradaDatos.add(Nacionalidad);

        //MiMarco.add(EntradaDatos);
        //MiMarco.setSize(500, 130);
        //MiMarco.setTitle("Ventana con campos de texto");
        //MiMarco.setVisible(true);
    }
    
    @Override
    public void mouseReleased(MouseEvent evento) {
    }
    
    @Override
    public void mouseEntered(MouseEvent evento) {
        evento.getComponent().setBackground(Color.red);
    }
    
    @Override
    public void mouseExited(MouseEvent evento) {
        evento.getComponent().
        setBackground(Color.gray);
    }

    
}
