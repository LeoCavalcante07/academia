package br.senai.sp.jandira.tela;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.senai.sp.jandira.cliente.Cliente;
import java.awt.Font;
import javax.swing.JTextArea;

public class FrmTelaCont extends JFrame{

	DecimalFormat dfSemCasa = new DecimalFormat("0");
	DecimalFormat dfDuasCasas = new DecimalFormat("0.##");
	
	public FrmTelaCont(){
		setSize(500, 500);
		setTitle("Boa Forma");
		getContentPane().setLayout(null);		
		getContentPane().setBackground(new Color(249, 247, 194));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//painel superior
		JPanel panelHead = new JPanel();
		//(x, y, w, h)
		panelHead.setBounds(0,0, 485, 100);
		panelHead.setVisible(true);
		panelHead.setBackground(new Color(195, 199, 204));
		
		
		getContentPane().add(panelHead);
		panelHead.setLayout(null);
		
		JLabel lblBoaForma = new JLabel("Boa forma");
		lblBoaForma.setIcon(new ImageIcon(FrmTelaCont.class.getResource("/br/senai/sp/jandira/icons/academia.png")));
		lblBoaForma.setFont(new Font("Yu Mincho Demibold", Font.BOLD, 17));
		lblBoaForma.setBounds(32, 11, 186, 62);
		panelHead.add(lblBoaForma);
		
		//painel de dados
		JPanel panelDados = new JPanel();
		panelDados.setBounds(10, 130, 225, 300);
		panelDados.setBackground(new Color(249, 247, 194));
		panelDados.setBorder(BorderFactory.createTitledBorder("Dados"));
		panelDados.setLayout(null);
		
		//criação de label, text Field, radio, etc
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 30, 60,20);
		
		
		JTextField txtNome = new JTextField(); 	
		txtNome.setBounds(50, 30, 60, 20);
			
		JLabel lblSexo = new JLabel("Sexo: ");
		lblSexo.setBounds(10, 60, 60,20);
		
		
		JRadioButton radioMan = new JRadioButton("Homem");
		radioMan.setBounds(50,60,70,20);
		
		JRadioButton radioWman = new JRadioButton("Mulher");
		radioWman.setBounds(120,60,70,20);
		
		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(radioMan);
		grupoSexo.add(radioWman);
		
		
		JLabel lblPeso = new JLabel("Peso: ");
		lblPeso.setBounds(10, 90, 60, 20);
		
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(50, 90, 60, 20);
		
		JLabel lblQuilos = new JLabel("quilos");
		lblQuilos.setBounds(110, 90, 60, 20);
		
		
		JLabel lblAltura = new JLabel("Altura: ");
		lblAltura.setBounds(10, 120, 60, 20);
		
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(60, 120, 60, 20);
		
		JLabel lblCm = new JLabel("cm");
		lblCm.setBounds(120, 120, 40, 20);
		
		
/////////////////
		
		
		
		
		JLabel lblNivel = new JLabel("Nível de atividade:");
		lblNivel.setBounds(10, 190, 110,20);
		
		JComboBox <String> cbNivel = new JComboBox<>();
		
		String[] nivel = new String[5];
		nivel[0] = "Sedentário";
		nivel[1] = "Levemente ativo";
		nivel[2] = "Moderadamente ativo";
		nivel[3] = "Bastante ativo";
		nivel[4] = "Muito ativo";
		
		DefaultComboBoxModel <String> modelComboNivel = new DefaultComboBoxModel<>(nivel);		
		cbNivel.setModel(modelComboNivel);		
		cbNivel.setBounds(10, 220, 200, 20);
		
			
					
		
		//ImageIcon imgCalc = new ImageIcon(getClass().getResource("calc.png")) ;
		
		
		//adcionando à tela
		panelDados.add(lblNome);
		panelDados.add(txtNome);
		panelDados.add(lblSexo);
		panelDados.add(radioMan);
		panelDados.add(radioWman);
		panelDados.add(lblPeso);
		panelDados.add(txtPeso);
		panelDados.add(lblQuilos);
		panelDados.add(lblAltura);
		panelDados.add(txtAltura);
		panelDados.add(lblCm);
		panelDados.add(lblNivel);
		panelDados.add(cbNivel);
		
		
			
				
		
					 
		
		
		getContentPane().add(panelDados);
		
		
		
		
		//Painel de resultado
		JPanel panelResult = new JPanel();
		panelResult.setBounds(250, 130, 225,300);
		panelResult.setBackground(new Color(249, 247, 194));
		panelResult.setBorder(BorderFactory.createTitledBorder("Resultado"));
		
		JLabel lblNome2 = new JLabel("Nome: ");
		lblNome2.setBounds(10, 20, 100, 20);
		
		JLabel lblNomeR = new JLabel();
		lblNomeR.setBounds(60, 20, 100, 20);
		
		
		JLabel lblIdade2 = new JLabel("Idade: ");
		lblIdade2.setBounds(10, 50, 100, 20);
		
		JLabel lblIdadeR = new JLabel();
		lblIdadeR.setBounds(60, 50, 100, 20);
		
		
		JLabel lblAltura2 = new JLabel("Altura: ");
		lblAltura2.setBounds(10, 80, 100, 20);
		
		JLabel lblAlturaR = new JLabel();
		lblAlturaR.setBounds(60, 80, 100, 20);
		
		
		JLabel lblPeso2 = new JLabel("Peso: ");
		lblPeso2.setBounds(10, 110, 100, 20);
		
		JLabel lblPesoR = new JLabel();
		lblPesoR.setBounds(60, 110, 100, 20);
		
		
		JLabel lblNivel2 = new JLabel("Nivel de atividade: ");
		lblNivel2.setBounds(10, 140, 110, 20);
		
		JLabel lblNivelR = new JLabel();
		lblNivelR.setBounds(130, 140, 100, 20);
		
		
		JLabel lblImcR = new JLabel("IMC: ");
		lblImcR.setBounds(10, 160, 40, 20);
		
		
		JLabel lblTmb2 = new JLabel("TMB: ");
		lblTmb2.setBounds(10, 239, 50, 20);
		
		JLabel lblTmbR= new JLabel();
		lblTmbR.setBounds(60, 239, 100, 20);
		panelResult.setLayout(null);
		
		JTextArea txtImcR2 = new JTextArea();
		txtImcR2.setBounds(10, 191, 134, 48);
		panelResult.add(txtImcR2);
		
		JLabel lblImcR2 = new JLabel();
		lblImcR2.setBounds(60, 163, 72, 14);
		panelResult.add(lblImcR2);
		
		JLabel lblFmc2 = new JLabel("FMC:");
		lblFmc2.setBounds(10, 270, 40, 14);
		panelResult.add(lblFmc2);
		
		JLabel lblFmcR = new JLabel("");
		lblFmcR.setBounds(60, 270, 46, 14);
		panelResult.add(lblFmcR);
		
		
		
		
		panelResult.add(lblNome2);
		panelResult.add(lblNomeR);
		panelResult.add(lblIdade2);
		panelResult.add(lblIdadeR);
		panelResult.add(lblAltura2);
		panelResult.add(lblAlturaR);
		panelResult.add(lblPeso2);
		panelResult.add(lblPesoR);
		panelResult.add(lblNivel2);
		panelResult.add(lblNivelR);
		panelResult.add(lblImcR);
		panelResult.add(lblTmb2);
		panelResult.add(lblTmbR);
		
		
		//btnCalcular
				JButton btnSalvar = new JButton();
				btnSalvar.setBounds(40, 250, 120, 40);
				
				panelDados.add(btnSalvar);
						
				btnSalvar.setText("Salvar");
				//btnCalcular.setIcon(imgCalc);
				
				JLabel lblDtNasc = new JLabel("Data de Nascimento:");
				lblDtNasc.setBounds(10, 151, 100, 14);
				panelDados.add(lblDtNasc);
						
						
				btnSalvar.addActionListener(new ActionListener() {
					
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Cliente cliente1 = new Cliente();
						//settando o NOME no painel de resultado
						cliente1.setNome(txtNome.getText());
						lblNomeR.setText(cliente1.getNome());
						
						//settando o PESO no painel de resultados						
						cliente1.setPeso(Double.parseDouble(txtPeso.getText()));
						lblPesoR.setText(String.valueOf(cliente1.getPeso()));
			
						//settando a IDADE no painel de resultados
						/*cliente1.setIdade(Integer.parseInt(txtPeso.getText()));
						lblIdadeR.setText(String.valueOf(cliente1.getIdade()));*/
						
						//settando a ALTURA no painel de resultados
						cliente1.setAltura(Double.parseDouble(txtAltura.getText()));
						lblAlturaR.setText(String.valueOf(cliente1.getAltura()));
						
						//settando o NIVEL DE ATIVIDADE no painel de resultados
						cliente1.setNivel(cbNivel.getSelectedItem().toString());
						lblNivelR.setText(String.valueOf(cliente1.getNivel()));
						
						//settando o valor do IMC  no painelde resultados
						
						
						
						//settando o comentario doIMC no painel de resultados
						lblImcR2.setText(dfDuasCasas.format(cliente1.getImc()));
						
						txtImcR2.setText(String.valueOf(cliente1.calcImc()));
						
						//settando o TMB ao painel
						cliente1.setSexo(grupoSexo.getSelection().getActionCommand());

						cliente1.calcTmb();
						lblTmbR.setText(dfSemCasa.format(cliente1.getTmb()));
						
						
						//settandoFMC ao painel de controle
						cliente1.calcFmc();
						lblFmcR.setText(String.valueOf(cliente1.getFmc()));
						
					}
				});
			
		
		getContentPane().add(panelResult);
		

		

		

		

		
		
		
		
		
		setVisible(true);
		
		
		
		
		
	}
}
