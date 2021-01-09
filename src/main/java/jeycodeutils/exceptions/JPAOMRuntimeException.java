/**
 * 
 */
package jeycodeutils.exceptions;

/**
 * @author Javier Pérez Alonso
 *
 *         19 jul. 2020
 *
 */
public class JPAOMRuntimeException extends RuntimeException
{

						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						/**
						 * Builder
						 *
						 */
						public JPAOMRuntimeException()
						{
												super();
						}

						public JPAOMRuntimeException(final String message)
						{
												super(message);
						}

}
