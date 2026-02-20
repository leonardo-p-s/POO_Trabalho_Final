import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import javax.swing.DropMode;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicio {

	private JFrame frmCadastro;
	private JTextField txtFieldUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio window = new TelaInicio();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmCadastro.setTitle("UberLand");
		frmCadastro.setBounds(100, 100, 780, 735);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_Pic1.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(10, 11, 423, 674);
		frmCadastro.getContentPane().add(lblLogo);
		
		JLabel lblTitulo = new JLabel("Olá! Faça seu login!");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(509, 39, 200, 29);
		frmCadastro.getContentPane().add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(489, 104, 46, 14);
		frmCadastro.getContentPane().add(lblUsuario);
		
		txtFieldUsuario = new JTextField();
		txtFieldUsuario.setToolTipText("email");
		txtFieldUsuario.setBounds(537, 101, 151, 20);
		frmCadastro.getContentPane().add(txtFieldUsuario);
		txtFieldUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(489, 132, 46, 14);
		frmCadastro.getContentPane().add(lblSenha);

		passwordField = new JPasswordField();
		passwordField.setBounds(537, 129, 151, 20);
		frmCadastro.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Ações botão Login
				Verifica se Login Existe
					verifica se é Motorista
						Pagina Motorista
					verifica se é Usuário
						Página Usuário
				txtFieldUsuario.getText()
				*/
			}
		});
		btnLogin.setBounds(562, 160, 89, 23);
		frmCadastro.getContentPane().add(btnLogin);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(470, 240, 85, 1);
		frmCadastro.getContentPane().add(separator_1_1);
		
		JLabel lblQuebraCadastUsu = new JLabel("ou cadastrar usuário");
		lblQuebraCadastUsu.setBounds(561, 233, 99, 14);
		frmCadastro.getContentPane().add(lblQuebraCadastUsu);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(665, 240, 85, 1);
		frmCadastro.getContentPane().add(separator_1_2);
		
		JButton btnCriaContaUsuario = new JButton("Criar Conta");
		btnCriaContaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				Ações Botão Cria Conta Usuário
					Verifica se Usuário foi teclado
						Página Cadastrar Usuário
					Senão
						Erro, Pede que entre com usuário e senha
				txtFieldUsuario.getText()
				*/
			}
		});
		btnCriaContaUsuario.setBounds(562, 264, 89, 23);
		frmCadastro.getContentPane().add(btnCriaContaUsuario);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(470, 328, 75, 1);
		frmCadastro.getContentPane().add(separator_2_1);
		
		JLabel lblQuebraCadastMoto = new JLabel("ou trabalhe com a gente");
		lblQuebraCadastMoto.setBounds(550, 321, 117, 14);
		frmCadastro.getContentPane().add(lblQuebraCadastMoto);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(675, 328, 75, 1);
		frmCadastro.getContentPane().add(separator_2_2);
		
		JButton btnCadastrarMotorista = new JButton("Cadastrar como motorista");
		btnCadastrarMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				Ações Botão Cadastrar Motorista
					Verifica se Usuário foi teclado
						Página Cadastrar Motorista
					Senão
						Erro, Pede que entre com usuário e senha
				txtFieldUsuario.getText()
				*/
			}
		});
		btnCadastrarMotorista.setBounds(534, 354, 157, 23);
		frmCadastro.getContentPane().add(btnCadastrarMotorista);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(470, 426, 75, 1);
		frmCadastro.getContentPane().add(separator_3_1);

		JLabel lblAcessoRestrito = new JLabel("acesso restrito UberLand");
		lblAcessoRestrito.setBounds(550, 419, 123, 14);
		frmCadastro.getContentPane().add(lblAcessoRestrito);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(675, 426, 75, 1);
		frmCadastro.getContentPane().add(separator_3_2);

		JButton btnGerenciar = new JButton("Gerenciar");
		btnGerenciar.setBounds(562, 469, 89, 23);
		frmCadastro.getContentPane().add(btnGerenciar);

		
	}
}
