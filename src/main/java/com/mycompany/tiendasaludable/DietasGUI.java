/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendasaludable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DietasGUI extends JFrame implements ActionListener {
    private JButton agregarButton;
    private JButton mostrarButton;
    private JButton actualizarButton;
    private JButton eliminarButton;

    public DietasGUI() {
        setTitle("Dietas");
        setSize(400, 200);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        agregarButton = new JButton("Agregar");
        mostrarButton = new JButton("Mostrar");
        actualizarButton = new JButton("Actualizar");
        eliminarButton = new JButton("Eliminar");

        agregarButton.addActionListener(this);
        mostrarButton.addActionListener(this);
        actualizarButton.addActionListener(this);
        eliminarButton.addActionListener(this);

        add(agregarButton);
        add(mostrarButton);
        add(actualizarButton);
        add(eliminarButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Implementar la lógica para cada acción de los botones
    }
}
