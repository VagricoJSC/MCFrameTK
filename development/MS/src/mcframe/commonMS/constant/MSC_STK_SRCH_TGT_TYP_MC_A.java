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
abstract class MSC_STK_SRCH_TGT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "STK_SRCH_TGT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_STK_SRCH_TGT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "stk_srch_tgt_typ";

	public static final String $NAME = "stk_srch_tgt_typ_nm";

	public static final String $IS_ACXFR_ACT = "is_acxfr_act";

	public static final String $IS_XFR_INST = "is_xfr_inst";

	public static final String $IS_XFR_ACT = "is_xfr_act";

	public static final String $IS_SHIP_ACT = "is_ship_act";

	public static final String $IS_IV_INST = "is_iv_inst";

	/*
	 * 定数の定義です。
	 */
	/** 在庫物流検索対象区分：他勘定振替指図ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP ACXFR_INST_NO = create("A", "ACXFR_INST_NO", true, false, false, false, false);

	/** 在庫物流検索対象区分：他勘定振替実績ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP ACXFR_ACT_NO = create("B", "ACXFR_ACT_NO", true, false, false, false, false);

	/** 在庫物流検索対象区分：移動・移送予定ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP XFR_SCHD_NO = create("C", "XFR_SCHD_NO", false, false, false, false, false);

	/** 在庫物流検索対象区分：移動引当状況ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP XFR_ALLOC_STS_NO = create("D", "XFR_ALLOC_STS_NO", false, true, true, false, false);

	/** 在庫物流検索対象区分：移動指図ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP XFR_INST_NO = create("E", "XFR_INST_NO", false, true, true, false, false);

	/** 在庫物流検索対象区分：移動実績ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP XFR_ACT_NO = create("F", "XFR_ACT_NO", false, false, true, false, false);

	/** 在庫物流検索対象区分：出荷実績ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP SHIP_ACT_NO = create("G", "SHIP_ACT_NO", false, false, false, true, false);

	/** 在庫物流検索対象区分：出荷指図ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP SHIP_INST_NO = create("H", "SHIP_INST_NO", false, false, false, true, false);

	/** 在庫物流検索対象区分：Ｉ／ＶＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP IV_NO = create("I", "IV_NO", false, false, false, true, true);

	/** 在庫物流検索対象区分：納品書ＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP DLV_SLIP_NO = create("J", "DLV_SLIP_NO", false, false, false, true, false);

	/** 在庫物流検索対象区分：受領Ｉ／ＶＮＯ
	 */
	public static final MSC_STK_SRCH_TGT_TYP RCPT_IV_NO = create("K", "RCPT_IV_NO", false, false, false, false, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_STK_SRCH_TGT_TYP create() {
		return new MSC_STK_SRCH_TGT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_STK_SRCH_TGT_TYP get(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if (type == null) {
			throw MSC_STK_SRCH_TGT_TYP.invalidValue(value);
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
	public static MSC_STK_SRCH_TGT_TYP getNE(String value) {
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_STK_SRCH_TGT_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_ACXFR_ACT, attr1);
		me.constR.addBooleanColumn($IS_XFR_INST, attr2);
		me.constR.addBooleanColumn($IS_XFR_ACT, attr3);
		me.constR.addBooleanColumn($IS_SHIP_ACT, attr4);
		me.constR.addBooleanColumn($IS_IV_INST, attr5);
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
	 * is_acxfr_actの値を返します。
	 * @return is_acxfr_actの値
	 */
	public boolean is_acxfr_act() {
		return constR.getBooleanNE($IS_ACXFR_ACT);
	}

	/** 
	 * valueに対応する定数のis_acxfr_actの値を返します。
	 * @param value 定数値
	 * @return is_acxfr_actの値
	 */
	public static boolean is_acxfr_act(String value) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_acxfr_act();
	}

	/** 
	 * is_xfr_instの値を返します。
	 * @return is_xfr_instの値
	 */
	public boolean is_xfr_inst() {
		return constR.getBooleanNE($IS_XFR_INST);
	}

	/** 
	 * valueに対応する定数のis_xfr_instの値を返します。
	 * @param value 定数値
	 * @return is_xfr_instの値
	 */
	public static boolean is_xfr_inst(String value) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_xfr_inst();
	}

	/** 
	 * is_xfr_actの値を返します。
	 * @return is_xfr_actの値
	 */
	public boolean is_xfr_act() {
		return constR.getBooleanNE($IS_XFR_ACT);
	}

	/** 
	 * valueに対応する定数のis_xfr_actの値を返します。
	 * @param value 定数値
	 * @return is_xfr_actの値
	 */
	public static boolean is_xfr_act(String value) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_xfr_act();
	}

	/** 
	 * is_ship_actの値を返します。
	 * @return is_ship_actの値
	 */
	public boolean is_ship_act() {
		return constR.getBooleanNE($IS_SHIP_ACT);
	}

	/** 
	 * valueに対応する定数のis_ship_actの値を返します。
	 * @param value 定数値
	 * @return is_ship_actの値
	 */
	public static boolean is_ship_act(String value) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ship_act();
	}

	/** 
	 * is_iv_instの値を返します。
	 * @return is_iv_instの値
	 */
	public boolean is_iv_inst() {
		return constR.getBooleanNE($IS_IV_INST);
	}

	/** 
	 * valueに対応する定数のis_iv_instの値を返します。
	 * @param value 定数値
	 * @return is_iv_instの値
	 */
	public static boolean is_iv_inst(String value) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_iv_inst();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
		if (me == null) {
			throw MSC_STK_SRCH_TGT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_acxfr_act(), is_xfr_inst(), is_xfr_act(), is_ship_act(), is_iv_inst());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_STK_SRCH_TGT_TYP[] array() {
		if (array == null) {
			array = new MSC_STK_SRCH_TGT_TYP[] {
					MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO, MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO, MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO, MSC_STK_SRCH_TGT_TYP.XFR_ALLOC_STS_NO, MSC_STK_SRCH_TGT_TYP.XFR_INST_NO, 
					 MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO, MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO, MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO, MSC_STK_SRCH_TGT_TYP.IV_NO, MSC_STK_SRCH_TGT_TYP.DLV_SLIP_NO, MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO
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
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
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
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
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
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
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
			if(MSC_STK_SRCH_TGT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_STK_SRCH_TGT_TYP me = MSC_STK_SRCH_TGT_TYP.get(MSC_STK_SRCH_TGT_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_STK_SRCH_TGT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_STK_SRCH_TGT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_STK_SRCH_TGT_TYP.list();
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
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
			if(MSC_STK_SRCH_TGT_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_STK_SRCH_TGT_TYP.subList(cols, vals);
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
		for (MSC_STK_SRCH_TGT_TYP me : MSC_STK_SRCH_TGT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_STK_SRCH_TGT_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_STK_SRCH_TGT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_STK_SRCH_TGT_TYP", col);}
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
	protected boolean isSame(MSC_STK_SRCH_TGT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 在庫物流検索対象区分：他勘定振替指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替指図ＮＯの値の場合true
	 */
	public static boolean isACXFR_INST_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：他勘定振替指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替指図ＮＯの値の場合true
	 */
	public static boolean isACXFR_INST_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.ACXFR_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：他勘定振替実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績ＮＯの値の場合true
	 */
	public static boolean isACXFR_ACT_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：他勘定振替実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績ＮＯの値の場合true
	 */
	public static boolean isACXFR_ACT_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.ACXFR_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動・移送予定ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送予定ＮＯの値の場合true
	 */
	public static boolean isXFR_SCHD_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動・移送予定ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送予定ＮＯの値の場合true
	 */
	public static boolean isXFR_SCHD_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.XFR_SCHD_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動引当状況ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動引当状況ＮＯの値の場合true
	 */
	public static boolean isXFR_ALLOC_STS_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.XFR_ALLOC_STS_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動引当状況ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動引当状況ＮＯの値の場合true
	 */
	public static boolean isXFR_ALLOC_STS_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.XFR_ALLOC_STS_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動指図ＮＯの値の場合true
	 */
	public static boolean isXFR_INST_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.XFR_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動指図ＮＯの値の場合true
	 */
	public static boolean isXFR_INST_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.XFR_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が移動実績ＮＯの値の場合true
	 */
	public static boolean isXFR_ACT_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：移動実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が移動実績ＮＯの値の場合true
	 */
	public static boolean isXFR_ACT_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.XFR_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：出荷実績ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績ＮＯの値の場合true
	 */
	public static boolean isSHIP_ACT_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：出荷実績ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績ＮＯの値の場合true
	 */
	public static boolean isSHIP_ACT_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.SHIP_ACT_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：出荷指図ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図ＮＯの値の場合true
	 */
	public static boolean isSHIP_INST_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：出荷指図ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図ＮＯの値の場合true
	 */
	public static boolean isSHIP_INST_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.SHIP_INST_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：Ｉ／ＶＮＯかどうか
	 * @param value 定数値
	 * @return 定数値がＩ／ＶＮＯの値の場合true
	 */
	public static boolean isIV_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.IV_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：Ｉ／ＶＮＯかどうか
	 * @param type 属性値
	 * @return 属性値がＩ／ＶＮＯの値の場合true
	 */
	public static boolean isIV_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.IV_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：納品書ＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が納品書ＮＯの値の場合true
	 */
	public static boolean isDLV_SLIP_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.DLV_SLIP_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：納品書ＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が納品書ＮＯの値の場合true
	 */
	public static boolean isDLV_SLIP_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.DLV_SLIP_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：受領Ｉ／ＶＮＯかどうか
	 * @param value 定数値
	 * @return 定数値が受領Ｉ／ＶＮＯの値の場合true
	 */
	public static boolean isRCPT_IV_NO(String value) {
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
		return MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO.isSame(type);
	}

	/**
	 * 在庫物流検索対象区分：受領Ｉ／ＶＮＯかどうか
	 * @param type 属性値
	 * @return 属性値が受領Ｉ／ＶＮＯの値の場合true
	 */
	public static boolean isRCPT_IV_NO(MSC_STK_SRCH_TGT_TYP type) {
		return MSC_STK_SRCH_TGT_TYP.RCPT_IV_NO.isSame(type);
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
			MSC_STK_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.get(value);
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
			MSC_STK_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
			MSC_STK_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.get(value);
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
			MSC_STK_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
			MSC_STK_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.get(value);
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
			MSC_STK_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
			MSC_STK_SRCH_TGT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.get(value);
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
			MSC_STK_SRCH_TGT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_STK_SRCH_TGT_TYP type = MSC_STK_SRCH_TGT_TYP.getNE(value);
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
