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
import java.util.HashMap;

/**
 *
 * @author nerwi
 */
public class FaltasAsistencia extends Frame implements ActionListener {



    String[] nombresAlumnos = {
        "Pepillo", "Gustavo", "Brick", "John"
    };
    
    TextField[] infoFaltasTotales = new TextField[nombresAlumnos.length];

    int cantidad = 0;
    HashMap<String, boolean> estadoCheckboxes = new HashMap<>();

    public FaltasAsistencia() {
        Panel pnl = new Panel(new BorderLayout());

        Panel panelFecha = new Panel();
        Panel panelBotones = new Panel();
        Panel panelCheckboxes = new Panel(new GridLayout(4, 7, 10, 10));
        Panel panelNombres = new Panel(new GridLayout(4, 1));
        Panel panelTotal = new Panel(new BorderLayout());

        Panel panelTotalTexto = new Panel(new GridLayout(4, 1));
        Panel panelTotalCaja = new Panel(new GridLayout(4, 1, 10, 10));

        Choice fecha = new Choice();
        panelFecha.add(fecha);
        
       

        for (String nombre : nombresAlumnos) {
            Label nombres = new Label(nombre);
            panelNombres.add(nombres);
        }

        for (int i = 0; i < 4; i++) {
            Label total = new Label("Total");
            panelTotalTexto.add(total);
        }

        TextArea caja = new TextArea();

        for (int i = 0; i < nombresAlumnos.length; i++) {
            TextField faltasTotales = new TextField("0");
            infoFaltasTotales[i] = faltasTotales;
            faltasTotales.setEditable(false);
            panelTotalCaja.add(faltasTotales);
        }

        for (int i = 0; i < nombresAlumnos.length * 7; i++) {
            int contador = i / 7;



            CheckboxGroup faltas = new CheckboxGroup();
            Checkbox hueco = new Checkbox();
            panelCheckboxes.add(hueco);
            hueco.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if (hueco.getState() == true) {
                        int contenidoAInt1 = Integer.parseInt(infoFaltasTotales[contador].getText());
                        int cálculo1 = contenidoAInt1 + 1;
                        String cálculoString1 = cálculo1 + "";
                        infoFaltasTotales[contador].setText(cálculoString1);
                    } else {
                        int contenidoAInt = Integer.parseInt(infoFaltasTotales[contador].getText());
                        int cálculo = contenidoAInt - 1;
                        String cálculoString = cálculo + "";
                        infoFaltasTotales[contador].setText(cálculoString);
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
        pnl.add(panelBotones, BorderLayout.SOUTH);
        pnl.add(panelNombres, BorderLayout.WEST);
        pnl.add(panelTotal, BorderLayout.EAST);
        panelTotal.add(panelTotalTexto, BorderLayout.WEST);
        panelTotal.add(panelTotalCaja, BorderLayout.EAST);

        setVisible(true);
        setSize(500, 300);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
