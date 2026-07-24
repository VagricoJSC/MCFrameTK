package mcframe.commonMG.constant;

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
import mcframe.commonFS.constant.FSC_MODULE_ID;

@SuppressWarnings("all")
abstract class MGC_IO_ACT_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MG";

	public static final String typeID = "IO_ACT_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MGC_IO_ACT_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "io_act_typ";

	public static final String $NAME = "io_act_typ_nm";

	public static final String $CHK_CL_SLS = "chk_cl_sls";

	public static final String $CHK_CL_PURC = "chk_cl_purc";

	public static final String $CHK_CL_STK = "chk_cl_stk";

	public static final String $IO_TYP = "io_typ";

	public static final String $AC_SLIP_TYP = "ac_slip_typ";

	public static final String $IS_UPD_LOT_TRACE = "is_upd_lot_trace";

	public static final String $IS_ACCRUAL = "is_accrual";

	public static final String $IS_ACCPT = "is_accpt";

	public static final String $IS_AVL = "is_avl";

	public static final String $IS_ACIF_ASSET_NOT_MNG = "is_acif_asset_not_mng";

	public static final String $SLIP_SORT_SEQ = "slip_sort_seq";

	public static final String $IS_BI_TGT = "is_bi_tgt";

	/*
	 * 定数の定義です。
	 */
	/** 受払区分：売上
	 */
	public static final MGC_IO_ACT_TYP SLS = create("A0100", "SLS", true, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.SLS.value(), false, false, true, false, true, new MCNumber(53), true);

	/** 受払区分：売上返品出庫
	 */
	public static final MGC_IO_ACT_TYP SLS_RTN_GI = create("A0200", "SLS_RTN_GI", true, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(3), true);

	/** 受払区分：売上返品入庫
	 */
	public static final MGC_IO_ACT_TYP SLS_RTN_GR = create("A0201", "SLS_RTN_GR", true, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.SLS_RET.value(), false, false, true, true, true, new MCNumber(4), true);

	/** 受払区分：売上値引
	 */
	public static final MGC_IO_ACT_TYP SLS_DSCNT = create("A0300", "SLS_DSCNT", true, false, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.SLS_DSCNT.value(), false, false, false, false, true, new MCNumber(5), true);

	/** 受払区分：売上値増
	 */
	public static final MGC_IO_ACT_TYP SLS_XTRA = create("A0400", "SLS_XTRA", true, false, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.SLS_XTRA.value(), false, false, false, false, true, new MCNumber(6), true);

	/** 受払区分：製造
	 */
	public static final MGC_IO_ACT_TYP MFG = create("B0100", "MFG", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.MFG.value(), true, true, true, true, false, new MCNumber(7), true);

	/** 受払区分：副産品製造
	 */
	public static final MGC_IO_ACT_TYP BYMFG = create("B0110", "BYMFG", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.BYPROD.value(), true, true, true, true, false, new MCNumber(8), true);

	/** 受払区分：投入
	 */
	public static final MGC_IO_ACT_TYP INPT = create("B0200", "INPT", false, false, true, MGC_IO_TYP.GI.value(), null, true, true, true, true, true, new MCNumber(49), true);

	/** 受払区分：投入（自給）
	 */
	public static final MGC_IO_ACT_TYP INPT_SLF = create("B0201", "INPT_SLF", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.IN_SS.value(), false, false, false, false, true, new MCNumber(50), true);

	/** 受払区分：ロス
	 */
	public static final MGC_IO_ACT_TYP LOSS = create("B0202", "LOSS", false, false, true, MGC_IO_TYP.GI.value(), null, true, true, true, true, true, new MCNumber(51), true);

	/** 受払区分：ロス（自給）
	 */
	public static final MGC_IO_ACT_TYP LOSS_SLF = create("B0203", "LOSS_SLF", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.IN_SS.value(), false, false, false, false, true, new MCNumber(52), true);

	/** 受払区分：仕入出庫
	 */
	public static final MGC_IO_ACT_TYP PURC_GI = create("C0100", "PURC_GI", false, true, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(9), true);

	/** 受払区分：仕入入庫
	 */
	public static final MGC_IO_ACT_TYP PURC_GR = create("C0101", "PURC_GR", false, true, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.PURC.value(), false, false, true, false, true, new MCNumber(10), true);

	/** 受払区分：検収不良出庫
	 */
	public static final MGC_IO_ACT_TYP ACCPT_DFCT_GI = create("C0102", "ACCPT_DFCT_GI", false, true, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(11), true);

	/** 受払区分：検収不良入庫
	 */
	public static final MGC_IO_ACT_TYP ACCPT_DFCT_GR = create("C0103", "ACCPT_DFCT_GR", false, true, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(12), true);

	/** 受払区分：仕入転入
	 */
	public static final MGC_IO_ACT_TYP PURC_XFR_IN = create("C0108", "PURC_XFR_IN", false, true, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(17), true);

	/** 受払区分：仕入転出
	 */
	public static final MGC_IO_ACT_TYP PURC_XFR_OUT = create("C0109", "PURC_XFR_OUT", false, true, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(1), true);

	/** 受払区分：有償受給出庫
	 */
	public static final MGC_IO_ACT_TYP ONR_RCV_GI = create("C0120", "ONR_RCV_GI", false, true, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(13), true);

	/** 受払区分：有償受給入庫
	 */
	public static final MGC_IO_ACT_TYP ONR_RCV_GR = create("C0121", "ONR_RCV_GR", false, true, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.PURC.value(), false, false, true, false, true, new MCNumber(14), true);

	/** 受払区分：経費購買出庫
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_GI = create("C0200", "XPNS_PURC_GI", false, true, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(15), true);

	/** 受払区分：経費購買入庫
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_GR = create("C0201", "XPNS_PURC_GR", false, true, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.PURC_XPNS.value(), false, false, true, false, true, new MCNumber(16), true);

	/** 受払区分：仕入返品出庫
	 */
	public static final MGC_IO_ACT_TYP PURC_RTN_GI = create("C0300", "PURC_RTN_GI", false, true, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.PURC_RET.value(), true, true, true, true, true, new MCNumber(22), true);

	/** 受払区分：仕入返品入庫
	 */
	public static final MGC_IO_ACT_TYP PURC_RTN_GR = create("C0301", "PURC_RTN_GR", false, true, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(23), true);

	/** 受払区分：有償受給返品出庫
	 */
	public static final MGC_IO_ACT_TYP ONR_RCV_RET_GI = create("C0302", "ONR_RCV_RET_GI", false, true, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.PURC_RET.value(), true, true, true, true, true, new MCNumber(24), true);

	/** 受払区分：有償受給返品入庫
	 */
	public static final MGC_IO_ACT_TYP ONR_RCV_RET_GR = create("C0303", "ONR_RCV_RET_GR", false, true, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(25), true);

	/** 受払区分：経費購買返品出庫
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_RTN_GI = create("C0400", "XPNS_PURC_RTN_GI", false, true, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.PURC_RET_XPNS.value(), true, true, true, true, true, new MCNumber(26), true);

	/** 受払区分：経費購買返品入庫
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_RTN_GR = create("C0401", "XPNS_PURC_RTN_GR", false, true, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(27), true);

	/** 受払区分：仕入値引
	 */
	public static final MGC_IO_ACT_TYP PURC_DSCNT = create("C0500", "PURC_DSCNT", false, true, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.PURC_DSCNT.value(), false, false, false, false, true, new MCNumber(28), true);

	/** 受払区分：経費値引
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_DSCNT = create("C0600", "XPNS_PURC_DSCNT", false, true, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.PURC_DSCNT_XPNS.value(), false, false, false, false, true, new MCNumber(29), true);

	/** 受払区分：仕入値増
	 */
	public static final MGC_IO_ACT_TYP PURC_XTRA = create("C0700", "PURC_XTRA", false, true, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.PURC_XTRA.value(), false, false, false, false, true, new MCNumber(30), true);

	/** 受払区分：経費値増
	 */
	public static final MGC_IO_ACT_TYP XPNS_PURC_XTRA = create("C0800", "XPNS_PURC_XTRA", false, true, false, MGC_IO_TYP.NON.value(), MAC_AC_SLIP_TYP.PURC_XTRA_XPNS.value(), false, false, false, false, true, new MCNumber(31), true);

	/** 受払区分：出荷
	 */
	public static final MGC_IO_ACT_TYP SHIP_OUT = create("D0100", "SHIP_OUT", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.SHIP.value(), true, true, false, true, false, new MCNumber(32), true);

	/** 受払区分：着荷
	 */
	public static final MGC_IO_ACT_TYP SHIP_IN = create("D0101", "SHIP_IN", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(33), true);

	/** 受払区分：輸出出荷
	 */
	public static final MGC_IO_ACT_TYP EX_SHIP_OUT = create("D0102", "EX_SHIP_OUT", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.SHIP.value(), true, false, false, false, false, new MCNumber(34), true);

	/** 受払区分：輸出着荷
	 */
	public static final MGC_IO_ACT_TYP EX_SHIP_IN = create("D0103", "EX_SHIP_IN", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(35), true);

	/** 受払区分：出荷返品出庫
	 */
	public static final MGC_IO_ACT_TYP SHIP_RTN_GI = create("D0200", "SHIP_RTN_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(36), true);

	/** 受払区分：出荷返品入庫
	 */
	public static final MGC_IO_ACT_TYP SHIP_RTN_GR = create("D0201", "SHIP_RTN_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.SHIP_RET.value(), true, true, false, true, false, new MCNumber(37), true);

	/** 受払区分：移動・移送出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_GI = create("D0300", "XFR_GI", false, false, true, MGC_IO_TYP.GI.value(), null, true, true, true, true, false, new MCNumber(38), true);

	/** 受払区分：移動・移送入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_GR = create("D0301", "XFR_GR", false, false, true, MGC_IO_TYP.GR.value(), null, true, true, true, true, false, new MCNumber(43), true);

	/** 受払区分：移動・移送返品出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_RTN_GI = create("D0302", "XFR_RTN_GI", false, false, true, MGC_IO_TYP.GI.value(), null, true, true, true, true, false, new MCNumber(39), true);

	/** 受払区分：移動・移送返品入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_RTN_GR = create("D0303", "XFR_RTN_GR", false, false, true, MGC_IO_TYP.GR.value(), null, true, true, true, true, false, new MCNumber(42), true);

	/** 受払区分：転入
	 */
	public static final MGC_IO_ACT_TYP XFR_IN = create("D0308", "XFR_IN", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, true, false, false, new MCNumber(40), true);

	/** 受払区分：転出
	 */
	public static final MGC_IO_ACT_TYP XFR_OUT = create("D0309", "XFR_OUT", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, true, false, false, new MCNumber(41), true);

	/** 受払区分：有償支給出庫
	 */
	public static final MGC_IO_ACT_TYP ONR_PROV_GI = create("D0400", "ONR_PROV_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, true, false, false, new MCNumber(44), true);

	/** 受払区分：有償支給入庫
	 */
	public static final MGC_IO_ACT_TYP ONR_PROV_GR = create("D0401", "ONR_PROV_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.ONR_PROV.value(), false, false, false, false, true, new MCNumber(45), true);

	/** 受払区分：無償支給出庫
	 */
	public static final MGC_IO_ACT_TYP FFR_PROV_GI = create("D0402", "FFR_PROV_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(46), true);

	/** 受払区分：無償支給入庫
	 */
	public static final MGC_IO_ACT_TYP FFR_PROV_GR = create("D0403", "FFR_PROV_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.FFR_PROV.value(), false, false, false, false, false, new MCNumber(47), true);

	/** 受払区分：有償支給返品出庫
	 */
	public static final MGC_IO_ACT_TYP ONR_PROV_RTN_GI = create("D0500", "ONR_PROV_RTN_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.ONR_PRVR.value(), false, false, false, false, true, new MCNumber(18), true);

	/** 受払区分：有償支給返品入庫
	 */
	public static final MGC_IO_ACT_TYP ONR_PROV_RTN_GR = create("D0501", "ONR_PROV_RTN_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, true, false, false, new MCNumber(19), true);

	/** 受払区分：無償支給返品出庫
	 */
	public static final MGC_IO_ACT_TYP FFR_PROV_RTN_GI = create("D0502", "FFR_PROV_RTN_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.FFR_PRVR.value(), false, false, false, false, false, new MCNumber(20), true);

	/** 受払区分：無償支給返品入庫
	 */
	public static final MGC_IO_ACT_TYP FFR_PROV_RTN_GR = create("D0503", "FFR_PROV_RTN_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(21), true);

	/** 受払区分：入荷
	 */
	public static final MGC_IO_ACT_TYP ARR = create("D0600", "ARR", false, false, true, MGC_IO_TYP.GR.value(), null, true, true, false, false, false, new MCNumber(2), true);

	/** 受払区分：預り入庫
	 */
	public static final MGC_IO_ACT_TYP ARR_CSTSTK = create("D0601", "ARR_CSTSTK", false, false, true, MGC_IO_TYP.GR.value(), null, true, false, false, false, false, new MCNumber(54), true);

	/** 受払区分：入荷返品
	 */
	public static final MGC_IO_ACT_TYP ARR_RTN = create("D0700", "ARR_RTN", false, false, true, MGC_IO_TYP.GI.value(), null, true, true, true, true, false, new MCNumber(55), true);

	/** 受払区分：他勘定振替出庫
	 */
	public static final MGC_IO_ACT_TYP ACXFR_GI = create("D0800", "ACXFR_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.OTH_CCN_SO.value(), true, true, true, true, false, new MCNumber(56), true);

	/** 受払区分：他勘定振替入庫
	 */
	public static final MGC_IO_ACT_TYP ACXFR_GR = create("D0900", "ACXFR_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.OTH_CCN_GR.value(), true, true, true, true, false, new MCNumber(48), true);

	/** 受払区分：廃棄
	 */
	public static final MGC_IO_ACT_TYP SCRP = create("D1000", "SCRP", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.DISP_SCRP.value(), true, true, true, true, false, new MCNumber(57), true);

	/** 受払区分：品目振替出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_ITM_GI = create("D1100", "XFR_ITM_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.STK_SW_SO.value(), true, true, true, true, false, new MCNumber(58), true);

	/** 受払区分：品目振替入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_ITM_GR = create("D1101", "XFR_ITM_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.STK_SW_GR.value(), true, true, true, true, false, new MCNumber(59), true);

	/** 受払区分：ロット・手配ＮＯ振替出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_LOT_SNO_GI = create("D1200", "XFR_LOT_SNO_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.STK_SW_SO.value(), true, true, true, true, false, new MCNumber(60), true);

	/** 受払区分：ロット・手配ＮＯ振替入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_LOT_SNO_GR = create("D1201", "XFR_LOT_SNO_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.STK_SW_GR.value(), true, true, true, true, false, new MCNumber(61), true);

	/** 受払区分：格付・良品区分振替出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_GRD_GI = create("D1300", "XFR_GRD_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, true, true, true, false, new MCNumber(62), true);

	/** 受払区分：格付・良品区分振替入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_GRD_GR = create("D1301", "XFR_GRD_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, true, true, true, false, new MCNumber(63), true);

	/** 受払区分：荷姿振替出庫
	 */
	public static final MGC_IO_ACT_TYP XFR_PACK_GI = create("D1400", "XFR_PACK_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(64), true);

	/** 受払区分：荷姿振替入庫
	 */
	public static final MGC_IO_ACT_TYP XFR_PACK_GR = create("D1401", "XFR_PACK_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(65), true);

	/** 受払区分：棚卸差異減耗
	 */
	public static final MGC_IO_ACT_TYP STK_ADJST_GI = create("D1500", "STK_ADJST_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.SO_STKTK.value(), true, true, true, true, false, new MCNumber(66), true);

	/** 受払区分：棚卸差異増耗
	 */
	public static final MGC_IO_ACT_TYP STK_ADJST_GR = create("D1501", "STK_ADJST_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.IN_STKTK.value(), true, true, true, true, false, new MCNumber(67), true);

	/** 受払区分：検査出庫
	 */
	public static final MGC_IO_ACT_TYP INSP_GI = create("E0101", "INSP_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(68), true);

	/** 受払区分：検査入庫
	 */
	public static final MGC_IO_ACT_TYP INSP_GR = create("E0102", "INSP_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(69), true);

	/** 受払区分：検査完了出庫
	 */
	public static final MGC_IO_ACT_TYP INSP_CMPL_GI = create("E0103", "INSP_CMPL_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(70), true);

	/** 受払区分：検査完了入庫
	 */
	public static final MGC_IO_ACT_TYP INSP_CMPL_GR = create("E0104", "INSP_CMPL_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, true, false, new MCNumber(71), true);

	/** 受払区分：検査判定出庫
	 */
	public static final MGC_IO_ACT_TYP INSP_JUDG_GI = create("E0105", "INSP_JUDG_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(72), true);

	/** 受払区分：検査判定入庫
	 */
	public static final MGC_IO_ACT_TYP INSP_JUDG_GR = create("E0106", "INSP_JUDG_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, true, false, new MCNumber(73), true);

	/** 受払区分：再検査出庫
	 */
	public static final MGC_IO_ACT_TYP REINSP_GI = create("E0200", "REINSP_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, true, false, new MCNumber(74), true);

	/** 受払区分：再検査入庫
	 */
	public static final MGC_IO_ACT_TYP REINSP_GR = create("E0201", "REINSP_GR", false, false, true, MGC_IO_TYP.GR.value(), null, false, false, false, false, false, new MCNumber(75), true);

	/** 受払区分：検査抜取
	 */
	public static final MGC_IO_ACT_TYP INSP_SMPL_GI = create("E0300", "INSP_SMPL_GI", false, false, true, MGC_IO_TYP.GI.value(), MAC_AC_SLIP_TYP.INSP_SMPL.value(), true, true, true, true, false, new MCNumber(76), true);

	/** 受払区分：倉入出庫
	 */
	public static final MGC_IO_ACT_TYP PRDCT_WH_GI = create("F0100", "PRDCT_WH_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(77), true);

	/** 受払区分：倉入入庫
	 */
	public static final MGC_IO_ACT_TYP PRDCT_WH_GR = create("F0101", "PRDCT_WH_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.PROD_ITM_SO.value(), false, false, false, false, false, new MCNumber(78), true);

	/** 受払区分：戻入出庫
	 */
	public static final MGC_IO_ACT_TYP PRDCT_WH_RTN_GI = create("F0102", "PRDCT_WH_RTN_GI", false, false, true, MGC_IO_TYP.GI.value(), null, false, false, false, false, false, new MCNumber(79), true);

	/** 受払区分：戻入入庫
	 */
	public static final MGC_IO_ACT_TYP PRDCT_WH_RTN_GR = create("F0103", "PRDCT_WH_RTN_GR", false, false, true, MGC_IO_TYP.GR.value(), MAC_AC_SLIP_TYP.PROD_ITM_RET_SO.value(), false, false, false, false, false, new MCNumber(80), true);

	/** 受払区分：月初在庫
	 */
	public static final MGC_IO_ACT_TYP INI_STK = create("Z0100", "INI_STK", false, false, false, MGC_IO_TYP.NON.value(), null, false, false, false, false, false, null, true);

	/** 受払区分：月末在庫
	 */
	public static final MGC_IO_ACT_TYP END_STK = create("Z0101", "END_STK", false, false, false, MGC_IO_TYP.NON.value(), null, false, false, false, false, false, null, true);

	/** 受払区分：仕掛
	 */
	public static final MGC_IO_ACT_TYP WIP = create("Z0102", "WIP", false, false, false, MGC_IO_TYP.NON.value(), null, false, false, false, false, false, null, true);

	/** 受払区分：工数
	 */
	public static final MGC_IO_ACT_TYP WK_COST = create("Z0103", "WK_COST", false, false, false, MGC_IO_TYP.NON.value(), null, false, false, false, false, false, null, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_IO_ACT_TYP create() {
		return new MGC_IO_ACT_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MGC_IO_ACT_TYP get(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		if (type == null) {
			throw MGC_IO_ACT_TYP.invalidValue(value);
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
	public static MGC_IO_ACT_TYP getNE(String value) {
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_IO_ACT_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, String attr4, String attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9, boolean attr10, MCNumber attr11, boolean attr12) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($CHK_CL_SLS, attr1);
		me.constR.addBooleanColumn($CHK_CL_PURC, attr2);
		me.constR.addBooleanColumn($CHK_CL_STK, attr3);
		me.constR.addStringColumn($IO_TYP, attr4);
		me.constR.addStringColumn($AC_SLIP_TYP, attr5);
		me.constR.addBooleanColumn($IS_UPD_LOT_TRACE, attr6);
		me.constR.addBooleanColumn($IS_ACCRUAL, attr7);
		me.constR.addBooleanColumn($IS_ACCPT, attr8);
		me.constR.addBooleanColumn($IS_AVL, attr9);
		me.constR.addBooleanColumn($IS_ACIF_ASSET_NOT_MNG, attr10);
		me.constR.addNumberColumn($SLIP_SORT_SEQ, attr11);
		me.constR.addBooleanColumn($IS_BI_TGT, attr12);
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
	 * chk_cl_slsの値を返します。
	 * @return chk_cl_slsの値
	 */
	public boolean chk_cl_sls() {
		return constR.getBooleanNE($CHK_CL_SLS);
	}

	/** 
	 * valueに対応する定数のchk_cl_slsの値を返します。
	 * @param value 定数値
	 * @return chk_cl_slsの値
	 */
	public static boolean chk_cl_sls(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.chk_cl_sls();
	}

	/** 
	 * chk_cl_purcの値を返します。
	 * @return chk_cl_purcの値
	 */
	public boolean chk_cl_purc() {
		return constR.getBooleanNE($CHK_CL_PURC);
	}

	/** 
	 * valueに対応する定数のchk_cl_purcの値を返します。
	 * @param value 定数値
	 * @return chk_cl_purcの値
	 */
	public static boolean chk_cl_purc(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.chk_cl_purc();
	}

	/** 
	 * chk_cl_stkの値を返します。
	 * @return chk_cl_stkの値
	 */
	public boolean chk_cl_stk() {
		return constR.getBooleanNE($CHK_CL_STK);
	}

	/** 
	 * valueに対応する定数のchk_cl_stkの値を返します。
	 * @param value 定数値
	 * @return chk_cl_stkの値
	 */
	public static boolean chk_cl_stk(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.chk_cl_stk();
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
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.io_typ();
	}

	/** 
	 * ac_slip_typの値を返します。
	 * @return ac_slip_typの値
	 */
	public String ac_slip_typ() {
		return constR.getStringNE($AC_SLIP_TYP);
	}

	/** 
	 * valueに対応する定数のac_slip_typの値を返します。
	 * @param value 定数値
	 * @return ac_slip_typの値
	 */
	public static String ac_slip_typ(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ac_slip_typ();
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
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_upd_lot_trace();
	}

	/** 
	 * is_accrualの値を返します。
	 * @return is_accrualの値
	 */
	public boolean is_accrual() {
		return constR.getBooleanNE($IS_ACCRUAL);
	}

	/** 
	 * valueに対応する定数のis_accrualの値を返します。
	 * @param value 定数値
	 * @return is_accrualの値
	 */
	public static boolean is_accrual(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_accrual();
	}

	/** 
	 * is_accptの値を返します。
	 * @return is_accptの値
	 */
	public boolean is_accpt() {
		return constR.getBooleanNE($IS_ACCPT);
	}

	/** 
	 * valueに対応する定数のis_accptの値を返します。
	 * @param value 定数値
	 * @return is_accptの値
	 */
	public static boolean is_accpt(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_accpt();
	}

	/** 
	 * is_avlの値を返します。
	 * @return is_avlの値
	 */
	public boolean is_avl() {
		return constR.getBooleanNE($IS_AVL);
	}

	/** 
	 * valueに対応する定数のis_avlの値を返します。
	 * @param value 定数値
	 * @return is_avlの値
	 */
	public static boolean is_avl(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_avl();
	}

	/** 
	 * is_acif_asset_not_mngの値を返します。
	 * @return is_acif_asset_not_mngの値
	 */
	public boolean is_acif_asset_not_mng() {
		return constR.getBooleanNE($IS_ACIF_ASSET_NOT_MNG);
	}

	/** 
	 * valueに対応する定数のis_acif_asset_not_mngの値を返します。
	 * @param value 定数値
	 * @return is_acif_asset_not_mngの値
	 */
	public static boolean is_acif_asset_not_mng(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_acif_asset_not_mng();
	}

	/** 
	 * slip_sort_seqの値を返します。
	 * @return slip_sort_seqの値
	 */
	public MCNumber slip_sort_seq() {
		return constR.getNumberNE($SLIP_SORT_SEQ);
	}

	/** 
	 * valueに対応する定数のslip_sort_seqの値を返します。
	 * @param value 定数値
	 * @return slip_sort_seqの値
	 */
	public static MCNumber slip_sort_seq(String value) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.slip_sort_seq();
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
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
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
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
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
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
		if (me == null) {
			throw MGC_IO_ACT_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.getNE(value);
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
		return createStringPath(value(), name(), chk_cl_sls(), chk_cl_purc(), chk_cl_stk(), io_typ(), ac_slip_typ(), is_upd_lot_trace(), is_accrual(), is_accpt(), is_avl(), is_acif_asset_not_mng(), slip_sort_seq(), is_bi_tgt());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MGC_IO_ACT_TYP[] array() {
		if (array == null) {
			array = new MGC_IO_ACT_TYP[] {
					MGC_IO_ACT_TYP.SLS, MGC_IO_ACT_TYP.SLS_RTN_GI, MGC_IO_ACT_TYP.SLS_RTN_GR, MGC_IO_ACT_TYP.SLS_DSCNT, MGC_IO_ACT_TYP.SLS_XTRA, 
					 MGC_IO_ACT_TYP.MFG, MGC_IO_ACT_TYP.BYMFG, MGC_IO_ACT_TYP.INPT, MGC_IO_ACT_TYP.INPT_SLF, MGC_IO_ACT_TYP.LOSS, MGC_IO_ACT_TYP.LOSS_SLF, 
					 MGC_IO_ACT_TYP.PURC_GI, MGC_IO_ACT_TYP.PURC_GR, MGC_IO_ACT_TYP.ACCPT_DFCT_GI, MGC_IO_ACT_TYP.ACCPT_DFCT_GR, MGC_IO_ACT_TYP.PURC_XFR_IN, MGC_IO_ACT_TYP.PURC_XFR_OUT, 
					 MGC_IO_ACT_TYP.ONR_RCV_GI, MGC_IO_ACT_TYP.ONR_RCV_GR, MGC_IO_ACT_TYP.XPNS_PURC_GI, MGC_IO_ACT_TYP.XPNS_PURC_GR, MGC_IO_ACT_TYP.PURC_RTN_GI, MGC_IO_ACT_TYP.PURC_RTN_GR, 
					 MGC_IO_ACT_TYP.ONR_RCV_RET_GI, MGC_IO_ACT_TYP.ONR_RCV_RET_GR, MGC_IO_ACT_TYP.XPNS_PURC_RTN_GI, MGC_IO_ACT_TYP.XPNS_PURC_RTN_GR, MGC_IO_ACT_TYP.PURC_DSCNT, MGC_IO_ACT_TYP.XPNS_PURC_DSCNT, 
					 MGC_IO_ACT_TYP.PURC_XTRA, MGC_IO_ACT_TYP.XPNS_PURC_XTRA, MGC_IO_ACT_TYP.SHIP_OUT, MGC_IO_ACT_TYP.SHIP_IN, MGC_IO_ACT_TYP.EX_SHIP_OUT, MGC_IO_ACT_TYP.EX_SHIP_IN, 
					 MGC_IO_ACT_TYP.SHIP_RTN_GI, MGC_IO_ACT_TYP.SHIP_RTN_GR, MGC_IO_ACT_TYP.XFR_GI, MGC_IO_ACT_TYP.XFR_GR, MGC_IO_ACT_TYP.XFR_RTN_GI, MGC_IO_ACT_TYP.XFR_RTN_GR, 
					 MGC_IO_ACT_TYP.XFR_IN, MGC_IO_ACT_TYP.XFR_OUT, MGC_IO_ACT_TYP.ONR_PROV_GI, MGC_IO_ACT_TYP.ONR_PROV_GR, MGC_IO_ACT_TYP.FFR_PROV_GI, MGC_IO_ACT_TYP.FFR_PROV_GR, 
					 MGC_IO_ACT_TYP.ONR_PROV_RTN_GI, MGC_IO_ACT_TYP.ONR_PROV_RTN_GR, MGC_IO_ACT_TYP.FFR_PROV_RTN_GI, MGC_IO_ACT_TYP.FFR_PROV_RTN_GR, MGC_IO_ACT_TYP.ARR, MGC_IO_ACT_TYP.ARR_CSTSTK, 
					 MGC_IO_ACT_TYP.ARR_RTN, MGC_IO_ACT_TYP.ACXFR_GI, MGC_IO_ACT_TYP.ACXFR_GR, MGC_IO_ACT_TYP.SCRP, MGC_IO_ACT_TYP.XFR_ITM_GI, MGC_IO_ACT_TYP.XFR_ITM_GR, 
					 MGC_IO_ACT_TYP.XFR_LOT_SNO_GI, MGC_IO_ACT_TYP.XFR_LOT_SNO_GR, MGC_IO_ACT_TYP.XFR_GRD_GI, MGC_IO_ACT_TYP.XFR_GRD_GR, MGC_IO_ACT_TYP.XFR_PACK_GI, MGC_IO_ACT_TYP.XFR_PACK_GR, 
					 MGC_IO_ACT_TYP.STK_ADJST_GI, MGC_IO_ACT_TYP.STK_ADJST_GR, MGC_IO_ACT_TYP.INSP_GI, MGC_IO_ACT_TYP.INSP_GR, MGC_IO_ACT_TYP.INSP_CMPL_GI, MGC_IO_ACT_TYP.INSP_CMPL_GR, 
					 MGC_IO_ACT_TYP.INSP_JUDG_GI, MGC_IO_ACT_TYP.INSP_JUDG_GR, MGC_IO_ACT_TYP.REINSP_GI, MGC_IO_ACT_TYP.REINSP_GR, MGC_IO_ACT_TYP.INSP_SMPL_GI, MGC_IO_ACT_TYP.PRDCT_WH_GI, 
					 MGC_IO_ACT_TYP.PRDCT_WH_GR, MGC_IO_ACT_TYP.PRDCT_WH_RTN_GI, MGC_IO_ACT_TYP.PRDCT_WH_RTN_GR, MGC_IO_ACT_TYP.INI_STK, MGC_IO_ACT_TYP.END_STK, MGC_IO_ACT_TYP.WIP, 
					 MGC_IO_ACT_TYP.WK_COST
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
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
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
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
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
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
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
			if(MGC_IO_ACT_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MGC_IO_ACT_TYP me = MGC_IO_ACT_TYP.get(MGC_IO_ACT_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MGC_IO_ACT_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MGC_IO_ACT_TYP.subList(row);
			if (list.isEmpty()) {
				list = MGC_IO_ACT_TYP.list();
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
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
			if(MGC_IO_ACT_TYP.isSameVals(me, cols, vals)){
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
			list = MGC_IO_ACT_TYP.subList(cols, vals);
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
		for (MGC_IO_ACT_TYP me : MGC_IO_ACT_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MGC_IO_ACT_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MGC_IO_ACT_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MGC_IO_ACT_TYP", col);}
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
	protected boolean isSame(MGC_IO_ACT_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 受払区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SLS.isSame(type);
	}

	/**
	 * 受払区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SLS.isSame(type);
	}

	/**
	 * 受払区分：売上返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品出庫の値の場合true
	 */
	public static boolean isSLS_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SLS_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：売上返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品出庫の値の場合true
	 */
	public static boolean isSLS_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SLS_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：売上返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品入庫の値の場合true
	 */
	public static boolean isSLS_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SLS_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：売上返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品入庫の値の場合true
	 */
	public static boolean isSLS_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SLS_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：売上値引かどうか
	 * @param value 定数値
	 * @return 定数値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：売上値引かどうか
	 * @param type 属性値
	 * @return 属性値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：売上値増かどうか
	 * @param value 定数値
	 * @return 定数値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 受払区分：売上値増かどうか
	 * @param type 属性値
	 * @return 属性値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 受払区分：製造かどうか
	 * @param value 定数値
	 * @return 定数値が製造の値の場合true
	 */
	public static boolean isMFG(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.MFG.isSame(type);
	}

	/**
	 * 受払区分：製造かどうか
	 * @param type 属性値
	 * @return 属性値が製造の値の場合true
	 */
	public static boolean isMFG(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.MFG.isSame(type);
	}

	/**
	 * 受払区分：副産品製造かどうか
	 * @param value 定数値
	 * @return 定数値が副産品製造の値の場合true
	 */
	public static boolean isBYMFG(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.BYMFG.isSame(type);
	}

	/**
	 * 受払区分：副産品製造かどうか
	 * @param type 属性値
	 * @return 属性値が副産品製造の値の場合true
	 */
	public static boolean isBYMFG(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.BYMFG.isSame(type);
	}

	/**
	 * 受払区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INPT.isSame(type);
	}

	/**
	 * 受払区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INPT.isSame(type);
	}

	/**
	 * 受払区分：投入（自給）かどうか
	 * @param value 定数値
	 * @return 定数値が投入（自給）の値の場合true
	 */
	public static boolean isINPT_SLF(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INPT_SLF.isSame(type);
	}

	/**
	 * 受払区分：投入（自給）かどうか
	 * @param type 属性値
	 * @return 属性値が投入（自給）の値の場合true
	 */
	public static boolean isINPT_SLF(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INPT_SLF.isSame(type);
	}

	/**
	 * 受払区分：ロスかどうか
	 * @param value 定数値
	 * @return 定数値がロスの値の場合true
	 */
	public static boolean isLOSS(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.LOSS.isSame(type);
	}

	/**
	 * 受払区分：ロスかどうか
	 * @param type 属性値
	 * @return 属性値がロスの値の場合true
	 */
	public static boolean isLOSS(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.LOSS.isSame(type);
	}

	/**
	 * 受払区分：ロス（自給）かどうか
	 * @param value 定数値
	 * @return 定数値がロス（自給）の値の場合true
	 */
	public static boolean isLOSS_SLF(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.LOSS_SLF.isSame(type);
	}

	/**
	 * 受払区分：ロス（自給）かどうか
	 * @param type 属性値
	 * @return 属性値がロス（自給）の値の場合true
	 */
	public static boolean isLOSS_SLF(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.LOSS_SLF.isSame(type);
	}

	/**
	 * 受払区分：仕入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入出庫の値の場合true
	 */
	public static boolean isPURC_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_GI.isSame(type);
	}

	/**
	 * 受払区分：仕入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入出庫の値の場合true
	 */
	public static boolean isPURC_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_GI.isSame(type);
	}

	/**
	 * 受払区分：仕入入庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入入庫の値の場合true
	 */
	public static boolean isPURC_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_GR.isSame(type);
	}

	/**
	 * 受払区分：仕入入庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入入庫の値の場合true
	 */
	public static boolean isPURC_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_GR.isSame(type);
	}

	/**
	 * 受払区分：検収不良出庫かどうか
	 * @param value 定数値
	 * @return 定数値が検収不良出庫の値の場合true
	 */
	public static boolean isACCPT_DFCT_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ACCPT_DFCT_GI.isSame(type);
	}

	/**
	 * 受払区分：検収不良出庫かどうか
	 * @param type 属性値
	 * @return 属性値が検収不良出庫の値の場合true
	 */
	public static boolean isACCPT_DFCT_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ACCPT_DFCT_GI.isSame(type);
	}

	/**
	 * 受払区分：検収不良入庫かどうか
	 * @param value 定数値
	 * @return 定数値が検収不良入庫の値の場合true
	 */
	public static boolean isACCPT_DFCT_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ACCPT_DFCT_GR.isSame(type);
	}

	/**
	 * 受払区分：検収不良入庫かどうか
	 * @param type 属性値
	 * @return 属性値が検収不良入庫の値の場合true
	 */
	public static boolean isACCPT_DFCT_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ACCPT_DFCT_GR.isSame(type);
	}

	/**
	 * 受払区分：仕入転入かどうか
	 * @param value 定数値
	 * @return 定数値が仕入転入の値の場合true
	 */
	public static boolean isPURC_XFR_IN(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_XFR_IN.isSame(type);
	}

	/**
	 * 受払区分：仕入転入かどうか
	 * @param type 属性値
	 * @return 属性値が仕入転入の値の場合true
	 */
	public static boolean isPURC_XFR_IN(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_XFR_IN.isSame(type);
	}

	/**
	 * 受払区分：仕入転出かどうか
	 * @param value 定数値
	 * @return 定数値が仕入転出の値の場合true
	 */
	public static boolean isPURC_XFR_OUT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_XFR_OUT.isSame(type);
	}

	/**
	 * 受払区分：仕入転出かどうか
	 * @param type 属性値
	 * @return 属性値が仕入転出の値の場合true
	 */
	public static boolean isPURC_XFR_OUT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_XFR_OUT.isSame(type);
	}

	/**
	 * 受払区分：有償受給出庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償受給出庫の値の場合true
	 */
	public static boolean isONR_RCV_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_RCV_GI.isSame(type);
	}

	/**
	 * 受払区分：有償受給出庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償受給出庫の値の場合true
	 */
	public static boolean isONR_RCV_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_RCV_GI.isSame(type);
	}

	/**
	 * 受払区分：有償受給入庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償受給入庫の値の場合true
	 */
	public static boolean isONR_RCV_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_RCV_GR.isSame(type);
	}

	/**
	 * 受払区分：有償受給入庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償受給入庫の値の場合true
	 */
	public static boolean isONR_RCV_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_RCV_GR.isSame(type);
	}

	/**
	 * 受払区分：経費購買出庫かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買出庫の値の場合true
	 */
	public static boolean isXPNS_PURC_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_GI.isSame(type);
	}

	/**
	 * 受払区分：経費購買出庫かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買出庫の値の場合true
	 */
	public static boolean isXPNS_PURC_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_GI.isSame(type);
	}

	/**
	 * 受払区分：経費購買入庫かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買入庫の値の場合true
	 */
	public static boolean isXPNS_PURC_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_GR.isSame(type);
	}

	/**
	 * 受払区分：経費購買入庫かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買入庫の値の場合true
	 */
	public static boolean isXPNS_PURC_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_GR.isSame(type);
	}

	/**
	 * 受払区分：仕入返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品出庫の値の場合true
	 */
	public static boolean isPURC_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：仕入返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品出庫の値の場合true
	 */
	public static boolean isPURC_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：仕入返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品入庫の値の場合true
	 */
	public static boolean isPURC_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：仕入返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品入庫の値の場合true
	 */
	public static boolean isPURC_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：有償受給返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償受給返品出庫の値の場合true
	 */
	public static boolean isONR_RCV_RET_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_RCV_RET_GI.isSame(type);
	}

	/**
	 * 受払区分：有償受給返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償受給返品出庫の値の場合true
	 */
	public static boolean isONR_RCV_RET_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_RCV_RET_GI.isSame(type);
	}

	/**
	 * 受払区分：有償受給返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償受給返品入庫の値の場合true
	 */
	public static boolean isONR_RCV_RET_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_RCV_RET_GR.isSame(type);
	}

	/**
	 * 受払区分：有償受給返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償受給返品入庫の値の場合true
	 */
	public static boolean isONR_RCV_RET_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_RCV_RET_GR.isSame(type);
	}

	/**
	 * 受払区分：経費購買返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買返品出庫の値の場合true
	 */
	public static boolean isXPNS_PURC_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：経費購買返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買返品出庫の値の場合true
	 */
	public static boolean isXPNS_PURC_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：経費購買返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買返品入庫の値の場合true
	 */
	public static boolean isXPNS_PURC_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：経費購買返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買返品入庫の値の場合true
	 */
	public static boolean isXPNS_PURC_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：仕入値引かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：仕入値引かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：経費値引かどうか
	 * @param value 定数値
	 * @return 定数値が経費値引の値の場合true
	 */
	public static boolean isXPNS_PURC_DSCNT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：経費値引かどうか
	 * @param type 属性値
	 * @return 属性値が経費値引の値の場合true
	 */
	public static boolean isXPNS_PURC_DSCNT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_DSCNT.isSame(type);
	}

	/**
	 * 受払区分：仕入値増かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 受払区分：仕入値増かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 受払区分：経費値増かどうか
	 * @param value 定数値
	 * @return 定数値が経費値増の値の場合true
	 */
	public static boolean isXPNS_PURC_XTRA(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XPNS_PURC_XTRA.isSame(type);
	}

	/**
	 * 受払区分：経費値増かどうか
	 * @param type 属性値
	 * @return 属性値が経費値増の値の場合true
	 */
	public static boolean isXPNS_PURC_XTRA(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XPNS_PURC_XTRA.isSame(type);
	}

	/**
	 * 受払区分：出荷かどうか
	 * @param value 定数値
	 * @return 定数値が出荷の値の場合true
	 */
	public static boolean isSHIP_OUT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SHIP_OUT.isSame(type);
	}

	/**
	 * 受払区分：出荷かどうか
	 * @param type 属性値
	 * @return 属性値が出荷の値の場合true
	 */
	public static boolean isSHIP_OUT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SHIP_OUT.isSame(type);
	}

	/**
	 * 受払区分：着荷かどうか
	 * @param value 定数値
	 * @return 定数値が着荷の値の場合true
	 */
	public static boolean isSHIP_IN(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SHIP_IN.isSame(type);
	}

	/**
	 * 受払区分：着荷かどうか
	 * @param type 属性値
	 * @return 属性値が着荷の値の場合true
	 */
	public static boolean isSHIP_IN(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SHIP_IN.isSame(type);
	}

	/**
	 * 受払区分：輸出出荷かどうか
	 * @param value 定数値
	 * @return 定数値が輸出出荷の値の場合true
	 */
	public static boolean isEX_SHIP_OUT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.EX_SHIP_OUT.isSame(type);
	}

	/**
	 * 受払区分：輸出出荷かどうか
	 * @param type 属性値
	 * @return 属性値が輸出出荷の値の場合true
	 */
	public static boolean isEX_SHIP_OUT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.EX_SHIP_OUT.isSame(type);
	}

	/**
	 * 受払区分：輸出着荷かどうか
	 * @param value 定数値
	 * @return 定数値が輸出着荷の値の場合true
	 */
	public static boolean isEX_SHIP_IN(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.EX_SHIP_IN.isSame(type);
	}

	/**
	 * 受払区分：輸出着荷かどうか
	 * @param type 属性値
	 * @return 属性値が輸出着荷の値の場合true
	 */
	public static boolean isEX_SHIP_IN(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.EX_SHIP_IN.isSame(type);
	}

	/**
	 * 受払区分：出荷返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品出庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SHIP_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：出荷返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品出庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SHIP_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：出荷返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品入庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SHIP_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：出荷返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品入庫の値の場合true
	 */
	public static boolean isSHIP_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SHIP_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：移動・移送出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送出庫の値の場合true
	 */
	public static boolean isXFR_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_GI.isSame(type);
	}

	/**
	 * 受払区分：移動・移送出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送出庫の値の場合true
	 */
	public static boolean isXFR_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_GI.isSame(type);
	}

	/**
	 * 受払区分：移動・移送入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送入庫の値の場合true
	 */
	public static boolean isXFR_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_GR.isSame(type);
	}

	/**
	 * 受払区分：移動・移送入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送入庫の値の場合true
	 */
	public static boolean isXFR_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_GR.isSame(type);
	}

	/**
	 * 受払区分：移動・移送返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送返品出庫の値の場合true
	 */
	public static boolean isXFR_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：移動・移送返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送返品出庫の値の場合true
	 */
	public static boolean isXFR_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：移動・移送返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が移動・移送返品入庫の値の場合true
	 */
	public static boolean isXFR_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：移動・移送返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が移動・移送返品入庫の値の場合true
	 */
	public static boolean isXFR_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：転入かどうか
	 * @param value 定数値
	 * @return 定数値が転入の値の場合true
	 */
	public static boolean isXFR_IN(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_IN.isSame(type);
	}

	/**
	 * 受払区分：転入かどうか
	 * @param type 属性値
	 * @return 属性値が転入の値の場合true
	 */
	public static boolean isXFR_IN(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_IN.isSame(type);
	}

	/**
	 * 受払区分：転出かどうか
	 * @param value 定数値
	 * @return 定数値が転出の値の場合true
	 */
	public static boolean isXFR_OUT(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_OUT.isSame(type);
	}

	/**
	 * 受払区分：転出かどうか
	 * @param type 属性値
	 * @return 属性値が転出の値の場合true
	 */
	public static boolean isXFR_OUT(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_OUT.isSame(type);
	}

	/**
	 * 受払区分：有償支給出庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給出庫の値の場合true
	 */
	public static boolean isONR_PROV_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_PROV_GI.isSame(type);
	}

	/**
	 * 受払区分：有償支給出庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給出庫の値の場合true
	 */
	public static boolean isONR_PROV_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_PROV_GI.isSame(type);
	}

	/**
	 * 受払区分：有償支給入庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給入庫の値の場合true
	 */
	public static boolean isONR_PROV_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_PROV_GR.isSame(type);
	}

	/**
	 * 受払区分：有償支給入庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給入庫の値の場合true
	 */
	public static boolean isONR_PROV_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_PROV_GR.isSame(type);
	}

	/**
	 * 受払区分：無償支給出庫かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給出庫の値の場合true
	 */
	public static boolean isFFR_PROV_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.FFR_PROV_GI.isSame(type);
	}

	/**
	 * 受払区分：無償支給出庫かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給出庫の値の場合true
	 */
	public static boolean isFFR_PROV_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.FFR_PROV_GI.isSame(type);
	}

	/**
	 * 受払区分：無償支給入庫かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給入庫の値の場合true
	 */
	public static boolean isFFR_PROV_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.FFR_PROV_GR.isSame(type);
	}

	/**
	 * 受払区分：無償支給入庫かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給入庫の値の場合true
	 */
	public static boolean isFFR_PROV_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.FFR_PROV_GR.isSame(type);
	}

	/**
	 * 受払区分：有償支給返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給返品出庫の値の場合true
	 */
	public static boolean isONR_PROV_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_PROV_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：有償支給返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給返品出庫の値の場合true
	 */
	public static boolean isONR_PROV_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_PROV_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：有償支給返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給返品入庫の値の場合true
	 */
	public static boolean isONR_PROV_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ONR_PROV_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：有償支給返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給返品入庫の値の場合true
	 */
	public static boolean isONR_PROV_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ONR_PROV_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：無償支給返品出庫かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給返品出庫の値の場合true
	 */
	public static boolean isFFR_PROV_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.FFR_PROV_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：無償支給返品出庫かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給返品出庫の値の場合true
	 */
	public static boolean isFFR_PROV_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.FFR_PROV_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：無償支給返品入庫かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給返品入庫の値の場合true
	 */
	public static boolean isFFR_PROV_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.FFR_PROV_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：無償支給返品入庫かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給返品入庫の値の場合true
	 */
	public static boolean isFFR_PROV_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.FFR_PROV_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：入荷かどうか
	 * @param value 定数値
	 * @return 定数値が入荷の値の場合true
	 */
	public static boolean isARR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ARR.isSame(type);
	}

	/**
	 * 受払区分：入荷かどうか
	 * @param type 属性値
	 * @return 属性値が入荷の値の場合true
	 */
	public static boolean isARR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ARR.isSame(type);
	}

	/**
	 * 受払区分：預り入庫かどうか
	 * @param value 定数値
	 * @return 定数値が預り入庫の値の場合true
	 */
	public static boolean isARR_CSTSTK(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ARR_CSTSTK.isSame(type);
	}

	/**
	 * 受払区分：預り入庫かどうか
	 * @param type 属性値
	 * @return 属性値が預り入庫の値の場合true
	 */
	public static boolean isARR_CSTSTK(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ARR_CSTSTK.isSame(type);
	}

	/**
	 * 受払区分：入荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 受払区分：入荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が入荷返品の値の場合true
	 */
	public static boolean isARR_RTN(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ARR_RTN.isSame(type);
	}

	/**
	 * 受払区分：他勘定振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替出庫の値の場合true
	 */
	public static boolean isACXFR_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ACXFR_GI.isSame(type);
	}

	/**
	 * 受払区分：他勘定振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替出庫の値の場合true
	 */
	public static boolean isACXFR_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ACXFR_GI.isSame(type);
	}

	/**
	 * 受払区分：他勘定振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替入庫の値の場合true
	 */
	public static boolean isACXFR_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.ACXFR_GR.isSame(type);
	}

	/**
	 * 受払区分：他勘定振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替入庫の値の場合true
	 */
	public static boolean isACXFR_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.ACXFR_GR.isSame(type);
	}

	/**
	 * 受払区分：廃棄かどうか
	 * @param value 定数値
	 * @return 定数値が廃棄の値の場合true
	 */
	public static boolean isSCRP(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.SCRP.isSame(type);
	}

	/**
	 * 受払区分：廃棄かどうか
	 * @param type 属性値
	 * @return 属性値が廃棄の値の場合true
	 */
	public static boolean isSCRP(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.SCRP.isSame(type);
	}

	/**
	 * 受払区分：品目振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が品目振替出庫の値の場合true
	 */
	public static boolean isXFR_ITM_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_ITM_GI.isSame(type);
	}

	/**
	 * 受払区分：品目振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が品目振替出庫の値の場合true
	 */
	public static boolean isXFR_ITM_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_ITM_GI.isSame(type);
	}

	/**
	 * 受払区分：品目振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が品目振替入庫の値の場合true
	 */
	public static boolean isXFR_ITM_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_ITM_GR.isSame(type);
	}

	/**
	 * 受払区分：品目振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が品目振替入庫の値の場合true
	 */
	public static boolean isXFR_ITM_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_ITM_GR.isSame(type);
	}

	/**
	 * 受払区分：ロット・手配ＮＯ振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値がロット・手配ＮＯ振替出庫の値の場合true
	 */
	public static boolean isXFR_LOT_SNO_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_LOT_SNO_GI.isSame(type);
	}

	/**
	 * 受払区分：ロット・手配ＮＯ振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値がロット・手配ＮＯ振替出庫の値の場合true
	 */
	public static boolean isXFR_LOT_SNO_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_LOT_SNO_GI.isSame(type);
	}

	/**
	 * 受払区分：ロット・手配ＮＯ振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値がロット・手配ＮＯ振替入庫の値の場合true
	 */
	public static boolean isXFR_LOT_SNO_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_LOT_SNO_GR.isSame(type);
	}

	/**
	 * 受払区分：ロット・手配ＮＯ振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値がロット・手配ＮＯ振替入庫の値の場合true
	 */
	public static boolean isXFR_LOT_SNO_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_LOT_SNO_GR.isSame(type);
	}

	/**
	 * 受払区分：格付・良品区分振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が格付・良品区分振替出庫の値の場合true
	 */
	public static boolean isXFR_GRD_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_GRD_GI.isSame(type);
	}

	/**
	 * 受払区分：格付・良品区分振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が格付・良品区分振替出庫の値の場合true
	 */
	public static boolean isXFR_GRD_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_GRD_GI.isSame(type);
	}

	/**
	 * 受払区分：格付・良品区分振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が格付・良品区分振替入庫の値の場合true
	 */
	public static boolean isXFR_GRD_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_GRD_GR.isSame(type);
	}

	/**
	 * 受払区分：格付・良品区分振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が格付・良品区分振替入庫の値の場合true
	 */
	public static boolean isXFR_GRD_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_GRD_GR.isSame(type);
	}

	/**
	 * 受払区分：荷姿振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が荷姿振替出庫の値の場合true
	 */
	public static boolean isXFR_PACK_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_PACK_GI.isSame(type);
	}

	/**
	 * 受払区分：荷姿振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が荷姿振替出庫の値の場合true
	 */
	public static boolean isXFR_PACK_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_PACK_GI.isSame(type);
	}

	/**
	 * 受払区分：荷姿振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が荷姿振替入庫の値の場合true
	 */
	public static boolean isXFR_PACK_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.XFR_PACK_GR.isSame(type);
	}

	/**
	 * 受払区分：荷姿振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が荷姿振替入庫の値の場合true
	 */
	public static boolean isXFR_PACK_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.XFR_PACK_GR.isSame(type);
	}

	/**
	 * 受払区分：棚卸差異減耗かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸差異減耗の値の場合true
	 */
	public static boolean isSTK_ADJST_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.STK_ADJST_GI.isSame(type);
	}

	/**
	 * 受払区分：棚卸差異減耗かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸差異減耗の値の場合true
	 */
	public static boolean isSTK_ADJST_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.STK_ADJST_GI.isSame(type);
	}

	/**
	 * 受払区分：棚卸差異増耗かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸差異増耗の値の場合true
	 */
	public static boolean isSTK_ADJST_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.STK_ADJST_GR.isSame(type);
	}

	/**
	 * 受払区分：棚卸差異増耗かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸差異増耗の値の場合true
	 */
	public static boolean isSTK_ADJST_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.STK_ADJST_GR.isSame(type);
	}

	/**
	 * 受払区分：検査出庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査出庫の値の場合true
	 */
	public static boolean isINSP_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_GI.isSame(type);
	}

	/**
	 * 受払区分：検査出庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査出庫の値の場合true
	 */
	public static boolean isINSP_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_GI.isSame(type);
	}

	/**
	 * 受払区分：検査入庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査入庫の値の場合true
	 */
	public static boolean isINSP_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_GR.isSame(type);
	}

	/**
	 * 受払区分：検査入庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査入庫の値の場合true
	 */
	public static boolean isINSP_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_GR.isSame(type);
	}

	/**
	 * 受払区分：検査完了出庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了出庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_CMPL_GI.isSame(type);
	}

	/**
	 * 受払区分：検査完了出庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了出庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_CMPL_GI.isSame(type);
	}

	/**
	 * 受払区分：検査完了入庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査完了入庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_CMPL_GR.isSame(type);
	}

	/**
	 * 受払区分：検査完了入庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査完了入庫の値の場合true
	 */
	public static boolean isINSP_CMPL_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_CMPL_GR.isSame(type);
	}

	/**
	 * 受払区分：検査判定出庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査判定出庫の値の場合true
	 */
	public static boolean isINSP_JUDG_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_JUDG_GI.isSame(type);
	}

	/**
	 * 受払区分：検査判定出庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査判定出庫の値の場合true
	 */
	public static boolean isINSP_JUDG_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_JUDG_GI.isSame(type);
	}

	/**
	 * 受払区分：検査判定入庫かどうか
	 * @param value 定数値
	 * @return 定数値が検査判定入庫の値の場合true
	 */
	public static boolean isINSP_JUDG_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_JUDG_GR.isSame(type);
	}

	/**
	 * 受払区分：検査判定入庫かどうか
	 * @param type 属性値
	 * @return 属性値が検査判定入庫の値の場合true
	 */
	public static boolean isINSP_JUDG_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_JUDG_GR.isSame(type);
	}

	/**
	 * 受払区分：再検査出庫かどうか
	 * @param value 定数値
	 * @return 定数値が再検査出庫の値の場合true
	 */
	public static boolean isREINSP_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.REINSP_GI.isSame(type);
	}

	/**
	 * 受払区分：再検査出庫かどうか
	 * @param type 属性値
	 * @return 属性値が再検査出庫の値の場合true
	 */
	public static boolean isREINSP_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.REINSP_GI.isSame(type);
	}

	/**
	 * 受払区分：再検査入庫かどうか
	 * @param value 定数値
	 * @return 定数値が再検査入庫の値の場合true
	 */
	public static boolean isREINSP_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.REINSP_GR.isSame(type);
	}

	/**
	 * 受払区分：再検査入庫かどうか
	 * @param type 属性値
	 * @return 属性値が再検査入庫の値の場合true
	 */
	public static boolean isREINSP_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.REINSP_GR.isSame(type);
	}

	/**
	 * 受払区分：検査抜取かどうか
	 * @param value 定数値
	 * @return 定数値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INSP_SMPL_GI.isSame(type);
	}

	/**
	 * 受払区分：検査抜取かどうか
	 * @param type 属性値
	 * @return 属性値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INSP_SMPL_GI.isSame(type);
	}

	/**
	 * 受払区分：倉入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が倉入出庫の値の場合true
	 */
	public static boolean isPRDCT_WH_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PRDCT_WH_GI.isSame(type);
	}

	/**
	 * 受払区分：倉入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が倉入出庫の値の場合true
	 */
	public static boolean isPRDCT_WH_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PRDCT_WH_GI.isSame(type);
	}

	/**
	 * 受払区分：倉入入庫かどうか
	 * @param value 定数値
	 * @return 定数値が倉入入庫の値の場合true
	 */
	public static boolean isPRDCT_WH_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PRDCT_WH_GR.isSame(type);
	}

	/**
	 * 受払区分：倉入入庫かどうか
	 * @param type 属性値
	 * @return 属性値が倉入入庫の値の場合true
	 */
	public static boolean isPRDCT_WH_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PRDCT_WH_GR.isSame(type);
	}

	/**
	 * 受払区分：戻入出庫かどうか
	 * @param value 定数値
	 * @return 定数値が戻入出庫の値の場合true
	 */
	public static boolean isPRDCT_WH_RTN_GI(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PRDCT_WH_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：戻入出庫かどうか
	 * @param type 属性値
	 * @return 属性値が戻入出庫の値の場合true
	 */
	public static boolean isPRDCT_WH_RTN_GI(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PRDCT_WH_RTN_GI.isSame(type);
	}

	/**
	 * 受払区分：戻入入庫かどうか
	 * @param value 定数値
	 * @return 定数値が戻入入庫の値の場合true
	 */
	public static boolean isPRDCT_WH_RTN_GR(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.PRDCT_WH_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：戻入入庫かどうか
	 * @param type 属性値
	 * @return 属性値が戻入入庫の値の場合true
	 */
	public static boolean isPRDCT_WH_RTN_GR(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.PRDCT_WH_RTN_GR.isSame(type);
	}

	/**
	 * 受払区分：月初在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月初在庫の値の場合true
	 */
	public static boolean isINI_STK(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.INI_STK.isSame(type);
	}

	/**
	 * 受払区分：月初在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月初在庫の値の場合true
	 */
	public static boolean isINI_STK(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.INI_STK.isSame(type);
	}

	/**
	 * 受払区分：月末在庫かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払区分：月末在庫かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫の値の場合true
	 */
	public static boolean isEND_STK(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.END_STK.isSame(type);
	}

	/**
	 * 受払区分：仕掛かどうか
	 * @param value 定数値
	 * @return 定数値が仕掛の値の場合true
	 */
	public static boolean isWIP(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.WIP.isSame(type);
	}

	/**
	 * 受払区分：仕掛かどうか
	 * @param type 属性値
	 * @return 属性値が仕掛の値の場合true
	 */
	public static boolean isWIP(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.WIP.isSame(type);
	}

	/**
	 * 受払区分：工数かどうか
	 * @param value 定数値
	 * @return 定数値が工数の値の場合true
	 */
	public static boolean isWK_COST(String value) {
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
		return MGC_IO_ACT_TYP.WK_COST.isSame(type);
	}

	/**
	 * 受払区分：工数かどうか
	 * @param type 属性値
	 * @return 属性値が工数の値の場合true
	 */
	public static boolean isWK_COST(MGC_IO_ACT_TYP type) {
		return MGC_IO_ACT_TYP.WK_COST.isSame(type);
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
			MGC_IO_ACT_TYP.putName(r, valueColumn, nameColumn);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.get(value);
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
			MGC_IO_ACT_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
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
			MGC_IO_ACT_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.get(value);
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
			MGC_IO_ACT_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
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
			MGC_IO_ACT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.get(value);
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
			MGC_IO_ACT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
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
			MGC_IO_ACT_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.get(value);
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
			MGC_IO_ACT_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_IO_ACT_TYP type = MGC_IO_ACT_TYP.getNE(value);
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
