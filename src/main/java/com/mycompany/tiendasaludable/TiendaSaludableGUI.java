import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaSaludableGUI extends JFrame implements ActionListener {
    private JButton clientesButton;
    private JButton productosButton;
    private JButton ventasButton;
    private JButton dietasButton;

    public TiendaSaludableGUI() {
        setTitle("Tienda Saludable");
        setSize(400, 200);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clientesButton = new JButton("Clientes");
        productosButton = new JButton("Productos");
        ventasButton = new JButton("Ventas");
        dietasButton = new JButton("Dietas");

        clientesButton.addActionListener(this);
        productosButton.addActionListener(this);
        ventasButton.addActionListener(this);
        dietasButton.addActionListener(this);

        add(clientesButton);
        add(productosButton);
        add(ventasButton);
        add(dietasButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clientesButton) {
            new ClientesGUI();
        } else if (e.getSource() == productosButton) {
            new ProductosGUI();
        } else if (e.getSource() == ventasButton) {
            new VentasGUI();
        } else if (e.getSource() == dietasButton) {
            new DietasGUI();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TiendaSaludableGUI());
    }
}
