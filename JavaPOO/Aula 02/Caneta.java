public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("tempada: " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("ponta: " + this.ponta);

    }
    public void rabiscar(){
        if (tampada == true){
            System.out.println("A caneta está tampada");
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    private void tampar(){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }

    

    
}
