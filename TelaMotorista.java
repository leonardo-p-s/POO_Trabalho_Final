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

public class TelaMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel frmTelaMotorista;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMotorista frame = new TelaMotorista();
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
	public TelaMotorista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		getContentPane().setLayout(null);
		
		frmTelaMotorista = new JPanel();
		frmTelaMotorista.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frmTelaMotorista);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		
		Motorista m = (Motorista) Sessao.getInstancia().getUser();
		frmTelaMotorista.setLayout(null);
		
		JLabel lblMotorista = new JLabel("<html><b>Olá, " + m.getNomeSocial() +"!<br></b>(Motorista)");
		lblMotorista.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMotorista.setBounds(10, 11, 100, 41);
		frmTelaMotorista.add(lblMotorista);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(230, 11, 303, 76);
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("Bem vindo ao UberLand!");
		lblTitulo.setBounds(282, 118, 200, 29);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		getContentPane().add(lblTitulo);
		
		JButton btnVerCorridaAtual = new JButton("Corrida em Andamento");
		btnVerCorridaAtual.setBounds(175, 180, 180, 23);
		btnVerCorridaAtual.setEnabled(true);
		btnVerCorridaAtual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaStatusCorridaMotorista.main(null);
			}
		});
		btnVerCorridaAtual.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerCorridaAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		if(DadosCorrida.corridaEmAndamentoMotorista() == null)
			btnVerCorridaAtual.setEnabled(false);
		frmTelaMotorista.add(btnVerCorridaAtual);
		
		JButton btnVerCorridas = new JButton("Tem Corrida Disponível?");
		btnVerCorridas.setBounds(175, 216, 180, 23);
		btnVerCorridas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerCorridas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corrida c = DadosCorrida.corridaDiponivel();
				if(c != null) {
				// Verifica se existe corrida com status "solicitada"
				// Caso tenha corrida disponível
					String[] options = {"Aceitar Corrida", "Fechar"}; 
					int escolha = JOptionPane.showOptionDialog( 
							null, 
							"Origem: "+ c.getOrigem()+
							"\nDestino: "+ c.getDestino()+
							"\nValor: R$"+c.getValorTotalViagem()+
							"\n ", 
							"Corrida Disponível!", 
							JOptionPane.DEFAULT_OPTION, 
							JOptionPane.WARNING_MESSAGE, 
							null, 
							options, 
							options[0]);// botão padrão selecionado );
					if (escolha == 0) {
						// Motorista aceitou a corrida
						Veiculo v = m.getVeiculos().getFirst();
						c.AceitarCorrida(v);
						c.setMotorista(m);
						setVisible(false); 
						TelaStatusCorridaMotorista.main(null);
					}
				}else
				// Caso Não tenha Corrida Disponível
					JOptionPane.showMessageDialog(null, "Nenhuma corrida disponível nesse momento.\nTente mais tarde!", "Nenhuma Corrida Disponível", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnVerCorridas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		if(m.getVeiculos().isEmpty())
			btnVerCorridas.setEnabled(false);
		getContentPane().add(btnVerCorridas);
		
		JButton btnCadastrarVeic = new JButton("Cadastrar Veículo");
		btnCadastrarVeic.setBounds(175, 278, 180, 23);
		btnCadastrarVeic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				CadastraVeiculo.main(null);
			}
		});
		btnCadastrarVeic.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastrarVeic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmTelaMotorista.add(btnCadastrarVeic);
		
		JButton btnVerVeículos = new JButton("Meus Veículos");
		btnVerVeículos.setBounds(175, 313, 180, 23);
		btnVerVeículos.setEnabled(false);
		btnVerVeículos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerVeículos.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerVeículos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmTelaMotorista.add(btnVerVeículos);
		
		JButton btnVerViagens = new JButton("Minhas Viagens");
		btnVerViagens.setBounds(175, 348, 180, 23);
		btnVerViagens.setEnabled(false);
		btnVerViagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerViagens.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerViagens.setFont(new Font("Tahoma", Font.PLAIN, 13));
		frmTelaMotorista.add(btnVerViagens);
		
		JButton btnVerMeusDados = new JButton("Meus Dados");
		btnVerMeusDados.setBounds(175, 383, 180, 23);
		btnVerMeusDados.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerMeusDados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerMeusDados.setEnabled(false);
		frmTelaMotorista.add(btnVerMeusDados);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(175, 438, 100, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				DadosMotorista.fazerLogoutMotorista();
				DadosUsuario.salvarArquivoUsuarios();
				DadosCorrida.salvarArquivoCorridas();
				DadosMotorista.salvarArquivoMotoristas();
				DadosVeiculos.salvarArquivoVeiculos();
				TelaInicio.main(null);
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 13));
		getContentPane().add(btnSair);
		
	}
}
