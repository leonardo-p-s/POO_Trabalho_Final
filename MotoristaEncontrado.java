import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class MotoristaEncontrado extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MotoristaEncontrado dialog = new MotoristaEncontrado();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MotoristaEncontrado() {
		setTitle("Motorista Encontrado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Motorista encontrado!");
			lblNewLabel.setBounds(127, 10, 180, 20);
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("Nome:");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(10, 48, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNomeSocialcomo = new JLabel("Nome Social");
			lblNomeSocialcomo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNomeSocialcomo.setBounds(10, 73, 90, 14);
			contentPanel.add(lblNomeSocialcomo);
		}
		{
			JLabel lblCpf = new JLabel("CPF:");
			lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCpf.setBounds(10, 98, 46, 14);
			contentPanel.add(lblCpf);
		}
		{
			JLabel lblCnh = new JLabel("CNH:");
			lblCnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCnh.setBounds(10, 123, 46, 14);
			contentPanel.add(lblCnh);
		}
		{
			JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
			lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblDataDeNascimento.setBounds(10, 148, 124, 14);
			contentPanel.add(lblDataDeNascimento);
		}
		{
			JLabel lblEndereo = new JLabel("Endereço:");
			lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEndereo.setBounds(10, 187, 64, 14);
			contentPanel.add(lblEndereo);
		}
		{
			JLabel lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblBairro.setBounds(10, 212, 46, 14);
			contentPanel.add(lblBairro);
		}
		{
			JLabel lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCidade.setBounds(10, 237, 46, 14);
			contentPanel.add(lblCidade);
		}
		{
			JLabel lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCep.setBounds(10, 288, 46, 14);
			contentPanel.add(lblCep);
		}
		{
			JLabel lblUf = new JLabel("UF:");
			lblUf.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblUf.setBounds(10, 262, 46, 14);
			contentPanel.add(lblUf);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton removerButton = new JButton("Remover Motorista");
				removerButton.setActionCommand("Remover Motorista");
				buttonPane.add(removerButton);
				getRootPane().setDefaultButton(removerButton);
			}
			{
				JButton cancelButton = new JButton("Fechar");
				cancelButton.setActionCommand("Fechar");
				buttonPane.add(cancelButton);
			}
		}
	}
}
