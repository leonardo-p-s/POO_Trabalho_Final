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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MotoristaEncontrado extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Motorista m) {
		try {
			MotoristaEncontrado dialog = new MotoristaEncontrado(m);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MotoristaEncontrado(Motorista m) {
		setTitle("Motorista Encontrado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setBounds(100, 100, 450, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		String nome = m.getNome();
		String ns = m.getNomeSocial();
		String cpf = m.getCPF();
		String cnh = m.getCNH();
		String dn = m.getDataNasc();
		String end = m.getEndereco();
		{
			JLabel lblNewLabel = new JLabel("<html><b>Motorista encontrado!</b>");
			lblNewLabel.setBounds(127, 10, 180, 20);
			lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel = new JLabel("<html><b>Nome:</b> " + nome);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNewLabel.setBounds(10, 48, 400, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNomeSocialcomo = new JLabel("<html><b>Nome Social:</b> " + ns);
			lblNomeSocialcomo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblNomeSocialcomo.setBounds(10, 73, 400, 14);
			contentPanel.add(lblNomeSocialcomo);
		}
		{
			JLabel lblCpf = new JLabel("<html><b>CPF:</b> " + cpf);
			lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCpf.setBounds(10, 98, 400, 14);
			contentPanel.add(lblCpf);
		}
		{
			JLabel lblCnh = new JLabel("<html><b>CNH:</b> " + cnh);
			lblCnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCnh.setBounds(10, 123, 400, 14);
			contentPanel.add(lblCnh);
		}
		{
			JLabel lblDataDeNascimento = new JLabel("<html><b>Data de Nascimento:</b> " + dn);
			lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblDataDeNascimento.setBounds(10, 148, 400, 14);
			contentPanel.add(lblDataDeNascimento);
		}
		{
			JLabel lblEndereo = new JLabel("<html><b>Endereço:</b> " + end);
			lblEndereo.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblEndereo.setBounds(10, 187, 400, 14);
			contentPanel.add(lblEndereo);
		}
		{
			JLabel lblBairro = new JLabel("Bairro:");
			lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblBairro.setBounds(10, 212, 400, 14);
			contentPanel.add(lblBairro);
		}
		{
			JLabel lblCidade = new JLabel("Cidade:");
			lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCidade.setBounds(10, 237, 400, 14);
			contentPanel.add(lblCidade);
		}
		{
			JLabel lblCep = new JLabel("CEP:");
			lblCep.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblCep.setBounds(10, 288, 400, 14);
			contentPanel.add(lblCep);
		}
		{
			JLabel lblUf = new JLabel("UF:");
			lblUf.setFont(new Font("Tahoma", Font.PLAIN, 13));
			lblUf.setBounds(10, 262, 400, 14);
			contentPanel.add(lblUf);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton removerButton = new JButton("Remover Motorista");
				removerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						ConfirmarRemocaoMot.main(null);
					}
				});
				removerButton.setActionCommand("Remover Motorista");
				buttonPane.add(removerButton);
				getRootPane().setDefaultButton(removerButton);
			}
			{
				JButton cancelButton = new JButton("Fechar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false); 
					}
				});
				cancelButton.setActionCommand("Fechar");
				buttonPane.add(cancelButton);
			}
		}
	}
}
