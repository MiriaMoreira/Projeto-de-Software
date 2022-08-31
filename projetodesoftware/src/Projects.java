import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Projects {

    public int Id;
    String Description;
    public Date ini_date;
    public Date end_date;
    String Coordinator;
    ArrayList<String> Colaborators;

    Scanner input = new Scanner(System.in);

    public Projects(int Id){
        this.Id = Id;

        System.out.println("Descreva as Atividades a serem executadas: ");
        input.nextLine();
        this.Description = input.nextLine();

        System.out.println("Digite a data e hora de início do Projeto, seguindo as indtruções");
        int day, month, year, hour, min = 0;
        System.out.println("Dia: ");
        System.out.println("Mês: ");
        System.out.println("Ano: ");
        System.out.println("Hora: ");

        this.ini_date = Date(year,month,day,hour, min);

        System.out.println("Digite a data e hora do fim do Projeto, seguindo as indtruções");


        System.out.println("Dia: ");
        day = input.nextInt();

        System.out.println("Mês: ");
        month = input.nextInt();

        System.out.println("Ano: ");
        year = input.nextInt();

        System.out.println("Hora: ");
        hour = input.nextInt();

        this.end_date = Date(year, month, day, hour, min);

        System.out.println("Digite o nome do Coordenador do Projeto");
        input.nextLine();
        this.Coordinator = input.nextLine();

        System.out.println("Digite os nomes dos profissionais envolvidos no projeto");
        System.out.println("**Digite '0' para informar o fim da lista de profissionais envolvidos no projeto");
        String colaborator = ' ';
        input.nextLine();

        while(colaborator != '0'){
            colaborator = input.nextLine();
            Colaborators.add(colaborator);
        }

    }
    public void user_add(){

    }
    public void user_remove(){

    }

}
