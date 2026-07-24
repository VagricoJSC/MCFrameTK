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
abstract class MAC_STR_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "STR";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_STR[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "str";

	public static final String $NAME = "str_nm";

	/*
	 * 定数の定義です。
	 */
	/** 文字列用定数：ＮＵＬＬ文字
	 */
	public static final MAC_STR NULL_VAL = create("*", "NULL_VAL");

	/** 文字列用定数：本ＮＵＬＬ文字
	 */
	public static final MAC_STR REAL_NULL_VAL = create(" ", "REAL_NULL_VAL");

	/** 文字列用定数：コード名称の区切り表示
	 */
	public static final MAC_STR CD_NM_DLM = create(":", "CD_NM_DLM");

	/** 文字列用定数：デフォルト発番パタンＣＤ
	 */
	public static final MAC_STR DEF_NUM_PTN_CD = create("0", "DEF_NUM_PTN_CD");

	/** 文字列用定数：ボタングループの名称の区切り文字
	 */
	public static final MAC_STR BTN_GRP_NM_DLM = create(":", "BTN_GRP_NM_DLM");

	/** 文字列用定数：■
	 */
	public static final MAC_STR PRNT_CHK_TRUE = create("T", "PRNT_CHK_TRUE");

	/** 文字列用定数：□
	 */
	public static final MAC_STR PRNT_CHK_FALSE = create("F", "PRNT_CHK_FALSE");

	/** 文字列用定数：※
	 */
	public static final MAC_STR PRNT_NOTE_MARK = create("NOTE_MARK", "PRNT_NOTE_MARK");

	/** 文字列用定数：内
	 */
	public static final MAC_STR PRNT_INC_TAX = create("1", "PRNT_INC_TAX");

	/** 文字列用定数：仮
	 */
	public static final MAC_STR PRNT_INTERIM = create("1", "PRNT_INTERIM");

	/** 文字列用定数：オン
	 */
	public static final MAC_STR MSG_FLG_ON = create("T", "MSG_FLG_ON");

	/** 文字列用定数：オフ
	 */
	public static final MAC_STR MSG_FLG_OFF = create("F", "MSG_FLG_OFF");

	/** 文字列用定数：手配ＮＯ１
	 */
	public static final MAC_STR PRNT_SNO1 = create("sno1", "PRNT_SNO1");

	/** 文字列用定数：手配ＮＯ２
	 */
	public static final MAC_STR PRNT_SNO2 = create("sno2", "PRNT_SNO2");

	/** 文字列用定数：手配ＮＯ３
	 */
	public static final MAC_STR PRNT_SNO3 = create("sno3", "PRNT_SNO3");

	/** 文字列用定数：手配ＮＯ４
	 */
	public static final MAC_STR PRNT_SNO4 = create("sno4", "PRNT_SNO4");

	/** 文字列用定数：表示用手配ＮＯデリミタ１
	 */
	public static final MAC_STR DISP_SNO_DLM1 = create(":", "DISP_SNO_DLM1");

	/** 文字列用定数：表示用手配ＮＯデリミタ２
	 */
	public static final MAC_STR DISP_SNO_DLM2 = create(":", "DISP_SNO_DLM2");

	/** 文字列用定数：表示用手配ＮＯデリミタ３
	 */
	public static final MAC_STR DISP_SNO_DLM3 = create(":", "DISP_SNO_DLM3");

	/** 文字列用定数：手配ＮＯ
	 */
	public static final MAC_STR DISP_SNO_PREFIX = create("sno", "DISP_SNO_PREFIX");

	/** 文字列用定数：手配ＮＯ１：
	 */
	public static final MAC_STR DISP_SNO1_PREFIX = create("sno1", "DISP_SNO1_PREFIX");

	/** 文字列用定数：手配ＮＯ２：
	 */
	public static final MAC_STR DISP_SNO2_PREFIX = create("sno2", "DISP_SNO2_PREFIX");

	/** 文字列用定数：手配ＮＯ３：
	 */
	public static final MAC_STR DISP_SNO3_PREFIX = create("sno3", "DISP_SNO3_PREFIX");

	/** 文字列用定数：手配ＮＯ４：
	 */
	public static final MAC_STR DISP_SNO4_PREFIX = create("sno4", "DISP_SNO4_PREFIX");

	/** 文字列用定数：表示用品目デリミタ１
	 */
	public static final MAC_STR DISP_ITM_DLM1 = create(":", "DISP_ITM_DLM1");

	/** 文字列用定数：表示用品目デリミタ２
	 */
	public static final MAC_STR DISP_ITM_DLM2 = create(":", "DISP_ITM_DLM2");

	/** 文字列用定数：表示用品目デリミタ３
	 */
	public static final MAC_STR DISP_ITM_DLM3 = create(":", "DISP_ITM_DLM3");

	/** 文字列用定数：品目
	 */
	public static final MAC_STR DISP_ITM_PREFIX = create("itm", "DISP_ITM_PREFIX");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_STR create() {
		return new MAC_STR();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_STR get(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		if (type == null) {
			throw MAC_STR.invalidValue(value);
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
	public static MAC_STR getNE(String value) {
		for (MAC_STR me : MAC_STR.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_STR create(String value, String xmlKey) {
		MAC_STR me = MAC_STR.create();
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
		MAC_STR me = MAC_STR.getNE(value);
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
		MAC_STR me = MAC_STR.getNE(value);
		if (me == null) {
			throw MAC_STR.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_STR me = MAC_STR.getNE(value);
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
	public static MAC_STR[] array() {
		if (array == null) {
			array = new MAC_STR[] {
					MAC_STR.NULL_VAL, MAC_STR.REAL_NULL_VAL, MAC_STR.CD_NM_DLM, MAC_STR.DEF_NUM_PTN_CD, MAC_STR.BTN_GRP_NM_DLM, 
					 MAC_STR.PRNT_CHK_TRUE, MAC_STR.PRNT_CHK_FALSE, MAC_STR.PRNT_NOTE_MARK, MAC_STR.PRNT_INC_TAX, MAC_STR.PRNT_INTERIM, MAC_STR.MSG_FLG_ON, 
					 MAC_STR.MSG_FLG_OFF, MAC_STR.PRNT_SNO1, MAC_STR.PRNT_SNO2, MAC_STR.PRNT_SNO3, MAC_STR.PRNT_SNO4, MAC_STR.DISP_SNO_DLM1, 
					 MAC_STR.DISP_SNO_DLM2, MAC_STR.DISP_SNO_DLM3, MAC_STR.DISP_SNO_PREFIX, MAC_STR.DISP_SNO1_PREFIX, MAC_STR.DISP_SNO2_PREFIX, MAC_STR.DISP_SNO3_PREFIX, 
					 MAC_STR.DISP_SNO4_PREFIX, MAC_STR.DISP_ITM_DLM1, MAC_STR.DISP_ITM_DLM2, MAC_STR.DISP_ITM_DLM3, MAC_STR.DISP_ITM_PREFIX
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
		for (MAC_STR me : MAC_STR.array()) {
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
		for (MAC_STR me : MAC_STR.array()) {
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
		for (MAC_STR me : MAC_STR.array()) {
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
			if(MAC_STR.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_STR me = MAC_STR.get(MAC_STR.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_STR#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_STR.subList(row);
			if (list.isEmpty()) {
				list = MAC_STR.list();
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
		for (MAC_STR me : MAC_STR.array()) {
			if(MAC_STR.isSameVals(me, cols, vals)){
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
			list = MAC_STR.subList(cols, vals);
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
		for (MAC_STR me : MAC_STR.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_STR.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_STR me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_STR", col);}
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
	protected boolean isSame(MAC_STR type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 文字列用定数：ＮＵＬＬ文字かどうか
	 * @param value 定数値
	 * @return 定数値がＮＵＬＬ文字の値の場合true
	 */
	public static boolean isNULL_VAL(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.NULL_VAL.isSame(type);
	}

	/**
	 * 文字列用定数：ＮＵＬＬ文字かどうか
	 * @param type 属性値
	 * @return 属性値がＮＵＬＬ文字の値の場合true
	 */
	public static boolean isNULL_VAL(MAC_STR type) {
		return MAC_STR.NULL_VAL.isSame(type);
	}

	/**
	 * 文字列用定数：本ＮＵＬＬ文字かどうか
	 * @param value 定数値
	 * @return 定数値が本ＮＵＬＬ文字の値の場合true
	 */
	public static boolean isREAL_NULL_VAL(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.REAL_NULL_VAL.isSame(type);
	}

	/**
	 * 文字列用定数：本ＮＵＬＬ文字かどうか
	 * @param type 属性値
	 * @return 属性値が本ＮＵＬＬ文字の値の場合true
	 */
	public static boolean isREAL_NULL_VAL(MAC_STR type) {
		return MAC_STR.REAL_NULL_VAL.isSame(type);
	}

	/**
	 * 文字列用定数：コード名称の区切り表示かどうか
	 * @param value 定数値
	 * @return 定数値がコード名称の区切り表示の値の場合true
	 */
	public static boolean isCD_NM_DLM(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.CD_NM_DLM.isSame(type);
	}

	/**
	 * 文字列用定数：コード名称の区切り表示かどうか
	 * @param type 属性値
	 * @return 属性値がコード名称の区切り表示の値の場合true
	 */
	public static boolean isCD_NM_DLM(MAC_STR type) {
		return MAC_STR.CD_NM_DLM.isSame(type);
	}

	/**
	 * 文字列用定数：デフォルト発番パタンＣＤかどうか
	 * @param value 定数値
	 * @return 定数値がデフォルト発番パタンＣＤの値の場合true
	 */
	public static boolean isDEF_NUM_PTN_CD(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DEF_NUM_PTN_CD.isSame(type);
	}

	/**
	 * 文字列用定数：デフォルト発番パタンＣＤかどうか
	 * @param type 属性値
	 * @return 属性値がデフォルト発番パタンＣＤの値の場合true
	 */
	public static boolean isDEF_NUM_PTN_CD(MAC_STR type) {
		return MAC_STR.DEF_NUM_PTN_CD.isSame(type);
	}

	/**
	 * 文字列用定数：ボタングループの名称の区切り文字かどうか
	 * @param value 定数値
	 * @return 定数値がボタングループの名称の区切り文字の値の場合true
	 */
	public static boolean isBTN_GRP_NM_DLM(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.BTN_GRP_NM_DLM.isSame(type);
	}

	/**
	 * 文字列用定数：ボタングループの名称の区切り文字かどうか
	 * @param type 属性値
	 * @return 属性値がボタングループの名称の区切り文字の値の場合true
	 */
	public static boolean isBTN_GRP_NM_DLM(MAC_STR type) {
		return MAC_STR.BTN_GRP_NM_DLM.isSame(type);
	}

	/**
	 * 文字列用定数：■かどうか
	 * @param value 定数値
	 * @return 定数値が■の値の場合true
	 */
	public static boolean isPRNT_CHK_TRUE(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_CHK_TRUE.isSame(type);
	}

	/**
	 * 文字列用定数：■かどうか
	 * @param type 属性値
	 * @return 属性値が■の値の場合true
	 */
	public static boolean isPRNT_CHK_TRUE(MAC_STR type) {
		return MAC_STR.PRNT_CHK_TRUE.isSame(type);
	}

	/**
	 * 文字列用定数：□かどうか
	 * @param value 定数値
	 * @return 定数値が□の値の場合true
	 */
	public static boolean isPRNT_CHK_FALSE(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_CHK_FALSE.isSame(type);
	}

	/**
	 * 文字列用定数：□かどうか
	 * @param type 属性値
	 * @return 属性値が□の値の場合true
	 */
	public static boolean isPRNT_CHK_FALSE(MAC_STR type) {
		return MAC_STR.PRNT_CHK_FALSE.isSame(type);
	}

	/**
	 * 文字列用定数：※かどうか
	 * @param value 定数値
	 * @return 定数値が※の値の場合true
	 */
	public static boolean isPRNT_NOTE_MARK(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_NOTE_MARK.isSame(type);
	}

	/**
	 * 文字列用定数：※かどうか
	 * @param type 属性値
	 * @return 属性値が※の値の場合true
	 */
	public static boolean isPRNT_NOTE_MARK(MAC_STR type) {
		return MAC_STR.PRNT_NOTE_MARK.isSame(type);
	}

	/**
	 * 文字列用定数：内かどうか
	 * @param value 定数値
	 * @return 定数値が内の値の場合true
	 */
	public static boolean isPRNT_INC_TAX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_INC_TAX.isSame(type);
	}

	/**
	 * 文字列用定数：内かどうか
	 * @param type 属性値
	 * @return 属性値が内の値の場合true
	 */
	public static boolean isPRNT_INC_TAX(MAC_STR type) {
		return MAC_STR.PRNT_INC_TAX.isSame(type);
	}

	/**
	 * 文字列用定数：仮かどうか
	 * @param value 定数値
	 * @return 定数値が仮の値の場合true
	 */
	public static boolean isPRNT_INTERIM(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_INTERIM.isSame(type);
	}

	/**
	 * 文字列用定数：仮かどうか
	 * @param type 属性値
	 * @return 属性値が仮の値の場合true
	 */
	public static boolean isPRNT_INTERIM(MAC_STR type) {
		return MAC_STR.PRNT_INTERIM.isSame(type);
	}

	/**
	 * 文字列用定数：オンかどうか
	 * @param value 定数値
	 * @return 定数値がオンの値の場合true
	 */
	public static boolean isMSG_FLG_ON(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.MSG_FLG_ON.isSame(type);
	}

	/**
	 * 文字列用定数：オンかどうか
	 * @param type 属性値
	 * @return 属性値がオンの値の場合true
	 */
	public static boolean isMSG_FLG_ON(MAC_STR type) {
		return MAC_STR.MSG_FLG_ON.isSame(type);
	}

	/**
	 * 文字列用定数：オフかどうか
	 * @param value 定数値
	 * @return 定数値がオフの値の場合true
	 */
	public static boolean isMSG_FLG_OFF(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.MSG_FLG_OFF.isSame(type);
	}

	/**
	 * 文字列用定数：オフかどうか
	 * @param type 属性値
	 * @return 属性値がオフの値の場合true
	 */
	public static boolean isMSG_FLG_OFF(MAC_STR type) {
		return MAC_STR.MSG_FLG_OFF.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ１かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ１の値の場合true
	 */
	public static boolean isPRNT_SNO1(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_SNO1.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ１かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ１の値の場合true
	 */
	public static boolean isPRNT_SNO1(MAC_STR type) {
		return MAC_STR.PRNT_SNO1.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ２かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ２の値の場合true
	 */
	public static boolean isPRNT_SNO2(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_SNO2.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ２かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ２の値の場合true
	 */
	public static boolean isPRNT_SNO2(MAC_STR type) {
		return MAC_STR.PRNT_SNO2.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ３かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ３の値の場合true
	 */
	public static boolean isPRNT_SNO3(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_SNO3.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ３かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ３の値の場合true
	 */
	public static boolean isPRNT_SNO3(MAC_STR type) {
		return MAC_STR.PRNT_SNO3.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ４かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ４の値の場合true
	 */
	public static boolean isPRNT_SNO4(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.PRNT_SNO4.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ４かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ４の値の場合true
	 */
	public static boolean isPRNT_SNO4(MAC_STR type) {
		return MAC_STR.PRNT_SNO4.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ１かどうか
	 * @param value 定数値
	 * @return 定数値が表示用手配ＮＯデリミタ１の値の場合true
	 */
	public static boolean isDISP_SNO_DLM1(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO_DLM1.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ１かどうか
	 * @param type 属性値
	 * @return 属性値が表示用手配ＮＯデリミタ１の値の場合true
	 */
	public static boolean isDISP_SNO_DLM1(MAC_STR type) {
		return MAC_STR.DISP_SNO_DLM1.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ２かどうか
	 * @param value 定数値
	 * @return 定数値が表示用手配ＮＯデリミタ２の値の場合true
	 */
	public static boolean isDISP_SNO_DLM2(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO_DLM2.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ２かどうか
	 * @param type 属性値
	 * @return 属性値が表示用手配ＮＯデリミタ２の値の場合true
	 */
	public static boolean isDISP_SNO_DLM2(MAC_STR type) {
		return MAC_STR.DISP_SNO_DLM2.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ３かどうか
	 * @param value 定数値
	 * @return 定数値が表示用手配ＮＯデリミタ３の値の場合true
	 */
	public static boolean isDISP_SNO_DLM3(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO_DLM3.isSame(type);
	}

	/**
	 * 文字列用定数：表示用手配ＮＯデリミタ３かどうか
	 * @param type 属性値
	 * @return 属性値が表示用手配ＮＯデリミタ３の値の場合true
	 */
	public static boolean isDISP_SNO_DLM3(MAC_STR type) {
		return MAC_STR.DISP_SNO_DLM3.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯの値の場合true
	 */
	public static boolean isDISP_SNO_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯの値の場合true
	 */
	public static boolean isDISP_SNO_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_SNO_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ１：かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ１：の値の場合true
	 */
	public static boolean isDISP_SNO1_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO1_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ１：かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ１：の値の場合true
	 */
	public static boolean isDISP_SNO1_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_SNO1_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ２：かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ２：の値の場合true
	 */
	public static boolean isDISP_SNO2_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO2_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ２：かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ２：の値の場合true
	 */
	public static boolean isDISP_SNO2_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_SNO2_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ３：かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ３：の値の場合true
	 */
	public static boolean isDISP_SNO3_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO3_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ３：かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ３：の値の場合true
	 */
	public static boolean isDISP_SNO3_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_SNO3_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ４：かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ４：の値の場合true
	 */
	public static boolean isDISP_SNO4_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_SNO4_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：手配ＮＯ４：かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ４：の値の場合true
	 */
	public static boolean isDISP_SNO4_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_SNO4_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ１かどうか
	 * @param value 定数値
	 * @return 定数値が表示用品目デリミタ１の値の場合true
	 */
	public static boolean isDISP_ITM_DLM1(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_ITM_DLM1.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ１かどうか
	 * @param type 属性値
	 * @return 属性値が表示用品目デリミタ１の値の場合true
	 */
	public static boolean isDISP_ITM_DLM1(MAC_STR type) {
		return MAC_STR.DISP_ITM_DLM1.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ２かどうか
	 * @param value 定数値
	 * @return 定数値が表示用品目デリミタ２の値の場合true
	 */
	public static boolean isDISP_ITM_DLM2(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_ITM_DLM2.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ２かどうか
	 * @param type 属性値
	 * @return 属性値が表示用品目デリミタ２の値の場合true
	 */
	public static boolean isDISP_ITM_DLM2(MAC_STR type) {
		return MAC_STR.DISP_ITM_DLM2.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ３かどうか
	 * @param value 定数値
	 * @return 定数値が表示用品目デリミタ３の値の場合true
	 */
	public static boolean isDISP_ITM_DLM3(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_ITM_DLM3.isSame(type);
	}

	/**
	 * 文字列用定数：表示用品目デリミタ３かどうか
	 * @param type 属性値
	 * @return 属性値が表示用品目デリミタ３の値の場合true
	 */
	public static boolean isDISP_ITM_DLM3(MAC_STR type) {
		return MAC_STR.DISP_ITM_DLM3.isSame(type);
	}

	/**
	 * 文字列用定数：品目かどうか
	 * @param value 定数値
	 * @return 定数値が品目の値の場合true
	 */
	public static boolean isDISP_ITM_PREFIX(String value) {
		MAC_STR type = MAC_STR.getNE(value);
		return MAC_STR.DISP_ITM_PREFIX.isSame(type);
	}

	/**
	 * 文字列用定数：品目かどうか
	 * @param type 属性値
	 * @return 属性値が品目の値の場合true
	 */
	public static boolean isDISP_ITM_PREFIX(MAC_STR type) {
		return MAC_STR.DISP_ITM_PREFIX.isSame(type);
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
			MAC_STR.putName(r, valueColumn, nameColumn);
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
		MAC_STR type = MAC_STR.get(value);
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
			MAC_STR.putNameNE(r, valueColumn, nameColumn);
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
		MAC_STR type = MAC_STR.getNE(value);
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
			MAC_STR.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_STR type = MAC_STR.get(value);
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
			MAC_STR.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_STR type = MAC_STR.getNE(value);
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
			MAC_STR.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_STR type = MAC_STR.get(value);
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
			MAC_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_STR type = MAC_STR.getNE(value);
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
			MAC_STR.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_STR type = MAC_STR.get(value);
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
			MAC_STR.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_STR type = MAC_STR.getNE(value);
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
