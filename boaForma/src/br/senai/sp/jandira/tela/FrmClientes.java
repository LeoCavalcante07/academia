package br.senai.sp.jandira.tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class FrmClientes extends JFrame {

	private JPanel painelPrincipal;
	private JTable tabelaClientes;


	
	public FrmClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		painelPrincipal = new JPanel();
		painelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelPrincipal);
		painelPrincipal.setLayout(null);
		
		JPanel painelTitulo = new JPanel();
		painelTitulo.setBounds(0, 0, 434, 51);
		painelPrincipal.add(painelTitulo);
		painelTitulo.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Academia");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(46, 11, 81, 29);
		painelTitulo.add(lblNewLabel);
		
		JLabel lblIdentOperacao = new JLabel("<dynamic>");
		lblIdentOperacao.setBounds(340, 11, 46, 14);
		painelTitulo.add(lblIdentOperacao);
		
		JPanel painelConteudo = new JPanel();
		painelConteudo.setBounds(0, 50, 434, 152);
		painelPrincipal.add(painelConteudo);
		painelConteudo.setLayout(null);
		
		JScrollPane scrollTabela = new JScrollPane();
		scrollTabela.setEnabled(false);
		scrollTabela.setBounds(10, 11, 414, 130);
		painelConteudo.add(scrollTabela);
		
		tabelaClientes = new JTable();
		scrollTabela.setViewportView(tabelaClientes);
		
		JPanel painelBotoes = new JPanel();
		painelBotoes.setBounds(0, 201, 434, 60);
		painelPrincipal.add(painelBotoes);
		painelBotoes.setLayout(null);
		
		JButton btnNovo = new JButton("");
		btnNovo.setIcon(new ImageIcon(FrmClientes.class.getResource("/br/senai/sp/jandira/icons/addContato.png")));
		btnNovo.setBounds(20, 11, 65, 38);
		painelBotoes.add(btnNovo);
		
		JButton btnEditar = new JButton("");
		btnEditar.setIcon(new ImageIcon(FrmClientes.class.getResource("/br/senai/sp/jandira/icons/upDateUser.png")));
		btnEditar.setBounds(95, 11, 66, 38);
		painelBotoes.add(btnEditar);
		
		
		JButton btnExcluir = new JButton("");
		btnExcluir.setIcon(new ImageIcon(FrmClientes.class.getResource("/br/senai/sp/jandira/icons/deleteUser1.png")));
		btnExcluir.setBounds(171, 11, 59, 38);
		painelBotoes.add(btnExcluir);
		
		JButton btnSair = new JButton("");
		btnSair.setIcon(new ImageIcon(FrmClientes.class.getResource("/br/senai/sp/jandira/icons/sair.png")));
		btnSair.setBounds(359, 11, 65, 38);
		painelBotoes.add(btnSair);
	}
}
