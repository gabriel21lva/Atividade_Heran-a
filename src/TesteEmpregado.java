public class TesteEmpregado {
    
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("Ana Santos", "Rua B, 456", "2345-6789", 10, 3000.0, 15.0);

        
        System.out.println("Informações do Empregado 1:");
        System.out.println(empregado1.toString());

        
        Empregado empregado2 = new Empregado();
        empregado2.setNome("Carlos Pereira");
        empregado2.setEndereco("Avenida C, 789");
        empregado2.setTelefone("3456-7890");
        empregado2.setCodigoSetor(5);
        empregado2.setSalarioBase(2500.0);
        empregado2.setImposto(10.0);

        
        System.out.println("\nInformações do Empregado 2:");
        System.out.println(empregado2.toString());

        
        empregado2.setSalarioBase(2700.0);
        empregado2.setImposto(12.0);

        System.out.println("\nInformações do Empregado 2 após modificações:");
        System.out.println(empregado2.toString());
    }
}
