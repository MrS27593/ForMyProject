package Projekty.GUI.Wyklady.W8.ex4;

import javax.swing.*;
import java.awt.*;

public
class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()->{
                    JFrame jFrame = new JFrame();

                    JPanel cPanel = new JPanel();
                    cPanel.setBackground(Color.MAGENTA);
                    JPanel uPanel = new JPanel();
                    uPanel.setBackground(Color.CYAN);
                    JPanel dPanel = new JPanel();
                    dPanel.setBackground(Color.RED);
                    JPanel lPanel = new JPanel();
                    lPanel.setBackground(Color.GREEN);
                    JPanel rPanel = new JPanel();
                    rPanel.setBackground(Color.BLUE);

                    for(int i=0; i<10; i++){
                        JButton button = new JButton("Button"+i);
                        uPanel.add(button);
                    }

                    JButton jButton = new JButton("click me");
                    cPanel.add(jButton);

                    jButton.addActionListener(
                            e -> {
                                System.out.println("action");
                                Dimension dimension = uPanel.getSize();
                                dimension.setSize(
                                        dimension.getWidth(),
                                        dimension.getHeight()*2
                                );
                                uPanel.setPreferredSize(dimension);
                                jFrame.getContentPane().revalidate();
                                jFrame.getContentPane().repaint();
                            }
                    );

                    jFrame.getContentPane().setLayout(new BorderLayout());
                    jFrame.add(cPanel, BorderLayout.CENTER);
                    jFrame.add(uPanel, BorderLayout.PAGE_START);
                    jFrame.add(dPanel, BorderLayout.PAGE_END);
                    jFrame.add(lPanel, BorderLayout.LINE_START);
                    jFrame.add(rPanel, BorderLayout.LINE_END);


                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    jFrame.setVisible(true);
                    jFrame.pack();
                }
        );
    }
}
