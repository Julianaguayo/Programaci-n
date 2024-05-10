package interfazLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Windows extends JFrame {
    
    private JList<String> listView; // Hacemos el JList un campo de clase para acceder a él más fácilmente

    public Windows() {
        super("Interfaz layout");
        this.setSize(800, 700);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(2,1));
        
        JPanel miPanel = new JPanel();
        miPanel.setLayout(new BoxLayout(miPanel, BoxLayout.Y_AXIS)); // Alinea verticalmente
        miPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Espacio alrededor del panel principal
        
        // Crea el panel derecho y el JList
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout()); // Usa BorderLayout para el listview y el textfield
        rightPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));
        
        listView = new JList<>(new String[]{}); // Inicialmente vacío
        JScrollPane scrollPane = new JScrollPane(listView);
        
        // Crea el textfield (JTextField)
        JTextField textField = new JTextField(20);
        textField.setPreferredSize(new Dimension(70, 50)); // Tamaño preferido para el textfield
        
        rightPanel.add(scrollPane, BorderLayout.CENTER);
        rightPanel.add(textField, BorderLayout.SOUTH);
        
        // Agrega el panel principal y el panel derecho al marco
        this.add(miPanel, BorderLayout.WEST); // Panel con las etiquetas a la izquierda
        this.add(rightPanel, BorderLayout.EAST); // Panel con el listview y el textfield a la derecha
        
        // Datos a mostrar para cada etiqueta
        String[][] listData = {
            {"Dato 1", "Dato 2", "Dato 3"},
            {"Dato A", "Dato B", "Dato C"},
            {"Elemento X", "Elemento Y", "Elemento Z"},
            {"Elemento Alfa", "Elemento Beta", "Elemento Gamma"},
            {"Elemento Juana", "Elemento Torre", "Elemento Juana"}
        };
        
        // Crea los paneles de la izquierda y les asigna eventos de clic
        agregarLabelConDatos(miPanel, "media/imagen.png", "MERY RONQUILLO", listData[0]);
        agregarLabelConDatos(miPanel, "media/mujer.png", "LUISA LISA MARAÑA", listData[1]);
        agregarLabelConDatos(miPanel, "media/señora.png", "ANA BELA TORRA", listData[2]);
        agregarLabelConDatos(miPanel, "media/varon.png", "JUANA DE LA TORRE", listData[3]);
        agregarLabelConDatos(miPanel, "media/varon.png", "JUANA DE LA TORRE", listData[4]);
    }
    
    private void agregarLabelConDatos(JPanel panel, String imagePath, String labelName, String[] data) {
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        JLabel iconLabel = new JLabel(new ImageIcon(imagePath));
        iconLabel.setPreferredSize(new Dimension(92, 92));
        
        JLabel nameLabel = new JLabel(labelName);
        nameLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                listView.setListData(data); // Actualiza el contenido del JList cuando se hace clic
            }
        });
        
        leftPanel.add(iconLabel);
        leftPanel.add(nameLabel);
        panel.add(leftPanel);
    }
}
