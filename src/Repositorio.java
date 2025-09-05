import java.util.ArrayList;
import java.util.List;

public class Repositorio {
    private List<Aluno> listaAlunos;

    public Repositorio() {
        listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Marcelo", "1"));
        listaAlunos.add(new Aluno("Pedro", "2"));
        listaAlunos.add(new Aluno("Maria", "3"));
        listaAlunos.add(new Aluno("Marcos", "4"));
        listaAlunos.add(new Aluno("Silvia", "5"));
    }

    public List<Aluno> load() {
        return listaAlunos;
    }

    public void save(Aluno aluno) {
        listaAlunos.add(aluno);
    }

    public void update(String matricula, String novoNome) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setNome(novoNome);
                break;
            }
        }
    }

    public void delete(String matricula) {
        listaAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }
}
