package App;

import Controle.BancoDados;
import Model.Cliente;
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
	//	 new Tela_Menu();
		 
		 App.banco.gravarCliente(new Cliente("jeff'", 0, "343434"));
	}

}
