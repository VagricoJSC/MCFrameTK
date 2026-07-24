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
abstract class MAC_AC_SLIP_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "AC_SLIP_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_AC_SLIP_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "ac_slip_typ";

	public static final String $NAME = "ac_slip_typ_nm";

	public static final String $IS_TRAN_TYP = "is_tran_typ";

	public static final String $IS_STK_TYP = "is_stk_typ";

	public static final String $IS_COST_TYP = "is_cost_typ";

	public static final String $IS_CREDIT_TYP = "is_credit_typ";

	public static final String $IS_PAY_TYP = "is_pay_typ";

	public static final String $IS_ACXFER_TYP = "is_acxfer_typ";

	public static final String $IS_EVAL_TYP = "is_eval_typ";

	public static final String $IS_SLS_TYP = "is_sls_typ";

	public static final String $IS_IO_TYP = "is_io_typ";

	public static final String $IS_PRODPURC_TYP = "is_prodpurc_typ";

	public static final String $IS_INPT_TYP = "is_inpt_typ";

	public static final String $IS_COST_TRAN_TYP = "is_cost_tran_typ";

	/*
	 * 定数の定義です。
	 */
	/** 会計伝票区分：仕入
	 */
	public static final MAC_AC_SLIP_TYP PURC = create("10101", "PURC", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：購買原価
	 */
	public static final MAC_AC_SLIP_TYP PURC_COST = create("10102", "PURC_COST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：経費購買
	 */
	public static final MAC_AC_SLIP_TYP PURC_XPNS = create("10103", "PURC_XPNS", true, false, false, false, false, false, false, false, false, true, true, true);

	/** 会計伝票区分：未着品仕入
	 */
	public static final MAC_AC_SLIP_TYP PURC_IN_TRANSIT = create("10104", "PURC_IN_TRANSIT", true, false, false, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：未着品入荷
	 */
	public static final MAC_AC_SLIP_TYP ARR_IN_TRANSIT = create("10105", "ARR_IN_TRANSIT", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：仕入返品
	 */
	public static final MAC_AC_SLIP_TYP PURC_RET = create("10111", "PURC_RET", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：経費返品
	 */
	public static final MAC_AC_SLIP_TYP PURC_RET_XPNS = create("10112", "PURC_RET_XPNS", true, false, false, false, false, false, false, false, false, true, true, true);

	/** 会計伝票区分：仕入値引
	 */
	public static final MAC_AC_SLIP_TYP PURC_DSCNT = create("10121", "PURC_DSCNT", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：経費値引
	 */
	public static final MAC_AC_SLIP_TYP PURC_DSCNT_XPNS = create("10122", "PURC_DSCNT_XPNS", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：仕入値増
	 */
	public static final MAC_AC_SLIP_TYP PURC_XTRA = create("10131", "PURC_XTRA", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：経費値増
	 */
	public static final MAC_AC_SLIP_TYP PURC_XTRA_XPNS = create("10132", "PURC_XTRA_XPNS", true, false, false, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：売上
	 */
	public static final MAC_AC_SLIP_TYP SLS = create("10201", "SLS", true, false, false, false, false, false, true, true, false, false, false, true);

	/** 会計伝票区分：売上原価
	 */
	public static final MAC_AC_SLIP_TYP SLS_COST = create("10202", "SLS_COST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：売上返品
	 */
	public static final MAC_AC_SLIP_TYP SLS_RET = create("10211", "SLS_RET", true, false, false, false, false, false, true, true, false, false, false, true);

	/** 会計伝票区分：売上値引
	 */
	public static final MAC_AC_SLIP_TYP SLS_DSCNT = create("10221", "SLS_DSCNT", true, false, false, false, false, false, true, true, false, false, false, true);

	/** 会計伝票区分：売上値増
	 */
	public static final MAC_AC_SLIP_TYP SLS_XTRA = create("10231", "SLS_XTRA", true, false, false, false, false, false, true, true, false, false, false, true);

	/** 会計伝票区分：製造
	 */
	public static final MAC_AC_SLIP_TYP MFG = create("10301", "MFG", true, false, true, false, false, false, false, false, false, true, false, true);

	/** 会計伝票区分：副産物製造
	 */
	public static final MAC_AC_SLIP_TYP BYPROD = create("10302", "BYPROD", true, false, true, false, false, false, true, false, false, false, true, true);

	/** 会計伝票区分：投入
	 */
	public static final MAC_AC_SLIP_TYP INPUT = create("10401", "INPUT", true, false, true, false, false, false, true, false, false, false, true, true);

	/** 会計伝票区分：投入（有償）
	 */
	public static final MAC_AC_SLIP_TYP IN_ONR = create("10402", "IN_ONR", true, false, true, false, false, false, true, false, false, false, true, true);

	/** 会計伝票区分：投入（自給）
	 */
	public static final MAC_AC_SLIP_TYP IN_SS = create("10403", "IN_SS", true, false, true, false, false, false, true, false, false, false, true, true);

	/** 会計伝票区分：投入（有償差益）
	 */
	public static final MAC_AC_SLIP_TYP IN_ONR_DIFF = create("10411", "IN_ONR_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：無償支給
	 */
	public static final MAC_AC_SLIP_TYP FFR_PROV = create("10501", "FFR_PROV", true, false, false, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：有償支給
	 */
	public static final MAC_AC_SLIP_TYP ONR_PROV = create("10502", "ONR_PROV", true, false, false, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：無償支給戻
	 */
	public static final MAC_AC_SLIP_TYP FFR_PRVR = create("10511", "FFR_PRVR", true, false, false, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：有償支給戻
	 */
	public static final MAC_AC_SLIP_TYP ONR_PRVR = create("10512", "ONR_PRVR", true, false, false, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：無償支給原価
	 */
	public static final MAC_AC_SLIP_TYP FFR_PROV_CST = create("10521", "FFR_PROV_CST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：有償支給原価
	 */
	public static final MAC_AC_SLIP_TYP ONR_PROV_CST = create("10522", "ONR_PROV_CST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：検査抜取
	 */
	public static final MAC_AC_SLIP_TYP INSP_SMPL = create("10601", "INSP_SMPL", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：廃棄
	 */
	public static final MAC_AC_SLIP_TYP DISP_SCRP = create("10602", "DISP_SCRP", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：棚卸出庫
	 */
	public static final MAC_AC_SLIP_TYP SO_STKTK = create("10611", "SO_STKTK", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：棚卸入庫
	 */
	public static final MAC_AC_SLIP_TYP IN_STKTK = create("10612", "IN_STKTK", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：販売倉入
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_SO = create("10701", "PROD_ITM_SO", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：生産戻入
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_RET_SO = create("10712", "PROD_ITM_RET_SO", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：部門間移動
	 */
	public static final MAC_AC_SLIP_TYP DPT_XFR_SO = create("10801", "DPT_XFR_SO", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：他勘定出庫
	 */
	public static final MAC_AC_SLIP_TYP OTH_CCN_SO = create("10811", "OTH_CCN_SO", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：他勘定入庫
	 */
	public static final MAC_AC_SLIP_TYP OTH_CCN_GR = create("10812", "OTH_CCN_GR", true, false, true, false, false, true, true, false, true, false, true, true);

	/** 会計伝票区分：在庫振替出庫
	 */
	public static final MAC_AC_SLIP_TYP STK_SW_SO = create("10821", "STK_SW_SO", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：在庫振替入庫
	 */
	public static final MAC_AC_SLIP_TYP STK_SW_GR = create("10822", "STK_SW_GR", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：出荷
	 */
	public static final MAC_AC_SLIP_TYP SHIP = create("10901", "SHIP", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：出荷返品
	 */
	public static final MAC_AC_SLIP_TYP SHIP_RET = create("10902", "SHIP_RET", true, false, true, false, false, false, true, false, true, false, false, true);

	/** 会計伝票区分：月末在庫（生産）
	 */
	public static final MAC_AC_SLIP_TYP EOM_STK_PROD = create("20101", "EOM_STK_PROD", false, true, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：月末在庫（販売）
	 */
	public static final MAC_AC_SLIP_TYP EOM_STK_SLS = create("20102", "EOM_STK_SLS", false, true, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：仕掛原価
	 */
	public static final MAC_AC_SLIP_TYP INP_WIP_CST = create("20201", "INP_WIP_CST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：在庫評価替差異
	 */
	public static final MAC_AC_SLIP_TYP STK_ASM_DIFF = create("30101", "STK_ASM_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：有償支給差益
	 */
	public static final MAC_AC_SLIP_TYP ONR_PROV_DIFF = create("30201", "ONR_PROV_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：原価受払差額
	 */
	public static final MAC_AC_SLIP_TYP CST_IO_AOD = create("30301", "CST_IO_AOD", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：月末在庫評価損
	 */
	public static final MAC_AC_SLIP_TYP EOM_STK_ASM_MIS = create("30401", "EOM_STK_ASM_MIS", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：完成原価
	 */
	public static final MAC_AC_SLIP_TYP COMP_CST = create("30501", "COMP_CST", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：部門間配賦
	 */
	public static final MAC_AC_SLIP_TYP DPT_ALC = create("30601", "DPT_ALC", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：品目配賦
	 */
	public static final MAC_AC_SLIP_TYP ITM_ALC = create("30611", "ITM_ALC", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：販売倉入（入庫）
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_GR = create("30701", "PROD_ITM_GR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：販売倉入（差額）
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_DIFF = create("30702", "PROD_ITM_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：生産戻入（入庫）
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_RET_GR = create("30711", "PROD_ITM_RET_GR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：生産戻入（差額）
	 */
	public static final MAC_AC_SLIP_TYP PROD_ITM_RET_DIFF = create("30712", "PROD_ITM_RET_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：部門間移動（入庫）
	 */
	public static final MAC_AC_SLIP_TYP DPT_XFR_GR = create("30801", "DPT_XFR_GR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：部門間移動（差額）
	 */
	public static final MAC_AC_SLIP_TYP DPT_XFR_DIFF = create("30802", "DPT_XFR_DIFF", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：受入価格差異（合計）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_IO_SUM = create("30901", "DIFF_IO_SUM", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：受入単価差異（単価差異）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_IO_PRI = create("30902", "DIFF_IO_PRI", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：受入単価差異（レート差異）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_IO_RATE = create("30903", "DIFF_IO_RATE", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：数量差異（親）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_QT_PAR = create("30904", "DIFF_QT_PAR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：数量差異（子）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_QT_CHD = create("30905", "DIFF_QT_CHD", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：払出価格差異（親）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_PR_PAR = create("30906", "DIFF_PR_PAR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：払出価格差異（子）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_PR_CHD = create("30907", "DIFF_PR_CHD", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：工数差異
	 */
	public static final MAC_AC_SLIP_TYP DIFF_WK = create("30910", "DIFF_WK", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：実績差異１
	 */
	public static final MAC_AC_SLIP_TYP DIFF_ACT1 = create("30911", "DIFF_ACT1", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：実績差異２
	 */
	public static final MAC_AC_SLIP_TYP DIFF_ACT2 = create("30912", "DIFF_ACT2", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：実績差異３
	 */
	public static final MAC_AC_SLIP_TYP DIFF_ACT3 = create("30913", "DIFF_ACT3", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：実績差異４
	 */
	public static final MAC_AC_SLIP_TYP DIFF_ACT4 = create("30914", "DIFF_ACT4", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：実績差異５
	 */
	public static final MAC_AC_SLIP_TYP DIFF_ACT5 = create("30915", "DIFF_ACT5", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：配賦率差異（配賦科目）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_RATE_ALC = create("30920", "DIFF_RATE_ALC", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：配賦率差異（品目）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_RATE_ITM = create("30921", "DIFF_RATE_ITM", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：外注単価差異（合計）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_OUTSRC_SUM = create("30931", "DIFF_OUTSRC_SUM", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：外注単価差異（単価差異）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_OUTSRC_PRI = create("30932", "DIFF_OUTSRC_PRI", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：外注単価差異（レート差異）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_OUTSRC_RATE = create("30933", "DIFF_OUTSRC_RATE", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：自給単価差異（親）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_SS_PAR = create("30935", "DIFF_SS_PAR", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：自給単価差異（子）
	 */
	public static final MAC_AC_SLIP_TYP DIFF_SS_CHD = create("30936", "DIFF_SS_CHD", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：標準調整差異
	 */
	public static final MAC_AC_SLIP_TYP DIFF_STD_ADJ = create("30950", "DIFF_STD_ADJ", false, false, true, false, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：入金登録
	 */
	public static final MAC_AC_SLIP_TYP RCV_ENT = create("40101", "RCV_ENT", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：前受登録
	 */
	public static final MAC_AC_SLIP_TYP ADV_ENT = create("40102", "ADV_ENT", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：前受振替
	 */
	public static final MAC_AC_SLIP_TYP ADV_SW = create("40103", "ADV_SW", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：売掛消込
	 */
	public static final MAC_AC_SLIP_TYP AR_FAD = create("40201", "AR_FAD", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（債権消込）
	 */
	public static final MAC_AC_SLIP_TYP AR_EX_GAIN_APPL = create("40301", "AR_EX_GAIN_APPL", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（債権消込）
	 */
	public static final MAC_AC_SLIP_TYP AR_EX_LOSS_APPL = create("40302", "AR_EX_LOSS_APPL", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（債権評価替）
	 */
	public static final MAC_AC_SLIP_TYP AR_EX_GAIN_REV = create("40401", "AR_EX_GAIN_REV", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（債権評価替）
	 */
	public static final MAC_AC_SLIP_TYP AR_EX_LOSS_REV = create("40402", "AR_EX_LOSS_REV", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：未収金消込
	 */
	public static final MAC_AC_SLIP_TYP AC_FAD = create("40202", "AC_FAD", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（未収金消込）
	 */
	public static final MAC_AC_SLIP_TYP AC_EX_GAIN_APPL = create("40303", "AC_EX_GAIN_APPL", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（未収金消込）
	 */
	public static final MAC_AC_SLIP_TYP AC_EX_LOSS_APPL = create("40304", "AC_EX_LOSS_APPL", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（未収金評価替）
	 */
	public static final MAC_AC_SLIP_TYP AC_EX_GAIN_REV = create("40403", "AC_EX_GAIN_REV", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（未収金評価替）
	 */
	public static final MAC_AC_SLIP_TYP AC_EX_LOSS_REV = create("40404", "AC_EX_LOSS_REV", false, false, false, true, false, false, false, false, false, false, false, false);

	/** 会計伝票区分：支払
	 */
	public static final MAC_AC_SLIP_TYP PAY = create("50101", "PAY", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：支払（未払金）
	 */
	public static final MAC_AC_SLIP_TYP XPNS_PAY = create("50102", "XPNS_PAY", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：前渡登録
	 */
	public static final MAC_AC_SLIP_TYP ADV_PAY = create("50201", "ADV_PAY", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（債務消込）
	 */
	public static final MAC_AC_SLIP_TYP AP_EX_GAIN_APPL = create("50301", "AP_EX_GAIN_APPL", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（債務消込）
	 */
	public static final MAC_AC_SLIP_TYP AP_EX_LOSS_APPL = create("50302", "AP_EX_LOSS_APPL", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（未払金消込）
	 */
	public static final MAC_AC_SLIP_TYP AE_EX_GAIN_APPL = create("50303", "AE_EX_GAIN_APPL", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（未払金消込）
	 */
	public static final MAC_AC_SLIP_TYP AE_EX_LOSS_APPL = create("50304", "AE_EX_LOSS_APPL", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（債務評価替）
	 */
	public static final MAC_AC_SLIP_TYP AP_EX_GAIN_REV = create("50401", "AP_EX_GAIN_REV", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（債務評価替）
	 */
	public static final MAC_AC_SLIP_TYP AP_EX_LOSS_REV = create("50402", "AP_EX_LOSS_REV", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差益（未払金評価替）
	 */
	public static final MAC_AC_SLIP_TYP AE_EX_GAIN_REV = create("50403", "AE_EX_GAIN_REV", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：為替差損（未払金評価替）
	 */
	public static final MAC_AC_SLIP_TYP AE_EX_LOSS_REV = create("50404", "AE_EX_LOSS_REV", false, false, false, false, true, false, false, false, false, false, false, false);

	/** 会計伝票区分：振込手数料
	 */
	public static final MAC_AC_SLIP_TYP PAY_COM_PAID = create("50501", "PAY_COM_PAID", false, false, false, false, true, false, false, false, false, false, false, false);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_AC_SLIP_TYP create() {
		return new MAC_AC_SLIP_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_AC_SLIP_TYP get(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		if (type == null) {
			throw MAC_AC_SLIP_TYP.invalidValue(value);
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
	public static MAC_AC_SLIP_TYP getNE(String value) {
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_AC_SLIP_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, boolean attr6, boolean attr7, boolean attr8, boolean attr9, boolean attr10, boolean attr11, boolean attr12) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_TRAN_TYP, attr1);
		me.constR.addBooleanColumn($IS_STK_TYP, attr2);
		me.constR.addBooleanColumn($IS_COST_TYP, attr3);
		me.constR.addBooleanColumn($IS_CREDIT_TYP, attr4);
		me.constR.addBooleanColumn($IS_PAY_TYP, attr5);
		me.constR.addBooleanColumn($IS_ACXFER_TYP, attr6);
		me.constR.addBooleanColumn($IS_EVAL_TYP, attr7);
		me.constR.addBooleanColumn($IS_SLS_TYP, attr8);
		me.constR.addBooleanColumn($IS_IO_TYP, attr9);
		me.constR.addBooleanColumn($IS_PRODPURC_TYP, attr10);
		me.constR.addBooleanColumn($IS_INPT_TYP, attr11);
		me.constR.addBooleanColumn($IS_COST_TRAN_TYP, attr12);
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
	 * is_tran_typの値を返します。
	 * @return is_tran_typの値
	 */
	public boolean is_tran_typ() {
		return constR.getBooleanNE($IS_TRAN_TYP);
	}

	/** 
	 * valueに対応する定数のis_tran_typの値を返します。
	 * @param value 定数値
	 * @return is_tran_typの値
	 */
	public static boolean is_tran_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_tran_typ();
	}

	/** 
	 * is_stk_typの値を返します。
	 * @return is_stk_typの値
	 */
	public boolean is_stk_typ() {
		return constR.getBooleanNE($IS_STK_TYP);
	}

	/** 
	 * valueに対応する定数のis_stk_typの値を返します。
	 * @param value 定数値
	 * @return is_stk_typの値
	 */
	public static boolean is_stk_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_stk_typ();
	}

	/** 
	 * is_cost_typの値を返します。
	 * @return is_cost_typの値
	 */
	public boolean is_cost_typ() {
		return constR.getBooleanNE($IS_COST_TYP);
	}

	/** 
	 * valueに対応する定数のis_cost_typの値を返します。
	 * @param value 定数値
	 * @return is_cost_typの値
	 */
	public static boolean is_cost_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_cost_typ();
	}

	/** 
	 * is_credit_typの値を返します。
	 * @return is_credit_typの値
	 */
	public boolean is_credit_typ() {
		return constR.getBooleanNE($IS_CREDIT_TYP);
	}

	/** 
	 * valueに対応する定数のis_credit_typの値を返します。
	 * @param value 定数値
	 * @return is_credit_typの値
	 */
	public static boolean is_credit_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_credit_typ();
	}

	/** 
	 * is_pay_typの値を返します。
	 * @return is_pay_typの値
	 */
	public boolean is_pay_typ() {
		return constR.getBooleanNE($IS_PAY_TYP);
	}

	/** 
	 * valueに対応する定数のis_pay_typの値を返します。
	 * @param value 定数値
	 * @return is_pay_typの値
	 */
	public static boolean is_pay_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_pay_typ();
	}

	/** 
	 * is_acxfer_typの値を返します。
	 * @return is_acxfer_typの値
	 */
	public boolean is_acxfer_typ() {
		return constR.getBooleanNE($IS_ACXFER_TYP);
	}

	/** 
	 * valueに対応する定数のis_acxfer_typの値を返します。
	 * @param value 定数値
	 * @return is_acxfer_typの値
	 */
	public static boolean is_acxfer_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_acxfer_typ();
	}

	/** 
	 * is_eval_typの値を返します。
	 * @return is_eval_typの値
	 */
	public boolean is_eval_typ() {
		return constR.getBooleanNE($IS_EVAL_TYP);
	}

	/** 
	 * valueに対応する定数のis_eval_typの値を返します。
	 * @param value 定数値
	 * @return is_eval_typの値
	 */
	public static boolean is_eval_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_eval_typ();
	}

	/** 
	 * is_sls_typの値を返します。
	 * @return is_sls_typの値
	 */
	public boolean is_sls_typ() {
		return constR.getBooleanNE($IS_SLS_TYP);
	}

	/** 
	 * valueに対応する定数のis_sls_typの値を返します。
	 * @param value 定数値
	 * @return is_sls_typの値
	 */
	public static boolean is_sls_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_sls_typ();
	}

	/** 
	 * is_io_typの値を返します。
	 * @return is_io_typの値
	 */
	public boolean is_io_typ() {
		return constR.getBooleanNE($IS_IO_TYP);
	}

	/** 
	 * valueに対応する定数のis_io_typの値を返します。
	 * @param value 定数値
	 * @return is_io_typの値
	 */
	public static boolean is_io_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_io_typ();
	}

	/** 
	 * is_prodpurc_typの値を返します。
	 * @return is_prodpurc_typの値
	 */
	public boolean is_prodpurc_typ() {
		return constR.getBooleanNE($IS_PRODPURC_TYP);
	}

	/** 
	 * valueに対応する定数のis_prodpurc_typの値を返します。
	 * @param value 定数値
	 * @return is_prodpurc_typの値
	 */
	public static boolean is_prodpurc_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_prodpurc_typ();
	}

	/** 
	 * is_inpt_typの値を返します。
	 * @return is_inpt_typの値
	 */
	public boolean is_inpt_typ() {
		return constR.getBooleanNE($IS_INPT_TYP);
	}

	/** 
	 * valueに対応する定数のis_inpt_typの値を返します。
	 * @param value 定数値
	 * @return is_inpt_typの値
	 */
	public static boolean is_inpt_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_inpt_typ();
	}

	/** 
	 * is_cost_tran_typの値を返します。
	 * @return is_cost_tran_typの値
	 */
	public boolean is_cost_tran_typ() {
		return constR.getBooleanNE($IS_COST_TRAN_TYP);
	}

	/** 
	 * valueに対応する定数のis_cost_tran_typの値を返します。
	 * @param value 定数値
	 * @return is_cost_tran_typの値
	 */
	public static boolean is_cost_tran_typ(String value) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_cost_tran_typ();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
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
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
		if (me == null) {
			throw MAC_AC_SLIP_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_tran_typ(), is_stk_typ(), is_cost_typ(), is_credit_typ(), is_pay_typ(), is_acxfer_typ(), is_eval_typ(), is_sls_typ(), is_io_typ(), is_prodpurc_typ(), is_inpt_typ(), is_cost_tran_typ());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_AC_SLIP_TYP[] array() {
		if (array == null) {
			array = new MAC_AC_SLIP_TYP[] {
					MAC_AC_SLIP_TYP.PURC, MAC_AC_SLIP_TYP.PURC_COST, MAC_AC_SLIP_TYP.PURC_XPNS, MAC_AC_SLIP_TYP.PURC_IN_TRANSIT, MAC_AC_SLIP_TYP.ARR_IN_TRANSIT, 
					 MAC_AC_SLIP_TYP.PURC_RET, MAC_AC_SLIP_TYP.PURC_RET_XPNS, MAC_AC_SLIP_TYP.PURC_DSCNT, MAC_AC_SLIP_TYP.PURC_DSCNT_XPNS, MAC_AC_SLIP_TYP.PURC_XTRA, MAC_AC_SLIP_TYP.PURC_XTRA_XPNS, 
					 MAC_AC_SLIP_TYP.SLS, MAC_AC_SLIP_TYP.SLS_COST, MAC_AC_SLIP_TYP.SLS_RET, MAC_AC_SLIP_TYP.SLS_DSCNT, MAC_AC_SLIP_TYP.SLS_XTRA, MAC_AC_SLIP_TYP.MFG, 
					 MAC_AC_SLIP_TYP.BYPROD, MAC_AC_SLIP_TYP.INPUT, MAC_AC_SLIP_TYP.IN_ONR, MAC_AC_SLIP_TYP.IN_SS, MAC_AC_SLIP_TYP.IN_ONR_DIFF, MAC_AC_SLIP_TYP.FFR_PROV, 
					 MAC_AC_SLIP_TYP.ONR_PROV, MAC_AC_SLIP_TYP.FFR_PRVR, MAC_AC_SLIP_TYP.ONR_PRVR, MAC_AC_SLIP_TYP.FFR_PROV_CST, MAC_AC_SLIP_TYP.ONR_PROV_CST, MAC_AC_SLIP_TYP.INSP_SMPL, 
					 MAC_AC_SLIP_TYP.DISP_SCRP, MAC_AC_SLIP_TYP.SO_STKTK, MAC_AC_SLIP_TYP.IN_STKTK, MAC_AC_SLIP_TYP.PROD_ITM_SO, MAC_AC_SLIP_TYP.PROD_ITM_RET_SO, MAC_AC_SLIP_TYP.DPT_XFR_SO, 
					 MAC_AC_SLIP_TYP.OTH_CCN_SO, MAC_AC_SLIP_TYP.OTH_CCN_GR, MAC_AC_SLIP_TYP.STK_SW_SO, MAC_AC_SLIP_TYP.STK_SW_GR, MAC_AC_SLIP_TYP.SHIP, MAC_AC_SLIP_TYP.SHIP_RET, 
					 MAC_AC_SLIP_TYP.EOM_STK_PROD, MAC_AC_SLIP_TYP.EOM_STK_SLS, MAC_AC_SLIP_TYP.INP_WIP_CST, MAC_AC_SLIP_TYP.STK_ASM_DIFF, MAC_AC_SLIP_TYP.ONR_PROV_DIFF, MAC_AC_SLIP_TYP.CST_IO_AOD, 
					 MAC_AC_SLIP_TYP.EOM_STK_ASM_MIS, MAC_AC_SLIP_TYP.COMP_CST, MAC_AC_SLIP_TYP.DPT_ALC, MAC_AC_SLIP_TYP.ITM_ALC, MAC_AC_SLIP_TYP.PROD_ITM_GR, MAC_AC_SLIP_TYP.PROD_ITM_DIFF, 
					 MAC_AC_SLIP_TYP.PROD_ITM_RET_GR, MAC_AC_SLIP_TYP.PROD_ITM_RET_DIFF, MAC_AC_SLIP_TYP.DPT_XFR_GR, MAC_AC_SLIP_TYP.DPT_XFR_DIFF, MAC_AC_SLIP_TYP.DIFF_IO_SUM, MAC_AC_SLIP_TYP.DIFF_IO_PRI, 
					 MAC_AC_SLIP_TYP.DIFF_IO_RATE, MAC_AC_SLIP_TYP.DIFF_QT_PAR, MAC_AC_SLIP_TYP.DIFF_QT_CHD, MAC_AC_SLIP_TYP.DIFF_PR_PAR, MAC_AC_SLIP_TYP.DIFF_PR_CHD, MAC_AC_SLIP_TYP.DIFF_WK, 
					 MAC_AC_SLIP_TYP.DIFF_ACT1, MAC_AC_SLIP_TYP.DIFF_ACT2, MAC_AC_SLIP_TYP.DIFF_ACT3, MAC_AC_SLIP_TYP.DIFF_ACT4, MAC_AC_SLIP_TYP.DIFF_ACT5, MAC_AC_SLIP_TYP.DIFF_RATE_ALC, 
					 MAC_AC_SLIP_TYP.DIFF_RATE_ITM, MAC_AC_SLIP_TYP.DIFF_OUTSRC_SUM, MAC_AC_SLIP_TYP.DIFF_OUTSRC_PRI, MAC_AC_SLIP_TYP.DIFF_OUTSRC_RATE, MAC_AC_SLIP_TYP.DIFF_SS_PAR, MAC_AC_SLIP_TYP.DIFF_SS_CHD, 
					 MAC_AC_SLIP_TYP.DIFF_STD_ADJ, MAC_AC_SLIP_TYP.RCV_ENT, MAC_AC_SLIP_TYP.ADV_ENT, MAC_AC_SLIP_TYP.ADV_SW, MAC_AC_SLIP_TYP.AR_FAD, MAC_AC_SLIP_TYP.AR_EX_GAIN_APPL, 
					 MAC_AC_SLIP_TYP.AR_EX_LOSS_APPL, MAC_AC_SLIP_TYP.AR_EX_GAIN_REV, MAC_AC_SLIP_TYP.AR_EX_LOSS_REV, MAC_AC_SLIP_TYP.AC_FAD, MAC_AC_SLIP_TYP.AC_EX_GAIN_APPL, MAC_AC_SLIP_TYP.AC_EX_LOSS_APPL, 
					 MAC_AC_SLIP_TYP.AC_EX_GAIN_REV, MAC_AC_SLIP_TYP.AC_EX_LOSS_REV, MAC_AC_SLIP_TYP.PAY, MAC_AC_SLIP_TYP.XPNS_PAY, MAC_AC_SLIP_TYP.ADV_PAY, MAC_AC_SLIP_TYP.AP_EX_GAIN_APPL, 
					 MAC_AC_SLIP_TYP.AP_EX_LOSS_APPL, MAC_AC_SLIP_TYP.AE_EX_GAIN_APPL, MAC_AC_SLIP_TYP.AE_EX_LOSS_APPL, MAC_AC_SLIP_TYP.AP_EX_GAIN_REV, MAC_AC_SLIP_TYP.AP_EX_LOSS_REV, MAC_AC_SLIP_TYP.AE_EX_GAIN_REV, 
					 MAC_AC_SLIP_TYP.AE_EX_LOSS_REV, MAC_AC_SLIP_TYP.PAY_COM_PAID
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
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
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
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
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
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
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
			if(MAC_AC_SLIP_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_AC_SLIP_TYP me = MAC_AC_SLIP_TYP.get(MAC_AC_SLIP_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_AC_SLIP_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_AC_SLIP_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_AC_SLIP_TYP.list();
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
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
			if(MAC_AC_SLIP_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_AC_SLIP_TYP.subList(cols, vals);
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
		for (MAC_AC_SLIP_TYP me : MAC_AC_SLIP_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_AC_SLIP_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_AC_SLIP_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_AC_SLIP_TYP", col);}
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
	protected boolean isSame(MAC_AC_SLIP_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 会計伝票区分：仕入かどうか
	 * @param value 定数値
	 * @return 定数値が仕入の値の場合true
	 */
	public static boolean isPURC(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入かどうか
	 * @param type 属性値
	 * @return 属性値が仕入の値の場合true
	 */
	public static boolean isPURC(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC.isSame(type);
	}

	/**
	 * 会計伝票区分：購買原価かどうか
	 * @param value 定数値
	 * @return 定数値が購買原価の値の場合true
	 */
	public static boolean isPURC_COST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_COST.isSame(type);
	}

	/**
	 * 会計伝票区分：購買原価かどうか
	 * @param type 属性値
	 * @return 属性値が購買原価の値の場合true
	 */
	public static boolean isPURC_COST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_COST.isSame(type);
	}

	/**
	 * 会計伝票区分：経費購買かどうか
	 * @param value 定数値
	 * @return 定数値が経費購買の値の場合true
	 */
	public static boolean isPURC_XPNS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：経費購買かどうか
	 * @param type 属性値
	 * @return 属性値が経費購買の値の場合true
	 */
	public static boolean isPURC_XPNS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：未着品仕入かどうか
	 * @param value 定数値
	 * @return 定数値が未着品仕入の値の場合true
	 */
	public static boolean isPURC_IN_TRANSIT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_IN_TRANSIT.isSame(type);
	}

	/**
	 * 会計伝票区分：未着品仕入かどうか
	 * @param type 属性値
	 * @return 属性値が未着品仕入の値の場合true
	 */
	public static boolean isPURC_IN_TRANSIT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_IN_TRANSIT.isSame(type);
	}

	/**
	 * 会計伝票区分：未着品入荷かどうか
	 * @param value 定数値
	 * @return 定数値が未着品入荷の値の場合true
	 */
	public static boolean isARR_IN_TRANSIT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ARR_IN_TRANSIT.isSame(type);
	}

	/**
	 * 会計伝票区分：未着品入荷かどうか
	 * @param type 属性値
	 * @return 属性値が未着品入荷の値の場合true
	 */
	public static boolean isARR_IN_TRANSIT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ARR_IN_TRANSIT.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入返品かどうか
	 * @param value 定数値
	 * @return 定数値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RET(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入返品かどうか
	 * @param type 属性値
	 * @return 属性値が仕入返品の値の場合true
	 */
	public static boolean isPURC_RET(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：経費返品かどうか
	 * @param value 定数値
	 * @return 定数値が経費返品の値の場合true
	 */
	public static boolean isPURC_RET_XPNS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_RET_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：経費返品かどうか
	 * @param type 属性値
	 * @return 属性値が経費返品の値の場合true
	 */
	public static boolean isPURC_RET_XPNS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_RET_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入値引かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入値引かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値引の値の場合true
	 */
	public static boolean isPURC_DSCNT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_DSCNT.isSame(type);
	}

	/**
	 * 会計伝票区分：経費値引かどうか
	 * @param value 定数値
	 * @return 定数値が経費値引の値の場合true
	 */
	public static boolean isPURC_DSCNT_XPNS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_DSCNT_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：経費値引かどうか
	 * @param type 属性値
	 * @return 属性値が経費値引の値の場合true
	 */
	public static boolean isPURC_DSCNT_XPNS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_DSCNT_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入値増かどうか
	 * @param value 定数値
	 * @return 定数値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 会計伝票区分：仕入値増かどうか
	 * @param type 属性値
	 * @return 属性値が仕入値増の値の場合true
	 */
	public static boolean isPURC_XTRA(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_XTRA.isSame(type);
	}

	/**
	 * 会計伝票区分：経費値増かどうか
	 * @param value 定数値
	 * @return 定数値が経費値増の値の場合true
	 */
	public static boolean isPURC_XTRA_XPNS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PURC_XTRA_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：経費値増かどうか
	 * @param type 属性値
	 * @return 属性値が経費値増の値の場合true
	 */
	public static boolean isPURC_XTRA_XPNS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PURC_XTRA_XPNS.isSame(type);
	}

	/**
	 * 会計伝票区分：売上かどうか
	 * @param value 定数値
	 * @return 定数値が売上の値の場合true
	 */
	public static boolean isSLS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SLS.isSame(type);
	}

	/**
	 * 会計伝票区分：売上かどうか
	 * @param type 属性値
	 * @return 属性値が売上の値の場合true
	 */
	public static boolean isSLS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SLS.isSame(type);
	}

	/**
	 * 会計伝票区分：売上原価かどうか
	 * @param value 定数値
	 * @return 定数値が売上原価の値の場合true
	 */
	public static boolean isSLS_COST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SLS_COST.isSame(type);
	}

	/**
	 * 会計伝票区分：売上原価かどうか
	 * @param type 属性値
	 * @return 属性値が売上原価の値の場合true
	 */
	public static boolean isSLS_COST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SLS_COST.isSame(type);
	}

	/**
	 * 会計伝票区分：売上返品かどうか
	 * @param value 定数値
	 * @return 定数値が売上返品の値の場合true
	 */
	public static boolean isSLS_RET(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SLS_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：売上返品かどうか
	 * @param type 属性値
	 * @return 属性値が売上返品の値の場合true
	 */
	public static boolean isSLS_RET(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SLS_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：売上値引かどうか
	 * @param value 定数値
	 * @return 定数値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 会計伝票区分：売上値引かどうか
	 * @param type 属性値
	 * @return 属性値が売上値引の値の場合true
	 */
	public static boolean isSLS_DSCNT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SLS_DSCNT.isSame(type);
	}

	/**
	 * 会計伝票区分：売上値増かどうか
	 * @param value 定数値
	 * @return 定数値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 会計伝票区分：売上値増かどうか
	 * @param type 属性値
	 * @return 属性値が売上値増の値の場合true
	 */
	public static boolean isSLS_XTRA(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SLS_XTRA.isSame(type);
	}

	/**
	 * 会計伝票区分：製造かどうか
	 * @param value 定数値
	 * @return 定数値が製造の値の場合true
	 */
	public static boolean isMFG(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.MFG.isSame(type);
	}

	/**
	 * 会計伝票区分：製造かどうか
	 * @param type 属性値
	 * @return 属性値が製造の値の場合true
	 */
	public static boolean isMFG(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.MFG.isSame(type);
	}

	/**
	 * 会計伝票区分：副産物製造かどうか
	 * @param value 定数値
	 * @return 定数値が副産物製造の値の場合true
	 */
	public static boolean isBYPROD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.BYPROD.isSame(type);
	}

	/**
	 * 会計伝票区分：副産物製造かどうか
	 * @param type 属性値
	 * @return 属性値が副産物製造の値の場合true
	 */
	public static boolean isBYPROD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.BYPROD.isSame(type);
	}

	/**
	 * 会計伝票区分：投入かどうか
	 * @param value 定数値
	 * @return 定数値が投入の値の場合true
	 */
	public static boolean isINPUT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.INPUT.isSame(type);
	}

	/**
	 * 会計伝票区分：投入かどうか
	 * @param type 属性値
	 * @return 属性値が投入の値の場合true
	 */
	public static boolean isINPUT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.INPUT.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（有償）かどうか
	 * @param value 定数値
	 * @return 定数値が投入（有償）の値の場合true
	 */
	public static boolean isIN_ONR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.IN_ONR.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（有償）かどうか
	 * @param type 属性値
	 * @return 属性値が投入（有償）の値の場合true
	 */
	public static boolean isIN_ONR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.IN_ONR.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（自給）かどうか
	 * @param value 定数値
	 * @return 定数値が投入（自給）の値の場合true
	 */
	public static boolean isIN_SS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.IN_SS.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（自給）かどうか
	 * @param type 属性値
	 * @return 属性値が投入（自給）の値の場合true
	 */
	public static boolean isIN_SS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.IN_SS.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（有償差益）かどうか
	 * @param value 定数値
	 * @return 定数値が投入（有償差益）の値の場合true
	 */
	public static boolean isIN_ONR_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.IN_ONR_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：投入（有償差益）かどうか
	 * @param type 属性値
	 * @return 属性値が投入（有償差益）の値の場合true
	 */
	public static boolean isIN_ONR_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.IN_ONR_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給の値の場合true
	 */
	public static boolean isFFR_PROV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.FFR_PROV.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給の値の場合true
	 */
	public static boolean isFFR_PROV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.FFR_PROV.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給の値の場合true
	 */
	public static boolean isONR_PROV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ONR_PROV.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給の値の場合true
	 */
	public static boolean isONR_PROV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ONR_PROV.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給戻かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給戻の値の場合true
	 */
	public static boolean isFFR_PRVR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.FFR_PRVR.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給戻かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給戻の値の場合true
	 */
	public static boolean isFFR_PRVR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.FFR_PRVR.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給戻かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給戻の値の場合true
	 */
	public static boolean isONR_PRVR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ONR_PRVR.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給戻かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給戻の値の場合true
	 */
	public static boolean isONR_PRVR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ONR_PRVR.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給原価かどうか
	 * @param value 定数値
	 * @return 定数値が無償支給原価の値の場合true
	 */
	public static boolean isFFR_PROV_CST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.FFR_PROV_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：無償支給原価かどうか
	 * @param type 属性値
	 * @return 属性値が無償支給原価の値の場合true
	 */
	public static boolean isFFR_PROV_CST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.FFR_PROV_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給原価かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給原価の値の場合true
	 */
	public static boolean isONR_PROV_CST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ONR_PROV_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給原価かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給原価の値の場合true
	 */
	public static boolean isONR_PROV_CST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ONR_PROV_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：検査抜取かどうか
	 * @param value 定数値
	 * @return 定数値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.INSP_SMPL.isSame(type);
	}

	/**
	 * 会計伝票区分：検査抜取かどうか
	 * @param type 属性値
	 * @return 属性値が検査抜取の値の場合true
	 */
	public static boolean isINSP_SMPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.INSP_SMPL.isSame(type);
	}

	/**
	 * 会計伝票区分：廃棄かどうか
	 * @param value 定数値
	 * @return 定数値が廃棄の値の場合true
	 */
	public static boolean isDISP_SCRP(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DISP_SCRP.isSame(type);
	}

	/**
	 * 会計伝票区分：廃棄かどうか
	 * @param type 属性値
	 * @return 属性値が廃棄の値の場合true
	 */
	public static boolean isDISP_SCRP(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DISP_SCRP.isSame(type);
	}

	/**
	 * 会計伝票区分：棚卸出庫かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸出庫の値の場合true
	 */
	public static boolean isSO_STKTK(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SO_STKTK.isSame(type);
	}

	/**
	 * 会計伝票区分：棚卸出庫かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸出庫の値の場合true
	 */
	public static boolean isSO_STKTK(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SO_STKTK.isSame(type);
	}

	/**
	 * 会計伝票区分：棚卸入庫かどうか
	 * @param value 定数値
	 * @return 定数値が棚卸入庫の値の場合true
	 */
	public static boolean isIN_STKTK(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.IN_STKTK.isSame(type);
	}

	/**
	 * 会計伝票区分：棚卸入庫かどうか
	 * @param type 属性値
	 * @return 属性値が棚卸入庫の値の場合true
	 */
	public static boolean isIN_STKTK(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.IN_STKTK.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入かどうか
	 * @param value 定数値
	 * @return 定数値が販売倉入の値の場合true
	 */
	public static boolean isPROD_ITM_SO(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入かどうか
	 * @param type 属性値
	 * @return 属性値が販売倉入の値の場合true
	 */
	public static boolean isPROD_ITM_SO(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入かどうか
	 * @param value 定数値
	 * @return 定数値が生産戻入の値の場合true
	 */
	public static boolean isPROD_ITM_RET_SO(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入かどうか
	 * @param type 属性値
	 * @return 属性値が生産戻入の値の場合true
	 */
	public static boolean isPROD_ITM_RET_SO(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動かどうか
	 * @param value 定数値
	 * @return 定数値が部門間移動の値の場合true
	 */
	public static boolean isDPT_XFR_SO(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DPT_XFR_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動かどうか
	 * @param type 属性値
	 * @return 属性値が部門間移動の値の場合true
	 */
	public static boolean isDPT_XFR_SO(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DPT_XFR_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：他勘定出庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定出庫の値の場合true
	 */
	public static boolean isOTH_CCN_SO(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.OTH_CCN_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：他勘定出庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定出庫の値の場合true
	 */
	public static boolean isOTH_CCN_SO(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.OTH_CCN_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：他勘定入庫かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定入庫の値の場合true
	 */
	public static boolean isOTH_CCN_GR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.OTH_CCN_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：他勘定入庫かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定入庫の値の場合true
	 */
	public static boolean isOTH_CCN_GR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.OTH_CCN_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫振替出庫かどうか
	 * @param value 定数値
	 * @return 定数値が在庫振替出庫の値の場合true
	 */
	public static boolean isSTK_SW_SO(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.STK_SW_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫振替出庫かどうか
	 * @param type 属性値
	 * @return 属性値が在庫振替出庫の値の場合true
	 */
	public static boolean isSTK_SW_SO(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.STK_SW_SO.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫振替入庫かどうか
	 * @param value 定数値
	 * @return 定数値が在庫振替入庫の値の場合true
	 */
	public static boolean isSTK_SW_GR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.STK_SW_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫振替入庫かどうか
	 * @param type 属性値
	 * @return 属性値が在庫振替入庫の値の場合true
	 */
	public static boolean isSTK_SW_GR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.STK_SW_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：出荷かどうか
	 * @param value 定数値
	 * @return 定数値が出荷の値の場合true
	 */
	public static boolean isSHIP(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SHIP.isSame(type);
	}

	/**
	 * 会計伝票区分：出荷かどうか
	 * @param type 属性値
	 * @return 属性値が出荷の値の場合true
	 */
	public static boolean isSHIP(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SHIP.isSame(type);
	}

	/**
	 * 会計伝票区分：出荷返品かどうか
	 * @param value 定数値
	 * @return 定数値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RET(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.SHIP_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：出荷返品かどうか
	 * @param type 属性値
	 * @return 属性値が出荷返品の値の場合true
	 */
	public static boolean isSHIP_RET(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.SHIP_RET.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫（生産）かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫（生産）の値の場合true
	 */
	public static boolean isEOM_STK_PROD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.EOM_STK_PROD.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫（生産）かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫（生産）の値の場合true
	 */
	public static boolean isEOM_STK_PROD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.EOM_STK_PROD.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫（販売）かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫（販売）の値の場合true
	 */
	public static boolean isEOM_STK_SLS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.EOM_STK_SLS.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫（販売）かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫（販売）の値の場合true
	 */
	public static boolean isEOM_STK_SLS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.EOM_STK_SLS.isSame(type);
	}

	/**
	 * 会計伝票区分：仕掛原価かどうか
	 * @param value 定数値
	 * @return 定数値が仕掛原価の値の場合true
	 */
	public static boolean isINP_WIP_CST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.INP_WIP_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：仕掛原価かどうか
	 * @param type 属性値
	 * @return 属性値が仕掛原価の値の場合true
	 */
	public static boolean isINP_WIP_CST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.INP_WIP_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫評価替差異かどうか
	 * @param value 定数値
	 * @return 定数値が在庫評価替差異の値の場合true
	 */
	public static boolean isSTK_ASM_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.STK_ASM_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：在庫評価替差異かどうか
	 * @param type 属性値
	 * @return 属性値が在庫評価替差異の値の場合true
	 */
	public static boolean isSTK_ASM_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.STK_ASM_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給差益かどうか
	 * @param value 定数値
	 * @return 定数値が有償支給差益の値の場合true
	 */
	public static boolean isONR_PROV_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ONR_PROV_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：有償支給差益かどうか
	 * @param type 属性値
	 * @return 属性値が有償支給差益の値の場合true
	 */
	public static boolean isONR_PROV_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ONR_PROV_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：原価受払差額かどうか
	 * @param value 定数値
	 * @return 定数値が原価受払差額の値の場合true
	 */
	public static boolean isCST_IO_AOD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.CST_IO_AOD.isSame(type);
	}

	/**
	 * 会計伝票区分：原価受払差額かどうか
	 * @param type 属性値
	 * @return 属性値が原価受払差額の値の場合true
	 */
	public static boolean isCST_IO_AOD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.CST_IO_AOD.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫評価損かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫評価損の値の場合true
	 */
	public static boolean isEOM_STK_ASM_MIS(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.EOM_STK_ASM_MIS.isSame(type);
	}

	/**
	 * 会計伝票区分：月末在庫評価損かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫評価損の値の場合true
	 */
	public static boolean isEOM_STK_ASM_MIS(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.EOM_STK_ASM_MIS.isSame(type);
	}

	/**
	 * 会計伝票区分：完成原価かどうか
	 * @param value 定数値
	 * @return 定数値が完成原価の値の場合true
	 */
	public static boolean isCOMP_CST(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.COMP_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：完成原価かどうか
	 * @param type 属性値
	 * @return 属性値が完成原価の値の場合true
	 */
	public static boolean isCOMP_CST(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.COMP_CST.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間配賦かどうか
	 * @param value 定数値
	 * @return 定数値が部門間配賦の値の場合true
	 */
	public static boolean isDPT_ALC(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DPT_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間配賦かどうか
	 * @param type 属性値
	 * @return 属性値が部門間配賦の値の場合true
	 */
	public static boolean isDPT_ALC(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DPT_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：品目配賦かどうか
	 * @param value 定数値
	 * @return 定数値が品目配賦の値の場合true
	 */
	public static boolean isITM_ALC(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ITM_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：品目配賦かどうか
	 * @param type 属性値
	 * @return 属性値が品目配賦の値の場合true
	 */
	public static boolean isITM_ALC(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ITM_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入（入庫）かどうか
	 * @param value 定数値
	 * @return 定数値が販売倉入（入庫）の値の場合true
	 */
	public static boolean isPROD_ITM_GR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入（入庫）かどうか
	 * @param type 属性値
	 * @return 属性値が販売倉入（入庫）の値の場合true
	 */
	public static boolean isPROD_ITM_GR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入（差額）かどうか
	 * @param value 定数値
	 * @return 定数値が販売倉入（差額）の値の場合true
	 */
	public static boolean isPROD_ITM_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：販売倉入（差額）かどうか
	 * @param type 属性値
	 * @return 属性値が販売倉入（差額）の値の場合true
	 */
	public static boolean isPROD_ITM_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入（入庫）かどうか
	 * @param value 定数値
	 * @return 定数値が生産戻入（入庫）の値の場合true
	 */
	public static boolean isPROD_ITM_RET_GR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入（入庫）かどうか
	 * @param type 属性値
	 * @return 属性値が生産戻入（入庫）の値の場合true
	 */
	public static boolean isPROD_ITM_RET_GR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入（差額）かどうか
	 * @param value 定数値
	 * @return 定数値が生産戻入（差額）の値の場合true
	 */
	public static boolean isPROD_ITM_RET_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：生産戻入（差額）かどうか
	 * @param type 属性値
	 * @return 属性値が生産戻入（差額）の値の場合true
	 */
	public static boolean isPROD_ITM_RET_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PROD_ITM_RET_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動（入庫）かどうか
	 * @param value 定数値
	 * @return 定数値が部門間移動（入庫）の値の場合true
	 */
	public static boolean isDPT_XFR_GR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DPT_XFR_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動（入庫）かどうか
	 * @param type 属性値
	 * @return 属性値が部門間移動（入庫）の値の場合true
	 */
	public static boolean isDPT_XFR_GR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DPT_XFR_GR.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動（差額）かどうか
	 * @param value 定数値
	 * @return 定数値が部門間移動（差額）の値の場合true
	 */
	public static boolean isDPT_XFR_DIFF(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DPT_XFR_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：部門間移動（差額）かどうか
	 * @param type 属性値
	 * @return 属性値が部門間移動（差額）の値の場合true
	 */
	public static boolean isDPT_XFR_DIFF(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DPT_XFR_DIFF.isSame(type);
	}

	/**
	 * 会計伝票区分：受入価格差異（合計）かどうか
	 * @param value 定数値
	 * @return 定数値が受入価格差異（合計）の値の場合true
	 */
	public static boolean isDIFF_IO_SUM(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_IO_SUM.isSame(type);
	}

	/**
	 * 会計伝票区分：受入価格差異（合計）かどうか
	 * @param type 属性値
	 * @return 属性値が受入価格差異（合計）の値の場合true
	 */
	public static boolean isDIFF_IO_SUM(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_IO_SUM.isSame(type);
	}

	/**
	 * 会計伝票区分：受入単価差異（単価差異）かどうか
	 * @param value 定数値
	 * @return 定数値が受入単価差異（単価差異）の値の場合true
	 */
	public static boolean isDIFF_IO_PRI(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_IO_PRI.isSame(type);
	}

	/**
	 * 会計伝票区分：受入単価差異（単価差異）かどうか
	 * @param type 属性値
	 * @return 属性値が受入単価差異（単価差異）の値の場合true
	 */
	public static boolean isDIFF_IO_PRI(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_IO_PRI.isSame(type);
	}

	/**
	 * 会計伝票区分：受入単価差異（レート差異）かどうか
	 * @param value 定数値
	 * @return 定数値が受入単価差異（レート差異）の値の場合true
	 */
	public static boolean isDIFF_IO_RATE(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_IO_RATE.isSame(type);
	}

	/**
	 * 会計伝票区分：受入単価差異（レート差異）かどうか
	 * @param type 属性値
	 * @return 属性値が受入単価差異（レート差異）の値の場合true
	 */
	public static boolean isDIFF_IO_RATE(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_IO_RATE.isSame(type);
	}

	/**
	 * 会計伝票区分：数量差異（親）かどうか
	 * @param value 定数値
	 * @return 定数値が数量差異（親）の値の場合true
	 */
	public static boolean isDIFF_QT_PAR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_QT_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：数量差異（親）かどうか
	 * @param type 属性値
	 * @return 属性値が数量差異（親）の値の場合true
	 */
	public static boolean isDIFF_QT_PAR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_QT_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：数量差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が数量差異（子）の値の場合true
	 */
	public static boolean isDIFF_QT_CHD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_QT_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：数量差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が数量差異（子）の値の場合true
	 */
	public static boolean isDIFF_QT_CHD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_QT_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：払出価格差異（親）かどうか
	 * @param value 定数値
	 * @return 定数値が払出価格差異（親）の値の場合true
	 */
	public static boolean isDIFF_PR_PAR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_PR_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：払出価格差異（親）かどうか
	 * @param type 属性値
	 * @return 属性値が払出価格差異（親）の値の場合true
	 */
	public static boolean isDIFF_PR_PAR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_PR_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：払出価格差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が払出価格差異（子）の値の場合true
	 */
	public static boolean isDIFF_PR_CHD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_PR_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：払出価格差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が払出価格差異（子）の値の場合true
	 */
	public static boolean isDIFF_PR_CHD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_PR_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：工数差異かどうか
	 * @param value 定数値
	 * @return 定数値が工数差異の値の場合true
	 */
	public static boolean isDIFF_WK(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_WK.isSame(type);
	}

	/**
	 * 会計伝票区分：工数差異かどうか
	 * @param type 属性値
	 * @return 属性値が工数差異の値の場合true
	 */
	public static boolean isDIFF_WK(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_WK.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異１かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異１の値の場合true
	 */
	public static boolean isDIFF_ACT1(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_ACT1.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異１かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異１の値の場合true
	 */
	public static boolean isDIFF_ACT1(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_ACT1.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異２かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異２の値の場合true
	 */
	public static boolean isDIFF_ACT2(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_ACT2.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異２かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異２の値の場合true
	 */
	public static boolean isDIFF_ACT2(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_ACT2.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異３かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異３の値の場合true
	 */
	public static boolean isDIFF_ACT3(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_ACT3.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異３かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異３の値の場合true
	 */
	public static boolean isDIFF_ACT3(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_ACT3.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異４かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異４の値の場合true
	 */
	public static boolean isDIFF_ACT4(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_ACT4.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異４かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異４の値の場合true
	 */
	public static boolean isDIFF_ACT4(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_ACT4.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異５かどうか
	 * @param value 定数値
	 * @return 定数値が実績差異５の値の場合true
	 */
	public static boolean isDIFF_ACT5(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_ACT5.isSame(type);
	}

	/**
	 * 会計伝票区分：実績差異５かどうか
	 * @param type 属性値
	 * @return 属性値が実績差異５の値の場合true
	 */
	public static boolean isDIFF_ACT5(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_ACT5.isSame(type);
	}

	/**
	 * 会計伝票区分：配賦率差異（配賦科目）かどうか
	 * @param value 定数値
	 * @return 定数値が配賦率差異（配賦科目）の値の場合true
	 */
	public static boolean isDIFF_RATE_ALC(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_RATE_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：配賦率差異（配賦科目）かどうか
	 * @param type 属性値
	 * @return 属性値が配賦率差異（配賦科目）の値の場合true
	 */
	public static boolean isDIFF_RATE_ALC(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_RATE_ALC.isSame(type);
	}

	/**
	 * 会計伝票区分：配賦率差異（品目）かどうか
	 * @param value 定数値
	 * @return 定数値が配賦率差異（品目）の値の場合true
	 */
	public static boolean isDIFF_RATE_ITM(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_RATE_ITM.isSame(type);
	}

	/**
	 * 会計伝票区分：配賦率差異（品目）かどうか
	 * @param type 属性値
	 * @return 属性値が配賦率差異（品目）の値の場合true
	 */
	public static boolean isDIFF_RATE_ITM(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_RATE_ITM.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（合計）かどうか
	 * @param value 定数値
	 * @return 定数値が外注単価差異（合計）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_SUM(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_SUM.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（合計）かどうか
	 * @param type 属性値
	 * @return 属性値が外注単価差異（合計）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_SUM(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_SUM.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（単価差異）かどうか
	 * @param value 定数値
	 * @return 定数値が外注単価差異（単価差異）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_PRI(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_PRI.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（単価差異）かどうか
	 * @param type 属性値
	 * @return 属性値が外注単価差異（単価差異）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_PRI(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_PRI.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（レート差異）かどうか
	 * @param value 定数値
	 * @return 定数値が外注単価差異（レート差異）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_RATE(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_RATE.isSame(type);
	}

	/**
	 * 会計伝票区分：外注単価差異（レート差異）かどうか
	 * @param type 属性値
	 * @return 属性値が外注単価差異（レート差異）の値の場合true
	 */
	public static boolean isDIFF_OUTSRC_RATE(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_OUTSRC_RATE.isSame(type);
	}

	/**
	 * 会計伝票区分：自給単価差異（親）かどうか
	 * @param value 定数値
	 * @return 定数値が自給単価差異（親）の値の場合true
	 */
	public static boolean isDIFF_SS_PAR(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_SS_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：自給単価差異（親）かどうか
	 * @param type 属性値
	 * @return 属性値が自給単価差異（親）の値の場合true
	 */
	public static boolean isDIFF_SS_PAR(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_SS_PAR.isSame(type);
	}

	/**
	 * 会計伝票区分：自給単価差異（子）かどうか
	 * @param value 定数値
	 * @return 定数値が自給単価差異（子）の値の場合true
	 */
	public static boolean isDIFF_SS_CHD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_SS_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：自給単価差異（子）かどうか
	 * @param type 属性値
	 * @return 属性値が自給単価差異（子）の値の場合true
	 */
	public static boolean isDIFF_SS_CHD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_SS_CHD.isSame(type);
	}

	/**
	 * 会計伝票区分：標準調整差異かどうか
	 * @param value 定数値
	 * @return 定数値が標準調整差異の値の場合true
	 */
	public static boolean isDIFF_STD_ADJ(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.DIFF_STD_ADJ.isSame(type);
	}

	/**
	 * 会計伝票区分：標準調整差異かどうか
	 * @param type 属性値
	 * @return 属性値が標準調整差異の値の場合true
	 */
	public static boolean isDIFF_STD_ADJ(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.DIFF_STD_ADJ.isSame(type);
	}

	/**
	 * 会計伝票区分：入金登録かどうか
	 * @param value 定数値
	 * @return 定数値が入金登録の値の場合true
	 */
	public static boolean isRCV_ENT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.RCV_ENT.isSame(type);
	}

	/**
	 * 会計伝票区分：入金登録かどうか
	 * @param type 属性値
	 * @return 属性値が入金登録の値の場合true
	 */
	public static boolean isRCV_ENT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.RCV_ENT.isSame(type);
	}

	/**
	 * 会計伝票区分：前受登録かどうか
	 * @param value 定数値
	 * @return 定数値が前受登録の値の場合true
	 */
	public static boolean isADV_ENT(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ADV_ENT.isSame(type);
	}

	/**
	 * 会計伝票区分：前受登録かどうか
	 * @param type 属性値
	 * @return 属性値が前受登録の値の場合true
	 */
	public static boolean isADV_ENT(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ADV_ENT.isSame(type);
	}

	/**
	 * 会計伝票区分：前受振替かどうか
	 * @param value 定数値
	 * @return 定数値が前受振替の値の場合true
	 */
	public static boolean isADV_SW(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ADV_SW.isSame(type);
	}

	/**
	 * 会計伝票区分：前受振替かどうか
	 * @param type 属性値
	 * @return 属性値が前受振替の値の場合true
	 */
	public static boolean isADV_SW(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ADV_SW.isSame(type);
	}

	/**
	 * 会計伝票区分：売掛消込かどうか
	 * @param value 定数値
	 * @return 定数値が売掛消込の値の場合true
	 */
	public static boolean isAR_FAD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AR_FAD.isSame(type);
	}

	/**
	 * 会計伝票区分：売掛消込かどうか
	 * @param type 属性値
	 * @return 属性値が売掛消込の値の場合true
	 */
	public static boolean isAR_FAD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AR_FAD.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債権消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（債権消込）の値の場合true
	 */
	public static boolean isAR_EX_GAIN_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AR_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債権消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（債権消込）の値の場合true
	 */
	public static boolean isAR_EX_GAIN_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AR_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債権消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（債権消込）の値の場合true
	 */
	public static boolean isAR_EX_LOSS_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AR_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債権消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（債権消込）の値の場合true
	 */
	public static boolean isAR_EX_LOSS_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AR_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債権評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（債権評価替）の値の場合true
	 */
	public static boolean isAR_EX_GAIN_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AR_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債権評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（債権評価替）の値の場合true
	 */
	public static boolean isAR_EX_GAIN_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AR_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債権評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（債権評価替）の値の場合true
	 */
	public static boolean isAR_EX_LOSS_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AR_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債権評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（債権評価替）の値の場合true
	 */
	public static boolean isAR_EX_LOSS_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AR_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：未収金消込かどうか
	 * @param value 定数値
	 * @return 定数値が未収金消込の値の場合true
	 */
	public static boolean isAC_FAD(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AC_FAD.isSame(type);
	}

	/**
	 * 会計伝票区分：未収金消込かどうか
	 * @param type 属性値
	 * @return 属性値が未収金消込の値の場合true
	 */
	public static boolean isAC_FAD(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AC_FAD.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未収金消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（未収金消込）の値の場合true
	 */
	public static boolean isAC_EX_GAIN_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AC_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未収金消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（未収金消込）の値の場合true
	 */
	public static boolean isAC_EX_GAIN_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AC_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未収金消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（未収金消込）の値の場合true
	 */
	public static boolean isAC_EX_LOSS_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AC_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未収金消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（未収金消込）の値の場合true
	 */
	public static boolean isAC_EX_LOSS_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AC_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未収金評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（未収金評価替）の値の場合true
	 */
	public static boolean isAC_EX_GAIN_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AC_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未収金評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（未収金評価替）の値の場合true
	 */
	public static boolean isAC_EX_GAIN_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AC_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未収金評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（未収金評価替）の値の場合true
	 */
	public static boolean isAC_EX_LOSS_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AC_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未収金評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（未収金評価替）の値の場合true
	 */
	public static boolean isAC_EX_LOSS_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AC_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：支払かどうか
	 * @param value 定数値
	 * @return 定数値が支払の値の場合true
	 */
	public static boolean isPAY(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：支払かどうか
	 * @param type 属性値
	 * @return 属性値が支払の値の場合true
	 */
	public static boolean isPAY(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：支払（未払金）かどうか
	 * @param value 定数値
	 * @return 定数値が支払（未払金）の値の場合true
	 */
	public static boolean isXPNS_PAY(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.XPNS_PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：支払（未払金）かどうか
	 * @param type 属性値
	 * @return 属性値が支払（未払金）の値の場合true
	 */
	public static boolean isXPNS_PAY(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.XPNS_PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：前渡登録かどうか
	 * @param value 定数値
	 * @return 定数値が前渡登録の値の場合true
	 */
	public static boolean isADV_PAY(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.ADV_PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：前渡登録かどうか
	 * @param type 属性値
	 * @return 属性値が前渡登録の値の場合true
	 */
	public static boolean isADV_PAY(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.ADV_PAY.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債務消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（債務消込）の値の場合true
	 */
	public static boolean isAP_EX_GAIN_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AP_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債務消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（債務消込）の値の場合true
	 */
	public static boolean isAP_EX_GAIN_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AP_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債務消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（債務消込）の値の場合true
	 */
	public static boolean isAP_EX_LOSS_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AP_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債務消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（債務消込）の値の場合true
	 */
	public static boolean isAP_EX_LOSS_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AP_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未払金消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（未払金消込）の値の場合true
	 */
	public static boolean isAE_EX_GAIN_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AE_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未払金消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（未払金消込）の値の場合true
	 */
	public static boolean isAE_EX_GAIN_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AE_EX_GAIN_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未払金消込）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（未払金消込）の値の場合true
	 */
	public static boolean isAE_EX_LOSS_APPL(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AE_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未払金消込）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（未払金消込）の値の場合true
	 */
	public static boolean isAE_EX_LOSS_APPL(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AE_EX_LOSS_APPL.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債務評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（債務評価替）の値の場合true
	 */
	public static boolean isAP_EX_GAIN_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AP_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（債務評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（債務評価替）の値の場合true
	 */
	public static boolean isAP_EX_GAIN_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AP_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債務評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（債務評価替）の値の場合true
	 */
	public static boolean isAP_EX_LOSS_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AP_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（債務評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（債務評価替）の値の場合true
	 */
	public static boolean isAP_EX_LOSS_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AP_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未払金評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差益（未払金評価替）の値の場合true
	 */
	public static boolean isAE_EX_GAIN_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AE_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差益（未払金評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差益（未払金評価替）の値の場合true
	 */
	public static boolean isAE_EX_GAIN_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AE_EX_GAIN_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未払金評価替）かどうか
	 * @param value 定数値
	 * @return 定数値が為替差損（未払金評価替）の値の場合true
	 */
	public static boolean isAE_EX_LOSS_REV(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.AE_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：為替差損（未払金評価替）かどうか
	 * @param type 属性値
	 * @return 属性値が為替差損（未払金評価替）の値の場合true
	 */
	public static boolean isAE_EX_LOSS_REV(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.AE_EX_LOSS_REV.isSame(type);
	}

	/**
	 * 会計伝票区分：振込手数料かどうか
	 * @param value 定数値
	 * @return 定数値が振込手数料の値の場合true
	 */
	public static boolean isPAY_COM_PAID(String value) {
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
		return MAC_AC_SLIP_TYP.PAY_COM_PAID.isSame(type);
	}

	/**
	 * 会計伝票区分：振込手数料かどうか
	 * @param type 属性値
	 * @return 属性値が振込手数料の値の場合true
	 */
	public static boolean isPAY_COM_PAID(MAC_AC_SLIP_TYP type) {
		return MAC_AC_SLIP_TYP.PAY_COM_PAID.isSame(type);
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
			MAC_AC_SLIP_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.get(value);
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
			MAC_AC_SLIP_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
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
			MAC_AC_SLIP_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.get(value);
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
			MAC_AC_SLIP_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
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
			MAC_AC_SLIP_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.get(value);
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
			MAC_AC_SLIP_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
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
			MAC_AC_SLIP_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.get(value);
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
			MAC_AC_SLIP_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_AC_SLIP_TYP type = MAC_AC_SLIP_TYP.getNE(value);
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
