package mcframe.clientMSBC.MSBCP0050;

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
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Srch01Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd01Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd02Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd03Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd04Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd05Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Del01Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Imp01Caller;
import mcframe.clientMSBC.MSBCP0050.MSBCP_OrdSrch_MC.MS_MSBCL0050_Ins01Caller;

/**
 * 画面"MSBCP_OrdSrch"パネルクラスです。<p>
 *
 * 品目オーダの照会及び状況を訂正する画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_OrdSrch_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBC";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBCP0050";

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
	public MCTabbedPane FoldTab = null;
	public MCPanel FoldBasePanel = null;
	public MCScrollPane FoldScrollPane = null;
	// [Fold]ブロックの項目のField定義
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Sts]ブロック関連のField定義
	public MCPanel StsPanel = null;
	public MCTitledBorder StsTitledBorder = null;
	// [Sts]ブロックの項目のField定義
	// [OrdTyp]ブロック関連のField定義
	public MCPanel OrdTypPanel = null;
	public MCTitledBorder OrdTypTitledBorder = null;
	// [OrdTyp]ブロックの項目のField定義
	// [FixFlg]ブロック関連のField定義
	public MCPanel FixFlgPanel = null;
	public MCTitledBorder FixFlgTitledBorder = null;
	// [FixFlg]ブロックの項目のField定義
	// [OrdRcv]ブロック関連のField定義
	public MCPanel OrdRcvPanel = null;
	public MCTitledBorder OrdRcvTitledBorder = null;
	// [OrdRcv]ブロックの項目のField定義
	// [OrdSnd]ブロック関連のField定義
	public MCPanel OrdSndPanel = null;
	public MCTitledBorder OrdSndTitledBorder = null;
	// [OrdSnd]ブロックの項目のField定義
	// [SchedLink]ブロック関連のField定義
	public MCPanel SchedLinkPanel = null;
	public MCTitledBorder SchedLinkTitledBorder = null;
	// [SchedLink]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * SAV,Save;FIX,Firm;CANSAV,Return to save;CANFIX,Return unfirm;MOD,Modify;DEL,Cancel;REF,View;IMP,File input SAV,保存する;FIX,確定する;CANSAV,保存に戻す;CANFIX,未確定に戻す;MOD,訂正する;DEL,取り消す;REF,参照する;IMP,ファイル入力.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_SAV = null;
	public MCRadioButton Cnd_ope_FIX = null;
	public MCRadioButton Cnd_ope_CANSAV = null;
	public MCRadioButton Cnd_ope_CANFIX = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_IMP = null;
	/**
	 * Unfirm 未確定.<p>
	 *
	 */
	public MCCheckBox Cnd_opn_flg = null;
	/**
	 * Save 保存.<p>
	 *
	 */
	public MCCheckBox Cnd_sav_flg = null;
	/**
	 * Firm 確定.<p>
	 *
	 */
	public MCCheckBox Cnd_fix_flg = null;
	/**
	 * Partially ordered/placed PO 一部指図・発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_part_inst_flg = null;
	/**
	 * Ordered/Placed PO 指図・発注済.<p>
	 *
	 */
	public MCCheckBox Cnd_inst_flg = null;
	/**
	 * Completed 完了.<p>
	 *
	 */
	public MCCheckBox Cnd_cmpl_flg = null;
	/**
	 * Mfg. 製造.<p>
	 *
	 */
	public MCCheckBox Cnd_mfg_flg = null;
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public MCCheckBox Cnd_purc_flg = null;
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public MCCheckBox Cnd_outsrc_flg = null;
	/**
	 * Transport 移送.<p>
	 *
	 */
	public MCCheckBox Cnd_xfr_flg = null;
	/**
	 * Transport between WG ワーキンググループ間移送.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_xfr_flg = null;
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCCheckBox Cnd_true_not_fix_flg = null;
	/**
	 * Allow procurement 手配許可.<p>
	 *
	 */
	public MCCheckBox Cnd_false_not_fix_flg = null;
	/**
	 * Order to be imported オーダ受信対象.<p>
	 *
	 */
	public MCCheckBox Cnd_ord_rcv_tgt_flg = null;
	/**
	 * Order not to be imported オーダ受信対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ord_rcv_tgt_flg = null;
	/**
	 * Order to be exported オーダ送信対象.<p>
	 *
	 */
	public MCCheckBox Cnd_ord_snd_tgt_flg = null;
	/**
	 * Order not to be exported オーダ送信対象外.<p>
	 *
	 */
	public MCCheckBox Cnd_not_ord_snd_tgt_flg = null;
	/**
	 * Before frozen 凍結前.<p>
	 *
	 */
	public MCCheckBox Cnd_before_frozen_flg = null;
	/**
	 * Frozen 凍結.<p>
	 *
	 */
	public MCCheckBox Cnd_frozen_flg = null;
	public MCLabel Cnd_mfg_st_schd_dt_fr_Label = null;
	/**
	 * Scheduled mfg. start date FROM 製造着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_st_schd_dt_fr = null;
	public MCLabel Cnd_mfg_st_schd_dt_to_Label = null;
	/**
	 * Scheduled mfg. start date TO 製造着手予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_st_schd_dt_to = null;
	public MCLabel Cnd_mfg_end_schd_dt_fr_Label = null;
	/**
	 * Scheduled mfg. end date FROM 製造終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_end_schd_dt_fr = null;
	public MCLabel Cnd_mfg_end_schd_dt_to_Label = null;
	/**
	 * Scheduled mfg. end date TO 製造終了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mfg_end_schd_dt_to = null;
	public MCLabel Cnd_po_schd_dt_fr_Label = null;
	/**
	 * Scheduled PO date FROM 発注予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_po_schd_dt_fr = null;
	public MCLabel Cnd_po_schd_dt_to_Label = null;
	/**
	 * Scheduled PO date TO 発注予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_po_schd_dt_to = null;
	public MCLabel Cnd_gi_schd_dt_fr_Label = null;
	/**
	 * Scheduled GI date FROM 出庫予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_gi_schd_dt_fr = null;
	public MCLabel Cnd_gi_schd_dt_to_Label = null;
	/**
	 * Scheduled GI date TO 出庫予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_gi_schd_dt_to = null;
	public MCLabel Cnd_avl_schd_dt_fr_Label = null;
	/**
	 * Available FROM 使用可能予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_avl_schd_dt_fr = null;
	public MCLabel Cnd_avl_schd_dt_to_Label = null;
	/**
	 * Available TO 使用可能予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_avl_schd_dt_to = null;
	public MCLabel Cnd_strg_schd_dt_fr_Label = null;
	/**
	 * Scheduled storage completion date FROM 格納完了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_strg_schd_dt_fr = null;
	public MCLabel Cnd_strg_schd_dt_to_Label = null;
	/**
	 * Scheduled storage completion date TO 格納完了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_strg_schd_dt_to = null;
	public MCLabel Cnd_accpt_schd_dt_fr_Label = null;
	/**
	 * Scheduled acceptance date FROM 検収予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_fr = null;
	public MCLabel Cnd_accpt_schd_dt_to_Label = null;
	/**
	 * Scheduled acceptance date TO 検収予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_accpt_schd_dt_to = null;
	public MCLabel Cnd_insp_st_schd_dt_fr_Label = null;
	/**
	 * Scheduled inspection start date FROM 検査着手予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_insp_st_schd_dt_fr = null;
	public MCLabel Cnd_insp_st_schd_dt_to_Label = null;
	/**
	 * Scheduled inspection start date TO 検査着手予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_insp_st_schd_dt_to = null;
	public MCLabel Cnd_insp_end_schd_dt_fr_Label = null;
	/**
	 * Scheduled inspection end date FROM 検査終了予定日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_insp_end_schd_dt_fr = null;
	public MCLabel Cnd_insp_end_schd_dt_to_Label = null;
	/**
	 * Scheduled inspection end date TO 検査終了予定日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_insp_end_schd_dt_to = null;
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
	public MCLabel Cnd_rqst_wg_cd_Label = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_wg_nm = null;
	public MCLabel Cnd_strg_alloc_grp_cd_Label = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_alloc_grp_nm = null;
	public MCLabel Cnd_mfg_loc_grp_cd_Label = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_grp_nm = null;
	public MCLabel Cnd_strg_loc_cd_Label = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_nm = null;
	public MCLabel Cnd_strg_site_cd_Label = null;
	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_site_cd = null;
	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_strg_site_nm = null;
	public MCLabel Cnd_strg_lg_grp_cd_Label = null;
	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_lg_grp_cd = null;
	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_lg_grp_nm = null;
	public MCLabel Cnd_strg_loc_grp_cd_Label = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_strg_loc_grp_nm = null;
	public MCLabel Cnd_mfg_loc_cd_Label = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_loc_nm = null;
	public MCLabel Cnd_mfg_site_cd_Label = null;
	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_mfg_site_cd = null;
	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_mfg_site_nm = null;
	public MCLabel Cnd_rqst_loc_cd_Label = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_nm = null;
	public MCLabel Cnd_rqst_site_cd_Label = null;
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_site_cd = null;
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_site_nm = null;
	public MCLabel Cnd_rqst_loc_grp_cd_Label = null;
	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rqst_loc_grp_cd = null;
	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public MCTextField Cnd_rqst_loc_grp_nm = null;
	public MCLabel Cnd_sppl_cd_Label = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCTextField Cnd_sppl_nm = null;
	public MCLabel Cnd_maker_cd_Label = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCTextField Cnd_maker_nm = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	public MCLabel Cnd_ord_gnrt_typ_Label = null;
	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ord_gnrt_typ = null;
	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public MCTextField Cnd_ord_gnrt_typ_nm = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H Cnd_ver_no_p_PPanel;
	public MCTextComboBox Cnd_ver_no;	// [Cnd]の[ver_no_p.ver_no]を[Cnd_ver_no]としてエイリアス定義。
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_itm_ord_no_Label = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_itm_ord_no = null;
	public MCLabel Cnd_rqmt_no_Label = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_rqmt_no = null;
	public MCLabel Cnd_sim_mrp_no_Label = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_no = null;
	public MCLabel Cnd_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_intr_rmrks = null;
	public MCLabel Cnd_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sub_char1 = null;
	public MCLabel Cnd_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sub_char2 = null;
	public MCLabel Cnd_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sub_char3 = null;
	public MCLabel Cnd_ext_sys_cd_Label = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_cd = null;
	public MCLabel Cnd_ext_sys_nm_Label = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCTextField Cnd_ext_sys_nm = null;
	public MCLabel Cnd_ext_itm_ord_no_Label = null;
	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ext_itm_ord_no = null;
	public mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S Cnd_itm_grp_p_PPanel;
	public MCCheckBox Cnd_itm_grp_flg1;	// [Cnd]の[itm_grp_p.itm_grp_flg1]を[Cnd_itm_grp_flg1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd1;	// [Cnd]の[itm_grp_p.itm_grp_cd1]を[Cnd_itm_grp_cd1]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm1;	// [Cnd]の[itm_grp_p.itm_grp_nm1]を[Cnd_itm_grp_nm1]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg2;	// [Cnd]の[itm_grp_p.itm_grp_flg2]を[Cnd_itm_grp_flg2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd2;	// [Cnd]の[itm_grp_p.itm_grp_cd2]を[Cnd_itm_grp_cd2]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm2;	// [Cnd]の[itm_grp_p.itm_grp_nm2]を[Cnd_itm_grp_nm2]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg3;	// [Cnd]の[itm_grp_p.itm_grp_flg3]を[Cnd_itm_grp_flg3]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd3;	// [Cnd]の[itm_grp_p.itm_grp_cd3]を[Cnd_itm_grp_cd3]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm3;	// [Cnd]の[itm_grp_p.itm_grp_nm3]を[Cnd_itm_grp_nm3]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg4;	// [Cnd]の[itm_grp_p.itm_grp_flg4]を[Cnd_itm_grp_flg4]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd4;	// [Cnd]の[itm_grp_p.itm_grp_cd4]を[Cnd_itm_grp_cd4]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm4;	// [Cnd]の[itm_grp_p.itm_grp_nm4]を[Cnd_itm_grp_nm4]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg5;	// [Cnd]の[itm_grp_p.itm_grp_flg5]を[Cnd_itm_grp_flg5]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd5;	// [Cnd]の[itm_grp_p.itm_grp_cd5]を[Cnd_itm_grp_cd5]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm5;	// [Cnd]の[itm_grp_p.itm_grp_nm5]を[Cnd_itm_grp_nm5]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg6;	// [Cnd]の[itm_grp_p.itm_grp_flg6]を[Cnd_itm_grp_flg6]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd6;	// [Cnd]の[itm_grp_p.itm_grp_cd6]を[Cnd_itm_grp_cd6]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm6;	// [Cnd]の[itm_grp_p.itm_grp_nm6]を[Cnd_itm_grp_nm6]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg7;	// [Cnd]の[itm_grp_p.itm_grp_flg7]を[Cnd_itm_grp_flg7]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd7;	// [Cnd]の[itm_grp_p.itm_grp_cd7]を[Cnd_itm_grp_cd7]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm7;	// [Cnd]の[itm_grp_p.itm_grp_nm7]を[Cnd_itm_grp_nm7]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg8;	// [Cnd]の[itm_grp_p.itm_grp_flg8]を[Cnd_itm_grp_flg8]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd8;	// [Cnd]の[itm_grp_p.itm_grp_cd8]を[Cnd_itm_grp_cd8]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm8;	// [Cnd]の[itm_grp_p.itm_grp_nm8]を[Cnd_itm_grp_nm8]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg9;	// [Cnd]の[itm_grp_p.itm_grp_flg9]を[Cnd_itm_grp_flg9]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd9;	// [Cnd]の[itm_grp_p.itm_grp_cd9]を[Cnd_itm_grp_cd9]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm9;	// [Cnd]の[itm_grp_p.itm_grp_nm9]を[Cnd_itm_grp_nm9]としてエイリアス定義。
	public MCCheckBox Cnd_itm_grp_flg10;	// [Cnd]の[itm_grp_p.itm_grp_flg10]を[Cnd_itm_grp_flg10]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_grp_cd10;	// [Cnd]の[itm_grp_p.itm_grp_cd10]を[Cnd_itm_grp_cd10]としてエイリアス定義。
	public MCTextField Cnd_itm_grp_nm10;	// [Cnd]の[itm_grp_p.itm_grp_nm10]を[Cnd_itm_grp_nm10]としてエイリアス定義。
	// [Cnd2]ブロック関連のField定義
	public MCPanel Cnd2Panel = null;
	// [Cnd2]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [RPnl]ブロック関連のField定義
	public MCPanel RPnlPanel = null;
	// [RPnl]ブロックの項目のField定義
	/**
	 * Download ダウンロードする.<p>
	 *
	 */
	public MCButton RPnl_dwnld = null;
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0050.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_no = null;
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ = null;
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_typ_nm = null;
	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ = null;
	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_ord_sts_typ_nm = null;
	/**
	 * Operation saved 工程保存.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_sav_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D Rslt_ver_no_p_PPanel;
	public MCColumnConfig columnRslt_ver_no;// [Rslt]の[ver_no_p.ver_no]を[columnRslt_ver_no]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_inst_qty_p_PPanel;
	public MCColumnConfig columnRslt_inst_qty;// [Rslt]の[inst_qty_p.qty]を[columnRslt_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_yield_schd_qty_p_PPanel;
	public MCColumnConfig columnRslt_yield_schd_qty;// [Rslt]の[yield_schd_qty_p.qty]を[columnRslt_yield_schd_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dec_place = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rnd_typ = null;
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_oper_ptn = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnRslt_bom_ptn = null;
	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCColumnConfig columnRslt_nmr_qty = null;
	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCColumnConfig columnRslt_dnm_qty = null;
	/**
	 * Constant yield qty. 固定歩留量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fxd_yield_qty = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_inst_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_inst_qty;// [Rslt]の[inst_cont_qty_p.cont_qty]を[columnRslt_cont_fctr_inst_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_yield_cont_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_schd_yield;// [Rslt]の[yield_cont_qty_p.cont_qty]を[columnRslt_cont_fctr_schd_yield]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D Rslt_cont_unit_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_unit_cd;// [Rslt]の[cont_unit_p.cont_fctr_unit_cd]を[columnRslt_cont_fctr_unit_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_cont_fctr_unit_nm;// [Rslt]の[cont_unit_p.cont_fctr_unit_nm]を[columnRslt_cont_fctr_unit_nm]としてエイリアス定義。
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_master_dt = null;
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_po_schd_dt = null;
	/**
	 * Purchase LT 購買ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_purc_lt = null;
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_st_schd_dt = null;
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_lt = null;
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_end_schd_dt = null;
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gi_schd_dt = null;
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_xfr_lt = null;
	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_schd_dt = null;
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accpt_insp_lt = null;
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_accpt_schd_dt = null;
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_flg = null;
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_st_schd_dt = null;
	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_lt = null;
	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_offst = null;
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_end_schd_dt = null;
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_avl_schd_dt = null;
	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_site_cd = null;
	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_site_nm = null;
	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_lg_grp_cd = null;
	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_lg_grp_nm = null;
	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_alloc_grp_cd = null;
	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_alloc_grp_nm = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_grp_nm = null;
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_strg_loc_nm = null;
	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_site_cd = null;
	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_site_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_grp_nm = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_maker_nm = null;
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_site_cd = null;
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_site_nm = null;
	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_grp_cd = null;
	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_grp_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_loc_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqst_wg_nm = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_rqmt_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_gnrt_typ = null;
	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_gnrt_typ_nm = null;
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_io_schd_pr_no = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sim_mrp_no = null;
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
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public MCColumnConfig columnRslt_not_fix_flg = null;
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_inst_po_cnt_rmrks = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sub_char3 = null;
	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_rcv_flg = null;
	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ord_snd_flg = null;
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_cd = null;
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_sys_nm = null;
	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ext_itm_ord_no = null;
	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_for_scheduler_frozen_flg = null;
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public MCColumnConfig columnRslt_scheduler_frozen_flg = null;
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_typ_d_nm = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D Rslt_rts_msg_p_PPanel;
	public MCColumnConfig columnRslt_rtn_sts_typ;// [Rslt]の[rts_msg_p.rtn_sts_typ]を[columnRslt_rtn_sts_typ]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D Rslt_itm_grp_p_PPanel;
	public MCColumnConfig columnRslt_itm_grp_cd1;// [Rslt]の[itm_grp_p.itm_grp_cd1]を[columnRslt_itm_grp_cd1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm1;// [Rslt]の[itm_grp_p.itm_grp_nm1]を[columnRslt_itm_grp_nm1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd2;// [Rslt]の[itm_grp_p.itm_grp_cd2]を[columnRslt_itm_grp_cd2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm2;// [Rslt]の[itm_grp_p.itm_grp_nm2]を[columnRslt_itm_grp_nm2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd3;// [Rslt]の[itm_grp_p.itm_grp_cd3]を[columnRslt_itm_grp_cd3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm3;// [Rslt]の[itm_grp_p.itm_grp_nm3]を[columnRslt_itm_grp_nm3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd4;// [Rslt]の[itm_grp_p.itm_grp_cd4]を[columnRslt_itm_grp_cd4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm4;// [Rslt]の[itm_grp_p.itm_grp_nm4]を[columnRslt_itm_grp_nm4]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd5;// [Rslt]の[itm_grp_p.itm_grp_cd5]を[columnRslt_itm_grp_cd5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm5;// [Rslt]の[itm_grp_p.itm_grp_nm5]を[columnRslt_itm_grp_nm5]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd6;// [Rslt]の[itm_grp_p.itm_grp_cd6]を[columnRslt_itm_grp_cd6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm6;// [Rslt]の[itm_grp_p.itm_grp_nm6]を[columnRslt_itm_grp_nm6]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd7;// [Rslt]の[itm_grp_p.itm_grp_cd7]を[columnRslt_itm_grp_cd7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm7;// [Rslt]の[itm_grp_p.itm_grp_nm7]を[columnRslt_itm_grp_nm7]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd8;// [Rslt]の[itm_grp_p.itm_grp_cd8]を[columnRslt_itm_grp_cd8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm8;// [Rslt]の[itm_grp_p.itm_grp_nm8]を[columnRslt_itm_grp_nm8]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd9;// [Rslt]の[itm_grp_p.itm_grp_cd9]を[columnRslt_itm_grp_cd9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm9;// [Rslt]の[itm_grp_p.itm_grp_nm9]を[columnRslt_itm_grp_nm9]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_cd10;// [Rslt]の[itm_grp_p.itm_grp_cd10]を[columnRslt_itm_grp_cd10]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_grp_nm10;// [Rslt]の[itm_grp_p.itm_grp_nm10]を[columnRslt_itm_grp_nm10]としてエイリアス定義。
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
	 * Counter カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_itm_order_upd_cntr = null;
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
	/**
	 * To enter 登録対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_tgt_flg = null;
	/**
	 * To update 更新対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_modify_tgt_flg = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Manual order entry オーダ登録.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0040 = null;
	/**
	 * Item order progress 品目オーダ進捗一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0080 = null;
	/**
	 * Operation order progress 工程オーダ進捗一覧照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0090 = null;
	/**
	 * Order explosion オーダ展開情報照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0070 = null;
	/**
	 * Order implosion オーダ逆展開情報照会.<p>
	 *
	 */
	public MCButton Btn_open_MSBCP0060 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Btn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Btn_deselect_all = null;
	/**
	 * Asynchronous 非同期.<p>
	 *
	 */
	public MCCheckBox Btn_async_flg = null;
	/**
	 * Save 保存する.<p>
	 *
	 */
	public MCButton Btn_upd = null;
	/**
	 * Firm 確定する.<p>
	 *
	 */
	public MCButton Btn_upd2 = null;
	/**
	 * Revert to saved 保存へ取り消す.<p>
	 *
	 */
	public MCButton Btn_upd3 = null;
	/**
	 * Revert to unfirm 未確定へ取り消す.<p>
	 *
	 */
	public MCButton Btn_upd4 = null;
	/**
	 * Modify 訂正する.<p>
	 *
	 */
	public MCButton Btn_upd5 = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_ins01 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_SAV]モードを表す定数 */
	public static final String SRCH_SAV = "SRCH_SAV";
	/** [SRCH_FIX]モードを表す定数 */
	public static final String SRCH_FIX = "SRCH_FIX";
	/** [SRCH_CANSAV]モードを表す定数 */
	public static final String SRCH_CANSAV = "SRCH_CANSAV";
	/** [SRCH_CANFIX]モードを表す定数 */
	public static final String SRCH_CANFIX = "SRCH_CANFIX";
	/** [SRCH_MOD]モードを表す定数 */
	public static final String SRCH_MOD = "SRCH_MOD";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [SRCH_REF]モードを表す定数 */
	public static final String SRCH_REF = "SRCH_REF";
	/** [IMP_FILE]モードを表す定数 */
	public static final String IMP_FILE = "IMP_FILE";
	/** [UPD_SAV]モードを表す定数 */
	public static final String UPD_SAV = "UPD_SAV";
	/** [UPD_FIX]モードを表す定数 */
	public static final String UPD_FIX = "UPD_FIX";
	/** [UPD_CANSAV]モードを表す定数 */
	public static final String UPD_CANSAV = "UPD_CANSAV";
	/** [UPD_CANFIX]モードを表す定数 */
	public static final String UPD_CANFIX = "UPD_CANFIX";
	/** [UPD_MOD]モードを表す定数 */
	public static final String UPD_MOD = "UPD_MOD";
	/** [UPD_DEL]モードを表す定数 */
	public static final String UPD_DEL = "UPD_DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [INS]モードを表す定数 */
	public static final String INS = "INS";
	/** [FIX_I]モードを表す定数 */
	public static final String FIX_I = "FIX_I";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_SAV, SRCH_FIX, SRCH_CANSAV, SRCH_CANFIX, SRCH_MOD, SRCH_DEL, SRCH_REF, IMP_FILE, UPD_SAV, UPD_FIX, UPD_CANSAV, UPD_CANFIX, UPD_MOD, UPD_DEL, REF, INS, FIX_I};
	
	/** [MS_MSBCL0050_Srch01]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Srch01Caller createMS_MSBCL0050_Srch01() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Srch01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Srch01Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Srch01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Srch01Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Srch01]の呼び出し */
	protected void callMS_MSBCL0050_Srch01() {
		MCCaller caller = createMS_MSBCL0050_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0050_Upd01]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd01Caller createMS_MSBCL0050_Upd01() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd01Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Upd01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd01Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Upd01]の呼び出し */
	protected void callMS_MSBCL0050_Upd01() {
		MCCaller caller = createMS_MSBCL0050_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0050_Upd02]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd02Caller createMS_MSBCL0050_Upd02() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd02Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd02Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Upd02Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd02Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Upd02]の呼び出し */
	protected void callMS_MSBCL0050_Upd02() {
		MCCaller caller = createMS_MSBCL0050_Upd02();
		caller.exec();
	}
	/** [MS_MSBCL0050_Upd03]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd03Caller createMS_MSBCL0050_Upd03() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd03Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd03Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Upd03Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd03Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Upd03Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Upd03]の呼び出し */
	protected void callMS_MSBCL0050_Upd03() {
		MCCaller caller = createMS_MSBCL0050_Upd03();
		caller.exec();
	}
	/** [MS_MSBCL0050_Upd04]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd04Caller createMS_MSBCL0050_Upd04() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd04Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd04Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Upd04Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd04Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Upd04Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Upd04]の呼び出し */
	protected void callMS_MSBCL0050_Upd04() {
		MCCaller caller = createMS_MSBCL0050_Upd04();
		caller.exec();
	}
	/** [MS_MSBCL0050_Upd05]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd05Caller createMS_MSBCL0050_Upd05() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Upd05Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd05Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Upd05Caller<MSBCP_OrdSrch, MS_MSBCL0050_Upd05Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Upd05Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Upd05]の呼び出し */
	protected void callMS_MSBCL0050_Upd05() {
		MCCaller caller = createMS_MSBCL0050_Upd05();
		caller.exec();
	}
	/** [MS_MSBCL0050_Del01]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Del01Caller createMS_MSBCL0050_Del01() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Del01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Del01Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Del01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Del01Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Del01]の呼び出し */
	protected void callMS_MSBCL0050_Del01() {
		MCCaller caller = createMS_MSBCL0050_Del01();
		caller.exec();
	}
	/** [MS_MSBCL0050_Imp01]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Imp01Caller createMS_MSBCL0050_Imp01() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Imp01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Imp01Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Imp01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Imp01Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Imp01]の呼び出し */
	protected void callMS_MSBCL0050_Imp01() {
		MCCaller caller = createMS_MSBCL0050_Imp01();
		caller.exec();
	}
	/** [MS_MSBCL0050_Ins01]のCallerの作成 */
	protected MSBCP_OrdSrch_MC.MS_MSBCL0050_Ins01Caller createMS_MSBCL0050_Ins01() {
		MSBCP_OrdSrch_MC.MS_MSBCL0050_Ins01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Ins01Bridge>
		caller = ((MSBCP_OrdSrch_MC)this).new MS_MSBCL0050_Ins01Caller<MSBCP_OrdSrch, MS_MSBCL0050_Ins01Bridge>(
					(MSBCP_OrdSrch)this, new MS_MSBCL0050_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBCL0050_Ins01]の呼び出し */
	protected void callMS_MSBCL0050_Ins01() {
		MCCaller caller = createMS_MSBCL0050_Ins01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0050.CndR aCndR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0050.RsltR> aRsltL;
	/** [Btn]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0050.BtnR aBtnR;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0050.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0050.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0050.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0050.CndR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBC.MSBCP0050.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0050.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBC.MSBCP0050.RsltR createRsltR() {
		return mcframe.clientMSBC.MSBCP0050.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0050.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class);
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
	 * 項目コピーによってaBtnRを設定します。
	 *
	 * aBtnRのインスタンスは変更されません。
	 *
	 * @param row BtnR
	 */
	public void setBtnR(mcframe.clientMSBC.MSBCP0050.BtnR row) {
		if (row != null) {
			MCRow.copyall(getBtnR(), row);
		}
	}

	/**
	 * [Btn]ブロックのコンテナaBtnRを返します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBC.MSBCP0050.BtnR getBtnR() {
		return aBtnR;
	}

	/**
	 * aBtnRを作成します。
	 *
	 * @return BtnR
	 */
	public mcframe.clientMSBC.MSBCP0050.BtnR createBtnR() {
		return mcframe.clientMSBC.MSBCP0050.BtnR.create();
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
		if(aCnt == getRsltL()) return "Rslt";
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
		if(bId.equals("Rslt")) return getRsltL();
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
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(StsPanel);
		ret.add(OrdTypPanel);
		ret.add(FixFlgPanel);
		ret.add(OrdRcvPanel);
		ret.add(OrdSndPanel);
		ret.add(SchedLinkPanel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_OrdSrch_MC_A() {
		aCndR = createCndR();
		aRsltL = createRsltL();
		aBtnR = createBtnR();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_OrdSrch_MC_A(String name) {
		aCndR = createCndR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
		aBtnR = createBtnR();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_OrdSrch_MC.jbCreateScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateTop((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateFold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateTab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateTab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateSts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateOrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateFixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateOrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateOrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateSchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateCnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateCnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateCtrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateRPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateRslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateBtn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbCreateEastBtn((MSBCP_OrdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_OrdSrch p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_OrdSrch p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_OrdSrch p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBCP_OrdSrch p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBCP_OrdSrch p) {
	}

	/**
	 * [Sts]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSts(MSBCP_OrdSrch p) {
	}

	/**
	 * [OrdTyp]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrdTyp(MSBCP_OrdSrch p) {
	}

	/**
	 * [FixFlg]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFixFlg(MSBCP_OrdSrch p) {
	}

	/**
	 * [OrdRcv]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrdRcv(MSBCP_OrdSrch p) {
	}

	/**
	 * [OrdSnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateOrdSnd(MSBCP_OrdSrch p) {
	}

	/**
	 * [SchedLink]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSchedLink(MSBCP_OrdSrch p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_OrdSrch p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_d_cd = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_cd;
		p.Cnd_itm_typ_d_cd.addAliasName("Cnd.itm_typ_d_cd", p);
		p.Cnd_itm_typ_d_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_d_nm;
		p.Cnd_itm_typ_d_nm.addAliasName("Cnd.itm_typ_d_nm", p);
		p.Cnd_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm_p());
		p.Cnd_itm_p_PPanel.setName("Cnd.itm_p");
		p.Cnd_itm_cd = p.Cnd_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
		p.Cnd_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.create(p.getCndR().ver_no_p());
		p.Cnd_ver_no_p_PPanel.setName("Cnd.ver_no_p");
		p.Cnd_ver_no = p.Cnd_ver_no_p_PPanel.VerNo_ver_no;
		p.Cnd_ver_no.addAliasName("Cnd.ver_no", p);
		p.Cnd_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.create(p.getCndR().sno_wrk_no_p());
		p.Cnd_sno_wrk_no_p_PPanel.setName("Cnd.sno_wrk_no_p");
		p.Cnd_sno1 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1;
		p.Cnd_sno1.addAliasName("Cnd.sno1", p);
		p.Cnd_sno2 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2;
		p.Cnd_sno2.addAliasName("Cnd.sno2", p);
		p.Cnd_sno3 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3;
		p.Cnd_sno3.addAliasName("Cnd.sno3", p);
		p.Cnd_sno4 = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4;
		p.Cnd_sno4.addAliasName("Cnd.sno4", p);
		p.Cnd_wrk_no = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no;
		p.Cnd_wrk_no.addAliasName("Cnd.wrk_no", p);
		p.Cnd_wrk_nm = p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm;
		p.Cnd_wrk_nm.addAliasName("Cnd.wrk_nm", p);
		p.Cnd_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.create(p.getCndR().itm_grp_p());
		p.Cnd_itm_grp_p_PPanel.setName("Cnd.itm_grp_p");
		p.Cnd_itm_grp_flg1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg1;
		p.Cnd_itm_grp_flg1.addAliasName("Cnd.itm_grp_flg1", p);
		p.Cnd_itm_grp_cd1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd1;
		p.Cnd_itm_grp_cd1.addAliasName("Cnd.itm_grp_cd1", p);
		p.Cnd_itm_grp_nm1 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm1;
		p.Cnd_itm_grp_nm1.addAliasName("Cnd.itm_grp_nm1", p);
		p.Cnd_itm_grp_flg2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg2;
		p.Cnd_itm_grp_flg2.addAliasName("Cnd.itm_grp_flg2", p);
		p.Cnd_itm_grp_cd2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd2;
		p.Cnd_itm_grp_cd2.addAliasName("Cnd.itm_grp_cd2", p);
		p.Cnd_itm_grp_nm2 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm2;
		p.Cnd_itm_grp_nm2.addAliasName("Cnd.itm_grp_nm2", p);
		p.Cnd_itm_grp_flg3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg3;
		p.Cnd_itm_grp_flg3.addAliasName("Cnd.itm_grp_flg3", p);
		p.Cnd_itm_grp_cd3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd3;
		p.Cnd_itm_grp_cd3.addAliasName("Cnd.itm_grp_cd3", p);
		p.Cnd_itm_grp_nm3 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm3;
		p.Cnd_itm_grp_nm3.addAliasName("Cnd.itm_grp_nm3", p);
		p.Cnd_itm_grp_flg4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg4;
		p.Cnd_itm_grp_flg4.addAliasName("Cnd.itm_grp_flg4", p);
		p.Cnd_itm_grp_cd4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd4;
		p.Cnd_itm_grp_cd4.addAliasName("Cnd.itm_grp_cd4", p);
		p.Cnd_itm_grp_nm4 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm4;
		p.Cnd_itm_grp_nm4.addAliasName("Cnd.itm_grp_nm4", p);
		p.Cnd_itm_grp_flg5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg5;
		p.Cnd_itm_grp_flg5.addAliasName("Cnd.itm_grp_flg5", p);
		p.Cnd_itm_grp_cd5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd5;
		p.Cnd_itm_grp_cd5.addAliasName("Cnd.itm_grp_cd5", p);
		p.Cnd_itm_grp_nm5 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm5;
		p.Cnd_itm_grp_nm5.addAliasName("Cnd.itm_grp_nm5", p);
		p.Cnd_itm_grp_flg6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg6;
		p.Cnd_itm_grp_flg6.addAliasName("Cnd.itm_grp_flg6", p);
		p.Cnd_itm_grp_cd6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd6;
		p.Cnd_itm_grp_cd6.addAliasName("Cnd.itm_grp_cd6", p);
		p.Cnd_itm_grp_nm6 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm6;
		p.Cnd_itm_grp_nm6.addAliasName("Cnd.itm_grp_nm6", p);
		p.Cnd_itm_grp_flg7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg7;
		p.Cnd_itm_grp_flg7.addAliasName("Cnd.itm_grp_flg7", p);
		p.Cnd_itm_grp_cd7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd7;
		p.Cnd_itm_grp_cd7.addAliasName("Cnd.itm_grp_cd7", p);
		p.Cnd_itm_grp_nm7 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm7;
		p.Cnd_itm_grp_nm7.addAliasName("Cnd.itm_grp_nm7", p);
		p.Cnd_itm_grp_flg8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg8;
		p.Cnd_itm_grp_flg8.addAliasName("Cnd.itm_grp_flg8", p);
		p.Cnd_itm_grp_cd8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd8;
		p.Cnd_itm_grp_cd8.addAliasName("Cnd.itm_grp_cd8", p);
		p.Cnd_itm_grp_nm8 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm8;
		p.Cnd_itm_grp_nm8.addAliasName("Cnd.itm_grp_nm8", p);
		p.Cnd_itm_grp_flg9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg9;
		p.Cnd_itm_grp_flg9.addAliasName("Cnd.itm_grp_flg9", p);
		p.Cnd_itm_grp_cd9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd9;
		p.Cnd_itm_grp_cd9.addAliasName("Cnd.itm_grp_cd9", p);
		p.Cnd_itm_grp_nm9 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm9;
		p.Cnd_itm_grp_nm9.addAliasName("Cnd.itm_grp_nm9", p);
		p.Cnd_itm_grp_flg10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_flg10;
		p.Cnd_itm_grp_flg10.addAliasName("Cnd.itm_grp_flg10", p);
		p.Cnd_itm_grp_cd10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_cd10;
		p.Cnd_itm_grp_cd10.addAliasName("Cnd.itm_grp_cd10", p);
		p.Cnd_itm_grp_nm10 = p.Cnd_itm_grp_p_PPanel.ItmGrp_itm_grp_nm10;
		p.Cnd_itm_grp_nm10.addAliasName("Cnd.itm_grp_nm10", p);
	}

	/**
	 * [Cnd2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd2(MSBCP_OrdSrch p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_OrdSrch p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBCP_OrdSrch p) {
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBCP_OrdSrch p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$itm_p);
		p.Rslt_itm_p_PPanel.setName("Rslt.itm_p");
		p.columnRslt_itm_cd = p.Rslt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRslt_itm_cd.addAliasName("Rslt.itm_cd", p);
		p.columnRslt_itm_sub1 = p.Rslt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRslt_itm_sub1.addAliasName("Rslt.itm_sub1", p);
		p.columnRslt_itm_sub2 = p.Rslt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRslt_itm_sub2.addAliasName("Rslt.itm_sub2", p);
		p.columnRslt_itm_sub3 = p.Rslt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRslt_itm_sub3.addAliasName("Rslt.itm_sub3", p);
		p.columnRslt_itm_nm = p.Rslt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRslt_itm_nm.addAliasName("Rslt.itm_nm", p);
		p.Rslt_ver_no_p_PPanel = mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$ver_no_p);
		p.Rslt_ver_no_p_PPanel.setName("Rslt.ver_no_p");
		p.columnRslt_ver_no = p.Rslt_ver_no_p_PPanel.columnVerNo_ver_no;
		p.columnRslt_ver_no.addAliasName("Rslt.ver_no", p);
		p.Rslt_inst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$inst_qty_p);
		p.Rslt_inst_qty_p_PPanel.setName("Rslt.inst_qty_p");
		p.columnRslt_inst_qty = p.Rslt_inst_qty_p_PPanel.columnQty_qty;
		p.columnRslt_inst_qty.addAliasName("Rslt.inst_qty", p);
		p.Rslt_yield_schd_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$yield_schd_qty_p);
		p.Rslt_yield_schd_qty_p_PPanel.setName("Rslt.yield_schd_qty_p");
		p.columnRslt_yield_schd_qty = p.Rslt_yield_schd_qty_p_PPanel.columnQty_qty;
		p.columnRslt_yield_schd_qty.addAliasName("Rslt.yield_schd_qty", p);
		p.Rslt_std_cont_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$std_cont_p);
		p.Rslt_std_cont_p_PPanel.setName("Rslt.std_cont_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_inst_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$inst_cont_qty_p);
		p.Rslt_inst_cont_qty_p_PPanel.setName("Rslt.inst_cont_qty_p");
		p.columnRslt_cont_fctr_inst_qty = p.Rslt_inst_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_fctr_inst_qty.addAliasName("Rslt.cont_fctr_inst_qty", p);
		p.Rslt_yield_cont_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$yield_cont_qty_p);
		p.Rslt_yield_cont_qty_p_PPanel.setName("Rslt.yield_cont_qty_p");
		p.columnRslt_cont_fctr_schd_yield = p.Rslt_yield_cont_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_fctr_schd_yield.addAliasName("Rslt.cont_fctr_schd_yield", p);
		p.Rslt_cont_unit_p_PPanel = mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$cont_unit_p);
		p.Rslt_cont_unit_p_PPanel.setName("Rslt.cont_unit_p");
		p.columnRslt_cont_fctr_unit_cd = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_cd;
		p.columnRslt_cont_fctr_unit_cd.addAliasName("Rslt.cont_fctr_unit_cd", p);
		p.columnRslt_cont_fctr_unit_nm = p.Rslt_cont_unit_p_PPanel.columnContFctrUnit_cont_fctr_unit_nm;
		p.columnRslt_cont_fctr_unit_nm.addAliasName("Rslt.cont_fctr_unit_nm", p);
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$sno_wrk_no_p);
		p.Rslt_sno_wrk_no_p_PPanel.setName("Rslt.sno_wrk_no_p");
		p.columnRslt_sno1 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRslt_sno1.addAliasName("Rslt.sno1", p);
		p.columnRslt_sno2 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRslt_sno2.addAliasName("Rslt.sno2", p);
		p.columnRslt_sno3 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRslt_sno3.addAliasName("Rslt.sno3", p);
		p.columnRslt_sno4 = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRslt_sno4.addAliasName("Rslt.sno4", p);
		p.columnRslt_wrk_no = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRslt_wrk_no.addAliasName("Rslt.wrk_no", p);
		p.columnRslt_wrk_nm = p.Rslt_sno_wrk_no_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRslt_wrk_nm.addAliasName("Rslt.wrk_nm", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBC.MSBCP0050.RsltR.$itm_grp_p);
		p.Rslt_itm_grp_p_PPanel.setName("Rslt.itm_grp_p");
		p.columnRslt_itm_grp_cd1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd1;
		p.columnRslt_itm_grp_cd1.addAliasName("Rslt.itm_grp_cd1", p);
		p.columnRslt_itm_grp_nm1 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm1;
		p.columnRslt_itm_grp_nm1.addAliasName("Rslt.itm_grp_nm1", p);
		p.columnRslt_itm_grp_cd2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd2;
		p.columnRslt_itm_grp_cd2.addAliasName("Rslt.itm_grp_cd2", p);
		p.columnRslt_itm_grp_nm2 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm2;
		p.columnRslt_itm_grp_nm2.addAliasName("Rslt.itm_grp_nm2", p);
		p.columnRslt_itm_grp_cd3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd3;
		p.columnRslt_itm_grp_cd3.addAliasName("Rslt.itm_grp_cd3", p);
		p.columnRslt_itm_grp_nm3 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm3;
		p.columnRslt_itm_grp_nm3.addAliasName("Rslt.itm_grp_nm3", p);
		p.columnRslt_itm_grp_cd4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd4;
		p.columnRslt_itm_grp_cd4.addAliasName("Rslt.itm_grp_cd4", p);
		p.columnRslt_itm_grp_nm4 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm4;
		p.columnRslt_itm_grp_nm4.addAliasName("Rslt.itm_grp_nm4", p);
		p.columnRslt_itm_grp_cd5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd5;
		p.columnRslt_itm_grp_cd5.addAliasName("Rslt.itm_grp_cd5", p);
		p.columnRslt_itm_grp_nm5 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm5;
		p.columnRslt_itm_grp_nm5.addAliasName("Rslt.itm_grp_nm5", p);
		p.columnRslt_itm_grp_cd6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd6;
		p.columnRslt_itm_grp_cd6.addAliasName("Rslt.itm_grp_cd6", p);
		p.columnRslt_itm_grp_nm6 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm6;
		p.columnRslt_itm_grp_nm6.addAliasName("Rslt.itm_grp_nm6", p);
		p.columnRslt_itm_grp_cd7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd7;
		p.columnRslt_itm_grp_cd7.addAliasName("Rslt.itm_grp_cd7", p);
		p.columnRslt_itm_grp_nm7 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm7;
		p.columnRslt_itm_grp_nm7.addAliasName("Rslt.itm_grp_nm7", p);
		p.columnRslt_itm_grp_cd8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd8;
		p.columnRslt_itm_grp_cd8.addAliasName("Rslt.itm_grp_cd8", p);
		p.columnRslt_itm_grp_nm8 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm8;
		p.columnRslt_itm_grp_nm8.addAliasName("Rslt.itm_grp_nm8", p);
		p.columnRslt_itm_grp_cd9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd9;
		p.columnRslt_itm_grp_cd9.addAliasName("Rslt.itm_grp_cd9", p);
		p.columnRslt_itm_grp_nm9 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm9;
		p.columnRslt_itm_grp_nm9.addAliasName("Rslt.itm_grp_nm9", p);
		p.columnRslt_itm_grp_cd10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_cd10;
		p.columnRslt_itm_grp_cd10.addAliasName("Rslt.itm_grp_cd10", p);
		p.columnRslt_itm_grp_nm10 = p.Rslt_itm_grp_p_PPanel.columnItmGrp_itm_grp_nm10;
		p.columnRslt_itm_grp_nm10.addAliasName("Rslt.itm_grp_nm10", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MSBCP_OrdSrch p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_OrdSrch p) {
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
	
	
	/** [Cnd_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_wg_cd_p = null;

	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_wg_cd_ListPutter() {
		if (Cnd_rqst_wg_cd_p == null) {
			Cnd_rqst_wg_cd_p = createCnd_rqst_wg_cd_ListPutter(Cnd_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Cnd_rqst_wg_cd_p;
	}
	
	
	/** [Cnd_strg_alloc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_alloc_grp_cd_p = null;

	/**
	 * [Cnd_strg_alloc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_alloc_grp_cd_ListPutter() {
		if (Cnd_strg_alloc_grp_cd_p == null) {
			Cnd_strg_alloc_grp_cd_p = createCnd_strg_alloc_grp_cd_ListPutter(Cnd_strg_alloc_grp_cd, "strg_alloc_grp_cd", "strg_alloc_grp_nm");

		}
		return Cnd_strg_alloc_grp_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_grp_cd_p = null;

	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_grp_cd_ListPutter() {
		if (Cnd_mfg_loc_grp_cd_p == null) {
			Cnd_mfg_loc_grp_cd_p = createCnd_mfg_loc_grp_cd_ListPutter(Cnd_mfg_loc_grp_cd, "mfg_loc_grp_cd", "mfg_loc_grp_nm");

		}
		return Cnd_mfg_loc_grp_cd_p;
	}
	
	
	/** [Cnd_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_cd_p = null;

	/**
	 * [Cnd_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_cd_ListPutter() {
		if (Cnd_strg_loc_cd_p == null) {
			Cnd_strg_loc_cd_p = createCnd_strg_loc_cd_ListPutter(Cnd_strg_loc_cd, "strg_loc_cd", "strg_loc_nm");

		}
		return Cnd_strg_loc_cd_p;
	}
	
	
	/** [Cnd_strg_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_site_cd_p = null;

	/**
	 * [Cnd_strg_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_site_cd_ListPutter() {
		if (Cnd_strg_site_cd_p == null) {
			Cnd_strg_site_cd_p = createCnd_strg_site_cd_ListPutter(Cnd_strg_site_cd, "strg_site_cd", "strg_site_nm");

		}
		return Cnd_strg_site_cd_p;
	}
	
	
	/** [Cnd_strg_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_lg_grp_cd_p = null;

	/**
	 * [Cnd_strg_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_lg_grp_cd_ListPutter() {
		if (Cnd_strg_lg_grp_cd_p == null) {
			Cnd_strg_lg_grp_cd_p = createCnd_strg_lg_grp_cd_ListPutter(Cnd_strg_lg_grp_cd, "strg_lg_grp_cd", "strg_lg_grp_nm");

		}
		return Cnd_strg_lg_grp_cd_p;
	}
	
	
	/** [Cnd_strg_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_strg_loc_grp_cd_p = null;

	/**
	 * [Cnd_strg_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_strg_loc_grp_cd_ListPutter() {
		if (Cnd_strg_loc_grp_cd_p == null) {
			Cnd_strg_loc_grp_cd_p = createCnd_strg_loc_grp_cd_ListPutter(Cnd_strg_loc_grp_cd, "strg_loc_grp_cd", "strg_loc_grp_nm");

		}
		return Cnd_strg_loc_grp_cd_p;
	}
	
	
	/** [Cnd_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_loc_cd_p = null;

	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_loc_cd_ListPutter() {
		if (Cnd_mfg_loc_cd_p == null) {
			Cnd_mfg_loc_cd_p = createCnd_mfg_loc_cd_ListPutter(Cnd_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return Cnd_mfg_loc_cd_p;
	}
	
	
	/** [Cnd_mfg_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_mfg_site_cd_p = null;

	/**
	 * [Cnd_mfg_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_mfg_site_cd_ListPutter() {
		if (Cnd_mfg_site_cd_p == null) {
			Cnd_mfg_site_cd_p = createCnd_mfg_site_cd_ListPutter(Cnd_mfg_site_cd, "mfg_site_cd", "mfg_site_nm");

		}
		return Cnd_mfg_site_cd_p;
	}
	
	
	/** [Cnd_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_loc_cd_p = null;

	/**
	 * [Cnd_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_loc_cd_ListPutter() {
		if (Cnd_rqst_loc_cd_p == null) {
			Cnd_rqst_loc_cd_p = createCnd_rqst_loc_cd_ListPutter(Cnd_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm");

		}
		return Cnd_rqst_loc_cd_p;
	}
	
	
	/** [Cnd_rqst_site_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_site_cd_p = null;

	/**
	 * [Cnd_rqst_site_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_site_cd_ListPutter() {
		if (Cnd_rqst_site_cd_p == null) {
			Cnd_rqst_site_cd_p = createCnd_rqst_site_cd_ListPutter(Cnd_rqst_site_cd, "rqst_site_cd", "rqst_site_nm");

		}
		return Cnd_rqst_site_cd_p;
	}
	
	
	/** [Cnd_rqst_loc_grp_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rqst_loc_grp_cd_p = null;

	/**
	 * [Cnd_rqst_loc_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rqst_loc_grp_cd_ListPutter() {
		if (Cnd_rqst_loc_grp_cd_p == null) {
			Cnd_rqst_loc_grp_cd_p = createCnd_rqst_loc_grp_cd_ListPutter(Cnd_rqst_loc_grp_cd, "rqst_loc_grp_cd", "rqst_loc_grp_nm");

		}
		return Cnd_rqst_loc_grp_cd_p;
	}
	
	
	/** [Cnd_sppl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sppl_cd_p = null;

	/**
	 * [Cnd_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sppl_cd_ListPutter() {
		if (Cnd_sppl_cd_p == null) {
			Cnd_sppl_cd_p = createCnd_sppl_cd_ListPutter(Cnd_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Cnd_sppl_cd_p;
	}
	
	
	/** [Cnd_maker_cd_ListPutter]の定義 */
	private MCListPutter Cnd_maker_cd_p = null;

	/**
	 * [Cnd_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_maker_cd_ListPutter() {
		if (Cnd_maker_cd_p == null) {
			Cnd_maker_cd_p = createCnd_maker_cd_ListPutter(Cnd_maker_cd, "maker_cd", "maker_nm");

		}
		return Cnd_maker_cd_p;
	}
	
	
	/** [Cnd_ord_gnrt_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ord_gnrt_typ_p = null;

	/**
	 * [Cnd_ord_gnrt_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ord_gnrt_typ_ListPutter() {
		if (Cnd_ord_gnrt_typ_p == null) {
			Cnd_ord_gnrt_typ_p = createCnd_ord_gnrt_typ_ListPutter(Cnd_ord_gnrt_typ, "ord_gnrt_typ", "ord_gnrt_typ_nm");

		}
		return Cnd_ord_gnrt_typ_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_cd_p = createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_itm_p_PPanel.Itm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub1_p = createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub2_p = createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_itm_p_PPanel_Itm_itm_sub3_p = createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_itm_p_PPanel.Itm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Cnd_itm_p_PPanel_Itm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdSrch create(){
		MSBCP_OrdSrch p = new MSBCP_OrdSrch();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_OrdSrch create(String name){
		MSBCP_OrdSrch p = new MSBCP_OrdSrch(name);
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
		MSBCP_OrdSrch_MC.jbfInitScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitTop((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitFold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitTab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitTab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitSts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitOrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitFixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitOrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitOrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitSchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitCnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitCnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitCtrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitRPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitRslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitBtn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbfInitEastBtn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitTop((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitFold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitTab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitTab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitSts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitOrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitFixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitOrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitOrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitSchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitCnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitCnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitCtrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitRPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitRslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitBtn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.jbInitEastBtn((MSBCP_OrdSrch)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldTab = p.beansFactory.createTabbedPane("Fold.tab");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSts(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.StsPanel = p.beansFactory.createPanel("Sts");
		p.StsTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrdTyp]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrdTyp(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdTypPanel = p.beansFactory.createPanel("OrdTyp");
		p.OrdTypTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [FixFlg]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFixFlg(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.FixFlgPanel = p.beansFactory.createPanel("FixFlg");
		p.FixFlgTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrdRcv]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrdRcv(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdRcvPanel = p.beansFactory.createPanel("OrdRcv");
		p.OrdRcvTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [OrdSnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitOrdSnd(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdSndPanel = p.beansFactory.createPanel("OrdSnd");
		p.OrdSndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [SchedLink]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSchedLink(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.SchedLinkPanel = p.beansFactory.createPanel("SchedLink");
		p.SchedLinkTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_SAV = p.beansFactory.createRadioButton("Cnd.ope_SAV");
		p.Cnd_ope_FIX = p.beansFactory.createRadioButton("Cnd.ope_FIX");
		p.Cnd_ope_CANSAV = p.beansFactory.createRadioButton("Cnd.ope_CANSAV");
		p.Cnd_ope_CANFIX = p.beansFactory.createRadioButton("Cnd.ope_CANFIX");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_IMP = p.beansFactory.createRadioButton("Cnd.ope_IMP");
		p.Cnd_opn_flg = p.beansFactory.createCheckBox("Cnd.opn_flg");
		p.Cnd_sav_flg = p.beansFactory.createCheckBox("Cnd.sav_flg");
		p.Cnd_fix_flg = p.beansFactory.createCheckBox("Cnd.fix_flg");
		p.Cnd_part_inst_flg = p.beansFactory.createCheckBox("Cnd.part_inst_flg");
		p.Cnd_inst_flg = p.beansFactory.createCheckBox("Cnd.inst_flg");
		p.Cnd_cmpl_flg = p.beansFactory.createCheckBox("Cnd.cmpl_flg");
		p.Cnd_mfg_flg = p.beansFactory.createCheckBox("Cnd.mfg_flg");
		p.Cnd_purc_flg = p.beansFactory.createCheckBox("Cnd.purc_flg");
		p.Cnd_outsrc_flg = p.beansFactory.createCheckBox("Cnd.outsrc_flg");
		p.Cnd_xfr_flg = p.beansFactory.createCheckBox("Cnd.xfr_flg");
		p.Cnd_wg_xfr_flg = p.beansFactory.createCheckBox("Cnd.wg_xfr_flg");
		p.Cnd_true_not_fix_flg = p.beansFactory.createCheckBox("Cnd.true_not_fix_flg");
		p.Cnd_false_not_fix_flg = p.beansFactory.createCheckBox("Cnd.false_not_fix_flg");
		p.Cnd_ord_rcv_tgt_flg = p.beansFactory.createCheckBox("Cnd.ord_rcv_tgt_flg");
		p.Cnd_not_ord_rcv_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_ord_rcv_tgt_flg");
		p.Cnd_ord_snd_tgt_flg = p.beansFactory.createCheckBox("Cnd.ord_snd_tgt_flg");
		p.Cnd_not_ord_snd_tgt_flg = p.beansFactory.createCheckBox("Cnd.not_ord_snd_tgt_flg");
		p.Cnd_before_frozen_flg = p.beansFactory.createCheckBox("Cnd.before_frozen_flg");
		p.Cnd_frozen_flg = p.beansFactory.createCheckBox("Cnd.frozen_flg");
		p.Cnd_mfg_st_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.mfg_st_schd_dt_fr_Label");
		p.Cnd_mfg_st_schd_dt_fr = p.beansFactory.createDateField("Cnd.mfg_st_schd_dt_fr");
		p.Cnd_mfg_st_schd_dt_fr.setLabel(p.Cnd_mfg_st_schd_dt_fr_Label);
		p.Cnd_mfg_st_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.mfg_st_schd_dt_to_Label");
		p.Cnd_mfg_st_schd_dt_to = p.beansFactory.createDateField("Cnd.mfg_st_schd_dt_to");
		p.Cnd_mfg_st_schd_dt_to.setLabel(p.Cnd_mfg_st_schd_dt_to_Label);
		p.Cnd_mfg_end_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.mfg_end_schd_dt_fr_Label");
		p.Cnd_mfg_end_schd_dt_fr = p.beansFactory.createDateField("Cnd.mfg_end_schd_dt_fr");
		p.Cnd_mfg_end_schd_dt_fr.setLabel(p.Cnd_mfg_end_schd_dt_fr_Label);
		p.Cnd_mfg_end_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.mfg_end_schd_dt_to_Label");
		p.Cnd_mfg_end_schd_dt_to = p.beansFactory.createDateField("Cnd.mfg_end_schd_dt_to");
		p.Cnd_mfg_end_schd_dt_to.setLabel(p.Cnd_mfg_end_schd_dt_to_Label);
		p.Cnd_po_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.po_schd_dt_fr_Label");
		p.Cnd_po_schd_dt_fr = p.beansFactory.createDateField("Cnd.po_schd_dt_fr");
		p.Cnd_po_schd_dt_fr.setLabel(p.Cnd_po_schd_dt_fr_Label);
		p.Cnd_po_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.po_schd_dt_to_Label");
		p.Cnd_po_schd_dt_to = p.beansFactory.createDateField("Cnd.po_schd_dt_to");
		p.Cnd_po_schd_dt_to.setLabel(p.Cnd_po_schd_dt_to_Label);
		p.Cnd_gi_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.gi_schd_dt_fr_Label");
		p.Cnd_gi_schd_dt_fr = p.beansFactory.createDateField("Cnd.gi_schd_dt_fr");
		p.Cnd_gi_schd_dt_fr.setLabel(p.Cnd_gi_schd_dt_fr_Label);
		p.Cnd_gi_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.gi_schd_dt_to_Label");
		p.Cnd_gi_schd_dt_to = p.beansFactory.createDateField("Cnd.gi_schd_dt_to");
		p.Cnd_gi_schd_dt_to.setLabel(p.Cnd_gi_schd_dt_to_Label);
		p.Cnd_avl_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.avl_schd_dt_fr_Label");
		p.Cnd_avl_schd_dt_fr = p.beansFactory.createDateField("Cnd.avl_schd_dt_fr");
		p.Cnd_avl_schd_dt_fr.setLabel(p.Cnd_avl_schd_dt_fr_Label);
		p.Cnd_avl_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.avl_schd_dt_to_Label");
		p.Cnd_avl_schd_dt_to = p.beansFactory.createDateField("Cnd.avl_schd_dt_to");
		p.Cnd_avl_schd_dt_to.setLabel(p.Cnd_avl_schd_dt_to_Label);
		p.Cnd_strg_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.strg_schd_dt_fr_Label");
		p.Cnd_strg_schd_dt_fr = p.beansFactory.createDateField("Cnd.strg_schd_dt_fr");
		p.Cnd_strg_schd_dt_fr.setLabel(p.Cnd_strg_schd_dt_fr_Label);
		p.Cnd_strg_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.strg_schd_dt_to_Label");
		p.Cnd_strg_schd_dt_to = p.beansFactory.createDateField("Cnd.strg_schd_dt_to");
		p.Cnd_strg_schd_dt_to.setLabel(p.Cnd_strg_schd_dt_to_Label);
		p.Cnd_accpt_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_fr_Label");
		p.Cnd_accpt_schd_dt_fr = p.beansFactory.createDateField("Cnd.accpt_schd_dt_fr");
		p.Cnd_accpt_schd_dt_fr.setLabel(p.Cnd_accpt_schd_dt_fr_Label);
		p.Cnd_accpt_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.accpt_schd_dt_to_Label");
		p.Cnd_accpt_schd_dt_to = p.beansFactory.createDateField("Cnd.accpt_schd_dt_to");
		p.Cnd_accpt_schd_dt_to.setLabel(p.Cnd_accpt_schd_dt_to_Label);
		p.Cnd_insp_st_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.insp_st_schd_dt_fr_Label");
		p.Cnd_insp_st_schd_dt_fr = p.beansFactory.createDateField("Cnd.insp_st_schd_dt_fr");
		p.Cnd_insp_st_schd_dt_fr.setLabel(p.Cnd_insp_st_schd_dt_fr_Label);
		p.Cnd_insp_st_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.insp_st_schd_dt_to_Label");
		p.Cnd_insp_st_schd_dt_to = p.beansFactory.createDateField("Cnd.insp_st_schd_dt_to");
		p.Cnd_insp_st_schd_dt_to.setLabel(p.Cnd_insp_st_schd_dt_to_Label);
		p.Cnd_insp_end_schd_dt_fr_Label = p.beansFactory.createLabel("Cnd.insp_end_schd_dt_fr_Label");
		p.Cnd_insp_end_schd_dt_fr = p.beansFactory.createDateField("Cnd.insp_end_schd_dt_fr");
		p.Cnd_insp_end_schd_dt_fr.setLabel(p.Cnd_insp_end_schd_dt_fr_Label);
		p.Cnd_insp_end_schd_dt_to_Label = p.beansFactory.createLabel("Cnd.insp_end_schd_dt_to_Label");
		p.Cnd_insp_end_schd_dt_to = p.beansFactory.createDateField("Cnd.insp_end_schd_dt_to");
		p.Cnd_insp_end_schd_dt_to.setLabel(p.Cnd_insp_end_schd_dt_to_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_rqst_wg_cd_Label = p.beansFactory.createLabel("Cnd.rqst_wg_cd_Label");
		p.Cnd_rqst_wg_cd = p.beansFactory.createTextComboBox("Cnd.rqst_wg_cd");
		p.Cnd_rqst_wg_cd.setLabel(p.Cnd_rqst_wg_cd_Label);
		p.Cnd_rqst_wg_nm = p.beansFactory.createTextField("Cnd.rqst_wg_nm");
		p.Cnd_strg_alloc_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_alloc_grp_cd_Label");
		p.Cnd_strg_alloc_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_alloc_grp_cd");
		p.Cnd_strg_alloc_grp_cd.setLabel(p.Cnd_strg_alloc_grp_cd_Label);
		p.Cnd_strg_alloc_grp_nm = p.beansFactory.createTextField("Cnd.strg_alloc_grp_nm");
		p.Cnd_mfg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_grp_cd_Label");
		p.Cnd_mfg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.mfg_loc_grp_cd");
		p.Cnd_mfg_loc_grp_cd.setLabel(p.Cnd_mfg_loc_grp_cd_Label);
		p.Cnd_mfg_loc_grp_nm = p.beansFactory.createTextField("Cnd.mfg_loc_grp_nm");
		p.Cnd_strg_loc_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_cd_Label");
		p.Cnd_strg_loc_cd = p.beansFactory.createTextField("Cnd.strg_loc_cd");
		p.Cnd_strg_loc_cd.setLabel(p.Cnd_strg_loc_cd_Label);
		p.Cnd_strg_loc_nm = p.beansFactory.createTextField("Cnd.strg_loc_nm");
		p.Cnd_strg_site_cd_Label = p.beansFactory.createLabel("Cnd.strg_site_cd_Label");
		p.Cnd_strg_site_cd = p.beansFactory.createTextComboBox("Cnd.strg_site_cd");
		p.Cnd_strg_site_cd.setLabel(p.Cnd_strg_site_cd_Label);
		p.Cnd_strg_site_nm = p.beansFactory.createTextField("Cnd.strg_site_nm");
		p.Cnd_strg_lg_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_lg_grp_cd_Label");
		p.Cnd_strg_lg_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_lg_grp_cd");
		p.Cnd_strg_lg_grp_cd.setLabel(p.Cnd_strg_lg_grp_cd_Label);
		p.Cnd_strg_lg_grp_nm = p.beansFactory.createTextField("Cnd.strg_lg_grp_nm");
		p.Cnd_strg_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.strg_loc_grp_cd_Label");
		p.Cnd_strg_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.strg_loc_grp_cd");
		p.Cnd_strg_loc_grp_cd.setLabel(p.Cnd_strg_loc_grp_cd_Label);
		p.Cnd_strg_loc_grp_nm = p.beansFactory.createTextField("Cnd.strg_loc_grp_nm");
		p.Cnd_mfg_loc_cd_Label = p.beansFactory.createLabel("Cnd.mfg_loc_cd_Label");
		p.Cnd_mfg_loc_cd = p.beansFactory.createTextField("Cnd.mfg_loc_cd");
		p.Cnd_mfg_loc_cd.setLabel(p.Cnd_mfg_loc_cd_Label);
		p.Cnd_mfg_loc_nm = p.beansFactory.createTextField("Cnd.mfg_loc_nm");
		p.Cnd_mfg_site_cd_Label = p.beansFactory.createLabel("Cnd.mfg_site_cd_Label");
		p.Cnd_mfg_site_cd = p.beansFactory.createTextComboBox("Cnd.mfg_site_cd");
		p.Cnd_mfg_site_cd.setLabel(p.Cnd_mfg_site_cd_Label);
		p.Cnd_mfg_site_nm = p.beansFactory.createTextField("Cnd.mfg_site_nm");
		p.Cnd_rqst_loc_cd_Label = p.beansFactory.createLabel("Cnd.rqst_loc_cd_Label");
		p.Cnd_rqst_loc_cd = p.beansFactory.createTextField("Cnd.rqst_loc_cd");
		p.Cnd_rqst_loc_cd.setLabel(p.Cnd_rqst_loc_cd_Label);
		p.Cnd_rqst_loc_nm = p.beansFactory.createTextField("Cnd.rqst_loc_nm");
		p.Cnd_rqst_site_cd_Label = p.beansFactory.createLabel("Cnd.rqst_site_cd_Label");
		p.Cnd_rqst_site_cd = p.beansFactory.createTextComboBox("Cnd.rqst_site_cd");
		p.Cnd_rqst_site_cd.setLabel(p.Cnd_rqst_site_cd_Label);
		p.Cnd_rqst_site_nm = p.beansFactory.createTextField("Cnd.rqst_site_nm");
		p.Cnd_rqst_loc_grp_cd_Label = p.beansFactory.createLabel("Cnd.rqst_loc_grp_cd_Label");
		p.Cnd_rqst_loc_grp_cd = p.beansFactory.createTextComboBox("Cnd.rqst_loc_grp_cd");
		p.Cnd_rqst_loc_grp_cd.setLabel(p.Cnd_rqst_loc_grp_cd_Label);
		p.Cnd_rqst_loc_grp_nm = p.beansFactory.createTextField("Cnd.rqst_loc_grp_nm");
		p.Cnd_sppl_cd_Label = p.beansFactory.createLabel("Cnd.sppl_cd_Label");
		p.Cnd_sppl_cd = p.beansFactory.createTextField("Cnd.sppl_cd");
		p.Cnd_sppl_cd.setLabel(p.Cnd_sppl_cd_Label);
		p.Cnd_sppl_nm = p.beansFactory.createTextField("Cnd.sppl_nm");
		p.Cnd_maker_cd_Label = p.beansFactory.createLabel("Cnd.maker_cd_Label");
		p.Cnd_maker_cd = p.beansFactory.createTextField("Cnd.maker_cd");
		p.Cnd_maker_cd.setLabel(p.Cnd_maker_cd_Label);
		p.Cnd_maker_nm = p.beansFactory.createTextField("Cnd.maker_nm");
		p.Cnd_ord_gnrt_typ_Label = p.beansFactory.createLabel("Cnd.ord_gnrt_typ_Label");
		p.Cnd_ord_gnrt_typ = p.beansFactory.createTextComboBox("Cnd.ord_gnrt_typ");
		p.Cnd_ord_gnrt_typ.setLabel(p.Cnd_ord_gnrt_typ_Label);
		p.Cnd_ord_gnrt_typ_nm = p.beansFactory.createTextField("Cnd.ord_gnrt_typ_nm");
		p.Cnd_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.itm_ord_no_Label");
		p.Cnd_itm_ord_no = p.beansFactory.createTextField("Cnd.itm_ord_no");
		p.Cnd_itm_ord_no.setLabel(p.Cnd_itm_ord_no_Label);
		p.Cnd_rqmt_no_Label = p.beansFactory.createLabel("Cnd.rqmt_no_Label");
		p.Cnd_rqmt_no = p.beansFactory.createTextField("Cnd.rqmt_no");
		p.Cnd_rqmt_no.setLabel(p.Cnd_rqmt_no_Label);
		p.Cnd_sim_mrp_no_Label = p.beansFactory.createLabel("Cnd.sim_mrp_no_Label");
		p.Cnd_sim_mrp_no = p.beansFactory.createTextField("Cnd.sim_mrp_no");
		p.Cnd_sim_mrp_no.setLabel(p.Cnd_sim_mrp_no_Label);
		p.Cnd_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.intr_rmrks_Label");
		p.Cnd_intr_rmrks = p.beansFactory.createTextField("Cnd.intr_rmrks");
		p.Cnd_intr_rmrks.setLabel(p.Cnd_intr_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
		p.Cnd_ext_sys_cd_Label = p.beansFactory.createLabel("Cnd.ext_sys_cd_Label");
		p.Cnd_ext_sys_cd = p.beansFactory.createTextField("Cnd.ext_sys_cd");
		p.Cnd_ext_sys_cd.setLabel(p.Cnd_ext_sys_cd_Label);
		p.Cnd_ext_sys_nm_Label = p.beansFactory.createLabel("Cnd.ext_sys_nm_Label");
		p.Cnd_ext_sys_nm = p.beansFactory.createTextField("Cnd.ext_sys_nm");
		p.Cnd_ext_sys_nm.setLabel(p.Cnd_ext_sys_nm_Label);
		p.Cnd_ext_itm_ord_no_Label = p.beansFactory.createLabel("Cnd.ext_itm_ord_no_Label");
		p.Cnd_ext_itm_ord_no = p.beansFactory.createTextField("Cnd.ext_itm_ord_no");
		p.Cnd_ext_itm_ord_no.setLabel(p.Cnd_ext_itm_ord_no_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_itm_ord_no = p.beansFactory.createTableColumn("Rslt.itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ", MCColumnType.TEXT);
		p.columnRslt_itm_ord_sts_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_ord_sts_typ_nm", MCColumnType.TEXT);
		p.columnRslt_oper_sav_flg = p.beansFactory.createTableColumn("Rslt.oper_sav_flg", MCColumnType.CHECK);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_dec_place = p.beansFactory.createTableColumn("Rslt.dec_place", MCColumnType.NUMBER);
		p.columnRslt_rnd_typ = p.beansFactory.createTableColumn("Rslt.rnd_typ", MCColumnType.TEXT);
		p.columnRslt_oper_ptn = p.beansFactory.createTableColumn("Rslt.oper_ptn", MCColumnType.TEXT);
		p.columnRslt_bom_ptn = p.beansFactory.createTableColumn("Rslt.bom_ptn", MCColumnType.TEXT);
		p.columnRslt_nmr_qty = p.beansFactory.createTableColumn("Rslt.nmr_qty", MCColumnType.NUMBER);
		p.columnRslt_dnm_qty = p.beansFactory.createTableColumn("Rslt.dnm_qty", MCColumnType.NUMBER);
		p.columnRslt_fxd_yield_qty = p.beansFactory.createTableColumn("Rslt.fxd_yield_qty", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_master_dt = p.beansFactory.createTableColumn("Rslt.master_dt", MCColumnType.DATE);
		p.columnRslt_po_schd_dt = p.beansFactory.createTableColumn("Rslt.po_schd_dt", MCColumnType.DATE);
		p.columnRslt_purc_lt = p.beansFactory.createTableColumn("Rslt.purc_lt", MCColumnType.NUMBER);
		p.columnRslt_mfg_st_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_mfg_lt = p.beansFactory.createTableColumn("Rslt.mfg_lt", MCColumnType.NUMBER);
		p.columnRslt_mfg_end_schd_dt = p.beansFactory.createTableColumn("Rslt.mfg_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_gi_schd_dt = p.beansFactory.createTableColumn("Rslt.gi_schd_dt", MCColumnType.DATE);
		p.columnRslt_xfr_lt = p.beansFactory.createTableColumn("Rslt.xfr_lt", MCColumnType.NUMBER);
		p.columnRslt_strg_schd_dt = p.beansFactory.createTableColumn("Rslt.strg_schd_dt", MCColumnType.DATE);
		p.columnRslt_accpt_insp_lt = p.beansFactory.createTableColumn("Rslt.accpt_insp_lt", MCColumnType.NUMBER);
		p.columnRslt_accpt_schd_dt = p.beansFactory.createTableColumn("Rslt.accpt_schd_dt", MCColumnType.DATE);
		p.columnRslt_insp_flg = p.beansFactory.createTableColumn("Rslt.insp_flg", MCColumnType.CHECK);
		p.columnRslt_insp_st_schd_dt = p.beansFactory.createTableColumn("Rslt.insp_st_schd_dt", MCColumnType.DATE);
		p.columnRslt_insp_lt = p.beansFactory.createTableColumn("Rslt.insp_lt", MCColumnType.NUMBER);
		p.columnRslt_insp_offst = p.beansFactory.createTableColumn("Rslt.insp_offst", MCColumnType.NUMBER);
		p.columnRslt_insp_end_schd_dt = p.beansFactory.createTableColumn("Rslt.insp_end_schd_dt", MCColumnType.DATE);
		p.columnRslt_avl_schd_dt = p.beansFactory.createTableColumn("Rslt.avl_schd_dt", MCColumnType.DATE);
		p.columnRslt_strg_site_cd = p.beansFactory.createTableColumn("Rslt.strg_site_cd", MCColumnType.TEXT);
		p.columnRslt_strg_site_nm = p.beansFactory.createTableColumn("Rslt.strg_site_nm", MCColumnType.TEXT);
		p.columnRslt_strg_lg_grp_cd = p.beansFactory.createTableColumn("Rslt.strg_lg_grp_cd", MCColumnType.TEXT);
		p.columnRslt_strg_lg_grp_nm = p.beansFactory.createTableColumn("Rslt.strg_lg_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_alloc_grp_cd = p.beansFactory.createTableColumn("Rslt.strg_alloc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_strg_alloc_grp_nm = p.beansFactory.createTableColumn("Rslt.strg_alloc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_strg_loc_cd = p.beansFactory.createTableColumn("Rslt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_strg_loc_nm = p.beansFactory.createTableColumn("Rslt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_site_cd = p.beansFactory.createTableColumn("Rslt.mfg_site_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_site_nm = p.beansFactory.createTableColumn("Rslt.mfg_site_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_cd = p.beansFactory.createTableColumn("Rslt.mfg_loc_cd", MCColumnType.TEXT);
		p.columnRslt_mfg_loc_nm = p.beansFactory.createTableColumn("Rslt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRslt_sppl_cd = p.beansFactory.createTableColumn("Rslt.sppl_cd", MCColumnType.TEXT);
		p.columnRslt_sppl_nm = p.beansFactory.createTableColumn("Rslt.sppl_nm", MCColumnType.TEXT);
		p.columnRslt_maker_cd = p.beansFactory.createTableColumn("Rslt.maker_cd", MCColumnType.TEXT);
		p.columnRslt_maker_nm = p.beansFactory.createTableColumn("Rslt.maker_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_site_cd = p.beansFactory.createTableColumn("Rslt.rqst_site_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_site_nm = p.beansFactory.createTableColumn("Rslt.rqst_site_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_grp_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_grp_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_grp_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_grp_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_cd = p.beansFactory.createTableColumn("Rslt.rqst_loc_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_loc_nm = p.beansFactory.createTableColumn("Rslt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_cd = p.beansFactory.createTableColumn("Rslt.rqst_wg_cd", MCColumnType.TEXT);
		p.columnRslt_rqst_wg_nm = p.beansFactory.createTableColumn("Rslt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnRslt_rqmt_no = p.beansFactory.createTableColumn("Rslt.rqmt_no", MCColumnType.TEXT);
		p.columnRslt_ord_gnrt_typ = p.beansFactory.createTableColumn("Rslt.ord_gnrt_typ", MCColumnType.TEXT);
		p.columnRslt_ord_gnrt_typ_nm = p.beansFactory.createTableColumn("Rslt.ord_gnrt_typ_nm", MCColumnType.TEXT);
		p.columnRslt_io_schd_pr_no = p.beansFactory.createTableColumn("Rslt.io_schd_pr_no", MCColumnType.TEXT);
		p.columnRslt_sim_mrp_no = p.beansFactory.createTableColumn("Rslt.sim_mrp_no", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_not_fix_flg = p.beansFactory.createTableColumn("Rslt.not_fix_flg", MCColumnType.CHECK);
		p.columnRslt_inst_po_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.inst_po_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_intr_rmrks = p.beansFactory.createTableColumn("Rslt.intr_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_ord_rcv_flg = p.beansFactory.createTableColumn("Rslt.ord_rcv_flg", MCColumnType.CHECK);
		p.columnRslt_ord_snd_flg = p.beansFactory.createTableColumn("Rslt.ord_snd_flg", MCColumnType.CHECK);
		p.columnRslt_ext_sys_cd = p.beansFactory.createTableColumn("Rslt.ext_sys_cd", MCColumnType.TEXT);
		p.columnRslt_ext_sys_nm = p.beansFactory.createTableColumn("Rslt.ext_sys_nm", MCColumnType.TEXT);
		p.columnRslt_ext_itm_ord_no = p.beansFactory.createTableColumn("Rslt.ext_itm_ord_no", MCColumnType.TEXT);
		p.columnRslt_for_scheduler_frozen_flg = p.beansFactory.createTableColumn("Rslt.for_scheduler_frozen_flg", MCColumnType.CHECK);
		p.columnRslt_scheduler_frozen_flg = p.beansFactory.createTableColumn("Rslt.scheduler_frozen_flg", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_ins_usr_id = p.beansFactory.createTableColumn("Rslt.ins_usr_id", MCColumnType.TEXT);
		p.columnRslt_ins_usr_nm = p.beansFactory.createTableColumn("Rslt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRslt_ins_func_id = p.beansFactory.createTableColumn("Rslt.ins_func_id", MCColumnType.TEXT);
		p.columnRslt_ins_func_nm = p.beansFactory.createTableColumn("Rslt.ins_func_nm", MCColumnType.TEXT);
		p.columnRslt_ins_ts = p.beansFactory.createTableColumn("Rslt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_itm_order_upd_cntr = p.beansFactory.createTableColumn("Rslt.itm_order_upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_upd_usr_id = p.beansFactory.createTableColumn("Rslt.upd_usr_id", MCColumnType.TEXT);
		p.columnRslt_upd_usr_nm = p.beansFactory.createTableColumn("Rslt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRslt_upd_func_id = p.beansFactory.createTableColumn("Rslt.upd_func_id", MCColumnType.TEXT);
		p.columnRslt_upd_func_nm = p.beansFactory.createTableColumn("Rslt.upd_func_nm", MCColumnType.TEXT);
		p.columnRslt_upd_ts = p.beansFactory.createTableColumn("Rslt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRslt_upd_srv_req_no = p.beansFactory.createTableColumn("Rslt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRslt_upd_tgt_flg = p.beansFactory.createTableColumn("Rslt.upd_tgt_flg", MCColumnType.CHECK);
		p.columnRslt_modify_tgt_flg = p.beansFactory.createTableColumn("Rslt.modify_tgt_flg", MCColumnType.CHECK);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0040 = p.beansFactory.createButton("Btn.open_MSBCP0040", "open");
		p.Btn_open_MSBCP0080 = p.beansFactory.createButton("Btn.open_MSBCP0080", "open");
		p.Btn_open_MSBCP0090 = p.beansFactory.createButton("Btn.open_MSBCP0090", "open");
		p.Btn_open_MSBCP0070 = p.beansFactory.createButton("Btn.open_MSBCP0070", "open");
		p.Btn_open_MSBCP0060 = p.beansFactory.createButton("Btn.open_MSBCP0060", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_async_flg = p.beansFactory.createCheckBox("Btn.async_flg");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_upd2 = p.beansFactory.createButton("Btn.upd2", "upd");
		p.Btn_upd3 = p.beansFactory.createButton("Btn.upd3", "upd");
		p.Btn_upd4 = p.beansFactory.createButton("Btn.upd4", "upd");
		p.Btn_upd5 = p.beansFactory.createButton("Btn.upd5", "upd");
		p.Btn_ins01 = p.beansFactory.createButton("Btn.ins01", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_OrdSrch p) {
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
	protected static void jbInitTop(MSBCP_OrdSrch p) {
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
		p.CtrlPanel.setNextBeans(p.RPnlPanel);
		p.TopPanel.add(p.RPnlPanel, null);
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFold(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.FoldPanel.add(p.FoldTab);
		p.FoldPanel.setLastBeans(p.FoldTab);
		p.FoldPanel.setValueCheck(false);
		p.FoldPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldTab.add(p.Tab1Panel, "Fold.tab1");
		p.FoldTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.FoldTab.add(p.Tab2Panel, "Fold.tab2");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.StsPanel, null);
		p.Tab1Panel.setLastBeans(p.StsPanel);
		p.StsPanel.setNextBeans(p.OrdTypPanel);
		p.Tab1Panel.add(p.OrdTypPanel, null);
		p.OrdTypPanel.setNextBeans(p.FixFlgPanel);
		p.Tab1Panel.add(p.FixFlgPanel, null);
		p.FixFlgPanel.setNextBeans(p.OrdRcvPanel);
		p.Tab1Panel.add(p.OrdRcvPanel, null);
		p.OrdRcvPanel.setNextBeans(p.OrdSndPanel);
		p.Tab1Panel.add(p.OrdSndPanel, null);
		p.OrdSndPanel.setNextBeans(p.SchedLinkPanel);
		p.Tab1Panel.add(p.SchedLinkPanel, null);
		p.SchedLinkPanel.setNextBeans(p.CndPanel);
		p.Tab1Panel.add(p.CndPanel, null);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Sts]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSts(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.StsPanel.setBorder(p.StsTitledBorder);
		p.StsPanel.setValueCheck(false);
		p.StsPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.StsPanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [OrdTyp]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrdTyp(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdTypPanel.setBorder(p.OrdTypTitledBorder);
		p.OrdTypPanel.setValueCheck(false);
		p.OrdTypPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrdTypPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [FixFlg]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitFixFlg(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.FixFlgPanel.setBorder(p.FixFlgTitledBorder);
		p.FixFlgPanel.setValueCheck(false);
		p.FixFlgPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.FixFlgPanel.setLayoutPosition("NSW");
		// ブロックの項目の初期化
	}

	/**
	 * [OrdRcv]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrdRcv(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdRcvPanel.setBorder(p.OrdRcvTitledBorder);
		p.OrdRcvPanel.setValueCheck(false);
		p.OrdRcvPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrdRcvPanel.setLayoutPosition("NSWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [OrdSnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitOrdSnd(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.OrdSndPanel.setBorder(p.OrdSndTitledBorder);
		p.OrdSndPanel.setValueCheck(false);
		p.OrdSndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.OrdSndPanel.setLayoutPosition("NSWXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [SchedLink]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSchedLink(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.SchedLinkPanel.setBorder(p.SchedLinkTitledBorder);
		p.SchedLinkPanel.setValueCheck(false);
		p.SchedLinkPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.SchedLinkPanel.setLayoutPosition("NSWXCXCXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_SAV);
		p.Cnd_ope_SAV.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_SAV);
		p.ScreenOpePanel.add(p.Cnd_ope_SAV);
		p.Cnd_ope_SAV.setNextBeans(p.Cnd_ope_FIX);
		p.Cnd_ope_FIX.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_FIX);
		p.ScreenOpePanel.add(p.Cnd_ope_FIX);
		p.Cnd_ope_FIX.setNextBeans(p.Cnd_ope_CANSAV);
		p.Cnd_ope_CANSAV.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_CANSAV);
		p.ScreenOpePanel.add(p.Cnd_ope_CANSAV);
		p.Cnd_ope_CANSAV.setNextBeans(p.Cnd_ope_CANFIX);
		p.Cnd_ope_CANFIX.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_CANFIX);
		p.ScreenOpePanel.add(p.Cnd_ope_CANFIX);
		p.Cnd_ope_CANFIX.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("5");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("6");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_IMP);
		p.Cnd_ope_IMP.setActionCommand("7");
		p.Cnd_ope_Group.add(p.Cnd_ope_IMP);
		p.ScreenOpePanel.add(p.Cnd_ope_IMP);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ope_META);
		p.StsPanel.add(p.Cnd_opn_flg);
		p.StsPanel.setLastBeans(p.Cnd_opn_flg);
		p.Cnd_opn_flg.setNextBeans(p.Cnd_sav_flg);
		p.Cnd_opn_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.opn_flg_META);
		p.StsPanel.add(p.Cnd_sav_flg);
		p.Cnd_sav_flg.setNextBeans(p.Cnd_fix_flg);
		p.Cnd_sav_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sav_flg_META);
		p.StsPanel.add(p.Cnd_fix_flg);
		p.Cnd_fix_flg.setNextBeans(p.Cnd_part_inst_flg);
		p.Cnd_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.fix_flg_META);
		p.StsPanel.add(p.Cnd_part_inst_flg);
		p.Cnd_part_inst_flg.setNextBeans(p.Cnd_inst_flg);
		p.Cnd_part_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.part_inst_flg_META);
		p.StsPanel.add(p.Cnd_inst_flg);
		p.Cnd_inst_flg.setNextBeans(p.Cnd_cmpl_flg);
		p.Cnd_inst_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.inst_flg_META);
		p.StsPanel.add(p.Cnd_cmpl_flg);
		p.Cnd_cmpl_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.cmpl_flg_META);
		p.OrdTypPanel.add(p.Cnd_mfg_flg);
		p.OrdTypPanel.setLastBeans(p.Cnd_mfg_flg);
		p.Cnd_mfg_flg.setNextBeans(p.Cnd_purc_flg);
		p.Cnd_mfg_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_flg_META);
		p.OrdTypPanel.add(p.Cnd_purc_flg);
		p.Cnd_purc_flg.setNextBeans(p.Cnd_outsrc_flg);
		p.Cnd_purc_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.purc_flg_META);
		p.OrdTypPanel.add(p.Cnd_outsrc_flg);
		p.Cnd_outsrc_flg.setNextBeans(p.Cnd_xfr_flg);
		p.Cnd_outsrc_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.outsrc_flg_META);
		p.OrdTypPanel.add(p.Cnd_xfr_flg);
		p.Cnd_xfr_flg.setNextBeans(p.Cnd_wg_xfr_flg);
		p.Cnd_xfr_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.xfr_flg_META);
		p.OrdTypPanel.add(p.Cnd_wg_xfr_flg);
		p.Cnd_wg_xfr_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.wg_xfr_flg_META);
		p.FixFlgPanel.add(p.Cnd_true_not_fix_flg);
		p.FixFlgPanel.setLastBeans(p.Cnd_true_not_fix_flg);
		p.Cnd_true_not_fix_flg.setNextBeans(p.Cnd_false_not_fix_flg);
		p.Cnd_true_not_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.true_not_fix_flg_META);
		p.FixFlgPanel.add(p.Cnd_false_not_fix_flg);
		p.Cnd_false_not_fix_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.false_not_fix_flg_META);
		p.OrdRcvPanel.add(p.Cnd_ord_rcv_tgt_flg);
		p.OrdRcvPanel.setLastBeans(p.Cnd_ord_rcv_tgt_flg);
		p.Cnd_ord_rcv_tgt_flg.setNextBeans(p.Cnd_not_ord_rcv_tgt_flg);
		p.Cnd_ord_rcv_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ord_rcv_tgt_flg_META);
		p.OrdRcvPanel.add(p.Cnd_not_ord_rcv_tgt_flg);
		p.Cnd_not_ord_rcv_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.not_ord_rcv_tgt_flg_META);
		p.OrdSndPanel.add(p.Cnd_ord_snd_tgt_flg);
		p.OrdSndPanel.setLastBeans(p.Cnd_ord_snd_tgt_flg);
		p.Cnd_ord_snd_tgt_flg.setNextBeans(p.Cnd_not_ord_snd_tgt_flg);
		p.Cnd_ord_snd_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ord_snd_tgt_flg_META);
		p.OrdSndPanel.add(p.Cnd_not_ord_snd_tgt_flg);
		p.Cnd_not_ord_snd_tgt_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.not_ord_snd_tgt_flg_META);
		p.SchedLinkPanel.add(p.Cnd_before_frozen_flg);
		p.SchedLinkPanel.setLastBeans(p.Cnd_before_frozen_flg);
		p.Cnd_before_frozen_flg.setNextBeans(p.Cnd_frozen_flg);
		p.Cnd_before_frozen_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.before_frozen_flg_META);
		p.SchedLinkPanel.add(p.Cnd_frozen_flg);
		p.Cnd_frozen_flg.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.frozen_flg_META);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_fr);
		p.CndPanel.setLastBeans(p.Cnd_mfg_st_schd_dt_fr);
		p.Cnd_mfg_st_schd_dt_fr.setNextBeans(p.Cnd_mfg_st_schd_dt_to);
		p.Cnd_mfg_st_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_st_schd_dt_fr_META);
		p.Cnd_mfg_st_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_mfg_st_schd_dt_to);
		p.Cnd_mfg_st_schd_dt_to.setNextBeans(p.Cnd_mfg_end_schd_dt_fr);
		p.Cnd_mfg_st_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_st_schd_dt_to_META);
		p.Cnd_mfg_st_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_fr);
		p.Cnd_mfg_end_schd_dt_fr.setNextBeans(p.Cnd_mfg_end_schd_dt_to);
		p.Cnd_mfg_end_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_end_schd_dt_fr_META);
		p.Cnd_mfg_end_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_mfg_end_schd_dt_to);
		p.Cnd_mfg_end_schd_dt_to.setNextBeans(p.Cnd_po_schd_dt_fr);
		p.Cnd_mfg_end_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_end_schd_dt_to_META);
		p.Cnd_mfg_end_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_po_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_po_schd_dt_fr);
		p.Cnd_po_schd_dt_fr.setNextBeans(p.Cnd_po_schd_dt_to);
		p.Cnd_po_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.po_schd_dt_fr_META);
		p.Cnd_po_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_po_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_po_schd_dt_to);
		p.Cnd_po_schd_dt_to.setNextBeans(p.Cnd_gi_schd_dt_fr);
		p.Cnd_po_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.po_schd_dt_to_META);
		p.Cnd_po_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_gi_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_gi_schd_dt_fr);
		p.Cnd_gi_schd_dt_fr.setNextBeans(p.Cnd_gi_schd_dt_to);
		p.Cnd_gi_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.gi_schd_dt_fr_META);
		p.Cnd_gi_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_gi_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_gi_schd_dt_to);
		p.Cnd_gi_schd_dt_to.setNextBeans(p.Cnd_avl_schd_dt_fr);
		p.Cnd_gi_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.gi_schd_dt_to_META);
		p.Cnd_gi_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_avl_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_avl_schd_dt_fr);
		p.Cnd_avl_schd_dt_fr.setNextBeans(p.Cnd_avl_schd_dt_to);
		p.Cnd_avl_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.avl_schd_dt_fr_META);
		p.Cnd_avl_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_avl_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_avl_schd_dt_to);
		p.Cnd_avl_schd_dt_to.setNextBeans(p.Cnd_strg_schd_dt_fr);
		p.Cnd_avl_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.avl_schd_dt_to_META);
		p.Cnd_avl_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_strg_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_strg_schd_dt_fr);
		p.Cnd_strg_schd_dt_fr.setNextBeans(p.Cnd_strg_schd_dt_to);
		p.Cnd_strg_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_schd_dt_fr_META);
		p.Cnd_strg_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_strg_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_strg_schd_dt_to);
		p.Cnd_strg_schd_dt_to.setNextBeans(p.Cnd_accpt_schd_dt_fr);
		p.Cnd_strg_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_schd_dt_to_META);
		p.Cnd_strg_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_fr);
		p.Cnd_accpt_schd_dt_fr.setNextBeans(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.accpt_schd_dt_fr_META);
		p.Cnd_accpt_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_accpt_schd_dt_to);
		p.Cnd_accpt_schd_dt_to.setNextBeans(p.Cnd_insp_st_schd_dt_fr);
		p.Cnd_accpt_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.accpt_schd_dt_to_META);
		p.Cnd_accpt_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_insp_st_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_insp_st_schd_dt_fr);
		p.Cnd_insp_st_schd_dt_fr.setNextBeans(p.Cnd_insp_st_schd_dt_to);
		p.Cnd_insp_st_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.insp_st_schd_dt_fr_META);
		p.Cnd_insp_st_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_insp_st_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_insp_st_schd_dt_to);
		p.Cnd_insp_st_schd_dt_to.setNextBeans(p.Cnd_insp_end_schd_dt_fr);
		p.Cnd_insp_st_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.insp_st_schd_dt_to_META);
		p.Cnd_insp_st_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_insp_end_schd_dt_fr_Label);
		p.CndPanel.add(p.Cnd_insp_end_schd_dt_fr);
		p.Cnd_insp_end_schd_dt_fr.setNextBeans(p.Cnd_insp_end_schd_dt_to);
		p.Cnd_insp_end_schd_dt_fr.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.insp_end_schd_dt_fr_META);
		p.Cnd_insp_end_schd_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_insp_end_schd_dt_to_Label);
		p.CndPanel.add(p.Cnd_insp_end_schd_dt_to);
		p.Cnd_insp_end_schd_dt_to.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_insp_end_schd_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.insp_end_schd_dt_to_META);
		p.Cnd_insp_end_schd_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_rqst_wg_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_rqst_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_wg_cd, true);
		p.Cnd_rqst_wg_cd.setLinkBeans(p.Cnd_rqst_wg_nm);
		p.CndPanel.add(p.Cnd_rqst_wg_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_wg_cd);
		p.Cnd_rqst_wg_cd.setNextBeans(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_wg_cd_META);
		p.CndPanel.add(p.Cnd_rqst_wg_nm);
		p.Cnd_rqst_wg_nm.setNextBeans(p.Cnd_strg_alloc_grp_cd);
		p.Cnd_rqst_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_wg_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_wg_nm, true);
		p.Cnd_strg_alloc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_alloc_grp_cd, true);
		p.Cnd_strg_alloc_grp_cd.setLinkBeans(p.Cnd_strg_alloc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_alloc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_alloc_grp_cd);
		p.Cnd_strg_alloc_grp_cd.setNextBeans(p.Cnd_strg_alloc_grp_nm);
		p.Cnd_strg_alloc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_alloc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_alloc_grp_nm);
		p.Cnd_strg_alloc_grp_nm.setNextBeans(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_strg_alloc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_alloc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_alloc_grp_nm, true);
		p.Cnd_mfg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_cd, true);
		p.Cnd_mfg_loc_grp_cd.setLinkBeans(p.Cnd_mfg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_cd);
		p.Cnd_mfg_loc_grp_cd.setNextBeans(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_mfg_loc_grp_nm);
		p.Cnd_mfg_loc_grp_nm.setNextBeans(p.Cnd_strg_loc_cd);
		p.Cnd_mfg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_strg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_cd);
		p.Cnd_strg_loc_cd.setNextBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_loc_cd_META);
		p.Cnd_strg_loc_cd.addLinkBeans(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_cd, true);
		p.CndPanel.add(p.Cnd_strg_loc_nm);
		p.Cnd_strg_loc_nm.setNextBeans(p.Cnd_strg_site_cd);
		p.Cnd_strg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_nm, true);
		p.Cnd_strg_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_site_cd, true);
		p.Cnd_strg_site_cd.setLinkBeans(p.Cnd_strg_site_nm);
		p.CndPanel.add(p.Cnd_strg_site_cd_Label);
		p.CndPanel.add(p.Cnd_strg_site_cd);
		p.Cnd_strg_site_cd.setNextBeans(p.Cnd_strg_site_nm);
		p.Cnd_strg_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_site_cd_META);
		p.CndPanel.add(p.Cnd_strg_site_nm);
		p.Cnd_strg_site_nm.setNextBeans(p.Cnd_strg_lg_grp_cd);
		p.Cnd_strg_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_site_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_site_nm, true);
		p.Cnd_strg_lg_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_lg_grp_cd, true);
		p.Cnd_strg_lg_grp_cd.setLinkBeans(p.Cnd_strg_lg_grp_nm);
		p.CndPanel.add(p.Cnd_strg_lg_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_lg_grp_cd);
		p.Cnd_strg_lg_grp_cd.setNextBeans(p.Cnd_strg_lg_grp_nm);
		p.Cnd_strg_lg_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_lg_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_lg_grp_nm);
		p.Cnd_strg_lg_grp_nm.setNextBeans(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_lg_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_lg_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_lg_grp_nm, true);
		p.Cnd_strg_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_cd, true);
		p.Cnd_strg_loc_grp_cd.setLinkBeans(p.Cnd_strg_loc_grp_nm);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_strg_loc_grp_cd);
		p.Cnd_strg_loc_grp_cd.setNextBeans(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_strg_loc_grp_nm);
		p.Cnd_strg_loc_grp_nm.setNextBeans(p.Cnd_mfg_loc_cd);
		p.Cnd_strg_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.strg_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_strg_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_mfg_loc_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_loc_cd);
		p.Cnd_mfg_loc_cd.setNextBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_loc_cd_META);
		p.Cnd_mfg_loc_cd.addLinkBeans(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_loc_cd, true);
		p.CndPanel.add(p.Cnd_mfg_loc_nm);
		p.Cnd_mfg_loc_nm.setNextBeans(p.Cnd_mfg_site_cd);
		p.Cnd_mfg_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_loc_nm, true);
		p.Cnd_mfg_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_mfg_site_cd, true);
		p.Cnd_mfg_site_cd.setLinkBeans(p.Cnd_mfg_site_nm);
		p.CndPanel.add(p.Cnd_mfg_site_cd_Label);
		p.CndPanel.add(p.Cnd_mfg_site_cd);
		p.Cnd_mfg_site_cd.setNextBeans(p.Cnd_mfg_site_nm);
		p.Cnd_mfg_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_site_cd_META);
		p.CndPanel.add(p.Cnd_mfg_site_nm);
		p.Cnd_mfg_site_nm.setNextBeans(p.Cnd_rqst_loc_cd);
		p.Cnd_mfg_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.mfg_site_nm_META);
		p.setPluralValueEnable(p.Cnd_mfg_site_nm, true);
		p.CndPanel.add(p.Cnd_rqst_loc_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_loc_cd);
		p.Cnd_rqst_loc_cd.setNextBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_loc_cd_META);
		p.Cnd_rqst_loc_cd.addLinkBeans(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_loc_cd, true);
		p.CndPanel.add(p.Cnd_rqst_loc_nm);
		p.Cnd_rqst_loc_nm.setNextBeans(p.Cnd_rqst_site_cd);
		p.Cnd_rqst_loc_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_loc_nm, true);
		p.Cnd_rqst_site_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_site_cd, true);
		p.Cnd_rqst_site_cd.setLinkBeans(p.Cnd_rqst_site_nm);
		p.CndPanel.add(p.Cnd_rqst_site_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_site_cd);
		p.Cnd_rqst_site_cd.setNextBeans(p.Cnd_rqst_site_nm);
		p.Cnd_rqst_site_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_site_cd_META);
		p.CndPanel.add(p.Cnd_rqst_site_nm);
		p.Cnd_rqst_site_nm.setNextBeans(p.Cnd_rqst_loc_grp_cd);
		p.Cnd_rqst_site_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_site_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_site_nm, true);
		p.Cnd_rqst_loc_grp_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_rqst_loc_grp_cd, true);
		p.Cnd_rqst_loc_grp_cd.setLinkBeans(p.Cnd_rqst_loc_grp_nm);
		p.CndPanel.add(p.Cnd_rqst_loc_grp_cd_Label);
		p.CndPanel.add(p.Cnd_rqst_loc_grp_cd);
		p.Cnd_rqst_loc_grp_cd.setNextBeans(p.Cnd_rqst_loc_grp_nm);
		p.Cnd_rqst_loc_grp_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_loc_grp_cd_META);
		p.CndPanel.add(p.Cnd_rqst_loc_grp_nm);
		p.Cnd_rqst_loc_grp_nm.setNextBeans(p.Cnd_sppl_cd);
		p.Cnd_rqst_loc_grp_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqst_loc_grp_nm_META);
		p.setPluralValueEnable(p.Cnd_rqst_loc_grp_nm, true);
		p.CndPanel.add(p.Cnd_sppl_cd_Label);
		p.CndPanel.add(p.Cnd_sppl_cd);
		p.Cnd_sppl_cd.setNextBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sppl_cd_META);
		p.Cnd_sppl_cd.addLinkBeans(p.Cnd_sppl_nm);
		p.Cnd_sppl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sppl_cd, true);
		p.CndPanel.add(p.Cnd_sppl_nm);
		p.Cnd_sppl_nm.setNextBeans(p.Cnd_maker_cd);
		p.Cnd_sppl_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sppl_nm_META);
		p.setPluralValueEnable(p.Cnd_sppl_nm, true);
		p.CndPanel.add(p.Cnd_maker_cd_Label);
		p.CndPanel.add(p.Cnd_maker_cd);
		p.Cnd_maker_cd.setNextBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.maker_cd_META);
		p.Cnd_maker_cd.addLinkBeans(p.Cnd_maker_nm);
		p.Cnd_maker_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_maker_cd, true);
		p.CndPanel.add(p.Cnd_maker_nm);
		p.Cnd_maker_nm.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_maker_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.maker_nm_META);
		p.setPluralValueEnable(p.Cnd_maker_nm, true);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_ord_gnrt_typ);
		p.Cnd_ord_gnrt_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ord_gnrt_typ, true);
		p.Cnd_ord_gnrt_typ.setLinkBeans(p.Cnd_ord_gnrt_typ_nm);
		p.CndPanel.add(p.Cnd_ord_gnrt_typ_Label);
		p.CndPanel.add(p.Cnd_ord_gnrt_typ);
		p.Cnd_ord_gnrt_typ.setNextBeans(p.Cnd_ord_gnrt_typ_nm);
		p.Cnd_ord_gnrt_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ord_gnrt_typ_META);
		p.CndPanel.add(p.Cnd_ord_gnrt_typ_nm);
		p.Cnd_ord_gnrt_typ_nm.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_ord_gnrt_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ord_gnrt_typ_nm_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no_p_PPanel);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_cd, true);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub1,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub1, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub2,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub2, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_itm_nm,p.Cnd_itm_sub3);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_sub3, true);
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_itm_nm);
		p.setPluralValueEnable(p.Cnd_itm_p_PPanel.Itm_itm_nm, true);
		p.CndPanel.add(p.Cnd_ver_no_p_PPanel);
		p.Cnd_ver_no_p_PPanel.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_itm_ord_no);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.CndPanel.add(p.Cnd_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_itm_ord_no);
		p.Cnd_itm_ord_no.setNextBeans(p.Cnd_rqmt_no);
		p.Cnd_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_itm_ord_no, true);
		p.CndPanel.add(p.Cnd_rqmt_no_Label);
		p.CndPanel.add(p.Cnd_rqmt_no);
		p.Cnd_rqmt_no.setNextBeans(p.Cnd_sim_mrp_no);
		p.Cnd_rqmt_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.rqmt_no_META);
		p.setPluralValueEnable(p.Cnd_rqmt_no, true);
		p.CndPanel.add(p.Cnd_sim_mrp_no_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_no);
		p.Cnd_sim_mrp_no.setNextBeans(p.Cnd_intr_rmrks);
		p.Cnd_sim_mrp_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sim_mrp_no_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_no, true);
		p.CndPanel.add(p.Cnd_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_intr_rmrks);
		p.Cnd_intr_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setNextBeans(p.Cnd_ext_sys_cd);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.CndPanel.add(p.Cnd_ext_sys_cd_Label);
		p.CndPanel.add(p.Cnd_ext_sys_cd);
		p.Cnd_ext_sys_cd.setNextBeans(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ext_sys_cd_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_cd, true);
		p.CndPanel.add(p.Cnd_ext_sys_nm_Label);
		p.CndPanel.add(p.Cnd_ext_sys_nm);
		p.Cnd_ext_sys_nm.setNextBeans(p.Cnd_ext_itm_ord_no);
		p.Cnd_ext_sys_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ext_sys_nm_META);
		p.setPluralValueEnable(p.Cnd_ext_sys_nm, true);
		p.CndPanel.add(p.Cnd_ext_itm_ord_no_Label);
		p.CndPanel.add(p.Cnd_ext_itm_ord_no);
		p.Cnd_ext_itm_ord_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0050.CndR.ext_itm_ord_no_META);
		p.setPluralValueEnable(p.Cnd_ext_itm_ord_no, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRPnl(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.add(p.RsltPanel);
		p.RsltPanel.setNextBeans(p.BtnPanel);
		p.RsltPanel.add(p.RsltScrollPane);
		p.RsltPanel.setLastBeans(p.RsltTable);
		p.RsltScrollPane.setViewportView(p.RsltTable);
		p.RsltTable.setList(p.getRsltL());
		p.RsltTable.setStatusColumnVisible(false);
		p.RsltPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MSBCP_OrdSrch p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setValueCheck(false);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBCP0040.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBCP0040);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBCP0040);
		p.Btn_open_MSBCP0040.setNextBeans(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setFunctionKey(MCFunctionKey.F4);
		p.BtnPanel.add(p.Btn_open_MSBCP0080);
		p.Btn_open_MSBCP0080.setNextBeans(p.Btn_open_MSBCP0090);
		p.Btn_open_MSBCP0090.setFunctionKey(MCFunctionKey.F5);
		p.BtnPanel.add(p.Btn_open_MSBCP0090);
		p.Btn_open_MSBCP0090.setNextBeans(p.Btn_open_MSBCP0070);
		p.Btn_open_MSBCP0070.setFunctionKey(MCFunctionKey.F6);
		p.BtnPanel.add(p.Btn_open_MSBCP0070);
		p.Btn_open_MSBCP0070.setNextBeans(p.Btn_open_MSBCP0060);
		p.Btn_open_MSBCP0060.setFunctionKey(MCFunctionKey.F7);
		p.BtnPanel.add(p.Btn_open_MSBCP0060);
		p.Btn_open_MSBCP0060.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_async_flg);
		p.BtnPanel.add(p.Btn_async_flg);
		p.Btn_async_flg.setNextBeans(p.Btn_upd);
		p.Btn_async_flg.setRow(p.getBtnR(), mcframe.clientMSBC.MSBCP0050.BtnR.async_flg_META);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_upd.setNextBeans(p.Btn_upd2);
		p.Btn_upd2.setIcon("REGISTER");
		p.Btn_upd2.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd2);
		p.Btn_upd2.setNextBeans(p.Btn_upd3);
		p.Btn_upd3.setIcon("REGISTER");
		p.Btn_upd3.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd3);
		p.Btn_upd3.setNextBeans(p.Btn_upd4);
		p.Btn_upd4.setIcon("REGISTER");
		p.Btn_upd4.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd4);
		p.Btn_upd4.setNextBeans(p.Btn_upd5);
		p.Btn_upd5.setIcon("REGISTER");
		p.Btn_upd5.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd5);
		p.Btn_upd5.setNextBeans(p.Btn_ins01);
		p.Btn_ins01.setIcon("REGISTER");
		p.Btn_ins01.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_ins01);
		p.Btn_del.setIcon("CANCEL");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_OrdSrch p) {
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
		MSBCP_OrdSrch_MC.mcInitScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitTop((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitFold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitTab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitTab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitSts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitOrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitFixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitOrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitOrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitSchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitCnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitCnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitCtrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitRPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitRslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitBtn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.mcInitEastBtn((MSBCP_OrdSrch)this);

		// [SRCH_SAV]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__SAV_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_FIX]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__FIX_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_CANSAV]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANSAV_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_CANFIX]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__CANFIX_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_MOD]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__MOD_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__DEL_EastBtn((MSBCP_OrdSrch)this);

		// [SRCH_REF]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitSRCH__REF_EastBtn((MSBCP_OrdSrch)this);

		// [IMP_FILE]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitIMP__FILE_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_SAV]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__SAV_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_FIX]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__FIX_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_CANSAV]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANSAV_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_CANFIX]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__CANFIX_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_MOD]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__MOD_EastBtn((MSBCP_OrdSrch)this);

		// [UPD_DEL]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitUPD__DEL_EastBtn((MSBCP_OrdSrch)this);

		// [REF]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitREF_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitREF_EastBtn((MSBCP_OrdSrch)this);

		// [INS]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitINS_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitINS_EastBtn((MSBCP_OrdSrch)this);

		// [FIX_I]ステータスのモードの設定
		MSBCP_OrdSrch_MC.statusInitFIX__I_ScreenOpe((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Top((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Fold((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Tab1((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Tab2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Sts((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_OrdTyp((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_FixFlg((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_OrdRcv((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_OrdSnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_SchedLink((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Cnd((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Cnd2((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Ctrl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_RPnl((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Rslt((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_Btn((MSBCP_OrdSrch)this);
		MSBCP_OrdSrch_MC.statusInitFIX__I_EastBtn((MSBCP_OrdSrch)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_OrdSrch p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Sts]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSts(MSBCP_OrdSrch p) {
	}

	/**
	 *  [OrdTyp]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrdTyp(MSBCP_OrdSrch p) {
	}

	/**
	 *  [FixFlg]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFixFlg(MSBCP_OrdSrch p) {
	}

	/**
	 *  [OrdRcv]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrdRcv(MSBCP_OrdSrch p) {
	}

	/**
	 *  [OrdSnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitOrdSnd(MSBCP_OrdSrch p) {
	}

	/**
	 *  [SchedLink]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSchedLink(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_OrdSrch p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_SAV.addAllListener(p);
		p.Cnd_ope_FIX.addAllListener(p);
		p.Cnd_ope_CANSAV.addAllListener(p);
		p.Cnd_ope_CANFIX.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_IMP.addAllListener(p);
		p.Cnd_opn_flg.addAllListener(p);
		p.Cnd_sav_flg.addAllListener(p);
		p.Cnd_fix_flg.addAllListener(p);
		p.Cnd_part_inst_flg.addAllListener(p);
		p.Cnd_inst_flg.addAllListener(p);
		p.Cnd_cmpl_flg.addAllListener(p);
		p.Cnd_mfg_flg.addAllListener(p);
		p.Cnd_purc_flg.addAllListener(p);
		p.Cnd_outsrc_flg.addAllListener(p);
		p.Cnd_xfr_flg.addAllListener(p);
		p.Cnd_wg_xfr_flg.addAllListener(p);
		p.Cnd_true_not_fix_flg.addAllListener(p);
		p.Cnd_false_not_fix_flg.addAllListener(p);
		p.Cnd_ord_rcv_tgt_flg.addAllListener(p);
		p.Cnd_not_ord_rcv_tgt_flg.addAllListener(p);
		p.Cnd_ord_snd_tgt_flg.addAllListener(p);
		p.Cnd_not_ord_snd_tgt_flg.addAllListener(p);
		p.Cnd_before_frozen_flg.addAllListener(p);
		p.Cnd_frozen_flg.addAllListener(p);
		p.Cnd_mfg_st_schd_dt_fr.setListListener(p);
		p.Cnd_mfg_st_schd_dt_fr.addAllListener(p);
		p.Cnd_mfg_st_schd_dt_to.setListListener(p);
		p.Cnd_mfg_st_schd_dt_to.addAllListener(p);
		p.Cnd_mfg_end_schd_dt_fr.setListListener(p);
		p.Cnd_mfg_end_schd_dt_fr.addAllListener(p);
		p.Cnd_mfg_end_schd_dt_to.setListListener(p);
		p.Cnd_mfg_end_schd_dt_to.addAllListener(p);
		p.Cnd_po_schd_dt_fr.setListListener(p);
		p.Cnd_po_schd_dt_fr.addAllListener(p);
		p.Cnd_po_schd_dt_to.setListListener(p);
		p.Cnd_po_schd_dt_to.addAllListener(p);
		p.Cnd_gi_schd_dt_fr.setListListener(p);
		p.Cnd_gi_schd_dt_fr.addAllListener(p);
		p.Cnd_gi_schd_dt_to.setListListener(p);
		p.Cnd_gi_schd_dt_to.addAllListener(p);
		p.Cnd_avl_schd_dt_fr.setListListener(p);
		p.Cnd_avl_schd_dt_fr.addAllListener(p);
		p.Cnd_avl_schd_dt_to.setListListener(p);
		p.Cnd_avl_schd_dt_to.addAllListener(p);
		p.Cnd_strg_schd_dt_fr.setListListener(p);
		p.Cnd_strg_schd_dt_fr.addAllListener(p);
		p.Cnd_strg_schd_dt_to.setListListener(p);
		p.Cnd_strg_schd_dt_to.addAllListener(p);
		p.Cnd_accpt_schd_dt_fr.setListListener(p);
		p.Cnd_accpt_schd_dt_fr.addAllListener(p);
		p.Cnd_accpt_schd_dt_to.setListListener(p);
		p.Cnd_accpt_schd_dt_to.addAllListener(p);
		p.Cnd_insp_st_schd_dt_fr.setListListener(p);
		p.Cnd_insp_st_schd_dt_fr.addAllListener(p);
		p.Cnd_insp_st_schd_dt_to.setListListener(p);
		p.Cnd_insp_st_schd_dt_to.addAllListener(p);
		p.Cnd_insp_end_schd_dt_fr.setListListener(p);
		p.Cnd_insp_end_schd_dt_fr.addAllListener(p);
		p.Cnd_insp_end_schd_dt_to.setListListener(p);
		p.Cnd_insp_end_schd_dt_to.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_rqst_wg_cd.setListListener(p);
		p.Cnd_rqst_wg_cd.addAllListener(p);
		p.Cnd_rqst_wg_nm.setListListener(p);
		p.Cnd_rqst_wg_nm.addAllListener(p);
		p.Cnd_strg_alloc_grp_cd.setListListener(p);
		p.Cnd_strg_alloc_grp_cd.addAllListener(p);
		p.Cnd_strg_alloc_grp_nm.setListListener(p);
		p.Cnd_strg_alloc_grp_nm.addAllListener(p);
		p.Cnd_mfg_loc_grp_cd.setListListener(p);
		p.Cnd_mfg_loc_grp_cd.addAllListener(p);
		p.Cnd_mfg_loc_grp_nm.setListListener(p);
		p.Cnd_mfg_loc_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_cd.setListListener(p);
		p.Cnd_strg_loc_cd.addAllListener(p);
		p.Cnd_strg_loc_nm.setListListener(p);
		p.Cnd_strg_loc_nm.addAllListener(p);
		p.Cnd_strg_site_cd.setListListener(p);
		p.Cnd_strg_site_cd.addAllListener(p);
		p.Cnd_strg_site_nm.setListListener(p);
		p.Cnd_strg_site_nm.addAllListener(p);
		p.Cnd_strg_lg_grp_cd.setListListener(p);
		p.Cnd_strg_lg_grp_cd.addAllListener(p);
		p.Cnd_strg_lg_grp_nm.setListListener(p);
		p.Cnd_strg_lg_grp_nm.addAllListener(p);
		p.Cnd_strg_loc_grp_cd.setListListener(p);
		p.Cnd_strg_loc_grp_cd.addAllListener(p);
		p.Cnd_strg_loc_grp_nm.setListListener(p);
		p.Cnd_strg_loc_grp_nm.addAllListener(p);
		p.Cnd_mfg_loc_cd.setListListener(p);
		p.Cnd_mfg_loc_cd.addAllListener(p);
		p.Cnd_mfg_loc_nm.setListListener(p);
		p.Cnd_mfg_loc_nm.addAllListener(p);
		p.Cnd_mfg_site_cd.setListListener(p);
		p.Cnd_mfg_site_cd.addAllListener(p);
		p.Cnd_mfg_site_nm.setListListener(p);
		p.Cnd_mfg_site_nm.addAllListener(p);
		p.Cnd_rqst_loc_cd.setListListener(p);
		p.Cnd_rqst_loc_cd.addAllListener(p);
		p.Cnd_rqst_loc_nm.setListListener(p);
		p.Cnd_rqst_loc_nm.addAllListener(p);
		p.Cnd_rqst_site_cd.setListListener(p);
		p.Cnd_rqst_site_cd.addAllListener(p);
		p.Cnd_rqst_site_nm.setListListener(p);
		p.Cnd_rqst_site_nm.addAllListener(p);
		p.Cnd_rqst_loc_grp_cd.setListListener(p);
		p.Cnd_rqst_loc_grp_cd.addAllListener(p);
		p.Cnd_rqst_loc_grp_nm.setListListener(p);
		p.Cnd_rqst_loc_grp_nm.addAllListener(p);
		p.Cnd_sppl_cd.setListListener(p);
		p.Cnd_sppl_cd.addAllListener(p);
		p.Cnd_sppl_nm.setListListener(p);
		p.Cnd_sppl_nm.addAllListener(p);
		p.Cnd_maker_cd.setListListener(p);
		p.Cnd_maker_cd.addAllListener(p);
		p.Cnd_maker_nm.setListListener(p);
		p.Cnd_maker_nm.addAllListener(p);
		p.Cnd_ord_gnrt_typ.setListListener(p);
		p.Cnd_ord_gnrt_typ.addAllListener(p);
		p.Cnd_ord_gnrt_typ_nm.setListListener(p);
		p.Cnd_ord_gnrt_typ_nm.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_ord_no.setListListener(p);
		p.Cnd_itm_ord_no.addAllListener(p);
		p.Cnd_rqmt_no.setListListener(p);
		p.Cnd_rqmt_no.addAllListener(p);
		p.Cnd_sim_mrp_no.setListListener(p);
		p.Cnd_sim_mrp_no.addAllListener(p);
		p.Cnd_intr_rmrks.setListListener(p);
		p.Cnd_intr_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
		p.Cnd_ext_sys_cd.setListListener(p);
		p.Cnd_ext_sys_cd.addAllListener(p);
		p.Cnd_ext_sys_nm.setListListener(p);
		p.Cnd_ext_sys_nm.addAllListener(p);
		p.Cnd_ext_itm_ord_no.setListListener(p);
		p.Cnd_ext_itm_ord_no.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBCP_OrdSrch p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_OrdSrch p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBCP_OrdSrch p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBCP_OrdSrch p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_itm_ord_no.addAllListener(p);
		p.columnRslt_itm_ord_no.setListListener(p);
		p.columnRslt_itm_ord_typ.addAllListener(p);
		p.columnRslt_itm_ord_typ.setListListener(p);
		p.columnRslt_itm_ord_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_typ_nm.setListListener(p);
		p.columnRslt_itm_ord_sts_typ.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ.setListListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.addAllListener(p);
		p.columnRslt_itm_ord_sts_typ_nm.setListListener(p);
		p.columnRslt_oper_sav_flg.addAllListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_dec_place.addAllListener(p);
		p.columnRslt_dec_place.setListListener(p);
		p.columnRslt_rnd_typ.addAllListener(p);
		p.columnRslt_rnd_typ.setListListener(p);
		p.columnRslt_oper_ptn.addAllListener(p);
		p.columnRslt_oper_ptn.setListListener(p);
		p.columnRslt_bom_ptn.addAllListener(p);
		p.columnRslt_bom_ptn.setListListener(p);
		p.columnRslt_nmr_qty.addAllListener(p);
		p.columnRslt_nmr_qty.setListListener(p);
		p.columnRslt_dnm_qty.addAllListener(p);
		p.columnRslt_dnm_qty.setListListener(p);
		p.columnRslt_fxd_yield_qty.addAllListener(p);
		p.columnRslt_fxd_yield_qty.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_master_dt.addAllListener(p);
		p.columnRslt_master_dt.setListListener(p);
		p.columnRslt_po_schd_dt.addAllListener(p);
		p.columnRslt_po_schd_dt.setListListener(p);
		p.columnRslt_purc_lt.addAllListener(p);
		p.columnRslt_purc_lt.setListListener(p);
		p.columnRslt_mfg_st_schd_dt.addAllListener(p);
		p.columnRslt_mfg_st_schd_dt.setListListener(p);
		p.columnRslt_mfg_lt.addAllListener(p);
		p.columnRslt_mfg_lt.setListListener(p);
		p.columnRslt_mfg_end_schd_dt.addAllListener(p);
		p.columnRslt_mfg_end_schd_dt.setListListener(p);
		p.columnRslt_gi_schd_dt.addAllListener(p);
		p.columnRslt_gi_schd_dt.setListListener(p);
		p.columnRslt_xfr_lt.addAllListener(p);
		p.columnRslt_xfr_lt.setListListener(p);
		p.columnRslt_strg_schd_dt.addAllListener(p);
		p.columnRslt_strg_schd_dt.setListListener(p);
		p.columnRslt_accpt_insp_lt.addAllListener(p);
		p.columnRslt_accpt_insp_lt.setListListener(p);
		p.columnRslt_accpt_schd_dt.addAllListener(p);
		p.columnRslt_accpt_schd_dt.setListListener(p);
		p.columnRslt_insp_flg.addAllListener(p);
		p.columnRslt_insp_st_schd_dt.addAllListener(p);
		p.columnRslt_insp_st_schd_dt.setListListener(p);
		p.columnRslt_insp_lt.addAllListener(p);
		p.columnRslt_insp_lt.setListListener(p);
		p.columnRslt_insp_offst.addAllListener(p);
		p.columnRslt_insp_offst.setListListener(p);
		p.columnRslt_insp_end_schd_dt.addAllListener(p);
		p.columnRslt_insp_end_schd_dt.setListListener(p);
		p.columnRslt_avl_schd_dt.addAllListener(p);
		p.columnRslt_avl_schd_dt.setListListener(p);
		p.columnRslt_strg_site_cd.addAllListener(p);
		p.columnRslt_strg_site_cd.setListListener(p);
		p.columnRslt_strg_site_nm.addAllListener(p);
		p.columnRslt_strg_site_nm.setListListener(p);
		p.columnRslt_strg_lg_grp_cd.addAllListener(p);
		p.columnRslt_strg_lg_grp_cd.setListListener(p);
		p.columnRslt_strg_lg_grp_nm.addAllListener(p);
		p.columnRslt_strg_lg_grp_nm.setListListener(p);
		p.columnRslt_strg_alloc_grp_cd.addAllListener(p);
		p.columnRslt_strg_alloc_grp_cd.setListListener(p);
		p.columnRslt_strg_alloc_grp_nm.addAllListener(p);
		p.columnRslt_strg_alloc_grp_nm.setListListener(p);
		p.columnRslt_strg_loc_grp_cd.addAllListener(p);
		p.columnRslt_strg_loc_grp_cd.setListListener(p);
		p.columnRslt_strg_loc_grp_nm.addAllListener(p);
		p.columnRslt_strg_loc_grp_nm.setListListener(p);
		p.columnRslt_strg_loc_cd.addAllListener(p);
		p.columnRslt_strg_loc_cd.setListListener(p);
		p.columnRslt_strg_loc_nm.addAllListener(p);
		p.columnRslt_strg_loc_nm.setListListener(p);
		p.columnRslt_mfg_site_cd.addAllListener(p);
		p.columnRslt_mfg_site_cd.setListListener(p);
		p.columnRslt_mfg_site_nm.addAllListener(p);
		p.columnRslt_mfg_site_nm.setListListener(p);
		p.columnRslt_mfg_loc_grp_cd.addAllListener(p);
		p.columnRslt_mfg_loc_grp_cd.setListListener(p);
		p.columnRslt_mfg_loc_grp_nm.addAllListener(p);
		p.columnRslt_mfg_loc_grp_nm.setListListener(p);
		p.columnRslt_mfg_loc_cd.addAllListener(p);
		p.columnRslt_mfg_loc_cd.setListListener(p);
		p.columnRslt_mfg_loc_nm.addAllListener(p);
		p.columnRslt_mfg_loc_nm.setListListener(p);
		p.columnRslt_sppl_cd.addAllListener(p);
		p.columnRslt_sppl_cd.setListListener(p);
		p.columnRslt_sppl_nm.addAllListener(p);
		p.columnRslt_sppl_nm.setListListener(p);
		p.columnRslt_maker_cd.addAllListener(p);
		p.columnRslt_maker_cd.setListListener(p);
		p.columnRslt_maker_nm.addAllListener(p);
		p.columnRslt_maker_nm.setListListener(p);
		p.columnRslt_rqst_site_cd.addAllListener(p);
		p.columnRslt_rqst_site_cd.setListListener(p);
		p.columnRslt_rqst_site_nm.addAllListener(p);
		p.columnRslt_rqst_site_nm.setListListener(p);
		p.columnRslt_rqst_loc_grp_cd.addAllListener(p);
		p.columnRslt_rqst_loc_grp_cd.setListListener(p);
		p.columnRslt_rqst_loc_grp_nm.addAllListener(p);
		p.columnRslt_rqst_loc_grp_nm.setListListener(p);
		p.columnRslt_rqst_loc_cd.addAllListener(p);
		p.columnRslt_rqst_loc_cd.setListListener(p);
		p.columnRslt_rqst_loc_nm.addAllListener(p);
		p.columnRslt_rqst_loc_nm.setListListener(p);
		p.columnRslt_rqst_wg_cd.addAllListener(p);
		p.columnRslt_rqst_wg_cd.setListListener(p);
		p.columnRslt_rqst_wg_nm.addAllListener(p);
		p.columnRslt_rqst_wg_nm.setListListener(p);
		p.columnRslt_rqmt_no.addAllListener(p);
		p.columnRslt_rqmt_no.setListListener(p);
		p.columnRslt_ord_gnrt_typ.addAllListener(p);
		p.columnRslt_ord_gnrt_typ.setListListener(p);
		p.columnRslt_ord_gnrt_typ_nm.addAllListener(p);
		p.columnRslt_ord_gnrt_typ_nm.setListListener(p);
		p.columnRslt_io_schd_pr_no.addAllListener(p);
		p.columnRslt_io_schd_pr_no.setListListener(p);
		p.columnRslt_sim_mrp_no.addAllListener(p);
		p.columnRslt_sim_mrp_no.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_not_fix_flg.addAllListener(p);
		p.columnRslt_inst_po_cnt_rmrks.addAllListener(p);
		p.columnRslt_inst_po_cnt_rmrks.setListListener(p);
		p.columnRslt_intr_rmrks.addAllListener(p);
		p.columnRslt_intr_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_ord_rcv_flg.addAllListener(p);
		p.columnRslt_ord_snd_flg.addAllListener(p);
		p.columnRslt_ext_sys_cd.addAllListener(p);
		p.columnRslt_ext_sys_cd.setListListener(p);
		p.columnRslt_ext_sys_nm.addAllListener(p);
		p.columnRslt_ext_sys_nm.setListListener(p);
		p.columnRslt_ext_itm_ord_no.addAllListener(p);
		p.columnRslt_ext_itm_ord_no.setListListener(p);
		p.columnRslt_for_scheduler_frozen_flg.addAllListener(p);
		p.columnRslt_scheduler_frozen_flg.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
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
		p.columnRslt_itm_order_upd_cntr.addAllListener(p);
		p.columnRslt_itm_order_upd_cntr.setListListener(p);
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
		p.columnRslt_upd_tgt_flg.addAllListener(p);
		p.columnRslt_modify_tgt_flg.addAllListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBCP_OrdSrch p) {
		p.Btn_open_MSBCP0040.addAllListener(p);
		p.Btn_open_MSBCP0040.setAPMethodName("doBtn_open_MSBCP0040");
		p.Btn_open_MSBCP0080.addAllListener(p);
		p.Btn_open_MSBCP0080.setAPMethodName("doBtn_open_MSBCP0080");
		p.Btn_open_MSBCP0090.addAllListener(p);
		p.Btn_open_MSBCP0090.setAPMethodName("doBtn_open_MSBCP0090");
		p.Btn_open_MSBCP0070.addAllListener(p);
		p.Btn_open_MSBCP0070.setAPMethodName("doBtn_open_MSBCP0070");
		p.Btn_open_MSBCP0060.addAllListener(p);
		p.Btn_open_MSBCP0060.setAPMethodName("doBtn_open_MSBCP0060");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_async_flg.addAllListener(p);
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_upd2.addAllListener(p);
		p.Btn_upd2.setAPMethodName("doBtn_upd2");
		p.Btn_upd3.addAllListener(p);
		p.Btn_upd3.setAPMethodName("doBtn_upd3");
		p.Btn_upd4.addAllListener(p);
		p.Btn_upd4.setAPMethodName("doBtn_upd4");
		p.Btn_upd5.addAllListener(p);
		p.Btn_upd5.setAPMethodName("doBtn_upd5");
		p.Btn_ins01.addAllListener(p);
		p.Btn_ins01.setAPMethodName("doBtn_ins01");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_OrdSrch p) {
	}

	/**
	 * [SRCH_SAV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_SAV, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_SAV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_SAV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_SAV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_SAV, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_SAV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_SAV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_SAV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_SAV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_SAV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_SAV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_SAV, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_SAV, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_SAV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_SAV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_SAV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__SAV_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_FIX, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_FIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_FIX, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_FIX, MCMode.ENABLE);

	}

	/**
	 * [SRCH_FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_FIX, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_FIX, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_FIX, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH_FIX, MCMode.DISABLE);
		p.Btn_upd3.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_FIX, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_FIX, MCMode.DISABLE);

	}

	/**
	 * [SRCH_FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__FIX_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_sav_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_CANSAV, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_CANSAV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_CANSAV, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_CANSAV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_CANSAV, MCMode.ENABLE);

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_CANSAV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_CANSAV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_CANSAV, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_CANSAV, MCMode.DISABLE);
		p.Btn_upd4.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_CANSAV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_CANSAV, MCMode.DISABLE);

	}

	/**
	 * [SRCH_CANSAV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANSAV_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Cnd_sav_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_CANFIX, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_CANFIX, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_CANFIX, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_CANFIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_CANFIX, MCMode.ENABLE);

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_CANFIX, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_CANFIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_CANFIX, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_CANFIX, MCMode.DISABLE);
		p.Btn_upd5.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_CANFIX, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_CANFIX, MCMode.DISABLE);

	}

	/**
	 * [SRCH_CANFIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__CANFIX_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_MOD, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_MOD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_MOD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_MOD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_MOD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_MOD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_MOD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_MOD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_MOD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_MOD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_MOD, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_MOD, MCMode.DISABLE);
		p.Btn_ins01.putMode(p, SRCH_MOD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_MOD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__MOD_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_mfg_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, SRCH_REF, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, SRCH_REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [SRCH_REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(SRCH_REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, SRCH_REF, MCMode.ENABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, SRCH_REF, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, SRCH_REF, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, SRCH_REF, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, SRCH_REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, SRCH_REF, MCMode.DISABLE);

	}

	/**
	 * [SRCH_REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__REF_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(IMP_FILE, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, IMP_FILE, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [IMP_FILE]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [IMP_FILE]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(IMP_FILE, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [IMP_FILE]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, IMP_FILE, MCMode.DISABLE);

	}

	/**
	 * [IMP_FILE]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(IMP_FILE, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(IMP_FILE, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, IMP_FILE, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, IMP_FILE, MCMode.INVISIBLE);

	}

	/**
	 * [IMP_FILE]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, IMP_FILE, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, IMP_FILE, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, IMP_FILE, MCMode.DISABLE);
		p.Btn_del.putMode(p, IMP_FILE, MCMode.DISABLE);

	}

	/**
	 * [IMP_FILE]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitIMP__FILE_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_SAV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_SAV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_SAV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_SAV, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_SAV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_SAV, MCMode.ENABLE);

	}

	/**
	 * [UPD_SAV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_SAV, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_SAV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_SAV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_SAV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_SAV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_SAV, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD_SAV, MCMode.ENABLE);
		p.Btn_upd2.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, UPD_SAV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_SAV, MCMode.DISABLE);

	}

	/**
	 * [UPD_SAV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__SAV_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_FIX, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_FIX, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_FIX, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_FIX, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Btn_upd3.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_FIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_sav_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_fix_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_CANSAV]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANSAV]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_CANSAV, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_CANSAV]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_CANSAV, MCMode.ENABLE);

	}

	/**
	 * [UPD_CANSAV]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_CANSAV, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_CANSAV, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CANSAV]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_CANSAV, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, UPD_CANSAV, MCMode.ENABLE);
		p.Btn_upd4.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, UPD_CANSAV, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_CANSAV, MCMode.DISABLE);

	}

	/**
	 * [UPD_CANSAV]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANSAV_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Cnd_sav_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_CANFIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_CANFIX, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_CANFIX, MCMode.ENABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_CANFIX, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_CANFIX, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_CANFIX, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, UPD_CANFIX, MCMode.ENABLE);
		p.Btn_upd5.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, UPD_CANFIX, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_CANFIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_CANFIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__CANFIX_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_MOD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_MOD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_MOD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_MOD, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_MOD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_MOD, MCMode.ENABLE);

	}

	/**
	 * [UPD_MOD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_purc_lt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_mfg_lt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_xfr_lt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_insp_flg.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_insp_lt.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_MOD, MCMode.REQUIRED);
		p.columnRslt_strg_site_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_MOD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.columnRslt_sub_char1.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_MOD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_MOD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_MOD, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, UPD_MOD, MCMode.ENABLE);
		p.Btn_ins01.putMode(p, UPD_MOD, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_MOD, MCMode.DISABLE);

	}

	/**
	 * [UPD_MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__MOD_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(UPD_DEL, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [UPD_DEL]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [UPD_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(UPD_DEL, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [UPD_DEL]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, UPD_DEL, MCMode.ENABLE);

	}

	/**
	 * [UPD_DEL]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, UPD_DEL, MCMode.REQUIRED);
		p.columnRslt_itm_ord_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(UPD_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(UPD_DEL, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, UPD_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD_DEL, MCMode.ENABLE);
		p.Btn_async_flg.putMode(p, UPD_DEL, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, UPD_DEL, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, UPD_DEL, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, UPD_DEL, MCMode.ENABLE);

	}

	/**
	 * [UPD_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DEL_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitREF_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitREF_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitREF_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_part_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_inst_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmpl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [REF]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(REF, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [REF]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitREF_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitREF_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.Rslt_itm_grp_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0080.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0090.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0070.putMode(p, REF, MCMode.ENABLE);
		p.Btn_open_MSBCP0060.putMode(p, REF, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, REF, MCMode.INVISIBLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINS_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINS_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINS_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitINS_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitINS_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitINS_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitINS_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitINS_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, INS, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INS]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINS_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [INS]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINS_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(INS, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [INS]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINS_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINS_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INS, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INS, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, INS, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, INS, MCMode.INVISIBLE);

	}

	/**
	 * [INS]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINS_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, INS, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, INS, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, INS, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, INS, MCMode.REQUIRED);
		p.Btn_upd.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd2.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, INS, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, INS, MCMode.ENABLE);
		p.Btn_del.putMode(p, INS, MCMode.DISABLE);

	}

	/**
	 * [INS]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINS_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_ScreenOpe(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Top(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Fold(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab1(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Tab2(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Sts]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Sts(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OrdTyp]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OrdTyp(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[FixFlg]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_FixFlg(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OrdRcv]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OrdRcv(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[OrdSnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_OrdSnd(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[SchedLink]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_SchedLink(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd(MSBCP_OrdSrch p){
		p.Cnd_ope_Group.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_opn_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_sav_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_fix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_part_inst_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_inst_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_cmpl_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_mfg_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_purc_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_outsrc_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_xfr_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_wg_xfr_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_true_not_fix_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_false_not_fix_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ord_rcv_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_not_ord_rcv_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_ord_snd_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_not_ord_snd_tgt_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_before_frozen_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_frozen_flg.putMode(p, FIX_I, MCMode.REQUIRED);
		p.Cnd_mfg_st_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_st_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_end_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_po_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_gi_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_avl_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_accpt_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_insp_st_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_fr.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_insp_end_schd_dt_to.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_wg_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_wg_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_alloc_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_site_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_site_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_lg_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_strg_loc_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_site_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_mfg_site_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_loc_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_loc_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_site_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_site_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqst_loc_grp_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sppl_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sppl_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_maker_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_maker_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_ord_gnrt_typ.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ord_gnrt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0340.MAUBP_VerNo_H.ENABLE_SRCH);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_itm_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_rqmt_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_intr_rmrks.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_sys_cd.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_sys_nm.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_ext_itm_ord_no.putMode(p, FIX_I, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Cnd2(MSBCP_OrdSrch p){

	}

	/**
	 * [FIX_I]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Ctrl(MSBCP_OrdSrch p){
		p.Ctrl_ctrl_PPanel.putStatus(FIX_I, mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.ENABLE);

	}

	/**
	 * [FIX_I]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_RPnl(MSBCP_OrdSrch p){
		p.RPnl_dwnld.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Rslt(MSBCP_OrdSrch p){
		p.columnRslt_check.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_ord_sts_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_oper_sav_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.Rslt_ver_no_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5250.MAUBP_VerNo_D.READ_ONLY);
		p.Rslt_inst_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_yield_schd_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_oper_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_bom_ptn.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_nmr_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_dnm_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_fxd_yield_qty.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Rslt_std_cont_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_inst_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_yield_cont_qty_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.Rslt_cont_unit_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5270.MAUBP_ContFctrUnit_D.READ_ONLY);
		p.columnRslt_cont_fctr_dec_place.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_master_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_po_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_purc_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_st_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_end_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_gi_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_xfr_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_accpt_insp_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_accpt_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_insp_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_insp_st_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_insp_lt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_insp_offst.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_insp_end_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_avl_schd_dt.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_lg_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_alloc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_strg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_mfg_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sppl_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sppl_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_maker_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_maker_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_site_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_grp_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_loc_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqst_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_rqmt_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(FIX_I, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ord_gnrt_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ord_gnrt_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_io_schd_pr_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sim_mrp_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_not_fix_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_inst_po_cnt_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_intr_rmrks.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ord_rcv_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ord_snd_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_sys_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ext_itm_ord_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_for_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_scheduler_frozen_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(FIX_I, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_itm_order_upd_cntr.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.columnRslt_upd_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.columnRslt_modify_tgt_flg.putMode(p, FIX_I, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_I]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_Btn(MSBCP_OrdSrch p){
		p.Btn_open_MSBCP0040.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0080.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0090.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0070.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_open_MSBCP0060.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_async_flg.putMode(p, FIX_I, MCMode.READ_ONLY);
		p.Btn_upd.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_upd2.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd3.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd4.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_upd5.putMode(p, FIX_I, MCMode.INVISIBLE);
		p.Btn_ins01.putMode(p, FIX_I, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_I, MCMode.DISABLE);

	}

	/**
	 * [FIX_I]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__I_EastBtn(MSBCP_OrdSrch p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_SAV;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_OrdSrch_MC.setTableConfigRslt((MSBCP_OrdSrch)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBCP_OrdSrch p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_no);
		p.columnRslt_itm_ord_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_ord_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ);
		p.columnRslt_itm_ord_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_ord_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_typ_nm);
		p.columnRslt_itm_ord_sts_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_ord_sts_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ);
		p.columnRslt_itm_ord_sts_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_ord_sts_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_ord_sts_typ_nm);
		p.columnRslt_oper_sav_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.oper_sav_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_sav_flg);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.RsltTable.addTable(p.Rslt_ver_no_p_PPanel.VerNoTable);
		p.RsltTable.addTable(p.Rslt_inst_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_yield_schd_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dec_place);
		p.columnRslt_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rnd_typ);
		p.columnRslt_oper_ptn.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.oper_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_oper_ptn);
		p.columnRslt_bom_ptn.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.bom_ptn_META);
		p.RsltTable.addColumnConfig(p.columnRslt_bom_ptn);
		p.columnRslt_nmr_qty.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.nmr_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_nmr_qty);
		p.columnRslt_dnm_qty.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.dnm_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_dnm_qty);
		p.columnRslt_fxd_yield_qty.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.fxd_yield_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fxd_yield_qty);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.RsltTable.addTable(p.Rslt_std_cont_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_inst_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_yield_cont_qty_p_PPanel.ContQtyTable);
		p.RsltTable.addTable(p.Rslt_cont_unit_p_PPanel.ContFctrUnitTable);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_master_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.master_dt_META);
		p.columnRslt_master_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_master_dt);
		p.columnRslt_po_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.po_schd_dt_META);
		p.columnRslt_po_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_po_schd_dt);
		p.columnRslt_purc_lt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.purc_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_purc_lt);
		p.columnRslt_mfg_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_st_schd_dt_META);
		p.columnRslt_mfg_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_st_schd_dt);
		p.columnRslt_mfg_lt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_lt);
		p.columnRslt_mfg_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_end_schd_dt_META);
		p.columnRslt_mfg_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_end_schd_dt);
		p.columnRslt_gi_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.gi_schd_dt_META);
		p.columnRslt_gi_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_gi_schd_dt);
		p.columnRslt_xfr_lt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.xfr_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_xfr_lt);
		p.columnRslt_strg_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_schd_dt_META);
		p.columnRslt_strg_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_schd_dt);
		p.columnRslt_accpt_insp_lt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.accpt_insp_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_accpt_insp_lt);
		p.columnRslt_accpt_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.accpt_schd_dt_META);
		p.columnRslt_accpt_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_accpt_schd_dt);
		p.columnRslt_insp_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.insp_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_flg);
		p.columnRslt_insp_st_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.insp_st_schd_dt_META);
		p.columnRslt_insp_st_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_st_schd_dt);
		p.columnRslt_insp_lt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.insp_lt_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_lt);
		p.columnRslt_insp_offst.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.insp_offst_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_offst);
		p.columnRslt_insp_end_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.insp_end_schd_dt_META);
		p.columnRslt_insp_end_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_end_schd_dt);
		p.columnRslt_avl_schd_dt.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.avl_schd_dt_META);
		p.columnRslt_avl_schd_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_avl_schd_dt);
		p.columnRslt_strg_site_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_site_cd);
		p.columnRslt_strg_site_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_site_nm);
		p.columnRslt_strg_lg_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_lg_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_lg_grp_cd);
		p.columnRslt_strg_lg_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_lg_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_lg_grp_nm);
		p.columnRslt_strg_alloc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_alloc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_alloc_grp_cd);
		p.columnRslt_strg_alloc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_alloc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_alloc_grp_nm);
		p.columnRslt_strg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_grp_cd);
		p.columnRslt_strg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_grp_nm);
		p.columnRslt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_cd);
		p.columnRslt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.strg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_strg_loc_nm);
		p.columnRslt_mfg_site_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_site_cd);
		p.columnRslt_mfg_site_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_site_nm);
		p.columnRslt_mfg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_cd);
		p.columnRslt_mfg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_grp_nm);
		p.columnRslt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_cd);
		p.columnRslt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.mfg_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_mfg_loc_nm);
		p.columnRslt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sppl_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_cd);
		p.columnRslt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sppl_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sppl_nm);
		p.columnRslt_maker_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.maker_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_cd);
		p.columnRslt_maker_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.maker_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_maker_nm);
		p.columnRslt_rqst_site_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_site_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_site_cd);
		p.columnRslt_rqst_site_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_site_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_site_nm);
		p.columnRslt_rqst_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_loc_grp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_grp_cd);
		p.columnRslt_rqst_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_loc_grp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_grp_nm);
		p.columnRslt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_cd);
		p.columnRslt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_loc_nm);
		p.columnRslt_rqst_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_cd);
		p.columnRslt_rqst_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqst_wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqst_wg_nm);
		p.columnRslt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.rqmt_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_rqmt_no);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_ord_gnrt_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ord_gnrt_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_gnrt_typ);
		p.columnRslt_ord_gnrt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ord_gnrt_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_gnrt_typ_nm);
		p.columnRslt_io_schd_pr_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.io_schd_pr_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_io_schd_pr_no);
		p.columnRslt_sim_mrp_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sim_mrp_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sim_mrp_no);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_not_fix_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.not_fix_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_not_fix_flg);
		p.columnRslt_inst_po_cnt_rmrks.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.inst_po_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_inst_po_cnt_rmrks);
		p.columnRslt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.intr_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_intr_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_ord_rcv_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ord_rcv_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_rcv_flg);
		p.columnRslt_ord_snd_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ord_snd_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ord_snd_flg);
		p.columnRslt_ext_sys_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ext_sys_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_cd);
		p.columnRslt_ext_sys_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ext_sys_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_sys_nm);
		p.columnRslt_ext_itm_ord_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ext_itm_ord_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ext_itm_ord_no);
		p.columnRslt_for_scheduler_frozen_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.for_scheduler_frozen_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_for_scheduler_frozen_flg);
		p.columnRslt_scheduler_frozen_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.scheduler_frozen_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_scheduler_frozen_flg);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_itm_order_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.itm_order_upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_order_upd_cntr);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_tgt_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.upd_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_tgt_flg);
		p.columnRslt_modify_tgt_flg.setMeta(mcframe.clientMSBC.MSBCP0050.RsltR.modify_tgt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_modify_tgt_flg);
		// スクロール固定カラムの指定
		p.RsltTable.setUnscrollColumn(p.columnRslt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_wg_cd.getListConfig().setPutter(getCnd_rqst_wg_cd_ListPutter());
		Cnd_strg_alloc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_alloc_grp_cd.getListConfig().setPutter(getCnd_strg_alloc_grp_cd_ListPutter());
		Cnd_mfg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_loc_grp_cd.getListConfig().setPutter(getCnd_mfg_loc_grp_cd_ListPutter());
		Cnd_strg_loc_cd.getListConfig().setPutter(getCnd_strg_loc_cd_ListPutter());
		Cnd_strg_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_site_cd.getListConfig().setPutter(getCnd_strg_site_cd_ListPutter());
		Cnd_strg_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_lg_grp_cd.getListConfig().setPutter(getCnd_strg_lg_grp_cd_ListPutter());
		Cnd_strg_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_strg_loc_grp_cd.getListConfig().setPutter(getCnd_strg_loc_grp_cd_ListPutter());
		Cnd_mfg_loc_cd.getListConfig().setPutter(getCnd_mfg_loc_cd_ListPutter());
		Cnd_mfg_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_mfg_site_cd.getListConfig().setPutter(getCnd_mfg_site_cd_ListPutter());
		Cnd_rqst_loc_cd.getListConfig().setPutter(getCnd_rqst_loc_cd_ListPutter());
		Cnd_rqst_site_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_site_cd.getListConfig().setPutter(getCnd_rqst_site_cd_ListPutter());
		Cnd_rqst_loc_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rqst_loc_grp_cd.getListConfig().setPutter(getCnd_rqst_loc_grp_cd_ListPutter());
		Cnd_sppl_cd.getListConfig().setPutter(getCnd_sppl_cd_ListPutter());
		Cnd_maker_cd.getListConfig().setPutter(getCnd_maker_cd_ListPutter());
		Cnd_ord_gnrt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ord_gnrt_typ.getListConfig().setPutter(getCnd_ord_gnrt_typ_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
	}

	/**
	 * この画面を[SRCH_SAV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_SAVStatus() {
		status = SRCH_SAV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_FIXStatus() {
		status = SRCH_FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_CANSAV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_CANSAVStatus() {
		status = SRCH_CANSAV;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_CANFIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_CANFIXStatus() {
		status = SRCH_CANFIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_MODStatus() {
		status = SRCH_MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DELStatus() {
		status = SRCH_DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_REFStatus() {
		status = SRCH_REF;
		setAllStatus(status);
	}

	/**
	 * この画面を[IMP_FILE]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setIMP_FILEStatus() {
		status = IMP_FILE;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_SAV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_SAVStatus() {
		status = UPD_SAV;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_FIXStatus() {
		status = UPD_FIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CANSAV]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CANSAVStatus() {
		status = UPD_CANSAV;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_CANFIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_CANFIXStatus() {
		status = UPD_CANFIX;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_MODStatus() {
		status = UPD_MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_DELStatus() {
		status = UPD_DEL;
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
	 * この画面を[INS]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSStatus() {
		status = INS;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_SAV.equals(status)) {
			setSRCH_SAVStatus();
		}
		else if (SRCH_FIX.equals(status)) {
			setSRCH_FIXStatus();
		}
		else if (SRCH_CANSAV.equals(status)) {
			setSRCH_CANSAVStatus();
		}
		else if (SRCH_CANFIX.equals(status)) {
			setSRCH_CANFIXStatus();
		}
		else if (SRCH_MOD.equals(status)) {
			setSRCH_MODStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (SRCH_REF.equals(status)) {
			setSRCH_REFStatus();
		}
		else if (IMP_FILE.equals(status)) {
			setIMP_FILEStatus();
		}
		else if (UPD_SAV.equals(status)) {
			setUPD_SAVStatus();
		}
		else if (UPD_FIX.equals(status)) {
			setUPD_FIXStatus();
		}
		else if (UPD_CANSAV.equals(status)) {
			setUPD_CANSAVStatus();
		}
		else if (UPD_CANFIX.equals(status)) {
			setUPD_CANFIXStatus();
		}
		else if (UPD_MOD.equals(status)) {
			setUPD_MODStatus();
		}
		else if (UPD_DEL.equals(status)) {
			setUPD_DELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (INS.equals(status)) {
			setINSStatus();
		}
		else if (FIX_I.equals(status)) {
			setFIX_IStatus();
		}
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_alloc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_alloc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AllocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_strg_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_strg_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_mfg_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_mfg_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_site_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_site_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Site");
		return lp;
	}
	 
	/**
	 * [Cnd_rqst_loc_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rqst_loc_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocGrp");
		return lp;
	}
	 
	/**
	 * [Cnd_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_ord_gnrt_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ord_gnrt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.OrdGnrtTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}


	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_rqst_wg_cd) return getCnd_rqst_wg_cd(row, info);
		if(combo == Cnd_strg_alloc_grp_cd) return getCnd_strg_alloc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_grp_cd) return getCnd_mfg_loc_grp_cd(row, info);
		if(combo == Cnd_strg_loc_cd) return getCnd_strg_loc_cd(row, info);
		if(combo == Cnd_strg_site_cd) return getCnd_strg_site_cd(row, info);
		if(combo == Cnd_strg_lg_grp_cd) return getCnd_strg_lg_grp_cd(row, info);
		if(combo == Cnd_strg_loc_grp_cd) return getCnd_strg_loc_grp_cd(row, info);
		if(combo == Cnd_mfg_loc_cd) return getCnd_mfg_loc_cd(row, info);
		if(combo == Cnd_mfg_site_cd) return getCnd_mfg_site_cd(row, info);
		if(combo == Cnd_rqst_loc_cd) return getCnd_rqst_loc_cd(row, info);
		if(combo == Cnd_rqst_site_cd) return getCnd_rqst_site_cd(row, info);
		if(combo == Cnd_rqst_loc_grp_cd) return getCnd_rqst_loc_grp_cd(row, info);
		if(combo == Cnd_sppl_cd) return getCnd_sppl_cd(row, info);
		if(combo == Cnd_maker_cd) return getCnd_maker_cd(row, info);
		if(combo == Cnd_ord_gnrt_typ) return getCnd_ord_gnrt_typ(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
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
		else if (ap == RPnl_dwnld) doRPnl_dwnld(info);
		else if (ap == Btn_open_MSBCP0040) doBtn_open_MSBCP0040(info);
		else if (ap == Btn_open_MSBCP0080) doBtn_open_MSBCP0080(info);
		else if (ap == Btn_open_MSBCP0090) doBtn_open_MSBCP0090(info);
		else if (ap == Btn_open_MSBCP0070) doBtn_open_MSBCP0070(info);
		else if (ap == Btn_open_MSBCP0060) doBtn_open_MSBCP0060(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_upd2) doBtn_upd2(info);
		else if (ap == Btn_upd3) doBtn_upd3(info);
		else if (ap == Btn_upd4) doBtn_upd4(info);
		else if (ap == Btn_upd5) doBtn_upd5(info);
		else if (ap == Btn_ins01) doBtn_ins01(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [RPnl]パネルの[dwnld]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doRPnl_dwnld(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0040]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0040(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0080]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0080(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0090]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0090(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0070]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0070(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MSBCP0060]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBCP0060(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd2]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd2(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd3]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd3(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd4]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd4(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd5]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd5(MCEventInfo info);

	/**
	 * [Btn]パネルの[ins01]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_ins01(MCEventInfo info);

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
		if (vc == FoldTab) return doFold_VC(info);
		if (vc == RsltTable) return doRslt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_opn_flg) return doCnd_opn_flg_VC(info);
		if (vc == Cnd_sav_flg) return doCnd_sav_flg_VC(info);
		if (vc == Cnd_fix_flg) return doCnd_fix_flg_VC(info);
		if (vc == Cnd_part_inst_flg) return doCnd_part_inst_flg_VC(info);
		if (vc == Cnd_inst_flg) return doCnd_inst_flg_VC(info);
		if (vc == Cnd_cmpl_flg) return doCnd_cmpl_flg_VC(info);
		if (vc == Cnd_mfg_flg) return doCnd_mfg_flg_VC(info);
		if (vc == Cnd_purc_flg) return doCnd_purc_flg_VC(info);
		if (vc == Cnd_outsrc_flg) return doCnd_outsrc_flg_VC(info);
		if (vc == Cnd_xfr_flg) return doCnd_xfr_flg_VC(info);
		if (vc == Cnd_wg_xfr_flg) return doCnd_wg_xfr_flg_VC(info);
		if (vc == Cnd_true_not_fix_flg) return doCnd_true_not_fix_flg_VC(info);
		if (vc == Cnd_false_not_fix_flg) return doCnd_false_not_fix_flg_VC(info);
		if (vc == Cnd_ord_rcv_tgt_flg) return doCnd_ord_rcv_tgt_flg_VC(info);
		if (vc == Cnd_not_ord_rcv_tgt_flg) return doCnd_not_ord_rcv_tgt_flg_VC(info);
		if (vc == Cnd_ord_snd_tgt_flg) return doCnd_ord_snd_tgt_flg_VC(info);
		if (vc == Cnd_not_ord_snd_tgt_flg) return doCnd_not_ord_snd_tgt_flg_VC(info);
		if (vc == Cnd_before_frozen_flg) return doCnd_before_frozen_flg_VC(info);
		if (vc == Cnd_frozen_flg) return doCnd_frozen_flg_VC(info);
		if (vc == Cnd_mfg_st_schd_dt_fr) return doCnd_mfg_st_schd_dt_fr_VC(info);
		if (vc == Cnd_mfg_st_schd_dt_to) return doCnd_mfg_st_schd_dt_to_VC(info);
		if (vc == Cnd_mfg_end_schd_dt_fr) return doCnd_mfg_end_schd_dt_fr_VC(info);
		if (vc == Cnd_mfg_end_schd_dt_to) return doCnd_mfg_end_schd_dt_to_VC(info);
		if (vc == Cnd_po_schd_dt_fr) return doCnd_po_schd_dt_fr_VC(info);
		if (vc == Cnd_po_schd_dt_to) return doCnd_po_schd_dt_to_VC(info);
		if (vc == Cnd_gi_schd_dt_fr) return doCnd_gi_schd_dt_fr_VC(info);
		if (vc == Cnd_gi_schd_dt_to) return doCnd_gi_schd_dt_to_VC(info);
		if (vc == Cnd_avl_schd_dt_fr) return doCnd_avl_schd_dt_fr_VC(info);
		if (vc == Cnd_avl_schd_dt_to) return doCnd_avl_schd_dt_to_VC(info);
		if (vc == Cnd_strg_schd_dt_fr) return doCnd_strg_schd_dt_fr_VC(info);
		if (vc == Cnd_strg_schd_dt_to) return doCnd_strg_schd_dt_to_VC(info);
		if (vc == Cnd_accpt_schd_dt_fr) return doCnd_accpt_schd_dt_fr_VC(info);
		if (vc == Cnd_accpt_schd_dt_to) return doCnd_accpt_schd_dt_to_VC(info);
		if (vc == Cnd_insp_st_schd_dt_fr) return doCnd_insp_st_schd_dt_fr_VC(info);
		if (vc == Cnd_insp_st_schd_dt_to) return doCnd_insp_st_schd_dt_to_VC(info);
		if (vc == Cnd_insp_end_schd_dt_fr) return doCnd_insp_end_schd_dt_fr_VC(info);
		if (vc == Cnd_insp_end_schd_dt_to) return doCnd_insp_end_schd_dt_to_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_rqst_wg_cd) return doCnd_rqst_wg_cd_VC(info);
		if (vc == Cnd_rqst_wg_nm) return doCnd_rqst_wg_nm_VC(info);
		if (vc == Cnd_strg_alloc_grp_cd) return doCnd_strg_alloc_grp_cd_VC(info);
		if (vc == Cnd_strg_alloc_grp_nm) return doCnd_strg_alloc_grp_nm_VC(info);
		if (vc == Cnd_mfg_loc_grp_cd) return doCnd_mfg_loc_grp_cd_VC(info);
		if (vc == Cnd_mfg_loc_grp_nm) return doCnd_mfg_loc_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_cd) return doCnd_strg_loc_cd_VC(info);
		if (vc == Cnd_strg_loc_nm) return doCnd_strg_loc_nm_VC(info);
		if (vc == Cnd_strg_site_cd) return doCnd_strg_site_cd_VC(info);
		if (vc == Cnd_strg_site_nm) return doCnd_strg_site_nm_VC(info);
		if (vc == Cnd_strg_lg_grp_cd) return doCnd_strg_lg_grp_cd_VC(info);
		if (vc == Cnd_strg_lg_grp_nm) return doCnd_strg_lg_grp_nm_VC(info);
		if (vc == Cnd_strg_loc_grp_cd) return doCnd_strg_loc_grp_cd_VC(info);
		if (vc == Cnd_strg_loc_grp_nm) return doCnd_strg_loc_grp_nm_VC(info);
		if (vc == Cnd_mfg_loc_cd) return doCnd_mfg_loc_cd_VC(info);
		if (vc == Cnd_mfg_loc_nm) return doCnd_mfg_loc_nm_VC(info);
		if (vc == Cnd_mfg_site_cd) return doCnd_mfg_site_cd_VC(info);
		if (vc == Cnd_mfg_site_nm) return doCnd_mfg_site_nm_VC(info);
		if (vc == Cnd_rqst_loc_cd) return doCnd_rqst_loc_cd_VC(info);
		if (vc == Cnd_rqst_loc_nm) return doCnd_rqst_loc_nm_VC(info);
		if (vc == Cnd_rqst_site_cd) return doCnd_rqst_site_cd_VC(info);
		if (vc == Cnd_rqst_site_nm) return doCnd_rqst_site_nm_VC(info);
		if (vc == Cnd_rqst_loc_grp_cd) return doCnd_rqst_loc_grp_cd_VC(info);
		if (vc == Cnd_rqst_loc_grp_nm) return doCnd_rqst_loc_grp_nm_VC(info);
		if (vc == Cnd_sppl_cd) return doCnd_sppl_cd_VC(info);
		if (vc == Cnd_sppl_nm) return doCnd_sppl_nm_VC(info);
		if (vc == Cnd_maker_cd) return doCnd_maker_cd_VC(info);
		if (vc == Cnd_maker_nm) return doCnd_maker_nm_VC(info);
		if (vc == Cnd_ord_gnrt_typ) return doCnd_ord_gnrt_typ_VC(info);
		if (vc == Cnd_ord_gnrt_typ_nm) return doCnd_ord_gnrt_typ_nm_VC(info);
		if (vc == Cnd_itm_ord_no) return doCnd_itm_ord_no_VC(info);
		if (vc == Cnd_rqmt_no) return doCnd_rqmt_no_VC(info);
		if (vc == Cnd_sim_mrp_no) return doCnd_sim_mrp_no_VC(info);
		if (vc == Cnd_intr_rmrks) return doCnd_intr_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == Cnd_ext_sys_cd) return doCnd_ext_sys_cd_VC(info);
		if (vc == Cnd_ext_sys_nm) return doCnd_ext_sys_nm_VC(info);
		if (vc == Cnd_ext_itm_ord_no) return doCnd_ext_itm_ord_no_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_itm_ord_no) return doRslt_itm_ord_no_VC(info);
		if (vc == columnRslt_itm_ord_typ) return doRslt_itm_ord_typ_VC(info);
		if (vc == columnRslt_itm_ord_typ_nm) return doRslt_itm_ord_typ_nm_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ) return doRslt_itm_ord_sts_typ_VC(info);
		if (vc == columnRslt_itm_ord_sts_typ_nm) return doRslt_itm_ord_sts_typ_nm_VC(info);
		if (vc == columnRslt_oper_sav_flg) return doRslt_oper_sav_flg_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_dec_place) return doRslt_dec_place_VC(info);
		if (vc == columnRslt_rnd_typ) return doRslt_rnd_typ_VC(info);
		if (vc == columnRslt_oper_ptn) return doRslt_oper_ptn_VC(info);
		if (vc == columnRslt_bom_ptn) return doRslt_bom_ptn_VC(info);
		if (vc == columnRslt_nmr_qty) return doRslt_nmr_qty_VC(info);
		if (vc == columnRslt_dnm_qty) return doRslt_dnm_qty_VC(info);
		if (vc == columnRslt_fxd_yield_qty) return doRslt_fxd_yield_qty_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_master_dt) return doRslt_master_dt_VC(info);
		if (vc == columnRslt_po_schd_dt) return doRslt_po_schd_dt_VC(info);
		if (vc == columnRslt_purc_lt) return doRslt_purc_lt_VC(info);
		if (vc == columnRslt_mfg_st_schd_dt) return doRslt_mfg_st_schd_dt_VC(info);
		if (vc == columnRslt_mfg_lt) return doRslt_mfg_lt_VC(info);
		if (vc == columnRslt_mfg_end_schd_dt) return doRslt_mfg_end_schd_dt_VC(info);
		if (vc == columnRslt_gi_schd_dt) return doRslt_gi_schd_dt_VC(info);
		if (vc == columnRslt_xfr_lt) return doRslt_xfr_lt_VC(info);
		if (vc == columnRslt_strg_schd_dt) return doRslt_strg_schd_dt_VC(info);
		if (vc == columnRslt_accpt_insp_lt) return doRslt_accpt_insp_lt_VC(info);
		if (vc == columnRslt_accpt_schd_dt) return doRslt_accpt_schd_dt_VC(info);
		if (vc == columnRslt_insp_flg) return doRslt_insp_flg_VC(info);
		if (vc == columnRslt_insp_st_schd_dt) return doRslt_insp_st_schd_dt_VC(info);
		if (vc == columnRslt_insp_lt) return doRslt_insp_lt_VC(info);
		if (vc == columnRslt_insp_offst) return doRslt_insp_offst_VC(info);
		if (vc == columnRslt_insp_end_schd_dt) return doRslt_insp_end_schd_dt_VC(info);
		if (vc == columnRslt_avl_schd_dt) return doRslt_avl_schd_dt_VC(info);
		if (vc == columnRslt_strg_site_cd) return doRslt_strg_site_cd_VC(info);
		if (vc == columnRslt_strg_site_nm) return doRslt_strg_site_nm_VC(info);
		if (vc == columnRslt_strg_lg_grp_cd) return doRslt_strg_lg_grp_cd_VC(info);
		if (vc == columnRslt_strg_lg_grp_nm) return doRslt_strg_lg_grp_nm_VC(info);
		if (vc == columnRslt_strg_alloc_grp_cd) return doRslt_strg_alloc_grp_cd_VC(info);
		if (vc == columnRslt_strg_alloc_grp_nm) return doRslt_strg_alloc_grp_nm_VC(info);
		if (vc == columnRslt_strg_loc_grp_cd) return doRslt_strg_loc_grp_cd_VC(info);
		if (vc == columnRslt_strg_loc_grp_nm) return doRslt_strg_loc_grp_nm_VC(info);
		if (vc == columnRslt_strg_loc_cd) return doRslt_strg_loc_cd_VC(info);
		if (vc == columnRslt_strg_loc_nm) return doRslt_strg_loc_nm_VC(info);
		if (vc == columnRslt_mfg_site_cd) return doRslt_mfg_site_cd_VC(info);
		if (vc == columnRslt_mfg_site_nm) return doRslt_mfg_site_nm_VC(info);
		if (vc == columnRslt_mfg_loc_grp_cd) return doRslt_mfg_loc_grp_cd_VC(info);
		if (vc == columnRslt_mfg_loc_grp_nm) return doRslt_mfg_loc_grp_nm_VC(info);
		if (vc == columnRslt_mfg_loc_cd) return doRslt_mfg_loc_cd_VC(info);
		if (vc == columnRslt_mfg_loc_nm) return doRslt_mfg_loc_nm_VC(info);
		if (vc == columnRslt_sppl_cd) return doRslt_sppl_cd_VC(info);
		if (vc == columnRslt_sppl_nm) return doRslt_sppl_nm_VC(info);
		if (vc == columnRslt_maker_cd) return doRslt_maker_cd_VC(info);
		if (vc == columnRslt_maker_nm) return doRslt_maker_nm_VC(info);
		if (vc == columnRslt_rqst_site_cd) return doRslt_rqst_site_cd_VC(info);
		if (vc == columnRslt_rqst_site_nm) return doRslt_rqst_site_nm_VC(info);
		if (vc == columnRslt_rqst_loc_grp_cd) return doRslt_rqst_loc_grp_cd_VC(info);
		if (vc == columnRslt_rqst_loc_grp_nm) return doRslt_rqst_loc_grp_nm_VC(info);
		if (vc == columnRslt_rqst_loc_cd) return doRslt_rqst_loc_cd_VC(info);
		if (vc == columnRslt_rqst_loc_nm) return doRslt_rqst_loc_nm_VC(info);
		if (vc == columnRslt_rqst_wg_cd) return doRslt_rqst_wg_cd_VC(info);
		if (vc == columnRslt_rqst_wg_nm) return doRslt_rqst_wg_nm_VC(info);
		if (vc == columnRslt_rqmt_no) return doRslt_rqmt_no_VC(info);
		if (vc == columnRslt_ord_gnrt_typ) return doRslt_ord_gnrt_typ_VC(info);
		if (vc == columnRslt_ord_gnrt_typ_nm) return doRslt_ord_gnrt_typ_nm_VC(info);
		if (vc == columnRslt_io_schd_pr_no) return doRslt_io_schd_pr_no_VC(info);
		if (vc == columnRslt_sim_mrp_no) return doRslt_sim_mrp_no_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_not_fix_flg) return doRslt_not_fix_flg_VC(info);
		if (vc == columnRslt_inst_po_cnt_rmrks) return doRslt_inst_po_cnt_rmrks_VC(info);
		if (vc == columnRslt_intr_rmrks) return doRslt_intr_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_ord_rcv_flg) return doRslt_ord_rcv_flg_VC(info);
		if (vc == columnRslt_ord_snd_flg) return doRslt_ord_snd_flg_VC(info);
		if (vc == columnRslt_ext_sys_cd) return doRslt_ext_sys_cd_VC(info);
		if (vc == columnRslt_ext_sys_nm) return doRslt_ext_sys_nm_VC(info);
		if (vc == columnRslt_ext_itm_ord_no) return doRslt_ext_itm_ord_no_VC(info);
		if (vc == columnRslt_for_scheduler_frozen_flg) return doRslt_for_scheduler_frozen_flg_VC(info);
		if (vc == columnRslt_scheduler_frozen_flg) return doRslt_scheduler_frozen_flg_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_ins_usr_id) return doRslt_ins_usr_id_VC(info);
		if (vc == columnRslt_ins_usr_nm) return doRslt_ins_usr_nm_VC(info);
		if (vc == columnRslt_ins_func_id) return doRslt_ins_func_id_VC(info);
		if (vc == columnRslt_ins_func_nm) return doRslt_ins_func_nm_VC(info);
		if (vc == columnRslt_ins_ts) return doRslt_ins_ts_VC(info);
		if (vc == columnRslt_itm_order_upd_cntr) return doRslt_itm_order_upd_cntr_VC(info);
		if (vc == columnRslt_upd_usr_id) return doRslt_upd_usr_id_VC(info);
		if (vc == columnRslt_upd_usr_nm) return doRslt_upd_usr_nm_VC(info);
		if (vc == columnRslt_upd_func_id) return doRslt_upd_func_id_VC(info);
		if (vc == columnRslt_upd_func_nm) return doRslt_upd_func_nm_VC(info);
		if (vc == columnRslt_upd_ts) return doRslt_upd_ts_VC(info);
		if (vc == columnRslt_upd_srv_req_no) return doRslt_upd_srv_req_no_VC(info);
		if (vc == columnRslt_upd_tgt_flg) return doRslt_upd_tgt_flg_VC(info);
		if (vc == columnRslt_modify_tgt_flg) return doRslt_modify_tgt_flg_VC(info);
		if (vc == Btn_async_flg) return doBtn_async_flg_VC(info);
		return true;
	}

	/**
	 * [Fold]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doFold_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[opn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_opn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_part_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[inst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_inst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmpl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[outsrc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_outsrc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[xfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_xfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_xfr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_xfr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[true_not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_true_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[false_not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_false_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_rcv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ord_rcv_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_snd_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_not_ord_snd_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[before_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_before_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_st_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_st_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_end_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_end_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_po_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gi_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_avl_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_accpt_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_st_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_st_schd_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_end_schd_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_end_schd_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mfg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqst_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_gnrt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ord_gnrt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ext_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_ord_sts_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_sav_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_sav_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_oper_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[nmr_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_nmr_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[dnm_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_dnm_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fxd_yield_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fxd_yield_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[master_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_master_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_po_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gi_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_xfr_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accpt_insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accpt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_accpt_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_st_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_offst]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_offst_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_end_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_avl_schd_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_gnrt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_gnrt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_io_schd_pr_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sim_mrp_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_not_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_inst_po_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_rcv_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_rcv_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ord_snd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_sys_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ext_itm_ord_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ext_itm_ord_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_for_scheduler_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_scheduler_frozen_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_typ_d_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_itm_order_upd_cntr_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[modify_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_modify_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Btn]パネルの[async_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBtn_async_flg_VC(MCEventInfo info){
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
		if (nc == FoldTab) doFold_NC(info);
		else if (nc == RsltTable) doRslt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_opn_flg) doCnd_opn_flg_NC(info);
		else if (nc == Cnd_sav_flg) doCnd_sav_flg_NC(info);
		else if (nc == Cnd_fix_flg) doCnd_fix_flg_NC(info);
		else if (nc == Cnd_part_inst_flg) doCnd_part_inst_flg_NC(info);
		else if (nc == Cnd_inst_flg) doCnd_inst_flg_NC(info);
		else if (nc == Cnd_cmpl_flg) doCnd_cmpl_flg_NC(info);
		else if (nc == Cnd_mfg_flg) doCnd_mfg_flg_NC(info);
		else if (nc == Cnd_purc_flg) doCnd_purc_flg_NC(info);
		else if (nc == Cnd_outsrc_flg) doCnd_outsrc_flg_NC(info);
		else if (nc == Cnd_xfr_flg) doCnd_xfr_flg_NC(info);
		else if (nc == Cnd_wg_xfr_flg) doCnd_wg_xfr_flg_NC(info);
		else if (nc == Cnd_true_not_fix_flg) doCnd_true_not_fix_flg_NC(info);
		else if (nc == Cnd_false_not_fix_flg) doCnd_false_not_fix_flg_NC(info);
		else if (nc == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NC(info);
		else if (nc == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NC(info);
		else if (nc == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NC(info);
		else if (nc == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NC(info);
		else if (nc == Cnd_before_frozen_flg) doCnd_before_frozen_flg_NC(info);
		else if (nc == Cnd_frozen_flg) doCnd_frozen_flg_NC(info);
		else if (nc == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NC(info);
		else if (nc == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NC(info);
		else if (nc == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NC(info);
		else if (nc == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NC(info);
		else if (nc == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NC(info);
		else if (nc == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NC(info);
		else if (nc == Cnd_gi_schd_dt_fr) doCnd_gi_schd_dt_fr_NC(info);
		else if (nc == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NC(info);
		else if (nc == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NC(info);
		else if (nc == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NC(info);
		else if (nc == Cnd_strg_schd_dt_fr) doCnd_strg_schd_dt_fr_NC(info);
		else if (nc == Cnd_strg_schd_dt_to) doCnd_strg_schd_dt_to_NC(info);
		else if (nc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NC(info);
		else if (nc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NC(info);
		else if (nc == Cnd_insp_st_schd_dt_fr) doCnd_insp_st_schd_dt_fr_NC(info);
		else if (nc == Cnd_insp_st_schd_dt_to) doCnd_insp_st_schd_dt_to_NC(info);
		else if (nc == Cnd_insp_end_schd_dt_fr) doCnd_insp_end_schd_dt_fr_NC(info);
		else if (nc == Cnd_insp_end_schd_dt_to) doCnd_insp_end_schd_dt_to_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NC(info);
		else if (nc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NC(info);
		else if (nc == Cnd_strg_alloc_grp_cd) doCnd_strg_alloc_grp_cd_NC(info);
		else if (nc == Cnd_strg_alloc_grp_nm) doCnd_strg_alloc_grp_nm_NC(info);
		else if (nc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NC(info);
		else if (nc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NC(info);
		else if (nc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NC(info);
		else if (nc == Cnd_strg_site_cd) doCnd_strg_site_cd_NC(info);
		else if (nc == Cnd_strg_site_nm) doCnd_strg_site_nm_NC(info);
		else if (nc == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NC(info);
		else if (nc == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NC(info);
		else if (nc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NC(info);
		else if (nc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NC(info);
		else if (nc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NC(info);
		else if (nc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NC(info);
		else if (nc == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NC(info);
		else if (nc == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NC(info);
		else if (nc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NC(info);
		else if (nc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NC(info);
		else if (nc == Cnd_rqst_site_cd) doCnd_rqst_site_cd_NC(info);
		else if (nc == Cnd_rqst_site_nm) doCnd_rqst_site_nm_NC(info);
		else if (nc == Cnd_rqst_loc_grp_cd) doCnd_rqst_loc_grp_cd_NC(info);
		else if (nc == Cnd_rqst_loc_grp_nm) doCnd_rqst_loc_grp_nm_NC(info);
		else if (nc == Cnd_sppl_cd) doCnd_sppl_cd_NC(info);
		else if (nc == Cnd_sppl_nm) doCnd_sppl_nm_NC(info);
		else if (nc == Cnd_maker_cd) doCnd_maker_cd_NC(info);
		else if (nc == Cnd_maker_nm) doCnd_maker_nm_NC(info);
		else if (nc == Cnd_ord_gnrt_typ) doCnd_ord_gnrt_typ_NC(info);
		else if (nc == Cnd_ord_gnrt_typ_nm) doCnd_ord_gnrt_typ_nm_NC(info);
		else if (nc == Cnd_itm_ord_no) doCnd_itm_ord_no_NC(info);
		else if (nc == Cnd_rqmt_no) doCnd_rqmt_no_NC(info);
		else if (nc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NC(info);
		else if (nc == Cnd_intr_rmrks) doCnd_intr_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NC(info);
		else if (nc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NC(info);
		else if (nc == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_itm_ord_no) doRslt_itm_ord_no_NC(info);
		else if (nc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NC(info);
		else if (nc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NC(info);
		else if (nc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NC(info);
		else if (nc == columnRslt_oper_sav_flg) doRslt_oper_sav_flg_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_dec_place) doRslt_dec_place_NC(info);
		else if (nc == columnRslt_rnd_typ) doRslt_rnd_typ_NC(info);
		else if (nc == columnRslt_oper_ptn) doRslt_oper_ptn_NC(info);
		else if (nc == columnRslt_bom_ptn) doRslt_bom_ptn_NC(info);
		else if (nc == columnRslt_nmr_qty) doRslt_nmr_qty_NC(info);
		else if (nc == columnRslt_dnm_qty) doRslt_dnm_qty_NC(info);
		else if (nc == columnRslt_fxd_yield_qty) doRslt_fxd_yield_qty_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_master_dt) doRslt_master_dt_NC(info);
		else if (nc == columnRslt_po_schd_dt) doRslt_po_schd_dt_NC(info);
		else if (nc == columnRslt_purc_lt) doRslt_purc_lt_NC(info);
		else if (nc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NC(info);
		else if (nc == columnRslt_mfg_lt) doRslt_mfg_lt_NC(info);
		else if (nc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NC(info);
		else if (nc == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NC(info);
		else if (nc == columnRslt_xfr_lt) doRslt_xfr_lt_NC(info);
		else if (nc == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NC(info);
		else if (nc == columnRslt_accpt_insp_lt) doRslt_accpt_insp_lt_NC(info);
		else if (nc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NC(info);
		else if (nc == columnRslt_insp_flg) doRslt_insp_flg_NC(info);
		else if (nc == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NC(info);
		else if (nc == columnRslt_insp_lt) doRslt_insp_lt_NC(info);
		else if (nc == columnRslt_insp_offst) doRslt_insp_offst_NC(info);
		else if (nc == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NC(info);
		else if (nc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NC(info);
		else if (nc == columnRslt_strg_site_cd) doRslt_strg_site_cd_NC(info);
		else if (nc == columnRslt_strg_site_nm) doRslt_strg_site_nm_NC(info);
		else if (nc == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NC(info);
		else if (nc == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NC(info);
		else if (nc == columnRslt_strg_alloc_grp_cd) doRslt_strg_alloc_grp_cd_NC(info);
		else if (nc == columnRslt_strg_alloc_grp_nm) doRslt_strg_alloc_grp_nm_NC(info);
		else if (nc == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NC(info);
		else if (nc == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NC(info);
		else if (nc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NC(info);
		else if (nc == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NC(info);
		else if (nc == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NC(info);
		else if (nc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NC(info);
		else if (nc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NC(info);
		else if (nc == columnRslt_sppl_cd) doRslt_sppl_cd_NC(info);
		else if (nc == columnRslt_sppl_nm) doRslt_sppl_nm_NC(info);
		else if (nc == columnRslt_maker_cd) doRslt_maker_cd_NC(info);
		else if (nc == columnRslt_maker_nm) doRslt_maker_nm_NC(info);
		else if (nc == columnRslt_rqst_site_cd) doRslt_rqst_site_cd_NC(info);
		else if (nc == columnRslt_rqst_site_nm) doRslt_rqst_site_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_grp_cd) doRslt_rqst_loc_grp_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_grp_nm) doRslt_rqst_loc_grp_nm_NC(info);
		else if (nc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NC(info);
		else if (nc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NC(info);
		else if (nc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NC(info);
		else if (nc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NC(info);
		else if (nc == columnRslt_rqmt_no) doRslt_rqmt_no_NC(info);
		else if (nc == columnRslt_ord_gnrt_typ) doRslt_ord_gnrt_typ_NC(info);
		else if (nc == columnRslt_ord_gnrt_typ_nm) doRslt_ord_gnrt_typ_nm_NC(info);
		else if (nc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NC(info);
		else if (nc == columnRslt_sim_mrp_no) doRslt_sim_mrp_no_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_not_fix_flg) doRslt_not_fix_flg_NC(info);
		else if (nc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NC(info);
		else if (nc == columnRslt_intr_rmrks) doRslt_intr_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NC(info);
		else if (nc == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NC(info);
		else if (nc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NC(info);
		else if (nc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NC(info);
		else if (nc == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NC(info);
		else if (nc == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NC(info);
		else if (nc == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_ins_usr_id) doRslt_ins_usr_id_NC(info);
		else if (nc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NC(info);
		else if (nc == columnRslt_ins_func_id) doRslt_ins_func_id_NC(info);
		else if (nc == columnRslt_ins_func_nm) doRslt_ins_func_nm_NC(info);
		else if (nc == columnRslt_ins_ts) doRslt_ins_ts_NC(info);
		else if (nc == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NC(info);
		else if (nc == columnRslt_upd_usr_id) doRslt_upd_usr_id_NC(info);
		else if (nc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NC(info);
		else if (nc == columnRslt_upd_func_id) doRslt_upd_func_id_NC(info);
		else if (nc == columnRslt_upd_func_nm) doRslt_upd_func_nm_NC(info);
		else if (nc == columnRslt_upd_ts) doRslt_upd_ts_NC(info);
		else if (nc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NC(info);
		else if (nc == columnRslt_upd_tgt_flg) doRslt_upd_tgt_flg_NC(info);
		else if (nc == columnRslt_modify_tgt_flg) doRslt_modify_tgt_flg_NC(info);
		else if (nc == Btn_async_flg) doBtn_async_flg_NC(info);
	}

	/**
	 * [Fold]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[opn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[outsrc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_outsrc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_xfr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_xfr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[true_not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_true_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[false_not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_false_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[before_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_before_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_to_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_sav_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_sav_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[nmr_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_nmr_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dnm_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dnm_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_yield_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_yield_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_offst]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_offst_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_mrp_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[modify_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_modify_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[async_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_async_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == FoldTab) doFold_NE(info);
		else if (ne == RsltTable) doRslt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_opn_flg) doCnd_opn_flg_NE(info);
		else if (ne == Cnd_sav_flg) doCnd_sav_flg_NE(info);
		else if (ne == Cnd_fix_flg) doCnd_fix_flg_NE(info);
		else if (ne == Cnd_part_inst_flg) doCnd_part_inst_flg_NE(info);
		else if (ne == Cnd_inst_flg) doCnd_inst_flg_NE(info);
		else if (ne == Cnd_cmpl_flg) doCnd_cmpl_flg_NE(info);
		else if (ne == Cnd_mfg_flg) doCnd_mfg_flg_NE(info);
		else if (ne == Cnd_purc_flg) doCnd_purc_flg_NE(info);
		else if (ne == Cnd_outsrc_flg) doCnd_outsrc_flg_NE(info);
		else if (ne == Cnd_xfr_flg) doCnd_xfr_flg_NE(info);
		else if (ne == Cnd_wg_xfr_flg) doCnd_wg_xfr_flg_NE(info);
		else if (ne == Cnd_true_not_fix_flg) doCnd_true_not_fix_flg_NE(info);
		else if (ne == Cnd_false_not_fix_flg) doCnd_false_not_fix_flg_NE(info);
		else if (ne == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NE(info);
		else if (ne == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NE(info);
		else if (ne == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NE(info);
		else if (ne == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NE(info);
		else if (ne == Cnd_before_frozen_flg) doCnd_before_frozen_flg_NE(info);
		else if (ne == Cnd_frozen_flg) doCnd_frozen_flg_NE(info);
		else if (ne == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NE(info);
		else if (ne == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NE(info);
		else if (ne == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NE(info);
		else if (ne == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NE(info);
		else if (ne == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NE(info);
		else if (ne == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NE(info);
		else if (ne == Cnd_gi_schd_dt_fr) doCnd_gi_schd_dt_fr_NE(info);
		else if (ne == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NE(info);
		else if (ne == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NE(info);
		else if (ne == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NE(info);
		else if (ne == Cnd_strg_schd_dt_fr) doCnd_strg_schd_dt_fr_NE(info);
		else if (ne == Cnd_strg_schd_dt_to) doCnd_strg_schd_dt_to_NE(info);
		else if (ne == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NE(info);
		else if (ne == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NE(info);
		else if (ne == Cnd_insp_st_schd_dt_fr) doCnd_insp_st_schd_dt_fr_NE(info);
		else if (ne == Cnd_insp_st_schd_dt_to) doCnd_insp_st_schd_dt_to_NE(info);
		else if (ne == Cnd_insp_end_schd_dt_fr) doCnd_insp_end_schd_dt_fr_NE(info);
		else if (ne == Cnd_insp_end_schd_dt_to) doCnd_insp_end_schd_dt_to_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NE(info);
		else if (ne == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NE(info);
		else if (ne == Cnd_strg_alloc_grp_cd) doCnd_strg_alloc_grp_cd_NE(info);
		else if (ne == Cnd_strg_alloc_grp_nm) doCnd_strg_alloc_grp_nm_NE(info);
		else if (ne == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NE(info);
		else if (ne == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NE(info);
		else if (ne == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NE(info);
		else if (ne == Cnd_strg_site_cd) doCnd_strg_site_cd_NE(info);
		else if (ne == Cnd_strg_site_nm) doCnd_strg_site_nm_NE(info);
		else if (ne == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NE(info);
		else if (ne == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NE(info);
		else if (ne == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NE(info);
		else if (ne == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NE(info);
		else if (ne == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NE(info);
		else if (ne == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NE(info);
		else if (ne == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NE(info);
		else if (ne == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NE(info);
		else if (ne == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NE(info);
		else if (ne == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NE(info);
		else if (ne == Cnd_rqst_site_cd) doCnd_rqst_site_cd_NE(info);
		else if (ne == Cnd_rqst_site_nm) doCnd_rqst_site_nm_NE(info);
		else if (ne == Cnd_rqst_loc_grp_cd) doCnd_rqst_loc_grp_cd_NE(info);
		else if (ne == Cnd_rqst_loc_grp_nm) doCnd_rqst_loc_grp_nm_NE(info);
		else if (ne == Cnd_sppl_cd) doCnd_sppl_cd_NE(info);
		else if (ne == Cnd_sppl_nm) doCnd_sppl_nm_NE(info);
		else if (ne == Cnd_maker_cd) doCnd_maker_cd_NE(info);
		else if (ne == Cnd_maker_nm) doCnd_maker_nm_NE(info);
		else if (ne == Cnd_ord_gnrt_typ) doCnd_ord_gnrt_typ_NE(info);
		else if (ne == Cnd_ord_gnrt_typ_nm) doCnd_ord_gnrt_typ_nm_NE(info);
		else if (ne == Cnd_itm_ord_no) doCnd_itm_ord_no_NE(info);
		else if (ne == Cnd_rqmt_no) doCnd_rqmt_no_NE(info);
		else if (ne == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NE(info);
		else if (ne == Cnd_intr_rmrks) doCnd_intr_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NE(info);
		else if (ne == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NE(info);
		else if (ne == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_itm_ord_no) doRslt_itm_ord_no_NE(info);
		else if (ne == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NE(info);
		else if (ne == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NE(info);
		else if (ne == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NE(info);
		else if (ne == columnRslt_oper_sav_flg) doRslt_oper_sav_flg_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_dec_place) doRslt_dec_place_NE(info);
		else if (ne == columnRslt_rnd_typ) doRslt_rnd_typ_NE(info);
		else if (ne == columnRslt_oper_ptn) doRslt_oper_ptn_NE(info);
		else if (ne == columnRslt_bom_ptn) doRslt_bom_ptn_NE(info);
		else if (ne == columnRslt_nmr_qty) doRslt_nmr_qty_NE(info);
		else if (ne == columnRslt_dnm_qty) doRslt_dnm_qty_NE(info);
		else if (ne == columnRslt_fxd_yield_qty) doRslt_fxd_yield_qty_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_master_dt) doRslt_master_dt_NE(info);
		else if (ne == columnRslt_po_schd_dt) doRslt_po_schd_dt_NE(info);
		else if (ne == columnRslt_purc_lt) doRslt_purc_lt_NE(info);
		else if (ne == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NE(info);
		else if (ne == columnRslt_mfg_lt) doRslt_mfg_lt_NE(info);
		else if (ne == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NE(info);
		else if (ne == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NE(info);
		else if (ne == columnRslt_xfr_lt) doRslt_xfr_lt_NE(info);
		else if (ne == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NE(info);
		else if (ne == columnRslt_accpt_insp_lt) doRslt_accpt_insp_lt_NE(info);
		else if (ne == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NE(info);
		else if (ne == columnRslt_insp_flg) doRslt_insp_flg_NE(info);
		else if (ne == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NE(info);
		else if (ne == columnRslt_insp_lt) doRslt_insp_lt_NE(info);
		else if (ne == columnRslt_insp_offst) doRslt_insp_offst_NE(info);
		else if (ne == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NE(info);
		else if (ne == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NE(info);
		else if (ne == columnRslt_strg_site_cd) doRslt_strg_site_cd_NE(info);
		else if (ne == columnRslt_strg_site_nm) doRslt_strg_site_nm_NE(info);
		else if (ne == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NE(info);
		else if (ne == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NE(info);
		else if (ne == columnRslt_strg_alloc_grp_cd) doRslt_strg_alloc_grp_cd_NE(info);
		else if (ne == columnRslt_strg_alloc_grp_nm) doRslt_strg_alloc_grp_nm_NE(info);
		else if (ne == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NE(info);
		else if (ne == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NE(info);
		else if (ne == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NE(info);
		else if (ne == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NE(info);
		else if (ne == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NE(info);
		else if (ne == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NE(info);
		else if (ne == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NE(info);
		else if (ne == columnRslt_sppl_cd) doRslt_sppl_cd_NE(info);
		else if (ne == columnRslt_sppl_nm) doRslt_sppl_nm_NE(info);
		else if (ne == columnRslt_maker_cd) doRslt_maker_cd_NE(info);
		else if (ne == columnRslt_maker_nm) doRslt_maker_nm_NE(info);
		else if (ne == columnRslt_rqst_site_cd) doRslt_rqst_site_cd_NE(info);
		else if (ne == columnRslt_rqst_site_nm) doRslt_rqst_site_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_grp_cd) doRslt_rqst_loc_grp_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_grp_nm) doRslt_rqst_loc_grp_nm_NE(info);
		else if (ne == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NE(info);
		else if (ne == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NE(info);
		else if (ne == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NE(info);
		else if (ne == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NE(info);
		else if (ne == columnRslt_rqmt_no) doRslt_rqmt_no_NE(info);
		else if (ne == columnRslt_ord_gnrt_typ) doRslt_ord_gnrt_typ_NE(info);
		else if (ne == columnRslt_ord_gnrt_typ_nm) doRslt_ord_gnrt_typ_nm_NE(info);
		else if (ne == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NE(info);
		else if (ne == columnRslt_sim_mrp_no) doRslt_sim_mrp_no_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_not_fix_flg) doRslt_not_fix_flg_NE(info);
		else if (ne == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NE(info);
		else if (ne == columnRslt_intr_rmrks) doRslt_intr_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NE(info);
		else if (ne == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NE(info);
		else if (ne == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NE(info);
		else if (ne == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NE(info);
		else if (ne == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NE(info);
		else if (ne == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NE(info);
		else if (ne == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_ins_usr_id) doRslt_ins_usr_id_NE(info);
		else if (ne == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NE(info);
		else if (ne == columnRslt_ins_func_id) doRslt_ins_func_id_NE(info);
		else if (ne == columnRslt_ins_func_nm) doRslt_ins_func_nm_NE(info);
		else if (ne == columnRslt_ins_ts) doRslt_ins_ts_NE(info);
		else if (ne == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NE(info);
		else if (ne == columnRslt_upd_usr_id) doRslt_upd_usr_id_NE(info);
		else if (ne == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NE(info);
		else if (ne == columnRslt_upd_func_id) doRslt_upd_func_id_NE(info);
		else if (ne == columnRslt_upd_func_nm) doRslt_upd_func_nm_NE(info);
		else if (ne == columnRslt_upd_ts) doRslt_upd_ts_NE(info);
		else if (ne == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NE(info);
		else if (ne == columnRslt_upd_tgt_flg) doRslt_upd_tgt_flg_NE(info);
		else if (ne == columnRslt_modify_tgt_flg) doRslt_modify_tgt_flg_NE(info);
		else if (ne == Btn_async_flg) doBtn_async_flg_NE(info);
	}

	/**
	 * [Fold]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[opn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[outsrc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_outsrc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_xfr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_xfr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[true_not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_true_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[false_not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_false_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[before_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_before_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_to_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_sav_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_sav_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[nmr_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_nmr_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dnm_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dnm_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_yield_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_yield_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_offst]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_offst_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_mrp_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[modify_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_modify_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[async_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_async_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == FoldTab) doFold_NX(info);
		else if (nx == RsltTable) doRslt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_opn_flg) doCnd_opn_flg_NX(info);
		else if (nx == Cnd_sav_flg) doCnd_sav_flg_NX(info);
		else if (nx == Cnd_fix_flg) doCnd_fix_flg_NX(info);
		else if (nx == Cnd_part_inst_flg) doCnd_part_inst_flg_NX(info);
		else if (nx == Cnd_inst_flg) doCnd_inst_flg_NX(info);
		else if (nx == Cnd_cmpl_flg) doCnd_cmpl_flg_NX(info);
		else if (nx == Cnd_mfg_flg) doCnd_mfg_flg_NX(info);
		else if (nx == Cnd_purc_flg) doCnd_purc_flg_NX(info);
		else if (nx == Cnd_outsrc_flg) doCnd_outsrc_flg_NX(info);
		else if (nx == Cnd_xfr_flg) doCnd_xfr_flg_NX(info);
		else if (nx == Cnd_wg_xfr_flg) doCnd_wg_xfr_flg_NX(info);
		else if (nx == Cnd_true_not_fix_flg) doCnd_true_not_fix_flg_NX(info);
		else if (nx == Cnd_false_not_fix_flg) doCnd_false_not_fix_flg_NX(info);
		else if (nx == Cnd_ord_rcv_tgt_flg) doCnd_ord_rcv_tgt_flg_NX(info);
		else if (nx == Cnd_not_ord_rcv_tgt_flg) doCnd_not_ord_rcv_tgt_flg_NX(info);
		else if (nx == Cnd_ord_snd_tgt_flg) doCnd_ord_snd_tgt_flg_NX(info);
		else if (nx == Cnd_not_ord_snd_tgt_flg) doCnd_not_ord_snd_tgt_flg_NX(info);
		else if (nx == Cnd_before_frozen_flg) doCnd_before_frozen_flg_NX(info);
		else if (nx == Cnd_frozen_flg) doCnd_frozen_flg_NX(info);
		else if (nx == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_NX(info);
		else if (nx == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_NX(info);
		else if (nx == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_NX(info);
		else if (nx == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_NX(info);
		else if (nx == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_NX(info);
		else if (nx == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_NX(info);
		else if (nx == Cnd_gi_schd_dt_fr) doCnd_gi_schd_dt_fr_NX(info);
		else if (nx == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_NX(info);
		else if (nx == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_NX(info);
		else if (nx == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_NX(info);
		else if (nx == Cnd_strg_schd_dt_fr) doCnd_strg_schd_dt_fr_NX(info);
		else if (nx == Cnd_strg_schd_dt_to) doCnd_strg_schd_dt_to_NX(info);
		else if (nx == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_NX(info);
		else if (nx == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_NX(info);
		else if (nx == Cnd_insp_st_schd_dt_fr) doCnd_insp_st_schd_dt_fr_NX(info);
		else if (nx == Cnd_insp_st_schd_dt_to) doCnd_insp_st_schd_dt_to_NX(info);
		else if (nx == Cnd_insp_end_schd_dt_fr) doCnd_insp_end_schd_dt_fr_NX(info);
		else if (nx == Cnd_insp_end_schd_dt_to) doCnd_insp_end_schd_dt_to_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_NX(info);
		else if (nx == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_NX(info);
		else if (nx == Cnd_strg_alloc_grp_cd) doCnd_strg_alloc_grp_cd_NX(info);
		else if (nx == Cnd_strg_alloc_grp_nm) doCnd_strg_alloc_grp_nm_NX(info);
		else if (nx == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_NX(info);
		else if (nx == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_cd) doCnd_strg_loc_cd_NX(info);
		else if (nx == Cnd_strg_loc_nm) doCnd_strg_loc_nm_NX(info);
		else if (nx == Cnd_strg_site_cd) doCnd_strg_site_cd_NX(info);
		else if (nx == Cnd_strg_site_nm) doCnd_strg_site_nm_NX(info);
		else if (nx == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_NX(info);
		else if (nx == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_NX(info);
		else if (nx == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_NX(info);
		else if (nx == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_NX(info);
		else if (nx == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_NX(info);
		else if (nx == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_NX(info);
		else if (nx == Cnd_mfg_site_cd) doCnd_mfg_site_cd_NX(info);
		else if (nx == Cnd_mfg_site_nm) doCnd_mfg_site_nm_NX(info);
		else if (nx == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_NX(info);
		else if (nx == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_NX(info);
		else if (nx == Cnd_rqst_site_cd) doCnd_rqst_site_cd_NX(info);
		else if (nx == Cnd_rqst_site_nm) doCnd_rqst_site_nm_NX(info);
		else if (nx == Cnd_rqst_loc_grp_cd) doCnd_rqst_loc_grp_cd_NX(info);
		else if (nx == Cnd_rqst_loc_grp_nm) doCnd_rqst_loc_grp_nm_NX(info);
		else if (nx == Cnd_sppl_cd) doCnd_sppl_cd_NX(info);
		else if (nx == Cnd_sppl_nm) doCnd_sppl_nm_NX(info);
		else if (nx == Cnd_maker_cd) doCnd_maker_cd_NX(info);
		else if (nx == Cnd_maker_nm) doCnd_maker_nm_NX(info);
		else if (nx == Cnd_ord_gnrt_typ) doCnd_ord_gnrt_typ_NX(info);
		else if (nx == Cnd_ord_gnrt_typ_nm) doCnd_ord_gnrt_typ_nm_NX(info);
		else if (nx == Cnd_itm_ord_no) doCnd_itm_ord_no_NX(info);
		else if (nx == Cnd_rqmt_no) doCnd_rqmt_no_NX(info);
		else if (nx == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NX(info);
		else if (nx == Cnd_intr_rmrks) doCnd_intr_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == Cnd_ext_sys_cd) doCnd_ext_sys_cd_NX(info);
		else if (nx == Cnd_ext_sys_nm) doCnd_ext_sys_nm_NX(info);
		else if (nx == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_itm_ord_no) doRslt_itm_ord_no_NX(info);
		else if (nx == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_NX(info);
		else if (nx == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_NX(info);
		else if (nx == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_NX(info);
		else if (nx == columnRslt_oper_sav_flg) doRslt_oper_sav_flg_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_dec_place) doRslt_dec_place_NX(info);
		else if (nx == columnRslt_rnd_typ) doRslt_rnd_typ_NX(info);
		else if (nx == columnRslt_oper_ptn) doRslt_oper_ptn_NX(info);
		else if (nx == columnRslt_bom_ptn) doRslt_bom_ptn_NX(info);
		else if (nx == columnRslt_nmr_qty) doRslt_nmr_qty_NX(info);
		else if (nx == columnRslt_dnm_qty) doRslt_dnm_qty_NX(info);
		else if (nx == columnRslt_fxd_yield_qty) doRslt_fxd_yield_qty_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_master_dt) doRslt_master_dt_NX(info);
		else if (nx == columnRslt_po_schd_dt) doRslt_po_schd_dt_NX(info);
		else if (nx == columnRslt_purc_lt) doRslt_purc_lt_NX(info);
		else if (nx == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_NX(info);
		else if (nx == columnRslt_mfg_lt) doRslt_mfg_lt_NX(info);
		else if (nx == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_NX(info);
		else if (nx == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_NX(info);
		else if (nx == columnRslt_xfr_lt) doRslt_xfr_lt_NX(info);
		else if (nx == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_NX(info);
		else if (nx == columnRslt_accpt_insp_lt) doRslt_accpt_insp_lt_NX(info);
		else if (nx == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_NX(info);
		else if (nx == columnRslt_insp_flg) doRslt_insp_flg_NX(info);
		else if (nx == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_NX(info);
		else if (nx == columnRslt_insp_lt) doRslt_insp_lt_NX(info);
		else if (nx == columnRslt_insp_offst) doRslt_insp_offst_NX(info);
		else if (nx == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_NX(info);
		else if (nx == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_NX(info);
		else if (nx == columnRslt_strg_site_cd) doRslt_strg_site_cd_NX(info);
		else if (nx == columnRslt_strg_site_nm) doRslt_strg_site_nm_NX(info);
		else if (nx == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_NX(info);
		else if (nx == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_NX(info);
		else if (nx == columnRslt_strg_alloc_grp_cd) doRslt_strg_alloc_grp_cd_NX(info);
		else if (nx == columnRslt_strg_alloc_grp_nm) doRslt_strg_alloc_grp_nm_NX(info);
		else if (nx == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_NX(info);
		else if (nx == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_NX(info);
		else if (nx == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_NX(info);
		else if (nx == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_NX(info);
		else if (nx == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_NX(info);
		else if (nx == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_NX(info);
		else if (nx == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_NX(info);
		else if (nx == columnRslt_sppl_cd) doRslt_sppl_cd_NX(info);
		else if (nx == columnRslt_sppl_nm) doRslt_sppl_nm_NX(info);
		else if (nx == columnRslt_maker_cd) doRslt_maker_cd_NX(info);
		else if (nx == columnRslt_maker_nm) doRslt_maker_nm_NX(info);
		else if (nx == columnRslt_rqst_site_cd) doRslt_rqst_site_cd_NX(info);
		else if (nx == columnRslt_rqst_site_nm) doRslt_rqst_site_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_grp_cd) doRslt_rqst_loc_grp_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_grp_nm) doRslt_rqst_loc_grp_nm_NX(info);
		else if (nx == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_NX(info);
		else if (nx == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_NX(info);
		else if (nx == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_NX(info);
		else if (nx == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_NX(info);
		else if (nx == columnRslt_rqmt_no) doRslt_rqmt_no_NX(info);
		else if (nx == columnRslt_ord_gnrt_typ) doRslt_ord_gnrt_typ_NX(info);
		else if (nx == columnRslt_ord_gnrt_typ_nm) doRslt_ord_gnrt_typ_nm_NX(info);
		else if (nx == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_NX(info);
		else if (nx == columnRslt_sim_mrp_no) doRslt_sim_mrp_no_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_not_fix_flg) doRslt_not_fix_flg_NX(info);
		else if (nx == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_NX(info);
		else if (nx == columnRslt_intr_rmrks) doRslt_intr_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_ord_rcv_flg) doRslt_ord_rcv_flg_NX(info);
		else if (nx == columnRslt_ord_snd_flg) doRslt_ord_snd_flg_NX(info);
		else if (nx == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_NX(info);
		else if (nx == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_NX(info);
		else if (nx == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_NX(info);
		else if (nx == columnRslt_for_scheduler_frozen_flg) doRslt_for_scheduler_frozen_flg_NX(info);
		else if (nx == columnRslt_scheduler_frozen_flg) doRslt_scheduler_frozen_flg_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_ins_usr_id) doRslt_ins_usr_id_NX(info);
		else if (nx == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_NX(info);
		else if (nx == columnRslt_ins_func_id) doRslt_ins_func_id_NX(info);
		else if (nx == columnRslt_ins_func_nm) doRslt_ins_func_nm_NX(info);
		else if (nx == columnRslt_ins_ts) doRslt_ins_ts_NX(info);
		else if (nx == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_NX(info);
		else if (nx == columnRslt_upd_usr_id) doRslt_upd_usr_id_NX(info);
		else if (nx == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_NX(info);
		else if (nx == columnRslt_upd_func_id) doRslt_upd_func_id_NX(info);
		else if (nx == columnRslt_upd_func_nm) doRslt_upd_func_nm_NX(info);
		else if (nx == columnRslt_upd_ts) doRslt_upd_ts_NX(info);
		else if (nx == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_NX(info);
		else if (nx == columnRslt_upd_tgt_flg) doRslt_upd_tgt_flg_NX(info);
		else if (nx == columnRslt_modify_tgt_flg) doRslt_modify_tgt_flg_NX(info);
		else if (nx == Btn_async_flg) doBtn_async_flg_NX(info);
	}

	/**
	 * [Fold]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doFold_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[opn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_opn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[part_inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_part_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[inst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_inst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cmpl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmpl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[outsrc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_outsrc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[xfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_xfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_xfr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_xfr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[true_not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_true_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[false_not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_false_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_rcv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_rcv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_rcv_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_rcv_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_snd_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_snd_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[not_ord_snd_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_not_ord_snd_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[before_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_before_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_to_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_sav_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_sav_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[nmr_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_nmr_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dnm_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dnm_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_yield_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_yield_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_offst]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_offst_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_mrp_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[not_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_not_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_rcv_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_rcv_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_snd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_snd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_itm_ord_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[for_scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_for_scheduler_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[scheduler_frozen_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_scheduler_frozen_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[modify_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_modify_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Btn]パネルの[async_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBtn_async_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_mfg_st_schd_dt_fr) doCnd_mfg_st_schd_dt_fr_LC(info);
		else if (lc == Cnd_mfg_st_schd_dt_to) doCnd_mfg_st_schd_dt_to_LC(info);
		else if (lc == Cnd_mfg_end_schd_dt_fr) doCnd_mfg_end_schd_dt_fr_LC(info);
		else if (lc == Cnd_mfg_end_schd_dt_to) doCnd_mfg_end_schd_dt_to_LC(info);
		else if (lc == Cnd_po_schd_dt_fr) doCnd_po_schd_dt_fr_LC(info);
		else if (lc == Cnd_po_schd_dt_to) doCnd_po_schd_dt_to_LC(info);
		else if (lc == Cnd_gi_schd_dt_fr) doCnd_gi_schd_dt_fr_LC(info);
		else if (lc == Cnd_gi_schd_dt_to) doCnd_gi_schd_dt_to_LC(info);
		else if (lc == Cnd_avl_schd_dt_fr) doCnd_avl_schd_dt_fr_LC(info);
		else if (lc == Cnd_avl_schd_dt_to) doCnd_avl_schd_dt_to_LC(info);
		else if (lc == Cnd_strg_schd_dt_fr) doCnd_strg_schd_dt_fr_LC(info);
		else if (lc == Cnd_strg_schd_dt_to) doCnd_strg_schd_dt_to_LC(info);
		else if (lc == Cnd_accpt_schd_dt_fr) doCnd_accpt_schd_dt_fr_LC(info);
		else if (lc == Cnd_accpt_schd_dt_to) doCnd_accpt_schd_dt_to_LC(info);
		else if (lc == Cnd_insp_st_schd_dt_fr) doCnd_insp_st_schd_dt_fr_LC(info);
		else if (lc == Cnd_insp_st_schd_dt_to) doCnd_insp_st_schd_dt_to_LC(info);
		else if (lc == Cnd_insp_end_schd_dt_fr) doCnd_insp_end_schd_dt_fr_LC(info);
		else if (lc == Cnd_insp_end_schd_dt_to) doCnd_insp_end_schd_dt_to_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_rqst_wg_cd) doCnd_rqst_wg_cd_LC(info);
		else if (lc == Cnd_rqst_wg_nm) doCnd_rqst_wg_nm_LC(info);
		else if (lc == Cnd_strg_alloc_grp_cd) doCnd_strg_alloc_grp_cd_LC(info);
		else if (lc == Cnd_strg_alloc_grp_nm) doCnd_strg_alloc_grp_nm_LC(info);
		else if (lc == Cnd_mfg_loc_grp_cd) doCnd_mfg_loc_grp_cd_LC(info);
		else if (lc == Cnd_mfg_loc_grp_nm) doCnd_mfg_loc_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_cd) doCnd_strg_loc_cd_LC(info);
		else if (lc == Cnd_strg_loc_nm) doCnd_strg_loc_nm_LC(info);
		else if (lc == Cnd_strg_site_cd) doCnd_strg_site_cd_LC(info);
		else if (lc == Cnd_strg_site_nm) doCnd_strg_site_nm_LC(info);
		else if (lc == Cnd_strg_lg_grp_cd) doCnd_strg_lg_grp_cd_LC(info);
		else if (lc == Cnd_strg_lg_grp_nm) doCnd_strg_lg_grp_nm_LC(info);
		else if (lc == Cnd_strg_loc_grp_cd) doCnd_strg_loc_grp_cd_LC(info);
		else if (lc == Cnd_strg_loc_grp_nm) doCnd_strg_loc_grp_nm_LC(info);
		else if (lc == Cnd_mfg_loc_cd) doCnd_mfg_loc_cd_LC(info);
		else if (lc == Cnd_mfg_loc_nm) doCnd_mfg_loc_nm_LC(info);
		else if (lc == Cnd_mfg_site_cd) doCnd_mfg_site_cd_LC(info);
		else if (lc == Cnd_mfg_site_nm) doCnd_mfg_site_nm_LC(info);
		else if (lc == Cnd_rqst_loc_cd) doCnd_rqst_loc_cd_LC(info);
		else if (lc == Cnd_rqst_loc_nm) doCnd_rqst_loc_nm_LC(info);
		else if (lc == Cnd_rqst_site_cd) doCnd_rqst_site_cd_LC(info);
		else if (lc == Cnd_rqst_site_nm) doCnd_rqst_site_nm_LC(info);
		else if (lc == Cnd_rqst_loc_grp_cd) doCnd_rqst_loc_grp_cd_LC(info);
		else if (lc == Cnd_rqst_loc_grp_nm) doCnd_rqst_loc_grp_nm_LC(info);
		else if (lc == Cnd_sppl_cd) doCnd_sppl_cd_LC(info);
		else if (lc == Cnd_sppl_nm) doCnd_sppl_nm_LC(info);
		else if (lc == Cnd_maker_cd) doCnd_maker_cd_LC(info);
		else if (lc == Cnd_maker_nm) doCnd_maker_nm_LC(info);
		else if (lc == Cnd_ord_gnrt_typ) doCnd_ord_gnrt_typ_LC(info);
		else if (lc == Cnd_ord_gnrt_typ_nm) doCnd_ord_gnrt_typ_nm_LC(info);
		else if (lc == Cnd_itm_ord_no) doCnd_itm_ord_no_LC(info);
		else if (lc == Cnd_rqmt_no) doCnd_rqmt_no_LC(info);
		else if (lc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_LC(info);
		else if (lc == Cnd_intr_rmrks) doCnd_intr_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == Cnd_ext_sys_cd) doCnd_ext_sys_cd_LC(info);
		else if (lc == Cnd_ext_sys_nm) doCnd_ext_sys_nm_LC(info);
		else if (lc == Cnd_ext_itm_ord_no) doCnd_ext_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_no) doRslt_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_ord_typ) doRslt_itm_ord_typ_LC(info);
		else if (lc == columnRslt_itm_ord_typ_nm) doRslt_itm_ord_typ_nm_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ) doRslt_itm_ord_sts_typ_LC(info);
		else if (lc == columnRslt_itm_ord_sts_typ_nm) doRslt_itm_ord_sts_typ_nm_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_dec_place) doRslt_dec_place_LC(info);
		else if (lc == columnRslt_rnd_typ) doRslt_rnd_typ_LC(info);
		else if (lc == columnRslt_oper_ptn) doRslt_oper_ptn_LC(info);
		else if (lc == columnRslt_bom_ptn) doRslt_bom_ptn_LC(info);
		else if (lc == columnRslt_nmr_qty) doRslt_nmr_qty_LC(info);
		else if (lc == columnRslt_dnm_qty) doRslt_dnm_qty_LC(info);
		else if (lc == columnRslt_fxd_yield_qty) doRslt_fxd_yield_qty_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_master_dt) doRslt_master_dt_LC(info);
		else if (lc == columnRslt_po_schd_dt) doRslt_po_schd_dt_LC(info);
		else if (lc == columnRslt_purc_lt) doRslt_purc_lt_LC(info);
		else if (lc == columnRslt_mfg_st_schd_dt) doRslt_mfg_st_schd_dt_LC(info);
		else if (lc == columnRslt_mfg_lt) doRslt_mfg_lt_LC(info);
		else if (lc == columnRslt_mfg_end_schd_dt) doRslt_mfg_end_schd_dt_LC(info);
		else if (lc == columnRslt_gi_schd_dt) doRslt_gi_schd_dt_LC(info);
		else if (lc == columnRslt_xfr_lt) doRslt_xfr_lt_LC(info);
		else if (lc == columnRslt_strg_schd_dt) doRslt_strg_schd_dt_LC(info);
		else if (lc == columnRslt_accpt_insp_lt) doRslt_accpt_insp_lt_LC(info);
		else if (lc == columnRslt_accpt_schd_dt) doRslt_accpt_schd_dt_LC(info);
		else if (lc == columnRslt_insp_st_schd_dt) doRslt_insp_st_schd_dt_LC(info);
		else if (lc == columnRslt_insp_lt) doRslt_insp_lt_LC(info);
		else if (lc == columnRslt_insp_offst) doRslt_insp_offst_LC(info);
		else if (lc == columnRslt_insp_end_schd_dt) doRslt_insp_end_schd_dt_LC(info);
		else if (lc == columnRslt_avl_schd_dt) doRslt_avl_schd_dt_LC(info);
		else if (lc == columnRslt_strg_site_cd) doRslt_strg_site_cd_LC(info);
		else if (lc == columnRslt_strg_site_nm) doRslt_strg_site_nm_LC(info);
		else if (lc == columnRslt_strg_lg_grp_cd) doRslt_strg_lg_grp_cd_LC(info);
		else if (lc == columnRslt_strg_lg_grp_nm) doRslt_strg_lg_grp_nm_LC(info);
		else if (lc == columnRslt_strg_alloc_grp_cd) doRslt_strg_alloc_grp_cd_LC(info);
		else if (lc == columnRslt_strg_alloc_grp_nm) doRslt_strg_alloc_grp_nm_LC(info);
		else if (lc == columnRslt_strg_loc_grp_cd) doRslt_strg_loc_grp_cd_LC(info);
		else if (lc == columnRslt_strg_loc_grp_nm) doRslt_strg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_strg_loc_cd) doRslt_strg_loc_cd_LC(info);
		else if (lc == columnRslt_strg_loc_nm) doRslt_strg_loc_nm_LC(info);
		else if (lc == columnRslt_mfg_site_cd) doRslt_mfg_site_cd_LC(info);
		else if (lc == columnRslt_mfg_site_nm) doRslt_mfg_site_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_cd) doRslt_mfg_loc_grp_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_grp_nm) doRslt_mfg_loc_grp_nm_LC(info);
		else if (lc == columnRslt_mfg_loc_cd) doRslt_mfg_loc_cd_LC(info);
		else if (lc == columnRslt_mfg_loc_nm) doRslt_mfg_loc_nm_LC(info);
		else if (lc == columnRslt_sppl_cd) doRslt_sppl_cd_LC(info);
		else if (lc == columnRslt_sppl_nm) doRslt_sppl_nm_LC(info);
		else if (lc == columnRslt_maker_cd) doRslt_maker_cd_LC(info);
		else if (lc == columnRslt_maker_nm) doRslt_maker_nm_LC(info);
		else if (lc == columnRslt_rqst_site_cd) doRslt_rqst_site_cd_LC(info);
		else if (lc == columnRslt_rqst_site_nm) doRslt_rqst_site_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_grp_cd) doRslt_rqst_loc_grp_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_grp_nm) doRslt_rqst_loc_grp_nm_LC(info);
		else if (lc == columnRslt_rqst_loc_cd) doRslt_rqst_loc_cd_LC(info);
		else if (lc == columnRslt_rqst_loc_nm) doRslt_rqst_loc_nm_LC(info);
		else if (lc == columnRslt_rqst_wg_cd) doRslt_rqst_wg_cd_LC(info);
		else if (lc == columnRslt_rqst_wg_nm) doRslt_rqst_wg_nm_LC(info);
		else if (lc == columnRslt_rqmt_no) doRslt_rqmt_no_LC(info);
		else if (lc == columnRslt_ord_gnrt_typ) doRslt_ord_gnrt_typ_LC(info);
		else if (lc == columnRslt_ord_gnrt_typ_nm) doRslt_ord_gnrt_typ_nm_LC(info);
		else if (lc == columnRslt_io_schd_pr_no) doRslt_io_schd_pr_no_LC(info);
		else if (lc == columnRslt_sim_mrp_no) doRslt_sim_mrp_no_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_inst_po_cnt_rmrks) doRslt_inst_po_cnt_rmrks_LC(info);
		else if (lc == columnRslt_intr_rmrks) doRslt_intr_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_ext_sys_cd) doRslt_ext_sys_cd_LC(info);
		else if (lc == columnRslt_ext_sys_nm) doRslt_ext_sys_nm_LC(info);
		else if (lc == columnRslt_ext_itm_ord_no) doRslt_ext_itm_ord_no_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_ins_usr_id) doRslt_ins_usr_id_LC(info);
		else if (lc == columnRslt_ins_usr_nm) doRslt_ins_usr_nm_LC(info);
		else if (lc == columnRslt_ins_func_id) doRslt_ins_func_id_LC(info);
		else if (lc == columnRslt_ins_func_nm) doRslt_ins_func_nm_LC(info);
		else if (lc == columnRslt_ins_ts) doRslt_ins_ts_LC(info);
		else if (lc == columnRslt_itm_order_upd_cntr) doRslt_itm_order_upd_cntr_LC(info);
		else if (lc == columnRslt_upd_usr_id) doRslt_upd_usr_id_LC(info);
		else if (lc == columnRslt_upd_usr_nm) doRslt_upd_usr_nm_LC(info);
		else if (lc == columnRslt_upd_func_id) doRslt_upd_func_id_LC(info);
		else if (lc == columnRslt_upd_func_nm) doRslt_upd_func_nm_LC(info);
		else if (lc == columnRslt_upd_ts) doRslt_upd_ts_LC(info);
		else if (lc == columnRslt_upd_srv_req_no) doRslt_upd_srv_req_no_LC(info);
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_st_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_st_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_end_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_end_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[po_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_po_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gi_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gi_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[avl_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_avl_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[accpt_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_accpt_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_st_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_st_schd_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_end_schd_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_end_schd_dt_to_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mfg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mfg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqst_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqst_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ord_gnrt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ord_gnrt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ext_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ext_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_ord_sts_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_ord_sts_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[oper_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_oper_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[nmr_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_nmr_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[dnm_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_dnm_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fxd_yield_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fxd_yield_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[master_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_master_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[po_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_po_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gi_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gi_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[xfr_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_xfr_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[accpt_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_accpt_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_st_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_st_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_offst]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_offst_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_end_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_end_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[avl_schd_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_avl_schd_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ord_gnrt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ord_gnrt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[io_schd_pr_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_io_schd_pr_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sim_mrp_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[inst_po_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_inst_po_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_sys_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_sys_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ext_itm_ord_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ext_itm_ord_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_typ_d_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[itm_order_upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_itm_order_upd_cntr_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_wg_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_alloc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_alloc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAllocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_site_cd]の作成メソッド
	 */
	public MCList getCnd_strg_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_lg_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_strg_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_strg_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_loc_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_mfg_site_cd]の作成メソッド
	 */
	public MCList getCnd_mfg_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_loc_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_site_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_site_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSite(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_rqst_loc_grp_cd]の作成メソッド
	 */
	public MCList getCnd_rqst_loc_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sppl_cd]の作成メソッド
	 */
	public MCList getCnd_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_maker_cd]の作成メソッド
	 */
	public MCList getCnd_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ord_gnrt_typ]の作成メソッド
	 */
	public MCList getCnd_ord_gnrt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getOrdGnrtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0050.Srch01")) {
			return new MS_MSBCL0050_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0050.Upd01")) {
			return new MS_MSBCL0050_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0050.Upd02")) {
			return new MS_MSBCL0050_Upd02Bridge();
		}
		if (id.equals("MS.MSBCL0050.Upd03")) {
			return new MS_MSBCL0050_Upd03Bridge();
		}
		if (id.equals("MS.MSBCL0050.Upd04")) {
			return new MS_MSBCL0050_Upd04Bridge();
		}
		if (id.equals("MS.MSBCL0050.Upd05")) {
			return new MS_MSBCL0050_Upd05Bridge();
		}
		if (id.equals("MS.MSBCL0050.Del01")) {
			return new MS_MSBCL0050_Del01Bridge();
		}
		if (id.equals("MS.MSBCL0050.Imp01")) {
			return new MS_MSBCL0050_Imp01Bridge();
		}
		if (id.equals("MS.MSBCL0050.Ins01")) {
			return new MS_MSBCL0050_Ins01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0050_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0050_Srch01Bridge() {
			p_MS_MSBCL0050_Srch01 = new MCParam(PDef.MS_MSBCL0050_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0050.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0050.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0050.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Srch01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MS_MSBCL0050_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0050_Upd01Bridge() {
			p_MS_MSBCL0050_Upd01 = new MCParam(PDef.MS_MSBCL0050_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Upd01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Upd01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Upd01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Upd02;

		/** コンストラクタ */
		protected MS_MSBCL0050_Upd02Bridge() {
			p_MS_MSBCL0050_Upd02 = new MCParam(PDef.MS_MSBCL0050_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Upd02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Upd02.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Upd02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Upd02.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Upd03]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Upd03;

		/** コンストラクタ */
		protected MS_MSBCL0050_Upd03Bridge() {
			p_MS_MSBCL0050_Upd03 = new MCParam(PDef.MS_MSBCL0050_Upd03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Upd03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Upd03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Upd03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Upd03.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Upd03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Upd03.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Upd03.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Upd03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Upd03.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Upd04]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Upd04;

		/** コンストラクタ */
		protected MS_MSBCL0050_Upd04Bridge() {
			p_MS_MSBCL0050_Upd04 = new MCParam(PDef.MS_MSBCL0050_Upd04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Upd04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Upd04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Upd04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Upd04.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Upd04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Upd04.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Upd04.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Upd04;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Upd04.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Upd05]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Upd05Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Upd05;

		/** コンストラクタ */
		protected MS_MSBCL0050_Upd05Bridge() {
			p_MS_MSBCL0050_Upd05 = new MCParam(PDef.MS_MSBCL0050_Upd05_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Upd05_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Upd05 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Upd05.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Upd05.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Upd05.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Upd05.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Upd05.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Upd05;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Upd05.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0050_Del01Bridge() {
			p_MS_MSBCL0050_Del01 = new MCParam(PDef.MS_MSBCL0050_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Imp01;

		/** コンストラクタ */
		protected MS_MSBCL0050_Imp01Bridge() {
			p_MS_MSBCL0050_Imp01 = new MCParam(PDef.MS_MSBCL0050_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Imp01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Imp01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Imp01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0050_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0050_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0050_Ins01;

		/** コンストラクタ */
		protected MS_MSBCL0050_Ins01Bridge() {
			p_MS_MSBCL0050_Ins01 = new MCParam(PDef.MS_MSBCL0050_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0050_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));

			p_MS_MSBCL0050_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0050_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0050_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0050_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0050_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0050.RsltR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0050_Ins01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0050.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0050_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBC.MSBCP0050.RsltR>)p_MS_MSBCL0050_Ins01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltL());
			return result;
		}
	}
}