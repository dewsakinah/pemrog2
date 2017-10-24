import javax.swing.JOptionPane;

public class GetInputReader3 {

    public static void main(String [] args) {
        String nim, nama, tempat, tgllahir;

        nim = JOptionPane.showInputDialog("Masukkan NIM Anda :");

        nama = JOptionPane.showInputDialog("Masukkan Nama Anda :");

        tempat = JOptionPane.showInputDialog("Masukkan Tempat Anda :");

        tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir Anda :");

        String msg = "welcome \n" + nama+"\n" + nim+ "\n" + tempat + "\n" + tgllahir + "\n" + "!";
        JOptionPane.showMessageDialog(null,msg);
    }
}