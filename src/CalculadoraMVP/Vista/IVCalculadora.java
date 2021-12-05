package CalculadoraMVP.Vista;

import CalculadoraMVP.Presentador.Presentador;

public interface IVCalculadora {
    
    public void setPresentador(Presentador p);
    public void iniciar();
    public double getEntrada();
    public void setSalida(String valorResultado, String valorGuardado);
}
