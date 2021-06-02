package JavaGui;

import javax.swing.*;

public class RunFormMahasiswa {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Biodata");
        jFrame.setContentPane(new FormMahasiswa().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500, 400);
        jFrame.setVisible(true);

    }
}
