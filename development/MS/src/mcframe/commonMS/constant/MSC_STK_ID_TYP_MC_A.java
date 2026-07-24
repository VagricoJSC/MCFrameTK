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
abstract class MSC_STK_ID_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "STK_ID_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_STK_ID_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "stk_id_typ";

	public static final String $NAME = "stk_id_typ_nm";

	public static final String $IS_ALLOC = "is_alloc";

	public static final String $IS_GI = "is_gi";

	public static final String $IS_GR = "is_gr";

	public static final String $IS_SCRP = "is_scrp";

	public static final String $IS_INST_GI = "is_inst_gi";

	public static final String $IS_INST_GR = "is_inst_gr";

	public static final String $IS_INST_SCRP = "is_inst_scrp";

	public static final String $IS_ACT_GI = "is_act_gi";

	public static final String $IS_ACT_GR = "is_act_gr";

	public static final String $IS_ACT_SCRP = "is_act_scrp";

	/*
	 * 定数の定義です。
	 */
	/** 在庫識別区分：自社在庫
	 */
	public static final MSC_STK_ID_TYP COSTK = create("1", "COSTK", true, true, true, true, true, true, true, true, true, true);

	/** 在庫識別区分：返品検収前
	 */
	public static final MSC_STK_ID_TYP RTN_PRE_ACCPT = create("2", "RTN_PRE_ACCPT", false, false, false, false, false, false, false, true, true, true);

	/** 在庫識別区分：預り
	 */
	public static final MSC_STK_ID_TYP CSTSTK = create("3", "CSTSTK", true, false, false, false, false, false, false, true, true, true);

	/** 在庫識別区分：VMI
	 */
	public static final MSC_STK_ID_TYP RNT_RCV = create("4", "RNT_RCV", true, true, false, true, true, true, true, true, true, true);

	/** 在庫識別区分：仕入検収前
	 */
	public static final MSC_STK_ID_TYP PURC_PRE_ACCPT = create("5", "PURC_PRE_ACCPT", false, false, false, false, false, false, false, false, false, false);

	/** 在庫識別区分：検収不良
	 */
	public static final MSC_STK_ID_TYP ACCPT_DFCT = create("6", "ACCPT_DFCT", false, false, false, true, true, true, true, true, true, true);

	/** 在庫識別区分：無償受給
	 */
	public static final MSC_STK_ID_TYP NCV_RCV = create("7", "NCV_RCV", true, false, false, true, true, true, true, true, true, true);

	/** 在庫識別区分：有償支給
	 */
	public static final MSC_STK_ID_TYP ONR_PROV = create("8", "ONR_PROV", true, false, false, true, true, true, true, true, true, true);

	/** 在庫識別区分：自給
	 */
	public static final MSC_STK_ID_TYP SLF_SUPPRT = create("9", "SLF_SUPPRT", false, false, false, false, false, false, false, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_STK_ID_TYP create() {
		return new MSC_STK_ID_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_STK_ID_TYP get(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		if (type == null) {
			throw MSC_STK_ID_TYP.invalidValue(value);
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
	public static MSC_STK_ID_TYP getNE(String value) {
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_STK_ID_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9, boolean attr10) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_ALLOC, attr1);
		me.constR.addBooleanColumn($IS_GI, attr2);
		me.constR.addBooleanColumn($IS_GR, attr3);
		me.constR.addBooleanColumn($IS_SCRP, attr4);
		me.constR.addBooleanColumn($IS_INST_GI, attr5);
		me.constR.addBooleanColumn($IS_INST_GR, attr6);
		me.constR.addBooleanColumn($IS_INST_SCRP, attr7);
		me.constR.addBooleanColumn($IS_ACT_GI, attr8);
		me.constR.addBooleanColumn($IS_ACT_GR, attr9);
		me.constR.addBooleanColumn($IS_ACT_SCRP, attr10);
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
	 * is_allocの値を返します。
	 * @return is_allocの値
	 */
	public boolean is_alloc() {
		return constR.getBooleanNE($IS_ALLOC);
	}

	/** 
	 * valueに対応する定数のis_allocの値を返します。
	 * @param value 定数値
	 * @return is_allocの値
	 */
	public static boolean is_alloc(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_alloc();
	}

	/** 
	 * is_giの値を返します。
	 * @return is_giの値
	 */
	public boolean is_gi() {
		return constR.getBooleanNE($IS_GI);
	}

	/** 
	 * valueに対応する定数のis_giの値を返します。
	 * @param value 定数値
	 * @return is_giの値
	 */
	public static boolean is_gi(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_gi();
	}

	/** 
	 * is_grの値を返します。
	 * @return is_grの値
	 */
	public boolean is_gr() {
		return constR.getBooleanNE($IS_GR);
	}

	/** 
	 * valueに対応する定数のis_grの値を返します。
	 * @param value 定数値
	 * @return is_grの値
	 */
	public static boolean is_gr(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_gr();
	}

	/** 
	 * is_scrpの値を返します。
	 * @return is_scrpの値
	 */
	public boolean is_scrp() {
		return constR.getBooleanNE($IS_SCRP);
	}

	/** 
	 * valueに対応する定数のis_scrpの値を返します。
	 * @param value 定数値
	 * @return is_scrpの値
	 */
	public static boolean is_scrp(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_scrp();
	}

	/** 
	 * is_inst_giの値を返します。
	 * @return is_inst_giの値
	 */
	public boolean is_inst_gi() {
		return constR.getBooleanNE($IS_INST_GI);
	}

	/** 
	 * valueに対応する定数のis_inst_giの値を返します。
	 * @param value 定数値
	 * @return is_inst_giの値
	 */
	public static boolean is_inst_gi(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_inst_gi();
	}

	/** 
	 * is_inst_grの値を返します。
	 * @return is_inst_grの値
	 */
	public boolean is_inst_gr() {
		return constR.getBooleanNE($IS_INST_GR);
	}

	/** 
	 * valueに対応する定数のis_inst_grの値を返します。
	 * @param value 定数値
	 * @return is_inst_grの値
	 */
	public static boolean is_inst_gr(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_inst_gr();
	}

	/** 
	 * is_inst_scrpの値を返します。
	 * @return is_inst_scrpの値
	 */
	public boolean is_inst_scrp() {
		return constR.getBooleanNE($IS_INST_SCRP);
	}

	/** 
	 * valueに対応する定数のis_inst_scrpの値を返します。
	 * @param value 定数値
	 * @return is_inst_scrpの値
	 */
	public static boolean is_inst_scrp(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_inst_scrp();
	}

	/** 
	 * is_act_giの値を返します。
	 * @return is_act_giの値
	 */
	public boolean is_act_gi() {
		return constR.getBooleanNE($IS_ACT_GI);
	}

	/** 
	 * valueに対応する定数のis_act_giの値を返します。
	 * @param value 定数値
	 * @return is_act_giの値
	 */
	public static boolean is_act_gi(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_act_gi();
	}

	/** 
	 * is_act_grの値を返します。
	 * @return is_act_grの値
	 */
	public boolean is_act_gr() {
		return constR.getBooleanNE($IS_ACT_GR);
	}

	/** 
	 * valueに対応する定数のis_act_grの値を返します。
	 * @param value 定数値
	 * @return is_act_grの値
	 */
	public static boolean is_act_gr(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_act_gr();
	}

	/** 
	 * is_act_scrpの値を返します。
	 * @return is_act_scrpの値
	 */
	public boolean is_act_scrp() {
		return constR.getBooleanNE($IS_ACT_SCRP);
	}

	/** 
	 * valueに対応する定数のis_act_scrpの値を返します。
	 * @param value 定数値
	 * @return is_act_scrpの値
	 */
	public static boolean is_act_scrp(String value) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_act_scrp();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
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
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
		if (me == null) {
			throw MSC_STK_ID_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_STK_ID_TYP me = MSC_STK_ID_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_alloc(), is_gi(), is_gr(), is_scrp(), is_inst_gi(), is_inst_gr(), is_inst_scrp(), is_act_gi(), is_act_gr(), is_act_scrp());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_STK_ID_TYP[] array() {
		if (array == null) {
			array = new MSC_STK_ID_TYP[] {
					MSC_STK_ID_TYP.COSTK, MSC_STK_ID_TYP.RTN_PRE_ACCPT, MSC_STK_ID_TYP.CSTSTK, MSC_STK_ID_TYP.RNT_RCV, MSC_STK_ID_TYP.PURC_PRE_ACCPT, 
					 MSC_STK_ID_TYP.ACCPT_DFCT, MSC_STK_ID_TYP.NCV_RCV, MSC_STK_ID_TYP.ONR_PROV, MSC_STK_ID_TYP.SLF_SUPPRT
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
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
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
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
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
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
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
			if(MSC_STK_ID_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_STK_ID_TYP me = MSC_STK_ID_TYP.get(MSC_STK_ID_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_STK_ID_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_STK_ID_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_STK_ID_TYP.list();
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
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
			if(MSC_STK_ID_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_STK_ID_TYP.subList(cols, vals);
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
		for (MSC_STK_ID_TYP me : MSC_STK_ID_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_STK_ID_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_STK_ID_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_STK_ID_TYP", col);}
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
	protected boolean isSame(MSC_STK_ID_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 在庫識別区分：自社在庫かどうか
	 * @param value 定数値
	 * @return 定数値が自社在庫の値の場合true
	 */
	public static boolean isCOSTK(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.COSTK.isSame(type);
	}

	/**
	 * 在庫識別区分：自社在庫かどうか
	 * @param type 属性値
	 * @return 属性値が自社在庫の値の場合true
	 */
	public static boolean isCOSTK(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.COSTK.isSame(type);
	}

	/**
	 * 在庫識別区分：返品検収前かどうか
	 * @param value 定数値
	 * @return 定数値が返品検収前の値の場合true
	 */
	public static boolean isRTN_PRE_ACCPT(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.RTN_PRE_ACCPT.isSame(type);
	}

	/**
	 * 在庫識別区分：返品検収前かどうか
	 * @param type 属性値
	 * @return 属性値が返品検収前の値の場合true
	 */
	public static boolean isRTN_PRE_ACCPT(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.RTN_PRE_ACCPT.isSame(type);
	}

	/**
	 * 在庫識別区分：預りかどうか
	 * @param value 定数値
	 * @return 定数値が預りの値の場合true
	 */
	public static boolean isCSTSTK(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.CSTSTK.isSame(type);
	}

	/**
	 * 在庫識別区分：預りかどうか
	 * @param type 属性値
	 * @return 属性値が預りの値の場合true
	 */
	public static boolean isCSTSTK(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.CSTSTK.isSame(type);
	}

	/**
	 * 在庫識別区分：VMIかどうか
	 * @param value 定数値
	 * @return 定数値がVMIの値の場合true
	 */
	public static boolean isRNT_RCV(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.RNT_RCV.isSame(type);
	}

	/**
	 * 在庫識別区分：VMIかどうか
	 * @param type 属性値
	 * @return 属性値がVMIの値の場合true
	 */
	public static boolean isRNT_RCV(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.RNT_RCV.isSame(type);
	}

	/**
	 * 在庫識別区分：仕入検収前かどうか
	 * @param value 定数値
	 * @return 定数値が仕入検収前の値の場合true
	 */
	public static boolean isPURC_PRE_ACCPT(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.PURC_PRE_ACCPT.isSame(type);
	}

	/**
	 * 在庫識別区分：仕入検収前かどうか
	 * @param type 属性値
	 * @return 属性値が仕入検収前の値の場合true
	 */
	public static boolean isPURC_PRE_ACCPT(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.PURC_PRE_ACCPT.isSame(type);
	}

	/**
	 * 在庫識別区分：検収不良かどうか
	 * @param value 定数値
	 * @return 定数値が検収不良の値の場合true
	 */
	public static boolean isACCPT_DFCT(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.ACCPT_DFCT.isSame(type);
	}

	/**
	 * 在庫識別区分：検収不良かどうか
	 * @param type 属性値
	 * @return 属性値が検収不良の値の場合true
	 */
	public static boolean isACCPT_DFCT(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.ACCPT_DFCT.isSame(type);
	}

	/**
	 * 在庫識別区分：無償受給かどうか
	 * @param value 定数値
	 * @return 定数値が無償受給の値の場合true
	 */
	public static boolean isNCV_RCV(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.NCV_RCV.isSame(type);
	}

	/**
	 * 在庫識別区分：無償受給かどうか
	 * @param type 属性値
	 * @return 属性値が無償受給の値の場合true
	 */
	public static boolean isNCV_RCV(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.NCV_RCV.isSame(type);
	}

	/**
	 * 在庫識別区分：有償支給かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給の値の場合true
	 */
	public static boolean isONR_PROV(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.ONR_PROV.isSame(type);
	}

	/**
	 * 在庫識別区分：有償支給かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給の値の場合true
	 */
	public static boolean isONR_PROV(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.ONR_PROV.isSame(type);
	}

	/**
	 * 在庫識別区分：自給かどうか
	 * @param value 定数値
	 * @return 定数値が自給の値の場合true
	 */
	public static boolean isSLF_SUPPRT(String value) {
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
		return MSC_STK_ID_TYP.SLF_SUPPRT.isSame(type);
	}

	/**
	 * 在庫識別区分：自給かどうか
	 * @param type 属性値
	 * @return 属性値が自給の値の場合true
	 */
	public static boolean isSLF_SUPPRT(MSC_STK_ID_TYP type) {
		return MSC_STK_ID_TYP.SLF_SUPPRT.isSame(type);
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
			MSC_STK_ID_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.get(value);
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
			MSC_STK_ID_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
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
			MSC_STK_ID_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.get(value);
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
			MSC_STK_ID_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
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
			MSC_STK_ID_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.get(value);
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
			MSC_STK_ID_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
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
			MSC_STK_ID_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.get(value);
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
			MSC_STK_ID_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_STK_ID_TYP type = MSC_STK_ID_TYP.getNE(value);
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
