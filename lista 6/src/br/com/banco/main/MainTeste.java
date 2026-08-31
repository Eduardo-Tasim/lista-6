package br.com.banco.main;

import br.com.banco.model.Agencia;
import br.com.banco.model.Cliente;
import br.com.banco.model.ContaBancaria;

public class MainTeste {

    public static void main(String[] args) {

        // 1. Dois clientes diferentes com o mesmo CPF
        Cliente cliente1 = new Cliente(
                "12345678900",
                "João",
                "joao@email.com"
        );

        Cliente cliente2 = new Cliente(
                "12345678900",
                "Maria",
                "maria@email.com"
        );

        // 2. Testando se os clientes são iguais
        if (cliente1.equals(cliente2)) {
            System.out.println("Os clientes são iguais!");
        } else {
            System.out.println("Os clientes são diferentes!");
        }

        // 3. Criando uma conta com saldo de 50.0
        ContaBancaria conta = new ContaBancaria(
                "001",
                cliente1,
                50.0
        );

        // 4. Tentando sacar 50.0
        boolean resultado = conta.sacar(50.0);

        System.out.println("Resultado do saque: " + resultado);

        // 5. Total de contas abertas
        System.out.println(
                "Total de contas abertas: "
                + Agencia.getTotalContasAbertas()
        );
    }
}