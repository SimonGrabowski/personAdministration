package controller;

import javax.swing.*;
import java.awt.*;

public class OpenDataEntryWindow {

    private static JTextField inputFirstname, inputLastname, inputAddress, inputSalary, inputJob, inputAge = new JTextField(20);
//    private static JLabel labelFirstname, labelLastname, labelAddress, labelSalary, labelJob, labelAge;
    private static String[] labelNames = {
            "Firstname", "Lastname", "Address:", "Salary:", "Job:", "Age:"
    };

    public static void startDataEntryFrame() {
        JFrame dataEntryFrame = new JFrame();
        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setSize(400, 400);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        dataEntryPanel.setLayout(gridBagLayout);

        inputFirstname = new JTextField(20);
        inputLastname = new JTextField(20);
        inputAddress = new JTextField(20);
        inputSalary = new JTextField(20);
        inputJob = new JTextField(20);
        inputAge = new JTextField(20);

//        labelFirstname = new JLabel("Firstname:");
//        labelLastname = new JLabel("Lastname:");
//        labelAddress = new JLabel("Address:");
//        labelSalary = new JLabel("Salary");
//        labelJob = new JLabel("Job:");
//        labelAge = new JLabel("Age:");

        int labelIndex = 0;
        for (int y = 0; y <= 5; y++) {
            for (int x = 0; x <= 1; x++) {
                gridBagConstraints.gridx = x;
                gridBagConstraints.gridy = y;
                if (x == 0) {
                    dataEntryPanel.add(new JLabel(labelNames[y]), gridBagConstraints);
                } else {
                    dataEntryPanel.add(new JTextField(20), gridBagConstraints);
                }
            }
            labelIndex++;
        }

//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 0;
//        dataEntryPanel.add(labelFirstname, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 0;
//        dataEntryPanel.add(inputFirstname, gridBagConstraints);
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 1;
//        dataEntryPanel.add(labelLastname, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 1;
//        dataEntryPanel.add(inputLastname, gridBagConstraints);
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 2;
//        dataEntryPanel.add(labelAddress, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 2;
//        dataEntryPanel.add(inputAddress, gridBagConstraints);
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 3;
//        dataEntryPanel.add(labelSalary, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 3;
//        dataEntryPanel.add(inputSalary, gridBagConstraints);
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 4;
//        dataEntryPanel.add(labelJob, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 4;
//        dataEntryPanel.add(inputJob, gridBagConstraints);
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 5;
//        dataEntryPanel.add(labelAge, gridBagConstraints);
//        gridBagConstraints.gridx = 1;
//        gridBagConstraints.gridy = 5;
//        dataEntryPanel.add(inputAge, gridBagConstraints);

        dataEntryFrame.add(dataEntryPanel);

        dataEntryFrame.setSize(400, 400);
        dataEntryFrame.setResizable(false);
        dataEntryFrame.setVisible(true);
    }
}
