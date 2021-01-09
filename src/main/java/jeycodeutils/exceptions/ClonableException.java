/**
 * 
 */
package jeycodeutils.exceptions;



/**
 * @author Javier Pérez Alonso
 *
 *         31 may. 2020
 *
 */
public final class ClonableException extends RuntimeException {

						/**
						 * 
						 */
						private static final long serialVersionUID = 421760521744541449L;

						/**
						 * Builder
						 *
						 */
						public ClonableException() {super();}

						/**
						 * Builder
						 *
						 * @param message
						 */
						public ClonableException(final String message) { super(message); }

						protected Integer version;

						public Integer getVersion() { return version; }

						public void setVersion(final Integer version) { this.version = version; }


}
