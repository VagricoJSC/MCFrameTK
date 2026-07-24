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
abstract class MAC_JNL_KEY_SET_COL_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "JNL_KEY_SET_COL_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_JNL_KEY_SET_COL_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "jnl_key_set_col_typ";

	public static final String $NAME = "jnl_key_set_col_typ_nm";

	public static final String $IS_IO = "is_io";

	public static final String $IS_RCV = "is_rcv";

	public static final String $IS_STK = "is_stk";

	public static final String $IS_COST = "is_cost";

	public static final String $IS_BP = "is_bp";

	public static final String $IS_BP_GRP = "is_bp_grp";

	public static final String $IS_PAY = "is_pay";

	/*
	 * 定数の定義です。
	 */
	/** 仕訳キー設定項目区分：ワーキンググループ
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP WG_CD = create("101", "WG_CD", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：購買部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP PURC_DPT_CD = create("201", "PURC_DPT_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：債務部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP AP_DPT_CD = create("202", "AP_DPT_CD", true, false, false, true, false, false, true);

	/** 仕訳キー設定項目区分：売上部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SLS_DPT_CD = create("203", "SLS_DPT_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：債権部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP AR_DPT_CD = create("204", "AR_DPT_CD", true, true, false, true, false, false, false);

	/** 仕訳キー設定項目区分：入金部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP RCV_DPT_CD = create("205", "RCV_DPT_CD", false, true, false, false, false, false, false);

	/** 仕訳キー設定項目区分：相殺部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SO_DPT_CD = create("206", "SO_DPT_CD", false, true, false, false, false, false, true);

	/** 仕訳キー設定項目区分：出庫部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP GI_DPT_CD = create("207", "GI_DPT_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：入庫部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP GR_DPT_CD = create("208", "GR_DPT_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：負担部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BD_DPT_CD = create("209", "BD_DPT_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP DPT_CD = create("210", "DPT_CD", false, false, true, false, false, false, false);

	/** 仕訳キー設定項目区分：予備部門１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_DPT_CD1 = create("211", "SUB_DPT_CD1", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備部門２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_DPT_CD2 = create("212", "SUB_DPT_CD2", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備部門３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_DPT_CD3 = create("213", "SUB_DPT_CD3", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：場所
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP LOC_CD = create("301", "LOC_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：棚・ライン
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP STR_LN_CD = create("302", "STR_LN_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：売掛先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ACST_CD = create("401", "ACST_CD", true, true, false, false, true, false, false);

	/** 仕訳キー設定項目区分：得意先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP CST_CD = create("402", "CST_CD", true, false, false, true, true, false, false);

	/** 仕訳キー設定項目区分：買掛先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ASPPL_CD = create("403", "ASPPL_CD", true, false, false, false, true, false, true);

	/** 仕訳キー設定項目区分：発注先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SPPL_CD = create("404", "SPPL_CD", true, false, false, true, true, false, false);

	/** 仕訳キー設定項目区分：在庫保管先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP INV_COM_CD = create("405", "INV_COM_CD", false, false, true, true, true, false, false);

	/** 仕訳キー設定項目区分：入金先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP RCST_CD = create("406", "RCST_CD", false, true, false, false, true, false, false);

	/** 仕訳キー設定項目区分：相殺先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SETOFF_CD = create("407", "SETOFF_CD", false, true, false, false, true, false, true);

	/** 仕訳キー設定項目区分：会計品目分類
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP AC_ITM_GRP_CD = create("501", "AC_ITM_GRP_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_CD = create("502", "ITM_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：枝番１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_SUB1 = create("503", "ITM_SUB1", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：枝番２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_SUB2 = create("504", "ITM_SUB2", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：枝番３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_SUB3 = create("505", "ITM_SUB3", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：手配ＮＯ１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SNO1 = create("506", "SNO1", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：手配ＮＯ２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SNO2 = create("507", "SNO2", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：手配ＮＯ３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SNO3 = create("508", "SNO3", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：手配ＮＯ４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SNO4 = create("509", "SNO4", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD1 = create("551", "ITM_GRP_CD1", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD2 = create("552", "ITM_GRP_CD2", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD3 = create("553", "ITM_GRP_CD3", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD4 = create("554", "ITM_GRP_CD4", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類５
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD5 = create("555", "ITM_GRP_CD5", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類６
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD6 = create("556", "ITM_GRP_CD6", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類７
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD7 = create("557", "ITM_GRP_CD7", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類８
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD8 = create("558", "ITM_GRP_CD8", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類９
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD9 = create("559", "ITM_GRP_CD9", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：品目分類１０
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ITM_GRP_CD10 = create("560", "ITM_GRP_CD10", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先会計品目分類
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_AC_ITM_GRP_CD = create("601", "TRD_AC_ITM_GRP_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目仕訳
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_JNL_CD = create("602", "TRD_ITM_JNL_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_CD = create("603", "TRD_ITM_CD", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先枝番１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_SUB1 = create("604", "TRD_ITM_SUB1", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先枝番２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_SUB2 = create("605", "TRD_ITM_SUB2", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先枝番３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_SUB3 = create("606", "TRD_ITM_SUB3", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先手配ＮＯ１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_SNO1 = create("607", "TRD_SNO1", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先手配ＮＯ２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_SNO2 = create("608", "TRD_SNO2", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先手配ＮＯ３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_SNO3 = create("609", "TRD_SNO3", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先手配ＮＯ４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_SNO4 = create("610", "TRD_SNO4", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD1 = create("651", "TRD_ITM_GRP_CD1", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD2 = create("652", "TRD_ITM_GRP_CD2", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD3 = create("653", "TRD_ITM_GRP_CD3", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD4 = create("654", "TRD_ITM_GRP_CD4", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類５
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD5 = create("655", "TRD_ITM_GRP_CD5", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類６
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD6 = create("656", "TRD_ITM_GRP_CD6", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類７
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD7 = create("657", "TRD_ITM_GRP_CD7", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類８
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD8 = create("658", "TRD_ITM_GRP_CD8", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類９
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD9 = create("659", "TRD_ITM_GRP_CD9", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：振替先品目分類１０
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_ITM_GRP_CD10 = create("660", "TRD_ITM_GRP_CD10", true, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：地域
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP AREA_CD = create("701", "AREA_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：国
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP CNTRY_CD = create("702", "CNTRY_CD", true, false, true, true, false, false, false);

	/** 仕訳キー設定項目区分：税
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TAX_CD = create("703", "TAX_CD", true, true, false, false, false, false, true);

	/** 仕訳キー設定項目区分：配賦科目
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP ALC_AC_CD = create("704", "ALC_AC_CD", false, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：配賦元配賦科目
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SRC_ALC_AC_CD = create("705", "SRC_ALC_AC_CD", false, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：格付
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP GD_CD = create("706", "GD_CD", true, false, true, false, false, false, false);

	/** 仕訳キー設定項目区分：取引先分類１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD1 = create("801", "BP_GRP_CD1", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD2 = create("802", "BP_GRP_CD2", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD3 = create("803", "BP_GRP_CD3", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD4 = create("804", "BP_GRP_CD4", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類５
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD5 = create("805", "BP_GRP_CD5", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類６
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD6 = create("806", "BP_GRP_CD6", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類７
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD7 = create("807", "BP_GRP_CD7", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類８
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD8 = create("808", "BP_GRP_CD8", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類９
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD9 = create("809", "BP_GRP_CD9", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：取引先分類１０
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BP_GRP_CD10 = create("810", "BP_GRP_CD10", true, true, true, true, false, true, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目１
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR1 = create("901", "SUB_CHAR1", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目２
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR2 = create("902", "SUB_CHAR2", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目３
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR3 = create("903", "SUB_CHAR3", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目４
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR4 = create("904", "SUB_CHAR4", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目５
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR5 = create("905", "SUB_CHAR5", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目６
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR6 = create("906", "SUB_CHAR6", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目７
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR7 = create("907", "SUB_CHAR7", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目８
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR8 = create("908", "SUB_CHAR8", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目９
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR9 = create("909", "SUB_CHAR9", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：予備ＣＨＡＲ項目１０
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP SUB_CHAR10 = create("910", "SUB_CHAR10", true, true, true, true, false, false, true);

	/** 仕訳キー設定項目区分：支払部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP PAY_DPT_CD = create("214", "PAY_DPT_CD", false, false, false, false, false, false, true);

	/** 仕訳キー設定項目区分：支払予定管理先部門
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BSPPL_DPT_CD = create("215", "BSPPL_DPT_CD", false, false, false, false, false, false, true);

	/** 仕訳キー設定項目区分：支払先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP PSPPL_CD = create("408", "PSPPL_CD", false, false, false, false, true, false, true);

	/** 仕訳キー設定項目区分：支払予定管理先
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP BSPPL_CD = create("409", "BSPPL_CD", false, false, false, false, true, false, true);

	/** 仕訳キー設定項目区分：費目
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP EXPNS_CD = create("707", "EXPNS_CD", false, false, false, true, false, false, false);

	/** 仕訳キー設定項目区分：取引
	 */
	public static final MAC_JNL_KEY_SET_COL_TYP TRD_CD = create("708", "TRD_CD", true, false, false, false, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_JNL_KEY_SET_COL_TYP create() {
		return new MAC_JNL_KEY_SET_COL_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_JNL_KEY_SET_COL_TYP get(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if (type == null) {
			throw MAC_JNL_KEY_SET_COL_TYP.invalidValue(value);
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
	public static MAC_JNL_KEY_SET_COL_TYP getNE(String value) {
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_JNL_KEY_SET_COL_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_IO, attr1);
		me.constR.addBooleanColumn($IS_RCV, attr2);
		me.constR.addBooleanColumn($IS_STK, attr3);
		me.constR.addBooleanColumn($IS_COST, attr4);
		me.constR.addBooleanColumn($IS_BP, attr5);
		me.constR.addBooleanColumn($IS_BP_GRP, attr6);
		me.constR.addBooleanColumn($IS_PAY, attr7);
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
	 * is_ioの値を返します。
	 * @return is_ioの値
	 */
	public boolean is_io() {
		return constR.getBooleanNE($IS_IO);
	}

	/** 
	 * valueに対応する定数のis_ioの値を返します。
	 * @param value 定数値
	 * @return is_ioの値
	 */
	public static boolean is_io(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_io();
	}

	/** 
	 * is_rcvの値を返します。
	 * @return is_rcvの値
	 */
	public boolean is_rcv() {
		return constR.getBooleanNE($IS_RCV);
	}

	/** 
	 * valueに対応する定数のis_rcvの値を返します。
	 * @param value 定数値
	 * @return is_rcvの値
	 */
	public static boolean is_rcv(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_rcv();
	}

	/** 
	 * is_stkの値を返します。
	 * @return is_stkの値
	 */
	public boolean is_stk() {
		return constR.getBooleanNE($IS_STK);
	}

	/** 
	 * valueに対応する定数のis_stkの値を返します。
	 * @param value 定数値
	 * @return is_stkの値
	 */
	public static boolean is_stk(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_stk();
	}

	/** 
	 * is_costの値を返します。
	 * @return is_costの値
	 */
	public boolean is_cost() {
		return constR.getBooleanNE($IS_COST);
	}

	/** 
	 * valueに対応する定数のis_costの値を返します。
	 * @param value 定数値
	 * @return is_costの値
	 */
	public static boolean is_cost(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_cost();
	}

	/** 
	 * is_bpの値を返します。
	 * @return is_bpの値
	 */
	public boolean is_bp() {
		return constR.getBooleanNE($IS_BP);
	}

	/** 
	 * valueに対応する定数のis_bpの値を返します。
	 * @param value 定数値
	 * @return is_bpの値
	 */
	public static boolean is_bp(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_bp();
	}

	/** 
	 * is_bp_grpの値を返します。
	 * @return is_bp_grpの値
	 */
	public boolean is_bp_grp() {
		return constR.getBooleanNE($IS_BP_GRP);
	}

	/** 
	 * valueに対応する定数のis_bp_grpの値を返します。
	 * @param value 定数値
	 * @return is_bp_grpの値
	 */
	public static boolean is_bp_grp(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_bp_grp();
	}

	/** 
	 * is_payの値を返します。
	 * @return is_payの値
	 */
	public boolean is_pay() {
		return constR.getBooleanNE($IS_PAY);
	}

	/** 
	 * valueに対応する定数のis_payの値を返します。
	 * @param value 定数値
	 * @return is_payの値
	 */
	public static boolean is_pay(String value) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_pay();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		if (me == null) {
			throw MAC_JNL_KEY_SET_COL_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_io(), is_rcv(), is_stk(), is_cost(), is_bp(), is_bp_grp(), is_pay());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_JNL_KEY_SET_COL_TYP[] array() {
		if (array == null) {
			array = new MAC_JNL_KEY_SET_COL_TYP[] {
					MAC_JNL_KEY_SET_COL_TYP.WG_CD, MAC_JNL_KEY_SET_COL_TYP.PURC_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.AP_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.SLS_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.AR_DPT_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.RCV_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.SO_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.GI_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.GR_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.BD_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.DPT_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD1, MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD2, MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD3, MAC_JNL_KEY_SET_COL_TYP.LOC_CD, MAC_JNL_KEY_SET_COL_TYP.STR_LN_CD, MAC_JNL_KEY_SET_COL_TYP.ACST_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.CST_CD, MAC_JNL_KEY_SET_COL_TYP.ASPPL_CD, MAC_JNL_KEY_SET_COL_TYP.SPPL_CD, MAC_JNL_KEY_SET_COL_TYP.INV_COM_CD, MAC_JNL_KEY_SET_COL_TYP.RCST_CD, MAC_JNL_KEY_SET_COL_TYP.SETOFF_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.AC_ITM_GRP_CD, MAC_JNL_KEY_SET_COL_TYP.ITM_CD, MAC_JNL_KEY_SET_COL_TYP.ITM_SUB1, MAC_JNL_KEY_SET_COL_TYP.ITM_SUB2, MAC_JNL_KEY_SET_COL_TYP.ITM_SUB3, MAC_JNL_KEY_SET_COL_TYP.SNO1, 
					 MAC_JNL_KEY_SET_COL_TYP.SNO2, MAC_JNL_KEY_SET_COL_TYP.SNO3, MAC_JNL_KEY_SET_COL_TYP.SNO4, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD1, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD2, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD3, 
					 MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD4, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD5, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD6, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD7, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD8, MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD9, 
					 MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD10, MAC_JNL_KEY_SET_COL_TYP.TRD_AC_ITM_GRP_CD, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_JNL_CD, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_CD, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB1, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB2, 
					 MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB3, MAC_JNL_KEY_SET_COL_TYP.TRD_SNO1, MAC_JNL_KEY_SET_COL_TYP.TRD_SNO2, MAC_JNL_KEY_SET_COL_TYP.TRD_SNO3, MAC_JNL_KEY_SET_COL_TYP.TRD_SNO4, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD1, 
					 MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD2, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD3, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD4, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD5, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD6, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD7, 
					 MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD8, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD9, MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD10, MAC_JNL_KEY_SET_COL_TYP.AREA_CD, MAC_JNL_KEY_SET_COL_TYP.CNTRY_CD, MAC_JNL_KEY_SET_COL_TYP.TAX_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.ALC_AC_CD, MAC_JNL_KEY_SET_COL_TYP.SRC_ALC_AC_CD, MAC_JNL_KEY_SET_COL_TYP.GD_CD, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD1, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD2, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD3, 
					 MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD4, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD5, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD6, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD7, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD8, MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD9, 
					 MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD10, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR1, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR2, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR3, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR4, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR5, 
					 MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR6, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR7, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR8, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR9, MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR10, MAC_JNL_KEY_SET_COL_TYP.PAY_DPT_CD, 
					 MAC_JNL_KEY_SET_COL_TYP.BSPPL_DPT_CD, MAC_JNL_KEY_SET_COL_TYP.PSPPL_CD, MAC_JNL_KEY_SET_COL_TYP.BSPPL_CD, MAC_JNL_KEY_SET_COL_TYP.EXPNS_CD, MAC_JNL_KEY_SET_COL_TYP.TRD_CD
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
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
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
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
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
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
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
			if(MAC_JNL_KEY_SET_COL_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_JNL_KEY_SET_COL_TYP me = MAC_JNL_KEY_SET_COL_TYP.get(MAC_JNL_KEY_SET_COL_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_JNL_KEY_SET_COL_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_JNL_KEY_SET_COL_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_JNL_KEY_SET_COL_TYP.list();
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
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
			if(MAC_JNL_KEY_SET_COL_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_JNL_KEY_SET_COL_TYP.subList(cols, vals);
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
		for (MAC_JNL_KEY_SET_COL_TYP me : MAC_JNL_KEY_SET_COL_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_JNL_KEY_SET_COL_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_JNL_KEY_SET_COL_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_JNL_KEY_SET_COL_TYP", col);}
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
	protected boolean isSame(MAC_JNL_KEY_SET_COL_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 仕訳キー設定項目区分：ワーキンググループかどうか
	 * @param value 定数値
	 * @return 定数値がワーキンググループの値の場合true
	 */
	public static boolean isWG_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.WG_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：ワーキンググループかどうか
	 * @param type 属性値
	 * @return 属性値がワーキンググループの値の場合true
	 */
	public static boolean isWG_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.WG_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：購買部門かどうか
	 * @param value 定数値
	 * @return 定数値が購買部門の値の場合true
	 */
	public static boolean isPURC_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.PURC_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：購買部門かどうか
	 * @param type 属性値
	 * @return 属性値が購買部門の値の場合true
	 */
	public static boolean isPURC_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.PURC_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：債務部門かどうか
	 * @param value 定数値
	 * @return 定数値が債務部門の値の場合true
	 */
	public static boolean isAP_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.AP_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：債務部門かどうか
	 * @param type 属性値
	 * @return 属性値が債務部門の値の場合true
	 */
	public static boolean isAP_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.AP_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：売上部門かどうか
	 * @param value 定数値
	 * @return 定数値が売上部門の値の場合true
	 */
	public static boolean isSLS_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SLS_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：売上部門かどうか
	 * @param type 属性値
	 * @return 属性値が売上部門の値の場合true
	 */
	public static boolean isSLS_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SLS_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：債権部門かどうか
	 * @param value 定数値
	 * @return 定数値が債権部門の値の場合true
	 */
	public static boolean isAR_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.AR_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：債権部門かどうか
	 * @param type 属性値
	 * @return 属性値が債権部門の値の場合true
	 */
	public static boolean isAR_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.AR_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入金部門かどうか
	 * @param value 定数値
	 * @return 定数値が入金部門の値の場合true
	 */
	public static boolean isRCV_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.RCV_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入金部門かどうか
	 * @param type 属性値
	 * @return 属性値が入金部門の値の場合true
	 */
	public static boolean isRCV_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.RCV_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：相殺部門かどうか
	 * @param value 定数値
	 * @return 定数値が相殺部門の値の場合true
	 */
	public static boolean isSO_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SO_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：相殺部門かどうか
	 * @param type 属性値
	 * @return 属性値が相殺部門の値の場合true
	 */
	public static boolean isSO_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SO_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：出庫部門かどうか
	 * @param value 定数値
	 * @return 定数値が出庫部門の値の場合true
	 */
	public static boolean isGI_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.GI_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：出庫部門かどうか
	 * @param type 属性値
	 * @return 属性値が出庫部門の値の場合true
	 */
	public static boolean isGI_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.GI_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入庫部門かどうか
	 * @param value 定数値
	 * @return 定数値が入庫部門の値の場合true
	 */
	public static boolean isGR_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.GR_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入庫部門かどうか
	 * @param type 属性値
	 * @return 属性値が入庫部門の値の場合true
	 */
	public static boolean isGR_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.GR_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：負担部門かどうか
	 * @param value 定数値
	 * @return 定数値が負担部門の値の場合true
	 */
	public static boolean isBD_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BD_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：負担部門かどうか
	 * @param type 属性値
	 * @return 属性値が負担部門の値の場合true
	 */
	public static boolean isBD_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BD_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：部門かどうか
	 * @param value 定数値
	 * @return 定数値が部門の値の場合true
	 */
	public static boolean isDPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：部門かどうか
	 * @param type 属性値
	 * @return 属性値が部門の値の場合true
	 */
	public static boolean isDPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門１かどうか
	 * @param value 定数値
	 * @return 定数値が予備部門１の値の場合true
	 */
	public static boolean isSUB_DPT_CD1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門１かどうか
	 * @param type 属性値
	 * @return 属性値が予備部門１の値の場合true
	 */
	public static boolean isSUB_DPT_CD1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門２かどうか
	 * @param value 定数値
	 * @return 定数値が予備部門２の値の場合true
	 */
	public static boolean isSUB_DPT_CD2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門２かどうか
	 * @param type 属性値
	 * @return 属性値が予備部門２の値の場合true
	 */
	public static boolean isSUB_DPT_CD2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門３かどうか
	 * @param value 定数値
	 * @return 定数値が予備部門３の値の場合true
	 */
	public static boolean isSUB_DPT_CD3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備部門３かどうか
	 * @param type 属性値
	 * @return 属性値が予備部門３の値の場合true
	 */
	public static boolean isSUB_DPT_CD3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_DPT_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：場所かどうか
	 * @param value 定数値
	 * @return 定数値が場所の値の場合true
	 */
	public static boolean isLOC_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.LOC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：場所かどうか
	 * @param type 属性値
	 * @return 属性値が場所の値の場合true
	 */
	public static boolean isLOC_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.LOC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：棚・ラインかどうか
	 * @param value 定数値
	 * @return 定数値が棚・ラインの値の場合true
	 */
	public static boolean isSTR_LN_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.STR_LN_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：棚・ラインかどうか
	 * @param type 属性値
	 * @return 属性値が棚・ラインの値の場合true
	 */
	public static boolean isSTR_LN_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.STR_LN_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：売掛先かどうか
	 * @param value 定数値
	 * @return 定数値が売掛先の値の場合true
	 */
	public static boolean isACST_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ACST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：売掛先かどうか
	 * @param type 属性値
	 * @return 属性値が売掛先の値の場合true
	 */
	public static boolean isACST_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ACST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：得意先かどうか
	 * @param value 定数値
	 * @return 定数値が得意先の値の場合true
	 */
	public static boolean isCST_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.CST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：得意先かどうか
	 * @param type 属性値
	 * @return 属性値が得意先の値の場合true
	 */
	public static boolean isCST_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.CST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：買掛先かどうか
	 * @param value 定数値
	 * @return 定数値が買掛先の値の場合true
	 */
	public static boolean isASPPL_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ASPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：買掛先かどうか
	 * @param type 属性値
	 * @return 属性値が買掛先の値の場合true
	 */
	public static boolean isASPPL_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ASPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：発注先かどうか
	 * @param value 定数値
	 * @return 定数値が発注先の値の場合true
	 */
	public static boolean isSPPL_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：発注先かどうか
	 * @param type 属性値
	 * @return 属性値が発注先の値の場合true
	 */
	public static boolean isSPPL_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：在庫保管先かどうか
	 * @param value 定数値
	 * @return 定数値が在庫保管先の値の場合true
	 */
	public static boolean isINV_COM_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.INV_COM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：在庫保管先かどうか
	 * @param type 属性値
	 * @return 属性値が在庫保管先の値の場合true
	 */
	public static boolean isINV_COM_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.INV_COM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入金先かどうか
	 * @param value 定数値
	 * @return 定数値が入金先の値の場合true
	 */
	public static boolean isRCST_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.RCST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：入金先かどうか
	 * @param type 属性値
	 * @return 属性値が入金先の値の場合true
	 */
	public static boolean isRCST_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.RCST_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：相殺先かどうか
	 * @param value 定数値
	 * @return 定数値が相殺先の値の場合true
	 */
	public static boolean isSETOFF_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SETOFF_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：相殺先かどうか
	 * @param type 属性値
	 * @return 属性値が相殺先の値の場合true
	 */
	public static boolean isSETOFF_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SETOFF_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：会計品目分類かどうか
	 * @param value 定数値
	 * @return 定数値が会計品目分類の値の場合true
	 */
	public static boolean isAC_ITM_GRP_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.AC_ITM_GRP_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：会計品目分類かどうか
	 * @param type 属性値
	 * @return 属性値が会計品目分類の値の場合true
	 */
	public static boolean isAC_ITM_GRP_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.AC_ITM_GRP_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目かどうか
	 * @param value 定数値
	 * @return 定数値が品目の値の場合true
	 */
	public static boolean isITM_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目かどうか
	 * @param type 属性値
	 * @return 属性値が品目の値の場合true
	 */
	public static boolean isITM_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番１かどうか
	 * @param value 定数値
	 * @return 定数値が枝番１の値の場合true
	 */
	public static boolean isITM_SUB1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番１かどうか
	 * @param type 属性値
	 * @return 属性値が枝番１の値の場合true
	 */
	public static boolean isITM_SUB1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番２かどうか
	 * @param value 定数値
	 * @return 定数値が枝番２の値の場合true
	 */
	public static boolean isITM_SUB2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番２かどうか
	 * @param type 属性値
	 * @return 属性値が枝番２の値の場合true
	 */
	public static boolean isITM_SUB2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番３かどうか
	 * @param value 定数値
	 * @return 定数値が枝番３の値の場合true
	 */
	public static boolean isITM_SUB3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：枝番３かどうか
	 * @param type 属性値
	 * @return 属性値が枝番３の値の場合true
	 */
	public static boolean isITM_SUB3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_SUB3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ１かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SNO1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ１かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ１の値の場合true
	 */
	public static boolean isSNO1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SNO1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ２かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SNO2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ２かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ２の値の場合true
	 */
	public static boolean isSNO2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SNO2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ３かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SNO3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ３かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ３の値の場合true
	 */
	public static boolean isSNO3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SNO3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ４かどうか
	 * @param value 定数値
	 * @return 定数値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SNO4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：手配ＮＯ４かどうか
	 * @param type 属性値
	 * @return 属性値が手配ＮＯ４の値の場合true
	 */
	public static boolean isSNO4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SNO4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類１かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP_CD1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類１かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１の値の場合true
	 */
	public static boolean isITM_GRP_CD1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類２かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP_CD2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類２かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類２の値の場合true
	 */
	public static boolean isITM_GRP_CD2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類３かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP_CD3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類３かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類３の値の場合true
	 */
	public static boolean isITM_GRP_CD3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類４かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP_CD4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類４かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類４の値の場合true
	 */
	public static boolean isITM_GRP_CD4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類５かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP_CD5(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類５かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類５の値の場合true
	 */
	public static boolean isITM_GRP_CD5(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類６かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP_CD6(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類６かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類６の値の場合true
	 */
	public static boolean isITM_GRP_CD6(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類７かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP_CD7(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類７かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類７の値の場合true
	 */
	public static boolean isITM_GRP_CD7(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類８かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP_CD8(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類８かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類８の値の場合true
	 */
	public static boolean isITM_GRP_CD8(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類９かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP_CD9(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類９かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類９の値の場合true
	 */
	public static boolean isITM_GRP_CD9(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP_CD10(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：品目分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が品目分類１０の値の場合true
	 */
	public static boolean isITM_GRP_CD10(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ITM_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先会計品目分類かどうか
	 * @param value 定数値
	 * @return 定数値が振替先会計品目分類の値の場合true
	 */
	public static boolean isTRD_AC_ITM_GRP_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_AC_ITM_GRP_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先会計品目分類かどうか
	 * @param type 属性値
	 * @return 属性値が振替先会計品目分類の値の場合true
	 */
	public static boolean isTRD_AC_ITM_GRP_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_AC_ITM_GRP_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目仕訳かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目仕訳の値の場合true
	 */
	public static boolean isTRD_ITM_JNL_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_JNL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目仕訳かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目仕訳の値の場合true
	 */
	public static boolean isTRD_ITM_JNL_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_JNL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目の値の場合true
	 */
	public static boolean isTRD_ITM_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目の値の場合true
	 */
	public static boolean isTRD_ITM_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番１かどうか
	 * @param value 定数値
	 * @return 定数値が振替先枝番１の値の場合true
	 */
	public static boolean isTRD_ITM_SUB1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番１かどうか
	 * @param type 属性値
	 * @return 属性値が振替先枝番１の値の場合true
	 */
	public static boolean isTRD_ITM_SUB1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番２かどうか
	 * @param value 定数値
	 * @return 定数値が振替先枝番２の値の場合true
	 */
	public static boolean isTRD_ITM_SUB2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番２かどうか
	 * @param type 属性値
	 * @return 属性値が振替先枝番２の値の場合true
	 */
	public static boolean isTRD_ITM_SUB2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番３かどうか
	 * @param value 定数値
	 * @return 定数値が振替先枝番３の値の場合true
	 */
	public static boolean isTRD_ITM_SUB3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先枝番３かどうか
	 * @param type 属性値
	 * @return 属性値が振替先枝番３の値の場合true
	 */
	public static boolean isTRD_ITM_SUB3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_SUB3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ１かどうか
	 * @param value 定数値
	 * @return 定数値が振替先手配ＮＯ１の値の場合true
	 */
	public static boolean isTRD_SNO1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ１かどうか
	 * @param type 属性値
	 * @return 属性値が振替先手配ＮＯ１の値の場合true
	 */
	public static boolean isTRD_SNO1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ２かどうか
	 * @param value 定数値
	 * @return 定数値が振替先手配ＮＯ２の値の場合true
	 */
	public static boolean isTRD_SNO2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ２かどうか
	 * @param type 属性値
	 * @return 属性値が振替先手配ＮＯ２の値の場合true
	 */
	public static boolean isTRD_SNO2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ３かどうか
	 * @param value 定数値
	 * @return 定数値が振替先手配ＮＯ３の値の場合true
	 */
	public static boolean isTRD_SNO3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ３かどうか
	 * @param type 属性値
	 * @return 属性値が振替先手配ＮＯ３の値の場合true
	 */
	public static boolean isTRD_SNO3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ４かどうか
	 * @param value 定数値
	 * @return 定数値が振替先手配ＮＯ４の値の場合true
	 */
	public static boolean isTRD_SNO4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先手配ＮＯ４かどうか
	 * @param type 属性値
	 * @return 属性値が振替先手配ＮＯ４の値の場合true
	 */
	public static boolean isTRD_SNO4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_SNO4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類１かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類１の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類１かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類１の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類２かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類２の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類２かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類２の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類３かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類３の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類３かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類３の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類４かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類４の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類４かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類４の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類５かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類５の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD5(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類５かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類５の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD5(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類６かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類６の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD6(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類６かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類６の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD6(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類７かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類７の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD7(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類７かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類７の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD7(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類８かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類８の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD8(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類８かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類８の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD8(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類９かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類９の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD9(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類９かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類９の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD9(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が振替先品目分類１０の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD10(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：振替先品目分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が振替先品目分類１０の値の場合true
	 */
	public static boolean isTRD_ITM_GRP_CD10(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_ITM_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：地域かどうか
	 * @param value 定数値
	 * @return 定数値が地域の値の場合true
	 */
	public static boolean isAREA_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.AREA_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：地域かどうか
	 * @param type 属性値
	 * @return 属性値が地域の値の場合true
	 */
	public static boolean isAREA_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.AREA_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：国かどうか
	 * @param value 定数値
	 * @return 定数値が国の値の場合true
	 */
	public static boolean isCNTRY_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.CNTRY_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：国かどうか
	 * @param type 属性値
	 * @return 属性値が国の値の場合true
	 */
	public static boolean isCNTRY_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.CNTRY_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：税かどうか
	 * @param value 定数値
	 * @return 定数値が税の値の場合true
	 */
	public static boolean isTAX_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TAX_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：税かどうか
	 * @param type 属性値
	 * @return 属性値が税の値の場合true
	 */
	public static boolean isTAX_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TAX_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：配賦科目かどうか
	 * @param value 定数値
	 * @return 定数値が配賦科目の値の場合true
	 */
	public static boolean isALC_AC_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.ALC_AC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：配賦科目かどうか
	 * @param type 属性値
	 * @return 属性値が配賦科目の値の場合true
	 */
	public static boolean isALC_AC_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.ALC_AC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：配賦元配賦科目かどうか
	 * @param value 定数値
	 * @return 定数値が配賦元配賦科目の値の場合true
	 */
	public static boolean isSRC_ALC_AC_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SRC_ALC_AC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：配賦元配賦科目かどうか
	 * @param type 属性値
	 * @return 属性値が配賦元配賦科目の値の場合true
	 */
	public static boolean isSRC_ALC_AC_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SRC_ALC_AC_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：格付かどうか
	 * @param value 定数値
	 * @return 定数値が格付の値の場合true
	 */
	public static boolean isGD_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.GD_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：格付かどうか
	 * @param type 属性値
	 * @return 属性値が格付の値の場合true
	 */
	public static boolean isGD_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.GD_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類１かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類１の値の場合true
	 */
	public static boolean isBP_GRP_CD1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類１かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類１の値の場合true
	 */
	public static boolean isBP_GRP_CD1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類２かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類２の値の場合true
	 */
	public static boolean isBP_GRP_CD2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類２かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類２の値の場合true
	 */
	public static boolean isBP_GRP_CD2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類３かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類３の値の場合true
	 */
	public static boolean isBP_GRP_CD3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類３かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類３の値の場合true
	 */
	public static boolean isBP_GRP_CD3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類４かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類４の値の場合true
	 */
	public static boolean isBP_GRP_CD4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類４かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類４の値の場合true
	 */
	public static boolean isBP_GRP_CD4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類５かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類５の値の場合true
	 */
	public static boolean isBP_GRP_CD5(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類５かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類５の値の場合true
	 */
	public static boolean isBP_GRP_CD5(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類６かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類６の値の場合true
	 */
	public static boolean isBP_GRP_CD6(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類６かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類６の値の場合true
	 */
	public static boolean isBP_GRP_CD6(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類７かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類７の値の場合true
	 */
	public static boolean isBP_GRP_CD7(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類７かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類７の値の場合true
	 */
	public static boolean isBP_GRP_CD7(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類８かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類８の値の場合true
	 */
	public static boolean isBP_GRP_CD8(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類８かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類８の値の場合true
	 */
	public static boolean isBP_GRP_CD8(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類９かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類９の値の場合true
	 */
	public static boolean isBP_GRP_CD9(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類９かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類９の値の場合true
	 */
	public static boolean isBP_GRP_CD9(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類１０かどうか
	 * @param value 定数値
	 * @return 定数値が取引先分類１０の値の場合true
	 */
	public static boolean isBP_GRP_CD10(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引先分類１０かどうか
	 * @param type 属性値
	 * @return 属性値が取引先分類１０の値の場合true
	 */
	public static boolean isBP_GRP_CD10(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BP_GRP_CD10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目１かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB_CHAR1(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目１かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目１の値の場合true
	 */
	public static boolean isSUB_CHAR1(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR1.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目２かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB_CHAR2(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目２かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目２の値の場合true
	 */
	public static boolean isSUB_CHAR2(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR2.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目３かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB_CHAR3(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目３かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目３の値の場合true
	 */
	public static boolean isSUB_CHAR3(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR3.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目４かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB_CHAR4(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目４かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目４の値の場合true
	 */
	public static boolean isSUB_CHAR4(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR4.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目５かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB_CHAR5(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目５かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目５の値の場合true
	 */
	public static boolean isSUB_CHAR5(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR5.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目６かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目６の値の場合true
	 */
	public static boolean isSUB_CHAR6(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目６かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目６の値の場合true
	 */
	public static boolean isSUB_CHAR6(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR6.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目７かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目７の値の場合true
	 */
	public static boolean isSUB_CHAR7(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目７かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目７の値の場合true
	 */
	public static boolean isSUB_CHAR7(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR7.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目８かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目８の値の場合true
	 */
	public static boolean isSUB_CHAR8(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目８かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目８の値の場合true
	 */
	public static boolean isSUB_CHAR8(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR8.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目９かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目９の値の場合true
	 */
	public static boolean isSUB_CHAR9(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目９かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目９の値の場合true
	 */
	public static boolean isSUB_CHAR9(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR9.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目１０かどうか
	 * @param value 定数値
	 * @return 定数値が予備ＣＨＡＲ項目１０の値の場合true
	 */
	public static boolean isSUB_CHAR10(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：予備ＣＨＡＲ項目１０かどうか
	 * @param type 属性値
	 * @return 属性値が予備ＣＨＡＲ項目１０の値の場合true
	 */
	public static boolean isSUB_CHAR10(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.SUB_CHAR10.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払部門かどうか
	 * @param value 定数値
	 * @return 定数値が支払部門の値の場合true
	 */
	public static boolean isPAY_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.PAY_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払部門かどうか
	 * @param type 属性値
	 * @return 属性値が支払部門の値の場合true
	 */
	public static boolean isPAY_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.PAY_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払予定管理先部門かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定管理先部門の値の場合true
	 */
	public static boolean isBSPPL_DPT_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BSPPL_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払予定管理先部門かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定管理先部門の値の場合true
	 */
	public static boolean isBSPPL_DPT_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BSPPL_DPT_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払先かどうか
	 * @param value 定数値
	 * @return 定数値が支払先の値の場合true
	 */
	public static boolean isPSPPL_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.PSPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払先かどうか
	 * @param type 属性値
	 * @return 属性値が支払先の値の場合true
	 */
	public static boolean isPSPPL_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.PSPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払予定管理先かどうか
	 * @param value 定数値
	 * @return 定数値が支払予定管理先の値の場合true
	 */
	public static boolean isBSPPL_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.BSPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：支払予定管理先かどうか
	 * @param type 属性値
	 * @return 属性値が支払予定管理先の値の場合true
	 */
	public static boolean isBSPPL_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.BSPPL_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：費目かどうか
	 * @param value 定数値
	 * @return 定数値が費目の値の場合true
	 */
	public static boolean isEXPNS_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.EXPNS_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：費目かどうか
	 * @param type 属性値
	 * @return 属性値が費目の値の場合true
	 */
	public static boolean isEXPNS_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.EXPNS_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引かどうか
	 * @param value 定数値
	 * @return 定数値が取引の値の場合true
	 */
	public static boolean isTRD_CD(String value) {
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
		return MAC_JNL_KEY_SET_COL_TYP.TRD_CD.isSame(type);
	}

	/**
	 * 仕訳キー設定項目区分：取引かどうか
	 * @param type 属性値
	 * @return 属性値が取引の値の場合true
	 */
	public static boolean isTRD_CD(MAC_JNL_KEY_SET_COL_TYP type) {
		return MAC_JNL_KEY_SET_COL_TYP.TRD_CD.isSame(type);
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
			MAC_JNL_KEY_SET_COL_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.get(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.get(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.get(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.get(value);
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
			MAC_JNL_KEY_SET_COL_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_JNL_KEY_SET_COL_TYP type = MAC_JNL_KEY_SET_COL_TYP.getNE(value);
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
