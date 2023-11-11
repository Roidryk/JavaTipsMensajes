package pantalla;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class pantallaJava {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pantallaJava window = new pantallaJava();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public pantallaJava() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

       
        JButton btn1 = new JButton("Botón 1");
        JButton btn2 = new JButton("Botón 2");
        JButton btn3 = new JButton("Botón 3");
        JButton btn4 = new JButton("Botón 4");
        
        btn1.setToolTipText("Pulsa este botón para obtener ayuda sobre Botón 1");
        btn2.setToolTipText("Pulsa este botón para obtener ayuda sobre Botón 2");
        btn3.setToolTipText("Pulsa este botón para obtener ayuda sobre Botón 3");
        btn4.setToolTipText("Pulsa este botón para obtener ayuda sobre Botón 4");

       
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Botón 1 pulsado");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Botón 2 pulsado");
            }
        });

        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Botón 3 pulsado");
            }
        });

        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarMensaje("Botón 4 pulsado");
            }
        });

        
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(frame, mensaje);
    }
}
