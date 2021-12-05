package CalculadoraMVP.Modelo;

public class Ecuacion {
    private double a = 0;
    private double b = 0;
    private double resultado;
    private TiposOperador operador = TiposOperador.SUMA;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public TiposOperador getOperador() {
        return operador;
    }

    public void setOperador(TiposOperador operador) {
        this.operador = operador;
    }
    
}
