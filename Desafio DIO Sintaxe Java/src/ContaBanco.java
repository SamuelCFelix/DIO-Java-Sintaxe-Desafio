import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        
        ContaTerminal usuario = new ContaTerminal();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta !");
        usuario.numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        usuario.agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o Seu Nome !");
        usuario.nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo !");
        usuario.saldo = scanner.nextDouble();

        System.out.println("Olá " + usuario.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + usuario.agencia + ", conta " + usuario.numero + " e seu saldo " + usuario.saldo + " já está disponível para saque.\n\n");
    }
}
