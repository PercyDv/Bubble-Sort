package listaEncadeada;
import java.util.Scanner;

public class TestaListaEncadeada {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada lista = new ListaEncadeada();

		String menu = """
				============ Menu =================
				(1) Adicionar Alunos
				(2) Remover Alunos
				(3) Pesquisar
				(4) Listar os registros da lista
				(5) Colocar em Ordem Alfabética
				(0) Finaliza Operação
				====================================
				""";
		int op;

		do {
			System.out.println(menu);
			op = kb.nextInt();
			kb.nextLine();
			switch (op) {
			case 1:
				System.out.println("Você tem os seguintes Alunos adicionados: ");
				
				testa.addAlunos(lista);
				while (lista.temProximo()) {
					System.out.println(lista.getPosicaoAtual().getValor().getNome());
				}
				
				break;
			case 2: 
				
				System.out.println("Alunos removidos");
				
				testa.removerAluno(lista);
				while (lista.temProximo()) {
					System.out.println(lista.getPosicaoAtual().getValor().getNome());
				}
				
				break;
			case 3:
				System.out.print("Informe um nome para pesquisar: ");
				String nome = kb.nextLine().toLowerCase();
				lista.pesquisar(nome);
				
				break;
			case 4:
				lista.listarRegistros();
				
				break;
			case 5:
				System.out.println("Lista ordenada em ordem alfabética");
				lista.ordemAlfabetica();
				lista.listarRegistros();
				
				break;
			default:
				System.out.println("Operação encerrada!");
			}
			
			} while (op != 0);
		kb.close();
	}
	
	public void addAlunos(ListaEncadeada lista) {
		Alunos aluno1 = new Alunos("Davi", 2000);
		Alunos aluno2 = new Alunos("Luis", 2050);
		Alunos aluno3 = new Alunos("Joao", 2022);
		Alunos aluno4 = new Alunos("Elder", 2010);

		lista.adicionar(aluno1);
		lista.adicionar(aluno2);
		lista.adicionar(aluno3);
		lista.adicionar(aluno4);
	}

	public void removerAluno(ListaEncadeada lista) {
		lista.remover();
	}

}
