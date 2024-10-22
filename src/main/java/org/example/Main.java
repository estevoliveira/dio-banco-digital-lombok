package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente("Venilton","123456789801","921212121");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}