public class TesteVendedor {
    
    public static void main(String[] args) {
        
        Vendedor vendedor1 = new Vendedor("Ana Costa", "Rua H, 505", "8901-2345", 25, 3500.0, 7.0, 20000.0, 5.0);

        
        System.out.println("Informações do Vendedor 1:");
        System.out.println(vendedor1.toString());

       
        Vendedor vendedor2 = new Vendedor();
        vendedor2.setNome("Ricardo Santos");
        vendedor2.setEndereco("Avenida I, 606");
        vendedor2.setTelefone("9012-3456");
        vendedor2.setCodigoSetor(18);
        vendedor2.setSalarioBase(2700.0);
        vendedor2.setImposto(10.0);
        vendedor2.setValorVendas(15000.0);
        vendedor2.setComissao(6.0);

        
        System.out.println("\nInformações do Vendedor 2:");
        System.out.println(vendedor2.toString());

        
        vendedor2.setSalarioBase(2900.0);
        vendedor2.setImposto(8.0);
        vendedor2.setValorVendas(17000.0);
        vendedor2.setComissao(7.0);

        System.out.println("\nInformações do Vendedor 2 após modificações:");
        System.out.println(vendedor2.toString());
    }
}
