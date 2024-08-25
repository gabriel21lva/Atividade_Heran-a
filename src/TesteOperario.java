public class TesteOperario {
    
    public static void main(String[] args) {
        
        Operario operario1 = new Operario("João Souza", "Rua F, 303", "6789-0123", 15, 3200.0, 8.0, 15000.0, 5.0);

        System.out.println("Informações do Operário 1:");
        System.out.println(operario1.toString());

        Operario operario2 = new Operario();
        operario2.setNome("Mariana Lima");
        operario2.setEndereco("Avenida G, 404");
        operario2.setTelefone("7890-1234");
        operario2.setCodigoSetor(12);
        operario2.setSalarioBase(2800.0);
        operario2.setImposto(9.0);
        operario2.setValorProducao(12000.0);
        operario2.setComissao(6.0);

        System.out.println("\nInformações do Operário 2:");
        System.out.println(operario2.toString());

        operario2.setSalarioBase(2900.0);
        operario2.setImposto(7.0);
        operario2.setValorProducao(14000.0);
        operario2.setComissao(7.0);

        System.out.println("\nInformações do Operário 2 após modificações:");
        System.out.println(operario2.toString());
    }
}
