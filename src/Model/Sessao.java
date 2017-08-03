package Model;

public class Sessao {

	private int id;
	private String nome;
	private String descriçao;
	
	public Sessao(int id, String nome, String descriçao){
		this.id=id;
		this.nome=nome;
		this.descriçao=descriçao;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}
}
