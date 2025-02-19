import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(pessoas);
    }

    public void ordenarPessoasPorAltura(){
        Comparator<Pessoa> c = Comparator.comparingDouble(Pessoa::getAltura);
        Collections.sort(pessoas,c); //comparator passa dois parâmetros
    }

    public void exibirPessoas(){
        pessoas.forEach(System.out::println);
    }
}
