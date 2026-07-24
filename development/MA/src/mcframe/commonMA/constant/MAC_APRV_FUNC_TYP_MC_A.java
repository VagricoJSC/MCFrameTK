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
abstract class MAC_APRV_FUNC_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "APRV_FUNC_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_APRV_FUNC_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "aprv_func_typ";

	public static final String $NAME = "aprv_func_typ_nm";

	public static final String $REF_SCREEN_ID = "ref_screen_id";

	public static final String $AFT_LOGIC_ID = "aft_logic_id";

	public static final String $AFT_OPERATION_ID = "aft_operation_id";

	public static final String $IS_USING_ITM = "is_using_itm";

	public static final String $IS_USING_DPT = "is_using_dpt";

	public static final String $IS_USING_BP = "is_using_bp";

	public static final String $IS_USING_AMT1 = "is_using_amt1";

	public static final String $IS_USING_AMT2 = "is_using_amt2";

	public static final String $IS_USING_AMT3 = "is_using_amt3";

	public static final String $IS_USING_EXT1 = "is_using_ext1";

	public static final String $IS_USING_EXT2 = "is_using_ext2";

	public static final String $IS_USING_EXT3 = "is_using_ext3";

	public static final String $IS_UPRI_MASTER_TYP = "is_upri_master_typ";

	/*
	 * 定数の定義です。
	 */
	/** 承認機能区分：受注見積
	 */
	public static final MAC_APRV_FUNC_TYP QTN_SLO = create("11", "QTN_SLO", "MSBBP1110", "MSBBL6250", "SlsAprvAfter_Upd01", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：受注
	 */
	public static final MAC_APRV_FUNC_TYP SLO = create("12", "SLO", "MSBBP1210", "MSBBL6250", "SlsAprvAfter_Upd02", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：売上値引
	 */
	public static final MAC_APRV_FUNC_TYP SLS_DSCNT = create("13", "SLS_DSCNT", "MSBBP1380", "MSBBL6250", "SlsAprvAfter_Upd03", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：売上値増
	 */
	public static final MAC_APRV_FUNC_TYP SLS_XTRA = create("14", "SLS_XTRA", "MSBBP1380", "MSBBL6250", "SlsAprvAfter_Upd03", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：発注
	 */
	public static final MAC_APRV_FUNC_TYP PO = create("21", "PO", "MSBDP0080", "MSBDL5060", "PurcAppAf_Upd01", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：経費発注
	 */
	public static final MAC_APRV_FUNC_TYP XPNS_PO = create("22", "XPNS_PO", "MSBDP0080", "MSBDL5060", "PurcAppAf_Upd01", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：廃棄予定
	 */
	public static final MAC_APRV_FUNC_TYP SCRP = create("41", "SCRP", "MSBEP2400", "MSBEL6430", "AppAf_Upd01", false, true, false, true, false, false, false, false, false, false);

	/** 承認機能区分：他勘定出庫予定
	 */
	public static final MAC_APRV_FUNC_TYP STK_OTH_GI = create("42", "STK_OTH_GI", "MSBEP2400", "MSBEL6430", "AppAf_Upd01", false, true, false, true, false, false, false, false, false, false);

	/** 承認機能区分：他勘定入庫予定
	 */
	public static final MAC_APRV_FUNC_TYP STK_OTH_GR = create("43", "STK_OTH_GR", "MSBEP2400", "MSBEL6430", "AppAf_Upd01", false, true, false, true, false, false, false, false, false, false);

	/** 承認機能区分：支払予定
	 */
	public static final MAC_APRV_FUNC_TYP PAY_SCHD = create("51", "PAY_SCHD", "MSBHP0030", "MSBHL5100", "ApAprvAf_Upd01", false, true, true, true, false, false, false, false, false, false);

	/** 承認機能区分：マスタ（標準販売単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_STD_SLS_UPRI = create("A1", "MST_STD_SLS_UPRI", "MABSP0250", "MABSL0250", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/** 承認機能区分：マスタ（品目販売単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_ITM_SLS_UPRI = create("A2", "MST_ITM_SLS_UPRI", "MABSP0240", "MABSL0240", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/** 承認機能区分：マスタ（得意先販売単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_CST_SLS_UPRI = create("A3", "MST_CST_SLS_UPRI", "MABSP0220", "MABSL0220", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/** 承認機能区分：マスタ（購買単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_PURC_UPRI = create("B1", "MST_PURC_UPRI", "MABSP0120", "MABSL0120", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/** 承認機能区分：マスタ（加工単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_PROC_UPRI = create("B2", "MST_PROC_UPRI", "MABSP0140", "MABSL0140", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/** 承認機能区分：マスタ（支給単価）
	 */
	public static final MAC_APRV_FUNC_TYP MST_PROV_UPRI = create("B3", "MST_PROV_UPRI", "MABSP0130", "MABSL0130", "AprvAfter_Upd01", false, true, false, false, false, false, false, false, false, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_APRV_FUNC_TYP create() {
		return new MAC_APRV_FUNC_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_APRV_FUNC_TYP get(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		if (type == null) {
			throw MAC_APRV_FUNC_TYP.invalidValue(value);
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
	public static MAC_APRV_FUNC_TYP getNE(String value) {
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_APRV_FUNC_TYP create(String value, String xmlKey, String attr1, String attr2, String attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9, boolean attr10, boolean attr11, boolean attr12, boolean attr13) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($REF_SCREEN_ID, attr1);
		me.constR.addStringColumn($AFT_LOGIC_ID, attr2);
		me.constR.addStringColumn($AFT_OPERATION_ID, attr3);
		me.constR.addBooleanColumn($IS_USING_ITM, attr4);
		me.constR.addBooleanColumn($IS_USING_DPT, attr5);
		me.constR.addBooleanColumn($IS_USING_BP, attr6);
		me.constR.addBooleanColumn($IS_USING_AMT1, attr7);
		me.constR.addBooleanColumn($IS_USING_AMT2, attr8);
		me.constR.addBooleanColumn($IS_USING_AMT3, attr9);
		me.constR.addBooleanColumn($IS_USING_EXT1, attr10);
		me.constR.addBooleanColumn($IS_USING_EXT2, attr11);
		me.constR.addBooleanColumn($IS_USING_EXT3, attr12);
		me.constR.addBooleanColumn($IS_UPRI_MASTER_TYP, attr13);
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
	 * ref_screen_idの値を返します。
	 * @return ref_screen_idの値
	 */
	public String ref_screen_id() {
		return constR.getStringNE($REF_SCREEN_ID);
	}

	/** 
	 * valueに対応する定数のref_screen_idの値を返します。
	 * @param value 定数値
	 * @return ref_screen_idの値
	 */
	public static String ref_screen_id(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ref_screen_id();
	}

	/** 
	 * aft_logic_idの値を返します。
	 * @return aft_logic_idの値
	 */
	public String aft_logic_id() {
		return constR.getStringNE($AFT_LOGIC_ID);
	}

	/** 
	 * valueに対応する定数のaft_logic_idの値を返します。
	 * @param value 定数値
	 * @return aft_logic_idの値
	 */
	public static String aft_logic_id(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.aft_logic_id();
	}

	/** 
	 * aft_operation_idの値を返します。
	 * @return aft_operation_idの値
	 */
	public String aft_operation_id() {
		return constR.getStringNE($AFT_OPERATION_ID);
	}

	/** 
	 * valueに対応する定数のaft_operation_idの値を返します。
	 * @param value 定数値
	 * @return aft_operation_idの値
	 */
	public static String aft_operation_id(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.aft_operation_id();
	}

	/** 
	 * is_using_itmの値を返します。
	 * @return is_using_itmの値
	 */
	public boolean is_using_itm() {
		return constR.getBooleanNE($IS_USING_ITM);
	}

	/** 
	 * valueに対応する定数のis_using_itmの値を返します。
	 * @param value 定数値
	 * @return is_using_itmの値
	 */
	public static boolean is_using_itm(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_itm();
	}

	/** 
	 * is_using_dptの値を返します。
	 * @return is_using_dptの値
	 */
	public boolean is_using_dpt() {
		return constR.getBooleanNE($IS_USING_DPT);
	}

	/** 
	 * valueに対応する定数のis_using_dptの値を返します。
	 * @param value 定数値
	 * @return is_using_dptの値
	 */
	public static boolean is_using_dpt(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_dpt();
	}

	/** 
	 * is_using_bpの値を返します。
	 * @return is_using_bpの値
	 */
	public boolean is_using_bp() {
		return constR.getBooleanNE($IS_USING_BP);
	}

	/** 
	 * valueに対応する定数のis_using_bpの値を返します。
	 * @param value 定数値
	 * @return is_using_bpの値
	 */
	public static boolean is_using_bp(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_bp();
	}

	/** 
	 * is_using_amt1の値を返します。
	 * @return is_using_amt1の値
	 */
	public boolean is_using_amt1() {
		return constR.getBooleanNE($IS_USING_AMT1);
	}

	/** 
	 * valueに対応する定数のis_using_amt1の値を返します。
	 * @param value 定数値
	 * @return is_using_amt1の値
	 */
	public static boolean is_using_amt1(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_amt1();
	}

	/** 
	 * is_using_amt2の値を返します。
	 * @return is_using_amt2の値
	 */
	public boolean is_using_amt2() {
		return constR.getBooleanNE($IS_USING_AMT2);
	}

	/** 
	 * valueに対応する定数のis_using_amt2の値を返します。
	 * @param value 定数値
	 * @return is_using_amt2の値
	 */
	public static boolean is_using_amt2(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_amt2();
	}

	/** 
	 * is_using_amt3の値を返します。
	 * @return is_using_amt3の値
	 */
	public boolean is_using_amt3() {
		return constR.getBooleanNE($IS_USING_AMT3);
	}

	/** 
	 * valueに対応する定数のis_using_amt3の値を返します。
	 * @param value 定数値
	 * @return is_using_amt3の値
	 */
	public static boolean is_using_amt3(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_amt3();
	}

	/** 
	 * is_using_ext1の値を返します。
	 * @return is_using_ext1の値
	 */
	public boolean is_using_ext1() {
		return constR.getBooleanNE($IS_USING_EXT1);
	}

	/** 
	 * valueに対応する定数のis_using_ext1の値を返します。
	 * @param value 定数値
	 * @return is_using_ext1の値
	 */
	public static boolean is_using_ext1(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_ext1();
	}

	/** 
	 * is_using_ext2の値を返します。
	 * @return is_using_ext2の値
	 */
	public boolean is_using_ext2() {
		return constR.getBooleanNE($IS_USING_EXT2);
	}

	/** 
	 * valueに対応する定数のis_using_ext2の値を返します。
	 * @param value 定数値
	 * @return is_using_ext2の値
	 */
	public static boolean is_using_ext2(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_ext2();
	}

	/** 
	 * is_using_ext3の値を返します。
	 * @return is_using_ext3の値
	 */
	public boolean is_using_ext3() {
		return constR.getBooleanNE($IS_USING_EXT3);
	}

	/** 
	 * valueに対応する定数のis_using_ext3の値を返します。
	 * @param value 定数値
	 * @return is_using_ext3の値
	 */
	public static boolean is_using_ext3(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_using_ext3();
	}

	/** 
	 * is_upri_master_typの値を返します。
	 * @return is_upri_master_typの値
	 */
	public boolean is_upri_master_typ() {
		return constR.getBooleanNE($IS_UPRI_MASTER_TYP);
	}

	/** 
	 * valueに対応する定数のis_upri_master_typの値を返します。
	 * @param value 定数値
	 * @return is_upri_master_typの値
	 */
	public static boolean is_upri_master_typ(String value) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_upri_master_typ();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
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
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
		if (me == null) {
			throw MAC_APRV_FUNC_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.getNE(value);
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
		return createStringPath(value(), name(), ref_screen_id(), aft_logic_id(), aft_operation_id(), is_using_itm(), is_using_dpt(), is_using_bp(), is_using_amt1(), is_using_amt2(), is_using_amt3(), is_using_ext1(), is_using_ext2(), is_using_ext3(), is_upri_master_typ());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_APRV_FUNC_TYP[] array() {
		if (array == null) {
			array = new MAC_APRV_FUNC_TYP[] {
					MAC_APRV_FUNC_TYP.QTN_SLO, MAC_APRV_FUNC_TYP.SLO, MAC_APRV_FUNC_TYP.SLS_DSCNT, MAC_APRV_FUNC_TYP.SLS_XTRA, MAC_APRV_FUNC_TYP.PO, 
					 MAC_APRV_FUNC_TYP.XPNS_PO, MAC_APRV_FUNC_TYP.SCRP, MAC_APRV_FUNC_TYP.STK_OTH_GI, MAC_APRV_FUNC_TYP.STK_OTH_GR, MAC_APRV_FUNC_TYP.PAY_SCHD, MAC_APRV_FUNC_TYP.MST_STD_SLS_UPRI, 
					 MAC_APRV_FUNC_TYP.MST_ITM_SLS_UPRI, MAC_APRV_FUNC_TYP.MST_CST_SLS_UPRI, MAC_APRV_FUNC_TYP.MST_PURC_UPRI, MAC_APRV_FUNC_TYP.MST_PROC_UPRI, MAC_APRV_FUNC_TYP.MST_PROV_UPRI
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
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
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
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
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
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
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
			if(MAC_APRV_FUNC_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_APRV_FUNC_TYP me = MAC_APRV_FUNC_TYP.get(MAC_APRV_FUNC_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_APRV_FUNC_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_APRV_FUNC_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_APRV_FUNC_TYP.list();
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
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
			if(MAC_APRV_FUNC_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_APRV_FUNC_TYP.subList(cols, vals);
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
		for (MAC_APRV_FUNC_TYP me : MAC_APRV_FUNC_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_APRV_FUNC_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_APRV_FUNC_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_APRV_FUNC_TYP", col);}
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
	protected boolean isSame(MAC_APRV_FUNC_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 承認機能区分：受注見積かどうか
	 * @param value 定数値
	 * @return 定数値が受注見積の値の場合true
	 */
	public static boolean isQTN_SLO(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.QTN_SLO.isSame(type);
	}

	/**
	 * 承認機能区分：受注見積かどうか
	 * @param type 属性値
	 * @return 属性値が受注見積の値の場合true
	 */
	public static boolean isQTN_SLO(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.QTN_SLO.isSame(type);
	}

	/**
	 * 承認機能区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isSLO(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.SLO.isSame(type);
	}

	/**
	 * 承認機能区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isSLO(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.SLO.isSame(type);
	}

	/**
	 * 承認機能区分：売上値引かどうか
	 * @param value 定数値
	 * @return 定数値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 承認機能区分：売上値引かどうか
	 * @param type 属性値
	 * @return 属性値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 承認機能区分：売上値増かどうか
	 * @param value 定数値
	 * @return 定数値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 承認機能区分：売上値増かどうか
	 * @param type 属性値
	 * @return 属性値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 承認機能区分：発注かどうか
	 * @param value 定数値
	 * @return 定数値が発注の値の場合true
	 */
	public static boolean isPO(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.PO.isSame(type);
	}

	/**
	 * 承認機能区分：発注かどうか
	 * @param type 属性値
	 * @return 属性値が発注の値の場合true
	 */
	public static boolean isPO(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.PO.isSame(type);
	}

	/**
	 * 承認機能区分：経費発注かどうか
	 * @param value 定数値
	 * @return 定数値が経費発注の値の場合true
	 */
	public static boolean isXPNS_PO(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.XPNS_PO.isSame(type);
	}

	/**
	 * 承認機能区分：経費発注かどうか
	 * @param type 属性値
	 * @return 属性値が経費発注の値の場合true
	 */
	public static boolean isXPNS_PO(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.XPNS_PO.isSame(type);
	}

	/**
	 * 承認機能区分：廃棄予定かどうか
	 * @param value 定数値
	 * @return 定数値が廃棄予定の値の場合true
	 */
	public static boolean isSCRP(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.SCRP.isSame(type);
	}

	/**
	 * 承認機能区分：廃棄予定かどうか
	 * @param type 属性値
	 * @return 属性値が廃棄予定の値の場合true
	 */
	public static boolean isSCRP(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.SCRP.isSame(type);
	}

	/**
	 * 承認機能区分：他勘定出庫予定かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定出庫予定の値の場合true
	 */
	public static boolean isSTK_OTH_GI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.STK_OTH_GI.isSame(type);
	}

	/**
	 * 承認機能区分：他勘定出庫予定かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定出庫予定の値の場合true
	 */
	public static boolean isSTK_OTH_GI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.STK_OTH_GI.isSame(type);
	}

	/**
	 * 承認機能区分：他勘定入庫予定かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定入庫予定の値の場合true
	 */
	public static boolean isSTK_OTH_GR(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.STK_OTH_GR.isSame(type);
	}

	/**
	 * 承認機能区分：他勘定入庫予定かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定入庫予定の値の場合true
	 */
	public static boolean isSTK_OTH_GR(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.STK_OTH_GR.isSame(type);
	}

	/**
	 * 承認機能区分：支払予定かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定の値の場合true
	 */
	public static boolean isPAY_SCHD(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.PAY_SCHD.isSame(type);
	}

	/**
	 * 承認機能区分：支払予定かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定の値の場合true
	 */
	public static boolean isPAY_SCHD(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.PAY_SCHD.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（標準販売単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（標準販売単価）の値の場合true
	 */
	public static boolean isMST_STD_SLS_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_STD_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（標準販売単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（標準販売単価）の値の場合true
	 */
	public static boolean isMST_STD_SLS_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_STD_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（品目販売単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（品目販売単価）の値の場合true
	 */
	public static boolean isMST_ITM_SLS_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_ITM_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（品目販売単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（品目販売単価）の値の場合true
	 */
	public static boolean isMST_ITM_SLS_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_ITM_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（得意先販売単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（得意先販売単価）の値の場合true
	 */
	public static boolean isMST_CST_SLS_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_CST_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（得意先販売単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（得意先販売単価）の値の場合true
	 */
	public static boolean isMST_CST_SLS_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_CST_SLS_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（購買単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（購買単価）の値の場合true
	 */
	public static boolean isMST_PURC_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_PURC_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（購買単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（購買単価）の値の場合true
	 */
	public static boolean isMST_PURC_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_PURC_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（加工単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（加工単価）の値の場合true
	 */
	public static boolean isMST_PROC_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_PROC_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（加工単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（加工単価）の値の場合true
	 */
	public static boolean isMST_PROC_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_PROC_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（支給単価）かどうか
	 * @param value 定数値
	 * @return 定数値がマスタ（支給単価）の値の場合true
	 */
	public static boolean isMST_PROV_UPRI(String value) {
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
		return MAC_APRV_FUNC_TYP.MST_PROV_UPRI.isSame(type);
	}

	/**
	 * 承認機能区分：マスタ（支給単価）かどうか
	 * @param type 属性値
	 * @return 属性値がマスタ（支給単価）の値の場合true
	 */
	public static boolean isMST_PROV_UPRI(MAC_APRV_FUNC_TYP type) {
		return MAC_APRV_FUNC_TYP.MST_PROV_UPRI.isSame(type);
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
			MAC_APRV_FUNC_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.get(value);
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
			MAC_APRV_FUNC_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
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
			MAC_APRV_FUNC_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.get(value);
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
			MAC_APRV_FUNC_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
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
			MAC_APRV_FUNC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.get(value);
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
			MAC_APRV_FUNC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
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
			MAC_APRV_FUNC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.get(value);
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
			MAC_APRV_FUNC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_APRV_FUNC_TYP type = MAC_APRV_FUNC_TYP.getNE(value);
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
