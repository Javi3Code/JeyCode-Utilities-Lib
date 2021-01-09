package jeycodeutils.strmethods;

import java.util.StringTokenizer;

/**
 * 
 * @author Javier Perez Alonso
 * @version 1.0 A�o 2020
 *
 */
public final class StringUtils
{

      private StringUtils()
      {}

 // @formatter:off
						public static String removeTildes(String modificable) 
						{
												modificable = modificable.replace("Á","A").replace("á","a")
																																			 	.replace("É","E").replace("é","e")
																																				 .replace("Í","I").replace("í","i")
																																					.replace("Ó","O").replace("ó","o")
																																					.replace("Ú","U").replace("ú","u");
												return modificable;
						}   
   
						public static String getWithProperNomFormatThis(final String token) 
						{
												return token.toUpperCase().charAt(0) + token.substring(1,token.length()).toLowerCase();
						}

						public static String getWithProperNomFormattthis(final String setOfTokens) 
						{
												final var tokens = new StringTokenizer(setOfTokens);
												final var chainFormatted = new StringBuilder();
												while (tokens.hasMoreTokens()) { 
																		chainFormatted.append(getWithProperNomFormatThis(tokens.nextToken()+" "));
																		chainFormatted.trimToSize();
												}
												return chainFormatted.toString();
						}// @formatter:on
}
