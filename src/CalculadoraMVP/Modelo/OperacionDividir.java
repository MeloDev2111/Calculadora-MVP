package CalculadoraMVP.Modelo;

public class OperacionDividir implements Operacion{

    @Override
    public Ecuacion calcular(Ecuacion ecu) {
        assert(ecu.getB()>0):"Importe Incorrecto, debe ser mayor a 0";
        
        ecu.setResultado( ecu.getA()/ecu.getB() );
        return ecu;
    }
}
