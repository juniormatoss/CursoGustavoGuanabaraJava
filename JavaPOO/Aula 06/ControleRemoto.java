public class ControleRemoto implements Controlador {

    public static void main(String args[]){

    }
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public void ligar(){
        setLigado = true;
    }
    public void desligar(){
        setDesligado = true;
    }

    public int getVolume() {
        return volume;
    }



    public void setVolume(int volume) {
        this.volume = volume;
    }



    public boolean getLigado() {
        return ligado;
    }



    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }



    public boolean getTocando() {
        return tocando;
    }



    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    } 
 

}