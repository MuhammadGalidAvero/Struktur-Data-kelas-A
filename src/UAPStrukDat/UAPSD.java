package UAPStrukDat;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UAPSD extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField inputField;
    private JComboBox<String> comboBox;
    private ArrayList<String> dataList;
    private Queue<String> dataQueue;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UAPSD frame = new UAPSD();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void bubbleSort(Integer[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public UAPSD() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 553, 393);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblJudul = new JLabel("MENGURUTKAN DATA");
        lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
        lblJudul.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
        lblJudul.setForeground(new Color(0, 0, 0));
        lblJudul.setBounds(118, 10, 287, 37);
        contentPane.add(lblJudul);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(246, 110, 268, 190);
        contentPane.add(textArea);

        inputField = new JTextField();
        inputField.setBounds(36, 103, 167, 30);
        contentPane.add(inputField);
        inputField.setColumns(10);

        comboBox = new JComboBox();
        comboBox.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih Data", "Huruf", "Angka"}));
        comboBox.setBounds(36, 59, 167, 34);
        contentPane.add(comboBox);

        JButton btnInput = new JButton("Input");
        btnInput.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                if (!input.isEmpty()) {
                    dataList.add(input);
                    dataQueue.add(input);
                    textArea.append(input + "\n");
                    inputField.setText("");
                }
            }
        });
        btnInput.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
        btnInput.setBounds(36, 143, 167, 37);
        contentPane.add(btnInput);

        JButton btnSort = new JButton("SORTING");
        btnSort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String sortingChoice = (String) comboBox.getSelectedItem(); // Ambil pilihan dari comboBox

                if (sortingChoice.equals("Huruf")) {
                    // Sorting berdasarkan nama
                    String[] names = dataList.toArray(new String[dataList.size()]);
                    Arrays.sort(names);
                    textArea.setText("");
                    for (String name : names) {
                        textArea.append(name + "\n");
                    }
                } else if (sortingChoice.equals("Angka")) {
                    // Sorting berdasarkan angka
                    try {
                        Integer[] numbers = dataList.stream().map(Integer::parseInt).toArray(Integer[]::new);
                        bubbleSort(numbers);
                        textArea.setText("");
                        for (Integer number : numbers) {
                            textArea.append(number + "\n");
                        }
                    } catch (NumberFormatException ex) {
                        textArea.append("Error: Data yang dimasukkan salah. \n");
                    }
                }
            }
        });
        btnSort.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
        btnSort.setBounds(333, 65, 181, 37);
        contentPane.add(btnSort);

        JButton btnClear = new JButton("Clear");
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
                dataList.clear();
                dataQueue.clear();
                inputField.setText("");
            }
        });
        btnClear.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
        btnClear.setBounds(36, 306, 478, 40);
        contentPane.add(btnClear);
        
        dataList = new ArrayList<String>();
        dataQueue = new LinkedList<String>();
    }
}
