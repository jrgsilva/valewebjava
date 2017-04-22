package valeweb;

import valeweb.entidade.Usuario;
import valeweb.persistencia.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir() {
		//Exclusão do Usuário
		Usuario usu = new Usuario();
		usu.setIdusuario(4);
				
		//Exclusão do usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
        
		System.out.println("Excluído com sucesso.");
	}
	
	
	public static void testAlterar() {
		//Alteração do Usuário
		Usuario usu = new Usuario();
		usu.setIdusuario(4);
		usu.setNome("Sebastião Junior");
		usu.setLogin("Galalau");
		usu.setSenha("222");
		
		//Alteração do usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
        
		System.out.println("alterado com sucesso.");
	}

	
	
	public static void TestCadastrar() {
		//Criação do Usuário
		Usuario usu = new Usuario();
		usu.setNome("Tatiana");
		usu.setLogin("taty");
		usu.setSenha("321");
		
		//Cadastro do usuário no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
        
		System.out.println("cadastrado com sucesso.");
	}

}
