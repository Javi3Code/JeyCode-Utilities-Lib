/**
 * 
 */
package jeycodeutils.exceptions;

/**
 * @author Javier Pérez Alonso
 *
 *         24 jun. 2020
 *
 */
public class IncompleteData extends RuntimeException
{

      /**
       * All these constants must be completed with specific information.
       */
      final public static String DEFAULT = "Incomplete Data!";
      final public static String PARAMETER = "The parameter must be completed correctly!, its value can't be null";
      final public static String COPY = "The parameter to copy can't be null";

      /**
       * 
       */
      private static final long serialVersionUID = 192696163562983640L;

      /**
       * Builder
       *
       */
      public IncompleteData()
      {
            super();
      }

      /**
       * Builder
       *
       * @param message
       */
      public IncompleteData(final String message)
      {
            super(message);
      }

}
