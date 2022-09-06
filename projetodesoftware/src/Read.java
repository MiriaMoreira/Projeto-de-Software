import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Read {
    /*public int Id;
    String Description;
    public Date ini_date;
    public Date end_date;
    String Coordinator;
    ArrayList<String> Colaborators;

    Scanner input = new Scanner(System.in);

    public Read(int Id){
        this.Id = Id;

        System.out.println("Descreva as Atividades a serem executadas: ");
        input.nextLine();
        this.Description = input.nextLine();

        System.out.println("Digite a data e hora de início do Projeto, seguindo as indtruções");
        int day = 0, month = 0, year = 0, hour = 0;
        System.out.println("Dia: ");
        day = input.nextInt();
        System.out.println("Mês: ");
        month = input.nextInt();
        System.out.println("Ano: ");
        year = input.nextInt();
        System.out.println("Hora: ");
        hour = input.nextInt();

        this.ini_date = new Date(day,month,year,hour, 00);

        System.out.println("Digite a data e hora do fim do Projeto, seguindo as indtruções");


        System.out.println("Dia: ");
        day = input.nextInt();

        System.out.println("Mês: ");
        month = input.nextInt();

        System.out.println("Ano: ");
        year = input.nextInt();

        System.out.println("Hora: ");
        hour = input.nextInt();

        this.end_date = new Date(year, month, day, hour, 00);

        System.out.println("Digite o nome do Coordenador do Projeto");
        input.nextLine();
        this.Coordinator = input.nextLine();

        System.out.println("Digite os nomes dos profissionais envolvidos no projeto");
        System.out.println("**Digite '0' para informar o fim da lista de profissionais envolvidos no projeto");
        String colaborator = "0";
        input.nextLine();

        while(colaborator != "0"){
            colaborator = input.nextLine();
            Colaborators.add(colaborator);
        }

    }*/
	
	
    public void Print(Projects project){
        System.out.println("Id - " + project.Id);
        System.out.println("Descrição - " + project.Description);
        System.out.println("Data de início - " + project.ini_date);
        System.out.println("Data de término - " + project.end_date);
        System.out.println("Coordenador - " + project.Coordinator);

        for(String colaborator : project.Colaborators){
            System.out.println(colaborator);
        }

    }
}
