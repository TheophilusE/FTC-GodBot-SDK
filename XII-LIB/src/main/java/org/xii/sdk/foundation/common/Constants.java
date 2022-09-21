package org.xii.sdk.foundation.common;

public class Constants
{
  /// Conversion unit for milliseconds to seconds
  public static final float MILLISECONDS_TO_SECONDS = 10E-3f;
  /// Conversion unit for seconds to milliseconds
  public static final float SECONDS_TO_MILLISECONDS = 10E3f;

  /*
   * Convert milliseconds to seconds
   */
  public static double getMillisecondsToSeconds(double milliseconds)
  {
    return milliseconds * MILLISECONDS_TO_SECONDS;
  }

  /*
   * Convert milliseconds to seconds
   */
  public static float getMillisecondsToSeconds(float milliseconds)
  {
    return milliseconds * MILLISECONDS_TO_SECONDS;
  }

  /*
   * Convert seconds to milliseconds
   */
  public static double getSecondsToMilliseconds(double seconds)
  {
    return seconds * SECONDS_TO_MILLISECONDS;
  }

  /*
   * Convert seconds to milliseconds
   */
  public static float getSecondsToMilliseconds(float seconds)
  {
    return seconds * SECONDS_TO_MILLISECONDS;
  }
}
