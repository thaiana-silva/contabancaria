package conta.model;

public class ContaCorrente extends Conta {
    private float limite;

    public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
        super(numero, agencia, tipo, titular, saldo);
        this.limite = limite;
    }
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    @Override
    public boolean sacar(float valor) {
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }
    
    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Limite de Crédito: " + limite);
    }
}
