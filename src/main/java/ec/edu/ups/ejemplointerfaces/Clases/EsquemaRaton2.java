/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.ejemplointerfaces.Clases;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Asus
 */
public class EsquemaRaton2 implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent evento) {
        
        Frame miMarco = new Frame();
        Panel panelMenuNorte = new Panel();
        Panel panelGeneral = new Panel();
        BorderLayout puntosCardinales = new BorderLayout();
        FlowLayout opcionesMenu = new FlowLayout();
        Label Titulo = new Label("OLAA");
        
        Button op1 = new Button("Opcion 1");
        Button op2 = new Button("Opcion 2");
        Button op3 = new Button("Opcion 3");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");
        
        panelGeneral.setLayout(puntosCardinales);
        panelMenuNorte.setLayout(opcionesMenu);
        miMarco.add(panelGeneral);  
        
        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        
        panelMenuNorte.add(Titulo);
        
        panelMenuNorte.add(op1);
        panelMenuNorte.add(op2);
        panelMenuNorte.add(op3);
        panelGeneral.add(botonSur, BorderLayout.SOUTH);
        panelGeneral.add(botonEste, BorderLayout.EAST);
        panelGeneral.add(botonOeste, BorderLayout.WEST);
        panelGeneral.add(botonCentro, BorderLayout.CENTER);
        
        miMarco.setSize(400, 150);
        miMarco.setTitle("Mi pagina");
        miMarco.setVisible(true);
        
    }

    @Override
    public void mousePressed(MouseEvent evento) {
    
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
