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
import javax.swing.JOptionPane;

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

	private JFrame frmLogin;
	private JTextField txtFieldUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		DadosUsuario.inicializaVetorUsuarios();
		DadosMotorista.inicializaMotoristas();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio window = new TelaInicio();
					window.frmLogin.setVisible(true);
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
		frmLogin = new JFrame();
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmLogin.setTitle("UberLand");
		frmLogin.setBounds(100, 100, 780, 735);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_Pic1.png")));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(10, 11, 423, 674);
		frmLogin.getContentPane().add(lblLogo);
		
		JLabel lblTitulo = new JLabel("Olá! Faça seu login!");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(497, 40, 200, 29);
		frmLogin.getContentPane().add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(473, 105, 50, 14);
		frmLogin.getContentPane().add(lblUsuario);
		
		txtFieldUsuario = new JTextField();
		txtFieldUsuario.setToolTipText("email");
		txtFieldUsuario.setBounds(522, 102, 151, 20);
		frmLogin.getContentPane().add(txtFieldUsuario);
		txtFieldUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(477, 133, 46, 14);
		frmLogin.getContentPane().add(lblSenha);

		passwordField = new JPasswordField();
		passwordField.setBounds(522, 130, 151, 20);
		frmLogin.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String login = txtFieldUsuario.getText();
				if(login.isEmpty())
					JOptionPane.showMessageDialog(null,  "Favor digitar um login!", "Login vazio", JOptionPane.WARNING_MESSAGE);
				else {
					if(DadosUsuario.fazerLoginUsuario(login)) {
						frmLogin.setVisible(false);
						TelaUsuario.main(null);
					}
					else if(DadosMotorista.fazerLoginMotorista(login)) {
						frmLogin.setVisible(false);
						TelaMotorista.main(null);
					}
					else
						JOptionPane.showMessageDialog(null,  "Usuário não encontrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(553, 161, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(455, 247, 80, 1);
		frmLogin.getContentPane().add(separator_1_1);
		
		JLabel lblQuebraCadastUsu = new JLabel("ou cadastrar usuário");
		lblQuebraCadastUsu.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuebraCadastUsu.setBounds(537, 240, 120, 14);
		frmLogin.getContentPane().add(lblQuebraCadastUsu);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(663, 247, 80, 1);
		frmLogin.getContentPane().add(separator_1_2);
		
		JButton btnCriaContaUsuario = new JButton("Criar Conta");
		btnCriaContaUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ações Botão Cria Conta Usuário
				frmLogin.setVisible(false);
				CadastraUsuario.main(null);
				//frmCadastroDeUsurio.setVisible(false); 
			}
		});
		btnCriaContaUsuario.setBounds(547, 274, 100, 23);
		frmLogin.getContentPane().add(btnCriaContaUsuario);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(455, 335, 70, 1);
		frmLogin.getContentPane().add(separator_2_1);
		
		JLabel lblQuebraCadastMoto = new JLabel("ou trabalhe com a gente");
		lblQuebraCadastMoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuebraCadastMoto.setBounds(527, 328, 140, 14);
		frmLogin.getContentPane().add(lblQuebraCadastMoto);
		
		JSeparator separator_2_2 = new JSeparator();
		separator_2_2.setBounds(673, 335, 70, 1);
		frmLogin.getContentPane().add(separator_2_2);
		
		JButton btnCadastrarMotorista = new JButton("Cadastrar como motorista");
		btnCadastrarMotorista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ações Botão Cria Conta Usuário
				frmLogin.setVisible(false);
				CadastroMotorista.main(null);
				//frmCadastroDeUsurio.setVisible(falsse); 
			}
		});
		btnCadastrarMotorista.setBounds(502, 364, 190, 23);
		frmLogin.getContentPane().add(btnCadastrarMotorista);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setBounds(455, 439, 65, 1);
		frmLogin.getContentPane().add(separator_3_1);

		JLabel lblAcessoRestrito = new JLabel("acesso restrito UberLand");
		lblAcessoRestrito.setHorizontalAlignment(SwingConstants.CENTER);
		lblAcessoRestrito.setBounds(525, 432, 145, 14);
		frmLogin.getContentPane().add(lblAcessoRestrito);
		
		JSeparator separator_3_2 = new JSeparator();
		separator_3_2.setBounds(678, 439, 65, 1);
		frmLogin.getContentPane().add(separator_3_2);

		JButton btnGerenciar = new JButton("Gerenciar");
		btnGerenciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ações Botão Cria Conta Usuário
				frmLogin.setVisible(false);
				Gerenciar.main(null);
			}
		});
		btnGerenciar.setBounds(545, 460, 105, 23);
		frmLogin.getContentPane().add(btnGerenciar);

		
	}
}
