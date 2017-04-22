package valeweb.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import valeweb.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();
		
	public void cadastrar(Usuario usu) {
		String sql = "INSERT INTO USUARIO (NOME, LOGIN, SENHA) VALUES (?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha());
			preparador.execute();
			preparador.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public void alterar(Usuario usu) {
		String sql = "UPDATE USUARIO SET NOME=?, LOGIN=?, SENHA=? WHERE IDUSUARIO=?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usu.getNome());
			preparador.setString(2, usu.getLogin());
			preparador.setString(3, usu.getSenha()); 
			preparador.setInt(4, usu.getIdusuario());
			preparador.execute();
			preparador.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public void excluir(Usuario usu) {
		String sql = "DELETE FROM USUARIO WHERE IDUSUARIO=?";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, usu.getIdusuario());
			preparador.execute();
			preparador.close();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
