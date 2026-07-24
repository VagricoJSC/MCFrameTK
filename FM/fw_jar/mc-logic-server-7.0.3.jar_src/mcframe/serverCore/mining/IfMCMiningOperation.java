/*
 * Decompiled with CFR 0.152.
 */
package mcframe.serverCore.mining;

import java.io.File;

public interface IfMCMiningOperation {
    public void setMiningDirForDL(File var1);

    public void setMiningColumnForDL(String[] var1);

    public File getMiningFileForDL();
}

