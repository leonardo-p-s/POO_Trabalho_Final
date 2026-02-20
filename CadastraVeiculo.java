import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import com.toedter.calendar.JYearChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.JCheckBox;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastraVeiculo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldMarca;
	private JTextField txtFieldModelo;
	private JTextField txtFieldPlaca;
	private JTextField txtFieldVIN;
	private JTextField txtFiledCor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastraVeiculo frame = new CadastraVeiculo();
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
	public CadastraVeiculo() {
		setTitle("Cadastro de Veículo");
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
		
		JLabel lblTitulo = new JLabel("Cadastre seu veículo!");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(282, 118, 200, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMarca.setBounds(210, 181, 46, 14);
		contentPane.add(lblMarca);
		
		txtFieldMarca = new JTextField();
		txtFieldMarca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldMarca.setColumns(10);
		txtFieldMarca.setBounds(265, 181, 134, 20);
		contentPane.add(txtFieldMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblModelo.setBounds(409, 181, 46, 14);
		contentPane.add(lblModelo);
		
		txtFieldModelo = new JTextField();
		txtFieldModelo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldModelo.setColumns(10);
		txtFieldModelo.setBounds(464, 181, 116, 20);
		contentPane.add(txtFieldModelo);

		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAno.setBounds(210, 212, 39, 14);
		contentPane.add(lblAno);
		
		JYearChooser yearChooser = new JYearChooser();
		yearChooser.setBounds(240, 212, 50, 20);
		contentPane.add(yearChooser);
		
		JLabel lblPlaca = new JLabel("Placa:");
		lblPlaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPlaca.setBounds(327, 212, 46, 14);
		contentPane.add(lblPlaca);
		
		txtFieldPlaca = new JTextField();
		txtFieldPlaca.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldPlaca.setColumns(10);
		txtFieldPlaca.setBounds(366, 212, 77, 20);
		contentPane.add(txtFieldPlaca);
		
		JLabel lblVinnroChassi = new JLabel("VIN (nro. chassi):");
		lblVinnroChassi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVinnroChassi.setBounds(210, 243, 105, 14);
		contentPane.add(lblVinnroChassi);
		
		txtFieldVIN = new JTextField();
		txtFieldVIN.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFieldVIN.setColumns(10);
		txtFieldVIN.setBounds(321, 243, 174, 20);
		contentPane.add(txtFieldVIN);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCor.setBounds(464, 212, 46, 14);
		contentPane.add(lblCor);
		
		txtFiledCor = new JTextField();
		txtFiledCor.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtFiledCor.setColumns(10);
		txtFiledCor.setBounds(503, 212, 77, 20);
		contentPane.add(txtFiledCor);
		
		JLabel lblCapacidadeDePassageiros = new JLabel("Capacidade de Passageiros:");
		lblCapacidadeDePassageiros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCapacidadeDePassageiros.setBounds(210, 276, 163, 14);
		contentPane.add(lblCapacidadeDePassageiros);
		
		JComboBox comboBoxCapacPass = new JComboBox();
		comboBoxCapacPass.setModel(new DefaultComboBoxModel(new String[] {"", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBoxCapacPass.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxCapacPass.setBounds(383, 274, 46, 20);
		contentPane.add(comboBoxCapacPass);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Itens de Conforto (selecione todos que se aplicam):", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(189, 322, 386, 151);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxConfBasico = new JCheckBox("Conforto Básico");
		chckbxConfBasico.setBounds(19, 21, 115, 25);
		chckbxConfBasico.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxConfBasico);
		
		JCheckBox chckbxArCondic = new JCheckBox("Ar Condicionado");
		chckbxArCondic.setBounds(139, 21, 119, 25);
		chckbxArCondic.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxArCondic);
		
		JCheckBox chckbxACDualZone = new JCheckBox("AC Dual Zone");
		chckbxACDualZone.setBounds(263, 21, 103, 25);
		chckbxACDualZone.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxACDualZone);
		
		JCheckBox chckbxEspacoExtra = new JCheckBox("Espaço Extra");
		chckbxEspacoExtra.setBounds(16, 51, 99, 25);
		chckbxEspacoExtra.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxEspacoExtra);
		
		JCheckBox chckbxBancoReclinavel = new JCheckBox("Banco Reclinável");
		chckbxBancoReclinavel.setBounds(120, 51, 121, 25);
		chckbxBancoReclinavel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxBancoReclinavel);
		
		JCheckBox chckbxInteriorPrem = new JCheckBox("Interior Premium");
		chckbxInteriorPrem.setBounds(246, 51, 123, 25);
		chckbxInteriorPrem.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxInteriorPrem);
		
		JCheckBox chckbxRodasLigLev = new JCheckBox("Rodas de Liga Leve");
		chckbxRodasLigLev.setBounds(125, 81, 135, 25);
		chckbxRodasLigLev.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(chckbxRodasLigLev);
		
		JLabel lblCapcidadeMalas = new JLabel("Capacidade de Malas:");
		lblCapcidadeMalas.setBounds(19, 116, 126, 16);
		lblCapcidadeMalas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblCapcidadeMalas);
		
		JComboBox comboBoxCapacMalas = new JComboBox();
		comboBoxCapacMalas.setBounds(150, 113, 35, 22);
		comboBoxCapacMalas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxCapacMalas.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8"}));
		panel.add(comboBoxCapacMalas);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Ações do botão Cadastrar Veículo
				Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap
				VeicUberX(Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap, boolean ac, boolean cb)
				VeicUberConfort(Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap, boolean ee, boolean br, boolean acdz)
				VeicUberBlack(Motorista cond, String mar, String mod, int a, String p, String vn, String c, int cap, boolean ip, boolean rll, int cm)
				
				txtFieldMarca.getText(),
				txtFieldModelo.getText(),
				JYearChooser.getYear();
				txtFieldPlaca.getText(),
				txtFieldVIN.getText(),
				txtFiledCor.getText(),
				(int) comboBoxCapacPass.getSelectedItem(),
				
				chckbxConfBasico.isSelected()
				chckbxArCondic.isSelected()
				chckbxACDualZone.isSelected()
				chckbxEspacoExtra.isSelected()
				chckbxBancoReclinavel.isSelected()
				chckbxInteriorPrem.isSelected()
				chckbxRodasLigLev.isSelected()
				(int) comboBoxCapacMalas.getSelectedItem()
				*/
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(337, 506, 89, 23);
		contentPane.add(btnNewButton);

	}
}
