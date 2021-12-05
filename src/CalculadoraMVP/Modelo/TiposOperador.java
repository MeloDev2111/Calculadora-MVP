package CalculadoraMVP.Modelo;

public enum TiposOperador {
    SUMA('S'),RESTA('R'),MULTIPLICACION('M'),DIVISION('D'),FACTORIAL('F');
    private char caracter;
    
    TiposOperador(char c){
        this.caracter=c;
    }

    public char getCaracter() {
        return caracter;
    }
}
