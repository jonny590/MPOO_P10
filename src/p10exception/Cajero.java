package p10exception;
/**
 * @author Equipo A
 */
public class Cajero {
    public static void main(String[] args){
        try {
            Cuenta cuenta = new Cuenta();
            cuenta.getSaldo();
            cuenta.depositar(20000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(4500);
            cuenta.getSaldo();
            cuenta.retirar(2000);
            cuenta.getSaldo();
        } catch (SaldoInsuficienteException sie) {
            System.out.println("No cuentas con el saldo suficiente");
        } catch (DepositoExcedidoException dex) {
            System.out.println("No puedes depositar más de $20,000 al día");
        } catch (MaximoRetirosException mrex) {
            System.out.println("Solo puedes hacer 3 retiros por día");
        }
    }
}
