public class Item {
    private String nome;
    private double preco;
    private int qtd;

    public Item(String nome, double preco, int qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String toString(){
        return "Nome: "+ nome + " - Preço: "+preco+" - Quantidade: "+qtd;
    }
}
