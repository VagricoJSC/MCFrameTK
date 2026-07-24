package mcframe.commonMG.constant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Locale;
import mcframe.commonCore.container.MCList;
import mcframe.commonCore.container.MCRow;
import mcframe.commonMA.constant.MCAppConst;

import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.notice.MCAppException;
//settingSheetのCUSTOM_IMPORT_LISTの文字列を出力
import mcframe.commonMA.constant.*;
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MGC_COST_ACT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MG";

	public static final String typeID = "COST_ACT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MGC_COST_ACT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "cost_act_typ";

	public static final String $NAME = "cost_act_typ_nm";

	public static final String $LIST_SORT = "list_sort";

	public static final String $IF_DATA_TYP = "if_data_typ";

	public static final String $IS_ENABLE = "is_enable";

	public static final String $IS_VISIBLE = "is_visible";

	public static final String $MODULE_ID1 = "module_id1";

	public static final String $SCREEN_ID1 = "screen_id1";

	public static final String $MODULE_ID2 = "module_id2";

	public static final String $SCREEN_ID2 = "screen_id2";

	/*
	 * 定数の定義です。
	 */
	/** 原価実績種類区分：品目製造指図情報
	 */
	public static final MGC_COST_ACT_TYP ITM_MFG_INST = create("1", "ITM_MFG_INST", new MCNumber(1), MGC_IF_DATA_TYP.INST.value(), false, true, null, null, FSC_MODULE_ID.CostManagement.value(), "MGBBP0030");

	/** 原価実績種類区分：指図工程情報
	 */
	public static final MGC_COST_ACT_TYP INST_OPER = create("2", "INST_OPER", new MCNumber(2), MGC_IF_DATA_TYP.INST.value(), false, false, null, null, FSC_MODULE_ID.CostManagement.value(), "MGBBP0040");

	/** 原価実績種類区分：製造実績
	 */
	public static final MGC_COST_ACT_TYP MFG = create("3", "MFG", new MCNumber(3), MGC_IF_DATA_TYP.MFG.value(), true, true, FSC_MODULE_ID.CostManagement.value(), "MGBBP0300", FSC_MODULE_ID.CostManagement.value(), "MGBBP0100");

	/** 原価実績種類区分：購買実績
	 */
	public static final MGC_COST_ACT_TYP PURC = create("4", "PURC", new MCNumber(4), MGC_IF_DATA_TYP.MFG.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0310", FSC_MODULE_ID.CostManagement.value(), "MGBBP0110");

	/** 原価実績種類区分：投入実績
	 */
	public static final MGC_COST_ACT_TYP INPT = create("5", "INPT", new MCNumber(5), MGC_IF_DATA_TYP.MFG.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0320", FSC_MODULE_ID.CostManagement.value(), "MGBBP0120");

	/** 原価実績種類区分：指図工数実績
	 */
	public static final MGC_COST_ACT_TYP INST_WK = create("6", "INST_WK", new MCNumber(6), MGC_IF_DATA_TYP.MFG.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0330", FSC_MODULE_ID.CostManagement.value(), "MGBBP0130");

	/** 原価実績種類区分：指図外工数実績
	 */
	public static final MGC_COST_ACT_TYP OTHER_WK = create("7", "OTHER_WK", new MCNumber(7), MGC_IF_DATA_TYP.MFG.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0340", FSC_MODULE_ID.CostManagement.value(), "MGBBP0140");

	/** 原価実績種類区分：指図仕掛実績
	 */
	public static final MGC_COST_ACT_TYP WIP = create("8", "WIP", new MCNumber(8), MGC_IF_DATA_TYP.MFG.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0350", FSC_MODULE_ID.CostManagement.value(), "MGBBP0150");

	/** 原価実績種類区分：入出庫実績
	 */
	public static final MGC_COST_ACT_TYP IO = create("9", "IO", new MCNumber(9), MGC_IF_DATA_TYP.IO.value(), true, true, FSC_MODULE_ID.CostManagement.value(), "MGBBP0360", FSC_MODULE_ID.CostManagement.value(), "MGBBP0160");

	/** 原価実績種類区分：売上実績
	 */
	public static final MGC_COST_ACT_TYP SLS = create("10", "SLS", new MCNumber(10), MGC_IF_DATA_TYP.IO.value(), false, false, FSC_MODULE_ID.CostManagement.value(), "MGBBP0370", FSC_MODULE_ID.CostManagement.value(), "MGBBP0170");

	/** 原価実績種類区分：在庫実績
	 */
	public static final MGC_COST_ACT_TYP STK = create("11", "STK", new MCNumber(11), MGC_IF_DATA_TYP.STK.value(), true, true, FSC_MODULE_ID.CostManagement.value(), "MGBBP0380", FSC_MODULE_ID.CostManagement.value(), "MGBBP0180");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_COST_ACT_TYP create() {
		return new MGC_COST_ACT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MGC_COST_ACT_TYP get(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		if (type == null) {
			throw MGC_COST_ACT_TYP.invalidValue(value);
		}
		return type;
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * valueが定数グループに属している場合は、valueと一致した定数インスタンスを返します。
	 * 定数グループに属していない場合はnullを返します。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 */
	public static MGC_COST_ACT_TYP getNE(String value) {
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_COST_ACT_TYP create(String value, String xmlKey, MCNumber attr1, String attr2, boolean attr3, boolean attr4, String attr5, String attr6, String attr7, String attr8) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addNumberColumn($LIST_SORT, attr1);
		me.constR.addStringColumn($IF_DATA_TYP, attr2);
		me.constR.addBooleanColumn($IS_ENABLE, attr3);
		me.constR.addBooleanColumn($IS_VISIBLE, attr4);
		me.constR.addStringColumn($MODULE_ID1, attr5);
		me.constR.addStringColumn($SCREEN_ID1, attr6);
		me.constR.addStringColumn($MODULE_ID2, attr7);
		me.constR.addStringColumn($SCREEN_ID2, attr8);
		return me;
	}

	/*
	 * 各フィールドのgetterです。
	 */
	@Override
	protected String moduleID() {
		return moduleID;
	}

	@Override
	protected String typeID() {
		return typeID;
	}

	/**
	 * DB保存する場合などに使用するプリミティブな値を取得します。
	 * ロジックが保持している値が定数と同値であるかどうかを判断する場合には、
	 * <pre>  [定数クラス].is[定数名]([値を保持している変数])</pre>。
	 * を使用してください。
	 * <pre>  [定数クラス].[定数名].value.equals([値を保持している変数])</pre>
	 * という実装は推奨しません。
	 * @return 定数値
	 */
	public String value() {
		return constR.getString($VALUE);
	}

	/** 
	 * list_sortの値を返します。
	 * @return list_sortの値
	 */
	public MCNumber list_sort() {
		return constR.getNumberNE($LIST_SORT);
	}

	/** 
	 * valueに対応する定数のlist_sortの値を返します。
	 * @param value 定数値
	 * @return list_sortの値
	 */
	public static MCNumber list_sort(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.list_sort();
	}

	/** 
	 * if_data_typの値を返します。
	 * @return if_data_typの値
	 */
	public String if_data_typ() {
		return constR.getStringNE($IF_DATA_TYP);
	}

	/** 
	 * valueに対応する定数のif_data_typの値を返します。
	 * @param value 定数値
	 * @return if_data_typの値
	 */
	public static String if_data_typ(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.if_data_typ();
	}

	/** 
	 * is_enableの値を返します。
	 * @return is_enableの値
	 */
	public boolean is_enable() {
		return constR.getBooleanNE($IS_ENABLE);
	}

	/** 
	 * valueに対応する定数のis_enableの値を返します。
	 * @param value 定数値
	 * @return is_enableの値
	 */
	public static boolean is_enable(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_enable();
	}

	/** 
	 * is_visibleの値を返します。
	 * @return is_visibleの値
	 */
	public boolean is_visible() {
		return constR.getBooleanNE($IS_VISIBLE);
	}

	/** 
	 * valueに対応する定数のis_visibleの値を返します。
	 * @param value 定数値
	 * @return is_visibleの値
	 */
	public static boolean is_visible(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_visible();
	}

	/** 
	 * module_id1の値を返します。
	 * @return module_id1の値
	 */
	public String module_id1() {
		return constR.getStringNE($MODULE_ID1);
	}

	/** 
	 * valueに対応する定数のmodule_id1の値を返します。
	 * @param value 定数値
	 * @return module_id1の値
	 */
	public static String module_id1(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.module_id1();
	}

	/** 
	 * screen_id1の値を返します。
	 * @return screen_id1の値
	 */
	public String screen_id1() {
		return constR.getStringNE($SCREEN_ID1);
	}

	/** 
	 * valueに対応する定数のscreen_id1の値を返します。
	 * @param value 定数値
	 * @return screen_id1の値
	 */
	public static String screen_id1(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.screen_id1();
	}

	/** 
	 * module_id2の値を返します。
	 * @return module_id2の値
	 */
	public String module_id2() {
		return constR.getStringNE($MODULE_ID2);
	}

	/** 
	 * valueに対応する定数のmodule_id2の値を返します。
	 * @param value 定数値
	 * @return module_id2の値
	 */
	public static String module_id2(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.module_id2();
	}

	/** 
	 * screen_id2の値を返します。
	 * @return screen_id2の値
	 */
	public String screen_id2() {
		return constR.getStringNE($SCREEN_ID2);
	}

	/** 
	 * valueに対応する定数のscreen_id2の値を返します。
	 * @param value 定数値
	 * @return screen_id2の値
	 */
	public static String screen_id2(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.screen_id2();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if (me != null) {
			return true;
		}
		else {
			return false;
		}
	}

	/** 
	 * 指定されたvalueが定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 値
	 */
	public static void containsEx(String value) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if (me == null) {
			throw MGC_COST_ACT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.getNE(value);
		if (me == null) {
			if (binds == null) {
				throw new MCAppException(msgid, value);
			}else{
				throw new MCAppException(msgid, binds);
			}
		}
	}


	/*
	 * toStringメソッドのオーバーライドです。
	 */
	public String toString() {
		return createStringPath(value(), name(), list_sort(), if_data_typ(), is_enable(), is_visible(), module_id1(), screen_id1(), module_id2(), screen_id2());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MGC_COST_ACT_TYP[] array() {
		if (array == null) {
			array = new MGC_COST_ACT_TYP[] {
					MGC_COST_ACT_TYP.ITM_MFG_INST, MGC_COST_ACT_TYP.INST_OPER, MGC_COST_ACT_TYP.MFG, MGC_COST_ACT_TYP.PURC, MGC_COST_ACT_TYP.INPT, 
					 MGC_COST_ACT_TYP.INST_WK, MGC_COST_ACT_TYP.OTHER_WK, MGC_COST_ACT_TYP.WIP, MGC_COST_ACT_TYP.IO, MGC_COST_ACT_TYP.SLS, MGC_COST_ACT_TYP.STK
			};
		}
		return array;
	}

	/**
	 * 定数の値と名称のListを返します。
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list() {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			MCRow r = MCRow.create();
			r.addStringColumn($VALUE, me.value());
			r.addStringColumn($NAME, me.name());
			list.add(r);
		}
		return list;
	}

	/**
	 * キーに対応する値を取得します。
	 * @return 値
	 */
	protected static String value(String key) {
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			if(me.key().equals(key)){
				return me.value();
			}
		}
		return null;
	}

	/**
	 * キーの配列を取得します。
	 * @return キーの配列
	 */
	protected static List<String> getKeys() {
		List<String> keys = new ArrayList<String>();
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			keys.add(me.key());
		}
		return keys;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(MCRow row) {
		Map<String, Boolean> kl = new HashMap<String, Boolean>();
		for(String s : row.getColumnPathArray()){
			if(MGC_COST_ACT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MGC_COST_ACT_TYP me = MGC_COST_ACT_TYP.get(MGC_COST_ACT_TYP.value(e.getKey()));
				MCRow r = list.createRow();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 引数row のカラム名が定数キー、値が「true」の定数の値と名称のListを返します。<p>
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MGC_COST_ACT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MGC_COST_ACT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MGC_COST_ACT_TYP.list();
			}
			return list;
		}
	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数 cols と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(String[] cols, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			if(MGC_COST_ACT_TYP.isSameVals(me, cols, vals)){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 指定されたカラムの値が一致する範囲の値と名称のListを返します。<p>
	 * 引数colValMapの、キーを定数カラム、値を定数カラムに対応する値、とみなし、それに一致する定数のリストを返します。
	 * @param colValMap キーにカラム名、値に定数カラムに対応する値を持つマップ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> subList(Map<String, Comparable<?>> colValMap) {
		MCList<MCRow> list;
		if(colValMap != null && 0 < colValMap.size()){
			int s = colValMap.size();
			String[] cols = new String[s];
			Comparable<?>[] vals =new Comparable<?>[s];
			int i = 0;
			for(Map.Entry<String, Comparable<?>> e : colValMap.entrySet()){
				cols[i] = e.getKey();
				vals[i] = e.getValue();
				i =+ 1;
			}
			list = MGC_COST_ACT_TYP.subList(cols, vals);
		}
		else{
			list = MCList.create(MCRow.class);
		}
		return list;
	}

	/**
	 * 指定されたカラムの値がひとつも一致しない範囲の値と名称のListを返します。<p>
	 * 定数インスタンスの保持するconstR に存在しないカラムを指定した場合、例外をthrowします。
	 * @param col カラム名
	 * @param vals 値の配列
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> exptSubList(String col, Comparable<?>[] vals) {
		MCList<MCRow> list = MCList.create(MCRow.class);
		String[] cols = {col};
		Comparable<?>[] val = new Comparable<?>[1];
		for (MGC_COST_ACT_TYP me : MGC_COST_ACT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MGC_COST_ACT_TYP.isSameVals(me, cols, val)){
					f = false;
					break;
				}
			}
			if(f){
				MCRow r = MCRow.create();
				r.addStringColumn($VALUE, me.value());
				r.addStringColumn($NAME, me.name());
				list.add(r);
			}
		}
		return list;
	}

	/**
	 * 定数の保持するconstR のカラム(引数 cols)の値が、引数 valsと一致する場合、trueを返します。<p>
	 * 引数 keys と引数 vals の要素数が異なる場合は、小さい方の要素数を比較するカラム数とします。
	 * 定数の保持するconstR に 存在しないカラムを指定した場合、例外をthrowします。
	 * @param me 定数インスタンス
	 * @param cols カラム名の配列
	 * @param vals 値の配列
	 */
	protected static boolean isSameVals(MGC_COST_ACT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MGC_COST_ACT_TYP", col);}
			Comparable<?> rVal = me.constR.getValue(col);
			if(!isSame(rVal, val)){
				f = false;
				break;
			}
		}
		return f;
	}

	/**
	 * デフォルトの比較メソッド
	 * staticオブジェクト同士の比較なので、==演算子を使用している。
	 * @param type 定数インスタンス
	 * @return 一致していればtrue
	 */
	protected boolean isSame(MGC_COST_ACT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 原価実績種類区分：品目製造指図情報かどうか
	 * @param value 定数値
	 * @return 定数値が品目製造指図情報の値の場合true
	 */
	public static boolean isITM_MFG_INST(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.ITM_MFG_INST.isSame(type);
	}

	/**
	 * 原価実績種類区分：品目製造指図情報かどうか
	 * @param type 属性値
	 * @return 属性値が品目製造指図情報の値の場合true
	 */
	public static boolean isITM_MFG_INST(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.ITM_MFG_INST.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図工程情報かどうか
	 * @param value 定数値
	 * @return 定数値が指図工程情報の値の場合true
	 */
	public static boolean isINST_OPER(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.INST_OPER.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図工程情報かどうか
	 * @param type 属性値
	 * @return 属性値が指図工程情報の値の場合true
	 */
	public static boolean isINST_OPER(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.INST_OPER.isSame(type);
	}

	/**
	 * 原価実績種類区分：製造実績かどうか
	 * @param value 定数値
	 * @return 定数値が製造実績の値の場合true
	 */
	public static boolean isMFG(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.MFG.isSame(type);
	}

	/**
	 * 原価実績種類区分：製造実績かどうか
	 * @param type 属性値
	 * @return 属性値が製造実績の値の場合true
	 */
	public static boolean isMFG(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.MFG.isSame(type);
	}

	/**
	 * 原価実績種類区分：購買実績かどうか
	 * @param value 定数値
	 * @return 定数値が購買実績の値の場合true
	 */
	public static boolean isPURC(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.PURC.isSame(type);
	}

	/**
	 * 原価実績種類区分：購買実績かどうか
	 * @param type 属性値
	 * @return 属性値が購買実績の値の場合true
	 */
	public static boolean isPURC(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.PURC.isSame(type);
	}

	/**
	 * 原価実績種類区分：投入実績かどうか
	 * @param value 定数値
	 * @return 定数値が投入実績の値の場合true
	 */
	public static boolean isINPT(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.INPT.isSame(type);
	}

	/**
	 * 原価実績種類区分：投入実績かどうか
	 * @param type 属性値
	 * @return 属性値が投入実績の値の場合true
	 */
	public static boolean isINPT(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.INPT.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図工数実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図工数実績の値の場合true
	 */
	public static boolean isINST_WK(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.INST_WK.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図工数実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図工数実績の値の場合true
	 */
	public static boolean isINST_WK(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.INST_WK.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図外工数実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数実績の値の場合true
	 */
	public static boolean isOTHER_WK(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.OTHER_WK.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図外工数実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数実績の値の場合true
	 */
	public static boolean isOTHER_WK(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.OTHER_WK.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図仕掛実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図仕掛実績の値の場合true
	 */
	public static boolean isWIP(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.WIP.isSame(type);
	}

	/**
	 * 原価実績種類区分：指図仕掛実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図仕掛実績の値の場合true
	 */
	public static boolean isWIP(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.WIP.isSame(type);
	}

	/**
	 * 原価実績種類区分：入出庫実績かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績の値の場合true
	 */
	public static boolean isIO(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.IO.isSame(type);
	}

	/**
	 * 原価実績種類区分：入出庫実績かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績の値の場合true
	 */
	public static boolean isIO(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.IO.isSame(type);
	}

	/**
	 * 原価実績種類区分：売上実績かどうか
	 * @param value 定数値
	 * @return 定数値が売上実績の値の場合true
	 */
	public static boolean isSLS(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.SLS.isSame(type);
	}

	/**
	 * 原価実績種類区分：売上実績かどうか
	 * @param type 属性値
	 * @return 属性値が売上実績の値の場合true
	 */
	public static boolean isSLS(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.SLS.isSame(type);
	}

	/**
	 * 原価実績種類区分：在庫実績かどうか
	 * @param value 定数値
	 * @return 定数値が在庫実績の値の場合true
	 */
	public static boolean isSTK(String value) {
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		return MGC_COST_ACT_TYP.STK.isSame(type);
	}

	/**
	 * 原価実績種類区分：在庫実績かどうか
	 * @param type 属性値
	 * @return 属性値が在庫実績の値の場合true
	 */
	public static boolean isSTK(MGC_COST_ACT_TYP type) {
		return MGC_COST_ACT_TYP.STK.isSame(type);
	}

	/**
	 * 定数グループの名称を返します。
	 */
	public static String getGrpName() {
		return getGrpName(moduleID, typeID);
	}

	/**
	 * 定数グループの名称を返します。
	 * @param lc ロケール
	 */
	public static String getGrpName(Locale lcl) {
		return getGrpName(lcl, moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 */
	public static String getGrpRmrks() {
		return getGrpRmrks(moduleID, typeID);
	}

	/**
	 * 定数グループの備考を返します。
	 * @param lc ロケール
	 */
	public static String getGrpRmrks(Locale lcl) {
		return getGrpRmrks(lcl, moduleID, typeID);
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putName(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.get(value);
		row.setString(nameColumn, type.name());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putNameNE(r, valueColumn, nameColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn , Locale lcl) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putName(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, Locale lcl) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
		}
		else {
			row.setString(nameColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.get(value);
		row.setString(nameColumn, type.name());
		row.setString(rmrksColumn, type.rmrks());
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
		}
	}

	/**
	 * 対象となるRowコンテナ(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致していれば対応する名称をnameColumnに、備考をrmrksColumnにセットします。<P>
	 * <font color=red><b>
	 * サーバ側で使用する場合、使用されるロケールはサーバのロケールです。
	 * サーバ側で、ユーザロケールの名称を設定したい場合は、
	 * 引数にロケールを受けるputNameまたはputNameNEメソッドを使用し、明示的にユーザロケールを指定して下さい｡
	 * </b></font>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name());
			row.setString(rmrksColumn, type.rmrks());
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

	/**
	 * 対象となるList(引数のlist)に対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の名称をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数のrow)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。
	 * @param  <E> MCRowを継承したクラス
	 * @param row 対象となるRow
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putName(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.get(value);
		row.setString(nameColumn, type.name(lcl));
		row.setString(rmrksColumn, type.rmrks(lcl));
	}

	/**
	 * 対象となるList(引数のlist)の保持するすべてのRowに対して、定数の値とvalueColumnの値を比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param list 対象となるList
	 * @param valueColumn 定数の値と比較するlistのカラム名
	 * @param nameColumn 定数の名称をセットするlistのカラム名
	 * @param rmrksColumn 定数の備考をセットするlistのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(MCList<E> list, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		for (MCRow r : list) {
			MGC_COST_ACT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
		}
	}

	/**
	 * 対象となるRow(引数 row)に対して、定数の値とvalueColumnを比較し、<BR>
	 * 一致している定数があれば、引数のロケールの定数名をnameColumnに、備考をrmrksColumnにセットします。<BR>
	 * 一致しない場合は無視します。
	 * @param <E> MCRowを継承したクラス
	 * @param row 対象となるRowコンテナ
	 * @param valueColumn 定数の値と比較するrowのカラム名
	 * @param nameColumn 定数の名称をセットするrowのカラム名
	 * @param rmrksColumn 定数の備考をセットするrowのカラム名
	 * @param lcl ロケール
	 */
	public static <E extends MCRow> void putNameNE(E row, String valueColumn, String nameColumn, String rmrksColumn, Locale lcl) {
		String value = row.getString(valueColumn);
		MGC_COST_ACT_TYP type = MGC_COST_ACT_TYP.getNE(value);
		if (type != null) {
			row.setString(nameColumn, type.name(lcl));
			row.setString(rmrksColumn, type.rmrks(lcl));
		}
		else {
			row.setString(nameColumn, null);
			row.setString(rmrksColumn, null);
		}
	}

}
