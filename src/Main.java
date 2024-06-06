import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Conta obj1 = new Conta();
        obj1.numero = 0;
        obj1.saldo = 0;
        obj1.juros = 0;


        System.out.println("Seu número é:");
        obj1.numero = sc.nextInt();
        System.out.println(obj1.numero);

        System.out.println("Seu saldo é:");
        obj1.saldo = sc.nextDouble();
        System.out.println(obj1.saldo);

        System.out.println("Os juros são:");
        obj1.juros = sc.nextDouble();
        System.out.println(obj1.juros);

        System.out.println("No vencimento:");
        obj1.vencimento = new Date();
        System.out.println(obj1.vencimento);

        Cliente obj = new Cliente();
        System.out.println("Nome:");
        obj.nome = "Pedro";
        System.out.println(obj.nome);

        System.out.println("CPF:");
        obj.cpf = 234567981;
        System.out.println(obj.cpf);

        System.out.println("Telefone:");
        obj.telefone = 8888888;
        System.out.println(obj.telefone);

        System.out.println("Email:");
        obj.email = "pedrof@gmail.com";
        System.out.println(obj.email);



    }

}
