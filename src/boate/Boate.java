
package boate;

import java.util.Scanner;
public class Boate {

    
    public static void main(String[] args) {
        String nome;
        int idade;
        
        Scanner leia = new Scanner (System.in);
        
        
        System.out.println("***** PROGRAMA DA BOATE *****");
        
        System.out.println("Nome do cliente: ");
        nome = leia.nextLine();
        
        System.out.println("Idade: ");
        idade = leia.nextInt();
        
        System.out.println("Nome do cliente: "+ nome);
        System.out.println("Idade: "+ idade);
        
        if (idade >= 18){
            System.out.println("ENTRADA AUTORIZADA !");
        
    }else{
            System.out.println("ENTRADA NÃO AUTORIZADA");
            System.out.print("DIGITE 1 PRA SIM E 2 PRA NÃO");
            int opcao = leia.nextInt();
            
            if(opcao==1){
                System.out.println("ENTRADA AUTORIZADA: AMIGO DO DONO ");
        }else{
            System.out.println("ENTRADA NÃO AUTORIZADA");
            }
    

    }
    }
}