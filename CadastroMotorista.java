import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

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
	private JTextField txtFieldLogin;

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
		
        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblLogin.setBounds(211, 179, 46, 18);
        contentPane.add(lblLogin);
        
        txtFieldLogin = new JTextField();
        txtFieldLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
        txtFieldLogin.setColumns(10);
        txtFieldLogin.setBounds(266, 178, 120, 20);
        contentPane.add(txtFieldLogin);
        
        JLabel lblseuNovoLogin = new JLabel("(Seu novo Login aqui)");
        lblseuNovoLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblseuNovoLogin.setBounds(393, 179, 140, 18);
        contentPane.add(lblseuNovoLogin);
        
        JSeparator separator1 = new JSeparator();
        separator1.setBounds(228, 215, 290, 1);
        contentPane.add(separator1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(210, 246, 46, 14);
		contentPane.add(lblNome);
		
		txtFieldNome = new JTextField();
		txtFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldNome.setColumns(10);
		txtFieldNome.setBounds(265, 243, 268, 20);
		contentPane.add(txtFieldNome);
		
		JLabel lblNomeSocial = new JLabel("Nome Social");
		lblNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeSocial.setBounds(255, 279, 90, 14);
		contentPane.add(lblNomeSocial);
		
		txtFiledNomeSocial = new JTextField();
		txtFiledNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFiledNomeSocial.setColumns(10);
		txtFiledNomeSocial.setBounds(395, 280, 138, 20);
		contentPane.add(txtFiledNomeSocial);
		
		JLabel lblnomeQueAparece = new JLabel("(nome que aparecerá para o cliente):");
		lblnomeQueAparece.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblnomeQueAparece.setBounds(210, 292, 180, 14);
		contentPane.add(lblnomeQueAparece);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCPF.setBounds(210, 320, 46, 14);
		contentPane.add(lblCPF);
		
		txtFieldCPF = new JTextField();
		txtFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCPF.setColumns(10);
		txtFieldCPF.setBounds(265, 317, 133, 20);
		contentPane.add(txtFieldCPF);
		
		JLabel lblCNH = new JLabel("CNH:");
		lblCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCNH.setBounds(210, 352, 46, 14);
		contentPane.add(lblCNH);
		
		txtFieldCNH = new JTextField();
		txtFieldCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCNH.setColumns(10);
		txtFieldCNH.setBounds(265, 349, 133, 20);
		contentPane.add(txtFieldCNH);
		
		JLabel lblEndereo = new JLabel("Endereço:");
		lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEndereo.setBounds(210, 435, 64, 14);
		contentPane.add(lblEndereo);
		
		txtFieldEndereco = new JTextField();
		txtFieldEndereco.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldEndereco.setColumns(10);
		txtFieldEndereco.setBounds(275, 435, 258, 20);
		contentPane.add(txtFieldEndereco);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBairro.setBounds(210, 460, 46, 14);
		contentPane.add(lblBairro);
		
		txtFieldBairro = new JTextField();
		txtFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldBairro.setColumns(10);
		txtFieldBairro.setBounds(275, 460, 123, 20);
		contentPane.add(txtFieldBairro);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCidade.setBounds(210, 485, 46, 14);
		contentPane.add(lblCidade);
		
		txtFieldCidade = new JTextField();
		txtFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCidade.setColumns(10);
		txtFieldCidade.setBounds(275, 485, 143, 20);
		contentPane.add(txtFieldCidade);
		
		JLabel lblCEP = new JLabel("CEP:");
		lblCEP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCEP.setBounds(410, 460, 46, 14);
		contentPane.add(lblCEP);
		
		txtFieldCEP = new JTextField();
		txtFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCEP.setColumns(10);
		txtFieldCEP.setBounds(442, 460, 91, 20);
		contentPane.add(txtFieldCEP);
		
		JLabel lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUF.setBounds(428, 485, 46, 14);
		contentPane.add(lblUF);
		
		txtFieldUF = new JTextField();
		txtFieldUF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldUF.setColumns(10);
		txtFieldUF.setBounds(460, 485, 73, 20);
		contentPane.add(txtFieldUF);
		
        JDateChooser dateChooserDdN = new JDateChooser();
        dateChooserDdN.setDateFormatString("dd-MMM-YYYY");
        dateChooserDdN.setBounds(347, 381, 124, 20);
        contentPane.add(dateChooserDdN);
        Date selectedDob = dateChooserDdN.getDate();
        
        JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
        lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblDataDeNascimento.setBounds(210, 384, 124, 14);
        contentPane.add(lblDataDeNascimento);
        
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				// Ações do Botão Cadastrar Motorista
				// Motorista(String l, String n, String ns, String cpf, String cnh, String end, String dn
				String l = txtFieldLogin.getText();
				String n = txtFieldNome.getText();
				String ns = txtFiledNomeSocial.getText(); 
				String cpf = txtFieldCPF.getText();
				String cnh = txtFieldCNH.getText();
				String log = txtFieldEndereco.getText();
				String bairro = txtFieldBairro.getText();
				String cidade = txtFieldCidade.getText();
				String UF = txtFieldUF.getText();
				String CEP = txtFieldCEP.getText();
				String end = log +","+ bairro +","+ cidade +","+ UF +","+ CEP; 
				String dn = "";
				if(selectedDob != null) {
		        	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
					dn = sdf.format(selectedDob);}
				
				if(l.isBlank() || n.isBlank() || ns.isBlank() || cpf.isBlank() || cnh.isBlank() || 
						log.isBlank() || bairro.isBlank() || cidade.isBlank() || UF.isBlank() || CEP.isBlank())
					JOptionPane.showMessageDialog(null,  "Favor completar todos os campos!", "Dados incompletos", JOptionPane.WARNING_MESSAGE);
				else {
					if (DadosMotorista.loginExiste(l) || DadosUsuario.loginExiste(l))
						JOptionPane.showMessageDialog(null, "Login já existe!\nFavor escolher outro Login.", "Atenção", JOptionPane.WARNING_MESSAGE);
					else {
						try {
						    Motorista u = new Motorista(l, n, ns, cpf, cnh, end, dn);
						    DadosMotorista.cadastraMotorista(u);
							JOptionPane.showMessageDialog(null,  "Usuário cadastrado com sucesso!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
							CadastroMotorista.this.setVisible(false);
							TelaMotorista.main(null);
						} catch (IllegalArgumentException ex) {
						    JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
        	}
        });
        btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnCadastrar.setBounds(210, 532, 100, 23);
        contentPane.add(btnCadastrar);
        
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CadastroMotorista.this.setVisible(false); 
				TelaInicio.main(null);
				//frmLogin.setVisible(true);
        	}
        });
        btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnSair.setBounds(444, 533, 89, 23);
        contentPane.add(btnSair);
        
	}

}
