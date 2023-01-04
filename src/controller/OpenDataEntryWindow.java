package controller;

import gui.MainFrame;

import javax.swing.*;
import java.awt.*;

public class OpenDataEntryWindow {

    public static void startDataEntryFrame() {
        JFrame dataEntryFrame = new JFrame();
        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setSize(400,400);
        dataEntryPanel.setLayout(null);

        String[] labels = {"Firstname", "Lastname", "Address", "Salary", "Age", "Job"};

        JLabel labelFirstname = new JLabel("Firstname:", 10);
        JLabel labelNachname = new JLabel("Nachname:");
        JLabel labelAddress = new JLabel("Address:");
        JLabel labelSalary = new JLabel("Salary:");
        JLabel labelJob = new JLabel("Job:");
        JLabel labelAge = new JLabel("Age:");

        JTextField inputFirstname = new JTextField(32);
        JTextField inputNachname = new JTextField(32);
        JTextField inputAddress = new JTextField(32);
        JTextField inputSalary = new JTextField(32);
        JTextField inputJob = new JTextField(32);
        JTextField inputAge = new JTextField(32);

        dataEntryFrame.add(dataEntryPanel);

        dataEntryFrame.setSize(400, 400);
        dataEntryFrame.setResizable(false);
        dataEntryFrame.setLayout(null);
        dataEntryFrame.setVisible(true);
    }
}
