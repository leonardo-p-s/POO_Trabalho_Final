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
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class CadastraUsuario {

	private JFrame frmCadastroDeUsurio;
	private JTextField txtFieldNomeUsuario;
	private JTextField txtFieldEmailUsuario;
	private JTextField txtFieldDDDUsuario;
	private JTextField txtFieldTelefUsuario;
	private JTextField txtFieldCPFUsuario;
	private JTextField txtLogin;

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
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		labelLogo.setBounds(230, 11, 303, 76);
		frmCadastroDeUsurio.getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("Faça seu cadastro!");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(282, 118, 200, 29);
		frmCadastroDeUsurio.getContentPane().add(lblTitulo);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLogin.setBounds(213, 159, 46, 18);
		frmCadastroDeUsurio.getContentPane().add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtLogin.setColumns(10);
		txtLogin.setBounds(268, 158, 120, 20);
		frmCadastroDeUsurio.getContentPane().add(txtLogin);
		
		JLabel lblseuNovoLogin = new JLabel("(Seu novo Login aqui)");
		lblseuNovoLogin.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblseuNovoLogin.setBounds(395, 159, 140, 18);
		frmCadastroDeUsurio.getContentPane().add(lblseuNovoLogin);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(230, 195, 290, 1);
		frmCadastroDeUsurio.getContentPane().add(separator_1_1);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(213, 215, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblNome);
		
		txtFieldNomeUsuario = new JTextField();
		txtFieldNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldNomeUsuario.setBounds(268, 215, 268, 20);
		frmCadastroDeUsurio.getContentPane().add(txtFieldNomeUsuario);
		txtFieldNomeUsuario.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(213, 255, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblEmail);
		
		txtFieldEmailUsuario = new JTextField();
		txtFieldEmailUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldEmailUsuario.setColumns(10);
		txtFieldEmailUsuario.setBounds(268, 255, 268, 20);
		frmCadastroDeUsurio.getContentPane().add(txtFieldEmailUsuario);
		
		JLabel lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCelular.setBounds(213, 295, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblCelular);
		
		txtFieldDDDUsuario = new JTextField();
		txtFieldDDDUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldDDDUsuario.setColumns(10);
		txtFieldDDDUsuario.setBounds(268, 295, 23, 20);
		frmCadastroDeUsurio.getContentPane().add(txtFieldDDDUsuario);
		
		txtFieldTelefUsuario = new JTextField();
		txtFieldTelefUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldTelefUsuario.setColumns(10);
		txtFieldTelefUsuario.setBounds(301, 295, 124, 20);
		frmCadastroDeUsurio.getContentPane().add(txtFieldTelefUsuario);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCPF.setBounds(213, 335, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblCPF);
		
		txtFieldCPFUsuario = new JTextField();
		txtFieldCPFUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCPFUsuario.setColumns(10);
		txtFieldCPFUsuario.setBounds(268, 335, 124, 20);
		frmCadastroDeUsurio.getContentPane().add(txtFieldCPFUsuario);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDataDeNascimento.setBounds(213, 375, 124, 14);
		frmCadastroDeUsurio.getContentPane().add(lblDataDeNascimento);
		
        JDateChooser FieldDataNascUsuario = new JDateChooser();
        FieldDataNascUsuario.setDateFormatString("dd-MMM-YYYY");
        FieldDataNascUsuario.setBounds(347, 375, 124, 20);
        frmCadastroDeUsurio.getContentPane().add(FieldDataNascUsuario);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSexo.setBounds(213, 415, 46, 14);
		frmCadastroDeUsurio.getContentPane().add(lblSexo);
		
		JComboBox comboBoxSexoUsuario = new JComboBox();
		comboBoxSexoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxSexoUsuario.setModel(new DefaultComboBoxModel(new String[] {"", "Feminino", "Masculino", "Não binário", "Outro"}));
		comboBoxSexoUsuario.setBounds(268, 415, 90, 20);
		frmCadastroDeUsurio.getContentPane().add(comboBoxSexoUsuario);
		
		JLabel lblFormaDePagamento = new JLabel("Forma de pagamento preferida:");
		lblFormaDePagamento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFormaDePagamento.setBounds(213, 455, 193, 18);
		frmCadastroDeUsurio.getContentPane().add(lblFormaDePagamento);
		
		JComboBox comboBoxFormaPagUsuario = new JComboBox();
		comboBoxFormaPagUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxFormaPagUsuario.setModel(new DefaultComboBoxModel(new String[] {"", "Cartão de Crédito", "PIX", "Dinheiro"}));
		comboBoxFormaPagUsuario.setBounds(404, 455, 129, 20);
		frmCadastroDeUsurio.getContentPane().add(comboBoxFormaPagUsuario);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar");
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ações do Botão Cadastrar Usuario
				// String n, String cel, String cpf, String email, String dn, String sex, String fp
				String l = txtLogin.getText();
				String n = txtFieldNomeUsuario.getText();
				String cel = txtFieldDDDUsuario.getText() + " " + txtFieldTelefUsuario.getText();
				String cpf = txtFieldCPFUsuario.getText();
				String email = txtFieldEmailUsuario.getText();
				Date selectedDob =  FieldDataNascUsuario.getDate();
				String dn = "";
				if(selectedDob != null) {
		        	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
					dn = sdf.format(selectedDob);}
				String sex = (String) comboBoxSexoUsuario.getSelectedItem();
				String fp = (String) comboBoxFormaPagUsuario.getSelectedItem();
				
				if(l.isBlank() || n.isBlank() || cel.isBlank() || cpf.isBlank() || email.isBlank() || dn.isBlank() || sex.isBlank() || fp.isBlank())
					JOptionPane.showMessageDialog(null,  "Favor completar todos os campos!", "Dados incompletos", JOptionPane.WARNING_MESSAGE);
				else {
					if (DadosMotorista.loginExiste(l) || DadosUsuario.loginExiste(l))
						JOptionPane.showMessageDialog(null, "Login já existe!\nFavor escolher outro Login.", "Atenção", JOptionPane.WARNING_MESSAGE);
					else {
						try {
						    Usuario u = new Usuario(l, n, cel, cpf, email, dn, sex, fp);
						    DadosUsuario.cadastrarUsuario(u);
							JOptionPane.showMessageDialog(null,  "Usuário cadastrado com sucesso!", "Confirmado", JOptionPane.INFORMATION_MESSAGE);
							frmCadastroDeUsurio.setVisible(false);
							TelaUsuario.main(null);
						} catch (IllegalArgumentException ex) {
						    JOptionPane.showMessageDialog(null, ex.getMessage(), "Atenção", JOptionPane.WARNING_MESSAGE);
						}
					}
				}
			}
		});
		btnCadastrarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarUsuario.setBounds(213, 504, 100, 23);
		frmCadastroDeUsurio.getContentPane().add(btnCadastrarUsuario);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastroDeUsurio.setVisible(false); 
				TelaInicio.main(null);
				//frmLogin.setVisible(true);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSair.setBounds(433, 504, 100, 23);
		frmCadastroDeUsurio.getContentPane().add(btnSair);
		
	}
}
