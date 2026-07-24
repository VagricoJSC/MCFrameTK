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
abstract class MGC_COST_COPY_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MG";

	public static final String typeID = "COST_COPY_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MGC_COST_COPY_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "cost_copy_typ";

	public static final String $NAME = "cost_copy_typ_nm";

	public static final String $TGT_CTG = "tgt_ctg";

	public static final String $TGT_TERM = "tgt_term";

	public static final String $TGT_PLN = "tgt_pln";

	public static final String $TGT_ACT = "tgt_act";

	public static final String $USE_KEY = "use_key";

	public static final String $TAB_CTG_TYP = "tab_ctg_typ";

	public static final String $MODULE_ID = "module_id";

	public static final String $SCREEN_ID = "screen_id";

	/*
	 * 定数の定義です。
	 */
	/** 原価コピー対象区分：入出庫実績振替マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ACT_IO = create("MAM_ACT_IO", "MAM_ACT_IO", true, false, false, false, false, MGC_TAB_CTG_TYP.OTHER.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0640");

	/** 原価コピー対象区分：費目配賦マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_EXPNS = create("MAM_ALC_EXPNS", "MAM_ALC_EXPNS", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0300");

	/** 原価コピー対象区分：投入配賦マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_INPT = create("MAM_ALC_INPT", "MAM_ALC_INPT", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0310");

	/** 原価コピー対象区分：汎用配賦マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_GP_ALC = create("MAM_ALC_GP_ALC", "MAM_ALC_GP_ALC", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0330");

	/** 原価コピー対象区分：任意基準値配賦マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_OTHER = create("MAM_ALC_OTHER", "MAM_ALC_OTHER", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0320");

	/** 原価コピー対象区分：配賦パタン選択マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_PTN_SEL = create("MAM_ALC_PTN_SEL", "MAM_ALC_PTN_SEL", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0340");

	/** 原価コピー対象区分：配賦方法マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_RULE = create("MAM_ALC_RULE", "MAM_ALC_RULE", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0280");

	/** 原価コピー対象区分：工数配賦マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_ALC_WK = create("MAM_ALC_WK", "MAM_ALC_WK", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0290");

	/** 原価コピー対象区分：配賦係数構成マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_COEF_CONFIG = create("MAM_COEF_CONFIG", "MAM_COEF_CONFIG", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0250");

	/** 原価コピー対象区分：配賦係数自動構成マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_COEF_AUTO = create("MAM_COEF_AUTO", "MAM_COEF_AUTO", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0260");

	/** 原価コピー対象区分：原価品群構成マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_CTG_CONFIG = create("MAM_CTG_CONFIG", "MAM_CTG_CONFIG", false, true, false, false, false, MGC_TAB_CTG_TYP.COMMON.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABCP2080");

	/** 原価コピー対象区分：原価部門マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_COST_DPT = create("MAM_COST_DPT", "MAM_COST_DPT", false, true, false, false, false, MGC_TAB_CTG_TYP.COMMON.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABCP2090");

	/** 原価コピー対象区分：原価部門構成マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_DPT_CONFIG = create("MAM_DPT_CONFIG", "MAM_DPT_CONFIG", false, true, false, false, false, MGC_TAB_CTG_TYP.COMMON.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABCP2100");

	/** 原価コピー対象区分：一次配賦先部門マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_ALC_DPT = create("MAM_PRE_ALC_DPT", "MAM_PRE_ALC_DPT", false, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0530");

	/** 原価コピー対象区分：一次配賦基準選択マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_ALC_RATE_SEL = create("MAM_PRE_ALC_RATE_SEL", "MAM_PRE_ALC_RATE_SEL", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0540");

	/** 原価コピー対象区分：一次配賦基準カテゴリマスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_ALC_CTG = create("MAM_PRE_ALC_CTG", "MAM_PRE_ALC_CTG", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0520");

	/** 原価コピー対象区分：一次配賦比率作成対象マスタ（計画）
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_RATE_TGT_PLN = create("MAM_PRE_RATE_TGT", "MAM_PRE_RATE_TGT_PLN", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0550");

	/** 原価コピー対象区分：一次配賦比率作成対象マスタ（実績）
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_RATE_TGT_ACT = create("MAM_PRE_RATE_TGT", "MAM_PRE_RATE_TGT_ACT", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0550");

	/** 原価コピー対象区分：一次配賦基準工数マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_PRE_ALC_WK = create("MAM_PRE_ALC_WK", "MAM_PRE_ALC_WK", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0560");

	/** 原価コピー対象区分：個別評価設定マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_REC_EVAL_SET = create("MAM_REC_EVAL_SET", "MAM_REC_EVAL_SET", true, false, false, false, false, MGC_TAB_CTG_TYP.OTHER.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0650");

	/** 原価コピー対象区分：経費配賦振替マスタ
	 */
	public static final MGC_COST_COPY_TYP MAM_XPNS_PURC_ALC = create("MAM_XPNS_PURC_ALC", "MAM_XPNS_PURC_ALC", true, false, false, false, false, MGC_TAB_CTG_TYP.OTHER.value(), FSC_MODULE_ID.MasterAdmin.value(), "MABGP0630");

	/** 原価コピー対象区分：一次配賦期間比率
	 */
	public static final MGC_COST_COPY_TYP MGT_PRE_RATE_TERM = create("MGT_PRE_RATE_TERM", "MGT_PRE_RATE_TERM", true, true, false, false, false, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0110");

	/** 原価コピー対象区分：配賦費用計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_ALC_AMT = create("MGT_PLN_ALC_AMT", "MGT_PLN_ALC_AMT", false, false, true, false, true, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0010");

	/** 原価コピー対象区分：配賦費用計画ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_ALC_AMT_IF = create("MGT_PLN_ALC_AMT_IF", "MGT_PLN_ALC_AMT_IF", false, false, true, false, true, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0030");

	/** 原価コピー対象区分：品目工数計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_ITM_WK = create("MGT_PLN_ITM_WK", "MGT_PLN_ITM_WK", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0050");

	/** 原価コピー対象区分：品目外工数計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_OTHER_WK = create("MGT_PLN_OTHER_WK", "MGT_PLN_OTHER_WK", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0060");

	/** 原価コピー対象区分：製造計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_MFG = create("MGT_PLN_MFG", "MGT_PLN_MFG", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0030");

	/** 原価コピー対象区分：購買計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_PURC = create("MGT_PLN_PURC", "MGT_PLN_PURC", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0040");

	/** 原価コピー対象区分：月次計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_RQMT = create("MGT_PLN_RQMT", "MGT_PLN_RQMT", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0020");

	/** 原価コピー対象区分：売上計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_SLS = create("MGT_PLN_SLS", "MGT_PLN_SLS", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0010");

	/** 原価コピー対象区分：投入計画
	 */
	public static final MGC_COST_COPY_TYP MGT_PLN_INPT = create("MGT_PLN_INPT", "MGT_PLN_INPT", false, false, true, false, true, MGC_TAB_CTG_TYP.PLN.value(), FSC_MODULE_ID.CostManagement.value(), "MGBAP0070");

	/** 原価コピー対象区分：一次配賦月次比率（計画）
	 */
	public static final MGC_COST_COPY_TYP MGT_PRE_RATE_MLY_PLN = create("MGT_PRE_RATE_MLY", "MGT_PRE_RATE_MLY_PLN", false, false, true, false, false, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0120");

	/** 原価コピー対象区分：予定配賦率
	 */
	public static final MGC_COST_COPY_TYP MGT_ALC_RATE = create("MGT_ALC_RATE", "MGT_ALC_RATE", false, false, true, false, false, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0200");

	/** 原価コピー対象区分：配賦費用実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_ALC_AMT = create("MGT_ACT_ALC_AMT", "MGT_ACT_ALC_AMT", false, false, false, true, true, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0020");

	/** 原価コピー対象区分：配賦費用実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_ALC_AMT_IF = create("MGT_ACT_ALC_AMT_IF", "MGT_ACT_ALC_AMT_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0040");

	/** 原価コピー対象区分：汎用配賦対象
	 */
	public static final MGC_COST_COPY_TYP MGT_GP_ALC = create("MGT_GP_ALC", "MGT_GP_ALC", false, false, false, true, false, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0210");

	/** 原価コピー対象区分：指図仕掛実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INST_WIP_IF = create("MGT_ACT_INST_WIP_IF", "MGT_ACT_INST_WIP_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0350");

	/** 原価コピー対象区分：製造実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_MFG_IF = create("MGT_ACT_MFG_IF", "MGT_ACT_MFG_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0300");

	/** 原価コピー対象区分：購買実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_PURC_IF = create("MGT_ACT_PURC_IF", "MGT_ACT_PURC_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0310");

	/** 原価コピー対象区分：投入実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INPT_IF = create("MGT_ACT_INPT_IF", "MGT_ACT_INPT_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0320");

	/** 原価コピー対象区分：指図工数実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INST_WK_IF = create("MGT_ACT_INST_WK_IF", "MGT_ACT_INST_WK_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0330");

	/** 原価コピー対象区分：指図外工数実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_OTHER_WK_IF = create("MGT_ACT_OTHER_WK_IF", "MGT_ACT_OTHER_WK_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0340");

	/** 原価コピー対象区分：入出庫実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_IO_IF = create("MGT_ACT_IO_IF", "MGT_ACT_IO_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0360");

	/** 原価コピー対象区分：売上実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_SLS_IF = create("MGT_ACT_SLS_IF", "MGT_ACT_SLS_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0370");

	/** 原価コピー対象区分：在庫実績ＩＦ
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_STK_IF = create("MGT_ACT_STK_IF", "MGT_ACT_STK_IF", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_IF.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0380");

	/** 原価コピー対象区分：指図仕掛実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INST_WIP = create("MGT_ACT_INST_WIP", "MGT_ACT_INST_WIP", false, false, false, true, false, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0150");

	/** 原価コピー対象区分：製造実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_MFG = create("MGT_ACT_MFG", "MGT_ACT_MFG", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0100");

	/** 原価コピー対象区分：購買実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_PURC = create("MGT_ACT_PURC", "MGT_ACT_PURC", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0110");

	/** 原価コピー対象区分：投入実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INPT = create("MGT_ACT_INPT", "MGT_ACT_INPT", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0120");

	/** 原価コピー対象区分：指図工数実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_INST_WK = create("MGT_ACT_INST_WK", "MGT_ACT_INST_WK", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0130");

	/** 原価コピー対象区分：指図外工数実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_OTHER_WK = create("MGT_ACT_OTHER_WK", "MGT_ACT_OTHER_WK", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0140");

	/** 原価コピー対象区分：入出庫実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_IO = create("MGT_ACT_IO", "MGT_ACT_IO", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0160");

	/** 原価コピー対象区分：売上実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_SLS = create("MGT_ACT_SLS", "MGT_ACT_SLS", false, false, false, true, true, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0170");

	/** 原価コピー対象区分：在庫実績
	 */
	public static final MGC_COST_COPY_TYP MGT_ACT_STK = create("MGT_ACT_STK", "MGT_ACT_STK", false, false, false, true, false, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0180");

	/** 原価コピー対象区分：一次配賦月次比率（実績）
	 */
	public static final MGC_COST_COPY_TYP MGT_PRE_RATE_MLY_ACT = create("MGT_PRE_RATE_MLY", "MGT_PRE_RATE_MLY_ACT", false, false, false, true, false, MGC_TAB_CTG_TYP.ALC_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBGP0120");

	/** 原価コピー対象区分：原価為替レート
	 */
	public static final MGC_COST_COPY_TYP MGT_CUR_XRATE = create("MGT_CUR_XRATE", "MGT_CUR_XRATE", false, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0650");

	/** 原価コピー対象区分：原価品目情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM = create("MGT_ITM", "MGT_ITM", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0500");

	/** 原価コピー対象区分：原価品目詳細情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_DTL = create("MGT_ITM_DTL", "MGT_ITM_DTL", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0510");

	/** 原価コピー対象区分：原価品目工程情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_OPER = create("MGT_ITM_OPER", "MGT_ITM_OPER", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0560");

	/** 原価コピー対象区分：原価ＢＯＭ情報
	 */
	public static final MGC_COST_COPY_TYP MGT_BOM = create("MGT_BOM", "MGT_BOM", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0530");

	/** 原価コピー対象区分：原価品目工数情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_WK = create("MGT_ITM_WK", "MGT_ITM_WK", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0580");

	/** 原価コピー対象区分：原価品目販売単価情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_SLS = create("MGT_ITM_SLS", "MGT_ITM_SLS", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0590");

	/** 原価コピー対象区分：原価品目購買単価情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_PURC = create("MGT_ITM_PURC", "MGT_ITM_PURC", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0600");

	/** 原価コピー対象区分：原価品目加工単価情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_PROC = create("MGT_ITM_PROC", "MGT_ITM_PROC", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0660");

	/** 原価コピー対象区分：原価品目支給単価情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_PROV = create("MGT_ITM_PROV", "MGT_ITM_PROV", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0610");

	/** 原価コピー対象区分：原価品目指値情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_FIX = create("MGT_ITM_FIX", "MGT_ITM_FIX", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0620");

	/** 原価コピー対象区分：標準配賦率情報
	 */
	public static final MGC_COST_COPY_TYP MGT_STD_ALC_RATE = create("MGT_STD_ALC_RATE", "MGT_STD_ALC_RATE", true, true, false, false, false, MGC_TAB_CTG_TYP.STD.value(), FSC_MODULE_ID.CostManagement.value(), "MGBDP0630");

	/** 原価コピー対象区分：品目製造指図情報
	 */
	public static final MGC_COST_COPY_TYP MGT_ITM_MFG_INST = create("MGT_ITM_MFG_INST", "MGT_ITM_MFG_INST", true, false, false, false, false, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0030");

	/** 原価コピー対象区分：指図工程情報
	 */
	public static final MGC_COST_COPY_TYP MGT_INST_OPER = create("MGT_INST_OPER", "MGT_INST_OPER", true, false, false, false, false, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0040");

	/** 原価コピー対象区分：月末在庫評価
	 */
	public static final MGC_COST_COPY_TYP MGT_STK_EVAL = create("MGT_STK_EVAL", "MGT_STK_EVAL", false, false, false, true, false, MGC_TAB_CTG_TYP.ACT_T.value(), FSC_MODULE_ID.CostManagement.value(), "MGBBP0250");

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_COST_COPY_TYP create() {
		return new MGC_COST_COPY_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MGC_COST_COPY_TYP get(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		if (type == null) {
			throw MGC_COST_COPY_TYP.invalidValue(value);
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
	public static MGC_COST_COPY_TYP getNE(String value) {
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MGC_COST_COPY_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, boolean attr5, String attr6, String attr7, String attr8) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($TGT_CTG, attr1);
		me.constR.addBooleanColumn($TGT_TERM, attr2);
		me.constR.addBooleanColumn($TGT_PLN, attr3);
		me.constR.addBooleanColumn($TGT_ACT, attr4);
		me.constR.addBooleanColumn($USE_KEY, attr5);
		me.constR.addStringColumn($TAB_CTG_TYP, attr6);
		me.constR.addStringColumn($MODULE_ID, attr7);
		me.constR.addStringColumn($SCREEN_ID, attr8);
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
	 * tgt_ctgの値を返します。
	 * @return tgt_ctgの値
	 */
	public boolean tgt_ctg() {
		return constR.getBooleanNE($TGT_CTG);
	}

	/** 
	 * valueに対応する定数のtgt_ctgの値を返します。
	 * @param value 定数値
	 * @return tgt_ctgの値
	 */
	public static boolean tgt_ctg(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.tgt_ctg();
	}

	/** 
	 * tgt_termの値を返します。
	 * @return tgt_termの値
	 */
	public boolean tgt_term() {
		return constR.getBooleanNE($TGT_TERM);
	}

	/** 
	 * valueに対応する定数のtgt_termの値を返します。
	 * @param value 定数値
	 * @return tgt_termの値
	 */
	public static boolean tgt_term(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.tgt_term();
	}

	/** 
	 * tgt_plnの値を返します。
	 * @return tgt_plnの値
	 */
	public boolean tgt_pln() {
		return constR.getBooleanNE($TGT_PLN);
	}

	/** 
	 * valueに対応する定数のtgt_plnの値を返します。
	 * @param value 定数値
	 * @return tgt_plnの値
	 */
	public static boolean tgt_pln(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.tgt_pln();
	}

	/** 
	 * tgt_actの値を返します。
	 * @return tgt_actの値
	 */
	public boolean tgt_act() {
		return constR.getBooleanNE($TGT_ACT);
	}

	/** 
	 * valueに対応する定数のtgt_actの値を返します。
	 * @param value 定数値
	 * @return tgt_actの値
	 */
	public static boolean tgt_act(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.tgt_act();
	}

	/** 
	 * use_keyの値を返します。
	 * @return use_keyの値
	 */
	public boolean use_key() {
		return constR.getBooleanNE($USE_KEY);
	}

	/** 
	 * valueに対応する定数のuse_keyの値を返します。
	 * @param value 定数値
	 * @return use_keyの値
	 */
	public static boolean use_key(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.use_key();
	}

	/** 
	 * tab_ctg_typの値を返します。
	 * @return tab_ctg_typの値
	 */
	public String tab_ctg_typ() {
		return constR.getStringNE($TAB_CTG_TYP);
	}

	/** 
	 * valueに対応する定数のtab_ctg_typの値を返します。
	 * @param value 定数値
	 * @return tab_ctg_typの値
	 */
	public static String tab_ctg_typ(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.tab_ctg_typ();
	}

	/** 
	 * module_idの値を返します。
	 * @return module_idの値
	 */
	public String module_id() {
		return constR.getStringNE($MODULE_ID);
	}

	/** 
	 * valueに対応する定数のmodule_idの値を返します。
	 * @param value 定数値
	 * @return module_idの値
	 */
	public static String module_id(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.module_id();
	}

	/** 
	 * screen_idの値を返します。
	 * @return screen_idの値
	 */
	public String screen_id() {
		return constR.getStringNE($SCREEN_ID);
	}

	/** 
	 * valueに対応する定数のscreen_idの値を返します。
	 * @param value 定数値
	 * @return screen_idの値
	 */
	public static String screen_id(String value) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.screen_id();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
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
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
		if (me == null) {
			throw MGC_COST_COPY_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.getNE(value);
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
		return createStringPath(value(), name(), tgt_ctg(), tgt_term(), tgt_pln(), tgt_act(), use_key(), tab_ctg_typ(), module_id(), screen_id());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MGC_COST_COPY_TYP[] array() {
		if (array == null) {
			array = new MGC_COST_COPY_TYP[] {
					MGC_COST_COPY_TYP.MAM_ACT_IO, MGC_COST_COPY_TYP.MAM_ALC_EXPNS, MGC_COST_COPY_TYP.MAM_ALC_INPT, MGC_COST_COPY_TYP.MAM_ALC_GP_ALC, MGC_COST_COPY_TYP.MAM_ALC_OTHER, 
					 MGC_COST_COPY_TYP.MAM_ALC_PTN_SEL, MGC_COST_COPY_TYP.MAM_ALC_RULE, MGC_COST_COPY_TYP.MAM_ALC_WK, MGC_COST_COPY_TYP.MAM_COEF_CONFIG, MGC_COST_COPY_TYP.MAM_COEF_AUTO, MGC_COST_COPY_TYP.MAM_CTG_CONFIG, 
					 MGC_COST_COPY_TYP.MAM_COST_DPT, MGC_COST_COPY_TYP.MAM_DPT_CONFIG, MGC_COST_COPY_TYP.MAM_PRE_ALC_DPT, MGC_COST_COPY_TYP.MAM_PRE_ALC_RATE_SEL, MGC_COST_COPY_TYP.MAM_PRE_ALC_CTG, MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_PLN, 
					 MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_ACT, MGC_COST_COPY_TYP.MAM_PRE_ALC_WK, MGC_COST_COPY_TYP.MAM_REC_EVAL_SET, MGC_COST_COPY_TYP.MAM_XPNS_PURC_ALC, MGC_COST_COPY_TYP.MGT_PRE_RATE_TERM, MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT, 
					 MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT_IF, MGC_COST_COPY_TYP.MGT_PLN_ITM_WK, MGC_COST_COPY_TYP.MGT_PLN_OTHER_WK, MGC_COST_COPY_TYP.MGT_PLN_MFG, MGC_COST_COPY_TYP.MGT_PLN_PURC, MGC_COST_COPY_TYP.MGT_PLN_RQMT, 
					 MGC_COST_COPY_TYP.MGT_PLN_SLS, MGC_COST_COPY_TYP.MGT_PLN_INPT, MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_PLN, MGC_COST_COPY_TYP.MGT_ALC_RATE, MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT, MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT_IF, 
					 MGC_COST_COPY_TYP.MGT_GP_ALC, MGC_COST_COPY_TYP.MGT_ACT_INST_WIP_IF, MGC_COST_COPY_TYP.MGT_ACT_MFG_IF, MGC_COST_COPY_TYP.MGT_ACT_PURC_IF, MGC_COST_COPY_TYP.MGT_ACT_INPT_IF, MGC_COST_COPY_TYP.MGT_ACT_INST_WK_IF, 
					 MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK_IF, MGC_COST_COPY_TYP.MGT_ACT_IO_IF, MGC_COST_COPY_TYP.MGT_ACT_SLS_IF, MGC_COST_COPY_TYP.MGT_ACT_STK_IF, MGC_COST_COPY_TYP.MGT_ACT_INST_WIP, MGC_COST_COPY_TYP.MGT_ACT_MFG, 
					 MGC_COST_COPY_TYP.MGT_ACT_PURC, MGC_COST_COPY_TYP.MGT_ACT_INPT, MGC_COST_COPY_TYP.MGT_ACT_INST_WK, MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK, MGC_COST_COPY_TYP.MGT_ACT_IO, MGC_COST_COPY_TYP.MGT_ACT_SLS, 
					 MGC_COST_COPY_TYP.MGT_ACT_STK, MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_ACT, MGC_COST_COPY_TYP.MGT_CUR_XRATE, MGC_COST_COPY_TYP.MGT_ITM, MGC_COST_COPY_TYP.MGT_ITM_DTL, MGC_COST_COPY_TYP.MGT_ITM_OPER, 
					 MGC_COST_COPY_TYP.MGT_BOM, MGC_COST_COPY_TYP.MGT_ITM_WK, MGC_COST_COPY_TYP.MGT_ITM_SLS, MGC_COST_COPY_TYP.MGT_ITM_PURC, MGC_COST_COPY_TYP.MGT_ITM_PROC, MGC_COST_COPY_TYP.MGT_ITM_PROV, 
					 MGC_COST_COPY_TYP.MGT_ITM_FIX, MGC_COST_COPY_TYP.MGT_STD_ALC_RATE, MGC_COST_COPY_TYP.MGT_ITM_MFG_INST, MGC_COST_COPY_TYP.MGT_INST_OPER, MGC_COST_COPY_TYP.MGT_STK_EVAL
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
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
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
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
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
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
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
			if(MGC_COST_COPY_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MGC_COST_COPY_TYP me = MGC_COST_COPY_TYP.get(MGC_COST_COPY_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MGC_COST_COPY_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MGC_COST_COPY_TYP.subList(row);
			if (list.isEmpty()) {
				list = MGC_COST_COPY_TYP.list();
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
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
			if(MGC_COST_COPY_TYP.isSameVals(me, cols, vals)){
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
			list = MGC_COST_COPY_TYP.subList(cols, vals);
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
		for (MGC_COST_COPY_TYP me : MGC_COST_COPY_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MGC_COST_COPY_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MGC_COST_COPY_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MGC_COST_COPY_TYP", col);}
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
	protected boolean isSame(MGC_COST_COPY_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * 原価コピー対象区分：入出庫実績振替マスタかどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績振替マスタの値の場合true
	 */
	public static boolean isMAM_ACT_IO(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ACT_IO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：入出庫実績振替マスタかどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績振替マスタの値の場合true
	 */
	public static boolean isMAM_ACT_IO(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ACT_IO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：費目配賦マスタかどうか
	 * @param value 定数値
	 * @return 定数値が費目配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_EXPNS(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_EXPNS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：費目配賦マスタかどうか
	 * @param type 属性値
	 * @return 属性値が費目配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_EXPNS(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_EXPNS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入配賦マスタかどうか
	 * @param value 定数値
	 * @return 定数値が投入配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_INPT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入配賦マスタかどうか
	 * @param type 属性値
	 * @return 属性値が投入配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_INPT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：汎用配賦マスタかどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_GP_ALC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_GP_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：汎用配賦マスタかどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_GP_ALC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_GP_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：任意基準値配賦マスタかどうか
	 * @param value 定数値
	 * @return 定数値が任意基準値配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_OTHER(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_OTHER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：任意基準値配賦マスタかどうか
	 * @param type 属性値
	 * @return 属性値が任意基準値配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_OTHER(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_OTHER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦パタン選択マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦パタン選択マスタの値の場合true
	 */
	public static boolean isMAM_ALC_PTN_SEL(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_PTN_SEL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦パタン選択マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦パタン選択マスタの値の場合true
	 */
	public static boolean isMAM_ALC_PTN_SEL(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_PTN_SEL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦方法マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦方法マスタの値の場合true
	 */
	public static boolean isMAM_ALC_RULE(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_RULE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦方法マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦方法マスタの値の場合true
	 */
	public static boolean isMAM_ALC_RULE(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_RULE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：工数配賦マスタかどうか
	 * @param value 定数値
	 * @return 定数値が工数配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_ALC_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：工数配賦マスタかどうか
	 * @param type 属性値
	 * @return 属性値が工数配賦マスタの値の場合true
	 */
	public static boolean isMAM_ALC_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_ALC_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦係数構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦係数構成マスタの値の場合true
	 */
	public static boolean isMAM_COEF_CONFIG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_COEF_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦係数構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦係数構成マスタの値の場合true
	 */
	public static boolean isMAM_COEF_CONFIG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_COEF_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦係数自動構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が配賦係数自動構成マスタの値の場合true
	 */
	public static boolean isMAM_COEF_AUTO(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_COEF_AUTO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦係数自動構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が配賦係数自動構成マスタの値の場合true
	 */
	public static boolean isMAM_COEF_AUTO(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_COEF_AUTO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品群構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価品群構成マスタの値の場合true
	 */
	public static boolean isMAM_CTG_CONFIG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_CTG_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品群構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価品群構成マスタの値の場合true
	 */
	public static boolean isMAM_CTG_CONFIG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_CTG_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価部門マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価部門マスタの値の場合true
	 */
	public static boolean isMAM_COST_DPT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_COST_DPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価部門マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価部門マスタの値の場合true
	 */
	public static boolean isMAM_COST_DPT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_COST_DPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価部門構成マスタかどうか
	 * @param value 定数値
	 * @return 定数値が原価部門構成マスタの値の場合true
	 */
	public static boolean isMAM_DPT_CONFIG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_DPT_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価部門構成マスタかどうか
	 * @param type 属性値
	 * @return 属性値が原価部門構成マスタの値の場合true
	 */
	public static boolean isMAM_DPT_CONFIG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_DPT_CONFIG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦先部門マスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦先部門マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_DPT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_DPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦先部門マスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦先部門マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_DPT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_DPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準選択マスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦基準選択マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_RATE_SEL(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_RATE_SEL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準選択マスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦基準選択マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_RATE_SEL(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_RATE_SEL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準カテゴリマスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦基準カテゴリマスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_CTG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_CTG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準カテゴリマスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦基準カテゴリマスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_CTG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_CTG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦比率作成対象マスタ（計画）かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦比率作成対象マスタ（計画）の値の場合true
	 */
	public static boolean isMAM_PRE_RATE_TGT_PLN(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_PLN.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦比率作成対象マスタ（計画）かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦比率作成対象マスタ（計画）の値の場合true
	 */
	public static boolean isMAM_PRE_RATE_TGT_PLN(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_PLN.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦比率作成対象マスタ（実績）かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦比率作成対象マスタ（実績）の値の場合true
	 */
	public static boolean isMAM_PRE_RATE_TGT_ACT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_ACT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦比率作成対象マスタ（実績）かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦比率作成対象マスタ（実績）の値の場合true
	 */
	public static boolean isMAM_PRE_RATE_TGT_ACT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_RATE_TGT_ACT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準工数マスタかどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦基準工数マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦基準工数マスタかどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦基準工数マスタの値の場合true
	 */
	public static boolean isMAM_PRE_ALC_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_PRE_ALC_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：個別評価設定マスタかどうか
	 * @param value 定数値
	 * @return 定数値が個別評価設定マスタの値の場合true
	 */
	public static boolean isMAM_REC_EVAL_SET(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_REC_EVAL_SET.isSame(type);
	}

	/**
	 * 原価コピー対象区分：個別評価設定マスタかどうか
	 * @param type 属性値
	 * @return 属性値が個別評価設定マスタの値の場合true
	 */
	public static boolean isMAM_REC_EVAL_SET(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_REC_EVAL_SET.isSame(type);
	}

	/**
	 * 原価コピー対象区分：経費配賦振替マスタかどうか
	 * @param value 定数値
	 * @return 定数値が経費配賦振替マスタの値の場合true
	 */
	public static boolean isMAM_XPNS_PURC_ALC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MAM_XPNS_PURC_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：経費配賦振替マスタかどうか
	 * @param type 属性値
	 * @return 属性値が経費配賦振替マスタの値の場合true
	 */
	public static boolean isMAM_XPNS_PURC_ALC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MAM_XPNS_PURC_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦期間比率かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦期間比率の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_TERM(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_TERM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦期間比率かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦期間比率の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_TERM(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_TERM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用計画かどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用計画の値の場合true
	 */
	public static boolean isMGT_PLN_ALC_AMT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用計画かどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用計画の値の場合true
	 */
	public static boolean isMGT_PLN_ALC_AMT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用計画ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用計画ＩＦの値の場合true
	 */
	public static boolean isMGT_PLN_ALC_AMT_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用計画ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用計画ＩＦの値の場合true
	 */
	public static boolean isMGT_PLN_ALC_AMT_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_ALC_AMT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目工数計画かどうか
	 * @param value 定数値
	 * @return 定数値が品目工数計画の値の場合true
	 */
	public static boolean isMGT_PLN_ITM_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_ITM_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目工数計画かどうか
	 * @param type 属性値
	 * @return 属性値が品目工数計画の値の場合true
	 */
	public static boolean isMGT_PLN_ITM_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_ITM_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目外工数計画かどうか
	 * @param value 定数値
	 * @return 定数値が品目外工数計画の値の場合true
	 */
	public static boolean isMGT_PLN_OTHER_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_OTHER_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目外工数計画かどうか
	 * @param type 属性値
	 * @return 属性値が品目外工数計画の値の場合true
	 */
	public static boolean isMGT_PLN_OTHER_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_OTHER_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造計画かどうか
	 * @param value 定数値
	 * @return 定数値が製造計画の値の場合true
	 */
	public static boolean isMGT_PLN_MFG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_MFG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造計画かどうか
	 * @param type 属性値
	 * @return 属性値が製造計画の値の場合true
	 */
	public static boolean isMGT_PLN_MFG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_MFG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買計画かどうか
	 * @param value 定数値
	 * @return 定数値が購買計画の値の場合true
	 */
	public static boolean isMGT_PLN_PURC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買計画かどうか
	 * @param type 属性値
	 * @return 属性値が購買計画の値の場合true
	 */
	public static boolean isMGT_PLN_PURC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：月次計画かどうか
	 * @param value 定数値
	 * @return 定数値が月次計画の値の場合true
	 */
	public static boolean isMGT_PLN_RQMT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_RQMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：月次計画かどうか
	 * @param type 属性値
	 * @return 属性値が月次計画の値の場合true
	 */
	public static boolean isMGT_PLN_RQMT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_RQMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上計画かどうか
	 * @param value 定数値
	 * @return 定数値が売上計画の値の場合true
	 */
	public static boolean isMGT_PLN_SLS(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上計画かどうか
	 * @param type 属性値
	 * @return 属性値が売上計画の値の場合true
	 */
	public static boolean isMGT_PLN_SLS(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入計画かどうか
	 * @param value 定数値
	 * @return 定数値が投入計画の値の場合true
	 */
	public static boolean isMGT_PLN_INPT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PLN_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入計画かどうか
	 * @param type 属性値
	 * @return 属性値が投入計画の値の場合true
	 */
	public static boolean isMGT_PLN_INPT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PLN_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦月次比率（計画）かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦月次比率（計画）の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_MLY_PLN(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_PLN.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦月次比率（計画）かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦月次比率（計画）の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_MLY_PLN(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_PLN.isSame(type);
	}

	/**
	 * 原価コピー対象区分：予定配賦率かどうか
	 * @param value 定数値
	 * @return 定数値が予定配賦率の値の場合true
	 */
	public static boolean isMGT_ALC_RATE(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ALC_RATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：予定配賦率かどうか
	 * @param type 属性値
	 * @return 属性値が予定配賦率の値の場合true
	 */
	public static boolean isMGT_ALC_RATE(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ALC_RATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用実績かどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用実績の値の場合true
	 */
	public static boolean isMGT_ACT_ALC_AMT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用実績かどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用実績の値の場合true
	 */
	public static boolean isMGT_ACT_ALC_AMT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_ALC_AMT_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：配賦費用実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_ALC_AMT_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_ALC_AMT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：汎用配賦対象かどうか
	 * @param value 定数値
	 * @return 定数値が汎用配賦対象の値の場合true
	 */
	public static boolean isMGT_GP_ALC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_GP_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：汎用配賦対象かどうか
	 * @param type 属性値
	 * @return 属性値が汎用配賦対象の値の場合true
	 */
	public static boolean isMGT_GP_ALC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_GP_ALC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図仕掛実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が指図仕掛実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INST_WIP_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WIP_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図仕掛実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が指図仕掛実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INST_WIP_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WIP_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が製造実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_MFG_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_MFG_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が製造実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_MFG_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_MFG_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が購買実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_PURC_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_PURC_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が購買実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_PURC_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_PURC_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が投入実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INPT_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INPT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が投入実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INPT_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INPT_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工数実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が指図工数実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INST_WK_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工数実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が指図工数実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_INST_WK_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図外工数実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_OTHER_WK_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図外工数実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_OTHER_WK_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：入出庫実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_IO_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_IO_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：入出庫実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_IO_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_IO_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が売上実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_SLS_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_SLS_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が売上実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_SLS_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_SLS_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：在庫実績ＩＦかどうか
	 * @param value 定数値
	 * @return 定数値が在庫実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_STK_IF(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_STK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：在庫実績ＩＦかどうか
	 * @param type 属性値
	 * @return 属性値が在庫実績ＩＦの値の場合true
	 */
	public static boolean isMGT_ACT_STK_IF(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_STK_IF.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図仕掛実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図仕掛実績の値の場合true
	 */
	public static boolean isMGT_ACT_INST_WIP(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WIP.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図仕掛実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図仕掛実績の値の場合true
	 */
	public static boolean isMGT_ACT_INST_WIP(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WIP.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造実績かどうか
	 * @param value 定数値
	 * @return 定数値が製造実績の値の場合true
	 */
	public static boolean isMGT_ACT_MFG(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_MFG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：製造実績かどうか
	 * @param type 属性値
	 * @return 属性値が製造実績の値の場合true
	 */
	public static boolean isMGT_ACT_MFG(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_MFG.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買実績かどうか
	 * @param value 定数値
	 * @return 定数値が購買実績の値の場合true
	 */
	public static boolean isMGT_ACT_PURC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：購買実績かどうか
	 * @param type 属性値
	 * @return 属性値が購買実績の値の場合true
	 */
	public static boolean isMGT_ACT_PURC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入実績かどうか
	 * @param value 定数値
	 * @return 定数値が投入実績の値の場合true
	 */
	public static boolean isMGT_ACT_INPT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：投入実績かどうか
	 * @param type 属性値
	 * @return 属性値が投入実績の値の場合true
	 */
	public static boolean isMGT_ACT_INPT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INPT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工数実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図工数実績の値の場合true
	 */
	public static boolean isMGT_ACT_INST_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工数実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図工数実績の値の場合true
	 */
	public static boolean isMGT_ACT_INST_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_INST_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図外工数実績かどうか
	 * @param value 定数値
	 * @return 定数値が指図外工数実績の値の場合true
	 */
	public static boolean isMGT_ACT_OTHER_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図外工数実績かどうか
	 * @param type 属性値
	 * @return 属性値が指図外工数実績の値の場合true
	 */
	public static boolean isMGT_ACT_OTHER_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_OTHER_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：入出庫実績かどうか
	 * @param value 定数値
	 * @return 定数値が入出庫実績の値の場合true
	 */
	public static boolean isMGT_ACT_IO(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_IO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：入出庫実績かどうか
	 * @param type 属性値
	 * @return 属性値が入出庫実績の値の場合true
	 */
	public static boolean isMGT_ACT_IO(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_IO.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上実績かどうか
	 * @param value 定数値
	 * @return 定数値が売上実績の値の場合true
	 */
	public static boolean isMGT_ACT_SLS(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：売上実績かどうか
	 * @param type 属性値
	 * @return 属性値が売上実績の値の場合true
	 */
	public static boolean isMGT_ACT_SLS(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：在庫実績かどうか
	 * @param value 定数値
	 * @return 定数値が在庫実績の値の場合true
	 */
	public static boolean isMGT_ACT_STK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ACT_STK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：在庫実績かどうか
	 * @param type 属性値
	 * @return 属性値が在庫実績の値の場合true
	 */
	public static boolean isMGT_ACT_STK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ACT_STK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦月次比率（実績）かどうか
	 * @param value 定数値
	 * @return 定数値が一次配賦月次比率（実績）の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_MLY_ACT(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_ACT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：一次配賦月次比率（実績）かどうか
	 * @param type 属性値
	 * @return 属性値が一次配賦月次比率（実績）の値の場合true
	 */
	public static boolean isMGT_PRE_RATE_MLY_ACT(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_PRE_RATE_MLY_ACT.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価為替レートかどうか
	 * @param value 定数値
	 * @return 定数値が原価為替レートの値の場合true
	 */
	public static boolean isMGT_CUR_XRATE(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_CUR_XRATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価為替レートかどうか
	 * @param type 属性値
	 * @return 属性値が原価為替レートの値の場合true
	 */
	public static boolean isMGT_CUR_XRATE(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_CUR_XRATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目情報の値の場合true
	 */
	public static boolean isMGT_ITM(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目情報の値の場合true
	 */
	public static boolean isMGT_ITM(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目詳細情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目詳細情報の値の場合true
	 */
	public static boolean isMGT_ITM_DTL(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_DTL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目詳細情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目詳細情報の値の場合true
	 */
	public static boolean isMGT_ITM_DTL(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_DTL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目工程情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目工程情報の値の場合true
	 */
	public static boolean isMGT_ITM_OPER(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_OPER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目工程情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目工程情報の値の場合true
	 */
	public static boolean isMGT_ITM_OPER(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_OPER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価ＢＯＭ情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価ＢＯＭ情報の値の場合true
	 */
	public static boolean isMGT_BOM(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_BOM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価ＢＯＭ情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価ＢＯＭ情報の値の場合true
	 */
	public static boolean isMGT_BOM(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_BOM.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目工数情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目工数情報の値の場合true
	 */
	public static boolean isMGT_ITM_WK(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目工数情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目工数情報の値の場合true
	 */
	public static boolean isMGT_ITM_WK(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_WK.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目販売単価情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目販売単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_SLS(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目販売単価情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目販売単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_SLS(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_SLS.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目購買単価情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目購買単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PURC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目購買単価情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目購買単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PURC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_PURC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目加工単価情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目加工単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PROC(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_PROC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目加工単価情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目加工単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PROC(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_PROC.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目支給単価情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目支給単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PROV(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_PROV.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目支給単価情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目支給単価情報の値の場合true
	 */
	public static boolean isMGT_ITM_PROV(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_PROV.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目指値情報かどうか
	 * @param value 定数値
	 * @return 定数値が原価品目指値情報の値の場合true
	 */
	public static boolean isMGT_ITM_FIX(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_FIX.isSame(type);
	}

	/**
	 * 原価コピー対象区分：原価品目指値情報かどうか
	 * @param type 属性値
	 * @return 属性値が原価品目指値情報の値の場合true
	 */
	public static boolean isMGT_ITM_FIX(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_FIX.isSame(type);
	}

	/**
	 * 原価コピー対象区分：標準配賦率情報かどうか
	 * @param value 定数値
	 * @return 定数値が標準配賦率情報の値の場合true
	 */
	public static boolean isMGT_STD_ALC_RATE(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_STD_ALC_RATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：標準配賦率情報かどうか
	 * @param type 属性値
	 * @return 属性値が標準配賦率情報の値の場合true
	 */
	public static boolean isMGT_STD_ALC_RATE(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_STD_ALC_RATE.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目製造指図情報かどうか
	 * @param value 定数値
	 * @return 定数値が品目製造指図情報の値の場合true
	 */
	public static boolean isMGT_ITM_MFG_INST(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_ITM_MFG_INST.isSame(type);
	}

	/**
	 * 原価コピー対象区分：品目製造指図情報かどうか
	 * @param type 属性値
	 * @return 属性値が品目製造指図情報の値の場合true
	 */
	public static boolean isMGT_ITM_MFG_INST(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_ITM_MFG_INST.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工程情報かどうか
	 * @param value 定数値
	 * @return 定数値が指図工程情報の値の場合true
	 */
	public static boolean isMGT_INST_OPER(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_INST_OPER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：指図工程情報かどうか
	 * @param type 属性値
	 * @return 属性値が指図工程情報の値の場合true
	 */
	public static boolean isMGT_INST_OPER(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_INST_OPER.isSame(type);
	}

	/**
	 * 原価コピー対象区分：月末在庫評価かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫評価の値の場合true
	 */
	public static boolean isMGT_STK_EVAL(String value) {
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
		return MGC_COST_COPY_TYP.MGT_STK_EVAL.isSame(type);
	}

	/**
	 * 原価コピー対象区分：月末在庫評価かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫評価の値の場合true
	 */
	public static boolean isMGT_STK_EVAL(MGC_COST_COPY_TYP type) {
		return MGC_COST_COPY_TYP.MGT_STK_EVAL.isSame(type);
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
			MGC_COST_COPY_TYP.putName(r, valueColumn, nameColumn);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.get(value);
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
			MGC_COST_COPY_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
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
			MGC_COST_COPY_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.get(value);
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
			MGC_COST_COPY_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
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
			MGC_COST_COPY_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.get(value);
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
			MGC_COST_COPY_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
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
			MGC_COST_COPY_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.get(value);
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
			MGC_COST_COPY_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MGC_COST_COPY_TYP type = MGC_COST_COPY_TYP.getNE(value);
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
