public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("avançar canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("voltar canal para: " + canal);
    }

    public void aumentarVolume(){
        //volume = + 1;
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        //volume = - 1;
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }

        public void desligar(){
        ligada=false;
    }

}
