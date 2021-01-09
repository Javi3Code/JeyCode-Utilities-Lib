/**
 * 
 */
package jeycodeutils.heapmethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.ManagementFactory;

/**
 * @author Javier P�rez Alonso
 *
 *         28 jun. 2020
 *
 */
public final class Heap
{

      private Heap()
      {}

      public static void heapHistory()
      {
            final var name = ManagementFactory.getRuntimeMXBean()
                                              .getName();
            final var PID = name.substring(0,name.indexOf("@"));
            try
            {
                  final var process = Runtime.getRuntime()
                                             .exec("jcmd " + PID + " GC.class_histogram");
                  try (var binput = new BufferedReader(new InputStreamReader(process.getInputStream())))
                  {
                        binput.lines()
                              .forEach(System.out::println);
                        binput.close();
                  }
            }
            catch (final IOException e1)
            {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
            }

      }

      public static void heapHistory(final int limit)
      {
            final var name = ManagementFactory.getRuntimeMXBean()
                                              .getName();
            final var PID = name.substring(0,name.indexOf("@"));
            try
            {
                  final var process = Runtime.getRuntime()
                                             .exec("jcmd " + PID + " GC.class_histogram");
                  try (var binput = new BufferedReader(new InputStreamReader(process.getInputStream())))
                  {
                        binput.lines()
                              .limit(limit)
                              .forEach(System.out::println);
                        binput.close();
                  }
            }
            catch (final IOException e1)
            {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
            }

      }

}
