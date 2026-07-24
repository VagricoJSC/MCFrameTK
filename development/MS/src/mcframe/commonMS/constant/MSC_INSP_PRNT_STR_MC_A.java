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
abstract class MSC_INSP_PRNT_STR_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "INSP_PRNT_STR";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_INSP_PRNT_STR[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "insp_prnt_str";

	public static final String $NAME = "insp_prnt_str_nm";

	/*
	 * 定数の定義です。
	 */
	/** 検査帳票文字列：検査完了日
	 */
	public static final MSC_INSP_PRNT_STR INSP_CMPL_DT = create("INSP_CMPL_DT", "INSP_CMPL_DT");

	/** 検査帳票文字列：在庫検査
	 */
	public static final MSC_INSP_PRNT_STR STK_INSP_TYP = create("STK_INSP_TYP", "STK_INSP_TYP");

	/** 検査帳票文字列：検査指図リスト
	 */
	public static final MSC_INSP_PRNT_STR INSP_LST_SHEET = create("INSP_LST_SHEET", "INSP_LST_SHEET");

	/** 検査帳票文字列：検査指図リストＮＯ
	 */
	public static final MSC_INSP_PRNT_STR INSP_LST_NO = create("INSP_LST_NO", "INSP_LST_NO");

	/** 検査帳票文字列：検査ＮＯ
	 */
	public static final MSC_INSP_PRNT_STR INSP_NO = create("INSP_NO", "INSP_NO");

	/** 検査帳票文字列：検査種類
	 */
	public static final MSC_INSP_PRNT_STR INSP_TYP = create("INSP_TYP", "INSP_TYP");

	/** 検査帳票文字列：検査方法
	 */
	public static final MSC_INSP_PRNT_STR INSP_MTD_TYP = create("INSP_MTD_TYP", "INSP_MTD_TYP");

	/** 検査帳票文字列：検査パタン名
	 */
	public static final MSC_INSP_PRNT_STR INSP_PTN_NM = create("INSP_PTN_NM", "INSP_PTN_NM");

	/** 検査帳票文字列：検査成績書
	 */
	public static final MSC_INSP_PRNT_STR INSP_RSLT_SHEET = create("INSP_RSLT_SHEET", "INSP_RSLT_SHEET");

	/** 検査帳票文字列：検査項目名
	 */
	public static final MSC_INSP_PRNT_STR INSP_POINT_NM = create("INSP_POINT_NM", "INSP_POINT_NM");

	/** 検査帳票文字列：定性検査値
	 */
	public static final MSC_INSP_PRNT_STR QL_INSP_VAL = create("QL_INSP_VAL", "QL_INSP_VAL");

	/** 検査帳票文字列：定量検査値
	 */
	public static final MSC_INSP_PRNT_STR QN_INSP_VAL = create("QN_INSP_VAL", "QN_INSP_VAL");

	/** 検査帳票文字列：検査者名
	 */
	public static final MSC_INSP_PRNT_STR INSP_USR_NM = create("INSP_USR_NM", "INSP_USR_NM");

	/** 検査帳票文字列：版：
	 */
	public static final MSC_INSP_PRNT_STR VER_NO = create("VER_NO", "VER_NO");

	/** 検査帳票文字列：サブロットＮＯ
	 */
	public static final MSC_INSP_PRNT_STR SUBLOT_NO = create("SUBLOT_NO", "SUBLOT_NO");

	/** 検査帳票文字列：検査終了日時
	 */
	public static final MSC_INSP_PRNT_STR END_TM = create("END_TM", "END_TM");

	/** 検査帳票文字列：承認状況
	 */
	public static final MSC_INSP_PRNT_STR INSP_APRV_STS_TYP = create("INSP_APRV_STS_TYP", "INSP_APRV_STS_TYP");

	/** 検査帳票文字列：本品について製造所からの出荷を許可します。
	 */
	public static final MSC_INSP_PRNT_STR ACPT_MSG = create("ACPT_MSG", "ACPT_MSG");

	/** 検査帳票文字列：本品について製造所からの出荷を却下します。
	 */
	public static final MSC_INSP_PRNT_STR RJCT_MSG = create("RJCT_MSG", "RJCT_MSG");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_INSP_PRNT_STR create() {
		return new MSC_INSP_PRNT_STR();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_INSP_PRNT_STR get(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		if (type == null) {
			throw MSC_INSP_PRNT_STR.invalidValue(value);
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
	public static MSC_INSP_PRNT_STR getNE(String value) {
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_INSP_PRNT_STR create(String value, String xmlKey) {
		MSC_INSP_PRNT_STR me = MSC_INSP_PRNT_STR.create();
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
		MSC_INSP_PRNT_STR me = MSC_INSP_PRNT_STR.getNE(value);
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
		MSC_INSP_PRNT_STR me = MSC_INSP_PRNT_STR.getNE(value);
		if (me == null) {
			throw MSC_INSP_PRNT_STR.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_INSP_PRNT_STR me = MSC_INSP_PRNT_STR.getNE(value);
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
	public static MSC_INSP_PRNT_STR[] array() {
		if (array == null) {
			array = new MSC_INSP_PRNT_STR[] {
					MSC_INSP_PRNT_STR.INSP_CMPL_DT, MSC_INSP_PRNT_STR.STK_INSP_TYP, MSC_INSP_PRNT_STR.INSP_LST_SHEET, MSC_INSP_PRNT_STR.INSP_LST_NO, MSC_INSP_PRNT_STR.INSP_NO, 
					 MSC_INSP_PRNT_STR.INSP_TYP, MSC_INSP_PRNT_STR.INSP_MTD_TYP, MSC_INSP_PRNT_STR.INSP_PTN_NM, MSC_INSP_PRNT_STR.INSP_RSLT_SHEET, MSC_INSP_PRNT_STR.INSP_POINT_NM, MSC_INSP_PRNT_STR.QL_INSP_VAL, 
					 MSC_INSP_PRNT_STR.QN_INSP_VAL, MSC_INSP_PRNT_STR.INSP_USR_NM, MSC_INSP_PRNT_STR.VER_NO, MSC_INSP_PRNT_STR.SUBLOT_NO, MSC_INSP_PRNT_STR.END_TM, MSC_INSP_PRNT_STR.INSP_APRV_STS_TYP, 
					 MSC_INSP_PRNT_STR.ACPT_MSG, MSC_INSP_PRNT_STR.RJCT_MSG
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
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
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
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
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
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
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
			if(MSC_INSP_PRNT_STR.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_INSP_PRNT_STR me = MSC_INSP_PRNT_STR.get(MSC_INSP_PRNT_STR.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_INSP_PRNT_STR#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_INSP_PRNT_STR.subList(row);
			if (list.isEmpty()) {
				list = MSC_INSP_PRNT_STR.list();
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
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
			if(MSC_INSP_PRNT_STR.isSameVals(me, cols, vals)){
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
			list = MSC_INSP_PRNT_STR.subList(cols, vals);
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
		for (MSC_INSP_PRNT_STR me : MSC_INSP_PRNT_STR.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_INSP_PRNT_STR.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_INSP_PRNT_STR me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_INSP_PRNT_STR", col);}
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
	protected boolean isSame(MSC_INSP_PRNT_STR type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 検査帳票文字列：検査完了日かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了日の値の場合true
	 */
	public static boolean isINSP_CMPL_DT(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_CMPL_DT.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査完了日かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了日の値の場合true
	 */
	public static boolean isINSP_CMPL_DT(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_CMPL_DT.isSame(type);
	}

	/**
	 * 検査帳票文字列：在庫検査かどうか
	 * @param value 定数値
	 * @return 定数値が在庫検査の値の場合true
	 */
	public static boolean isSTK_INSP_TYP(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.STK_INSP_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：在庫検査かどうか
	 * @param type 属性値
	 * @return 属性値が在庫検査の値の場合true
	 */
	public static boolean isSTK_INSP_TYP(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.STK_INSP_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査指図リストかどうか
	 * @param value 定数値
	 * @return 定数値が検査指図リストの値の場合true
	 */
	public static boolean isINSP_LST_SHEET(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_LST_SHEET.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査指図リストかどうか
	 * @param type 属性値
	 * @return 属性値が検査指図リストの値の場合true
	 */
	public static boolean isINSP_LST_SHEET(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_LST_SHEET.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査指図リストＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査指図リストＮＯの値の場合true
	 */
	public static boolean isINSP_LST_NO(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_LST_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査指図リストＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査指図リストＮＯの値の場合true
	 */
	public static boolean isINSP_LST_NO(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_LST_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が検査ＮＯの値の場合true
	 */
	public static boolean isINSP_NO(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が検査ＮＯの値の場合true
	 */
	public static boolean isINSP_NO(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査種類かどうか
	 * @param value 定数値
	 * @return 定数値が検査種類の値の場合true
	 */
	public static boolean isINSP_TYP(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査種類かどうか
	 * @param type 属性値
	 * @return 属性値が検査種類の値の場合true
	 */
	public static boolean isINSP_TYP(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査方法かどうか
	 * @param value 定数値
	 * @return 定数値が検査方法の値の場合true
	 */
	public static boolean isINSP_MTD_TYP(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_MTD_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査方法かどうか
	 * @param type 属性値
	 * @return 属性値が検査方法の値の場合true
	 */
	public static boolean isINSP_MTD_TYP(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_MTD_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査パタン名かどうか
	 * @param value 定数値
	 * @return 定数値が検査パタン名の値の場合true
	 */
	public static boolean isINSP_PTN_NM(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_PTN_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査パタン名かどうか
	 * @param type 属性値
	 * @return 属性値が検査パタン名の値の場合true
	 */
	public static boolean isINSP_PTN_NM(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_PTN_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査成績書かどうか
	 * @param value 定数値
	 * @return 定数値が検査成績書の値の場合true
	 */
	public static boolean isINSP_RSLT_SHEET(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_RSLT_SHEET.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査成績書かどうか
	 * @param type 属性値
	 * @return 属性値が検査成績書の値の場合true
	 */
	public static boolean isINSP_RSLT_SHEET(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_RSLT_SHEET.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査項目名かどうか
	 * @param value 定数値
	 * @return 定数値が検査項目名の値の場合true
	 */
	public static boolean isINSP_POINT_NM(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_POINT_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査項目名かどうか
	 * @param type 属性値
	 * @return 属性値が検査項目名の値の場合true
	 */
	public static boolean isINSP_POINT_NM(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_POINT_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：定性検査値かどうか
	 * @param value 定数値
	 * @return 定数値が定性検査値の値の場合true
	 */
	public static boolean isQL_INSP_VAL(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.QL_INSP_VAL.isSame(type);
	}

	/**
	 * 検査帳票文字列：定性検査値かどうか
	 * @param type 属性値
	 * @return 属性値が定性検査値の値の場合true
	 */
	public static boolean isQL_INSP_VAL(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.QL_INSP_VAL.isSame(type);
	}

	/**
	 * 検査帳票文字列：定量検査値かどうか
	 * @param value 定数値
	 * @return 定数値が定量検査値の値の場合true
	 */
	public static boolean isQN_INSP_VAL(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.QN_INSP_VAL.isSame(type);
	}

	/**
	 * 検査帳票文字列：定量検査値かどうか
	 * @param type 属性値
	 * @return 属性値が定量検査値の値の場合true
	 */
	public static boolean isQN_INSP_VAL(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.QN_INSP_VAL.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査者名かどうか
	 * @param value 定数値
	 * @return 定数値が検査者名の値の場合true
	 */
	public static boolean isINSP_USR_NM(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_USR_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査者名かどうか
	 * @param type 属性値
	 * @return 属性値が検査者名の値の場合true
	 */
	public static boolean isINSP_USR_NM(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_USR_NM.isSame(type);
	}

	/**
	 * 検査帳票文字列：版：かどうか
	 * @param value 定数値
	 * @return 定数値が版：の値の場合true
	 */
	public static boolean isVER_NO(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.VER_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：版：かどうか
	 * @param type 属性値
	 * @return 属性値が版：の値の場合true
	 */
	public static boolean isVER_NO(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.VER_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：サブロットＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がサブロットＮＯの値の場合true
	 */
	public static boolean isSUBLOT_NO(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.SUBLOT_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：サブロットＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がサブロットＮＯの値の場合true
	 */
	public static boolean isSUBLOT_NO(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.SUBLOT_NO.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査終了日時かどうか
	 * @param value 定数値
	 * @return 定数値が検査終了日時の値の場合true
	 */
	public static boolean isEND_TM(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.END_TM.isSame(type);
	}

	/**
	 * 検査帳票文字列：検査終了日時かどうか
	 * @param type 属性値
	 * @return 属性値が検査終了日時の値の場合true
	 */
	public static boolean isEND_TM(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.END_TM.isSame(type);
	}

	/**
	 * 検査帳票文字列：承認状況かどうか
	 * @param value 定数値
	 * @return 定数値が承認状況の値の場合true
	 */
	public static boolean isINSP_APRV_STS_TYP(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.INSP_APRV_STS_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：承認状況かどうか
	 * @param type 属性値
	 * @return 属性値が承認状況の値の場合true
	 */
	public static boolean isINSP_APRV_STS_TYP(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.INSP_APRV_STS_TYP.isSame(type);
	}

	/**
	 * 検査帳票文字列：本品について製造所からの出荷を許可します。かどうか
	 * @param value 定数値
	 * @return 定数値が本品について製造所からの出荷を許可します。の値の場合true
	 */
	public static boolean isACPT_MSG(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.ACPT_MSG.isSame(type);
	}

	/**
	 * 検査帳票文字列：本品について製造所からの出荷を許可します。かどうか
	 * @param type 属性値
	 * @return 属性値が本品について製造所からの出荷を許可します。の値の場合true
	 */
	public static boolean isACPT_MSG(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.ACPT_MSG.isSame(type);
	}

	/**
	 * 検査帳票文字列：本品について製造所からの出荷を却下します。かどうか
	 * @param value 定数値
	 * @return 定数値が本品について製造所からの出荷を却下します。の値の場合true
	 */
	public static boolean isRJCT_MSG(String value) {
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
		return MSC_INSP_PRNT_STR.RJCT_MSG.isSame(type);
	}

	/**
	 * 検査帳票文字列：本品について製造所からの出荷を却下します。かどうか
	 * @param type 属性値
	 * @return 属性値が本品について製造所からの出荷を却下します。の値の場合true
	 */
	public static boolean isRJCT_MSG(MSC_INSP_PRNT_STR type) {
		return MSC_INSP_PRNT_STR.RJCT_MSG.isSame(type);
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
			MSC_INSP_PRNT_STR.putName(r, valueColumn, nameColumn);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.get(value);
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
			MSC_INSP_PRNT_STR.putNameNE(r, valueColumn, nameColumn);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
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
			MSC_INSP_PRNT_STR.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.get(value);
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
			MSC_INSP_PRNT_STR.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
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
			MSC_INSP_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.get(value);
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
			MSC_INSP_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
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
			MSC_INSP_PRNT_STR.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.get(value);
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
			MSC_INSP_PRNT_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_INSP_PRNT_STR type = MSC_INSP_PRNT_STR.getNE(value);
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
