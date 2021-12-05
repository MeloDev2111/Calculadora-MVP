package CalculadoraMVP.Modelo;

public class OperacionRestar implements Operacion{

    @Override
    public Ecuacion calcular(Ecuacion ecu) {
        ecu.setResultado( ecu.getA()-ecu.getB() );
        return ecu;
    }
}
