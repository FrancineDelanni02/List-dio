public class Main {
    public static void main(String[] args) {
        ListaPessoas list = new ListaPessoas();
        list.adicionarPessoa("Francine",21,1.62);
        list.adicionarPessoa("José",19,1.70);
        list.adicionarPessoa("Calango",12,1.40);
        list.adicionarPessoa("Cocrodrilho",2,1.34);

        list.exibirPessoas();
        list.ordenarPessoasPorAltura();
        System.out.println("=========================================");
        list.exibirPessoas();
    }
}