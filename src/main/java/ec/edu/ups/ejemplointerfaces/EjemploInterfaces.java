package ec.edu.ups.ejemplointerfaces;

import ec.edu.ups.ejemplointerfaces.Clases.EsquemaRaton;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeAccion;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeElemento;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeEnfoque;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeRaton;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeTeclado;
import ec.edu.ups.ejemplointerfaces.Clases.InterrupcionesDeVentana;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Point;
import java.awt.TextField;

/**
 *
 * @author Asus
 */
public class EjemploInterfaces {

    public static void main(String[] args) {

//        =========================================================//
//        1er Ejemplo
//        Frame miVentana = new Frame();
//        miVentana.setSize(500,200);
//        miVentana.setTitle("Mi ventana de ejemplo");
//        miVentana.setVisible(true);
//        =========================================================//
//        MiVentana v1 = new MiVentana();
//        MiVentana v2 = new MiVentana("Ventana 2");
//        MiVentana v3 = new MiVentana("Ventana 3", 400, 200, 500, 200);
//        =========================================================//
//        Frame miMarco = new Frame();
//        miMarco.setSize(500,200);
//        miMarco.setTitle("Mi ventana de ejemlo");
//        miMarco.setLocation(new Point(100,220));
//        miMarco.setVisible(true);
//        =========================================================//
//        Frame miVentana = new Frame();
//        Button boton1 = new Button("Hola");
//        miVentana.setSize(300,200);
//        miVentana.setTitle("Ventana con boton");
//        miVentana.setVisible(true);
//        miVentana.add(boton1);
//        =========================================================//
//        Frame marco = new Frame();
//        FlowLayout posicionamientoSecuencial = new FlowLayout(FlowLayout.RIGHT);
//        Panel miPanel = new Panel();
//        Button botonArea = new Button("Calcular Area");
//        Button botonPerimetro = new Button("Calcular Perimetro");
//        Button botonA = new Button("Prueba 1");
//        Button botonB = new Button("Prueba 2");
//        miPanel.setLayout(posicionamientoSecuencial);
//        marco.setSize(500, 500);
//        marco.setTitle("Mi ventana");
//        marco.setLocation(500, 250);
//        marco.setVisible(true);
//        marco.add(miPanel);
//        miPanel.add(botonArea);
//        miPanel.add(botonPerimetro);
//        miPanel.add(botonA);
//        miPanel.add(botonB);
//        =========================================================//
//        Frame miVentana = new Frame();
//        Panel miPanel = new Panel();
//        FlowLayout posicionamientoSecuencial = new FlowLayout();
//        Button botonA = new Button("Primer botón");
//        Button botonB = new Button("Segundo botón");
//        Button botonC = new Button("Tercer botón");
//        Button botonD = new Button("Cuarto botón");
//        miPanel.setLayout(posicionamientoSecuencial);
//        miVentana.add(miPanel);
//        miPanel.add(botonA);
//        miPanel.add(botonB);
//        miPanel.add(botonC);
//        miPanel.add(botonD);
//        miVentana.setSize(300, 100);
//        miVentana.setTitle("Ventana con flow layout");
//        miVentana.setVisible(true);
//        =========================================================//
//        Frame miMarco = new Frame();
//        Panel panelMenuNorte = new Panel();
//        Panel panelGeneral = new Panel();
//        BorderLayout puntosCardinales = new BorderLayout();
//        FlowLayout opcionesMenu = new FlowLayout();
//        Label Titulo = new Label("OLAA");
//        Button op1 = new Button("Opcion 1");
//        Button op2 = new Button("Opcion 2");
//        Button op3 = new Button("Opcion 3");
//        Button botonSur = new Button("Sur");
//        Button botonEste = new Button("Este");
//        Button botonOeste = new Button("Oeste");
//        Button botonCentro = new Button("Centro");
//        panelGeneral.setLayout(puntosCardinales);
//        panelMenuNorte.setLayout(opcionesMenu);
//        miMarco.add(panelGeneral);  
//        panelGeneral.add(panelMenuNorte, BorderLayout.NORTH);
//        panelMenuNorte.add(Titulo);
//        panelMenuNorte.add(op1);
//        panelMenuNorte.add(op2);
//        panelMenuNorte.add(op3);
//        panelGeneral.add(botonSur, BorderLayout.SOUTH);
//        panelGeneral.add(botonEste, BorderLayout.EAST);
//        panelGeneral.add(botonOeste, BorderLayout.WEST);
//        panelGeneral.add(botonCentro, BorderLayout.CENTER);
//        miMarco.setSize(400, 150);
//        miMarco.setTitle("Ventana con BorderLayout");
//        miMarco.setVisible(true);
//        =========================================================//
//        Frame miVentana = new Frame();
//        Panel miPanel = new Panel();
//        GridLayout matriz = new GridLayout(2, 3);
//        Button[] botones = new Button[6];
//        for (int i = 0; i < 6; i++)
//        botones[i] = new Button("Botón " + i);
//        miPanel.setLayout(matriz);
//        for (int i = 0; i < 6; i++)
//        miPanel.add(botones[i]);
//        miVentana.add(miPanel);
//        miVentana.setSize(300, 100);
//        miVentana.setTitle("Ventana con GridLayout");
//        miVentana.setVisible(true);
//        =========================================================//
//        Frame miMarco = new Frame();
//        Label titulo = new Label("Notas ");
//        miMarco.add(titulo);
//        miMarco.setSize(500, 200);
//        miMarco.setTitle("Ventana con etiqueta");
//        miMarco.setVisible(true);
//        =========================================================//
//        Frame MiMarco = new Frame();
//        Panel EntradaDatos = new Panel(new FlowLayout());
//        Panel gen = new Panel();
//        Panel abajo = new Panel();
//        BorderLayout puntosCardinales = new BorderLayout();
//        TextField Nombre = new TextField(15);
//        TextField Apellidos = new TextField(60);
//        TextField Nacionalidad = new TextField("Española", 15);
//        EntradaDatos.add(Nombre);
//        EntradaDatos.add(Apellidos);
//        EntradaDatos.add(Nacionalidad);
//        MiMarco.add(EntradaDatos);
//        MiMarco.setSize(500, 130);
//        MiMarco.setTitle("Ventana con campos de texto");
//        MiMarco.setVisible(true);
        //=========================================================//
//        Frame miVentana = new Frame("Esquema de eventos");
//        Panel miPanel = new Panel();
//        Button botonH = new Button("Saludo");
//        Button botonA = new Button("Despedida");
//        miPanel.add(botonH);
//        miPanel.add(botonA);
//        miVentana.add(miPanel);
//        miVentana.setSize(500, 200);
//        miVentana.setVisible(true);
//        botonH.addMouseListener(new EsquemaRaton());
//        botonA.addMouseListener(new EsquemaRaton());
        //=========================================================//
//        final int NUM_OPCIONES = 12;
//        Label mensaje = new Label("Mensaje asociado al botón pulsado");
//        Button[] botones = new Button[NUM_OPCIONES];
//        for (int i = 0; i < NUM_OPCIONES; i++) {
//            botones[i] = new Button("Opcion " + i);
//            if (i < 10) {
//                botones[i].setName("0" + i);
//            } else {
//                botones[i].setName(String.valueOf(i));
//            }
//        }
//        Frame miVentana = new Frame("Prueba eventos de raton");
//        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
//        panelPrincipal.add(mensaje);
//        for (int i = 0; i < NUM_OPCIONES; i++) {
//            panelPrincipal.add(botones[i]);
//        }
//        miVentana.add(panelPrincipal);
//        miVentana.setSize(400, 600);
//        miVentana.setVisible(true);
//        for (int i = 0; i < NUM_OPCIONES; i++) {
//            botones[i].addMouseListener(new InterrupcionesDeRaton(mensaje));
//        }
        //=========================================================//
//        Frame miVentana = new Frame("Prueba eventos de raton");
//        
//        Panel miPanel = new Panel();
//        Button boton1 = new Button("Silencio");
//        Button boton2 = new Button("Máquina de escribir");
//        
//        miPanel.add(boton1);
//        miPanel.add(boton2);
//        miVentana.add(miPanel);
//        miVentana.setSize(400, 400);
//        miVentana.setVisible(true);
//        boton2.addKeyListener(new InterrupcionesDeTeclado());
        //=========================================================//
//        Frame miVentana = new Frame("Prueba eventos de ventana");
//        miVentana.setSize(200, 100);
//        miVentana.setVisible(true);
//        Frame otraVentana = new Frame("Prueba eventos de ventana");
//        otraVentana.setSize(100, 50);
//        otraVentana.setLocation(200, 0);
//        
//        otraVentana.setVisible(true);
//        miVentana.addWindowListener(new InterrupcionesDeVentana());
//        otraVentana.addWindowListener(new InterrupcionesDeVentana());
        //=========================================================//
//        Frame miVentana = new Frame("Prueba eventos de accion");
//        Panel miPanel = new Panel(new GridLayout(3, 1));
//
//        Button boton = new Button("Etiqueta de boton");
//        TextField campoDeTexto = new TextField("Campo de texto");
//
//        List lista = new List(3);
//        lista.add("Opcion 1 de la lista");
//        lista.add("Opcion 2 de la lista");
//        lista.add("Opcion 3 de la lista");
//        lista.add("Opcion 4 de la lista");
//
//        miPanel.add(boton);
//        miPanel.add(campoDeTexto);
//        miPanel.add(lista);
//        
//        boton.addActionListener(new InterrupcionesDeAccion());
//        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
//        lista.addActionListener(new InterrupcionesDeAccion());
//        
//        miVentana.add(miPanel);
//        miVentana.setSize(400, 200);
//        miVentana.setVisible(true);
        //=========================================================//
//        Frame miVentana = new Frame("Prueba eventos de enfoque");
//        Panel miPanel = new Panel();
//        Button boton1 = new Button("Componente 1");
//        Button boton2 = new Button("Componente 2");
//        
//        miPanel.add(boton1);
//        miPanel.add(boton2);
//        
//        miVentana.add(miPanel);
//        miVentana.setSize(300, 200);
//        miVentana.setVisible(true);
//        boton2.addFocusListener(new InterrupcionesDeEnfoque());

        //=========================================================//

        Frame miVentana = new Frame("Prueba eventos de elemento");
        Panel miPanel = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        
        miPanel.add(diesel);
        miPanel.add(farosXenon);
        miPanel.add(llantasAleacion);
        miPanel.add(pinturaMetalizada);
        
        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        
        miVentana.add(miPanel);
        miVentana.setSize(400, 200);
        miVentana.setVisible(true);

    }
}
