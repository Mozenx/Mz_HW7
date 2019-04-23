package Q1.model.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    static JFrame frame;
    JButton stB, tchB;

    public MainFrame(){
        //declare some components and set state of them
        frame = new JFrame();
        stB = new JButton("Student");
        tchB = new JButton("Teacher");
        stB.setBounds(50,20,100,20);
        tchB.setBounds(50,50,100,20);

        //add components to the frame
        frame.setSize(200,130);
        frame.setLayout(null);
        frame.add(tchB);
        frame.add(stB);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add action to buttons
        stB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableFrame stTable = new StudentTable();
            }
        });

        tchB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TableFrame tchTable = new TeacherTable();
            }
        });

    }// end of constructor
}//end of class
