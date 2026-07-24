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
abstract class MAC_PUSH_NTC_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "PUSH_NTC_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_PUSH_NTC_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "push_ntc_typ";

	public static final String $NAME = "push_ntc_typ_nm";

	public static final String $IS_WG = "is_wg";

	public static final String $IS_DPT = "is_dpt";

	public static final String $IS_APRV_ROLE = "is_aprv_role";

	public static final String $IS_TO_APRV_MAIN = "is_to_aprv_main";

	public static final String $IS_TO_APRV_SUB = "is_to_aprv_sub";

	/*
	 * 定数の定義です。
	 */
	/** プッシュ通知区分：承認依頼（主担当者宛）
	 */
	public static final MAC_PUSH_NTC_TYP APRV_RQST_MAIN = create("APRV_RQST_MAIN", "APRV_RQST_MAIN", false, false, true, true, false);

	/** プッシュ通知区分：承認依頼（副担当者宛）
	 */
	public static final MAC_PUSH_NTC_TYP APRV_RQST_SUB = create("APRV_RQST_SUB", "APRV_RQST_SUB", false, false, true, false, true);

	/** プッシュ通知区分：承認結果
	 */
	public static final MAC_PUSH_NTC_TYP APRV_RESULT = create("APRV_RESULT", "APRV_RESULT", false, false, false, false, false);

	/** プッシュ通知区分：代理承認
	 */
	public static final MAC_PUSH_NTC_TYP APRV_DEPUTY = create("APRV_DEPUTY", "APRV_DEPUTY", false, false, false, false, false);

	/** プッシュ通知区分：ＷＧ間依頼
	 */
	public static final MAC_PUSH_NTC_TYP WG_RQST = create("WG_RQST", "WG_RQST", true, true, false, false, false);

	/** プッシュ通知区分：ＷＧ間依頼回答
	 */
	public static final MAC_PUSH_NTC_TYP WG_RQST_PRMS = create("WG_RQST_PRMS", "WG_RQST_PRMS", true, true, false, false, false);

	/** プッシュ通知区分：製造指図承認依頼
	 */
	public static final MAC_PUSH_NTC_TYP MFG_INST_APRV_RQST = create("MFG_INST_APRV_RQST", "MFG_INST_APRV_RQST", false, false, true, true, true);

	/** プッシュ通知区分：製造指図承認結果
	 */
	public static final MAC_PUSH_NTC_TYP MFG_INST_APRV_RESULT = create("MFG_INST_APRV_RESULT", "MFG_INST_APRV_RESULT", false, true, false, false, false);

	/** プッシュ通知区分：製造記録承認依頼
	 */
	public static final MAC_PUSH_NTC_TYP MFG_ACT_APRV_RQST = create("MFG_ACT_APRV_RQST", "MFG_ACT_APRV_RQST", false, false, true, true, true);

	/** プッシュ通知区分：製造記録承認結果
	 */
	public static final MAC_PUSH_NTC_TYP MFG_ACT_APRV_RESULT = create("MFG_ACT_APRV_RESULT", "MFG_ACT_APRV_RESULT", false, true, false, false, false);

	/** プッシュ通知区分：検査指図承認依頼
	 */
	public static final MAC_PUSH_NTC_TYP INSP_APRV_RQST = create("INSP_APRV_RQST", "INSP_APRV_RQST", false, false, true, true, true);

	/** プッシュ通知区分：検査指図承認結果
	 */
	public static final MAC_PUSH_NTC_TYP INSP_APRV_RESULT = create("INSP_APRV_RESULT", "INSP_APRV_RESULT", false, true, false, false, false);

	/** プッシュ通知区分：検査判定依頼
	 */
	public static final MAC_PUSH_NTC_TYP INSP_JUDG_RQST = create("INSP_JUDG_RQST", "INSP_JUDG_RQST", false, false, true, true, true);

	/** プッシュ通知区分：検査判定依頼結果
	 */
	public static final MAC_PUSH_NTC_TYP INSP_JUDG_RESULT = create("INSP_JUDG_RESULT", "INSP_JUDG_RESULT", false, true, false, false, false);

	/** プッシュ通知区分：工場出荷承認依頼
	 */
	public static final MAC_PUSH_NTC_TYP PLNT_APRV_RQST = create("PLNT_APRV_RQST", "PLNT_APRV_RQST", false, false, true, true, true);

	/** プッシュ通知区分：工場出荷承認結果
	 */
	public static final MAC_PUSH_NTC_TYP PLNT_APRV_RESULT = create("PLNT_APRV_RESULT", "PLNT_APRV_RESULT", false, true, false, false, false);

	/** プッシュ通知区分：市場出荷承認依頼
	 */
	public static final MAC_PUSH_NTC_TYP MRKT_JUDG_RQST = create("MRKT_JUDG_RQST", "MRKT_JUDG_RQST", false, false, true, true, true);

	/** プッシュ通知区分：市場出荷承認結果
	 */
	public static final MAC_PUSH_NTC_TYP MRKT_JUDG_RESULT = create("MRKT_JUDG_RESULT", "MRKT_JUDG_RESULT", false, true, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_PUSH_NTC_TYP create() {
		return new MAC_PUSH_NTC_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_PUSH_NTC_TYP get(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		if (type == null) {
			throw MAC_PUSH_NTC_TYP.invalidValue(value);
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
	public static MAC_PUSH_NTC_TYP getNE(String value) {
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_PUSH_NTC_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_WG, attr1);
		me.constR.addBooleanColumn($IS_DPT, attr2);
		me.constR.addBooleanColumn($IS_APRV_ROLE, attr3);
		me.constR.addBooleanColumn($IS_TO_APRV_MAIN, attr4);
		me.constR.addBooleanColumn($IS_TO_APRV_SUB, attr5);
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
	 * is_wgの値を返します。
	 * @return is_wgの値
	 */
	public boolean is_wg() {
		return constR.getBooleanNE($IS_WG);
	}

	/** 
	 * valueに対応する定数のis_wgの値を返します。
	 * @param value 定数値
	 * @return is_wgの値
	 */
	public static boolean is_wg(String value) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_wg();
	}

	/** 
	 * is_dptの値を返します。
	 * @return is_dptの値
	 */
	public boolean is_dpt() {
		return constR.getBooleanNE($IS_DPT);
	}

	/** 
	 * valueに対応する定数のis_dptの値を返します。
	 * @param value 定数値
	 * @return is_dptの値
	 */
	public static boolean is_dpt(String value) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_dpt();
	}

	/** 
	 * is_aprv_roleの値を返します。
	 * @return is_aprv_roleの値
	 */
	public boolean is_aprv_role() {
		return constR.getBooleanNE($IS_APRV_ROLE);
	}

	/** 
	 * valueに対応する定数のis_aprv_roleの値を返します。
	 * @param value 定数値
	 * @return is_aprv_roleの値
	 */
	public static boolean is_aprv_role(String value) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_aprv_role();
	}

	/** 
	 * is_to_aprv_mainの値を返します。
	 * @return is_to_aprv_mainの値
	 */
	public boolean is_to_aprv_main() {
		return constR.getBooleanNE($IS_TO_APRV_MAIN);
	}

	/** 
	 * valueに対応する定数のis_to_aprv_mainの値を返します。
	 * @param value 定数値
	 * @return is_to_aprv_mainの値
	 */
	public static boolean is_to_aprv_main(String value) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_to_aprv_main();
	}

	/** 
	 * is_to_aprv_subの値を返します。
	 * @return is_to_aprv_subの値
	 */
	public boolean is_to_aprv_sub() {
		return constR.getBooleanNE($IS_TO_APRV_SUB);
	}

	/** 
	 * valueに対応する定数のis_to_aprv_subの値を返します。
	 * @param value 定数値
	 * @return is_to_aprv_subの値
	 */
	public static boolean is_to_aprv_sub(String value) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_to_aprv_sub();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
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
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
		if (me == null) {
			throw MAC_PUSH_NTC_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_wg(), is_dpt(), is_aprv_role(), is_to_aprv_main(), is_to_aprv_sub());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_PUSH_NTC_TYP[] array() {
		if (array == null) {
			array = new MAC_PUSH_NTC_TYP[] {
					MAC_PUSH_NTC_TYP.APRV_RQST_MAIN, MAC_PUSH_NTC_TYP.APRV_RQST_SUB, MAC_PUSH_NTC_TYP.APRV_RESULT, MAC_PUSH_NTC_TYP.APRV_DEPUTY, MAC_PUSH_NTC_TYP.WG_RQST, 
					 MAC_PUSH_NTC_TYP.WG_RQST_PRMS, MAC_PUSH_NTC_TYP.MFG_INST_APRV_RQST, MAC_PUSH_NTC_TYP.MFG_INST_APRV_RESULT, MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RQST, MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RESULT, MAC_PUSH_NTC_TYP.INSP_APRV_RQST, 
					 MAC_PUSH_NTC_TYP.INSP_APRV_RESULT, MAC_PUSH_NTC_TYP.INSP_JUDG_RQST, MAC_PUSH_NTC_TYP.INSP_JUDG_RESULT, MAC_PUSH_NTC_TYP.PLNT_APRV_RQST, MAC_PUSH_NTC_TYP.PLNT_APRV_RESULT, MAC_PUSH_NTC_TYP.MRKT_JUDG_RQST, 
					 MAC_PUSH_NTC_TYP.MRKT_JUDG_RESULT
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
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
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
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
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
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
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
			if(MAC_PUSH_NTC_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_PUSH_NTC_TYP me = MAC_PUSH_NTC_TYP.get(MAC_PUSH_NTC_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_PUSH_NTC_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_PUSH_NTC_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_PUSH_NTC_TYP.list();
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
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
			if(MAC_PUSH_NTC_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_PUSH_NTC_TYP.subList(cols, vals);
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
		for (MAC_PUSH_NTC_TYP me : MAC_PUSH_NTC_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_PUSH_NTC_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_PUSH_NTC_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_PUSH_NTC_TYP", col);}
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
	protected boolean isSame(MAC_PUSH_NTC_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * プッシュ通知区分：承認依頼（主担当者宛）かどうか
	 * @param value 定数値
	 * @return 定数値が承認依頼（主担当者宛）の値の場合true
	 */
	public static boolean isAPRV_RQST_MAIN(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.APRV_RQST_MAIN.isSame(type);
	}

	/**
	 * プッシュ通知区分：承認依頼（主担当者宛）かどうか
	 * @param type 属性値
	 * @return 属性値が承認依頼（主担当者宛）の値の場合true
	 */
	public static boolean isAPRV_RQST_MAIN(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.APRV_RQST_MAIN.isSame(type);
	}

	/**
	 * プッシュ通知区分：承認依頼（副担当者宛）かどうか
	 * @param value 定数値
	 * @return 定数値が承認依頼（副担当者宛）の値の場合true
	 */
	public static boolean isAPRV_RQST_SUB(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.APRV_RQST_SUB.isSame(type);
	}

	/**
	 * プッシュ通知区分：承認依頼（副担当者宛）かどうか
	 * @param type 属性値
	 * @return 属性値が承認依頼（副担当者宛）の値の場合true
	 */
	public static boolean isAPRV_RQST_SUB(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.APRV_RQST_SUB.isSame(type);
	}

	/**
	 * プッシュ通知区分：承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が承認結果の値の場合true
	 */
	public static boolean isAPRV_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が承認結果の値の場合true
	 */
	public static boolean isAPRV_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：代理承認かどうか
	 * @param value 定数値
	 * @return 定数値が代理承認の値の場合true
	 */
	public static boolean isAPRV_DEPUTY(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.APRV_DEPUTY.isSame(type);
	}

	/**
	 * プッシュ通知区分：代理承認かどうか
	 * @param type 属性値
	 * @return 属性値が代理承認の値の場合true
	 */
	public static boolean isAPRV_DEPUTY(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.APRV_DEPUTY.isSame(type);
	}

	/**
	 * プッシュ通知区分：ＷＧ間依頼かどうか
	 * @param value 定数値
	 * @return 定数値がＷＧ間依頼の値の場合true
	 */
	public static boolean isWG_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.WG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：ＷＧ間依頼かどうか
	 * @param type 属性値
	 * @return 属性値がＷＧ間依頼の値の場合true
	 */
	public static boolean isWG_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.WG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：ＷＧ間依頼回答かどうか
	 * @param value 定数値
	 * @return 定数値がＷＧ間依頼回答の値の場合true
	 */
	public static boolean isWG_RQST_PRMS(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.WG_RQST_PRMS.isSame(type);
	}

	/**
	 * プッシュ通知区分：ＷＧ間依頼回答かどうか
	 * @param type 属性値
	 * @return 属性値がＷＧ間依頼回答の値の場合true
	 */
	public static boolean isWG_RQST_PRMS(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.WG_RQST_PRMS.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造指図承認依頼かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図承認依頼の値の場合true
	 */
	public static boolean isMFG_INST_APRV_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MFG_INST_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造指図承認依頼かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図承認依頼の値の場合true
	 */
	public static boolean isMFG_INST_APRV_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MFG_INST_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造指図承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が製造指図承認結果の値の場合true
	 */
	public static boolean isMFG_INST_APRV_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MFG_INST_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造指図承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が製造指図承認結果の値の場合true
	 */
	public static boolean isMFG_INST_APRV_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MFG_INST_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造記録承認依頼かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録承認依頼の値の場合true
	 */
	public static boolean isMFG_ACT_APRV_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造記録承認依頼かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録承認依頼の値の場合true
	 */
	public static boolean isMFG_ACT_APRV_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造記録承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が製造記録承認結果の値の場合true
	 */
	public static boolean isMFG_ACT_APRV_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：製造記録承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が製造記録承認結果の値の場合true
	 */
	public static boolean isMFG_ACT_APRV_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MFG_ACT_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査指図承認依頼かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図承認依頼の値の場合true
	 */
	public static boolean isINSP_APRV_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.INSP_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査指図承認依頼かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図承認依頼の値の場合true
	 */
	public static boolean isINSP_APRV_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.INSP_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査指図承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図承認結果の値の場合true
	 */
	public static boolean isINSP_APRV_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.INSP_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査指図承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図承認結果の値の場合true
	 */
	public static boolean isINSP_APRV_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.INSP_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査判定依頼かどうか
	 * @param value 定数値
	 * @return 定数値が検査判定依頼の値の場合true
	 */
	public static boolean isINSP_JUDG_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.INSP_JUDG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査判定依頼かどうか
	 * @param type 属性値
	 * @return 属性値が検査判定依頼の値の場合true
	 */
	public static boolean isINSP_JUDG_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.INSP_JUDG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査判定依頼結果かどうか
	 * @param value 定数値
	 * @return 定数値が検査判定依頼結果の値の場合true
	 */
	public static boolean isINSP_JUDG_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.INSP_JUDG_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：検査判定依頼結果かどうか
	 * @param type 属性値
	 * @return 属性値が検査判定依頼結果の値の場合true
	 */
	public static boolean isINSP_JUDG_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.INSP_JUDG_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：工場出荷承認依頼かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷承認依頼の値の場合true
	 */
	public static boolean isPLNT_APRV_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.PLNT_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：工場出荷承認依頼かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷承認依頼の値の場合true
	 */
	public static boolean isPLNT_APRV_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.PLNT_APRV_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：工場出荷承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が工場出荷承認結果の値の場合true
	 */
	public static boolean isPLNT_APRV_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.PLNT_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：工場出荷承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が工場出荷承認結果の値の場合true
	 */
	public static boolean isPLNT_APRV_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.PLNT_APRV_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：市場出荷承認依頼かどうか
	 * @param value 定数値
	 * @return 定数値が市場出荷承認依頼の値の場合true
	 */
	public static boolean isMRKT_JUDG_RQST(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MRKT_JUDG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：市場出荷承認依頼かどうか
	 * @param type 属性値
	 * @return 属性値が市場出荷承認依頼の値の場合true
	 */
	public static boolean isMRKT_JUDG_RQST(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MRKT_JUDG_RQST.isSame(type);
	}

	/**
	 * プッシュ通知区分：市場出荷承認結果かどうか
	 * @param value 定数値
	 * @return 定数値が市場出荷承認結果の値の場合true
	 */
	public static boolean isMRKT_JUDG_RESULT(String value) {
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
		return MAC_PUSH_NTC_TYP.MRKT_JUDG_RESULT.isSame(type);
	}

	/**
	 * プッシュ通知区分：市場出荷承認結果かどうか
	 * @param type 属性値
	 * @return 属性値が市場出荷承認結果の値の場合true
	 */
	public static boolean isMRKT_JUDG_RESULT(MAC_PUSH_NTC_TYP type) {
		return MAC_PUSH_NTC_TYP.MRKT_JUDG_RESULT.isSame(type);
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
			MAC_PUSH_NTC_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.get(value);
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
			MAC_PUSH_NTC_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
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
			MAC_PUSH_NTC_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.get(value);
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
			MAC_PUSH_NTC_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
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
			MAC_PUSH_NTC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.get(value);
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
			MAC_PUSH_NTC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
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
			MAC_PUSH_NTC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.get(value);
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
			MAC_PUSH_NTC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_PUSH_NTC_TYP type = MAC_PUSH_NTC_TYP.getNE(value);
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
