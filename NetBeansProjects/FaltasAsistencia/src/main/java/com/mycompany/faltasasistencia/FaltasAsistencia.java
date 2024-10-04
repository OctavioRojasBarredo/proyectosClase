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

/**
 *
 * @author nerwi
 */
public class FaltasAsistencia extends Frame implements ActionListener {

    String[] nombresAlumnos = {
        "Pepillo", "Gustavo", "Brick", "John"
    };

    int cantidad = 0;

    public FaltasAsistencia() {
        Panel pnl = new Panel(new BorderLayout());

        Panel panelFecha = new Panel();
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

        for (int i = 0; i < nombresAlumnos.length * 7; i += 1) {
            for (int i = 0; i < 4; i++) {
                TextField faltasTotales = new TextField(cantidad);
                faltasTotales.setEditable(false);
                panelTotalCaja.add(faltasTotales);
            }

            CheckboxGroup faltas = new CheckboxGroup();
            Checkbox hueco = new Checkbox();
            panelCheckboxes.add(hueco);
            hueco.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {
                    if (hueco.getState() == true) {
                        cantidad++;
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
        pnl.add(panelNombres, BorderLayout.WEST);
        pnl.add(panelTotal, BorderLayout.EAST);
        panelTotal.add(panelTotalTexto, BorderLayout.WEST);
        panelTotal.add(panelTotalCaja, BorderLayout.EAST);

        setVisible(true);
        setSize(250, 200);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        FaltasAsistencia mainframe = new FaltasAsistencia();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
