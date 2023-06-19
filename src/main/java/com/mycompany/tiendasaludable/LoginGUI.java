/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/**
 *
 * @author DAHER
 */
package com.mycompany.tiendasaludable;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame implements ActionListener {
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginGUI() {
        setTitle("Inicio de sesión");
        setSize(400, 200);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userTextField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Iniciar sesión");

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        add(userLabel, constraints);

        constraints.gridx = 1;
        add(userTextField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        add(passwordLabel, constraints);

        constraints.gridx = 1;
        add(passwordField, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        add(loginButton, constraints);

        loginButton.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            // Aquí puede implementar la lógica de autenticación
            // Por ejemplo, verifique si el usuario y la contraseña son válidos.
            String username = userTextField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso!");
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginGUI());
    }
}
