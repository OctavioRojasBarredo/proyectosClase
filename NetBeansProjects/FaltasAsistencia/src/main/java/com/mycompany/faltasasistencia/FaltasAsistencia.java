/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.faltasasistencia;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
<<<<<<< HEAD
import java.util.HashMap;
=======
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff

/**
 *
 * @author nerwi
 */
public class FaltasAsistencia extends Frame implements ActionListener {

<<<<<<< HEAD


    String[] nombresAlumnos = {
        "Pepillo", "Gustavo", "Brick", "John"
    };
    
    TextField[] infoFaltasTotales = new TextField[nombresAlumnos.length];

    int cantidad = 0;
    HashMap<String, boolean> estadoCheckboxes = new HashMap<>();
=======
    String[] nombresAlumnos = {
        "Pepillo", "Gustavo", "Brick", "John"
    };

    int cantidad = 0;
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff

    public FaltasAsistencia() {
        Panel pnl = new Panel(new BorderLayout());

        Panel panelFecha = new Panel();
<<<<<<< HEAD
        Panel panelBotones = new Panel();
=======
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
        Panel panelCheckboxes = new Panel(new GridLayout(4, 7, 10, 10));
        Panel panelNombres = new Panel(new GridLayout(4, 1));
        Panel panelTotal = new Panel(new BorderLayout());

        Panel panelTotalTexto = new Panel(new GridLayout(4, 1));
        Panel panelTotalCaja = new Panel(new GridLayout(4, 1, 10, 10));

        Choice fecha = new Choice();
        panelFecha.add(fecha);
<<<<<<< HEAD
        
       
=======
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff

        for (String nombre : nombresAlumnos) {
            Label nombres = new Label(nombre);
            panelNombres.add(nombres);
        }

        for (int i = 0; i < 4; i++) {
            Label total = new Label("Total");
            panelTotalTexto.add(total);
        }

        TextArea caja = new TextArea();

<<<<<<< HEAD
        for (int i = 0; i < nombresAlumnos.length; i++) {
            TextField faltasTotales = new TextField("0");
            infoFaltasTotales[i] = faltasTotales;
            faltasTotales.setEditable(false);
            panelTotalCaja.add(faltasTotales);
        }

        for (int i = 0; i < nombresAlumnos.length * 7; i++) {
            int contador = i / 7;


=======
        for (int i = 0; i < nombresAlumnos.length * 7; i += 1) {
            for (int i = 0; i < 4; i++) {
                TextField faltasTotales = new TextField(cantidad);
                faltasTotales.setEditable(false);
                panelTotalCaja.add(faltasTotales);
            }
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff

            CheckboxGroup faltas = new CheckboxGroup();
            Checkbox hueco = new Checkbox();
            panelCheckboxes.add(hueco);
            hueco.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if (hueco.getState() == true) {
<<<<<<< HEAD
                        int contenidoAInt1 = Integer.parseInt(infoFaltasTotales[contador].getText());
                        int cálculo1 = contenidoAInt1 + 1;
                        String cálculoString1 = cálculo1 + "";
                        infoFaltasTotales[contador].setText(cálculoString1);
                    } else {
                        int contenidoAInt = Integer.parseInt(infoFaltasTotales[contador].getText());
                        int cálculo = contenidoAInt - 1;
                        String cálculoString = cálculo + "";
                        infoFaltasTotales[contador].setText(cálculoString);
=======
                        cantidad++;
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
                    }
                }
            });
        }

        for (int i = 6; i <= 42; i += 7) {
            String fechaFormato = "";
            int mes = 1;
            int dia = i;
            int ano = 2025;
            if (dia > 30) {
                mes += 1;
                dia = dia - 30;
            }

            fechaFormato = dia + "/" + mes + "/" + ano;
            fecha.add(fechaFormato);
        }

        add(pnl);
        pnl.add(panelFecha, BorderLayout.NORTH);
        pnl.add(panelCheckboxes, BorderLayout.CENTER);
<<<<<<< HEAD
        pnl.add(panelBotones, BorderLayout.SOUTH);
=======
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
        pnl.add(panelNombres, BorderLayout.WEST);
        pnl.add(panelTotal, BorderLayout.EAST);
        panelTotal.add(panelTotalTexto, BorderLayout.WEST);
        panelTotal.add(panelTotalCaja, BorderLayout.EAST);

        setVisible(true);
<<<<<<< HEAD
        setSize(500, 300);
=======
        setSize(250, 200);
>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

<<<<<<< HEAD
=======
    public static void main(String[] args) {
        FaltasAsistencia mainframe = new FaltasAsistencia();
    }

>>>>>>> 39f6e8e0fe9254352c74cc094dfbab9cd30069ff
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
