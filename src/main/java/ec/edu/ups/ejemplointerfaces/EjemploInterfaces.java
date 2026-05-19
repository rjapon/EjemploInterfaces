package ec.edu.ups.ejemplointerfaces;

import ec.edu.ups.ejemplointerfaces.Clases.EsquemaRaton1;
import ec.edu.ups.ejemplointerfaces.Clases.EsquemaRaton2;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author Asus
 */
public class EjemploInterfaces {

    public static void main(String[] args) {
        
        //=========================================================//
        
        //1er Ejemplo
                   
        //Frame miVentana = new Frame();
        //miVentana.setSize(500,200);
        //miVentana.setTitle("Mi ventana de ejemplo");
        //miVentana.setVisible(true);
        
        //=========================================================//
        
        //MiVentana v1 = new MiVentana();
        //MiVentana v2 = new MiVentana("Ventana 2");
        //MiVentana v3 = new MiVentana("Ventana 3", 400, 200, 500, 200);
        
        //=========================================================//
        
        //Frame miMarco = new Frame();
        //miMarco.setSize(500,200);
        //miMarco.setTitle("Mi ventana de ejemlo");
        //miMarco.setLocation(new Point(100,220));
        //miMarco.setVisible(true);
        
        //=========================================================//
        
        //Frame miVentana = new Frame();
        //Button boton1 = new Button("Hola");
        
        //miVentana.setSize(300,200);
        //miVentana.setTitle("Ventana con boton");
        //miVentana.setVisible(true);
        
        //miVentana.add(boton1);
                
        //=========================================================//
        
        //Frame marco = new Frame();
        
        //FlowLayout posicionamientoSecuencial = new FlowLayout(FlowLayout.RIGHT);
        
        //Panel miPanel = new Panel();
        
        //Button botonArea = new Button("Calcular Area");
        //Button botonPerimetro = new Button("Calcular Perimetro");
        //Button botonA = new Button("Prueba 1");
        //Button botonB = new Button("Prueba 2");
        
        //miPanel.setLayout(posicionamientoSecuencial);
        
        //marco.setSize(500, 500);
        //marco.setTitle("Mi ventana");
        //marco.setLocation(500, 250);
        //marco.setVisible(true);
        
        //marco.add(miPanel);
        
        //miPanel.add(botonArea);
        //miPanel.add(botonPerimetro);
        //miPanel.add(botonA);
        //miPanel.add(botonB);
        
        //=========================================================//
        
        //Frame miVentana = new Frame();
        //Panel miPanel = new Panel();
        //FlowLayout posicionamientoSecuencial = new FlowLayout();
        
        //Button botonA = new Button("Primer botón");
        //Button botonB = new Button("Segundo botón");
        //Button botonC = new Button("Tercer botón");
        //Button botonD = new Button("Cuarto botón");
        
        //miPanel.setLayout(posicionamientoSecuencial);
        //miVentana.add(miPanel);
        //miPanel.add(botonA);
        //miPanel.add(botonB);
        //miPanel.add(botonC);
        //miPanel.add(botonD);
        //miVentana.setSize(300, 100);
        //miVentana.setTitle("Ventana con flow layout");
        //miVentana.setVisible(true);
        
        //=========================================================//
        
        //Frame miMarco = new Frame();
        //Panel panelMenuNorte = new Panel();
        //Panel panelGeneral = new Panel();
        //BorderLayout puntosCardinales = new BorderLayout();
        //FlowLayout opcionesMenu = new FlowLayout();
        //Label Titulo = new Label("OLAA");
        
        //Button op1 = new Button("Opcion 1");
        //Button op2 = new Button("Opcion 2");
        //Button op3 = new Button("Opcion 3");
        //Button botonSur = new Button("Sur");
        //Button botonEste = new Button("Este");
        //Button botonOeste = new Button("Oeste");
        //Button botonCentro = new Button("Centro");
        
        //panelGeneral.setLayout(puntosCardinales);
        //panelMenuNorte.setLayout(opcionesMenu);
        //miMarco.add(panelGeneral);  
        
        //panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
        
        //panelMenuNorte.add(Titulo);
        
        //panelMenuNorte.add(op1);
        //panelMenuNorte.add(op2);
        //panelMenuNorte.add(op3);
        //panelGeneral.add(botonSur, BorderLayout.SOUTH);
        //panelGeneral.add(botonEste, BorderLayout.EAST);
        //panelGeneral.add(botonOeste, BorderLayout.WEST);
        //panelGeneral.add(botonCentro, BorderLayout.CENTER);
        
        //miMarco.setSize(400, 150);
        //miMarco.setTitle("Ventana con BorderLayout");
        //miMarco.setVisible(true);
        
        //=========================================================//
        
        //Frame miVentana = new Frame();
        //Panel miPanel = new Panel();
        //GridLayout matriz = new GridLayout(2, 3);
        //Button[] botones = new Button[6];
        
        //for (int i = 0; i < 6; i++)
            //botones[i] = new Button("Botón " + i);
        
        //miPanel.setLayout(matriz);
        //for (int i = 0; i < 6; i++)
            //miPanel.add(botones[i]);
        
        //miVentana.add(miPanel);
        //miVentana.setSize(300, 100);
        //miVentana.setTitle("Ventana con GridLayout");
        //miVentana.setVisible(true);
        
        //=========================================================//
        
        Frame miMarco = new Frame();
        Label titulo = new Label("Notas ");
        
        miMarco.add(titulo);
        
        miMarco.setSize(500,200);
        miMarco.setTitle("Ventana con etiqueta");
        miMarco.setVisible(true);
        
        //=========================================================//
        
        //Frame MiMarco = new Frame();

        //Panel EntradaDatos = new Panel(new FlowLayout());
        //Panel gen = new Panel();
        //Panel abajo = new Panel();
        //BorderLayout puntosCardinales = new BorderLayout();

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
        
        //=========================================================//
        
        //Frame miVentana = new Frame("Esquema de eventos");
        //Panel miPanel = new Panel();
        
        //Button botonH = new Button("Saludo");
        //Button botonA = new Button("Despedida");
        
        //Button botonP = new Button("Prueba");
        
        //miPanel.add(botonH);
        //miPanel.add(botonA);
        //miPanel.add(botonP);
        
        //miVentana.add(miPanel);
        //miVentana.setSize(500,200);
        //miVentana.setVisible(true);
        
        //botonH.addMouseListener(new EsquemaRaton1());
        //botonA.addMouseListener(new EsquemaRaton1());
        //botonP.addMouseListener(new EsquemaRaton2());
                
    }
}
