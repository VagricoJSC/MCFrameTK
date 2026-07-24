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
abstract class MSC_DLV_SLIP_STR_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "DLV_SLIP_STR";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_DLV_SLIP_STR[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "dlv_slip_str";

	public static final String $NAME = "dlv_slip_str_nm";

	/*
	 * 定数の定義です。
	 */
	/** 納品書用文字列：貴社注文Ｎｏ
	 */
	public static final MSC_DLV_SLIP_STR CST_PO_NO = create("1", "CST_PO_NO");

	/** 納品書用文字列：納品先
	 */
	public static final MSC_DLV_SLIP_STR DLV = create("2", "DLV");

	/** 納品書用文字列：得意先
	 */
	public static final MSC_DLV_SLIP_STR CST = create("3", "CST");

	/** 納品書用文字列：出荷日
	 */
	public static final MSC_DLV_SLIP_STR SHIP_DT = create("4", "SHIP_DT");

	/** 納品書用文字列：計上日
	 */
	public static final MSC_DLV_SLIP_STR AC_DT = create("5", "AC_DT");

	/** 納品書用文字列：出荷元
	 */
	public static final MSC_DLV_SLIP_STR LG_GRP = create("6", "LG_GRP");

	/** 納品書用文字列：訂正
	 */
	public static final MSC_DLV_SLIP_STR UPD = create("7", "UPD");

	/** 納品書用文字列：取消
	 */
	public static final MSC_DLV_SLIP_STR CAN = create("8", "CAN");

	/** 納品書用文字列：無効
	 */
	public static final MSC_DLV_SLIP_STR DIS = create("9", "DIS");

	/** 納品書用文字列：御中
	 */
	public static final MSC_DLV_SLIP_STR DEAR1 = create("10", "DEAR1");

	/** 納品書用文字列：様
	 */
	public static final MSC_DLV_SLIP_STR DEAR2 = create("11", "DEAR2");

	/** 納品書用文字列：行
	 */
	public static final MSC_DLV_SLIP_STR DEAR3 = create("12", "DEAR3");

	/** 納品書用文字列：（予定）
	 */
	public static final MSC_DLV_SLIP_STR SCHD = create("13", "SCHD");

	/** 納品書用文字列：複
	 */
	public static final MSC_DLV_SLIP_STR PLURAL = create("14", "PLURAL");

	/** 納品書用文字列：納品日
	 */
	public static final MSC_DLV_SLIP_STR DLV_DT = create("15", "DLV_DT");

	/** 納品書用文字列：出荷時納品書Ｎｏ
	 */
	public static final MSC_DLV_SLIP_STR SHIP_DLV_SLIP_NO = create("16", "SHIP_DLV_SLIP_NO");

	/** 納品書用文字列：為替レート
	 */
	public static final MSC_DLV_SLIP_STR XRATE = create("17", "XRATE");

	/** 納品書用文字列：％対象
	 */
	public static final MSC_DLV_SLIP_STR TAX_TGT = create("18", "TAX_TGT");

	/** 納品書用文字列：支給計上日（基）
	 */
	public static final MSC_DLV_SLIP_STR BASE_AC_DT = create("19", "BASE_AC_DT");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_DLV_SLIP_STR create() {
		return new MSC_DLV_SLIP_STR();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_DLV_SLIP_STR get(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		if (type == null) {
			throw MSC_DLV_SLIP_STR.invalidValue(value);
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
	public static MSC_DLV_SLIP_STR getNE(String value) {
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_DLV_SLIP_STR create(String value, String xmlKey) {
		MSC_DLV_SLIP_STR me = MSC_DLV_SLIP_STR.create();
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
		MSC_DLV_SLIP_STR me = MSC_DLV_SLIP_STR.getNE(value);
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
		MSC_DLV_SLIP_STR me = MSC_DLV_SLIP_STR.getNE(value);
		if (me == null) {
			throw MSC_DLV_SLIP_STR.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_DLV_SLIP_STR me = MSC_DLV_SLIP_STR.getNE(value);
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
	public static MSC_DLV_SLIP_STR[] array() {
		if (array == null) {
			array = new MSC_DLV_SLIP_STR[] {
					MSC_DLV_SLIP_STR.CST_PO_NO, MSC_DLV_SLIP_STR.DLV, MSC_DLV_SLIP_STR.CST, MSC_DLV_SLIP_STR.SHIP_DT, MSC_DLV_SLIP_STR.AC_DT, 
					 MSC_DLV_SLIP_STR.LG_GRP, MSC_DLV_SLIP_STR.UPD, MSC_DLV_SLIP_STR.CAN, MSC_DLV_SLIP_STR.DIS, MSC_DLV_SLIP_STR.DEAR1, MSC_DLV_SLIP_STR.DEAR2, 
					 MSC_DLV_SLIP_STR.DEAR3, MSC_DLV_SLIP_STR.SCHD, MSC_DLV_SLIP_STR.PLURAL, MSC_DLV_SLIP_STR.DLV_DT, MSC_DLV_SLIP_STR.SHIP_DLV_SLIP_NO, MSC_DLV_SLIP_STR.XRATE, 
					 MSC_DLV_SLIP_STR.TAX_TGT, MSC_DLV_SLIP_STR.BASE_AC_DT
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
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
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
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
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
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
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
			if(MSC_DLV_SLIP_STR.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_DLV_SLIP_STR me = MSC_DLV_SLIP_STR.get(MSC_DLV_SLIP_STR.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_DLV_SLIP_STR#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_DLV_SLIP_STR.subList(row);
			if (list.isEmpty()) {
				list = MSC_DLV_SLIP_STR.list();
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
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
			if(MSC_DLV_SLIP_STR.isSameVals(me, cols, vals)){
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
			list = MSC_DLV_SLIP_STR.subList(cols, vals);
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
		for (MSC_DLV_SLIP_STR me : MSC_DLV_SLIP_STR.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_DLV_SLIP_STR.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_DLV_SLIP_STR me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_DLV_SLIP_STR", col);}
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
	protected boolean isSame(MSC_DLV_SLIP_STR type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 納品書用文字列：貴社注文Ｎｏかどうか
	 * @param value 定数値
	 * @return 定数値が貴社注文Ｎｏの値の場合true
	 */
	public static boolean isCST_PO_NO(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.CST_PO_NO.isSame(type);
	}

	/**
	 * 納品書用文字列：貴社注文Ｎｏかどうか
	 * @param type 属性値
	 * @return 属性値が貴社注文Ｎｏの値の場合true
	 */
	public static boolean isCST_PO_NO(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.CST_PO_NO.isSame(type);
	}

	/**
	 * 納品書用文字列：納品先かどうか
	 * @param value 定数値
	 * @return 定数値が納品先の値の場合true
	 */
	public static boolean isDLV(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DLV.isSame(type);
	}

	/**
	 * 納品書用文字列：納品先かどうか
	 * @param type 属性値
	 * @return 属性値が納品先の値の場合true
	 */
	public static boolean isDLV(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DLV.isSame(type);
	}

	/**
	 * 納品書用文字列：得意先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先の値の場合true
	 */
	public static boolean isCST(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.CST.isSame(type);
	}

	/**
	 * 納品書用文字列：得意先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先の値の場合true
	 */
	public static boolean isCST(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.CST.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷日かどうか
	 * @param value 定数値
	 * @return 定数値が出荷日の値の場合true
	 */
	public static boolean isSHIP_DT(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.SHIP_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷日かどうか
	 * @param type 属性値
	 * @return 属性値が出荷日の値の場合true
	 */
	public static boolean isSHIP_DT(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.SHIP_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：計上日かどうか
	 * @param value 定数値
	 * @return 定数値が計上日の値の場合true
	 */
	public static boolean isAC_DT(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.AC_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：計上日かどうか
	 * @param type 属性値
	 * @return 属性値が計上日の値の場合true
	 */
	public static boolean isAC_DT(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.AC_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷元かどうか
	 * @param value 定数値
	 * @return 定数値が出荷元の値の場合true
	 */
	public static boolean isLG_GRP(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.LG_GRP.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷元かどうか
	 * @param type 属性値
	 * @return 属性値が出荷元の値の場合true
	 */
	public static boolean isLG_GRP(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.LG_GRP.isSame(type);
	}

	/**
	 * 納品書用文字列：訂正かどうか
	 * @param value 定数値
	 * @return 定数値が訂正の値の場合true
	 */
	public static boolean isUPD(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.UPD.isSame(type);
	}

	/**
	 * 納品書用文字列：訂正かどうか
	 * @param type 属性値
	 * @return 属性値が訂正の値の場合true
	 */
	public static boolean isUPD(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.UPD.isSame(type);
	}

	/**
	 * 納品書用文字列：取消かどうか
	 * @param value 定数値
	 * @return 定数値が取消の値の場合true
	 */
	public static boolean isCAN(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.CAN.isSame(type);
	}

	/**
	 * 納品書用文字列：取消かどうか
	 * @param type 属性値
	 * @return 属性値が取消の値の場合true
	 */
	public static boolean isCAN(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.CAN.isSame(type);
	}

	/**
	 * 納品書用文字列：無効かどうか
	 * @param value 定数値
	 * @return 定数値が無効の値の場合true
	 */
	public static boolean isDIS(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DIS.isSame(type);
	}

	/**
	 * 納品書用文字列：無効かどうか
	 * @param type 属性値
	 * @return 属性値が無効の値の場合true
	 */
	public static boolean isDIS(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DIS.isSame(type);
	}

	/**
	 * 納品書用文字列：御中かどうか
	 * @param value 定数値
	 * @return 定数値が御中の値の場合true
	 */
	public static boolean isDEAR1(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DEAR1.isSame(type);
	}

	/**
	 * 納品書用文字列：御中かどうか
	 * @param type 属性値
	 * @return 属性値が御中の値の場合true
	 */
	public static boolean isDEAR1(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DEAR1.isSame(type);
	}

	/**
	 * 納品書用文字列：様かどうか
	 * @param value 定数値
	 * @return 定数値が様の値の場合true
	 */
	public static boolean isDEAR2(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DEAR2.isSame(type);
	}

	/**
	 * 納品書用文字列：様かどうか
	 * @param type 属性値
	 * @return 属性値が様の値の場合true
	 */
	public static boolean isDEAR2(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DEAR2.isSame(type);
	}

	/**
	 * 納品書用文字列：行かどうか
	 * @param value 定数値
	 * @return 定数値が行の値の場合true
	 */
	public static boolean isDEAR3(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DEAR3.isSame(type);
	}

	/**
	 * 納品書用文字列：行かどうか
	 * @param type 属性値
	 * @return 属性値が行の値の場合true
	 */
	public static boolean isDEAR3(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DEAR3.isSame(type);
	}

	/**
	 * 納品書用文字列：（予定）かどうか
	 * @param value 定数値
	 * @return 定数値が（予定）の値の場合true
	 */
	public static boolean isSCHD(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.SCHD.isSame(type);
	}

	/**
	 * 納品書用文字列：（予定）かどうか
	 * @param type 属性値
	 * @return 属性値が（予定）の値の場合true
	 */
	public static boolean isSCHD(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.SCHD.isSame(type);
	}

	/**
	 * 納品書用文字列：複かどうか
	 * @param value 定数値
	 * @return 定数値が複の値の場合true
	 */
	public static boolean isPLURAL(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.PLURAL.isSame(type);
	}

	/**
	 * 納品書用文字列：複かどうか
	 * @param type 属性値
	 * @return 属性値が複の値の場合true
	 */
	public static boolean isPLURAL(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.PLURAL.isSame(type);
	}

	/**
	 * 納品書用文字列：納品日かどうか
	 * @param value 定数値
	 * @return 定数値が納品日の値の場合true
	 */
	public static boolean isDLV_DT(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.DLV_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：納品日かどうか
	 * @param type 属性値
	 * @return 属性値が納品日の値の場合true
	 */
	public static boolean isDLV_DT(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.DLV_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷時納品書Ｎｏかどうか
	 * @param value 定数値
	 * @return 定数値が出荷時納品書Ｎｏの値の場合true
	 */
	public static boolean isSHIP_DLV_SLIP_NO(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.SHIP_DLV_SLIP_NO.isSame(type);
	}

	/**
	 * 納品書用文字列：出荷時納品書Ｎｏかどうか
	 * @param type 属性値
	 * @return 属性値が出荷時納品書Ｎｏの値の場合true
	 */
	public static boolean isSHIP_DLV_SLIP_NO(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.SHIP_DLV_SLIP_NO.isSame(type);
	}

	/**
	 * 納品書用文字列：為替レートかどうか
	 * @param value 定数値
	 * @return 定数値が為替レートの値の場合true
	 */
	public static boolean isXRATE(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.XRATE.isSame(type);
	}

	/**
	 * 納品書用文字列：為替レートかどうか
	 * @param type 属性値
	 * @return 属性値が為替レートの値の場合true
	 */
	public static boolean isXRATE(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.XRATE.isSame(type);
	}

	/**
	 * 納品書用文字列：％対象かどうか
	 * @param value 定数値
	 * @return 定数値が％対象の値の場合true
	 */
	public static boolean isTAX_TGT(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.TAX_TGT.isSame(type);
	}

	/**
	 * 納品書用文字列：％対象かどうか
	 * @param type 属性値
	 * @return 属性値が％対象の値の場合true
	 */
	public static boolean isTAX_TGT(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.TAX_TGT.isSame(type);
	}

	/**
	 * 納品書用文字列：支給計上日（基）かどうか
	 * @param value 定数値
	 * @return 定数値が支給計上日（基）の値の場合true
	 */
	public static boolean isBASE_AC_DT(String value) {
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
		return MSC_DLV_SLIP_STR.BASE_AC_DT.isSame(type);
	}

	/**
	 * 納品書用文字列：支給計上日（基）かどうか
	 * @param type 属性値
	 * @return 属性値が支給計上日（基）の値の場合true
	 */
	public static boolean isBASE_AC_DT(MSC_DLV_SLIP_STR type) {
		return MSC_DLV_SLIP_STR.BASE_AC_DT.isSame(type);
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
			MSC_DLV_SLIP_STR.putName(r, valueColumn, nameColumn);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.get(value);
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
			MSC_DLV_SLIP_STR.putNameNE(r, valueColumn, nameColumn);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
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
			MSC_DLV_SLIP_STR.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.get(value);
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
			MSC_DLV_SLIP_STR.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
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
			MSC_DLV_SLIP_STR.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.get(value);
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
			MSC_DLV_SLIP_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
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
			MSC_DLV_SLIP_STR.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.get(value);
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
			MSC_DLV_SLIP_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_DLV_SLIP_STR type = MSC_DLV_SLIP_STR.getNE(value);
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
