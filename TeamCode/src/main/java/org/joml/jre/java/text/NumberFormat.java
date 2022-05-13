package org.joml.jre.java.text;

/**
 * Modified by Theophilus Eriata for the 15259 GodBot SDK.
 */

public abstract class NumberFormat extends Format
{
    public final String format(double number)
    {
        return Double.toString(number);
    }

    public final String format(long number)
    {
        return Long.toString(number);
    }
}
