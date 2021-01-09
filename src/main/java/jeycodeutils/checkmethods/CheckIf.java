package jeycodeutils.checkmethods;

import java.util.Objects;

import jeycodeutils.constants.JCConstants;

/**
 * 
 * @author Javier P�rez Alonso
 *
 *         29 jun. 2020
 *
 */
public final class CheckIf
{

						private CheckIf()
						{}

						/**
						 * 
						 * Method include
						 *
						 * @param data
						 * @return true if data isn't blank
						 */
						public static boolean include(final String data)
						{
												return Objects.nonNull(data) && !data.isBlank();
						}

						/**
						 * 
						 * Method nonInclude
						 *
						 * @param data
						 * @return boolean
						 */
						public static boolean nonInclude(final String data)
						{
												return Objects.isNull(data) || data.isBlank();
						}

						/**
						 * 
						 * Method isPositive, returns a boolean value that determines if the number is
						 * positive.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isPositive(final int number)
						{
												return number > 0;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonPositive(final int number)
						{
												return number <= 0;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonNegative(final int number)
						{
												return number >= 0;
						}

						/**
						 * 
						 * Method isNegative, returns a boolean value that determines if the number is
						 * negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNegative(final int number)
						{
												return number < 0;
						}

						/**
						 * 
						 * Method isPositive, returns a boolean value that determines if the number is
						 * positive.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isPositive(final float number)
						{
												return number > JCConstants.ZERO_FLOAT;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonPositive(final float number)
						{
												return number <= JCConstants.ZERO_FLOAT;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonNegative(final float number)
						{
												return number >= JCConstants.ZERO_FLOAT;
						}

						/**
						 * 
						 * Method isNegative, returns a boolean value that determines if the number is
						 * negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNegative(final float number)
						{
												return number < JCConstants.ZERO_FLOAT;
						}

						/**
						 * 
						 * Method isPositive, returns a boolean value that determines if the number is
						 * positive.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isPositive(final double number)
						{
												return number > JCConstants.ZERO_DOUBLE;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonPositive(final double number)
						{
												return number <= JCConstants.ZERO_DOUBLE;
						}

						/**
						 * 
						 * Method isNonNegative, returns a boolean value that determines if the number
						 * isn't negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNonNegative(final double number)
						{
												return number >= JCConstants.ZERO_DOUBLE;
						}

						/**
						 * 
						 * Method isNegative, returns a boolean value that determines if the number is
						 * negative.
						 *
						 * @param number
						 * @return a boolean.
						 */
						public static boolean isNegative(final double number)
						{
												return number < JCConstants.ZERO_DOUBLE;
						}

						/**
						 * 
						 * Method isEven, returns a boolean value that determines if the number is even.
						 *
						 * @param number to check
						 * @return a boolean.
						 */
						public static boolean isEven(final int number)
						{
												return number % 2 == 0;
						}

						/**
						 * 
						 * Method isOdd, returns a boolean value that determines if the number is odd.
						 *
						 * @param number to check
						 * @return a boolean.
						 */
						public static boolean isOdd(final int number)
						{
												return number % 2 != 0;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is largest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isLargest(final int thisNumber,final int thatNumber)
						{
												return thisNumber > thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is smallest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isSmallest(final int thisNumber,final int thatNumber)
						{
												return thisNumber < thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is largest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isLargest(final byte thisNumber,final byte thatNumber)
						{
												return thisNumber > thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is smallest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isSmallest(final byte thisNumber,final byte thatNumber)
						{
												return thisNumber < thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is largest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isLargest(final float thisNumber,final float thatNumber)
						{
												return thisNumber > thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is smallest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isSmallest(final float thisNumber,final float thatNumber)
						{
												return thisNumber < thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is largest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isLargest(final double thisNumber,final double thatNumber)
						{
												return thisNumber > thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is smallest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isSmallest(final double thisNumber,final double thatNumber)
						{
												return thisNumber < thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is largest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isLargest(final long thisNumber,final long thatNumber)
						{
												return thisNumber > thatNumber;
						}

						/**
						 * 
						 * Method isLargest, returns a boolean value that determines if the thisNumber
						 * is smallest than thatNumber.
						 *
						 * @param thisNumber
						 * @param thatNumber
						 * @return a boolean.
						 */
						public static boolean isSmallest(final long thisNumber,final long thatNumber)
						{
												return thisNumber < thatNumber;
						}

}