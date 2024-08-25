public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;

    
    public Fornecedor() {
        super();
        this.valorCredito = 0.0;
        this.valorDivida = 0.0;
    }

    
    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    
    public Fornecedor(String nome, String telefone, double valorCredito, double valorDivida) {
        super(nome, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    
    public String toString() {
        return super.toString() + 
               ", valorCredito=" + valorCredito + 
               ", valorDivida=" + valorDivida +
               ", saldo=" + obterSaldo() +
               '}';
    }
}
