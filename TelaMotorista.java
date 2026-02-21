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
		frmTelaMotorista.setLayout(null);
		
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
		
		JButton btnVerCorridaAtual = new JButton("Corrida em Andamento");
		btnVerCorridaAtual.setEnabled(true);
		btnVerCorridaAtual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				TelaStatusCorridaMotorista.main(null);
			}
		});
		btnVerCorridaAtual.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerCorridaAtual.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerCorridaAtual.setBounds(175, 180, 180, 23);
		frmTelaMotorista.add(btnVerCorridaAtual);
		
		JButton btnVerCorridas = new JButton("Tem Corrida Disponível?");
		btnVerCorridas.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerCorridas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Verifica se existe corrida com status "solicitada"
				// Caso tenha corrida disponível
					String[] options = {"Aceitar Corrida", "Fechar"}; 
					int escolha = JOptionPane.showOptionDialog( 
							null, 
							"Origem: \nDestino: \nValor: R$ \n ", 
							"Corrida Disponível!", 
							JOptionPane.DEFAULT_OPTION, 
							JOptionPane.WARNING_MESSAGE, 
							null, 
							options, 
							options[0]
							);// botão padrão selecionado );
					if (escolha == 0) {
						// Motorista aceitou a corrida
					} 
				// Caso Não tenha Corrida Disponível
					JOptionPane.showMessageDialog(null, "Nenhuma corrida disponível nesse momento.\nTente mais tarde!", "Nenhuma Corrida Disponível", JOptionPane.INFORMATION_MESSAGE);
				
				//setVisible(false); 
				//....main(null);
			}
		});
		btnVerCorridas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerCorridas.setBounds(175, 216, 180, 23);
		getContentPane().add(btnVerCorridas);
		
		JButton btnCadastrarVeic = new JButton("Cadastrar Veículo");
		btnCadastrarVeic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false); 
				CadastraVeiculo.main(null);
			}
		});
		btnCadastrarVeic.setHorizontalAlignment(SwingConstants.LEFT);
		btnCadastrarVeic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarVeic.setBounds(175, 278, 180, 23);
		frmTelaMotorista.add(btnCadastrarVeic);
		
		JButton btnVerVeículos = new JButton("Meus Veículos");
		btnVerVeículos.setEnabled(false);
		btnVerVeículos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerVeículos.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerVeículos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerVeículos.setBounds(175, 314, 180, 23);
		frmTelaMotorista.add(btnVerVeículos);
		
		JButton btnVerViagens = new JButton("Minhas Viagens");
		btnVerViagens.setEnabled(false);
		btnVerViagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerViagens.setHorizontalAlignment(SwingConstants.LEFT);
		btnVerViagens.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVerViagens.setBounds(175, 350, 180, 23);
		frmTelaMotorista.add(btnVerViagens);
		
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
