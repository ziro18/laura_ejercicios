package laura.ejercicios.b;

public enum Sentido {
    H('h'),A('a');

    private char sentido;

    Sentido(char sentido) {
        this.sentido = sentido;
    }

    public char getSentido() {
        return sentido;
    }
}
