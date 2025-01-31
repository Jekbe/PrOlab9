package zad1;

public class Fasada {
    Swiatlo swiatlo;
    Klima klima;
    Audio audio;

    public Fasada() {
         swiatlo = new Swiatlo();
         klima = new Klima();
         audio = new Audio();
    }

    public void enterHome(){
        swiatlo.setStatus(true);
        klima.setStatus(true);
        audio.setStatus(true);
    }

    public void leaveHome(){
        swiatlo.setStatus(false);
        klima.setStatus(false);
        audio.setStatus(false);
    }
}

class system{
    public static void main(String[] args){
        Fasada fasada = new Fasada();

        fasada.leaveHome();
        fasada.enterHome();
    }
}