import java.util.LinkedList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras(){
        itens = new LinkedList<>();
    }

    public boolean adicionarItem(String nome,double preco, int quantidade){
        return itens.add(new Item(nome, preco, quantidade));
    }

    public boolean removerItem(String nome){
        for(Item item: itens) {
            if (item.getNome().equals(nome))
                return itens.remove(item); //remove o primeiro item que achar com o mesmo nome
        }
        return false;
    }

    public double calcularValorTotal(){
        double result = 0;
        for (Item item: itens) {
            result += item.getPreco() * item.getQtd();
        }
        return result;
    }

    public void exibirItens(){
        itens.forEach(System.out::println);
    }
}
