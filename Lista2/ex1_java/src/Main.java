import contaBancaria.ContaBancaria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContaBancaria contaDoCliente = new ContaBancaria("Moisés Silva S S", 5000.0, 1234
        );

        contaDoCliente.deposito(3000.0);



        System.out.println(
                contaDoCliente.getSaldo()
        );

        contaDoCliente.saque(500.0);
        System.out.println(
                contaDoCliente.getSaldo()
        );
    }
}