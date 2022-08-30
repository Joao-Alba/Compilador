import javax.swing.*;
import java.awt.*;

public class Main {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Main window = new Main();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public Main() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 910, 600);
        frame.setMinimumSize(new Dimension(910, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        frame.getContentPane().add(mainPanel);
        mainPanel.setLayout(new BorderLayout());


        JPanel toolBarPanel = new JPanel();
        mainPanel.add(toolBarPanel, BorderLayout.NORTH);
        toolBarPanel.setLayout(new BoxLayout(toolBarPanel, BoxLayout.X_AXIS));


        JButton newFileButton = new JButton("Novo [ctrl-n]");
        newFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        newFileButton.setIcon(this.resizeIcon("src/img/novo.png"));
        toolBarPanel.add(newFileButton);

        JButton openFileButton = new JButton("Abrir [ctrl-o]");
        openFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        openFileButton.setIcon(this.resizeIcon("src/img/abrir.png"));
        toolBarPanel.add(openFileButton);

        JButton saveFileButton = new JButton("Salvas [ctrl-s]");
        saveFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        saveFileButton.setIcon(this.resizeIcon("src/img/salvar.png"));
        toolBarPanel.add(saveFileButton);

        JButton copyButton = new JButton("Copiar [ctrl-c]");
        copyButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        copyButton.setIcon(this.resizeIcon("src/img/copiar.png"));
        toolBarPanel.add(copyButton);

        JButton pasteButton = new JButton("Colar [ctrl-v]");
        pasteButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        pasteButton.setIcon(this.resizeIcon("src/img/colar.png"));
        toolBarPanel.add(pasteButton);

        JButton cutButton = new JButton("Recortar [ctrl-x]");
        cutButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        cutButton.setIcon(this.resizeIcon("src/img/recortar.png"));
        toolBarPanel.add(cutButton);

        JButton compileButton = new JButton("Compilar [F7]");
        compileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        compileButton.setIcon(this.resizeIcon("src/img/compilar.png"));
        toolBarPanel.add(compileButton);

        JButton teamButton = new JButton("Equipe [F1]");
        teamButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        teamButton.setIcon(this.resizeIcon("src/img/equipe.png"));
        toolBarPanel.add(teamButton);


        JSplitPane splitPane = new JSplitPane();
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        mainPanel.add(splitPane, BorderLayout.CENTER);

        JTextArea codeEditorTextArea = new JTextArea();
        codeEditorTextArea.setBorder(new NumberedBorder());
        JScrollPane scrollEditor = new JScrollPane(codeEditorTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        splitPane.setLeftComponent(scrollEditor);

        JTextArea messageTextArea = new JTextArea();
        JScrollPane scrollmessage = new JScrollPane(messageTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        splitPane.setRightComponent(scrollmessage);


        copiar(copyButton, codeEditorTextArea);
        colar(pasteButton, codeEditorTextArea);
        recortar(cutButton, codeEditorTextArea);
        novo(newFileButton, codeEditorTextArea, messageTextArea);

        JPanel statusPanel = new JPanel();
        mainPanel.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = new JLabel(" ");
        statusPanel.add(lblNewLabel);
    }

    private static void novo(JButton newFileButton, JTextArea codeEditorTextArea, JTextArea messageTextArea) {
        newFileButton.addActionListener(actionEvent -> {
            codeEditorTextArea.setText("");
            messageTextArea.setText("");
            //barra de status
        });
    }

    private static void recortar(JButton cutButton, JTextArea codeEditorTextArea) {
        cutButton.addActionListener(actionEvent -> codeEditorTextArea.cut());
    }

    private static void colar(JButton pasteButton, JTextArea codeEditorTextArea) {
        pasteButton.addActionListener(actionEvent -> codeEditorTextArea.paste());
    }

    private static void copiar(JButton copyButton, JTextArea codeEditorTextArea) {
        copyButton.addActionListener(actionEvent -> codeEditorTextArea.copy());
    }

    private ImageIcon resizeIcon(String path) {
        ImageIcon imageIcon = new ImageIcon(path);
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(16, 16,  java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

}
