package Q4;

import Q4.model.UI.MainFrame;

public class App {

    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName(DRIVER_NAME);
        new MainFrame();



    }//end of main method
}//end of class
