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
abstract class MGC_NUM_SYS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MG";

	public static final String typeID = "NUM_SYS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MGC_NUM_SYS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "num_sys_typ";

	public static final String $NAME = "num_sys_typ_nm";

	public static final String $LENGTH = "length";

	public static final String $PREFIX = "prefix";

	/*
	 * 定数の定義です。
	 */
	/** 発番システム区分：月初在庫キー
	 */
	public static final MGC_NUM_SYS_TYP ST_STK_KEY = create("MGS_ST_STK_KEY", "ST_STK_KEY", new MCNumber(15), null);

	/** 発番システム区分：月初仕掛キー
	 */
	public static final MGC_NUM_SYS_TYP ST_WIP_KEY = create("MGS_ST_WIP_KEY", "ST_WIP_KEY", new MCNumber(15), null);

	/** 発番システム区分：月次計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_RQMT_KEY = create("MGS_PLN_RQMT_KEY", "PLN_RQMT_KEY", new MCNumber(15), null);

	/** 発番システム区分：製造計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_MFG_KEY = create("MGS_PLN_MFG_KEY", "PLN_MFG_KEY", new MCNumber(15), null);

	/** 発番システム区分：購買計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_PURC_KEY = create("MGS_PLN_PURC_KEY", "PLN_PURC_KEY", new MCNumber(15), null);

	/** 発番システム区分：売上計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_SLS_KEY = create("MGS_PLN_SLS_KEY", "PLN_SLS_KEY", new MCNumber(15), null);

	/** 発番システム区分：品目工数計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_ITM_WK_KEY = create("MGS_PLN_ITM_WK_KEY", "PLN_ITM_WK_KEY", new MCNumber(15), null);

	/** 発番システム区分：品目外工数計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_OTHER_WK_KEY = create("MGS_PLN_OTHER_WK_KEY", "PLN_OTHER_WK_KEY", new MCNumber(15), null);

	/** 発番システム区分：投入計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_INPT_KEY = create("MGS_PLN_INPT_KEY", "PLN_INPT_KEY", new MCNumber(15), null);

	/** 発番システム区分：配賦費用計画キー
	 */
	public static final MGC_NUM_SYS_TYP PLN_ALC_AMT_KEY = create("MGS_PLN_ALC_AMT_KEY", "PLN_ALC_AMT_KEY", new MCNumber(15), null);

	/** 発番システム区分：配賦費用実績キー
	 */
	public static final MGC_NUM_SYS_TYP ACT_ALC_AMT_KEY = create("MGS_ACT_ALC_AMT_KEY", "ACT_ALC_AMT_KEY", new MCNumber(15), null);

	/** 発番システム区分：配賦費用計画ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP PLN_ALC_IF_DATA_LNO = create("MGS_PLN_ALC_IF_DATA_LNO", "PLN_ALC_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：配賦費用実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_ALC_IF_DATA_LNO = create("MGS_ACT_ALC_IF_DATA_LNO", "ACT_ALC_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：品目製造指図ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ITM_MFG_INST = create("MGS_ITM_MFG_INST", "ITM_MFG_INST", new MCNumber(14), null);

	/** 発番システム区分：製造実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_MFG_ID = create("MGS_ACT_MFG_ID", "ACT_MFG_ID", new MCNumber(15), null);

	/** 発番システム区分：購買実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_PURC_ID = create("MGS_ACT_PURC_ID", "ACT_PURC_ID", new MCNumber(15), null);

	/** 発番システム区分：投入実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INPT_ID = create("MGS_ACT_INPT_ID", "ACT_INPT_ID", new MCNumber(15), null);

	/** 発番システム区分：指図工数実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INST_WK_ID = create("MGS_ACT_INST_WK_ID", "ACT_INST_WK_ID", new MCNumber(15), null);

	/** 発番システム区分：指図外工数実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_OTHER_WK_ID = create("MGS_ACT_OTHER_WK_ID", "ACT_OTHER_WK_ID", new MCNumber(15), null);

	/** 発番システム区分：入出庫実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_IO_ID = create("MGS_ACT_IO_ID", "ACT_IO_ID", new MCNumber(15), null);

	/** 発番システム区分：売上実績ＩＤ
	 */
	public static final MGC_NUM_SYS_TYP ACT_SLS_ID = create("MGS_ACT_SLS_ID", "ACT_SLS_ID", new MCNumber(15), null);

	/** 発番システム区分：製造実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_MFG_IF_DATA_LNO = create("MGS_ACT_MFG_IF_DATA_LNO", "ACT_MFG_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：購買実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_PURC_IF_DATA_LNO = create("MGS_ACT_PURC_IF_DATA_LNO", "ACT_PURC_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：投入実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INPT_IF_DATA_LNO = create("MGS_ACT_INPT_IF_DATA_LNO", "ACT_INPT_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：指図工数実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INST_WK_IF_DATA_LNO = create("MGS_ACT_INST_WK_IF_DATA_LNO", "ACT_INST_WK_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：指図外工数実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_OTHER_WK_IF_DATA_LNO = create("MGS_ACT_OTHER_WK_IF_DATA_LNO", "ACT_OTHER_WK_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：入出庫実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_IO_IF_DATA_LNO = create("MGS_ACT_IO_IF_DATA_LNO", "ACT_IO_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：売上実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_SLS_IF_DATA_LNO = create("MGS_ACT_SLS_IF_DATA_LNO", "ACT_SLS_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：指図仕掛実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INST_WIP_IF_DATA_LNO = create("MGS_ACT_INST_WIP_IF_DATA_LNO", "ACT_INST_WIP_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：在庫実績ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_STK_IF_DATA_LNO = create("MGS_ACT_STK_IF_DATA_LNO", "ACT_STK_IF_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：受払実績受信ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP IO_ACT_RCV_DATA_LNO = create("MGS_IO_ACT_RCV_DATA_LNO", "IO_ACT_RCV_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：工数情報受信ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_WK_RCV_DATA_LNO = create("MGS_ACT_WK_RCV_DATA_LNO", "ACT_WK_RCV_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：仕掛情報受信ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_INST_WIP_RCV_DATA_LNO = create("MGS_ACT_INST_WIP_RCV_DATA_LNO", "ACT_INST_WIP_RCV_DATA_LNO", new MCNumber(15), null);

	/** 発番システム区分：在庫情報受信ＩＦデータ行ＮＯ
	 */
	public static final MGC_NUM_SYS_TYP ACT_STK_RCV_DATA_LNO = create("MGS_ACT_STK_RCV_DATA_LNO", "ACT_STK_RCV_DATA_LNO", new MCNumber(15), null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_NUM_SYS_TYP create() {
		return new MGC_NUM_SYS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MGC_NUM_SYS_TYP get(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		if (type == null) {
			throw MGC_NUM_SYS_TYP.invalidValue(value);
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
	public static MGC_NUM_SYS_TYP getNE(String value) {
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_NUM_SYS_TYP create(String value, String xmlKey, MCNumber attr1, String attr2) {
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addNumberColumn($LENGTH, attr1);
		me.constR.addStringColumn($PREFIX, attr2);
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
	 * lengthの値を返します。
	 * @return lengthの値
	 */
	public MCNumber length() {
		return constR.getNumberNE($LENGTH);
	}

	/** 
	 * valueに対応する定数のlengthの値を返します。
	 * @param value 定数値
	 * @return lengthの値
	 */
	public static MCNumber length(String value) {
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.length();
	}

	/** 
	 * prefixの値を返します。
	 * @return prefixの値
	 */
	public String prefix() {
		return constR.getStringNE($PREFIX);
	}

	/** 
	 * valueに対応する定数のprefixの値を返します。
	 * @param value 定数値
	 * @return prefixの値
	 */
	public static String prefix(String value) {
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.prefix();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.getNE(value);
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
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.getNE(value);
		if (me == null) {
			throw MGC_NUM_SYS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.getNE(value);
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
		return createStringPath(value(), name(), length(), prefix());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MGC_NUM_SYS_TYP[] array() {
		if (array == null) {
			array = new MGC_NUM_SYS_TYP[] {
					MGC_NUM_SYS_TYP.ST_STK_KEY, MGC_NUM_SYS_TYP.ST_WIP_KEY, MGC_NUM_SYS_TYP.PLN_RQMT_KEY, MGC_NUM_SYS_TYP.PLN_MFG_KEY, MGC_NUM_SYS_TYP.PLN_PURC_KEY, 
					 MGC_NUM_SYS_TYP.PLN_SLS_KEY, MGC_NUM_SYS_TYP.PLN_ITM_WK_KEY, MGC_NUM_SYS_TYP.PLN_OTHER_WK_KEY, MGC_NUM_SYS_TYP.PLN_INPT_KEY, MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY, MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY, 
					 MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO, MGC_NUM_SYS_TYP.ITM_MFG_INST, MGC_NUM_SYS_TYP.ACT_MFG_ID, MGC_NUM_SYS_TYP.ACT_PURC_ID, MGC_NUM_SYS_TYP.ACT_INPT_ID, 
					 MGC_NUM_SYS_TYP.ACT_INST_WK_ID, MGC_NUM_SYS_TYP.ACT_OTHER_WK_ID, MGC_NUM_SYS_TYP.ACT_IO_ID, MGC_NUM_SYS_TYP.ACT_SLS_ID, MGC_NUM_SYS_TYP.ACT_MFG_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_PURC_IF_DATA_LNO, 
					 MGC_NUM_SYS_TYP.ACT_INPT_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_INST_WK_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_OTHER_WK_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_SLS_IF_DATA_LNO, MGC_NUM_SYS_TYP.ACT_INST_WIP_IF_DATA_LNO, 
					 MGC_NUM_SYS_TYP.ACT_STK_IF_DATA_LNO, MGC_NUM_SYS_TYP.IO_ACT_RCV_DATA_LNO, MGC_NUM_SYS_TYP.ACT_WK_RCV_DATA_LNO, MGC_NUM_SYS_TYP.ACT_INST_WIP_RCV_DATA_LNO, MGC_NUM_SYS_TYP.ACT_STK_RCV_DATA_LNO
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
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
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
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
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
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
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
			if(MGC_NUM_SYS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MGC_NUM_SYS_TYP me = MGC_NUM_SYS_TYP.get(MGC_NUM_SYS_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MGC_NUM_SYS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MGC_NUM_SYS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MGC_NUM_SYS_TYP.list();
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
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
			if(MGC_NUM_SYS_TYP.isSameVals(me, cols, vals)){
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
			list = MGC_NUM_SYS_TYP.subList(cols, vals);
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
		for (MGC_NUM_SYS_TYP me : MGC_NUM_SYS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MGC_NUM_SYS_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MGC_NUM_SYS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MGC_NUM_SYS_TYP", col);}
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
	protected boolean isSame(MGC_NUM_SYS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 発番システム区分：月初在庫キーかどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫キーの値の場合true
	 */
	public static boolean isST_STK_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ST_STK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：月初在庫キーかどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫キーの値の場合true
	 */
	public static boolean isST_STK_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ST_STK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：月初仕掛キーかどうか
	 * @param value 定数値
	 * @return 定数値が月初仕掛キーの値の場合true
	 */
	public static boolean isST_WIP_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ST_WIP_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：月初仕掛キーかどうか
	 * @param type 属性値
	 * @return 属性値が月初仕掛キーの値の場合true
	 */
	public static boolean isST_WIP_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ST_WIP_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：月次計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が月次計画キーの値の場合true
	 */
	public static boolean isPLN_RQMT_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_RQMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：月次計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が月次計画キーの値の場合true
	 */
	public static boolean isPLN_RQMT_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_RQMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：製造計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が製造計画キーの値の場合true
	 */
	public static boolean isPLN_MFG_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_MFG_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：製造計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が製造計画キーの値の場合true
	 */
	public static boolean isPLN_MFG_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_MFG_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：購買計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が購買計画キーの値の場合true
	 */
	public static boolean isPLN_PURC_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_PURC_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：購買計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が購買計画キーの値の場合true
	 */
	public static boolean isPLN_PURC_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_PURC_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：売上計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が売上計画キーの値の場合true
	 */
	public static boolean isPLN_SLS_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_SLS_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：売上計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が売上計画キーの値の場合true
	 */
	public static boolean isPLN_SLS_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_SLS_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：品目工数計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が品目工数計画キーの値の場合true
	 */
	public static boolean isPLN_ITM_WK_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_ITM_WK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：品目工数計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が品目工数計画キーの値の場合true
	 */
	public static boolean isPLN_ITM_WK_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_ITM_WK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：品目外工数計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が品目外工数計画キーの値の場合true
	 */
	public static boolean isPLN_OTHER_WK_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_OTHER_WK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：品目外工数計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が品目外工数計画キーの値の場合true
	 */
	public static boolean isPLN_OTHER_WK_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_OTHER_WK_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：投入計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が投入計画キーの値の場合true
	 */
	public static boolean isPLN_INPT_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_INPT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：投入計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が投入計画キーの値の場合true
	 */
	public static boolean isPLN_INPT_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_INPT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用計画キーかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用計画キーの値の場合true
	 */
	public static boolean isPLN_ALC_AMT_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用計画キーかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用計画キーの値の場合true
	 */
	public static boolean isPLN_ALC_AMT_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_ALC_AMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用実績キーかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用実績キーの値の場合true
	 */
	public static boolean isACT_ALC_AMT_KEY(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用実績キーかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用実績キーの値の場合true
	 */
	public static boolean isACT_ALC_AMT_KEY(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_ALC_AMT_KEY.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用計画ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用計画ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPLN_ALC_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用計画ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用計画ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isPLN_ALC_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.PLN_ALC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_ALC_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：配賦費用実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_ALC_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_ALC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：品目製造指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が品目製造指図ＮＯの値の場合true
	 */
	public static boolean isITM_MFG_INST(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ITM_MFG_INST.isSame(type);
	}

	/**
	 * 発番システム区分：品目製造指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が品目製造指図ＮＯの値の場合true
	 */
	public static boolean isITM_MFG_INST(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ITM_MFG_INST.isSame(type);
	}

	/**
	 * 発番システム区分：製造実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が製造実績ＩＤの値の場合true
	 */
	public static boolean isACT_MFG_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_MFG_ID.isSame(type);
	}

	/**
	 * 発番システム区分：製造実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が製造実績ＩＤの値の場合true
	 */
	public static boolean isACT_MFG_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_MFG_ID.isSame(type);
	}

	/**
	 * 発番システム区分：購買実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が購買実績ＩＤの値の場合true
	 */
	public static boolean isACT_PURC_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_PURC_ID.isSame(type);
	}

	/**
	 * 発番システム区分：購買実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が購買実績ＩＤの値の場合true
	 */
	public static boolean isACT_PURC_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_PURC_ID.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が投入実績ＩＤの値の場合true
	 */
	public static boolean isACT_INPT_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INPT_ID.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が投入実績ＩＤの値の場合true
	 */
	public static boolean isACT_INPT_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INPT_ID.isSame(type);
	}

	/**
	 * 発番システム区分：指図工数実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が指図工数実績ＩＤの値の場合true
	 */
	public static boolean isACT_INST_WK_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INST_WK_ID.isSame(type);
	}

	/**
	 * 発番システム区分：指図工数実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が指図工数実績ＩＤの値の場合true
	 */
	public static boolean isACT_INST_WK_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INST_WK_ID.isSame(type);
	}

	/**
	 * 発番システム区分：指図外工数実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数実績ＩＤの値の場合true
	 */
	public static boolean isACT_OTHER_WK_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_OTHER_WK_ID.isSame(type);
	}

	/**
	 * 発番システム区分：指図外工数実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数実績ＩＤの値の場合true
	 */
	public static boolean isACT_OTHER_WK_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_OTHER_WK_ID.isSame(type);
	}

	/**
	 * 発番システム区分：入出庫実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績ＩＤの値の場合true
	 */
	public static boolean isACT_IO_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_IO_ID.isSame(type);
	}

	/**
	 * 発番システム区分：入出庫実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績ＩＤの値の場合true
	 */
	public static boolean isACT_IO_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_IO_ID.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績ＩＤかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績ＩＤの値の場合true
	 */
	public static boolean isACT_SLS_ID(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_SLS_ID.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績ＩＤかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績ＩＤの値の場合true
	 */
	public static boolean isACT_SLS_ID(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_SLS_ID.isSame(type);
	}

	/**
	 * 発番システム区分：製造実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が製造実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_MFG_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_MFG_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：製造実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が製造実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_MFG_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_MFG_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：購買実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が購買実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_PURC_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_PURC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：購買実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が購買実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_PURC_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_PURC_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が投入実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INPT_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INPT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：投入実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が投入実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INPT_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INPT_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図工数実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が指図工数実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WK_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INST_WK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図工数実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が指図工数実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WK_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INST_WK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図外工数実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_OTHER_WK_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_OTHER_WK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図外工数実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_OTHER_WK_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_OTHER_WK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：入出庫実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_IO_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：入出庫実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_IO_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_IO_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_SLS_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_SLS_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：売上実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_SLS_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_SLS_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図仕掛実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が指図仕掛実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WIP_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INST_WIP_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：指図仕掛実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が指図仕掛実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WIP_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INST_WIP_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：在庫実績ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が在庫実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_STK_IF_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_STK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：在庫実績ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が在庫実績ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_STK_IF_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_STK_IF_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：受払実績受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受払実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIO_ACT_RCV_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.IO_ACT_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：受払実績受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受払実績受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isIO_ACT_RCV_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.IO_ACT_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：工数情報受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が工数情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_WK_RCV_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_WK_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：工数情報受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が工数情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_WK_RCV_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_WK_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：仕掛情報受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕掛情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WIP_RCV_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_INST_WIP_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：仕掛情報受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕掛情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_INST_WIP_RCV_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_INST_WIP_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：在庫情報受信ＩＦデータ行ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が在庫情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_STK_RCV_DATA_LNO(String value) {
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
		return MGC_NUM_SYS_TYP.ACT_STK_RCV_DATA_LNO.isSame(type);
	}

	/**
	 * 発番システム区分：在庫情報受信ＩＦデータ行ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が在庫情報受信ＩＦデータ行ＮＯの値の場合true
	 */
	public static boolean isACT_STK_RCV_DATA_LNO(MGC_NUM_SYS_TYP type) {
		return MGC_NUM_SYS_TYP.ACT_STK_RCV_DATA_LNO.isSame(type);
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
			MGC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.get(value);
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
			MGC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
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
			MGC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.get(value);
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
			MGC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
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
			MGC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.get(value);
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
			MGC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
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
			MGC_NUM_SYS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.get(value);
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
			MGC_NUM_SYS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_NUM_SYS_TYP type = MGC_NUM_SYS_TYP.getNE(value);
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
