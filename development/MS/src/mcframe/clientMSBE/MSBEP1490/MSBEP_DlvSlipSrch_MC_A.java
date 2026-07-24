package mcframe.clientMSBE.MSBEP1490;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import mcframe.clientCore.beans.*;
import mcframe.clientCore.beans.action.*;
import mcframe.clientCore.beans.combobox.*;
import mcframe.clientCore.beans.text.*;
import mcframe.clientCore.beans.list.*;
import mcframe.clientCore.event.*;
import mcframe.commonCore.container.*;
import mcframe.commonCore.lang.*;
import mcframe.commonCore.param.*;
import mcframe.commonCore.notice.*;
import mcframe.commonCore.util.MCCollectionUtil;
import mcframe.commonCore.meta.MCMeta;
import mcframe.clientCore.beans.table.*;
import mcframe.clientCore.beans.tree.*;
import mcframe.clientCore.beans.popup.MCTextPopupMenuItem;
import mcframe.clientCore.beans.text.MCInputMethodType;
import mcframe.clientMSBE.MSBEP1490.MSBEP_DlvSlipSrch_MC.MS_MSBEL1490_Srch01Caller;

/**
 * 画面"MSBEP_DlvSlipSrch"パネルクラスです。<p>
 *
 * 納品伝票、購買納品伝票を照会します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_DlvSlipSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MS";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MSBE";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBEP1490";

	/** モジュールIDを取得します。 */
	public String getModuleID(){ return MODULE_ID; }
	/** サブモジュールIDを取得します。 */
	public String getSubmoduleID(){ return SUBMODULE_ID; }
	/** 画面IDを取得します。 */
	public String getScreenID(){ return SCREEN_ID; }
	// [ScreenOpe]ブロック関連のField定義
	public MCPanel ScreenOpePanel = null;
	public MCTitledBorder ScreenOpeTitledBorder = null;
	// [ScreenOpe]ブロックの項目のField定義
	// [Top]ブロック関連のField定義
	public MCPanel TopPanel = null;
	// [Top]ブロックの項目のField定義
	// [Fold]ブロック関連のField定義
	public MCPanel FoldPanel = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * DLV_SLIP,View shipping delivery slip,1;PURC_DLV_SLIP,View purchase delivery slip,2 DLV_SLIP,出荷納品伝票参照,1;PURC_DLV_SLIP,購買納品伝票参照,2.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_DLV_SLIP = null;
	public MCRadioButton Cnd_ope_PURC_DLV_SLIP = null;
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_ship_dt_p_PPanel;
	public MCDateField Cnd_ship_dt_fr;	// [Cnd]の[ship_dt_p.ymd_fr]を[Cnd_ship_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_fr;	// [Cnd]の[ship_dt_p.hm_fr]を[Cnd_ship_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_ship_dt_to;	// [Cnd]の[ship_dt_p.ymd_to]を[Cnd_ship_dt_to]としてエイリアス定義。
	public MCDateField Cnd_ship_hm_to;	// [Cnd]の[ship_dt_p.hm_to]を[Cnd_ship_hm_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H Cnd_dlv_rqst_dt_p_PPanel;
	public MCDateField Cnd_dlv_rqst_dt_fr;	// [Cnd]の[dlv_rqst_dt_p.ymd_fr]を[Cnd_dlv_rqst_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_fr;	// [Cnd]の[dlv_rqst_dt_p.hm_fr]を[Cnd_dlv_rqst_hm_fr]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_dt_to;	// [Cnd]の[dlv_rqst_dt_p.ymd_to]を[Cnd_dlv_rqst_dt_to]としてエイリアス定義。
	public MCDateField Cnd_dlv_rqst_hm_to;	// [Cnd]の[dlv_rqst_dt_p.hm_to]を[Cnd_dlv_rqst_hm_to]としてエイリアス定義。
	public MCLabel Cnd_bp_cd_Label = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCTextField Cnd_bp_nm = null;
	public MCLabel Cnd_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_dpt_nm = null;
	public MCLabel Cnd_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_wg_nm = null;
	public MCLabel Cnd_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_no = null;
	public MCLabel Cnd_slo_no_Label = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_slo_no = null;
	public MCLabel Cnd_dlv_slip_inst_no_Label = null;
	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_inst_no = null;
	public MCLabel Cnd_dlv_slip_act_no_Label = null;
	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_slip_act_no = null;
	public MCLabel Cnd_ship_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ship_dlv_slip_no = null;
	public MCLabel Cnd_po_no_Label = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_po_no = null;
	public MCLabel Cnd_trd_rmrks_Label = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCTextField Cnd_trd_rmrks = null;
	/**
	 * Include past revisions 過去改訂含む.<p>
	 *
	 */
	public MCCheckBox Cnd_inc_past_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1490.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_no = null;
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_seq = null;
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_rev = null;
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ = null;
	/**
	 * Status 状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_sts_typ_nm = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slo_no = null;
	/**
	 * Delivery slip order No. 納品伝票指図ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_inst_no = null;
	/**
	 * Delivery slip result No. 納品伝票実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_slip_act_no = null;
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_act_no = null;
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ship_dlv_slip_no = null;
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_no = null;
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_rev = null;
	/**
	 * Latest PO rev. number 最新発注改訂番号.<p>
	 *
	 */
	public MCColumnConfig columnRslt_last_po_rev = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dpt_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_usr_nm = null;
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_ship_dt_p_PPanel;
	public MCColumnConfig columnRslt_ship_dt;// [Rslt]の[ship_dt_p.ymd]を[columnRslt_ship_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ship_hm;// [Rslt]の[ship_dt_p.hm]を[columnRslt_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_rqst_dt_p_PPanel;
	public MCColumnConfig columnRslt_dlv_rqst_dt;// [Rslt]の[dlv_rqst_dt_p.ymd]を[columnRslt_dlv_rqst_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_rqst_hm;// [Rslt]の[dlv_rqst_dt_p.hm]を[columnRslt_dlv_rqst_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_dlv_dt_p_PPanel;
	public MCColumnConfig columnRslt_dlv_dt;// [Rslt]の[dlv_dt_p.ymd]を[columnRslt_dlv_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_dlv_hm;// [Rslt]の[dlv_dt_p.hm]を[columnRslt_dlv_hm]としてエイリアス定義。
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ = null;
	/**
	 * Transaction pattern type name 取引パタン区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_ptn_typ_nm = null;
	/**
	 * Tax calculation type 税計算区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_calc_typ = null;
	/**
	 * Tax calculation type name 税計算区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_tax_calc_typ_nm = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cst_po_no = null;
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_cd = null;
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_nm = null;
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_amt;// [Rslt]の[trd_cur_amt_p.amt]を[columnRslt_trd_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_inc_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_inc_tax_amt;// [Rslt]の[trd_cur_inc_tax_amt_p.amt]を[columnRslt_trd_cur_inc_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_tax_amt;// [Rslt]の[trd_cur_tax_amt_p.amt]を[columnRslt_trd_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_trd_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_trd_cur_dscnt_amt;// [Rslt]の[trd_cur_dscnt_amt_p.amt]を[columnRslt_trd_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_cd = null;
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_cur_amt_dec_place = null;
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_amt;// [Rslt]の[base_cur_amt_p.amt]を[columnRslt_base_cur_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_tax_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_tax_amt;// [Rslt]の[base_cur_tax_amt_p.amt]を[columnRslt_base_cur_tax_amt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D Rslt_base_cur_dscnt_amt_p_PPanel;
	public MCColumnConfig columnRslt_base_cur_dscnt_amt;// [Rslt]の[base_cur_dscnt_amt_p.amt]を[columnRslt_base_cur_dscnt_amt]としてエイリアス定義。
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xrate = null;
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ptax_xrate = null;
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bp_nm = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_typ_nm = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dlv_id_nm = null;
	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_loc_cd = null;
	/**
	 * Receipt location name 入荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_arr_loc_nm = null;
	/**
	 * Supplier identification type 発注先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_id_typ = null;
	/**
	 * Supplier identification type name 発注先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_id_typ_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_id_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_id_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_wg_nm = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_trd_rmrks = null;
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_typ = null;
	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_basis_typ_nm = null;
	/**
	 * Slip issued 伝票発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_slip_prnt_flg = null;
	/**
	 * Sales slip issued 売上伝票発行済.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sls_prnt_flg = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_srv_req_no = null;
	/** [DLV_SLIP]モードを表す定数 */
	public static final String DLV_SLIP = "DLV_SLIP";
	/** [PURC_DLV_SLIP]モードを表す定数 */
	public static final String PURC_DLV_SLIP = "PURC_DLV_SLIP";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{DLV_SLIP, PURC_DLV_SLIP};
	
	/** [MS_MSBEL1490_Srch01]のCallerの作成 */
	protected MSBEP_DlvSlipSrch_MC.MS_MSBEL1490_Srch01Caller createMS_MSBEL1490_Srch01() {
		MSBEP_DlvSlipSrch_MC.MS_MSBEL1490_Srch01Caller<MSBEP_DlvSlipSrch, MS_MSBEL1490_Srch01Bridge>
		caller = ((MSBEP_DlvSlipSrch_MC)this).new MS_MSBEL1490_Srch01Caller<MSBEP_DlvSlipSrch, MS_MSBEL1490_Srch01Bridge>(
					(MSBEP_DlvSlipSrch)this, new MS_MSBEL1490_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1490_Srch01]の呼び出し */
	protected void callMS_MSBEL1490_Srch01() {
		MCCaller caller = createMS_MSBEL1490_Srch01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1490.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1490.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1490.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1490.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1490.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1490.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBE.MSBEP1490.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1490.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBE.MSBEP1490.RsltR createRsltR() {
		return mcframe.clientMSBE.MSBEP1490.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1490.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1490.RsltR.class);
	}

	/**
	 * RsltTableを初期化します。
	 */
	protected void createRsltTable(){
		if(RsltTable == null){
			RsltTable = beansFactory.createTable2("Rslt.table");
		}
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getRsltL())) ret.add(getRsltL());
		return ret;
	}

	/**
	 * コンテナに対応したブロックのIDを返します。
	 *
	 * 引数のコンテナに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return ブロックID
	 */
	public String getBlockId(MCContainer aCnt){
		if(aCnt == null) return null;
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getRsltL()) return "Rslt";
		return super.getBlockId(aCnt);
	}

	/**
	 * ブロックIDに対応したコンテナを返します。
	 *
	 * 引数のブロックIDに対応するブロックがない場合にはnullを返します。<br>
	 * 引数がnullの場合にはnullを返します。<br>
	 *
	 * @return コンテナ
	 */
	public MCContainer getContainer(String bId){
		if(bId == null) return null;
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Rslt")) return getRsltL();
		return super.getContainer(bId);
	}

	/**
	 * 保持するPanel(枠)のListを返します。
	 *
	 * @return MCPanelのList
	 */
	public List<MCPanel> getMCPanels(){
		List<MCPanel> ret = super.getMCPanels();
		ret.add(ScreenOpePanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(RsltPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_DlvSlipSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_DlvSlipSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_DlvSlipSrch_MC.jbCreateScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbCreateTop((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbCreateFold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbCreateCnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbCreateCtrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbCreateRslt((MSBEP_DlvSlipSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_DlvSlipSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBEP_DlvSlipSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBEP_DlvSlipSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_DlvSlipSrch p) {
		p.Cnd_ship_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().ship_dt_p());
		p.Cnd_ship_dt_p_PPanel.setName("Cnd.ship_dt_p");
		p.Cnd_ship_dt_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_ship_dt_fr.addAliasName("Cnd.ship_dt_fr", p);
		p.Cnd_ship_hm_fr = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_ship_hm_fr.addAliasName("Cnd.ship_hm_fr", p);
		p.Cnd_ship_dt_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_ship_dt_to.addAliasName("Cnd.ship_dt_to", p);
		p.Cnd_ship_hm_to = p.Cnd_ship_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_ship_hm_to.addAliasName("Cnd.ship_hm_to", p);
		p.Cnd_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.create(p.getCndR().dlv_rqst_dt_p());
		p.Cnd_dlv_rqst_dt_p_PPanel.setName("Cnd.dlv_rqst_dt_p");
		p.Cnd_dlv_rqst_dt_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_fr;
		p.Cnd_dlv_rqst_dt_fr.addAliasName("Cnd.dlv_rqst_dt_fr", p);
		p.Cnd_dlv_rqst_hm_fr = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_fr;
		p.Cnd_dlv_rqst_hm_fr.addAliasName("Cnd.dlv_rqst_hm_fr", p);
		p.Cnd_dlv_rqst_dt_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_ymd_to;
		p.Cnd_dlv_rqst_dt_to.addAliasName("Cnd.dlv_rqst_dt_to", p);
		p.Cnd_dlv_rqst_hm_to = p.Cnd_dlv_rqst_dt_p_PPanel.YmdHmFrTo_hm_to;
		p.Cnd_dlv_rqst_hm_to.addAliasName("Cnd.dlv_rqst_hm_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBEP_DlvSlipSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBEP_DlvSlipSrch p) {
		p.Rslt_ship_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$ship_dt_p);
		p.Rslt_ship_dt_p_PPanel.setName("Rslt.ship_dt_p");
		p.columnRslt_ship_dt = p.Rslt_ship_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_ship_dt.addAliasName("Rslt.ship_dt", p);
		p.columnRslt_ship_hm = p.Rslt_ship_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_ship_hm.addAliasName("Rslt.ship_hm", p);
		p.Rslt_dlv_rqst_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$dlv_rqst_dt_p);
		p.Rslt_dlv_rqst_dt_p_PPanel.setName("Rslt.dlv_rqst_dt_p");
		p.columnRslt_dlv_rqst_dt = p.Rslt_dlv_rqst_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_rqst_dt.addAliasName("Rslt.dlv_rqst_dt", p);
		p.columnRslt_dlv_rqst_hm = p.Rslt_dlv_rqst_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_rqst_hm.addAliasName("Rslt.dlv_rqst_hm", p);
		p.Rslt_dlv_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$dlv_dt_p);
		p.Rslt_dlv_dt_p_PPanel.setName("Rslt.dlv_dt_p");
		p.columnRslt_dlv_dt = p.Rslt_dlv_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_dlv_dt.addAliasName("Rslt.dlv_dt", p);
		p.columnRslt_dlv_hm = p.Rslt_dlv_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_dlv_hm.addAliasName("Rslt.dlv_hm", p);
		p.Rslt_trd_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$trd_cur_amt_p);
		p.Rslt_trd_cur_amt_p_PPanel.setName("Rslt.trd_cur_amt_p");
		p.columnRslt_trd_cur_amt = p.Rslt_trd_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_amt.addAliasName("Rslt.trd_cur_amt", p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$trd_cur_inc_tax_amt_p);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.setName("Rslt.trd_cur_inc_tax_amt_p");
		p.columnRslt_trd_cur_inc_tax_amt = p.Rslt_trd_cur_inc_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_inc_tax_amt.addAliasName("Rslt.trd_cur_inc_tax_amt", p);
		p.Rslt_trd_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$trd_cur_tax_amt_p);
		p.Rslt_trd_cur_tax_amt_p_PPanel.setName("Rslt.trd_cur_tax_amt_p");
		p.columnRslt_trd_cur_tax_amt = p.Rslt_trd_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_tax_amt.addAliasName("Rslt.trd_cur_tax_amt", p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$trd_cur_dscnt_amt_p);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.setName("Rslt.trd_cur_dscnt_amt_p");
		p.columnRslt_trd_cur_dscnt_amt = p.Rslt_trd_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_trd_cur_dscnt_amt.addAliasName("Rslt.trd_cur_dscnt_amt", p);
		p.Rslt_base_cur_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$base_cur_amt_p);
		p.Rslt_base_cur_amt_p_PPanel.setName("Rslt.base_cur_amt_p");
		p.columnRslt_base_cur_amt = p.Rslt_base_cur_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_amt.addAliasName("Rslt.base_cur_amt", p);
		p.Rslt_base_cur_tax_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$base_cur_tax_amt_p);
		p.Rslt_base_cur_tax_amt_p_PPanel.setName("Rslt.base_cur_tax_amt_p");
		p.columnRslt_base_cur_tax_amt = p.Rslt_base_cur_tax_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_tax_amt.addAliasName("Rslt.base_cur_tax_amt", p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel = mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.create(mcframe.clientMSBE.MSBEP1490.RsltR.$base_cur_dscnt_amt_p);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.setName("Rslt.base_cur_dscnt_amt_p");
		p.columnRslt_base_cur_dscnt_amt = p.Rslt_base_cur_dscnt_amt_p_PPanel.columnAmt_amt;
		p.columnRslt_base_cur_dscnt_amt.addAliasName("Rslt.base_cur_dscnt_amt", p);
	}

	/**
	 * この画面のステータスのSet集合を返します。
	 * 
	 * @return ステータスのSet
	 */
	@Override
	public Set<String> getStatusSet(){
		Set<String> sSet = super.getStatusSet();
		for(String aStr : statusArray) sSet.add(aStr);
		return sSet;
	}

	
	/** [Cnd_bp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_bp_cd_p = null;

	/**
	 * [Cnd_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bp_cd_ListPutter() {
		if (Cnd_bp_cd_p == null) {
			Cnd_bp_cd_p = createCnd_bp_cd_ListPutter(Cnd_bp_cd, "bp_cd", "bp_nm");

		}
		return Cnd_bp_cd_p;
	}
	
	
	/** [Cnd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dpt_cd_p = null;

	/**
	 * [Cnd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dpt_cd_ListPutter() {
		if (Cnd_dpt_cd_p == null) {
			Cnd_dpt_cd_p = createCnd_dpt_cd_ListPutter(Cnd_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Cnd_dpt_cd_p;
	}
	
	
	/** [Cnd_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_wg_cd_p = null;

	/**
	 * [Cnd_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_wg_cd_ListPutter() {
		if (Cnd_wg_cd_p == null) {
			Cnd_wg_cd_p = createCnd_wg_cd_ListPutter(Cnd_wg_cd, "wg_cd", "wg_nm");

		}
		return Cnd_wg_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_DlvSlipSrch create(){
		MSBEP_DlvSlipSrch p = new MSBEP_DlvSlipSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_DlvSlipSrch create(String name){
		MSBEP_DlvSlipSrch p = new MSBEP_DlvSlipSrch(name);
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * 画面部品初期設定
	 */
	protected void jbInit() {
		super.jbInit();
		MSBEP_DlvSlipSrch_MC.jbfInitScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbfInitTop((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbfInitFold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbfInitCnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbfInitCtrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbfInitRslt((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitTop((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitFold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitCnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitCtrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.jbInitRslt((MSBEP_DlvSlipSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_DLV_SLIP = p.beansFactory.createRadioButton("Cnd.ope_DLV_SLIP");
		p.Cnd_ope_PURC_DLV_SLIP = p.beansFactory.createRadioButton("Cnd.ope_PURC_DLV_SLIP");
		p.Cnd_bp_cd_Label = p.beansFactory.createLabel("Cnd.bp_cd_Label");
		p.Cnd_bp_cd = p.beansFactory.createTextField("Cnd.bp_cd");
		p.Cnd_bp_cd.setLabel(p.Cnd_bp_cd_Label);
		p.Cnd_bp_nm = p.beansFactory.createTextField("Cnd.bp_nm");
		p.Cnd_dpt_cd_Label = p.beansFactory.createLabel("Cnd.dpt_cd_Label");
		p.Cnd_dpt_cd = p.beansFactory.createTextField("Cnd.dpt_cd");
		p.Cnd_dpt_cd.setLabel(p.Cnd_dpt_cd_Label);
		p.Cnd_dpt_nm = p.beansFactory.createTextField("Cnd.dpt_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_no_Label");
		p.Cnd_dlv_slip_no = p.beansFactory.createTextField("Cnd.dlv_slip_no");
		p.Cnd_dlv_slip_no.setLabel(p.Cnd_dlv_slip_no_Label);
		p.Cnd_slo_no_Label = p.beansFactory.createLabel("Cnd.slo_no_Label");
		p.Cnd_slo_no = p.beansFactory.createTextField("Cnd.slo_no");
		p.Cnd_slo_no.setLabel(p.Cnd_slo_no_Label);
		p.Cnd_dlv_slip_inst_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_inst_no_Label");
		p.Cnd_dlv_slip_inst_no = p.beansFactory.createTextField("Cnd.dlv_slip_inst_no");
		p.Cnd_dlv_slip_inst_no.setLabel(p.Cnd_dlv_slip_inst_no_Label);
		p.Cnd_dlv_slip_act_no_Label = p.beansFactory.createLabel("Cnd.dlv_slip_act_no_Label");
		p.Cnd_dlv_slip_act_no = p.beansFactory.createTextField("Cnd.dlv_slip_act_no");
		p.Cnd_dlv_slip_act_no.setLabel(p.Cnd_dlv_slip_act_no_Label);
		p.Cnd_ship_dlv_slip_no_Label = p.beansFactory.createLabel("Cnd.ship_dlv_slip_no_Label");
		p.Cnd_ship_dlv_slip_no = p.beansFactory.createTextField("Cnd.ship_dlv_slip_no");
		p.Cnd_ship_dlv_slip_no.setLabel(p.Cnd_ship_dlv_slip_no_Label);
		p.Cnd_po_no_Label = p.beansFactory.createLabel("Cnd.po_no_Label");
		p.Cnd_po_no = p.beansFactory.createTextField("Cnd.po_no");
		p.Cnd_po_no.setLabel(p.Cnd_po_no_Label);
		p.Cnd_trd_rmrks_Label = p.beansFactory.createLabel("Cnd.trd_rmrks_Label");
		p.Cnd_trd_rmrks = p.beansFactory.createTextField("Cnd.trd_rmrks");
		p.Cnd_trd_rmrks.setLabel(p.Cnd_trd_rmrks_Label);
		p.Cnd_inc_past_flg = p.beansFactory.createCheckBox("Cnd.inc_past_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_seq = p.beansFactory.createTableColumn("Rslt.dlv_slip_seq", MCColumnType.NUMBER);
		p.columnRslt_dlv_slip_rev = p.beansFactory.createTableColumn("Rslt.dlv_slip_rev", MCColumnType.NUMBER);
		p.columnRslt_slip_sts_typ = p.beansFactory.createTableColumn("Rslt.slip_sts_typ", MCColumnType.TEXT);
		p.columnRslt_slip_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.slip_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slo_no = p.beansFactory.createTableColumn("Rslt.slo_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_inst_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_inst_no", MCColumnType.TEXT);
		p.columnRslt_dlv_slip_act_no = p.beansFactory.createTableColumn("Rslt.dlv_slip_act_no", MCColumnType.TEXT);
		p.columnRslt_sls_act_no = p.beansFactory.createTableColumn("Rslt.sls_act_no", MCColumnType.TEXT);
		p.columnRslt_ship_dlv_slip_no = p.beansFactory.createTableColumn("Rslt.ship_dlv_slip_no", MCColumnType.TEXT);
		p.columnRslt_po_no = p.beansFactory.createTableColumn("Rslt.po_no", MCColumnType.TEXT);
		p.columnRslt_po_rev = p.beansFactory.createTableColumn("Rslt.po_rev", MCColumnType.NUMBER);
		p.columnRslt_last_po_rev = p.beansFactory.createTableColumn("Rslt.last_po_rev", MCColumnType.NUMBER);
		p.columnRslt_dpt_cd = p.beansFactory.createTableColumn("Rslt.dpt_cd", MCColumnType.TEXT);
		p.columnRslt_dpt_nm = p.beansFactory.createTableColumn("Rslt.dpt_nm", MCColumnType.TEXT);
		p.columnRslt_usr_cd = p.beansFactory.createTableColumn("Rslt.usr_cd", MCColumnType.TEXT);
		p.columnRslt_usr_nm = p.beansFactory.createTableColumn("Rslt.usr_nm", MCColumnType.TEXT);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_trd_cd = p.beansFactory.createTableColumn("Rslt.trd_cd", MCColumnType.TEXT);
		p.columnRslt_trd_nm = p.beansFactory.createTableColumn("Rslt.trd_nm", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ", MCColumnType.TEXT);
		p.columnRslt_trd_ptn_typ_nm = p.beansFactory.createTableColumn("Rslt.trd_ptn_typ_nm", MCColumnType.TEXT);
		p.columnRslt_tax_calc_typ = p.beansFactory.createTableColumn("Rslt.tax_calc_typ", MCColumnType.TEXT);
		p.columnRslt_tax_calc_typ_nm = p.beansFactory.createTableColumn("Rslt.tax_calc_typ_nm", MCColumnType.TEXT);
		p.columnRslt_cst_po_no = p.beansFactory.createTableColumn("Rslt.cst_po_no", MCColumnType.TEXT);
		p.columnRslt_trd_cur_cd = p.beansFactory.createTableColumn("Rslt.trd_cur_cd", MCColumnType.TEXT);
		p.columnRslt_trd_cur_nm = p.beansFactory.createTableColumn("Rslt.trd_cur_nm", MCColumnType.TEXT);
		p.columnRslt_trd_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.trd_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_cur_cd = p.beansFactory.createTableColumn("Rslt.base_cur_cd", MCColumnType.TEXT);
		p.columnRslt_base_cur_amt_dec_place = p.beansFactory.createTableColumn("Rslt.base_cur_amt_dec_place", MCColumnType.NUMBER);
		p.columnRslt_xrate = p.beansFactory.createTableColumn("Rslt.xrate", MCColumnType.NUMBER);
		p.columnRslt_ptax_xrate = p.beansFactory.createTableColumn("Rslt.ptax_xrate", MCColumnType.NUMBER);
		p.columnRslt_bp_cd = p.beansFactory.createTableColumn("Rslt.bp_cd", MCColumnType.TEXT);
		p.columnRslt_bp_nm = p.beansFactory.createTableColumn("Rslt.bp_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ = p.beansFactory.createTableColumn("Rslt.dlv_id_typ", MCColumnType.TEXT);
		p.columnRslt_dlv_id_typ_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_dlv_id_cd = p.beansFactory.createTableColumn("Rslt.dlv_id_cd", MCColumnType.TEXT);
		p.columnRslt_dlv_id_nm = p.beansFactory.createTableColumn("Rslt.dlv_id_nm", MCColumnType.TEXT);
		p.columnRslt_arr_loc_cd = p.beansFactory.createTableColumn("Rslt.arr_loc_cd", MCColumnType.TEXT);
		p.columnRslt_arr_loc_nm = p.beansFactory.createTableColumn("Rslt.arr_loc_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_id_typ = p.beansFactory.createTableColumn("Rslt.sppl_id_typ", MCColumnType.TEXT);
		p.columnRslt_sppl_id_typ_nm = p.beansFactory.createTableColumn("Rslt.sppl_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_id_cd = p.beansFactory.createTableColumn("Rslt.sppl_id_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_id_nm = p.beansFactory.createTableColumn("Rslt.sppl_id_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_trd_rmrks = p.beansFactory.createTableColumn("Rslt.trd_rmrks", MCColumnType.TEXT);
		p.columnRslt_sls_basis_typ = p.beansFactory.createTableColumn("Rslt.sls_basis_typ", MCColumnType.TEXT);
		p.columnRslt_sls_basis_typ_nm = p.beansFactory.createTableColumn("Rslt.sls_basis_typ_nm", MCColumnType.TEXT);
		p.columnRslt_slip_prnt_flg = p.beansFactory.createTableColumn("Rslt.slip_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_sls_prnt_flg = p.beansFactory.createTableColumn("Rslt.sls_prnt_flg", MCColumnType.CHECK);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.TopPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.RsltPanel);
		p.TopPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.TopPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.TopPanel.add(p.FoldBasePanel);
		p.FoldBasePanel.add(p.FoldScrollPane);
		p.FoldScrollPane.setBorder(null);
		p.FoldScrollPane.setViewportView(p.FoldPanel);
		p.FoldBasePanel.setLayoutPosition("C");
		p.TopPanel.setLastBeans(p.FoldPanel);
		p.FoldPanel.setNextBeans(p.CtrlPanel);
		p.TopPanel.add(p.CtrlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_DLV_SLIP);
		p.Cnd_ope_DLV_SLIP.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DLV_SLIP);
		p.ScreenOpePanel.add(p.Cnd_ope_DLV_SLIP);
		p.Cnd_ope_DLV_SLIP.setNextBeans(p.Cnd_ope_PURC_DLV_SLIP);
		p.Cnd_ope_PURC_DLV_SLIP.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_PURC_DLV_SLIP);
		p.ScreenOpePanel.add(p.Cnd_ope_PURC_DLV_SLIP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.ope_META);
		p.CndPanel.add(p.Cnd_ship_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_ship_dt_p_PPanel);
		p.Cnd_ship_dt_p_PPanel.setNextBeans(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.CndPanel.add(p.Cnd_dlv_rqst_dt_p_PPanel);
		p.Cnd_dlv_rqst_dt_p_PPanel.setNextBeans(p.Cnd_bp_cd);
		p.CndPanel.add(p.Cnd_bp_cd_Label);
		p.CndPanel.add(p.Cnd_bp_cd);
		p.Cnd_bp_cd.setNextBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.bp_cd_META);
		p.Cnd_bp_cd.addLinkBeans(p.Cnd_bp_nm);
		p.Cnd_bp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_bp_cd, true);
		p.CndPanel.add(p.Cnd_bp_nm);
		p.Cnd_bp_nm.setNextBeans(p.Cnd_dpt_cd);
		p.Cnd_bp_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.bp_nm_META);
		p.setPluralValueEnable(p.Cnd_bp_nm, true);
		p.CndPanel.add(p.Cnd_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_dpt_cd);
		p.Cnd_dpt_cd.setNextBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.dpt_cd_META);
		p.Cnd_dpt_cd.addLinkBeans(p.Cnd_dpt_nm);
		p.Cnd_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dpt_cd, true);
		p.CndPanel.add(p.Cnd_dpt_nm);
		p.Cnd_dpt_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_dpt_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_dpt_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_dlv_slip_no);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_no);
		p.Cnd_dlv_slip_no.setNextBeans(p.Cnd_slo_no);
		p.Cnd_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_slo_no_Label);
		p.CndPanel.add(p.Cnd_slo_no);
		p.Cnd_slo_no.setNextBeans(p.Cnd_dlv_slip_inst_no);
		p.Cnd_slo_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.slo_no_META);
		p.setPluralValueEnable(p.Cnd_slo_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_inst_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_inst_no);
		p.Cnd_dlv_slip_inst_no.setNextBeans(p.Cnd_dlv_slip_act_no);
		p.Cnd_dlv_slip_inst_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.dlv_slip_inst_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_inst_no, true);
		p.CndPanel.add(p.Cnd_dlv_slip_act_no_Label);
		p.CndPanel.add(p.Cnd_dlv_slip_act_no);
		p.Cnd_dlv_slip_act_no.setNextBeans(p.Cnd_ship_dlv_slip_no);
		p.Cnd_dlv_slip_act_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.dlv_slip_act_no_META);
		p.setPluralValueEnable(p.Cnd_dlv_slip_act_no, true);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no_Label);
		p.CndPanel.add(p.Cnd_ship_dlv_slip_no);
		p.Cnd_ship_dlv_slip_no.setNextBeans(p.Cnd_po_no);
		p.Cnd_ship_dlv_slip_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.ship_dlv_slip_no_META);
		p.setPluralValueEnable(p.Cnd_ship_dlv_slip_no, true);
		p.CndPanel.add(p.Cnd_po_no_Label);
		p.CndPanel.add(p.Cnd_po_no);
		p.Cnd_po_no.setNextBeans(p.Cnd_trd_rmrks);
		p.Cnd_po_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.po_no_META);
		p.setPluralValueEnable(p.Cnd_po_no, true);
		p.CndPanel.add(p.Cnd_trd_rmrks_Label);
		p.CndPanel.add(p.Cnd_trd_rmrks);
		p.Cnd_trd_rmrks.setNextBeans(p.Cnd_inc_past_flg);
		p.Cnd_trd_rmrks.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.trd_rmrks_META);
		p.setPluralValueEnable(p.Cnd_trd_rmrks, true);
		p.CndPanel.add(p.Cnd_inc_past_flg);
		p.Cnd_inc_past_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1490.CndR.inc_past_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBEP_DlvSlipSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	@Override
	public void layoutAfterOpen() {
		super.layoutAfterOpen();
		Ctrl_ctrl_PPanel.expandInit();
		Ctrl_ctrl_PPanel.setDefaultDividerLocation();
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBEP_DlvSlipSrch_MC.mcInitScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.mcInitTop((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.mcInitFold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.mcInitCnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.mcInitCtrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.mcInitRslt((MSBEP_DlvSlipSrch)this);

		// [DLV_SLIP]ステータスのモードの設定
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_ScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_Top((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_Fold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_Cnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_Ctrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitDLV__SLIP_Rslt((MSBEP_DlvSlipSrch)this);

		// [PURC_DLV_SLIP]ステータスのモードの設定
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_ScreenOpe((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_Top((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_Fold((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_Cnd((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_Ctrl((MSBEP_DlvSlipSrch)this);
		MSBEP_DlvSlipSrch_MC.statusInitPURC__DLV__SLIP_Rslt((MSBEP_DlvSlipSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_DlvSlipSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBEP_DlvSlipSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBEP_DlvSlipSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_DlvSlipSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_DLV_SLIP.addAllListener(p);
		p.Cnd_ope_PURC_DLV_SLIP.addAllListener(p);
		p.Cnd_bp_cd.setListListener(p);
		p.Cnd_bp_cd.addAllListener(p);
		p.Cnd_bp_nm.setListListener(p);
		p.Cnd_bp_nm.addAllListener(p);
		p.Cnd_dpt_cd.setListListener(p);
		p.Cnd_dpt_cd.addAllListener(p);
		p.Cnd_dpt_nm.setListListener(p);
		p.Cnd_dpt_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_dlv_slip_no.setListListener(p);
		p.Cnd_dlv_slip_no.addAllListener(p);
		p.Cnd_slo_no.setListListener(p);
		p.Cnd_slo_no.addAllListener(p);
		p.Cnd_dlv_slip_inst_no.setListListener(p);
		p.Cnd_dlv_slip_inst_no.addAllListener(p);
		p.Cnd_dlv_slip_act_no.setListListener(p);
		p.Cnd_dlv_slip_act_no.addAllListener(p);
		p.Cnd_ship_dlv_slip_no.setListListener(p);
		p.Cnd_ship_dlv_slip_no.addAllListener(p);
		p.Cnd_po_no.setListListener(p);
		p.Cnd_po_no.addAllListener(p);
		p.Cnd_trd_rmrks.setListListener(p);
		p.Cnd_trd_rmrks.addAllListener(p);
		p.Cnd_inc_past_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBEP_DlvSlipSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBEP_DlvSlipSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_dlv_slip_no.addAllListener(p);
		p.columnRslt_dlv_slip_no.setListListener(p);
		p.columnRslt_dlv_slip_seq.addAllListener(p);
		p.columnRslt_dlv_slip_seq.setListListener(p);
		p.columnRslt_dlv_slip_rev.addAllListener(p);
		p.columnRslt_dlv_slip_rev.setListListener(p);
		p.columnRslt_slip_sts_typ.addAllListener(p);
		p.columnRslt_slip_sts_typ.setListListener(p);
		p.columnRslt_slip_sts_typ_nm.addAllListener(p);
		p.columnRslt_slip_sts_typ_nm.setListListener(p);
		p.columnRslt_slo_no.addAllListener(p);
		p.columnRslt_slo_no.setListListener(p);
		p.columnRslt_dlv_slip_inst_no.addAllListener(p);
		p.columnRslt_dlv_slip_inst_no.setListListener(p);
		p.columnRslt_dlv_slip_act_no.addAllListener(p);
		p.columnRslt_dlv_slip_act_no.setListListener(p);
		p.columnRslt_sls_act_no.addAllListener(p);
		p.columnRslt_sls_act_no.setListListener(p);
		p.columnRslt_ship_dlv_slip_no.addAllListener(p);
		p.columnRslt_ship_dlv_slip_no.setListListener(p);
		p.columnRslt_po_no.addAllListener(p);
		p.columnRslt_po_no.setListListener(p);
		p.columnRslt_po_rev.addAllListener(p);
		p.columnRslt_po_rev.setListListener(p);
		p.columnRslt_last_po_rev.addAllListener(p);
		p.columnRslt_last_po_rev.setListListener(p);
		p.columnRslt_dpt_cd.addAllListener(p);
		p.columnRslt_dpt_cd.setListListener(p);
		p.columnRslt_dpt_nm.addAllListener(p);
		p.columnRslt_dpt_nm.setListListener(p);
		p.columnRslt_usr_cd.addAllListener(p);
		p.columnRslt_usr_cd.setListListener(p);
		p.columnRslt_usr_nm.addAllListener(p);
		p.columnRslt_usr_nm.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_trd_cd.addAllListener(p);
		p.columnRslt_trd_cd.setListListener(p);
		p.columnRslt_trd_nm.addAllListener(p);
		p.columnRslt_trd_nm.setListListener(p);
		p.columnRslt_trd_ptn_typ.addAllListener(p);
		p.columnRslt_trd_ptn_typ.setListListener(p);
		p.columnRslt_trd_ptn_typ_nm.addAllListener(p);
		p.columnRslt_trd_ptn_typ_nm.setListListener(p);
		p.columnRslt_tax_calc_typ.addAllListener(p);
		p.columnRslt_tax_calc_typ.setListListener(p);
		p.columnRslt_tax_calc_typ_nm.addAllListener(p);
		p.columnRslt_tax_calc_typ_nm.setListListener(p);
		p.columnRslt_cst_po_no.addAllListener(p);
		p.columnRslt_cst_po_no.setListListener(p);
		p.columnRslt_trd_cur_cd.addAllListener(p);
		p.columnRslt_trd_cur_cd.setListListener(p);
		p.columnRslt_trd_cur_nm.addAllListener(p);
		p.columnRslt_trd_cur_nm.setListListener(p);
		p.columnRslt_trd_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_trd_cur_amt_dec_place.setListListener(p);
		p.columnRslt_base_cur_cd.addAllListener(p);
		p.columnRslt_base_cur_cd.setListListener(p);
		p.columnRslt_base_cur_amt_dec_place.addAllListener(p);
		p.columnRslt_base_cur_amt_dec_place.setListListener(p);
		p.columnRslt_xrate.addAllListener(p);
		p.columnRslt_xrate.setListListener(p);
		p.columnRslt_ptax_xrate.addAllListener(p);
		p.columnRslt_ptax_xrate.setListListener(p);
		p.columnRslt_bp_cd.addAllListener(p);
		p.columnRslt_bp_cd.setListListener(p);
		p.columnRslt_bp_nm.addAllListener(p);
		p.columnRslt_bp_nm.setListListener(p);
		p.columnRslt_dlv_id_typ.addAllListener(p);
		p.columnRslt_dlv_id_typ.setListListener(p);
		p.columnRslt_dlv_id_typ_nm.addAllListener(p);
		p.columnRslt_dlv_id_typ_nm.setListListener(p);
		p.columnRslt_dlv_id_cd.addAllListener(p);
		p.columnRslt_dlv_id_cd.setListListener(p);
		p.columnRslt_dlv_id_nm.addAllListener(p);
		p.columnRslt_dlv_id_nm.setListListener(p);
		p.columnRslt_arr_loc_cd.addAllListener(p);
		p.columnRslt_arr_loc_cd.setListListener(p);
		p.columnRslt_arr_loc_nm.addAllListener(p);
		p.columnRslt_arr_loc_nm.setListListener(p);
		p.columnRslt_sppl_id_typ.addAllListener(p);
		p.columnRslt_sppl_id_typ.setListListener(p);
		p.columnRslt_sppl_id_typ_nm.addAllListener(p);
		p.columnRslt_sppl_id_typ_nm.setListListener(p);
		p.columnRslt_sppl_id_cd.addAllListener(p);
		p.columnRslt_sppl_id_cd.setListListener(p);
		p.columnRslt_sppl_id_nm.addAllListener(p);
		p.columnRslt_sppl_id_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_trd_rmrks.addAllListener(p);
		p.columnRslt_trd_rmrks.setListListener(p);
		p.columnRslt_sls_basis_typ.addAllListener(p);
		p.columnRslt_sls_basis_typ.setListListener(p);
		p.columnRslt_sls_basis_typ_nm.addAllListener(p);
		p.columnRslt_sls_basis_typ_nm.setListListener(p);
		p.columnRslt_slip_prnt_flg.addAllListener(p);
		p.columnRslt_sls_prnt_flg.addAllListener(p);
		p.columnRslt_ins_usr_id.addAllListener(p);
		p.columnRslt_ins_usr_id.setListListener(p);
		p.columnRslt_ins_usr_nm.addAllListener(p);
		p.columnRslt_ins_usr_nm.setListListener(p);
		p.columnRslt_ins_func_id.addAllListener(p);
		p.columnRslt_ins_func_id.setListListener(p);
		p.columnRslt_ins_func_nm.addAllListener(p);
		p.columnRslt_ins_func_nm.setListListener(p);
		p.columnRslt_ins_ts.addAllListener(p);
		p.columnRslt_ins_ts.setListListener(p);
		p.columnRslt_upd_usr_id.addAllListener(p);
		p.columnRslt_upd_usr_id.setListListener(p);
		p.columnRslt_upd_usr_nm.addAllListener(p);
		p.columnRslt_upd_usr_nm.setListListener(p);
		p.columnRslt_upd_func_id.addAllListener(p);
		p.columnRslt_upd_func_id.setListListener(p);
		p.columnRslt_upd_func_nm.addAllListener(p);
		p.columnRslt_upd_func_nm.setListListener(p);
		p.columnRslt_upd_ts.addAllListener(p);
		p.columnRslt_upd_ts.setListListener(p);
		p.columnRslt_upd_srv_req_no.addAllListener(p);
		p.columnRslt_upd_srv_req_no.setListListener(p);
	}

	/**
	 * [DLV_SLIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_ScreenOpe(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [DLV_SLIP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_Top(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [DLV_SLIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_Fold(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [DLV_SLIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_Cnd(MSBEP_DlvSlipSrch p){
		p.Cnd_ope_Group.putMode(p, DLV_SLIP, MCMode.REQUIRED);
		p.Cnd_ship_dt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_bp_cd.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_inst_no.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_act_no.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_ship_dlv_slip_no.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_po_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_trd_rmrks.putMode(p, DLV_SLIP, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, DLV_SLIP, MCMode.REQUIRED);

	}

	/**
	 * [DLV_SLIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_Ctrl(MSBEP_DlvSlipSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(DLV_SLIP, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [DLV_SLIP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDLV__SLIP_Rslt(MSBEP_DlvSlipSrch p){
		p.columnRslt_dlv_slip_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_inst_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_act_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_act_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ship_dlv_slip_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_po_no.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_po_rev.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_last_po_rev.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dpt_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.Rslt_ship_dt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_rqst_dt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_dt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_tax_calc_typ.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_tax_calc_typ_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_cst_po_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_xrate.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_arr_loc_cd.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_arr_loc_nm.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sppl_id_typ.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sppl_id_typ_nm.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sppl_id_cd.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sppl_id_nm.putMode(p, DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slip_prnt_flg.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_prnt_flg.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DLV_SLIP, MCMode.READ_ONLY);

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_ScreenOpe(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_Top(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_Fold(MSBEP_DlvSlipSrch p){

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_Cnd(MSBEP_DlvSlipSrch p){
		p.Cnd_ope_Group.putMode(p, PURC_DLV_SLIP, MCMode.REQUIRED);
		p.Cnd_ship_dt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.READ_ONLY);
		p.Cnd_dlv_rqst_dt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP0400.MAUBP_YmdHm_Fr_To_H.ENABLE);
		p.Cnd_bp_cd.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_bp_nm.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dpt_cd.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dpt_nm.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_dlv_slip_no.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_slo_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_inst_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_dlv_slip_act_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_ship_dlv_slip_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.Cnd_po_no.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_trd_rmrks.putMode(p, PURC_DLV_SLIP, MCMode.ENABLE);
		p.Cnd_inc_past_flg.putMode(p, PURC_DLV_SLIP, MCMode.REQUIRED);

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_Ctrl(MSBEP_DlvSlipSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [PURC_DLV_SLIP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitPURC__DLV__SLIP_Rslt(MSBEP_DlvSlipSrch p){
		p.columnRslt_dlv_slip_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_seq.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_slip_rev.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slip_sts_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_slo_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_inst_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_slip_act_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sls_act_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_ship_dlv_slip_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_po_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_po_rev.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_last_po_rev.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dpt_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dpt_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_usr_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_usr_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.Rslt_ship_dt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.Rslt_dlv_rqst_dt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_dlv_dt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.INVISIBLE);
		p.columnRslt_ac_dt.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_trd_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_ptn_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_tax_calc_typ.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_tax_calc_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_cst_po_no.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_trd_cur_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_cur_amt_dec_place.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.Rslt_trd_cur_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_inc_tax_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_tax_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_trd_cur_dscnt_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_base_cur_cd.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_base_cur_amt_dec_place.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.Rslt_base_cur_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_tax_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.Rslt_base_cur_dscnt_amt_p_PPanel.putStatus(PURC_DLV_SLIP, mcframe.clientMAUB.MAUBP5050.MAUBP_Amt_D.READ_ONLY);
		p.columnRslt_xrate.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ptax_xrate.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_bp_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_bp_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_dlv_id_typ.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_cd.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_dlv_id_nm.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_arr_loc_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_arr_loc_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sppl_id_typ.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sppl_id_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sppl_id_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sppl_id_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_trd_rmrks.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_basis_typ.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_sls_basis_typ_nm.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_slip_prnt_flg.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_sls_prnt_flg.putMode(p, PURC_DLV_SLIP, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_id.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, PURC_DLV_SLIP, MCMode.READ_ONLY);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return DLV_SLIP;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_DlvSlipSrch_MC.setTableConfigRslt((MSBEP_DlvSlipSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBEP_DlvSlipSrch p) {
		p.columnRslt_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_no);
		p.columnRslt_dlv_slip_seq.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_slip_seq_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_seq);
		p.columnRslt_dlv_slip_rev.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_slip_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_rev);
		p.columnRslt_slip_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.slip_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ);
		p.columnRslt_slip_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.slip_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_sts_typ_nm);
		p.columnRslt_slo_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.slo_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slo_no);
		p.columnRslt_dlv_slip_inst_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_slip_inst_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_inst_no);
		p.columnRslt_dlv_slip_act_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_slip_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_slip_act_no);
		p.columnRslt_sls_act_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sls_act_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_act_no);
		p.columnRslt_ship_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ship_dlv_slip_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ship_dlv_slip_no);
		p.columnRslt_po_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_no);
		p.columnRslt_po_rev.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.po_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_po_rev);
		p.columnRslt_last_po_rev.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.last_po_rev_META);
		p.RsltTable.addColumnConfig(p.columnRslt_last_po_rev);
		p.columnRslt_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dpt_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_cd);
		p.columnRslt_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dpt_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dpt_nm);
		p.columnRslt_usr_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.usr_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_cd);
		p.columnRslt_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_usr_nm);
		p.RsltTable.addTable(p.Rslt_ship_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_rqst_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_dlv_dt_p_PPanel.YmdHmTable);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.columnRslt_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cd);
		p.columnRslt_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_nm);
		p.columnRslt_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_ptn_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ);
		p.columnRslt_trd_ptn_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_ptn_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_ptn_typ_nm);
		p.columnRslt_tax_calc_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.tax_calc_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_calc_typ);
		p.columnRslt_tax_calc_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.tax_calc_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_tax_calc_typ_nm);
		p.columnRslt_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.cst_po_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cst_po_no);
		p.columnRslt_trd_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_cd);
		p.columnRslt_trd_cur_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_cur_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_nm);
		p.columnRslt_trd_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_trd_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_inc_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_trd_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_base_cur_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.base_cur_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_cd);
		p.columnRslt_base_cur_amt_dec_place.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.base_cur_amt_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_cur_amt_dec_place);
		p.RsltTable.addTable(p.Rslt_base_cur_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_tax_amt_p_PPanel.AmtTable);
		p.RsltTable.addTable(p.Rslt_base_cur_dscnt_amt_p_PPanel.AmtTable);
		p.columnRslt_xrate.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xrate);
		p.columnRslt_ptax_xrate.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ptax_xrate_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ptax_xrate);
		p.columnRslt_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_cd);
		p.columnRslt_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bp_nm);
		p.columnRslt_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ);
		p.columnRslt_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_typ_nm);
		p.columnRslt_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_cd);
		p.columnRslt_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.dlv_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dlv_id_nm);
		p.columnRslt_arr_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.arr_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_loc_cd);
		p.columnRslt_arr_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.arr_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_arr_loc_nm);
		p.columnRslt_sppl_id_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sppl_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_id_typ);
		p.columnRslt_sppl_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sppl_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_id_typ_nm);
		p.columnRslt_sppl_id_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sppl_id_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_id_cd);
		p.columnRslt_sppl_id_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sppl_id_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_id_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.trd_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_trd_rmrks);
		p.columnRslt_sls_basis_typ.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sls_basis_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ);
		p.columnRslt_sls_basis_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sls_basis_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_basis_typ_nm);
		p.columnRslt_slip_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.slip_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_slip_prnt_flg);
		p.columnRslt_sls_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.sls_prnt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sls_prnt_flg);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBE.MSBEP1490.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_bp_cd.getListConfig().setPutter(getCnd_bp_cd_ListPutter());
		Cnd_dpt_cd.getListConfig().setPutter(getCnd_dpt_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
	}

	/**
	 * この画面を[DLV_SLIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDLV_SLIPStatus() {
		status = DLV_SLIP;
		setAllStatus(status);
	}

	/**
	 * この画面を[PURC_DLV_SLIP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setPURC_DLV_SLIPStatus() {
		status = PURC_DLV_SLIP;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (DLV_SLIP.equals(status)) {
			setDLV_SLIPStatus();
		}
		else if (PURC_DLV_SLIP.equals(status)) {
			setPURC_DLV_SLIPStatus();
		}
	}

	/**
	 * [Cnd_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsWg");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_bp_cd) return getCnd_bp_cd(row, info);
		if(combo == Cnd_dpt_cd) return getCnd_dpt_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * ValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param vc イベント対象のGUI部品
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doVCEvent(MCVCBeans vc, MCEventInfo info) {
		if (!super.doVCEvent(vc, info)) {
			return false;
		}
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_bp_cd) return doCnd_bp_cd_VC(info);
		if (vc == Cnd_bp_nm) return doCnd_bp_nm_VC(info);
		if (vc == Cnd_dpt_cd) return doCnd_dpt_cd_VC(info);
		if (vc == Cnd_dpt_nm) return doCnd_dpt_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_dlv_slip_no) return doCnd_dlv_slip_no_VC(info);
		if (vc == Cnd_slo_no) return doCnd_slo_no_VC(info);
		if (vc == Cnd_dlv_slip_inst_no) return doCnd_dlv_slip_inst_no_VC(info);
		if (vc == Cnd_dlv_slip_act_no) return doCnd_dlv_slip_act_no_VC(info);
		if (vc == Cnd_ship_dlv_slip_no) return doCnd_ship_dlv_slip_no_VC(info);
		if (vc == Cnd_po_no) return doCnd_po_no_VC(info);
		if (vc == Cnd_trd_rmrks) return doCnd_trd_rmrks_VC(info);
		if (vc == Cnd_inc_past_flg) return doCnd_inc_past_flg_VC(info);
		if (vc == columnRslt_dlv_slip_no) return doRslt_dlv_slip_no_VC(info);
		if (vc == columnRslt_dlv_slip_seq) return doRslt_dlv_slip_seq_VC(info);
		if (vc == columnRslt_dlv_slip_rev) return doRslt_dlv_slip_rev_VC(info);
		if (vc == columnRslt_slip_sts_typ) return doRslt_slip_sts_typ_VC(info);
		if (vc == columnRslt_slip_sts_typ_nm) return doRslt_slip_sts_typ_nm_VC(info);
		if (vc == columnRslt_slo_no) return doRslt_slo_no_VC(info);
		if (vc == columnRslt_dlv_slip_inst_no) return doRslt_dlv_slip_inst_no_VC(info);
		if (vc == columnRslt_dlv_slip_act_no) return doRslt_dlv_slip_act_no_VC(info);
		if (vc == columnRslt_sls_act_no) return doRslt_sls_act_no_VC(info);
		if (vc == columnRslt_ship_dlv_slip_no) return doRslt_ship_dlv_slip_no_VC(info);
		if (vc == columnRslt_po_no) return doRslt_po_no_VC(info);
		if (vc == columnRslt_po_rev) return doRslt_po_rev_VC(info);
		if (vc == columnRslt_last_po_rev) return doRslt_last_po_rev_VC(info);
		if (vc == columnRslt_dpt_cd) return doRslt_dpt_cd_VC(info);
		if (vc == columnRslt_dpt_nm) return doRslt_dpt_nm_VC(info);
		if (vc == columnRslt_usr_cd) return doRslt_usr_cd_VC(info);
		if (vc == columnRslt_usr_nm) return doRslt_usr_nm_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_trd_cd) return doRslt_trd_cd_VC(info);
		if (vc == columnRslt_trd_nm) return doRslt_trd_nm_VC(info);
		if (vc == columnRslt_trd_ptn_typ) return doRslt_trd_ptn_typ_VC(info);
		if (vc == columnRslt_trd_ptn_typ_nm) return doRslt_trd_ptn_typ_nm_VC(info);
		if (vc == columnRslt_tax_calc_typ) return doRslt_tax_calc_typ_VC(info);
		if (vc == columnRslt_tax_calc_typ_nm) return doRslt_tax_calc_typ_nm_VC(info);
		if (vc == columnRslt_cst_po_no) return doRslt_cst_po_no_VC(info);
		if (vc == columnRslt_trd_cur_cd) return doRslt_trd_cur_cd_VC(info);
		if (vc == columnRslt_trd_cur_nm) return doRslt_trd_cur_nm_VC(info);
		if (vc == columnRslt_trd_cur_amt_dec_place) return doRslt_trd_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_base_cur_cd) return doRslt_base_cur_cd_VC(info);
		if (vc == columnRslt_base_cur_amt_dec_place) return doRslt_base_cur_amt_dec_place_VC(info);
		if (vc == columnRslt_xrate) return doRslt_xrate_VC(info);
		if (vc == columnRslt_ptax_xrate) return doRslt_ptax_xrate_VC(info);
		if (vc == columnRslt_bp_cd) return doRslt_bp_cd_VC(info);
		if (vc == columnRslt_bp_nm) return doRslt_bp_nm_VC(info);
		if (vc == columnRslt_dlv_id_typ) return doRslt_dlv_id_typ_VC(info);
		if (vc == columnRslt_dlv_id_typ_nm) return doRslt_dlv_id_typ_nm_VC(info);
		if (vc == columnRslt_dlv_id_cd) return doRslt_dlv_id_cd_VC(info);
		if (vc == columnRslt_dlv_id_nm) return doRslt_dlv_id_nm_VC(info);
		if (vc == columnRslt_arr_loc_cd) return doRslt_arr_loc_cd_VC(info);
		if (vc == columnRslt_arr_loc_nm) return doRslt_arr_loc_nm_VC(info);
		if (vc == columnRslt_sppl_id_typ) return doRslt_sppl_id_typ_VC(info);
		if (vc == columnRslt_sppl_id_typ_nm) return doRslt_sppl_id_typ_nm_VC(info);
		if (vc == columnRslt_sppl_id_cd) return doRslt_sppl_id_cd_VC(info);
		if (vc == columnRslt_sppl_id_nm) return doRslt_sppl_id_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_trd_rmrks) return doRslt_trd_rmrks_VC(info);
		if (vc == columnRslt_sls_basis_typ) return doRslt_sls_basis_typ_VC(info);
		if (vc == columnRslt_sls_basis_typ_nm) return doRslt_sls_basis_typ_nm_VC(info);
		if (vc == columnRslt_slip_prnt_flg) return doRslt_slip_prnt_flg_VC(info);
		if (vc == columnRslt_sls_prnt_flg) return doRslt_sls_prnt_flg_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		return true;
	}

	/**
	 * [Rslt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_slip_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_slip_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inc_past_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_slip_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_slip_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ship_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[last_po_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_last_po_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_ptn_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_calc_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_tax_calc_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_cur_amt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ptax_xrate_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[arr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_arr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[slip_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_slip_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sls_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sls_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * NotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param nc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNCEvent(MCNCBeans nc, MCEventInfo info) {
		super.doNCEvent(nc, info);
		if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_bp_cd) doCnd_bp_cd_NC(info);
		else if (nc == Cnd_bp_nm) doCnd_bp_nm_NC(info);
		else if (nc == Cnd_dpt_cd) doCnd_dpt_cd_NC(info);
		else if (nc == Cnd_dpt_nm) doCnd_dpt_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NC(info);
		else if (nc == Cnd_slo_no) doCnd_slo_no_NC(info);
		else if (nc == Cnd_dlv_slip_inst_no) doCnd_dlv_slip_inst_no_NC(info);
		else if (nc == Cnd_dlv_slip_act_no) doCnd_dlv_slip_act_no_NC(info);
		else if (nc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NC(info);
		else if (nc == Cnd_po_no) doCnd_po_no_NC(info);
		else if (nc == Cnd_trd_rmrks) doCnd_trd_rmrks_NC(info);
		else if (nc == Cnd_inc_past_flg) doCnd_inc_past_flg_NC(info);
		else if (nc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NC(info);
		else if (nc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NC(info);
		else if (nc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NC(info);
		else if (nc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NC(info);
		else if (nc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NC(info);
		else if (nc == columnRslt_slo_no) doRslt_slo_no_NC(info);
		else if (nc == columnRslt_dlv_slip_inst_no) doRslt_dlv_slip_inst_no_NC(info);
		else if (nc == columnRslt_dlv_slip_act_no) doRslt_dlv_slip_act_no_NC(info);
		else if (nc == columnRslt_sls_act_no) doRslt_sls_act_no_NC(info);
		else if (nc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NC(info);
		else if (nc == columnRslt_po_no) doRslt_po_no_NC(info);
		else if (nc == columnRslt_po_rev) doRslt_po_rev_NC(info);
		else if (nc == columnRslt_last_po_rev) doRslt_last_po_rev_NC(info);
		else if (nc == columnRslt_dpt_cd) doRslt_dpt_cd_NC(info);
		else if (nc == columnRslt_dpt_nm) doRslt_dpt_nm_NC(info);
		else if (nc == columnRslt_usr_cd) doRslt_usr_cd_NC(info);
		else if (nc == columnRslt_usr_nm) doRslt_usr_nm_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_trd_cd) doRslt_trd_cd_NC(info);
		else if (nc == columnRslt_trd_nm) doRslt_trd_nm_NC(info);
		else if (nc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NC(info);
		else if (nc == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NC(info);
		else if (nc == columnRslt_tax_calc_typ) doRslt_tax_calc_typ_NC(info);
		else if (nc == columnRslt_tax_calc_typ_nm) doRslt_tax_calc_typ_nm_NC(info);
		else if (nc == columnRslt_cst_po_no) doRslt_cst_po_no_NC(info);
		else if (nc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NC(info);
		else if (nc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NC(info);
		else if (nc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_base_cur_cd) doRslt_base_cur_cd_NC(info);
		else if (nc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NC(info);
		else if (nc == columnRslt_xrate) doRslt_xrate_NC(info);
		else if (nc == columnRslt_ptax_xrate) doRslt_ptax_xrate_NC(info);
		else if (nc == columnRslt_bp_cd) doRslt_bp_cd_NC(info);
		else if (nc == columnRslt_bp_nm) doRslt_bp_nm_NC(info);
		else if (nc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NC(info);
		else if (nc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NC(info);
		else if (nc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NC(info);
		else if (nc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NC(info);
		else if (nc == columnRslt_arr_loc_cd) doRslt_arr_loc_cd_NC(info);
		else if (nc == columnRslt_arr_loc_nm) doRslt_arr_loc_nm_NC(info);
		else if (nc == columnRslt_sppl_id_typ) doRslt_sppl_id_typ_NC(info);
		else if (nc == columnRslt_sppl_id_typ_nm) doRslt_sppl_id_typ_nm_NC(info);
		else if (nc == columnRslt_sppl_id_cd) doRslt_sppl_id_cd_NC(info);
		else if (nc == columnRslt_sppl_id_nm) doRslt_sppl_id_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_trd_rmrks) doRslt_trd_rmrks_NC(info);
		else if (nc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NC(info);
		else if (nc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NC(info);
		else if (nc == columnRslt_slip_prnt_flg) doRslt_slip_prnt_flg_NC(info);
		else if (nc == columnRslt_sls_prnt_flg) doRslt_sls_prnt_flg_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
	}

	/**
	 * [Rslt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_po_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_po_rev_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_bp_cd) doCnd_bp_cd_NE(info);
		else if (ne == Cnd_bp_nm) doCnd_bp_nm_NE(info);
		else if (ne == Cnd_dpt_cd) doCnd_dpt_cd_NE(info);
		else if (ne == Cnd_dpt_nm) doCnd_dpt_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NE(info);
		else if (ne == Cnd_slo_no) doCnd_slo_no_NE(info);
		else if (ne == Cnd_dlv_slip_inst_no) doCnd_dlv_slip_inst_no_NE(info);
		else if (ne == Cnd_dlv_slip_act_no) doCnd_dlv_slip_act_no_NE(info);
		else if (ne == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NE(info);
		else if (ne == Cnd_po_no) doCnd_po_no_NE(info);
		else if (ne == Cnd_trd_rmrks) doCnd_trd_rmrks_NE(info);
		else if (ne == Cnd_inc_past_flg) doCnd_inc_past_flg_NE(info);
		else if (ne == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NE(info);
		else if (ne == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NE(info);
		else if (ne == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NE(info);
		else if (ne == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NE(info);
		else if (ne == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NE(info);
		else if (ne == columnRslt_slo_no) doRslt_slo_no_NE(info);
		else if (ne == columnRslt_dlv_slip_inst_no) doRslt_dlv_slip_inst_no_NE(info);
		else if (ne == columnRslt_dlv_slip_act_no) doRslt_dlv_slip_act_no_NE(info);
		else if (ne == columnRslt_sls_act_no) doRslt_sls_act_no_NE(info);
		else if (ne == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NE(info);
		else if (ne == columnRslt_po_no) doRslt_po_no_NE(info);
		else if (ne == columnRslt_po_rev) doRslt_po_rev_NE(info);
		else if (ne == columnRslt_last_po_rev) doRslt_last_po_rev_NE(info);
		else if (ne == columnRslt_dpt_cd) doRslt_dpt_cd_NE(info);
		else if (ne == columnRslt_dpt_nm) doRslt_dpt_nm_NE(info);
		else if (ne == columnRslt_usr_cd) doRslt_usr_cd_NE(info);
		else if (ne == columnRslt_usr_nm) doRslt_usr_nm_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_trd_cd) doRslt_trd_cd_NE(info);
		else if (ne == columnRslt_trd_nm) doRslt_trd_nm_NE(info);
		else if (ne == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NE(info);
		else if (ne == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NE(info);
		else if (ne == columnRslt_tax_calc_typ) doRslt_tax_calc_typ_NE(info);
		else if (ne == columnRslt_tax_calc_typ_nm) doRslt_tax_calc_typ_nm_NE(info);
		else if (ne == columnRslt_cst_po_no) doRslt_cst_po_no_NE(info);
		else if (ne == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NE(info);
		else if (ne == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NE(info);
		else if (ne == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_base_cur_cd) doRslt_base_cur_cd_NE(info);
		else if (ne == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NE(info);
		else if (ne == columnRslt_xrate) doRslt_xrate_NE(info);
		else if (ne == columnRslt_ptax_xrate) doRslt_ptax_xrate_NE(info);
		else if (ne == columnRslt_bp_cd) doRslt_bp_cd_NE(info);
		else if (ne == columnRslt_bp_nm) doRslt_bp_nm_NE(info);
		else if (ne == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NE(info);
		else if (ne == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NE(info);
		else if (ne == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NE(info);
		else if (ne == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NE(info);
		else if (ne == columnRslt_arr_loc_cd) doRslt_arr_loc_cd_NE(info);
		else if (ne == columnRslt_arr_loc_nm) doRslt_arr_loc_nm_NE(info);
		else if (ne == columnRslt_sppl_id_typ) doRslt_sppl_id_typ_NE(info);
		else if (ne == columnRslt_sppl_id_typ_nm) doRslt_sppl_id_typ_nm_NE(info);
		else if (ne == columnRslt_sppl_id_cd) doRslt_sppl_id_cd_NE(info);
		else if (ne == columnRslt_sppl_id_nm) doRslt_sppl_id_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_trd_rmrks) doRslt_trd_rmrks_NE(info);
		else if (ne == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NE(info);
		else if (ne == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NE(info);
		else if (ne == columnRslt_slip_prnt_flg) doRslt_slip_prnt_flg_NE(info);
		else if (ne == columnRslt_sls_prnt_flg) doRslt_sls_prnt_flg_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
	}

	/**
	 * [Rslt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_po_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_po_rev_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_bp_cd) doCnd_bp_cd_NX(info);
		else if (nx == Cnd_bp_nm) doCnd_bp_nm_NX(info);
		else if (nx == Cnd_dpt_cd) doCnd_dpt_cd_NX(info);
		else if (nx == Cnd_dpt_nm) doCnd_dpt_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_dlv_slip_no) doCnd_dlv_slip_no_NX(info);
		else if (nx == Cnd_slo_no) doCnd_slo_no_NX(info);
		else if (nx == Cnd_dlv_slip_inst_no) doCnd_dlv_slip_inst_no_NX(info);
		else if (nx == Cnd_dlv_slip_act_no) doCnd_dlv_slip_act_no_NX(info);
		else if (nx == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_NX(info);
		else if (nx == Cnd_po_no) doCnd_po_no_NX(info);
		else if (nx == Cnd_trd_rmrks) doCnd_trd_rmrks_NX(info);
		else if (nx == Cnd_inc_past_flg) doCnd_inc_past_flg_NX(info);
		else if (nx == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_NX(info);
		else if (nx == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_NX(info);
		else if (nx == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_NX(info);
		else if (nx == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_NX(info);
		else if (nx == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_NX(info);
		else if (nx == columnRslt_slo_no) doRslt_slo_no_NX(info);
		else if (nx == columnRslt_dlv_slip_inst_no) doRslt_dlv_slip_inst_no_NX(info);
		else if (nx == columnRslt_dlv_slip_act_no) doRslt_dlv_slip_act_no_NX(info);
		else if (nx == columnRslt_sls_act_no) doRslt_sls_act_no_NX(info);
		else if (nx == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_NX(info);
		else if (nx == columnRslt_po_no) doRslt_po_no_NX(info);
		else if (nx == columnRslt_po_rev) doRslt_po_rev_NX(info);
		else if (nx == columnRslt_last_po_rev) doRslt_last_po_rev_NX(info);
		else if (nx == columnRslt_dpt_cd) doRslt_dpt_cd_NX(info);
		else if (nx == columnRslt_dpt_nm) doRslt_dpt_nm_NX(info);
		else if (nx == columnRslt_usr_cd) doRslt_usr_cd_NX(info);
		else if (nx == columnRslt_usr_nm) doRslt_usr_nm_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_trd_cd) doRslt_trd_cd_NX(info);
		else if (nx == columnRslt_trd_nm) doRslt_trd_nm_NX(info);
		else if (nx == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_NX(info);
		else if (nx == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_NX(info);
		else if (nx == columnRslt_tax_calc_typ) doRslt_tax_calc_typ_NX(info);
		else if (nx == columnRslt_tax_calc_typ_nm) doRslt_tax_calc_typ_nm_NX(info);
		else if (nx == columnRslt_cst_po_no) doRslt_cst_po_no_NX(info);
		else if (nx == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_NX(info);
		else if (nx == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_NX(info);
		else if (nx == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_base_cur_cd) doRslt_base_cur_cd_NX(info);
		else if (nx == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_NX(info);
		else if (nx == columnRslt_xrate) doRslt_xrate_NX(info);
		else if (nx == columnRslt_ptax_xrate) doRslt_ptax_xrate_NX(info);
		else if (nx == columnRslt_bp_cd) doRslt_bp_cd_NX(info);
		else if (nx == columnRslt_bp_nm) doRslt_bp_nm_NX(info);
		else if (nx == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_NX(info);
		else if (nx == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_NX(info);
		else if (nx == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_NX(info);
		else if (nx == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_NX(info);
		else if (nx == columnRslt_arr_loc_cd) doRslt_arr_loc_cd_NX(info);
		else if (nx == columnRslt_arr_loc_nm) doRslt_arr_loc_nm_NX(info);
		else if (nx == columnRslt_sppl_id_typ) doRslt_sppl_id_typ_NX(info);
		else if (nx == columnRslt_sppl_id_typ_nm) doRslt_sppl_id_typ_nm_NX(info);
		else if (nx == columnRslt_sppl_id_cd) doRslt_sppl_id_cd_NX(info);
		else if (nx == columnRslt_sppl_id_nm) doRslt_sppl_id_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_trd_rmrks) doRslt_trd_rmrks_NX(info);
		else if (nx == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_NX(info);
		else if (nx == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_NX(info);
		else if (nx == columnRslt_slip_prnt_flg) doRslt_slip_prnt_flg_NX(info);
		else if (nx == columnRslt_sls_prnt_flg) doRslt_sls_prnt_flg_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
	}

	/**
	 * [Rslt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inc_past_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inc_past_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_po_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_po_rev_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_bp_cd) doCnd_bp_cd_LC(info);
		else if (lc == Cnd_bp_nm) doCnd_bp_nm_LC(info);
		else if (lc == Cnd_dpt_cd) doCnd_dpt_cd_LC(info);
		else if (lc == Cnd_dpt_nm) doCnd_dpt_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_dlv_slip_no) doCnd_dlv_slip_no_LC(info);
		else if (lc == Cnd_slo_no) doCnd_slo_no_LC(info);
		else if (lc == Cnd_dlv_slip_inst_no) doCnd_dlv_slip_inst_no_LC(info);
		else if (lc == Cnd_dlv_slip_act_no) doCnd_dlv_slip_act_no_LC(info);
		else if (lc == Cnd_ship_dlv_slip_no) doCnd_ship_dlv_slip_no_LC(info);
		else if (lc == Cnd_po_no) doCnd_po_no_LC(info);
		else if (lc == Cnd_trd_rmrks) doCnd_trd_rmrks_LC(info);
		else if (lc == columnRslt_dlv_slip_no) doRslt_dlv_slip_no_LC(info);
		else if (lc == columnRslt_dlv_slip_seq) doRslt_dlv_slip_seq_LC(info);
		else if (lc == columnRslt_dlv_slip_rev) doRslt_dlv_slip_rev_LC(info);
		else if (lc == columnRslt_slip_sts_typ) doRslt_slip_sts_typ_LC(info);
		else if (lc == columnRslt_slip_sts_typ_nm) doRslt_slip_sts_typ_nm_LC(info);
		else if (lc == columnRslt_slo_no) doRslt_slo_no_LC(info);
		else if (lc == columnRslt_dlv_slip_inst_no) doRslt_dlv_slip_inst_no_LC(info);
		else if (lc == columnRslt_dlv_slip_act_no) doRslt_dlv_slip_act_no_LC(info);
		else if (lc == columnRslt_sls_act_no) doRslt_sls_act_no_LC(info);
		else if (lc == columnRslt_ship_dlv_slip_no) doRslt_ship_dlv_slip_no_LC(info);
		else if (lc == columnRslt_po_no) doRslt_po_no_LC(info);
		else if (lc == columnRslt_po_rev) doRslt_po_rev_LC(info);
		else if (lc == columnRslt_last_po_rev) doRslt_last_po_rev_LC(info);
		else if (lc == columnRslt_dpt_cd) doRslt_dpt_cd_LC(info);
		else if (lc == columnRslt_dpt_nm) doRslt_dpt_nm_LC(info);
		else if (lc == columnRslt_usr_cd) doRslt_usr_cd_LC(info);
		else if (lc == columnRslt_usr_nm) doRslt_usr_nm_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_trd_cd) doRslt_trd_cd_LC(info);
		else if (lc == columnRslt_trd_nm) doRslt_trd_nm_LC(info);
		else if (lc == columnRslt_trd_ptn_typ) doRslt_trd_ptn_typ_LC(info);
		else if (lc == columnRslt_trd_ptn_typ_nm) doRslt_trd_ptn_typ_nm_LC(info);
		else if (lc == columnRslt_tax_calc_typ) doRslt_tax_calc_typ_LC(info);
		else if (lc == columnRslt_tax_calc_typ_nm) doRslt_tax_calc_typ_nm_LC(info);
		else if (lc == columnRslt_cst_po_no) doRslt_cst_po_no_LC(info);
		else if (lc == columnRslt_trd_cur_cd) doRslt_trd_cur_cd_LC(info);
		else if (lc == columnRslt_trd_cur_nm) doRslt_trd_cur_nm_LC(info);
		else if (lc == columnRslt_trd_cur_amt_dec_place) doRslt_trd_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_base_cur_cd) doRslt_base_cur_cd_LC(info);
		else if (lc == columnRslt_base_cur_amt_dec_place) doRslt_base_cur_amt_dec_place_LC(info);
		else if (lc == columnRslt_xrate) doRslt_xrate_LC(info);
		else if (lc == columnRslt_ptax_xrate) doRslt_ptax_xrate_LC(info);
		else if (lc == columnRslt_bp_cd) doRslt_bp_cd_LC(info);
		else if (lc == columnRslt_bp_nm) doRslt_bp_nm_LC(info);
		else if (lc == columnRslt_dlv_id_typ) doRslt_dlv_id_typ_LC(info);
		else if (lc == columnRslt_dlv_id_typ_nm) doRslt_dlv_id_typ_nm_LC(info);
		else if (lc == columnRslt_dlv_id_cd) doRslt_dlv_id_cd_LC(info);
		else if (lc == columnRslt_dlv_id_nm) doRslt_dlv_id_nm_LC(info);
		else if (lc == columnRslt_arr_loc_cd) doRslt_arr_loc_cd_LC(info);
		else if (lc == columnRslt_arr_loc_nm) doRslt_arr_loc_nm_LC(info);
		else if (lc == columnRslt_sppl_id_typ) doRslt_sppl_id_typ_LC(info);
		else if (lc == columnRslt_sppl_id_typ_nm) doRslt_sppl_id_typ_nm_LC(info);
		else if (lc == columnRslt_sppl_id_cd) doRslt_sppl_id_cd_LC(info);
		else if (lc == columnRslt_sppl_id_nm) doRslt_sppl_id_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_trd_rmrks) doRslt_trd_rmrks_LC(info);
		else if (lc == columnRslt_sls_basis_typ) doRslt_sls_basis_typ_LC(info);
		else if (lc == columnRslt_sls_basis_typ_nm) doRslt_sls_basis_typ_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_slip_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_slip_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_seq_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slip_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slip_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_slip_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_slip_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ship_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ship_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[last_po_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_last_po_rev_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_ptn_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_ptn_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[tax_calc_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_tax_calc_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_cur_amt_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_cur_amt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ptax_xrate]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ptax_xrate_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[arr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_arr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sls_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sls_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_bp_cd]の作成メソッド
	 */
	public MCList getCnd_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsWg(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1490.Srch01")) {
			return new MS_MSBEL1490_Srch01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1490_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1490_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1490_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1490_Srch01Bridge() {
			p_MS_MSBEL1490_Srch01 = new MCParam(PDef.MS_MSBEL1490_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1490_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1490.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1490.RsltR.class));

			p_MS_MSBEL1490_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1490_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1490_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1490_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1490_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1490.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1490.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1490.RsltR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1490.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1490_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1490.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1490_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBE.MSBEP1490.RsltR>)p_MS_MSBEL1490_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}