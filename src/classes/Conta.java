/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.util.Scanner;

public class Conta {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    
    public Conta() {
    
    }
    

//    public Conta(String nome, int conta, double saldo_inicial){
//        this.nome=nome;
//        this.conta=conta;
//        saldo=saldo_inicial;
//        saques=0;
//    }
    
    public void extrato(){
        System.out.println("\n\tEXTRATO");
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n",this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");

    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        } else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }

    public boolean depositar(double valor)
    {
        if(valor <= 0){
            return false;
        }
        this.saldo += valor;
        return true;

    }

    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrada.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=4);
    }

    public void exibeMenu(){

        System.out.println("\n\t Escolha a opção desejada");
        System.out.println("----------------------------------------");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");

    }
    


    public void escolheOpcao(int opcao){
        double valor;

        switch( opcao ){
            case 1:    
                   extrato();
                    break;
            case 2: 
                    if(saques<3){
                        System.out.print("Quanto deseja sacar: ");
                        valor = entrada.nextDouble();
                        sacar(valor);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;

            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    valor = entrada.nextDouble();
                    depositar(valor);
                    break;

            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;

            default:
                    System.out.println("\nOpção inválida\n");
        }
    }
    public int getConta(){
    return conta;
    
    }
    public void setConta(int conta){
    this.conta = conta;
    
    }
    public double getSaldo(){
    return saldo;
    
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public String getNome(){
    return nome;
    
    }
    public void setNome(String nome){
    
    this.nome = nome;
    }

}