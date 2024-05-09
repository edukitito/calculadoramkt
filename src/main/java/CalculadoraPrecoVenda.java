public class CalculadoraPrecoVenda {
        // Constantes
        static final double MARGEM_LUCRO = 0.35; // 20% de margem de lucro líquido

        // Função para calcular o preço de venda
        public static double calcularPrecoVenda(double custoProduto, double percentualComissao, double percentualImpostos) {
            // Inicialmente, suponha que o preço de venda seja o mesmo que o custo do produto
            double precoVenda = custoProduto;

            // Ajuste o preço de venda para atingir a margem de lucro líquido desejada
            while (true) {
                // Calcula o preço de venda considerando a margem de lucro líquido, a comissão e os impostos
                double precoLiquido = precoVenda * ( 1-(percentualComissao+percentualImpostos));
                double lucroLiquido = precoLiquido - custoProduto;

                // Se o lucro líquido for maior ou igual à margem de lucro desejada, pare a iteração
                if (lucroLiquido >= precoVenda * MARGEM_LUCRO) {
                    System.out.println(lucroLiquido);
                    break;
                }

                // Caso contrário, ajuste o preço de venda e continue iterando
                precoVenda += 0.05; // Aumente o preço em R$0.01 (ou ajuste conforme a necessidade)
                System.out.println(precoVenda);
            }

            return precoVenda;
        }
}
