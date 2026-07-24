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
abstract class MSC_PURC_SRCH_TGT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "PURC_SRCH_TGT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_PURC_SRCH_TGT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "purc_srch_tgt_typ";

	public static final String $NAME = "purc_srch_tgt_typ_nm";

	public static final String $IS_PS_SPLIT = "is_ps_split";

	public static final String $IS_PRMS = "is_prms";

	public static final String $IS_ACT = "is_act";

	public static final String $IS_PR_SCHD = "is_pr_schd";

	public static final String $IS_PR_ACT = "is_pr_act";

	/*
	 * 定数の定義です。
	 */
	/** 購買検索対象区分：分割元発注予定ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP SPLIT_SRC_PO_SCHD_NO = create("A", "SPLIT_SRC_PO_SCHD_NO", true, false, false, false, false);

	/** 購買検索対象区分：分割先発注予定ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP SPLIT_DST_PO_SCHD_NO = create("B", "SPLIT_DST_PO_SCHD_NO", true, false, false, false, false);

	/** 購買検索対象区分：発注ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PO_NO = create("C", "PO_NO", false, true, true, false, false);

	/** 購買検索対象区分：発注明細ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PO_D_NO = create("D", "PO_D_NO", false, true, false, false, false);

	/** 購買検索対象区分：仕入実績ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PURC_ACT_NO = create("E", "PURC_ACT_NO", false, false, true, true, true);

	/** 購買検索対象区分：仕入実績明細ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PURC_ACT_D_NO = create("F", "PURC_ACT_D_NO", false, false, false, true, true);

	/** 購買検索対象区分：入荷実績ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP ARR_ACT_NO = create("G", "ARR_ACT_NO", false, false, false, true, true);

	/** 購買検索対象区分：仕入返品予定ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PURC_RET_SCHD_NO = create("H", "PURC_RET_SCHD_NO", false, false, false, true, false);

	/** 購買検索対象区分：仕入返品実績ＮＯ
	 */
	public static final MSC_PURC_SRCH_TGT_TYP PURC_RET_ACT_NO = create("I", "PURC_RET_ACT_NO", false, false, false, false, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_PURC_SRCH_TGT_TYP create() {
		return new MSC_PURC_SRCH_TGT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_PURC_SRCH_TGT_TYP get(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if (type == null) {
			throw MSC_PURC_SRCH_TGT_TYP.invalidValue(value);
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
	public static MSC_PURC_SRCH_TGT_TYP getNE(String value) {
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_PURC_SRCH_TGT_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_PS_SPLIT, attr1);
		me.constR.addBooleanColumn($IS_PRMS, attr2);
		me.constR.addBooleanColumn($IS_ACT, attr3);
		me.constR.addBooleanColumn($IS_PR_SCHD, attr4);
		me.constR.addBooleanColumn($IS_PR_ACT, attr5);
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
	 * is_ps_splitの値を返します。
	 * @return is_ps_splitの値
	 */
	public boolean is_ps_split() {
		return constR.getBooleanNE($IS_PS_SPLIT);
	}

	/** 
	 * valueに対応する定数のis_ps_splitの値を返します。
	 * @param value 定数値
	 * @return is_ps_splitの値
	 */
	public static boolean is_ps_split(String value) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ps_split();
	}

	/** 
	 * is_prmsの値を返します。
	 * @return is_prmsの値
	 */
	public boolean is_prms() {
		return constR.getBooleanNE($IS_PRMS);
	}

	/** 
	 * valueに対応する定数のis_prmsの値を返します。
	 * @param value 定数値
	 * @return is_prmsの値
	 */
	public static boolean is_prms(String value) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_prms();
	}

	/** 
	 * is_actの値を返します。
	 * @return is_actの値
	 */
	public boolean is_act() {
		return constR.getBooleanNE($IS_ACT);
	}

	/** 
	 * valueに対応する定数のis_actの値を返します。
	 * @param value 定数値
	 * @return is_actの値
	 */
	public static boolean is_act(String value) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_act();
	}

	/** 
	 * is_pr_schdの値を返します。
	 * @return is_pr_schdの値
	 */
	public boolean is_pr_schd() {
		return constR.getBooleanNE($IS_PR_SCHD);
	}

	/** 
	 * valueに対応する定数のis_pr_schdの値を返します。
	 * @param value 定数値
	 * @return is_pr_schdの値
	 */
	public static boolean is_pr_schd(String value) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_pr_schd();
	}

	/** 
	 * is_pr_actの値を返します。
	 * @return is_pr_actの値
	 */
	public boolean is_pr_act() {
		return constR.getBooleanNE($IS_PR_ACT);
	}

	/** 
	 * valueに対応する定数のis_pr_actの値を返します。
	 * @param value 定数値
	 * @return is_pr_actの値
	 */
	public static boolean is_pr_act(String value) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_pr_act();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		if (me == null) {
			throw MSC_PURC_SRCH_TGT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_ps_split(), is_prms(), is_act(), is_pr_schd(), is_pr_act());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_PURC_SRCH_TGT_TYP[] array() {
		if (array == null) {
			array = new MSC_PURC_SRCH_TGT_TYP[] {
					MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO, MSC_PURC_SRCH_TGT_TYP.SPLIT_DST_PO_SCHD_NO, MSC_PURC_SRCH_TGT_TYP.PO_NO, MSC_PURC_SRCH_TGT_TYP.PO_D_NO, MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO, 
					 MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO, MSC_PURC_SRCH_TGT_TYP.ARR_ACT_NO, MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO, MSC_PURC_SRCH_TGT_TYP.PURC_RET_ACT_NO
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
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
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
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
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
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
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
			if(MSC_PURC_SRCH_TGT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_PURC_SRCH_TGT_TYP me = MSC_PURC_SRCH_TGT_TYP.get(MSC_PURC_SRCH_TGT_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_PURC_SRCH_TGT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_PURC_SRCH_TGT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_PURC_SRCH_TGT_TYP.list();
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
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
			if(MSC_PURC_SRCH_TGT_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_PURC_SRCH_TGT_TYP.subList(cols, vals);
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
		for (MSC_PURC_SRCH_TGT_TYP me : MSC_PURC_SRCH_TGT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_PURC_SRCH_TGT_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_PURC_SRCH_TGT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_PURC_SRCH_TGT_TYP", col);}
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
	protected boolean isSame(MSC_PURC_SRCH_TGT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 購買検索対象区分：分割元発注予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が分割元発注予定ＮＯの値の場合true
	 */
	public static boolean isSPLIT_SRC_PO_SCHD_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：分割元発注予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が分割元発注予定ＮＯの値の場合true
	 */
	public static boolean isSPLIT_SRC_PO_SCHD_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.SPLIT_SRC_PO_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：分割先発注予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が分割先発注予定ＮＯの値の場合true
	 */
	public static boolean isSPLIT_DST_PO_SCHD_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.SPLIT_DST_PO_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：分割先発注予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が分割先発注予定ＮＯの値の場合true
	 */
	public static boolean isSPLIT_DST_PO_SCHD_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.SPLIT_DST_PO_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：発注ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注ＮＯの値の場合true
	 */
	public static boolean isPO_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PO_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：発注ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注ＮＯの値の場合true
	 */
	public static boolean isPO_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PO_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：発注明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が発注明細ＮＯの値の場合true
	 */
	public static boolean isPO_D_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PO_D_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：発注明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が発注明細ＮＯの値の場合true
	 */
	public static boolean isPO_D_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PO_D_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入実績ＮＯの値の場合true
	 */
	public static boolean isPURC_ACT_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入実績ＮＯの値の場合true
	 */
	public static boolean isPURC_ACT_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PURC_ACT_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入実績明細ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入実績明細ＮＯの値の場合true
	 */
	public static boolean isPURC_ACT_D_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入実績明細ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入実績明細ＮＯの値の場合true
	 */
	public static boolean isPURC_ACT_D_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PURC_ACT_D_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：入荷実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績ＮＯの値の場合true
	 */
	public static boolean isARR_ACT_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.ARR_ACT_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：入荷実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績ＮＯの値の場合true
	 */
	public static boolean isARR_ACT_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.ARR_ACT_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入返品予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品予定ＮＯの値の場合true
	 */
	public static boolean isPURC_RET_SCHD_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入返品予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品予定ＮＯの値の場合true
	 */
	public static boolean isPURC_RET_SCHD_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PURC_RET_SCHD_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入返品実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品実績ＮＯの値の場合true
	 */
	public static boolean isPURC_RET_ACT_NO(String value) {
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
		return MSC_PURC_SRCH_TGT_TYP.PURC_RET_ACT_NO.isSame(type);
	}

	/**
	 * 購買検索対象区分：仕入返品実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品実績ＮＯの値の場合true
	 */
	public static boolean isPURC_RET_ACT_NO(MSC_PURC_SRCH_TGT_TYP type) {
		return MSC_PURC_SRCH_TGT_TYP.PURC_RET_ACT_NO.isSame(type);
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
			MSC_PURC_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.get(value);
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
			MSC_PURC_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
			MSC_PURC_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.get(value);
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
			MSC_PURC_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
			MSC_PURC_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.get(value);
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
			MSC_PURC_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
			MSC_PURC_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.get(value);
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
			MSC_PURC_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_PURC_SRCH_TGT_TYP type = MSC_PURC_SRCH_TGT_TYP.getNE(value);
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
