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

    Double memoria;
    TextField texto = new TextField();
    ArrayList<String> calculo = new ArrayList<>();

    public CalculadoraArreglada() throws NumberFormatException {

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
                            backspace();
                            break;
                        case "CE":
                            CE();
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
                            texto.setText(texto.getText() + "sqrt");
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
                            texto.setText(texto.getText() + "%");
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
                            texto.setText(texto.getText() + "-");
                            break;
                        case "1/x":
                            texto.setText(texto.getText() + "1/x");
                            break;
                        case "0":
                            texto.setText(texto.getText() + "0");
                            break;
                        case "+/-":
                            texto.setText(texto.getText() + "+/-");
                            break;
                        case ".":
                            texto.setText(texto.getText() + ".");
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
                            guardarMemoria();
                            break;
                        case "MR":
                            MR();
                            break;
                        case "MS":
                            MS();
                            break;
                        case "M+":
                            Msumar();
                            break;
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

    public void CE() throws NumberFormatException {
        double numerin1 = 0;
        double numerin2 = 0;
        try {
            String textoCalcular = texto.getText().trim();

            if (textoCalcular.contains("+")) {
                try {
                    String[] digitos = textoCalcular.split("\\+");
                    numerin1 = Double.parseDouble(digitos[0]);
                    texto.setText(numerin1 + " + ");
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            } else if (textoCalcular.contains("-")) {
                try {
                    String[] digitos = textoCalcular.split("\\-");
                    numerin1 = Double.parseDouble(digitos[0]);
                    texto.setText(numerin1 + " - ");
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            } else if (textoCalcular.contains("*")) {
                try {
                    String[] digitos = textoCalcular.split("\\*");
                    numerin1 = Double.parseDouble(digitos[0]);
                    texto.setText(numerin1 + " * ");
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            } else if (textoCalcular.contains("/")) {
                try {
                    String[] digitos = textoCalcular.split("\\/");
                    numerin1 = Double.parseDouble(digitos[0]);
                    texto.setText(numerin1 + " / ");
                } catch (NumberFormatException e) {
                    System.out.println("Error");
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No hay nada que borrar");

        }
    }

    public void backspace() throws NumberFormatException {
        try {
            String txt = texto.getText();
            txt = txt.substring(0, txt.length() - 1);
            texto.setText(txt);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("No hay nada que borrar");

        }
    }

    public void guardarMemoria() throws NumberFormatException {
        try {
        String txt = texto.getText().trim();
        memoria = Double.parseDouble(txt);
        texto.setText("");
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public void MR() throws NumberFormatException {
        if (memoria != null) {
            String txt = texto.getText().trim();
            texto.setText(txt + memoria);
        } else {
            System.out.println("No hay memoria");
        }
    }

    public void Msumar() {
        try {
            if (memoria != null) {
                String txt = texto.getText().trim();
                Double txtDouble = Double.parseDouble(txt);
                texto.setText(txtDouble + memoria + "");
            } else {
                System.out.println("No hay memoria");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

    public void MS() throws NumberFormatException {
        String txt = texto.getText().trim();
        texto.setText(txt + memoria + "");
    }

    public void MC() throws NumberFormatException {
        memoria = null;
    }

    public void calcular() throws NumberFormatException {
        try {
            String textoCalcular = texto.getText().trim();
            double numerin1 = 0;
            double numerin2 = 0;
            double resultado = 0;

            if (textoCalcular.contains("+")) {
                String[] digitos = textoCalcular.split("\\+");
                numerin1 = Double.parseDouble(digitos[0]);
                numerin2 = Double.parseDouble(digitos[1]);
                resultado = numerin1 + numerin2;
            } else if (textoCalcular.contains("-")) {
                String[] digitos = textoCalcular.split("\\-");
                numerin1 = Double.parseDouble(digitos[0]);
                numerin2 = Double.parseDouble(digitos[1]);
                resultado = numerin1 - numerin2;
            } else if (textoCalcular.contains("*")) {
                String[] digitos = textoCalcular.split("\\*");
                numerin1 = Double.parseDouble(digitos[0]);
                numerin2 = Double.parseDouble(digitos[1]);
                resultado = numerin1 * numerin2;
            } else if (textoCalcular.contains("/")) {
                String[] digitos = textoCalcular.split("\\/");
                numerin1 = Double.parseDouble(digitos[0]);
                numerin2 = Double.parseDouble(digitos[1]);
                if (numerin2 != 0) {
                    resultado = numerin1 / numerin2;
                } else {
                    texto.setText("Error: División por cero");
                }
            }

            // Se actualiza el resultado en el TextField
            texto.setText(Double.toString(resultado));
        } catch (NumberFormatException e) {
            System.out.println("Error");
        }
    }

}
