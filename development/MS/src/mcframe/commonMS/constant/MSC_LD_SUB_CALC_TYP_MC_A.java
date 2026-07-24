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
abstract class MSC_LD_SUB_CALC_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "LD_SUB_CALC_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_LD_SUB_CALC_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "ld_sub_calc_typ";

	public static final String $NAME = "ld_sub_calc_typ_nm";

	public static final String $IS_ITM_GRP = "is_itm_grp";

	public static final String $ITM_GRP_TYP = "itm_grp_typ";

	/*
	 * 定数の定義です。
	 */
	/** 負荷内訳計算区分：品目状況
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_STS = create("A", "ITM_STS", false, null);

	/** 負荷内訳計算区分：品目分類１
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP1 = create("B1", "ITM_GRP1", true, MAC_ITM_GRP_TYP.GRP1.value());

	/** 負荷内訳計算区分：品目分類２
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP2 = create("B2", "ITM_GRP2", true, MAC_ITM_GRP_TYP.GRP2.value());

	/** 負荷内訳計算区分：品目分類３
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP3 = create("B3", "ITM_GRP3", true, MAC_ITM_GRP_TYP.GRP3.value());

	/** 負荷内訳計算区分：品目分類４
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP4 = create("B4", "ITM_GRP4", true, MAC_ITM_GRP_TYP.GRP4.value());

	/** 負荷内訳計算区分：品目分類５
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP5 = create("B5", "ITM_GRP5", true, MAC_ITM_GRP_TYP.GRP5.value());

	/** 負荷内訳計算区分：品目分類６
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP6 = create("B6", "ITM_GRP6", true, MAC_ITM_GRP_TYP.GRP6.value());

	/** 負荷内訳計算区分：品目分類７
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP7 = create("B7", "ITM_GRP7", true, MAC_ITM_GRP_TYP.GRP7.value());

	/** 負荷内訳計算区分：品目分類８
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP8 = create("B8", "ITM_GRP8", true, MAC_ITM_GRP_TYP.GRP8.value());

	/** 負荷内訳計算区分：品目分類９
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP9 = create("B9", "ITM_GRP9", true, MAC_ITM_GRP_TYP.GRP9.value());

	/** 負荷内訳計算区分：品目分類１０
	 */
	public static final MSC_LD_SUB_CALC_TYP ITM_GRP10 = create("B10", "ITM_GRP10", true, MAC_ITM_GRP_TYP.GRP10.value());

	/** 負荷内訳計算区分：合計のみ
	 */
	public static final MSC_LD_SUB_CALC_TYP NO_DTL = create("X", "NO_DTL", false, null);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_LD_SUB_CALC_TYP create() {
		return new MSC_LD_SUB_CALC_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_LD_SUB_CALC_TYP get(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		if (type == null) {
			throw MSC_LD_SUB_CALC_TYP.invalidValue(value);
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
	public static MSC_LD_SUB_CALC_TYP getNE(String value) {
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_LD_SUB_CALC_TYP create(String value, String xmlKey, boolean attr1, String attr2) {
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_ITM_GRP, attr1);
		me.constR.addStringColumn($ITM_GRP_TYP, attr2);
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
	 * is_itm_grpの値を返します。
	 * @return is_itm_grpの値
	 */
	public boolean is_itm_grp() {
		return constR.getBooleanNE($IS_ITM_GRP);
	}

	/** 
	 * valueに対応する定数のis_itm_grpの値を返します。
	 * @param value 定数値
	 * @return is_itm_grpの値
	 */
	public static boolean is_itm_grp(String value) {
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_itm_grp();
	}

	/** 
	 * itm_grp_typの値を返します。
	 * @return itm_grp_typの値
	 */
	public String itm_grp_typ() {
		return constR.getStringNE($ITM_GRP_TYP);
	}

	/** 
	 * valueに対応する定数のitm_grp_typの値を返します。
	 * @param value 定数値
	 * @return itm_grp_typの値
	 */
	public static String itm_grp_typ(String value) {
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.itm_grp_typ();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.getNE(value);
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
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.getNE(value);
		if (me == null) {
			throw MSC_LD_SUB_CALC_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_itm_grp(), itm_grp_typ());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_LD_SUB_CALC_TYP[] array() {
		if (array == null) {
			array = new MSC_LD_SUB_CALC_TYP[] {
					MSC_LD_SUB_CALC_TYP.ITM_STS, MSC_LD_SUB_CALC_TYP.ITM_GRP1, MSC_LD_SUB_CALC_TYP.ITM_GRP2, MSC_LD_SUB_CALC_TYP.ITM_GRP3, MSC_LD_SUB_CALC_TYP.ITM_GRP4, 
					 MSC_LD_SUB_CALC_TYP.ITM_GRP5, MSC_LD_SUB_CALC_TYP.ITM_GRP6, MSC_LD_SUB_CALC_TYP.ITM_GRP7, MSC_LD_SUB_CALC_TYP.ITM_GRP8, MSC_LD_SUB_CALC_TYP.ITM_GRP9, MSC_LD_SUB_CALC_TYP.ITM_GRP10, 
					 MSC_LD_SUB_CALC_TYP.NO_DTL
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
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
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
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
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
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
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
			if(MSC_LD_SUB_CALC_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_LD_SUB_CALC_TYP me = MSC_LD_SUB_CALC_TYP.get(MSC_LD_SUB_CALC_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_LD_SUB_CALC_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_LD_SUB_CALC_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_LD_SUB_CALC_TYP.list();
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
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
			if(MSC_LD_SUB_CALC_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_LD_SUB_CALC_TYP.subList(cols, vals);
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
		for (MSC_LD_SUB_CALC_TYP me : MSC_LD_SUB_CALC_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_LD_SUB_CALC_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_LD_SUB_CALC_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_LD_SUB_CALC_TYP", col);}
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
	protected boolean isSame(MSC_LD_SUB_CALC_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 負荷内訳計算区分：品目状況かどうか
	 * @param value 定数値
	 * @return 定数値が品目状況の値の場合true
	 */
	public static boolean isITM_STS(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_STS.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目状況かどうか
	 * @param type 属性値
	 * @return 属性値が品目状況の値の場合true
	 */
	public static boolean isITM_STS(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_STS.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類１かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP1(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP1.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類１かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP1(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP1.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類２かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP2(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP2.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類２かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP2(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP2.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類３かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP3(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP3.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類３かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP3(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP3.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類４かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP4(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP4.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類４かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP4(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP4.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類５かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP5(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP5.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類５かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP5(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP5.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類６かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP6(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP6.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類６かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP6(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP6.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類７かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP7(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP7.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類７かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP7(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP7.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類８かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP8(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP8.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類８かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP8(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP8.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類９かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP9(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP9.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類９かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP9(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP9.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP10(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.ITM_GRP10.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：品目分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP10(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.ITM_GRP10.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：合計のみかどうか
	 * @param value 定数値
	 * @return 定数値が合計のみの値の場合true
	 */
	public static boolean isNO_DTL(String value) {
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
		return MSC_LD_SUB_CALC_TYP.NO_DTL.isSame(type);
	}

	/**
	 * 負荷内訳計算区分：合計のみかどうか
	 * @param type 属性値
	 * @return 属性値が合計のみの値の場合true
	 */
	public static boolean isNO_DTL(MSC_LD_SUB_CALC_TYP type) {
		return MSC_LD_SUB_CALC_TYP.NO_DTL.isSame(type);
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
			MSC_LD_SUB_CALC_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.get(value);
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
			MSC_LD_SUB_CALC_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
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
			MSC_LD_SUB_CALC_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.get(value);
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
			MSC_LD_SUB_CALC_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
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
			MSC_LD_SUB_CALC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.get(value);
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
			MSC_LD_SUB_CALC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
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
			MSC_LD_SUB_CALC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.get(value);
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
			MSC_LD_SUB_CALC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_LD_SUB_CALC_TYP type = MSC_LD_SUB_CALC_TYP.getNE(value);
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
