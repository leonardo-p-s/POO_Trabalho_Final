import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaStatusCorridaMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frmTelaStatusCorrMotorista;
	private JButton btnFechar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaStatusCorridaMotorista frame = new TelaStatusCorridaMotorista();
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
	public TelaStatusCorridaMotorista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		getContentPane().setLayout(null);
		
		frmTelaStatusCorrMotorista = new JPanel();
		frmTelaStatusCorrMotorista.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmTelaStatusCorrMotorista);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmTelaStatusCorrMotorista.setLayout(null);
		
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
		
		String dadosCorrida = "<html>Origem: <br>Destino: <br>Nome Passageiro: <br>Veículo: <br>Valor Total: <br>Status:  </html>";
		String c = DadosCorrida.dadosCorridaEmAndamentoMotorista();
		if (!c.isBlank())
			dadosCorrida = c;
		
		JLabel lblDetalhesCorrida = new JLabel(dadosCorrida);
		lblDetalhesCorrida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDetalhesCorrida.setBounds(175, 169, 373, 179);
		frmTelaStatusCorrMotorista.add(lblDetalhesCorrida);
		
		JButton btnFinalizarCorrida = new JButton("Finalizar Corrida");
		btnFinalizarCorrida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corrida c = DadosCorrida.corridaEmAndamentoMotorista();
				c.ConcluirCorrida("Loca Atual GPS", LocalTime.now().toString());
				JOptionPane.showMessageDialog(null, "Corrida Finalizada!", "Corrida Finalizada", JOptionPane.INFORMATION_MESSAGE);
				setVisible(false); 
				TelaMotorista.main(null);
			}
		});
		btnFinalizarCorrida.setHorizontalAlignment(SwingConstants.LEFT);
		btnFinalizarCorrida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFinalizarCorrida.setBounds(175, 375, 150, 23);
		frmTelaStatusCorrMotorista.add(btnFinalizarCorrida);

		
		JButton btnCancelarCorrida = new JButton("Cancelar Corrida");
		btnCancelarCorrida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showConfirmDialog(null,  "Deseja realmente Cancelar a Corrida?", "Confirmar", JOptionPane.YES_NO_OPTION);
				if(resp == JOptionPane.YES_OPTION) {
					// Cancelar corrida
					Corrida c = DadosCorrida.corridaEmAndamentoMotorista();
					c.CancelarCorrida("Motorista", "Local Atual GPS", LocalTime.now().toString());
					JOptionPane.showMessageDialog(null, "Solicitação de cancelamento de corrida enviada!", "Corrida Cancelada", JOptionPane.INFORMATION_MESSAGE);
					setVisible(false); 
					TelaMotorista.main(null);
				}
			}
		});
		btnCancelarCorrida.setHorizontalAlignment(SwingConstants.LEFT);
		btnCancelarCorrida.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelarCorrida.setBounds(357, 376, 150, 23);
		frmTelaStatusCorrMotorista.add(btnCancelarCorrida);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaMotorista.main(null);
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnFechar.setBounds(175, 409, 100, 23);
		getContentPane().add(btnFechar);
	}

}
