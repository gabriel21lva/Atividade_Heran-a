public class Vendedor extends Empregado {

    private double valorVendas;
    private double comissao; 

    
    public Vendedor() {
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;
    }

    
    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    
    public double calcularSalario() {
        double salarioBaseComComissao = super.calcularSalario() + (valorVendas * comissao / 100);
        return salarioBaseComComissao;
    }

    public String toString() {
        return super.toString() +
               ", Valor Vendas =" + valorVendas +
               ", Comissao=" + comissao +
               "%, Salario Total=" + calcularSalario() +
               '}';
    }
}
