import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JYearChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class CadastraVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraVeiculo frame = new CadastraVeiculo();
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
	public CadastraVeiculo() {
		setTitle("Cadastro de Veículo");
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
		
		JLabel lblNewLabel_3 = new JLabel("Cadastre seu veículo!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(282, 118, 200, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarca.setBounds(210, 181, 46, 14);
		contentPane.add(lblMarca);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(265, 181, 134, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(464, 181, 116, 20);
		contentPane.add(textField_1);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblModelo.setBounds(409, 181, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAno.setBounds(210, 212, 39, 14);
		contentPane.add(lblAno);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(240, 212, 50, 20);
		contentPane.add(yearChooser);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(366, 212, 77, 20);
		contentPane.add(textField_2);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPlaca.setBounds(327, 212, 46, 14);
		contentPane.add(lblPlaca);
		
		JLabel lblVinnroChassi = new JLabel("VIN (nro. chassi):");
		lblVinnroChassi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVinnroChassi.setBounds(210, 243, 105, 14);
		contentPane.add(lblVinnroChassi);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(321, 243, 174, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(503, 212, 77, 20);
		contentPane.add(textField_4);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCor.setBounds(464, 212, 46, 14);
		contentPane.add(lblCor);
		
		JLabel lblCapacidadeDePassageiros = new JLabel("Capacidade de Passageiros:");
		lblCapacidadeDePassageiros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCapacidadeDePassageiros.setBounds(210, 276, 163, 14);
		contentPane.add(lblCapacidadeDePassageiros);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(383, 274, 46, 20);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Itens de Conforto (selecione todos que se aplicam):", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(189, 322, 386, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Conforto Básico");
		chckbxNewCheckBox_2.setBounds(19, 21, 115, 25);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Ar Condicionado");
		chckbxNewCheckBox.setBounds(139, 21, 119, 25);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("AC Dual Zone");
		chckbxNewCheckBox_1.setBounds(263, 21, 103, 25);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Espaço Extra");
		chckbxNewCheckBox_3.setBounds(16, 51, 99, 25);
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Banco Reclinável");
		chckbxNewCheckBox_4.setBounds(120, 51, 121, 25);
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Interior Premium");
		chckbxNewCheckBox_5.setBounds(246, 51, 123, 25);
		chckbxNewCheckBox_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Rodas de Liga Leve");
		chckbxNewCheckBox_6.setBounds(125, 81, 135, 25);
		chckbxNewCheckBox_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxNewCheckBox_6);
		
		JLabel lblNewLabel = new JLabel("Capacidade de Malas:");
		lblNewLabel.setBounds(19, 116, 126, 16);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(150, 113, 35, 22);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		panel.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(337, 506, 89, 23);
		contentPane.add(btnNewButton);

	}
}
