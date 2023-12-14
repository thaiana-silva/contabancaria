package conta.model;

public class Conta {
	private float saldo;

    public Conta(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        this.saldo += valor;
    }

    public boolean sacar(float valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
