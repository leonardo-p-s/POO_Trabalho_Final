import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class CadastrarCorrida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCorrida frame = new CadastrarCorrida();
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
	public CadastrarCorrida() {
		setTitle("Cadastrar Corrida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setBounds(100, 100, 780, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastraVeiculo.class.getResource("/UberLand_LogoF.png")));
		label.setForeground(Color.BLACK);
		label.setBackground(Color.BLACK);
		label.setBounds(230, 10, 303, 76);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Peça um carro!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(282, 118, 200, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblOrigem = new JLabel("Origem:");
		lblOrigem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrigem.setBounds(230, 177, 59, 14);
		contentPane.add(lblOrigem);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(285, 177, 248, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(285, 210, 248, 20);
		contentPane.add(textField_1);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDestino.setBounds(230, 210, 59, 14);
		contentPane.add(lblDestino);
		
		JButton btnChamar = new JButton("Pedir");
		btnChamar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChamar.setBounds(337, 272, 89, 23);
		contentPane.add(btnChamar);
		
		JLabel lblEscolha = new JLabel("Escolha:");
		lblEscolha.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEscolha.setBounds(230, 241, 59, 14);
		contentPane.add(lblEscolha);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"UberX", "UberConfort", "UberBlack"}));
		comboBox.setBounds(282, 241, 105, 20);
		contentPane.add(comboBox);

	}

}
