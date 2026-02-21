import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaStatusCorridaUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frmTelaStatusCorrUsuario;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaStatusCorridaUsuario frame = new TelaStatusCorridaUsuario();
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
	public TelaStatusCorridaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		getContentPane().setLayout(null);
		
		frmTelaStatusCorrUsuario = new JPanel();
		frmTelaStatusCorrUsuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmTelaStatusCorrUsuario);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmTelaStatusCorrUsuario.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		labelLogo.setBounds(230, 11, 303, 76);
		getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("Sua corrida em andamento!");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(257, 118, 250, 29);
		getContentPane().add(lblTitulo);
		
		JButton btnCancelarCorrida = new JButton("Cancelar Corrida");
		btnCancelarCorrida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showConfirmDialog(null,  "Deseja realmente Cancelar a Corrida?", "Confirmar", JOptionPane.YES_NO_OPTION);
				if(resp == JOptionPane.YES_OPTION) {
					// Cancelar corrida
					JOptionPane.showMessageDialog(null, "Solicitação de cancelamento de corrida enviada!", "Corrida Cancelada", JOptionPane.INFORMATION_MESSAGE);
				}
					
			}
		});
		btnCancelarCorrida.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelarCorrida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelarCorrida.setBounds(175, 375, 150, 23);
		frmTelaStatusCorrUsuario.add(btnCancelarCorrida);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaUsuario.main(null);
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFechar.setBounds(175, 409, 100, 23);
		getContentPane().add(btnFechar);
		
		JLabel lblNewLabel = new JLabel("<html>Origem: <br>Destino: <br>Motorista: <br>Veículo: <br>Valor Total: <br>Status:  </html>");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(175, 169, 373, 179);
		frmTelaStatusCorrUsuario.add(lblNewLabel);
	}

}
