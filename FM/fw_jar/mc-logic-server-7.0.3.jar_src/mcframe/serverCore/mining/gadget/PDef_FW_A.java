/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.param.MCBlockDef
 *  mcframe.commonCore.param.MCContainerDef
 *  mcframe.commonCore.param.MCDef
 *  mcframe.commonCore.param.MCGeneralContainerDef
 *  mcframe.commonCore.param.MCItemDef
 *  mcframe.commonCore.param.MCOperationInfo
 */
package mcframe.serverCore.mining.gadget;

import mcframe.commonCore.param.MCBlockDef;
import mcframe.commonCore.param.MCContainerDef;
import mcframe.commonCore.param.MCDef;
import mcframe.commonCore.param.MCGeneralContainerDef;
import mcframe.commonCore.param.MCItemDef;
import mcframe.commonCore.param.MCOperationInfo;
import mcframe.serverCore.mining.gadget.PDef;

public abstract class PDef_FW_A
extends MCDef {
    static final MCOperationInfo FC_FCBAL0040_Srch01_INFO = new MCOperationInfo("FC", "FCBAL0040", "Srch01", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBAL0040_Srch02_INFO = new MCOperationInfo("FC", "FCBAL0040", "Srch02", "000000", (MCDef)new PDef());
    static final MCOperationInfo FC_FCBAL0040_Srch03_INFO = new MCOperationInfo("FC", "FCBAL0040", "Srch03", "000000", (MCDef)new PDef());

    public MCContainerDef getCustomDef(String id) {
        if (id == null) {
            return null;
        }
        if (id.equals("FC.FCBAL0040.Srch01.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch01_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0040.Srch01.DOWN.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch01_DOWN_BLOCK0();
        }
        if (id.equals("FC.FCBAL0040.Srch02.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch02_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0040.Srch02.UP.BLOCK1")) {
            return PDef_FW_A.FC_FCBAL0040_Srch02_UP_BLOCK1();
        }
        if (id.equals("FC.FCBAL0040.Srch02.DOWN.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch02_DOWN_BLOCK0();
        }
        if (id.equals("FC.FCBAL0040.Srch03.UP.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch03_UP_BLOCK0();
        }
        if (id.equals("FC.FCBAL0040.Srch03.UP.BLOCK1")) {
            return PDef_FW_A.FC_FCBAL0040_Srch03_UP_BLOCK1();
        }
        if (id.equals("FC.FCBAL0040.Srch03.DOWN.BLOCK0")) {
            return PDef_FW_A.FC_FCBAL0040_Srch03_DOWN_BLOCK0();
        }
        return null;
    }

    public static MCContainerDef FC_FCBAL0040_Srch01_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch01", new MCItemDef[]{MCItemDef.create((String)"devtype", (boolean)true, (String)"devtype"), MCItemDef.create((String)"gadget", (String)"gadget")}, MCBlockDef.create((String)"Prop_Cnd0"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch01_DOWN_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch01", new MCItemDef[]{MCItemDef.create((String)"gadget", (String)"gadget"), MCItemDef.create((String)"key", (boolean)true, (String)"key"), MCItemDef.create((String)"value", (String)"value")}, MCBlockDef.create((String)"Prop_Rslt0"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch02_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch02", new MCItemDef[]{MCItemDef.create((String)"devtype", (boolean)true, (String)"devtype"), MCItemDef.create((String)"gadget", (String)"gadget")}, MCBlockDef.create((String)"Data_Cnd0"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch02_UP_BLOCK1() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch02", new MCItemDef[]{MCItemDef.create((String)"item", (boolean)true, (String)"item"), MCItemDef.create((String)"strval", (String)"strval"), MCItemDef.create((String)"numval", (String)"numval"), MCItemDef.create((String)"booval", (String)"booval"), MCItemDef.create((String)"dtval", (String)"dtval"), MCItemDef.create((String)"tsval", (String)"tsval"), MCItemDef.create((String)"binval", (String)"binval")}, MCBlockDef.create((String)"Data_Cnd1"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch02_DOWN_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch02", new MCItemDef[]{MCItemDef.create((String)"item", (boolean)true, (String)"item"), MCItemDef.create((String)"strval", (String)"strval"), MCItemDef.create((String)"numval", (String)"numval"), MCItemDef.create((String)"booval", (String)"booval"), MCItemDef.create((String)"dtval", (String)"dtval"), MCItemDef.create((String)"tsval", (String)"tsval"), MCItemDef.create((String)"binval", (String)"binval")}, MCBlockDef.create((String)"Data_Rslt0"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch03_UP_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch03", new MCItemDef[]{MCItemDef.create((String)"devtype", (boolean)true, (String)"devtype"), MCItemDef.create((String)"gadget", (String)"gadget")}, MCBlockDef.create((String)"List_Cnd0"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch03_UP_BLOCK1() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch03", new MCItemDef[]{MCItemDef.create((String)"item", (boolean)true, (String)"item")}, MCBlockDef.create((String)"List_Cnd1"));
    }

    public static MCContainerDef FC_FCBAL0040_Srch03_DOWN_BLOCK0() {
        return new MCGeneralContainerDef("FC", "FCBAL0040", "Srch03", new MCItemDef[]{MCItemDef.create((String)"item", (boolean)true, (String)"item"), MCItemDef.create((String)"value", (String)"value"), MCItemDef.create((String)"name", (String)"name"), MCItemDef.create((String)"parent", (String)"parent"), MCItemDef.create((String)"key", (String)"key")}, MCBlockDef.create((String)"List_Rslt0"));
    }
}

