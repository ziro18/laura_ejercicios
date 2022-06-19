package laura.ejercicios.b;

public class Tornillo {

    private final char TIPO_DE_CABEZA;
    private final int LONGITUD;
    private  final int CANTIDAD_DE_ROSCA;
    private int posicionActual;

    public Tornillo(char tipoDeCabeza, int longitud, int cantidadDeRosa) {
        this.TIPO_DE_CABEZA=tipoDeCabeza;
        this.LONGITUD=longitud;
        this.CANTIDAD_DE_ROSCA=cantidadDeRosa;
    }

    public char getTIPO_DE_CABEZA() {
        return TIPO_DE_CABEZA;
    }

    public int getLONGITUD() {
        return LONGITUD;
    }

    public int getCANTIDAD_DE_ROSCA() {
        return CANTIDAD_DE_ROSCA;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

     public boolean girar( char sentido){

            return true;
     }



}
