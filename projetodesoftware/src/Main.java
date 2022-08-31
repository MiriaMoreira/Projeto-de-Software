import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema para Gerenciamento de Projetos\n");

        System.out.println("0 - Sair do Sistema");
        System.out.println("1 - Criar");
        System.out.println("2 - Remover");
        System.out.println("3 - Editar");
        System.out.println("4 - visualizar informações");

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        ArrayList<Projects> Project = new ArrayList<Projects>();
        Projects project1;
        int Id = 1;


        while(num != 0){
            if (num == 1){
                System.out.println("Criar novo projeto");
                project1 = new Projects(Id);
                Project.add(project1);
                Id++;
            }
            if (num == 2){

            }
            if (num == 3){

            }
            if(num == 4){
                System.out.println("Digite o Id do Usuário que deseja visualizar os dados");
                int n = input.nextInt();

                //Read.Print(Project[n]);
            }
            num = input.nextInt();
        }

    }
}
