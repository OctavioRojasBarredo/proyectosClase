/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacionaritmetica;

import java.awt.*;
import java.awt.event.*;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class OperacionAritmetica extends Frame implements ActionListener {

    public OperacionAritmetica() {
        Panel pnl = new Panel(new BorderLayout());
        add(pnl);
        
            Panel textoArriba = new Panel();
            Panel textoCentro = new Panel(new BorderLayout());
            
                Panel panelIzquierda = new Panel(new BorderLayout());
                
                    Panel izquierdaIzq = new Panel(new GridLayout(3, 1, 5, 5));
                    Panel izquierdaDer = new Panel(new GridLayout(3, 1, 5, 5));
                    
                Panel panelCentro = new Panel(new GridLayout(4, 1, 5, 5));
                Panel panelDerecha = new Panel(new GridLayout(2, 1, 5, 5));

        
        pnl.add(textoArriba, BorderLayout.NORTH);
        pnl.add(textoCentro, BorderLayout.CENTER);
        textoCentro.add(panelIzquierda, BorderLayout.WEST);
            panelIzquierda.add(izquierdaIzq, BorderLayout.WEST);
            panelIzquierda.add(izquierdaDer, BorderLayout.EAST);
        textoCentro.add(panelCentro, BorderLayout.CENTER);
        textoCentro.add(panelDerecha, BorderLayout.EAST);
        
        Label operacionAritmetica = new Label("Operación aritmética");
        textoArriba.add(operacionAritmetica);
        
        Label numero1 = new Label("Número 1");
        izquierdaIzq.add(numero1);
        
        TextField escribirNumero1 = new TextField();
        izquierdaDer.add(escribirNumero1);
        
        Label numero2 = new Label("Número 2");
        izquierdaIzq.add(numero2);
        
        TextField escribirNumero2 = new TextField();
        izquierdaDer.add(escribirNumero2);
        
        Label resultado = new Label("Resultado: ");
        izquierdaIzq.add(resultado);
        
        TextField devolverResultado = new TextField();
        devolverResultado.setEditable(false);
        izquierdaDer.add(devolverResultado);
        
        CheckboxGroup tipoDeCalculo = new CheckboxGroup();
            Checkbox suma = new Checkbox("Suma", tipoDeCalculo, true);
            Checkbox resta = new Checkbox("Resta", tipoDeCalculo, false);
            Checkbox multiplicacion = new Checkbox("Multiplicacion", tipoDeCalculo, false);
            Checkbox división = new Checkbox("División", tipoDeCalculo, false);
            
        panelCentro.add(suma);
        panelCentro.add(resta);
        panelCentro.add(multiplicacion);
        panelCentro.add(división);
        
        Button calcular = new Button("Calcular");
        calcular.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (numero1.getText() != null && numero2.getText() != null) {
                        double num1 = Double.parseDouble(escribirNumero1.getText());
                        double num2 = Double.parseDouble(escribirNumero2.getText());
                        double resultado = 0; 

                            if (tipoDeCalculo.getSelectedCheckbox() == suma) {
                                 resultado = num1 + num2;
                                 String resultadoTexto = resultado+"";
                                 devolverResultado.setText(resultadoTexto);
                            }
                            if (tipoDeCalculo.getSelectedCheckbox() == resta) {
                                 resultado = num1 - num2;
                                 String resultadoTexto = resultado+"";
                                 devolverResultado.setText(resultadoTexto);
                            }
                            if (tipoDeCalculo.getSelectedCheckbox() == multiplicacion) {
                                 resultado = num1 * num2;
                                 String resultadoTexto = resultado+"";
                                 devolverResultado.setText(resultadoTexto);
                            }
                            if (tipoDeCalculo.getSelectedCheckbox() == división) {
                                 resultado = num1 / num2;
                                 String resultadoTexto = resultado+"";
                                 devolverResultado.setText(resultadoTexto);
                            }
                            
                        } else {
                            System.out.println("Introduce correctamente los números");
                        }
                        }
                }
        );
        panelDerecha.add(calcular);
        Button limpiar = new Button("Limpiar");
        limpiar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        devolverResultado.setText("");
                        escribirNumero1.setText("");
                        escribirNumero2.setText("");
                    }
                }
        );
        panelDerecha.add(limpiar);
        
        setVisible(true);
        setSize(250,200);
        
    }

    public static void main(String[] args) {
        OperacionAritmetica mainframe = new OperacionAritmetica();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
