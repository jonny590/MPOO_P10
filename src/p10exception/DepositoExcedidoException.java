package p10exception;
/**
 * @author Equipo A
 */
public class DepositoExcedidoException extends Exception{
    public DepositoExcedidoException() {
        super("ERROR. No puedes ingresar más de $20,000 por día");
    } 
}
