import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Gerenciar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frmTelaGerenciar;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerenciar frame = new Gerenciar();
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
	public Gerenciar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		getContentPane().setLayout(null);
		
		frmTelaGerenciar = new JPanel();
		frmTelaGerenciar.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmTelaGerenciar);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmTelaGerenciar.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		labelLogo.setBounds(230, 11, 303, 76);
		getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("Bem vindo ao UberLand!");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(282, 118, 200, 29);
		getContentPane().add(lblTitulo);
		
		JButton btnBuscarMotoris = new JButton("Buscar Motorista");
		btnBuscarMotoris.setHorizontalAlignment(SwingConstants.LEFT);
		btnBuscarMotoris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				BuscaMotorista.main(null);
			}
		});
		btnBuscarMotoris.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarMotoris.setBounds(175, 182, 180, 23);
		getContentPane().add(btnBuscarMotoris);
		
		JButton btnBota1 = new JButton("...");
		btnBota1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				CadastraVeiculo.main(null);
			}
		});
		btnBota1.setHorizontalAlignment(SwingConstants.LEFT);
		btnBota1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBota1.setBounds(175, 227, 180, 23);
		frmTelaGerenciar.add(btnBota1);
		
		JButton btnBotao2 = new JButton("...");
		btnBotao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotao2.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotao2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBotao2.setBounds(175, 272, 180, 23);
		frmTelaGerenciar.add(btnBotao2);
		
		JButton btnBotao3 = new JButton("...");
		btnBotao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBotao3.setHorizontalAlignment(SwingConstants.LEFT);
		btnBotao3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBotao3.setBounds(175, 317, 180, 23);
		frmTelaGerenciar.add(btnBotao3);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaInicio.main(null);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSair.setBounds(175, 409, 100, 23);
		getContentPane().add(btnSair);
		

	}

}
