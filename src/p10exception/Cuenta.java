package p10exception;
/**
 * @author Equipo A
 */
public class Cuenta {
    private double saldo;
    private int cont=0;

    public Cuenta() {
    }
/**
 * @param saldo: Saldo actual del usuario
 */
    public Cuenta(double saldo) {
        this.saldo = 0;
    }
    
    public void depositar(double monto) throws DepositoExcedidoException{
        System.out.println("Depositando "+monto);
        if(monto+saldo>20000){
            throw new DepositoExcedidoException();
        }else
            saldo+=monto;
        
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, 
                                                 MaximoRetirosException{
        cont++;
        if(cont>3){
            throw new MaximoRetirosException();
        }else{
            System.out.println("Retirando "+monto);
            if(saldo<monto){
                throw new SaldoInsuficienteException();
            }else{
                saldo-=monto;
            }
        }
    }

    public double getSaldo() {
        System.out.println("Saldo "+saldo);
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}
