public class Main {
    public static void main(String[] args) {
        Turma t252 = new Turma();
        System.out.println(t252.getTotalAlunos());

        Repositorio repo = new Repositorio();

        System.out.println(repo.load());
        repo.save(new Aluno("João", "4"));
        repo.update("4", "Marcos");
        repo.delete("3");
        System.out.println(repo.load());
    }
}
