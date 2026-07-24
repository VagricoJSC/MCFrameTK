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
abstract class MAC_LMT_DT_FRM_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "LMT_DT_FRM_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_LMT_DT_FRM_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "lmt_dt_frm_typ";

	public static final String $NAME = "lmt_dt_frm_typ_nm";

	public static final String $IS_NO_INSP = "is_no_insp";

	public static final String $IS_NO_LMT_CTL = "is_no_lmt_ctl";

	public static final String $IS_LOT_INSP_ENABLE = "is_lot_insp_enable";

	public static final String $IS_LOT_INSP_DEF = "is_lot_insp_def";

	/*
	 * 定数の定義です。
	 */
	/** 期限起算日区分：製造着手日
	 */
	public static final MAC_LMT_DT_FRM_TYP MFG_ST = create("1", "MFG_ST", true, true, false, false);

	/** 期限起算日区分：製造完了日
	 */
	public static final MAC_LMT_DT_FRM_TYP MFG_CMPL = create("2", "MFG_CMPL", true, true, false, false);

	/** 期限起算日区分：検査判定日
	 */
	public static final MAC_LMT_DT_FRM_TYP INSP_JUDG = create("3", "INSP_JUDG", false, false, true, true);

	/** 期限起算日区分：出荷元期限
	 */
	public static final MAC_LMT_DT_FRM_TYP DPND_SHIP_FR = create("4", "DPND_SHIP_FR", true, false, false, false);

	/** 期限起算日区分：子品目期限引継ぎ
	 */
	public static final MAC_LMT_DT_FRM_TYP DPND_CHLD = create("5", "DPND_CHLD", true, false, false, false);

	/** 期限起算日区分：入荷実績日
	 */
	public static final MAC_LMT_DT_FRM_TYP ARR_DT = create("6", "ARR_DT", true, true, false, false);

	/** 期限起算日区分：子品目起算日引継ぎ
	 */
	public static final MAC_LMT_DT_FRM_TYP DPND_CHLD_FR_DT = create("7", "DPND_CHLD_FR_DT", true, true, false, false);

	/** 期限起算日区分：現有効期限
	 */
	public static final MAC_LMT_DT_FRM_TYP VALID_DT = create("8", "VALID_DT", true, false, true, false);

	/** 期限起算日区分：手入力
	 */
	public static final MAC_LMT_DT_FRM_TYP MANUAL = create("9", "MANUAL", false, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LMT_DT_FRM_TYP create() {
		return new MAC_LMT_DT_FRM_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_LMT_DT_FRM_TYP get(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		if (type == null) {
			throw MAC_LMT_DT_FRM_TYP.invalidValue(value);
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
	public static MAC_LMT_DT_FRM_TYP getNE(String value) {
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_LMT_DT_FRM_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_NO_INSP, attr1);
		me.constR.addBooleanColumn($IS_NO_LMT_CTL, attr2);
		me.constR.addBooleanColumn($IS_LOT_INSP_ENABLE, attr3);
		me.constR.addBooleanColumn($IS_LOT_INSP_DEF, attr4);
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
	 * is_no_inspの値を返します。
	 * @return is_no_inspの値
	 */
	public boolean is_no_insp() {
		return constR.getBooleanNE($IS_NO_INSP);
	}

	/** 
	 * valueに対応する定数のis_no_inspの値を返します。
	 * @param value 定数値
	 * @return is_no_inspの値
	 */
	public static boolean is_no_insp(String value) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_no_insp();
	}

	/** 
	 * is_no_lmt_ctlの値を返します。
	 * @return is_no_lmt_ctlの値
	 */
	public boolean is_no_lmt_ctl() {
		return constR.getBooleanNE($IS_NO_LMT_CTL);
	}

	/** 
	 * valueに対応する定数のis_no_lmt_ctlの値を返します。
	 * @param value 定数値
	 * @return is_no_lmt_ctlの値
	 */
	public static boolean is_no_lmt_ctl(String value) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_no_lmt_ctl();
	}

	/** 
	 * is_lot_insp_enableの値を返します。
	 * @return is_lot_insp_enableの値
	 */
	public boolean is_lot_insp_enable() {
		return constR.getBooleanNE($IS_LOT_INSP_ENABLE);
	}

	/** 
	 * valueに対応する定数のis_lot_insp_enableの値を返します。
	 * @param value 定数値
	 * @return is_lot_insp_enableの値
	 */
	public static boolean is_lot_insp_enable(String value) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_lot_insp_enable();
	}

	/** 
	 * is_lot_insp_defの値を返します。
	 * @return is_lot_insp_defの値
	 */
	public boolean is_lot_insp_def() {
		return constR.getBooleanNE($IS_LOT_INSP_DEF);
	}

	/** 
	 * valueに対応する定数のis_lot_insp_defの値を返します。
	 * @param value 定数値
	 * @return is_lot_insp_defの値
	 */
	public static boolean is_lot_insp_def(String value) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_lot_insp_def();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
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
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
		if (me == null) {
			throw MAC_LMT_DT_FRM_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_no_insp(), is_no_lmt_ctl(), is_lot_insp_enable(), is_lot_insp_def());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_LMT_DT_FRM_TYP[] array() {
		if (array == null) {
			array = new MAC_LMT_DT_FRM_TYP[] {
					MAC_LMT_DT_FRM_TYP.MFG_ST, MAC_LMT_DT_FRM_TYP.MFG_CMPL, MAC_LMT_DT_FRM_TYP.INSP_JUDG, MAC_LMT_DT_FRM_TYP.DPND_SHIP_FR, MAC_LMT_DT_FRM_TYP.DPND_CHLD, 
					 MAC_LMT_DT_FRM_TYP.ARR_DT, MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT, MAC_LMT_DT_FRM_TYP.VALID_DT, MAC_LMT_DT_FRM_TYP.MANUAL
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
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
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
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
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
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
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
			if(MAC_LMT_DT_FRM_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_LMT_DT_FRM_TYP me = MAC_LMT_DT_FRM_TYP.get(MAC_LMT_DT_FRM_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_LMT_DT_FRM_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_LMT_DT_FRM_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_LMT_DT_FRM_TYP.list();
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
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
			if(MAC_LMT_DT_FRM_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_LMT_DT_FRM_TYP.subList(cols, vals);
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
		for (MAC_LMT_DT_FRM_TYP me : MAC_LMT_DT_FRM_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_LMT_DT_FRM_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_LMT_DT_FRM_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_LMT_DT_FRM_TYP", col);}
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
	protected boolean isSame(MAC_LMT_DT_FRM_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 期限起算日区分：製造着手日かどうか
	 * @param value 定数値
	 * @return 定数値が製造着手日の値の場合true
	 */
	public static boolean isMFG_ST(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.MFG_ST.isSame(type);
	}

	/**
	 * 期限起算日区分：製造着手日かどうか
	 * @param type 属性値
	 * @return 属性値が製造着手日の値の場合true
	 */
	public static boolean isMFG_ST(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.MFG_ST.isSame(type);
	}

	/**
	 * 期限起算日区分：製造完了日かどうか
	 * @param value 定数値
	 * @return 定数値が製造完了日の値の場合true
	 */
	public static boolean isMFG_CMPL(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.MFG_CMPL.isSame(type);
	}

	/**
	 * 期限起算日区分：製造完了日かどうか
	 * @param type 属性値
	 * @return 属性値が製造完了日の値の場合true
	 */
	public static boolean isMFG_CMPL(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.MFG_CMPL.isSame(type);
	}

	/**
	 * 期限起算日区分：検査判定日かどうか
	 * @param value 定数値
	 * @return 定数値が検査判定日の値の場合true
	 */
	public static boolean isINSP_JUDG(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.INSP_JUDG.isSame(type);
	}

	/**
	 * 期限起算日区分：検査判定日かどうか
	 * @param type 属性値
	 * @return 属性値が検査判定日の値の場合true
	 */
	public static boolean isINSP_JUDG(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.INSP_JUDG.isSame(type);
	}

	/**
	 * 期限起算日区分：出荷元期限かどうか
	 * @param value 定数値
	 * @return 定数値が出荷元期限の値の場合true
	 */
	public static boolean isDPND_SHIP_FR(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.DPND_SHIP_FR.isSame(type);
	}

	/**
	 * 期限起算日区分：出荷元期限かどうか
	 * @param type 属性値
	 * @return 属性値が出荷元期限の値の場合true
	 */
	public static boolean isDPND_SHIP_FR(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.DPND_SHIP_FR.isSame(type);
	}

	/**
	 * 期限起算日区分：子品目期限引継ぎかどうか
	 * @param value 定数値
	 * @return 定数値が子品目期限引継ぎの値の場合true
	 */
	public static boolean isDPND_CHLD(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.DPND_CHLD.isSame(type);
	}

	/**
	 * 期限起算日区分：子品目期限引継ぎかどうか
	 * @param type 属性値
	 * @return 属性値が子品目期限引継ぎの値の場合true
	 */
	public static boolean isDPND_CHLD(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.DPND_CHLD.isSame(type);
	}

	/**
	 * 期限起算日区分：入荷実績日かどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績日の値の場合true
	 */
	public static boolean isARR_DT(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.ARR_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：入荷実績日かどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績日の値の場合true
	 */
	public static boolean isARR_DT(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.ARR_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：子品目起算日引継ぎかどうか
	 * @param value 定数値
	 * @return 定数値が子品目起算日引継ぎの値の場合true
	 */
	public static boolean isDPND_CHLD_FR_DT(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：子品目起算日引継ぎかどうか
	 * @param type 属性値
	 * @return 属性値が子品目起算日引継ぎの値の場合true
	 */
	public static boolean isDPND_CHLD_FR_DT(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.DPND_CHLD_FR_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：現有効期限かどうか
	 * @param value 定数値
	 * @return 定数値が現有効期限の値の場合true
	 */
	public static boolean isVALID_DT(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.VALID_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：現有効期限かどうか
	 * @param type 属性値
	 * @return 属性値が現有効期限の値の場合true
	 */
	public static boolean isVALID_DT(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.VALID_DT.isSame(type);
	}

	/**
	 * 期限起算日区分：手入力かどうか
	 * @param value 定数値
	 * @return 定数値が手入力の値の場合true
	 */
	public static boolean isMANUAL(String value) {
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
		return MAC_LMT_DT_FRM_TYP.MANUAL.isSame(type);
	}

	/**
	 * 期限起算日区分：手入力かどうか
	 * @param type 属性値
	 * @return 属性値が手入力の値の場合true
	 */
	public static boolean isMANUAL(MAC_LMT_DT_FRM_TYP type) {
		return MAC_LMT_DT_FRM_TYP.MANUAL.isSame(type);
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
			MAC_LMT_DT_FRM_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.get(value);
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
			MAC_LMT_DT_FRM_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
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
			MAC_LMT_DT_FRM_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.get(value);
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
			MAC_LMT_DT_FRM_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
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
			MAC_LMT_DT_FRM_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.get(value);
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
			MAC_LMT_DT_FRM_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
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
			MAC_LMT_DT_FRM_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.get(value);
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
			MAC_LMT_DT_FRM_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_LMT_DT_FRM_TYP type = MAC_LMT_DT_FRM_TYP.getNE(value);
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
