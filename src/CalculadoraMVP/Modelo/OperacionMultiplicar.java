package CalculadoraMVP.Modelo;

public class OperacionMultiplicar implements Operacion{

    @Override
    public Ecuacion calcular(Ecuacion ecu) {
        ecu.setResultado( ecu.getA()*ecu.getB() );
        return ecu;
    }
}
