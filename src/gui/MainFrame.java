package gui;

import controller.OpenDataEntryWindow;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame implements ActionListener {

    private JButton createButton, deleteButton, importButton, exportButton;

    private String[][] data = {
            {"Kundan Kumar Jha", "4031", "CSE"},
            {"Anand Jha", "6014", "IT"}
    };
    private String[] columnNames = {"Name", "Roll Number", "Department"};
    private int defaultWidth;
    private int defaultHeight;
    private final LineBorder panelOutline = new LineBorder(Color.BLACK, 2);

    public MainFrame(int defaultWidth, int defaultHeight) {
        this.defaultWidth = defaultWidth;
        this.defaultHeight = defaultHeight;
    }

    public void startGui() {
        JFrame mainWindow = new JFrame();

        // Abschnitt: Tabelle mit Daten
        JPanel nameTablePanel = new JPanel();
        nameTablePanel.setBounds(10, 10, defaultWidth - 200, defaultHeight - 300);
        nameTablePanel.setBorder(panelOutline);

        JTable personTable = new JTable(data, columnNames);
        JScrollPane personScrollPane = new JScrollPane(personTable);

        personScrollPane.setBounds(0, 0, defaultWidth - 200, defaultHeight - 300);
        nameTablePanel.setLayout(null);
        nameTablePanel.add(personScrollPane);

        // Abschnitt: Informationen über ausgewählten Datensatz der Tabelle mit Daten
        JPanel detailTablePanel = new JPanel();
        detailTablePanel.setBounds(10, defaultHeight - 280, defaultWidth - 20, defaultHeight - 560);
        detailTablePanel.setBorder(panelOutline);

        JTable detailedPersonTable = new JTable(data, columnNames);
        JScrollPane detailedPersonScrollPane = new JScrollPane(detailedPersonTable);
        detailedPersonScrollPane.setBounds(0, 0, defaultWidth - 20, defaultHeight - 560);

        detailTablePanel.setLayout(null);
        detailTablePanel.add(detailedPersonScrollPane);

        // Abschnitt: Feld für Buttons
        JPanel buttonMenuPanel = new JPanel();
        buttonMenuPanel.setBounds(defaultWidth - 180, 10, defaultWidth - 630, defaultHeight - 300);
        buttonMenuPanel.setBorder(panelOutline);

        deleteButton = new JButton("Delete");
        createButton = new JButton("Create");
        importButton = new JButton("Import data");
        exportButton = new JButton("Export data");
        buttonMenuPanel.add(deleteButton);
        buttonMenuPanel.add(createButton);
        buttonMenuPanel.add(importButton);
        buttonMenuPanel.add(exportButton);

        createButton.addActionListener(this);
        deleteButton.addActionListener(this);

        mainWindow.add(nameTablePanel);
        mainWindow.add(detailTablePanel);
        mainWindow.add(buttonMenuPanel);

        mainWindow.setLayout(null);
        mainWindow.setResizable(false);
        mainWindow.setSize(new Dimension(defaultWidth, defaultHeight));
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == createButton)
        OpenDataEntryWindow.startDataEntryFrame();
    }
}
