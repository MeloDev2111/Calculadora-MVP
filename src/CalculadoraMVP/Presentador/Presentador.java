package CalculadoraMVP.Presentador;
import CalculadoraMVP.Modelo.*;
import CalculadoraMVP.Vista.IVCalculadora;

public class Presentador {
    private IVCalculadora vista;
    private Ecuacion mEcuacion;
    private Operacion oper;
    private Ecuacion temp = new Ecuacion();
    private boolean ayuda=true;

    public Presentador(IVCalculadora vista, Ecuacion mEcuacion) {
        this.vista = vista;
        this.mEcuacion = mEcuacion;
    }
       
    public void guardar(){
        temp.setResultado(mEcuacion.getResultado());
        vista.setSalida(null,String.valueOf(temp.getResultado()));
    }
    
    public void cargar(){
        vista.setSalida(String.valueOf(temp.getResultado()),null);
    }
    public void calcular(){
        establecerOperador();
        if (ayuda) {
            mEcuacion.setA(vista.getEntrada());
            ayuda=false;
        }else{
            mEcuacion.setB(vista.getEntrada());
            mEcuacion = oper.calcular(mEcuacion);
            
            vista.setSalida(String.valueOf(mEcuacion.getResultado()), null);
            ayuda=true;
        }
        
    }
    public void sumar(){
        mEcuacion.setOperador(TiposOperador.SUMA);
        calcular();
    }
    
    public void restar(){
        mEcuacion.setOperador(TiposOperador.RESTA);
        calcular();
    }
    
    public void multiplicar(){
        mEcuacion.setOperador(TiposOperador.MULTIPLICACION);
        calcular();
    }
    
    public void dividir(){
        mEcuacion.setOperador(TiposOperador.DIVISION);
        establecerOperador();
        
        if (ayuda) {
            mEcuacion.setA(vista.getEntrada());
            ayuda=false;
        }else{
            if (vista.getEntrada()!=0) {
                mEcuacion.setB(vista.getEntrada());
                mEcuacion = oper.calcular(mEcuacion);
                ayuda=true;
                vista.setSalida(String.valueOf(mEcuacion.getResultado()), null);
            }else{
                System.out.println("DIVISOR NO PUEDE SER 0");
            }
            
        }
    }
    public void refresh(){
        mEcuacion = new Ecuacion();
        ayuda=true;
        vista.setSalida("0", null);
    }
    
    private void establecerOperador(){
        switch (mEcuacion.getOperador()) {
            case SUMA:
                oper= new OperacionSumar();
                break;
            case RESTA:
                oper= new OperacionRestar();
                break;
            case DIVISION:
                oper= new OperacionDividir();
                break;
            case MULTIPLICACION:
                oper= new OperacionMultiplicar();
                break;
            default:
                System.out.println("OPERADOR NO DECLARADO");;
        }
    }
}
