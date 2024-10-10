import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Teclado extends Frame implements ActionListener {

    private boolean mayusPresionado = false;
    private boolean shiftPresionado = false;
    private boolean shiftNext = false; // Para controlar la próxima letra
    private TextField texto;

    public Teclado() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        setLayout(new BorderLayout());
        setSize(800, 250);
        setVisible(true);
        
        texto = crearCampoTexto();
        Panel panelTeclado = crearPanelTeclado();
        
        add(texto, BorderLayout.NORTH);
        add(panelTeclado, BorderLayout.CENTER);
    }

    private TextField crearCampoTexto() {
        TextField texto = new TextField(50);
        texto.setEditable(false);
        return texto;
    }

    private Panel crearPanelTeclado() {
        Panel panelTeclado = new Panel(new GridLayout(5, 1, 5, 5));
        
        Panel fila1 = new Panel(new GridLayout(1, 15));
        String[] teclasFila1 = {"~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "\\", "BS"};
        for (String tecla : teclasFila1) {
            Button boton = new Button(tecla);
            boton.addActionListener(this);
            fila1.add(boton);
        }
        panelTeclado.add(fila1);
        
        Panel fila2 = new Panel(new GridLayout(1, 13));
        String[] teclasFila2 = {"Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]"};
        for (String tecla : teclasFila2) {
            Button boton = new Button(tecla);
            boton.addActionListener(this);
            fila2.add(boton);
        }
        panelTeclado.add(fila2);
        
        Panel fila3 = new Panel(new GridLayout(1, 13));
        String[] teclasFila3 = {"Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "Enter"};
        for (String tecla : teclasFila3) {
            Button boton = new Button(tecla);
            boton.addActionListener(this);
            fila3.add(boton);
        }
        panelTeclado.add(fila3);
        
        Panel fila4 = new Panel(new GridLayout(1, 13));
        String[] teclasFila4 = {"Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "/", "Shift"};
        for (String tecla : teclasFila4) {
            Button boton = new Button(tecla);
            boton.addActionListener(this);
            fila4.add(boton);
        }
        panelTeclado.add(fila4);
        
        Panel fila5 = new Panel(new GridLayout(1, 5));
        String[] teclasFila5 = {"Ctrl", "Alt", "Space", "Alt", "Ctrl"};
        for (String tecla : teclasFila5) {
            Button boton = new Button(tecla);
            boton.addActionListener(this);
            fila5.add(boton);
        }
        panelTeclado.add(fila5);

        return panelTeclado;
    }

    public static void main(String[] args) {
        new Teclado();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando) {
            case "Shift":
                shiftPresionado = !shiftPresionado;
                break;
            case "Caps":
                mayusPresionado = !mayusPresionado;
                break;
            case "BS":
                String textoActual = texto.getText();
                if (textoActual.length() > 0) {
                    texto.setText(textoActual.substring(0, textoActual.length() - 1));
                }
                break;
            case " ":
                texto.setText(texto.getText() + " ");
                break;
            case "Enter":
                texto.setText(texto.getText() + "\\n");
                break;
            case "Tab":
                texto.setText(texto.getText() + "\\t");
                break;
            default:
                String letra = comando;
   
                if (mayusPresionado || shiftNext) {
                    letra = letra.toUpperCase();
                    shiftNext = false; // Reseteamos shiftNext después de usarlo
                } else if (shiftPresionado) {
                    shiftNext = true; // Activar mayúscula para la siguiente letra
                }
                texto.setText(texto.getText() + letra);
                break;
        }
    }
}
