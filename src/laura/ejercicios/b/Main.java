package laura.ejercicios.b;

public class Main {

    public static void main(String[] args) {
        char tor = 't';
        int longit= 3;
        int roscas= 10;
        Destornillador dtnr = new Destornillador(TipoDeCabeza.P.getCabeza());

        Tornillo tornillo = new Tornillo(TipoDeCabeza.P.getCabeza(),longit, roscas);

        dtnr.atornillar(tornillo);



    }
}



