/**
 * 
 */
package sistema;

import com.projeto.service.UsuarioService;
import com.sistema.orm.Usuario;

/**
 * @author: João Lucas Lima de Gouveia
 * @email: joaolucaslima.0403@gmail.com
 * 
 */
public class Teste {
	
	public static void main(String args[]){
//		Cardapio cardapio = new Cardapio();
//		cardapio.setNome("kkk");
//		cardapio.setDescricao("nada");
//		cardapio.setFlag(1);
//		cardapio.setTypeProduct(1);
//		cardapio.setValorUnitario(11.0);
//		CardapioService service = new CardapioService();
//		service.manter(cardapio);
		
		Usuario user = new Usuario();
		user.setCpf(1234567890);
		user.setLogin("teste");
		user.setName("testando");
		user.setRg(124324209);
		user.setSenha(4545);
		user.setTipo(1);
		UsuarioService service = new UsuarioService();
		service.manter(user);
	}
}
