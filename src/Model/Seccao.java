package Model;

public class Seccao {

	private int id;
	private String nome;
	private String descricao;

	public Seccao(int id, String nome, String descricao){
		this.id=id;
		this.nome=nome;
		this.descricao=descricao;

	}

	public Seccao( String nome, String descricao){
		this.nome=nome;
		this.descricao=descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String[] getLinhaTable(){

		return new String[]{String.valueOf(this.nome), this.descricao};
	}
}
