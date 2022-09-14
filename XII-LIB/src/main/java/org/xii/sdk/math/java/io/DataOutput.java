package org.xii.sdk.math.java.io;

import java.io.IOException;

/**
 * Modified by Theophilus Eriata for the 15259 GodBot SDK.
 */

public interface DataOutput
{
  void writeInt(int value) throws IOException;

  void writeFloat(float value) throws IOException;

  void writeDouble(double value) throws IOException;
}
