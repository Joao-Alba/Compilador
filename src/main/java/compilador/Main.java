package compilador;

import gals.LexicalError;
import gals.Lexico;
import gals.Token;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.event.*;
import java.io.*;
import java.util.Objects;

public class Main {

    private static JFrame frame;
    private static final JPanel mainPanel = new JPanel();
    private static final JPanel toolBarPanel = new JPanel();
    private static final JButton newFileButton = new JButton("Novo [ctrl-n]");
    private static final JButton openFileButton = new JButton("Abrir [ctrl-o]");
    private static final JButton saveFileButton = new JButton("Salvar [ctrl-s]");
    private static final JButton copyButton = new JButton("Copiar [ctrl-c]");
    private static final JButton pasteButton = new JButton("Colar [ctrl-v]");
    private static final JButton cutButton = new JButton("Recortar [ctrl-x]");
    private static final JButton compileButton = new JButton("Compilar [F7]");
    private static final JButton teamButton = new JButton("Equipe [F1]");
    private static final JSplitPane splitPane = new JSplitPane();
    private static final JTextArea codeEditorTextArea = new JTextArea();
    private static final JTextArea messageTextArea = new JTextArea();
    private static final JPanel statusPanel = new JPanel();
    private static final JLabel statusLabel = new JLabel(" ");
    private static final JFileChooser fileChooser = new JFileChooser();
    private static File openedFile = null;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Main window = new Main();
                frame.setVisible(true);
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
        frame.getContentPane().add(mainPanel);
        mainPanel.setLayout(new BorderLayout());


        toolBarPanel.setMinimumSize(new Dimension(900, 70));
        mainPanel.add(toolBarPanel, BorderLayout.NORTH);
        toolBarPanel.setLayout(new BoxLayout(toolBarPanel, BoxLayout.X_AXIS));

        newFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        newFileButton.setIcon(resizeIcon("novo.png"));
        toolBarPanel.add(newFileButton);

        openFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        openFileButton.setIcon(resizeIcon("abrir.png"));
        toolBarPanel.add(openFileButton);

        saveFileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        saveFileButton.setIcon(resizeIcon("salvar.png"));
        toolBarPanel.add(saveFileButton);

        copyButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        copyButton.setIcon(resizeIcon("copiar.png"));
        toolBarPanel.add(copyButton);

        pasteButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        pasteButton.setIcon(resizeIcon("colar.png"));
        toolBarPanel.add(pasteButton);

        cutButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        cutButton.setIcon(resizeIcon("recortar.png"));
        toolBarPanel.add(cutButton);

        compileButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        compileButton.setIcon(resizeIcon("compilar.png"));
        toolBarPanel.add(compileButton);

        teamButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
        teamButton.setIcon(resizeIcon("equipe.png"));
        toolBarPanel.add(teamButton);


        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
        mainPanel.add(splitPane, BorderLayout.CENTER);

        codeEditorTextArea.setBorder(new NumberedBorder());
        JScrollPane scrollEditor = new JScrollPane(codeEditorTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        splitPane.setLeftComponent(scrollEditor);

        messageTextArea.setEnabled(false);
        messageTextArea.setDisabledTextColor(Color.black);
        JScrollPane scrollmessage = new JScrollPane(messageTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        splitPane.setRightComponent(scrollmessage);


        statusPanel.setMinimumSize(new Dimension(900, 25));
        mainPanel.add(statusPanel, BorderLayout.SOUTH);
        statusPanel.setLayout(new BorderLayout(0, 0));
        statusPanel.add(statusLabel);

        createActions();
    }

    private void createActions() {
        Action newFileAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeEditorTextArea.setText("");
                messageTextArea.setText("");
                statusLabel.setText(" ");
                openedFile = null;
            }
        };
        newFileButton.addActionListener(newFileAction);
        newFileButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "newFileShortcut");
        newFileButton.getActionMap().put("newFileShortcut", newFileAction);


        Action openFileAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        };
        openFileButton.addActionListener(openFileAction);
        openFileButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK), "openFileShortcut");
        openFileButton.getActionMap().put("openFileShortcut", openFileAction);


        Action saveFileAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveFile();
            }
        };
        saveFileButton.addActionListener(saveFileAction);
        saveFileButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "saveFileShortcut");
        saveFileButton.getActionMap().put("saveFileShortcut", saveFileAction);


        Action copyAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeEditorTextArea.copy();
            }
        };
        copyButton.addActionListener(copyAction);
        copyButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK), "copyShortcut");
        copyButton.getActionMap().put("copyShortcut", copyAction);


        Action pasteAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeEditorTextArea.paste();
            }
        };
        pasteButton.addActionListener(pasteAction);
        pasteButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), "pasteShortcut");
        pasteButton.getActionMap().put("pasteShortcut", pasteAction);


        Action cutAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codeEditorTextArea.cut();
            }
        };
        cutButton.addActionListener(cutAction);
        cutButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "cutShortcut");
        cutButton.getActionMap().put("cutShortcut", cutAction);


        Action compileAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    compile();
                } catch (BadLocationException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        compileButton.addActionListener(compileAction);
        compileButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "compileShortcut");
        compileButton.getActionMap().put("compileShortcut", compileAction);


        Action teamAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageTextArea.setText("João Arthur Pereira Alba \nNicole Taufenbach");
            }
        };
        teamButton.addActionListener(teamAction);
        teamButton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "teamShortcut");
        teamButton.getActionMap().put("teamShortcut", teamAction);
    }

    private static void saveFile() {
        try {
            if (Objects.isNull(openedFile)) {
                int returnVal = fileChooser.showSaveDialog(frame);

                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File newFile = fileChooser.getSelectedFile();

                    if (!newFile.getName().split("\\.")[1].equals("txt")) {
                        throw new IOException();
                    }
                    BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));

                    bw.write(codeEditorTextArea.getText());
                    messageTextArea.setText("");
                    statusLabel.setText(newFile.getPath());
                    openedFile = newFile;

                    bw.close();
                }
            } else {
                BufferedWriter bw = new BufferedWriter(new FileWriter(openedFile));

                bw.write(codeEditorTextArea.getText());
                messageTextArea.setText("");

                bw.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Tipo de arquivo inválido.");
        }
    }

    private static void openFile() {
        int returnVal = fileChooser.showOpenDialog(frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                File file = fileChooser.getSelectedFile();

                if (!file.getName().contains(".txt")) {
                    throw new IOException();
                }

                BufferedReader br = new BufferedReader(new FileReader(file));
                String string = "";
                boolean firstLine = true;
                codeEditorTextArea.setText("");
                while (Objects.nonNull(string = br.readLine())) {
                    if (firstLine) {
                        codeEditorTextArea.setText(codeEditorTextArea.getText() + string);
                        firstLine = false;
                        continue;
                    }
                    codeEditorTextArea.setText(codeEditorTextArea.getText() + "\n" + string);
                }

                messageTextArea.setText("");
                statusLabel.setText(file.getPath());
                openedFile = file;
                br.close();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Arquivo inválido.");
            }
        }
    }

    private static void compile() throws BadLocationException {
        StringBuilder tokenList = new StringBuilder("linha      classe                  lexema").append("\n");
        Lexico lexico = new Lexico();
        lexico.setInput(codeEditorTextArea.getText());
        try {
            Token token;
            while ((token = lexico.nextToken()) != null) {
                String whiteSpaces = "                        ";
                tokenList.append(calculateLinha(token.getPosition())).append("          ");

                String tokenClass = getClassFromTokenId(token.getId());
                tokenList.append(tokenClass).append(whiteSpaces.substring(tokenClass.length()));

                tokenList.append(token.getLexeme()).append("\n");
            }

            tokenList.append("\n").append("programa compilado com sucesso");
            messageTextArea.setText(tokenList.toString());

        } catch (LexicalError e) {
            messageTextArea.setText("Erro na linha " + calculateLinha(e.getPosition()) + " - " + e.getMessage());
        } catch (BadLocationException e) {
            throw new RuntimeException(e);
        }
    }

    private static int calculateLinha(int position) throws BadLocationException {
        return codeEditorTextArea.getLineOfOffset(position) + 1;
    }

    private static String getClassFromTokenId(int id) {
        switch (id) {
            case 2:
                return "identificador";
            case 3:
                return "constante int";
            case 4:
                return "constante float";
            case 5:
                return "constante char";
            case 6:
                return "constante string";
        }

        if (id >= 7 && id <= 26) {
            return "palavra reservada";
        } else if (id > -27 && id <= 48) {
            return "símbolo especial";
        } else {
            return "classe inválida";
        }
    }

    private static ImageIcon resizeIcon(String fileName) {
        ImageIcon imageIcon = new ImageIcon("src/main/resources/img/" + fileName);
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

}
