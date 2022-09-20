package org.xii.sdk.foundation.math.java.io;

import java.io.IOException;

/**
 * Modified by Theophilus Eriata for the GodBot SDK.
 */

public interface ObjectInput extends DataOutput
{

  double readDouble() throws IOException;

  float readFloat() throws IOException;

  int readInt() throws IOException;

}
