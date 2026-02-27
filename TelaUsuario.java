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

public class TelaUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frmTelaUsuario;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuario frame = new TelaUsuario();
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
	public TelaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		getContentPane().setLayout(null);
		
		frmTelaUsuario = new JPanel();
		frmTelaUsuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmTelaUsuario);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		frmTelaUsuario.setLayout(null);
		
		Usuario u = (Usuario) Sessao.getInstancia().getUser();
		
		JLabel lblUsuario = new JLabel(u.getLogin());
		lblUsuario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsuario.setBounds(654, 11, 100, 41);
		frmTelaUsuario.add(lblUsuario);
		
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
		
		JButton btnPedirCarro = new JButton("Pedir um carro");
		btnPedirCarro.setHorizontalAlignment(SwingConstants.LEFT);
		btnPedirCarro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ações do Botão Pedir um carro
				setVisible(false); 
				CadastrarCorrida.main(null);
			}
		});
		btnPedirCarro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnPedirCarro.setBounds(176, 205, 180, 23);
		getContentPane().add(btnPedirCarro);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaInicio.main(null);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnSair.setBounds(176, 372, 100, 23);
		getContentPane().add(btnSair);
		
		JButton btnVerViagens = new JButton("Minhas viagens");
		btnVerViagens.setEnabled(false);
		btnVerViagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Acoes botao Ver minhas viagens???
			}
		});
		btnVerViagens.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerViagens.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerViagens.setBounds(176, 272, 180, 23);
		frmTelaUsuario.add(btnVerViagens);
		
		JButton btnVerMeusDados = new JButton("Meus Dados");
		btnVerMeusDados.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerMeusDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerMeusDados.setEnabled(false);
		btnVerMeusDados.setBounds(176, 311, 180, 23);
		frmTelaUsuario.add(btnVerMeusDados);
		
		
		
		JButton btnCorridaAtual = new JButton("Corrida em Andamento");
		btnCorridaAtual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaStatusCorridaUsuario.main(null);
			}
		});
		btnCorridaAtual.setHorizontalAlignment(SwingConstants.LEFT);
		btnCorridaAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		if(DadosCorrida.dadosCorridaEmAndamentoUsuario().isBlank())
			btnCorridaAtual.setEnabled(false);
		btnCorridaAtual.setBounds(176, 165, 180, 23);
		frmTelaUsuario.add(btnCorridaAtual);		
	}

}
