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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldNome;
	private JTextField txtFiledNomeSocial;
	private JTextField txtFieldCPF;
	private JTextField txtFieldCNH;
	private JTextField txtFieldEndereco;
	private JTextField txtFieldBairro;
	private JTextField txtFieldCidade;
	private JTextField txtFieldCEP;
	private JTextField txtFieldUF;

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
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(230, 10, 303, 76);
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("<html>Trabalhe conosco.<br/>Faça seu cadastro como motorista da UberLand!</html>");
		lblTitulo.setBounds(180, 107, 404, 60);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(210, 190, 46, 14);
		contentPane.add(lblNome);
		
		txtFieldNome = new JTextField();
		txtFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldNome.setColumns(10);
		txtFieldNome.setBounds(265, 190, 268, 20);
		contentPane.add(txtFieldNome);
		
		JLabel lblNomeSocial = new JLabel("Nome Social");
		lblNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeSocial.setBounds(250, 230, 90, 14);
		contentPane.add(lblNomeSocial);
		
		txtFiledNomeSocial = new JTextField();
		txtFiledNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFiledNomeSocial.setColumns(10);
		txtFiledNomeSocial.setBounds(395, 231, 138, 20);
		contentPane.add(txtFiledNomeSocial);
		
		JLabel lblnomeQueAparece = new JLabel("(nome que aparecerá para o cliente):");
		lblnomeQueAparece.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblnomeQueAparece.setBounds(210, 244, 180, 14);
		contentPane.add(lblnomeQueAparece);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCPF.setBounds(210, 280, 46, 14);
		contentPane.add(lblCPF);
		
		txtFieldCPF = new JTextField();
		txtFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCPF.setColumns(10);
		txtFieldCPF.setBounds(265, 280, 133, 20);
		contentPane.add(txtFieldCPF);
		
		JLabel lblCNH = new JLabel("CNH:");
		lblCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCNH.setBounds(210, 320, 46, 14);
		contentPane.add(lblCNH);
		
		txtFieldCNH = new JTextField();
		txtFieldCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCNH.setColumns(10);
		txtFieldCNH.setBounds(265, 320, 133, 20);
		contentPane.add(txtFieldCNH);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(210, 396, 64, 14);
		contentPane.add(lblEndereo);
		
		txtFieldEndereco = new JTextField();
		txtFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldEndereco.setColumns(10);
		txtFieldEndereco.setBounds(275, 396, 258, 20);
		contentPane.add(txtFieldEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBairro.setBounds(210, 421, 46, 14);
		contentPane.add(lblBairro);
		
		txtFieldBairro = new JTextField();
		txtFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldBairro.setColumns(10);
		txtFieldBairro.setBounds(275, 421, 123, 20);
		contentPane.add(txtFieldBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCidade.setBounds(210, 446, 46, 14);
		contentPane.add(lblCidade);
		
		txtFieldCidade = new JTextField();
		txtFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCidade.setColumns(10);
		txtFieldCidade.setBounds(275, 446, 143, 20);
		contentPane.add(txtFieldCidade);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCEP.setBounds(410, 421, 46, 14);
		contentPane.add(lblCEP);
		
		txtFieldCEP = new JTextField();
		txtFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCEP.setColumns(10);
		txtFieldCEP.setBounds(442, 421, 91, 20);
		contentPane.add(txtFieldCEP);
		
		JLabel lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUF.setBounds(428, 446, 46, 14);
		contentPane.add(lblUF);
		
		txtFieldUF = new JTextField();
		txtFieldUF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldUF.setColumns(10);
		txtFieldUF.setBounds(460, 446, 73, 20);
		contentPane.add(txtFieldUF);
		
        JDateChooser dateChooserDdN = new JDateChooser();
        dateChooserDdN.setDateFormatString("dd-MMM-YYYY");
        dateChooserDdN.setBounds(347, 360, 124, 20);
        contentPane.add(dateChooserDdN);
        Date selectedDob = dateChooserDdN.getDate();
        
        JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
        lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblDataDeNascimento.setBounds(210, 360, 124, 14);
        contentPane.add(lblDataDeNascimento);
        
        JButton btnNewButton = new JButton("Cadastrar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		/* Ações do Botão Cadastrar Motorista
        		Motorista(String n, String ns, String cpf, String cnh, String end, String dn)
        		txtFieldNome.getText(),
        		txtFiledNomeSocial.getText(),
        		txtFieldCPF.getText(),
        		txtFieldCNH.getText(),
        		txtFieldEndereco.getText() + txtFieldBairro.getText() + txtFieldCidade.getText() + txtFieldUF.getText() + txtFieldCEP.getText(),
        		*/
        	}
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(337, 516, 89, 23);
        contentPane.add(btnNewButton);

	}

}
