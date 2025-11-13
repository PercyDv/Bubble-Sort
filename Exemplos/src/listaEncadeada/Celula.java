package listaEncadeada;

public class Celula {
    private Alunos valor;
	private Celula proximo;
	
	public Alunos getValor() {
		return valor;
	}
	
	public void setValor(Alunos valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
