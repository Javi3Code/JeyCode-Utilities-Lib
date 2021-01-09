package jeycodeutils.exceptions;

public class FilePersistenceException extends RuntimeException
{

						private static final long serialVersionUID = 1L;
						public static String R_ERROR = "Error en la fase de lectura";
						public static String W_ERROR = "Error en la fase de escritura";

						public FilePersistenceException(String errorMessage)
						{
												super(errorMessage);
						} 

}
