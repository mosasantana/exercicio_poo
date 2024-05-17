package contaBancaria;

public class ContaBancaria {
    private String titular;
    private Double saldo;
    private int numeroDaConta;

    public ContaBancaria (String titular, Double saldo, int numeroDaConta){
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void saque (Double valor){
        this.saldo -= valor;
    }
    public void deposito(Double valor){
        this.saldo += valor;
    }

}

