public class SmartTv {
    boolean ligada = true;
    int canal = 1;
    int volume = 25;


public void mudarCanal(int novoCanal){
    canal = novoCanal;
    System.out.println("Trocando de canal para o " + canal);
}

public void aumentarCanal(){
    canal++;
    System.out.println("Voltando o o canal para " + canal);
}
public void diminuirCanal(){
    canal--;
    System.out.println("Avançando o o canal para " + canal);
}


public void aumentarVolume(){
    volume++;
    System.out.println("Aumentando o volume para: " + volume);
}

public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo o volume para: " + volume);
}

public void ligar(){
    ligada = true;
}

public void desligar(){
    ligada = false;
}

}
