import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.SwingConstants;

public class ConfirmarRemocaoMot extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConfirmarRemocaoMot dialog = new ConfirmarRemocaoMot();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConfirmarRemocaoMot() {
		setTitle("Remover Motorista");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setBounds(100, 100, 450, 250);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTitulo = new JLabel("Confirmar Remoção do Motorista!");
			lblTitulo.setBounds(80, 10, 274, 20);
			lblTitulo.setVerticalAlignment(SwingConstants.BOTTOM);
			lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPanel.add(lblTitulo);
		}
		{
			JLabel lblMessagem1 = new JLabel("O motorista será removido permanentemente.");
			lblMessagem1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblMessagem1.setBounds(36, 75, 318, 20);
			contentPanel.add(lblMessagem1);
		}
		{
			JLabel lblMenssagem2 = new JLabel("Deseja confirmar?");
			lblMenssagem2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblMenssagem2.setBounds(36, 102, 205, 20);
			contentPanel.add(lblMenssagem2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButtonConfirmar = new JButton("Confirmar");
				okButtonConfirmar.setActionCommand("Confirmar");
				buttonPane.add(okButtonConfirmar);
				getRootPane().setDefaultButton(okButtonConfirmar);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
