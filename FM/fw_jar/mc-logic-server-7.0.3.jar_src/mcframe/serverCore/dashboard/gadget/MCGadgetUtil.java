/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  mcframe.commonCore.container.MCList
 *  mcframe.commonCore.container.MCRow
 *  mcframe.commonCore.lang.MCBinary
 *  mcframe.commonCore.lang.MCBooleanUtil
 *  mcframe.commonCore.lang.MCDate
 *  mcframe.commonCore.lang.MCNumber
 *  mcframe.commonCore.lang.MCStringUtil$IndexBindSource
 *  mcframe.commonCore.lang.MCTimestamp
 *  mcframe.commonCore.notice.MCMessage
 *  mcframe.commonCore.resource.MCLabelConst
 *  mcframe.commonCore.resource.MCLocaleConst
 *  mcframe.serverCore.logic.MCOperation
 *  mcframe.serverCore.resource.MCAppConst
 *  mcframe.serverCore.resource.MCConfig
 *  mcframe.serverCore.resource.MCConst
 *  mcframe.serverCore.sys.MCSys
 */
package mcframe.serverCore.dashboard.gadget;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCBooleanUtil;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCStringUtil;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCMessage;
import mcframe.commonCore.resource.MCLabelConst;
import mcframe.commonCore.resource.MCLocaleConst;
import mcframe.serverCore.dashboard.MCDashboardUtil;
import mcframe.serverCore.dashboard.gadget.Data_Cnd0R;
import mcframe.serverCore.dashboard.gadget.Data_Rslt0R;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch01;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch02;
import mcframe.serverCore.dashboard.gadget.IfMCDashboard_ISrch03;
import mcframe.serverCore.dashboard.gadget.List_Rslt0R;
import mcframe.serverCore.dashboard.gadget.Prop_Rslt0R;
import mcframe.serverCore.logic.MCOperation;
import mcframe.serverCore.resource.MCAppConst;
import mcframe.serverCore.resource.MCConfig;
import mcframe.serverCore.resource.MCConst;
import mcframe.serverCore.sys.MCSys;

public class MCGadgetUtil
extends MCDashboardUtil {
    public static Table.Property tableProperty(IfMCDashboard_ISrch01 srch01) {
        return new Table.Property(srch01);
    }

    public static Table.Data tableData(IfMCDashboard_ISrch02 srch02) {
        return new Table.Data(srch02);
    }

    public static Table.List tableList(IfMCDashboard_ISrch03 srch03) {
        return new Table.List(srch03);
    }

    public static Chart.Property chartProperty(IfMCDashboard_ISrch01 srch01) {
        return new Chart.Property(srch01);
    }

    public static Chart.Data chartData(IfMCDashboard_ISrch02 srch02) {
        return new Chart.Data(srch02);
    }

    public static Chart.Data chartData(MCList<Data_Rslt0R> dataL) {
        return new Chart.Data(dataL);
    }

    public static Chart.List chartList(IfMCDashboard_ISrch03 srch03) {
        return new Chart.List(srch03);
    }

    public static Label.Property labelProperty(IfMCDashboard_ISrch01 srch01) {
        return new Label.Property(srch01);
    }

    public static Label.Data labelData(IfMCDashboard_ISrch02 srch02) {
        return new Label.Data(srch02);
    }

    public static Label.List labelList(IfMCDashboard_ISrch03 srch03) {
        return new Label.List(srch03);
    }

    public static IconLabel.Property iconLabelProperty(IfMCDashboard_ISrch01 srch01) {
        return new IconLabel.Property(srch01);
    }

    public static IconLabel.Data iconLabelData(IfMCDashboard_ISrch02 srch02) {
        return new IconLabel.Data(srch02);
    }

    public static IconLabel.List iconLabelList(IfMCDashboard_ISrch03 srch03) {
        return new IconLabel.List(srch03);
    }

    private MCGadgetUtil() {
    }

    /* synthetic */ MCGadgetUtil(MCGadgetUtil mCGadgetUtil) {
        this();
    }

    public static class Chart
    extends MCGadgetUtil {
        public Chart() {
            super(null);
        }

        public static class Data
        extends CommonData {
            protected Data(IfMCDashboard_ISrch02 srch02) {
                super(srch02);
            }

            protected Data(MCList<Data_Rslt0R> dataL) {
                super(dataL);
            }

            public void setValue(int row, int column, MCNumber value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setValue(int row, int column, int value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setValue(int row, int column, long value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setValue(int row, int column, float value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setValue(int row, int column, double value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setRowLabel(String ... texts) {
                this.addDataRow("rowlabel", Chart.arrayData((String[])texts));
            }

            public void setColumnLabel(String ... texts) {
                this.addDataRow("columnlabel", Chart.arrayData((String[])texts));
            }

            public void setRowTitle(String text) {
                this.addDataRow("rowtitle", text);
            }

            public void setColumnTitle(String text) {
                this.addDataRow("columntitle", text);
            }
        }

        public static class List
        extends CommonList {
            protected List(IfMCDashboard_ISrch03 srch03) {
                super(srch03);
            }
        }

        public static class Property
        extends CommonProperty {
            protected Property(IfMCDashboard_ISrch01 srch01) {
                super(srch01, "chart");
            }

            public void setChartType(String ... types) {
                this.addPropertyRow("charttype", Chart.arrayData((String[])types));
            }

            public void setChartColor(String ... colors) {
                this.addPropertyRow("chartcolor", Chart.arrayData((String[])colors));
            }

            public void setRowLabel(String ... texts) {
                this.addPropertyRow("rowlabel", Chart.arrayData((String[])texts));
            }

            public void setColumnLabel(String ... texts) {
                this.addPropertyRow("columnlabel", Chart.arrayData((String[])texts));
            }

            public void setRowTitle(String text) {
                this.addPropertyRow("rowtitle", text);
            }

            public void setColumnTitle(String text) {
                this.addPropertyRow("columntitle", text);
            }
        }
    }

    public static class CommonData {
        private Map<String, Data_Rslt0R> _keyMap = new HashMap<String, Data_Rslt0R>();
        private MCList<Data_Rslt0R> _dataL = null;

        protected CommonData(IfMCDashboard_ISrch02 srch02) {
            this(srch02.down0());
        }

        protected CommonData(MCList<Data_Rslt0R> dataL) {
            this._dataL = dataL;
        }

        public String getCondString(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.strval() : null;
        }

        public MCNumber getCondNumber(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.numval() : null;
        }

        public boolean getCondBoolean(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.booval() : false;
        }

        public MCDate getCondDate(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.dtval() : null;
        }

        public MCTimestamp getCondTimestamp(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.tsval() : null;
        }

        public MCBinary getCondBinary(MCList<Data_Cnd0R> cndL, String col) {
            Data_Cnd0R cnd0R = (Data_Cnd0R)cndL.getFirst("item", (Comparable)((Object)col));
            return cnd0R != null ? cnd0R.binval() : null;
        }

        private Data_Rslt0R addDataRow(String key) {
            if (this._dataL == null) {
                return null;
            }
            Data_Rslt0R oldR = this._keyMap.get(key);
            if (oldR != null) {
                this._dataL.remove((Object)oldR);
            }
            Data_Rslt0R dataR = (Data_Rslt0R)this._dataL.createRow();
            dataR.item(key);
            this._dataL.add((MCRow)dataR);
            this._keyMap.put(key, dataR);
            return dataR;
        }

        public void addDataRow(String key, String value) {
            Data_Rslt0R dataR = this.addDataRow(key);
            if (dataR != null) {
                dataR.strval(value);
            }
        }

        public void addDataRow(String key, MCNumber value) {
            Data_Rslt0R dataR = this.addDataRow(key);
            if (dataR != null) {
                dataR.numval(value);
            }
        }

        public void addDataRow(String key, int value) {
            this.addDataRow(key, MCNumber.valueOf((int)value));
        }

        public void addDataRow(String key, long value) {
            this.addDataRow(key, MCNumber.valueOf((long)value));
        }

        public void addDataRow(String key, float value) {
            this.addDataRow(key, MCNumber.valueOf((float)value));
        }

        public void addDataRow(String key, double value) {
            this.addDataRow(key, MCNumber.valueOf((double)value));
        }

        public void addDataRow(String key, boolean value) {
            Data_Rslt0R dataR = this.addDataRow(key);
            if (dataR != null) {
                dataR.booval(value);
            }
        }

        public void addDataRow(String key, MCDate value) {
            Data_Rslt0R dataR = this.addDataRow(key);
            if (dataR != null) {
                dataR.dtval(value);
            }
        }

        public void addDataRow(String key, MCTimestamp value) {
            Data_Rslt0R dataR = this.addDataRow(key);
            if (dataR != null) {
                dataR.tsval(value);
            }
        }

        protected Data_Rslt0R removeDataRow(String key) {
            if (this._dataL == null) {
                return null;
            }
            Data_Rslt0R oldR = this._keyMap.remove(key);
            if (oldR != null) {
                this._dataL.remove((Object)oldR);
            }
            return oldR;
        }

        protected String valueKey(int ... indexs) {
            return MCGadgetUtil.indexKey((String)"value", (int[])indexs);
        }

        public void setTitle(String title) {
            if (title != null) {
                this.addDataRow("title", title);
            }
        }

        public void setColorFG(String color) {
            this.addDataRow("color.fg", MCGadgetUtil.colorData((String)color));
        }

        public void setColorFG(int r, int g, int b) {
            this.addDataRow("color.fg", MCGadgetUtil.colorData((int)r, (int)g, (int)b));
        }

        public void setColorBG(String color) {
            this.addDataRow("color.bg", MCGadgetUtil.colorData((String)color));
        }

        public void setColorBG(int r, int g, int b) {
            this.addDataRow("color.bg", MCGadgetUtil.colorData((int)r, (int)g, (int)b));
        }

        public void setFontSize(String size) {
            this.addDataRow("font.size", size);
        }

        public void setUpdateDate(MCDate date) {
            this.addDataRow("date.update", date);
        }
    }

    public static class CommonList {
        private Map<String, List_Rslt0R> _keyMap = new HashMap<String, List_Rslt0R>();
        private MCList<List_Rslt0R> _listL = null;

        protected CommonList(IfMCDashboard_ISrch03 srch03) {
            this._listL = srch03.down0();
        }

        public void addRow(String column, String value, String name) {
            if (this._listL == null) {
                return;
            }
            String key = String.valueOf(value) + "@" + column;
            List_Rslt0R oldR = this._keyMap.get(key);
            if (oldR != null) {
                this._listL.remove((Object)oldR);
            }
            List_Rslt0R listR = (List_Rslt0R)this._listL.createRow();
            listR.item(column);
            listR.value(value);
            listR.name(name);
            this._listL.add((MCRow)listR);
            this._keyMap.put(key, listR);
        }

        public void addRow(String column, String valuecol, String namecol, MCList<?> list) {
            if (this._listL == null || list == null) {
                return;
            }
            for (MCRow row : list) {
                this.addRow(column, row.getString(valuecol), row.getString(namecol));
            }
        }
    }

    public static class CommonProperty {
        private String _gadget = null;
        private String _type = null;
        private String _devtype = null;
        private MCList<Prop_Rslt0R> _propL = null;
        private Map<String, Prop_Rslt0R> _keyMap = new HashMap<String, Prop_Rslt0R>();
        private int _condcnt = 0;
        private int _paramcnt = 0;

        protected CommonProperty(IfMCDashboard_ISrch01 srch01, String type) {
            this._devtype = srch01.up0().devtype();
            this._type = type;
            this._propL = srch01.down0();
            this.change(((MCOperation)srch01).getOperationInfo().logicId);
            this.setResourceProperty();
        }

        public void change(String gadget) {
            this._gadget = gadget;
            this.resetCounter();
            this.addPropertyRow("gadget", this._gadget);
            this.setType(this._type);
        }

        protected void resetCounter() {
            this._condcnt = 0;
            this._paramcnt = 0;
        }

        protected String getResourceBase(String gadget) {
            return MCConfig.createKey((String[])new String[]{"gadget.class", gadget, "property"});
        }

        public void setResourceProperty() {
            this.setResourceProperty(this._gadget);
        }

        public void setResourceProperty(String gadget) {
            String devkey = null;
            switch (this._devtype) {
                case "0": {
                    devkey = "PC";
                    break;
                }
                case "1": 
                case "2": {
                    devkey = "MD";
                    break;
                }
            }
            String base = this.getResourceBase(gadget);
            this.addResourceProperty(base);
            if (devkey != null) {
                base = MCConst.createKey((String[])new String[]{base, devkey});
                this.addResourceProperty(base);
            }
        }

        private void addResourceProperty(String base) {
            String[] labelkeys;
            String[] keys;
            String val = null;
            int baselen = base.length() + 1;
            MCAppConst app = MCConst.app;
            String[] stringArray = keys = app.findKeys(MCConst.createKey((String[])new String[]{base, "**"}));
            int n = keys.length;
            int n2 = 0;
            while (n2 < n) {
                String key = stringArray[n2];
                val = app.getString(key);
                this._addResourceProperty(key, val, baselen);
                ++n2;
            }
            MCLabelConst label = MCLocaleConst.label((Locale)MCSys.user.locale());
            String[] stringArray2 = labelkeys = label.findKeys(MCConst.createKey((String[])new String[]{base, "**"}));
            int n3 = labelkeys.length;
            int n4 = 0;
            while (n4 < n3) {
                String key = stringArray2[n4];
                if (this.isLabelPropKey(key)) {
                    val = label.getLabel(key);
                    this._addResourceProperty(key, val, baselen);
                }
                ++n4;
            }
        }

        private boolean isLabelPropKey(String key) {
            return key.endsWith("name") || key.endsWith("title") || key.endsWith("description") || key.endsWith("locmapName") || key.endsWith("columnlabel") || key.endsWith("rowlabel") || key.endsWith("cornerlabel") || key.endsWith("prefix") || key.endsWith("suffix") || key.endsWith("columntitle") || key.endsWith("rowtitle");
        }

        private void _addResourceProperty(String key, String val, int baselen) {
            if (val != null && !(key = key.substring(baselen)).startsWith("PC") && !key.startsWith("MD")) {
                this.addPropertyRow(key, val);
            }
        }

        public void addPropertyRow(String key, String value) {
            if (this._propL == null) {
                return;
            }
            String gkey = String.valueOf(key) + "@" + this._gadget;
            Prop_Rslt0R oldR = this._keyMap.get(gkey);
            if (oldR != null) {
                this._propL.remove((Object)oldR);
            }
            if (key.contains("cond")) {
                value = this.replaceLabel(this._gadget, key, value);
            }
            Prop_Rslt0R propR = (Prop_Rslt0R)this._propL.createRow();
            propR.gadget(this._gadget);
            propR.key(key);
            propR.value(value);
            this._propL.add((MCRow)propR);
            this._keyMap.put(gkey, propR);
        }

        private String replaceLabel(String _gadget, String key, String value) {
            MCLabelConst label = MCLocaleConst.label((Locale)MCSys.user.locale());
            String labelKey = MCConst.createKey((String[])new String[]{this.getResourceBase(_gadget), key});
            String labelValue = label.getLabel(labelKey);
            if (labelValue != null) {
                CharSequence[] str = value.split(",");
                str[1] = labelValue;
                return String.join((CharSequence)",", str);
            }
            return value;
        }

        protected void setType(String type) {
            if (type != null) {
                this.addPropertyRow("type", type);
            }
        }

        public void setName(String name) {
            if (name != null) {
                this.addPropertyRow("name", name);
            }
        }

        public void setTitle(String title) {
            if (title != null) {
                this.addPropertyRow("title", title);
            }
        }

        public void setIcon(MCBinary icon) {
            if (icon != null && icon.isDBFile()) {
                this.addPropertyRow("icon", String.valueOf(icon.toDBPointer()));
            }
        }

        public void setDescription(String description) {
            if (description != null) {
                this.addPropertyRow("description", description);
            }
        }

        public void setSize(int width, int height) {
            this.addPropertyRow("size", String.valueOf(width) + "," + height);
        }

        public void setColorFG(String color) {
            this.addPropertyRow("color.fg", MCGadgetUtil.colorData((String)color));
        }

        public void setColorFG(int r, int g, int b) {
            this.addPropertyRow("color.fg", MCGadgetUtil.colorData((int)r, (int)g, (int)b));
        }

        public void setColorBG(String color) {
            this.addPropertyRow("color.bg", MCGadgetUtil.colorData((String)color));
        }

        public void setColorBG(int r, int g, int b) {
            this.addPropertyRow("color.bg", MCGadgetUtil.colorData((int)r, (int)g, (int)b));
        }

        public void setFontSize(String size) {
            this.addPropertyRow("font.size", size);
        }

        public void setSearchOnce(boolean once) {
            this.addPropertyRow("searchonce", MCBooleanUtil.booleanToDBString((boolean)once));
        }

        public void setOpenScreen(String moduleid, String screenid) {
            if (moduleid != null && screenid != null) {
                this.addPropertyRow("open", String.valueOf(moduleid) + "." + screenid);
            }
        }

        public void setLocmapKey(String locmapKey) {
            if (locmapKey != null) {
                this.addPropertyRow("locmapKey", locmapKey);
            }
        }

        public void setLocmapValue(String locmapValue) {
            if (locmapValue != null) {
                this.addPropertyRow("locmapValue", locmapValue);
            }
        }

        public void setLocmapName(String locmapName) {
            if (locmapName != null) {
                this.addPropertyRow("locmapName", locmapName);
            }
        }

        protected void addCondition(String col, String name, String type, boolean required, boolean editable) {
            String required_s = MCBooleanUtil.booleanToDBString((boolean)required);
            String editable_s = MCBooleanUtil.booleanToDBString((boolean)editable);
            this.addPropertyRow("cond." + this._condcnt, MCGadgetUtil.arrayData((String[])new String[]{col, name, type, required_s, editable_s}));
            ++this._condcnt;
        }

        public void addConditionString(String col, String name) {
            this.addConditionString(col, name, false);
        }

        public void addConditionString(String col, String name, boolean required) {
            this.addConditionString(col, name, required, true);
        }

        public void addConditionString(String col, String name, boolean required, boolean editable) {
            this.addCondition(col, name, "1", required, editable);
        }

        public void addConditionNumber(String col, String name) {
            this.addConditionNumber(col, name, false);
        }

        public void addConditionNumber(String col, String name, boolean required) {
            this.addConditionNumber(col, name, required, true);
        }

        public void addConditionNumber(String col, String name, boolean required, boolean editable) {
            this.addCondition(col, name, "2", required, editable);
        }

        public void addConditionBoolean(String col, String name) {
            this.addConditionBoolean(col, name, true);
        }

        public void addConditionBoolean(String col, String name, boolean editable) {
            this.addCondition(col, name, "5", true, editable);
        }

        public void addConditionDate(String col, String name) {
            this.addConditionDate(col, name, false);
        }

        public void addConditionDate(String col, String name, boolean required) {
            this.addConditionDate(col, name, required, true);
        }

        public void addConditionDate(String col, String name, boolean required, boolean editable) {
            this.addCondition(col, name, "3", required, editable);
        }

        public void addConditionTimestamp(String col, String name) {
            this.addConditionTimestamp(col, name, false);
        }

        public void addConditionTimestamp(String col, String name, boolean required) {
            this.addConditionTimestamp(col, name, required, true);
        }

        public void addConditionTimestamp(String col, String name, boolean required, boolean editable) {
            this.addCondition(col, name, "4", required, editable);
        }

        public void addConditionStringCombo(String col, String name) {
            this.addConditionStringCombo(col, name, false);
        }

        public void addConditionStringCombo(String col, String name, boolean required) {
            this.addConditionStringCombo(col, name, required, true);
        }

        public void addConditionStringCombo(String col, String name, boolean required, boolean editable) {
            this.addCondition(col, name, "1C", required, editable);
        }

        protected void addOpenParam(String col, String val, String type) {
            this.addPropertyRow("param." + this._paramcnt, MCGadgetUtil.arrayData((String[])new String[]{col, val, type}));
            ++this._paramcnt;
        }

        public void addOpenParam(String col, String val) {
            this.addOpenParam(col, val, "1");
        }

        public void addOpenParam(String col, MCNumber val) {
            this.addOpenParam(col, val == null ? null : val.toSimpleString(), "2");
        }

        public void addOpenParam(String col, int val) {
            this.addOpenParam(col, String.valueOf(val), "2");
        }

        public void addOpenParam(String col, long val) {
            this.addOpenParam(col, String.valueOf(val), "2");
        }

        public void addOpenParam(String col, float val) {
            this.addOpenParam(col, String.valueOf(val), "2");
        }

        public void addOpenParam(String col, double val) {
            this.addOpenParam(col, String.valueOf(val), "2");
        }

        public void addOpenParam(String col, boolean val) {
            this.addOpenParam(col, MCBooleanUtil.booleanToDBString((boolean)val), "5");
        }

        public void addOpenParam(String col, MCDate val) {
            this.addOpenParam(col, val == null ? null : val.toString(), "3");
        }

        public void addOpenParam(String col, MCTimestamp val) {
            this.addOpenParam(col, val == null ? null : val.toString(), "3");
        }

        public void addOpenParam(String col, MCBinary val) {
            this.addOpenParam(col, val == null ? null : val.toString(), "6");
        }

        public void addOpenCondition(String col, String cond) {
            this.addOpenParam(col, cond, "F");
        }

        public void addOpenAction(String action) {
            this.addOpenParam("$action$", action, "A");
        }
    }

    public static class IconLabel
    extends MCGadgetUtil {
        public IconLabel() {
            super(null);
        }

        public static class Data
        extends Label.Data {
            protected Data(IfMCDashboard_ISrch02 srch02) {
                super(srch02);
            }

            public void setIcon(String icon) {
                this.addDataRow("icon", icon);
            }
        }

        public static class List
        extends CommonList {
            protected List(IfMCDashboard_ISrch03 srch03) {
                super(srch03);
            }
        }

        public static class Property
        extends CommonProperty {
            protected Property(IfMCDashboard_ISrch01 srch01) {
                super(srch01, "iconlabel");
            }
        }
    }

    public static class Label
    extends MCGadgetUtil {
        public Label() {
            super(null);
        }

        public static class Data
        extends CommonData {
            protected Data(IfMCDashboard_ISrch02 srch02) {
                super(srch02);
            }

            public void setValue(String text) {
                this.addDataRow("value", text);
            }

            public void setMessage(String msgid) {
                String value = MCLocaleConst.message((Locale)MCSys.user.locale()).getMessage(msgid);
                this.setValue(value);
            }

            public void setMessage(MCMessage msg) {
                this.setMessage(msg.getID());
                this.setBind(msg.getBindArray());
            }

            public void setBind(Object ... binds) {
                int old = 1;
                while (this.removeDataRow(this.valueKey(old++)) != null) {
                }
                MCStringUtil.IndexBindSource src = new MCStringUtil.IndexBindSource(binds);
                src.nullstr("");
                int i = 1;
                while (i <= src.size()) {
                    String bind = src.get(i);
                    this.addDataRow(this.valueKey(i++), bind);
                }
            }

            public void setBindColorFG(int index, String color) {
                this.addDataRow(Label.indexKey((String)"color.fg", (int[])new int[]{index}), Label.colorData((String)color));
            }

            public void setBindColorFG(int index, int r, int g, int b) {
                this.addDataRow(Label.indexKey((String)"color.fg", (int[])new int[]{index}), Label.colorData((int)r, (int)g, (int)b));
            }

            public void setBindFontSize(int index, String size) {
                this.addDataRow(Label.indexKey((String)"font.size", (int[])new int[]{index}), size);
            }
        }

        public static class List
        extends CommonList {
            protected List(IfMCDashboard_ISrch03 srch03) {
                super(srch03);
            }
        }

        public static class Property
        extends CommonProperty {
            protected Property(IfMCDashboard_ISrch01 srch01) {
                super(srch01, "label");
            }

            public void setBindColorFG(int index, String color) {
                this.addPropertyRow(Label.indexKey((String)"color.fg", (int[])new int[]{index}), Label.colorData((String)color));
            }

            public void setBindColorFG(int index, int r, int g, int b) {
                this.addPropertyRow(Label.indexKey((String)"color.fg", (int[])new int[]{index}), Label.colorData((int)r, (int)g, (int)b));
            }

            public void setBindFontSize(int index, String size) {
                this.addPropertyRow(Label.indexKey((String)"font.size", (int[])new int[]{index}), size);
            }
        }
    }

    public static class Table
    extends MCGadgetUtil {
        public Table() {
            super(null);
        }

        public static class Data
        extends CommonData {
            protected Data(IfMCDashboard_ISrch02 srch02) {
                super(srch02);
            }

            public void setValue(int row, int column, String value) {
                this.addDataRow(this.valueKey(row, column), value);
            }

            public void setValue(int row, int column, MCNumber value) {
                String strval = null;
                if (value != null) {
                    strval = value.toSimpleString();
                }
                this.addDataRow(this.valueKey(row, column), strval);
            }

            public void setValue(int row, int column, int value) {
                this.addDataRow(this.valueKey(row, column), String.valueOf(value));
            }

            public void setValue(int row, int column, long value) {
                this.addDataRow(this.valueKey(row, column), String.valueOf(value));
            }

            public void setValue(int row, int column, float value) {
                this.addDataRow(this.valueKey(row, column), String.valueOf(value));
            }

            public void setValue(int row, int column, double value) {
                this.addDataRow(this.valueKey(row, column), String.valueOf(value));
            }

            public void setValue(int row, int column, boolean value) {
                this.addDataRow(this.valueKey(row, column), Boolean.toString(value));
            }

            public void setValue(int row, int column, MCDate value) {
                String strval = null;
                if (value != null) {
                    strval = value.toString();
                }
                this.addDataRow(this.valueKey(row, column), strval);
            }

            public void setValue(int row, int column, MCTimestamp value) {
                String strval = null;
                if (value != null) {
                    strval = value.toString();
                }
                this.addDataRow(this.valueKey(row, column), strval);
            }

            public void setValueColorFG(String color) {
                this.addDataRow("vcolor.fg", Table.colorData((String)color));
            }

            public void setValueColorFG(int r, int g, int b) {
                this.addDataRow("vcolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorRowFG(int pos, String color) {
                this.addDataRow(Table.posKeyRow((String)"vcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorRowFG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"vcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorColumnFG(int pos, String color) {
                this.addDataRow(Table.posKeyColumn((String)"vcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorColumnFG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"vcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorFG(int row, int column, String color) {
                this.addDataRow(Table.posKey((String)"vcolor.fg", (int)row, (int)column), Table.colorData((String)color));
            }

            public void setValueColorFG(int row, int column, int r, int g, int b) {
                this.addDataRow(Table.posKey((String)"vcolor.fg", (int)row, (int)column), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorBG(String color) {
                this.addDataRow("vcolor.bg", Table.colorData((String)color));
            }

            public void setValueColorBG(int r, int g, int b) {
                this.addDataRow("vcolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorRowBG(int pos, String color) {
                this.addDataRow(Table.posKeyRow((String)"vcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorRowBG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"vcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorColumnBG(int pos, String color) {
                this.addDataRow(Table.posKeyColumn((String)"vcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorColumnBG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"vcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorBG(int row, int column, String color) {
                this.addDataRow(Table.posKey((String)"vcolor.bg", (int)row, (int)column), Table.colorData((String)color));
            }

            public void setValueColorBG(int row, int column, int r, int g, int b) {
                this.addDataRow(Table.posKey((String)"vcolor.bg", (int)row, (int)column), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueFontSize(String size) {
                this.addDataRow("vfont.size", size);
            }

            public void setValueFontSizeRow(int pos, String size) {
                this.addDataRow(Table.posKeyRow((String)"vfont.size", (int)pos), size);
            }

            public void setValueFontSizeColumn(int pos, String size) {
                this.addDataRow(Table.posKeyColumn((String)"vfont.size", (int)pos), size);
            }

            public void setValueFontSize(int row, int column, String size) {
                this.addDataRow(Table.posKey((String)"vfont.size", (int)row, (int)column), size);
            }

            public void setRowLabel(String ... texts) {
                this.addDataRow("rowlabel", Table.arrayData((String[])texts));
            }

            public void setColumnLabel(String ... texts) {
                this.addDataRow("columnlabel", Table.arrayData((String[])texts));
            }

            public void setLabelColorFG(String color) {
                this.addDataRow("lcolor.fg", Table.colorData((String)color));
            }

            public void setLabelColorFG(int r, int g, int b) {
                this.addDataRow("lcolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowFG(String color) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.fg"), Table.colorData((String)color));
            }

            public void setLabelColorRowFG(int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.fg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowFG(int pos, String color) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorRowFG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnFG(String color) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.fg"), Table.colorData((String)color));
            }

            public void setLabelColorColumnFG(int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.fg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnFG(int pos, String color) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorColumnFG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorBG(String color) {
                this.addDataRow("lcolor.bg", Table.colorData((String)color));
            }

            public void setLabelColorBG(int r, int g, int b) {
                this.addDataRow("lcolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowBG(String color) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.bg"), Table.colorData((String)color));
            }

            public void setLabelColorRowBG(int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.bg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowBG(int pos, String color) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorRowBG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyRow((String)"lcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnBG(String color) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.bg"), Table.colorData((String)color));
            }

            public void setLabelColorColumnBG(int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.bg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnBG(int pos, String color) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorColumnBG(int pos, int r, int g, int b) {
                this.addDataRow(Table.posKeyColumn((String)"lcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setCornerLabel(String text) {
                this.addDataRow("cornerlabel", text);
            }

            public void setCornerLabelColorFG(String color) {
                this.addDataRow("ccolor.fg", Table.colorData((String)color));
            }

            public void setCornerLabelColorFG(int r, int g, int b) {
                this.addDataRow("ccolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setCornerLabelColorBG(String color) {
                this.addDataRow("ccolor.bg", Table.colorData((String)color));
            }

            public void setCornerLabelColorBG(int r, int g, int b) {
                this.addDataRow("ccolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValuePrefix(String prefix) {
                this.addDataRow("prefix", prefix);
            }

            public void setValueSuffix(String suffix) {
                this.addDataRow("suffix", suffix);
            }

            public void setFixFontSize(String size) {
                this.addDataRow("xfont.size", size);
            }
        }

        public static class List
        extends CommonList {
            protected List(IfMCDashboard_ISrch03 srch03) {
                super(srch03);
            }
        }

        public static class Property
        extends CommonProperty {
            protected Property(IfMCDashboard_ISrch01 srch01) {
                super(srch01, "table");
            }

            public void setValueAlignment(String align) {
                this.addPropertyRow("halign", align);
            }

            public void setValueColorFG(String color) {
                this.addPropertyRow("vcolor.fg", Table.colorData((String)color));
            }

            public void setValueColorFG(int r, int g, int b) {
                this.addPropertyRow("vcolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorRowFG(int pos, String color) {
                this.addPropertyRow(Table.posKeyRow((String)"vcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorRowFG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"vcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorColumnFG(int pos, String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"vcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorColumnFG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"vcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorFG(int row, int column, String color) {
                this.addPropertyRow(Table.posKey((String)"vcolor.fg", (int)row, (int)column), Table.colorData((String)color));
            }

            public void setValueColorFG(int row, int column, int r, int g, int b) {
                this.addPropertyRow(Table.posKey((String)"vcolor.fg", (int)row, (int)column), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorBG(String color) {
                this.addPropertyRow("vcolor.bg", Table.colorData((String)color));
            }

            public void setValueColorBG(int r, int g, int b) {
                this.addPropertyRow("vcolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorRowBG(int pos, String color) {
                this.addPropertyRow(Table.posKeyRow((String)"vcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorRowBG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"vcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorColumnBG(int pos, String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"vcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setValueColorColumnBG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"vcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueColorBG(int row, int column, String color) {
                this.addPropertyRow(Table.posKey((String)"vcolor.bg", (int)row, (int)column), Table.colorData((String)color));
            }

            public void setValueColorBG(int row, int column, int r, int g, int b) {
                this.addPropertyRow(Table.posKey((String)"vcolor.bg", (int)row, (int)column), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValueFontSize(String size) {
                this.addPropertyRow("vfont.size", size);
            }

            public void setValueFontSizeRow(int pos, String size) {
                this.addPropertyRow(Table.posKeyRow((String)"vfont.size", (int)pos), size);
            }

            public void setValueFontSizeColumn(int pos, String size) {
                this.addPropertyRow(Table.posKeyColumn((String)"vfont.size", (int)pos), size);
            }

            public void setValueFontSize(int row, int column, String size) {
                this.addPropertyRow(Table.posKey((String)"vfont.size", (int)row, (int)column), size);
            }

            public void setRowLabel(String ... texts) {
                this.addPropertyRow("rowlabel", Table.arrayData((String[])texts));
            }

            public void setColumnLabel(String ... texts) {
                this.addPropertyRow("columnlabel", Table.arrayData((String[])texts));
            }

            public void setLabelColorFG(String color) {
                this.addPropertyRow("lcolor.fg", Table.colorData((String)color));
            }

            public void setLabelColorFG(int r, int g, int b) {
                this.addPropertyRow("lcolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowFG(String color) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.fg"), Table.colorData((String)color));
            }

            public void setLabelColorRowFG(int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.fg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowFG(int pos, String color) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorRowFG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnFG(String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.fg"), Table.colorData((String)color));
            }

            public void setLabelColorColumnFG(int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.fg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnFG(int pos, String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.fg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorColumnFG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.fg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorBG(String color) {
                this.addPropertyRow("lcolor.bg", Table.colorData((String)color));
            }

            public void setLabelColorBG(int r, int g, int b) {
                this.addPropertyRow("lcolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowBG(String color) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.bg"), Table.colorData((String)color));
            }

            public void setLabelColorRowBG(int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.bg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorRowBG(int pos, String color) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorRowBG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyRow((String)"lcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnBG(String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.bg"), Table.colorData((String)color));
            }

            public void setLabelColorColumnBG(int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.bg"), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setLabelColorColumnBG(int pos, String color) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.bg", (int)pos), Table.colorData((String)color));
            }

            public void setLabelColorColumnBG(int pos, int r, int g, int b) {
                this.addPropertyRow(Table.posKeyColumn((String)"lcolor.bg", (int)pos), Table.colorData((int)r, (int)g, (int)b));
            }

            public void setCornerLabel(String text) {
                this.addPropertyRow("cornerlabel", text);
            }

            public void setCornerLabelColorFG(String color) {
                this.addPropertyRow("ccolor.fg", Table.colorData((String)color));
            }

            public void setCornerLabelColorFG(int r, int g, int b) {
                this.addPropertyRow("ccolor.fg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setCornerLabelColorBG(String color) {
                this.addPropertyRow("ccolor.bg", Table.colorData((String)color));
            }

            public void setCornerLabelColorBG(int r, int g, int b) {
                this.addPropertyRow("ccolor.bg", Table.colorData((int)r, (int)g, (int)b));
            }

            public void setValuePrefix(String prefix) {
                this.addPropertyRow("prefix", prefix);
            }

            public void setValueSuffix(String suffix) {
                this.addPropertyRow("suffix", suffix);
            }

            public void setFixFontSize(String size) {
                this.addPropertyRow("xfont.size", size);
            }
        }
    }
}

