public class TesteFornecedor {
    
    public static void main(String[] args) {
        
        Fornecedor fornecedor1 = new Fornecedor("João Silva", "Rua A, 123", "1234-5678", 10000.0, 2500.0);

        
        System.out.println("Informações do Fornecedor 1:");
        System.out.println(fornecedor1.toString());

        
        Fornecedor fornecedor2 = new Fornecedor("Maria Oliveira", "9876-5432", 5000.0, 1200.0);

        
        System.out.println("\nInformações do Fornecedor 2:");
        System.out.println(fornecedor2.toString());

        
        fornecedor2.setValorCredito(6000.0);
        fornecedor2.setValorDivida(1500.0);

        
        System.out.println("\nInformações do Fornecedor 2 após modificações:");
        System.out.println(fornecedor2.toString());
    }
}
