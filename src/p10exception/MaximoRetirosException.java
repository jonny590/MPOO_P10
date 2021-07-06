package p10exception;
/**
 * @author Equipo A
 */
public class MaximoRetirosException extends Exception{
    public MaximoRetirosException() {
        super("ERROR. Solo puedes hacer 3 retiros por día");
    }
}
