public class Main{
        public static void main(String[] args) {
        double custoProduto = 35; // Custo do produto
        double percentualComissao = 0.12; // 5% de comissão do marketplace
        double percentualImpostos = 0.07; // 10% de imposto
        double precoVenda = CalculadoraPrecoVenda.calcularPrecoVenda(custoProduto, percentualComissao, percentualImpostos);
        System.out.println("Preço de venda: R$" + precoVenda);
}
}



