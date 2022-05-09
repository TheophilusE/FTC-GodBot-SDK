package org.firstinspires.ftc.teamcode.math;

import java.util.Random;

/**
 * <code>FMath</code> provides 'fast' math approximations and float
 * equivalents of Math functions. These are all used as static values and
 * functions.
 *
 * @author Theophilus Eriata
 * @version 1.0
 */
final public class FMath
{
    /**
     * A "close to zero" double epsilon value for use
     */
    public static final double DBL_EPSILON = 2.220446049250313E-16d;
    /**
     * A "close to zero" float epsilon value for use
     */
    public static final float FLT_EPSILON = 1.1920928955078125E-7f;
    /**
     * A "close to zero" floating point epsilon value for use
     */
    public static final double ZERO_TOLERANCE = 0.0001;
    public static final double ONE_THIRD = 1.0 / 3.0;
    public static final double TAU = Math.PI * 2.0;
    public static final double HALF_TAU = Math.PI;
    public static final double QUARTER_TAU = Math.PI / 2.0;
    public static final double INVERSE_TAU = 1.0 / Math.PI;
    /**
     * The value PI as a floating point value. (180 degrees)
     */
    public static final double PI = Math.PI;
    /**
     * The value 2PI as a floating point value. (360 degrees)
     */
    public static final double TWO_PI = 2.0 * PI;
    /**
     * The value PI/2 as a floating point value. (90 degrees)
     */
    public static final double HALF_PI = 0.5 * PI;
    /**
     * The value PI/4 as a floating point value. (45 degrees)
     */
    public static final double QUARTER_PI = 0.25 * PI;
    /**
     * The value 1/PI as a floating point value.
     */
    public static final double INV_PI = 1.0 / PI;
    /**
     * The value 1/(2PI) as a floating point value.
     */
    public static final double INV_TWO_PI = 1.0 / TWO_PI;
    /**
     * A value to multiply a degree value by, to convert it to radians.
     */
    public static final double DEG_TO_RAD = PI / 180.0;
    /**
     * A value to multiply a radian value by, to convert it to degrees.
     */
    public static final double RAD_TO_DEG = 180.0 / PI;
    /**
     * A precreated random object for random numbers.
     */
    public static final Random rand = new Random(System.currentTimeMillis());

    /**
     * Construct
     */
    private FMath()
    {
    }

    /**
     * Returns the floating point value of a double precision value.
     */
    public static float castToFloat(double value)
    {
        return (float) value;
    }

    /**
     * Returns true if the absolute value difference of a and b is within epsilon.
     */
    public static boolean isWithinEpsilon(float a, float b, float epsilon)
    {
        return Math.abs(a - b) <= epsilon;
    }

    /**
     * Returns true if the absolute value of a and b is within the zero tolerance epsilon value.
     */
    public static boolean isWithinEpsilon(float a, float b)
    {
        return isWithinEpsilon(a, b, ZERO_TOLERANCE);
    }

    /**
     * Returns true if the absolute value difference of a and b is within epsilon.
     */
    public static boolean isWithinEpsilon(double a, double b, double epsilon)
    {
        return Math.abs(a - b) <= epsilon;
    }

    /**
     * Returns true if the absolute value of a and b is within the zero tolerance epsilon value.
     */
    public static boolean isWithinEpsilon(double a, double b)
    {
        return isWithinEpsilon(a, b, ZERO_TOLERANCE);
    }
}
