import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscaMotorista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldNome;
	private JTextField txtFieldNomeSoc;
	private JTextField txtFieldCPF;
	private JTextField txtFieldCNH;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscaMotorista frame = new BuscaMotorista();
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
	public BuscaMotorista() {
		setTitle("Buscar Motorista");
		setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/UberLand_Icon.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo = new JLabel("");
		labelLogo.setBounds(230, 10, 303, 76);
		labelLogo.setForeground(new Color(0, 0, 0));
		labelLogo.setBackground(new Color(0, 0, 0));
		labelLogo.setIcon(new ImageIcon(this.getClass().getResource("/UberLand_LogoF.png")));
		getContentPane().add(labelLogo);
		
		JLabel lblTitulo = new JLabel("<html>Busca Motorista.<br/>Entre com um dos campos e clique Buscar!</html>");
		lblTitulo.setBounds(180, 107, 404, 60);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblTitulo);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNome.setBounds(210, 190, 46, 14);
		contentPane.add(lblNome);
		
		txtFieldNome = new JTextField();
		txtFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldNome.setColumns(10);
		txtFieldNome.setBounds(265, 190, 268, 20);
		contentPane.add(txtFieldNome);
		
		JLabel lblNomeSocial = new JLabel("Nome Social:");
		lblNomeSocial.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNomeSocial.setBounds(210, 230, 90, 14);
		contentPane.add(lblNomeSocial);
		
		txtFieldNomeSoc = new JTextField();
		txtFieldNomeSoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldNomeSoc.setColumns(10);
		txtFieldNomeSoc.setBounds(292, 227, 138, 20);
		contentPane.add(txtFieldNomeSoc);
		
		JLabel lblCPF = new JLabel("CPF:");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCPF.setBounds(210, 280, 46, 14);
		contentPane.add(lblCPF);
		
		txtFieldCPF = new JTextField();
		txtFieldCPF.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCPF.setColumns(10);
		txtFieldCPF.setBounds(265, 280, 133, 20);
		contentPane.add(txtFieldCPF);
		
		JLabel lblCNH = new JLabel("CNH:");
		lblCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCNH.setBounds(210, 320, 46, 14);
		contentPane.add(lblCNH);
		
		txtFieldCNH = new JTextField();
		txtFieldCNH.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldCNH.setColumns(10);
		txtFieldCNH.setBounds(265, 320, 133, 20);
		contentPane.add(txtFieldCNH);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Ações do botão Buscar Motorista
				// Verifica qual campo foi preenchido e realiza busca específica
				 
				String n = txtFieldNome.getText();
				String ns = txtFieldNomeSoc.getText();
				String cpf = txtFieldCPF.getText();
				String cnh = txtFieldCNH.getText();
				if(n.isBlank() && ns.isBlank() && cpf.isBlank() && cnh.isBlank())
					JOptionPane.showMessageDialog(null,  "Favor preencher um dos campos!", "Dados incompletos", JOptionPane.WARNING_MESSAGE);
				else {
				Motorista m = null;
					if (!n.isBlank())
						m = DadosMotorista.buscaMotoristaPorNome(n);
					else if(!ns.isBlank())
						m = DadosMotorista.buscaMotoristaPorNomeSoc(ns);
					else if(!cpf.isBlank())
						m = DadosMotorista.buscaMotoristaPorCPF(cpf);
					else if(!cnh.isBlank())
						m = DadosMotorista.buscarMotoristaPorCNH(cnh);
					if(m != null) {
						//setVisible(false); 
						MotoristaEncontrado.main(null, m);
					} else {
						//setVisible(false); 
						MotoristaNaoEncontrado.main(null);
					}
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscar.setBounds(337, 366, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscaMotorista.this.setVisible(false); 
				Gerenciar.main(null);
			}
		});
		btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVoltar.setBounds(444, 367, 89, 23);
		contentPane.add(btnVoltar);

	}
}
