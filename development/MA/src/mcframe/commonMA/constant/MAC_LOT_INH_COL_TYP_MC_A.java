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
abstract class MAC_LOT_INH_COL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "LOT_INH_COL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_LOT_INH_COL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "lot_inh_col_typ";

	public static final String $NAME = "lot_inh_col_typ_nm";

	public static final String $IS_ENABLE_CONCAT = "is_enable_concat";

	public static final String $DLM_STR = "dlm_str";

	public static final String $IS_ENABLE_ADD = "is_enable_add";

	public static final String $IS_ADD_BEHIND = "is_add_behind";

	/*
	 * 定数の定義です。
	 */
	/** 継承項目区分：実際有効成分係数
	 */
	public static final MAC_LOT_INH_COL_TYP ACT_CONT_FCTR = create("ACT_CONT_FCTR", "ACT_CONT_FCTR", false, null, false, false);

	/** 継承項目区分：ロット予備（文字列）１
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_CHAR1 = create("LOT_SUB_CHAR1", "LOT_SUB_CHAR1", true, ":", true, true);

	/** 継承項目区分：ロット予備（文字列）２
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_CHAR2 = create("LOT_SUB_CHAR2", "LOT_SUB_CHAR2", true, ":", true, true);

	/** 継承項目区分：ロット予備（文字列）３
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_CHAR3 = create("LOT_SUB_CHAR3", "LOT_SUB_CHAR3", true, ":", true, true);

	/** 継承項目区分：ロット予備（文字列）４
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_CHAR4 = create("LOT_SUB_CHAR4", "LOT_SUB_CHAR4", true, ":", true, true);

	/** 継承項目区分：ロット予備（文字列）５
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_CHAR5 = create("LOT_SUB_CHAR5", "LOT_SUB_CHAR5", true, ":", true, true);

	/** 継承項目区分：ロット予備（日付）１
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_DT1 = create("LOT_SUB_DT1", "LOT_SUB_DT1", false, null, false, false);

	/** 継承項目区分：ロット予備（日付）２
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_DT2 = create("LOT_SUB_DT2", "LOT_SUB_DT2", false, null, false, false);

	/** 継承項目区分：ロット予備（日付）３
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_DT3 = create("LOT_SUB_DT3", "LOT_SUB_DT3", false, null, false, false);

	/** 継承項目区分：ロット予備（日付）４
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_DT4 = create("LOT_SUB_DT4", "LOT_SUB_DT4", false, null, false, false);

	/** 継承項目区分：ロット予備（日付）５
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_DT5 = create("LOT_SUB_DT5", "LOT_SUB_DT5", false, null, false, false);

	/** 継承項目区分：ロット予備（ＦＬＧ）１
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_FLG1 = create("LOT_SUB_FLG1", "LOT_SUB_FLG1", false, null, false, false);

	/** 継承項目区分：ロット予備（ＦＬＧ）２
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_FLG2 = create("LOT_SUB_FLG2", "LOT_SUB_FLG2", false, null, false, false);

	/** 継承項目区分：ロット予備（ＦＬＧ）３
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_FLG3 = create("LOT_SUB_FLG3", "LOT_SUB_FLG3", false, null, false, false);

	/** 継承項目区分：ロット予備（ＦＬＧ）４
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_FLG4 = create("LOT_SUB_FLG4", "LOT_SUB_FLG4", false, null, false, false);

	/** 継承項目区分：ロット予備（ＦＬＧ）５
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_FLG5 = create("LOT_SUB_FLG5", "LOT_SUB_FLG5", false, null, false, false);

	/** 継承項目区分：ロット予備（数値）１
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_NUM1 = create("LOT_SUB_NUM1", "LOT_SUB_NUM1", false, null, false, false);

	/** 継承項目区分：ロット予備（数値）２
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_NUM2 = create("LOT_SUB_NUM2", "LOT_SUB_NUM2", false, null, false, false);

	/** 継承項目区分：ロット予備（数値）３
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_NUM3 = create("LOT_SUB_NUM3", "LOT_SUB_NUM3", false, null, false, false);

	/** 継承項目区分：ロット予備（数値）４
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_NUM4 = create("LOT_SUB_NUM4", "LOT_SUB_NUM4", false, null, false, false);

	/** 継承項目区分：ロット予備（数値）５
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_SUB_NUM5 = create("LOT_SUB_NUM5", "LOT_SUB_NUM5", false, null, false, false);

	/** 継承項目区分：ロット備考
	 */
	public static final MAC_LOT_INH_COL_TYP LOT_RMRKS = create("LOT_RMRKS", "LOT_RMRKS", false, null, true, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LOT_INH_COL_TYP create() {
		return new MAC_LOT_INH_COL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_LOT_INH_COL_TYP get(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		if (type == null) {
			throw MAC_LOT_INH_COL_TYP.invalidValue(value);
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
	public static MAC_LOT_INH_COL_TYP getNE(String value) {
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LOT_INH_COL_TYP create(String value, String xmlKey, boolean attr1, String attr2, boolean attr3, boolean attr4) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_ENABLE_CONCAT, attr1);
		me.constR.addStringColumn($DLM_STR, attr2);
		me.constR.addBooleanColumn($IS_ENABLE_ADD, attr3);
		me.constR.addBooleanColumn($IS_ADD_BEHIND, attr4);
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
	 * is_enable_concatの値を返します。
	 * @return is_enable_concatの値
	 */
	public boolean is_enable_concat() {
		return constR.getBooleanNE($IS_ENABLE_CONCAT);
	}

	/** 
	 * valueに対応する定数のis_enable_concatの値を返します。
	 * @param value 定数値
	 * @return is_enable_concatの値
	 */
	public static boolean is_enable_concat(String value) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_enable_concat();
	}

	/** 
	 * dlm_strの値を返します。
	 * @return dlm_strの値
	 */
	public String dlm_str() {
		return constR.getStringNE($DLM_STR);
	}

	/** 
	 * valueに対応する定数のdlm_strの値を返します。
	 * @param value 定数値
	 * @return dlm_strの値
	 */
	public static String dlm_str(String value) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.dlm_str();
	}

	/** 
	 * is_enable_addの値を返します。
	 * @return is_enable_addの値
	 */
	public boolean is_enable_add() {
		return constR.getBooleanNE($IS_ENABLE_ADD);
	}

	/** 
	 * valueに対応する定数のis_enable_addの値を返します。
	 * @param value 定数値
	 * @return is_enable_addの値
	 */
	public static boolean is_enable_add(String value) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_enable_add();
	}

	/** 
	 * is_add_behindの値を返します。
	 * @return is_add_behindの値
	 */
	public boolean is_add_behind() {
		return constR.getBooleanNE($IS_ADD_BEHIND);
	}

	/** 
	 * valueに対応する定数のis_add_behindの値を返します。
	 * @param value 定数値
	 * @return is_add_behindの値
	 */
	public static boolean is_add_behind(String value) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_add_behind();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
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
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
		if (me == null) {
			throw MAC_LOT_INH_COL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_enable_concat(), dlm_str(), is_enable_add(), is_add_behind());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_LOT_INH_COL_TYP[] array() {
		if (array == null) {
			array = new MAC_LOT_INH_COL_TYP[] {
					MAC_LOT_INH_COL_TYP.ACT_CONT_FCTR, MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR1, MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR2, MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR3, MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR4, 
					 MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR5, MAC_LOT_INH_COL_TYP.LOT_SUB_DT1, MAC_LOT_INH_COL_TYP.LOT_SUB_DT2, MAC_LOT_INH_COL_TYP.LOT_SUB_DT3, MAC_LOT_INH_COL_TYP.LOT_SUB_DT4, MAC_LOT_INH_COL_TYP.LOT_SUB_DT5, 
					 MAC_LOT_INH_COL_TYP.LOT_SUB_FLG1, MAC_LOT_INH_COL_TYP.LOT_SUB_FLG2, MAC_LOT_INH_COL_TYP.LOT_SUB_FLG3, MAC_LOT_INH_COL_TYP.LOT_SUB_FLG4, MAC_LOT_INH_COL_TYP.LOT_SUB_FLG5, MAC_LOT_INH_COL_TYP.LOT_SUB_NUM1, 
					 MAC_LOT_INH_COL_TYP.LOT_SUB_NUM2, MAC_LOT_INH_COL_TYP.LOT_SUB_NUM3, MAC_LOT_INH_COL_TYP.LOT_SUB_NUM4, MAC_LOT_INH_COL_TYP.LOT_SUB_NUM5, MAC_LOT_INH_COL_TYP.LOT_RMRKS
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
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
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
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
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
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
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
			if(MAC_LOT_INH_COL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_LOT_INH_COL_TYP me = MAC_LOT_INH_COL_TYP.get(MAC_LOT_INH_COL_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_LOT_INH_COL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_LOT_INH_COL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_LOT_INH_COL_TYP.list();
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
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
			if(MAC_LOT_INH_COL_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_LOT_INH_COL_TYP.subList(cols, vals);
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
		for (MAC_LOT_INH_COL_TYP me : MAC_LOT_INH_COL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_LOT_INH_COL_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_LOT_INH_COL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_LOT_INH_COL_TYP", col);}
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
	protected boolean isSame(MAC_LOT_INH_COL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 継承項目区分：実際有効成分係数かどうか
	 * @param value 定数値
	 * @return 定数値が実際有効成分係数の値の場合true
	 */
	public static boolean isACT_CONT_FCTR(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.ACT_CONT_FCTR.isSame(type);
	}

	/**
	 * 継承項目区分：実際有効成分係数かどうか
	 * @param type 属性値
	 * @return 属性値が実際有効成分係数の値の場合true
	 */
	public static boolean isACT_CONT_FCTR(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.ACT_CONT_FCTR.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）１かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（文字列）１の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR1(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）１かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（文字列）１の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR1(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）２かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（文字列）２の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR2(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）２かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（文字列）２の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR2(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）３かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（文字列）３の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR3(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）３かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（文字列）３の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR3(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）４かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（文字列）４の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR4(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）４かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（文字列）４の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR4(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）５かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（文字列）５の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR5(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（文字列）５かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（文字列）５の値の場合true
	 */
	public static boolean isLOT_SUB_CHAR5(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_CHAR5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）１かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（日付）１の値の場合true
	 */
	public static boolean isLOT_SUB_DT1(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）１かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（日付）１の値の場合true
	 */
	public static boolean isLOT_SUB_DT1(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）２かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（日付）２の値の場合true
	 */
	public static boolean isLOT_SUB_DT2(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）２かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（日付）２の値の場合true
	 */
	public static boolean isLOT_SUB_DT2(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）３かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（日付）３の値の場合true
	 */
	public static boolean isLOT_SUB_DT3(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）３かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（日付）３の値の場合true
	 */
	public static boolean isLOT_SUB_DT3(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）４かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（日付）４の値の場合true
	 */
	public static boolean isLOT_SUB_DT4(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）４かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（日付）４の値の場合true
	 */
	public static boolean isLOT_SUB_DT4(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）５かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（日付）５の値の場合true
	 */
	public static boolean isLOT_SUB_DT5(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（日付）５かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（日付）５の値の場合true
	 */
	public static boolean isLOT_SUB_DT5(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_DT5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）１かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（ＦＬＧ）１の値の場合true
	 */
	public static boolean isLOT_SUB_FLG1(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）１かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（ＦＬＧ）１の値の場合true
	 */
	public static boolean isLOT_SUB_FLG1(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）２かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（ＦＬＧ）２の値の場合true
	 */
	public static boolean isLOT_SUB_FLG2(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）２かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（ＦＬＧ）２の値の場合true
	 */
	public static boolean isLOT_SUB_FLG2(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）３かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（ＦＬＧ）３の値の場合true
	 */
	public static boolean isLOT_SUB_FLG3(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）３かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（ＦＬＧ）３の値の場合true
	 */
	public static boolean isLOT_SUB_FLG3(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）４かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（ＦＬＧ）４の値の場合true
	 */
	public static boolean isLOT_SUB_FLG4(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）４かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（ＦＬＧ）４の値の場合true
	 */
	public static boolean isLOT_SUB_FLG4(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）５かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（ＦＬＧ）５の値の場合true
	 */
	public static boolean isLOT_SUB_FLG5(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（ＦＬＧ）５かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（ＦＬＧ）５の値の場合true
	 */
	public static boolean isLOT_SUB_FLG5(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_FLG5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）１かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（数値）１の値の場合true
	 */
	public static boolean isLOT_SUB_NUM1(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）１かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（数値）１の値の場合true
	 */
	public static boolean isLOT_SUB_NUM1(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM1.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）２かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（数値）２の値の場合true
	 */
	public static boolean isLOT_SUB_NUM2(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）２かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（数値）２の値の場合true
	 */
	public static boolean isLOT_SUB_NUM2(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM2.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）３かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（数値）３の値の場合true
	 */
	public static boolean isLOT_SUB_NUM3(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）３かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（数値）３の値の場合true
	 */
	public static boolean isLOT_SUB_NUM3(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM3.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）４かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（数値）４の値の場合true
	 */
	public static boolean isLOT_SUB_NUM4(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）４かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（数値）４の値の場合true
	 */
	public static boolean isLOT_SUB_NUM4(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM4.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）５かどうか
	 * @param value 定数値
	 * @return 定数値がロット予備（数値）５の値の場合true
	 */
	public static boolean isLOT_SUB_NUM5(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット予備（数値）５かどうか
	 * @param type 属性値
	 * @return 属性値がロット予備（数値）５の値の場合true
	 */
	public static boolean isLOT_SUB_NUM5(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_SUB_NUM5.isSame(type);
	}

	/**
	 * 継承項目区分：ロット備考かどうか
	 * @param value 定数値
	 * @return 定数値がロット備考の値の場合true
	 */
	public static boolean isLOT_RMRKS(String value) {
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
		return MAC_LOT_INH_COL_TYP.LOT_RMRKS.isSame(type);
	}

	/**
	 * 継承項目区分：ロット備考かどうか
	 * @param type 属性値
	 * @return 属性値がロット備考の値の場合true
	 */
	public static boolean isLOT_RMRKS(MAC_LOT_INH_COL_TYP type) {
		return MAC_LOT_INH_COL_TYP.LOT_RMRKS.isSame(type);
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
			MAC_LOT_INH_COL_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.get(value);
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
			MAC_LOT_INH_COL_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
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
			MAC_LOT_INH_COL_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.get(value);
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
			MAC_LOT_INH_COL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
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
			MAC_LOT_INH_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.get(value);
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
			MAC_LOT_INH_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
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
			MAC_LOT_INH_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.get(value);
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
			MAC_LOT_INH_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LOT_INH_COL_TYP type = MAC_LOT_INH_COL_TYP.getNE(value);
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
