
import classes.Conta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class listaExemplo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
        Conta c;
        
        for(int i = 0; i < 3; i++){
            
        c = new Conta();
    
        System.out.print("Digite o nome: ");
        c.setNome(sc.nextLine());
        
        System.out.print("Numero da Conta: ");
        c.setConta(sc.nextInt());
        
        System.out.print("Depositar: ");
        c.depositar(sc.nextDouble());
        
        System.out.print("------------------------------\n\n");
       
        lista.add(c);
        
        sc.nextLine();//limpar buffer
        }
    
        Iterator item = lista.iterator();
        
        while(item.hasNext()){
            
            System.out.println("---------------------------------");
            c = (Conta) item.next();
            System.out.println("Nr.Conta: " + c.getNome());
            System.out.println("Nome: " + c.getConta());
            System.out.println("Saldo: " + c.getSaldo());
        }
        
    
    }
    
}
