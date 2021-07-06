package mpoo_p10;
/**
 * @author Equipo A
 */
public class MPOO_P10 {
    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******* Ejercicio 1 *******");
        String mensajes[] = {"primero", "segundo", "tercero"};
        try{
            for (int i = 0; i <= 3; i++) {
                System.out.println(mensajes[i]);
            }
        } catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error, tu apuntador se salió de rango");
        }
        
        System.out.println("\n******* Ejercicio 2 *******");
        int a=99, b=0;
        try{
            int c= a/b;
            System.out.println("C = "+c);
        }catch(ArithmeticException ae){
            System.out.println("Error, no puedes dividir entre cero");
        }finally{
            System.out.println("A pesar de todo, se ejecuta lo de finally");
        }
        
        System.out.println("\n******* Ejercicio 3 *******");
        try{
            int division = miMetodo(10,0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException ae){
            System.out.println("Exceptción aritmetica");
        }
        
        System.out.println("Mi programa sigue vivo");
    }
    
    public static int miMetodo(int a, int b){
        if(b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
    /**
     * @throws miMetodo puede arrojar un error si b es igual a cero
     */
}
