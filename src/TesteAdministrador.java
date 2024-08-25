public class TesteAdministrador {
    
    public static void main(String[] args) {
        
        Administrador admin1 = new Administrador("Pedro Almeida", "Rua D, 101", "4567-8901", 20, 4000.0, 12.0, 500.0);

        
        System.out.println("Informações do Administrador 1:");
        System.out.println(admin1.toString());

        
        Administrador admin2 = new Administrador();
        admin2.setNome("Lucia Ferreira");
        admin2.setEndereco("Avenida E, 202");
        admin2.setTelefone("5678-9012");
        admin2.setCodigoSetor(8);
        admin2.setSalarioBase(3500.0);
        admin2.setImposto(10.0);
        admin2.setAjudaDeCusto(300.0);

        
        System.out.println("\nInformações do Administrador 2:");
        System.out.println(admin2.toString());

        
        admin2.setSalarioBase(3700.0);
        admin2.setImposto(8.0);
        admin2.setAjudaDeCusto(400.0);

        System.out.println("\nInformações do Administrador 2 após modificações:");
        System.out.println(admin2.toString());
    }
}
