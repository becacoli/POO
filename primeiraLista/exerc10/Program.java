package exerc10;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Gmail gmail = new Gmail(sistema);
        Funcionario funcionario1 = new Funcionario("Rebeca", "Publicitária", "134431", "beqinha@gmail.com");
        Funcionario funcionario2 = new Funcionario("Luiza", "Pesquisadora", "134890", "luizac@gmail.com");
        sistema.addFuncionario(funcionario1);
        sistema.addFuncionario(funcionario2);

        Email email = new Email("Marketing", "Oie, tudo bom? Podemos conversar acerca dos novos produtos a serem divulados?", funcionario1, funcionario2, new Date());
        gmail.sendEmail(email);
        Email email2 = new Email("R: Marketing", "Claro, vamos nos encontrar!", funcionario2, funcionario1, new Date());
        gmail.sendEmail(email2);

        for (Funcionario funcionario : sistema.funcionarios) {
            System.out.println(funcionario.getName());
            System.out.println(funcionario.getEmail());
            System.out.println("Email recebidos: ");
            for (Email emailRecebido : funcionario.getEmailRecebidos()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
            System.out.println("Email enviados: ");
            for (Email emailRecebido : funcionario.getEmailEnviados()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
        }
    }
}
