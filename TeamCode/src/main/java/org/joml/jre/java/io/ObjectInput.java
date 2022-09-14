package org.joml.jre.java.io;

import java.io.IOException;

/**
 * Modified by Theophilus Eriata for the 15259 GodBot SDK.
 */

public interface ObjectInput extends DataOutput
{

  double readDouble() throws IOException;

  float readFloat() throws IOException;

  int readInt() throws IOException;

}
