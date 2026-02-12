import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTree;

import com.toedter.calendar.JDateChooser;

public class CadastraUsuario {

	private JFrame frmCadastroDeUsurio;
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
					CadastraUsuario window = new CadastraUsuario();
					window.frmCadastroDeUsurio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CadastraUsuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastroDeUsurio = new JFrame();
		frmCadastroDeUsurio.setTitle("Cadastro de Usuário");
		frmCadastroDeUsurio.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmCadastroDeUsurio.setBounds(100, 100, 780, 735);
		frmCadastroDeUsurio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastroDeUsurio.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(0, 0, 0));
		label.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		label.setBounds(230, 11, 303, 76);
		frmCadastroDeUsurio.getContentPane().add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Faça seu cadastro!");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(282, 118, 200, 29);
		frmCadastroDeUsurio.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(213, 190, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(268, 190, 268, 20);
		frmCadastroDeUsurio.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(213, 230, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(268, 230, 268, 20);
		frmCadastroDeUsurio.getContentPane().add(textField_1);
		
		JLabel lblEmail_1 = new JLabel("Celular:");
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail_1.setBounds(213, 270, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblEmail_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(268, 270, 23, 20);
		frmCadastroDeUsurio.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(301, 270, 124, 20);
		frmCadastroDeUsurio.getContentPane().add(textField_3);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCpf.setBounds(213, 310, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblCpf);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(268, 310, 124, 20);
		frmCadastroDeUsurio.getContentPane().add(textField_4);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataDeNascimento.setBounds(213, 350, 124, 14);
		frmCadastroDeUsurio.getContentPane().add(lblDataDeNascimento);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSexo.setBounds(213, 390, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblSexo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Feminino", "Masculino", "Não binário", "Outro"}));
		comboBox.setBounds(268, 390, 90, 20);
		frmCadastroDeUsurio.getContentPane().add(comboBox);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento preferida:");
		lblFormaDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFormaDePagamento.setBounds(213, 430, 193, 14);
		frmCadastroDeUsurio.getContentPane().add(lblFormaDePagamento);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Cartão de Crédito", "PIX", "Dinheiro"}));
		comboBox_1.setBounds(404, 430, 129, 20);
		frmCadastroDeUsurio.getContentPane().add(comboBox_1);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(337, 503, 89, 23);
		frmCadastroDeUsurio.getContentPane().add(btnNewButton);
		
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MMM-YYYY");
        dateChooser.setBounds(347, 350, 124, 20);
        frmCadastroDeUsurio.getContentPane().add(dateChooser);
        Date selectedDob = dateChooser.getDate();
		
	}
}
