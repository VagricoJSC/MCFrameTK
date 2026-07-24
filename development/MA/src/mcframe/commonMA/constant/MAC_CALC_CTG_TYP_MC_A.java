package mcframe.commonMA.constant;

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
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MAC_CALC_CTG_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "CALC_CTG_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_CALC_CTG_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "calc_ctg_typ";

	public static final String $NAME = "calc_ctg_typ_nm";

	/*
	 * 定数の定義です。
	 */
	/** 計算カテゴリ区分：計算品目
	 */
	public static final MAC_CALC_CTG_TYP CALC_ITM = create("10", "CALC_ITM");

	/** 計算カテゴリ区分：品目詳細
	 */
	public static final MAC_CALC_CTG_TYP ITM_DTL = create("20", "ITM_DTL");

	/** 計算カテゴリ区分：品目工程
	 */
	public static final MAC_CALC_CTG_TYP ITM_OPER = create("21", "ITM_OPER");

	/** 計算カテゴリ区分：ＢＯＭ
	 */
	public static final MAC_CALC_CTG_TYP BOM = create("22", "BOM");

	/** 計算カテゴリ区分：品目工数
	 */
	public static final MAC_CALC_CTG_TYP ITM_WK = create("23", "ITM_WK");

	/** 計算カテゴリ区分：購買単価
	 */
	public static final MAC_CALC_CTG_TYP ITM_PURC = create("24", "ITM_PURC");

	/** 計算カテゴリ区分：加工単価
	 */
	public static final MAC_CALC_CTG_TYP ITM_PROC = create("25", "ITM_PROC");

	/** 計算カテゴリ区分：支給単価
	 */
	public static final MAC_CALC_CTG_TYP ITM_PROV = create("26", "ITM_PROV");

	/** 計算カテゴリ区分：販売単価
	 */
	public static final MAC_CALC_CTG_TYP ITM_SLS = create("27", "ITM_SLS");

	/** 計算カテゴリ区分：指値
	 */
	public static final MAC_CALC_CTG_TYP ITM_FIX = create("28", "ITM_FIX");

	/** 計算カテゴリ区分：標準配賦率
	 */
	public static final MAC_CALC_CTG_TYP ALC_RATE_M = create("30", "ALC_RATE_M");

	/** 計算カテゴリ区分：配賦パタン選択
	 */
	public static final MAC_CALC_CTG_TYP ALC_PTN_SEL = create("31", "ALC_PTN_SEL");

	/** 計算カテゴリ区分：一次配賦基準選択
	 */
	public static final MAC_CALC_CTG_TYP PRE_ALC_RATE_SEL = create("32", "PRE_ALC_RATE_SEL");

	/** 計算カテゴリ区分：配賦金額
	 */
	public static final MAC_CALC_CTG_TYP ALC_AMT = create("40", "ALC_AMT");

	/** 計算カテゴリ区分：予定配賦率
	 */
	public static final MAC_CALC_CTG_TYP ALC_RATE_T = create("41", "ALC_RATE_T");

	/** 計算カテゴリ区分：一次配賦期間比率
	 */
	public static final MAC_CALC_CTG_TYP PRE_RATE_TERM = create("42", "PRE_RATE_TERM");

	/** 計算カテゴリ区分：一次配賦月次比率
	 */
	public static final MAC_CALC_CTG_TYP PRE_RATE_MLY = create("43", "PRE_RATE_MLY");

	/** 計算カテゴリ区分：月次計画
	 */
	public static final MAC_CALC_CTG_TYP RQMT = create("50", "RQMT");

	/** 計算カテゴリ区分：製造
	 */
	public static final MAC_CALC_CTG_TYP MFG = create("51", "MFG");

	/** 計算カテゴリ区分：購買
	 */
	public static final MAC_CALC_CTG_TYP PURC = create("52", "PURC");

	/** 計算カテゴリ区分：売上
	 */
	public static final MAC_CALC_CTG_TYP SLS = create("53", "SLS");

	/** 計算カテゴリ区分：投入
	 */
	public static final MAC_CALC_CTG_TYP INPT = create("54", "INPT");

	/** 計算カテゴリ区分：指図工数／品目工数
	 */
	public static final MAC_CALC_CTG_TYP WK = create("55", "WK");

	/** 計算カテゴリ区分：指図外工数／品目外工数
	 */
	public static final MAC_CALC_CTG_TYP OTHER_WK = create("56", "OTHER_WK");

	/** 計算カテゴリ区分：入出庫
	 */
	public static final MAC_CALC_CTG_TYP IO = create("57", "IO");

	/** 計算カテゴリ区分：指図仕掛
	 */
	public static final MAC_CALC_CTG_TYP INST_WIP = create("58", "INST_WIP");

	/** 計算カテゴリ区分：在庫実績
	 */
	public static final MAC_CALC_CTG_TYP END_STK = create("59", "END_STK");

	/** 計算カテゴリ区分：汎用配賦
	 */
	public static final MAC_CALC_CTG_TYP GP_ALC = create("60", "GP_ALC");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_CALC_CTG_TYP create() {
		return new MAC_CALC_CTG_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_CALC_CTG_TYP get(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		if (type == null) {
			throw MAC_CALC_CTG_TYP.invalidValue(value);
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
	public static MAC_CALC_CTG_TYP getNE(String value) {
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_CALC_CTG_TYP create(String value, String xmlKey) {
		MAC_CALC_CTG_TYP me = MAC_CALC_CTG_TYP.create();
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
		MAC_CALC_CTG_TYP me = MAC_CALC_CTG_TYP.getNE(value);
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
		MAC_CALC_CTG_TYP me = MAC_CALC_CTG_TYP.getNE(value);
		if (me == null) {
			throw MAC_CALC_CTG_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_CALC_CTG_TYP me = MAC_CALC_CTG_TYP.getNE(value);
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
	public static MAC_CALC_CTG_TYP[] array() {
		if (array == null) {
			array = new MAC_CALC_CTG_TYP[] {
					MAC_CALC_CTG_TYP.CALC_ITM, MAC_CALC_CTG_TYP.ITM_DTL, MAC_CALC_CTG_TYP.ITM_OPER, MAC_CALC_CTG_TYP.BOM, MAC_CALC_CTG_TYP.ITM_WK, 
					 MAC_CALC_CTG_TYP.ITM_PURC, MAC_CALC_CTG_TYP.ITM_PROC, MAC_CALC_CTG_TYP.ITM_PROV, MAC_CALC_CTG_TYP.ITM_SLS, MAC_CALC_CTG_TYP.ITM_FIX, MAC_CALC_CTG_TYP.ALC_RATE_M, 
					 MAC_CALC_CTG_TYP.ALC_PTN_SEL, MAC_CALC_CTG_TYP.PRE_ALC_RATE_SEL, MAC_CALC_CTG_TYP.ALC_AMT, MAC_CALC_CTG_TYP.ALC_RATE_T, MAC_CALC_CTG_TYP.PRE_RATE_TERM, MAC_CALC_CTG_TYP.PRE_RATE_MLY, 
					 MAC_CALC_CTG_TYP.RQMT, MAC_CALC_CTG_TYP.MFG, MAC_CALC_CTG_TYP.PURC, MAC_CALC_CTG_TYP.SLS, MAC_CALC_CTG_TYP.INPT, MAC_CALC_CTG_TYP.WK, 
					 MAC_CALC_CTG_TYP.OTHER_WK, MAC_CALC_CTG_TYP.IO, MAC_CALC_CTG_TYP.INST_WIP, MAC_CALC_CTG_TYP.END_STK, MAC_CALC_CTG_TYP.GP_ALC
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
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
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
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
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
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
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
			if(MAC_CALC_CTG_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_CALC_CTG_TYP me = MAC_CALC_CTG_TYP.get(MAC_CALC_CTG_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_CALC_CTG_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_CALC_CTG_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_CALC_CTG_TYP.list();
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
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
			if(MAC_CALC_CTG_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_CALC_CTG_TYP.subList(cols, vals);
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
		for (MAC_CALC_CTG_TYP me : MAC_CALC_CTG_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_CALC_CTG_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_CALC_CTG_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_CALC_CTG_TYP", col);}
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
	protected boolean isSame(MAC_CALC_CTG_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 計算カテゴリ区分：計算品目かどうか
	 * @param value 定数値
	 * @return 定数値が計算品目の値の場合true
	 */
	public static boolean isCALC_ITM(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.CALC_ITM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：計算品目かどうか
	 * @param type 属性値
	 * @return 属性値が計算品目の値の場合true
	 */
	public static boolean isCALC_ITM(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.CALC_ITM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目詳細かどうか
	 * @param value 定数値
	 * @return 定数値が品目詳細の値の場合true
	 */
	public static boolean isITM_DTL(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_DTL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目詳細かどうか
	 * @param type 属性値
	 * @return 属性値が品目詳細の値の場合true
	 */
	public static boolean isITM_DTL(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_DTL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目工程かどうか
	 * @param value 定数値
	 * @return 定数値が品目工程の値の場合true
	 */
	public static boolean isITM_OPER(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_OPER.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目工程かどうか
	 * @param type 属性値
	 * @return 属性値が品目工程の値の場合true
	 */
	public static boolean isITM_OPER(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_OPER.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：ＢＯＭかどうか
	 * @param value 定数値
	 * @return 定数値がＢＯＭの値の場合true
	 */
	public static boolean isBOM(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.BOM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：ＢＯＭかどうか
	 * @param type 属性値
	 * @return 属性値がＢＯＭの値の場合true
	 */
	public static boolean isBOM(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.BOM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目工数かどうか
	 * @param value 定数値
	 * @return 定数値が品目工数の値の場合true
	 */
	public static boolean isITM_WK(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：品目工数かどうか
	 * @param type 属性値
	 * @return 属性値が品目工数の値の場合true
	 */
	public static boolean isITM_WK(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：購買単価かどうか
	 * @param value 定数値
	 * @return 定数値が購買単価の値の場合true
	 */
	public static boolean isITM_PURC(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_PURC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：購買単価かどうか
	 * @param type 属性値
	 * @return 属性値が購買単価の値の場合true
	 */
	public static boolean isITM_PURC(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_PURC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：加工単価かどうか
	 * @param value 定数値
	 * @return 定数値が加工単価の値の場合true
	 */
	public static boolean isITM_PROC(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_PROC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：加工単価かどうか
	 * @param type 属性値
	 * @return 属性値が加工単価の値の場合true
	 */
	public static boolean isITM_PROC(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_PROC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：支給単価かどうか
	 * @param value 定数値
	 * @return 定数値が支給単価の値の場合true
	 */
	public static boolean isITM_PROV(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_PROV.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：支給単価かどうか
	 * @param type 属性値
	 * @return 属性値が支給単価の値の場合true
	 */
	public static boolean isITM_PROV(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_PROV.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：販売単価かどうか
	 * @param value 定数値
	 * @return 定数値が販売単価の値の場合true
	 */
	public static boolean isITM_SLS(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_SLS.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：販売単価かどうか
	 * @param type 属性値
	 * @return 属性値が販売単価の値の場合true
	 */
	public static boolean isITM_SLS(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_SLS.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指値かどうか
	 * @param value 定数値
	 * @return 定数値が指値の値の場合true
	 */
	public static boolean isITM_FIX(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ITM_FIX.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指値かどうか
	 * @param type 属性値
	 * @return 属性値が指値の値の場合true
	 */
	public static boolean isITM_FIX(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ITM_FIX.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：標準配賦率かどうか
	 * @param value 定数値
	 * @return 定数値が標準配賦率の値の場合true
	 */
	public static boolean isALC_RATE_M(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ALC_RATE_M.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：標準配賦率かどうか
	 * @param type 属性値
	 * @return 属性値が標準配賦率の値の場合true
	 */
	public static boolean isALC_RATE_M(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ALC_RATE_M.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：配賦パタン選択かどうか
	 * @param value 定数値
	 * @return 定数値が配賦パタン選択の値の場合true
	 */
	public static boolean isALC_PTN_SEL(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ALC_PTN_SEL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：配賦パタン選択かどうか
	 * @param type 属性値
	 * @return 属性値が配賦パタン選択の値の場合true
	 */
	public static boolean isALC_PTN_SEL(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ALC_PTN_SEL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦基準選択かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦基準選択の値の場合true
	 */
	public static boolean isPRE_ALC_RATE_SEL(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.PRE_ALC_RATE_SEL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦基準選択かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦基準選択の値の場合true
	 */
	public static boolean isPRE_ALC_RATE_SEL(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.PRE_ALC_RATE_SEL.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：配賦金額かどうか
	 * @param value 定数値
	 * @return 定数値が配賦金額の値の場合true
	 */
	public static boolean isALC_AMT(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ALC_AMT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：配賦金額かどうか
	 * @param type 属性値
	 * @return 属性値が配賦金額の値の場合true
	 */
	public static boolean isALC_AMT(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ALC_AMT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：予定配賦率かどうか
	 * @param value 定数値
	 * @return 定数値が予定配賦率の値の場合true
	 */
	public static boolean isALC_RATE_T(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.ALC_RATE_T.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：予定配賦率かどうか
	 * @param type 属性値
	 * @return 属性値が予定配賦率の値の場合true
	 */
	public static boolean isALC_RATE_T(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.ALC_RATE_T.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦期間比率かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦期間比率の値の場合true
	 */
	public static boolean isPRE_RATE_TERM(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.PRE_RATE_TERM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦期間比率かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦期間比率の値の場合true
	 */
	public static boolean isPRE_RATE_TERM(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.PRE_RATE_TERM.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦月次比率かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦月次比率の値の場合true
	 */
	public static boolean isPRE_RATE_MLY(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.PRE_RATE_MLY.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：一次配賦月次比率かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦月次比率の値の場合true
	 */
	public static boolean isPRE_RATE_MLY(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.PRE_RATE_MLY.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：月次計画かどうか
	 * @param value 定数値
	 * @return 定数値が月次計画の値の場合true
	 */
	public static boolean isRQMT(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.RQMT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：月次計画かどうか
	 * @param type 属性値
	 * @return 属性値が月次計画の値の場合true
	 */
	public static boolean isRQMT(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.RQMT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：製造かどうか
	 * @param value 定数値
	 * @return 定数値が製造の値の場合true
	 */
	public static boolean isMFG(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.MFG.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：製造かどうか
	 * @param type 属性値
	 * @return 属性値が製造の値の場合true
	 */
	public static boolean isMFG(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.MFG.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：購買かどうか
	 * @param value 定数値
	 * @return 定数値が購買の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.PURC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：購買かどうか
	 * @param type 属性値
	 * @return 属性値が購買の値の場合true
	 */
	public static boolean isPURC(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.PURC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.SLS.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.SLS.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.INPT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.INPT.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図工数／品目工数かどうか
	 * @param value 定数値
	 * @return 定数値が指図工数／品目工数の値の場合true
	 */
	public static boolean isWK(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図工数／品目工数かどうか
	 * @param type 属性値
	 * @return 属性値が指図工数／品目工数の値の場合true
	 */
	public static boolean isWK(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図外工数／品目外工数かどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数／品目外工数の値の場合true
	 */
	public static boolean isOTHER_WK(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.OTHER_WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図外工数／品目外工数かどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数／品目外工数の値の場合true
	 */
	public static boolean isOTHER_WK(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.OTHER_WK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫の値の場合true
	 */
	public static boolean isIO(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.IO.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫の値の場合true
	 */
	public static boolean isIO(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.IO.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が指図仕掛の値の場合true
	 */
	public static boolean isINST_WIP(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.INST_WIP.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：指図仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が指図仕掛の値の場合true
	 */
	public static boolean isINST_WIP(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.INST_WIP.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：在庫実績かどうか
	 * @param value 定数値
	 * @return 定数値が在庫実績の値の場合true
	 */
	public static boolean isEND_STK(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.END_STK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：在庫実績かどうか
	 * @param type 属性値
	 * @return 属性値が在庫実績の値の場合true
	 */
	public static boolean isEND_STK(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.END_STK.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：汎用配賦かどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(String value) {
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
		return MAC_CALC_CTG_TYP.GP_ALC.isSame(type);
	}

	/**
	 * 計算カテゴリ区分：汎用配賦かどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦の値の場合true
	 */
	public static boolean isGP_ALC(MAC_CALC_CTG_TYP type) {
		return MAC_CALC_CTG_TYP.GP_ALC.isSame(type);
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
			MAC_CALC_CTG_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.get(value);
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
			MAC_CALC_CTG_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
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
			MAC_CALC_CTG_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.get(value);
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
			MAC_CALC_CTG_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
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
			MAC_CALC_CTG_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.get(value);
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
			MAC_CALC_CTG_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
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
			MAC_CALC_CTG_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.get(value);
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
			MAC_CALC_CTG_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_CALC_CTG_TYP type = MAC_CALC_CTG_TYP.getNE(value);
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
