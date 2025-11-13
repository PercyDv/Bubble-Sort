package Faculdade.SegundoSemestre.EstruturaDados.Lista2_FILA.Q4;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;

public class Q4_ComAPI {
    public static void main(String[] args) {
        Queue<Alunos> queue = new LinkedList<Alunos>();
        Iterator<Alunos> it = queue.iterator();
        Scanner kb = new Scanner(System.in);

        String Menu = """
                1 - Inserir Aluno.
                2 - Consultar alunos por idade.
                3 - Sair.
                """;
        int op;
        do {
            System.out.println(Menu);
            op = kb.nextInt();
            switch (op) {
                case 1:
                    add(queue, it, kb);
                    break;

                case 2:
                    searchByAge(queue,it);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("OP inválida.");
            }
        } while (op != 3);
    }

    public static void add(Queue<Alunos> queue, Iterator<Alunos> it, Scanner kb) {
        kb.nextLine();
        System.out.println("Escreva o nome do Aluno");
        String nome = kb.nextLine();

        System.out.println("Escreva a idade do Aluno");
        int idade = kb.nextInt();
        kb.nextLine();

        int posicaoFila=0;
        posicaoFila++;

        Alunos aluno = new Alunos(nome, idade, posicaoFila);

        queue.add(aluno);
        System.out.println("Aluno adicionado!✅\nFila:");

        it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void searchByAge(Queue<Alunos> queue, Iterator<Alunos> it){

        ArrayList<Alunos> inOrder = new ArrayList<Alunos>();

        it= queue.iterator();
        while(it.hasNext()){
            Alunos currentStudent = it.next();
            inOrder.add(currentStudent);
        }

        for (int i = 0; i < queue.size(); i++) {
            for (int j = 0; j < queue.size()-1; j++) {
                if(inOrder.get(j).getAge()>inOrder.get(j+1).getAge()){
                    Alunos temp = inOrder.get(j);
                    inOrder.set(j, inOrder.get(j+1));
                    inOrder.set(j+1, temp);
                }
            }
        }
        Iterator<Alunos> it1 = inOrder.iterator();
        System.out.println("Alunos em ordem:");
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}

