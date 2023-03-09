public class ContaBanco {
    public int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta " + this.getnumConta());
        System.out.println("Tipo "+ this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
        System.out.println("----------------------------");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            saldo = saldo + 50;
        }else{
            saldo = saldo + 150;
            System.out.println("Conta aberta com sucesso");
        }
    }
    public void fecharconta(){
        //nem ter dnheiro, nem estar no negativo
        if (saldo > 0){
            System.out.println("A conta ainda está com dinheiro");
        }else if (conta < 0){
            System.out.println("A conta está em débito");
        }else
            {
             System.out.println("Sua conta foi encerrada");
             status = false;
            }

    }
    public void depositar(float v){
            if(this.getStatus()){
                saldo = saldo + v;
            }else{
                System.out.println("Containexistente");
            }
    }
    public float sacar(real v){
        if((v.Status == true) && (v.getSaldo >= v)){
            saldo = saldo - v;
        }else{
            System.out.println("Conta inexistente ou saldo insuficiente");
        }

    }
    public String pagarMensal(){
        String c;
        if (c.getTipo == CC){
            saldo = saldo - 12;
        }else if(c.getTipo == CP){
            saldo = saldo - 20; 
        }
        if (saldo >= v){
            saldo = saldo -v;
        }else{
            System.out.println("Saldo insuficiente");
        }

    }


    public int getnumConta(){
        return numConta;
    }
    public void setNumConta(int num){
        this.numConta = num;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(real s){
        this.saldo = s;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean s){
        this.status = s;
    }



















}   

