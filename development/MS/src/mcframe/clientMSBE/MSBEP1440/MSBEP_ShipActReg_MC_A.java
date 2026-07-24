package mcframe.clientMSBE.MSBEP1440;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
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
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch01Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch02Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch03Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Ins01Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Upd01Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Del01Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Prnt01Caller;
import mcframe.clientMSBE.MSBEP1440.MSBEP_ShipActReg_MC.MS_MSBEL1440_Sprt01Caller;

/**
 * 画面"MSBEP_ShipActReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBEP_ShipActReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBEP1440";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * INS,Create,0;UPD,Modify,1;DEL,Cancel,2;REF,View,3 INS,登録する,0;UPD,訂正する,1;DEL,取り消す,2;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_INS = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public MCTextField Cnd_screen_ope = null;
	/**
	 * Search target type 検索対象区分.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_typ = null;
	public MCLabel Cnd_srch_tgt_typ_nm_Label = null;
	/**
	 * Search target type name 検索対象区分名.<p>
	 *
	 */
	public MCTextComboBox Cnd_srch_tgt_typ_nm = null;
	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_srch_tgt_no = null;
	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public MCNumberField Cnd_ship_act_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Cnd_latest_flg = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_non_srch = null;
	// [HdrTab]ブロック関連のField定義
	public MCPanel HdrTabPanel = null;
	public MCTabbedPane HdrTabTab = null;
	// [HdrTab]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_trd_cd_Label = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCTextField Hdr_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCTextField Hdr_trd_ptn_typ = null;
	public MCLabel Hdr_ac_ym_Label = null;
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDateField Hdr_ac_ym = null;
	public MCLabel Hdr_ship_act_no_Label = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ship_act_no = null;
	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public MCNumberField Hdr_ship_act_rev = null;
	/**
	 * Latest 最新.<p>
	 *
	 */
	public MCCheckBox Hdr_latest_flg = null;
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public MCCheckBox Hdr_can_flg = null;
	public MCLabel Hdr_ship_inst_no_Label = null;
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_ship_inst_no = null;
	public MCLabel Hdr_iv_no_Label = null;
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_iv_no = null;
	public MCLabel Hdr_dlv_slip_no_Label = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_slip_no = null;
	public mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H Hdr_ac_dt_p_PPanel;
	public MCDateField Hdr_ac_dt;	// [Hdr]の[ac_dt_p.ac_dt]を[Hdr_ac_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H Hdr_can_ac_dt_p_PPanel;
	public MCDateField Hdr_can_ac_dt_for_input;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_input]を[Hdr_can_ac_dt_for_input]としてエイリアス定義。
	public MCDateField Hdr_can_ac_dt;	// [Hdr]の[can_ac_dt_p.can_ac_dt_for_call]を[Hdr_can_ac_dt]としてエイリアス定義。
	public MCDateField Hdr_ac_dt_after_srch;	// [Hdr]の[can_ac_dt_p.ac_dt_after_srch]を[Hdr_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ship_ymdhm_p_PPanel;
	public MCDateField Hdr_ship_dt;	// [Hdr]の[ship_ymdhm_p.ymd]を[Hdr_ship_dt]としてエイリアス定義。
	public MCDateField Hdr_ship_hm;	// [Hdr]の[ship_ymdhm_p.hm]を[Hdr_ship_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_dlv_ymdhm_p_PPanel;
	public MCDateField Hdr_dlv_dt;	// [Hdr]の[dlv_ymdhm_p.ymd]を[Hdr_dlv_dt]としてエイリアス定義。
	public MCDateField Hdr_dlv_hm;	// [Hdr]の[dlv_ymdhm_p.hm]を[Hdr_dlv_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ss_ymdhm_p_PPanel;
	public MCDateField Hdr_ship_schd_dt;	// [Hdr]の[ss_ymdhm_p.ymd]を[Hdr_ship_schd_dt]としてエイリアス定義。
	public MCDateField Hdr_ship_schd_hm;	// [Hdr]の[ss_ymdhm_p.hm]を[Hdr_ship_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_ds_ymdhm_p_PPanel;
	public MCDateField Hdr_dlv_schd_dt;	// [Hdr]の[ds_ymdhm_p.ymd]を[Hdr_dlv_schd_dt]としてエイリアス定義。
	public MCDateField Hdr_dlv_schd_hm;	// [Hdr]の[ds_ymdhm_p.hm]を[Hdr_dlv_schd_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H Hdr_inst_ymdhm_p_PPanel;
	public MCDateField Hdr_ship_inst_dt;	// [Hdr]の[inst_ymdhm_p.ymd]を[Hdr_ship_inst_dt]としてエイリアス定義。
	public MCDateField Hdr_ship_inst_hm;	// [Hdr]の[inst_ymdhm_p.hm]を[Hdr_ship_inst_hm]としてエイリアス定義。
	public MCLabel Hdr_ship_to_id_typ_Label = null;
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_ship_to_id_typ = null;
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_typ_nm = null;
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_cd = null;
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public MCTextField Hdr_ship_to_id_nm = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_ship_to_addr_p_PPanel;
	public MCButton Hdr_ship_to_show_dtl;	// [Hdr]の[ship_to_addr_p.show_dtl]を[Hdr_ship_to_show_dtl]としてエイリアス定義。
	public MCTextComboBox Hdr_ship_to_lg_grp_cd;	// [Hdr]の[ship_to_addr_p.lg_grp_cd]を[Hdr_ship_to_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_lg_grp_nm;	// [Hdr]の[ship_to_addr_p.lg_grp_nm]を[Hdr_ship_to_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntry_cd;	// [Hdr]の[ship_to_addr_p.cntry_cd]を[Hdr_ship_to_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntry_nm;	// [Hdr]の[ship_to_addr_p.cntry_nm]を[Hdr_ship_to_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_ship_to_zip_cd;	// [Hdr]の[ship_to_addr_p.zip_cd]を[Hdr_ship_to_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr1;	// [Hdr]の[ship_to_addr_p.addr1]を[Hdr_ship_to_addr1]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr2;	// [Hdr]の[ship_to_addr_p.addr2]を[Hdr_ship_to_addr2]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr3;	// [Hdr]の[ship_to_addr_p.addr3]を[Hdr_ship_to_addr3]としてエイリアス定義。
	public MCTextField Hdr_ship_to_addr4;	// [Hdr]の[ship_to_addr_p.addr4]を[Hdr_ship_to_addr4]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntct_dpt;	// [Hdr]の[ship_to_addr_p.cntct_dpt]を[Hdr_ship_to_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_ship_to_cntct_psn;	// [Hdr]の[ship_to_addr_p.cntct_psn]を[Hdr_ship_to_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr_ship_to_tel;	// [Hdr]の[ship_to_addr_p.tel]を[Hdr_ship_to_tel]としてエイリアス定義。
	public MCTextField Hdr_ship_to_fax;	// [Hdr]の[ship_to_addr_p.fax]を[Hdr_ship_to_fax]としてエイリアス定義。
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_to_sundry_flg = null;
	public MCLabel Hdr_via_dlv_typ_Label = null;
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_via_dlv_typ = null;
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public MCTextField Hdr_via_dlv_typ_nm = null;
	public MCLabel Hdr_dlv_id_typ_Label = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_cd = null;
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public MCTextField Hdr_dlv_id_nm = null;
	public mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H Hdr_dlv_addr_p_PPanel;
	public MCButton Hdr_dlv_show_dtl;	// [Hdr]の[dlv_addr_p.show_dtl]を[Hdr_dlv_show_dtl]としてエイリアス定義。
	public MCTextComboBox Hdr_dlv_lg_grp_cd;	// [Hdr]の[dlv_addr_p.lg_grp_cd]を[Hdr_dlv_lg_grp_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_lg_grp_nm;	// [Hdr]の[dlv_addr_p.lg_grp_nm]を[Hdr_dlv_lg_grp_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_cd;	// [Hdr]の[dlv_addr_p.cntry_cd]を[Hdr_dlv_cntry_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntry_nm;	// [Hdr]の[dlv_addr_p.cntry_nm]を[Hdr_dlv_cntry_nm]としてエイリアス定義。
	public MCTextField Hdr_dlv_zip_cd;	// [Hdr]の[dlv_addr_p.zip_cd]を[Hdr_dlv_zip_cd]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr1;	// [Hdr]の[dlv_addr_p.addr1]を[Hdr_dlv_addr1]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr2;	// [Hdr]の[dlv_addr_p.addr2]を[Hdr_dlv_addr2]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr3;	// [Hdr]の[dlv_addr_p.addr3]を[Hdr_dlv_addr3]としてエイリアス定義。
	public MCTextField Hdr_dlv_addr4;	// [Hdr]の[dlv_addr_p.addr4]を[Hdr_dlv_addr4]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_dpt;	// [Hdr]の[dlv_addr_p.cntct_dpt]を[Hdr_dlv_cntct_dpt]としてエイリアス定義。
	public MCTextField Hdr_dlv_cntct_psn;	// [Hdr]の[dlv_addr_p.cntct_psn]を[Hdr_dlv_cntct_psn]としてエイリアス定義。
	public MCTextField Hdr_dlv_tel;	// [Hdr]の[dlv_addr_p.tel]を[Hdr_dlv_tel]としてエイリアス定義。
	public MCTextField Hdr_dlv_fax;	// [Hdr]の[dlv_addr_p.fax]を[Hdr_dlv_fax]としてエイリアス定義。
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_sundry_flg = null;
	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_pri_prnt_flg = null;
	/**
	 * For delivery destination rack/line 納品先棚・ライン対象.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_str_ln_tgt_flg = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_cd = null;
	/**
	 * Delivery destination supplier cd. 納品先発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_dlv_sppl_cd = null;
	public MCLabel Hdr_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Hdr_cst_nm = null;
	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_cst_usr_cd = null;
	/**
	 * Customer PIC name 得意先担当者名.<p>
	 *
	 */
	public MCTextField Hdr_cst_dpt_cd = null;
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public MCCheckBox Hdr_cst_iv_flg = null;
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_rqst_usr_dpt_p_PPanel;
	public MCTextField Hdr_rqst_usr_cd;	// [Hdr]の[rqst_usr_dpt_p.usr_cd]を[Hdr_rqst_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_rqst_usr_nm;	// [Hdr]の[rqst_usr_dpt_p.usr_nm]を[Hdr_rqst_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_rqst_dpt_cd;	// [Hdr]の[rqst_usr_dpt_p.dpt_cd]を[Hdr_rqst_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_rqst_dpt_nm;	// [Hdr]の[rqst_usr_dpt_p.dpt_nm]を[Hdr_rqst_dpt_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H Hdr_ship_usr_dpt_p_PPanel;
	public MCTextField Hdr_ship_usr_cd;	// [Hdr]の[ship_usr_dpt_p.usr_cd]を[Hdr_ship_usr_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_usr_nm;	// [Hdr]の[ship_usr_dpt_p.usr_nm]を[Hdr_ship_usr_nm]としてエイリアス定義。
	public MCTextComboBox Hdr_ship_dpt_cd;	// [Hdr]の[ship_usr_dpt_p.dpt_cd]を[Hdr_ship_dpt_cd]としてエイリアス定義。
	public MCTextField Hdr_ship_dpt_nm;	// [Hdr]の[ship_usr_dpt_p.dpt_nm]を[Hdr_ship_dpt_nm]としてエイリアス定義。
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public MCCheckBox Hdr_lot_chk_off_flg = null;
	public MCLabel Hdr_ship_fr_lg_grp_cd_Label = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public MCTextField Hdr_ship_fr_lg_grp_nm = null;
	public MCLabel Hdr_ship_term_cd_Label = null;
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_ship_term_cd = null;
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public MCTextField Hdr_ship_term_nm = null;
	public MCLabel Hdr_ship_wt_Label = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumberField Hdr_ship_wt = null;
	public MCLabel Hdr_ship_dim_Label = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumberField Hdr_ship_dim = null;
	/**
	 * Delivery note issued (At order) 指図時納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_inst_dlv_prnted_flg = null;
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_slip_prnt_flg = null;
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_adv_prnt_flg = null;
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_dlv_slip_prnted_flg = null;
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public MCCheckBox Hdr_ship_adv_prnted_flg = null;
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public MCCheckBox Hdr_uplnd_flg = null;
	public MCLabel Hdr_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Hdr_intr_rmrks = null;
	public MCLabel Hdr_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Hdr_sub_char1 = null;
	public MCLabel Hdr_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Hdr_sub_char2 = null;
	public MCLabel Hdr_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Hdr_sub_char3 = null;
	public MCLabel Hdr_ins_usr_id_Label = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_ins_usr_nm = null;
	public MCLabel Hdr_ins_func_id_Label = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCTextField Hdr_ins_func_nm = null;
	public MCLabel Hdr_upd_usr_id_Label = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_upd_usr_nm = null;
	public MCLabel Hdr_upd_func_id_Label = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCTextField Hdr_upd_func_nm = null;
	public MCLabel Hdr_ins_ts_Label = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestampField Hdr_ins_ts = null;
	public MCLabel Hdr_upd_ts_Label = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestampField Hdr_upd_ts = null;
	public MCLabel Hdr_upd_srv_req_no_Label = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCTextField Hdr_upd_srv_req_no = null;
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_prnt_lcl_cd = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMSBE.MSBEP1440.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pr_sts_typ = null;
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pr_sts_typ_nm = null;
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_cd = null;
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_nm = null;
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_ptn_typ = null;
	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cststk_flg = null;
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loan_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_cd = null;
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_itm_nm = null;
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_itm_nm = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_mng_typ = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sundry_itm_flg = null;
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dscnt_itm_flg = null;
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_mng_typ = null;
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_mng_typ = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_mng_typ = null;
	public mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D Dtl_lot_no_p_PPanel;
	public MCColumnConfig columnDtl_crt_lot_flg;// [Dtl]の[lot_no_p.crt_lot_flg]を[columnDtl_crt_lot_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_lot_no;// [Dtl]の[lot_no_p.lot_no]を[columnDtl_lot_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_sublot_no;// [Dtl]の[lot_no_p.sublot_no]を[columnDtl_sublot_no]としてエイリアス定義。
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ver_flg = null;
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Dtl_ver_no_p_PPanel;
	public MCColumnConfig columnDtl_ver_no;// [Dtl]の[ver_no_p.ver_no]を[columnDtl_ver_no]としてエイリアス定義。
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_lot_mix_flg = null;
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_not_sublot_mix_flg = null;
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_cd = null;
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_nm = null;
	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_base_qty = null;
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_conv_qty = null;
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_dec_place = null;
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_trd_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_trd_unit_qty;// [Dtl]の[trd_unit_qty_p.qty]を[columnDtl_trd_unit_qty]としてエイリアス定義。
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public MCColumnConfig columnDtl_abort_flg = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_dec_place = null;
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_rnd_typ = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_base_unit_qty_p_PPanel;
	public MCColumnConfig columnDtl_base_unit_qty;// [Dtl]の[base_unit_qty_p.qty]を[columnDtl_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_schd_qty_p_PPanel;
	public MCColumnConfig columnDtl_schd_qty;// [Dtl]の[schd_qty_p.qty]を[columnDtl_schd_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_inst_qty_p_PPanel;
	public MCColumnConfig columnDtl_inst_qty;// [Dtl]の[inst_qty_p.qty]を[columnDtl_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_ship_qty_p_PPanel;
	public MCColumnConfig columnDtl_ship_qty;// [Dtl]の[ship_qty_p.qty]を[columnDtl_ship_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_sls_qty_p_PPanel;
	public MCColumnConfig columnDtl_sls_qty;// [Dtl]の[sls_qty_p.qty]を[columnDtl_sls_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_arr_qty_p_PPanel;
	public MCColumnConfig columnDtl_arr_qty;// [Dtl]の[arr_qty_p.qty]を[columnDtl_arr_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_iv_qty_p_PPanel;
	public MCColumnConfig columnDtl_iv_qty;// [Dtl]の[iv_qty_p.qty]を[columnDtl_iv_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Dtl_ret_qty_p_PPanel;
	public MCColumnConfig columnDtl_ret_qty;// [Dtl]の[ret_qty_p.qty]を[columnDtl_ret_qty]としてエイリアス定義。
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_act_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_qty;// [Dtl]の[act_cont_qty_p.cont_qty]を[columnDtl_act_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Dtl_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_act_cont_fctr;// [Dtl]の[act_cont_fctr_p.act_cont_fctr]を[columnDtl_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Dtl_std_cont_qty_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_qty;// [Dtl]の[std_cont_qty_p.cont_qty]を[columnDtl_std_cont_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Dtl_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnDtl_std_cont_fctr;// [Dtl]の[std_cont_fctr_p.std_cont_fctr]を[columnDtl_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Dtl_cont_fctr_unit_p_PPanel;
	public MCColumnConfig columnDtl_cont_fctr_unit_cd;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_cd]を[columnDtl_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_cont_fctr_unit_nm;// [Dtl]の[cont_fctr_unit_p.cont_fctr_unit_nm]を[columnDtl_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_dec_place = null;
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cont_fctr_rnd_typ = null;
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_fr_lg_grp_cd = null;
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_cd = null;
	/**
	 * Shipping location name 出荷場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_nm = null;
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_mng_typ = null;
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_str_ln_tgt_flg = null;
	/**
	 * Shipping location supplier cd. 出荷場所発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_loc_sppl_cd = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_ship_str_ln_cd;// [Dtl]の[str_ln_p.str_ln_cd]を[columnDtl_ship_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_ship_str_ln_nm;// [Dtl]の[str_ln_p.str_ln_nm]を[columnDtl_ship_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_ship_str_ln_cd_none_flg;// [Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnDtl_ship_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_quality_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_gd_nm = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_sno1;// [Dtl]の[sno_wrk_no_p.sno1]を[columnDtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno1_null_flg;// [Dtl]の[sno_wrk_no_p.sno1_null_flg]を[columnDtl_sno1_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2;// [Dtl]の[sno_wrk_no_p.sno2]を[columnDtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno2_null_flg;// [Dtl]の[sno_wrk_no_p.sno2_null_flg]を[columnDtl_sno2_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3;// [Dtl]の[sno_wrk_no_p.sno3]を[columnDtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno3_null_flg;// [Dtl]の[sno_wrk_no_p.sno3_null_flg]を[columnDtl_sno3_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4;// [Dtl]の[sno_wrk_no_p.sno4]を[columnDtl_sno4]としてエイリアス定義。
	public MCColumnConfig columnDtl_sno4_null_flg;// [Dtl]の[sno_wrk_no_p.sno4_null_flg]を[columnDtl_sno4_null_flg]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_no;// [Dtl]の[sno_wrk_no_p.wrk_no]を[columnDtl_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnDtl_wrk_nm;// [Dtl]の[sno_wrk_no_p.wrk_nm]を[columnDtl_wrk_nm]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Dtl_schd_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnDtl_schd_sno1;// [Dtl]の[schd_sno_wrk_no_p.sno1]を[columnDtl_schd_sno1]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno2;// [Dtl]の[schd_sno_wrk_no_p.sno2]を[columnDtl_schd_sno2]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno3;// [Dtl]の[schd_sno_wrk_no_p.sno3]を[columnDtl_schd_sno3]としてエイリアス定義。
	public MCColumnConfig columnDtl_schd_sno4;// [Dtl]の[schd_sno_wrk_no_p.sno4]を[columnDtl_schd_sno4]としてエイリアス定義。
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_id_typ_nm = null;
	public mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D Dtl_stk_bp_p_PPanel;
	public MCColumnConfig columnDtl_stk_bp_cd;// [Dtl]の[stk_bp_p.stk_bp_cd]を[columnDtl_stk_bp_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_stk_bp_nm;// [Dtl]の[stk_bp_p.stk_bp_nm]を[columnDtl_stk_bp_nm]としてエイリアス定義。
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_stk_arrv_bp_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sppl_cd = null;
	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_wt = null;
	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_dim = null;
	/**
	 * Unit weight 単位重量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_wt = null;
	/**
	 * Unit volume 単位容積.<p>
	 *
	 */
	public MCColumnConfig columnDtl_unit_dim = null;
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_typ = null;
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_typ_nm = null;
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_id_nm = null;
	public mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D Dtl_dlv_addr_p_PPanel;
	public MCColumnConfig columnDtl_dlv_show_dtl;// [Dtl]の[dlv_addr_p.show_dtl]を[columnDtl_dlv_show_dtl]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_cd;// [Dtl]の[dlv_addr_p.cntry_cd]を[columnDtl_dlv_cntry_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntry_nm;// [Dtl]の[dlv_addr_p.cntry_nm]を[columnDtl_dlv_cntry_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_zip_cd;// [Dtl]の[dlv_addr_p.zip_cd]を[columnDtl_dlv_zip_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr1;// [Dtl]の[dlv_addr_p.addr1]を[columnDtl_dlv_addr1]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr2;// [Dtl]の[dlv_addr_p.addr2]を[columnDtl_dlv_addr2]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr3;// [Dtl]の[dlv_addr_p.addr3]を[columnDtl_dlv_addr3]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_addr4;// [Dtl]の[dlv_addr_p.addr4]を[columnDtl_dlv_addr4]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_dpt;// [Dtl]の[dlv_addr_p.cntct_dpt]を[columnDtl_dlv_cntct_dpt]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_cntct_psn;// [Dtl]の[dlv_addr_p.cntct_psn]を[columnDtl_dlv_cntct_psn]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_tel;// [Dtl]の[dlv_addr_p.tel]を[columnDtl_dlv_tel]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_fax;// [Dtl]の[dlv_addr_p.fax]を[columnDtl_dlv_fax]としてエイリアス定義。
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_sundry_flg = null;
	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public MCColumnConfig columnDtl_pri_prnt_flg = null;
	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_trd_flg = null;
	/**
	 * For delivery destination rack/line 納品先棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Dtl_dlv_str_ln_p_PPanel;
	public MCColumnConfig columnDtl_dlv_str_ln_cd;// [Dtl]の[dlv_str_ln_p.str_ln_cd]を[columnDtl_dlv_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_str_ln_nm;// [Dtl]の[dlv_str_ln_p.str_ln_nm]を[columnDtl_dlv_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnDtl_dlv_str_ln_cd_none_flg;// [Dtl]の[dlv_str_ln_p.str_ln_cd_none_flg]を[columnDtl_dlv_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Delivery destination supplier cd. 納品先発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_sppl_cd = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_nm = null;
	/**
	 * Customer invoice 得意先インボイス.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_iv_flg = null;
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_no = null;
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_po_d_no = null;
	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_dlv_inst_no = null;
	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cst_dlv_inst_d_no = null;
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_cd = null;
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rsn_nm = null;
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_acxfr_flg = null;
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public MCColumnConfig columnDtl_acxfr_gi_flg = null;
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_cd = null;
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bd_dpt_nm = null;
	/**
	 * Unrequired configuration check 構成チェック不要.<p>
	 *
	 */
	public MCColumnConfig columnDtl_skip_chk_ship_flg = null;
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_dlv_slip_no = null;
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_prov_act_no = null;
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_ac_dt = null;
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_cnt_rmrks = null;
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_arr_cnt_rmrks = null;
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_rmrks = null;
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_trd_d_rmrks = null;
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public MCColumnConfig columnDtl_intr_d_rmrks = null;
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char1 = null;
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char2 = null;
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sub_char3 = null;
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_no = null;
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_slo_d_no = null;
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_xfr_schd_no = null;
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_no = null;
	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_alloc_sts_no = null;
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_d_no = null;
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_no = null;
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_iv_d_no = null;
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_no = null;
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_slip_d_no = null;
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_no = null;
	/**
	 * Shipping result details No. 出荷実績明細ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_act_d_no = null;
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wms_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_sys_nm = null;
	/**
	 * External shipping result No. 外部出荷実績ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ext_ship_act_no = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_disp_seq = null;
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_assort_typ = null;
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_set_itm_grp_no = null;
	/**
	 * Shipping order type 出荷指図区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_inst_typ = null;
	/**
	 * Shipping schedule location cd. 出荷予定場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_loc_cd = null;
	/**
	 * Shipping schedule location supplier cd. 出荷予定場所発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_loc_sppl_cd = null;
	/**
	 * Shipping schedule rack/line cd. 出荷予定棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ship_schd_str_ln_cd = null;
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sync_flg = null;
	/**
	 * Not updatable 更新不可.<p>
	 *
	 */
	public MCColumnConfig columnDtl_read_only_flg = null;
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCColumnConfig columnDtl_base_unit_qty_bef = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	public mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H Btn_Btn_open_MSBEP0500_PPanel;
	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_dlv_slip = null;
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public MCButton Btn_prnt_ship_adv = null;
	/**
	 * Issue identification tag 現品票発行.<p>
	 *
	 */
	public MCButton Btn_open_MSBEP0110 = null;
	/**
	 * Acquire supply date 支給日取得.<p>
	 *
	 */
	public MCButton Btn_sprt_ac_dt = null;
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H Btn_menu_move_p_PPanel;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Btn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Btn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Btn_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins_uplnd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Individual issue 個別発行.<p>
	 *
	 */
	public MCCheckBox Btn_indiv_prnt_flg = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [INS_NON]モードを表す定数 */
	public static final String INS_NON = "INS_NON";
	/** [INS_SRCH]モードを表す定数 */
	public static final String INS_SRCH = "INS_SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [UPD_NON]モードを表す定数 */
	public static final String UPD_NON = "UPD_NON";
	/** [UPD_SRCH]モードを表す定数 */
	public static final String UPD_SRCH = "UPD_SRCH";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [DEL_NON]モードを表す定数 */
	public static final String DEL_NON = "DEL_NON";
	/** [DEL_SRCH]モードを表す定数 */
	public static final String DEL_SRCH = "DEL_SRCH";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [REF_NON]モードを表す定数 */
	public static final String REF_NON = "REF_NON";
	/** [REF_SRCH]モードを表す定数 */
	public static final String REF_SRCH = "REF_SRCH";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";
	/** [FIX_I_NON]モードを表す定数 */
	public static final String FIX_I_NON = "FIX_I_NON";
	/** [FIX_I_SRCH]モードを表す定数 */
	public static final String FIX_I_SRCH = "FIX_I_SRCH";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX_U_NON]モードを表す定数 */
	public static final String FIX_U_NON = "FIX_U_NON";
	/** [FIX_U_SRCH]モードを表す定数 */
	public static final String FIX_U_SRCH = "FIX_U_SRCH";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [FIX_D_NON]モードを表す定数 */
	public static final String FIX_D_NON = "FIX_D_NON";
	/** [FIX_D_SRCH]モードを表す定数 */
	public static final String FIX_D_SRCH = "FIX_D_SRCH";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, INS, INS_NON, INS_SRCH, UPD, UPD_NON, UPD_SRCH, DEL, DEL_NON, DEL_SRCH, REF, REF_NON, REF_SRCH, FIX_I, FIX_I_NON, FIX_I_SRCH, FIX_U, FIX_U_NON, FIX_U_SRCH, FIX_D, FIX_D_NON, FIX_D_SRCH};
	
	/** [MS_MSBEL1440_Srch01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch01Caller createMS_MSBEL1440_Srch01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Srch01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Srch01]の呼び出し */
	protected void callMS_MSBEL1440_Srch01() {
		MCCaller caller = createMS_MSBEL1440_Srch01();
		caller.exec();
	}
	/** [MS_MSBEL1440_Srch02]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch02Caller createMS_MSBEL1440_Srch02() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch02Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch02Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Srch02Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch02Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Srch02]の呼び出し */
	protected void callMS_MSBEL1440_Srch02() {
		MCCaller caller = createMS_MSBEL1440_Srch02();
		caller.exec();
	}
	/** [MS_MSBEL1440_Srch03]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch03Caller createMS_MSBEL1440_Srch03() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Srch03Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch03Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Srch03Caller<MSBEP_ShipActReg, MS_MSBEL1440_Srch03Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Srch03]の呼び出し */
	protected void callMS_MSBEL1440_Srch03() {
		MCCaller caller = createMS_MSBEL1440_Srch03();
		caller.exec();
	}
	/** [MS_MSBEL1440_Ins01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Ins01Caller createMS_MSBEL1440_Ins01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Ins01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Ins01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Ins01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Ins01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Ins01]の呼び出し */
	protected void callMS_MSBEL1440_Ins01() {
		MCCaller caller = createMS_MSBEL1440_Ins01();
		caller.exec();
	}
	/** [MS_MSBEL1440_Upd01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Upd01Caller createMS_MSBEL1440_Upd01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Upd01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Upd01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Upd01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Upd01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Upd01]の呼び出し */
	protected void callMS_MSBEL1440_Upd01() {
		MCCaller caller = createMS_MSBEL1440_Upd01();
		caller.exec();
	}
	/** [MS_MSBEL1440_Del01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Del01Caller createMS_MSBEL1440_Del01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Del01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Del01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Del01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Del01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Del01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Del01]の呼び出し */
	protected void callMS_MSBEL1440_Del01() {
		MCCaller caller = createMS_MSBEL1440_Del01();
		caller.exec();
	}
	/** [MS_MSBEL1440_Prnt01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Prnt01Caller createMS_MSBEL1440_Prnt01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Prnt01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Prnt01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Prnt01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Prnt01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Prnt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Prnt01]の呼び出し */
	protected void callMS_MSBEL1440_Prnt01() {
		MCCaller caller = createMS_MSBEL1440_Prnt01();
		caller.exec();
	}
	/** [MS_MSBEL1440_Sprt01]のCallerの作成 */
	protected MSBEP_ShipActReg_MC.MS_MSBEL1440_Sprt01Caller createMS_MSBEL1440_Sprt01() {
		MSBEP_ShipActReg_MC.MS_MSBEL1440_Sprt01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Sprt01Bridge>
		caller = ((MSBEP_ShipActReg_MC)this).new MS_MSBEL1440_Sprt01Caller<MSBEP_ShipActReg, MS_MSBEL1440_Sprt01Bridge>(
					(MSBEP_ShipActReg)this, new MS_MSBEL1440_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBEL1440_Sprt01]の呼び出し */
	protected void callMS_MSBEL1440_Sprt01() {
		MCCaller caller = createMS_MSBEL1440_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1440.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1440.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1440.DtlR> aDtlL;
	/** [Dtl2]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> aDtl2L;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBE.MSBEP1440.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBE.MSBEP1440.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1440.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBE.MSBEP1440.CndR createCndR() {
		return mcframe.clientMSBE.MSBEP1440.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMSBE.MSBEP1440.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1440.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMSBE.MSBEP1440.HdrR createHdrR() {
		return mcframe.clientMSBE.MSBEP1440.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMSBE.MSBEP1440.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1440.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMSBE.MSBEP1440.DtlR createDtlR() {
		return mcframe.clientMSBE.MSBEP1440.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMSBE.MSBEP1440.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class);
	}

	/**
	 * DtlTableを初期化します。
	 */
	protected void createDtlTable(){
		if(DtlTable == null){
			DtlTable = beansFactory.createTable2("Dtl.table");
		}
	}

	/**
	 * コピーによってaDtl2Lを設定します。
	 *
	 * aDtl2Lのインスタンスは変更されません。
	 *
	 * @param dataset Dtl2L
	 */
	public void setDtl2L(MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> aList) {
		if (getDtl2L() != aList) {
			getDtl2L().setAll(aList);
		}
	}

	/**
	 * [Dtl2]ブロックのコンテナaDtl2Lを返します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> getDtl2L() {
		return aDtl2L;
	}

	/**
	 * aDtl2Rを作成します。
	 *
	 * @return Dtl2R
	 */
	public mcframe.clientMSBE.MSBEP1440.Dtl2R createDtl2R() {
		return mcframe.clientMSBE.MSBEP1440.Dtl2R.create();
	}

	/**
	 * aDtl2Lを作成します。
	 *
	 * @return Dtl2L
	 */
	public MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> createDtl2L() {
		return MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class);
	}

	/**
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBE.MSBEP1440.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1440.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBE.MSBEP1440.BtnR createBtnR() {
		return mcframe.clientMSBE.MSBEP1440.BtnR.create();
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getDtl2L())) ret.add(getDtl2L());
		if(!MCCollectionUtil.contains(ret, getBtnR())) ret.add(getBtnR());
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
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getDtl2L()) return "Dtl2";
		if(aCnt == getBtnR()) return "Btn";
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
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Dtl2")) return getDtl2L();
		if(bId.equals("Btn")) return getBtnR();
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
		ret.add(CndPanel);
		ret.add(HdrTabPanel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBEP_ShipActReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aDtl2L = createDtl2L();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBEP_ShipActReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aDtl2L = createDtl2L();
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBEP_ShipActReg_MC.jbCreateScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateCnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateHdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateHdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateHdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateDtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateBtn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbCreateEastBtn((MSBEP_ShipActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBEP_ShipActReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBEP_ShipActReg p) {
	}

	/**
	 * [HdrTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdrTab(MSBEP_ShipActReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MSBEP_ShipActReg p) {
		p.Hdr_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.create(p.getHdrR().ac_dt_p());
		p.Hdr_ac_dt_p_PPanel.setName("Hdr.ac_dt_p");
		p.Hdr_ac_dt = p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt;
		p.Hdr_ac_dt.addAliasName("Hdr.ac_dt", p);
		p.Hdr_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.create(p.getHdrR().can_ac_dt_p());
		p.Hdr_can_ac_dt_p_PPanel.setName("Hdr.can_ac_dt_p");
		p.Hdr_can_ac_dt_for_input = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_input;
		p.Hdr_can_ac_dt_for_input.addAliasName("Hdr.can_ac_dt_for_input", p);
		p.Hdr_can_ac_dt = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_can_ac_dt_for_call;
		p.Hdr_can_ac_dt.addAliasName("Hdr.can_ac_dt", p);
		p.Hdr_ac_dt_after_srch = p.Hdr_can_ac_dt_p_PPanel.CanAcDt_ac_dt_after_srch;
		p.Hdr_ac_dt_after_srch.addAliasName("Hdr.ac_dt_after_srch", p);
		p.Hdr_ship_ymdhm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ship_ymdhm_p());
		p.Hdr_ship_ymdhm_p_PPanel.setName("Hdr.ship_ymdhm_p");
		p.Hdr_ship_dt = p.Hdr_ship_ymdhm_p_PPanel.YmdHm_ymd;
		p.Hdr_ship_dt.addAliasName("Hdr.ship_dt", p);
		p.Hdr_ship_hm = p.Hdr_ship_ymdhm_p_PPanel.YmdHm_hm;
		p.Hdr_ship_hm.addAliasName("Hdr.ship_hm", p);
		p.Hdr_dlv_ymdhm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().dlv_ymdhm_p());
		p.Hdr_dlv_ymdhm_p_PPanel.setName("Hdr.dlv_ymdhm_p");
		p.Hdr_dlv_dt = p.Hdr_dlv_ymdhm_p_PPanel.YmdHm_ymd;
		p.Hdr_dlv_dt.addAliasName("Hdr.dlv_dt", p);
		p.Hdr_dlv_hm = p.Hdr_dlv_ymdhm_p_PPanel.YmdHm_hm;
		p.Hdr_dlv_hm.addAliasName("Hdr.dlv_hm", p);
		p.Hdr_ss_ymdhm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ss_ymdhm_p());
		p.Hdr_ss_ymdhm_p_PPanel.setName("Hdr.ss_ymdhm_p");
		p.Hdr_ship_schd_dt = p.Hdr_ss_ymdhm_p_PPanel.YmdHm_ymd;
		p.Hdr_ship_schd_dt.addAliasName("Hdr.ship_schd_dt", p);
		p.Hdr_ship_schd_hm = p.Hdr_ss_ymdhm_p_PPanel.YmdHm_hm;
		p.Hdr_ship_schd_hm.addAliasName("Hdr.ship_schd_hm", p);
		p.Hdr_ds_ymdhm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().ds_ymdhm_p());
		p.Hdr_ds_ymdhm_p_PPanel.setName("Hdr.ds_ymdhm_p");
		p.Hdr_dlv_schd_dt = p.Hdr_ds_ymdhm_p_PPanel.YmdHm_ymd;
		p.Hdr_dlv_schd_dt.addAliasName("Hdr.dlv_schd_dt", p);
		p.Hdr_dlv_schd_hm = p.Hdr_ds_ymdhm_p_PPanel.YmdHm_hm;
		p.Hdr_dlv_schd_hm.addAliasName("Hdr.dlv_schd_hm", p);
		p.Hdr_inst_ymdhm_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getHdrR().inst_ymdhm_p());
		p.Hdr_inst_ymdhm_p_PPanel.setName("Hdr.inst_ymdhm_p");
		p.Hdr_ship_inst_dt = p.Hdr_inst_ymdhm_p_PPanel.YmdHm_ymd;
		p.Hdr_ship_inst_dt.addAliasName("Hdr.ship_inst_dt", p);
		p.Hdr_ship_inst_hm = p.Hdr_inst_ymdhm_p_PPanel.YmdHm_hm;
		p.Hdr_ship_inst_hm.addAliasName("Hdr.ship_inst_hm", p);
		p.Hdr_ship_to_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().ship_to_addr_p());
		p.Hdr_ship_to_addr_p_PPanel.setName("Hdr.ship_to_addr_p");
		p.Hdr_ship_to_show_dtl = p.Hdr_ship_to_addr_p_PPanel.Addr_show_dtl;
		p.Hdr_ship_to_show_dtl.addAliasName("Hdr.ship_to_show_dtl", p);
		p.Hdr_ship_to_lg_grp_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_ship_to_lg_grp_cd.addAliasName("Hdr.ship_to_lg_grp_cd", p);
		p.Hdr_ship_to_lg_grp_nm = p.Hdr_ship_to_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_ship_to_lg_grp_nm.addAliasName("Hdr.ship_to_lg_grp_nm", p);
		p.Hdr_ship_to_cntry_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_ship_to_cntry_cd.addAliasName("Hdr.ship_to_cntry_cd", p);
		p.Hdr_ship_to_cntry_nm = p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_ship_to_cntry_nm.addAliasName("Hdr.ship_to_cntry_nm", p);
		p.Hdr_ship_to_zip_cd = p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_ship_to_zip_cd.addAliasName("Hdr.ship_to_zip_cd", p);
		p.Hdr_ship_to_addr1 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr1;
		p.Hdr_ship_to_addr1.addAliasName("Hdr.ship_to_addr1", p);
		p.Hdr_ship_to_addr2 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr2;
		p.Hdr_ship_to_addr2.addAliasName("Hdr.ship_to_addr2", p);
		p.Hdr_ship_to_addr3 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr3;
		p.Hdr_ship_to_addr3.addAliasName("Hdr.ship_to_addr3", p);
		p.Hdr_ship_to_addr4 = p.Hdr_ship_to_addr_p_PPanel.Addr_addr4;
		p.Hdr_ship_to_addr4.addAliasName("Hdr.ship_to_addr4", p);
		p.Hdr_ship_to_cntct_dpt = p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_ship_to_cntct_dpt.addAliasName("Hdr.ship_to_cntct_dpt", p);
		p.Hdr_ship_to_cntct_psn = p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_ship_to_cntct_psn.addAliasName("Hdr.ship_to_cntct_psn", p);
		p.Hdr_ship_to_tel = p.Hdr_ship_to_addr_p_PPanel.Addr_tel;
		p.Hdr_ship_to_tel.addAliasName("Hdr.ship_to_tel", p);
		p.Hdr_ship_to_fax = p.Hdr_ship_to_addr_p_PPanel.Addr_fax;
		p.Hdr_ship_to_fax.addAliasName("Hdr.ship_to_fax", p);
		p.Hdr_dlv_addr_p_PPanel = mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.create(p.getHdrR().dlv_addr_p());
		p.Hdr_dlv_addr_p_PPanel.setName("Hdr.dlv_addr_p");
		p.Hdr_dlv_show_dtl = p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl;
		p.Hdr_dlv_show_dtl.addAliasName("Hdr.dlv_show_dtl", p);
		p.Hdr_dlv_lg_grp_cd = p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd;
		p.Hdr_dlv_lg_grp_cd.addAliasName("Hdr.dlv_lg_grp_cd", p);
		p.Hdr_dlv_lg_grp_nm = p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm;
		p.Hdr_dlv_lg_grp_nm.addAliasName("Hdr.dlv_lg_grp_nm", p);
		p.Hdr_dlv_cntry_cd = p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd;
		p.Hdr_dlv_cntry_cd.addAliasName("Hdr.dlv_cntry_cd", p);
		p.Hdr_dlv_cntry_nm = p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm;
		p.Hdr_dlv_cntry_nm.addAliasName("Hdr.dlv_cntry_nm", p);
		p.Hdr_dlv_zip_cd = p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd;
		p.Hdr_dlv_zip_cd.addAliasName("Hdr.dlv_zip_cd", p);
		p.Hdr_dlv_addr1 = p.Hdr_dlv_addr_p_PPanel.Addr_addr1;
		p.Hdr_dlv_addr1.addAliasName("Hdr.dlv_addr1", p);
		p.Hdr_dlv_addr2 = p.Hdr_dlv_addr_p_PPanel.Addr_addr2;
		p.Hdr_dlv_addr2.addAliasName("Hdr.dlv_addr2", p);
		p.Hdr_dlv_addr3 = p.Hdr_dlv_addr_p_PPanel.Addr_addr3;
		p.Hdr_dlv_addr3.addAliasName("Hdr.dlv_addr3", p);
		p.Hdr_dlv_addr4 = p.Hdr_dlv_addr_p_PPanel.Addr_addr4;
		p.Hdr_dlv_addr4.addAliasName("Hdr.dlv_addr4", p);
		p.Hdr_dlv_cntct_dpt = p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt;
		p.Hdr_dlv_cntct_dpt.addAliasName("Hdr.dlv_cntct_dpt", p);
		p.Hdr_dlv_cntct_psn = p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn;
		p.Hdr_dlv_cntct_psn.addAliasName("Hdr.dlv_cntct_psn", p);
		p.Hdr_dlv_tel = p.Hdr_dlv_addr_p_PPanel.Addr_tel;
		p.Hdr_dlv_tel.addAliasName("Hdr.dlv_tel", p);
		p.Hdr_dlv_fax = p.Hdr_dlv_addr_p_PPanel.Addr_fax;
		p.Hdr_dlv_fax.addAliasName("Hdr.dlv_fax", p);
		p.Hdr_rqst_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().rqst_usr_dpt_p());
		p.Hdr_rqst_usr_dpt_p_PPanel.setName("Hdr.rqst_usr_dpt_p");
		p.Hdr_rqst_usr_cd = p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_rqst_usr_cd.addAliasName("Hdr.rqst_usr_cd", p);
		p.Hdr_rqst_usr_nm = p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_rqst_usr_nm.addAliasName("Hdr.rqst_usr_nm", p);
		p.Hdr_rqst_dpt_cd = p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_rqst_dpt_cd.addAliasName("Hdr.rqst_dpt_cd", p);
		p.Hdr_rqst_dpt_nm = p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_rqst_dpt_nm.addAliasName("Hdr.rqst_dpt_nm", p);
		p.Hdr_ship_usr_dpt_p_PPanel = mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.create(p.getHdrR().ship_usr_dpt_p());
		p.Hdr_ship_usr_dpt_p_PPanel.setName("Hdr.ship_usr_dpt_p");
		p.Hdr_ship_usr_cd = p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_usr_cd;
		p.Hdr_ship_usr_cd.addAliasName("Hdr.ship_usr_cd", p);
		p.Hdr_ship_usr_nm = p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_usr_nm;
		p.Hdr_ship_usr_nm.addAliasName("Hdr.ship_usr_nm", p);
		p.Hdr_ship_dpt_cd = p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd;
		p.Hdr_ship_dpt_cd.addAliasName("Hdr.ship_dpt_cd", p);
		p.Hdr_ship_dpt_nm = p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_nm;
		p.Hdr_ship_dpt_nm.addAliasName("Hdr.ship_dpt_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MSBEP_ShipActReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MSBEP_ShipActReg p) {
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$itm_p);
		p.Dtl_itm_p_PPanel.setName("Dtl.itm_p");
		p.columnDtl_itm_cd = p.Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_itm_cd.addAliasName("Dtl.itm_cd", p);
		p.columnDtl_itm_sub1 = p.Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_itm_sub1.addAliasName("Dtl.itm_sub1", p);
		p.columnDtl_itm_sub2 = p.Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_itm_sub2.addAliasName("Dtl.itm_sub2", p);
		p.columnDtl_itm_sub3 = p.Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_itm_sub3.addAliasName("Dtl.itm_sub3", p);
		p.columnDtl_itm_nm = p.Dtl_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_itm_nm.addAliasName("Dtl.itm_nm", p);
		p.Dtl_lot_no_p_PPanel = mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$lot_no_p);
		p.Dtl_lot_no_p_PPanel.setName("Dtl.lot_no_p");
		p.columnDtl_crt_lot_flg = p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg;
		p.columnDtl_crt_lot_flg.addAliasName("Dtl.crt_lot_flg", p);
		p.columnDtl_lot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no;
		p.columnDtl_lot_no.addAliasName("Dtl.lot_no", p);
		p.columnDtl_sublot_no = p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no;
		p.columnDtl_sublot_no.addAliasName("Dtl.sublot_no", p);
		p.Dtl_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$ver_no_p);
		p.Dtl_ver_no_p_PPanel.setName("Dtl.ver_no_p");
		p.columnDtl_ver_no = p.Dtl_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnDtl_ver_no.addAliasName("Dtl.ver_no", p);
		p.Dtl_trd_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$trd_unit_qty_p);
		p.Dtl_trd_unit_qty_p_PPanel.setName("Dtl.trd_unit_qty_p");
		p.columnDtl_trd_unit_qty = p.Dtl_trd_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_trd_unit_qty.addAliasName("Dtl.trd_unit_qty", p);
		p.Dtl_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$base_unit_qty_p);
		p.Dtl_base_unit_qty_p_PPanel.setName("Dtl.base_unit_qty_p");
		p.columnDtl_base_unit_qty = p.Dtl_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnDtl_base_unit_qty.addAliasName("Dtl.base_unit_qty", p);
		p.Dtl_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$schd_qty_p);
		p.Dtl_schd_qty_p_PPanel.setName("Dtl.schd_qty_p");
		p.columnDtl_schd_qty = p.Dtl_schd_qty_p_PPanel.columnQty_qty;
		p.columnDtl_schd_qty.addAliasName("Dtl.schd_qty", p);
		p.Dtl_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$inst_qty_p);
		p.Dtl_inst_qty_p_PPanel.setName("Dtl.inst_qty_p");
		p.columnDtl_inst_qty = p.Dtl_inst_qty_p_PPanel.columnQty_qty;
		p.columnDtl_inst_qty.addAliasName("Dtl.inst_qty", p);
		p.Dtl_ship_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$ship_qty_p);
		p.Dtl_ship_qty_p_PPanel.setName("Dtl.ship_qty_p");
		p.columnDtl_ship_qty = p.Dtl_ship_qty_p_PPanel.columnQty_qty;
		p.columnDtl_ship_qty.addAliasName("Dtl.ship_qty", p);
		p.Dtl_sls_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$sls_qty_p);
		p.Dtl_sls_qty_p_PPanel.setName("Dtl.sls_qty_p");
		p.columnDtl_sls_qty = p.Dtl_sls_qty_p_PPanel.columnQty_qty;
		p.columnDtl_sls_qty.addAliasName("Dtl.sls_qty", p);
		p.Dtl_arr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$arr_qty_p);
		p.Dtl_arr_qty_p_PPanel.setName("Dtl.arr_qty_p");
		p.columnDtl_arr_qty = p.Dtl_arr_qty_p_PPanel.columnQty_qty;
		p.columnDtl_arr_qty.addAliasName("Dtl.arr_qty", p);
		p.Dtl_iv_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$iv_qty_p);
		p.Dtl_iv_qty_p_PPanel.setName("Dtl.iv_qty_p");
		p.columnDtl_iv_qty = p.Dtl_iv_qty_p_PPanel.columnQty_qty;
		p.columnDtl_iv_qty.addAliasName("Dtl.iv_qty", p);
		p.Dtl_ret_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$ret_qty_p);
		p.Dtl_ret_qty_p_PPanel.setName("Dtl.ret_qty_p");
		p.columnDtl_ret_qty = p.Dtl_ret_qty_p_PPanel.columnQty_qty;
		p.columnDtl_ret_qty.addAliasName("Dtl.ret_qty", p);
		p.Dtl_act_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$act_cont_qty_p);
		p.Dtl_act_cont_qty_p_PPanel.setName("Dtl.act_cont_qty_p");
		p.columnDtl_act_cont_qty = p.Dtl_act_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_act_cont_qty.addAliasName("Dtl.act_cont_qty", p);
		p.Dtl_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$act_cont_fctr_p);
		p.Dtl_act_cont_fctr_p_PPanel.setName("Dtl.act_cont_fctr_p");
		p.columnDtl_act_cont_fctr = p.Dtl_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnDtl_act_cont_fctr.addAliasName("Dtl.act_cont_fctr", p);
		p.Dtl_std_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$std_cont_qty_p);
		p.Dtl_std_cont_qty_p_PPanel.setName("Dtl.std_cont_qty_p");
		p.columnDtl_std_cont_qty = p.Dtl_std_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnDtl_std_cont_qty.addAliasName("Dtl.std_cont_qty", p);
		p.Dtl_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$std_cont_fctr_p);
		p.Dtl_std_cont_fctr_p_PPanel.setName("Dtl.std_cont_fctr_p");
		p.columnDtl_std_cont_fctr = p.Dtl_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnDtl_std_cont_fctr.addAliasName("Dtl.std_cont_fctr", p);
		p.Dtl_cont_fctr_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$cont_fctr_unit_p);
		p.Dtl_cont_fctr_unit_p_PPanel.setName("Dtl.cont_fctr_unit_p");
		p.columnDtl_cont_fctr_unit_cd = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnDtl_cont_fctr_unit_cd.addAliasName("Dtl.cont_fctr_unit_cd", p);
		p.columnDtl_cont_fctr_unit_nm = p.Dtl_cont_fctr_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnDtl_cont_fctr_unit_nm.addAliasName("Dtl.cont_fctr_unit_nm", p);
		p.Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$str_ln_p);
		p.Dtl_str_ln_p_PPanel.setName("Dtl.str_ln_p");
		p.columnDtl_ship_str_ln_cd = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_ship_str_ln_cd.addAliasName("Dtl.ship_str_ln_cd", p);
		p.columnDtl_ship_str_ln_nm = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_ship_str_ln_nm.addAliasName("Dtl.ship_str_ln_nm", p);
		p.columnDtl_ship_str_ln_cd_none_flg = p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_ship_str_ln_cd_none_flg.addAliasName("Dtl.ship_str_ln_cd_none_flg", p);
		p.Dtl_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$sno_wrk_no_p);
		p.Dtl_sno_wrk_no_p_PPanel.setName("Dtl.sno_wrk_no_p");
		p.columnDtl_sno1 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_sno1.addAliasName("Dtl.sno1", p);
		p.columnDtl_sno1_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg;
		p.columnDtl_sno1_null_flg.addAliasName("Dtl.sno1_null_flg", p);
		p.columnDtl_sno2 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_sno2.addAliasName("Dtl.sno2", p);
		p.columnDtl_sno2_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg;
		p.columnDtl_sno2_null_flg.addAliasName("Dtl.sno2_null_flg", p);
		p.columnDtl_sno3 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_sno3.addAliasName("Dtl.sno3", p);
		p.columnDtl_sno3_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg;
		p.columnDtl_sno3_null_flg.addAliasName("Dtl.sno3_null_flg", p);
		p.columnDtl_sno4 = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_sno4.addAliasName("Dtl.sno4", p);
		p.columnDtl_sno4_null_flg = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg;
		p.columnDtl_sno4_null_flg.addAliasName("Dtl.sno4_null_flg", p);
		p.columnDtl_wrk_no = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnDtl_wrk_no.addAliasName("Dtl.wrk_no", p);
		p.columnDtl_wrk_nm = p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnDtl_wrk_nm.addAliasName("Dtl.wrk_nm", p);
		p.Dtl_schd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$schd_sno_wrk_no_p);
		p.Dtl_schd_sno_wrk_no_p_PPanel.setName("Dtl.schd_sno_wrk_no_p");
		p.columnDtl_schd_sno1 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnDtl_schd_sno1.addAliasName("Dtl.schd_sno1", p);
		p.columnDtl_schd_sno2 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnDtl_schd_sno2.addAliasName("Dtl.schd_sno2", p);
		p.columnDtl_schd_sno3 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnDtl_schd_sno3.addAliasName("Dtl.schd_sno3", p);
		p.columnDtl_schd_sno4 = p.Dtl_schd_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnDtl_schd_sno4.addAliasName("Dtl.schd_sno4", p);
		p.Dtl_stk_bp_p_PPanel = mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$stk_bp_p);
		p.Dtl_stk_bp_p_PPanel.setName("Dtl.stk_bp_p");
		p.columnDtl_stk_bp_cd = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_cd;
		p.columnDtl_stk_bp_cd.addAliasName("Dtl.stk_bp_cd", p);
		p.columnDtl_stk_bp_nm = p.Dtl_stk_bp_p_PPanel.columnStkBp_stk_bp_nm;
		p.columnDtl_stk_bp_nm.addAliasName("Dtl.stk_bp_nm", p);
		p.Dtl_dlv_addr_p_PPanel = mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$dlv_addr_p);
		p.Dtl_dlv_addr_p_PPanel.setName("Dtl.dlv_addr_p");
		p.columnDtl_dlv_show_dtl = p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl;
		p.columnDtl_dlv_show_dtl.addAliasName("Dtl.dlv_show_dtl", p);
		p.columnDtl_dlv_cntry_cd = p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd;
		p.columnDtl_dlv_cntry_cd.addAliasName("Dtl.dlv_cntry_cd", p);
		p.columnDtl_dlv_cntry_nm = p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm;
		p.columnDtl_dlv_cntry_nm.addAliasName("Dtl.dlv_cntry_nm", p);
		p.columnDtl_dlv_zip_cd = p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd;
		p.columnDtl_dlv_zip_cd.addAliasName("Dtl.dlv_zip_cd", p);
		p.columnDtl_dlv_addr1 = p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1;
		p.columnDtl_dlv_addr1.addAliasName("Dtl.dlv_addr1", p);
		p.columnDtl_dlv_addr2 = p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2;
		p.columnDtl_dlv_addr2.addAliasName("Dtl.dlv_addr2", p);
		p.columnDtl_dlv_addr3 = p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3;
		p.columnDtl_dlv_addr3.addAliasName("Dtl.dlv_addr3", p);
		p.columnDtl_dlv_addr4 = p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4;
		p.columnDtl_dlv_addr4.addAliasName("Dtl.dlv_addr4", p);
		p.columnDtl_dlv_cntct_dpt = p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt;
		p.columnDtl_dlv_cntct_dpt.addAliasName("Dtl.dlv_cntct_dpt", p);
		p.columnDtl_dlv_cntct_psn = p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn;
		p.columnDtl_dlv_cntct_psn.addAliasName("Dtl.dlv_cntct_psn", p);
		p.columnDtl_dlv_tel = p.Dtl_dlv_addr_p_PPanel.columnAddr_tel;
		p.columnDtl_dlv_tel.addAliasName("Dtl.dlv_tel", p);
		p.columnDtl_dlv_fax = p.Dtl_dlv_addr_p_PPanel.columnAddr_fax;
		p.columnDtl_dlv_fax.addAliasName("Dtl.dlv_fax", p);
		p.Dtl_dlv_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMSBE.MSBEP1440.DtlR.$dlv_str_ln_p);
		p.Dtl_dlv_str_ln_p_PPanel.setName("Dtl.dlv_str_ln_p");
		p.columnDtl_dlv_str_ln_cd = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnDtl_dlv_str_ln_cd.addAliasName("Dtl.dlv_str_ln_cd", p);
		p.columnDtl_dlv_str_ln_nm = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnDtl_dlv_str_ln_nm.addAliasName("Dtl.dlv_str_ln_nm", p);
		p.columnDtl_dlv_str_ln_cd_none_flg = p.Dtl_dlv_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnDtl_dlv_str_ln_cd_none_flg.addAliasName("Dtl.dlv_str_ln_cd_none_flg", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBEP_ShipActReg p) {
		p.Btn_Btn_open_MSBEP0500_PPanel = mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.create();
		p.Btn_Btn_open_MSBEP0500_PPanel.setName("Btn.Btn_open_MSBEP0500");
		p.Btn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.Btn_menu_move_p_PPanel.setName("Btn.menu_move_p");
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBEP_ShipActReg p) {
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

	
	/** [Cnd_srch_tgt_typ_nm_ListPutter]の定義 */
	private MCListPutter Cnd_srch_tgt_typ_nm_p = null;

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の取得
	 */
	protected MCListPutter getCnd_srch_tgt_typ_nm_ListPutter() {
		if (Cnd_srch_tgt_typ_nm_p == null) {
			Cnd_srch_tgt_typ_nm_p = createCnd_srch_tgt_typ_nm_ListPutter(Cnd_srch_tgt_typ_nm, "srch_tgt_typ_nm", "srch_tgt_typ");

		}
		return Cnd_srch_tgt_typ_nm_p;
	}
	
	
	/** [Hdr_trd_cd_ListPutter]の定義 */
	private MCListPutter Hdr_trd_cd_p = null;

	/**
	 * [Hdr_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_trd_cd_ListPutter() {
		if (Hdr_trd_cd_p == null) {
			Hdr_trd_cd_p = createHdr_trd_cd_ListPutter(Hdr_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Hdr_trd_cd_p;
	}
	
	
	/** [Hdr_ship_to_id_typ_ListPutter]の定義 */
	private MCListPutter Hdr_ship_to_id_typ_p = null;

	/**
	 * [Hdr_ship_to_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_to_id_typ_ListPutter() {
		if (Hdr_ship_to_id_typ_p == null) {
			Hdr_ship_to_id_typ_p = createHdr_ship_to_id_typ_ListPutter(Hdr_ship_to_id_typ, "ship_to_id_typ", "ship_to_id_typ_nm");

		}
		return Hdr_ship_to_id_typ_p;
	}
	
	
	/** [Hdr_ship_to_id_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_to_id_cd_p = null;

	/**
	 * [Hdr_ship_to_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_to_id_cd_ListPutter() {
		if (Hdr_ship_to_id_cd_p == null) {
			Hdr_ship_to_id_cd_p = createHdr_ship_to_id_cd_ListPutter(Hdr_ship_to_id_cd, "ship_to_id_cd", "ship_to_id_nm","ship_to_lg_grp_cd","ship_to_lg_grp_nm","ship_to_zip_cd","ship_to_addr1","ship_to_addr2","ship_to_addr3","ship_to_addr4","ship_to_cntct_dpt","ship_to_cntct_psn","ship_to_tel","ship_to_fax","ship_to_sundry_flg","ship_to_lg_grp_cd","ship_to_lg_grp_nm","ship_to_cntry_cd","ship_to_cntry_nm","via_dlv_typ");

		}
		return Hdr_ship_to_id_cd_p;
	}
	
	
	/** [Hdr_via_dlv_typ_ListPutter]の定義 */
	private MCListPutter Hdr_via_dlv_typ_p = null;

	/**
	 * [Hdr_via_dlv_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_via_dlv_typ_ListPutter() {
		if (Hdr_via_dlv_typ_p == null) {
			Hdr_via_dlv_typ_p = createHdr_via_dlv_typ_ListPutter(Hdr_via_dlv_typ, "via_dlv_typ", "via_dlv_typ_nm");

		}
		return Hdr_via_dlv_typ_p;
	}
	
	
	/** [Hdr_dlv_id_typ_ListPutter]の定義 */
	private MCListPutter Hdr_dlv_id_typ_p = null;

	/**
	 * [Hdr_dlv_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dlv_id_typ_ListPutter() {
		if (Hdr_dlv_id_typ_p == null) {
			Hdr_dlv_id_typ_p = createHdr_dlv_id_typ_ListPutter(Hdr_dlv_id_typ, "dlv_id_typ", "dlv_id_typ_nm");

		}
		return Hdr_dlv_id_typ_p;
	}
	
	
	/** [Hdr_dlv_id_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dlv_id_cd_p = null;

	/**
	 * [Hdr_dlv_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dlv_id_cd_ListPutter() {
		if (Hdr_dlv_id_cd_p == null) {
			Hdr_dlv_id_cd_p = createHdr_dlv_id_cd_ListPutter(Hdr_dlv_id_cd, "dlv_id_cd", "dlv_id_nm","dlv_str_ln_tgt_flg","dlv_zip_cd","dlv_addr1","dlv_addr2","dlv_addr3","dlv_addr4","dlv_cntct_dpt","dlv_cntct_psn","dlv_tel","dlv_fax","dlv_sundry_flg","dlv_sppl_cd","dlv_pri_prnt_flg","dlv_cntry_cd","dlv_cntry_nm","prnt_lcl_cd");

		}
		return Hdr_dlv_id_cd_p;
	}
	
	
	/** [Hdr_dlv_cd_ListPutter]の定義 */
	private MCListPutter Hdr_dlv_cd_p = null;

	/**
	 * [Hdr_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_dlv_cd_ListPutter() {
		if (Hdr_dlv_cd_p == null) {
			Hdr_dlv_cd_p = createHdr_dlv_cd_ListPutter(Hdr_dlv_cd, "dlv_cd", "cst_cd");

		}
		return Hdr_dlv_cd_p;
	}
	
	
	/** [Hdr_cst_cd_ListPutter]の定義 */
	private MCListPutter Hdr_cst_cd_p = null;

	/**
	 * [Hdr_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_cst_cd_ListPutter() {
		if (Hdr_cst_cd_p == null) {
			Hdr_cst_cd_p = createHdr_cst_cd_ListPutter(Hdr_cst_cd, "cst_cd", "cst_nm","cst_usr_cd","cst_dpt_cd","cst_iv_flg");

		}
		return Hdr_cst_cd_p;
	}
	
	
	/** [Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "rqst_dpt_cd", "rqst_dpt_nm");
		}
		return Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = null;

	/**
	 * [Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter() {
		if (Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p == null) {
			Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p = createHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd, "ship_dpt_cd", "ship_dpt_nm");
		}
		return Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_p;
	}
	
	
	/** [Hdr_ship_fr_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Hdr_ship_fr_lg_grp_cd_p = null;

	/**
	 * [Hdr_ship_fr_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_ship_fr_lg_grp_cd_ListPutter() {
		if (Hdr_ship_fr_lg_grp_cd_p == null) {
			Hdr_ship_fr_lg_grp_cd_p = createHdr_ship_fr_lg_grp_cd_ListPutter(Hdr_ship_fr_lg_grp_cd, "ship_fr_lg_grp_cd", "ship_fr_lg_grp_nm","dlv_slip_prnt_flg","ship_adv_prnt_flg");

		}
		return Hdr_ship_fr_lg_grp_cd_p;
	}
	
	
	/** [Dtl_pr_sts_typ_ListPutter]の定義 */
	private MCListPutter Dtl_pr_sts_typ_p = null;

	/**
	 * [Dtl_pr_sts_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_pr_sts_typ_ListPutter() {
		if (Dtl_pr_sts_typ_p == null) {
			Dtl_pr_sts_typ_p = createDtl_pr_sts_typ_ListPutter(columnDtl_pr_sts_typ, "pr_sts_typ");

		}
		return Dtl_pr_sts_typ_p;
	}
	
	
	/** [Dtl_trd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_cd_p = null;

	/**
	 * [Dtl_trd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_cd_ListPutter() {
		if (Dtl_trd_cd_p == null) {
			Dtl_trd_cd_p = createDtl_trd_cd_ListPutter(columnDtl_trd_cd, "trd_cd", "trd_nm","trd_ptn_typ");

		}
		return Dtl_trd_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_sub1","itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","ver_flg","skip_chk_ship_flg","trd_unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_sub2","itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","ver_flg","skip_chk_ship_flg","trd_unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_sub3","itm_nm","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","ver_flg","skip_chk_ship_flg","trd_unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","sundry_itm_flg","dscnt_itm_flg","stk_mng_typ","lot_mng_typ","sublot_mng_typ","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","base_unit_cd","base_unit_nm","base_unit_dec_place","base_unit_rnd_typ","cont_fctr_flg","std_cont_fctr","ver_flg","skip_chk_ship_flg","trd_unit_cd");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_cst_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_itm_cd_p = null;

	/**
	 * [Dtl_cst_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_itm_cd_ListPutter() {
		if (Dtl_cst_itm_cd_p == null) {
			Dtl_cst_itm_cd_p = createDtl_cst_itm_cd_ListPutter(columnDtl_cst_itm_cd, "cst_itm_cd", "cst_itm_nm","itm_cd","itm_sub1","itm_sub2","itm_sub3");

		}
		return Dtl_cst_itm_cd_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_lot_no, "lot_no", "sublot_no","ver_no");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_lot_no_p;
	}
	
	
	/** [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の定義 */
	private MCListPutter Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = null;

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter() {
		if (Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p == null) {
			Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p = createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(Dtl_lot_no_p_PPanel.columnLotNo_sublot_no, "sublot_no", "ver_no");
		}
		return Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_p;
	}
	
	
	/** [Dtl_trd_unit_cd_ListPutter]の定義 */
	private MCListPutter Dtl_trd_unit_cd_p = null;

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_trd_unit_cd_ListPutter() {
		if (Dtl_trd_unit_cd_p == null) {
			Dtl_trd_unit_cd_p = createDtl_trd_unit_cd_ListPutter(columnDtl_trd_unit_cd, "trd_unit_cd", "trd_unit_nm","trd_unit_conv_base_qty","trd_unit_conv_qty","trd_unit_dec_place","trd_unit_rnd_typ","unit_wt","unit_dim");

		}
		return Dtl_trd_unit_cd_p;
	}
	
	
	/** [Dtl_ship_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ship_loc_cd_p = null;

	/**
	 * [Dtl_ship_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ship_loc_cd_ListPutter() {
		if (Dtl_ship_loc_cd_p == null) {
			Dtl_ship_loc_cd_p = createDtl_ship_loc_cd_ListPutter(columnDtl_ship_loc_cd, "ship_loc_cd", "ship_loc_nm","loc_mng_typ","ship_str_ln_tgt_flg","ship_loc_sppl_cd");

		}
		return Dtl_ship_loc_cd_p;
	}
	
	
	/** [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = null;

	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter() {
		if (Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p == null) {
			Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p = createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd, "ship_str_ln_cd", "ship_str_ln_nm");
		}
		return Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_p;
	}
	
	
	/** [Dtl_quality_typ_ListPutter]の定義 */
	private MCListPutter Dtl_quality_typ_p = null;

	/**
	 * [Dtl_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_quality_typ_ListPutter() {
		if (Dtl_quality_typ_p == null) {
			Dtl_quality_typ_p = createDtl_quality_typ_ListPutter(columnDtl_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Dtl_quality_typ_p;
	}
	
	
	/** [Dtl_gd_cd_ListPutter]の定義 */
	private MCListPutter Dtl_gd_cd_p = null;

	/**
	 * [Dtl_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_gd_cd_ListPutter() {
		if (Dtl_gd_cd_p == null) {
			Dtl_gd_cd_p = createDtl_gd_cd_ListPutter(columnDtl_gd_cd, "gd_cd", "gd_nm");

		}
		return Dtl_gd_cd_p;
	}
	
	
	/** [Dtl_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Dtl_stk_id_typ_p = null;

	/**
	 * [Dtl_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_id_typ_ListPutter() {
		if (Dtl_stk_id_typ_p == null) {
			Dtl_stk_id_typ_p = createDtl_stk_id_typ_ListPutter(columnDtl_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Dtl_stk_id_typ_p;
	}
	
	
	/** [Dtl_stk_arrv_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_stk_arrv_bp_cd_p = null;

	/**
	 * [Dtl_stk_arrv_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_stk_arrv_bp_cd_ListPutter() {
		if (Dtl_stk_arrv_bp_cd_p == null) {
			Dtl_stk_arrv_bp_cd_p = createDtl_stk_arrv_bp_cd_ListPutter(columnDtl_stk_arrv_bp_cd, "stk_arrv_bp_cd", "stk_arrv_bp_nm");

		}
		return Dtl_stk_arrv_bp_cd_p;
	}
	
	
	/** [Dtl_dlv_id_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_id_cd_p = null;

	/**
	 * [Dtl_dlv_id_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_id_cd_ListPutter() {
		if (Dtl_dlv_id_cd_p == null) {
			Dtl_dlv_id_cd_p = createDtl_dlv_id_cd_ListPutter(columnDtl_dlv_id_cd, "dlv_id_cd", "dlv_str_ln_tgt_flg");

		}
		return Dtl_dlv_id_cd_p;
	}
	
	
	/** [Dtl_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rsn_cd_p = null;

	/**
	 * [Dtl_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rsn_cd_ListPutter() {
		if (Dtl_rsn_cd_p == null) {
			Dtl_rsn_cd_p = createDtl_rsn_cd_ListPutter(columnDtl_rsn_cd, "rsn_cd", "rsn_nm","sls_acxfr_flg","acxfr_gi_flg");

		}
		return Dtl_rsn_cd_p;
	}
	
	
	/** [Dtl_bd_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bd_dpt_cd_p = null;

	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bd_dpt_cd_ListPutter() {
		if (Dtl_bd_dpt_cd_p == null) {
			Dtl_bd_dpt_cd_p = createDtl_bd_dpt_cd_ListPutter(columnDtl_bd_dpt_cd, "bd_dpt_cd", "bd_dpt_nm");

		}
		return Dtl_bd_dpt_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipActReg create(){
		MSBEP_ShipActReg p = new MSBEP_ShipActReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBEP_ShipActReg create(String name){
		MSBEP_ShipActReg p = new MSBEP_ShipActReg(name);
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
		MSBEP_ShipActReg_MC.jbfInitScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitCnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitHdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitHdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitHdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitDtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitBtn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbfInitEastBtn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitCnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitHdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitHdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitHdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitDtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitBtn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.jbInitEastBtn((MSBEP_ShipActReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_INS = p.beansFactory.createRadioButton("Cnd.ope_INS");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_screen_ope = p.beansFactory.createTextField("Cnd.screen_ope");
		p.Cnd_srch_tgt_typ = p.beansFactory.createTextField("Cnd.srch_tgt_typ");
		p.Cnd_srch_tgt_typ_nm_Label = p.beansFactory.createLabel("Cnd.srch_tgt_typ_nm_Label");
		p.Cnd_srch_tgt_typ_nm = p.beansFactory.createTextComboBox("Cnd.srch_tgt_typ_nm");
		p.Cnd_srch_tgt_typ_nm.setLabel(p.Cnd_srch_tgt_typ_nm_Label);
		p.Cnd_srch_tgt_no = p.beansFactory.createTextField("Cnd.srch_tgt_no");
		p.Cnd_ship_act_rev = p.beansFactory.createNumberField("Cnd.ship_act_rev");
		p.Cnd_latest_flg = p.beansFactory.createCheckBox("Cnd.latest_flg");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
		p.Cnd_non_srch = p.beansFactory.createButton("Cnd.non_srch", "srch");
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdrTab(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.HdrTabPanel = p.beansFactory.createPanel("HdrTab");
		p.HdrTabTab = p.beansFactory.createTabbedPane("HdrTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_trd_cd_Label = p.beansFactory.createLabel("Hdr.trd_cd_Label");
		p.Hdr_trd_cd = p.beansFactory.createTextComboBox("Hdr.trd_cd");
		p.Hdr_trd_cd.setLabel(p.Hdr_trd_cd_Label);
		p.Hdr_trd_nm = p.beansFactory.createTextField("Hdr.trd_nm");
		p.Hdr_trd_ptn_typ = p.beansFactory.createTextField("Hdr.trd_ptn_typ");
		p.Hdr_ac_ym_Label = p.beansFactory.createLabel("Hdr.ac_ym_Label");
		p.Hdr_ac_ym = p.beansFactory.createDateField("Hdr.ac_ym");
		p.Hdr_ac_ym.setLabel(p.Hdr_ac_ym_Label);
		p.Hdr_ship_act_no_Label = p.beansFactory.createLabel("Hdr.ship_act_no_Label");
		p.Hdr_ship_act_no = p.beansFactory.createTextField("Hdr.ship_act_no");
		p.Hdr_ship_act_no.setLabel(p.Hdr_ship_act_no_Label);
		p.Hdr_ship_act_rev = p.beansFactory.createNumberField("Hdr.ship_act_rev");
		p.Hdr_latest_flg = p.beansFactory.createCheckBox("Hdr.latest_flg");
		p.Hdr_can_flg = p.beansFactory.createCheckBox("Hdr.can_flg");
		p.Hdr_ship_inst_no_Label = p.beansFactory.createLabel("Hdr.ship_inst_no_Label");
		p.Hdr_ship_inst_no = p.beansFactory.createTextField("Hdr.ship_inst_no");
		p.Hdr_ship_inst_no.setLabel(p.Hdr_ship_inst_no_Label);
		p.Hdr_iv_no_Label = p.beansFactory.createLabel("Hdr.iv_no_Label");
		p.Hdr_iv_no = p.beansFactory.createTextField("Hdr.iv_no");
		p.Hdr_iv_no.setLabel(p.Hdr_iv_no_Label);
		p.Hdr_dlv_slip_no_Label = p.beansFactory.createLabel("Hdr.dlv_slip_no_Label");
		p.Hdr_dlv_slip_no = p.beansFactory.createTextField("Hdr.dlv_slip_no");
		p.Hdr_dlv_slip_no.setLabel(p.Hdr_dlv_slip_no_Label);
		p.Hdr_ship_to_id_typ_Label = p.beansFactory.createLabel("Hdr.ship_to_id_typ_Label");
		p.Hdr_ship_to_id_typ = p.beansFactory.createTextComboBox("Hdr.ship_to_id_typ");
		p.Hdr_ship_to_id_typ.setLabel(p.Hdr_ship_to_id_typ_Label);
		p.Hdr_ship_to_id_typ_nm = p.beansFactory.createTextField("Hdr.ship_to_id_typ_nm");
		p.Hdr_ship_to_id_cd = p.beansFactory.createTextField("Hdr.ship_to_id_cd");
		p.Hdr_ship_to_id_nm = p.beansFactory.createTextField("Hdr.ship_to_id_nm");
		p.Hdr_ship_to_sundry_flg = p.beansFactory.createCheckBox("Hdr.ship_to_sundry_flg");
		p.Hdr_via_dlv_typ_Label = p.beansFactory.createLabel("Hdr.via_dlv_typ_Label");
		p.Hdr_via_dlv_typ = p.beansFactory.createTextComboBox("Hdr.via_dlv_typ");
		p.Hdr_via_dlv_typ.setLabel(p.Hdr_via_dlv_typ_Label);
		p.Hdr_via_dlv_typ_nm = p.beansFactory.createTextField("Hdr.via_dlv_typ_nm");
		p.Hdr_dlv_id_typ_Label = p.beansFactory.createLabel("Hdr.dlv_id_typ_Label");
		p.Hdr_dlv_id_typ = p.beansFactory.createTextComboBox("Hdr.dlv_id_typ");
		p.Hdr_dlv_id_typ.setLabel(p.Hdr_dlv_id_typ_Label);
		p.Hdr_dlv_id_typ_nm = p.beansFactory.createTextField("Hdr.dlv_id_typ_nm");
		p.Hdr_dlv_id_cd = p.beansFactory.createTextField("Hdr.dlv_id_cd");
		p.Hdr_dlv_id_nm = p.beansFactory.createTextField("Hdr.dlv_id_nm");
		p.Hdr_dlv_sundry_flg = p.beansFactory.createCheckBox("Hdr.dlv_sundry_flg");
		p.Hdr_dlv_pri_prnt_flg = p.beansFactory.createCheckBox("Hdr.dlv_pri_prnt_flg");
		p.Hdr_dlv_str_ln_tgt_flg = p.beansFactory.createCheckBox("Hdr.dlv_str_ln_tgt_flg");
		p.Hdr_dlv_cd = p.beansFactory.createTextField("Hdr.dlv_cd");
		p.Hdr_dlv_sppl_cd = p.beansFactory.createTextField("Hdr.dlv_sppl_cd");
		p.Hdr_cst_cd_Label = p.beansFactory.createLabel("Hdr.cst_cd_Label");
		p.Hdr_cst_cd = p.beansFactory.createTextField("Hdr.cst_cd");
		p.Hdr_cst_cd.setLabel(p.Hdr_cst_cd_Label);
		p.Hdr_cst_nm = p.beansFactory.createTextField("Hdr.cst_nm");
		p.Hdr_cst_usr_cd = p.beansFactory.createTextField("Hdr.cst_usr_cd");
		p.Hdr_cst_dpt_cd = p.beansFactory.createTextField("Hdr.cst_dpt_cd");
		p.Hdr_cst_iv_flg = p.beansFactory.createCheckBox("Hdr.cst_iv_flg");
		p.Hdr_lot_chk_off_flg = p.beansFactory.createCheckBox("Hdr.lot_chk_off_flg");
		p.Hdr_ship_fr_lg_grp_cd_Label = p.beansFactory.createLabel("Hdr.ship_fr_lg_grp_cd_Label");
		p.Hdr_ship_fr_lg_grp_cd = p.beansFactory.createTextComboBox("Hdr.ship_fr_lg_grp_cd");
		p.Hdr_ship_fr_lg_grp_cd.setLabel(p.Hdr_ship_fr_lg_grp_cd_Label);
		p.Hdr_ship_fr_lg_grp_nm = p.beansFactory.createTextField("Hdr.ship_fr_lg_grp_nm");
		p.Hdr_ship_term_cd_Label = p.beansFactory.createLabel("Hdr.ship_term_cd_Label");
		p.Hdr_ship_term_cd = p.beansFactory.createTextField("Hdr.ship_term_cd");
		p.Hdr_ship_term_cd.setLabel(p.Hdr_ship_term_cd_Label);
		p.Hdr_ship_term_nm = p.beansFactory.createTextField("Hdr.ship_term_nm");
		p.Hdr_ship_wt_Label = p.beansFactory.createLabel("Hdr.ship_wt_Label");
		p.Hdr_ship_wt = p.beansFactory.createNumberField("Hdr.ship_wt");
		p.Hdr_ship_wt.setLabel(p.Hdr_ship_wt_Label);
		p.Hdr_ship_dim_Label = p.beansFactory.createLabel("Hdr.ship_dim_Label");
		p.Hdr_ship_dim = p.beansFactory.createNumberField("Hdr.ship_dim");
		p.Hdr_ship_dim.setLabel(p.Hdr_ship_dim_Label);
		p.Hdr_inst_dlv_prnted_flg = p.beansFactory.createCheckBox("Hdr.inst_dlv_prnted_flg");
		p.Hdr_dlv_slip_prnt_flg = p.beansFactory.createCheckBox("Hdr.dlv_slip_prnt_flg");
		p.Hdr_ship_adv_prnt_flg = p.beansFactory.createCheckBox("Hdr.ship_adv_prnt_flg");
		p.Hdr_dlv_slip_prnted_flg = p.beansFactory.createCheckBox("Hdr.dlv_slip_prnted_flg");
		p.Hdr_ship_adv_prnted_flg = p.beansFactory.createCheckBox("Hdr.ship_adv_prnted_flg");
		p.Hdr_uplnd_flg = p.beansFactory.createCheckBox("Hdr.uplnd_flg");
		p.Hdr_intr_rmrks_Label = p.beansFactory.createLabel("Hdr.intr_rmrks_Label");
		p.Hdr_intr_rmrks = p.beansFactory.createTextField("Hdr.intr_rmrks");
		p.Hdr_intr_rmrks.setLabel(p.Hdr_intr_rmrks_Label);
		p.Hdr_sub_char1_Label = p.beansFactory.createLabel("Hdr.sub_char1_Label");
		p.Hdr_sub_char1 = p.beansFactory.createTextField("Hdr.sub_char1");
		p.Hdr_sub_char1.setLabel(p.Hdr_sub_char1_Label);
		p.Hdr_sub_char2_Label = p.beansFactory.createLabel("Hdr.sub_char2_Label");
		p.Hdr_sub_char2 = p.beansFactory.createTextField("Hdr.sub_char2");
		p.Hdr_sub_char2.setLabel(p.Hdr_sub_char2_Label);
		p.Hdr_sub_char3_Label = p.beansFactory.createLabel("Hdr.sub_char3_Label");
		p.Hdr_sub_char3 = p.beansFactory.createTextField("Hdr.sub_char3");
		p.Hdr_sub_char3.setLabel(p.Hdr_sub_char3_Label);
		p.Hdr_ins_usr_id_Label = p.beansFactory.createLabel("Hdr.ins_usr_id_Label");
		p.Hdr_ins_usr_id = p.beansFactory.createTextField("Hdr.ins_usr_id");
		p.Hdr_ins_usr_id.setLabel(p.Hdr_ins_usr_id_Label);
		p.Hdr_ins_usr_nm = p.beansFactory.createTextField("Hdr.ins_usr_nm");
		p.Hdr_ins_func_id_Label = p.beansFactory.createLabel("Hdr.ins_func_id_Label");
		p.Hdr_ins_func_id = p.beansFactory.createTextField("Hdr.ins_func_id");
		p.Hdr_ins_func_id.setLabel(p.Hdr_ins_func_id_Label);
		p.Hdr_ins_func_nm = p.beansFactory.createTextField("Hdr.ins_func_nm");
		p.Hdr_upd_usr_id_Label = p.beansFactory.createLabel("Hdr.upd_usr_id_Label");
		p.Hdr_upd_usr_id = p.beansFactory.createTextField("Hdr.upd_usr_id");
		p.Hdr_upd_usr_id.setLabel(p.Hdr_upd_usr_id_Label);
		p.Hdr_upd_usr_nm = p.beansFactory.createTextField("Hdr.upd_usr_nm");
		p.Hdr_upd_func_id_Label = p.beansFactory.createLabel("Hdr.upd_func_id_Label");
		p.Hdr_upd_func_id = p.beansFactory.createTextField("Hdr.upd_func_id");
		p.Hdr_upd_func_id.setLabel(p.Hdr_upd_func_id_Label);
		p.Hdr_upd_func_nm = p.beansFactory.createTextField("Hdr.upd_func_nm");
		p.Hdr_ins_ts_Label = p.beansFactory.createLabel("Hdr.ins_ts_Label");
		p.Hdr_ins_ts = p.beansFactory.createTimestampField("Hdr.ins_ts");
		p.Hdr_ins_ts.setLabel(p.Hdr_ins_ts_Label);
		p.Hdr_upd_ts_Label = p.beansFactory.createLabel("Hdr.upd_ts_Label");
		p.Hdr_upd_ts = p.beansFactory.createTimestampField("Hdr.upd_ts");
		p.Hdr_upd_ts.setLabel(p.Hdr_upd_ts_Label);
		p.Hdr_upd_srv_req_no_Label = p.beansFactory.createLabel("Hdr.upd_srv_req_no_Label");
		p.Hdr_upd_srv_req_no = p.beansFactory.createTextField("Hdr.upd_srv_req_no");
		p.Hdr_upd_srv_req_no.setLabel(p.Hdr_upd_srv_req_no_Label);
		p.Hdr_prnt_lcl_cd = p.beansFactory.createTextField("Hdr.prnt_lcl_cd");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_pr_sts_typ = p.beansFactory.createTableColumn("Dtl.pr_sts_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_pr_sts_typ_nm = p.beansFactory.createTableColumn("Dtl.pr_sts_typ_nm", MCColumnType.TEXT);
		p.columnDtl_trd_cd = p.beansFactory.createTableColumn("Dtl.trd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_nm = p.beansFactory.createTableColumn("Dtl.trd_nm", MCColumnType.TEXT);
		p.columnDtl_trd_ptn_typ = p.beansFactory.createTableColumn("Dtl.trd_ptn_typ", MCColumnType.TEXT);
		p.columnDtl_cststk_flg = p.beansFactory.createTableColumn("Dtl.cststk_flg", MCColumnType.CHECK);
		p.columnDtl_loan_flg = p.beansFactory.createTableColumn("Dtl.loan_flg", MCColumnType.CHECK);
		p.columnDtl_cst_itm_cd = p.beansFactory.createTableColumn("Dtl.cst_itm_cd", MCColumnType.TEXT);
		p.columnDtl_cst_itm_nm = p.beansFactory.createTableColumn("Dtl.cst_itm_nm", MCColumnType.TEXT);
		p.columnDtl_iv_itm_nm = p.beansFactory.createTableColumn("Dtl.iv_itm_nm", MCColumnType.TEXT);
		p.columnDtl_stk_mng_typ = p.beansFactory.createTableColumn("Dtl.stk_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sundry_itm_flg = p.beansFactory.createTableColumn("Dtl.sundry_itm_flg", MCColumnType.CHECK);
		p.columnDtl_dscnt_itm_flg = p.beansFactory.createTableColumn("Dtl.dscnt_itm_flg", MCColumnType.CHECK);
		p.columnDtl_lot_mng_typ = p.beansFactory.createTableColumn("Dtl.lot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sublot_mng_typ = p.beansFactory.createTableColumn("Dtl.sublot_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno1_mng_typ = p.beansFactory.createTableColumn("Dtl.sno1_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno2_mng_typ = p.beansFactory.createTableColumn("Dtl.sno2_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno3_mng_typ = p.beansFactory.createTableColumn("Dtl.sno3_mng_typ", MCColumnType.TEXT);
		p.columnDtl_sno4_mng_typ = p.beansFactory.createTableColumn("Dtl.sno4_mng_typ", MCColumnType.TEXT);
		p.columnDtl_ver_flg = p.beansFactory.createTableColumn("Dtl.ver_flg", MCColumnType.CHECK);
		p.columnDtl_not_lot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_lot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_not_sublot_mix_flg = p.beansFactory.createTableColumn("Dtl.not_sublot_mix_flg", MCColumnType.CHECK);
		p.columnDtl_trd_unit_cd = p.beansFactory.createTableColumn("Dtl.trd_unit_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_trd_unit_nm = p.beansFactory.createTableColumn("Dtl.trd_unit_nm", MCColumnType.TEXT);
		p.columnDtl_trd_unit_conv_base_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_base_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_conv_qty = p.beansFactory.createTableColumn("Dtl.trd_unit_conv_qty", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_dec_place = p.beansFactory.createTableColumn("Dtl.trd_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_trd_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.trd_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_abort_flg = p.beansFactory.createTableColumn("Dtl.abort_flg", MCColumnType.CHECK);
		p.columnDtl_base_unit_cd = p.beansFactory.createTableColumn("Dtl.base_unit_cd", MCColumnType.TEXT);
		p.columnDtl_base_unit_nm = p.beansFactory.createTableColumn("Dtl.base_unit_nm", MCColumnType.TEXT);
		p.columnDtl_base_unit_dec_place = p.beansFactory.createTableColumn("Dtl.base_unit_dec_place", MCColumnType.NUMBER);
		p.columnDtl_base_unit_rnd_typ = p.beansFactory.createTableColumn("Dtl.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_cont_fctr_flg = p.beansFactory.createTableColumn("Dtl.cont_fctr_flg", MCColumnType.CHECK);
		p.columnDtl_cont_fctr_dec_place = p.beansFactory.createTableColumn("Dtl.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnDtl_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Dtl.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnDtl_ship_fr_lg_grp_cd = p.beansFactory.createTableColumn("Dtl.ship_fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnDtl_ship_loc_cd = p.beansFactory.createTableColumn("Dtl.ship_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ship_loc_nm = p.beansFactory.createTableColumn("Dtl.ship_loc_nm", MCColumnType.TEXT);
		p.columnDtl_loc_mng_typ = p.beansFactory.createTableColumn("Dtl.loc_mng_typ", MCColumnType.TEXT);
		p.columnDtl_ship_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.ship_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_ship_loc_sppl_cd = p.beansFactory.createTableColumn("Dtl.ship_loc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_quality_typ = p.beansFactory.createTableColumn("Dtl.quality_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_quality_typ_nm = p.beansFactory.createTableColumn("Dtl.quality_typ_nm", MCColumnType.TEXT);
		p.columnDtl_gd_cd = p.beansFactory.createTableColumn("Dtl.gd_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_gd_nm = p.beansFactory.createTableColumn("Dtl.gd_nm", MCColumnType.TEXT);
		p.columnDtl_stk_id_typ = p.beansFactory.createTableColumn("Dtl.stk_id_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_id_typ_nm = p.beansFactory.createTableColumn("Dtl.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Dtl.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_sppl_cd = p.beansFactory.createTableColumn("Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnDtl_ship_wt = p.beansFactory.createTableColumn("Dtl.ship_wt", MCColumnType.NUMBER);
		p.columnDtl_ship_dim = p.beansFactory.createTableColumn("Dtl.ship_dim", MCColumnType.NUMBER);
		p.columnDtl_unit_wt = p.beansFactory.createTableColumn("Dtl.unit_wt", MCColumnType.NUMBER);
		p.columnDtl_unit_dim = p.beansFactory.createTableColumn("Dtl.unit_dim", MCColumnType.NUMBER);
		p.columnDtl_dlv_id_typ = p.beansFactory.createTableColumn("Dtl.dlv_id_typ", MCColumnType.TEXT);
		p.columnDtl_dlv_id_typ_nm = p.beansFactory.createTableColumn("Dtl.dlv_id_typ_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_id_cd = p.beansFactory.createTableColumn("Dtl.dlv_id_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_id_nm = p.beansFactory.createTableColumn("Dtl.dlv_id_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_sundry_flg = p.beansFactory.createTableColumn("Dtl.dlv_sundry_flg", MCColumnType.CHECK);
		p.columnDtl_pri_prnt_flg = p.beansFactory.createTableColumn("Dtl.pri_prnt_flg", MCColumnType.CHECK);
		p.columnDtl_iv_trd_flg = p.beansFactory.createTableColumn("Dtl.iv_trd_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_str_ln_tgt_flg = p.beansFactory.createTableColumn("Dtl.dlv_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnDtl_dlv_sppl_cd = p.beansFactory.createTableColumn("Dtl.dlv_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_cst_iv_flg = p.beansFactory.createTableColumn("Dtl.cst_iv_flg", MCColumnType.CHECK);
		p.columnDtl_cst_po_no = p.beansFactory.createTableColumn("Dtl.cst_po_no", MCColumnType.TEXT);
		p.columnDtl_cst_po_d_no = p.beansFactory.createTableColumn("Dtl.cst_po_d_no", MCColumnType.TEXT);
		p.columnDtl_cst_dlv_inst_no = p.beansFactory.createTableColumn("Dtl.cst_dlv_inst_no", MCColumnType.TEXT);
		p.columnDtl_cst_dlv_inst_d_no = p.beansFactory.createTableColumn("Dtl.cst_dlv_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_rsn_cd = p.beansFactory.createTableColumn("Dtl.rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rsn_nm = p.beansFactory.createTableColumn("Dtl.rsn_nm", MCColumnType.TEXT);
		p.columnDtl_sls_acxfr_flg = p.beansFactory.createTableColumn("Dtl.sls_acxfr_flg", MCColumnType.CHECK);
		p.columnDtl_acxfr_gi_flg = p.beansFactory.createTableColumn("Dtl.acxfr_gi_flg", MCColumnType.CHECK);
		p.columnDtl_bd_dpt_cd = p.beansFactory.createTableColumn("Dtl.bd_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_bd_dpt_nm = p.beansFactory.createTableColumn("Dtl.bd_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_skip_chk_ship_flg = p.beansFactory.createTableColumn("Dtl.skip_chk_ship_flg", MCColumnType.CHECK);
		p.columnDtl_base_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.base_dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_base_prov_act_no = p.beansFactory.createTableColumn("Dtl.base_prov_act_no", MCColumnType.TEXT);
		p.columnDtl_base_ac_dt = p.beansFactory.createTableColumn("Dtl.base_ac_dt", MCColumnType.DATE);
		p.columnDtl_ship_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.ship_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_arr_cnt_rmrks = p.beansFactory.createTableColumn("Dtl.arr_cnt_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_rmrks = p.beansFactory.createTableColumn("Dtl.trd_rmrks", MCColumnType.TEXT);
		p.columnDtl_trd_d_rmrks = p.beansFactory.createTableColumn("Dtl.trd_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_intr_d_rmrks = p.beansFactory.createTableColumn("Dtl.intr_d_rmrks", MCColumnType.TEXT);
		p.columnDtl_sub_char1 = p.beansFactory.createTableColumn("Dtl.sub_char1", MCColumnType.TEXT);
		p.columnDtl_sub_char2 = p.beansFactory.createTableColumn("Dtl.sub_char2", MCColumnType.TEXT);
		p.columnDtl_sub_char3 = p.beansFactory.createTableColumn("Dtl.sub_char3", MCColumnType.TEXT);
		p.columnDtl_slo_no = p.beansFactory.createTableColumn("Dtl.slo_no", MCColumnType.TEXT);
		p.columnDtl_slo_d_no = p.beansFactory.createTableColumn("Dtl.slo_d_no", MCColumnType.TEXT);
		p.columnDtl_xfr_schd_no = p.beansFactory.createTableColumn("Dtl.xfr_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_schd_no = p.beansFactory.createTableColumn("Dtl.ship_schd_no", MCColumnType.TEXT);
		p.columnDtl_ship_alloc_sts_no = p.beansFactory.createTableColumn("Dtl.ship_alloc_sts_no", MCColumnType.TEXT);
		p.columnDtl_ship_inst_d_no = p.beansFactory.createTableColumn("Dtl.ship_inst_d_no", MCColumnType.TEXT);
		p.columnDtl_iv_no = p.beansFactory.createTableColumn("Dtl.iv_no", MCColumnType.TEXT);
		p.columnDtl_iv_d_no = p.beansFactory.createTableColumn("Dtl.iv_d_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_no", MCColumnType.TEXT);
		p.columnDtl_dlv_slip_d_no = p.beansFactory.createTableColumn("Dtl.dlv_slip_d_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_no = p.beansFactory.createTableColumn("Dtl.ship_act_no", MCColumnType.TEXT);
		p.columnDtl_ship_act_d_no = p.beansFactory.createTableColumn("Dtl.ship_act_d_no", MCColumnType.TEXT);
		p.columnDtl_wms_flg = p.beansFactory.createTableColumn("Dtl.wms_flg", MCColumnType.CHECK);
		p.columnDtl_ext_sys_cd = p.beansFactory.createTableColumn("Dtl.ext_sys_cd", MCColumnType.TEXT);
		p.columnDtl_ext_sys_nm = p.beansFactory.createTableColumn("Dtl.ext_sys_nm", MCColumnType.TEXT);
		p.columnDtl_ext_ship_act_no = p.beansFactory.createTableColumn("Dtl.ext_ship_act_no", MCColumnType.TEXT);
		p.columnDtl_disp_seq = p.beansFactory.createTableColumn("Dtl.disp_seq", MCColumnType.NUMBER);
		p.columnDtl_assort_typ = p.beansFactory.createTableColumn("Dtl.assort_typ", MCColumnType.TEXT);
		p.columnDtl_set_itm_grp_no = p.beansFactory.createTableColumn("Dtl.set_itm_grp_no", MCColumnType.NUMBER);
		p.columnDtl_ship_inst_typ = p.beansFactory.createTableColumn("Dtl.ship_inst_typ", MCColumnType.TEXT);
		p.columnDtl_ship_schd_loc_cd = p.beansFactory.createTableColumn("Dtl.ship_schd_loc_cd", MCColumnType.TEXT);
		p.columnDtl_ship_schd_loc_sppl_cd = p.beansFactory.createTableColumn("Dtl.ship_schd_loc_sppl_cd", MCColumnType.TEXT);
		p.columnDtl_ship_schd_str_ln_cd = p.beansFactory.createTableColumn("Dtl.ship_schd_str_ln_cd", MCColumnType.TEXT);
		p.columnDtl_sync_flg = p.beansFactory.createTableColumn("Dtl.sync_flg", MCColumnType.CHECK);
		p.columnDtl_read_only_flg = p.beansFactory.createTableColumn("Dtl.read_only_flg", MCColumnType.CHECK);
		p.columnDtl_base_unit_qty_bef = p.beansFactory.createTableColumn("Dtl.base_unit_qty_bef", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_prnt_dlv_slip = p.beansFactory.createButton("Btn.prnt_dlv_slip", "prnt");
		p.Btn_prnt_ship_adv = p.beansFactory.createButton("Btn.prnt_ship_adv", "prnt");
		p.Btn_open_MSBEP0110 = p.beansFactory.createButton("Btn.open_MSBEP0110", "prnt");
		p.Btn_sprt_ac_dt = p.beansFactory.createButton("Btn.sprt_ac_dt");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_ins = p.beansFactory.createButton("Btn.ins", "upd");
		p.Btn_ins_uplnd = p.beansFactory.createButton("Btn.ins_uplnd", "upd");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_indiv_prnt_flg = p.beansFactory.createCheckBox("Btn.indiv_prnt_flg");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.CndPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrTabPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NC");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_INS);
		p.ScreenOpePanel.add(p.Cnd_ope_INS);
		p.Cnd_ope_INS.setNextBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.ope_META);
		p.CndPanel.add(p.Cnd_screen_ope);
		p.CndPanel.setLastBeans(p.Cnd_screen_ope);
		p.Cnd_screen_ope.setNextBeans(p.Cnd_srch_tgt_typ);
		p.Cnd_screen_ope.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.screen_ope_META);
		p.CndPanel.add(p.Cnd_srch_tgt_typ);
		p.Cnd_srch_tgt_typ.setNextBeans(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.srch_tgt_typ_META);
		p.Cnd_srch_tgt_typ_nm.setListType(MCListType.STRICT);
		p.Cnd_srch_tgt_typ_nm.setLinkBeans(p.Cnd_srch_tgt_typ);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm_Label);
		p.CndPanel.add(p.Cnd_srch_tgt_typ_nm);
		p.Cnd_srch_tgt_typ_nm.setNextBeans(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.srch_tgt_typ_nm_META);
		p.CndPanel.add(p.Cnd_srch_tgt_no);
		p.Cnd_srch_tgt_no.setNextBeans(p.Cnd_ship_act_rev);
		p.Cnd_srch_tgt_no.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.srch_tgt_no_META);
		p.CndPanel.add(p.Cnd_ship_act_rev);
		p.Cnd_ship_act_rev.setNextBeans(p.Cnd_latest_flg);
		p.Cnd_ship_act_rev.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.ship_act_rev_META);
		p.CndPanel.add(p.Cnd_latest_flg);
		p.Cnd_latest_flg.setNextBeans(p.Cnd_srch);
		p.Cnd_latest_flg.setRow(p.getCndR(), mcframe.clientMSBE.MSBEP1440.CndR.latest_flg_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
		p.Cnd_srch.setNextBeans(p.Cnd_non_srch);
		p.Cnd_non_srch.setIcon("SEARCH");
		p.Cnd_non_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_non_srch);
	}

	/**
	 * [HdrTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdrTab(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.add(p.HdrTabPanel);
		p.HdrTabPanel.setNextBeans(p.DtlPanel);
		p.HdrTabPanel.add(p.HdrTabTab);
		p.HdrTabPanel.setLastBeans(p.HdrTabTab);
		p.HdrTabPanel.setLayoutPosition("CT");
		// ブロックの項目の初期化
		p.HdrTabTab.add(p.HdrPanel, "HdrTab.tab1");
		p.HdrTabTab.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		p.HdrTabTab.add(p.Hdr2Panel, "HdrTab.tab2");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setNextBeans(p.Hdr2Panel);
		// ブロックの項目の初期化
		p.Hdr_trd_cd.setListType(MCListType.STRICT);
		p.Hdr_trd_cd.setLinkBeans(p.Hdr_trd_nm,p.Hdr_trd_ptn_typ);
		p.HdrPanel.add(p.Hdr_trd_cd_Label);
		p.HdrPanel.add(p.Hdr_trd_cd);
		p.HdrPanel.setLastBeans(p.Hdr_trd_cd);
		p.Hdr_trd_cd.setNextBeans(p.Hdr_trd_nm);
		p.Hdr_trd_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.trd_cd_META);
		p.HdrPanel.add(p.Hdr_trd_nm);
		p.Hdr_trd_nm.setNextBeans(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.trd_nm_META);
		p.HdrPanel.add(p.Hdr_trd_ptn_typ);
		p.Hdr_trd_ptn_typ.setNextBeans(p.Hdr_ac_ym);
		p.Hdr_trd_ptn_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.trd_ptn_typ_META);
		p.HdrPanel.add(p.Hdr_ac_ym_Label);
		p.HdrPanel.add(p.Hdr_ac_ym);
		p.Hdr_ac_ym.setNextBeans(p.Hdr_ship_act_no);
		p.Hdr_ac_ym.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ac_ym_META);
		p.Hdr_ac_ym.setFormatID(mcframe.commonMA.meta.MA_META.YM_FORMAT);
		p.HdrPanel.add(p.Hdr_ship_act_no_Label);
		p.HdrPanel.add(p.Hdr_ship_act_no);
		p.Hdr_ship_act_no.setNextBeans(p.Hdr_ship_act_rev);
		p.Hdr_ship_act_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_act_no_META);
		p.HdrPanel.add(p.Hdr_ship_act_rev);
		p.Hdr_ship_act_rev.setNextBeans(p.Hdr_latest_flg);
		p.Hdr_ship_act_rev.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_act_rev_META);
		p.HdrPanel.add(p.Hdr_latest_flg);
		p.Hdr_latest_flg.setNextBeans(p.Hdr_can_flg);
		p.Hdr_latest_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.latest_flg_META);
		p.HdrPanel.add(p.Hdr_can_flg);
		p.Hdr_can_flg.setNextBeans(p.Hdr_ship_inst_no);
		p.Hdr_can_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.can_flg_META);
		p.HdrPanel.add(p.Hdr_ship_inst_no_Label);
		p.HdrPanel.add(p.Hdr_ship_inst_no);
		p.Hdr_ship_inst_no.setNextBeans(p.Hdr_iv_no);
		p.Hdr_ship_inst_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_inst_no_META);
		p.HdrPanel.add(p.Hdr_iv_no_Label);
		p.HdrPanel.add(p.Hdr_iv_no);
		p.Hdr_iv_no.setNextBeans(p.Hdr_dlv_slip_no);
		p.Hdr_iv_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.iv_no_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_no_Label);
		p.HdrPanel.add(p.Hdr_dlv_slip_no);
		p.Hdr_dlv_slip_no.setNextBeans(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_dlv_slip_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_slip_no_META);
		p.HdrPanel.add(p.Hdr_ac_dt_p_PPanel);
		p.Hdr_ac_dt_p_PPanel.setNextBeans(p.Hdr_can_ac_dt_p_PPanel);
		p.HdrPanel.add(p.Hdr_can_ac_dt_p_PPanel);
		p.Hdr_can_ac_dt_p_PPanel.setNextBeans(p.Hdr_ship_ymdhm_p_PPanel);
		p.HdrPanel.add(p.Hdr_ship_ymdhm_p_PPanel);
		p.Hdr_ship_ymdhm_p_PPanel.setNextBeans(p.Hdr_dlv_ymdhm_p_PPanel);
		p.HdrPanel.add(p.Hdr_dlv_ymdhm_p_PPanel);
		p.Hdr_dlv_ymdhm_p_PPanel.setNextBeans(p.Hdr_ss_ymdhm_p_PPanel);
		p.HdrPanel.add(p.Hdr_ss_ymdhm_p_PPanel);
		p.Hdr_ss_ymdhm_p_PPanel.setNextBeans(p.Hdr_ds_ymdhm_p_PPanel);
		p.HdrPanel.add(p.Hdr_ds_ymdhm_p_PPanel);
		p.Hdr_ds_ymdhm_p_PPanel.setNextBeans(p.Hdr_inst_ymdhm_p_PPanel);
		p.HdrPanel.add(p.Hdr_inst_ymdhm_p_PPanel);
		p.Hdr_inst_ymdhm_p_PPanel.setNextBeans(p.Hdr_ship_to_id_typ);
		p.Hdr_ship_to_id_typ.setListType(MCListType.STRICT);
		p.Hdr_ship_to_id_typ.setLinkBeans(p.Hdr_ship_to_id_typ_nm);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ_Label);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ);
		p.Hdr_ship_to_id_typ.setNextBeans(p.Hdr_ship_to_id_typ_nm);
		p.Hdr_ship_to_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_to_id_typ_META);
		p.HdrPanel.add(p.Hdr_ship_to_id_typ_nm);
		p.Hdr_ship_to_id_typ_nm.setNextBeans(p.Hdr_ship_to_id_cd);
		p.Hdr_ship_to_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_to_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_ship_to_id_cd);
		p.Hdr_ship_to_id_cd.setNextBeans(p.Hdr_ship_to_id_nm);
		p.Hdr_ship_to_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_to_id_cd_META);
		p.Hdr_ship_to_id_cd.addLinkBeans(p.Hdr_ship_to_id_nm,p.Hdr_ship_to_lg_grp_cd,p.Hdr_ship_to_lg_grp_nm,p.Hdr_ship_to_zip_cd,p.Hdr_ship_to_addr1,p.Hdr_ship_to_addr2,p.Hdr_ship_to_addr3,p.Hdr_ship_to_addr4,p.Hdr_ship_to_cntct_dpt,p.Hdr_ship_to_cntct_psn,p.Hdr_ship_to_tel,p.Hdr_ship_to_fax,p.Hdr_ship_to_sundry_flg,p.Hdr_ship_to_lg_grp_cd,p.Hdr_ship_to_lg_grp_nm,p.Hdr_ship_to_cntry_cd,p.Hdr_ship_to_cntry_nm,p.Hdr_via_dlv_typ);
		p.Hdr_ship_to_id_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_ship_to_id_nm);
		p.Hdr_ship_to_id_nm.setNextBeans(p.Hdr_ship_to_addr_p_PPanel);
		p.Hdr_ship_to_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_to_id_nm_META);
		p.HdrPanel.add(p.Hdr_ship_to_addr_p_PPanel);
		p.Hdr_ship_to_addr_p_PPanel.setNextBeans(p.Hdr_ship_to_sundry_flg);
		p.Hdr_ship_to_addr_p_PPanel.Addr_show_dtl.setGroup("RI");
		p.HdrPanel.add(p.Hdr_ship_to_sundry_flg);
		p.Hdr_ship_to_sundry_flg.setNextBeans(p.Hdr_via_dlv_typ);
		p.Hdr_ship_to_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_to_sundry_flg_META);
		p.Hdr_via_dlv_typ.setListType(MCListType.STRICT);
		p.Hdr_via_dlv_typ.setLinkBeans(p.Hdr_via_dlv_typ_nm);
		p.HdrPanel.add(p.Hdr_via_dlv_typ_Label);
		p.HdrPanel.add(p.Hdr_via_dlv_typ);
		p.Hdr_via_dlv_typ.setNextBeans(p.Hdr_via_dlv_typ_nm);
		p.Hdr_via_dlv_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.via_dlv_typ_META);
		p.HdrPanel.add(p.Hdr_via_dlv_typ_nm);
		p.Hdr_via_dlv_typ_nm.setNextBeans(p.Hdr_dlv_id_typ);
		p.Hdr_via_dlv_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.via_dlv_typ_nm_META);
		p.Hdr_dlv_id_typ.setListType(MCListType.STRICT);
		p.Hdr_dlv_id_typ.setLinkBeans(p.Hdr_dlv_id_typ_nm);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_Label);
		p.HdrPanel.add(p.Hdr_dlv_id_typ);
		p.Hdr_dlv_id_typ.setNextBeans(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_id_typ_META);
		p.HdrPanel.add(p.Hdr_dlv_id_typ_nm);
		p.Hdr_dlv_id_typ_nm.setNextBeans(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_typ_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_id_typ_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_id_cd);
		p.Hdr_dlv_id_cd.setNextBeans(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_id_cd_META);
		p.Hdr_dlv_id_cd.addLinkBeans(p.Hdr_dlv_id_nm,p.Hdr_dlv_str_ln_tgt_flg,p.Hdr_dlv_zip_cd,p.Hdr_dlv_addr1,p.Hdr_dlv_addr2,p.Hdr_dlv_addr3,p.Hdr_dlv_addr4,p.Hdr_dlv_cntct_dpt,p.Hdr_dlv_cntct_psn,p.Hdr_dlv_tel,p.Hdr_dlv_fax,p.Hdr_dlv_sundry_flg,p.Hdr_dlv_sppl_cd,p.Hdr_dlv_pri_prnt_flg,p.Hdr_dlv_cntry_cd,p.Hdr_dlv_cntry_nm,p.Hdr_prnt_lcl_cd);
		p.Hdr_dlv_id_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dlv_id_nm);
		p.Hdr_dlv_id_nm.setNextBeans(p.Hdr_dlv_addr_p_PPanel);
		p.Hdr_dlv_id_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_id_nm_META);
		p.HdrPanel.add(p.Hdr_dlv_addr_p_PPanel);
		p.Hdr_dlv_addr_p_PPanel.setNextBeans(p.Hdr_dlv_sundry_flg);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.setGroup("RI");
		p.HdrPanel.add(p.Hdr_dlv_sundry_flg);
		p.Hdr_dlv_sundry_flg.setNextBeans(p.Hdr_dlv_pri_prnt_flg);
		p.Hdr_dlv_sundry_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_sundry_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_pri_prnt_flg);
		p.Hdr_dlv_pri_prnt_flg.setNextBeans(p.Hdr_dlv_str_ln_tgt_flg);
		p.Hdr_dlv_pri_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_pri_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_str_ln_tgt_flg);
		p.Hdr_dlv_str_ln_tgt_flg.setNextBeans(p.Hdr_dlv_cd);
		p.Hdr_dlv_str_ln_tgt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_str_ln_tgt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_cd);
		p.Hdr_dlv_cd.setNextBeans(p.Hdr_dlv_sppl_cd);
		p.Hdr_dlv_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_cd_META);
		p.Hdr_dlv_cd.addLinkBeans(p.Hdr_cst_cd);
		p.Hdr_dlv_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_dlv_sppl_cd);
		p.Hdr_dlv_sppl_cd.setNextBeans(p.Hdr_cst_cd);
		p.Hdr_dlv_sppl_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_sppl_cd_META);
		p.HdrPanel.add(p.Hdr_cst_cd_Label);
		p.HdrPanel.add(p.Hdr_cst_cd);
		p.Hdr_cst_cd.setNextBeans(p.Hdr_cst_nm);
		p.Hdr_cst_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.cst_cd_META);
		p.Hdr_cst_cd.addLinkBeans(p.Hdr_cst_nm,p.Hdr_cst_usr_cd,p.Hdr_cst_dpt_cd,p.Hdr_cst_iv_flg);
		p.Hdr_cst_cd.setListType(MCListType.STRICT);
		p.HdrPanel.add(p.Hdr_cst_nm);
		p.Hdr_cst_nm.setNextBeans(p.Hdr_cst_usr_cd);
		p.Hdr_cst_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.cst_nm_META);
		p.HdrPanel.add(p.Hdr_cst_usr_cd);
		p.Hdr_cst_usr_cd.setNextBeans(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_usr_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.cst_usr_cd_META);
		p.HdrPanel.add(p.Hdr_cst_dpt_cd);
		p.Hdr_cst_dpt_cd.setNextBeans(p.Hdr_cst_iv_flg);
		p.Hdr_cst_dpt_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.cst_dpt_cd_META);
		p.HdrPanel.add(p.Hdr_cst_iv_flg);
		p.Hdr_cst_iv_flg.setNextBeans(p.Hdr_rqst_usr_dpt_p_PPanel);
		p.Hdr_cst_iv_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.cst_iv_flg_META);
		p.HdrPanel.add(p.Hdr_rqst_usr_dpt_p_PPanel);
		p.Hdr_rqst_usr_dpt_p_PPanel.setNextBeans(p.Hdr_ship_usr_dpt_p_PPanel);
		p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_rqst_dpt_nm);
		p.HdrPanel.add(p.Hdr_ship_usr_dpt_p_PPanel);
		p.Hdr_ship_usr_dpt_p_PPanel.setNextBeans(p.Hdr_lot_chk_off_flg);
		p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setLinkBeans(p.Hdr_ship_dpt_nm);
		p.HdrPanel.add(p.Hdr_lot_chk_off_flg);
		p.Hdr_lot_chk_off_flg.setNextBeans(p.Hdr_ship_fr_lg_grp_cd);
		p.Hdr_lot_chk_off_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.lot_chk_off_flg_META);
		p.Hdr_ship_fr_lg_grp_cd.setListType(MCListType.STRICT);
		p.Hdr_ship_fr_lg_grp_cd.setLinkBeans(p.Hdr_ship_fr_lg_grp_nm,p.Hdr_dlv_slip_prnt_flg,p.Hdr_ship_adv_prnt_flg);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_cd);
		p.Hdr_ship_fr_lg_grp_cd.setNextBeans(p.Hdr_ship_fr_lg_grp_nm);
		p.Hdr_ship_fr_lg_grp_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_fr_lg_grp_cd_META);
		p.HdrPanel.add(p.Hdr_ship_fr_lg_grp_nm);
		p.Hdr_ship_fr_lg_grp_nm.setNextBeans(p.Hdr_ship_term_cd);
		p.Hdr_ship_fr_lg_grp_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_fr_lg_grp_nm_META);
		p.HdrPanel.add(p.Hdr_ship_term_cd_Label);
		p.HdrPanel.add(p.Hdr_ship_term_cd);
		p.Hdr_ship_term_cd.setNextBeans(p.Hdr_ship_term_nm);
		p.Hdr_ship_term_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_term_cd_META);
		p.HdrPanel.add(p.Hdr_ship_term_nm);
		p.Hdr_ship_term_nm.setNextBeans(p.Hdr_ship_wt);
		p.Hdr_ship_term_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_term_nm_META);
		p.HdrPanel.add(p.Hdr_ship_wt_Label);
		p.HdrPanel.add(p.Hdr_ship_wt);
		p.Hdr_ship_wt.setNextBeans(p.Hdr_ship_dim);
		p.Hdr_ship_wt.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_wt_META);
		p.HdrPanel.add(p.Hdr_ship_dim_Label);
		p.HdrPanel.add(p.Hdr_ship_dim);
		p.Hdr_ship_dim.setNextBeans(p.Hdr_inst_dlv_prnted_flg);
		p.Hdr_ship_dim.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_dim_META);
		p.HdrPanel.add(p.Hdr_inst_dlv_prnted_flg);
		p.Hdr_inst_dlv_prnted_flg.setNextBeans(p.Hdr_dlv_slip_prnt_flg);
		p.Hdr_inst_dlv_prnted_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.inst_dlv_prnted_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_prnt_flg);
		p.Hdr_dlv_slip_prnt_flg.setNextBeans(p.Hdr_ship_adv_prnt_flg);
		p.Hdr_dlv_slip_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_slip_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_ship_adv_prnt_flg);
		p.Hdr_ship_adv_prnt_flg.setNextBeans(p.Hdr_dlv_slip_prnted_flg);
		p.Hdr_ship_adv_prnt_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_adv_prnt_flg_META);
		p.HdrPanel.add(p.Hdr_dlv_slip_prnted_flg);
		p.Hdr_dlv_slip_prnted_flg.setNextBeans(p.Hdr_ship_adv_prnted_flg);
		p.Hdr_dlv_slip_prnted_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.dlv_slip_prnted_flg_META);
		p.HdrPanel.add(p.Hdr_ship_adv_prnted_flg);
		p.Hdr_ship_adv_prnted_flg.setNextBeans(p.Hdr_uplnd_flg);
		p.Hdr_ship_adv_prnted_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ship_adv_prnted_flg_META);
		p.HdrPanel.add(p.Hdr_uplnd_flg);
		p.Hdr_uplnd_flg.setNextBeans(p.Hdr_intr_rmrks);
		p.Hdr_uplnd_flg.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.uplnd_flg_META);
		p.HdrPanel.add(p.Hdr_intr_rmrks_Label);
		p.HdrPanel.add(p.Hdr_intr_rmrks);
		p.Hdr_intr_rmrks.setNextBeans(p.Hdr_sub_char1);
		p.Hdr_intr_rmrks.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.intr_rmrks_META);
		p.HdrPanel.add(p.Hdr_sub_char1_Label);
		p.HdrPanel.add(p.Hdr_sub_char1);
		p.Hdr_sub_char1.setNextBeans(p.Hdr_sub_char2);
		p.Hdr_sub_char1.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.sub_char1_META);
		p.HdrPanel.add(p.Hdr_sub_char2_Label);
		p.HdrPanel.add(p.Hdr_sub_char2);
		p.Hdr_sub_char2.setNextBeans(p.Hdr_sub_char3);
		p.Hdr_sub_char2.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.sub_char2_META);
		p.HdrPanel.add(p.Hdr_sub_char3_Label);
		p.HdrPanel.add(p.Hdr_sub_char3);
		p.Hdr_sub_char3.setNextBeans(p.Hdr_prnt_lcl_cd);
		p.Hdr_sub_char3.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.sub_char3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.upd_srv_req_no_META);
		p.HdrPanel.add(p.Hdr_prnt_lcl_cd);
		p.Hdr_prnt_lcl_cd.setRow(p.getHdrR(), mcframe.clientMSBE.MSBEP1440.HdrR.prnt_lcl_cd_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.add(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.BtnPanel);
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnPanel.add(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.BtnPanel.setLastBeans(p.Btn_Btn_open_MSBEP0500_PPanel);
		p.Btn_Btn_open_MSBEP0500_PPanel.setNextBeans(p.Btn_prnt_dlv_slip);
		p.Btn_prnt_dlv_slip.setIcon("PRINT");
		p.BtnPanel.add(p.Btn_prnt_dlv_slip);
		p.Btn_prnt_dlv_slip.setNextBeans(p.Btn_prnt_ship_adv);
		p.Btn_prnt_ship_adv.setIcon("PRINT");
		p.BtnPanel.add(p.Btn_prnt_ship_adv);
		p.Btn_prnt_ship_adv.setNextBeans(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setIcon("PRINT");
		p.BtnPanel.add(p.Btn_open_MSBEP0110);
		p.Btn_open_MSBEP0110.setNextBeans(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setFunctionKey(MCFunctionKey.F16);
		p.BtnPanel.add(p.Btn_sprt_ac_dt);
		p.Btn_sprt_ac_dt.setNextBeans(p.Btn_menu_move_p_PPanel);
		p.BtnPanel.add(p.Btn_menu_move_p_PPanel);
		p.Btn_menu_move_p_PPanel.setNextBeans(p.Btn_radd);
		p.Btn_radd.setIcon("INSERT_RECORD");
		p.Btn_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_radd);
		p.Btn_radd.setNextBeans(p.Btn_rdel);
		p.Btn_rdel.setIcon("DELETE_RECORD");
		p.Btn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_rdel);
		p.Btn_rdel.setNextBeans(p.Btn_rcopy);
		p.Btn_rcopy.setIcon("COPY_RECORD");
		p.Btn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnPanel.add(p.Btn_rcopy);
		p.Btn_rcopy.setNextBeans(p.Btn_ins);
		p.Btn_ins.setIcon("REGISTER");
		p.Btn_ins.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins);
		p.Btn_ins.setNextBeans(p.Btn_ins_uplnd);
		p.Btn_ins_uplnd.setIcon("REGISTER");
		p.Btn_ins_uplnd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins_uplnd);
		p.Btn_ins_uplnd.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_indiv_prnt_flg);
		p.BtnPanel.add(p.Btn_indiv_prnt_flg);
		p.Btn_indiv_prnt_flg.setRow(p.getBtnR(), mcframe.clientMSBE.MSBEP1440.BtnR.indiv_prnt_flg_META);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBEP_ShipActReg p) {
		// ブロック関連の初期化
		p.add(p.EastBtnPanel);
		p.EastBtnPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
	}

	/**
	 * MCLayouterの指定文字列を返します。
	 */
	public String getLayoutKey() {
		return "G";
	}

	/**
	 * 画面部品初期設定（MCFrame仕様）
	 */
	protected void mcInit() {
		super.mcInit();
		MSBEP_ShipActReg_MC.mcInitScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitCnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitHdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitHdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitHdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitDtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitBtn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.mcInitEastBtn((MSBEP_ShipActReg)this);

		// [SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitSRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitSRCH_EastBtn((MSBEP_ShipActReg)this);

		// [INS]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitINS_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS_EastBtn((MSBEP_ShipActReg)this);

		// [INS_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitINS__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__NON_EastBtn((MSBEP_ShipActReg)this);

		// [INS_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitINS__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [UPD]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitUPD_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD_EastBtn((MSBEP_ShipActReg)this);

		// [UPD_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitUPD__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__NON_EastBtn((MSBEP_ShipActReg)this);

		// [UPD_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitUPD__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [DEL]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitDEL_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL_EastBtn((MSBEP_ShipActReg)this);

		// [DEL_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitDEL__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__NON_EastBtn((MSBEP_ShipActReg)this);

		// [DEL_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitDEL__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [REF]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitREF_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF_EastBtn((MSBEP_ShipActReg)this);

		// [REF_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitREF__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__NON_EastBtn((MSBEP_ShipActReg)this);

		// [REF_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitREF__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_I]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__I_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_I_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__NON_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_I_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__I__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_U]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__U_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_U_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__NON_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_U_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__U__SRCH_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_D]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__D_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_D_NON]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__NON_EastBtn((MSBEP_ShipActReg)this);

		// [FIX_D_SRCH]ステータスのモードの設定
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_ScreenOpe((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Cnd((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_HdrTab((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Hdr((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Hdr2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Dtl((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Dtl2((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_Btn((MSBEP_ShipActReg)this);
		MSBEP_ShipActReg_MC.statusInitFIX__D__SRCH_EastBtn((MSBEP_ShipActReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBEP_ShipActReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBEP_ShipActReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_INS.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_screen_ope.setListListener(p);
		p.Cnd_screen_ope.addAllListener(p);
		p.Cnd_srch_tgt_typ.setListListener(p);
		p.Cnd_srch_tgt_typ.addAllListener(p);
		p.Cnd_srch_tgt_typ_nm.setListListener(p);
		p.Cnd_srch_tgt_typ_nm.addAllListener(p);
		p.Cnd_srch_tgt_no.setListListener(p);
		p.Cnd_srch_tgt_no.addAllListener(p);
		p.Cnd_ship_act_rev.setListListener(p);
		p.Cnd_ship_act_rev.addAllListener(p);
		p.Cnd_latest_flg.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
		p.Cnd_non_srch.addAllListener(p);
		p.Cnd_non_srch.setAPMethodName("doCnd_non_srch");
	}

	/**
	 *  [HdrTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdrTab(MSBEP_ShipActReg p) {
		p.HdrTabTab.addAllListener(p);
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MSBEP_ShipActReg p) {
		p.Hdr_trd_cd.setListListener(p);
		p.Hdr_trd_cd.addAllListener(p);
		p.Hdr_trd_nm.setListListener(p);
		p.Hdr_trd_nm.addAllListener(p);
		p.Hdr_trd_ptn_typ.setListListener(p);
		p.Hdr_trd_ptn_typ.addAllListener(p);
		p.Hdr_ac_ym.setListListener(p);
		p.Hdr_ac_ym.addAllListener(p);
		p.Hdr_ship_act_no.setListListener(p);
		p.Hdr_ship_act_no.addAllListener(p);
		p.Hdr_ship_act_rev.setListListener(p);
		p.Hdr_ship_act_rev.addAllListener(p);
		p.Hdr_latest_flg.addAllListener(p);
		p.Hdr_can_flg.addAllListener(p);
		p.Hdr_ship_inst_no.setListListener(p);
		p.Hdr_ship_inst_no.addAllListener(p);
		p.Hdr_iv_no.setListListener(p);
		p.Hdr_iv_no.addAllListener(p);
		p.Hdr_dlv_slip_no.setListListener(p);
		p.Hdr_dlv_slip_no.addAllListener(p);
		p.Hdr_ship_to_id_typ.setListListener(p);
		p.Hdr_ship_to_id_typ.addAllListener(p);
		p.Hdr_ship_to_id_typ_nm.setListListener(p);
		p.Hdr_ship_to_id_typ_nm.addAllListener(p);
		p.Hdr_ship_to_id_cd.setListListener(p);
		p.Hdr_ship_to_id_cd.addAllListener(p);
		p.Hdr_ship_to_id_nm.setListListener(p);
		p.Hdr_ship_to_id_nm.addAllListener(p);
		p.Hdr_ship_to_sundry_flg.addAllListener(p);
		p.Hdr_via_dlv_typ.setListListener(p);
		p.Hdr_via_dlv_typ.addAllListener(p);
		p.Hdr_via_dlv_typ_nm.setListListener(p);
		p.Hdr_via_dlv_typ_nm.addAllListener(p);
		p.Hdr_dlv_id_typ.setListListener(p);
		p.Hdr_dlv_id_typ.addAllListener(p);
		p.Hdr_dlv_id_typ_nm.setListListener(p);
		p.Hdr_dlv_id_typ_nm.addAllListener(p);
		p.Hdr_dlv_id_cd.setListListener(p);
		p.Hdr_dlv_id_cd.addAllListener(p);
		p.Hdr_dlv_id_nm.setListListener(p);
		p.Hdr_dlv_id_nm.addAllListener(p);
		p.Hdr_dlv_sundry_flg.addAllListener(p);
		p.Hdr_dlv_pri_prnt_flg.addAllListener(p);
		p.Hdr_dlv_str_ln_tgt_flg.addAllListener(p);
		p.Hdr_dlv_cd.setListListener(p);
		p.Hdr_dlv_cd.addAllListener(p);
		p.Hdr_dlv_sppl_cd.setListListener(p);
		p.Hdr_dlv_sppl_cd.addAllListener(p);
		p.Hdr_cst_cd.setListListener(p);
		p.Hdr_cst_cd.addAllListener(p);
		p.Hdr_cst_nm.setListListener(p);
		p.Hdr_cst_nm.addAllListener(p);
		p.Hdr_cst_usr_cd.setListListener(p);
		p.Hdr_cst_usr_cd.addAllListener(p);
		p.Hdr_cst_dpt_cd.setListListener(p);
		p.Hdr_cst_dpt_cd.addAllListener(p);
		p.Hdr_cst_iv_flg.addAllListener(p);
		p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_lot_chk_off_flg.addAllListener(p);
		p.Hdr_ship_fr_lg_grp_cd.setListListener(p);
		p.Hdr_ship_fr_lg_grp_cd.addAllListener(p);
		p.Hdr_ship_fr_lg_grp_nm.setListListener(p);
		p.Hdr_ship_fr_lg_grp_nm.addAllListener(p);
		p.Hdr_ship_term_cd.setListListener(p);
		p.Hdr_ship_term_cd.addAllListener(p);
		p.Hdr_ship_term_nm.setListListener(p);
		p.Hdr_ship_term_nm.addAllListener(p);
		p.Hdr_ship_wt.setListListener(p);
		p.Hdr_ship_wt.addAllListener(p);
		p.Hdr_ship_dim.setListListener(p);
		p.Hdr_ship_dim.addAllListener(p);
		p.Hdr_inst_dlv_prnted_flg.addAllListener(p);
		p.Hdr_dlv_slip_prnt_flg.addAllListener(p);
		p.Hdr_ship_adv_prnt_flg.addAllListener(p);
		p.Hdr_dlv_slip_prnted_flg.addAllListener(p);
		p.Hdr_ship_adv_prnted_flg.addAllListener(p);
		p.Hdr_uplnd_flg.addAllListener(p);
		p.Hdr_intr_rmrks.setListListener(p);
		p.Hdr_intr_rmrks.addAllListener(p);
		p.Hdr_sub_char1.setListListener(p);
		p.Hdr_sub_char1.addAllListener(p);
		p.Hdr_sub_char2.setListListener(p);
		p.Hdr_sub_char2.addAllListener(p);
		p.Hdr_sub_char3.setListListener(p);
		p.Hdr_sub_char3.addAllListener(p);
		p.Hdr_ins_usr_id.setListListener(p);
		p.Hdr_ins_usr_id.addAllListener(p);
		p.Hdr_ins_usr_nm.setListListener(p);
		p.Hdr_ins_usr_nm.addAllListener(p);
		p.Hdr_ins_func_id.setListListener(p);
		p.Hdr_ins_func_id.addAllListener(p);
		p.Hdr_ins_func_nm.setListListener(p);
		p.Hdr_ins_func_nm.addAllListener(p);
		p.Hdr_upd_usr_id.setListListener(p);
		p.Hdr_upd_usr_id.addAllListener(p);
		p.Hdr_upd_usr_nm.setListListener(p);
		p.Hdr_upd_usr_nm.addAllListener(p);
		p.Hdr_upd_func_id.setListListener(p);
		p.Hdr_upd_func_id.addAllListener(p);
		p.Hdr_upd_func_nm.setListListener(p);
		p.Hdr_upd_func_nm.addAllListener(p);
		p.Hdr_ins_ts.setListListener(p);
		p.Hdr_ins_ts.addAllListener(p);
		p.Hdr_upd_ts.setListListener(p);
		p.Hdr_upd_ts.addAllListener(p);
		p.Hdr_upd_srv_req_no.setListListener(p);
		p.Hdr_upd_srv_req_no.addAllListener(p);
		p.Hdr_prnt_lcl_cd.setListListener(p);
		p.Hdr_prnt_lcl_cd.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MSBEP_ShipActReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MSBEP_ShipActReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_pr_sts_typ.addAllListener(p);
		p.columnDtl_pr_sts_typ.setListListener(p);
		p.columnDtl_pr_sts_typ_nm.addAllListener(p);
		p.columnDtl_pr_sts_typ_nm.setListListener(p);
		p.columnDtl_trd_cd.addAllListener(p);
		p.columnDtl_trd_cd.setListListener(p);
		p.columnDtl_trd_nm.addAllListener(p);
		p.columnDtl_trd_nm.setListListener(p);
		p.columnDtl_trd_ptn_typ.addAllListener(p);
		p.columnDtl_trd_ptn_typ.setListListener(p);
		p.columnDtl_cststk_flg.addAllListener(p);
		p.columnDtl_loan_flg.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_cst_itm_cd.addAllListener(p);
		p.columnDtl_cst_itm_cd.setListListener(p);
		p.columnDtl_cst_itm_nm.addAllListener(p);
		p.columnDtl_cst_itm_nm.setListListener(p);
		p.columnDtl_iv_itm_nm.addAllListener(p);
		p.columnDtl_iv_itm_nm.setListListener(p);
		p.columnDtl_stk_mng_typ.addAllListener(p);
		p.columnDtl_stk_mng_typ.setListListener(p);
		p.columnDtl_sundry_itm_flg.addAllListener(p);
		p.columnDtl_dscnt_itm_flg.addAllListener(p);
		p.columnDtl_lot_mng_typ.addAllListener(p);
		p.columnDtl_lot_mng_typ.setListListener(p);
		p.columnDtl_sublot_mng_typ.addAllListener(p);
		p.columnDtl_sublot_mng_typ.setListListener(p);
		p.columnDtl_sno1_mng_typ.addAllListener(p);
		p.columnDtl_sno1_mng_typ.setListListener(p);
		p.columnDtl_sno2_mng_typ.addAllListener(p);
		p.columnDtl_sno2_mng_typ.setListListener(p);
		p.columnDtl_sno3_mng_typ.addAllListener(p);
		p.columnDtl_sno3_mng_typ.setListListener(p);
		p.columnDtl_sno4_mng_typ.addAllListener(p);
		p.columnDtl_sno4_mng_typ.setListListener(p);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_ver_flg.addAllListener(p);
		p.columnDtl_not_lot_mix_flg.addAllListener(p);
		p.columnDtl_not_sublot_mix_flg.addAllListener(p);
		p.columnDtl_trd_unit_cd.addAllListener(p);
		p.columnDtl_trd_unit_cd.setListListener(p);
		p.columnDtl_trd_unit_nm.addAllListener(p);
		p.columnDtl_trd_unit_nm.setListListener(p);
		p.columnDtl_trd_unit_conv_base_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_base_qty.setListListener(p);
		p.columnDtl_trd_unit_conv_qty.addAllListener(p);
		p.columnDtl_trd_unit_conv_qty.setListListener(p);
		p.columnDtl_trd_unit_dec_place.addAllListener(p);
		p.columnDtl_trd_unit_dec_place.setListListener(p);
		p.columnDtl_trd_unit_rnd_typ.addAllListener(p);
		p.columnDtl_trd_unit_rnd_typ.setListListener(p);
		p.columnDtl_abort_flg.addAllListener(p);
		p.columnDtl_base_unit_cd.addAllListener(p);
		p.columnDtl_base_unit_cd.setListListener(p);
		p.columnDtl_base_unit_nm.addAllListener(p);
		p.columnDtl_base_unit_nm.setListListener(p);
		p.columnDtl_base_unit_dec_place.addAllListener(p);
		p.columnDtl_base_unit_dec_place.setListListener(p);
		p.columnDtl_base_unit_rnd_typ.addAllListener(p);
		p.columnDtl_base_unit_rnd_typ.setListListener(p);
		p.columnDtl_cont_fctr_flg.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.addAllListener(p);
		p.columnDtl_cont_fctr_dec_place.setListListener(p);
		p.columnDtl_cont_fctr_rnd_typ.addAllListener(p);
		p.columnDtl_cont_fctr_rnd_typ.setListListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.addAllListener(p);
		p.columnDtl_ship_fr_lg_grp_cd.setListListener(p);
		p.columnDtl_ship_loc_cd.addAllListener(p);
		p.columnDtl_ship_loc_cd.setListListener(p);
		p.columnDtl_ship_loc_nm.addAllListener(p);
		p.columnDtl_ship_loc_nm.setListListener(p);
		p.columnDtl_loc_mng_typ.addAllListener(p);
		p.columnDtl_loc_mng_typ.setListListener(p);
		p.columnDtl_ship_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_ship_loc_sppl_cd.addAllListener(p);
		p.columnDtl_ship_loc_sppl_cd.setListListener(p);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_quality_typ.addAllListener(p);
		p.columnDtl_quality_typ.setListListener(p);
		p.columnDtl_quality_typ_nm.addAllListener(p);
		p.columnDtl_quality_typ_nm.setListListener(p);
		p.columnDtl_gd_cd.addAllListener(p);
		p.columnDtl_gd_cd.setListListener(p);
		p.columnDtl_gd_nm.addAllListener(p);
		p.columnDtl_gd_nm.setListListener(p);
		p.columnDtl_stk_id_typ.addAllListener(p);
		p.columnDtl_stk_id_typ.setListListener(p);
		p.columnDtl_stk_id_typ_nm.addAllListener(p);
		p.columnDtl_stk_id_typ_nm.setListListener(p);
		p.columnDtl_stk_arrv_bp_cd.addAllListener(p);
		p.columnDtl_stk_arrv_bp_cd.setListListener(p);
		p.columnDtl_stk_arrv_bp_nm.addAllListener(p);
		p.columnDtl_stk_arrv_bp_nm.setListListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_sppl_cd.addAllListener(p);
		p.columnDtl_sppl_cd.setListListener(p);
		p.columnDtl_ship_wt.addAllListener(p);
		p.columnDtl_ship_wt.setListListener(p);
		p.columnDtl_ship_dim.addAllListener(p);
		p.columnDtl_ship_dim.setListListener(p);
		p.columnDtl_unit_wt.addAllListener(p);
		p.columnDtl_unit_wt.setListListener(p);
		p.columnDtl_unit_dim.addAllListener(p);
		p.columnDtl_unit_dim.setListListener(p);
		p.columnDtl_dlv_id_typ.addAllListener(p);
		p.columnDtl_dlv_id_typ.setListListener(p);
		p.columnDtl_dlv_id_typ_nm.addAllListener(p);
		p.columnDtl_dlv_id_typ_nm.setListListener(p);
		p.columnDtl_dlv_id_cd.addAllListener(p);
		p.columnDtl_dlv_id_cd.setListListener(p);
		p.columnDtl_dlv_id_nm.addAllListener(p);
		p.columnDtl_dlv_id_nm.setListListener(p);
		p.columnDtl_dlv_sundry_flg.addAllListener(p);
		p.columnDtl_pri_prnt_flg.addAllListener(p);
		p.columnDtl_iv_trd_flg.addAllListener(p);
		p.columnDtl_dlv_str_ln_tgt_flg.addAllListener(p);
		p.columnDtl_dlv_sppl_cd.addAllListener(p);
		p.columnDtl_dlv_sppl_cd.setListListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_cst_iv_flg.addAllListener(p);
		p.columnDtl_cst_po_no.addAllListener(p);
		p.columnDtl_cst_po_no.setListListener(p);
		p.columnDtl_cst_po_d_no.addAllListener(p);
		p.columnDtl_cst_po_d_no.setListListener(p);
		p.columnDtl_cst_dlv_inst_no.addAllListener(p);
		p.columnDtl_cst_dlv_inst_no.setListListener(p);
		p.columnDtl_cst_dlv_inst_d_no.addAllListener(p);
		p.columnDtl_cst_dlv_inst_d_no.setListListener(p);
		p.columnDtl_rsn_cd.addAllListener(p);
		p.columnDtl_rsn_cd.setListListener(p);
		p.columnDtl_rsn_nm.addAllListener(p);
		p.columnDtl_rsn_nm.setListListener(p);
		p.columnDtl_sls_acxfr_flg.addAllListener(p);
		p.columnDtl_acxfr_gi_flg.addAllListener(p);
		p.columnDtl_bd_dpt_cd.addAllListener(p);
		p.columnDtl_bd_dpt_cd.setListListener(p);
		p.columnDtl_bd_dpt_nm.addAllListener(p);
		p.columnDtl_bd_dpt_nm.setListListener(p);
		p.columnDtl_skip_chk_ship_flg.addAllListener(p);
		p.columnDtl_base_dlv_slip_no.addAllListener(p);
		p.columnDtl_base_dlv_slip_no.setListListener(p);
		p.columnDtl_base_prov_act_no.addAllListener(p);
		p.columnDtl_base_prov_act_no.setListListener(p);
		p.columnDtl_base_ac_dt.addAllListener(p);
		p.columnDtl_base_ac_dt.setListListener(p);
		p.columnDtl_ship_cnt_rmrks.addAllListener(p);
		p.columnDtl_ship_cnt_rmrks.setListListener(p);
		p.columnDtl_arr_cnt_rmrks.addAllListener(p);
		p.columnDtl_arr_cnt_rmrks.setListListener(p);
		p.columnDtl_trd_rmrks.addAllListener(p);
		p.columnDtl_trd_rmrks.setListListener(p);
		p.columnDtl_trd_d_rmrks.addAllListener(p);
		p.columnDtl_trd_d_rmrks.setListListener(p);
		p.columnDtl_intr_d_rmrks.addAllListener(p);
		p.columnDtl_intr_d_rmrks.setListListener(p);
		p.columnDtl_sub_char1.addAllListener(p);
		p.columnDtl_sub_char1.setListListener(p);
		p.columnDtl_sub_char2.addAllListener(p);
		p.columnDtl_sub_char2.setListListener(p);
		p.columnDtl_sub_char3.addAllListener(p);
		p.columnDtl_sub_char3.setListListener(p);
		p.columnDtl_slo_no.addAllListener(p);
		p.columnDtl_slo_no.setListListener(p);
		p.columnDtl_slo_d_no.addAllListener(p);
		p.columnDtl_slo_d_no.setListListener(p);
		p.columnDtl_xfr_schd_no.addAllListener(p);
		p.columnDtl_xfr_schd_no.setListListener(p);
		p.columnDtl_ship_schd_no.addAllListener(p);
		p.columnDtl_ship_schd_no.setListListener(p);
		p.columnDtl_ship_alloc_sts_no.addAllListener(p);
		p.columnDtl_ship_alloc_sts_no.setListListener(p);
		p.columnDtl_ship_inst_d_no.addAllListener(p);
		p.columnDtl_ship_inst_d_no.setListListener(p);
		p.columnDtl_iv_no.addAllListener(p);
		p.columnDtl_iv_no.setListListener(p);
		p.columnDtl_iv_d_no.addAllListener(p);
		p.columnDtl_iv_d_no.setListListener(p);
		p.columnDtl_dlv_slip_no.addAllListener(p);
		p.columnDtl_dlv_slip_no.setListListener(p);
		p.columnDtl_dlv_slip_d_no.addAllListener(p);
		p.columnDtl_dlv_slip_d_no.setListListener(p);
		p.columnDtl_ship_act_no.addAllListener(p);
		p.columnDtl_ship_act_no.setListListener(p);
		p.columnDtl_ship_act_d_no.addAllListener(p);
		p.columnDtl_ship_act_d_no.setListListener(p);
		p.columnDtl_wms_flg.addAllListener(p);
		p.columnDtl_ext_sys_cd.addAllListener(p);
		p.columnDtl_ext_sys_cd.setListListener(p);
		p.columnDtl_ext_sys_nm.addAllListener(p);
		p.columnDtl_ext_sys_nm.setListListener(p);
		p.columnDtl_ext_ship_act_no.addAllListener(p);
		p.columnDtl_ext_ship_act_no.setListListener(p);
		p.columnDtl_disp_seq.addAllListener(p);
		p.columnDtl_disp_seq.setListListener(p);
		p.columnDtl_assort_typ.addAllListener(p);
		p.columnDtl_assort_typ.setListListener(p);
		p.columnDtl_set_itm_grp_no.addAllListener(p);
		p.columnDtl_set_itm_grp_no.setListListener(p);
		p.columnDtl_ship_inst_typ.addAllListener(p);
		p.columnDtl_ship_inst_typ.setListListener(p);
		p.columnDtl_ship_schd_loc_cd.addAllListener(p);
		p.columnDtl_ship_schd_loc_cd.setListListener(p);
		p.columnDtl_ship_schd_loc_sppl_cd.addAllListener(p);
		p.columnDtl_ship_schd_loc_sppl_cd.setListListener(p);
		p.columnDtl_ship_schd_str_ln_cd.addAllListener(p);
		p.columnDtl_ship_schd_str_ln_cd.setListListener(p);
		p.columnDtl_sync_flg.addAllListener(p);
		p.columnDtl_read_only_flg.addAllListener(p);
		p.columnDtl_base_unit_qty_bef.addAllListener(p);
		p.columnDtl_base_unit_qty_bef.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBEP_ShipActReg p) {
		p.Btn_prnt_dlv_slip.addAllListener(p);
		p.Btn_prnt_dlv_slip.setAPMethodName("doBtn_prnt_dlv_slip");
		p.Btn_prnt_ship_adv.addAllListener(p);
		p.Btn_prnt_ship_adv.setAPMethodName("doBtn_prnt_ship_adv");
		p.Btn_open_MSBEP0110.addAllListener(p);
		p.Btn_open_MSBEP0110.setAPMethodName("doBtn_open_MSBEP0110");
		p.Btn_sprt_ac_dt.addAllListener(p);
		p.Btn_sprt_ac_dt.setAPMethodName("doBtn_sprt_ac_dt");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_ins.addAllListener(p);
		p.Btn_ins.setAPMethodName("doBtn_ins");
		p.Btn_ins_uplnd.addAllListener(p);
		p.Btn_ins_uplnd.setAPMethodName("doBtn_ins_uplnd");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_indiv_prnt_flg.addAllListener(p);
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBEP_ShipActReg p) {
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_ins_uplnd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [INS]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_trd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ship_to_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ship_to_id_nm.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dlv_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_dlv_id_nm.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.REQUIRED);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_loan_flg.putMode(p, INS, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_iv_itm_nm.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_quality_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_gd_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_dlv_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_po_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_rsn_cd.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, INS, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, INS, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, INS, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, INS, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, INS, MCMode.ENABLE);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, INS_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, INS_NON, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_NON, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS_NON, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_base_unit_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, INS_NON, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(INS_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS_NON, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_NON, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, INS_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS_NON, MCMode.INVISIBLE);

	}

	/**
	 * [INS_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS_NON, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, INS_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_NON, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_NON, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_NON, MCMode.ENABLE);
		p.Btn_ins_uplnd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, INS_NON, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS_NON, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS_NON, MCMode.DISABLE);

	}

	/**
	 * [INS_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_base_unit_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(INS_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, INS_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, INS_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [INS_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [INS_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(INS_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(INS_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, INS_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Btn_ins.putMode(p, INS_SRCH, MCMode.ENABLE);
		p.Btn_ins_uplnd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, INS_SRCH, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, INS_SRCH, MCMode.REQUIRED);
		p.Btn_del.putMode(p, INS_SRCH, MCMode.DISABLE);

	}

	/**
	 * [INS_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ship_to_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ship_to_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_dlv_id_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.ENABLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_loan_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_cst_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_iv_itm_nm.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_quality_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_gd_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.REQUIRED);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_dlv_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_po_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_dlv_inst_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, UPD_NON, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(UPD_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(UPD_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(UPD_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_NON, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, UPD_NON, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, UPD_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, UPD_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, UPD_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, UPD_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, UPD_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_NON, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD_NON, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD_NON, MCMode.DISABLE);

	}

	/**
	 * [UPD_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, UPD_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.REQUIRED);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.REQUIRED);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.ENABLE);
		p.Hdr_lot_chk_off_flg.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char1.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char2.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_sub_char3.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.REQUIRED);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.columnDtl_trd_unit_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnDtl_abort_flg.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_base_unit_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.columnDtl_ship_loc_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.columnDtl_quality_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(UPD_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.columnDtl_bd_dpt_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_base_dlv_slip_no.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_base_prov_act_no.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_base_ac_dt.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_ship_cnt_rmrks.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_trd_rmrks.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char1.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char2.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_sub_char3.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.columnDtl_slo_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, UPD_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, UPD_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [UPD_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(UPD_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.ENABLE);
		p.Btn_prnt_dlv_slip.putMode(p, UPD_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, UPD_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, UPD_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Btn_menu_move_p_PPanel.putStatus(UPD_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.Btn_radd.putMode(p, UPD_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Btn_ins.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, UPD_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, UPD_SRCH, MCMode.ENABLE);
		p.Btn_indiv_prnt_flg.putMode(p, UPD_SRCH, MCMode.REQUIRED);
		p.Btn_del.putMode(p, UPD_SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, DEL_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, DEL_NON, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, DEL_NON, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(DEL_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(DEL_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(DEL_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, DEL_NON, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, DEL_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL_NON, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL_NON, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL_NON, MCMode.ENABLE);

	}

	/**
	 * [DEL_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, DEL_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, DEL_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, DEL_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.REQUIRED);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, DEL_SRCH, MCMode.ENABLE);
		p.Hdr_ship_adv_prnt_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(DEL_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, DEL_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, DEL_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [DEL_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(DEL_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(DEL_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, DEL_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, DEL_SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, DEL_SRCH, MCMode.REQUIRED);
		p.Btn_del.putMode(p, DEL_SRCH, MCMode.ENABLE);

	}

	/**
	 * [DEL_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, REF, MCMode.ENABLE);
		p.Btn_prnt_ship_adv.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF, MCMode.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, REF_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, REF_NON, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF_NON, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, REF_NON, MCMode.INVISIBLE);

	}

	/**
	 * [REF_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);

	}

	/**
	 * [REF_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(REF_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(REF_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(REF_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(REF_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, REF_NON, MCMode.INVISIBLE);

	}

	/**
	 * [REF_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, REF_NON, MCMode.ENABLE);
		p.Btn_prnt_ship_adv.putMode(p, REF_NON, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF_NON, MCMode.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, REF_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_NON, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, REF_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF_NON, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_NON, MCMode.REQUIRED);
		p.Btn_del.putMode(p, REF_NON, MCMode.DISABLE);

	}

	/**
	 * [REF_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, REF_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, REF_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, REF_SRCH, MCMode.ENABLE);
		p.Cnd_latest_flg.putMode(p, REF_SRCH, MCMode.REQUIRED);
		p.Cnd_srch.putMode(p, REF_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, REF_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(REF_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(REF_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(REF_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(REF_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(REF_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, REF_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, REF_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [REF_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [REF_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(REF_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, REF_SRCH, MCMode.ENABLE);
		p.Btn_prnt_ship_adv.putMode(p, REF_SRCH, MCMode.ENABLE);
		p.Btn_open_MSBEP0110.putMode(p, REF_SRCH, MCMode.ENABLE);
		p.Btn_sprt_ac_dt.putMode(p, REF_SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(REF_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, REF_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, REF_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, REF_SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, REF_SRCH, MCMode.REQUIRED);
		p.Btn_del.putMode(p, REF_SRCH, MCMode.DISABLE);

	}

	/**
	 * [REF_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_I_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_I_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_I_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I_NON, MCMode.DISABLE);
		p.Btn_ins_uplnd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I_NON, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I_NON, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_I_NON, MCMode.DISABLE);

	}

	/**
	 * [FIX_I_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_I_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_I_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_I_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_disp_seq.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_I_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_I_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_I_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_I_SRCH, MCMode.DISABLE);
		p.Btn_ins_uplnd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_I_SRCH, MCMode.INVISIBLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_I_SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_I_SRCH, MCMode.DISABLE);

	}

	/**
	 * [FIX_I_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_U_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_U_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_U_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_U_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U_NON, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U_NON, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_U_NON, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_U_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_U_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_U_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_U_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_U_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_U_SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_U_SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_U_SRCH, MCMode.DISABLE);

	}

	/**
	 * [FIX_U_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_term_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_ship_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_D, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_D, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_NON]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_NON]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D_NON, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D_NON, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D_NON, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_D_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_NON]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_NON]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_trd_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr1.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr2.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr3.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_addr4.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_tel.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_fax.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_id_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_cst_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_NON]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_NON]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_show_dtl.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_zip_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr1.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr2.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr3.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_addr4.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_dpt.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntct_psn.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_tel.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_fax.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_D_NON, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_nm.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_D_NON, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_NON]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_NON]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D_NON, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D_NON, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_D_NON, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D_NON, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_D_NON, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_D_NON, MCMode.DISABLE);

	}

	/**
	 * [FIX_D_NON]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__NON_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_ScreenOpe(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Cnd(MSBEP_ShipActReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D_SRCH, MCMode.REQUIRED);
		p.Cnd_screen_ope.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_tgt_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_tgt_no.putMode(p, FIX_D_SRCH, MCMode.REQUIRED);
		p.Cnd_ship_act_rev.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Cnd_latest_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D_SRCH, MCMode.ENABLE);
		p.Cnd_non_srch.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_SRCH]ステータスの[HdrTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_HdrTab(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Hdr(MSBEP_ShipActReg p){
		p.Hdr_trd_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_trd_ptn_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_ym.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_act_rev.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_latest_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_inst_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_iv_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_no.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_ac_dt_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0310.MAUBP_AcDt_H.READ_ONLY);
		p.Hdr_ac_dt_p_PPanel.AcDt_ac_dt.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_can_ac_dt_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0330.MAUBP_CanAcDt_H.READ_ONLY);
		p.Hdr_ship_ymdhm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_dlv_ymdhm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ss_ymdhm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_ds_ymdhm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.INVISIBLE);
		p.Hdr_inst_ymdhm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.Hdr_ship_to_id_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_id_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_ship_to_sundry_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_via_dlv_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_id_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_typ_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_id_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0410.MAUBP_Addr_H.READ_ONLY);
		p.Hdr_dlv_addr_p_PPanel.Addr_show_dtl.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_lg_grp_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntry_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_zip_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr1.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr2.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr3.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_addr4.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_dpt.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_cntct_psn.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_tel.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_addr_p_PPanel.Addr_fax.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sundry_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_pri_prnt_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_str_ln_tgt_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_dlv_sppl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_usr_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_dpt_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_cst_iv_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_rqst_usr_dpt_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.INVISIBLE);
		p.Hdr_ship_usr_dpt_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP0320.MAUBP_UsrDpt_H.READ_ONLY);
		p.Hdr_lot_chk_off_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_fr_lg_grp_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_term_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_wt.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_dim.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_inst_dlv_prnted_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnt_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnt_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_dlv_slip_prnted_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ship_adv_prnted_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_uplnd_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Hdr_intr_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char1.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char2.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_sub_char3.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Hdr_prnt_lcl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Hdr2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Dtl(MSBEP_ShipActReg p){
		p.columnDtl_pr_sts_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pr_sts_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_ptn_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cststk_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loan_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_cst_itm_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_itm_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_itm_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sundry_itm_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dscnt_itm_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sublot_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno1_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno2_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno3_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sno4_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_lot_no_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMSUB.MSUBP5030.MSUBP_LotNo_D.READ_ONLY);
		p.Dtl_lot_no_p_PPanel.columnLotNo_crt_lot_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ver_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_ver_no_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.columnDtl_not_lot_mix_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_not_sublot_mix_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_unit_conv_base_qty.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_conv_qty.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_dec_place.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_trd_unit_rnd_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_trd_unit_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_abort_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_unit_dec_place.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_rnd_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_base_unit_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_schd_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_inst_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_ship_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Dtl_sls_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_arr_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_iv_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.Dtl_ret_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnDtl_cont_fctr_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_act_cont_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_act_cont_fctr_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Dtl_std_cont_qty_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Dtl_std_cont_fctr_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Dtl_cont_fctr_unit_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnDtl_cont_fctr_dec_place.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cont_fctr_rnd_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_fr_lg_grp_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_loc_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_mng_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_str_ln_tgt_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_loc_sppl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_str_ln_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_quality_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_quality_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_gd_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1_null_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2_null_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3_null_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4_null_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_schd_sno_wrk_no_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.INVISIBLE);
		p.columnDtl_stk_id_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_id_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_stk_bp_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMSUB.MSUBP5050.MSUBP_StkBp_D.READ_ONLY);
		p.columnDtl_stk_arrv_bp_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_stk_arrv_bp_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sppl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_wt.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_dim.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_unit_wt.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_unit_dim.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_id_typ.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_typ_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_id_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5360.MAUBP_Addr_D.READ_ONLY);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_addr_p_PPanel.columnAddr_cntry_nm.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_sundry_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_pri_prnt_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_trd_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_dlv_str_ln_tgt_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Dtl_dlv_str_ln_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.columnDtl_dlv_sppl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_iv_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_cst_po_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_po_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_cst_dlv_inst_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_rsn_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sls_acxfr_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_acxfr_gi_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_bd_dpt_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_bd_dpt_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_skip_chk_ship_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_dlv_slip_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_prov_act_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_base_ac_dt.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_cnt_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_arr_cnt_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_trd_d_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_intr_d_rmrks.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char1.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char2.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_sub_char3.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_slo_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_xfr_schd_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_schd_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_alloc_sts_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_inst_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_iv_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_dlv_slip_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ship_act_no.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_act_d_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_wms_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_cd.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_sys_nm.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_ext_ship_act_no.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_disp_seq.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.columnDtl_assort_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_set_itm_grp_no.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_inst_typ.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_loc_sppl_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_ship_schd_str_ln_cd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_sync_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_read_only_flg.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.columnDtl_base_unit_qty_bef.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Dtl2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Dtl2(MSBEP_ShipActReg p){

	}

	/**
	 * [FIX_D_SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_Btn(MSBEP_ShipActReg p){
		p.Btn_Btn_open_MSBEP0500_PPanel.putStatus(FIX_D_SRCH, mcframe.clientMSUB.MSUBP0070.MSUBP_StkInfo_H.DISABLE);
		p.Btn_prnt_dlv_slip.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_prnt_ship_adv.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_open_MSBEP0110.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_sprt_ac_dt.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_menu_move_p_PPanel.putStatus(FIX_D_SRCH, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.Btn_radd.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_ins.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Btn_ins_uplnd.putMode(p, FIX_D_SRCH, MCMode.INVISIBLE);
		p.Btn_upd.putMode(p, FIX_D_SRCH, MCMode.DISABLE);
		p.Btn_indiv_prnt_flg.putMode(p, FIX_D_SRCH, MCMode.READ_ONLY);
		p.Btn_del.putMode(p, FIX_D_SRCH, MCMode.DISABLE);

	}

	/**
	 * [FIX_D_SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D__SRCH_EastBtn(MSBEP_ShipActReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return INS;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBEP_ShipActReg_MC.setTableConfigDtl((MSBEP_ShipActReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MSBEP_ShipActReg p) {
		p.columnDtl_pr_sts_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.pr_sts_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pr_sts_typ);
		p.columnDtl_pr_sts_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.pr_sts_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pr_sts_typ_nm);
		p.columnDtl_trd_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_cd_META);
		p.columnDtl_trd_cd.addLinkBeans(p.columnDtl_trd_nm,p.columnDtl_trd_ptn_typ);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_cd);
		p.columnDtl_trd_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_nm);
		p.columnDtl_trd_ptn_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_ptn_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_ptn_typ);
		p.columnDtl_cststk_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cststk_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cststk_flg);
		p.columnDtl_loan_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.loan_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loan_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_ver_flg, p.columnDtl_skip_chk_ship_flg, p.columnDtl_trd_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_sub2, p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_ver_flg, p.columnDtl_skip_chk_ship_flg, p.columnDtl_trd_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_sub3, p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_ver_flg, p.columnDtl_skip_chk_ship_flg, p.columnDtl_trd_unit_cd);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_sundry_itm_flg, p.columnDtl_dscnt_itm_flg, p.columnDtl_stk_mng_typ, p.columnDtl_lot_mng_typ, p.columnDtl_sublot_mng_typ, p.columnDtl_sno1_mng_typ, p.columnDtl_sno2_mng_typ, p.columnDtl_sno3_mng_typ, p.columnDtl_sno4_mng_typ, p.columnDtl_base_unit_cd, p.columnDtl_base_unit_nm, p.columnDtl_base_unit_dec_place, p.columnDtl_base_unit_rnd_typ, p.columnDtl_cont_fctr_flg, p.columnDtl_std_cont_fctr, p.columnDtl_ver_flg, p.columnDtl_skip_chk_ship_flg, p.columnDtl_trd_unit_cd);
		p.columnDtl_cst_itm_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_itm_cd_META);
		p.columnDtl_cst_itm_cd.addLinkBeans(p.columnDtl_cst_itm_nm,p.columnDtl_itm_cd,p.columnDtl_itm_sub1,p.columnDtl_itm_sub2,p.columnDtl_itm_sub3);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_cd);
		p.columnDtl_cst_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_itm_nm);
		p.columnDtl_iv_itm_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.iv_itm_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_itm_nm);
		p.columnDtl_stk_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.stk_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_mng_typ);
		p.columnDtl_sundry_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sundry_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sundry_itm_flg);
		p.columnDtl_dscnt_itm_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dscnt_itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dscnt_itm_flg);
		p.columnDtl_lot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.lot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_mng_typ);
		p.columnDtl_sublot_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sublot_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_mng_typ);
		p.columnDtl_sno1_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sno1_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_mng_typ);
		p.columnDtl_sno2_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sno2_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_mng_typ);
		p.columnDtl_sno3_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sno3_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_mng_typ);
		p.columnDtl_sno4_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sno4_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_mng_typ);
		p.DtlTable.addTable(p.Dtl_lot_no_p_PPanel.LotNoTable);
		p.Dtl_lot_no_p_PPanel.columnLotNo_lot_no.setLinkBeans(p.columnDtl_sublot_no, p.columnDtl_ver_no);
		p.Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setLinkBeans(p.columnDtl_ver_no);
		p.columnDtl_ver_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ver_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ver_flg);
		p.DtlTable.addTable(p.Dtl_ver_no_p_PPanel.VerNoTable);
		p.columnDtl_not_lot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.not_lot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_lot_mix_flg);
		p.columnDtl_not_sublot_mix_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.not_sublot_mix_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_not_sublot_mix_flg);
		p.columnDtl_trd_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_cd_META);
		p.columnDtl_trd_unit_cd.addLinkBeans(p.columnDtl_trd_unit_nm,p.columnDtl_trd_unit_conv_base_qty,p.columnDtl_trd_unit_conv_qty,p.columnDtl_trd_unit_dec_place,p.columnDtl_trd_unit_rnd_typ,p.columnDtl_unit_wt,p.columnDtl_unit_dim);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_cd);
		p.columnDtl_trd_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_nm);
		p.columnDtl_trd_unit_conv_base_qty.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_conv_base_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_base_qty);
		p.columnDtl_trd_unit_conv_qty.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_conv_qty_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_conv_qty);
		p.columnDtl_trd_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_dec_place);
		p.columnDtl_trd_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_trd_unit_qty_p_PPanel.QtyTable);
		p.columnDtl_abort_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.abort_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_abort_flg);
		p.columnDtl_base_unit_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_unit_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_cd);
		p.columnDtl_base_unit_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_unit_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_nm);
		p.columnDtl_base_unit_dec_place.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_unit_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_dec_place);
		p.columnDtl_base_unit_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_unit_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_rnd_typ);
		p.DtlTable.addTable(p.Dtl_base_unit_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_schd_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_inst_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_ship_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_sls_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_arr_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_iv_qty_p_PPanel.QtyTable);
		p.DtlTable.addTable(p.Dtl_ret_qty_p_PPanel.QtyTable);
		p.columnDtl_cont_fctr_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cont_fctr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_flg);
		p.DtlTable.addTable(p.Dtl_act_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.DtlTable.addTable(p.Dtl_std_cont_qty_p_PPanel.ContQtyTable);
		p.DtlTable.addTable(p.Dtl_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.DtlTable.addTable(p.Dtl_cont_fctr_unit_p_PPanel.ContFctrUnitTable);
		p.columnDtl_cont_fctr_dec_place.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cont_fctr_dec_place_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_dec_place);
		p.columnDtl_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cont_fctr_rnd_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cont_fctr_rnd_typ);
		p.columnDtl_ship_fr_lg_grp_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_fr_lg_grp_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_fr_lg_grp_cd);
		p.columnDtl_ship_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_loc_cd_META);
		p.columnDtl_ship_loc_cd.addLinkBeans(p.columnDtl_ship_loc_nm,p.columnDtl_loc_mng_typ,p.columnDtl_ship_str_ln_tgt_flg,p.columnDtl_ship_loc_sppl_cd);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_cd);
		p.columnDtl_ship_loc_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_nm);
		p.columnDtl_loc_mng_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.loc_mng_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_mng_typ);
		p.columnDtl_ship_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_str_ln_tgt_flg);
		p.columnDtl_ship_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_loc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_loc_sppl_cd);
		p.DtlTable.addTable(p.Dtl_str_ln_p_PPanel.StrLnTable);
		p.Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setLinkBeans(p.columnDtl_ship_str_ln_nm);
		p.columnDtl_quality_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.quality_typ_META);
		p.columnDtl_quality_typ.addLinkBeans(p.columnDtl_quality_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ);
		p.columnDtl_quality_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.quality_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_quality_typ_nm);
		p.columnDtl_gd_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.gd_cd_META);
		p.columnDtl_gd_cd.addLinkBeans(p.columnDtl_gd_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_cd);
		p.columnDtl_gd_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.gd_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_gd_nm);
		p.DtlTable.addTable(p.Dtl_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.DtlTable.addTable(p.Dtl_schd_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnDtl_stk_id_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.stk_id_typ_META);
		p.columnDtl_stk_id_typ.addLinkBeans(p.columnDtl_stk_id_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ);
		p.columnDtl_stk_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.stk_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_id_typ_nm);
		p.DtlTable.addTable(p.Dtl_stk_bp_p_PPanel.StkBpTable);
		p.columnDtl_stk_arrv_bp_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.stk_arrv_bp_cd_META);
		p.columnDtl_stk_arrv_bp_cd.addLinkBeans(p.columnDtl_stk_arrv_bp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_cd);
		p.columnDtl_stk_arrv_bp_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.stk_arrv_bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_stk_arrv_bp_nm);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sppl_cd);
		p.columnDtl_ship_wt.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_wt);
		p.columnDtl_ship_dim.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_dim);
		p.columnDtl_unit_wt.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.unit_wt_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_wt);
		p.columnDtl_unit_dim.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.unit_dim_META);
		p.DtlTable.addColumnConfig(p.columnDtl_unit_dim);
		p.columnDtl_dlv_id_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_id_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_typ);
		p.columnDtl_dlv_id_typ_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_id_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_typ_nm);
		p.columnDtl_dlv_id_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_id_cd_META);
		p.columnDtl_dlv_id_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_id_cd.addLinkBeans(p.columnDtl_dlv_str_ln_tgt_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_cd);
		p.columnDtl_dlv_id_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_id_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_id_nm);
		p.DtlTable.addTable(p.Dtl_dlv_addr_p_PPanel.AddrTable);
		p.columnDtl_dlv_sundry_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_sundry_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_sundry_flg);
		p.columnDtl_pri_prnt_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.pri_prnt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_pri_prnt_flg);
		p.columnDtl_iv_trd_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.iv_trd_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_trd_flg);
		p.columnDtl_dlv_str_ln_tgt_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_str_ln_tgt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_str_ln_tgt_flg);
		p.DtlTable.addTable(p.Dtl_dlv_str_ln_p_PPanel.StrLnTable);
		p.columnDtl_dlv_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_sppl_cd);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_cst_iv_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_iv_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_iv_flg);
		p.columnDtl_cst_po_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_po_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_no);
		p.columnDtl_cst_po_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_po_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_po_d_no);
		p.columnDtl_cst_dlv_inst_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_dlv_inst_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_dlv_inst_no);
		p.columnDtl_cst_dlv_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.cst_dlv_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_dlv_inst_d_no);
		p.columnDtl_rsn_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.rsn_cd_META);
		p.columnDtl_rsn_cd.addLinkBeans(p.columnDtl_rsn_nm,p.columnDtl_sls_acxfr_flg,p.columnDtl_acxfr_gi_flg);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_cd);
		p.columnDtl_rsn_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rsn_nm);
		p.columnDtl_sls_acxfr_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sls_acxfr_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_acxfr_flg);
		p.columnDtl_acxfr_gi_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.acxfr_gi_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_acxfr_gi_flg);
		p.columnDtl_bd_dpt_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.bd_dpt_cd_META);
		p.columnDtl_bd_dpt_cd.addLinkBeans(p.columnDtl_bd_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_cd);
		p.columnDtl_bd_dpt_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.bd_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bd_dpt_nm);
		p.columnDtl_skip_chk_ship_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.skip_chk_ship_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_skip_chk_ship_flg);
		p.columnDtl_base_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_dlv_slip_no);
		p.columnDtl_base_prov_act_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_prov_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_prov_act_no);
		p.columnDtl_base_ac_dt.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_ac_dt_META);
		p.columnDtl_base_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_base_ac_dt);
		p.columnDtl_ship_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_cnt_rmrks);
		p.columnDtl_arr_cnt_rmrks.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.arr_cnt_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_arr_cnt_rmrks);
		p.columnDtl_trd_rmrks.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_rmrks);
		p.columnDtl_trd_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.trd_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_trd_d_rmrks);
		p.columnDtl_intr_d_rmrks.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.intr_d_rmrks_META);
		p.DtlTable.addColumnConfig(p.columnDtl_intr_d_rmrks);
		p.columnDtl_sub_char1.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sub_char1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char1);
		p.columnDtl_sub_char2.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sub_char2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char2);
		p.columnDtl_sub_char3.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sub_char3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sub_char3);
		p.columnDtl_slo_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.slo_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_no);
		p.columnDtl_slo_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.slo_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_slo_d_no);
		p.columnDtl_xfr_schd_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.xfr_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_xfr_schd_no);
		p.columnDtl_ship_schd_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_schd_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_no);
		p.columnDtl_ship_alloc_sts_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_alloc_sts_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_alloc_sts_no);
		p.columnDtl_ship_inst_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_inst_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_d_no);
		p.columnDtl_iv_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.iv_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_no);
		p.columnDtl_iv_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.iv_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_iv_d_no);
		p.columnDtl_dlv_slip_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_slip_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_no);
		p.columnDtl_dlv_slip_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.dlv_slip_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_slip_d_no);
		p.columnDtl_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_no);
		p.columnDtl_ship_act_d_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_act_d_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_act_d_no);
		p.columnDtl_wms_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.wms_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wms_flg);
		p.columnDtl_ext_sys_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ext_sys_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_cd);
		p.columnDtl_ext_sys_nm.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ext_sys_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_sys_nm);
		p.columnDtl_ext_ship_act_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ext_ship_act_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ext_ship_act_no);
		p.columnDtl_disp_seq.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.disp_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_disp_seq);
		p.columnDtl_assort_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.assort_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_assort_typ);
		p.columnDtl_set_itm_grp_no.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.set_itm_grp_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_set_itm_grp_no);
		p.columnDtl_ship_inst_typ.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_inst_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_inst_typ);
		p.columnDtl_ship_schd_loc_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_schd_loc_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_loc_cd);
		p.columnDtl_ship_schd_loc_sppl_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_schd_loc_sppl_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_loc_sppl_cd);
		p.columnDtl_ship_schd_str_ln_cd.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.ship_schd_str_ln_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ship_schd_str_ln_cd);
		p.columnDtl_sync_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.sync_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sync_flg);
		p.columnDtl_read_only_flg.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.read_only_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_read_only_flg);
		p.columnDtl_base_unit_qty_bef.setMeta(mcframe.clientMSBE.MSBEP1440.DtlR.base_unit_qty_bef_META);
		p.DtlTable.addColumnConfig(p.columnDtl_base_unit_qty_bef);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_srch_tgt_typ_nm.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_srch_tgt_typ_nm.getListConfig().setPutter(getCnd_srch_tgt_typ_nm_ListPutter());
		Hdr_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_trd_cd.getListConfig().setPutter(getHdr_trd_cd_ListPutter());
		Hdr_ship_to_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_to_id_typ.getListConfig().setPutter(getHdr_ship_to_id_typ_ListPutter());
		Hdr_ship_to_id_cd.getListConfig().setPutter(getHdr_ship_to_id_cd_ListPutter());
		Hdr_via_dlv_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_via_dlv_typ.getListConfig().setPutter(getHdr_via_dlv_typ_ListPutter());
		Hdr_dlv_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_dlv_id_typ.getListConfig().setPutter(getHdr_dlv_id_typ_ListPutter());
		Hdr_dlv_id_cd.getListConfig().setPutter(getHdr_dlv_id_cd_ListPutter());
		Hdr_dlv_cd.getListConfig().setPutter(getHdr_dlv_cd_ListPutter());
		Hdr_cst_cd.getListConfig().setPutter(getHdr_cst_cd_ListPutter());
		Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd.getListConfig().setPutter(getHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter());
		Hdr_ship_fr_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_ship_fr_lg_grp_cd.getListConfig().setPutter(getHdr_ship_fr_lg_grp_cd_ListPutter());
		columnDtl_pr_sts_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_pr_sts_typ.getListConfig().setPutter(getDtl_pr_sts_typ_ListPutter());
		columnDtl_trd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_cd.getListConfig().setPutter(getDtl_trd_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_cst_itm_cd.getListConfig().setPutter(getDtl_cst_itm_cd_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_lot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_lot_no_p_PPanel.columnLotNo_sublot_no.getListConfig().setPutter(getDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter());
		columnDtl_trd_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_trd_unit_cd.getListConfig().setPutter(getDtl_trd_unit_cd_ListPutter());
		columnDtl_ship_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ship_loc_cd.getListConfig().setPutter(getDtl_ship_loc_cd_ListPutter());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd.getListConfig().setPutter(getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter());
		columnDtl_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_quality_typ.getListConfig().setPutter(getDtl_quality_typ_ListPutter());
		columnDtl_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_gd_cd.getListConfig().setPutter(getDtl_gd_cd_ListPutter());
		columnDtl_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_id_typ.getListConfig().setPutter(getDtl_stk_id_typ_ListPutter());
		columnDtl_stk_arrv_bp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_stk_arrv_bp_cd.getListConfig().setPutter(getDtl_stk_arrv_bp_cd_ListPutter());
		columnDtl_dlv_id_cd.getListConfig().setPutter(getDtl_dlv_id_cd_ListPutter());
		columnDtl_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rsn_cd.getListConfig().setPutter(getDtl_rsn_cd_ListPutter());
		columnDtl_bd_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_bd_dpt_cd.getListConfig().setPutter(getDtl_bd_dpt_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_NONStatus() {
		status = INS_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[INS_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINS_SRCHStatus() {
		status = INS_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPDStatus() {
		status = UPD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_NONStatus() {
		status = UPD_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SRCHStatus() {
		status = UPD_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_NONStatus() {
		status = DEL_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_SRCHStatus() {
		status = DEL_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_NONStatus() {
		status = REF_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[REF_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREF_SRCHStatus() {
		status = REF_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_IStatus() {
		status = FIX_I;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_I_NONStatus() {
		status = FIX_I_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_I_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_I_SRCHStatus() {
		status = FIX_I_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_NONStatus() {
		status = FIX_U_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_U_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_U_SRCHStatus() {
		status = FIX_U_SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D_NON]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_D_NONStatus() {
		status = FIX_D_NON;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_D_SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_D_SRCHStatus() {
		status = FIX_D_SRCH;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (INS_NON.equals(status)) {
			setINS_NONStatus();
		}
		else if (INS_SRCH.equals(status)) {
			setINS_SRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (UPD_NON.equals(status)) {
			setUPD_NONStatus();
		}
		else if (UPD_SRCH.equals(status)) {
			setUPD_SRCHStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (DEL_NON.equals(status)) {
			setDEL_NONStatus();
		}
		else if (DEL_SRCH.equals(status)) {
			setDEL_SRCHStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (REF_NON.equals(status)) {
			setREF_NONStatus();
		}
		else if (REF_SRCH.equals(status)) {
			setREF_SRCHStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
		else if (FIX_I_NON.equals(status)) {
			setFIX_I_NONStatus();
		}
		else if (FIX_I_SRCH.equals(status)) {
			setFIX_I_SRCHStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX_U_NON.equals(status)) {
			setFIX_U_NONStatus();
		}
		else if (FIX_U_SRCH.equals(status)) {
			setFIX_U_SRCHStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
		}
		else if (FIX_D_NON.equals(status)) {
			setFIX_D_NONStatus();
		}
		else if (FIX_D_SRCH.equals(status)) {
			setFIX_D_SRCHStatus();
		}
	}

	/**
	 * [Cnd_srch_tgt_typ_nm_ListPutter]の作成
	 */
	protected MCListPutter createCnd_srch_tgt_typ_nm_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkSrchTgtTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Hdr_ship_to_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_to_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.ShipToIdTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_ship_to_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_to_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.ShipToId");
		return lp;
	}
	 
	/**
	 * [Hdr_via_dlv_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_via_dlv_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ViaDlvTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_dlv_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dlv_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.DlvIdTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_dlv_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dlv_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.DlvId");
		return lp;
	}
	 
	/**
	 * [Hdr_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}

	/**
	 * [Hdr_ship_fr_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_ship_fr_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrpForLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_pr_sts_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_pr_sts_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("");
		return lp;
	}
	 
	/**
	 * [Dtl_trd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Trd");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Dtl_cst_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.CstItm");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}

	/**
	 * [Dtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_no_p_PPanel_columnLotNo_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}

	/**
	 * [Dtl_trd_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_trd_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmUnit");
		return lp;
	}
	 
	/**
	 * [Dtl_ship_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ship_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}

	/**
	 * [Dtl_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_stk_arrv_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_stk_arrv_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SpplByLoc");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_id_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_id_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0060.DlvId");
		return lp;
	}
	 
	/**
	 * [Dtl_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ShipBizRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_bd_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bd_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Dpt");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_srch_tgt_typ_nm) return getCnd_srch_tgt_typ_nm(row, info);
		if(combo == Hdr_trd_cd) return getHdr_trd_cd(row, info);
		if(combo == Hdr_ship_to_id_typ) return getHdr_ship_to_id_typ(row, info);
		if(combo == Hdr_ship_to_id_cd) return getHdr_ship_to_id_cd(row, info);
		if(combo == Hdr_via_dlv_typ) return getHdr_via_dlv_typ(row, info);
		if(combo == Hdr_dlv_id_typ) return getHdr_dlv_id_typ(row, info);
		if(combo == Hdr_dlv_id_cd) return getHdr_dlv_id_cd(row, info);
		if(combo == Hdr_dlv_cd) return getHdr_dlv_cd(row, info);
		if(combo == Hdr_cst_cd) return getHdr_cst_cd(row, info);
		if(combo == Hdr_rqst_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_ship_usr_dpt_p_PPanel.UsrDpt_dpt_cd) return getHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd(row, info);
		if(combo == Hdr_ship_fr_lg_grp_cd) return getHdr_ship_fr_lg_grp_cd(row, info);
		if(combo == columnDtl_pr_sts_typ) return getDtl_pr_sts_typ(row, info);
		if(combo == columnDtl_trd_cd) return getDtl_trd_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_cst_itm_cd) return getDtl_cst_itm_cd(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_lot_no) return getDtl_lot_no_p_PPanel_columnLotNo_lot_no(row, info);
		if(combo == Dtl_lot_no_p_PPanel.columnLotNo_sublot_no) return getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(row, info);
		if(combo == columnDtl_trd_unit_cd) return getDtl_trd_unit_cd(row, info);
		if(combo == columnDtl_ship_loc_cd) return getDtl_ship_loc_cd(row, info);
		if(combo == Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd) return getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(row, info);
		if(combo == columnDtl_quality_typ) return getDtl_quality_typ(row, info);
		if(combo == columnDtl_gd_cd) return getDtl_gd_cd(row, info);
		if(combo == columnDtl_stk_id_typ) return getDtl_stk_id_typ(row, info);
		if(combo == columnDtl_stk_arrv_bp_cd) return getDtl_stk_arrv_bp_cd(row, info);
		if(combo == columnDtl_dlv_id_cd) return getDtl_dlv_id_cd(row, info);
		if(combo == columnDtl_rsn_cd) return getDtl_rsn_cd(row, info);
		if(combo == columnDtl_bd_dpt_cd) return getDtl_bd_dpt_cd(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch) doCnd_srch(info);
		else if (ap == Cnd_non_srch) doCnd_non_srch(info);
		else if (ap == Btn_prnt_dlv_slip) doBtn_prnt_dlv_slip(info);
		else if (ap == Btn_prnt_ship_adv) doBtn_prnt_ship_adv(info);
		else if (ap == Btn_open_MSBEP0110) doBtn_open_MSBEP0110(info);
		else if (ap == Btn_sprt_ac_dt) doBtn_sprt_ac_dt(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_ins) doBtn_ins(info);
		else if (ap == Btn_ins_uplnd) doBtn_ins_uplnd(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [Cnd]パネルの[non_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_non_srch(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_dlv_slip]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_dlv_slip(MCEventInfo info);

	/**
	 * [Btn]パネルの[prnt_ship_adv]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_prnt_ship_adv(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBEP0110]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBEP0110(MCEventInfo info);

	/**
	 * [Btn]パネルの[sprt_ac_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_sprt_ac_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_radd(MCEventInfo info);

	/**
	 * [Btn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rdel(MCEventInfo info);

	/**
	 * [Btn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins_uplnd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins_uplnd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del(MCEventInfo info);

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
		if (vc == HdrTabTab) return doHdrTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_screen_ope) return doCnd_screen_ope_VC(info);
		if (vc == Cnd_srch_tgt_typ) return doCnd_srch_tgt_typ_VC(info);
		if (vc == Cnd_srch_tgt_typ_nm) return doCnd_srch_tgt_typ_nm_VC(info);
		if (vc == Cnd_srch_tgt_no) return doCnd_srch_tgt_no_VC(info);
		if (vc == Cnd_ship_act_rev) return doCnd_ship_act_rev_VC(info);
		if (vc == Cnd_latest_flg) return doCnd_latest_flg_VC(info);
		if (vc == Hdr_trd_cd) return doHdr_trd_cd_VC(info);
		if (vc == Hdr_trd_nm) return doHdr_trd_nm_VC(info);
		if (vc == Hdr_trd_ptn_typ) return doHdr_trd_ptn_typ_VC(info);
		if (vc == Hdr_ac_ym) return doHdr_ac_ym_VC(info);
		if (vc == Hdr_ship_act_no) return doHdr_ship_act_no_VC(info);
		if (vc == Hdr_ship_act_rev) return doHdr_ship_act_rev_VC(info);
		if (vc == Hdr_latest_flg) return doHdr_latest_flg_VC(info);
		if (vc == Hdr_can_flg) return doHdr_can_flg_VC(info);
		if (vc == Hdr_ship_inst_no) return doHdr_ship_inst_no_VC(info);
		if (vc == Hdr_iv_no) return doHdr_iv_no_VC(info);
		if (vc == Hdr_dlv_slip_no) return doHdr_dlv_slip_no_VC(info);
		if (vc == Hdr_ship_to_id_typ) return doHdr_ship_to_id_typ_VC(info);
		if (vc == Hdr_ship_to_id_typ_nm) return doHdr_ship_to_id_typ_nm_VC(info);
		if (vc == Hdr_ship_to_id_cd) return doHdr_ship_to_id_cd_VC(info);
		if (vc == Hdr_ship_to_id_nm) return doHdr_ship_to_id_nm_VC(info);
		if (vc == Hdr_ship_to_sundry_flg) return doHdr_ship_to_sundry_flg_VC(info);
		if (vc == Hdr_via_dlv_typ) return doHdr_via_dlv_typ_VC(info);
		if (vc == Hdr_via_dlv_typ_nm) return doHdr_via_dlv_typ_nm_VC(info);
		if (vc == Hdr_dlv_id_typ) return doHdr_dlv_id_typ_VC(info);
		if (vc == Hdr_dlv_id_typ_nm) return doHdr_dlv_id_typ_nm_VC(info);
		if (vc == Hdr_dlv_id_cd) return doHdr_dlv_id_cd_VC(info);
		if (vc == Hdr_dlv_id_nm) return doHdr_dlv_id_nm_VC(info);
		if (vc == Hdr_dlv_sundry_flg) return doHdr_dlv_sundry_flg_VC(info);
		if (vc == Hdr_dlv_pri_prnt_flg) return doHdr_dlv_pri_prnt_flg_VC(info);
		if (vc == Hdr_dlv_str_ln_tgt_flg) return doHdr_dlv_str_ln_tgt_flg_VC(info);
		if (vc == Hdr_dlv_cd) return doHdr_dlv_cd_VC(info);
		if (vc == Hdr_dlv_sppl_cd) return doHdr_dlv_sppl_cd_VC(info);
		if (vc == Hdr_cst_cd) return doHdr_cst_cd_VC(info);
		if (vc == Hdr_cst_nm) return doHdr_cst_nm_VC(info);
		if (vc == Hdr_cst_usr_cd) return doHdr_cst_usr_cd_VC(info);
		if (vc == Hdr_cst_dpt_cd) return doHdr_cst_dpt_cd_VC(info);
		if (vc == Hdr_cst_iv_flg) return doHdr_cst_iv_flg_VC(info);
		if (vc == Hdr_lot_chk_off_flg) return doHdr_lot_chk_off_flg_VC(info);
		if (vc == Hdr_ship_fr_lg_grp_cd) return doHdr_ship_fr_lg_grp_cd_VC(info);
		if (vc == Hdr_ship_fr_lg_grp_nm) return doHdr_ship_fr_lg_grp_nm_VC(info);
		if (vc == Hdr_ship_term_cd) return doHdr_ship_term_cd_VC(info);
		if (vc == Hdr_ship_term_nm) return doHdr_ship_term_nm_VC(info);
		if (vc == Hdr_ship_wt) return doHdr_ship_wt_VC(info);
		if (vc == Hdr_ship_dim) return doHdr_ship_dim_VC(info);
		if (vc == Hdr_inst_dlv_prnted_flg) return doHdr_inst_dlv_prnted_flg_VC(info);
		if (vc == Hdr_dlv_slip_prnt_flg) return doHdr_dlv_slip_prnt_flg_VC(info);
		if (vc == Hdr_ship_adv_prnt_flg) return doHdr_ship_adv_prnt_flg_VC(info);
		if (vc == Hdr_dlv_slip_prnted_flg) return doHdr_dlv_slip_prnted_flg_VC(info);
		if (vc == Hdr_ship_adv_prnted_flg) return doHdr_ship_adv_prnted_flg_VC(info);
		if (vc == Hdr_uplnd_flg) return doHdr_uplnd_flg_VC(info);
		if (vc == Hdr_intr_rmrks) return doHdr_intr_rmrks_VC(info);
		if (vc == Hdr_sub_char1) return doHdr_sub_char1_VC(info);
		if (vc == Hdr_sub_char2) return doHdr_sub_char2_VC(info);
		if (vc == Hdr_sub_char3) return doHdr_sub_char3_VC(info);
		if (vc == Hdr_ins_usr_id) return doHdr_ins_usr_id_VC(info);
		if (vc == Hdr_ins_usr_nm) return doHdr_ins_usr_nm_VC(info);
		if (vc == Hdr_ins_func_id) return doHdr_ins_func_id_VC(info);
		if (vc == Hdr_ins_func_nm) return doHdr_ins_func_nm_VC(info);
		if (vc == Hdr_upd_usr_id) return doHdr_upd_usr_id_VC(info);
		if (vc == Hdr_upd_usr_nm) return doHdr_upd_usr_nm_VC(info);
		if (vc == Hdr_upd_func_id) return doHdr_upd_func_id_VC(info);
		if (vc == Hdr_upd_func_nm) return doHdr_upd_func_nm_VC(info);
		if (vc == Hdr_ins_ts) return doHdr_ins_ts_VC(info);
		if (vc == Hdr_upd_ts) return doHdr_upd_ts_VC(info);
		if (vc == Hdr_upd_srv_req_no) return doHdr_upd_srv_req_no_VC(info);
		if (vc == Hdr_prnt_lcl_cd) return doHdr_prnt_lcl_cd_VC(info);
		if (vc == columnDtl_pr_sts_typ) return doDtl_pr_sts_typ_VC(info);
		if (vc == columnDtl_pr_sts_typ_nm) return doDtl_pr_sts_typ_nm_VC(info);
		if (vc == columnDtl_trd_cd) return doDtl_trd_cd_VC(info);
		if (vc == columnDtl_trd_nm) return doDtl_trd_nm_VC(info);
		if (vc == columnDtl_trd_ptn_typ) return doDtl_trd_ptn_typ_VC(info);
		if (vc == columnDtl_cststk_flg) return doDtl_cststk_flg_VC(info);
		if (vc == columnDtl_loan_flg) return doDtl_loan_flg_VC(info);
		if (vc == columnDtl_cst_itm_cd) return doDtl_cst_itm_cd_VC(info);
		if (vc == columnDtl_cst_itm_nm) return doDtl_cst_itm_nm_VC(info);
		if (vc == columnDtl_iv_itm_nm) return doDtl_iv_itm_nm_VC(info);
		if (vc == columnDtl_stk_mng_typ) return doDtl_stk_mng_typ_VC(info);
		if (vc == columnDtl_sundry_itm_flg) return doDtl_sundry_itm_flg_VC(info);
		if (vc == columnDtl_dscnt_itm_flg) return doDtl_dscnt_itm_flg_VC(info);
		if (vc == columnDtl_lot_mng_typ) return doDtl_lot_mng_typ_VC(info);
		if (vc == columnDtl_sublot_mng_typ) return doDtl_sublot_mng_typ_VC(info);
		if (vc == columnDtl_sno1_mng_typ) return doDtl_sno1_mng_typ_VC(info);
		if (vc == columnDtl_sno2_mng_typ) return doDtl_sno2_mng_typ_VC(info);
		if (vc == columnDtl_sno3_mng_typ) return doDtl_sno3_mng_typ_VC(info);
		if (vc == columnDtl_sno4_mng_typ) return doDtl_sno4_mng_typ_VC(info);
		if (vc == columnDtl_ver_flg) return doDtl_ver_flg_VC(info);
		if (vc == columnDtl_not_lot_mix_flg) return doDtl_not_lot_mix_flg_VC(info);
		if (vc == columnDtl_not_sublot_mix_flg) return doDtl_not_sublot_mix_flg_VC(info);
		if (vc == columnDtl_trd_unit_cd) return doDtl_trd_unit_cd_VC(info);
		if (vc == columnDtl_trd_unit_nm) return doDtl_trd_unit_nm_VC(info);
		if (vc == columnDtl_trd_unit_conv_base_qty) return doDtl_trd_unit_conv_base_qty_VC(info);
		if (vc == columnDtl_trd_unit_conv_qty) return doDtl_trd_unit_conv_qty_VC(info);
		if (vc == columnDtl_trd_unit_dec_place) return doDtl_trd_unit_dec_place_VC(info);
		if (vc == columnDtl_trd_unit_rnd_typ) return doDtl_trd_unit_rnd_typ_VC(info);
		if (vc == columnDtl_abort_flg) return doDtl_abort_flg_VC(info);
		if (vc == columnDtl_base_unit_cd) return doDtl_base_unit_cd_VC(info);
		if (vc == columnDtl_base_unit_nm) return doDtl_base_unit_nm_VC(info);
		if (vc == columnDtl_base_unit_dec_place) return doDtl_base_unit_dec_place_VC(info);
		if (vc == columnDtl_base_unit_rnd_typ) return doDtl_base_unit_rnd_typ_VC(info);
		if (vc == columnDtl_cont_fctr_flg) return doDtl_cont_fctr_flg_VC(info);
		if (vc == columnDtl_cont_fctr_dec_place) return doDtl_cont_fctr_dec_place_VC(info);
		if (vc == columnDtl_cont_fctr_rnd_typ) return doDtl_cont_fctr_rnd_typ_VC(info);
		if (vc == columnDtl_ship_fr_lg_grp_cd) return doDtl_ship_fr_lg_grp_cd_VC(info);
		if (vc == columnDtl_ship_loc_cd) return doDtl_ship_loc_cd_VC(info);
		if (vc == columnDtl_ship_loc_nm) return doDtl_ship_loc_nm_VC(info);
		if (vc == columnDtl_loc_mng_typ) return doDtl_loc_mng_typ_VC(info);
		if (vc == columnDtl_ship_str_ln_tgt_flg) return doDtl_ship_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_ship_loc_sppl_cd) return doDtl_ship_loc_sppl_cd_VC(info);
		if (vc == columnDtl_quality_typ) return doDtl_quality_typ_VC(info);
		if (vc == columnDtl_quality_typ_nm) return doDtl_quality_typ_nm_VC(info);
		if (vc == columnDtl_gd_cd) return doDtl_gd_cd_VC(info);
		if (vc == columnDtl_gd_nm) return doDtl_gd_nm_VC(info);
		if (vc == columnDtl_stk_id_typ) return doDtl_stk_id_typ_VC(info);
		if (vc == columnDtl_stk_id_typ_nm) return doDtl_stk_id_typ_nm_VC(info);
		if (vc == columnDtl_stk_arrv_bp_cd) return doDtl_stk_arrv_bp_cd_VC(info);
		if (vc == columnDtl_stk_arrv_bp_nm) return doDtl_stk_arrv_bp_nm_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_sppl_cd) return doDtl_sppl_cd_VC(info);
		if (vc == columnDtl_ship_wt) return doDtl_ship_wt_VC(info);
		if (vc == columnDtl_ship_dim) return doDtl_ship_dim_VC(info);
		if (vc == columnDtl_unit_wt) return doDtl_unit_wt_VC(info);
		if (vc == columnDtl_unit_dim) return doDtl_unit_dim_VC(info);
		if (vc == columnDtl_dlv_id_typ) return doDtl_dlv_id_typ_VC(info);
		if (vc == columnDtl_dlv_id_typ_nm) return doDtl_dlv_id_typ_nm_VC(info);
		if (vc == columnDtl_dlv_id_cd) return doDtl_dlv_id_cd_VC(info);
		if (vc == columnDtl_dlv_id_nm) return doDtl_dlv_id_nm_VC(info);
		if (vc == columnDtl_dlv_sundry_flg) return doDtl_dlv_sundry_flg_VC(info);
		if (vc == columnDtl_pri_prnt_flg) return doDtl_pri_prnt_flg_VC(info);
		if (vc == columnDtl_iv_trd_flg) return doDtl_iv_trd_flg_VC(info);
		if (vc == columnDtl_dlv_str_ln_tgt_flg) return doDtl_dlv_str_ln_tgt_flg_VC(info);
		if (vc == columnDtl_dlv_sppl_cd) return doDtl_dlv_sppl_cd_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_cst_iv_flg) return doDtl_cst_iv_flg_VC(info);
		if (vc == columnDtl_cst_po_no) return doDtl_cst_po_no_VC(info);
		if (vc == columnDtl_cst_po_d_no) return doDtl_cst_po_d_no_VC(info);
		if (vc == columnDtl_cst_dlv_inst_no) return doDtl_cst_dlv_inst_no_VC(info);
		if (vc == columnDtl_cst_dlv_inst_d_no) return doDtl_cst_dlv_inst_d_no_VC(info);
		if (vc == columnDtl_rsn_cd) return doDtl_rsn_cd_VC(info);
		if (vc == columnDtl_rsn_nm) return doDtl_rsn_nm_VC(info);
		if (vc == columnDtl_sls_acxfr_flg) return doDtl_sls_acxfr_flg_VC(info);
		if (vc == columnDtl_acxfr_gi_flg) return doDtl_acxfr_gi_flg_VC(info);
		if (vc == columnDtl_bd_dpt_cd) return doDtl_bd_dpt_cd_VC(info);
		if (vc == columnDtl_bd_dpt_nm) return doDtl_bd_dpt_nm_VC(info);
		if (vc == columnDtl_skip_chk_ship_flg) return doDtl_skip_chk_ship_flg_VC(info);
		if (vc == columnDtl_base_dlv_slip_no) return doDtl_base_dlv_slip_no_VC(info);
		if (vc == columnDtl_base_prov_act_no) return doDtl_base_prov_act_no_VC(info);
		if (vc == columnDtl_base_ac_dt) return doDtl_base_ac_dt_VC(info);
		if (vc == columnDtl_ship_cnt_rmrks) return doDtl_ship_cnt_rmrks_VC(info);
		if (vc == columnDtl_arr_cnt_rmrks) return doDtl_arr_cnt_rmrks_VC(info);
		if (vc == columnDtl_trd_rmrks) return doDtl_trd_rmrks_VC(info);
		if (vc == columnDtl_trd_d_rmrks) return doDtl_trd_d_rmrks_VC(info);
		if (vc == columnDtl_intr_d_rmrks) return doDtl_intr_d_rmrks_VC(info);
		if (vc == columnDtl_sub_char1) return doDtl_sub_char1_VC(info);
		if (vc == columnDtl_sub_char2) return doDtl_sub_char2_VC(info);
		if (vc == columnDtl_sub_char3) return doDtl_sub_char3_VC(info);
		if (vc == columnDtl_slo_no) return doDtl_slo_no_VC(info);
		if (vc == columnDtl_slo_d_no) return doDtl_slo_d_no_VC(info);
		if (vc == columnDtl_xfr_schd_no) return doDtl_xfr_schd_no_VC(info);
		if (vc == columnDtl_ship_schd_no) return doDtl_ship_schd_no_VC(info);
		if (vc == columnDtl_ship_alloc_sts_no) return doDtl_ship_alloc_sts_no_VC(info);
		if (vc == columnDtl_ship_inst_d_no) return doDtl_ship_inst_d_no_VC(info);
		if (vc == columnDtl_iv_no) return doDtl_iv_no_VC(info);
		if (vc == columnDtl_iv_d_no) return doDtl_iv_d_no_VC(info);
		if (vc == columnDtl_dlv_slip_no) return doDtl_dlv_slip_no_VC(info);
		if (vc == columnDtl_dlv_slip_d_no) return doDtl_dlv_slip_d_no_VC(info);
		if (vc == columnDtl_ship_act_no) return doDtl_ship_act_no_VC(info);
		if (vc == columnDtl_ship_act_d_no) return doDtl_ship_act_d_no_VC(info);
		if (vc == columnDtl_wms_flg) return doDtl_wms_flg_VC(info);
		if (vc == columnDtl_ext_sys_cd) return doDtl_ext_sys_cd_VC(info);
		if (vc == columnDtl_ext_sys_nm) return doDtl_ext_sys_nm_VC(info);
		if (vc == columnDtl_ext_ship_act_no) return doDtl_ext_ship_act_no_VC(info);
		if (vc == columnDtl_disp_seq) return doDtl_disp_seq_VC(info);
		if (vc == columnDtl_assort_typ) return doDtl_assort_typ_VC(info);
		if (vc == columnDtl_set_itm_grp_no) return doDtl_set_itm_grp_no_VC(info);
		if (vc == columnDtl_ship_inst_typ) return doDtl_ship_inst_typ_VC(info);
		if (vc == columnDtl_ship_schd_loc_cd) return doDtl_ship_schd_loc_cd_VC(info);
		if (vc == columnDtl_ship_schd_loc_sppl_cd) return doDtl_ship_schd_loc_sppl_cd_VC(info);
		if (vc == columnDtl_ship_schd_str_ln_cd) return doDtl_ship_schd_str_ln_cd_VC(info);
		if (vc == columnDtl_sync_flg) return doDtl_sync_flg_VC(info);
		if (vc == columnDtl_read_only_flg) return doDtl_read_only_flg_VC(info);
		if (vc == columnDtl_base_unit_qty_bef) return doDtl_base_unit_qty_bef_VC(info);
		if (vc == Btn_indiv_prnt_flg) return doBtn_indiv_prnt_flg_VC(info);
		return true;
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdrTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[screen_ope]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_screen_ope_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_srch_tgt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ship_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ship_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ac_ym]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ac_ym_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_act_rev]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_act_rev_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[latest_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_latest_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[can_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_can_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_to_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_dlv_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_via_dlv_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_chk_off_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_fr_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_term_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_term_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[inst_dlv_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_inst_dlv_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_adv_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dlv_slip_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnted_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ship_adv_prnted_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[uplnd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_uplnd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_prnt_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pr_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pr_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_ptn_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cststk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loan_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loan_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dscnt_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ver_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ver_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_lot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_not_sublot_mix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_base_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_conv_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[abort_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_abort_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_stk_arrv_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_wt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_wt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[unit_dim]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_unit_dim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_id_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_sundry_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_sundry_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_pri_prnt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_trd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_iv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_po_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_dlv_inst_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cst_dlv_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_acxfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_acxfr_gi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bd_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_skip_chk_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_prov_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_ac_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_arr_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_trd_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_intr_d_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_slo_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_xfr_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_alloc_sts_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_iv_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_slip_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_act_d_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wms_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wms_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ext_ship_act_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ext_ship_act_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[disp_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_disp_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[assort_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_assort_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_set_itm_grp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_inst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_loc_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ship_schd_str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ship_schd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sync_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sync_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[read_only_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_read_only_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_base_unit_qty_bef_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_indiv_prnt_flg_VC(MCEventInfo info){
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
		if (nc == HdrTabTab) doHdrTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_screen_ope) doCnd_screen_ope_NC(info);
		else if (nc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NC(info);
		else if (nc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NC(info);
		else if (nc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NC(info);
		else if (nc == Cnd_ship_act_rev) doCnd_ship_act_rev_NC(info);
		else if (nc == Cnd_latest_flg) doCnd_latest_flg_NC(info);
		else if (nc == Hdr_trd_cd) doHdr_trd_cd_NC(info);
		else if (nc == Hdr_trd_nm) doHdr_trd_nm_NC(info);
		else if (nc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NC(info);
		else if (nc == Hdr_ac_ym) doHdr_ac_ym_NC(info);
		else if (nc == Hdr_ship_act_no) doHdr_ship_act_no_NC(info);
		else if (nc == Hdr_ship_act_rev) doHdr_ship_act_rev_NC(info);
		else if (nc == Hdr_latest_flg) doHdr_latest_flg_NC(info);
		else if (nc == Hdr_can_flg) doHdr_can_flg_NC(info);
		else if (nc == Hdr_ship_inst_no) doHdr_ship_inst_no_NC(info);
		else if (nc == Hdr_iv_no) doHdr_iv_no_NC(info);
		else if (nc == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NC(info);
		else if (nc == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NC(info);
		else if (nc == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NC(info);
		else if (nc == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NC(info);
		else if (nc == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NC(info);
		else if (nc == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NC(info);
		else if (nc == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NC(info);
		else if (nc == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NC(info);
		else if (nc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NC(info);
		else if (nc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NC(info);
		else if (nc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NC(info);
		else if (nc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NC(info);
		else if (nc == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NC(info);
		else if (nc == Hdr_dlv_pri_prnt_flg) doHdr_dlv_pri_prnt_flg_NC(info);
		else if (nc == Hdr_dlv_str_ln_tgt_flg) doHdr_dlv_str_ln_tgt_flg_NC(info);
		else if (nc == Hdr_dlv_cd) doHdr_dlv_cd_NC(info);
		else if (nc == Hdr_dlv_sppl_cd) doHdr_dlv_sppl_cd_NC(info);
		else if (nc == Hdr_cst_cd) doHdr_cst_cd_NC(info);
		else if (nc == Hdr_cst_nm) doHdr_cst_nm_NC(info);
		else if (nc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NC(info);
		else if (nc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NC(info);
		else if (nc == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NC(info);
		else if (nc == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NC(info);
		else if (nc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NC(info);
		else if (nc == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NC(info);
		else if (nc == Hdr_ship_term_cd) doHdr_ship_term_cd_NC(info);
		else if (nc == Hdr_ship_term_nm) doHdr_ship_term_nm_NC(info);
		else if (nc == Hdr_ship_wt) doHdr_ship_wt_NC(info);
		else if (nc == Hdr_ship_dim) doHdr_ship_dim_NC(info);
		else if (nc == Hdr_inst_dlv_prnted_flg) doHdr_inst_dlv_prnted_flg_NC(info);
		else if (nc == Hdr_dlv_slip_prnt_flg) doHdr_dlv_slip_prnt_flg_NC(info);
		else if (nc == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NC(info);
		else if (nc == Hdr_dlv_slip_prnted_flg) doHdr_dlv_slip_prnted_flg_NC(info);
		else if (nc == Hdr_ship_adv_prnted_flg) doHdr_ship_adv_prnted_flg_NC(info);
		else if (nc == Hdr_uplnd_flg) doHdr_uplnd_flg_NC(info);
		else if (nc == Hdr_intr_rmrks) doHdr_intr_rmrks_NC(info);
		else if (nc == Hdr_sub_char1) doHdr_sub_char1_NC(info);
		else if (nc == Hdr_sub_char2) doHdr_sub_char2_NC(info);
		else if (nc == Hdr_sub_char3) doHdr_sub_char3_NC(info);
		else if (nc == Hdr_ins_usr_id) doHdr_ins_usr_id_NC(info);
		else if (nc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NC(info);
		else if (nc == Hdr_ins_func_id) doHdr_ins_func_id_NC(info);
		else if (nc == Hdr_ins_func_nm) doHdr_ins_func_nm_NC(info);
		else if (nc == Hdr_upd_usr_id) doHdr_upd_usr_id_NC(info);
		else if (nc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NC(info);
		else if (nc == Hdr_upd_func_id) doHdr_upd_func_id_NC(info);
		else if (nc == Hdr_upd_func_nm) doHdr_upd_func_nm_NC(info);
		else if (nc == Hdr_ins_ts) doHdr_ins_ts_NC(info);
		else if (nc == Hdr_upd_ts) doHdr_upd_ts_NC(info);
		else if (nc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NC(info);
		else if (nc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NC(info);
		else if (nc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NC(info);
		else if (nc == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NC(info);
		else if (nc == columnDtl_trd_cd) doDtl_trd_cd_NC(info);
		else if (nc == columnDtl_trd_nm) doDtl_trd_nm_NC(info);
		else if (nc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NC(info);
		else if (nc == columnDtl_cststk_flg) doDtl_cststk_flg_NC(info);
		else if (nc == columnDtl_loan_flg) doDtl_loan_flg_NC(info);
		else if (nc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NC(info);
		else if (nc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NC(info);
		else if (nc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NC(info);
		else if (nc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NC(info);
		else if (nc == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NC(info);
		else if (nc == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NC(info);
		else if (nc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NC(info);
		else if (nc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NC(info);
		else if (nc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NC(info);
		else if (nc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NC(info);
		else if (nc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NC(info);
		else if (nc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NC(info);
		else if (nc == columnDtl_ver_flg) doDtl_ver_flg_NC(info);
		else if (nc == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NC(info);
		else if (nc == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NC(info);
		else if (nc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NC(info);
		else if (nc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NC(info);
		else if (nc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NC(info);
		else if (nc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NC(info);
		else if (nc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NC(info);
		else if (nc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_abort_flg) doDtl_abort_flg_NC(info);
		else if (nc == columnDtl_base_unit_cd) doDtl_base_unit_cd_NC(info);
		else if (nc == columnDtl_base_unit_nm) doDtl_base_unit_nm_NC(info);
		else if (nc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NC(info);
		else if (nc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NC(info);
		else if (nc == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NC(info);
		else if (nc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NC(info);
		else if (nc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NC(info);
		else if (nc == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NC(info);
		else if (nc == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NC(info);
		else if (nc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NC(info);
		else if (nc == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_ship_loc_sppl_cd) doDtl_ship_loc_sppl_cd_NC(info);
		else if (nc == columnDtl_quality_typ) doDtl_quality_typ_NC(info);
		else if (nc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NC(info);
		else if (nc == columnDtl_gd_cd) doDtl_gd_cd_NC(info);
		else if (nc == columnDtl_gd_nm) doDtl_gd_nm_NC(info);
		else if (nc == columnDtl_stk_id_typ) doDtl_stk_id_typ_NC(info);
		else if (nc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NC(info);
		else if (nc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_sppl_cd) doDtl_sppl_cd_NC(info);
		else if (nc == columnDtl_ship_wt) doDtl_ship_wt_NC(info);
		else if (nc == columnDtl_ship_dim) doDtl_ship_dim_NC(info);
		else if (nc == columnDtl_unit_wt) doDtl_unit_wt_NC(info);
		else if (nc == columnDtl_unit_dim) doDtl_unit_dim_NC(info);
		else if (nc == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NC(info);
		else if (nc == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NC(info);
		else if (nc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NC(info);
		else if (nc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NC(info);
		else if (nc == columnDtl_dlv_sundry_flg) doDtl_dlv_sundry_flg_NC(info);
		else if (nc == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NC(info);
		else if (nc == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NC(info);
		else if (nc == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NC(info);
		else if (nc == columnDtl_dlv_sppl_cd) doDtl_dlv_sppl_cd_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NC(info);
		else if (nc == columnDtl_cst_po_no) doDtl_cst_po_no_NC(info);
		else if (nc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NC(info);
		else if (nc == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NC(info);
		else if (nc == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NC(info);
		else if (nc == columnDtl_rsn_cd) doDtl_rsn_cd_NC(info);
		else if (nc == columnDtl_rsn_nm) doDtl_rsn_nm_NC(info);
		else if (nc == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NC(info);
		else if (nc == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NC(info);
		else if (nc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NC(info);
		else if (nc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NC(info);
		else if (nc == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NC(info);
		else if (nc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NC(info);
		else if (nc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NC(info);
		else if (nc == columnDtl_base_ac_dt) doDtl_base_ac_dt_NC(info);
		else if (nc == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NC(info);
		else if (nc == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NC(info);
		else if (nc == columnDtl_trd_rmrks) doDtl_trd_rmrks_NC(info);
		else if (nc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NC(info);
		else if (nc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NC(info);
		else if (nc == columnDtl_sub_char1) doDtl_sub_char1_NC(info);
		else if (nc == columnDtl_sub_char2) doDtl_sub_char2_NC(info);
		else if (nc == columnDtl_sub_char3) doDtl_sub_char3_NC(info);
		else if (nc == columnDtl_slo_no) doDtl_slo_no_NC(info);
		else if (nc == columnDtl_slo_d_no) doDtl_slo_d_no_NC(info);
		else if (nc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NC(info);
		else if (nc == columnDtl_ship_schd_no) doDtl_ship_schd_no_NC(info);
		else if (nc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NC(info);
		else if (nc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NC(info);
		else if (nc == columnDtl_iv_no) doDtl_iv_no_NC(info);
		else if (nc == columnDtl_iv_d_no) doDtl_iv_d_no_NC(info);
		else if (nc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NC(info);
		else if (nc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NC(info);
		else if (nc == columnDtl_ship_act_no) doDtl_ship_act_no_NC(info);
		else if (nc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NC(info);
		else if (nc == columnDtl_wms_flg) doDtl_wms_flg_NC(info);
		else if (nc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NC(info);
		else if (nc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NC(info);
		else if (nc == columnDtl_ext_ship_act_no) doDtl_ext_ship_act_no_NC(info);
		else if (nc == columnDtl_disp_seq) doDtl_disp_seq_NC(info);
		else if (nc == columnDtl_assort_typ) doDtl_assort_typ_NC(info);
		else if (nc == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NC(info);
		else if (nc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NC(info);
		else if (nc == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NC(info);
		else if (nc == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NC(info);
		else if (nc == columnDtl_ship_schd_str_ln_cd) doDtl_ship_schd_str_ln_cd_NC(info);
		else if (nc == columnDtl_sync_flg) doDtl_sync_flg_NC(info);
		else if (nc == columnDtl_read_only_flg) doDtl_read_only_flg_NC(info);
		else if (nc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NC(info);
		else if (nc == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NC(info);
	}

	/**
	 * [HdrTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_rev]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_rev_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dlv_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dlv_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnted_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnted_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[uplnd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_uplnd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sundry_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sundry_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_ship_act_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_ship_act_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[assort_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_assort_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[read_only_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_read_only_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == HdrTabTab) doHdrTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_screen_ope) doCnd_screen_ope_NE(info);
		else if (ne == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NE(info);
		else if (ne == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NE(info);
		else if (ne == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NE(info);
		else if (ne == Cnd_ship_act_rev) doCnd_ship_act_rev_NE(info);
		else if (ne == Cnd_latest_flg) doCnd_latest_flg_NE(info);
		else if (ne == Hdr_trd_cd) doHdr_trd_cd_NE(info);
		else if (ne == Hdr_trd_nm) doHdr_trd_nm_NE(info);
		else if (ne == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NE(info);
		else if (ne == Hdr_ac_ym) doHdr_ac_ym_NE(info);
		else if (ne == Hdr_ship_act_no) doHdr_ship_act_no_NE(info);
		else if (ne == Hdr_ship_act_rev) doHdr_ship_act_rev_NE(info);
		else if (ne == Hdr_latest_flg) doHdr_latest_flg_NE(info);
		else if (ne == Hdr_can_flg) doHdr_can_flg_NE(info);
		else if (ne == Hdr_ship_inst_no) doHdr_ship_inst_no_NE(info);
		else if (ne == Hdr_iv_no) doHdr_iv_no_NE(info);
		else if (ne == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NE(info);
		else if (ne == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NE(info);
		else if (ne == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NE(info);
		else if (ne == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NE(info);
		else if (ne == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NE(info);
		else if (ne == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NE(info);
		else if (ne == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NE(info);
		else if (ne == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NE(info);
		else if (ne == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NE(info);
		else if (ne == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NE(info);
		else if (ne == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NE(info);
		else if (ne == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NE(info);
		else if (ne == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NE(info);
		else if (ne == Hdr_dlv_pri_prnt_flg) doHdr_dlv_pri_prnt_flg_NE(info);
		else if (ne == Hdr_dlv_str_ln_tgt_flg) doHdr_dlv_str_ln_tgt_flg_NE(info);
		else if (ne == Hdr_dlv_cd) doHdr_dlv_cd_NE(info);
		else if (ne == Hdr_dlv_sppl_cd) doHdr_dlv_sppl_cd_NE(info);
		else if (ne == Hdr_cst_cd) doHdr_cst_cd_NE(info);
		else if (ne == Hdr_cst_nm) doHdr_cst_nm_NE(info);
		else if (ne == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NE(info);
		else if (ne == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NE(info);
		else if (ne == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NE(info);
		else if (ne == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NE(info);
		else if (ne == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NE(info);
		else if (ne == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NE(info);
		else if (ne == Hdr_ship_term_cd) doHdr_ship_term_cd_NE(info);
		else if (ne == Hdr_ship_term_nm) doHdr_ship_term_nm_NE(info);
		else if (ne == Hdr_ship_wt) doHdr_ship_wt_NE(info);
		else if (ne == Hdr_ship_dim) doHdr_ship_dim_NE(info);
		else if (ne == Hdr_inst_dlv_prnted_flg) doHdr_inst_dlv_prnted_flg_NE(info);
		else if (ne == Hdr_dlv_slip_prnt_flg) doHdr_dlv_slip_prnt_flg_NE(info);
		else if (ne == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NE(info);
		else if (ne == Hdr_dlv_slip_prnted_flg) doHdr_dlv_slip_prnted_flg_NE(info);
		else if (ne == Hdr_ship_adv_prnted_flg) doHdr_ship_adv_prnted_flg_NE(info);
		else if (ne == Hdr_uplnd_flg) doHdr_uplnd_flg_NE(info);
		else if (ne == Hdr_intr_rmrks) doHdr_intr_rmrks_NE(info);
		else if (ne == Hdr_sub_char1) doHdr_sub_char1_NE(info);
		else if (ne == Hdr_sub_char2) doHdr_sub_char2_NE(info);
		else if (ne == Hdr_sub_char3) doHdr_sub_char3_NE(info);
		else if (ne == Hdr_ins_usr_id) doHdr_ins_usr_id_NE(info);
		else if (ne == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NE(info);
		else if (ne == Hdr_ins_func_id) doHdr_ins_func_id_NE(info);
		else if (ne == Hdr_ins_func_nm) doHdr_ins_func_nm_NE(info);
		else if (ne == Hdr_upd_usr_id) doHdr_upd_usr_id_NE(info);
		else if (ne == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NE(info);
		else if (ne == Hdr_upd_func_id) doHdr_upd_func_id_NE(info);
		else if (ne == Hdr_upd_func_nm) doHdr_upd_func_nm_NE(info);
		else if (ne == Hdr_ins_ts) doHdr_ins_ts_NE(info);
		else if (ne == Hdr_upd_ts) doHdr_upd_ts_NE(info);
		else if (ne == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NE(info);
		else if (ne == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NE(info);
		else if (ne == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NE(info);
		else if (ne == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NE(info);
		else if (ne == columnDtl_trd_cd) doDtl_trd_cd_NE(info);
		else if (ne == columnDtl_trd_nm) doDtl_trd_nm_NE(info);
		else if (ne == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NE(info);
		else if (ne == columnDtl_cststk_flg) doDtl_cststk_flg_NE(info);
		else if (ne == columnDtl_loan_flg) doDtl_loan_flg_NE(info);
		else if (ne == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NE(info);
		else if (ne == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NE(info);
		else if (ne == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NE(info);
		else if (ne == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NE(info);
		else if (ne == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NE(info);
		else if (ne == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NE(info);
		else if (ne == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NE(info);
		else if (ne == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NE(info);
		else if (ne == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NE(info);
		else if (ne == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NE(info);
		else if (ne == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NE(info);
		else if (ne == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NE(info);
		else if (ne == columnDtl_ver_flg) doDtl_ver_flg_NE(info);
		else if (ne == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NE(info);
		else if (ne == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NE(info);
		else if (ne == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NE(info);
		else if (ne == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NE(info);
		else if (ne == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NE(info);
		else if (ne == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NE(info);
		else if (ne == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NE(info);
		else if (ne == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_abort_flg) doDtl_abort_flg_NE(info);
		else if (ne == columnDtl_base_unit_cd) doDtl_base_unit_cd_NE(info);
		else if (ne == columnDtl_base_unit_nm) doDtl_base_unit_nm_NE(info);
		else if (ne == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NE(info);
		else if (ne == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NE(info);
		else if (ne == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NE(info);
		else if (ne == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NE(info);
		else if (ne == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NE(info);
		else if (ne == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NE(info);
		else if (ne == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NE(info);
		else if (ne == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NE(info);
		else if (ne == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_ship_loc_sppl_cd) doDtl_ship_loc_sppl_cd_NE(info);
		else if (ne == columnDtl_quality_typ) doDtl_quality_typ_NE(info);
		else if (ne == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NE(info);
		else if (ne == columnDtl_gd_cd) doDtl_gd_cd_NE(info);
		else if (ne == columnDtl_gd_nm) doDtl_gd_nm_NE(info);
		else if (ne == columnDtl_stk_id_typ) doDtl_stk_id_typ_NE(info);
		else if (ne == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NE(info);
		else if (ne == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_sppl_cd) doDtl_sppl_cd_NE(info);
		else if (ne == columnDtl_ship_wt) doDtl_ship_wt_NE(info);
		else if (ne == columnDtl_ship_dim) doDtl_ship_dim_NE(info);
		else if (ne == columnDtl_unit_wt) doDtl_unit_wt_NE(info);
		else if (ne == columnDtl_unit_dim) doDtl_unit_dim_NE(info);
		else if (ne == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NE(info);
		else if (ne == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NE(info);
		else if (ne == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NE(info);
		else if (ne == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NE(info);
		else if (ne == columnDtl_dlv_sundry_flg) doDtl_dlv_sundry_flg_NE(info);
		else if (ne == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NE(info);
		else if (ne == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NE(info);
		else if (ne == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NE(info);
		else if (ne == columnDtl_dlv_sppl_cd) doDtl_dlv_sppl_cd_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NE(info);
		else if (ne == columnDtl_cst_po_no) doDtl_cst_po_no_NE(info);
		else if (ne == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NE(info);
		else if (ne == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NE(info);
		else if (ne == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NE(info);
		else if (ne == columnDtl_rsn_cd) doDtl_rsn_cd_NE(info);
		else if (ne == columnDtl_rsn_nm) doDtl_rsn_nm_NE(info);
		else if (ne == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NE(info);
		else if (ne == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NE(info);
		else if (ne == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NE(info);
		else if (ne == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NE(info);
		else if (ne == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NE(info);
		else if (ne == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NE(info);
		else if (ne == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NE(info);
		else if (ne == columnDtl_base_ac_dt) doDtl_base_ac_dt_NE(info);
		else if (ne == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NE(info);
		else if (ne == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NE(info);
		else if (ne == columnDtl_trd_rmrks) doDtl_trd_rmrks_NE(info);
		else if (ne == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NE(info);
		else if (ne == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NE(info);
		else if (ne == columnDtl_sub_char1) doDtl_sub_char1_NE(info);
		else if (ne == columnDtl_sub_char2) doDtl_sub_char2_NE(info);
		else if (ne == columnDtl_sub_char3) doDtl_sub_char3_NE(info);
		else if (ne == columnDtl_slo_no) doDtl_slo_no_NE(info);
		else if (ne == columnDtl_slo_d_no) doDtl_slo_d_no_NE(info);
		else if (ne == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NE(info);
		else if (ne == columnDtl_ship_schd_no) doDtl_ship_schd_no_NE(info);
		else if (ne == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NE(info);
		else if (ne == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NE(info);
		else if (ne == columnDtl_iv_no) doDtl_iv_no_NE(info);
		else if (ne == columnDtl_iv_d_no) doDtl_iv_d_no_NE(info);
		else if (ne == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NE(info);
		else if (ne == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NE(info);
		else if (ne == columnDtl_ship_act_no) doDtl_ship_act_no_NE(info);
		else if (ne == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NE(info);
		else if (ne == columnDtl_wms_flg) doDtl_wms_flg_NE(info);
		else if (ne == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NE(info);
		else if (ne == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NE(info);
		else if (ne == columnDtl_ext_ship_act_no) doDtl_ext_ship_act_no_NE(info);
		else if (ne == columnDtl_disp_seq) doDtl_disp_seq_NE(info);
		else if (ne == columnDtl_assort_typ) doDtl_assort_typ_NE(info);
		else if (ne == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NE(info);
		else if (ne == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NE(info);
		else if (ne == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NE(info);
		else if (ne == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NE(info);
		else if (ne == columnDtl_ship_schd_str_ln_cd) doDtl_ship_schd_str_ln_cd_NE(info);
		else if (ne == columnDtl_sync_flg) doDtl_sync_flg_NE(info);
		else if (ne == columnDtl_read_only_flg) doDtl_read_only_flg_NE(info);
		else if (ne == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NE(info);
		else if (ne == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NE(info);
	}

	/**
	 * [HdrTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_rev]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_rev_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dlv_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dlv_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnted_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnted_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[uplnd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_uplnd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sundry_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sundry_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_ship_act_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_ship_act_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[assort_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_assort_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[read_only_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_read_only_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == HdrTabTab) doHdrTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_screen_ope) doCnd_screen_ope_NX(info);
		else if (nx == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_NX(info);
		else if (nx == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_NX(info);
		else if (nx == Cnd_srch_tgt_no) doCnd_srch_tgt_no_NX(info);
		else if (nx == Cnd_ship_act_rev) doCnd_ship_act_rev_NX(info);
		else if (nx == Cnd_latest_flg) doCnd_latest_flg_NX(info);
		else if (nx == Hdr_trd_cd) doHdr_trd_cd_NX(info);
		else if (nx == Hdr_trd_nm) doHdr_trd_nm_NX(info);
		else if (nx == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_NX(info);
		else if (nx == Hdr_ac_ym) doHdr_ac_ym_NX(info);
		else if (nx == Hdr_ship_act_no) doHdr_ship_act_no_NX(info);
		else if (nx == Hdr_ship_act_rev) doHdr_ship_act_rev_NX(info);
		else if (nx == Hdr_latest_flg) doHdr_latest_flg_NX(info);
		else if (nx == Hdr_can_flg) doHdr_can_flg_NX(info);
		else if (nx == Hdr_ship_inst_no) doHdr_ship_inst_no_NX(info);
		else if (nx == Hdr_iv_no) doHdr_iv_no_NX(info);
		else if (nx == Hdr_dlv_slip_no) doHdr_dlv_slip_no_NX(info);
		else if (nx == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_NX(info);
		else if (nx == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_NX(info);
		else if (nx == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_NX(info);
		else if (nx == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_NX(info);
		else if (nx == Hdr_ship_to_sundry_flg) doHdr_ship_to_sundry_flg_NX(info);
		else if (nx == Hdr_via_dlv_typ) doHdr_via_dlv_typ_NX(info);
		else if (nx == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_NX(info);
		else if (nx == Hdr_dlv_id_typ) doHdr_dlv_id_typ_NX(info);
		else if (nx == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_NX(info);
		else if (nx == Hdr_dlv_id_cd) doHdr_dlv_id_cd_NX(info);
		else if (nx == Hdr_dlv_id_nm) doHdr_dlv_id_nm_NX(info);
		else if (nx == Hdr_dlv_sundry_flg) doHdr_dlv_sundry_flg_NX(info);
		else if (nx == Hdr_dlv_pri_prnt_flg) doHdr_dlv_pri_prnt_flg_NX(info);
		else if (nx == Hdr_dlv_str_ln_tgt_flg) doHdr_dlv_str_ln_tgt_flg_NX(info);
		else if (nx == Hdr_dlv_cd) doHdr_dlv_cd_NX(info);
		else if (nx == Hdr_dlv_sppl_cd) doHdr_dlv_sppl_cd_NX(info);
		else if (nx == Hdr_cst_cd) doHdr_cst_cd_NX(info);
		else if (nx == Hdr_cst_nm) doHdr_cst_nm_NX(info);
		else if (nx == Hdr_cst_usr_cd) doHdr_cst_usr_cd_NX(info);
		else if (nx == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_NX(info);
		else if (nx == Hdr_cst_iv_flg) doHdr_cst_iv_flg_NX(info);
		else if (nx == Hdr_lot_chk_off_flg) doHdr_lot_chk_off_flg_NX(info);
		else if (nx == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_NX(info);
		else if (nx == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_NX(info);
		else if (nx == Hdr_ship_term_cd) doHdr_ship_term_cd_NX(info);
		else if (nx == Hdr_ship_term_nm) doHdr_ship_term_nm_NX(info);
		else if (nx == Hdr_ship_wt) doHdr_ship_wt_NX(info);
		else if (nx == Hdr_ship_dim) doHdr_ship_dim_NX(info);
		else if (nx == Hdr_inst_dlv_prnted_flg) doHdr_inst_dlv_prnted_flg_NX(info);
		else if (nx == Hdr_dlv_slip_prnt_flg) doHdr_dlv_slip_prnt_flg_NX(info);
		else if (nx == Hdr_ship_adv_prnt_flg) doHdr_ship_adv_prnt_flg_NX(info);
		else if (nx == Hdr_dlv_slip_prnted_flg) doHdr_dlv_slip_prnted_flg_NX(info);
		else if (nx == Hdr_ship_adv_prnted_flg) doHdr_ship_adv_prnted_flg_NX(info);
		else if (nx == Hdr_uplnd_flg) doHdr_uplnd_flg_NX(info);
		else if (nx == Hdr_intr_rmrks) doHdr_intr_rmrks_NX(info);
		else if (nx == Hdr_sub_char1) doHdr_sub_char1_NX(info);
		else if (nx == Hdr_sub_char2) doHdr_sub_char2_NX(info);
		else if (nx == Hdr_sub_char3) doHdr_sub_char3_NX(info);
		else if (nx == Hdr_ins_usr_id) doHdr_ins_usr_id_NX(info);
		else if (nx == Hdr_ins_usr_nm) doHdr_ins_usr_nm_NX(info);
		else if (nx == Hdr_ins_func_id) doHdr_ins_func_id_NX(info);
		else if (nx == Hdr_ins_func_nm) doHdr_ins_func_nm_NX(info);
		else if (nx == Hdr_upd_usr_id) doHdr_upd_usr_id_NX(info);
		else if (nx == Hdr_upd_usr_nm) doHdr_upd_usr_nm_NX(info);
		else if (nx == Hdr_upd_func_id) doHdr_upd_func_id_NX(info);
		else if (nx == Hdr_upd_func_nm) doHdr_upd_func_nm_NX(info);
		else if (nx == Hdr_ins_ts) doHdr_ins_ts_NX(info);
		else if (nx == Hdr_upd_ts) doHdr_upd_ts_NX(info);
		else if (nx == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_NX(info);
		else if (nx == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_NX(info);
		else if (nx == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_NX(info);
		else if (nx == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_NX(info);
		else if (nx == columnDtl_trd_cd) doDtl_trd_cd_NX(info);
		else if (nx == columnDtl_trd_nm) doDtl_trd_nm_NX(info);
		else if (nx == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_NX(info);
		else if (nx == columnDtl_cststk_flg) doDtl_cststk_flg_NX(info);
		else if (nx == columnDtl_loan_flg) doDtl_loan_flg_NX(info);
		else if (nx == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_NX(info);
		else if (nx == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_NX(info);
		else if (nx == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_NX(info);
		else if (nx == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_NX(info);
		else if (nx == columnDtl_sundry_itm_flg) doDtl_sundry_itm_flg_NX(info);
		else if (nx == columnDtl_dscnt_itm_flg) doDtl_dscnt_itm_flg_NX(info);
		else if (nx == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_NX(info);
		else if (nx == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_NX(info);
		else if (nx == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_NX(info);
		else if (nx == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_NX(info);
		else if (nx == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_NX(info);
		else if (nx == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_NX(info);
		else if (nx == columnDtl_ver_flg) doDtl_ver_flg_NX(info);
		else if (nx == columnDtl_not_lot_mix_flg) doDtl_not_lot_mix_flg_NX(info);
		else if (nx == columnDtl_not_sublot_mix_flg) doDtl_not_sublot_mix_flg_NX(info);
		else if (nx == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_NX(info);
		else if (nx == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_NX(info);
		else if (nx == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_NX(info);
		else if (nx == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_NX(info);
		else if (nx == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_NX(info);
		else if (nx == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_abort_flg) doDtl_abort_flg_NX(info);
		else if (nx == columnDtl_base_unit_cd) doDtl_base_unit_cd_NX(info);
		else if (nx == columnDtl_base_unit_nm) doDtl_base_unit_nm_NX(info);
		else if (nx == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_NX(info);
		else if (nx == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_NX(info);
		else if (nx == columnDtl_cont_fctr_flg) doDtl_cont_fctr_flg_NX(info);
		else if (nx == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_NX(info);
		else if (nx == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_NX(info);
		else if (nx == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_NX(info);
		else if (nx == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_NX(info);
		else if (nx == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_NX(info);
		else if (nx == columnDtl_ship_str_ln_tgt_flg) doDtl_ship_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_ship_loc_sppl_cd) doDtl_ship_loc_sppl_cd_NX(info);
		else if (nx == columnDtl_quality_typ) doDtl_quality_typ_NX(info);
		else if (nx == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_NX(info);
		else if (nx == columnDtl_gd_cd) doDtl_gd_cd_NX(info);
		else if (nx == columnDtl_gd_nm) doDtl_gd_nm_NX(info);
		else if (nx == columnDtl_stk_id_typ) doDtl_stk_id_typ_NX(info);
		else if (nx == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_NX(info);
		else if (nx == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_sppl_cd) doDtl_sppl_cd_NX(info);
		else if (nx == columnDtl_ship_wt) doDtl_ship_wt_NX(info);
		else if (nx == columnDtl_ship_dim) doDtl_ship_dim_NX(info);
		else if (nx == columnDtl_unit_wt) doDtl_unit_wt_NX(info);
		else if (nx == columnDtl_unit_dim) doDtl_unit_dim_NX(info);
		else if (nx == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_NX(info);
		else if (nx == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_NX(info);
		else if (nx == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_NX(info);
		else if (nx == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_NX(info);
		else if (nx == columnDtl_dlv_sundry_flg) doDtl_dlv_sundry_flg_NX(info);
		else if (nx == columnDtl_pri_prnt_flg) doDtl_pri_prnt_flg_NX(info);
		else if (nx == columnDtl_iv_trd_flg) doDtl_iv_trd_flg_NX(info);
		else if (nx == columnDtl_dlv_str_ln_tgt_flg) doDtl_dlv_str_ln_tgt_flg_NX(info);
		else if (nx == columnDtl_dlv_sppl_cd) doDtl_dlv_sppl_cd_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_cst_iv_flg) doDtl_cst_iv_flg_NX(info);
		else if (nx == columnDtl_cst_po_no) doDtl_cst_po_no_NX(info);
		else if (nx == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_NX(info);
		else if (nx == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_NX(info);
		else if (nx == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_NX(info);
		else if (nx == columnDtl_rsn_cd) doDtl_rsn_cd_NX(info);
		else if (nx == columnDtl_rsn_nm) doDtl_rsn_nm_NX(info);
		else if (nx == columnDtl_sls_acxfr_flg) doDtl_sls_acxfr_flg_NX(info);
		else if (nx == columnDtl_acxfr_gi_flg) doDtl_acxfr_gi_flg_NX(info);
		else if (nx == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_NX(info);
		else if (nx == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_NX(info);
		else if (nx == columnDtl_skip_chk_ship_flg) doDtl_skip_chk_ship_flg_NX(info);
		else if (nx == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_NX(info);
		else if (nx == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_NX(info);
		else if (nx == columnDtl_base_ac_dt) doDtl_base_ac_dt_NX(info);
		else if (nx == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_NX(info);
		else if (nx == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_NX(info);
		else if (nx == columnDtl_trd_rmrks) doDtl_trd_rmrks_NX(info);
		else if (nx == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_NX(info);
		else if (nx == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_NX(info);
		else if (nx == columnDtl_sub_char1) doDtl_sub_char1_NX(info);
		else if (nx == columnDtl_sub_char2) doDtl_sub_char2_NX(info);
		else if (nx == columnDtl_sub_char3) doDtl_sub_char3_NX(info);
		else if (nx == columnDtl_slo_no) doDtl_slo_no_NX(info);
		else if (nx == columnDtl_slo_d_no) doDtl_slo_d_no_NX(info);
		else if (nx == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_NX(info);
		else if (nx == columnDtl_ship_schd_no) doDtl_ship_schd_no_NX(info);
		else if (nx == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_NX(info);
		else if (nx == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_NX(info);
		else if (nx == columnDtl_iv_no) doDtl_iv_no_NX(info);
		else if (nx == columnDtl_iv_d_no) doDtl_iv_d_no_NX(info);
		else if (nx == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_NX(info);
		else if (nx == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_NX(info);
		else if (nx == columnDtl_ship_act_no) doDtl_ship_act_no_NX(info);
		else if (nx == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_NX(info);
		else if (nx == columnDtl_wms_flg) doDtl_wms_flg_NX(info);
		else if (nx == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_NX(info);
		else if (nx == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_NX(info);
		else if (nx == columnDtl_ext_ship_act_no) doDtl_ext_ship_act_no_NX(info);
		else if (nx == columnDtl_disp_seq) doDtl_disp_seq_NX(info);
		else if (nx == columnDtl_assort_typ) doDtl_assort_typ_NX(info);
		else if (nx == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_NX(info);
		else if (nx == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_NX(info);
		else if (nx == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_NX(info);
		else if (nx == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_NX(info);
		else if (nx == columnDtl_ship_schd_str_ln_cd) doDtl_ship_schd_str_ln_cd_NX(info);
		else if (nx == columnDtl_sync_flg) doDtl_sync_flg_NX(info);
		else if (nx == columnDtl_read_only_flg) doDtl_read_only_flg_NX(info);
		else if (nx == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_NX(info);
		else if (nx == Btn_indiv_prnt_flg) doBtn_indiv_prnt_flg_NX(info);
	}

	/**
	 * [HdrTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdrTab_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[screen_ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_rev]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_rev_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[latest_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_latest_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[can_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_can_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_chk_off_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_chk_off_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[inst_dlv_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_inst_dlv_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_adv_prnted_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_adv_prnted_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[uplnd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_uplnd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cststk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cststk_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loan_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loan_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dscnt_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dscnt_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ver_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ver_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_lot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_lot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[not_sublot_mix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_not_sublot_mix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[abort_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_abort_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sundry_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sundry_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pri_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pri_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_trd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_trd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_iv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_iv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_acxfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_acxfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[acxfr_gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_acxfr_gi_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[skip_chk_ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_skip_chk_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wms_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wms_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_ship_act_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_ship_act_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[assort_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_assort_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sync_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sync_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[read_only_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_read_only_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[indiv_prnt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_indiv_prnt_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_screen_ope) doCnd_screen_ope_LC(info);
		else if (lc == Cnd_srch_tgt_typ) doCnd_srch_tgt_typ_LC(info);
		else if (lc == Cnd_srch_tgt_typ_nm) doCnd_srch_tgt_typ_nm_LC(info);
		else if (lc == Cnd_srch_tgt_no) doCnd_srch_tgt_no_LC(info);
		else if (lc == Cnd_ship_act_rev) doCnd_ship_act_rev_LC(info);
		else if (lc == Hdr_trd_cd) doHdr_trd_cd_LC(info);
		else if (lc == Hdr_trd_nm) doHdr_trd_nm_LC(info);
		else if (lc == Hdr_trd_ptn_typ) doHdr_trd_ptn_typ_LC(info);
		else if (lc == Hdr_ac_ym) doHdr_ac_ym_LC(info);
		else if (lc == Hdr_ship_act_no) doHdr_ship_act_no_LC(info);
		else if (lc == Hdr_ship_act_rev) doHdr_ship_act_rev_LC(info);
		else if (lc == Hdr_ship_inst_no) doHdr_ship_inst_no_LC(info);
		else if (lc == Hdr_iv_no) doHdr_iv_no_LC(info);
		else if (lc == Hdr_dlv_slip_no) doHdr_dlv_slip_no_LC(info);
		else if (lc == Hdr_ship_to_id_typ) doHdr_ship_to_id_typ_LC(info);
		else if (lc == Hdr_ship_to_id_typ_nm) doHdr_ship_to_id_typ_nm_LC(info);
		else if (lc == Hdr_ship_to_id_cd) doHdr_ship_to_id_cd_LC(info);
		else if (lc == Hdr_ship_to_id_nm) doHdr_ship_to_id_nm_LC(info);
		else if (lc == Hdr_via_dlv_typ) doHdr_via_dlv_typ_LC(info);
		else if (lc == Hdr_via_dlv_typ_nm) doHdr_via_dlv_typ_nm_LC(info);
		else if (lc == Hdr_dlv_id_typ) doHdr_dlv_id_typ_LC(info);
		else if (lc == Hdr_dlv_id_typ_nm) doHdr_dlv_id_typ_nm_LC(info);
		else if (lc == Hdr_dlv_id_cd) doHdr_dlv_id_cd_LC(info);
		else if (lc == Hdr_dlv_id_nm) doHdr_dlv_id_nm_LC(info);
		else if (lc == Hdr_dlv_cd) doHdr_dlv_cd_LC(info);
		else if (lc == Hdr_dlv_sppl_cd) doHdr_dlv_sppl_cd_LC(info);
		else if (lc == Hdr_cst_cd) doHdr_cst_cd_LC(info);
		else if (lc == Hdr_cst_nm) doHdr_cst_nm_LC(info);
		else if (lc == Hdr_cst_usr_cd) doHdr_cst_usr_cd_LC(info);
		else if (lc == Hdr_cst_dpt_cd) doHdr_cst_dpt_cd_LC(info);
		else if (lc == Hdr_ship_fr_lg_grp_cd) doHdr_ship_fr_lg_grp_cd_LC(info);
		else if (lc == Hdr_ship_fr_lg_grp_nm) doHdr_ship_fr_lg_grp_nm_LC(info);
		else if (lc == Hdr_ship_term_cd) doHdr_ship_term_cd_LC(info);
		else if (lc == Hdr_ship_term_nm) doHdr_ship_term_nm_LC(info);
		else if (lc == Hdr_ship_wt) doHdr_ship_wt_LC(info);
		else if (lc == Hdr_ship_dim) doHdr_ship_dim_LC(info);
		else if (lc == Hdr_intr_rmrks) doHdr_intr_rmrks_LC(info);
		else if (lc == Hdr_sub_char1) doHdr_sub_char1_LC(info);
		else if (lc == Hdr_sub_char2) doHdr_sub_char2_LC(info);
		else if (lc == Hdr_sub_char3) doHdr_sub_char3_LC(info);
		else if (lc == Hdr_ins_usr_id) doHdr_ins_usr_id_LC(info);
		else if (lc == Hdr_ins_usr_nm) doHdr_ins_usr_nm_LC(info);
		else if (lc == Hdr_ins_func_id) doHdr_ins_func_id_LC(info);
		else if (lc == Hdr_ins_func_nm) doHdr_ins_func_nm_LC(info);
		else if (lc == Hdr_upd_usr_id) doHdr_upd_usr_id_LC(info);
		else if (lc == Hdr_upd_usr_nm) doHdr_upd_usr_nm_LC(info);
		else if (lc == Hdr_upd_func_id) doHdr_upd_func_id_LC(info);
		else if (lc == Hdr_upd_func_nm) doHdr_upd_func_nm_LC(info);
		else if (lc == Hdr_ins_ts) doHdr_ins_ts_LC(info);
		else if (lc == Hdr_upd_ts) doHdr_upd_ts_LC(info);
		else if (lc == Hdr_upd_srv_req_no) doHdr_upd_srv_req_no_LC(info);
		else if (lc == Hdr_prnt_lcl_cd) doHdr_prnt_lcl_cd_LC(info);
		else if (lc == columnDtl_pr_sts_typ) doDtl_pr_sts_typ_LC(info);
		else if (lc == columnDtl_pr_sts_typ_nm) doDtl_pr_sts_typ_nm_LC(info);
		else if (lc == columnDtl_trd_cd) doDtl_trd_cd_LC(info);
		else if (lc == columnDtl_trd_nm) doDtl_trd_nm_LC(info);
		else if (lc == columnDtl_trd_ptn_typ) doDtl_trd_ptn_typ_LC(info);
		else if (lc == columnDtl_cst_itm_cd) doDtl_cst_itm_cd_LC(info);
		else if (lc == columnDtl_cst_itm_nm) doDtl_cst_itm_nm_LC(info);
		else if (lc == columnDtl_iv_itm_nm) doDtl_iv_itm_nm_LC(info);
		else if (lc == columnDtl_stk_mng_typ) doDtl_stk_mng_typ_LC(info);
		else if (lc == columnDtl_lot_mng_typ) doDtl_lot_mng_typ_LC(info);
		else if (lc == columnDtl_sublot_mng_typ) doDtl_sublot_mng_typ_LC(info);
		else if (lc == columnDtl_sno1_mng_typ) doDtl_sno1_mng_typ_LC(info);
		else if (lc == columnDtl_sno2_mng_typ) doDtl_sno2_mng_typ_LC(info);
		else if (lc == columnDtl_sno3_mng_typ) doDtl_sno3_mng_typ_LC(info);
		else if (lc == columnDtl_sno4_mng_typ) doDtl_sno4_mng_typ_LC(info);
		else if (lc == columnDtl_trd_unit_cd) doDtl_trd_unit_cd_LC(info);
		else if (lc == columnDtl_trd_unit_nm) doDtl_trd_unit_nm_LC(info);
		else if (lc == columnDtl_trd_unit_conv_base_qty) doDtl_trd_unit_conv_base_qty_LC(info);
		else if (lc == columnDtl_trd_unit_conv_qty) doDtl_trd_unit_conv_qty_LC(info);
		else if (lc == columnDtl_trd_unit_dec_place) doDtl_trd_unit_dec_place_LC(info);
		else if (lc == columnDtl_trd_unit_rnd_typ) doDtl_trd_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_base_unit_cd) doDtl_base_unit_cd_LC(info);
		else if (lc == columnDtl_base_unit_nm) doDtl_base_unit_nm_LC(info);
		else if (lc == columnDtl_base_unit_dec_place) doDtl_base_unit_dec_place_LC(info);
		else if (lc == columnDtl_base_unit_rnd_typ) doDtl_base_unit_rnd_typ_LC(info);
		else if (lc == columnDtl_cont_fctr_dec_place) doDtl_cont_fctr_dec_place_LC(info);
		else if (lc == columnDtl_cont_fctr_rnd_typ) doDtl_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnDtl_ship_fr_lg_grp_cd) doDtl_ship_fr_lg_grp_cd_LC(info);
		else if (lc == columnDtl_ship_loc_cd) doDtl_ship_loc_cd_LC(info);
		else if (lc == columnDtl_ship_loc_nm) doDtl_ship_loc_nm_LC(info);
		else if (lc == columnDtl_loc_mng_typ) doDtl_loc_mng_typ_LC(info);
		else if (lc == columnDtl_ship_loc_sppl_cd) doDtl_ship_loc_sppl_cd_LC(info);
		else if (lc == columnDtl_quality_typ) doDtl_quality_typ_LC(info);
		else if (lc == columnDtl_quality_typ_nm) doDtl_quality_typ_nm_LC(info);
		else if (lc == columnDtl_gd_cd) doDtl_gd_cd_LC(info);
		else if (lc == columnDtl_gd_nm) doDtl_gd_nm_LC(info);
		else if (lc == columnDtl_stk_id_typ) doDtl_stk_id_typ_LC(info);
		else if (lc == columnDtl_stk_id_typ_nm) doDtl_stk_id_typ_nm_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_cd) doDtl_stk_arrv_bp_cd_LC(info);
		else if (lc == columnDtl_stk_arrv_bp_nm) doDtl_stk_arrv_bp_nm_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_sppl_cd) doDtl_sppl_cd_LC(info);
		else if (lc == columnDtl_ship_wt) doDtl_ship_wt_LC(info);
		else if (lc == columnDtl_ship_dim) doDtl_ship_dim_LC(info);
		else if (lc == columnDtl_unit_wt) doDtl_unit_wt_LC(info);
		else if (lc == columnDtl_unit_dim) doDtl_unit_dim_LC(info);
		else if (lc == columnDtl_dlv_id_typ) doDtl_dlv_id_typ_LC(info);
		else if (lc == columnDtl_dlv_id_typ_nm) doDtl_dlv_id_typ_nm_LC(info);
		else if (lc == columnDtl_dlv_id_cd) doDtl_dlv_id_cd_LC(info);
		else if (lc == columnDtl_dlv_id_nm) doDtl_dlv_id_nm_LC(info);
		else if (lc == columnDtl_dlv_sppl_cd) doDtl_dlv_sppl_cd_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_cst_po_no) doDtl_cst_po_no_LC(info);
		else if (lc == columnDtl_cst_po_d_no) doDtl_cst_po_d_no_LC(info);
		else if (lc == columnDtl_cst_dlv_inst_no) doDtl_cst_dlv_inst_no_LC(info);
		else if (lc == columnDtl_cst_dlv_inst_d_no) doDtl_cst_dlv_inst_d_no_LC(info);
		else if (lc == columnDtl_rsn_cd) doDtl_rsn_cd_LC(info);
		else if (lc == columnDtl_rsn_nm) doDtl_rsn_nm_LC(info);
		else if (lc == columnDtl_bd_dpt_cd) doDtl_bd_dpt_cd_LC(info);
		else if (lc == columnDtl_bd_dpt_nm) doDtl_bd_dpt_nm_LC(info);
		else if (lc == columnDtl_base_dlv_slip_no) doDtl_base_dlv_slip_no_LC(info);
		else if (lc == columnDtl_base_prov_act_no) doDtl_base_prov_act_no_LC(info);
		else if (lc == columnDtl_base_ac_dt) doDtl_base_ac_dt_LC(info);
		else if (lc == columnDtl_ship_cnt_rmrks) doDtl_ship_cnt_rmrks_LC(info);
		else if (lc == columnDtl_arr_cnt_rmrks) doDtl_arr_cnt_rmrks_LC(info);
		else if (lc == columnDtl_trd_rmrks) doDtl_trd_rmrks_LC(info);
		else if (lc == columnDtl_trd_d_rmrks) doDtl_trd_d_rmrks_LC(info);
		else if (lc == columnDtl_intr_d_rmrks) doDtl_intr_d_rmrks_LC(info);
		else if (lc == columnDtl_sub_char1) doDtl_sub_char1_LC(info);
		else if (lc == columnDtl_sub_char2) doDtl_sub_char2_LC(info);
		else if (lc == columnDtl_sub_char3) doDtl_sub_char3_LC(info);
		else if (lc == columnDtl_slo_no) doDtl_slo_no_LC(info);
		else if (lc == columnDtl_slo_d_no) doDtl_slo_d_no_LC(info);
		else if (lc == columnDtl_xfr_schd_no) doDtl_xfr_schd_no_LC(info);
		else if (lc == columnDtl_ship_schd_no) doDtl_ship_schd_no_LC(info);
		else if (lc == columnDtl_ship_alloc_sts_no) doDtl_ship_alloc_sts_no_LC(info);
		else if (lc == columnDtl_ship_inst_d_no) doDtl_ship_inst_d_no_LC(info);
		else if (lc == columnDtl_iv_no) doDtl_iv_no_LC(info);
		else if (lc == columnDtl_iv_d_no) doDtl_iv_d_no_LC(info);
		else if (lc == columnDtl_dlv_slip_no) doDtl_dlv_slip_no_LC(info);
		else if (lc == columnDtl_dlv_slip_d_no) doDtl_dlv_slip_d_no_LC(info);
		else if (lc == columnDtl_ship_act_no) doDtl_ship_act_no_LC(info);
		else if (lc == columnDtl_ship_act_d_no) doDtl_ship_act_d_no_LC(info);
		else if (lc == columnDtl_ext_sys_cd) doDtl_ext_sys_cd_LC(info);
		else if (lc == columnDtl_ext_sys_nm) doDtl_ext_sys_nm_LC(info);
		else if (lc == columnDtl_ext_ship_act_no) doDtl_ext_ship_act_no_LC(info);
		else if (lc == columnDtl_disp_seq) doDtl_disp_seq_LC(info);
		else if (lc == columnDtl_assort_typ) doDtl_assort_typ_LC(info);
		else if (lc == columnDtl_set_itm_grp_no) doDtl_set_itm_grp_no_LC(info);
		else if (lc == columnDtl_ship_inst_typ) doDtl_ship_inst_typ_LC(info);
		else if (lc == columnDtl_ship_schd_loc_cd) doDtl_ship_schd_loc_cd_LC(info);
		else if (lc == columnDtl_ship_schd_loc_sppl_cd) doDtl_ship_schd_loc_sppl_cd_LC(info);
		else if (lc == columnDtl_ship_schd_str_ln_cd) doDtl_ship_schd_str_ln_cd_LC(info);
		else if (lc == columnDtl_base_unit_qty_bef) doDtl_base_unit_qty_bef_LC(info);
	}

	/**
	 * [Cnd]パネルの[screen_ope]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_screen_ope_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[srch_tgt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_srch_tgt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ship_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ship_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ac_ym]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ac_ym_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_act_rev]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_act_rev_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_to_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_to_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[via_dlv_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_via_dlv_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dlv_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dlv_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[cst_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_cst_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_fr_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_fr_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_term_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_term_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_wt_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ship_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ship_dim_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[prnt_lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_prnt_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[pr_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_pr_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_ptn_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_ptn_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_base_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_base_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_stk_arrv_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_wt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_wt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[unit_dim]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_unit_dim_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_id_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_id_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_po_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_po_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cst_dlv_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cst_dlv_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bd_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bd_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_prov_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_prov_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[arr_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_arr_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[trd_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_trd_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[intr_d_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_intr_d_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[slo_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_slo_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[xfr_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_xfr_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_alloc_sts_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_alloc_sts_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[iv_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_iv_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_slip_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_slip_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_act_d_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_act_d_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ext_ship_act_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ext_ship_act_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[disp_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_disp_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[assort_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_assort_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[set_itm_grp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_set_itm_grp_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_inst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_inst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_loc_sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_loc_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ship_schd_str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ship_schd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[base_unit_qty_bef]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_base_unit_qty_bef_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_srch_tgt_typ_nm]の作成メソッド
	 */
	public MCList getCnd_srch_tgt_typ_nm(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkSrchTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_trd_cd]の作成メソッド
	 */
	public MCList getHdr_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_to_id_typ]の作成メソッド
	 */
	public MCList getHdr_ship_to_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getShipToIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_to_id_cd]の作成メソッド
	 */
	public MCList getHdr_ship_to_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getShipToId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_via_dlv_typ]の作成メソッド
	 */
	public MCList getHdr_via_dlv_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getViaDlvTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dlv_id_typ]の作成メソッド
	 */
	public MCList getHdr_dlv_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getDlvIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dlv_id_cd]の作成メソッド
	 */
	public MCList getHdr_dlv_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getDlvId(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_dlv_cd]の作成メソッド
	 */
	public MCList getHdr_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_cst_cd]の作成メソッド
	 */
	public MCList getHdr_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_rqst_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd]の作成メソッド
	 */
	public MCList getHdr_ship_usr_dpt_p_PPanel_UsrDpt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_ship_fr_lg_grp_cd]の作成メソッド
	 */
	public MCList getHdr_ship_fr_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrpForLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_pr_sts_typ]の作成メソッド
	 */
	public MCList getDtl_pr_sts_typ(MCRow row, MCEventInfo info){
		return null;
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_cd]の作成メソッド
	 */
	public MCList getDtl_trd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getTrd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_itm_cd]の作成メソッド
	 */
	public MCList getDtl_cst_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getCstItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_lot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_lot_no_p_PPanel_columnLotNo_sublot_no]の作成メソッド
	 */
	public MCList getDtl_lot_no_p_PPanel_columnLotNo_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_trd_unit_cd]の作成メソッド
	 */
	public MCList getDtl_trd_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ship_loc_cd]の作成メソッド
	 */
	public MCList getDtl_ship_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_str_ln_p_PPanel_columnStrLn_str_ln_cd]の作成メソッド
	 */
	public MCList getDtl_str_ln_p_PPanel_columnStrLn_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_quality_typ]の作成メソッド
	 */
	public MCList getDtl_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_gd_cd]の作成メソッド
	 */
	public MCList getDtl_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_id_typ]の作成メソッド
	 */
	public MCList getDtl_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_stk_arrv_bp_cd]の作成メソッド
	 */
	public MCList getDtl_stk_arrv_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSpplByLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_id_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_id_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0060.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0060.MSUAP_List", this)).getDlvId(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getShipBizRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bd_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_bd_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDpt(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBEL1440.Srch01")) {
			return new MS_MSBEL1440_Srch01Bridge();
		}
		if (id.equals("MS.MSBEL1440.Srch02")) {
			return new MS_MSBEL1440_Srch02Bridge();
		}
		if (id.equals("MS.MSBEL1440.Srch03")) {
			return new MS_MSBEL1440_Srch03Bridge();
		}
		if (id.equals("MS.MSBEL1440.Ins01")) {
			return new MS_MSBEL1440_Ins01Bridge();
		}
		if (id.equals("MS.MSBEL1440.Upd01")) {
			return new MS_MSBEL1440_Upd01Bridge();
		}
		if (id.equals("MS.MSBEL1440.Del01")) {
			return new MS_MSBEL1440_Del01Bridge();
		}
		if (id.equals("MS.MSBEL1440.Prnt01")) {
			return new MS_MSBEL1440_Prnt01Bridge();
		}
		if (id.equals("MS.MSBEL1440.Sprt01")) {
			return new MS_MSBEL1440_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBEL1440_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Srch01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Srch01Bridge() {
			p_MS_MSBEL1440_Srch01 = new MCParam(PDef.MS_MSBEL1440_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));

			p_MS_MSBEL1440_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1440.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Srch01.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			p_MS_MSBEL1440_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			p_MS_MSBEL1440_Srch01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Srch01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Srch01.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)p_MS_MSBEL1440_Srch01.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Srch02;

		/** コンストラクタ */
		protected MS_MSBEL1440_Srch02Bridge() {
			p_MS_MSBEL1440_Srch02 = new MCParam(PDef.MS_MSBEL1440_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));

			p_MS_MSBEL1440_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1440.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Srch02.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			p_MS_MSBEL1440_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			p_MS_MSBEL1440_Srch02.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Srch02;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Srch02.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Srch02.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)p_MS_MSBEL1440_Srch02.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Srch03;

		/** コンストラクタ */
		protected MS_MSBEL1440_Srch03Bridge() {
			p_MS_MSBEL1440_Srch03 = new MCParam(PDef.MS_MSBEL1440_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.CndR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));

			p_MS_MSBEL1440_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.CndR up0() {
			return (mcframe.clientMSBE.MSBEP1440.CndR)up(0);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> down2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)down(2);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Srch03.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			p_MS_MSBEL1440_Srch03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			p_MS_MSBEL1440_Srch03.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Srch03;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Srch03.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Srch03.getContainerParam().getDownBlock(1));
			setDtl2L((MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)p_MS_MSBEL1440_Srch03.getContainerParam().getDownBlock(2));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
			getDtl2L().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Ins01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Ins01Bridge() {
			p_MS_MSBEL1440_Ins01 = new MCParam(PDef.MS_MSBEL1440_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.BtnR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));

			p_MS_MSBEL1440_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Ins01.addUpBlock(getHdrR());
			p_MS_MSBEL1440_Ins01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1440_Ins01.addUpBlock(getDtl2L().shallowClone());
			p_MS_MSBEL1440_Ins01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)up(2);
		}
		protected mcframe.clientMSBE.MSBEP1440.BtnR up3() {
			return (mcframe.clientMSBE.MSBEP1440.BtnR)up(3);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Ins01.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			p_MS_MSBEL1440_Ins01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Ins01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Ins01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Ins01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Upd01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Upd01Bridge() {
			p_MS_MSBEL1440_Upd01 = new MCParam(PDef.MS_MSBEL1440_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.BtnR.create());
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));

			p_MS_MSBEL1440_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Upd01.addUpBlock(getHdrR());
			p_MS_MSBEL1440_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MS_MSBEL1440_Upd01.addUpBlock(getDtl2L().shallowClone());
			p_MS_MSBEL1440_Upd01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)up(2);
		}
		protected mcframe.clientMSBE.MSBEP1440.BtnR up3() {
			return (mcframe.clientMSBE.MSBEP1440.BtnR)up(3);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Upd01.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			p_MS_MSBEL1440_Upd01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Upd01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Upd01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrR().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			result.add(getDtl2L());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Del01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Del01Bridge() {
			p_MS_MSBEL1440_Del01 = new MCParam(PDef.MS_MSBEL1440_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.Dtl2R.class));
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.BtnR.create());
			// Down

			p_MS_MSBEL1440_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Del01.addUpBlock(getHdrR());
			p_MS_MSBEL1440_Del01.addUpBlock(getDtl2L().shallowClone());
			p_MS_MSBEL1440_Del01.addUpBlock(getBtnR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)up(0);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R> up1() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.Dtl2R>)up(1);
		}
		protected mcframe.clientMSBE.MSBEP1440.BtnR up2() {
			return (mcframe.clientMSBE.MSBEP1440.BtnR)up(2);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getDtl2L());
			result.add(getBtnR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Prnt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Prnt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Prnt01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Prnt01Bridge() {
			p_MS_MSBEL1440_Prnt01 = new MCParam(PDef.MS_MSBEL1440_Prnt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Prnt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
			param.addUpBlock(mcframe.clientMSBE.MSBEP1440.BtnR.create());
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			// Down
			param.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());

			p_MS_MSBEL1440_Prnt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Prnt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Prnt01.addUpBlock(getHdrR());
			p_MS_MSBEL1440_Prnt01.addUpBlock(getBtnR());
			p_MS_MSBEL1440_Prnt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Prnt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Prnt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBE.MSBEP1440.HdrR up0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)up(0);
		}
		protected mcframe.clientMSBE.MSBEP1440.BtnR up1() {
			return (mcframe.clientMSBE.MSBEP1440.BtnR)up(1);
		}
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> up2() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)up(2);
		}

		protected mcframe.clientMSBE.MSBEP1440.HdrR down0() {
			return (mcframe.clientMSBE.MSBEP1440.HdrR)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Prnt01.addDownBlock(mcframe.clientMSBE.MSBEP1440.HdrR.create());
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Prnt01;
		}

		protected void show() {
			setHdrR((mcframe.clientMSBE.MSBEP1440.HdrR)p_MS_MSBEL1440_Prnt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getHdrR().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			result.add(getBtnR());
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrR());
			return result;
		}
	}
	/**
	 * [MS_MSBEL1440_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBEL1440_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBEL1440_Sprt01;

		/** コンストラクタ */
		protected MS_MSBEL1440_Sprt01Bridge() {
			p_MS_MSBEL1440_Sprt01 = new MCParam(PDef.MS_MSBEL1440_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBEL1440_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));

			p_MS_MSBEL1440_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBEL1440_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBEL1440_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBEL1440_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBEL1440_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> up0() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMSBE.MSBEP1440.DtlR> down0() {
			return (MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBEL1440_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBE.MSBEP1440.DtlR.class));
		}
		protected MCParam param() {
			return p_MS_MSBEL1440_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMSBE.MSBEP1440.DtlR>)p_MS_MSBEL1440_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}