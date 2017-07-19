package Model;

public class Empregado extends Cliente {
	private String matricula;
	private String senha;
	
	public Empregado(int id, String nome, int tipo, String telefone, String matricula, String senha) {
		super(id, nome, tipo, telefone);
		this.matricula=matricula;
		this.senha=senha;
	}
	
	
}
