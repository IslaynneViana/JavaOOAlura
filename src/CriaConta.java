public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

       Conta segundaConta = new Conta();
       segundaConta.saldo = 50;
        System.out.println("Primeira conta tem: " + primeiraConta.saldo);
        System.out.println("Segunda conta tem : " + segundaConta.saldo);

        System.out.println(primeiraConta.agencia);
        System.out.println(primeiraConta.numero);

        System.out.println(segundaConta.agencia);

        segundaConta.agencia = 146;
        System.out.println("Agora a segunda conta é da agencia: " + segundaConta.agencia);
    }
}
