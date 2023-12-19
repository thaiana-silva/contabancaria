package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
    public static void main(String[] args) {
        
        ContaCorrente contaCorrente1 = new ContaCorrente(1, 123, 1, "Mariana", 8000, 1000);
        contaCorrente1.visualizar();
        
        contaCorrente1.sacar(5000);
        contaCorrente1.visualizar();
        
        ContaCorrente contaCorrente2 = new ContaCorrente(2, 123, 1, "Adriana", 10000, 500);
        contaCorrente2.visualizar();
        
        contaCorrente2.sacar(15000);
        contaCorrente2.visualizar();
        
        ContaPoupanca contaPoupanca = new ContaPoupanca(3, 123, 2, "Victor", 100000, 15);
        contaPoupanca.visualizar();
        
        try (Scanner leia = new Scanner(System.in)) {
			int opcao = 0;

			while (opcao != 9) {
			    System.out.println(Cores.YELLOW + "**********************************************************************\n" +
			            "\t\tBANCO DO BRAZIL COM Z\n" +
			            "**********************************************************************\n" +
			            "1 - Criar Conta\n" +
			            "2 - Listar todas as Contas\n" +
			            "3 - Buscar Conta por Numero\n" +
			            "4 - Atualizar Dados da Conta\n" +
			            "5 - Apagar Conta\n" +
			            "6 - Sacar\n" +
			            "7 - Depositar\n" +
			            "8 - Transferir valores entre Contas\n" +
			            "9 - Sair\n" +
			            "**********************************************************************\n" +
			            "Entre com a opção desejada:\n");

			    opcao = leia.nextInt();

			    switch (opcao) {
			        case 1:
			            System.out.println("Criar Conta");
			            break;
			        case 2:
			            System.out.println("Listar todas as Contas");
			            break;
			        case 3:
			            System.out.println("Consultar dados da Conta - por número");
			            break;
			        case 4:
			            System.out.println("Atualizar dados da Conta");
			            break;
			        case 5:
			            System.out.println("Apagar a Conta");
			            break;
			        case 6:
			            System.out.println("Saque");
			            break;
			        case 7:
			            System.out.println("Depósito");
			            break;
			        case 8:
			            System.out.println("Transferência entre Contas");
			            break;
			        case 9:
			            System.out.println("Banco do Brazil com Z - O seu futuro começa aqui!");
			            sobre();
			            break;
			        default:
			            System.out.println("Opção Inválida!");
			            break;
			    }
			}
		}
    }

    public static void sobre() {
        System.out.println("**********************************************************************\n" +
                "Projeto Desenvolvido por:\n" +
                "Generation Brasil - generation@generation.org\n" +
                "github.com/seugithub\n" +
                "**********************************************************************\n");
    }
}
