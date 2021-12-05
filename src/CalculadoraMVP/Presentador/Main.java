package CalculadoraMVP.Presentador;

import CalculadoraMVP.Modelo.Ecuacion;
import CalculadoraMVP.Vista.IVCalculadora;
import CalculadoraMVP.Vista.VCalculadora;

public class Main {
      
    public static void main(String[] args) {
        
        IVCalculadora vista = new VCalculadora();
        Ecuacion mEcuacion = new Ecuacion();
        
        Presentador p = new Presentador(vista, mEcuacion);
        
        vista.setPresentador(p);
        vista.iniciar();
    }
      
}
