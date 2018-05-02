package br.senai.sp.jandira.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.cliente.Cliente;
import br.senai.sp.jandira.dbUtils.Conexao;


public class AgendaDao {

	private Cliente cliente;
	private PreparedStatement stm;
	private ResultSet rs;

	/*------------------------TESTE---------------------------------*/
	public void gravar() {
		
		
	
		String sql = "INSERT INTO clientes (Nome, Sexo, Peso, Altura, Data de Nascimento, Nível de Atividade)"
				+ "VALUES(?,?,?,?,?,?)";
		
		stm = null;
		
		try {
			stm = Conexao.abrirConexao().prepareStatement(sql);
			stm.setString(1, cliente.getNome());			
			stm.setString(2, cliente.getSexo());
			stm.setDouble(3, cliente.getPeso());
			stm.setDouble(4, cliente.getAltura());
			stm.setString(5, cliente.getDtNasc());
			stm.setString(6, cliente.getNivel());
			
			stm.execute();
			
			JOptionPane.showMessageDialog(null, "Contato gravado com sucesso", "Gravação", JOptionPane.INFORMATION_MESSAGE);
			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
		/*----------------------------------------------TESTE----------------------------*/
		
}
