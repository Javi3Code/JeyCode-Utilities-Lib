package jeycodeutils.chronomethods;

public final class Chrono
{

						private Chrono()
						{}

						public static long onMillis()
						{
												return System.currentTimeMillis();
						}

						public static void offMillis(final String message,final long startTime)
						{
												final var finishTime = System.currentTimeMillis() - startTime;
												System.out.println(message + finishTime);
						}

						public static long onNanos()
						{
												return System.nanoTime();
						}

						public static void offNanos(final String message,final long startTime)
						{
												final var finishTime = System.nanoTime() - startTime;
												System.out.println(message + finishTime);
						}

}
