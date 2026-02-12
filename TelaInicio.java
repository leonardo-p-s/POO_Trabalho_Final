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

public class TelaInicio {

	private JFrame frmCadastro;
	private JTextField txtSeuemailemailcombr;
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
		
		JLabel lblNewLabel = new JLabel("Usuário:");
		lblNewLabel.setBounds(489, 104, 46, 14);
		frmCadastro.getContentPane().add(lblNewLabel);
		
		txtSeuemailemailcombr = new JTextField();
		txtSeuemailemailcombr.setToolTipText("email");
		txtSeuemailemailcombr.setBounds(537, 101, 151, 20);
		frmCadastro.getContentPane().add(txtSeuemailemailcombr);
		txtSeuemailemailcombr.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setBounds(489, 132, 46, 14);
		frmCadastro.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(562, 160, 89, 23);
		frmCadastro.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_Pic1.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 11, 423, 674);
		frmCadastro.getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(537, 129, 151, 20);
		frmCadastro.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Olá! Faça seu login!");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(509, 39, 200, 29);
		frmCadastro.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Criar Conta");
		btnNewButton_1.setBounds(562, 264, 89, 23);
		frmCadastro.getContentPane().add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(470, 240, 85, 1);
		frmCadastro.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(665, 240, 85, 1);
		frmCadastro.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_4 = new JLabel("ou cadastrar usuário");
		lblNewLabel_4.setBounds(561, 233, 99, 14);
		frmCadastro.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1_1 = new JButton("Cadastrar como motorista");
		btnNewButton_1_1.setBounds(534, 354, 157, 23);
		frmCadastro.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(470, 328, 75, 1);
		frmCadastro.getContentPane().add(separator_2);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(675, 328, 75, 1);
		frmCadastro.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("ou trabalhe com a gente");
		lblNewLabel_4_1.setBounds(550, 321, 117, 14);
		frmCadastro.getContentPane().add(lblNewLabel_4_1);
	}
}
