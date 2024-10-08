/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadoraarreglada;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class CalculadoraArreglada extends Frame {

    TextField texto = new TextField();
    ArrayList<String> calculo = new ArrayList<>();

    public CalculadoraArreglada() {
        setLayout(new BorderLayout());

        // DECLARACIÓN PANELES
        Panel pnlTexto = new Panel();
        Panel pnlBotones = new Panel(new BorderLayout());
        Panel pnlBotonesArriba = new Panel(new GridLayout(1, 3, 5, 5));
        Panel pnlBotonesAbajo = new Panel(new BorderLayout());
        Panel pnlBotonesAbajoDelTodo = new Panel(new GridLayout(4, 5, 5, 5));
        Panel pnlBotonesAbajoIzq = new Panel(new GridLayout(4, 1, 5, 5));

        // AÑADO PANELES AL FRAME
        add(pnlTexto, BorderLayout.NORTH);
        add(pnlBotones, BorderLayout.CENTER);

        // AÑADO PANELES AL PANEL DE BOTONES
        pnlBotones.add(pnlBotonesArriba, BorderLayout.NORTH);
        pnlBotones.add(pnlBotonesAbajo, BorderLayout.WEST);

        // AÑADO LOS DOS TIPOS DE PANEL DE ABAJO AL PANEL DE ABAJO
        pnlBotonesAbajo.add(pnlBotonesAbajoDelTodo, BorderLayout.CENTER);
        pnlBotonesAbajo.add(pnlBotonesAbajoIzq, BorderLayout.WEST);

        // CREO EL TEXFIELD
        texto.setPreferredSize(new Dimension(230, 30));
        pnlTexto.add(texto);

        // CREO EL CONTENIDO DE LOS BOTONES
        String[] botonesAbajo = {
            "7", "8", "9", "/", "sqrt", "4", "5", "6", "*", "%", "1", "2", "3", "-", "1/x", "0", "+/-", ".", "+", "="
        };
        String[] botonesArriba = {
            "", "Backspace", "CE", "C"
        };
        String[] botonesIzqAbajo = {
            "MC", "MR", "MS", "M+"
        };

        // CREO LOS BOTONES
        for (String boton : botonesArriba) {
            Button botones = new Button(boton);
            botones.addActionListener(
                    new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    switch (boton) {
                        case "":
                            break;
                        case "Backspace":
                            break;
                        case "CE":
                            texto.setText("");
                            break;
                        case "C":
                            texto.setText("");
                            break;
                    }
                }
            }
            );
            pnlBotonesArriba.add(botones);
        }

        for (String boton : botonesAbajo) {
            Button botones = new Button(boton);
            botones.addActionListener(
                    new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    switch (boton) {
                        case "7":
                            texto.setText(texto.getText() + "7");
                            break;
                        case "8":
                            texto.setText(texto.getText() + "8");
                            break;
                        case "9":
                            texto.setText(texto.getText() + "9");
                            break;
                        case "/":
                            texto.setText(texto.getText() + "/");
                            break;
                        case "sqrt":
                            texto.setText(texto.getText() + "7");
                            break;
                        case "4":
                            texto.setText(texto.getText() + "4");
                            break;
                        case "5":
                            texto.setText(texto.getText() + "5");
                            break;
                        case "6":
                            texto.setText(texto.getText() + "6");
                            break;
                        case "*":
                            texto.setText(texto.getText() + "*");
                            break;
                        case "%":
                            texto.setText(texto.getText() + "");
                            break;
                        case "1":
                            texto.setText(texto.getText() + "1");
                            break;
                        case "2":
                            texto.setText(texto.getText() + "2");
                            break;
                        case "3":
                            texto.setText(texto.getText() + "3");
                            break;
                        case "-":
                            texto.setText(texto.getText() + "");
                            break;
                        case "1/x":
                            texto.setText(texto.getText() + "7");
                            break;
                        case "0":
                            texto.setText(texto.getText() + "0");
                            break;
                        case "+/-":
                            texto.setText(texto.getText() + "7");
                            break;
                        case ".":
                            texto.setText(texto.getText() + "");
                            break;
                        case "+":
                            calculo.add("+");
                            texto.setText(texto.getText() + "+");
                            break;
                        case "=":
                            calcular();
                            break;
                    }
                }
            }
            );
            pnlBotonesAbajoDelTodo.add(botones);
        }

        for (String boton : botonesIzqAbajo) {
            Button botones = new Button(boton);
            botones.addActionListener(
                    new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    switch (boton) {
                        case "MC":
                        case "MR":
                        case "MS":
                        case "M+":
                    }
                }
            }
            );
            pnlBotonesAbajoIzq.add(botones);
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // CONFIGURACIÓN DEL FRAME
        setVisible(true);
        setSize(250, 250);
        setTitle("Calculadora");

    }

    public double calcular() {
        String textoCalcular = texto.getText().trim();
        double numerin1 = 0;
        double numerin2 = 0;
        for (String tipoCalculo : calculo) {
            if (tipoCalculo.contains("+")) {
        String[] digitos = textoCalcular.split("\\+");
        for (String numero : digitos) {
            int contador = 0;
            if (contador == 0) {
                numerin1 = Double.parseDouble(numero);
            } else if (contador == 1) {
                numerin2 = Double.parseDouble(numero);
            }

        }
                double resultado = numerin1 + numerin2;
                return resultado;
            }
        }

   

