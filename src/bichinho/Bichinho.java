package bichinho;

import java.util.Scanner;

public class Bichinho {

    public static void main(String[] args) {
        Tamagushi bicho = new Tamagushi("Pix",100.,100.,2);
        Scanner scanner = new Scanner(System.in);
        int escolha=0;
        Double quantidades=0.;
        do{
            System.out.println("1.Brincar\n2.Comer\n3.Ver humor\n4.Sair");
            escolha = scanner.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Por quantos minutos quer brincar?");
                    quantidades = scanner.nextDouble();
                    bicho.brincar(quantidades);
                    break;
                case 2:
                    System.out.println("Quanto de comida deseja dar ao bichinho?");
                    quantidades = scanner.nextDouble();
                    bicho.alimentar(quantidades);
                    break;
                case 3:
                    bicho.humor();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                    default : 
                        System.out.println("Opcao invalida!!");
                        break;
            }
        }while(escolha!=4);
    }
    
}
