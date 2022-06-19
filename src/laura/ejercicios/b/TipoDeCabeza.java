package laura.ejercicios.b;

public enum TipoDeCabeza {
    P('p'),H('h'),A('a');

    private char cabeza;


    TipoDeCabeza(char cabeza) {
        this.cabeza = cabeza;
    }

    public char getCabeza() {
        return cabeza;
    }
}
