package valeweb;

import valeweb.entidade.Usuario;
import valeweb.persistencia.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		testExcluir();
	}
	
	public static void testExcluir() {
		//Exclus�o do Usu�rio
		Usuario usu = new Usuario();
		usu.setIdusuario(4);
				
		//Exclus�o do usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
        
		System.out.println("Exclu�do com sucesso.");
	}
	
	
	public static void testAlterar() {
		//Altera��o do Usu�rio
		Usuario usu = new Usuario();
		usu.setIdusuario(4);
		usu.setNome("Sebasti�o Junior");
		usu.setLogin("Galalau");
		usu.setSenha("222");
		
		//Altera��o do usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
        
		System.out.println("alterado com sucesso.");
	}

	
	
	public static void TestCadastrar() {
		//Cria��o do Usu�rio
		Usuario usu = new Usuario();
		usu.setNome("Tatiana");
		usu.setLogin("taty");
		usu.setSenha("321");
		
		//Cadastro do usu�rio no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
        
		System.out.println("cadastrado com sucesso.");
	}

}
