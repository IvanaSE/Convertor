

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frmConvertor;
	private JTextField textField;
	private JTextField textField_1;
	Convertor conv = new Convertor ();
	DecimalFormat df = new DecimalFormat ("#.####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmConvertor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConvertor = new JFrame();
		frmConvertor.getContentPane().setBackground(Color.PINK);
		frmConvertor.setTitle("Convertor");
		frmConvertor.setBounds(100, 100, 650, 190);
		frmConvertor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmConvertor.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Value in degrees:");
		lblNewLabel.setBounds(24, 22, 323, 15);
		frmConvertor.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(255, 18, 162, 24);
		frmConvertor.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblResult = new JLabel("Value in Radians:");
		lblResult.setBounds(24, 87, 162, 15);
		frmConvertor.getContentPane().add(lblResult);
		
		textField_1 = new JTextField();
		textField_1.setBounds(255, 83, 157, 24);
		frmConvertor.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnToRadians = new JButton("to Radians");
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(textField.getText());
				textField_1.setText("" + df.format(conv.convertToRadians(result)) + "");
				textField.setText("");
				
			}
		});
		btnToRadians.setBounds(470, 17, 117, 25);
		frmConvertor.getContentPane().add(btnToRadians);
		
		JButton btnToDegrees = new JButton("to Degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double result = Double.parseDouble(textField_1.getText());
				textField.setText("" + df.format(conv.convertToDegrees(result)) + "");
				textField_1.setText("");
				
			}
		});
		btnToDegrees.setBounds(470, 82, 117, 25);
		frmConvertor.getContentPane().add(btnToDegrees);
	}
}
