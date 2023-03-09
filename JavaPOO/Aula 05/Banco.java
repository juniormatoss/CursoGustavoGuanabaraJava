public class Banco {
    public static void main(String [] args){
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(12345);
        conta1.setDono("Juninho");
        conta1.abrirConta("CC");
        conta1.depositar(100);
        conta1.estadoAtual();
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(42367);
        conta2.setDono("Thays");
        conta2.abrirConta("CP");
        conta2.depositar(200);
        conta2.estadoAtual();

    }
    
}
