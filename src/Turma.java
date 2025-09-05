import java.util.List;

public class Turma {

    private List<Aluno> listaAlunos;
    private Repositorio tViewer;

    public Turma () {
        tViewer = new Repositorio();
        listaAlunos = tViewer.load();
    }

    public double calcMedia() {
        return 0.0;
    }

    public List<Aluno> getAlunos() {
        return listaAlunos;
    }

    public int getTotalAlunos() {
        return listaAlunos.size();
    }

    public void add(Aluno a) {
        listaAlunos.add(a);
    }

    public void delete(Aluno a) {
        listaAlunos.remove(a);
    }
}
