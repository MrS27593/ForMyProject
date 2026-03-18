package Projekty.UTP.Nauka.Nauka8.Nauka8_5;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.*;
import java.lang.reflect.*;

class Exec1 extends JFrame implements ActionListener{

    int k = 0;
    int n = 15;

    JTextArea jTextArea = new JTextArea(40,20);

    Exec1(){
        add(new JScrollPane(jTextArea));
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Start");
        jButton.addActionListener(this);
        jPanel.add(jButton);
        jButton = new JButton("Stop current");
        jButton.setActionCommand("Stop");
        jButton.addActionListener(this);
        jPanel.add(jButton);
        jButton = new JButton("Current Result");
        jButton.setActionCommand("Result");
        jButton.addActionListener(this);
        jPanel.add(jButton);
        jButton = new JButton("Shutdown");
        jButton.addActionListener(this);
        jPanel.add(jButton);
        add(jPanel,"South");
        setDefaultCloseOperation(3);
        pack();
        setVisible(true);


    }



    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        try{
            Method method = e.getClass().getDeclaredMethod("task"+cmd);
            method.invoke(this);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        } catch (NoSuchMethodException ex) {
            throw new RuntimeException(ex);
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }

    class SumTask implements Callable<Integer>{
        private int taskNum,limit;

        public SumTask(int taskNum, int limit){
            this.taskNum = taskNum;
            this.limit = limit;
        }

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Integer call() throws Exception {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
