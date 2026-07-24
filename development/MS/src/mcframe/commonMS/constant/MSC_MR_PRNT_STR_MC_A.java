package mcframe.commonMS.constant;

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

@SuppressWarnings("all")
abstract class MSC_MR_PRNT_STR_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "MR_PRNT_STR";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_MR_PRNT_STR[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "mr_prnt_str";

	public static final String $NAME = "mr_prnt_str_nm";

	/*
	 * 定数の定義です。
	 */
	/** 製造記録書文字列：(
	 */
	public static final MSC_MR_PRNT_STR LEFT = create("1", "LEFT");

	/** 製造記録書文字列：)
	 */
	public static final MSC_MR_PRNT_STR RIGHT = create("2", "RIGHT");

	/** 製造記録書文字列：製造実績備考
	 */
	public static final MSC_MR_PRNT_STR MFG_ACT_RMRKS = create("3", "MFG_ACT_RMRKS");

	/** 製造記録書文字列：品目製造実績備考
	 */
	public static final MSC_MR_PRNT_STR ITM_MFG_ACT_RMRKS = create("4", "ITM_MFG_ACT_RMRKS");

	/** 製造記録書文字列：工程実績備考
	 */
	public static final MSC_MR_PRNT_STR OPER_ACT_RMRKS = create("5", "OPER_ACT_RMRKS");

	/** 製造記録書文字列：製造記録承認日
	 */
	public static final MSC_MR_PRNT_STR APRV_DT = create("7", "APRV_DT");

	/** 製造記録書文字列：製造記録承認部門名
	 */
	public static final MSC_MR_PRNT_STR APRV_DPT = create("8", "APRV_DPT");

	/** 製造記録書文字列：製造記録承認者名
	 */
	public static final MSC_MR_PRNT_STR APRV_USR = create("9", "APRV_USR");

	/** 製造記録書文字列：版：
	 */
	public static final MSC_MR_PRNT_STR VER_NO = create("10", "VER_NO");

	/** 製造記録書文字列：収率（品目）
	 */
	public static final MSC_MR_PRNT_STR ITM_YIELD = create("11", "ITM_YIELD");

	/** 製造記録書文字列：収率（工程）
	 */
	public static final MSC_MR_PRNT_STR OPER_YIELD = create("12", "OPER_YIELD");

	/** 製造記録書文字列：下：
	 */
	public static final MSC_MR_PRNT_STR LOWER_YIELD = create("13", "LOWER_YIELD");

	/** 製造記録書文字列：標：
	 */
	public static final MSC_MR_PRNT_STR STD_YIELD = create("14", "STD_YIELD");

	/** 製造記録書文字列：上：
	 */
	public static final MSC_MR_PRNT_STR UPPER_YIELD = create("15", "UPPER_YIELD");

	/** 製造記録書文字列：実：
	 */
	public static final MSC_MR_PRNT_STR ACT_YIELD = create("16", "ACT_YIELD");

	/** 製造記録書文字列：製造記録書
	 */
	public static final MSC_MR_PRNT_STR TITLE = create("17", "TITLE");

	/** 製造記録書文字列：-
	 */
	public static final MSC_MR_PRNT_STR HYPHEN = create("18", "HYPHEN");

	/** 製造記録書文字列：理由
	 */
	public static final MSC_MR_PRNT_STR APRV_RSN = create("19", "APRV_RSN");

	/** 製造記録書文字列：指図時発行
	 */
	public static final MSC_MR_PRNT_STR INST_ISSUE = create("20", "INST_ISSUE");

	/** 製造記録書文字列：実績時発行
	 */
	public static final MSC_MR_PRNT_STR ACT_ISSUE = create("21", "ACT_ISSUE");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_MR_PRNT_STR create() {
		return new MSC_MR_PRNT_STR();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_MR_PRNT_STR get(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		if (type == null) {
			throw MSC_MR_PRNT_STR.invalidValue(value);
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
	public static MSC_MR_PRNT_STR getNE(String value) {
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_MR_PRNT_STR create(String value, String xmlKey) {
		MSC_MR_PRNT_STR me = MSC_MR_PRNT_STR.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
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
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_MR_PRNT_STR me = MSC_MR_PRNT_STR.getNE(value);
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
		MSC_MR_PRNT_STR me = MSC_MR_PRNT_STR.getNE(value);
		if (me == null) {
			throw MSC_MR_PRNT_STR.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_MR_PRNT_STR me = MSC_MR_PRNT_STR.getNE(value);
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
		return createStringPath(value(), name());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_MR_PRNT_STR[] array() {
		if (array == null) {
			array = new MSC_MR_PRNT_STR[] {
					MSC_MR_PRNT_STR.LEFT, MSC_MR_PRNT_STR.RIGHT, MSC_MR_PRNT_STR.MFG_ACT_RMRKS, MSC_MR_PRNT_STR.ITM_MFG_ACT_RMRKS, MSC_MR_PRNT_STR.OPER_ACT_RMRKS, 
					 MSC_MR_PRNT_STR.APRV_DT, MSC_MR_PRNT_STR.APRV_DPT, MSC_MR_PRNT_STR.APRV_USR, MSC_MR_PRNT_STR.VER_NO, MSC_MR_PRNT_STR.ITM_YIELD, MSC_MR_PRNT_STR.OPER_YIELD, 
					 MSC_MR_PRNT_STR.LOWER_YIELD, MSC_MR_PRNT_STR.STD_YIELD, MSC_MR_PRNT_STR.UPPER_YIELD, MSC_MR_PRNT_STR.ACT_YIELD, MSC_MR_PRNT_STR.TITLE, MSC_MR_PRNT_STR.HYPHEN, 
					 MSC_MR_PRNT_STR.APRV_RSN, MSC_MR_PRNT_STR.INST_ISSUE, MSC_MR_PRNT_STR.ACT_ISSUE
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
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
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
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
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
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
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
			if(MSC_MR_PRNT_STR.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_MR_PRNT_STR me = MSC_MR_PRNT_STR.get(MSC_MR_PRNT_STR.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_MR_PRNT_STR#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_MR_PRNT_STR.subList(row);
			if (list.isEmpty()) {
				list = MSC_MR_PRNT_STR.list();
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
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
			if(MSC_MR_PRNT_STR.isSameVals(me, cols, vals)){
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
			list = MSC_MR_PRNT_STR.subList(cols, vals);
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
		for (MSC_MR_PRNT_STR me : MSC_MR_PRNT_STR.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_MR_PRNT_STR.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_MR_PRNT_STR me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_MR_PRNT_STR", col);}
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
	protected boolean isSame(MSC_MR_PRNT_STR type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 製造記録書文字列：(かどうか
	 * @param value 定数値
	 * @return 定数値が(の値の場合true
	 */
	public static boolean isLEFT(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.LEFT.isSame(type);
	}

	/**
	 * 製造記録書文字列：(かどうか
	 * @param type 属性値
	 * @return 属性値が(の値の場合true
	 */
	public static boolean isLEFT(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.LEFT.isSame(type);
	}

	/**
	 * 製造記録書文字列：)かどうか
	 * @param value 定数値
	 * @return 定数値が)の値の場合true
	 */
	public static boolean isRIGHT(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.RIGHT.isSame(type);
	}

	/**
	 * 製造記録書文字列：)かどうか
	 * @param type 属性値
	 * @return 属性値が)の値の場合true
	 */
	public static boolean isRIGHT(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.RIGHT.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造実績備考かどうか
	 * @param value 定数値
	 * @return 定数値が製造実績備考の値の場合true
	 */
	public static boolean isMFG_ACT_RMRKS(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.MFG_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造実績備考かどうか
	 * @param type 属性値
	 * @return 属性値が製造実績備考の値の場合true
	 */
	public static boolean isMFG_ACT_RMRKS(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.MFG_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：品目製造実績備考かどうか
	 * @param value 定数値
	 * @return 定数値が品目製造実績備考の値の場合true
	 */
	public static boolean isITM_MFG_ACT_RMRKS(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.ITM_MFG_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：品目製造実績備考かどうか
	 * @param type 属性値
	 * @return 属性値が品目製造実績備考の値の場合true
	 */
	public static boolean isITM_MFG_ACT_RMRKS(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.ITM_MFG_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：工程実績備考かどうか
	 * @param value 定数値
	 * @return 定数値が工程実績備考の値の場合true
	 */
	public static boolean isOPER_ACT_RMRKS(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.OPER_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：工程実績備考かどうか
	 * @param type 属性値
	 * @return 属性値が工程実績備考の値の場合true
	 */
	public static boolean isOPER_ACT_RMRKS(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.OPER_ACT_RMRKS.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認日かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録承認日の値の場合true
	 */
	public static boolean isAPRV_DT(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.APRV_DT.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認日かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録承認日の値の場合true
	 */
	public static boolean isAPRV_DT(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.APRV_DT.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認部門名かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録承認部門名の値の場合true
	 */
	public static boolean isAPRV_DPT(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.APRV_DPT.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認部門名かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録承認部門名の値の場合true
	 */
	public static boolean isAPRV_DPT(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.APRV_DPT.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認者名かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録承認者名の値の場合true
	 */
	public static boolean isAPRV_USR(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.APRV_USR.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録承認者名かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録承認者名の値の場合true
	 */
	public static boolean isAPRV_USR(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.APRV_USR.isSame(type);
	}

	/**
	 * 製造記録書文字列：版：かどうか
	 * @param value 定数値
	 * @return 定数値が版：の値の場合true
	 */
	public static boolean isVER_NO(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.VER_NO.isSame(type);
	}

	/**
	 * 製造記録書文字列：版：かどうか
	 * @param type 属性値
	 * @return 属性値が版：の値の場合true
	 */
	public static boolean isVER_NO(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.VER_NO.isSame(type);
	}

	/**
	 * 製造記録書文字列：収率（品目）かどうか
	 * @param value 定数値
	 * @return 定数値が収率（品目）の値の場合true
	 */
	public static boolean isITM_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.ITM_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：収率（品目）かどうか
	 * @param type 属性値
	 * @return 属性値が収率（品目）の値の場合true
	 */
	public static boolean isITM_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.ITM_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：収率（工程）かどうか
	 * @param value 定数値
	 * @return 定数値が収率（工程）の値の場合true
	 */
	public static boolean isOPER_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.OPER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：収率（工程）かどうか
	 * @param type 属性値
	 * @return 属性値が収率（工程）の値の場合true
	 */
	public static boolean isOPER_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.OPER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：下：かどうか
	 * @param value 定数値
	 * @return 定数値が下：の値の場合true
	 */
	public static boolean isLOWER_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.LOWER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：下：かどうか
	 * @param type 属性値
	 * @return 属性値が下：の値の場合true
	 */
	public static boolean isLOWER_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.LOWER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：標：かどうか
	 * @param value 定数値
	 * @return 定数値が標：の値の場合true
	 */
	public static boolean isSTD_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.STD_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：標：かどうか
	 * @param type 属性値
	 * @return 属性値が標：の値の場合true
	 */
	public static boolean isSTD_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.STD_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：上：かどうか
	 * @param value 定数値
	 * @return 定数値が上：の値の場合true
	 */
	public static boolean isUPPER_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.UPPER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：上：かどうか
	 * @param type 属性値
	 * @return 属性値が上：の値の場合true
	 */
	public static boolean isUPPER_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.UPPER_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：実：かどうか
	 * @param value 定数値
	 * @return 定数値が実：の値の場合true
	 */
	public static boolean isACT_YIELD(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.ACT_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：実：かどうか
	 * @param type 属性値
	 * @return 属性値が実：の値の場合true
	 */
	public static boolean isACT_YIELD(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.ACT_YIELD.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録書かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録書の値の場合true
	 */
	public static boolean isTITLE(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.TITLE.isSame(type);
	}

	/**
	 * 製造記録書文字列：製造記録書かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録書の値の場合true
	 */
	public static boolean isTITLE(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.TITLE.isSame(type);
	}

	/**
	 * 製造記録書文字列：-かどうか
	 * @param value 定数値
	 * @return 定数値が-の値の場合true
	 */
	public static boolean isHYPHEN(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.HYPHEN.isSame(type);
	}

	/**
	 * 製造記録書文字列：-かどうか
	 * @param type 属性値
	 * @return 属性値が-の値の場合true
	 */
	public static boolean isHYPHEN(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.HYPHEN.isSame(type);
	}

	/**
	 * 製造記録書文字列：理由かどうか
	 * @param value 定数値
	 * @return 定数値が理由の値の場合true
	 */
	public static boolean isAPRV_RSN(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.APRV_RSN.isSame(type);
	}

	/**
	 * 製造記録書文字列：理由かどうか
	 * @param type 属性値
	 * @return 属性値が理由の値の場合true
	 */
	public static boolean isAPRV_RSN(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.APRV_RSN.isSame(type);
	}

	/**
	 * 製造記録書文字列：指図時発行かどうか
	 * @param value 定数値
	 * @return 定数値が指図時発行の値の場合true
	 */
	public static boolean isINST_ISSUE(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.INST_ISSUE.isSame(type);
	}

	/**
	 * 製造記録書文字列：指図時発行かどうか
	 * @param type 属性値
	 * @return 属性値が指図時発行の値の場合true
	 */
	public static boolean isINST_ISSUE(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.INST_ISSUE.isSame(type);
	}

	/**
	 * 製造記録書文字列：実績時発行かどうか
	 * @param value 定数値
	 * @return 定数値が実績時発行の値の場合true
	 */
	public static boolean isACT_ISSUE(String value) {
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
		return MSC_MR_PRNT_STR.ACT_ISSUE.isSame(type);
	}

	/**
	 * 製造記録書文字列：実績時発行かどうか
	 * @param type 属性値
	 * @return 属性値が実績時発行の値の場合true
	 */
	public static boolean isACT_ISSUE(MSC_MR_PRNT_STR type) {
		return MSC_MR_PRNT_STR.ACT_ISSUE.isSame(type);
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
			MSC_MR_PRNT_STR.putName(r, valueColumn, nameColumn);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.get(value);
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
			MSC_MR_PRNT_STR.putNameNE(r, valueColumn, nameColumn);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
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
			MSC_MR_PRNT_STR.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.get(value);
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
			MSC_MR_PRNT_STR.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
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
			MSC_MR_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.get(value);
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
			MSC_MR_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
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
			MSC_MR_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.get(value);
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
			MSC_MR_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_MR_PRNT_STR type = MSC_MR_PRNT_STR.getNE(value);
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
