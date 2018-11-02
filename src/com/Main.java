package com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton(new MyAction());
        jButton.setText("BUTTON");
        jPanel.add(jButton);
        JButton jButton2 = new JButton(new MyAction2());
        jButton2.setText("KNOPKA");
        jPanel.add(jButton2);

    }

    static class MyAction extends AbstractAction {
        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION,"My small action");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLUE);
        }
    }
    static class MyAction2 extends AbstractAction {
        MyAction2(){
            putValue(AbstractAction.SHORT_DESCRIPTION,"Moja knopka");
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLACK);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
