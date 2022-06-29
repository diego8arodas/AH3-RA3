/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Menu_principal extends JFrame {

    JTabbedPane menu = new JTabbedPane();
    ClientesDAO dao = new ClientesDAO();

    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JLabel t1 = new JLabel();
    JLabel t2 = new JLabel();
    JTable tabla1;
    JScrollPane sp;

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();

    Login login = new Login();

    DefaultTableModel modelo = new DefaultTableModel();
    Usuarios p = new Usuarios();

    public void Frame(String nombre) {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 650);
        setLocationRelativeTo(null);
        setMaximumSize(new Dimension(1000, 1000));
        setVisible(true);

        setTitle("Hoteles GT - Usuarios");

        menu.addTab("Tabla de Informacion", panel1);

        menu.addTab("Agregar Usuario", panel2);

        JButton cerrar = new JButton("Salir");
        cerrar.setBackground(Color.red);
        cerrar.setBounds(767, 0, 115, 20);
        this.getContentPane().add(cerrar);
        this.getContentPane().add(menu);

        panel1.setLayout(null);
        panel2.setLayout(null);

        ActionListener cerrar_accion = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                login.frame();
            }
        };

        cerrar.addActionListener(cerrar_accion);

        t1.setText("Usuario: ");
        t1.setBounds(600, 10, 100, 20);
        t2.setText(nombre);
        t2.setBounds(670, 10, 200, 20);

        panel1.add(t1);
        panel1.add(t2);

        boton();
        tabla();
        agregar_usuario();
    }

    private void boton() {
        b1.setText("Modificar usuario");
        b1.setBounds(150, 500, 200, 40);
        panel1.add(b1);

        ActionListener modificar = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                modificar();
            }
        };

        b1.addActionListener(modificar);
    }

    private void agregar_usuario() {

        JLabel titulo = new JLabel("Agregar usuario");
        titulo.setFont(new Font("Serig", Font.PLAIN, 25));
        titulo.setBounds(350, 20, 400, 50);

        JLabel label = new JLabel("Nombre: ");
        label.setFont(new Font("Serig", Font.PLAIN, 20));
        label.setBounds(30, 85, 500, 50);
        JTextField text = new JTextField(15);
        text.setBounds(150, 100, 250, 20);

        JLabel label1 = new JLabel("Apellido: ");
        label1.setBounds(450, 85, 500, 50);
        label1.setFont(new Font("Serig", Font.PLAIN, 20));
        JTextField text1 = new JTextField(15);
        text1.setBounds(560, 100, 250, 20);

        JLabel label2 = new JLabel("Teléfono: ");
        label2.setBounds(450, 85, 500, 50);
        label2.setFont(new Font("Serig", Font.PLAIN, 20));
        JTextField text2 = new JTextField(15);
        text2.setBounds(150, 215, 250, 20);

        JLabel label3 = new JLabel("Direccion: ");
        label3.setBounds(450, 200, 500, 50);
        label3.setFont(new Font("Serig", Font.PLAIN, 20));
        JTextField text3 = new JTextField(15);

    }

    private void tabla() {
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            
        }
        
    }

    private void modificar() {
        int fila = tabla1.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else {
            JFrame actualizar = new JFrame();
            JPanel p1 = new JPanel();
            p1.setLayout(null);
            actualizar.setSize(900, 650);
            actualizar.setLocationRelativeTo(null);
            actualizar.setMaximumSize(new Dimension(800, 100));
            actualizar.setVisible(true);
            actualizar.setTitle("Actualizar usuario");
            actualizar.getContentPane().add(p1);

            JLabel titulo = new JLabel("Modificar usuario");
            titulo.setFont(new Font("Serig", Font.PLAIN, 25));
            titulo.setBounds(350, 20, 400, 50);

            JLabel label = new JLabel("Nombre: ");
            label.setBounds(30, 85, 500, 50);
            label.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text = new JTextField(15);
            text.setBounds(150, 100, 250, 20);

            JLabel label1 = new JLabel("Apellido: ");
            label1.setBounds(450, 85, 500, 50);
            label1.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text1 = new JTextField(15);
            text1.setBounds(560, 100, 250, 20);

            JLabel label2 = new JLabel("Telefono: ");
            label2.setBounds(30, 200, 500, 50);
            label2.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text2 = new JTextField(15);
            text2.setBounds(150, 215, 250, 20);

            JLabel label3 = new JLabel("Direccion: ");
            label3.setBounds(30, 85, 500, 50);
            label3.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text3 = new JTextField(15);
            text3.setBounds(150, 100, 250, 20);

            JLabel label4 = new JLabel("Correo: ");
            label4.setBounds(30, 85, 500, 50);
            label4.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text4 = new JTextField(15);
            text4.setBounds(150, 100, 250, 20);

            JLabel label5 = new JLabel("Fecha de nacimiento: ");
            label5.setBounds(30, 85, 500, 50);
            label5.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text5 = new JTextField(15);
            text5.setBounds(150, 100, 250, 20);

            JLabel label6 = new JLabel("Contraseña: ");
            label6.setBounds(30, 85, 500, 50);
            label6.setFont(new Font("Serig", Font.PLAIN, 20));
            JTextField text6 = new JTextField(15);
            text6.setBounds(150, 100, 250, 20);
            
            List<Usuarios> lista = dao.listarUsuario();
            
            text.setText(lista.get(fila).getNombre());
            text1.setText(lista.get(fila).getApellido());
            text2.setText("" + lista.get(fila).getTelefono());
            text3.setText(lista.get(fila).getDireccion());
            text4.setText(lista.get(fila).getCorreo());
            text4.setText(lista.get(fila).getFecha_nacimiento());
            text5.setText(lista.get(fila).getContrasena());
            
            p1.add(label1);
            p1.add(text1);

            p1.add(label2);
            p1.add(text2);

            p1.add(label3);
            p1.add(text3);

            p1.add(label4);
            p1.add(text4);

            p1.add(label5);
            p1.add(text5);

            p1.add(label6);
            p1.add(text6);

            b1 = new JButton();
            b2 = new JButton();

            b1.setText("Guardar");
            b1.setBounds(150, 500, 200, 40);
            p1.add(b1);

            b2.setText("Cancelar");
            b2.setBounds(500, 500, 200, 40);
            p1.add(b2);

            ActionListener cancelar = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    text.setText("");
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text4.setText("");
                    text5.setText("");
                    text6.setText("");

                    actualizar.setVisible(false);
                }
            };

            b2.addActionListener(cancelar);
            
            ActionListener guardar = new ActionListener() {
            
                public void actionPerformed(ActionEvent e) {
                ClientesDAO p = new ClientesDAO();
                //p.modificar(lista.get(fila).getUsuarios_id(), text.getText(), text1.getText(), text2.getText(), text3.getText(), text4.getText(), text5.getText(), text6.getText());
                JOptionPane.showMessageDialog(null, "Usuario actualizado");
                text.setText("");
                text1.setText("");
                text2.setText("");
                text3.setText("");
                text4.setText("");
                text5.setText("");
                text6.setText("");
                tabla1.setVisible(false);
                sp.setVisible(false);
                tabla();
                
                actualizar.setVisible(false);
            }
        };
        
        b1.addActionListener(guardar);

        }
    }

    private void eliminar() {
        
    }

    
    
}
