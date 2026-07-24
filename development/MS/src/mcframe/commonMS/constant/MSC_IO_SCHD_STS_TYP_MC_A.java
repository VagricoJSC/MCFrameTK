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
abstract class MSC_IO_SCHD_STS_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "IO_SCHD_STS_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_IO_SCHD_STS_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "io_schd_sts_typ";

	public static final String $NAME = "io_schd_sts_typ_nm";

	public static final String $IS_OPN_GRP = "is_opn_grp";

	public static final String $IS_ORDSAV_GRP = "is_ordsav_grp";

	public static final String $IS_FIX_GRP = "is_fix_grp";

	public static final String $IS_SCHD_GRP = "is_schd_grp";

	public static final String $IS_ORD_GRP = "is_ord_grp";

	public static final String $IS_ALLOC_TGT = "is_alloc_tgt";

	public static final String $IS_UPD_LOT_TRACE = "is_upd_lot_trace";

	public static final String $IS_MRKT_JUDG = "is_mrkt_judg";

	public static final String $IS_ALLOC_STOP_LOT = "is_alloc_stop_lot";

	/*
	 * 定数の定義です。
	 */
	/** 受払予定状況区分：未確定
	 */
	public static final MSC_IO_SCHD_STS_TYP OPN = create("01", "OPN", true, false, false, false, false, false, false, false, false);

	/** 受払予定状況区分：オーダ保存
	 */
	public static final MSC_IO_SCHD_STS_TYP ORD_SAV = create("02", "ORD_SAV", false, true, false, false, false, false, false, false, false);

	/** 受払予定状況区分：依頼
	 */
	public static final MSC_IO_SCHD_STS_TYP FIX = create("03", "FIX", false, false, true, false, false, true, false, false, false);

	/** 受払予定状況区分：予定
	 */
	public static final MSC_IO_SCHD_STS_TYP SCHD = create("04", "SCHD", false, false, false, true, false, true, false, false, true);

	/** 受払予定状況区分：製造保存
	 */
	public static final MSC_IO_SCHD_STS_TYP MFG_SAV = create("05", "MFG_SAV", false, false, false, false, true, true, true, false, false);

	/** 受払予定状況区分：受注
	 */
	public static final MSC_IO_SCHD_STS_TYP SLO = create("06", "SLO", false, false, false, false, true, true, false, true, true);

	/** 受払予定状況区分：直送受注
	 */
	public static final MSC_IO_SCHD_STS_TYP DDLV_SLO = create("07", "DDLV_SLO", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：発注
	 */
	public static final MSC_IO_SCHD_STS_TYP PO = create("08", "PO", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：納期回答
	 */
	public static final MSC_IO_SCHD_STS_TYP PRMS = create("09", "PRMS", false, false, false, false, true, true, false, true, true);

	/** 受払予定状況区分：納入指示
	 */
	public static final MSC_IO_SCHD_STS_TYP DLV_INST = create("10", "DLV_INST", false, false, false, false, true, true, false, false, true);

	/** 受払予定状況区分：指図済
	 */
	public static final MSC_IO_SCHD_STS_TYP ORD = create("11", "ORD", false, false, false, false, true, true, true, true, true);

	/** 受払予定状況区分：着手中
	 */
	public static final MSC_IO_SCHD_STS_TYP STT = create("12", "STT", false, false, false, false, true, true, true, false, false);

	/** 受払予定状況区分：検査待
	 */
	public static final MSC_IO_SCHD_STS_TYP YET = create("13", "YET", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：検査中
	 */
	public static final MSC_IO_SCHD_STS_TYP ING = create("14", "ING", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：判定待
	 */
	public static final MSC_IO_SCHD_STS_TYP WAIT_JUDG = create("15", "WAIT_JUDG", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：出荷済
	 */
	public static final MSC_IO_SCHD_STS_TYP SHIP = create("16", "SHIP", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：輸出済
	 */
	public static final MSC_IO_SCHD_STS_TYP EX = create("17", "EX", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：入荷済
	 */
	public static final MSC_IO_SCHD_STS_TYP ARR = create("18", "ARR", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：仕入済
	 */
	public static final MSC_IO_SCHD_STS_TYP PURC = create("19", "PURC", false, false, false, false, true, true, false, false, false);

	/** 受払予定状況区分：検査済
	 */
	public static final MSC_IO_SCHD_STS_TYP INSP = create("20", "INSP", false, false, false, false, true, true, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IO_SCHD_STS_TYP create() {
		return new MSC_IO_SCHD_STS_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_IO_SCHD_STS_TYP get(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		if (type == null) {
			throw MSC_IO_SCHD_STS_TYP.invalidValue(value);
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
	public static MSC_IO_SCHD_STS_TYP getNE(String value) {
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IO_SCHD_STS_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_OPN_GRP, attr1);
		me.constR.addBooleanColumn($IS_ORDSAV_GRP, attr2);
		me.constR.addBooleanColumn($IS_FIX_GRP, attr3);
		me.constR.addBooleanColumn($IS_SCHD_GRP, attr4);
		me.constR.addBooleanColumn($IS_ORD_GRP, attr5);
		me.constR.addBooleanColumn($IS_ALLOC_TGT, attr6);
		me.constR.addBooleanColumn($IS_UPD_LOT_TRACE, attr7);
		me.constR.addBooleanColumn($IS_MRKT_JUDG, attr8);
		me.constR.addBooleanColumn($IS_ALLOC_STOP_LOT, attr9);
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
	 * is_opn_grpの値を返します。
	 * @return is_opn_grpの値
	 */
	public boolean is_opn_grp() {
		return constR.getBooleanNE($IS_OPN_GRP);
	}

	/** 
	 * valueに対応する定数のis_opn_grpの値を返します。
	 * @param value 定数値
	 * @return is_opn_grpの値
	 */
	public static boolean is_opn_grp(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_opn_grp();
	}

	/** 
	 * is_ordsav_grpの値を返します。
	 * @return is_ordsav_grpの値
	 */
	public boolean is_ordsav_grp() {
		return constR.getBooleanNE($IS_ORDSAV_GRP);
	}

	/** 
	 * valueに対応する定数のis_ordsav_grpの値を返します。
	 * @param value 定数値
	 * @return is_ordsav_grpの値
	 */
	public static boolean is_ordsav_grp(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ordsav_grp();
	}

	/** 
	 * is_fix_grpの値を返します。
	 * @return is_fix_grpの値
	 */
	public boolean is_fix_grp() {
		return constR.getBooleanNE($IS_FIX_GRP);
	}

	/** 
	 * valueに対応する定数のis_fix_grpの値を返します。
	 * @param value 定数値
	 * @return is_fix_grpの値
	 */
	public static boolean is_fix_grp(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_fix_grp();
	}

	/** 
	 * is_schd_grpの値を返します。
	 * @return is_schd_grpの値
	 */
	public boolean is_schd_grp() {
		return constR.getBooleanNE($IS_SCHD_GRP);
	}

	/** 
	 * valueに対応する定数のis_schd_grpの値を返します。
	 * @param value 定数値
	 * @return is_schd_grpの値
	 */
	public static boolean is_schd_grp(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_schd_grp();
	}

	/** 
	 * is_ord_grpの値を返します。
	 * @return is_ord_grpの値
	 */
	public boolean is_ord_grp() {
		return constR.getBooleanNE($IS_ORD_GRP);
	}

	/** 
	 * valueに対応する定数のis_ord_grpの値を返します。
	 * @param value 定数値
	 * @return is_ord_grpの値
	 */
	public static boolean is_ord_grp(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ord_grp();
	}

	/** 
	 * is_alloc_tgtの値を返します。
	 * @return is_alloc_tgtの値
	 */
	public boolean is_alloc_tgt() {
		return constR.getBooleanNE($IS_ALLOC_TGT);
	}

	/** 
	 * valueに対応する定数のis_alloc_tgtの値を返します。
	 * @param value 定数値
	 * @return is_alloc_tgtの値
	 */
	public static boolean is_alloc_tgt(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_alloc_tgt();
	}

	/** 
	 * is_upd_lot_traceの値を返します。
	 * @return is_upd_lot_traceの値
	 */
	public boolean is_upd_lot_trace() {
		return constR.getBooleanNE($IS_UPD_LOT_TRACE);
	}

	/** 
	 * valueに対応する定数のis_upd_lot_traceの値を返します。
	 * @param value 定数値
	 * @return is_upd_lot_traceの値
	 */
	public static boolean is_upd_lot_trace(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_upd_lot_trace();
	}

	/** 
	 * is_mrkt_judgの値を返します。
	 * @return is_mrkt_judgの値
	 */
	public boolean is_mrkt_judg() {
		return constR.getBooleanNE($IS_MRKT_JUDG);
	}

	/** 
	 * valueに対応する定数のis_mrkt_judgの値を返します。
	 * @param value 定数値
	 * @return is_mrkt_judgの値
	 */
	public static boolean is_mrkt_judg(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_mrkt_judg();
	}

	/** 
	 * is_alloc_stop_lotの値を返します。
	 * @return is_alloc_stop_lotの値
	 */
	public boolean is_alloc_stop_lot() {
		return constR.getBooleanNE($IS_ALLOC_STOP_LOT);
	}

	/** 
	 * valueに対応する定数のis_alloc_stop_lotの値を返します。
	 * @param value 定数値
	 * @return is_alloc_stop_lotの値
	 */
	public static boolean is_alloc_stop_lot(String value) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_alloc_stop_lot();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
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
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
		if (me == null) {
			throw MSC_IO_SCHD_STS_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_opn_grp(), is_ordsav_grp(), is_fix_grp(), is_schd_grp(), is_ord_grp(), is_alloc_tgt(), is_upd_lot_trace(), is_mrkt_judg(), is_alloc_stop_lot());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_IO_SCHD_STS_TYP[] array() {
		if (array == null) {
			array = new MSC_IO_SCHD_STS_TYP[] {
					MSC_IO_SCHD_STS_TYP.OPN, MSC_IO_SCHD_STS_TYP.ORD_SAV, MSC_IO_SCHD_STS_TYP.FIX, MSC_IO_SCHD_STS_TYP.SCHD, MSC_IO_SCHD_STS_TYP.MFG_SAV, 
					 MSC_IO_SCHD_STS_TYP.SLO, MSC_IO_SCHD_STS_TYP.DDLV_SLO, MSC_IO_SCHD_STS_TYP.PO, MSC_IO_SCHD_STS_TYP.PRMS, MSC_IO_SCHD_STS_TYP.DLV_INST, MSC_IO_SCHD_STS_TYP.ORD, 
					 MSC_IO_SCHD_STS_TYP.STT, MSC_IO_SCHD_STS_TYP.YET, MSC_IO_SCHD_STS_TYP.ING, MSC_IO_SCHD_STS_TYP.WAIT_JUDG, MSC_IO_SCHD_STS_TYP.SHIP, MSC_IO_SCHD_STS_TYP.EX, 
					 MSC_IO_SCHD_STS_TYP.ARR, MSC_IO_SCHD_STS_TYP.PURC, MSC_IO_SCHD_STS_TYP.INSP
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
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
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
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
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
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
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
			if(MSC_IO_SCHD_STS_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_IO_SCHD_STS_TYP me = MSC_IO_SCHD_STS_TYP.get(MSC_IO_SCHD_STS_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_IO_SCHD_STS_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_IO_SCHD_STS_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_IO_SCHD_STS_TYP.list();
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
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
			if(MSC_IO_SCHD_STS_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_IO_SCHD_STS_TYP.subList(cols, vals);
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
		for (MSC_IO_SCHD_STS_TYP me : MSC_IO_SCHD_STS_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_IO_SCHD_STS_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_IO_SCHD_STS_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_IO_SCHD_STS_TYP", col);}
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
	protected boolean isSame(MSC_IO_SCHD_STS_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受払予定状況区分：未確定かどうか
	 * @param value 定数値
	 * @return 定数値が未確定の値の場合true
	 */
	public static boolean isOPN(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.OPN.isSame(type);
	}

	/**
	 * 受払予定状況区分：未確定かどうか
	 * @param type 属性値
	 * @return 属性値が未確定の値の場合true
	 */
	public static boolean isOPN(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.OPN.isSame(type);
	}

	/**
	 * 受払予定状況区分：オーダ保存かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ保存の値の場合true
	 */
	public static boolean isORD_SAV(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.ORD_SAV.isSame(type);
	}

	/**
	 * 受払予定状況区分：オーダ保存かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ保存の値の場合true
	 */
	public static boolean isORD_SAV(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.ORD_SAV.isSame(type);
	}

	/**
	 * 受払予定状況区分：依頼かどうか
	 * @param value 定数値
	 * @return 定数値が依頼の値の場合true
	 */
	public static boolean isFIX(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.FIX.isSame(type);
	}

	/**
	 * 受払予定状況区分：依頼かどうか
	 * @param type 属性値
	 * @return 属性値が依頼の値の場合true
	 */
	public static boolean isFIX(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.FIX.isSame(type);
	}

	/**
	 * 受払予定状況区分：予定かどうか
	 * @param value 定数値
	 * @return 定数値が予定の値の場合true
	 */
	public static boolean isSCHD(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.SCHD.isSame(type);
	}

	/**
	 * 受払予定状況区分：予定かどうか
	 * @param type 属性値
	 * @return 属性値が予定の値の場合true
	 */
	public static boolean isSCHD(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.SCHD.isSame(type);
	}

	/**
	 * 受払予定状況区分：製造保存かどうか
	 * @param value 定数値
	 * @return 定数値が製造保存の値の場合true
	 */
	public static boolean isMFG_SAV(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.MFG_SAV.isSame(type);
	}

	/**
	 * 受払予定状況区分：製造保存かどうか
	 * @param type 属性値
	 * @return 属性値が製造保存の値の場合true
	 */
	public static boolean isMFG_SAV(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.MFG_SAV.isSame(type);
	}

	/**
	 * 受払予定状況区分：受注かどうか
	 * @param value 定数値
	 * @return 定数値が受注の値の場合true
	 */
	public static boolean isSLO(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.SLO.isSame(type);
	}

	/**
	 * 受払予定状況区分：受注かどうか
	 * @param type 属性値
	 * @return 属性値が受注の値の場合true
	 */
	public static boolean isSLO(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.SLO.isSame(type);
	}

	/**
	 * 受払予定状況区分：直送受注かどうか
	 * @param value 定数値
	 * @return 定数値が直送受注の値の場合true
	 */
	public static boolean isDDLV_SLO(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.DDLV_SLO.isSame(type);
	}

	/**
	 * 受払予定状況区分：直送受注かどうか
	 * @param type 属性値
	 * @return 属性値が直送受注の値の場合true
	 */
	public static boolean isDDLV_SLO(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.DDLV_SLO.isSame(type);
	}

	/**
	 * 受払予定状況区分：発注かどうか
	 * @param value 定数値
	 * @return 定数値が発注の値の場合true
	 */
	public static boolean isPO(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.PO.isSame(type);
	}

	/**
	 * 受払予定状況区分：発注かどうか
	 * @param type 属性値
	 * @return 属性値が発注の値の場合true
	 */
	public static boolean isPO(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.PO.isSame(type);
	}

	/**
	 * 受払予定状況区分：納期回答かどうか
	 * @param value 定数値
	 * @return 定数値が納期回答の値の場合true
	 */
	public static boolean isPRMS(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.PRMS.isSame(type);
	}

	/**
	 * 受払予定状況区分：納期回答かどうか
	 * @param type 属性値
	 * @return 属性値が納期回答の値の場合true
	 */
	public static boolean isPRMS(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.PRMS.isSame(type);
	}

	/**
	 * 受払予定状況区分：納入指示かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.DLV_INST.isSame(type);
	}

	/**
	 * 受払予定状況区分：納入指示かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示の値の場合true
	 */
	public static boolean isDLV_INST(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.DLV_INST.isSame(type);
	}

	/**
	 * 受払予定状況区分：指図済かどうか
	 * @param value 定数値
	 * @return 定数値が指図済の値の場合true
	 */
	public static boolean isORD(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.ORD.isSame(type);
	}

	/**
	 * 受払予定状況区分：指図済かどうか
	 * @param type 属性値
	 * @return 属性値が指図済の値の場合true
	 */
	public static boolean isORD(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.ORD.isSame(type);
	}

	/**
	 * 受払予定状況区分：着手中かどうか
	 * @param value 定数値
	 * @return 定数値が着手中の値の場合true
	 */
	public static boolean isSTT(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.STT.isSame(type);
	}

	/**
	 * 受払予定状況区分：着手中かどうか
	 * @param type 属性値
	 * @return 属性値が着手中の値の場合true
	 */
	public static boolean isSTT(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.STT.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査待かどうか
	 * @param value 定数値
	 * @return 定数値が検査待の値の場合true
	 */
	public static boolean isYET(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.YET.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査待かどうか
	 * @param type 属性値
	 * @return 属性値が検査待の値の場合true
	 */
	public static boolean isYET(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.YET.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査中かどうか
	 * @param value 定数値
	 * @return 定数値が検査中の値の場合true
	 */
	public static boolean isING(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.ING.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査中かどうか
	 * @param type 属性値
	 * @return 属性値が検査中の値の場合true
	 */
	public static boolean isING(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.ING.isSame(type);
	}

	/**
	 * 受払予定状況区分：判定待かどうか
	 * @param value 定数値
	 * @return 定数値が判定待の値の場合true
	 */
	public static boolean isWAIT_JUDG(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.WAIT_JUDG.isSame(type);
	}

	/**
	 * 受払予定状況区分：判定待かどうか
	 * @param type 属性値
	 * @return 属性値が判定待の値の場合true
	 */
	public static boolean isWAIT_JUDG(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.WAIT_JUDG.isSame(type);
	}

	/**
	 * 受払予定状況区分：出荷済かどうか
	 * @param value 定数値
	 * @return 定数値が出荷済の値の場合true
	 */
	public static boolean isSHIP(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.SHIP.isSame(type);
	}

	/**
	 * 受払予定状況区分：出荷済かどうか
	 * @param type 属性値
	 * @return 属性値が出荷済の値の場合true
	 */
	public static boolean isSHIP(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.SHIP.isSame(type);
	}

	/**
	 * 受払予定状況区分：輸出済かどうか
	 * @param value 定数値
	 * @return 定数値が輸出済の値の場合true
	 */
	public static boolean isEX(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.EX.isSame(type);
	}

	/**
	 * 受払予定状況区分：輸出済かどうか
	 * @param type 属性値
	 * @return 属性値が輸出済の値の場合true
	 */
	public static boolean isEX(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.EX.isSame(type);
	}

	/**
	 * 受払予定状況区分：入荷済かどうか
	 * @param value 定数値
	 * @return 定数値が入荷済の値の場合true
	 */
	public static boolean isARR(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.ARR.isSame(type);
	}

	/**
	 * 受払予定状況区分：入荷済かどうか
	 * @param type 属性値
	 * @return 属性値が入荷済の値の場合true
	 */
	public static boolean isARR(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.ARR.isSame(type);
	}

	/**
	 * 受払予定状況区分：仕入済かどうか
	 * @param value 定数値
	 * @return 定数値が仕入済の値の場合true
	 */
	public static boolean isPURC(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.PURC.isSame(type);
	}

	/**
	 * 受払予定状況区分：仕入済かどうか
	 * @param type 属性値
	 * @return 属性値が仕入済の値の場合true
	 */
	public static boolean isPURC(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.PURC.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査済かどうか
	 * @param value 定数値
	 * @return 定数値が検査済の値の場合true
	 */
	public static boolean isINSP(String value) {
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
		return MSC_IO_SCHD_STS_TYP.INSP.isSame(type);
	}

	/**
	 * 受払予定状況区分：検査済かどうか
	 * @param type 属性値
	 * @return 属性値が検査済の値の場合true
	 */
	public static boolean isINSP(MSC_IO_SCHD_STS_TYP type) {
		return MSC_IO_SCHD_STS_TYP.INSP.isSame(type);
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
			MSC_IO_SCHD_STS_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.get(value);
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
			MSC_IO_SCHD_STS_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
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
			MSC_IO_SCHD_STS_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.get(value);
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
			MSC_IO_SCHD_STS_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
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
			MSC_IO_SCHD_STS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.get(value);
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
			MSC_IO_SCHD_STS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
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
			MSC_IO_SCHD_STS_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.get(value);
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
			MSC_IO_SCHD_STS_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IO_SCHD_STS_TYP type = MSC_IO_SCHD_STS_TYP.getNE(value);
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
