public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("Banana",1,3);
        c.adicionarItem("Uva",1,1);
        c.adicionarItem("Fone de ouvido",1,1);
        c.adicionarItem("Banana",1,1);
        c.adicionarItem("Banana",1,1);
        c.adicionarItem("Prato de porcelana",1,1);
        c.adicionarItem("Torneira",1,1);
        c.adicionarItem("Bandeira do Brasil",1,1);

//        System.out.println(c.calcularValorTotal());
//        c.exibirItens();
//        c.removerItem("Banana");
//        System.out.println("=============================================");
//        c.exibirItens();
    }
}