package App;

import Controle.BancoDados;
import Model.Cliente;
import Model.Empregado;
import Model.Produtos;
import View.Tela_Menu;

public class App {
	
	public static BancoDados banco = new BancoDados();

	public static void main(String[] args) {
		
		App.banco.conectar();
		 if(App.banco.estaConectado()){
			 System.out.println("sim");
		 }
		 else{
			 System.out.println("nao");
		 }
		 new Tela_Menu();
		 
		// App.banco.gravarEmpregado(new Empregado("Zé", 0, "7897987","565", "6767"));
		// App.banco.gravarProdutos(new Produtos("costela", 3232, "0989890", 230, 90, "233242", 1));
		 
		 //hyhjkh
	}

}
