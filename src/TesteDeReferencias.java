public class TesteDeReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta: " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if (primeiraConta == segundaConta){
            System.out.println("São a mesma conta");
        } else {
            System.out.println("Contas diferentes");
        }



    }
}
