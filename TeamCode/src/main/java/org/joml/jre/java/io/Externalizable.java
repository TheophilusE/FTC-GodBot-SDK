package org.joml.jre.java.io;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Modified by Theophilus Eriata for the 15259 GodBot SDK.
 */

public interface Externalizable extends java.io.Serializable
{
    void writeExternal(ObjectOutput out) throws IOException;

    void readExternal(ObjectInput in) throws IOException, ClassNotFoundException;
}
