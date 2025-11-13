package listaEncadeada;

public class Alunos {
    private String nome;
	private int id;
	
	public Alunos(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return nome + " - "+id;
	}

	public int compareTo(Alunos outro) {
		return this.nome.compareTo(outro.getNome());
	}
}
