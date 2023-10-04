public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Float saldo;

    public ContaTerminal() {
        this.numero = 0;
        this.agencia = "";
        this.nomeCliente = "";
        this.saldo = (float) 0;
    }
    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia+ ", conta " + numero +
                " e seu saldo R$"+String.format("%.02f", saldo)
                +" já está disponível para saque";
    }
}