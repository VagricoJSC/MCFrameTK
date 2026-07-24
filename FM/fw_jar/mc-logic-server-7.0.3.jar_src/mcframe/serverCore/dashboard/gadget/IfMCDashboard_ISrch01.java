/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCContainer
 *  mcframe.commonCore.container.MCList
 *  mcframe.serverCore.logic.IfMCOperation
 */
package mcframe.serverCore.dashboard.gadget;

import mcframe.commonCore.container.MCContainer;
import mcframe.commonCore.container.MCList;
import mcframe.serverCore.dashboard.gadget.Cnd0R;
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R;
import mcframe.serverCore.logic.IfMCOperation;

public interface IfMCDashboard_ISrch01
extends IfMCOperation {
    public static final String DEFAULT_MODULE_ID = "FC";
    public static final String DEFAULT_LOGIC_ID = "FCBAL0030";
    public static final String DEFAULT_OPERATION_ID = "ISrch01";

    public MCContainer up(int var1);

    public MCContainer down(int var1);

    public Cnd0R up0();

    public MCList<Prop_Rslt0R> down0();
}

