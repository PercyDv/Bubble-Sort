package exemplofilaapi;

public class Alunos {
    private int age, posiFila;
    private String name;

    public Alunos(String name, int age, int posiFila) {
        this.age = age;
        this.name = name;
        this.posiFila = posiFila;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aluno: "+name+"; Idade: "+age+"; Posição Real: "+posiFila+".";
    }
}
