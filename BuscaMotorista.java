import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class BuscaMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaMotorista frame = new BuscaMotorista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BuscaMotorista() {
		setTitle("Buscar Motorista");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel_3 = new JLabel("<html>Busca Motorista.<br/>Entre com um dos campos e clique Buscar!</html>");
		lblNewLabel_3.setBounds(180, 107, 404, 60);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_3);
		
		JLabel label = new JLabel("");
		label.setBounds(230, 10, 303, 76);
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(0, 0, 0));
		label.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(210, 190, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(265, 190, 268, 20);
		contentPane.add(textField);
		
		JLabel lblNomeSocialcomo = new JLabel("Nome Social:");
		lblNomeSocialcomo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeSocialcomo.setBounds(210, 230, 90, 14);
		contentPane.add(lblNomeSocialcomo);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(292, 227, 138, 20);
		contentPane.add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(210, 280, 46, 14);
		contentPane.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(265, 280, 133, 20);
		contentPane.add(textField_2);
		
		JLabel lblCnh = new JLabel("CNH:");
		lblCnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCnh.setBounds(210, 320, 46, 14);
		contentPane.add(lblCnh);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(265, 320, 133, 20);
		contentPane.add(textField_3);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(337, 366, 89, 23);
		contentPane.add(btnBuscar);

	}
}
