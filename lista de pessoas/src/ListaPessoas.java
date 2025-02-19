import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListaPessoas {
    private List<Pessoa> pessoas;

    public ListaPessoas() {
        pessoas = new ArrayList<Pessoa>();
    }

    public boolean adicionarPessoa(String nome,int idade, double altura){
        return pessoas.add(new Pessoa(nome,idade,altura));
    }

    public void ordenarPessoasPorIdade(){
        Comparable c = () -> compareTo(pessoas);
    }

    public void ordenarPessoasPorAltura(){
        Comparator<Pessoa> c = (a1,a2) -> Double.compare(a1.getAltura(),a2.getAltura());
    }
}
