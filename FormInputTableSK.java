package SK_PP2;
import pp2.*;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

public class FormInputTableSK extends AbstractTableModel {
//    membuat string array yang digunakan untuk menampung data nama,nomor, dll
    private String[] columnNames = {"Nama", "Nomor", "Jenis Kelamin", "Alamat"};
//    membuat arraylist digunakan untuk menampilkan "data" dalam table
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

//    fungsi untuk mengembalikan jumlah baris
    public int getRowCount() {
        return data.size();
    }
    
//    fungsi untuk mengembalikan jumlah kolom 
    public int getColumnCount() {
        return columnNames.length;
    }

//    fungsi untuk mengembalikan nama kolom
    public String getColumnName(int col) {
        return columnNames[col];
    }

//    fungsi mengembalikan nilai dari array list
    public Object getValueAt(int rowIndex, int columnIndex) {
        List<String> ri = data.get(rowIndex);
        return ri.get(columnIndex);
    }

//    fungsi agar cell dalam table tidak dapat di rubah
    public boolean isCellEditable(int row, int col)  {
        return false;
    }
    
    
    
//    fungsi untuk menambahkan data baru ke dalam table
    public void add(ArrayList<String> val) {
        data.add(val);
        fireTableRowsInserted(data.size() - 1, data.size() -1);
    }
}