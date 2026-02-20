import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalTime;

public class CadastrarCorrida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldOrigem;
	private JTextField txtFieldDestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCorrida frame = new CadastrarCorrida();
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
	public CadastrarCorrida() {
		setTitle("Cadastrar Corrida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setBounds(100, 100, 780, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setIcon(new ImageIcon(CadastraVeiculo.class.getResource("/UberLand_LogoF.png")));
		labelLogo.setForeground(Color.BLACK);
		labelLogo.setBackground(Color.BLACK);
		labelLogo.setBounds(230, 10, 303, 76);
		contentPane.add(labelLogo);
		
		JLabel lblTitulo = new JLabel("Peça um carro!");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(282, 118, 200, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblOrigem = new JLabel("Origem:");
		lblOrigem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOrigem.setBounds(230, 177, 59, 14);
		contentPane.add(lblOrigem);
		
		txtFieldOrigem = new JTextField();
		txtFieldOrigem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldOrigem.setColumns(10);
		txtFieldOrigem.setBounds(285, 177, 248, 20);
		contentPane.add(txtFieldOrigem);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDestino.setBounds(230, 210, 59, 14);
		contentPane.add(lblDestino);
		
		txtFieldDestino = new JTextField();
		txtFieldDestino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldDestino.setColumns(10);
		txtFieldDestino.setBounds(285, 210, 248, 20);
		contentPane.add(txtFieldDestino);
		
		JLabel lblEscolhaCarro = new JLabel("Escolha:");
		lblEscolhaCarro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEscolhaCarro.setBounds(230, 241, 59, 14);
		contentPane.add(lblEscolhaCarro);
		
		JComboBox comboBoxTipoCarro = new JComboBox();
		comboBoxTipoCarro.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxTipoCarro.setModel(new DefaultComboBoxModel(new String[] {"UberX", "UberConfort", "UberBlack"}));
		comboBoxTipoCarro.setBounds(282, 241, 105, 20);
		contentPane.add(comboBoxTipoCarro);
		
		JButton btnChamar = new JButton("Pedir");
		btnChamar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/* Ações do Botão Pedir (criar) Corrida
				 * Usuario s, String or, String dest, String d, String h
				Corrida c = new Corrida(UsuarioAtual, txtFieldOrigem.getText(), txtFieldDestino.getText(), LocalDate.now(), LocalTime.now());
            	Corridas.criar(c);???
            	*/
			}
		});
		btnChamar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnChamar.setBounds(337, 272, 89, 23);
		contentPane.add(btnChamar);
	}

}
