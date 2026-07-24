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
abstract class MAC_IF_PROC_TYP_MC_A extends MCAppConst {

	/*
	 * リソースファイルのキーです。
	 */
	public static final String moduleID = "MA";

	public static final String typeID = "IF_PROC_TYP";

	/*
	 * 定数の値、属性を持つMCRowのフィールドです。
	 */
	protected MCRow constR = MCRow.create();

	/*
	 * 定数オブジェクトの配列です。
	 */
	protected static MAC_IF_PROC_TYP[] array;

	/*
	 * リスト用のカラム名です。
	 */
	public static final String $VALUE = "if_proc_typ";

	public static final String $NAME = "if_proc_typ_nm";

	public static final String $IS_SEND = "is_send";

	public static final String $IS_EDI = "is_edi";

	public static final String $IS_PLM = "is_plm";

	public static final String $IS_AC = "is_ac";

	public static final String $CONV_OPE = "conv_ope";

	public static final String $FILE_IO_OPE = "file_io_ope";

	public static final String $IMP_OPE = "imp_ope";

	public static final String $WEP_API_OPE = "wep_api_ope";

	public static final String $CMD_EXEC_OPE = "cmd_exec_ope";

	public static final String $DATA_LNO_SEQ = "data_lno_seq";

	public static final String $UPD_IF_TBL = "upd_if_tbl";

	public static final String $CO_RECV_IF_PROC_TYP = "co_recv_if_proc_typ";

	public static final String $CO_RECV_CO_COL = "co_recv_co_col";

	public static final String $CO_RECV_OPE = "co_recv_ope";

	public static final String $IS_SCM = "is_scm";

	public static final String $IMP_OPE2 = "imp_ope2";

	public static final String $IS_FB = "is_fb";

	public static final String $IS_ALL = "is_all";

	public static final String $BI_BAT = "bi_bat";

	public static final String $BI_OPE = "bi_ope";

	public static final String $DS_VTB_TBL = "ds_vtb_tbl";

	public static final String $DS_OBJ = "ds_obj";

	public static final String $IS_DS_IMPMD_FIX = "is_ds_impmd_fix";

	public static final String $IS_DS_COST = "is_ds_cost";

	public static final String $DS_OBJ_JOIN_KEY_IMP = "ds_obj_join_key_imp";

	public static final String $DS_OBJ_JOIN_KEY_WRK = "ds_obj_join_key_wrk";

	public static final String $DS_WRAP_CMD = "ds_wrap_cmd";

	public static final String $IS_BI = "is_bi";

	public static final String $STD_FILE_CONV_TBL = "std_file_conv_tbl";

	public static final String $IS_CFP = "is_cfp";

	public static final String $IS_FS = "is_fs";

	public static final String $IS_SAP = "is_sap";

	public static final String $IS_PCM = "is_pcm";

	/*
	 * 定数の定義です。
	 */
	/** ＩＦ処理区分：発注情報送信
	 */
	public static final MAC_IF_PROC_TYP PO_SEND = create("A0010", "PO_SEND", true, true, false, false, "MS.MSLAL7020.PoSendConv_Conv01", "MS.MSLAL7020.PoSendConv_Conv02", null, null, null, null, "MST_PO_SEND_IF", "B0010", "if_sppl_cd", "MS.MSLAL7120.SloRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：納期回答情報受信
	 */
	public static final MAC_IF_PROC_TYP PO_PRMS_RECV = create("A0020", "PO_PRMS_RECV", false, true, false, false, "MS.MSLAL7030.PoPrmsRecvConv_Conv01", "MS.MSLAL7030.PoPrmsRecvConv_Conv02", "MS.MSLAL5030.PoPrmsRecvIf_Upd01", null, null, "MSS_POPRMSRECVIF", null, null, null, null, false, "MS.MSLAL5030.PoPrmsRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出荷実績情報受信
	 */
	public static final MAC_IF_PROC_TYP SHIP_ACT_RECV = create("A0030", "SHIP_ACT_RECV", false, true, false, false, "MS.MSLAL7050.ShipActRecvConv_Conv01", "MS.MSLAL7050.ShipActRecvConv_Conv02", "MS.MSLAL5050.ShipActRecvIf_Upd01", null, null, "MSS_EDISHIPACTRECVIF", "MST_ESHIP_ACT_RECV_IF", null, null, null, false, "MS.MSLAL5050.ShipActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：検収情報送信
	 */
	public static final MAC_IF_PROC_TYP ACCPT_SEND = create("A0040", "ACCPT_SEND", true, true, false, false, "MS.MSLAL7060.AccptSendConv_Conv01", "MS.MSLAL7060.AccptSendConv_Conv02", null, null, null, null, "MST_ACCPT_SEND_IF", "B0040", "if_sppl_cd", "MS.MSLAL7160.AccptRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：納入指示情報送信
	 */
	public static final MAC_IF_PROC_TYP DLV_INST_SEND = create("A0050", "DLV_INST_SEND", true, true, false, false, "MS.MSLAL7040.DlvInstSendConv_Conv01", "MS.MSLAL7040.DlvInstSendConv_Conv02", null, null, null, null, "MST_DLV_INST_SEND_IF", "B0050", "if_sppl_cd", "MS.MSLAL7140.DlvInstRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：請求情報受信
	 */
	public static final MAC_IF_PROC_TYP BILL_RECV = create("A0100", "BILL_RECV", false, true, false, false, "MS.MSLAL7220.BillRecvConv_Conv01", "MS.MSLAL7220.BillRecvConv_Conv02", "MS.MSLAL5220.BillRecvIf_Upd01", null, null, "MSS_BILLRECVIF", null, null, null, null, false, "MS.MSLAL5220.BillRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：受注情報受信
	 */
	public static final MAC_IF_PROC_TYP SLO_RECV = create("B0010", "SLO_RECV", false, true, false, false, "MS.MSLAL7120.SloRecvConv_Conv01", "MS.MSLAL7120.SloRecvConv_Conv02", "MS.MSLAL5120.SloRecvIf_Upd01", null, null, "MSS_SLORECVIF", null, null, null, null, false, "MS.MSLAL5120.SloRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：納期回答情報送信
	 */
	public static final MAC_IF_PROC_TYP SLO_PRMS_SEND = create("B0020", "SLO_PRMS_SEND", true, true, false, false, "MS.MSLAL7130.SloPrmsSendConv_Conv01", "MS.MSLAL7130.SloPrmsSendConv_Conv02", null, null, null, null, "MST_SLO_PRMS_SEND_IF", "A0020", "if_cst_cd", "MS.MSLAL7030.PoPrmsRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出荷実績情報送信
	 */
	public static final MAC_IF_PROC_TYP SHIP_ACT_SEND = create("B0030", "SHIP_ACT_SEND", true, true, false, false, "MS.MSLAL7150.ShipActSendConv_Conv01", "MS.MSLAL7150.ShipActSendConv_Conv02", null, null, null, null, "MST_ESHIP_ACT_SEND_IF", "A0030", "if_cst_cd", "MS.MSLAL7050.ShipActRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：検収情報受信
	 */
	public static final MAC_IF_PROC_TYP ACCPT_RECV = create("B0040", "ACCPT_RECV", false, true, false, false, "MS.MSLAL7160.AccptRecvConv_Conv01", "MS.MSLAL7160.AccptRecvConv_Conv02", "MS.MSLAL5160.AccptRecvIf_Upd01", null, null, "MSS_ACCPTRECVIF", null, null, null, null, false, "MS.MSLAL5160.AccptRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：納入指示情報受信
	 */
	public static final MAC_IF_PROC_TYP DLV_INST_RECV = create("B0050", "DLV_INST_RECV", false, true, false, false, "MS.MSLAL7140.DlvInstRecvConv_Conv01", "MS.MSLAL7140.DlvInstRecvConv_Conv02", "MS.MSLAL5140.DlvInstRecvIf_Upd01", null, null, "MSS_DLVINSTRECVIF", null, null, null, null, false, "MS.MSLAL5140.DlvInstRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：請求情報送信
	 */
	public static final MAC_IF_PROC_TYP BILL_SEND = create("B0100", "BILL_SEND", true, true, false, false, "MS.MSLAL7210.BillSendConv_Conv01", "MS.MSLAL7210.BillSendConv_Conv02", null, null, null, null, "MST_BILL_SEND_IF", "A0100", "if_bcst_cd", "MS.MSLAL7220.BillRecvConv_Conv03", false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ変更情報明細受信
	 */
	public static final MAC_IF_PROC_TYP PLM_CHNG_RECV = create("C0010", "PLM_CHNG_RECV", false, false, true, false, null, "PG.PGBBL5020.Chng_Conv01", null, null, null, "PGS_PLM_CHNG_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_RECV = create("C0020", "PLM_ITM_RECV", false, false, true, false, null, "PG.PGBBL5030.Itm_Conv01", null, null, null, "PGS_ITM_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細（購買品）受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_D_PURC_RECV = create("C0030", "PLM_ITM_D_PURC_RECV", false, false, true, false, null, "PG.PGBBL5040.ItmDtlPurc_Conv01", null, null, null, "PGS_ITM_D_PURC_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細（内製品）受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_D_PROD_RECV = create("C0040", "PLM_ITM_D_PROD_RECV", false, false, true, false, null, "PG.PGBBL5050.ItmDtlProd_Conv01", null, null, null, "PGS_ITM_D_PROD_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細（外注品）受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_D_SBCN_RECV = create("C0050", "PLM_ITM_D_SBCN_RECV", false, false, true, false, null, "PG.PGBBL5060.ItmDtlSbcn_Conv01", null, null, null, "PGS_ITM_D_SBCN_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細（他工場手配品）受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_D_RQST_RECV = create("C0060", "PLM_ITM_D_RQST_RECV", false, false, true, false, null, "PG.PGBBL5070.ItmDtlRqst_Conv01", null, null, null, "PGS_ITM_D_RQST_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目格納先受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_STRG_RECV = create("C0070", "PLM_ITM_STRG_RECV", false, false, true, false, null, "PG.PGBBL5080.ItmStrg_Conv01", null, null, null, "PGS_ITM_STRG_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭＢＯＭ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_BOM_RECV = create("C0080", "PLM_BOM_RECV", false, false, true, false, null, "PG.PGBBL5090.Bom_Conv01", null, null, null, "PGS_BOM_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目工程受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_OPER_RECV = create("C0090", "PLM_ITM_OPER_RECV", false, false, true, false, null, "PG.PGBBL5100.ItmOper_Conv01", null, null, null, "PGS_ITM_OPER_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工程受信
	 */
	public static final MAC_IF_PROC_TYP PLM_OPER_RECV = create("C0100", "PLM_OPER_RECV", false, false, true, false, null, "PG.PGBBL5110.Oper_Conv01", null, null, null, "PGS_OPER_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目サムネイル受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_TMB_RECV = create("C0110", "PLM_ITM_TMB_RECV", false, false, true, false, null, "PG.PGBBL5120.ItmTmb_Conv01", null, null, null, "PGS_ITM_TMB_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目品管受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_INSP_RECV = create("C0120", "PLM_ITM_INSP_RECV", false, false, true, false, null, "PG.PGBBL5130.ItmInsp_Conv01", null, null, null, "PGS_ITM_INSP_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工数管理受信
	 */
	public static final MAC_IF_PROC_TYP PLM_WK_COST_RECV = create("C0130", "PLM_WK_COST_RECV", false, false, true, false, null, "PG.PGBBL5140.WkCost_Conv01", null, null, null, "PGS_WK_COST_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工程工数受信
	 */
	public static final MAC_IF_PROC_TYP PLM_OPR_WK_CST_RECV = create("C0140", "PLM_OPR_WK_CST_RECV", false, false, true, false, null, "PG.PGBBL5150.OprWkCst_Conv01", null, null, null, "PGS_OPR_WK_CST_EXT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ場所マスタ送信
	 */
	public static final MAC_IF_PROC_TYP PLM_LOC_SEND = create("C3010", "PLM_LOC_SEND", true, false, true, false, null, "PG.PGBDL5010.Loc_Conv01", null, null, null, null, "PGT_LOC_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ取引先マスタ送信
	 */
	public static final MAC_IF_PROC_TYP PLM_BP_SEND = create("C3020", "PLM_BP_SEND", true, false, true, false, null, "PG.PGBDL5020.Bp_Conv01", null, null, null, null, "PGT_BP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細マスタリードタイム送信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_DTL_LT_SEND = create("C3030", "PLM_ITM_DTL_LT_SEND", true, false, true, false, null, "PG.PGBDL5030.ItmDtlLt_Conv01", null, null, null, null, "PGT_ITM_DTL_LT_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ購買単価マスタ送信
	 */
	public static final MAC_IF_PROC_TYP PLM_PURC_UPRI_SEND = create("C3040", "PLM_PURC_UPRI_SEND", true, false, true, false, null, "PG.PGBDL5040.PurcUpri_Conv01", null, null, null, null, "PGT_PURC_UPRI_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ計画実績数量送信
	 */
	public static final MAC_IF_PROC_TYP PLM_PA_QTY_SEND = create("C3050", "PLM_PA_QTY_SEND", true, false, true, false, null, "PG.PGBDL5050.PaQty_Conv01", null, null, null, null, "PGT_PA_QTY_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目禁止マスタ送信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_STOP_SEND = create("C3060", "PLM_ITM_STOP_SEND", true, false, true, false, null, "PG.PGBDL5060.ItmStop_Conv01", null, null, null, null, "PGT_ITM_STOP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ製造原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_MFG_COST_SEND = create("C3070", "PLM_MFG_COST_SEND", true, false, true, false, null, "PG.PGBDL5070.MfgActCost_Conv01", null, null, null, null, "PGT_MFG_COST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ購買原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_PURC_COST_SEND = create("C3080", "PLM_PURC_COST_SEND", true, false, true, false, null, "PG.PGBDL5080.PurcActCost_Conv01", null, null, null, null, "PGT_PURC_COST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ製造標準原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_MFG_STD_COST_SEND = create("C3090", "PLM_MFG_STD_COST_SEND", true, false, true, false, null, "PG.PGBDL5090.MfgStdCost_Conv01", null, null, null, null, "PGT_MFG_S_COST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ購買標準原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_PURC_STD_COST_SEND = create("C3100", "PLM_PURC_STD_COST_SEND", true, false, true, false, null, "PG.PGBDL5100.PurcStdCost_Conv01", null, null, null, null, "PGT_PURC_S_CST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工数原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_WK_COST_SEND = create("C3110", "PLM_WK_COST_SEND", true, false, true, false, null, "PG.PGBDL5110.WkActCost_Conv01", null, null, null, null, "PGT_WK_COST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工数標準原価送信
	 */
	public static final MAC_IF_PROC_TYP PLM_WK_STD_COST_SEND = create("C3120", "PLM_WK_STD_COST_SEND", true, false, true, false, null, "PG.PGBDL5120.WkStdCost_Conv01", null, null, null, null, "PGT_WK_S_CST_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ製造歩留送信
	 */
	public static final MAC_IF_PROC_TYP PLM_MFG_YIELD_SEND = create("C3130", "PLM_MFG_YIELD_SEND", true, false, true, false, null, "PG.PGBDL5130.MfgYield_Conv01", null, null, null, null, "PGT_MFG_YIELD_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ変更情報内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_CHNG_IN_IF_RECV = create("C4010", "PLM_CHNG_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6010.Chng_Conv01", null, null, null, "PGS_PLM_CHNG_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目詳細内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_DTL_IN_IF_RECV = create("C4020", "PLM_ITM_DTL_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6020.ItmDtl_Conv01", null, null, null, "PGS_ITM_DTL_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭＢＯＭ内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_BOM_IN_IF_RECV = create("C4030", "PLM_BOM_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6030.Bom_Conv01", null, null, null, "PGS_BOM_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目工程内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_OPER_IN_IF_RECV = create("C4040", "PLM_ITM_OPER_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6040.ItmOper_Conv01", null, null, null, "PGS_ITM_OPER_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工程内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_OPER_IN_IF_RECV = create("C4050", "PLM_OPER_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6050.Oper_Conv01", null, null, null, "PGS_OPER_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_IN_IF_RECV = create("C4060", "PLM_ITM_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6060.Itm_Conv01", null, null, null, "PGS_ITM_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目付加情報内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ATTACH_INFO_IN_IF_RECV = create("C4070", "PLM_ATTACH_INFO_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6070.AttachInfo_Conv01", null, null, null, "PGS_ATTACH_INFO_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目検査パタン内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_INSP_P_IN_IF_RECV = create("C4080", "PLM_ITM_INSP_P_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6080.ItmInspP_Conv01", null, null, null, "PGS_ITM_INSP_P_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ格納先内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_STRG_IN_IF_RECV = create("C4090", "PLM_ITM_STRG_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6090.ItmStrg_Conv01", null, null, null, "PGS_ITM_STRG_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目（ＷＧ）内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_WG_IN_IF_RECV = create("C4100", "PLM_ITM_WG_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6100.ItmWg_Conv01", null, null, null, "PGS_ITM_WG_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目補助内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_SUB_IN_IF_RECV = create("C4110", "PLM_ITM_SUB_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6110.ItmSub_Conv01", null, null, null, "PGS_ITM_SUB_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目単位内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_UNIT_IN_IF_RECV = create("C4120", "PLM_ITM_UNIT_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6120.ItmUnit_Conv01", null, null, null, "PGS_ITM_UNIT_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目手配不許可内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_NOT_FIX_IN_IF_RECV = create("C4130", "PLM_ITM_NOT_FIX_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6130.ItmNotFix_Conv01", null, null, null, "PGS_ITM_NOT_FIX_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ品目品管内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_ITM_INSP_IN_IF_RECV = create("C4140", "PLM_ITM_INSP_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6140.ItmInsp_Conv01", null, null, null, "PGS_ITM_INSP_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工数管理内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_WK_COST_IN_IF_RECV = create("C4150", "PLM_WK_COST_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6150.WkCost_Conv01", null, null, null, "PGS_WK_COST_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＰＬＭ工程工数内部ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP PLM_OPR_WK_CST_IN_IF_RECV = create("C4160", "PLM_OPR_WK_CST_IN_IF_RECV", false, false, true, false, null, "PG.PGBBL6160.OprWkCst_Conv01", null, null, null, "PGS_OPR_WK_CST_IN_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：勘定科目マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_ACCOUNT_RECV = create("D1010", "AC_ACCOUNT_RECV", false, false, false, true, null, "PF.PFBAL5110.AccountIf_Conv01", null, null, null, "MBS_ACCOUNT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：補助勘定科目マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_SUB_ACCOUNT_RECV = create("D1020", "AC_SUB_ACCOUNT_RECV", false, false, false, true, null, "PF.PFBAL5120.SubAccountIf_Conv01", null, null, null, "MBS_SUB_ACCOUNT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：会計部門マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_AC_DPT_RECV = create("D1030", "AC_AC_DPT_RECV", false, false, false, true, null, "PF.PFBAL5130.AcDptIf_Conv01", null, null, null, "MBS_AC_DPT_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：銀行マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_BANK_RECV = create("D1040", "AC_BANK_RECV", false, false, false, true, null, "PF.PFBAL5140.BankIf_Conv01", null, null, null, "MBS_BANK_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：銀行支店マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_BANK_BRANCH_RECV = create("D1050", "AC_BANK_BRANCH_RECV", false, false, false, true, null, "PF.PFBAL5150.BranchIf_Conv01", null, null, null, "MBS_BANK_BRANCH_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：口座マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_BANK_AC_RECV = create("D1060", "AC_BANK_AC_RECV", false, false, false, true, null, "PF.PFBAL5160.BankAcIf_Conv01", null, null, null, "MBS_BANK_AC_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：為替レートマスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_CUR_XRATE_RECV = create("D1070", "AC_CUR_XRATE_RECV", false, false, false, true, null, "PF.PFBAL5170.XrateIf_Conv01", null, null, null, "MBS_CUR_XRATE_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：会計税マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_AC_TAX_RECV = create("D1080", "AC_AC_TAX_RECV", false, false, false, true, null, "PF.PFBAL5180.AcTaxIf_Conv01", null, null, null, "MBS_AC_TAX_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：口座科目設定マスタ受信
	 */
	public static final MAC_IF_PROC_TYP AC_BAC_AC_RECV = create("D1090", "AC_BAC_AC_RECV", false, false, false, true, null, "PF.PFBAL5190.BacAcIf_Conv01", null, null, null, "MBS_BAC_AC_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：仕訳情報（ＧＬ）送信
	 */
	public static final MAC_IF_PROC_TYP AC_JOURNAL_GL_SEND = create("D2010", "AC_JOURNAL_GL_SEND", true, false, false, true, null, "PF.PFBAL5510.JournalGlIf_Conv01", null, null, null, null, "MBT_JOURNAL_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：仕訳情報（ＡＰ）送信
	 */
	public static final MAC_IF_PROC_TYP AC_JOURNAL_AP_SEND = create("D2020", "AC_JOURNAL_AP_SEND", true, false, false, true, null, "PF.PFBAL5520.JournalApIf_Conv01", null, null, null, null, "MBT_JOURNAL_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：仕訳情報（ＡＲ）送信
	 */
	public static final MAC_IF_PROC_TYP AC_JOURNAL_AR_SEND = create("D2030", "AC_JOURNAL_AR_SEND", true, false, false, true, null, "PF.PFBAL5530.JournalArIf_Conv01", null, null, null, null, "MBT_JOURNAL_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：手形情報送信
	 */
	public static final MAC_IF_PROC_TYP AC_NOTE_SEND = create("D2040", "AC_NOTE_SEND", true, false, false, true, null, "PF.PFBAL5610.NoteIf_Conv01", null, null, null, null, "MBT_NOTE_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（得意先）送信
	 */
	public static final MAC_IF_PROC_TYP AC_BP_CST_SEND = create("D2050", "AC_BP_CST_SEND", true, false, false, true, null, "PF.PFBAL5710.BpCstIf_Conv01", null, null, null, null, "MBT_BP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（発注先）送信
	 */
	public static final MAC_IF_PROC_TYP AC_BP_SPPL_SEND = create("D2060", "AC_BP_SPPL_SEND", true, false, false, true, null, "PF.PFBAL5720.BpSpplIf_Conv01", null, null, null, null, "MBT_BP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：支払依頼送信
	 */
	public static final MAC_IF_PROC_TYP AC_SCHD_PAY_SEND = create("D2070", "AC_SCHD_PAY_SEND", true, false, false, true, null, "PF.PFBAL5730.SchdPayIf_Conv01", null, null, null, null, "MBT_SCHD_PAY_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：売上伝票送信
	 */
	public static final MAC_IF_PROC_TYP AC_SLS_SLIP_SEND = create("D2080", "AC_SLS_SLIP_SEND", true, false, false, true, null, null, null, null, null, null, "MBT_SLS_SLIP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：仕入伝票送信
	 */
	public static final MAC_IF_PROC_TYP AC_PURC_SLIP_SEND = create("D2090", "AC_PURC_SLIP_SEND", true, false, false, true, null, null, null, null, null, null, "MBT_PURC_SLIP_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：配賦費用計画ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP AC_PLN_ALC_AMT_RCV = create("D3010", "AC_PLN_ALC_AMT_RCV", false, false, false, true, null, "MG.MGBGL5030.PlnAlcIf_Conv01", null, null, null, "MGS_PLN_ALC_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：配賦費用実績ＩＦ受信
	 */
	public static final MAC_IF_PROC_TYP AC_ACT_ALC_AMT_RCV = create("D3020", "AC_ACT_ALC_AMT_RCV", false, false, false, true, null, "MG.MGBGL5040.ActAlcIf_Conv01", null, null, null, "MGS_ACT_ALC_IF_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：ＳＣＭ実績受信
	 */
	public static final MAC_IF_PROC_TYP SCM_ACT_RECV = create("E0000", "SCM_ACT_RECV", false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, "MS.MSLAL6320.SCMActRecvIf_Upd01", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出荷指図送信
	 */
	public static final MAC_IF_PROC_TYP WMS_SHIP_INST_SEND = create("E0010", "WMS_SHIP_INST_SEND", true, false, false, false, "MS.MSLAL8010.ShipInstSendConv_Conv01", "MS.MSLAL8010.ShipInstSendConv_Conv02", null, null, null, null, "MST_SHIP_INST_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出荷実績受信
	 */
	public static final MAC_IF_PROC_TYP WMS_SHIP_ACT_RECV = create("E0020", "WMS_SHIP_ACT_RECV", false, false, false, false, "MS.MSLAL8020.ShipActRecvConv_Conv01", "MS.MSLAL8020.ShipActRecvConv_Conv02", "MS.MSLAL6020.ShipActRecvIf_Upd01", null, null, "MSS_SHIPACTRECVIF", "MST_SHIP_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6020.ShipActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：入荷予定送信
	 */
	public static final MAC_IF_PROC_TYP WMS_ARR_SCHD_SEND = create("E0030", "WMS_ARR_SCHD_SEND", true, false, false, false, "MS.MSLAL8030.ArrSchdSendConv_Conv01", "MS.MSLAL8030.ArrSchdSendConv_Conv02", null, null, null, null, "MST_ARR_SCHD_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：入荷実績受信
	 */
	public static final MAC_IF_PROC_TYP WMS_ARR_ACT_RECV = create("E0040", "WMS_ARR_ACT_RECV", false, false, false, false, "MS.MSLAL8040.ArrActRecvConv_Conv01", "MS.MSLAL8040.ArrActRecvConv_Conv02", "MS.MSLAL6040.ArrActRecvIf_Upd01", null, null, "MSS_ARRACTRECVIF", "MST_ARR_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6040.ArrActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：移動指図送信
	 */
	public static final MAC_IF_PROC_TYP WMS_XFR_INST_SEND = create("E0050", "WMS_XFR_INST_SEND", true, false, false, false, "MS.MSLAL8050.XfrInstSendConv_Conv01", "MS.MSLAL8050.XfrInstSendConv_Conv02", null, null, null, null, "MST_XFR_INST_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：移動実績受信
	 */
	public static final MAC_IF_PROC_TYP WMS_XFR_ACT_RECV = create("E0060", "WMS_XFR_ACT_RECV", false, false, false, false, "MS.MSLAL8060.XfrActRecvConv_Conv01", "MS.MSLAL8060.XfrActRecvConv_Conv02", "MS.MSLAL6060.XfrActRecvIf_Upd01", null, null, "MSS_XFRACTRECVIF", "MST_XFR_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6060.XfrActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：他勘定振替実績受信
	 */
	public static final MAC_IF_PROC_TYP WMS_ACXFR_ACT_RECV = create("E0070", "WMS_ACXFR_ACT_RECV", false, false, false, false, "MS.MSLAL8080.AcXfrActRecvConv_Conv01", "MS.MSLAL8080.AcXfrActRecvConv_Conv02", "MS.MSLAL6080.AcXfrActRecvIf_Upd01", null, null, "MSS_ACXFRACTRECVIF", "MST_ACXFR_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6080.AcXfrActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出来高予定送信
	 */
	public static final MAC_IF_PROC_TYP MES_YIELD_SCHD_SEND = create("F1010", "MES_YIELD_SCHD_SEND", true, false, false, false, "MS.MSLAL8210.YieldSchdSendConv_Conv01", "MS.MSLAL8210.YieldSchdSendConv_Conv02", null, null, null, null, "MST_YIELD_SCHD_SND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：出来高実績受信
	 */
	public static final MAC_IF_PROC_TYP MES_YIELD_ACT_RECV = create("F1020", "MES_YIELD_ACT_RECV", false, false, false, false, "MS.MSLAL8220.YieldActRecvConv_Conv01", "MS.MSLAL8220.YieldActRecvConv_Conv02", "MS.MSLAL6220.MfgActRecvIf_Upd01", null, null, "MSS_YIELDACTRECVIF", "MST_YIELD_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6220.MfgActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：工程指図送信
	 */
	public static final MAC_IF_PROC_TYP MES_OPER_INST_SEND = create("F1030", "MES_OPER_INST_SEND", true, false, false, false, "MS.MSLAL8230.OperInstSendConv_Conv01", "MS.MSLAL8230.OperInstSendConv_Conv02", null, null, null, null, "MST_OPER_INST_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：工程実績受信
	 */
	public static final MAC_IF_PROC_TYP MES_OPER_ACT_RECV = create("F1040", "MES_OPER_ACT_RECV", false, false, false, false, "MS.MSLAL8240.OperActRecvConv_Conv01", "MS.MSLAL8240.OperActRecvConv_Conv02", "MS.MSLAL6220.MfgActRecvIf_Upd01", null, null, "MSS_OPERACTRECVIF", "MST_OPER_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6220.MfgActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：投入予定送信
	 */
	public static final MAC_IF_PROC_TYP MES_INPT_SCHD_SEND = create("F1050", "MES_INPT_SCHD_SEND", true, false, false, false, "MS.MSLAL8250.InptSchdSendConv_Conv01", "MS.MSLAL8250.InptSchdSendConv_Conv02", null, null, null, null, "MST_INPT_SCHD_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：投入実績受信
	 */
	public static final MAC_IF_PROC_TYP MES_INPT_ACT_RECV = create("F1060", "MES_INPT_ACT_RECV", false, false, false, false, "MS.MSLAL8260.InptActRecvConv_Conv01", "MS.MSLAL8260.InptActRecvConv_Conv02", "MS.MSLAL6220.MfgActRecvIf_Upd01", null, null, "MSS_INPTACTRECVIF", "MST_INPT_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6220.MfgActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：工数実績受信
	 */
	public static final MAC_IF_PROC_TYP MES_WK_ACT_RECV = create("F1070", "MES_WK_ACT_RECV", false, false, false, false, "MS.MSLAL8280.WkActRecvConv_Conv01", "MS.MSLAL8280.WkActRecvConv_Conv02", "MS.MSLAL6230.WkActRecvIf_Upd01", null, null, "MSS_WKACTRECVIF", "MST_WK_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6230.WkActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：工数予定送信
	 */
	public static final MAC_IF_PROC_TYP MES_WK_SCHD_SEND = create("F1080", "MES_WK_SCHD_SEND", true, false, false, false, "MS.MSLAL8270.WkSchdSendConv_Conv01", "MS.MSLAL8270.WkSchdSendConv_Conv02", null, null, null, null, "MST_WK_SCHD_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ受信
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_RECV = create("F2010", "MES_ORDER_RECV", false, false, false, false, "MS.MSLAL9710.OrdRecvConv_Conv01", "MS.MSLAL9710.OrdRecvConv_Conv02", "MS.MSLAL9210.OrdRecvIf_Upd01", null, null, "MSS_ORDRECVIF", "MST_ORDER_RECV_IF", null, null, null, true, "MS.MSLAL9210.OrdRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND = create("F2020", "MES_ORDER_SEND", true, false, false, false, "MS.MSLAL9920.OrdSendConv_Conv01", "MS.MSLAL9920.OrdSendConv_Conv02", null, null, null, "MSS_ORDERSEND", "MST_ORDSND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用品目マスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ITM = create("F2030", "MES_ORDER_SEND_ITM", true, false, false, false, "MS.MSLAL9810.OrdSendConvItm_Conv01", "MS.MSLAL9810.OrdSendConvItm_Conv02", null, null, null, "MSS_ORDERSENDITMIF", "MST_ORDSND_ITM_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用品目工程マスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ITM_OPER = create("F2040", "MES_ORDER_SEND_ITM_OPER", true, false, false, false, "MS.MSLAL9820.OrdSendConvItmOper_Conv01", "MS.MSLAL9820.OrdSendConvItmOper_Conv02", null, null, null, "MSS_ORDERSENDITMOPERIF", "MST_ORDSND_ITMOPER_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用品目詳細マスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ITM_DTL = create("F2050", "MES_ORDER_SEND_ITM_DTL", true, false, false, false, "MS.MSLAL9830.OrdSendConvItmDtl_Conv01", "MS.MSLAL9830.OrdSendConvItmDtl_Conv02", null, null, null, "MSS_ORDERSENDITMDTLIF", "MST_ORDSND_ITM_DTL_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用BOMマスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_BOM = create("F2060", "MES_ORDER_SEND_BOM", true, false, false, false, "MS.MSLAL9840.OrdSendConvBom_Conv01", "MS.MSLAL9840.OrdSendConvBom_Conv02", null, null, null, "MSS_ORDERSENDITMBOMIF", "MST_ORDSND_BOM_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ送信用場所マスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_LOC = create("F2070", "MES_ORDER_SEND_LOC", true, false, false, false, "MS.MSLAL9850.OrdSendConvLoc_Conv01", "MS.MSLAL9850.OrdSendConvLoc_Conv02", null, null, null, "MSS_ORDERSENDLOCIF", "MST_ORDSND_LOC_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ送信用カレンダマスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_CAL = create("F2080", "MES_ORDER_SEND_CAL", true, false, false, false, "MS.MSLAL9860.OrdSendConvCal_Conv01", "MS.MSLAL9860.OrdSendConvCal_Conv02", null, null, null, "MSS_ORDERSENDCALIF", "MST_ORDSND_CAL_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ送信用臨時カレンダマスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_CAL_EXT = create("F2090", "MES_ORDER_SEND_CAL_EXT", true, false, false, false, "MS.MSLAL9870.OrdSendConvCalExt_Conv01", "MS.MSLAL9870.OrdSendConvCalExt_Conv02", null, null, null, "MSS_ORDERSENDCALEXTIF", "MST_ORDSND_CAL_EXT_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ送信用在庫情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_STK = create("F2100", "MES_ORDER_SEND_STK", true, false, false, false, "MS.MSLAL9880.OrdSendConvStk_Conv01", "MS.MSLAL9880.OrdSendConvStk_Conv02", null, null, null, "MSS_ORDERSENDSTKIF", "MST_ORDSND_STK_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用入庫予定情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_GR_SCHD = create("F2110", "MES_ORDER_SEND_GR_SCHD", true, false, false, false, "MS.MSLAL9890.OrdSendConvGrSchd_Conv01", "MS.MSLAL9890.OrdSendConvGrSchd_Conv02", null, null, null, "MSS_ORDERSENDGRSCHDIF", "MST_ORDSND_GR_SCHD_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用出庫予定情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_GI_SCHD = create("F2120", "MES_ORDER_SEND_GI_SCHD", true, false, false, false, "MS.MSLAL9900.OrdSendConvGiSchd_Conv01", "MS.MSLAL9900.OrdSendConvGiSchd_Conv02", null, null, null, "MSS_ORDERSENDGISCHDIF", "MST_ORDSND_GI_SCHD_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用日次需要情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_DLY_DMND = create("F2130", "MES_ORDER_SEND_DLY_DMND", true, false, false, false, "MS.MSLAL9910.OrdSendConvDlyDmnd_Conv01", "MS.MSLAL9910.OrdSendConvDlyDmnd_Conv02", null, null, null, "MSS_ORDERSENDDLYDMNDIF", "MST_ORDSND_DLYDMND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：オーダ送信用品目詳細ＢＯＭマスタ
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ITM_DTL_BOM = create("F2140", "MES_ORDER_SEND_ITM_DTL_BOM", true, false, false, false, "MS.MSLAL9940.OrdSendConvItmDtlBom_Conv01", "MS.MSLAL9940.OrdSendConvItmDtlBom_Conv02", null, null, null, "MSS_ORDERSENDDTLBOMIF", "MST_ORDSND_DTL_BOM_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用オーダ引当情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ORD_LNK = create("F2150", "MES_ORDER_SEND_ORD_LNK", true, false, false, false, "MS.MSLAL9950.OrdSendConvOrdLnk_Conv01", "MS.MSLAL9950.OrdSendConvOrdLnk_Conv02", null, null, null, "MSS_ORDERSENDORDLNKIF", "MST_ORDSND_ORD_LNK_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用工程指図実績情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_OPER = create("F2160", "MES_ORDER_SEND_OPER", true, false, false, false, "MS.MSLAL9960.OrdSendConvOperInstAct_Conv01", "MS.MSLAL9960.OrdSendConvOperInstAct_Conv02", null, null, null, "MSS_ORDERSENDOPEACTIF", "MST_ORDSND_OPE_ACT_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：オーダ送信用実績数量情報
	 */
	public static final MAC_IF_PROC_TYP MES_ORDER_SEND_ACT_QTY = create("F2170", "MES_ORDER_SEND_ACT_QTY", true, false, false, false, "MS.MSLAL9990.OrdSendConvSchdActQty_Conv01", "MS.MSLAL9990.OrdSendConvSchdActQty_Conv02", null, null, null, "MSS_ORDERSENDACTQTYIF", "MST_ORDSND_ACT_QTY_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, true, false, false);

	/** ＩＦ処理区分：検査指図送信
	 */
	public static final MAC_IF_PROC_TYP MES_INSP_INST_SEND = create("F3010", "MES_INSP_INST_SEND", true, false, false, false, "MS.MSLAL8310.InspInstSendConv_Conv01", "MS.MSLAL8310.InspInstSendConv_Conv02", null, null, null, "MSS_INSPINSTSENDIF", "MST_INSP_INST_SEND_IF", null, null, null, true, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：検査実績受信
	 */
	public static final MAC_IF_PROC_TYP MES_INSP_ACT_RECV = create("F3020", "MES_INSP_ACT_RECV", false, false, false, false, "MS.MSLAL8320.InspActRecvConv_Conv01", "MS.MSLAL8320.InspActRecvConv_Conv02", "MS.MSLAL6420.InspActRecvIf_Upd01", null, null, "MSS_INSPACTRECVIF", "MST_INSP_ACT_RECV_IF", null, null, null, true, "MS.MSLAL6420.InspActRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（得意先）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_CST_SEND = create("G0010", "EXT_BP_CST_SEND", true, false, false, false, null, "PF.PFBEL5010.BpCstIf_Conv01", null, null, null, null, "MBT_BP_SND_IF_EXT", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（納品先）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_DLV_SEND = create("G0020", "EXT_BP_DLV_SEND", true, false, false, false, null, "PF.PFBEL5020.BpDlvIf_Conv01", null, null, null, null, "MBT_BP_SND_IF_EXT", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（仕向先）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_DEST_SEND = create("G0030", "EXT_BP_DEST_SEND", true, false, false, false, null, "PF.PFBEL5030.BpDestIf_Conv01", null, null, null, null, "MBT_BP_SND_IF_EXT", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ（発注先）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_SPPL_SEND = create("G0040", "EXT_BP_SPPL_SEND", true, false, false, false, null, "PF.PFBEL5040.BpSpplIf_Conv01", null, null, null, null, "MBT_BP_SND_IF_EXT", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（製品）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_PROD_SEND = create("G0110", "EXT_ITM_PROD_SEND", true, false, false, false, null, "PF.PFBEL5110.ItmProdIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（その他）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_OTHER_SEND = create("G0120", "EXT_ITM_OTHER_SEND", true, false, false, false, null, "PF.PFBEL5190.ItmOtherIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（商品）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_GOODS_SEND = create("G0130", "EXT_ITM_GOODS_SEND", true, false, false, false, null, "PF.PFBEL5100.ItmGoodsIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（中間品）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_WIP_SEND = create("G0140", "EXT_ITM_WIP_SEND", true, false, false, false, null, "PF.PFBEL5120.ItmWipIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（部品）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_PARTS_SEND = create("G0150", "EXT_ITM_PARTS_SEND", true, false, false, false, null, "PF.PFBEL5130.ItmPartsIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（資材）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_MATE_SEND = create("G0160", "EXT_ITM_MATE_SEND", true, false, false, false, null, "PF.PFBEL5140.ItmMateIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目マスタ（原料）送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_RAWMATE_SEND = create("G0170", "EXT_ITM_RAWMATE_SEND", true, false, false, false, null, "PF.PFBEL5150.ItmRawmateIf_Conv01", null, null, null, null, "MBT_ITM_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先禁止マスタ送信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_STOP_SEND = create("G0210", "EXT_BP_STOP_SEND", true, false, false, false, null, "PF.PFBEL5210.BpStopIf_Conv01", null, null, null, null, "MBT_BP_STOP_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：品目禁止マスタ送信
	 */
	public static final MAC_IF_PROC_TYP EXT_ITM_STOP_SEND = create("G0220", "EXT_ITM_STOP_SEND", true, false, false, false, null, "PF.PFBEL5220.ItmStopIf_Conv01", null, null, null, null, "MBT_ITM_STOP_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：輸出規制マスタ送信
	 */
	public static final MAC_IF_PROC_TYP EXT_EX_CTRL_SEND = create("G0230", "EXT_EX_CTRL_SEND", true, false, false, false, null, "PF.PFBEL5230.ExCtrlIf_Conv01", null, null, null, null, "MBT_EX_CTRL_SND_IF", null, null, null, false, null, false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：購買単価マスタ受信
	 */
	public static final MAC_IF_PROC_TYP EXT_PURC_UPRI_RECV = create("G0240", "EXT_PURC_UPRI_RECV", false, false, false, false, "PF.PFBEL5240.PurcUpriIf_Conv01", "PF.PFBEL5240.PurcUpriIf_Conv02", null, null, null, "MBS_PURC_UPRI_IF_DATA_LNO", null, null, null, null, false, "MB.MBBEL5030.RecvExtMst_Upd02", false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：加工単価マスタ受信
	 */
	public static final MAC_IF_PROC_TYP EXT_PROC_UPRI_RECV = create("G0250", "EXT_PROC_UPRI_RECV", false, false, false, false, "PF.PFBEL5250.ProcUpriIf_Conv01", "PF.PFBEL5250.ProcUpriIf_Conv02", null, null, null, "MBS_PROC_UPRI_IF_DATA_LNO", null, null, null, null, false, "MB.MBBEL5030.RecvExtMst_Upd02", false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ受信
	 */
	public static final MAC_IF_PROC_TYP EXT_BP_RECV = create("G0260", "EXT_BP_RECV", false, false, false, false, "PF.PFBEL5260.BpIf_Conv01", "PF.PFBEL5260.BpIf_Conv02", null, null, null, "MBS_BP_IF_DATA_LNO", null, null, null, null, false, "MB.MBBEL5030.RecvExtMst_Upd02", false, true, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：入金情報受信
	 */
	public static final MAC_IF_PROC_TYP RCV_RECV = create("H0010", "RCV_RECV", false, false, false, false, "MS.MSLAL9510.RcvRecvConv_Conv01", "MS.MSLAL9510.RcvRecvConv_Conv02", "MS.MSLAL9010.RcvRecvIf_Upd01", null, null, "MSS_RCVRECVIF", null, null, null, null, false, "MS.MSLAL9010.RcvRecvIf_Upd02", true, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：発注受信
	 */
	public static final MAC_IF_PROC_TYP PO_RECV = create("H0110", "PO_RECV", false, false, false, false, "MS.MSLAL9610.PoRecvConv_Conv01", "MS.MSLAL9610.PoRecvConv_Conv02", "MS.MSLAL9110.PoRecvIf_Upd01", null, null, "MSS_PORECVIF", "MST_PO_RECV_IF", null, null, null, true, "MS.MSLAL9110.PoRecvIf_Upd02", false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, false);

	/** ＩＦ処理区分：原価計算結果１送信
	 */
	public static final MAC_IF_PROC_TYP ACC_COST1_SEND = create("J0010", "ACC_COST1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST1_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", "MCFCT_ACT_SML_COST", "MCFCT_ACT_SML_COST", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_SML_COST1_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価計算結果２送信
	 */
	public static final MAC_IF_PROC_TYP ACC_COST2_SEND = create("J0020", "ACC_COST2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST2_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", "MCFCT_PLN_SML_COST", "MCFCT_PLN_SML_COST", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_SML_COST2_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価計算結果３送信
	 */
	public static final MAC_IF_PROC_TYP ACC_COST3_SEND = create("J0030", "ACC_COST3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST3_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST3_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価計算結果４送信
	 */
	public static final MAC_IF_PROC_TYP ACC_COST4_SEND = create("J0040", "ACC_COST4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST4_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST4_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価計算結果５送信
	 */
	public static final MAC_IF_PROC_TYP ACC_COST5_SEND = create("J0050", "ACC_COST5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST5_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST5_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程原価計算結果１送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_COST1_SEND = create("J0060", "ACC_OPER_COST1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST1_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", "MCFCT_ACT_OPER_COST", "MCFCT_ACT_OPER_COST", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST1_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程原価計算結果２送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_COST2_SEND = create("J0070", "ACC_OPER_COST2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST2_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", "MCFCT_PLN_OPER_COST", "MCFCT_PLN_OPER_COST", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST2_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程原価計算結果３送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_COST3_SEND = create("J0080", "ACC_OPER_COST3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST3_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST3_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程原価計算結果４送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_COST4_SEND = create("J0090", "ACC_OPER_COST4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST4_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST4_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程原価計算結果５送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_COST5_SEND = create("J0100", "ACC_OPER_COST5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST5_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST5_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価受払表送信
	 */
	public static final MAC_IF_PROC_TYP IO_SEND = create("J0110", "IO_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_IO_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5030.Upd01", "MCFCT_IO", "MCFCT_IO", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_IO_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：月末在庫送信
	 */
	public static final MAC_IF_PROC_TYP MLY_STK_DTL_SEND = create("J0210", "MLY_STK_DTL_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_MLY_STK_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5010.Upd01", "MCFCT_STK", "MCFCT_STK", true, false, "CMP_AC_YM", "V_COL1", "ds_cmd2.bat", true, "MSVT_MLY_STK_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：受払実績送信
	 */
	public static final MAC_IF_PROC_TYP IO_ACT_SEND = create("J0220", "IO_ACT_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_IO_ACT_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5020.Upd01", "MCFCT_IO_ACT", "MCFCT_IO_ACT", true, false, "CMP_SLIP_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_IO_ACT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：受払予定送信
	 */
	public static final MAC_IF_PROC_TYP IO_SCHD_SEND = create("J0230", "IO_SCHD_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_IO_SCHD_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5030.Upd01", "MCFCT_IO_SCHD", "MCFCT_IO_SCHD", true, false, "CMP_SLIP_SCHD_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_IO_SCHD_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：品目オーダ情報送信
	 */
	public static final MAC_IF_PROC_TYP ITM_ORDER_SEND = create("J0240", "ITM_ORDER_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_ITM_ORDER_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5040.Upd01", "MCFCT_ITM_ORDER", "MCFCT_ITM_ORDER", true, false, "CMP_ITM_ORD_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_ITM_ORDER_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：出荷進捗送信
	 */
	public static final MAC_IF_PROC_TYP SHIP_PR_SEND = create("J0250", "SHIP_PR_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_SHIP_PR_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5050.Upd01", "MCFCT_SHIP_PR", "MCFCT_SHIP_PR", true, false, "CMP_SHIP_PR_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_SHIP_PR_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：滞留在庫情報送信
	 */
	public static final MAC_IF_PROC_TYP NON_MOV_STK_SEND = create("J0260", "NON_MOV_STK_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_NON_MOV_STK_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5060.Upd01", "MCFCT_NON_MOV_STK", "MCFCT_NON_MOV_STK", true, false, null, null, "ds_cmd1.bat", true, "MSVT_NON_MOV_STK_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：入荷進捗送信
	 */
	public static final MAC_IF_PROC_TYP ARR_PR_SEND = create("J0270", "ARR_PR_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_ARR_PR_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5070.Upd01", "MCFCT_ARR_PR", "MCFCT_ARR_PR", true, false, "CMP_ARR_PR_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_ARR_PR_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：検査実績送信
	 */
	public static final MAC_IF_PROC_TYP INSP_ACT_SEND = create("J0280", "INSP_ACT_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MSVT_INSP_ACT_IF_ALL", null, null, null, false, null, false, false, "MSLCB0010", "MS.MSLCL5080.Upd01", "MCFCT_INSP_ACT", "MCFCT_INSP_ACT", true, false, "CMP_INSP_ACT_D_NO", "V_COL1", "ds_cmd2.bat", true, "MSVT_INSP_ACT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：取引先マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_BP_MST_SEND = create("J0310", "BI_BP_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_BP", "MCFCM_BP", false, false, null, null, "ds_cmd1.bat", true, "MAVM_BP_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：品目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_ITM_MST_SEND = create("J0320", "BI_ITM_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_ITM", "MCFCM_ITM", false, false, null, null, "ds_cmd1.bat", true, "MAVM_ITM_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：場所マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_LOC_MST_SEND = create("J0330", "BI_LOC_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_LOC", "MCFCM_LOC", false, false, null, null, "ds_cmd1.bat", true, "MAVM_LOC_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：部門マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_DPT_MST_SEND = create("J0340", "BI_DPT_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_DPT", "MCFCM_DPT", false, false, null, null, "ds_cmd1.bat", true, "MAVM_DPT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：工程マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_OPER_MST_SEND = create("J0350", "BI_OPER_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_OPER", "MCFCM_OPER", false, false, null, null, "ds_cmd1.bat", true, "MAVM_OPER_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：担当者マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_USR_MST_SEND = create("J0360", "BI_USR_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_USR", "MCFCM_USR", false, false, null, null, "ds_cmd1.bat", true, "MAVM_USR_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：業務理由マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_BIZ_RSN_MST_SEND = create("J0370", "BI_BIZ_RSN_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_BIZ_RSN", "MCFCM_BIZ_RSN", false, false, null, null, "ds_cmd1.bat", true, "MAVM_BIZ_RSN_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：棚・ラインマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_STR_LN_MST_SEND = create("J0380", "BI_STR_LN_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_STR_LN", "MCFCM_STR_LN", false, false, null, null, "ds_cmd1.bat", true, "MAVM_STR_LN_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：通貨マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CUR_MST_SEND = create("J0390", "BI_CUR_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CUR", "MCFCM_CUR", false, false, null, null, "ds_cmd1.bat", true, "MAVM_CUR_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：対象期間マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_TERM_MST_SEND = create("J0400", "BI_TERM_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_TERM", "MCFCM_TERM", false, false, null, null, "ds_cmd1.bat", true, "MAVM_TERM_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：計算グループマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CALC_GRP_MST_SEND = create("J0410", "BI_CALC_GRP_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CALC_GRP", "MCFCM_CALC_GRP", false, false, null, null, "ds_cmd1.bat", true, "MAVM_CALC_GRP_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価部門マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_DPT_MST_SEND = create("J0420", "BI_COST_DPT_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_DPT", "MCFCM_COST_DPT", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_DPT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価売上分類マスタ１送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_SLS_MST1_SEND = create("J0430", "BI_COST_SLS_MST1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_SLS1", "MCFCM_COST_SLS1", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価売上分類マスタ２送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_SLS_MST2_SEND = create("J0440", "BI_COST_SLS_MST2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_SLS2", "MCFCM_COST_SLS2", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価売上分類マスタ３送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_SLS_MST3_SEND = create("J0450", "BI_COST_SLS_MST3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_SLS3", "MCFCM_COST_SLS3", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価売上分類マスタ４送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_SLS_MST4_SEND = create("J0460", "BI_COST_SLS_MST4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_SLS4", "MCFCM_COST_SLS4", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価売上分類マスタ５送信
	 */
	public static final MAC_IF_PROC_TYP BI_COST_SLS_MST5_SEND = create("J0470", "BI_COST_SLS_MST5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_COST_SLS5", "MCFCM_COST_SLS5", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価費目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_EXPNS_MST_SEND = create("J0480", "BI_EXPNS_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_EXPNS", "MCFCM_EXPNS", false, false, null, null, "ds_cmd1.bat", true, "MAVM_EXPNS_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：会計理由マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_AC_RSN_MST_SEND = create("J0490", "BI_AC_RSN_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_AC_RSN", "MCFCM_AC_RSN", false, false, null, null, "ds_cmd1.bat", true, "MAVM_AC_RSN_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：ワーキンググループマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_WG_MST_SEND = create("J0500", "BI_WG_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_WG", "MCFCM_WG", false, false, null, null, "ds_cmd1.bat", true, "MAVM_WG_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：単位マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_UNIT_MST_SEND = create("J0510", "BI_UNIT_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_UNIT", "MCFCM_UNIT", false, false, null, null, "ds_cmd1.bat", true, "MAVM_UNIT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：税マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_TAX_MST_SEND = create("J0520", "BI_TAX_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_TAX", "MCFCM_TAX", false, false, null, null, "ds_cmd1.bat", true, "MAVM_TAX_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：物流グループマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_LG_GRP_MST_SEND = create("J0530", "BI_LG_GRP_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_LG_GRP", "MCFCM_LG_GRP", false, false, null, null, "ds_cmd1.bat", true, "MAVM_LG_GRP_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価実績送信
	 */
	public static final MAC_IF_PROC_TYP ACT_SEND = create("J0600", "ACT_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "PBVT_ACT_IF_ALL", null, null, null, false, null, false, false, "PBLAB0010", "PB.PBLAL5020.Upd01", "MCFCT_ACT_COST", "MCFCT_ACT_COST", true, false, "CMP_YM", "V_COL1", "ds_cmd3.bat", true, "PBVT_ACT_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価実績固定費送信
	 */
	public static final MAC_IF_PROC_TYP ACT_FXD_SEND = create("J0610", "ACT_FXD_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "PBVT_ACT_FXD_IF_ALL", null, null, null, false, null, false, false, "PBLAB0010", "PB.PBLAL5020.Upd01", "MCFCT_ACT_FXD_COST", "MCFCT_ACT_FXD_COST", true, false, "CMP_YM", "V_COL1", "ds_cmd3.bat", true, "PBVT_ACT_FXD_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：売上予算シミュレーション情報送信
	 */
	public static final MAC_IF_PROC_TYP SIM_BDG_SEND = create("J0620", "SIM_BDG_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "PBVT_SIM_BDG_IF_ALL", null, null, null, false, null, false, false, "PBLAB0010", "PB.PBLAL5010.Upd01", "MCFCT_SIM_BDG_COST", "MCFCT_SIM_BDG_COST", true, false, "CMP_SCENARIO", "V_COL1", "ds_cmd4.bat", true, "PBVT_SIM_BDG_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：固定費シミュレーション情報送信
	 */
	public static final MAC_IF_PROC_TYP SIM_FXD_SEND = create("J0630", "SIM_FXD_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "PBVT_SIM_FXD_IF_ALL", null, null, null, false, null, false, false, "PBLAB0010", "PB.PBLAL5010.Upd01", "MCFCT_SIM_FXD_COST", "MCFCT_SIM_FXD_COST", true, false, "CMP_SCENARIO", "V_COL1", "ds_cmd4.bat", true, "PBVT_SIM_FXD_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：配賦科目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_ALC_AC_MST_SEND = create("J0700", "BI_ALC_AC_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_ALC_AC", "MCFCM_ALC_AC", false, false, null, null, "ds_cmd1.bat", true, "MAVM_ALC_AC_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：原価部門構成マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_DPT_CONFIG_SEND = create("J0710", "BI_DPT_CONFIG_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_DPT_CONFIG", "MCFCM_DPT_CONFIG", false, false, null, null, "ds_cmd1.bat", true, "MAVM_DPT_CONFIG_IF_ALL", false, false, false, false);

	/** ＩＦ処理区分：予算シナリオ送信
	 */
	public static final MAC_IF_PROC_TYP BI_BDG_SCENARIO_SEND = create("J0720", "BI_BDG_SCENARIO_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_SCENARIO", "MCFCM_SCENARIO_IF", false, false, null, null, "ds_cmd5.bat", true, "PBT_SIM_ADJ_HIS_ALL", false, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算結果１送信
	 */
	public static final MAC_IF_PROC_TYP ACC_CFP1_SEND = create("J1010", "ACC_CFP1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST1_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", "MCFCT_ACT_SML_CFP", "MCFCT_ACT_SML_CFP", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_SML_COST1_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算結果２送信
	 */
	public static final MAC_IF_PROC_TYP ACC_CFP2_SEND = create("J1020", "ACC_CFP2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST2_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", "MCFCT_PLN_SML_CFP", "MCFCT_PLN_SML_CFP", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_SML_COST2_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算結果３送信
	 */
	public static final MAC_IF_PROC_TYP ACC_CFP3_SEND = create("J1030", "ACC_CFP3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST3_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST3_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算結果４送信
	 */
	public static final MAC_IF_PROC_TYP ACC_CFP4_SEND = create("J1040", "ACC_CFP4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST4_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST4_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算結果５送信
	 */
	public static final MAC_IF_PROC_TYP ACC_CFP5_SEND = create("J1050", "ACC_CFP5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_SML_COST5_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_SML_COST5_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：工程ＣＦＰ計算結果１送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_CFP1_SEND = create("J1060", "ACC_OPER_CFP1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST1_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", "MCFCT_ACT_OPER_CFP", "MCFCT_ACT_OPER_CFP", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST1_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：工程ＣＦＰ計算結果２送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_CFP2_SEND = create("J1070", "ACC_OPER_CFP2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST2_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", "MCFCT_PLN_OPER_CFP", "MCFCT_PLN_OPER_CFP", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST2_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：工程ＣＦＰ計算結果３送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_CFP3_SEND = create("J1080", "ACC_OPER_CFP3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST3_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST3_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：工程ＣＦＰ計算結果４送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_CFP4_SEND = create("J1090", "ACC_OPER_CFP4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST4_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST4_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：工程ＣＦＰ計算結果５送信
	 */
	public static final MAC_IF_PROC_TYP ACC_OPER_CFP5_SEND = create("J1100", "ACC_OPER_CFP5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_ACC_OPER_COST5_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5020.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "MGVT_ACC_OPER_COST5_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ内訳１送信
	 */
	public static final MAC_IF_PROC_TYP ACC_INPT_CFP1_SEND = create("J1210", "ACC_INPT_CFP1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "GXVT_ACC_INPT_CFP1_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "GX.GXLAL5010.Upd01", "MCFCT_ACT_INPT_CFP", "MCFCT_ACT_INPT_CFP", true, true, "CMP_TERM", "V_COL1", "ds_cmd2.bat", true, "GXVT_ACC_INPT_CFP1_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ内訳２送信
	 */
	public static final MAC_IF_PROC_TYP ACC_INPT_CFP2_SEND = create("J1220", "ACC_INPT_CFP2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "GXVT_ACC_INPT_CFP2_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "GX.GXLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "GXVT_ACC_INPT_CFP2_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ内訳３送信
	 */
	public static final MAC_IF_PROC_TYP ACC_INPT_CFP3_SEND = create("J1230", "ACC_INPT_CFP3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "GXVT_ACC_INPT_CFP3_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "GX.GXLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "GXVT_ACC_INPT_CFP3_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ内訳４送信
	 */
	public static final MAC_IF_PROC_TYP ACC_INPT_CFP4_SEND = create("J1240", "ACC_INPT_CFP4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "GXVT_ACC_INPT_CFP4_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "GX.GXLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "GXVT_ACC_INPT_CFP4_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ内訳５送信
	 */
	public static final MAC_IF_PROC_TYP ACC_INPT_CFP5_SEND = create("J1250", "ACC_INPT_CFP5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "GXVT_ACC_INPT_CFP5_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "GX.GXLAL5010.Upd01", null, null, true, true, null, null, "ds_cmd2.bat", true, "GXVT_ACC_INPT_CFP5_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ受払表送信
	 */
	public static final MAC_IF_PROC_TYP CFP_IO_SEND = create("J1110", "CFP_IO_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, "MGVT_IO_IF_ALL", null, null, null, false, null, false, false, "MGLAB0010", "MG.MGLAL5030.Upd01", "MCFCT_CFP_IO", "MCFCT_CFP_IO", true, true, "CMP_YM", "V_COL1", "ds_cmd2.bat", true, "MGVT_IO_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ取引先マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_BP_MST_SEND = create("J2010", "BI_CFP_BP_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_BP", "MCFCM_CFP_BP", false, false, null, null, "ds_cmd1.bat", true, "MAVM_BP_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ品目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_ITM_MST_SEND = create("J2020", "BI_CFP_ITM_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_ITM", "MCFCM_CFP_ITM", false, false, null, null, "ds_cmd1.bat", true, "MAVM_ITM_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ場所マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_LOC_MST_SEND = create("J2030", "BI_CFP_LOC_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_LOC", "MCFCM_CFP_LOC", false, false, null, null, "ds_cmd1.bat", true, "MAVM_LOC_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ工程マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_OPER_MST_SEND = create("J2040", "BI_CFP_OPER_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_OPER", "MCFCM_CFP_OPER", false, false, null, null, "ds_cmd1.bat", true, "MAVM_OPER_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ担当者マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_USR_MST_SEND = create("J2050", "BI_CFP_USR_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_USR", "MCFCM_CFP_USR", false, false, null, null, "ds_cmd1.bat", true, "MAVM_USR_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ棚・ラインマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_STR_LN_MST_SEND = create("J2060", "BI_CFP_STR_LN_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_STR_LN", "MCFCM_CFP_STR_LN", false, false, null, null, "ds_cmd1.bat", true, "MAVM_STR_LN_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：環境単位マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_CUR_MST_SEND = create("J2070", "BI_CFP_CUR_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_CUR", "MCFCM_CFP_CUR", false, false, null, null, "ds_cmd1.bat", true, "MAVM_CUR_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ対象期間マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_TERM_MST_SEND = create("J2080", "BI_CFP_TERM_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_TERM", "MCFCM_CFP_TERM", false, false, null, null, "ds_cmd1.bat", true, "MAVM_TERM_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ計算グループマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_CALC_GRP_MST_SEND = create("J2090", "BI_CFP_CALC_GRP_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_CALC_GRP", "MCFCM_CFP_CALC_GRP", false, false, null, null, "ds_cmd1.bat", true, "MAVM_CALC_GRP_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ部門マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_DPT_MST_SEND = create("J2100", "BI_CFP_DPT_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_DPT", "MCFCM_CFP_DPT", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_DPT_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ売上分類マスタ１送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_SLS_MST1_SEND = create("J2110", "BI_CFP_SLS_MST1_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_SLS1", "MCFCM_CFP_SLS1", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ売上分類マスタ２送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_SLS_MST2_SEND = create("J2120", "BI_CFP_SLS_MST2_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_SLS2", "MCFCM_CFP_SLS2", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ売上分類マスタ３送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_SLS_MST3_SEND = create("J2130", "BI_CFP_SLS_MST3_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_SLS3", "MCFCM_CFP_SLS3", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ売上分類マスタ４送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_SLS_MST4_SEND = create("J2140", "BI_CFP_SLS_MST4_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_SLS4", "MCFCM_CFP_SLS4", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ売上分類マスタ５送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_SLS_MST5_SEND = create("J2150", "BI_CFP_SLS_MST5_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_SLS5", "MCFCM_CFP_SLS5", false, false, null, null, "ds_cmd1.bat", true, "MAVM_COST_SLS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ入出力項目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_EXPNS_MST_SEND = create("J2160", "BI_CFP_EXPNS_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_EXPNS", "MCFCM_CFP_EXPNS", false, false, null, null, "ds_cmd1.bat", true, "MAVM_EXPNS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ会計理由マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_AC_RSN_MST_SEND = create("J2170", "BI_CFP_AC_RSN_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_AC_RSN", "MCFCM_CFP_AC_RSN", false, false, null, null, "ds_cmd1.bat", true, "MAVM_AC_RSN_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰワーキンググループマスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_WG_MST_SEND = create("J2180", "BI_CFP_WG_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_WG", "MCFCM_CFP_WG", false, false, null, null, "ds_cmd1.bat", true, "MAVM_WG_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：配分科目マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_ALC_AC_MST_SEND = create("J2190", "BI_CFP_ALC_AC_MST_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_ALC_AC", "MCFCM_CFP_ALC_AC", false, false, null, null, "ds_cmd1.bat", true, "MAVM_ALC_AC_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ部門構成マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_DPT_CONFIG_SEND = create("J2200", "BI_CFP_DPT_CONFIG_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_DPT_CONFIG", "MCFCM_CFP_DPT_CONFIG", false, false, null, null, "ds_cmd1.bat", true, "MAVM_DPT_CONFIG_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＣＦＰ入出力項目表示構成マスタ送信
	 */
	public static final MAC_IF_PROC_TYP BI_CFP_EXPNS_CONFIG_SEND = create("J2210", "BI_CFP_EXPNS_CONFIG_SEND", true, false, false, false, null, "PF.PFBAL5800.SendIf_Conv01", null, null, "PF.PFBCL5010.DSIf_Imp01", null, null, null, null, null, false, null, false, false, "MABCB0010", null, "MCFCM_CFP_EXPNS_CONFIG", "MCFCM_CFP_EXPNS_CONFIG", false, false, null, null, "ds_cmd1.bat", true, "GXVM_EXPNS_IF_ALL", true, false, false, false);

	/** ＩＦ処理区分：ＳＡＰ仕訳送信
	 */
	public static final MAC_IF_PROC_TYP SAP_JOURNAL_SEND = create("K0010", "SAP_JOURNAL_SEND", true, false, false, false, "PF.PFBAL5810.SapJournalSendConvService_Conv01", null, null, null, null, null, "MBT_JOURNAL_SND_IF", null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, true, false);

	/** ＩＦ処理区分：ＳＡＰ原価センタマスタ取得
	 */
	public static final MAC_IF_PROC_TYP SAP_COST_CENTER = create("K1010", "SAP_COST_CENTER", true, false, false, false, null, null, null, "PF.PFBAL5830.CostCenter_Srch01", null, null, null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, true, false);

	/** ＩＦ処理区分：原価受払実績受信
	 */
	public static final MAC_IF_PROC_TYP PCM_IO_ACT_RCV = create("L0010", "PCM_IO_ACT_RCV", false, false, false, false, null, "MG.MGBBL6020.IoActIf_Conv01", null, null, null, "MGS_IO_ACT_RCV_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, true);

	/** ＩＦ処理区分：原価工数情報受信
	 */
	public static final MAC_IF_PROC_TYP PCM_ACT_WK_RCV = create("L0020", "PCM_ACT_WK_RCV", false, false, false, false, null, "MG.MGBBL6030.ActWkIf_Conv01", null, null, null, "MGS_ACT_WK_RCV_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, true);

	/** ＩＦ処理区分：原価仕掛情報受信
	 */
	public static final MAC_IF_PROC_TYP PCM_ACT_INST_WIP_RCV = create("L0030", "PCM_ACT_INST_WIP_RCV", false, false, false, false, null, "MG.MGBBL6040.ActInstWipIf_Conv01", null, null, null, "MGS_ACT_INST_WIP_RCV_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, true);

	/** ＩＦ処理区分：原価在庫情報受信
	 */
	public static final MAC_IF_PROC_TYP PCM_ACT_STK_RCV = create("L0040", "PCM_ACT_STK_RCV", false, false, false, false, null, "MG.MGBBL6050.ActStkIf_Conv01", null, null, null, "MGS_ACT_STK_RCV_DATA_LNO", null, null, null, null, false, null, false, false, null, null, null, null, false, false, null, null, null, false, null, false, false, false, true);

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_PROC_TYP create() {
		return new MAC_IF_PROC_TYP();
	}

	/**
	 * 新しいインスタンスを生成します。<BR>
	 * 定数グループに属していない値を引数にした場合はエラーになります。
	 * @param value 定数値
	 * @return 定数値に対応する定数インスタンス
	 * @throws MCAppException 定数が存在しない場合
	 */
	public static MAC_IF_PROC_TYP get(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		if (type == null) {
			throw MAC_IF_PROC_TYP.invalidValue(value);
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
	public static MAC_IF_PROC_TYP getNE(String value) {
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
			if (isSame(me.value(), value)) {
				return me;
			}
		}
		return null;
	}

	/**
	 * 新しいインスタンスを生成します。
	 */
	protected static MAC_IF_PROC_TYP create(String value, String xmlKey, boolean attr1, boolean attr2, boolean attr3, boolean attr4, String attr5, String attr6, String attr7, String attr8, String attr9, String attr10, String attr11, String attr12, String attr13, String attr14, boolean attr15, String attr16, boolean attr17, boolean attr18, String attr19, String attr20, String attr21, String attr22, boolean attr23, boolean attr24, String attr25, String attr26, String attr27, boolean attr28, String attr29, boolean attr30, boolean attr31, boolean attr32, boolean attr33) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.create();
		me.xmlKey = xmlKey;
		me.constR.addStringColumn($VALUE, value);
		me.constR.addBooleanColumn($IS_SEND, attr1);
		me.constR.addBooleanColumn($IS_EDI, attr2);
		me.constR.addBooleanColumn($IS_PLM, attr3);
		me.constR.addBooleanColumn($IS_AC, attr4);
		me.constR.addStringColumn($CONV_OPE, attr5);
		me.constR.addStringColumn($FILE_IO_OPE, attr6);
		me.constR.addStringColumn($IMP_OPE, attr7);
		me.constR.addStringColumn($WEP_API_OPE, attr8);
		me.constR.addStringColumn($CMD_EXEC_OPE, attr9);
		me.constR.addStringColumn($DATA_LNO_SEQ, attr10);
		me.constR.addStringColumn($UPD_IF_TBL, attr11);
		me.constR.addStringColumn($CO_RECV_IF_PROC_TYP, attr12);
		me.constR.addStringColumn($CO_RECV_CO_COL, attr13);
		me.constR.addStringColumn($CO_RECV_OPE, attr14);
		me.constR.addBooleanColumn($IS_SCM, attr15);
		me.constR.addStringColumn($IMP_OPE2, attr16);
		me.constR.addBooleanColumn($IS_FB, attr17);
		me.constR.addBooleanColumn($IS_ALL, attr18);
		me.constR.addStringColumn($BI_BAT, attr19);
		me.constR.addStringColumn($BI_OPE, attr20);
		me.constR.addStringColumn($DS_VTB_TBL, attr21);
		me.constR.addStringColumn($DS_OBJ, attr22);
		me.constR.addBooleanColumn($IS_DS_IMPMD_FIX, attr23);
		me.constR.addBooleanColumn($IS_DS_COST, attr24);
		me.constR.addStringColumn($DS_OBJ_JOIN_KEY_IMP, attr25);
		me.constR.addStringColumn($DS_OBJ_JOIN_KEY_WRK, attr26);
		me.constR.addStringColumn($DS_WRAP_CMD, attr27);
		me.constR.addBooleanColumn($IS_BI, attr28);
		me.constR.addStringColumn($STD_FILE_CONV_TBL, attr29);
		me.constR.addBooleanColumn($IS_CFP, attr30);
		me.constR.addBooleanColumn($IS_FS, attr31);
		me.constR.addBooleanColumn($IS_SAP, attr32);
		me.constR.addBooleanColumn($IS_PCM, attr33);
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
	 * is_sendの値を返します。
	 * @return is_sendの値
	 */
	public boolean is_send() {
		return constR.getBooleanNE($IS_SEND);
	}

	/** 
	 * valueに対応する定数のis_sendの値を返します。
	 * @param value 定数値
	 * @return is_sendの値
	 */
	public static boolean is_send(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_send();
	}

	/** 
	 * is_ediの値を返します。
	 * @return is_ediの値
	 */
	public boolean is_edi() {
		return constR.getBooleanNE($IS_EDI);
	}

	/** 
	 * valueに対応する定数のis_ediの値を返します。
	 * @param value 定数値
	 * @return is_ediの値
	 */
	public static boolean is_edi(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_edi();
	}

	/** 
	 * is_plmの値を返します。
	 * @return is_plmの値
	 */
	public boolean is_plm() {
		return constR.getBooleanNE($IS_PLM);
	}

	/** 
	 * valueに対応する定数のis_plmの値を返します。
	 * @param value 定数値
	 * @return is_plmの値
	 */
	public static boolean is_plm(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_plm();
	}

	/** 
	 * is_acの値を返します。
	 * @return is_acの値
	 */
	public boolean is_ac() {
		return constR.getBooleanNE($IS_AC);
	}

	/** 
	 * valueに対応する定数のis_acの値を返します。
	 * @param value 定数値
	 * @return is_acの値
	 */
	public static boolean is_ac(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ac();
	}

	/** 
	 * conv_opeの値を返します。
	 * @return conv_opeの値
	 */
	public String conv_ope() {
		return constR.getStringNE($CONV_OPE);
	}

	/** 
	 * valueに対応する定数のconv_opeの値を返します。
	 * @param value 定数値
	 * @return conv_opeの値
	 */
	public static String conv_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.conv_ope();
	}

	/** 
	 * file_io_opeの値を返します。
	 * @return file_io_opeの値
	 */
	public String file_io_ope() {
		return constR.getStringNE($FILE_IO_OPE);
	}

	/** 
	 * valueに対応する定数のfile_io_opeの値を返します。
	 * @param value 定数値
	 * @return file_io_opeの値
	 */
	public static String file_io_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.file_io_ope();
	}

	/** 
	 * imp_opeの値を返します。
	 * @return imp_opeの値
	 */
	public String imp_ope() {
		return constR.getStringNE($IMP_OPE);
	}

	/** 
	 * valueに対応する定数のimp_opeの値を返します。
	 * @param value 定数値
	 * @return imp_opeの値
	 */
	public static String imp_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.imp_ope();
	}

	/** 
	 * wep_api_opeの値を返します。
	 * @return wep_api_opeの値
	 */
	public String wep_api_ope() {
		return constR.getStringNE($WEP_API_OPE);
	}

	/** 
	 * valueに対応する定数のwep_api_opeの値を返します。
	 * @param value 定数値
	 * @return wep_api_opeの値
	 */
	public static String wep_api_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.wep_api_ope();
	}

	/** 
	 * cmd_exec_opeの値を返します。
	 * @return cmd_exec_opeの値
	 */
	public String cmd_exec_ope() {
		return constR.getStringNE($CMD_EXEC_OPE);
	}

	/** 
	 * valueに対応する定数のcmd_exec_opeの値を返します。
	 * @param value 定数値
	 * @return cmd_exec_opeの値
	 */
	public static String cmd_exec_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.cmd_exec_ope();
	}

	/** 
	 * data_lno_seqの値を返します。
	 * @return data_lno_seqの値
	 */
	public String data_lno_seq() {
		return constR.getStringNE($DATA_LNO_SEQ);
	}

	/** 
	 * valueに対応する定数のdata_lno_seqの値を返します。
	 * @param value 定数値
	 * @return data_lno_seqの値
	 */
	public static String data_lno_seq(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.data_lno_seq();
	}

	/** 
	 * upd_if_tblの値を返します。
	 * @return upd_if_tblの値
	 */
	public String upd_if_tbl() {
		return constR.getStringNE($UPD_IF_TBL);
	}

	/** 
	 * valueに対応する定数のupd_if_tblの値を返します。
	 * @param value 定数値
	 * @return upd_if_tblの値
	 */
	public static String upd_if_tbl(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.upd_if_tbl();
	}

	/** 
	 * co_recv_if_proc_typの値を返します。
	 * @return co_recv_if_proc_typの値
	 */
	public String co_recv_if_proc_typ() {
		return constR.getStringNE($CO_RECV_IF_PROC_TYP);
	}

	/** 
	 * valueに対応する定数のco_recv_if_proc_typの値を返します。
	 * @param value 定数値
	 * @return co_recv_if_proc_typの値
	 */
	public static String co_recv_if_proc_typ(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.co_recv_if_proc_typ();
	}

	/** 
	 * co_recv_co_colの値を返します。
	 * @return co_recv_co_colの値
	 */
	public String co_recv_co_col() {
		return constR.getStringNE($CO_RECV_CO_COL);
	}

	/** 
	 * valueに対応する定数のco_recv_co_colの値を返します。
	 * @param value 定数値
	 * @return co_recv_co_colの値
	 */
	public static String co_recv_co_col(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.co_recv_co_col();
	}

	/** 
	 * co_recv_opeの値を返します。
	 * @return co_recv_opeの値
	 */
	public String co_recv_ope() {
		return constR.getStringNE($CO_RECV_OPE);
	}

	/** 
	 * valueに対応する定数のco_recv_opeの値を返します。
	 * @param value 定数値
	 * @return co_recv_opeの値
	 */
	public static String co_recv_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.co_recv_ope();
	}

	/** 
	 * is_scmの値を返します。
	 * @return is_scmの値
	 */
	public boolean is_scm() {
		return constR.getBooleanNE($IS_SCM);
	}

	/** 
	 * valueに対応する定数のis_scmの値を返します。
	 * @param value 定数値
	 * @return is_scmの値
	 */
	public static boolean is_scm(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_scm();
	}

	/** 
	 * imp_ope2の値を返します。
	 * @return imp_ope2の値
	 */
	public String imp_ope2() {
		return constR.getStringNE($IMP_OPE2);
	}

	/** 
	 * valueに対応する定数のimp_ope2の値を返します。
	 * @param value 定数値
	 * @return imp_ope2の値
	 */
	public static String imp_ope2(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.imp_ope2();
	}

	/** 
	 * is_fbの値を返します。
	 * @return is_fbの値
	 */
	public boolean is_fb() {
		return constR.getBooleanNE($IS_FB);
	}

	/** 
	 * valueに対応する定数のis_fbの値を返します。
	 * @param value 定数値
	 * @return is_fbの値
	 */
	public static boolean is_fb(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_fb();
	}

	/** 
	 * is_allの値を返します。
	 * @return is_allの値
	 */
	public boolean is_all() {
		return constR.getBooleanNE($IS_ALL);
	}

	/** 
	 * valueに対応する定数のis_allの値を返します。
	 * @param value 定数値
	 * @return is_allの値
	 */
	public static boolean is_all(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_all();
	}

	/** 
	 * bi_batの値を返します。
	 * @return bi_batの値
	 */
	public String bi_bat() {
		return constR.getStringNE($BI_BAT);
	}

	/** 
	 * valueに対応する定数のbi_batの値を返します。
	 * @param value 定数値
	 * @return bi_batの値
	 */
	public static String bi_bat(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.bi_bat();
	}

	/** 
	 * bi_opeの値を返します。
	 * @return bi_opeの値
	 */
	public String bi_ope() {
		return constR.getStringNE($BI_OPE);
	}

	/** 
	 * valueに対応する定数のbi_opeの値を返します。
	 * @param value 定数値
	 * @return bi_opeの値
	 */
	public static String bi_ope(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.bi_ope();
	}

	/** 
	 * ds_vtb_tblの値を返します。
	 * @return ds_vtb_tblの値
	 */
	public String ds_vtb_tbl() {
		return constR.getStringNE($DS_VTB_TBL);
	}

	/** 
	 * valueに対応する定数のds_vtb_tblの値を返します。
	 * @param value 定数値
	 * @return ds_vtb_tblの値
	 */
	public static String ds_vtb_tbl(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ds_vtb_tbl();
	}

	/** 
	 * ds_objの値を返します。
	 * @return ds_objの値
	 */
	public String ds_obj() {
		return constR.getStringNE($DS_OBJ);
	}

	/** 
	 * valueに対応する定数のds_objの値を返します。
	 * @param value 定数値
	 * @return ds_objの値
	 */
	public static String ds_obj(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ds_obj();
	}

	/** 
	 * is_ds_impmd_fixの値を返します。
	 * @return is_ds_impmd_fixの値
	 */
	public boolean is_ds_impmd_fix() {
		return constR.getBooleanNE($IS_DS_IMPMD_FIX);
	}

	/** 
	 * valueに対応する定数のis_ds_impmd_fixの値を返します。
	 * @param value 定数値
	 * @return is_ds_impmd_fixの値
	 */
	public static boolean is_ds_impmd_fix(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ds_impmd_fix();
	}

	/** 
	 * is_ds_costの値を返します。
	 * @return is_ds_costの値
	 */
	public boolean is_ds_cost() {
		return constR.getBooleanNE($IS_DS_COST);
	}

	/** 
	 * valueに対応する定数のis_ds_costの値を返します。
	 * @param value 定数値
	 * @return is_ds_costの値
	 */
	public static boolean is_ds_cost(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_ds_cost();
	}

	/** 
	 * ds_obj_join_key_impの値を返します。
	 * @return ds_obj_join_key_impの値
	 */
	public String ds_obj_join_key_imp() {
		return constR.getStringNE($DS_OBJ_JOIN_KEY_IMP);
	}

	/** 
	 * valueに対応する定数のds_obj_join_key_impの値を返します。
	 * @param value 定数値
	 * @return ds_obj_join_key_impの値
	 */
	public static String ds_obj_join_key_imp(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ds_obj_join_key_imp();
	}

	/** 
	 * ds_obj_join_key_wrkの値を返します。
	 * @return ds_obj_join_key_wrkの値
	 */
	public String ds_obj_join_key_wrk() {
		return constR.getStringNE($DS_OBJ_JOIN_KEY_WRK);
	}

	/** 
	 * valueに対応する定数のds_obj_join_key_wrkの値を返します。
	 * @param value 定数値
	 * @return ds_obj_join_key_wrkの値
	 */
	public static String ds_obj_join_key_wrk(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ds_obj_join_key_wrk();
	}

	/** 
	 * ds_wrap_cmdの値を返します。
	 * @return ds_wrap_cmdの値
	 */
	public String ds_wrap_cmd() {
		return constR.getStringNE($DS_WRAP_CMD);
	}

	/** 
	 * valueに対応する定数のds_wrap_cmdの値を返します。
	 * @param value 定数値
	 * @return ds_wrap_cmdの値
	 */
	public static String ds_wrap_cmd(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.ds_wrap_cmd();
	}

	/** 
	 * is_biの値を返します。
	 * @return is_biの値
	 */
	public boolean is_bi() {
		return constR.getBooleanNE($IS_BI);
	}

	/** 
	 * valueに対応する定数のis_biの値を返します。
	 * @param value 定数値
	 * @return is_biの値
	 */
	public static boolean is_bi(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_bi();
	}

	/** 
	 * std_file_conv_tblの値を返します。
	 * @return std_file_conv_tblの値
	 */
	public String std_file_conv_tbl() {
		return constR.getStringNE($STD_FILE_CONV_TBL);
	}

	/** 
	 * valueに対応する定数のstd_file_conv_tblの値を返します。
	 * @param value 定数値
	 * @return std_file_conv_tblの値
	 */
	public static String std_file_conv_tbl(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return null;
		}
		return me.std_file_conv_tbl();
	}

	/** 
	 * is_cfpの値を返します。
	 * @return is_cfpの値
	 */
	public boolean is_cfp() {
		return constR.getBooleanNE($IS_CFP);
	}

	/** 
	 * valueに対応する定数のis_cfpの値を返します。
	 * @param value 定数値
	 * @return is_cfpの値
	 */
	public static boolean is_cfp(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_cfp();
	}

	/** 
	 * is_fsの値を返します。
	 * @return is_fsの値
	 */
	public boolean is_fs() {
		return constR.getBooleanNE($IS_FS);
	}

	/** 
	 * valueに対応する定数のis_fsの値を返します。
	 * @param value 定数値
	 * @return is_fsの値
	 */
	public static boolean is_fs(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_fs();
	}

	/** 
	 * is_sapの値を返します。
	 * @return is_sapの値
	 */
	public boolean is_sap() {
		return constR.getBooleanNE($IS_SAP);
	}

	/** 
	 * valueに対応する定数のis_sapの値を返します。
	 * @param value 定数値
	 * @return is_sapの値
	 */
	public static boolean is_sap(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_sap();
	}

	/** 
	 * is_pcmの値を返します。
	 * @return is_pcmの値
	 */
	public boolean is_pcm() {
		return constR.getBooleanNE($IS_PCM);
	}

	/** 
	 * valueに対応する定数のis_pcmの値を返します。
	 * @param value 定数値
	 * @return is_pcmの値
	 */
	public static boolean is_pcm(String value) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if( me == null){ 
			return false;
		}
		return me.is_pcm();
	}

	/** 
	 * 指定されたvalueが定数グループに属していればtrueを返します。
	 * @param value 定数値
	 * @return 指定されたvalueが定数グループに属していればtrue
	 */
	public static boolean contains ( String value ) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
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
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
		if (me == null) {
			throw MAC_IF_PROC_TYP.invalidValue(value);
		}
	}

	/** 
	 * 指定された定数値が定数グループに属していない場合は例外をthrowします。<p>
	 * @param value 定数値
	 * @param msgid メッセージID
	 * @param binds メッセージのバインド値
	 */
	public static void containsEx(String value, String msgid, Object... binds) {
		MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.getNE(value);
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
		return createStringPath(value(), name(), is_send(), is_edi(), is_plm(), is_ac(), conv_ope(), file_io_ope(), imp_ope(), wep_api_ope(), cmd_exec_ope(), data_lno_seq(), upd_if_tbl(), co_recv_if_proc_typ(), co_recv_co_col(), co_recv_ope(), is_scm(), imp_ope2(), is_fb(), is_all(), bi_bat(), bi_ope(), ds_vtb_tbl(), ds_obj(), is_ds_impmd_fix(), is_ds_cost(), ds_obj_join_key_imp(), ds_obj_join_key_wrk(), ds_wrap_cmd(), is_bi(), std_file_conv_tbl(), is_cfp(), is_fs(), is_sap(), is_pcm());
	}

	/**
	 * 定数オブジェクトの配列を返します。
	 * @return 定数オブジェクトの配列
	 */
	public static MAC_IF_PROC_TYP[] array() {
		if (array == null) {
			array = new MAC_IF_PROC_TYP[] {
					MAC_IF_PROC_TYP.PO_SEND, MAC_IF_PROC_TYP.PO_PRMS_RECV, MAC_IF_PROC_TYP.SHIP_ACT_RECV, MAC_IF_PROC_TYP.ACCPT_SEND, MAC_IF_PROC_TYP.DLV_INST_SEND, 
					 MAC_IF_PROC_TYP.BILL_RECV, MAC_IF_PROC_TYP.SLO_RECV, MAC_IF_PROC_TYP.SLO_PRMS_SEND, MAC_IF_PROC_TYP.SHIP_ACT_SEND, MAC_IF_PROC_TYP.ACCPT_RECV, MAC_IF_PROC_TYP.DLV_INST_RECV, 
					 MAC_IF_PROC_TYP.BILL_SEND, MAC_IF_PROC_TYP.PLM_CHNG_RECV, MAC_IF_PROC_TYP.PLM_ITM_RECV, MAC_IF_PROC_TYP.PLM_ITM_D_PURC_RECV, MAC_IF_PROC_TYP.PLM_ITM_D_PROD_RECV, MAC_IF_PROC_TYP.PLM_ITM_D_SBCN_RECV, 
					 MAC_IF_PROC_TYP.PLM_ITM_D_RQST_RECV, MAC_IF_PROC_TYP.PLM_ITM_STRG_RECV, MAC_IF_PROC_TYP.PLM_BOM_RECV, MAC_IF_PROC_TYP.PLM_ITM_OPER_RECV, MAC_IF_PROC_TYP.PLM_OPER_RECV, MAC_IF_PROC_TYP.PLM_ITM_TMB_RECV, 
					 MAC_IF_PROC_TYP.PLM_ITM_INSP_RECV, MAC_IF_PROC_TYP.PLM_WK_COST_RECV, MAC_IF_PROC_TYP.PLM_OPR_WK_CST_RECV, MAC_IF_PROC_TYP.PLM_LOC_SEND, MAC_IF_PROC_TYP.PLM_BP_SEND, MAC_IF_PROC_TYP.PLM_ITM_DTL_LT_SEND, 
					 MAC_IF_PROC_TYP.PLM_PURC_UPRI_SEND, MAC_IF_PROC_TYP.PLM_PA_QTY_SEND, MAC_IF_PROC_TYP.PLM_ITM_STOP_SEND, MAC_IF_PROC_TYP.PLM_MFG_COST_SEND, MAC_IF_PROC_TYP.PLM_PURC_COST_SEND, MAC_IF_PROC_TYP.PLM_MFG_STD_COST_SEND, 
					 MAC_IF_PROC_TYP.PLM_PURC_STD_COST_SEND, MAC_IF_PROC_TYP.PLM_WK_COST_SEND, MAC_IF_PROC_TYP.PLM_WK_STD_COST_SEND, MAC_IF_PROC_TYP.PLM_MFG_YIELD_SEND, MAC_IF_PROC_TYP.PLM_CHNG_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_DTL_IN_IF_RECV, 
					 MAC_IF_PROC_TYP.PLM_BOM_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_OPER_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_OPER_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ATTACH_INFO_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_INSP_P_IN_IF_RECV, 
					 MAC_IF_PROC_TYP.PLM_ITM_STRG_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_WG_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_SUB_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_UNIT_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_NOT_FIX_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_ITM_INSP_IN_IF_RECV, 
					 MAC_IF_PROC_TYP.PLM_WK_COST_IN_IF_RECV, MAC_IF_PROC_TYP.PLM_OPR_WK_CST_IN_IF_RECV, MAC_IF_PROC_TYP.AC_ACCOUNT_RECV, MAC_IF_PROC_TYP.AC_SUB_ACCOUNT_RECV, MAC_IF_PROC_TYP.AC_AC_DPT_RECV, MAC_IF_PROC_TYP.AC_BANK_RECV, 
					 MAC_IF_PROC_TYP.AC_BANK_BRANCH_RECV, MAC_IF_PROC_TYP.AC_BANK_AC_RECV, MAC_IF_PROC_TYP.AC_CUR_XRATE_RECV, MAC_IF_PROC_TYP.AC_AC_TAX_RECV, MAC_IF_PROC_TYP.AC_BAC_AC_RECV, MAC_IF_PROC_TYP.AC_JOURNAL_GL_SEND, 
					 MAC_IF_PROC_TYP.AC_JOURNAL_AP_SEND, MAC_IF_PROC_TYP.AC_JOURNAL_AR_SEND, MAC_IF_PROC_TYP.AC_NOTE_SEND, MAC_IF_PROC_TYP.AC_BP_CST_SEND, MAC_IF_PROC_TYP.AC_BP_SPPL_SEND, MAC_IF_PROC_TYP.AC_SCHD_PAY_SEND, 
					 MAC_IF_PROC_TYP.AC_SLS_SLIP_SEND, MAC_IF_PROC_TYP.AC_PURC_SLIP_SEND, MAC_IF_PROC_TYP.AC_PLN_ALC_AMT_RCV, MAC_IF_PROC_TYP.AC_ACT_ALC_AMT_RCV, MAC_IF_PROC_TYP.SCM_ACT_RECV, MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND, 
					 MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV, MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND, MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV, MAC_IF_PROC_TYP.WMS_XFR_INST_SEND, MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV, MAC_IF_PROC_TYP.WMS_ACXFR_ACT_RECV, 
					 MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND, MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV, MAC_IF_PROC_TYP.MES_OPER_INST_SEND, MAC_IF_PROC_TYP.MES_OPER_ACT_RECV, MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND, MAC_IF_PROC_TYP.MES_INPT_ACT_RECV, 
					 MAC_IF_PROC_TYP.MES_WK_ACT_RECV, MAC_IF_PROC_TYP.MES_WK_SCHD_SEND, MAC_IF_PROC_TYP.MES_ORDER_RECV, MAC_IF_PROC_TYP.MES_ORDER_SEND, MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM, MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_OPER, 
					 MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL, MAC_IF_PROC_TYP.MES_ORDER_SEND_BOM, MAC_IF_PROC_TYP.MES_ORDER_SEND_LOC, MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL, MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL_EXT, MAC_IF_PROC_TYP.MES_ORDER_SEND_STK, 
					 MAC_IF_PROC_TYP.MES_ORDER_SEND_GR_SCHD, MAC_IF_PROC_TYP.MES_ORDER_SEND_GI_SCHD, MAC_IF_PROC_TYP.MES_ORDER_SEND_DLY_DMND, MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL_BOM, MAC_IF_PROC_TYP.MES_ORDER_SEND_ORD_LNK, MAC_IF_PROC_TYP.MES_ORDER_SEND_OPER, 
					 MAC_IF_PROC_TYP.MES_ORDER_SEND_ACT_QTY, MAC_IF_PROC_TYP.MES_INSP_INST_SEND, MAC_IF_PROC_TYP.MES_INSP_ACT_RECV, MAC_IF_PROC_TYP.EXT_BP_CST_SEND, MAC_IF_PROC_TYP.EXT_BP_DLV_SEND, MAC_IF_PROC_TYP.EXT_BP_DEST_SEND, 
					 MAC_IF_PROC_TYP.EXT_BP_SPPL_SEND, MAC_IF_PROC_TYP.EXT_ITM_PROD_SEND, MAC_IF_PROC_TYP.EXT_ITM_OTHER_SEND, MAC_IF_PROC_TYP.EXT_ITM_GOODS_SEND, MAC_IF_PROC_TYP.EXT_ITM_WIP_SEND, MAC_IF_PROC_TYP.EXT_ITM_PARTS_SEND, 
					 MAC_IF_PROC_TYP.EXT_ITM_MATE_SEND, MAC_IF_PROC_TYP.EXT_ITM_RAWMATE_SEND, MAC_IF_PROC_TYP.EXT_BP_STOP_SEND, MAC_IF_PROC_TYP.EXT_ITM_STOP_SEND, MAC_IF_PROC_TYP.EXT_EX_CTRL_SEND, MAC_IF_PROC_TYP.EXT_PURC_UPRI_RECV, 
					 MAC_IF_PROC_TYP.EXT_PROC_UPRI_RECV, MAC_IF_PROC_TYP.EXT_BP_RECV, MAC_IF_PROC_TYP.RCV_RECV, MAC_IF_PROC_TYP.PO_RECV, MAC_IF_PROC_TYP.ACC_COST1_SEND, MAC_IF_PROC_TYP.ACC_COST2_SEND, 
					 MAC_IF_PROC_TYP.ACC_COST3_SEND, MAC_IF_PROC_TYP.ACC_COST4_SEND, MAC_IF_PROC_TYP.ACC_COST5_SEND, MAC_IF_PROC_TYP.ACC_OPER_COST1_SEND, MAC_IF_PROC_TYP.ACC_OPER_COST2_SEND, MAC_IF_PROC_TYP.ACC_OPER_COST3_SEND, 
					 MAC_IF_PROC_TYP.ACC_OPER_COST4_SEND, MAC_IF_PROC_TYP.ACC_OPER_COST5_SEND, MAC_IF_PROC_TYP.IO_SEND, MAC_IF_PROC_TYP.MLY_STK_DTL_SEND, MAC_IF_PROC_TYP.IO_ACT_SEND, MAC_IF_PROC_TYP.IO_SCHD_SEND, 
					 MAC_IF_PROC_TYP.ITM_ORDER_SEND, MAC_IF_PROC_TYP.SHIP_PR_SEND, MAC_IF_PROC_TYP.NON_MOV_STK_SEND, MAC_IF_PROC_TYP.ARR_PR_SEND, MAC_IF_PROC_TYP.INSP_ACT_SEND, MAC_IF_PROC_TYP.BI_BP_MST_SEND, 
					 MAC_IF_PROC_TYP.BI_ITM_MST_SEND, MAC_IF_PROC_TYP.BI_LOC_MST_SEND, MAC_IF_PROC_TYP.BI_DPT_MST_SEND, MAC_IF_PROC_TYP.BI_OPER_MST_SEND, MAC_IF_PROC_TYP.BI_USR_MST_SEND, MAC_IF_PROC_TYP.BI_BIZ_RSN_MST_SEND, 
					 MAC_IF_PROC_TYP.BI_STR_LN_MST_SEND, MAC_IF_PROC_TYP.BI_CUR_MST_SEND, MAC_IF_PROC_TYP.BI_TERM_MST_SEND, MAC_IF_PROC_TYP.BI_CALC_GRP_MST_SEND, MAC_IF_PROC_TYP.BI_COST_DPT_MST_SEND, MAC_IF_PROC_TYP.BI_COST_SLS_MST1_SEND, 
					 MAC_IF_PROC_TYP.BI_COST_SLS_MST2_SEND, MAC_IF_PROC_TYP.BI_COST_SLS_MST3_SEND, MAC_IF_PROC_TYP.BI_COST_SLS_MST4_SEND, MAC_IF_PROC_TYP.BI_COST_SLS_MST5_SEND, MAC_IF_PROC_TYP.BI_EXPNS_MST_SEND, MAC_IF_PROC_TYP.BI_AC_RSN_MST_SEND, 
					 MAC_IF_PROC_TYP.BI_WG_MST_SEND, MAC_IF_PROC_TYP.BI_UNIT_MST_SEND, MAC_IF_PROC_TYP.BI_TAX_MST_SEND, MAC_IF_PROC_TYP.BI_LG_GRP_MST_SEND, MAC_IF_PROC_TYP.ACT_SEND, MAC_IF_PROC_TYP.ACT_FXD_SEND, 
					 MAC_IF_PROC_TYP.SIM_BDG_SEND, MAC_IF_PROC_TYP.SIM_FXD_SEND, MAC_IF_PROC_TYP.BI_ALC_AC_MST_SEND, MAC_IF_PROC_TYP.BI_DPT_CONFIG_SEND, MAC_IF_PROC_TYP.BI_BDG_SCENARIO_SEND, MAC_IF_PROC_TYP.ACC_CFP1_SEND, 
					 MAC_IF_PROC_TYP.ACC_CFP2_SEND, MAC_IF_PROC_TYP.ACC_CFP3_SEND, MAC_IF_PROC_TYP.ACC_CFP4_SEND, MAC_IF_PROC_TYP.ACC_CFP5_SEND, MAC_IF_PROC_TYP.ACC_OPER_CFP1_SEND, MAC_IF_PROC_TYP.ACC_OPER_CFP2_SEND, 
					 MAC_IF_PROC_TYP.ACC_OPER_CFP3_SEND, MAC_IF_PROC_TYP.ACC_OPER_CFP4_SEND, MAC_IF_PROC_TYP.ACC_OPER_CFP5_SEND, MAC_IF_PROC_TYP.ACC_INPT_CFP1_SEND, MAC_IF_PROC_TYP.ACC_INPT_CFP2_SEND, MAC_IF_PROC_TYP.ACC_INPT_CFP3_SEND, 
					 MAC_IF_PROC_TYP.ACC_INPT_CFP4_SEND, MAC_IF_PROC_TYP.ACC_INPT_CFP5_SEND, MAC_IF_PROC_TYP.CFP_IO_SEND, MAC_IF_PROC_TYP.BI_CFP_BP_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_ITM_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_LOC_MST_SEND, 
					 MAC_IF_PROC_TYP.BI_CFP_OPER_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_USR_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_STR_LN_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_CUR_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_TERM_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_CALC_GRP_MST_SEND, 
					 MAC_IF_PROC_TYP.BI_CFP_DPT_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_SLS_MST1_SEND, MAC_IF_PROC_TYP.BI_CFP_SLS_MST2_SEND, MAC_IF_PROC_TYP.BI_CFP_SLS_MST3_SEND, MAC_IF_PROC_TYP.BI_CFP_SLS_MST4_SEND, MAC_IF_PROC_TYP.BI_CFP_SLS_MST5_SEND, 
					 MAC_IF_PROC_TYP.BI_CFP_EXPNS_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_AC_RSN_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_WG_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_ALC_AC_MST_SEND, MAC_IF_PROC_TYP.BI_CFP_DPT_CONFIG_SEND, MAC_IF_PROC_TYP.BI_CFP_EXPNS_CONFIG_SEND, 
					 MAC_IF_PROC_TYP.SAP_JOURNAL_SEND, MAC_IF_PROC_TYP.SAP_COST_CENTER, MAC_IF_PROC_TYP.PCM_IO_ACT_RCV, MAC_IF_PROC_TYP.PCM_ACT_WK_RCV, MAC_IF_PROC_TYP.PCM_ACT_INST_WIP_RCV, MAC_IF_PROC_TYP.PCM_ACT_STK_RCV
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
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
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
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
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
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
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
			if(MAC_IF_PROC_TYP.getKeys().contains(s)){
				 kl.put(s, row.getBoolean(s));
			}
		}
		MCList<MCRow> list = MCList.create(MCRow.class);
		for(Map.Entry<String, Boolean> e : kl.entrySet()){
			if(e.getValue()){
				MAC_IF_PROC_TYP me = MAC_IF_PROC_TYP.get(MAC_IF_PROC_TYP.value(e.getKey()));
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
	 * 引数row のカラム名が定数キー、値が「true」のカラムがない場合は{@link MAC_IF_PROC_TYP#list()}の結果を返します。
	 * @param row Rowコンテナ
	 * @return 新しいListインスタンス
	 */
	public static MCList<MCRow> list(MCRow row) {
		MCList<MCRow> list = MAC_IF_PROC_TYP.subList(row);
			if (list.isEmpty()) {
				list = MAC_IF_PROC_TYP.list();
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
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
			if(MAC_IF_PROC_TYP.isSameVals(me, cols, vals)){
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
			list = MAC_IF_PROC_TYP.subList(cols, vals);
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
		for (MAC_IF_PROC_TYP me : MAC_IF_PROC_TYP.array()) {
			boolean f = true;
			for(Comparable<?> v : vals){
				val[0] = v;
				if(MAC_IF_PROC_TYP.isSameVals(me, cols, val)){
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
	protected static boolean isSameVals(MAC_IF_PROC_TYP me, String[] cols, Comparable<?>[] vals){
		int i;
		if(cols.length <= vals.length){i = cols.length;}
		else{ i = vals.length;}
		boolean f = true;
		for(int j=0 ; j < i ; j++ ){
			String col = cols[j];
			Comparable<?> val = vals[j];
			if(!me.constR.contains(col)){throw new MCAppException("FCBBC0068", "MAC_IF_PROC_TYP", col);}
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
	protected boolean isSame(MAC_IF_PROC_TYP type) {
		return this == type;
	}

	/*
	 * 比較メソッドです。
	 */
	/**
	 * ＩＦ処理区分：発注情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が発注情報送信の値の場合true
	 */
	public static boolean isPO_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：発注情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が発注情報送信の値の場合true
	 */
	public static boolean isPO_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納期回答情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が納期回答情報受信の値の場合true
	 */
	public static boolean isPO_PRMS_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PO_PRMS_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納期回答情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が納期回答情報受信の値の場合true
	 */
	public static boolean isPO_PRMS_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PO_PRMS_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績情報受信の値の場合true
	 */
	public static boolean isSHIP_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績情報受信の値の場合true
	 */
	public static boolean isSHIP_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検収情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が検収情報送信の値の場合true
	 */
	public static boolean isACCPT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACCPT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検収情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が検収情報送信の値の場合true
	 */
	public static boolean isACCPT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACCPT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納入指示情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示情報送信の値の場合true
	 */
	public static boolean isDLV_INST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.DLV_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納入指示情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示情報送信の値の場合true
	 */
	public static boolean isDLV_INST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.DLV_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：請求情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が請求情報受信の値の場合true
	 */
	public static boolean isBILL_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BILL_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：請求情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が請求情報受信の値の場合true
	 */
	public static boolean isBILL_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BILL_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受注情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が受注情報受信の値の場合true
	 */
	public static boolean isSLO_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SLO_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受注情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が受注情報受信の値の場合true
	 */
	public static boolean isSLO_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SLO_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納期回答情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が納期回答情報送信の値の場合true
	 */
	public static boolean isSLO_PRMS_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SLO_PRMS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納期回答情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が納期回答情報送信の値の場合true
	 */
	public static boolean isSLO_PRMS_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SLO_PRMS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績情報送信の値の場合true
	 */
	public static boolean isSHIP_ACT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SHIP_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績情報送信の値の場合true
	 */
	public static boolean isSHIP_ACT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SHIP_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検収情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が検収情報受信の値の場合true
	 */
	public static boolean isACCPT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACCPT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検収情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が検収情報受信の値の場合true
	 */
	public static boolean isACCPT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACCPT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納入指示情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が納入指示情報受信の値の場合true
	 */
	public static boolean isDLV_INST_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.DLV_INST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：納入指示情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が納入指示情報受信の値の場合true
	 */
	public static boolean isDLV_INST_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.DLV_INST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：請求情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が請求情報送信の値の場合true
	 */
	public static boolean isBILL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BILL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：請求情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が請求情報送信の値の場合true
	 */
	public static boolean isBILL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BILL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ変更情報明細受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ変更情報明細受信の値の場合true
	 */
	public static boolean isPLM_CHNG_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_CHNG_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ変更情報明細受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ変更情報明細受信の値の場合true
	 */
	public static boolean isPLM_CHNG_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_CHNG_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目受信の値の場合true
	 */
	public static boolean isPLM_ITM_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目受信の値の場合true
	 */
	public static boolean isPLM_ITM_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（購買品）受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細（購買品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_PURC_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_D_PURC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（購買品）受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細（購買品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_PURC_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_D_PURC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（内製品）受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細（内製品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_PROD_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_D_PROD_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（内製品）受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細（内製品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_PROD_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_D_PROD_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（外注品）受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細（外注品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_SBCN_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_D_SBCN_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（外注品）受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細（外注品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_SBCN_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_D_SBCN_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（他工場手配品）受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細（他工場手配品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_RQST_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_D_RQST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細（他工場手配品）受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細（他工場手配品）受信の値の場合true
	 */
	public static boolean isPLM_ITM_D_RQST_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_D_RQST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目格納先受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目格納先受信の値の場合true
	 */
	public static boolean isPLM_ITM_STRG_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_STRG_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目格納先受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目格納先受信の値の場合true
	 */
	public static boolean isPLM_ITM_STRG_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_STRG_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭＢＯＭ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭＢＯＭ受信の値の場合true
	 */
	public static boolean isPLM_BOM_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_BOM_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭＢＯＭ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭＢＯＭ受信の値の場合true
	 */
	public static boolean isPLM_BOM_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_BOM_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目工程受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目工程受信の値の場合true
	 */
	public static boolean isPLM_ITM_OPER_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_OPER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目工程受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目工程受信の値の場合true
	 */
	public static boolean isPLM_ITM_OPER_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_OPER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工程受信の値の場合true
	 */
	public static boolean isPLM_OPER_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_OPER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工程受信の値の場合true
	 */
	public static boolean isPLM_OPER_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_OPER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目サムネイル受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目サムネイル受信の値の場合true
	 */
	public static boolean isPLM_ITM_TMB_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_TMB_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目サムネイル受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目サムネイル受信の値の場合true
	 */
	public static boolean isPLM_ITM_TMB_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_TMB_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目品管受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目品管受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目品管受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目品管受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数管理受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工数管理受信の値の場合true
	 */
	public static boolean isPLM_WK_COST_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_WK_COST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数管理受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工数管理受信の値の場合true
	 */
	public static boolean isPLM_WK_COST_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_WK_COST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程工数受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工程工数受信の値の場合true
	 */
	public static boolean isPLM_OPR_WK_CST_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_OPR_WK_CST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程工数受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工程工数受信の値の場合true
	 */
	public static boolean isPLM_OPR_WK_CST_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_OPR_WK_CST_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ場所マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ場所マスタ送信の値の場合true
	 */
	public static boolean isPLM_LOC_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_LOC_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ場所マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ場所マスタ送信の値の場合true
	 */
	public static boolean isPLM_LOC_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_LOC_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ取引先マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ取引先マスタ送信の値の場合true
	 */
	public static boolean isPLM_BP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_BP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ取引先マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ取引先マスタ送信の値の場合true
	 */
	public static boolean isPLM_BP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_BP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細マスタリードタイム送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細マスタリードタイム送信の値の場合true
	 */
	public static boolean isPLM_ITM_DTL_LT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_DTL_LT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細マスタリードタイム送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細マスタリードタイム送信の値の場合true
	 */
	public static boolean isPLM_ITM_DTL_LT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_DTL_LT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買単価マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ購買単価マスタ送信の値の場合true
	 */
	public static boolean isPLM_PURC_UPRI_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_PURC_UPRI_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買単価マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ購買単価マスタ送信の値の場合true
	 */
	public static boolean isPLM_PURC_UPRI_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_PURC_UPRI_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ計画実績数量送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ計画実績数量送信の値の場合true
	 */
	public static boolean isPLM_PA_QTY_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_PA_QTY_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ計画実績数量送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ計画実績数量送信の値の場合true
	 */
	public static boolean isPLM_PA_QTY_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_PA_QTY_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目禁止マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目禁止マスタ送信の値の場合true
	 */
	public static boolean isPLM_ITM_STOP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目禁止マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目禁止マスタ送信の値の場合true
	 */
	public static boolean isPLM_ITM_STOP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ製造原価送信の値の場合true
	 */
	public static boolean isPLM_MFG_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_MFG_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ製造原価送信の値の場合true
	 */
	public static boolean isPLM_MFG_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_MFG_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ購買原価送信の値の場合true
	 */
	public static boolean isPLM_PURC_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_PURC_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ購買原価送信の値の場合true
	 */
	public static boolean isPLM_PURC_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_PURC_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造標準原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ製造標準原価送信の値の場合true
	 */
	public static boolean isPLM_MFG_STD_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_MFG_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造標準原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ製造標準原価送信の値の場合true
	 */
	public static boolean isPLM_MFG_STD_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_MFG_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買標準原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ購買標準原価送信の値の場合true
	 */
	public static boolean isPLM_PURC_STD_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_PURC_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ購買標準原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ購買標準原価送信の値の場合true
	 */
	public static boolean isPLM_PURC_STD_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_PURC_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工数原価送信の値の場合true
	 */
	public static boolean isPLM_WK_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_WK_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工数原価送信の値の場合true
	 */
	public static boolean isPLM_WK_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_WK_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数標準原価送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工数標準原価送信の値の場合true
	 */
	public static boolean isPLM_WK_STD_COST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_WK_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数標準原価送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工数標準原価送信の値の場合true
	 */
	public static boolean isPLM_WK_STD_COST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_WK_STD_COST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造歩留送信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ製造歩留送信の値の場合true
	 */
	public static boolean isPLM_MFG_YIELD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_MFG_YIELD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ製造歩留送信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ製造歩留送信の値の場合true
	 */
	public static boolean isPLM_MFG_YIELD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_MFG_YIELD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ変更情報内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ変更情報内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_CHNG_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_CHNG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ変更情報内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ変更情報内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_CHNG_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_CHNG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目詳細内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_DTL_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_DTL_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目詳細内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目詳細内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_DTL_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_DTL_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭＢＯＭ内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭＢＯＭ内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_BOM_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_BOM_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭＢＯＭ内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭＢＯＭ内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_BOM_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_BOM_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目工程内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目工程内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_OPER_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_OPER_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目工程内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目工程内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_OPER_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_OPER_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工程内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_OPER_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_OPER_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工程内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_OPER_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_OPER_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目付加情報内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目付加情報内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ATTACH_INFO_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ATTACH_INFO_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目付加情報内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目付加情報内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ATTACH_INFO_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ATTACH_INFO_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目検査パタン内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目検査パタン内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_P_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_P_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目検査パタン内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目検査パタン内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_P_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_P_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ格納先内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ格納先内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_STRG_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_STRG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ格納先内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ格納先内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_STRG_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_STRG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目（ＷＧ）内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目（ＷＧ）内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_WG_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_WG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目（ＷＧ）内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目（ＷＧ）内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_WG_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_WG_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目補助内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目補助内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_SUB_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_SUB_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目補助内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目補助内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_SUB_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_SUB_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目単位内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目単位内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_UNIT_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_UNIT_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目単位内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目単位内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_UNIT_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_UNIT_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目手配不許可内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目手配不許可内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_NOT_FIX_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_NOT_FIX_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目手配不許可内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目手配不許可内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_NOT_FIX_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_NOT_FIX_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目品管内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ品目品管内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ品目品管内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ品目品管内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_ITM_INSP_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_ITM_INSP_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数管理内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工数管理内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_WK_COST_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_WK_COST_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工数管理内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工数管理内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_WK_COST_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_WK_COST_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程工数内部ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値がＰＬＭ工程工数内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_OPR_WK_CST_IN_IF_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PLM_OPR_WK_CST_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＰＬＭ工程工数内部ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値がＰＬＭ工程工数内部ＩＦ受信の値の場合true
	 */
	public static boolean isPLM_OPR_WK_CST_IN_IF_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PLM_OPR_WK_CST_IN_IF_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：勘定科目マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が勘定科目マスタ受信の値の場合true
	 */
	public static boolean isAC_ACCOUNT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_ACCOUNT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：勘定科目マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が勘定科目マスタ受信の値の場合true
	 */
	public static boolean isAC_ACCOUNT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_ACCOUNT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：補助勘定科目マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が補助勘定科目マスタ受信の値の場合true
	 */
	public static boolean isAC_SUB_ACCOUNT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_SUB_ACCOUNT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：補助勘定科目マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が補助勘定科目マスタ受信の値の場合true
	 */
	public static boolean isAC_SUB_ACCOUNT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_SUB_ACCOUNT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計部門マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が会計部門マスタ受信の値の場合true
	 */
	public static boolean isAC_AC_DPT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_AC_DPT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計部門マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が会計部門マスタ受信の値の場合true
	 */
	public static boolean isAC_AC_DPT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_AC_DPT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：銀行マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が銀行マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BANK_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：銀行マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が銀行マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BANK_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：銀行支店マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が銀行支店マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_BRANCH_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BANK_BRANCH_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：銀行支店マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が銀行支店マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_BRANCH_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BANK_BRANCH_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：口座マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が口座マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_AC_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BANK_AC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：口座マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が口座マスタ受信の値の場合true
	 */
	public static boolean isAC_BANK_AC_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BANK_AC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：為替レートマスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が為替レートマスタ受信の値の場合true
	 */
	public static boolean isAC_CUR_XRATE_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_CUR_XRATE_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：為替レートマスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が為替レートマスタ受信の値の場合true
	 */
	public static boolean isAC_CUR_XRATE_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_CUR_XRATE_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計税マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が会計税マスタ受信の値の場合true
	 */
	public static boolean isAC_AC_TAX_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_AC_TAX_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計税マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が会計税マスタ受信の値の場合true
	 */
	public static boolean isAC_AC_TAX_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_AC_TAX_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：口座科目設定マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が口座科目設定マスタ受信の値の場合true
	 */
	public static boolean isAC_BAC_AC_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BAC_AC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：口座科目設定マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が口座科目設定マスタ受信の値の場合true
	 */
	public static boolean isAC_BAC_AC_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BAC_AC_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＧＬ）送信かどうか
	 * @param value 定数値
	 * @return 定数値が仕訳情報（ＧＬ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_GL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_JOURNAL_GL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＧＬ）送信かどうか
	 * @param type 属性値
	 * @return 属性値が仕訳情報（ＧＬ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_GL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_JOURNAL_GL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＡＰ）送信かどうか
	 * @param value 定数値
	 * @return 定数値が仕訳情報（ＡＰ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_AP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_JOURNAL_AP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＡＰ）送信かどうか
	 * @param type 属性値
	 * @return 属性値が仕訳情報（ＡＰ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_AP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_JOURNAL_AP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＡＲ）送信かどうか
	 * @param value 定数値
	 * @return 定数値が仕訳情報（ＡＲ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_AR_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_JOURNAL_AR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕訳情報（ＡＲ）送信かどうか
	 * @param type 属性値
	 * @return 属性値が仕訳情報（ＡＲ）送信の値の場合true
	 */
	public static boolean isAC_JOURNAL_AR_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_JOURNAL_AR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：手形情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が手形情報送信の値の場合true
	 */
	public static boolean isAC_NOTE_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_NOTE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：手形情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が手形情報送信の値の場合true
	 */
	public static boolean isAC_NOTE_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_NOTE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（得意先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（得意先）送信の値の場合true
	 */
	public static boolean isAC_BP_CST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BP_CST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（得意先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（得意先）送信の値の場合true
	 */
	public static boolean isAC_BP_CST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BP_CST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（発注先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（発注先）送信の値の場合true
	 */
	public static boolean isAC_BP_SPPL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_BP_SPPL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（発注先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（発注先）送信の値の場合true
	 */
	public static boolean isAC_BP_SPPL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_BP_SPPL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：支払依頼送信かどうか
	 * @param value 定数値
	 * @return 定数値が支払依頼送信の値の場合true
	 */
	public static boolean isAC_SCHD_PAY_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_SCHD_PAY_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：支払依頼送信かどうか
	 * @param type 属性値
	 * @return 属性値が支払依頼送信の値の場合true
	 */
	public static boolean isAC_SCHD_PAY_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_SCHD_PAY_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：売上伝票送信かどうか
	 * @param value 定数値
	 * @return 定数値が売上伝票送信の値の場合true
	 */
	public static boolean isAC_SLS_SLIP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_SLS_SLIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：売上伝票送信かどうか
	 * @param type 属性値
	 * @return 属性値が売上伝票送信の値の場合true
	 */
	public static boolean isAC_SLS_SLIP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_SLS_SLIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕入伝票送信かどうか
	 * @param value 定数値
	 * @return 定数値が仕入伝票送信の値の場合true
	 */
	public static boolean isAC_PURC_SLIP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_PURC_SLIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：仕入伝票送信かどうか
	 * @param type 属性値
	 * @return 属性値が仕入伝票送信の値の場合true
	 */
	public static boolean isAC_PURC_SLIP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_PURC_SLIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦費用計画ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用計画ＩＦ受信の値の場合true
	 */
	public static boolean isAC_PLN_ALC_AMT_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_PLN_ALC_AMT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦費用計画ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用計画ＩＦ受信の値の場合true
	 */
	public static boolean isAC_PLN_ALC_AMT_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_PLN_ALC_AMT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦費用実績ＩＦ受信かどうか
	 * @param value 定数値
	 * @return 定数値が配賦費用実績ＩＦ受信の値の場合true
	 */
	public static boolean isAC_ACT_ALC_AMT_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.AC_ACT_ALC_AMT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦費用実績ＩＦ受信かどうか
	 * @param type 属性値
	 * @return 属性値が配賦費用実績ＩＦ受信の値の場合true
	 */
	public static boolean isAC_ACT_ALC_AMT_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.AC_ACT_ALC_AMT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＣＭ実績受信かどうか
	 * @param value 定数値
	 * @return 定数値がＳＣＭ実績受信の値の場合true
	 */
	public static boolean isSCM_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SCM_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＣＭ実績受信かどうか
	 * @param type 属性値
	 * @return 属性値がＳＣＭ実績受信の値の場合true
	 */
	public static boolean isSCM_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SCM_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷指図送信の値の場合true
	 */
	public static boolean isWMS_SHIP_INST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷指図送信の値の場合true
	 */
	public static boolean isWMS_SHIP_INST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_SHIP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷実績受信の値の場合true
	 */
	public static boolean isWMS_SHIP_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷実績受信の値の場合true
	 */
	public static boolean isWMS_SHIP_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_SHIP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が入荷予定送信の値の場合true
	 */
	public static boolean isWMS_ARR_SCHD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が入荷予定送信の値の場合true
	 */
	public static boolean isWMS_ARR_SCHD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_ARR_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が入荷実績受信の値の場合true
	 */
	public static boolean isWMS_ARR_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が入荷実績受信の値の場合true
	 */
	public static boolean isWMS_ARR_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_ARR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：移動指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が移動指図送信の値の場合true
	 */
	public static boolean isWMS_XFR_INST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：移動指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が移動指図送信の値の場合true
	 */
	public static boolean isWMS_XFR_INST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_XFR_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：移動実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が移動実績受信の値の場合true
	 */
	public static boolean isWMS_XFR_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：移動実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が移動実績受信の値の場合true
	 */
	public static boolean isWMS_XFR_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_XFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：他勘定振替実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が他勘定振替実績受信の値の場合true
	 */
	public static boolean isWMS_ACXFR_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.WMS_ACXFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：他勘定振替実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が他勘定振替実績受信の値の場合true
	 */
	public static boolean isWMS_ACXFR_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.WMS_ACXFR_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出来高予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が出来高予定送信の値の場合true
	 */
	public static boolean isMES_YIELD_SCHD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出来高予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が出来高予定送信の値の場合true
	 */
	public static boolean isMES_YIELD_SCHD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_YIELD_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出来高実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が出来高実績受信の値の場合true
	 */
	public static boolean isMES_YIELD_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出来高実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が出来高実績受信の値の場合true
	 */
	public static boolean isMES_YIELD_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_YIELD_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程指図送信の値の場合true
	 */
	public static boolean isMES_OPER_INST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_OPER_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程指図送信の値の場合true
	 */
	public static boolean isMES_OPER_INST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_OPER_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が工程実績受信の値の場合true
	 */
	public static boolean isMES_OPER_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が工程実績受信の値の場合true
	 */
	public static boolean isMES_OPER_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_OPER_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：投入予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が投入予定送信の値の場合true
	 */
	public static boolean isMES_INPT_SCHD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：投入予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が投入予定送信の値の場合true
	 */
	public static boolean isMES_INPT_SCHD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_INPT_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：投入実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が投入実績受信の値の場合true
	 */
	public static boolean isMES_INPT_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：投入実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が投入実績受信の値の場合true
	 */
	public static boolean isMES_INPT_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_INPT_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工数実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が工数実績受信の値の場合true
	 */
	public static boolean isMES_WK_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_WK_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工数実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が工数実績受信の値の場合true
	 */
	public static boolean isMES_WK_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_WK_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工数予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が工数予定送信の値の場合true
	 */
	public static boolean isMES_WK_SCHD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工数予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が工数予定送信の値の場合true
	 */
	public static boolean isMES_WK_SCHD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_WK_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ受信かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ受信の値の場合true
	 */
	public static boolean isMES_ORDER_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ受信かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ受信の値の場合true
	 */
	public static boolean isMES_ORDER_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信の値の場合true
	 */
	public static boolean isMES_ORDER_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信の値の場合true
	 */
	public static boolean isMES_ORDER_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目工程マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目工程マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_OPER(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_OPER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目工程マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目工程マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_OPER(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_OPER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目詳細マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目詳細マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用BOMマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用BOMマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_BOM(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_BOM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用BOMマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用BOMマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_BOM(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_BOM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用場所マスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用場所マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_LOC(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_LOC.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用場所マスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用場所マスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_LOC(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_LOC.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用カレンダマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_CAL(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用カレンダマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_CAL(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用臨時カレンダマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用臨時カレンダマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_CAL_EXT(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL_EXT.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用臨時カレンダマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用臨時カレンダマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_CAL_EXT(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_CAL_EXT.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用在庫情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用在庫情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_STK(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_STK.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用在庫情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用在庫情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_STK(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_STK.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用入庫予定情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用入庫予定情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_GR_SCHD(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_GR_SCHD.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用入庫予定情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用入庫予定情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_GR_SCHD(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_GR_SCHD.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用出庫予定情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用出庫予定情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_GI_SCHD(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_GI_SCHD.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用出庫予定情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用出庫予定情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_GI_SCHD(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_GI_SCHD.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用日次需要情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用日次需要情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_DLY_DMND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_DLY_DMND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用日次需要情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用日次需要情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_DLY_DMND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_DLY_DMND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目詳細ＢＯＭマスタかどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用品目詳細ＢＯＭマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL_BOM(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL_BOM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用品目詳細ＢＯＭマスタかどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用品目詳細ＢＯＭマスタの値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ITM_DTL_BOM(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ITM_DTL_BOM.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用オーダ引当情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用オーダ引当情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ORD_LNK(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ORD_LNK.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用オーダ引当情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用オーダ引当情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ORD_LNK(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ORD_LNK.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用工程指図実績情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用工程指図実績情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_OPER(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_OPER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用工程指図実績情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用工程指図実績情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_OPER(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_OPER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用実績数量情報かどうか
	 * @param value 定数値
	 * @return 定数値がオーダ送信用実績数量情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ACT_QTY(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ACT_QTY.isSame(type);
	}

	/**
	 * ＩＦ処理区分：オーダ送信用実績数量情報かどうか
	 * @param type 属性値
	 * @return 属性値がオーダ送信用実績数量情報の値の場合true
	 */
	public static boolean isMES_ORDER_SEND_ACT_QTY(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_ORDER_SEND_ACT_QTY.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査指図送信かどうか
	 * @param value 定数値
	 * @return 定数値が検査指図送信の値の場合true
	 */
	public static boolean isMES_INSP_INST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_INSP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査指図送信かどうか
	 * @param type 属性値
	 * @return 属性値が検査指図送信の値の場合true
	 */
	public static boolean isMES_INSP_INST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_INSP_INST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が検査実績受信の値の場合true
	 */
	public static boolean isMES_INSP_ACT_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が検査実績受信の値の場合true
	 */
	public static boolean isMES_INSP_ACT_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MES_INSP_ACT_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（得意先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（得意先）送信の値の場合true
	 */
	public static boolean isEXT_BP_CST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_CST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（得意先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（得意先）送信の値の場合true
	 */
	public static boolean isEXT_BP_CST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_CST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（納品先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（納品先）送信の値の場合true
	 */
	public static boolean isEXT_BP_DLV_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_DLV_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（納品先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（納品先）送信の値の場合true
	 */
	public static boolean isEXT_BP_DLV_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_DLV_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（仕向先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（仕向先）送信の値の場合true
	 */
	public static boolean isEXT_BP_DEST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_DEST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（仕向先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（仕向先）送信の値の場合true
	 */
	public static boolean isEXT_BP_DEST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_DEST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（発注先）送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ（発注先）送信の値の場合true
	 */
	public static boolean isEXT_BP_SPPL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_SPPL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ（発注先）送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ（発注先）送信の値の場合true
	 */
	public static boolean isEXT_BP_SPPL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_SPPL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（製品）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（製品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_PROD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_PROD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（製品）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（製品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_PROD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_PROD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（その他）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（その他）送信の値の場合true
	 */
	public static boolean isEXT_ITM_OTHER_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_OTHER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（その他）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（その他）送信の値の場合true
	 */
	public static boolean isEXT_ITM_OTHER_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_OTHER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（商品）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（商品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_GOODS_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_GOODS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（商品）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（商品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_GOODS_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_GOODS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（中間品）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（中間品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_WIP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_WIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（中間品）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（中間品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_WIP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_WIP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（部品）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（部品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_PARTS_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_PARTS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（部品）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（部品）送信の値の場合true
	 */
	public static boolean isEXT_ITM_PARTS_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_PARTS_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（資材）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（資材）送信の値の場合true
	 */
	public static boolean isEXT_ITM_MATE_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_MATE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（資材）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（資材）送信の値の場合true
	 */
	public static boolean isEXT_ITM_MATE_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_MATE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（原料）送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ（原料）送信の値の場合true
	 */
	public static boolean isEXT_ITM_RAWMATE_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_RAWMATE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ（原料）送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ（原料）送信の値の場合true
	 */
	public static boolean isEXT_ITM_RAWMATE_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_RAWMATE_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先禁止マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先禁止マスタ送信の値の場合true
	 */
	public static boolean isEXT_BP_STOP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先禁止マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先禁止マスタ送信の値の場合true
	 */
	public static boolean isEXT_BP_STOP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目禁止マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目禁止マスタ送信の値の場合true
	 */
	public static boolean isEXT_ITM_STOP_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_ITM_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目禁止マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目禁止マスタ送信の値の場合true
	 */
	public static boolean isEXT_ITM_STOP_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_ITM_STOP_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：輸出規制マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が輸出規制マスタ送信の値の場合true
	 */
	public static boolean isEXT_EX_CTRL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_EX_CTRL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：輸出規制マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が輸出規制マスタ送信の値の場合true
	 */
	public static boolean isEXT_EX_CTRL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_EX_CTRL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：購買単価マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が購買単価マスタ受信の値の場合true
	 */
	public static boolean isEXT_PURC_UPRI_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_PURC_UPRI_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：購買単価マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が購買単価マスタ受信の値の場合true
	 */
	public static boolean isEXT_PURC_UPRI_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_PURC_UPRI_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：加工単価マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が加工単価マスタ受信の値の場合true
	 */
	public static boolean isEXT_PROC_UPRI_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_PROC_UPRI_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：加工単価マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が加工単価マスタ受信の値の場合true
	 */
	public static boolean isEXT_PROC_UPRI_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_PROC_UPRI_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ受信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ受信の値の場合true
	 */
	public static boolean isEXT_BP_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.EXT_BP_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ受信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ受信の値の場合true
	 */
	public static boolean isEXT_BP_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.EXT_BP_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入金情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が入金情報受信の値の場合true
	 */
	public static boolean isRCV_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.RCV_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入金情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が入金情報受信の値の場合true
	 */
	public static boolean isRCV_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.RCV_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：発注受信かどうか
	 * @param value 定数値
	 * @return 定数値が発注受信の値の場合true
	 */
	public static boolean isPO_RECV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PO_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：発注受信かどうか
	 * @param type 属性値
	 * @return 属性値が発注受信の値の場合true
	 */
	public static boolean isPO_RECV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PO_RECV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果１送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価計算結果１送信の値の場合true
	 */
	public static boolean isACC_COST1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_COST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果１送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価計算結果１送信の値の場合true
	 */
	public static boolean isACC_COST1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_COST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果２送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価計算結果２送信の値の場合true
	 */
	public static boolean isACC_COST2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_COST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果２送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価計算結果２送信の値の場合true
	 */
	public static boolean isACC_COST2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_COST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果３送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価計算結果３送信の値の場合true
	 */
	public static boolean isACC_COST3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_COST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果３送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価計算結果３送信の値の場合true
	 */
	public static boolean isACC_COST3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_COST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果４送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価計算結果４送信の値の場合true
	 */
	public static boolean isACC_COST4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_COST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果４送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価計算結果４送信の値の場合true
	 */
	public static boolean isACC_COST4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_COST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果５送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価計算結果５送信の値の場合true
	 */
	public static boolean isACC_COST5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_COST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価計算結果５送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価計算結果５送信の値の場合true
	 */
	public static boolean isACC_COST5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_COST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果１送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程原価計算結果１送信の値の場合true
	 */
	public static boolean isACC_OPER_COST1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_COST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果１送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程原価計算結果１送信の値の場合true
	 */
	public static boolean isACC_OPER_COST1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_COST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果２送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程原価計算結果２送信の値の場合true
	 */
	public static boolean isACC_OPER_COST2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_COST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果２送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程原価計算結果２送信の値の場合true
	 */
	public static boolean isACC_OPER_COST2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_COST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果３送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程原価計算結果３送信の値の場合true
	 */
	public static boolean isACC_OPER_COST3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_COST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果３送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程原価計算結果３送信の値の場合true
	 */
	public static boolean isACC_OPER_COST3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_COST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果４送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程原価計算結果４送信の値の場合true
	 */
	public static boolean isACC_OPER_COST4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_COST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果４送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程原価計算結果４送信の値の場合true
	 */
	public static boolean isACC_OPER_COST4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_COST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果５送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程原価計算結果５送信の値の場合true
	 */
	public static boolean isACC_OPER_COST5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_COST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程原価計算結果５送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程原価計算結果５送信の値の場合true
	 */
	public static boolean isACC_OPER_COST5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_COST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価受払表送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価受払表送信の値の場合true
	 */
	public static boolean isIO_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.IO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価受払表送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価受払表送信の値の場合true
	 */
	public static boolean isIO_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.IO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：月末在庫送信かどうか
	 * @param value 定数値
	 * @return 定数値が月末在庫送信の値の場合true
	 */
	public static boolean isMLY_STK_DTL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.MLY_STK_DTL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：月末在庫送信かどうか
	 * @param type 属性値
	 * @return 属性値が月末在庫送信の値の場合true
	 */
	public static boolean isMLY_STK_DTL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.MLY_STK_DTL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受払実績送信かどうか
	 * @param value 定数値
	 * @return 定数値が受払実績送信の値の場合true
	 */
	public static boolean isIO_ACT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.IO_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受払実績送信かどうか
	 * @param type 属性値
	 * @return 属性値が受払実績送信の値の場合true
	 */
	public static boolean isIO_ACT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.IO_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受払予定送信かどうか
	 * @param value 定数値
	 * @return 定数値が受払予定送信の値の場合true
	 */
	public static boolean isIO_SCHD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.IO_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：受払予定送信かどうか
	 * @param type 属性値
	 * @return 属性値が受払予定送信の値の場合true
	 */
	public static boolean isIO_SCHD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.IO_SCHD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目オーダ情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目オーダ情報送信の値の場合true
	 */
	public static boolean isITM_ORDER_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ITM_ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目オーダ情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目オーダ情報送信の値の場合true
	 */
	public static boolean isITM_ORDER_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ITM_ORDER_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷進捗送信かどうか
	 * @param value 定数値
	 * @return 定数値が出荷進捗送信の値の場合true
	 */
	public static boolean isSHIP_PR_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SHIP_PR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：出荷進捗送信かどうか
	 * @param type 属性値
	 * @return 属性値が出荷進捗送信の値の場合true
	 */
	public static boolean isSHIP_PR_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SHIP_PR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：滞留在庫情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が滞留在庫情報送信の値の場合true
	 */
	public static boolean isNON_MOV_STK_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.NON_MOV_STK_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：滞留在庫情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が滞留在庫情報送信の値の場合true
	 */
	public static boolean isNON_MOV_STK_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.NON_MOV_STK_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷進捗送信かどうか
	 * @param value 定数値
	 * @return 定数値が入荷進捗送信の値の場合true
	 */
	public static boolean isARR_PR_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ARR_PR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：入荷進捗送信かどうか
	 * @param type 属性値
	 * @return 属性値が入荷進捗送信の値の場合true
	 */
	public static boolean isARR_PR_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ARR_PR_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査実績送信かどうか
	 * @param value 定数値
	 * @return 定数値が検査実績送信の値の場合true
	 */
	public static boolean isINSP_ACT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.INSP_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：検査実績送信かどうか
	 * @param type 属性値
	 * @return 属性値が検査実績送信の値の場合true
	 */
	public static boolean isINSP_ACT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.INSP_ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が取引先マスタ送信の値の場合true
	 */
	public static boolean isBI_BP_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_BP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：取引先マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が取引先マスタ送信の値の場合true
	 */
	public static boolean isBI_BP_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_BP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が品目マスタ送信の値の場合true
	 */
	public static boolean isBI_ITM_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_ITM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：品目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が品目マスタ送信の値の場合true
	 */
	public static boolean isBI_ITM_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_ITM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：場所マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が場所マスタ送信の値の場合true
	 */
	public static boolean isBI_LOC_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_LOC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：場所マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が場所マスタ送信の値の場合true
	 */
	public static boolean isBI_LOC_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_LOC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：部門マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が部門マスタ送信の値の場合true
	 */
	public static boolean isBI_DPT_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：部門マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が部門マスタ送信の値の場合true
	 */
	public static boolean isBI_DPT_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程マスタ送信の値の場合true
	 */
	public static boolean isBI_OPER_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_OPER_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程マスタ送信の値の場合true
	 */
	public static boolean isBI_OPER_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_OPER_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：担当者マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が担当者マスタ送信の値の場合true
	 */
	public static boolean isBI_USR_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_USR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：担当者マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が担当者マスタ送信の値の場合true
	 */
	public static boolean isBI_USR_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_USR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：業務理由マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が業務理由マスタ送信の値の場合true
	 */
	public static boolean isBI_BIZ_RSN_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_BIZ_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：業務理由マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が業務理由マスタ送信の値の場合true
	 */
	public static boolean isBI_BIZ_RSN_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_BIZ_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：棚・ラインマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が棚・ラインマスタ送信の値の場合true
	 */
	public static boolean isBI_STR_LN_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_STR_LN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：棚・ラインマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が棚・ラインマスタ送信の値の場合true
	 */
	public static boolean isBI_STR_LN_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_STR_LN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：通貨マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が通貨マスタ送信の値の場合true
	 */
	public static boolean isBI_CUR_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CUR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：通貨マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が通貨マスタ送信の値の場合true
	 */
	public static boolean isBI_CUR_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CUR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：対象期間マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が対象期間マスタ送信の値の場合true
	 */
	public static boolean isBI_TERM_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_TERM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：対象期間マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が対象期間マスタ送信の値の場合true
	 */
	public static boolean isBI_TERM_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_TERM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：計算グループマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が計算グループマスタ送信の値の場合true
	 */
	public static boolean isBI_CALC_GRP_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CALC_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：計算グループマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が計算グループマスタ送信の値の場合true
	 */
	public static boolean isBI_CALC_GRP_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CALC_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価部門マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価部門マスタ送信の値の場合true
	 */
	public static boolean isBI_COST_DPT_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価部門マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価部門マスタ送信の値の場合true
	 */
	public static boolean isBI_COST_DPT_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ１送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタ１送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ１送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタ１送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ２送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタ２送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ２送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタ２送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ３送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタ３送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ３送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタ３送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ４送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタ４送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ４送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタ４送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ５送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価売上分類マスタ５送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価売上分類マスタ５送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価売上分類マスタ５送信の値の場合true
	 */
	public static boolean isBI_COST_SLS_MST5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_COST_SLS_MST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価費目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価費目マスタ送信の値の場合true
	 */
	public static boolean isBI_EXPNS_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_EXPNS_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価費目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価費目マスタ送信の値の場合true
	 */
	public static boolean isBI_EXPNS_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_EXPNS_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計理由マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が会計理由マスタ送信の値の場合true
	 */
	public static boolean isBI_AC_RSN_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_AC_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：会計理由マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が会計理由マスタ送信の値の場合true
	 */
	public static boolean isBI_AC_RSN_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_AC_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ワーキンググループマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がワーキンググループマスタ送信の値の場合true
	 */
	public static boolean isBI_WG_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_WG_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ワーキンググループマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がワーキンググループマスタ送信の値の場合true
	 */
	public static boolean isBI_WG_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_WG_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：単位マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が単位マスタ送信の値の場合true
	 */
	public static boolean isBI_UNIT_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_UNIT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：単位マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が単位マスタ送信の値の場合true
	 */
	public static boolean isBI_UNIT_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_UNIT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：税マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が税マスタ送信の値の場合true
	 */
	public static boolean isBI_TAX_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_TAX_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：税マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が税マスタ送信の値の場合true
	 */
	public static boolean isBI_TAX_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_TAX_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：物流グループマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が物流グループマスタ送信の値の場合true
	 */
	public static boolean isBI_LG_GRP_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_LG_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：物流グループマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が物流グループマスタ送信の値の場合true
	 */
	public static boolean isBI_LG_GRP_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_LG_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価実績送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価実績送信の値の場合true
	 */
	public static boolean isACT_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価実績送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価実績送信の値の場合true
	 */
	public static boolean isACT_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACT_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価実績固定費送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価実績固定費送信の値の場合true
	 */
	public static boolean isACT_FXD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACT_FXD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価実績固定費送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価実績固定費送信の値の場合true
	 */
	public static boolean isACT_FXD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACT_FXD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：売上予算シミュレーション情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が売上予算シミュレーション情報送信の値の場合true
	 */
	public static boolean isSIM_BDG_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SIM_BDG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：売上予算シミュレーション情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が売上予算シミュレーション情報送信の値の場合true
	 */
	public static boolean isSIM_BDG_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SIM_BDG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：固定費シミュレーション情報送信かどうか
	 * @param value 定数値
	 * @return 定数値が固定費シミュレーション情報送信の値の場合true
	 */
	public static boolean isSIM_FXD_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SIM_FXD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：固定費シミュレーション情報送信かどうか
	 * @param type 属性値
	 * @return 属性値が固定費シミュレーション情報送信の値の場合true
	 */
	public static boolean isSIM_FXD_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SIM_FXD_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦科目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が配賦科目マスタ送信の値の場合true
	 */
	public static boolean isBI_ALC_AC_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_ALC_AC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配賦科目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が配賦科目マスタ送信の値の場合true
	 */
	public static boolean isBI_ALC_AC_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_ALC_AC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価部門構成マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が原価部門構成マスタ送信の値の場合true
	 */
	public static boolean isBI_DPT_CONFIG_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_DPT_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価部門構成マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が原価部門構成マスタ送信の値の場合true
	 */
	public static boolean isBI_DPT_CONFIG_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_DPT_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：予算シナリオ送信かどうか
	 * @param value 定数値
	 * @return 定数値が予算シナリオ送信の値の場合true
	 */
	public static boolean isBI_BDG_SCENARIO_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_BDG_SCENARIO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：予算シナリオ送信かどうか
	 * @param type 属性値
	 * @return 属性値が予算シナリオ送信の値の場合true
	 */
	public static boolean isBI_BDG_SCENARIO_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_BDG_SCENARIO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果１送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算結果１送信の値の場合true
	 */
	public static boolean isACC_CFP1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果１送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算結果１送信の値の場合true
	 */
	public static boolean isACC_CFP1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果２送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算結果２送信の値の場合true
	 */
	public static boolean isACC_CFP2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果２送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算結果２送信の値の場合true
	 */
	public static boolean isACC_CFP2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果３送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算結果３送信の値の場合true
	 */
	public static boolean isACC_CFP3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果３送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算結果３送信の値の場合true
	 */
	public static boolean isACC_CFP3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果４送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算結果４送信の値の場合true
	 */
	public static boolean isACC_CFP4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果４送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算結果４送信の値の場合true
	 */
	public static boolean isACC_CFP4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果５送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算結果５送信の値の場合true
	 */
	public static boolean isACC_CFP5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算結果５送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算結果５送信の値の場合true
	 */
	public static boolean isACC_CFP5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果１送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程ＣＦＰ計算結果１送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果１送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程ＣＦＰ計算結果１送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果２送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程ＣＦＰ計算結果２送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果２送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程ＣＦＰ計算結果２送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果３送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程ＣＦＰ計算結果３送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果３送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程ＣＦＰ計算結果３送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果４送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程ＣＦＰ計算結果４送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果４送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程ＣＦＰ計算結果４送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果５送信かどうか
	 * @param value 定数値
	 * @return 定数値が工程ＣＦＰ計算結果５送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_OPER_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：工程ＣＦＰ計算結果５送信かどうか
	 * @param type 属性値
	 * @return 属性値が工程ＣＦＰ計算結果５送信の値の場合true
	 */
	public static boolean isACC_OPER_CFP5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_OPER_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳１送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ内訳１送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_INPT_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳１送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ内訳１送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_INPT_CFP1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳２送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ内訳２送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_INPT_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳２送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ内訳２送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_INPT_CFP2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳３送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ内訳３送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_INPT_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳３送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ内訳３送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_INPT_CFP3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳４送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ内訳４送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_INPT_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳４送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ内訳４送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_INPT_CFP4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳５送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ内訳５送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.ACC_INPT_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ内訳５送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ内訳５送信の値の場合true
	 */
	public static boolean isACC_INPT_CFP5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.ACC_INPT_CFP5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ受払表送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ受払表送信の値の場合true
	 */
	public static boolean isCFP_IO_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.CFP_IO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ受払表送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ受払表送信の値の場合true
	 */
	public static boolean isCFP_IO_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.CFP_IO_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ取引先マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ取引先マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_BP_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_BP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ取引先マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ取引先マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_BP_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_BP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ品目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ品目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_ITM_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_ITM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ品目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ品目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_ITM_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_ITM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ場所マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ場所マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_LOC_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_LOC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ場所マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ場所マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_LOC_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_LOC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ工程マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ工程マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_OPER_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_OPER_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ工程マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ工程マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_OPER_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_OPER_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ担当者マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ担当者マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_USR_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_USR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ担当者マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ担当者マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_USR_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_USR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ棚・ラインマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ棚・ラインマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_STR_LN_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_STR_LN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ棚・ラインマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ棚・ラインマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_STR_LN_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_STR_LN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：環境単位マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が環境単位マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_CUR_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_CUR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：環境単位マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が環境単位マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_CUR_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_CUR_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ対象期間マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ対象期間マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_TERM_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_TERM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ対象期間マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ対象期間マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_TERM_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_TERM_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算グループマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ計算グループマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_CALC_GRP_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_CALC_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ計算グループマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ計算グループマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_CALC_GRP_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_CALC_GRP_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ部門マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ部門マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_DPT_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ部門マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ部門マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_DPT_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_DPT_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ１送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ売上分類マスタ１送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST1_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ１送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ売上分類マスタ１送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST1_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST1_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ２送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ売上分類マスタ２送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST2_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ２送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ売上分類マスタ２送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST2_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST2_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ３送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ売上分類マスタ３送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST3_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ３送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ売上分類マスタ３送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST3_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST3_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ４送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ売上分類マスタ４送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST4_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ４送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ売上分類マスタ４送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST4_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST4_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ５送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ売上分類マスタ５送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST5_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ売上分類マスタ５送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ売上分類マスタ５送信の値の場合true
	 */
	public static boolean isBI_CFP_SLS_MST5_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_SLS_MST5_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ入出力項目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ入出力項目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_EXPNS_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_EXPNS_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ入出力項目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ入出力項目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_EXPNS_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_EXPNS_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ会計理由マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ会計理由マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_AC_RSN_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_AC_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ会計理由マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ会計理由マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_AC_RSN_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_AC_RSN_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰワーキンググループマスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰワーキンググループマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_WG_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_WG_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰワーキンググループマスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰワーキンググループマスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_WG_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_WG_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配分科目マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値が配分科目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_ALC_AC_MST_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_ALC_AC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：配分科目マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値が配分科目マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_ALC_AC_MST_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_ALC_AC_MST_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ部門構成マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ部門構成マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_DPT_CONFIG_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_DPT_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ部門構成マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ部門構成マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_DPT_CONFIG_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_DPT_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ入出力項目表示構成マスタ送信かどうか
	 * @param value 定数値
	 * @return 定数値がＣＦＰ入出力項目表示構成マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_EXPNS_CONFIG_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.BI_CFP_EXPNS_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＣＦＰ入出力項目表示構成マスタ送信かどうか
	 * @param type 属性値
	 * @return 属性値がＣＦＰ入出力項目表示構成マスタ送信の値の場合true
	 */
	public static boolean isBI_CFP_EXPNS_CONFIG_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.BI_CFP_EXPNS_CONFIG_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＡＰ仕訳送信かどうか
	 * @param value 定数値
	 * @return 定数値がＳＡＰ仕訳送信の値の場合true
	 */
	public static boolean isSAP_JOURNAL_SEND(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SAP_JOURNAL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＡＰ仕訳送信かどうか
	 * @param type 属性値
	 * @return 属性値がＳＡＰ仕訳送信の値の場合true
	 */
	public static boolean isSAP_JOURNAL_SEND(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SAP_JOURNAL_SEND.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＡＰ原価センタマスタ取得かどうか
	 * @param value 定数値
	 * @return 定数値がＳＡＰ原価センタマスタ取得の値の場合true
	 */
	public static boolean isSAP_COST_CENTER(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.SAP_COST_CENTER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：ＳＡＰ原価センタマスタ取得かどうか
	 * @param type 属性値
	 * @return 属性値がＳＡＰ原価センタマスタ取得の値の場合true
	 */
	public static boolean isSAP_COST_CENTER(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.SAP_COST_CENTER.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価受払実績受信かどうか
	 * @param value 定数値
	 * @return 定数値が原価受払実績受信の値の場合true
	 */
	public static boolean isPCM_IO_ACT_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PCM_IO_ACT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価受払実績受信かどうか
	 * @param type 属性値
	 * @return 属性値が原価受払実績受信の値の場合true
	 */
	public static boolean isPCM_IO_ACT_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PCM_IO_ACT_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価工数情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が原価工数情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_WK_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PCM_ACT_WK_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価工数情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が原価工数情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_WK_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PCM_ACT_WK_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価仕掛情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が原価仕掛情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_INST_WIP_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PCM_ACT_INST_WIP_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価仕掛情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が原価仕掛情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_INST_WIP_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PCM_ACT_INST_WIP_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価在庫情報受信かどうか
	 * @param value 定数値
	 * @return 定数値が原価在庫情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_STK_RCV(String value) {
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
		return MAC_IF_PROC_TYP.PCM_ACT_STK_RCV.isSame(type);
	}

	/**
	 * ＩＦ処理区分：原価在庫情報受信かどうか
	 * @param type 属性値
	 * @return 属性値が原価在庫情報受信の値の場合true
	 */
	public static boolean isPCM_ACT_STK_RCV(MAC_IF_PROC_TYP type) {
		return MAC_IF_PROC_TYP.PCM_ACT_STK_RCV.isSame(type);
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
			MAC_IF_PROC_TYP.putName(r, valueColumn, nameColumn);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.get(value);
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
			MAC_IF_PROC_TYP.putNameNE(r, valueColumn, nameColumn);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
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
			MAC_IF_PROC_TYP.putName(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.get(value);
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
			MAC_IF_PROC_TYP.putNameNE(r, valueColumn, nameColumn, lcl);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
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
			MAC_IF_PROC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.get(value);
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
			MAC_IF_PROC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
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
			MAC_IF_PROC_TYP.putName(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.get(value);
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
			MAC_IF_PROC_TYP.putNameNE(r, valueColumn, nameColumn, rmrksColumn, lcl);
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
		MAC_IF_PROC_TYP type = MAC_IF_PROC_TYP.getNE(value);
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
