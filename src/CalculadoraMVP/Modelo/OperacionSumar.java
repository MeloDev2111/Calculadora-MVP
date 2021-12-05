package CalculadoraMVP.Modelo;

public class OperacionSumar implements Operacion{

    @Override
    public Ecuacion calcular(Ecuacion ecu) {
        ecu.setResultado( ecu.getA()+ecu.getB() );
        return ecu;
    }
    
}
