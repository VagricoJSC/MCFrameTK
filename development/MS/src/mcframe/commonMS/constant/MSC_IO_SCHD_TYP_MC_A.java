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
abstract class MSC_IO_SCHD_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MS";

	public static final String typeID = "IO_SCHD_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MSC_IO_SCHD_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "io_schd_typ";

	public static final String $NAME = "io_schd_typ_nm";

	public static final String $IO_TYP = "io_typ";

	public static final String $IS_XFR_GI_ALL = "is_xfr_gi_all";

	public static final String $IS_XFR_GR_ALL = "is_xfr_gr_all";

	public static final String $IS_ALLOC_TGT = "is_alloc_tgt";

	public static final String $IS_UPD_LOT_TRACE = "is_upd_lot_trace";

	public static final String $IS_MRKT_JUDG = "is_mrkt_judg";

	public static final String $IS_ALLOC_STOP_LOT = "is_alloc_stop_lot";

	public static final String $IS_LISTLOGIC_TGT = "is_listlogic_tgt";

	public static final String $IS_BI_TGT = "is_bi_tgt";

	/*
	 * 定数の定義です。
	 */
	/** 受払予定区分：売上
	 */
	public static final MSC_IO_SCHD_TYP SLS = create("A0100", "SLS", MSC_IO_TYP.GI.value(), false, false, false, true, true, true, true, true);

	/** 受払予定区分：売上（他勘定）
	 */
	public static final MSC_IO_SCHD_TYP SLS_ACXFR = create("A0110", "SLS_ACXFR", MSC_IO_TYP.GI.value(), false, false, false, true, true, true, true, true);

	/** 受払予定区分：売上返品出庫
	 */
	public static final MSC_IO_SCHD_TYP SLS_RTN_GI = create("A0200", "SLS_RTN_GI", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：売上返品入庫
	 */
	public static final MSC_IO_SCHD_TYP SLS_RTN_GR = create("A0201", "SLS_RTN_GR", MSC_IO_TYP.GR.value(), false, false, true, false, false, false, true, true);

	/** 受払予定区分：売上返品出庫（他勘定）
	 */
	public static final MSC_IO_SCHD_TYP SLS_RTN_GI_ACXFR = create("A0210", "SLS_RTN_GI_ACXFR", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：売上返品入庫（他勘定）
	 */
	public static final MSC_IO_SCHD_TYP SLS_RTN_GR_ACXFR = create("A0211", "SLS_RTN_GR_ACXFR", MSC_IO_TYP.GR.value(), false, false, true, false, false, false, true, true);

	/** 受払予定区分：製造
	 */
	public static final MSC_IO_SCHD_TYP MFG = create("B0100", "MFG", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：副産品製造
	 */
	public static final MSC_IO_SCHD_TYP BYMFG = create("B0110", "BYMFG", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：投入
	 */
	public static final MSC_IO_SCHD_TYP INPT = create("B0200", "INPT", MSC_IO_TYP.GI.value(), false, false, false, true, false, false, true, true);

	/** 受払予定区分：仕入出庫
	 */
	public static final MSC_IO_SCHD_TYP PURC_GI = create("C0100", "PURC_GI", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：仕入入庫
	 */
	public static final MSC_IO_SCHD_TYP PURC_GR = create("C0101", "PURC_GR", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：仕入転出
	 */
	public static final MSC_IO_SCHD_TYP PURC_XFR_OUT = create("C0109", "PURC_XFR_OUT", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：仕入出庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP PURC_GI_PROV = create("C0110", "PURC_GI_PROV", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：仕入入庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP PURC_GR_PROV = create("C0111", "PURC_GR_PROV", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：仕入転出（支給）
	 */
	public static final MSC_IO_SCHD_TYP PURC_XFR_OUT_PROV = create("C0119", "PURC_XFR_OUT_PROV", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：仕入入庫（直送）
	 */
	public static final MSC_IO_SCHD_TYP PURC_GR_DDLV = create("C0131", "PURC_GR_DDLV", MSC_IO_TYP.GR.value(), false, false, false, true, false, false, true, true);

	/** 受払予定区分：出荷
	 */
	public static final MSC_IO_SCHD_TYP SHIP_OUT = create("D0100", "SHIP_OUT", MSC_IO_TYP.GI.value(), false, false, false, true, true, true, true, true);

	/** 受払予定区分：着荷
	 */
	public static final MSC_IO_SCHD_TYP SHIP_IN = create("D0101", "SHIP_IN", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：出荷（輸出）
	 */
	public static final MSC_IO_SCHD_TYP SHIP_OUT_EX = create("D0110", "SHIP_OUT_EX", MSC_IO_TYP.GI.value(), true, false, false, true, false, false, true, true);

	/** 受払予定区分：着荷（輸出）
	 */
	public static final MSC_IO_SCHD_TYP SHIP_IN_EX = create("D0111", "SHIP_IN_EX", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：出荷返品出庫
	 */
	public static final MSC_IO_SCHD_TYP SHIP_RTN_GI = create("D0200", "SHIP_RTN_GI", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：出荷返品入庫
	 */
	public static final MSC_IO_SCHD_TYP SHIP_RTN_GR = create("D0201", "SHIP_RTN_GR", MSC_IO_TYP.GR.value(), false, false, true, false, false, false, true, true);

	/** 受払予定区分：移送出庫
	 */
	public static final MSC_IO_SCHD_TYP XFR_GI = create("D0300", "XFR_GI", MSC_IO_TYP.GI.value(), true, false, false, true, false, false, true, true);

	/** 受払予定区分：移送入庫
	 */
	public static final MSC_IO_SCHD_TYP XFR_GR = create("D0301", "XFR_GR", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移送返品出庫
	 */
	public static final MSC_IO_SCHD_TYP XFR_RTN_GI = create("D0302", "XFR_RTN_GI", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移送返品入庫
	 */
	public static final MSC_IO_SCHD_TYP XFR_RTN_GR = create("D0303", "XFR_RTN_GR", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移動出庫
	 */
	public static final MSC_IO_SCHD_TYP MOVE_GI = create("D0304", "MOVE_GI", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移動入庫
	 */
	public static final MSC_IO_SCHD_TYP MOVE_GR = create("D0305", "MOVE_GR", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移動返品出庫
	 */
	public static final MSC_IO_SCHD_TYP MOVE_RTN_GI = create("D0306", "MOVE_RTN_GI", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移動返品入庫
	 */
	public static final MSC_IO_SCHD_TYP MOVE_RTN_GR = create("D0307", "MOVE_RTN_GR", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：転入
	 */
	public static final MSC_IO_SCHD_TYP XFR_IN = create("D0308", "XFR_IN", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：転出
	 */
	public static final MSC_IO_SCHD_TYP XFR_OUT = create("D0309", "XFR_OUT", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：移送出庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_GI_PROV = create("D0310", "XFR_GI_PROV", MSC_IO_TYP.GI.value(), true, false, false, true, false, false, true, true);

	/** 受払予定区分：移送入庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_GR_PROV = create("D0311", "XFR_GR_PROV", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移送返品出庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_RTN_GI_PROV = create("D0312", "XFR_RTN_GI_PROV", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移送返品入庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_RTN_GR_PROV = create("D0313", "XFR_RTN_GR_PROV", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移動出庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP MOVE_GI_PROV = create("D0314", "MOVE_GI_PROV", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移動入庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP MOVE_GR_PROV = create("D0315", "MOVE_GR_PROV", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：移動返品出庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP MOVE_RTN_GI_PROV = create("D0316", "MOVE_RTN_GI_PROV", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移動返品入庫（支給）
	 */
	public static final MSC_IO_SCHD_TYP MOVE_RTN_GR_PROV = create("D0317", "MOVE_RTN_GR_PROV", MSC_IO_TYP.GR.value(), false, true, true, false, false, false, true, true);

	/** 受払予定区分：転入（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_IN_PROV = create("D0318", "XFR_IN_PROV", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：転出（支給）
	 */
	public static final MSC_IO_SCHD_TYP XFR_OUT_PROV = create("D0319", "XFR_OUT_PROV", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：入荷
	 */
	public static final MSC_IO_SCHD_TYP ARR = create("D0600", "ARR", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：入荷（支給）
	 */
	public static final MSC_IO_SCHD_TYP ARR_PROV = create("D0610", "ARR_PROV", MSC_IO_TYP.GR.value(), false, false, true, true, false, false, true, true);

	/** 受払予定区分：入荷返品
	 */
	public static final MSC_IO_SCHD_TYP ARR_RTN = create("D0700", "ARR_RTN", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：入荷返品（支給）
	 */
	public static final MSC_IO_SCHD_TYP ARR_RTN_PROV = create("D0710", "ARR_RTN_PROV", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：他勘定振替出庫
	 */
	public static final MSC_IO_SCHD_TYP ACXFR_GI = create("D0800", "ACXFR_GI", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：他勘定振替出庫（移送）
	 */
	public static final MSC_IO_SCHD_TYP ACXFR_GI_XFR = create("D0810", "ACXFR_GI_XFR", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：他勘定振替出庫（移動）
	 */
	public static final MSC_IO_SCHD_TYP ACXFR_GI_MOVE = create("D0820", "ACXFR_GI_MOVE", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：他勘定振替入庫
	 */
	public static final MSC_IO_SCHD_TYP ACXFR_GR = create("D0900", "ACXFR_GR", MSC_IO_TYP.GR.value(), false, false, true, false, false, false, true, true);

	/** 受払予定区分：廃棄
	 */
	public static final MSC_IO_SCHD_TYP SCRP = create("D1000", "SCRP", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：検査完了出庫
	 */
	public static final MSC_IO_SCHD_TYP INSP_CMPL_GI = create("E0103", "INSP_CMPL_GI", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：検査完了入庫
	 */
	public static final MSC_IO_SCHD_TYP INSP_CMPL_GR = create("E0104", "INSP_CMPL_GR", MSC_IO_TYP.GR.value(), false, false, true, false, false, false, true, true);

	/** 受払予定区分：製造計画
	 */
	public static final MSC_IO_SCHD_TYP MFG_PLN = create("X0100", "MFG_PLN", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：投入計画
	 */
	public static final MSC_IO_SCHD_TYP INPT_PLN = create("X0200", "INPT_PLN", MSC_IO_TYP.GI.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：購買計画
	 */
	public static final MSC_IO_SCHD_TYP PURC_PLN = create("X0300", "PURC_PLN", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/** 受払予定区分：移動・移送出庫計画
	 */
	public static final MSC_IO_SCHD_TYP XFR_GI_PLN = create("X0400", "XFR_GI_PLN", MSC_IO_TYP.GI.value(), true, false, false, false, false, false, true, true);

	/** 受払予定区分：移動・移送入庫計画
	 */
	public static final MSC_IO_SCHD_TYP XFR_GR_PLN = create("X0401", "XFR_GR_PLN", MSC_IO_TYP.GR.value(), false, false, false, false, false, false, true, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IO_SCHD_TYP create() {
		return new MSC_IO_SCHD_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MSC_IO_SCHD_TYP get(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		if (type == null) {
			throw MSC_IO_SCHD_TYP.invalidValue(value);
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
	public static MSC_IO_SCHD_TYP getNE(String value) {
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MSC_IO_SCHD_TYP create(String value, String xmlKey, String attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addStringColumn($IO_TYP, attr1);
		me.constR.addBooleanColumn($IS_XFR_GI_ALL, attr2);
		me.constR.addBooleanColumn($IS_XFR_GR_ALL, attr3);
		me.constR.addBooleanColumn($IS_ALLOC_TGT, attr4);
		me.constR.addBooleanColumn($IS_UPD_LOT_TRACE, attr5);
		me.constR.addBooleanColumn($IS_MRKT_JUDG, attr6);
		me.constR.addBooleanColumn($IS_ALLOC_STOP_LOT, attr7);
		me.constR.addBooleanColumn($IS_LISTLOGIC_TGT, attr8);
		me.constR.addBooleanColumn($IS_BI_TGT, attr9);
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
	 * io_typの値を返します。
	 * @return io_typの値
	 */
	public String io_typ() {
		return constR.getStringNE($IO_TYP);
	}

	/** 
	 * valueに対応する定数のio_typの値を返します。
	 * @param value 定数値
	 * @return io_typの値
	 */
	public static String io_typ(String value) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.io_typ();
	}

	/** 
	 * is_xfr_gi_allの値を返します。
	 * @return is_xfr_gi_allの値
	 */
	public boolean is_xfr_gi_all() {
		return constR.getBooleanNE($IS_XFR_GI_ALL);
	}

	/** 
	 * valueに対応する定数のis_xfr_gi_allの値を返します。
	 * @param value 定数値
	 * @return is_xfr_gi_allの値
	 */
	public static boolean is_xfr_gi_all(String value) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_xfr_gi_all();
	}

	/** 
	 * is_xfr_gr_allの値を返します。
	 * @return is_xfr_gr_allの値
	 */
	public boolean is_xfr_gr_all() {
		return constR.getBooleanNE($IS_XFR_GR_ALL);
	}

	/** 
	 * valueに対応する定数のis_xfr_gr_allの値を返します。
	 * @param value 定数値
	 * @return is_xfr_gr_allの値
	 */
	public static boolean is_xfr_gr_all(String value) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_xfr_gr_all();
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
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
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
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
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
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
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
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_alloc_stop_lot();
	}

	/** 
	 * is_listlogic_tgtの値を返します。
	 * @return is_listlogic_tgtの値
	 */
	public boolean is_listlogic_tgt() {
		return constR.getBooleanNE($IS_LISTLOGIC_TGT);
	}

	/** 
	 * valueに対応する定数のis_listlogic_tgtの値を返します。
	 * @param value 定数値
	 * @return is_listlogic_tgtの値
	 */
	public static boolean is_listlogic_tgt(String value) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_listlogic_tgt();
	}

	/** 
	 * is_bi_tgtの値を返します。
	 * @return is_bi_tgtの値
	 */
	public boolean is_bi_tgt() {
		return constR.getBooleanNE($IS_BI_TGT);
	}

	/** 
	 * valueに対応する定数のis_bi_tgtの値を返します。
	 * @param value 定数値
	 * @return is_bi_tgtの値
	 */
	public static boolean is_bi_tgt(String value) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_bi_tgt();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
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
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
		if (me == null) {
			throw MSC_IO_SCHD_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.getNE(value);
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
		return createStringPath(value(), name(), io_typ(), is_xfr_gi_all(), is_xfr_gr_all(), is_alloc_tgt(), is_upd_lot_trace(), is_mrkt_judg(), is_alloc_stop_lot(), is_listlogic_tgt(), is_bi_tgt());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MSC_IO_SCHD_TYP[] array() {
		if (array == null) {
			array = new MSC_IO_SCHD_TYP[] {
					MSC_IO_SCHD_TYP.SLS, MSC_IO_SCHD_TYP.SLS_ACXFR, MSC_IO_SCHD_TYP.SLS_RTN_GI, MSC_IO_SCHD_TYP.SLS_RTN_GR, MSC_IO_SCHD_TYP.SLS_RTN_GI_ACXFR, 
					 MSC_IO_SCHD_TYP.SLS_RTN_GR_ACXFR, MSC_IO_SCHD_TYP.MFG, MSC_IO_SCHD_TYP.BYMFG, MSC_IO_SCHD_TYP.INPT, MSC_IO_SCHD_TYP.PURC_GI, MSC_IO_SCHD_TYP.PURC_GR, 
					 MSC_IO_SCHD_TYP.PURC_XFR_OUT, MSC_IO_SCHD_TYP.PURC_GI_PROV, MSC_IO_SCHD_TYP.PURC_GR_PROV, MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV, MSC_IO_SCHD_TYP.PURC_GR_DDLV, MSC_IO_SCHD_TYP.SHIP_OUT, 
					 MSC_IO_SCHD_TYP.SHIP_IN, MSC_IO_SCHD_TYP.SHIP_OUT_EX, MSC_IO_SCHD_TYP.SHIP_IN_EX, MSC_IO_SCHD_TYP.SHIP_RTN_GI, MSC_IO_SCHD_TYP.SHIP_RTN_GR, MSC_IO_SCHD_TYP.XFR_GI, 
					 MSC_IO_SCHD_TYP.XFR_GR, MSC_IO_SCHD_TYP.XFR_RTN_GI, MSC_IO_SCHD_TYP.XFR_RTN_GR, MSC_IO_SCHD_TYP.MOVE_GI, MSC_IO_SCHD_TYP.MOVE_GR, MSC_IO_SCHD_TYP.MOVE_RTN_GI, 
					 MSC_IO_SCHD_TYP.MOVE_RTN_GR, MSC_IO_SCHD_TYP.XFR_IN, MSC_IO_SCHD_TYP.XFR_OUT, MSC_IO_SCHD_TYP.XFR_GI_PROV, MSC_IO_SCHD_TYP.XFR_GR_PROV, MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV, 
					 MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV, MSC_IO_SCHD_TYP.MOVE_GI_PROV, MSC_IO_SCHD_TYP.MOVE_GR_PROV, MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV, MSC_IO_SCHD_TYP.MOVE_RTN_GR_PROV, MSC_IO_SCHD_TYP.XFR_IN_PROV, 
					 MSC_IO_SCHD_TYP.XFR_OUT_PROV, MSC_IO_SCHD_TYP.ARR, MSC_IO_SCHD_TYP.ARR_PROV, MSC_IO_SCHD_TYP.ARR_RTN, MSC_IO_SCHD_TYP.ARR_RTN_PROV, MSC_IO_SCHD_TYP.ACXFR_GI, 
					 MSC_IO_SCHD_TYP.ACXFR_GI_XFR, MSC_IO_SCHD_TYP.ACXFR_GI_MOVE, MSC_IO_SCHD_TYP.ACXFR_GR, MSC_IO_SCHD_TYP.SCRP, MSC_IO_SCHD_TYP.INSP_CMPL_GI, MSC_IO_SCHD_TYP.INSP_CMPL_GR, 
					 MSC_IO_SCHD_TYP.MFG_PLN, MSC_IO_SCHD_TYP.INPT_PLN, MSC_IO_SCHD_TYP.PURC_PLN, MSC_IO_SCHD_TYP.XFR_GI_PLN, MSC_IO_SCHD_TYP.XFR_GR_PLN
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
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
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
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
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
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
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
			if(MSC_IO_SCHD_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MSC_IO_SCHD_TYP me = MSC_IO_SCHD_TYP.get(MSC_IO_SCHD_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MSC_IO_SCHD_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MSC_IO_SCHD_TYP.subList(row);
			if (list.isEmpty()) {
				list = MSC_IO_SCHD_TYP.list();
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
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
			if(MSC_IO_SCHD_TYP.isSameVals(me, cols, vals)){
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
			list = MSC_IO_SCHD_TYP.subList(cols, vals);
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
		for (MSC_IO_SCHD_TYP me : MSC_IO_SCHD_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MSC_IO_SCHD_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MSC_IO_SCHD_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MSC_IO_SCHD_TYP", col);}
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
	protected boolean isSame(MSC_IO_SCHD_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受払予定区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS.isSame(type);
	}

	/**
	 * 受払予定区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS.isSame(type);
	}

	/**
	 * 受払予定区分：売上（他勘定）かどうか
	 * @param value 定数値
	 * @return 定数値が売上（他勘定）の値の場合true
	 */
	public static boolean isSLS_ACXFR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：売上（他勘定）かどうか
	 * @param type 属性値
	 * @return 属性値が売上（他勘定）の値の場合true
	 */
	public static boolean isSLS_ACXFR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品出庫の値の場合true
	 */
	public static boolean isSLS_RTN_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品出庫の値の場合true
	 */
	public static boolean isSLS_RTN_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品入庫の値の場合true
	 */
	public static boolean isSLS_RTN_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品入庫の値の場合true
	 */
	public static boolean isSLS_RTN_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品出庫（他勘定）かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品出庫（他勘定）の値の場合true
	 */
	public static boolean isSLS_RTN_GI_ACXFR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS_RTN_GI_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品出庫（他勘定）かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品出庫（他勘定）の値の場合true
	 */
	public static boolean isSLS_RTN_GI_ACXFR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS_RTN_GI_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品入庫（他勘定）かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品入庫（他勘定）の値の場合true
	 */
	public static boolean isSLS_RTN_GR_ACXFR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SLS_RTN_GR_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：売上返品入庫（他勘定）かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品入庫（他勘定）の値の場合true
	 */
	public static boolean isSLS_RTN_GR_ACXFR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SLS_RTN_GR_ACXFR.isSame(type);
	}

	/**
	 * 受払予定区分：製造かどうか
	 * @param value 定数値
	 * @return 定数値が製造の値の場合true
	 */
	public static boolean isMFG(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MFG.isSame(type);
	}

	/**
	 * 受払予定区分：製造かどうか
	 * @param type 属性値
	 * @return 属性値が製造の値の場合true
	 */
	public static boolean isMFG(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MFG.isSame(type);
	}

	/**
	 * 受払予定区分：副産品製造かどうか
	 * @param value 定数値
	 * @return 定数値が副産品製造の値の場合true
	 */
	public static boolean isBYMFG(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.BYMFG.isSame(type);
	}

	/**
	 * 受払予定区分：副産品製造かどうか
	 * @param type 属性値
	 * @return 属性値が副産品製造の値の場合true
	 */
	public static boolean isBYMFG(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.BYMFG.isSame(type);
	}

	/**
	 * 受払予定区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.INPT.isSame(type);
	}

	/**
	 * 受払予定区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.INPT.isSame(type);
	}

	/**
	 * 受払予定区分：仕入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入出庫の値の場合true
	 */
	public static boolean isPURC_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_GI.isSame(type);
	}

	/**
	 * 受払予定区分：仕入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入出庫の値の場合true
	 */
	public static boolean isPURC_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_GI.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入入庫の値の場合true
	 */
	public static boolean isPURC_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_GR.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入入庫の値の場合true
	 */
	public static boolean isPURC_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_GR.isSame(type);
	}

	/**
	 * 受払予定区分：仕入転出かどうか
	 * @param value 定数値
	 * @return 定数値が仕入転出の値の場合true
	 */
	public static boolean isPURC_XFR_OUT(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_XFR_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：仕入転出かどうか
	 * @param type 属性値
	 * @return 属性値が仕入転出の値の場合true
	 */
	public static boolean isPURC_XFR_OUT(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_XFR_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：仕入出庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が仕入出庫（支給）の値の場合true
	 */
	public static boolean isPURC_GI_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入出庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が仕入出庫（支給）の値の場合true
	 */
	public static boolean isPURC_GI_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が仕入入庫（支給）の値の場合true
	 */
	public static boolean isPURC_GR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が仕入入庫（支給）の値の場合true
	 */
	public static boolean isPURC_GR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入転出（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が仕入転出（支給）の値の場合true
	 */
	public static boolean isPURC_XFR_OUT_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入転出（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が仕入転出（支給）の値の場合true
	 */
	public static boolean isPURC_XFR_OUT_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_XFR_OUT_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫（直送）かどうか
	 * @param value 定数値
	 * @return 定数値が仕入入庫（直送）の値の場合true
	 */
	public static boolean isPURC_GR_DDLV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_GR_DDLV.isSame(type);
	}

	/**
	 * 受払予定区分：仕入入庫（直送）かどうか
	 * @param type 属性値
	 * @return 属性値が仕入入庫（直送）の値の場合true
	 */
	public static boolean isPURC_GR_DDLV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_GR_DDLV.isSame(type);
	}

	/**
	 * 受払予定区分：出荷かどうか
	 * @param value 定数値
	 * @return 定数値が出荷の値の場合true
	 */
	public static boolean isSHIP_OUT(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：出荷かどうか
	 * @param type 属性値
	 * @return 属性値が出荷の値の場合true
	 */
	public static boolean isSHIP_OUT(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：着荷かどうか
	 * @param value 定数値
	 * @return 定数値が着荷の値の場合true
	 */
	public static boolean isSHIP_IN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_IN.isSame(type);
	}

	/**
	 * 受払予定区分：着荷かどうか
	 * @param type 属性値
	 * @return 属性値が着荷の値の場合true
	 */
	public static boolean isSHIP_IN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_IN.isSame(type);
	}

	/**
	 * 受払予定区分：出荷（輸出）かどうか
	 * @param value 定数値
	 * @return 定数値が出荷（輸出）の値の場合true
	 */
	public static boolean isSHIP_OUT_EX(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_OUT_EX.isSame(type);
	}

	/**
	 * 受払予定区分：出荷（輸出）かどうか
	 * @param type 属性値
	 * @return 属性値が出荷（輸出）の値の場合true
	 */
	public static boolean isSHIP_OUT_EX(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_OUT_EX.isSame(type);
	}

	/**
	 * 受払予定区分：着荷（輸出）かどうか
	 * @param value 定数値
	 * @return 定数値が着荷（輸出）の値の場合true
	 */
	public static boolean isSHIP_IN_EX(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_IN_EX.isSame(type);
	}

	/**
	 * 受払予定区分：着荷（輸出）かどうか
	 * @param type 属性値
	 * @return 属性値が着荷（輸出）の値の場合true
	 */
	public static boolean isSHIP_IN_EX(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_IN_EX.isSame(type);
	}

	/**
	 * 受払予定区分：出荷返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品出庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：出荷返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品出庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：出荷返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品入庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SHIP_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：出荷返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品入庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SHIP_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移送出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移送出庫の値の場合true
	 */
	public static boolean isXFR_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移送出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移送出庫の値の場合true
	 */
	public static boolean isXFR_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移送入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移送入庫の値の場合true
	 */
	public static boolean isXFR_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移送入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移送入庫の値の場合true
	 */
	public static boolean isXFR_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移送返品出庫の値の場合true
	 */
	public static boolean isXFR_RTN_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移送返品出庫の値の場合true
	 */
	public static boolean isXFR_RTN_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移送返品入庫の値の場合true
	 */
	public static boolean isXFR_RTN_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移送返品入庫の値の場合true
	 */
	public static boolean isXFR_RTN_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移動出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動出庫の値の場合true
	 */
	public static boolean isMOVE_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移動出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動出庫の値の場合true
	 */
	public static boolean isMOVE_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移動入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動入庫の値の場合true
	 */
	public static boolean isMOVE_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移動入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動入庫の値の場合true
	 */
	public static boolean isMOVE_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動返品出庫の値の場合true
	 */
	public static boolean isMOVE_RTN_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動返品出庫の値の場合true
	 */
	public static boolean isMOVE_RTN_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_RTN_GI.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動返品入庫の値の場合true
	 */
	public static boolean isMOVE_RTN_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動返品入庫の値の場合true
	 */
	public static boolean isMOVE_RTN_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_RTN_GR.isSame(type);
	}

	/**
	 * 受払予定区分：転入かどうか
	 * @param value 定数値
	 * @return 定数値が転入の値の場合true
	 */
	public static boolean isXFR_IN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_IN.isSame(type);
	}

	/**
	 * 受払予定区分：転入かどうか
	 * @param type 属性値
	 * @return 属性値が転入の値の場合true
	 */
	public static boolean isXFR_IN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_IN.isSame(type);
	}

	/**
	 * 受払予定区分：転出かどうか
	 * @param value 定数値
	 * @return 定数値が転出の値の場合true
	 */
	public static boolean isXFR_OUT(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：転出かどうか
	 * @param type 属性値
	 * @return 属性値が転出の値の場合true
	 */
	public static boolean isXFR_OUT(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_OUT.isSame(type);
	}

	/**
	 * 受払予定区分：移送出庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移送出庫（支給）の値の場合true
	 */
	public static boolean isXFR_GI_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送出庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移送出庫（支給）の値の場合true
	 */
	public static boolean isXFR_GI_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送入庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移送入庫（支給）の値の場合true
	 */
	public static boolean isXFR_GR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送入庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移送入庫（支給）の値の場合true
	 */
	public static boolean isXFR_GR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品出庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移送返品出庫（支給）の値の場合true
	 */
	public static boolean isXFR_RTN_GI_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品出庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移送返品出庫（支給）の値の場合true
	 */
	public static boolean isXFR_RTN_GI_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_RTN_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品入庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移送返品入庫（支給）の値の場合true
	 */
	public static boolean isXFR_RTN_GR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移送返品入庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移送返品入庫（支給）の値の場合true
	 */
	public static boolean isXFR_RTN_GR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_RTN_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動出庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移動出庫（支給）の値の場合true
	 */
	public static boolean isMOVE_GI_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動出庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移動出庫（支給）の値の場合true
	 */
	public static boolean isMOVE_GI_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動入庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移動入庫（支給）の値の場合true
	 */
	public static boolean isMOVE_GR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動入庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移動入庫（支給）の値の場合true
	 */
	public static boolean isMOVE_GR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品出庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移動返品出庫（支給）の値の場合true
	 */
	public static boolean isMOVE_RTN_GI_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品出庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移動返品出庫（支給）の値の場合true
	 */
	public static boolean isMOVE_RTN_GI_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_RTN_GI_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品入庫（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が移動返品入庫（支給）の値の場合true
	 */
	public static boolean isMOVE_RTN_GR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MOVE_RTN_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：移動返品入庫（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が移動返品入庫（支給）の値の場合true
	 */
	public static boolean isMOVE_RTN_GR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MOVE_RTN_GR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：転入（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が転入（支給）の値の場合true
	 */
	public static boolean isXFR_IN_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_IN_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：転入（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が転入（支給）の値の場合true
	 */
	public static boolean isXFR_IN_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_IN_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：転出（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が転出（支給）の値の場合true
	 */
	public static boolean isXFR_OUT_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_OUT_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：転出（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が転出（支給）の値の場合true
	 */
	public static boolean isXFR_OUT_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_OUT_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：入荷かどうか
	 * @param value 定数値
	 * @return 定数値が入荷の値の場合true
	 */
	public static boolean isARR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ARR.isSame(type);
	}

	/**
	 * 受払予定区分：入荷かどうか
	 * @param type 属性値
	 * @return 属性値が入荷の値の場合true
	 */
	public static boolean isARR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ARR.isSame(type);
	}

	/**
	 * 受払予定区分：入荷（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が入荷（支給）の値の場合true
	 */
	public static boolean isARR_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ARR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：入荷（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が入荷（支給）の値の場合true
	 */
	public static boolean isARR_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ARR_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：入荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 受払予定区分：入荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 受払予定区分：入荷返品（支給）かどうか
	 * @param value 定数値
	 * @return 定数値が入荷返品（支給）の値の場合true
	 */
	public static boolean isARR_RTN_PROV(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ARR_RTN_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：入荷返品（支給）かどうか
	 * @param type 属性値
	 * @return 属性値が入荷返品（支給）の値の場合true
	 */
	public static boolean isARR_RTN_PROV(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ARR_RTN_PROV.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替出庫の値の場合true
	 */
	public static boolean isACXFR_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ACXFR_GI.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替出庫の値の場合true
	 */
	public static boolean isACXFR_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ACXFR_GI.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫（移送）かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替出庫（移送）の値の場合true
	 */
	public static boolean isACXFR_GI_XFR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ACXFR_GI_XFR.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫（移送）かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替出庫（移送）の値の場合true
	 */
	public static boolean isACXFR_GI_XFR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ACXFR_GI_XFR.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫（移動）かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替出庫（移動）の値の場合true
	 */
	public static boolean isACXFR_GI_MOVE(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ACXFR_GI_MOVE.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替出庫（移動）かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替出庫（移動）の値の場合true
	 */
	public static boolean isACXFR_GI_MOVE(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ACXFR_GI_MOVE.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替入庫の値の場合true
	 */
	public static boolean isACXFR_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.ACXFR_GR.isSame(type);
	}

	/**
	 * 受払予定区分：他勘定振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替入庫の値の場合true
	 */
	public static boolean isACXFR_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.ACXFR_GR.isSame(type);
	}

	/**
	 * 受払予定区分：廃棄かどうか
	 * @param value 定数値
	 * @return 定数値が廃棄の値の場合true
	 */
	public static boolean isSCRP(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.SCRP.isSame(type);
	}

	/**
	 * 受払予定区分：廃棄かどうか
	 * @param type 属性値
	 * @return 属性値が廃棄の値の場合true
	 */
	public static boolean isSCRP(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.SCRP.isSame(type);
	}

	/**
	 * 受払予定区分：検査完了出庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了出庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GI(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.INSP_CMPL_GI.isSame(type);
	}

	/**
	 * 受払予定区分：検査完了出庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了出庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GI(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.INSP_CMPL_GI.isSame(type);
	}

	/**
	 * 受払予定区分：検査完了入庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了入庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GR(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.INSP_CMPL_GR.isSame(type);
	}

	/**
	 * 受払予定区分：検査完了入庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了入庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GR(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.INSP_CMPL_GR.isSame(type);
	}

	/**
	 * 受払予定区分：製造計画かどうか
	 * @param value 定数値
	 * @return 定数値が製造計画の値の場合true
	 */
	public static boolean isMFG_PLN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.MFG_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：製造計画かどうか
	 * @param type 属性値
	 * @return 属性値が製造計画の値の場合true
	 */
	public static boolean isMFG_PLN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.MFG_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：投入計画かどうか
	 * @param value 定数値
	 * @return 定数値が投入計画の値の場合true
	 */
	public static boolean isINPT_PLN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.INPT_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：投入計画かどうか
	 * @param type 属性値
	 * @return 属性値が投入計画の値の場合true
	 */
	public static boolean isINPT_PLN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.INPT_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：購買計画かどうか
	 * @param value 定数値
	 * @return 定数値が購買計画の値の場合true
	 */
	public static boolean isPURC_PLN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.PURC_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：購買計画かどうか
	 * @param type 属性値
	 * @return 属性値が購買計画の値の場合true
	 */
	public static boolean isPURC_PLN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.PURC_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：移動・移送出庫計画かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送出庫計画の値の場合true
	 */
	public static boolean isXFR_GI_PLN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GI_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：移動・移送出庫計画かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送出庫計画の値の場合true
	 */
	public static boolean isXFR_GI_PLN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GI_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：移動・移送入庫計画かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送入庫計画の値の場合true
	 */
	public static boolean isXFR_GR_PLN(String value) {
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
		return MSC_IO_SCHD_TYP.XFR_GR_PLN.isSame(type);
	}

	/**
	 * 受払予定区分：移動・移送入庫計画かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送入庫計画の値の場合true
	 */
	public static boolean isXFR_GR_PLN(MSC_IO_SCHD_TYP type) {
		return MSC_IO_SCHD_TYP.XFR_GR_PLN.isSame(type);
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
			MSC_IO_SCHD_TYP.putName(r, valueColumn, nameColumn);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.get(value);
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
			MSC_IO_SCHD_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
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
			MSC_IO_SCHD_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.get(value);
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
			MSC_IO_SCHD_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
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
			MSC_IO_SCHD_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.get(value);
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
			MSC_IO_SCHD_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
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
			MSC_IO_SCHD_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.get(value);
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
			MSC_IO_SCHD_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MSC_IO_SCHD_TYP type = MSC_IO_SCHD_TYP.getNE(value);
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
