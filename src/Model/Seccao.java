package Model;

public class Seccao {

	private int id;
	private String nome;
	private String descri�ao;
	
	public Seccao(int id, String nome, String descri�ao){
		this.id=id;
		this.nome=nome;
		this.descri�ao=descri�ao;
		
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

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		this.descri�ao = descri�ao;
	}
}
