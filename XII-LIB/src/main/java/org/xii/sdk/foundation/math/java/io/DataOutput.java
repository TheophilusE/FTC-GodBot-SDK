package org.xii.sdk.foundation.math.java.io;

import java.io.IOException;

/**
 * Modified by Theophilus Eriata for the GodBot SDK.
 */

public interface DataOutput
{
  void writeInt(int value) throws IOException;

  void writeFloat(float value) throws IOException;

  void writeDouble(double value) throws IOException;
}
