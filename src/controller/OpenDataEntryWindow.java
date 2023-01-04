package controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenDataEntryWindow {
    private static String[] labelNames = {
            "Firstname", "Lastname", "Address:", "Salary:", "Job:", "Age:"
    };
    public static JTextField[] textFields = new JTextField[5];
    private static JButton confirmButton;
    private static JFrame dataEntryFrame;

    public static void startDataEntryFrame() {
        dataEntryFrame = new JFrame();
        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setSize(400, 400);
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        dataEntryPanel.setLayout(gridBagLayout);

        int labelIndex = 0;
        int textFieldIndex = 0;
        for (int y = 0; y <= 5; y++) {
            for (int x = 0; x <= 1; x++) {
                gridBagConstraints.gridx = x;
                gridBagConstraints.gridy = y;
                if (x == 0) {
                    dataEntryPanel.add(new JLabel(labelNames[labelIndex]), gridBagConstraints);
                } else {
                    if (textFieldIndex != 5) {
                        dataEntryPanel.add(textFields[textFieldIndex] = new JTextField(20), gridBagConstraints);
                    }
                }
            }
            labelIndex++;

        }

        confirmButton = new JButton("Confirm");
        gridBagConstraints.anchor = GridBagConstraints.PAGE_END;
        gridBagConstraints.gridy = 6;
        dataEntryPanel.add(confirmButton, gridBagConstraints);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dataEntryFrame.dispose();
            }
        });

        dataEntryFrame.add(dataEntryPanel);
        dataEntryFrame.setSize(300, 170);
        dataEntryFrame.setResizable(false);
        dataEntryFrame.setVisible(true);
    }
}
