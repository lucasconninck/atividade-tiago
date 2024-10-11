public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new ProdutoFisico("Camiseta", 100.00);
        Produto produto2 = new ProdutoDigital("E-book", 50.00);

        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);

        double porcentagemDesconto = 10.0;
        estoque.exibirPrecosComDesconto(porcentagemDesconto);
    }
}
