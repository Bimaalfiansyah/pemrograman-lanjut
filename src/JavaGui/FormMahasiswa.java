package JavaGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormMahasiswa {
    private JTextField textNim;
    private JTextField textNama;
    private JTextField textJurusan;
    private JTextField textFakultas;
    private JTextField textJenjang;
    private JTextField textJeniskelamin;
    private JTextField textTahunMasuk;
    private JTextField textNomor;
    private JButton cariButton;
    private JButton resetButton;
    private JButton keluatButton;
    private JPanel rootPanel;


    public FormMahasiswa() {
        cariButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nama = textNama.getText();
                String nim = textNim.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNim(nim);

                textJurusan.setText(mhs.getJurusan());
                textFakultas.setText(mhs.getFakultas());
                textJenjang.setText(mhs.getJenjang());
                textJeniskelamin.setText(mhs.getJenisKelamin());
                textTahunMasuk.setText(mhs.getTahunMasuk());
                textNomor.setText(mhs.getNomorUrutMahasiswa());
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textNama.setText("");
                textNim.setText("");
                textNomor.setText("");
                textJeniskelamin.setText("");
                textJenjang.setText("");
                textFakultas.setText("");
                textJurusan.setText("");
                textTahunMasuk.setText("");
                textNama.requestFocus();
            }
        });
        keluatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }



}


