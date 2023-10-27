package SK_PP2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class HelloFormTableSK extends JFrame {
    private boolean checboxselected;
    public HelloFormTableSK() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel labelnama = new JLabel("Nama :");
        labelnama.setBounds(15,40,350,15);
        JLabel labelnomor = new JLabel("Nomor Telp :");
        labelnomor.setBounds(15,100,350,15);
        JLabel labelradio = new JLabel("Jenis Kelamin :");
        labelradio.setBounds(15,160,350,15);
        JLabel labelalamat = new JLabel("Alamat : ");
        labelalamat.setBounds(15,235,350,15);
        
        JTextArea textalamat = new JTextArea();
        textalamat.setBounds(15,260,400,100);

        
        JTextField textnama = new JTextField();
        textnama.setBounds(15,60,400,30);
        JTextField textnomor = new JTextField();
        textnomor.setBounds(15,120,400,30);


        JButton button = new JButton("Simpan");
        button.setBounds(15,370,100,40);
        JButton buttonedit = new JButton("Edit");
        buttonedit.setBounds(120,370,100,40);
        JButton buttonhapus = new JButton("Hapus");
        buttonhapus.setBounds(225,370,100,40);
        JButton buttonfile = new JButton("Simpan ke File");
        buttonfile.setBounds(330,370,130,40);


        JRadioButton radioButton_1 = new JRadioButton("Laki-laki", true);
        radioButton_1.setBounds(15,180,200,25);
        JRadioButton radioButton_2 = new JRadioButton("Perempuan");
        radioButton_2.setBounds(15,205,200,25);


        javax.swing.JTable table = new JTable();

        JScrollPane scrollabletable = new JScrollPane(table);
        scrollabletable.setBounds(15, 420, 400, 200);

        FormInputTableSK formtable = new FormInputTableSK();
        table.setModel(formtable);


        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton_1);
        bg.add(radioButton_2);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String jeniskelamin = "", 
                       nama = textnama.getText(), 
                       nomor = textnomor.getText(),
                       alamat = textalamat.getText();
                if(radioButton_1.isSelected()) 
                    jeniskelamin = radioButton_1.getText();
                if(radioButton_2.isSelected())
                    jeniskelamin = radioButton_2.getText();
//                if(textnama,textnomor,textalamat)
                textnama.setText("");
                textnomor.setText("");
                textalamat.setText("");
                formtable.add(new ArrayList<>(Arrays.asList(nama, nomor, jeniskelamin, alamat )));
            }
        });

        this.add(labelnama);
        this.add(labelnomor);
        this.add(labelradio);
        this.add(labelalamat);
        this.add(radioButton_1);
        this.add(radioButton_2);
        this.add(textnama);
        this.add(textnomor);
        this.add(textalamat);
        this.add(button);
        this.add(buttonedit);
        this.add(buttonhapus);
        this.add(buttonfile);
        this.add(scrollabletable);
        this.setSize(600,700);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HelloFormTableSK().setVisible(true);
            }
        });
    }
}