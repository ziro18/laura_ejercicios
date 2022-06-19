package laura.ejercicios.b;

public class Destornillador {

    private final char TIPO_DE_CABEZA;

    public Destornillador(char tipoDeCabeza){
        this.TIPO_DE_CABEZA=tipoDeCabeza;
    }

    public char getTIPO_DE_CABEZA() {
        return TIPO_DE_CABEZA;
    }


   public void desatornillar(Tornillo tornillo){

   }
    public void atornillar (Tornillo tornillo){
        if(tornillo.getTIPO_DE_CABEZA()==this.TIPO_DE_CABEZA){
            tornillo.girar(Sentido.H.getSentido());

        }
    }

    public void desatornillar(Tornillo tornillo, Tarugo tarugo){

    }

    public void atornillar(Tornillo tornillo , Tarugo tarugo){

    }
}