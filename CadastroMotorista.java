import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroMotorista frame = new CadastroMotorista();
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
	public CadastroMotorista() {
		setTitle("Cadastro de Motorista");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Trabalhe conosco.<br/>Faça seu cadastro como motorista da UberLand!</html>");
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
		
		JLabel lblNomeSocialcomo = new JLabel("Nome Social");
		lblNomeSocialcomo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeSocialcomo.setBounds(250, 230, 90, 14);
		contentPane.add(lblNomeSocialcomo);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(395, 231, 138, 20);
		contentPane.add(textField_1);
		
		JLabel lblnomeQueAparece = new JLabel("(nome que aparecerá para o cliente):");
		lblnomeQueAparece.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblnomeQueAparece.setBounds(210, 244, 180, 14);
		contentPane.add(lblnomeQueAparece);
		
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
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(210, 396, 64, 14);
		contentPane.add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(275, 396, 258, 20);
		contentPane.add(textField_4);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBairro.setBounds(210, 421, 46, 14);
		contentPane.add(lblBairro);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(275, 421, 123, 20);
		contentPane.add(textField_5);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCidade.setBounds(210, 446, 46, 14);
		contentPane.add(lblCidade);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(275, 446, 143, 20);
		contentPane.add(textField_6);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCep.setBounds(410, 421, 46, 14);
		contentPane.add(lblCep);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(442, 421, 91, 20);
		contentPane.add(textField_7);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUf.setBounds(428, 446, 46, 14);
		contentPane.add(lblUf);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(460, 446, 73, 20);
		contentPane.add(textField_8);
		
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("dd-MMM-YYYY");
        dateChooser.setBounds(347, 360, 124, 20);
        contentPane.add(dateChooser);
        Date selectedDob = dateChooser.getDate();
        
        JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
        lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblDataDeNascimento.setBounds(210, 360, 124, 14);
        contentPane.add(lblDataDeNascimento);
        
        JButton btnNewButton = new JButton("Cadastrar");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(337, 516, 89, 23);
        contentPane.add(btnNewButton);

	}

}
