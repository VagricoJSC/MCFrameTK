package mcframe.clientMSBF.MSBFP0010;

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
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch01Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch02Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch03Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch04Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins01Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins02Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del01Caller;
import mcframe.clientMSBF.MSBFP0010.MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del02Caller;

/**
 * 画面"MSBFP_LotInspSchdReg"パネルクラスです。<p>
 *
 * ロット検査予定（在庫の再検査予定やロットの期限再検査予定）の登録画面です。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBFP_LotInspSchdReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SUBMODULE_ID = "MSBF";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MSBFP0010";

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
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * LMT_UP,Create schedule for re-inspection for expiration;INSP_SCHD,Create schedule for re-inspection for inventory;DEL_LMT_UP,Cancel schedule for re-inspection for expiration;DEL_INSP_SCHD,Cancel schedule for re-inspection for inventory LMT_UP,期限再検査予定を登録する;INSP_SCHD,在庫再検査予定を登録する;DEL_LMT_UP,期限再検査予定を取り消す;DEL_INSP_SCHD,在庫再検査予定を取り消す.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_LMT_UP = null;
	public MCRadioButton Cnd_ope_INSP_SCHD = null;
	public MCRadioButton Cnd_ope_DEL_LMT_UP = null;
	public MCRadioButton Cnd_ope_DEL_INSP_SCHD = null;
	public MCLabel Cnd_today_Label = null;
	/**
	 * Current date 現在日付.<p>
	 *
	 */
	public MCDateField Cnd_today = null;
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
	public MCLabel Cnd_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_loc_nm = null;
	public MCLabel Cnd_rem_stk_vld_pd_Label = null;
	/**
	 * Remaining expiration date 残有効期限.<p>
	 *
	 */
	public MCNumberField Cnd_rem_stk_vld_pd = null;
	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public MCButtonGroup Cnd_rem_stk_vld_pd_typ_Group = null;
	public MCRadioButton Cnd_rem_stk_vld_pd_typ_0 = null;
	public MCRadioButton Cnd_rem_stk_vld_pd_typ_1 = null;
	public MCLabel Cnd_trg_stk_vld_dt_Label = null;
	/**
	 * Target date (Expiration date) 対象年月日(有効期限）.<p>
	 *
	 */
	public MCDateField Cnd_trg_stk_vld_dt = null;
	public MCLabel Cnd_rem_stk_lmt_pd_Label = null;
	/**
	 * Remaining usage expiration date 残使用期限.<p>
	 *
	 */
	public MCNumberField Cnd_rem_stk_lmt_pd = null;
	/**
	 * 0,Month;1,Date 0,月;1,日.<p>
	 *
	 */
	public MCButtonGroup Cnd_rem_stk_lmt_pd_typ_Group = null;
	public MCRadioButton Cnd_rem_stk_lmt_pd_typ_0 = null;
	public MCRadioButton Cnd_rem_stk_lmt_pd_typ_1 = null;
	public MCLabel Cnd_trg_stk_lmt_dt_Label = null;
	/**
	 * Target date (Usage expiration date) 対象年月日(使用期限).<p>
	 *
	 */
	public MCDateField Cnd_trg_stk_lmt_dt = null;
	public mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S Cnd_itm_typ_p_PPanel;
	public MCTextComboBox Cnd_itm_typ;	// [Cnd]の[itm_typ_p.itm_typ]を[Cnd_itm_typ]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_nm;	// [Cnd]の[itm_typ_p.itm_typ_nm]を[Cnd_itm_typ_nm]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_typ_d_cd;	// [Cnd]の[itm_typ_p.itm_typ_d_cd]を[Cnd_itm_typ_d_cd]としてエイリアス定義。
	public MCTextField Cnd_itm_typ_d_nm;	// [Cnd]の[itm_typ_p.itm_typ_d_nm]を[Cnd_itm_typ_d_nm]としてエイリアス定義。
	/**
	 * Without expiration only 期限未設定のみ.<p>
	 *
	 */
	public MCCheckBox Cnd_unreg_lmt_flg = null;
	/**
	 * Display scheduled date to use 使用予定日表示.<p>
	 *
	 */
	public MCCheckBox Cnd_disp_mrp_use_dt_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_p_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm_p.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm_p.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm_p.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm_p.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm_p.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
	public MCLabel Cnd_ver_no_Label = null;
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_ver_no = null;
	public MCLabel Cnd_lot_no_Label = null;
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sublot_no = null;
	public MCLabel Cnd_quality_typ_Label = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCTextField Cnd_quality_typ_nm = null;
	public MCLabel Cnd_gd_cd_Label = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCTextField Cnd_gd_nm = null;
	public mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S Cnd_sno_wrk_no_p_PPanel;
	public MCTextField Cnd_sno1;	// [Cnd]の[sno_wrk_no_p.sno1]を[Cnd_sno1]としてエイリアス定義。
	public MCTextField Cnd_sno2;	// [Cnd]の[sno_wrk_no_p.sno2]を[Cnd_sno2]としてエイリアス定義。
	public MCTextField Cnd_sno3;	// [Cnd]の[sno_wrk_no_p.sno3]を[Cnd_sno3]としてエイリアス定義。
	public MCTextField Cnd_sno4;	// [Cnd]の[sno_wrk_no_p.sno4]を[Cnd_sno4]としてエイリアス定義。
	public MCTextField Cnd_wrk_no;	// [Cnd]の[sno_wrk_no_p.wrk_no]を[Cnd_wrk_no]としてエイリアス定義。
	public MCTextField Cnd_wrk_nm;	// [Cnd]の[sno_wrk_no_p.wrk_nm]を[Cnd_wrk_nm]としてエイリアス定義。
	public MCLabel Cnd_stk_id_typ_Label = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCTextField Cnd_stk_id_typ_nm = null;
	public MCLabel Cnd_pack_unit_cd_Label = null;
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCTextField Cnd_pack_unit_nm = null;
	public MCLabel Cnd_first_gr_dt_fr_Label = null;
	/**
	 * Oldest GR date FROM 最古入庫日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_fr = null;
	public MCLabel Cnd_first_gr_dt_to_Label = null;
	/**
	 * Oldest GR date TO 最古入庫日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_first_gr_dt_to = null;
	public MCLabel Cnd_str_ln_cd_Label = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCTextField Cnd_str_ln_nm = null;
	public MCLabel Cnd_insp_schd_no_Label = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_insp_schd_no = null;
	public MCLabel Cnd_lot_rmrks_Label = null;
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public MCTextField Cnd_lot_rmrks = null;
	public MCLabel Cnd_insp_cnt_rmrks_Label = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCTextField Cnd_insp_cnt_rmrks = null;
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
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_st_dt_p_PPanel;
	public MCDateField BulkSet_st_dt;	// [BulkSet]の[st_dt_p.ymd]を[BulkSet_st_dt]としてエイリアス定義。
	public MCDateField BulkSet_st_hm;	// [BulkSet]の[st_dt_p.hm]を[BulkSet_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H BulkSet_end_dt_p_PPanel;
	public MCDateField BulkSet_end_dt;	// [BulkSet]の[end_dt_p.ymd]を[BulkSet_end_dt]としてエイリアス定義。
	public MCDateField BulkSet_end_hm;	// [BulkSet]の[end_dt_p.hm]を[BulkSet_end_hm]としてエイリアス定義。
	// [Rslt]ブロック関連のField定義
	public MCPanel RsltPanel = null;
	public MCScrollPane RsltScrollPane = null;
	public MCTable2<mcframe.clientMSBF.MSBFP0010.RsltR> RsltTable = null;
	// [Rslt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRslt_check = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Rslt_itm_p_PPanel;
	public MCColumnConfig columnRslt_itm_cd;// [Rslt]の[itm_p.itm_cd]を[columnRslt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub1;// [Rslt]の[itm_p.itm_sub1]を[columnRslt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub2;// [Rslt]の[itm_p.itm_sub2]を[columnRslt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_sub3;// [Rslt]の[itm_p.itm_sub3]を[columnRslt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRslt_itm_nm;// [Rslt]の[itm_p.itm_nm]を[columnRslt_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_no = null;
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_sublot_no = null;
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ver_no = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D Rslt_sno_wrk_no_p_PPanel;
	public MCColumnConfig columnRslt_sno1;// [Rslt]の[sno_wrk_no_p.sno1]を[columnRslt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno2;// [Rslt]の[sno_wrk_no_p.sno2]を[columnRslt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno3;// [Rslt]の[sno_wrk_no_p.sno3]を[columnRslt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRslt_sno4;// [Rslt]の[sno_wrk_no_p.sno4]を[columnRslt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_no;// [Rslt]の[sno_wrk_no_p.wrk_no]を[columnRslt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRslt_wrk_nm;// [Rslt]の[sno_wrk_no_p.wrk_nm]を[columnRslt_wrk_nm]としてエイリアス定義。
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_ac_dt = null;
	public mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D Rslt_can_ac_dt_p_PPanel;
	public MCColumnConfig columnRslt_can_ac_dt_for_input;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_input]を[columnRslt_can_ac_dt_for_input]としてエイリアス定義。
	public MCColumnConfig columnRslt_can_ac_dt;// [Rslt]の[can_ac_dt_p.can_ac_dt_for_call]を[columnRslt_can_ac_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_ac_dt_after_srch;// [Rslt]の[can_ac_dt_p.ac_dt_after_srch]を[columnRslt_ac_dt_after_srch]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_st_dt_p_PPanel;
	public MCColumnConfig columnRslt_st_dt;// [Rslt]の[st_dt_p.ymd]を[columnRslt_st_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_st_hm;// [Rslt]の[st_dt_p.hm]を[columnRslt_st_hm]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D Rslt_end_dt_p_PPanel;
	public MCColumnConfig columnRslt_end_dt;// [Rslt]の[end_dt_p.ymd]を[columnRslt_end_dt]としてエイリアス定義。
	public MCColumnConfig columnRslt_end_hm;// [Rslt]の[end_dt_p.hm]を[columnRslt_end_hm]としてエイリアス定義。
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_cd = null;
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_unit_nm = null;
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_pack_unit_qty;// [Rslt]の[pack_unit_qty_p.qty]を[columnRslt_pack_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_pack_insp_qty_p_PPanel;
	public MCColumnConfig columnRslt_pack_insp_qty;// [Rslt]の[pack_insp_qty_p.qty]を[columnRslt_pack_insp_qty]としてエイリアス定義。
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
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_dec_place = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_qty;// [Rslt]の[base_unit_qty_p.qty]を[columnRslt_base_unit_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Rslt_base_unit_insp_qty_p_PPanel;
	public MCColumnConfig columnRslt_base_unit_insp_qty;// [Rslt]の[base_unit_insp_qty_p.qty]を[columnRslt_base_unit_insp_qty]としてエイリアス定義。
	/**
	 * Oldest GR date 最古入庫日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_first_gr_dt = null;
	/**
	 * Without expiration 期限未設定.<p>
	 *
	 */
	public MCColumnConfig columnRslt_unreg_lmt_flg = null;
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ = null;
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm_typ_nm = null;
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt_frm = null;
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_vld_dt = null;
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_dt = null;
	/**
	 * Scheduled date to use (MRP) 使用予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_mrp_use_dt = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_loc_nm = null;
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd = null;
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_nm = null;
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public MCColumnConfig columnRslt_str_ln_cd_none_flg = null;
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_cd = null;
	/**
	 * Inventory arriving point name 在庫着荷先名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_arrv_bp_nm = null;
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
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_in_xfr_typ = null;
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ = null;
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_quality_typ_nm = null;
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_insp_typ = null;
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ = null;
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_id_typ_nm = null;
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_cd = null;
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_gd_nm = null;
	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lmt_up_flg = null;
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public MCColumnConfig columnRslt_def_lmt_ctl_categ = null;
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_stk_bp_cd = null;
	public mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D Rslt_act_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_act_cont_fctr;// [Rslt]の[act_cont_fctr_p.act_cont_fctr]を[columnRslt_act_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D Rslt_std_cont_fctr_p_PPanel;
	public MCColumnConfig columnRslt_std_cont_fctr;// [Rslt]の[std_cont_fctr_p.std_cont_fctr]を[columnRslt_std_cont_fctr]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D Rslt_cont_fctr_qty_p_PPanel;
	public MCColumnConfig columnRslt_cont_fctr_qty;// [Rslt]の[cont_fctr_qty_p.cont_qty]を[columnRslt_cont_fctr_qty]としてエイリアス定義。
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_unit_cd = null;
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_unit_nm = null;
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_flg = null;
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_rnd_typ = null;
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRslt_cont_fctr_dec_place = null;
	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_cnt_rmrks = null;
	/**
	 * Remarks (Lot) 備考（ロット）.<p>
	 *
	 */
	public MCColumnConfig columnRslt_lot_rmrks = null;
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
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_mtd_typ = null;
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_mtd_typ_nm = null;
	/**
	 * Inspection schedule No. 検査予定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_insp_schd_no = null;
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_upd_cntr = null;
	/**
	 * Firm No. type 確定ＮＯ区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no_typ = null;
	/**
	 * Firm No. 確定ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRslt_fix_no = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_asst_typ = null;
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public MCColumnConfig columnRslt_base_unit_rnd_typ = null;
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_dmn_qty = null;
	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCColumnConfig columnRslt_pack_conv_qty = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Inspection order list 検査指図一覧.<p>
	 *
	 */
	public MCButton Btn_open_MSBFP0030 = null;
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
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_lmt_schd = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_schd = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_lmt_schdt = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton Btn_del_schd = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [SRCH_LMT_UP]モードを表す定数 */
	public static final String SRCH_LMT_UP = "SRCH_LMT_UP";
	/** [LMT_UP]モードを表す定数 */
	public static final String LMT_UP = "LMT_UP";
	/** [SRCH_INSP_SCHD]モードを表す定数 */
	public static final String SRCH_INSP_SCHD = "SRCH_INSP_SCHD";
	/** [INSP_SCHD]モードを表す定数 */
	public static final String INSP_SCHD = "INSP_SCHD";
	/** [SRCH_DEL_LMT_UP]モードを表す定数 */
	public static final String SRCH_DEL_LMT_UP = "SRCH_DEL_LMT_UP";
	/** [DEL_LMT_UP]モードを表す定数 */
	public static final String DEL_LMT_UP = "DEL_LMT_UP";
	/** [SRCH_DEL_INSP_SCHD]モードを表す定数 */
	public static final String SRCH_DEL_INSP_SCHD = "SRCH_DEL_INSP_SCHD";
	/** [DEL_INSP_SCHD]モードを表す定数 */
	public static final String DEL_INSP_SCHD = "DEL_INSP_SCHD";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH_LMT_UP, LMT_UP, SRCH_INSP_SCHD, INSP_SCHD, SRCH_DEL_LMT_UP, DEL_LMT_UP, SRCH_DEL_INSP_SCHD, DEL_INSP_SCHD};
	
	/** [MS_MSBFL0010_Srch01]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch01Caller createMS_MSBFL0010_Srch01() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch01Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Srch01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch01Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Srch01]の呼び出し */
	protected void callMS_MSBFL0010_Srch01() {
		MCCaller caller = createMS_MSBFL0010_Srch01();
		caller.exec();
	}
	/** [MS_MSBFL0010_Srch02]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch02Caller createMS_MSBFL0010_Srch02() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch02Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Srch02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch02Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Srch02Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Srch02]の呼び出し */
	protected void callMS_MSBFL0010_Srch02() {
		MCCaller caller = createMS_MSBFL0010_Srch02();
		caller.exec();
	}
	/** [MS_MSBFL0010_Srch03]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch03Caller createMS_MSBFL0010_Srch03() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch03Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch03Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Srch03Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch03Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Srch03Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Srch03]の呼び出し */
	protected void callMS_MSBFL0010_Srch03() {
		MCCaller caller = createMS_MSBFL0010_Srch03();
		caller.exec();
	}
	/** [MS_MSBFL0010_Srch04]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch04Caller createMS_MSBFL0010_Srch04() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Srch04Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch04Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Srch04Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Srch04Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Srch04Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Srch04]の呼び出し */
	protected void callMS_MSBFL0010_Srch04() {
		MCCaller caller = createMS_MSBFL0010_Srch04();
		caller.exec();
	}
	/** [MS_MSBFL0010_Ins01]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins01Caller createMS_MSBFL0010_Ins01() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Ins01Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Ins01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Ins01Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Ins01Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Ins01]の呼び出し */
	protected void callMS_MSBFL0010_Ins01() {
		MCCaller caller = createMS_MSBFL0010_Ins01();
		caller.exec();
	}
	/** [MS_MSBFL0010_Ins02]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins02Caller createMS_MSBFL0010_Ins02() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Ins02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Ins02Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Ins02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Ins02Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Ins02Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Ins02]の呼び出し */
	protected void callMS_MSBFL0010_Ins02() {
		MCCaller caller = createMS_MSBFL0010_Ins02();
		caller.exec();
	}
	/** [MS_MSBFL0010_Del01]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del01Caller createMS_MSBFL0010_Del01() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Del01Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Del01Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Del01Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Del01Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Del01]の呼び出し */
	protected void callMS_MSBFL0010_Del01() {
		MCCaller caller = createMS_MSBFL0010_Del01();
		caller.exec();
	}
	/** [MS_MSBFL0010_Del02]のCallerの作成 */
	protected MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del02Caller createMS_MSBFL0010_Del02() {
		MSBFP_LotInspSchdReg_MC.MS_MSBFL0010_Del02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Del02Bridge>
		caller = ((MSBFP_LotInspSchdReg_MC)this).new MS_MSBFL0010_Del02Caller<MSBFP_LotInspSchdReg, MS_MSBFL0010_Del02Bridge>(
					(MSBFP_LotInspSchdReg)this, new MS_MSBFL0010_Del02Bridge());
		return caller;
	}
	/** [MS_MSBFL0010_Del02]の呼び出し */
	protected void callMS_MSBFL0010_Del02() {
		MCCaller caller = createMS_MSBFL0010_Del02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0010.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMSBF.MSBFP0010.BulkSetR aBulkSetR;
	/** [Rslt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBF.MSBFP0010.RsltR> aRsltL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBF.MSBFP0010.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0010.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBF.MSBFP0010.CndR createCndR() {
		return mcframe.clientMSBF.MSBFP0010.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMSBF.MSBFP0010.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0010.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMSBF.MSBFP0010.BulkSetR createBulkSetR() {
		return mcframe.clientMSBF.MSBFP0010.BulkSetR.create();
	}

	/**
	 * コピーによってaRsltLを設定します。
	 *
	 * aRsltLのインスタンスは変更されません。
	 *
	 * @param dataset RsltL
	 */
	public void setRsltL(MCList<mcframe.clientMSBF.MSBFP0010.RsltR> aList) {
		if (getRsltL() != aList) {
			getRsltL().setAll(aList);
		}
	}

	/**
	 * [Rslt]ブロックのコンテナaRsltLを返します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0010.RsltR> getRsltL() {
		return aRsltL;
	}

	/**
	 * aRsltRを作成します。
	 *
	 * @return RsltR
	 */
	public mcframe.clientMSBF.MSBFP0010.RsltR createRsltR() {
		return mcframe.clientMSBF.MSBFP0010.RsltR.create();
	}

	/**
	 * aRsltLを作成します。
	 *
	 * @return RsltL
	 */
	public MCList<mcframe.clientMSBF.MSBFP0010.RsltR> createRsltL() {
		return MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class);
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
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
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
		if(aCnt == getBulkSetR()) return "BulkSet";
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
		if(bId.equals("BulkSet")) return getBulkSetR();
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
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(CndPanel);
		ret.add(Cnd2Panel);
		ret.add(CtrlPanel);
		ret.add(RPnlPanel);
		ret.add(BulkSetPanel);
		ret.add(RsltPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBFP_LotInspSchdReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBFP_LotInspSchdReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aRsltL = createRsltL();
		createRsltTable();
		RsltTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBFP_LotInspSchdReg_MC.jbCreateScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateTop((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateFold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateTab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateTab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateCnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateCnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateCtrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateRPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateBulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateRslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateBtn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbCreateEastBtn((MSBFP_LotInspSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBFP_LotInspSchdReg p) {
		p.Cnd_itm_typ_p_PPanel = mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.create(p.getCndR().itm_typ_p());
		p.Cnd_itm_typ_p_PPanel.setName("Cnd.itm_typ_p");
		p.Cnd_itm_typ = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ;
		p.Cnd_itm_typ.addAliasName("Cnd.itm_typ", p);
		p.Cnd_itm_typ_nm = p.Cnd_itm_typ_p_PPanel.ItmTyp_itm_typ_nm;
		p.Cnd_itm_typ_nm.addAliasName("Cnd.itm_typ_nm", p);
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
	protected static void jbCreateCnd2(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBFP_LotInspSchdReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [RPnl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRPnl(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MSBFP_LotInspSchdReg p) {
		p.BulkSet_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().st_dt_p());
		p.BulkSet_st_dt_p_PPanel.setName("BulkSet.st_dt_p");
		p.BulkSet_st_dt = p.BulkSet_st_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_st_dt.addAliasName("BulkSet.st_dt", p);
		p.BulkSet_st_hm = p.BulkSet_st_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_st_hm.addAliasName("BulkSet.st_hm", p);
		p.BulkSet_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.create(p.getBulkSetR().end_dt_p());
		p.BulkSet_end_dt_p_PPanel.setName("BulkSet.end_dt_p");
		p.BulkSet_end_dt = p.BulkSet_end_dt_p_PPanel.YmdHm_ymd;
		p.BulkSet_end_dt.addAliasName("BulkSet.end_dt", p);
		p.BulkSet_end_hm = p.BulkSet_end_dt_p_PPanel.YmdHm_hm;
		p.BulkSet_end_hm.addAliasName("BulkSet.end_hm", p);
	}

	/**
	 * [Rslt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRslt(MSBFP_LotInspSchdReg p) {
		p.Rslt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$itm_p);
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
		p.Rslt_sno_wrk_no_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$sno_wrk_no_p);
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
		p.Rslt_can_ac_dt_p_PPanel = mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$can_ac_dt_p);
		p.Rslt_can_ac_dt_p_PPanel.setName("Rslt.can_ac_dt_p");
		p.columnRslt_can_ac_dt_for_input = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_input;
		p.columnRslt_can_ac_dt_for_input.addAliasName("Rslt.can_ac_dt_for_input", p);
		p.columnRslt_can_ac_dt = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_can_ac_dt_for_call;
		p.columnRslt_can_ac_dt.addAliasName("Rslt.can_ac_dt", p);
		p.columnRslt_ac_dt_after_srch = p.Rslt_can_ac_dt_p_PPanel.columnCanAcDt_ac_dt_after_srch;
		p.columnRslt_ac_dt_after_srch.addAliasName("Rslt.ac_dt_after_srch", p);
		p.Rslt_st_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$st_dt_p);
		p.Rslt_st_dt_p_PPanel.setName("Rslt.st_dt_p");
		p.columnRslt_st_dt = p.Rslt_st_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_st_dt.addAliasName("Rslt.st_dt", p);
		p.columnRslt_st_hm = p.Rslt_st_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_st_hm.addAliasName("Rslt.st_hm", p);
		p.Rslt_end_dt_p_PPanel = mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$end_dt_p);
		p.Rslt_end_dt_p_PPanel.setName("Rslt.end_dt_p");
		p.columnRslt_end_dt = p.Rslt_end_dt_p_PPanel.columnYmdHm_ymd;
		p.columnRslt_end_dt.addAliasName("Rslt.end_dt", p);
		p.columnRslt_end_hm = p.Rslt_end_dt_p_PPanel.columnYmdHm_hm;
		p.columnRslt_end_hm.addAliasName("Rslt.end_hm", p);
		p.Rslt_pack_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$pack_unit_qty_p);
		p.Rslt_pack_unit_qty_p_PPanel.setName("Rslt.pack_unit_qty_p");
		p.columnRslt_pack_unit_qty = p.Rslt_pack_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pack_unit_qty.addAliasName("Rslt.pack_unit_qty", p);
		p.Rslt_pack_insp_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$pack_insp_qty_p);
		p.Rslt_pack_insp_qty_p_PPanel.setName("Rslt.pack_insp_qty_p");
		p.columnRslt_pack_insp_qty = p.Rslt_pack_insp_qty_p_PPanel.columnQty_qty;
		p.columnRslt_pack_insp_qty.addAliasName("Rslt.pack_insp_qty", p);
		p.Rslt_base_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$base_unit_qty_p);
		p.Rslt_base_unit_qty_p_PPanel.setName("Rslt.base_unit_qty_p");
		p.columnRslt_base_unit_qty = p.Rslt_base_unit_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_qty.addAliasName("Rslt.base_unit_qty", p);
		p.Rslt_base_unit_insp_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$base_unit_insp_qty_p);
		p.Rslt_base_unit_insp_qty_p_PPanel.setName("Rslt.base_unit_insp_qty_p");
		p.columnRslt_base_unit_insp_qty = p.Rslt_base_unit_insp_qty_p_PPanel.columnQty_qty;
		p.columnRslt_base_unit_insp_qty.addAliasName("Rslt.base_unit_insp_qty", p);
		p.Rslt_act_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$act_cont_fctr_p);
		p.Rslt_act_cont_fctr_p_PPanel.setName("Rslt.act_cont_fctr_p");
		p.columnRslt_act_cont_fctr = p.Rslt_act_cont_fctr_p_PPanel.columnActContFctr_act_cont_fctr;
		p.columnRslt_act_cont_fctr.addAliasName("Rslt.act_cont_fctr", p);
		p.Rslt_std_cont_fctr_p_PPanel = mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$std_cont_fctr_p);
		p.Rslt_std_cont_fctr_p_PPanel.setName("Rslt.std_cont_fctr_p");
		p.columnRslt_std_cont_fctr = p.Rslt_std_cont_fctr_p_PPanel.columnStdContFctr_std_cont_fctr;
		p.columnRslt_std_cont_fctr.addAliasName("Rslt.std_cont_fctr", p);
		p.Rslt_cont_fctr_qty_p_PPanel = mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$cont_fctr_qty_p);
		p.Rslt_cont_fctr_qty_p_PPanel.setName("Rslt.cont_fctr_qty_p");
		p.columnRslt_cont_fctr_qty = p.Rslt_cont_fctr_qty_p_PPanel.columnContQty_cont_qty;
		p.columnRslt_cont_fctr_qty.addAliasName("Rslt.cont_fctr_qty", p);
		p.Rslt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$rts_msg_p);
		p.Rslt_rts_msg_p_PPanel.setName("Rslt.rts_msg_p");
		p.columnRslt_rtn_sts_typ = p.Rslt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRslt_rtn_sts_typ.addAliasName("Rslt.rtn_sts_typ", p);
		p.Rslt_itm_grp_p_PPanel = mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.create(mcframe.clientMSBF.MSBFP0010.RsltR.$itm_grp_p);
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
	protected static void jbCreateBtn(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBFP_LotInspSchdReg p) {
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
	
	
	/** [Cnd_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_loc_cd_p = null;

	/**
	 * [Cnd_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_loc_cd_ListPutter() {
		if (Cnd_loc_cd_p == null) {
			Cnd_loc_cd_p = createCnd_loc_cd_ListPutter(Cnd_loc_cd, "loc_cd", "loc_nm");

		}
		return Cnd_loc_cd_p;
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
	
	
	/** [Cnd_lot_no_ListPutter]の定義 */
	private MCListPutter Cnd_lot_no_p = null;

	/**
	 * [Cnd_lot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_no_ListPutter() {
		if (Cnd_lot_no_p == null) {
			Cnd_lot_no_p = createCnd_lot_no_ListPutter(Cnd_lot_no, "lot_no");

		}
		return Cnd_lot_no_p;
	}
	
	
	/** [Cnd_sublot_no_ListPutter]の定義 */
	private MCListPutter Cnd_sublot_no_p = null;

	/**
	 * [Cnd_sublot_no_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sublot_no_ListPutter() {
		if (Cnd_sublot_no_p == null) {
			Cnd_sublot_no_p = createCnd_sublot_no_ListPutter(Cnd_sublot_no, "sublot_no");

		}
		return Cnd_sublot_no_p;
	}
	
	
	/** [Cnd_quality_typ_ListPutter]の定義 */
	private MCListPutter Cnd_quality_typ_p = null;

	/**
	 * [Cnd_quality_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_quality_typ_ListPutter() {
		if (Cnd_quality_typ_p == null) {
			Cnd_quality_typ_p = createCnd_quality_typ_ListPutter(Cnd_quality_typ, "quality_typ", "quality_typ_nm");

		}
		return Cnd_quality_typ_p;
	}
	
	
	/** [Cnd_gd_cd_ListPutter]の定義 */
	private MCListPutter Cnd_gd_cd_p = null;

	/**
	 * [Cnd_gd_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_gd_cd_ListPutter() {
		if (Cnd_gd_cd_p == null) {
			Cnd_gd_cd_p = createCnd_gd_cd_ListPutter(Cnd_gd_cd, "gd_cd", "gd_nm");

		}
		return Cnd_gd_cd_p;
	}
	
	
	/** [Cnd_stk_id_typ_ListPutter]の定義 */
	private MCListPutter Cnd_stk_id_typ_p = null;

	/**
	 * [Cnd_stk_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_stk_id_typ_ListPutter() {
		if (Cnd_stk_id_typ_p == null) {
			Cnd_stk_id_typ_p = createCnd_stk_id_typ_ListPutter(Cnd_stk_id_typ, "stk_id_typ", "stk_id_typ_nm");

		}
		return Cnd_stk_id_typ_p;
	}
	
	
	/** [Cnd_pack_unit_cd_ListPutter]の定義 */
	private MCListPutter Cnd_pack_unit_cd_p = null;

	/**
	 * [Cnd_pack_unit_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_pack_unit_cd_ListPutter() {
		if (Cnd_pack_unit_cd_p == null) {
			Cnd_pack_unit_cd_p = createCnd_pack_unit_cd_ListPutter(Cnd_pack_unit_cd, "pack_unit_cd", "pack_unit_nm");

		}
		return Cnd_pack_unit_cd_p;
	}
	
	
	/** [Cnd_str_ln_cd_ListPutter]の定義 */
	private MCListPutter Cnd_str_ln_cd_p = null;

	/**
	 * [Cnd_str_ln_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_str_ln_cd_ListPutter() {
		if (Cnd_str_ln_cd_p == null) {
			Cnd_str_ln_cd_p = createCnd_str_ln_cd_ListPutter(Cnd_str_ln_cd, "str_ln_cd", "str_ln_nm");

		}
		return Cnd_str_ln_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_LotInspSchdReg create(){
		MSBFP_LotInspSchdReg p = new MSBFP_LotInspSchdReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBFP_LotInspSchdReg create(String name){
		MSBFP_LotInspSchdReg p = new MSBFP_LotInspSchdReg(name);
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
		MSBFP_LotInspSchdReg_MC.jbfInitScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitTop((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitFold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitTab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitTab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitCnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitCnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitCtrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitRPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitBulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitRslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitBtn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbfInitEastBtn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitTop((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitFold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitTab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitTab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitCnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitCnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitCtrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitRPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitBulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitRslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitBtn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.jbInitEastBtn((MSBFP_LotInspSchdReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBFP_LotInspSchdReg p) {
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
	protected static void jbfInitTab1(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_LMT_UP = p.beansFactory.createRadioButton("Cnd.ope_LMT_UP");
		p.Cnd_ope_INSP_SCHD = p.beansFactory.createRadioButton("Cnd.ope_INSP_SCHD");
		p.Cnd_ope_DEL_LMT_UP = p.beansFactory.createRadioButton("Cnd.ope_DEL_LMT_UP");
		p.Cnd_ope_DEL_INSP_SCHD = p.beansFactory.createRadioButton("Cnd.ope_DEL_INSP_SCHD");
		p.Cnd_today_Label = p.beansFactory.createLabel("Cnd.today_Label");
		p.Cnd_today = p.beansFactory.createDateField("Cnd.today");
		p.Cnd_today.setLabel(p.Cnd_today_Label);
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_loc_cd_Label = p.beansFactory.createLabel("Cnd.loc_cd_Label");
		p.Cnd_loc_cd = p.beansFactory.createTextField("Cnd.loc_cd");
		p.Cnd_loc_cd.setLabel(p.Cnd_loc_cd_Label);
		p.Cnd_loc_nm = p.beansFactory.createTextField("Cnd.loc_nm");
		p.Cnd_rem_stk_vld_pd_Label = p.beansFactory.createLabel("Cnd.rem_stk_vld_pd_Label");
		p.Cnd_rem_stk_vld_pd = p.beansFactory.createNumberField("Cnd.rem_stk_vld_pd");
		p.Cnd_rem_stk_vld_pd.setLabel(p.Cnd_rem_stk_vld_pd_Label);
		p.Cnd_rem_stk_vld_pd_typ_Group = p.beansFactory.createButtonGroup("Cnd.rem_stk_vld_pd_typ");
		p.Cnd_rem_stk_vld_pd_typ_0 = p.beansFactory.createRadioButton("Cnd.rem_stk_vld_pd_typ_0");
		p.Cnd_rem_stk_vld_pd_typ_1 = p.beansFactory.createRadioButton("Cnd.rem_stk_vld_pd_typ_1");
		p.Cnd_trg_stk_vld_dt_Label = p.beansFactory.createLabel("Cnd.trg_stk_vld_dt_Label");
		p.Cnd_trg_stk_vld_dt = p.beansFactory.createDateField("Cnd.trg_stk_vld_dt");
		p.Cnd_trg_stk_vld_dt.setLabel(p.Cnd_trg_stk_vld_dt_Label);
		p.Cnd_rem_stk_lmt_pd_Label = p.beansFactory.createLabel("Cnd.rem_stk_lmt_pd_Label");
		p.Cnd_rem_stk_lmt_pd = p.beansFactory.createNumberField("Cnd.rem_stk_lmt_pd");
		p.Cnd_rem_stk_lmt_pd.setLabel(p.Cnd_rem_stk_lmt_pd_Label);
		p.Cnd_rem_stk_lmt_pd_typ_Group = p.beansFactory.createButtonGroup("Cnd.rem_stk_lmt_pd_typ");
		p.Cnd_rem_stk_lmt_pd_typ_0 = p.beansFactory.createRadioButton("Cnd.rem_stk_lmt_pd_typ_0");
		p.Cnd_rem_stk_lmt_pd_typ_1 = p.beansFactory.createRadioButton("Cnd.rem_stk_lmt_pd_typ_1");
		p.Cnd_trg_stk_lmt_dt_Label = p.beansFactory.createLabel("Cnd.trg_stk_lmt_dt_Label");
		p.Cnd_trg_stk_lmt_dt = p.beansFactory.createDateField("Cnd.trg_stk_lmt_dt");
		p.Cnd_trg_stk_lmt_dt.setLabel(p.Cnd_trg_stk_lmt_dt_Label);
		p.Cnd_unreg_lmt_flg = p.beansFactory.createCheckBox("Cnd.unreg_lmt_flg");
		p.Cnd_disp_mrp_use_dt_flg = p.beansFactory.createCheckBox("Cnd.disp_mrp_use_dt_flg");
		p.Cnd_ver_no_Label = p.beansFactory.createLabel("Cnd.ver_no_Label");
		p.Cnd_ver_no = p.beansFactory.createTextField("Cnd.ver_no");
		p.Cnd_ver_no.setLabel(p.Cnd_ver_no_Label);
		p.Cnd_lot_no_Label = p.beansFactory.createLabel("Cnd.lot_no_Label");
		p.Cnd_lot_no = p.beansFactory.createTextField("Cnd.lot_no");
		p.Cnd_lot_no.setLabel(p.Cnd_lot_no_Label);
		p.Cnd_sublot_no = p.beansFactory.createTextComboBox("Cnd.sublot_no");
		p.Cnd_quality_typ_Label = p.beansFactory.createLabel("Cnd.quality_typ_Label");
		p.Cnd_quality_typ = p.beansFactory.createTextComboBox("Cnd.quality_typ");
		p.Cnd_quality_typ.setLabel(p.Cnd_quality_typ_Label);
		p.Cnd_quality_typ_nm = p.beansFactory.createTextField("Cnd.quality_typ_nm");
		p.Cnd_gd_cd_Label = p.beansFactory.createLabel("Cnd.gd_cd_Label");
		p.Cnd_gd_cd = p.beansFactory.createTextComboBox("Cnd.gd_cd");
		p.Cnd_gd_cd.setLabel(p.Cnd_gd_cd_Label);
		p.Cnd_gd_nm = p.beansFactory.createTextField("Cnd.gd_nm");
		p.Cnd_stk_id_typ_Label = p.beansFactory.createLabel("Cnd.stk_id_typ_Label");
		p.Cnd_stk_id_typ = p.beansFactory.createTextComboBox("Cnd.stk_id_typ");
		p.Cnd_stk_id_typ.setLabel(p.Cnd_stk_id_typ_Label);
		p.Cnd_stk_id_typ_nm = p.beansFactory.createTextField("Cnd.stk_id_typ_nm");
		p.Cnd_pack_unit_cd_Label = p.beansFactory.createLabel("Cnd.pack_unit_cd_Label");
		p.Cnd_pack_unit_cd = p.beansFactory.createTextComboBox("Cnd.pack_unit_cd");
		p.Cnd_pack_unit_cd.setLabel(p.Cnd_pack_unit_cd_Label);
		p.Cnd_pack_unit_nm = p.beansFactory.createTextField("Cnd.pack_unit_nm");
		p.Cnd_first_gr_dt_fr_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_fr_Label");
		p.Cnd_first_gr_dt_fr = p.beansFactory.createDateField("Cnd.first_gr_dt_fr");
		p.Cnd_first_gr_dt_fr.setLabel(p.Cnd_first_gr_dt_fr_Label);
		p.Cnd_first_gr_dt_to_Label = p.beansFactory.createLabel("Cnd.first_gr_dt_to_Label");
		p.Cnd_first_gr_dt_to = p.beansFactory.createDateField("Cnd.first_gr_dt_to");
		p.Cnd_first_gr_dt_to.setLabel(p.Cnd_first_gr_dt_to_Label);
		p.Cnd_str_ln_cd_Label = p.beansFactory.createLabel("Cnd.str_ln_cd_Label");
		p.Cnd_str_ln_cd = p.beansFactory.createTextComboBox("Cnd.str_ln_cd");
		p.Cnd_str_ln_cd.setLabel(p.Cnd_str_ln_cd_Label);
		p.Cnd_str_ln_nm = p.beansFactory.createTextField("Cnd.str_ln_nm");
		p.Cnd_insp_schd_no_Label = p.beansFactory.createLabel("Cnd.insp_schd_no_Label");
		p.Cnd_insp_schd_no = p.beansFactory.createTextField("Cnd.insp_schd_no");
		p.Cnd_insp_schd_no.setLabel(p.Cnd_insp_schd_no_Label);
		p.Cnd_lot_rmrks_Label = p.beansFactory.createLabel("Cnd.lot_rmrks_Label");
		p.Cnd_lot_rmrks = p.beansFactory.createTextField("Cnd.lot_rmrks");
		p.Cnd_lot_rmrks.setLabel(p.Cnd_lot_rmrks_Label);
		p.Cnd_insp_cnt_rmrks_Label = p.beansFactory.createLabel("Cnd.insp_cnt_rmrks_Label");
		p.Cnd_insp_cnt_rmrks = p.beansFactory.createTextField("Cnd.insp_cnt_rmrks");
		p.Cnd_insp_cnt_rmrks.setLabel(p.Cnd_insp_cnt_rmrks_Label);
		p.Cnd_sub_char1_Label = p.beansFactory.createLabel("Cnd.sub_char1_Label");
		p.Cnd_sub_char1 = p.beansFactory.createTextField("Cnd.sub_char1");
		p.Cnd_sub_char1.setLabel(p.Cnd_sub_char1_Label);
		p.Cnd_sub_char2_Label = p.beansFactory.createLabel("Cnd.sub_char2_Label");
		p.Cnd_sub_char2 = p.beansFactory.createTextField("Cnd.sub_char2");
		p.Cnd_sub_char2.setLabel(p.Cnd_sub_char2_Label);
		p.Cnd_sub_char3_Label = p.beansFactory.createLabel("Cnd.sub_char3_Label");
		p.Cnd_sub_char3 = p.beansFactory.createTextField("Cnd.sub_char3");
		p.Cnd_sub_char3.setLabel(p.Cnd_sub_char3_Label);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd2(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel = p.beansFactory.createPanel("Cnd2");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [RPnl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRPnl(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.RPnlPanel = p.beansFactory.createPanel("RPnl");
		// ブロックの項目の初期化
		p.RPnl_dwnld = p.beansFactory.createButton("RPnl.dwnld", "dwnld");
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRslt(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.RsltPanel = p.beansFactory.createPanel("Rslt");
		p.RsltScrollPane = p.beansFactory.createScrollPane("Rslt.scroll");
		p.createRsltTable();
		// ブロックの項目の初期化
		p.columnRslt_check = p.beansFactory.createTableColumn("Rslt.check", MCColumnType.CHECK);
		p.columnRslt_itm_typ = p.beansFactory.createTableColumn("Rslt.itm_typ", MCColumnType.TEXT);
		p.columnRslt_itm_typ_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_cd = p.beansFactory.createTableColumn("Rslt.itm_typ_d_cd", MCColumnType.TEXT);
		p.columnRslt_itm_typ_d_nm = p.beansFactory.createTableColumn("Rslt.itm_typ_d_nm", MCColumnType.TEXT);
		p.columnRslt_lot_no = p.beansFactory.createTableColumn("Rslt.lot_no", MCColumnType.TEXT);
		p.columnRslt_sublot_no = p.beansFactory.createTableColumn("Rslt.sublot_no", MCColumnType.TEXT);
		p.columnRslt_ver_no = p.beansFactory.createTableColumn("Rslt.ver_no", MCColumnType.TEXT);
		p.columnRslt_ac_dt = p.beansFactory.createTableColumn("Rslt.ac_dt", MCColumnType.DATE);
		p.columnRslt_pack_unit_cd = p.beansFactory.createTableColumn("Rslt.pack_unit_cd", MCColumnType.TEXT);
		p.columnRslt_pack_unit_nm = p.beansFactory.createTableColumn("Rslt.pack_unit_nm", MCColumnType.TEXT);
		p.columnRslt_pack_dec_place = p.beansFactory.createTableColumn("Rslt.pack_dec_place", MCColumnType.NUMBER);
		p.columnRslt_base_unit_cd = p.beansFactory.createTableColumn("Rslt.base_unit_cd", MCColumnType.TEXT);
		p.columnRslt_base_unit_nm = p.beansFactory.createTableColumn("Rslt.base_unit_nm", MCColumnType.TEXT);
		p.columnRslt_base_dec_place = p.beansFactory.createTableColumn("Rslt.base_dec_place", MCColumnType.NUMBER);
		p.columnRslt_first_gr_dt = p.beansFactory.createTableColumn("Rslt.first_gr_dt", MCColumnType.DATE);
		p.columnRslt_unreg_lmt_flg = p.beansFactory.createTableColumn("Rslt.unreg_lmt_flg", MCColumnType.CHECK);
		p.columnRslt_lmt_dt_frm_typ = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ", MCColumnType.TEXT);
		p.columnRslt_lmt_dt_frm_typ_nm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm_typ_nm", MCColumnType.TEXT);
		p.columnRslt_lmt_dt_frm = p.beansFactory.createTableColumn("Rslt.lmt_dt_frm", MCColumnType.DATE);
		p.columnRslt_vld_dt = p.beansFactory.createTableColumn("Rslt.vld_dt", MCColumnType.DATE);
		p.columnRslt_lmt_dt = p.beansFactory.createTableColumn("Rslt.lmt_dt", MCColumnType.DATE);
		p.columnRslt_mrp_use_dt = p.beansFactory.createTableColumn("Rslt.mrp_use_dt", MCColumnType.DATE);
		p.columnRslt_loc_cd = p.beansFactory.createTableColumn("Rslt.loc_cd", MCColumnType.TEXT);
		p.columnRslt_loc_nm = p.beansFactory.createTableColumn("Rslt.loc_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd = p.beansFactory.createTableColumn("Rslt.str_ln_cd", MCColumnType.TEXT);
		p.columnRslt_str_ln_nm = p.beansFactory.createTableColumn("Rslt.str_ln_nm", MCColumnType.TEXT);
		p.columnRslt_str_ln_cd_none_flg = p.beansFactory.createTableColumn("Rslt.str_ln_cd_none_flg", MCColumnType.CHECK);
		p.columnRslt_stk_arrv_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_cd", MCColumnType.TEXT);
		p.columnRslt_stk_arrv_bp_nm = p.beansFactory.createTableColumn("Rslt.stk_arrv_bp_nm", MCColumnType.TEXT);
		p.columnRslt_wg_cd = p.beansFactory.createTableColumn("Rslt.wg_cd", MCColumnType.TEXT);
		p.columnRslt_wg_nm = p.beansFactory.createTableColumn("Rslt.wg_nm", MCColumnType.TEXT);
		p.columnRslt_in_xfr_typ = p.beansFactory.createTableColumn("Rslt.in_xfr_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ = p.beansFactory.createTableColumn("Rslt.quality_typ", MCColumnType.TEXT);
		p.columnRslt_quality_typ_nm = p.beansFactory.createTableColumn("Rslt.quality_typ_nm", MCColumnType.TEXT);
		p.columnRslt_stk_insp_typ = p.beansFactory.createTableColumn("Rslt.stk_insp_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ = p.beansFactory.createTableColumn("Rslt.stk_id_typ", MCColumnType.TEXT);
		p.columnRslt_stk_id_typ_nm = p.beansFactory.createTableColumn("Rslt.stk_id_typ_nm", MCColumnType.TEXT);
		p.columnRslt_gd_cd = p.beansFactory.createTableColumn("Rslt.gd_cd", MCColumnType.TEXT);
		p.columnRslt_gd_nm = p.beansFactory.createTableColumn("Rslt.gd_nm", MCColumnType.TEXT);
		p.columnRslt_lmt_up_flg = p.beansFactory.createTableColumn("Rslt.lmt_up_flg", MCColumnType.CHECK);
		p.columnRslt_def_lmt_ctl_categ = p.beansFactory.createTableColumn("Rslt.def_lmt_ctl_categ", MCColumnType.TEXT);
		p.columnRslt_stk_bp_cd = p.beansFactory.createTableColumn("Rslt.stk_bp_cd", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_unit_cd = p.beansFactory.createTableColumn("Rslt.cont_fctr_unit_cd", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_unit_nm = p.beansFactory.createTableColumn("Rslt.cont_fctr_unit_nm", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_flg = p.beansFactory.createTableColumn("Rslt.cont_fctr_flg", MCColumnType.CHECK);
		p.columnRslt_cont_fctr_rnd_typ = p.beansFactory.createTableColumn("Rslt.cont_fctr_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_cont_fctr_dec_place = p.beansFactory.createTableColumn("Rslt.cont_fctr_dec_place", MCColumnType.NUMBER);
		p.columnRslt_insp_cnt_rmrks = p.beansFactory.createTableColumn("Rslt.insp_cnt_rmrks", MCColumnType.TEXT);
		p.columnRslt_lot_rmrks = p.beansFactory.createTableColumn("Rslt.lot_rmrks", MCColumnType.TEXT);
		p.columnRslt_sub_char1 = p.beansFactory.createTableColumn("Rslt.sub_char1", MCColumnType.TEXT);
		p.columnRslt_sub_char2 = p.beansFactory.createTableColumn("Rslt.sub_char2", MCColumnType.TEXT);
		p.columnRslt_sub_char3 = p.beansFactory.createTableColumn("Rslt.sub_char3", MCColumnType.TEXT);
		p.columnRslt_insp_mtd_typ = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ", MCColumnType.TEXT);
		p.columnRslt_insp_mtd_typ_nm = p.beansFactory.createTableColumn("Rslt.insp_mtd_typ_nm", MCColumnType.TEXT);
		p.columnRslt_insp_schd_no = p.beansFactory.createTableColumn("Rslt.insp_schd_no", MCColumnType.TEXT);
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
		p.columnRslt_upd_cntr = p.beansFactory.createTableColumn("Rslt.upd_cntr", MCColumnType.NUMBER);
		p.columnRslt_fix_no_typ = p.beansFactory.createTableColumn("Rslt.fix_no_typ", MCColumnType.TEXT);
		p.columnRslt_fix_no = p.beansFactory.createTableColumn("Rslt.fix_no", MCColumnType.TEXT);
		p.columnRslt_asst_typ = p.beansFactory.createTableColumn("Rslt.asst_typ", MCColumnType.TEXT);
		p.columnRslt_base_unit_rnd_typ = p.beansFactory.createTableColumn("Rslt.base_unit_rnd_typ", MCColumnType.TEXT);
		p.columnRslt_pack_dmn_qty = p.beansFactory.createTableColumn("Rslt.pack_dmn_qty", MCColumnType.NUMBER);
		p.columnRslt_pack_conv_qty = p.beansFactory.createTableColumn("Rslt.pack_conv_qty", MCColumnType.NUMBER);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0030 = p.beansFactory.createButton("Btn.open_MSBFP0030", "open");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_upd_lmt_schd = p.beansFactory.createButton("Btn.upd_lmt_schd", "upd");
		p.Btn_upd_schd = p.beansFactory.createButton("Btn.upd_schd", "upd");
		p.Btn_del_lmt_schdt = p.beansFactory.createButton("Btn.del_lmt_schdt", "del");
		p.Btn_del_schd = p.beansFactory.createButton("Btn.del_schd", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBFP_LotInspSchdReg p) {
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
	protected static void jbInitTop(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BulkSetPanel);
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
	protected static void jbInitFold(MSBFP_LotInspSchdReg p) {
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
	protected static void jbInitTab1(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.Tab1Panel.setValueCheck(false);
		p.Tab1Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Tab1Panel.add(p.CndPanel, null);
		p.Tab1Panel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setValueCheck(false);
		p.Tab2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Tab2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Tab2Panel.add(p.Cnd2Panel, null);
		p.Tab2Panel.setLastBeans(p.Cnd2Panel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_LMT_UP);
		p.Cnd_ope_LMT_UP.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_LMT_UP);
		p.ScreenOpePanel.add(p.Cnd_ope_LMT_UP);
		p.Cnd_ope_LMT_UP.setNextBeans(p.Cnd_ope_INSP_SCHD);
		p.Cnd_ope_INSP_SCHD.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_INSP_SCHD);
		p.ScreenOpePanel.add(p.Cnd_ope_INSP_SCHD);
		p.Cnd_ope_INSP_SCHD.setNextBeans(p.Cnd_ope_DEL_LMT_UP);
		p.Cnd_ope_DEL_LMT_UP.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_LMT_UP);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_LMT_UP);
		p.Cnd_ope_DEL_LMT_UP.setNextBeans(p.Cnd_ope_DEL_INSP_SCHD);
		p.Cnd_ope_DEL_INSP_SCHD.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL_INSP_SCHD);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL_INSP_SCHD);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.ope_META);
		p.CndPanel.add(p.Cnd_today_Label);
		p.CndPanel.add(p.Cnd_today);
		p.CndPanel.setLastBeans(p.Cnd_today);
		p.Cnd_today.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_today.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.today_META);
		p.Cnd_today.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_loc_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_loc_cd_Label);
		p.CndPanel.add(p.Cnd_loc_cd);
		p.Cnd_loc_cd.setNextBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.loc_cd_META);
		p.Cnd_loc_cd.addLinkBeans(p.Cnd_loc_nm);
		p.Cnd_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_loc_cd, true);
		p.CndPanel.add(p.Cnd_loc_nm);
		p.Cnd_loc_nm.setNextBeans(p.Cnd_rem_stk_vld_pd);
		p.Cnd_loc_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.loc_nm_META);
		p.setPluralValueEnable(p.Cnd_loc_nm, true);
		p.CndPanel.add(p.Cnd_rem_stk_vld_pd_Label);
		p.CndPanel.add(p.Cnd_rem_stk_vld_pd);
		p.Cnd_rem_stk_vld_pd.setNextBeans(p.Cnd_rem_stk_vld_pd_typ_Group);
		p.Cnd_rem_stk_vld_pd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.rem_stk_vld_pd_META);
		p.Cnd_rem_stk_vld_pd.setMinusEnable(true);
		p.Cnd_rem_stk_vld_pd_typ_Group.setFirstBeans(p.Cnd_rem_stk_vld_pd_typ_0);
		p.Cnd_rem_stk_vld_pd_typ_0.setActionCommand("0");
		p.Cnd_rem_stk_vld_pd_typ_Group.add(p.Cnd_rem_stk_vld_pd_typ_0);
		p.CndPanel.add(p.Cnd_rem_stk_vld_pd_typ_0);
		p.Cnd_rem_stk_vld_pd_typ_0.setNextBeans(p.Cnd_rem_stk_vld_pd_typ_1);
		p.Cnd_rem_stk_vld_pd_typ_1.setActionCommand("1");
		p.Cnd_rem_stk_vld_pd_typ_Group.add(p.Cnd_rem_stk_vld_pd_typ_1);
		p.CndPanel.add(p.Cnd_rem_stk_vld_pd_typ_1);
		p.Cnd_rem_stk_vld_pd_typ_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.rem_stk_vld_pd_typ_META);
		p.Cnd_rem_stk_vld_pd_typ_Group.setNextBeans(p.Cnd_trg_stk_vld_dt);
		p.CndPanel.add(p.Cnd_trg_stk_vld_dt_Label);
		p.CndPanel.add(p.Cnd_trg_stk_vld_dt);
		p.Cnd_trg_stk_vld_dt.setNextBeans(p.Cnd_rem_stk_lmt_pd);
		p.Cnd_trg_stk_vld_dt.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.trg_stk_vld_dt_META);
		p.Cnd_trg_stk_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_rem_stk_lmt_pd_Label);
		p.CndPanel.add(p.Cnd_rem_stk_lmt_pd);
		p.Cnd_rem_stk_lmt_pd.setNextBeans(p.Cnd_rem_stk_lmt_pd_typ_Group);
		p.Cnd_rem_stk_lmt_pd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.rem_stk_lmt_pd_META);
		p.Cnd_rem_stk_lmt_pd.setMinusEnable(true);
		p.Cnd_rem_stk_lmt_pd_typ_Group.setFirstBeans(p.Cnd_rem_stk_lmt_pd_typ_0);
		p.Cnd_rem_stk_lmt_pd_typ_0.setActionCommand("0");
		p.Cnd_rem_stk_lmt_pd_typ_Group.add(p.Cnd_rem_stk_lmt_pd_typ_0);
		p.CndPanel.add(p.Cnd_rem_stk_lmt_pd_typ_0);
		p.Cnd_rem_stk_lmt_pd_typ_0.setNextBeans(p.Cnd_rem_stk_lmt_pd_typ_1);
		p.Cnd_rem_stk_lmt_pd_typ_1.setActionCommand("1");
		p.Cnd_rem_stk_lmt_pd_typ_Group.add(p.Cnd_rem_stk_lmt_pd_typ_1);
		p.CndPanel.add(p.Cnd_rem_stk_lmt_pd_typ_1);
		p.Cnd_rem_stk_lmt_pd_typ_Group.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.rem_stk_lmt_pd_typ_META);
		p.Cnd_rem_stk_lmt_pd_typ_Group.setNextBeans(p.Cnd_trg_stk_lmt_dt);
		p.CndPanel.add(p.Cnd_trg_stk_lmt_dt_Label);
		p.CndPanel.add(p.Cnd_trg_stk_lmt_dt);
		p.Cnd_trg_stk_lmt_dt.setNextBeans(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_trg_stk_lmt_dt.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.trg_stk_lmt_dt_META);
		p.Cnd_trg_stk_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_itm_typ_p_PPanel);
		p.Cnd_itm_typ_p_PPanel.setNextBeans(p.Cnd_unreg_lmt_flg);
		p.CndPanel.add(p.Cnd_unreg_lmt_flg);
		p.Cnd_unreg_lmt_flg.setNextBeans(p.Cnd_disp_mrp_use_dt_flg);
		p.Cnd_unreg_lmt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.unreg_lmt_flg_META);
		p.CndPanel.add(p.Cnd_disp_mrp_use_dt_flg);
		p.Cnd_disp_mrp_use_dt_flg.setNextBeans(p.Cnd_itm_p_PPanel);
		p.Cnd_disp_mrp_use_dt_flg.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.disp_mrp_use_dt_flg_META);
		p.CndPanel.add(p.Cnd_itm_p_PPanel);
		p.Cnd_itm_p_PPanel.setNextBeans(p.Cnd_ver_no);
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
		p.CndPanel.add(p.Cnd_ver_no_Label);
		p.CndPanel.add(p.Cnd_ver_no);
		p.Cnd_ver_no.setNextBeans(p.Cnd_lot_no);
		p.Cnd_ver_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.ver_no_META);
		p.setPluralValueEnable(p.Cnd_ver_no, true);
		p.CndPanel.add(p.Cnd_lot_no_Label);
		p.CndPanel.add(p.Cnd_lot_no);
		p.Cnd_lot_no.setNextBeans(p.Cnd_sublot_no);
		p.Cnd_lot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.lot_no_META);
		p.Cnd_lot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_lot_no, true);
		p.Cnd_sublot_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sublot_no, true);
		p.CndPanel.add(p.Cnd_sublot_no);
		p.Cnd_sublot_no.setNextBeans(p.Cnd_quality_typ);
		p.Cnd_sublot_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.sublot_no_META);
		p.Cnd_quality_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_quality_typ, true);
		p.Cnd_quality_typ.setLinkBeans(p.Cnd_quality_typ_nm);
		p.CndPanel.add(p.Cnd_quality_typ_Label);
		p.CndPanel.add(p.Cnd_quality_typ);
		p.Cnd_quality_typ.setNextBeans(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.quality_typ_META);
		p.CndPanel.add(p.Cnd_quality_typ_nm);
		p.Cnd_quality_typ_nm.setNextBeans(p.Cnd_gd_cd);
		p.Cnd_quality_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.quality_typ_nm_META);
		p.Cnd_gd_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_gd_cd, true);
		p.Cnd_gd_cd.setLinkBeans(p.Cnd_gd_nm);
		p.CndPanel.add(p.Cnd_gd_cd_Label);
		p.CndPanel.add(p.Cnd_gd_cd);
		p.Cnd_gd_cd.setNextBeans(p.Cnd_gd_nm);
		p.Cnd_gd_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.gd_cd_META);
		p.CndPanel.add(p.Cnd_gd_nm);
		p.Cnd_gd_nm.setNextBeans(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_gd_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.gd_nm_META);
		p.setPluralValueEnable(p.Cnd_gd_nm, true);
		p.CndPanel.add(p.Cnd_sno_wrk_no_p_PPanel);
		p.Cnd_sno_wrk_no_p_PPanel.setNextBeans(p.Cnd_stk_id_typ);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno1, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno2, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno3, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_sno4, true);
		p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_no, true);
		p.setPluralValueEnable(p.Cnd_sno_wrk_no_p_PPanel.SnoWrkNo_wrk_nm, true);
		p.Cnd_stk_id_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_stk_id_typ, true);
		p.Cnd_stk_id_typ.setLinkBeans(p.Cnd_stk_id_typ_nm);
		p.CndPanel.add(p.Cnd_stk_id_typ_Label);
		p.CndPanel.add(p.Cnd_stk_id_typ);
		p.Cnd_stk_id_typ.setNextBeans(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.stk_id_typ_META);
		p.CndPanel.add(p.Cnd_stk_id_typ_nm);
		p.Cnd_stk_id_typ_nm.setNextBeans(p.Cnd_pack_unit_cd);
		p.Cnd_stk_id_typ_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.stk_id_typ_nm_META);
		p.setPluralValueEnable(p.Cnd_stk_id_typ_nm, true);
		p.Cnd_pack_unit_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_pack_unit_cd, true);
		p.Cnd_pack_unit_cd.setLinkBeans(p.Cnd_pack_unit_nm);
		p.CndPanel.add(p.Cnd_pack_unit_cd_Label);
		p.CndPanel.add(p.Cnd_pack_unit_cd);
		p.Cnd_pack_unit_cd.setNextBeans(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.pack_unit_cd_META);
		p.CndPanel.add(p.Cnd_pack_unit_nm);
		p.Cnd_pack_unit_nm.setNextBeans(p.Cnd_first_gr_dt_fr);
		p.Cnd_pack_unit_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.pack_unit_nm_META);
		p.setPluralValueEnable(p.Cnd_pack_unit_nm, true);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_fr);
		p.Cnd_first_gr_dt_fr.setNextBeans(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_fr.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.first_gr_dt_fr_META);
		p.Cnd_first_gr_dt_fr.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_first_gr_dt_to_Label);
		p.CndPanel.add(p.Cnd_first_gr_dt_to);
		p.Cnd_first_gr_dt_to.setNextBeans(p.Cnd_str_ln_cd);
		p.Cnd_first_gr_dt_to.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.first_gr_dt_to_META);
		p.Cnd_first_gr_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Cnd_str_ln_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_str_ln_cd, true);
		p.Cnd_str_ln_cd.setLinkBeans(p.Cnd_str_ln_nm);
		p.CndPanel.add(p.Cnd_str_ln_cd_Label);
		p.CndPanel.add(p.Cnd_str_ln_cd);
		p.Cnd_str_ln_cd.setNextBeans(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_cd.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.str_ln_cd_META);
		p.CndPanel.add(p.Cnd_str_ln_nm);
		p.Cnd_str_ln_nm.setNextBeans(p.Cnd_insp_schd_no);
		p.Cnd_str_ln_nm.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.str_ln_nm_META);
		p.setPluralValueEnable(p.Cnd_str_ln_nm, true);
		p.CndPanel.add(p.Cnd_insp_schd_no_Label);
		p.CndPanel.add(p.Cnd_insp_schd_no);
		p.Cnd_insp_schd_no.setNextBeans(p.Cnd_lot_rmrks);
		p.Cnd_insp_schd_no.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.insp_schd_no_META);
		p.setPluralValueEnable(p.Cnd_insp_schd_no, true);
		p.CndPanel.add(p.Cnd_lot_rmrks_Label);
		p.CndPanel.add(p.Cnd_lot_rmrks);
		p.Cnd_lot_rmrks.setNextBeans(p.Cnd_insp_cnt_rmrks);
		p.Cnd_lot_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.lot_rmrks_META);
		p.setPluralValueEnable(p.Cnd_lot_rmrks, true);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks_Label);
		p.CndPanel.add(p.Cnd_insp_cnt_rmrks);
		p.Cnd_insp_cnt_rmrks.setNextBeans(p.Cnd_sub_char1);
		p.Cnd_insp_cnt_rmrks.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.insp_cnt_rmrks_META);
		p.setPluralValueEnable(p.Cnd_insp_cnt_rmrks, true);
		p.CndPanel.add(p.Cnd_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sub_char1);
		p.Cnd_sub_char1.setNextBeans(p.Cnd_sub_char2);
		p.Cnd_sub_char1.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sub_char1, true);
		p.CndPanel.add(p.Cnd_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sub_char2);
		p.Cnd_sub_char2.setNextBeans(p.Cnd_sub_char3);
		p.Cnd_sub_char2.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sub_char2, true);
		p.CndPanel.add(p.Cnd_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sub_char3);
		p.Cnd_sub_char3.setRow(p.getCndR(), mcframe.clientMSBF.MSBFP0010.CndR.sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sub_char3, true);
		p.Cnd2Panel.add(p.Cnd_itm_grp_p_PPanel);
		p.Cnd2Panel.setLastBeans(p.Cnd_itm_grp_p_PPanel);
	}

	/**
	 * [Cnd2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd2(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.Cnd2Panel.setValueCheck(false);
		p.Cnd2Panel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.Cnd2Panel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBFP_LotInspSchdReg p) {
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
	protected static void jbInitRPnl(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.RPnlPanel.setValueCheck(false);
		p.RPnlPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RPnlPanel.setLayoutPosition("SE");
		// ブロックの項目の初期化
		p.RPnl_dwnld.setIcon("DWNLD");
		p.RPnl_dwnld.setFunctionKey(MCFunctionKey.F11);
		p.RPnlPanel.add(p.RPnl_dwnld);
		p.RPnlPanel.setLastBeans(p.RPnl_dwnld);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.RsltPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_p_PPanel);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt_p_PPanel);
		p.BulkSet_st_dt_p_PPanel.setNextBeans(p.BulkSet_end_dt_p_PPanel);
		p.BulkSetPanel.add(p.BulkSet_end_dt_p_PPanel);
	}

	/**
	 * [Rslt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRslt(MSBFP_LotInspSchdReg p) {
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
	protected static void jbInitBtn(MSBFP_LotInspSchdReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MSBFP0030.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MSBFP0030);
		p.BtnPanel.setLastBeans(p.Btn_open_MSBFP0030);
		p.Btn_open_MSBFP0030.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_upd_lmt_schd);
		p.Btn_upd_lmt_schd.setIcon("REGISTER");
		p.Btn_upd_lmt_schd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_lmt_schd);
		p.Btn_upd_lmt_schd.setNextBeans(p.Btn_upd_schd);
		p.Btn_upd_schd.setIcon("REGISTER");
		p.Btn_upd_schd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_schd);
		p.Btn_del_lmt_schdt.setIcon("CANCEL");
		p.Btn_del_lmt_schdt.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_lmt_schdt);
		p.EastBtnPanel.add(p.Btn_del_lmt_schdt);
		p.Btn_del_lmt_schdt.setNextBeans(p.Btn_del_schd);
		p.Btn_del_schd.setIcon("CANCEL");
		p.Btn_del_schd.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_schd);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBFP_LotInspSchdReg p) {
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
		MSBFP_LotInspSchdReg_MC.mcInitScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitTop((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitFold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitTab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitTab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitCnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitCnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitCtrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitRPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitBulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitRslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitBtn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.mcInitEastBtn((MSBFP_LotInspSchdReg)this);

		// [SRCH_LMT_UP]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__LMT__UP_EastBtn((MSBFP_LotInspSchdReg)this);

		// [LMT_UP]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitLMT__UP_EastBtn((MSBFP_LotInspSchdReg)this);

		// [SRCH_INSP_SCHD]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__INSP__SCHD_EastBtn((MSBFP_LotInspSchdReg)this);

		// [INSP_SCHD]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitINSP__SCHD_EastBtn((MSBFP_LotInspSchdReg)this);

		// [SRCH_DEL_LMT_UP]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__LMT__UP_EastBtn((MSBFP_LotInspSchdReg)this);

		// [DEL_LMT_UP]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__LMT__UP_EastBtn((MSBFP_LotInspSchdReg)this);

		// [SRCH_DEL_INSP_SCHD]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitSRCH__DEL__INSP__SCHD_EastBtn((MSBFP_LotInspSchdReg)this);

		// [DEL_INSP_SCHD]ステータスのモードの設定
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_ScreenOpe((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Top((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Fold((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Tab1((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Tab2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Cnd((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Cnd2((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Ctrl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_RPnl((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_BulkSet((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Rslt((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_Btn((MSBFP_LotInspSchdReg)this);
		MSBFP_LotInspSchdReg_MC.statusInitDEL__INSP__SCHD_EastBtn((MSBFP_LotInspSchdReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBFP_LotInspSchdReg p) {
		p.FoldTab.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBFP_LotInspSchdReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_LMT_UP.addAllListener(p);
		p.Cnd_ope_INSP_SCHD.addAllListener(p);
		p.Cnd_ope_DEL_LMT_UP.addAllListener(p);
		p.Cnd_ope_DEL_INSP_SCHD.addAllListener(p);
		p.Cnd_today.setListListener(p);
		p.Cnd_today.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_loc_cd.setListListener(p);
		p.Cnd_loc_cd.addAllListener(p);
		p.Cnd_loc_nm.setListListener(p);
		p.Cnd_loc_nm.addAllListener(p);
		p.Cnd_rem_stk_vld_pd.setListListener(p);
		p.Cnd_rem_stk_vld_pd.addAllListener(p);
		p.Cnd_rem_stk_vld_pd_typ_Group.addAllListener(p);
		p.Cnd_rem_stk_vld_pd_typ_0.addAllListener(p);
		p.Cnd_rem_stk_vld_pd_typ_1.addAllListener(p);
		p.Cnd_trg_stk_vld_dt.setListListener(p);
		p.Cnd_trg_stk_vld_dt.addAllListener(p);
		p.Cnd_rem_stk_lmt_pd.setListListener(p);
		p.Cnd_rem_stk_lmt_pd.addAllListener(p);
		p.Cnd_rem_stk_lmt_pd_typ_Group.addAllListener(p);
		p.Cnd_rem_stk_lmt_pd_typ_0.addAllListener(p);
		p.Cnd_rem_stk_lmt_pd_typ_1.addAllListener(p);
		p.Cnd_trg_stk_lmt_dt.setListListener(p);
		p.Cnd_trg_stk_lmt_dt.addAllListener(p);
		p.Cnd_unreg_lmt_flg.addAllListener(p);
		p.Cnd_disp_mrp_use_dt_flg.addAllListener(p);
		p.Cnd_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_ver_no.setListListener(p);
		p.Cnd_ver_no.addAllListener(p);
		p.Cnd_lot_no.setListListener(p);
		p.Cnd_lot_no.addAllListener(p);
		p.Cnd_sublot_no.setListListener(p);
		p.Cnd_sublot_no.addAllListener(p);
		p.Cnd_quality_typ.setListListener(p);
		p.Cnd_quality_typ.addAllListener(p);
		p.Cnd_quality_typ_nm.setListListener(p);
		p.Cnd_quality_typ_nm.addAllListener(p);
		p.Cnd_gd_cd.setListListener(p);
		p.Cnd_gd_cd.addAllListener(p);
		p.Cnd_gd_nm.setListListener(p);
		p.Cnd_gd_nm.addAllListener(p);
		p.Cnd_stk_id_typ.setListListener(p);
		p.Cnd_stk_id_typ.addAllListener(p);
		p.Cnd_stk_id_typ_nm.setListListener(p);
		p.Cnd_stk_id_typ_nm.addAllListener(p);
		p.Cnd_pack_unit_cd.setListListener(p);
		p.Cnd_pack_unit_cd.addAllListener(p);
		p.Cnd_pack_unit_nm.setListListener(p);
		p.Cnd_pack_unit_nm.addAllListener(p);
		p.Cnd_first_gr_dt_fr.setListListener(p);
		p.Cnd_first_gr_dt_fr.addAllListener(p);
		p.Cnd_first_gr_dt_to.setListListener(p);
		p.Cnd_first_gr_dt_to.addAllListener(p);
		p.Cnd_str_ln_cd.setListListener(p);
		p.Cnd_str_ln_cd.addAllListener(p);
		p.Cnd_str_ln_nm.setListListener(p);
		p.Cnd_str_ln_nm.addAllListener(p);
		p.Cnd_insp_schd_no.setListListener(p);
		p.Cnd_insp_schd_no.addAllListener(p);
		p.Cnd_lot_rmrks.setListListener(p);
		p.Cnd_lot_rmrks.addAllListener(p);
		p.Cnd_insp_cnt_rmrks.setListListener(p);
		p.Cnd_insp_cnt_rmrks.addAllListener(p);
		p.Cnd_sub_char1.setListListener(p);
		p.Cnd_sub_char1.addAllListener(p);
		p.Cnd_sub_char2.setListListener(p);
		p.Cnd_sub_char2.addAllListener(p);
		p.Cnd_sub_char3.setListListener(p);
		p.Cnd_sub_char3.addAllListener(p);
	}

	/**
	 *  [Cnd2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd2(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBFP_LotInspSchdReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [RPnl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRPnl(MSBFP_LotInspSchdReg p) {
		p.RPnl_dwnld.addAllListener(p);
		p.RPnl_dwnld.setAPMethodName("doRPnl_dwnld");
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MSBFP_LotInspSchdReg p) {
	}

	/**
	 *  [Rslt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRslt(MSBFP_LotInspSchdReg p) {
		p.RsltTable.addAllListener(p);
		p.columnRslt_check.addAllListener(p);
		p.columnRslt_itm_typ.addAllListener(p);
		p.columnRslt_itm_typ.setListListener(p);
		p.columnRslt_itm_typ_nm.addAllListener(p);
		p.columnRslt_itm_typ_nm.setListListener(p);
		p.columnRslt_itm_typ_d_cd.addAllListener(p);
		p.columnRslt_itm_typ_d_cd.setListListener(p);
		p.columnRslt_itm_typ_d_nm.addAllListener(p);
		p.columnRslt_itm_typ_d_nm.setListListener(p);
		p.columnRslt_lot_no.addAllListener(p);
		p.columnRslt_lot_no.setListListener(p);
		p.columnRslt_sublot_no.addAllListener(p);
		p.columnRslt_sublot_no.setListListener(p);
		p.columnRslt_ver_no.addAllListener(p);
		p.columnRslt_ver_no.setListListener(p);
		p.columnRslt_ac_dt.addAllListener(p);
		p.columnRslt_ac_dt.setListListener(p);
		p.columnRslt_pack_unit_cd.addAllListener(p);
		p.columnRslt_pack_unit_cd.setListListener(p);
		p.columnRslt_pack_unit_nm.addAllListener(p);
		p.columnRslt_pack_unit_nm.setListListener(p);
		p.columnRslt_pack_dec_place.addAllListener(p);
		p.columnRslt_pack_dec_place.setListListener(p);
		p.columnRslt_base_unit_cd.addAllListener(p);
		p.columnRslt_base_unit_cd.setListListener(p);
		p.columnRslt_base_unit_nm.addAllListener(p);
		p.columnRslt_base_unit_nm.setListListener(p);
		p.columnRslt_base_dec_place.addAllListener(p);
		p.columnRslt_base_dec_place.setListListener(p);
		p.columnRslt_first_gr_dt.addAllListener(p);
		p.columnRslt_first_gr_dt.setListListener(p);
		p.columnRslt_unreg_lmt_flg.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ.setListListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.addAllListener(p);
		p.columnRslt_lmt_dt_frm_typ_nm.setListListener(p);
		p.columnRslt_lmt_dt_frm.addAllListener(p);
		p.columnRslt_lmt_dt_frm.setListListener(p);
		p.columnRslt_vld_dt.addAllListener(p);
		p.columnRslt_vld_dt.setListListener(p);
		p.columnRslt_lmt_dt.addAllListener(p);
		p.columnRslt_lmt_dt.setListListener(p);
		p.columnRslt_mrp_use_dt.addAllListener(p);
		p.columnRslt_mrp_use_dt.setListListener(p);
		p.columnRslt_loc_cd.addAllListener(p);
		p.columnRslt_loc_cd.setListListener(p);
		p.columnRslt_loc_nm.addAllListener(p);
		p.columnRslt_loc_nm.setListListener(p);
		p.columnRslt_str_ln_cd.addAllListener(p);
		p.columnRslt_str_ln_cd.setListListener(p);
		p.columnRslt_str_ln_nm.addAllListener(p);
		p.columnRslt_str_ln_nm.setListListener(p);
		p.columnRslt_str_ln_cd_none_flg.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.addAllListener(p);
		p.columnRslt_stk_arrv_bp_cd.setListListener(p);
		p.columnRslt_stk_arrv_bp_nm.addAllListener(p);
		p.columnRslt_stk_arrv_bp_nm.setListListener(p);
		p.columnRslt_wg_cd.addAllListener(p);
		p.columnRslt_wg_cd.setListListener(p);
		p.columnRslt_wg_nm.addAllListener(p);
		p.columnRslt_wg_nm.setListListener(p);
		p.columnRslt_in_xfr_typ.addAllListener(p);
		p.columnRslt_in_xfr_typ.setListListener(p);
		p.columnRslt_quality_typ.addAllListener(p);
		p.columnRslt_quality_typ.setListListener(p);
		p.columnRslt_quality_typ_nm.addAllListener(p);
		p.columnRslt_quality_typ_nm.setListListener(p);
		p.columnRslt_stk_insp_typ.addAllListener(p);
		p.columnRslt_stk_insp_typ.setListListener(p);
		p.columnRslt_stk_id_typ.addAllListener(p);
		p.columnRslt_stk_id_typ.setListListener(p);
		p.columnRslt_stk_id_typ_nm.addAllListener(p);
		p.columnRslt_stk_id_typ_nm.setListListener(p);
		p.columnRslt_gd_cd.addAllListener(p);
		p.columnRslt_gd_cd.setListListener(p);
		p.columnRslt_gd_nm.addAllListener(p);
		p.columnRslt_gd_nm.setListListener(p);
		p.columnRslt_lmt_up_flg.addAllListener(p);
		p.columnRslt_def_lmt_ctl_categ.addAllListener(p);
		p.columnRslt_def_lmt_ctl_categ.setListListener(p);
		p.columnRslt_stk_bp_cd.addAllListener(p);
		p.columnRslt_stk_bp_cd.setListListener(p);
		p.columnRslt_cont_fctr_unit_cd.addAllListener(p);
		p.columnRslt_cont_fctr_unit_cd.setListListener(p);
		p.columnRslt_cont_fctr_unit_nm.addAllListener(p);
		p.columnRslt_cont_fctr_unit_nm.setListListener(p);
		p.columnRslt_cont_fctr_flg.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.addAllListener(p);
		p.columnRslt_cont_fctr_rnd_typ.setListListener(p);
		p.columnRslt_cont_fctr_dec_place.addAllListener(p);
		p.columnRslt_cont_fctr_dec_place.setListListener(p);
		p.columnRslt_insp_cnt_rmrks.addAllListener(p);
		p.columnRslt_insp_cnt_rmrks.setListListener(p);
		p.columnRslt_lot_rmrks.addAllListener(p);
		p.columnRslt_lot_rmrks.setListListener(p);
		p.columnRslt_sub_char1.addAllListener(p);
		p.columnRslt_sub_char1.setListListener(p);
		p.columnRslt_sub_char2.addAllListener(p);
		p.columnRslt_sub_char2.setListListener(p);
		p.columnRslt_sub_char3.addAllListener(p);
		p.columnRslt_sub_char3.setListListener(p);
		p.columnRslt_insp_mtd_typ.addAllListener(p);
		p.columnRslt_insp_mtd_typ.setListListener(p);
		p.columnRslt_insp_mtd_typ_nm.addAllListener(p);
		p.columnRslt_insp_mtd_typ_nm.setListListener(p);
		p.columnRslt_insp_schd_no.addAllListener(p);
		p.columnRslt_insp_schd_no.setListListener(p);
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
		p.columnRslt_upd_cntr.addAllListener(p);
		p.columnRslt_upd_cntr.setListListener(p);
		p.columnRslt_fix_no_typ.addAllListener(p);
		p.columnRslt_fix_no_typ.setListListener(p);
		p.columnRslt_fix_no.addAllListener(p);
		p.columnRslt_fix_no.setListListener(p);
		p.columnRslt_asst_typ.addAllListener(p);
		p.columnRslt_asst_typ.setListListener(p);
		p.columnRslt_base_unit_rnd_typ.addAllListener(p);
		p.columnRslt_base_unit_rnd_typ.setListListener(p);
		p.columnRslt_pack_dmn_qty.addAllListener(p);
		p.columnRslt_pack_dmn_qty.setListListener(p);
		p.columnRslt_pack_conv_qty.addAllListener(p);
		p.columnRslt_pack_conv_qty.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MSBFP_LotInspSchdReg p) {
		p.Btn_open_MSBFP0030.addAllListener(p);
		p.Btn_open_MSBFP0030.setAPMethodName("doBtn_open_MSBFP0030");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_upd_lmt_schd.addAllListener(p);
		p.Btn_upd_lmt_schd.setAPMethodName("doBtn_upd_lmt_schd");
		p.Btn_upd_schd.addAllListener(p);
		p.Btn_upd_schd.setAPMethodName("doBtn_upd_schd");
		p.Btn_del_lmt_schdt.addAllListener(p);
		p.Btn_del_lmt_schdt.setAPMethodName("doBtn_del_lmt_schdt");
		p.Btn_del_schd.addAllListener(p);
		p.Btn_del_schd.setAPMethodName("doBtn_del_schd");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBFP_LotInspSchdReg p) {
	}

	/**
	 * [SRCH_LMT_UP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_LMT_UP, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, SRCH_LMT_UP, MCMode.REQUIRED);
		p.Cnd_trg_stk_vld_dt.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, SRCH_LMT_UP, MCMode.REQUIRED);
		p.Cnd_trg_stk_lmt_dt.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_vld_dt.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_LMT_UP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, SRCH_LMT_UP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_LMT_UP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_LMT_UP, MCMode.DISABLE);
		p.Btn_upd_lmt_schd.putMode(p, SRCH_LMT_UP, MCMode.DISABLE);
		p.Btn_upd_schd.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);
		p.Btn_del_lmt_schdt.putMode(p, SRCH_LMT_UP, MCMode.DISABLE);
		p.Btn_del_schd.putMode(p, SRCH_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_LMT_UP]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__LMT__UP_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, LMT_UP, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, LMT_UP, MCMode.REQUIRED);
		p.Cnd_trg_stk_vld_dt.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, LMT_UP, MCMode.REQUIRED);
		p.Cnd_trg_stk_lmt_dt.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(LMT_UP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [LMT_UP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [LMT_UP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, LMT_UP, MCMode.ENABLE);

	}

	/**
	 * [LMT_UP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_end_dt_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);

	}

	/**
	 * [LMT_UP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, LMT_UP, MCMode.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(LMT_UP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_end_dt_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_pack_unit_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_vld_dt.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, LMT_UP, MCMode.ENABLE);
		p.columnRslt_lot_rmrks.putMode(p, LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, LMT_UP, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, LMT_UP, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, LMT_UP, MCMode.ENABLE);
		p.columnRslt_insp_mtd_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(LMT_UP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [LMT_UP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Btn_upd_lmt_schd.putMode(p, LMT_UP, MCMode.ENABLE);
		p.Btn_upd_schd.putMode(p, LMT_UP, MCMode.INVISIBLE);
		p.Btn_del_lmt_schdt.putMode(p, LMT_UP, MCMode.DISABLE);
		p.Btn_del_schd.putMode(p, LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [LMT_UP]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitLMT__UP_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, SRCH_INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_trg_stk_vld_dt.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, SRCH_INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_trg_stk_lmt_dt.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_vld_dt.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_INSP_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, SRCH_INSP_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_INSP_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_INSP_SCHD, MCMode.DISABLE);
		p.Btn_upd_lmt_schd.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_upd_schd.putMode(p, SRCH_INSP_SCHD, MCMode.DISABLE);
		p.Btn_del_lmt_schdt.putMode(p, SRCH_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_del_schd.putMode(p, SRCH_INSP_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INSP_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INSP__SCHD_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_trg_stk_vld_dt.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_trg_stk_lmt_dt.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_typ_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_stk_id_typ_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_pack_unit_nm.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_fr.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_first_gr_dt_to.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_cd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_lot_rmrks.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_cnt_rmrks.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char1.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char2.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_sub_char3.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_grp_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [INSP_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [INSP_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, INSP_SCHD, MCMode.ENABLE);

	}

	/**
	 * [INSP_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);
		p.BulkSet_end_dt_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.ENABLE);

	}

	/**
	 * [INSP_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, INSP_SCHD, MCMode.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ_d_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_itm_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, INSP_SCHD, MCMode.REQUIRED);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.Rslt_end_dt_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.REQUIRED);
		p.columnRslt_pack_unit_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRslt_base_unit_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRslt_first_gr_dt.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_unreg_lmt_flg.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_vld_dt.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_wg_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_in_xfr_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_quality_typ_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_insp_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_id_typ_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.READ_ONLY);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.READ_ONLY);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.READ_ONLY);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_cont_fctr_flg.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.columnRslt_lot_rmrks.putMode(p, INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.columnRslt_sub_char2.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.columnRslt_sub_char3.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.columnRslt_insp_mtd_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_schd_no.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_rts_msg_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(INSP_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_usr_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_id.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_func_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_ins_ts.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_id.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_usr_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_id.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_func_nm.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_ts.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_srv_req_no.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_upd_cntr.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, INSP_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [INSP_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Btn_upd_lmt_schd.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_upd_schd.putMode(p, INSP_SCHD, MCMode.ENABLE);
		p.Btn_del_lmt_schdt.putMode(p, INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_del_schd.putMode(p, INSP_SCHD, MCMode.DISABLE);

	}

	/**
	 * [INSP_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINSP__SCHD_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_LMT_UP, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_trg_stk_vld_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_trg_stk_lmt_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_first_gr_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_LMT_UP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, SRCH_DEL_LMT_UP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_LMT_UP, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_LMT_UP, MCMode.DISABLE);
		p.Btn_upd_lmt_schd.putMode(p, SRCH_DEL_LMT_UP, MCMode.DISABLE);
		p.Btn_upd_schd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);
		p.Btn_del_lmt_schdt.putMode(p, SRCH_DEL_LMT_UP, MCMode.DISABLE);
		p.Btn_del_schd.putMode(p, SRCH_DEL_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_LMT_UP]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__LMT__UP_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, DEL_LMT_UP, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_trg_stk_vld_dt.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_trg_stk_lmt_dt.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_fr.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_to.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_LMT_UP]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, DEL_LMT_UP, MCMode.ENABLE);

	}

	/**
	 * [DEL_LMT_UP]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, DEL_LMT_UP, MCMode.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.INVISIBLE);
		p.Rslt_st_dt_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_first_gr_dt.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_in_xfr_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_stk_bp_cd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_LMT_UP, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_LMT_UP, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_LMT_UP]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Btn_upd_lmt_schd.putMode(p, DEL_LMT_UP, MCMode.DISABLE);
		p.Btn_upd_schd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);
		p.Btn_del_lmt_schdt.putMode(p, DEL_LMT_UP, MCMode.ENABLE);
		p.Btn_del_schd.putMode(p, DEL_LMT_UP, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_LMT_UP]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__LMT__UP_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_trg_stk_vld_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_trg_stk_lmt_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_fr.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_to.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_itm_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.Rslt_st_dt_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_first_gr_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_in_xfr_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(SRCH_DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.DISABLE);
		p.Btn_upd_lmt_schd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_upd_schd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.DISABLE);
		p.Btn_del_lmt_schdt.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_del_schd.putMode(p, SRCH_DEL_INSP_SCHD, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL_INSP_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL__INSP__SCHD_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_ScreenOpe(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Top(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Fold(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Tab1(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Tab2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Cnd(MSBFP_LotInspSchdReg p){
		p.Cnd_ope_Group.putMode(p, DEL_INSP_SCHD, MCMode.REQUIRED);
		p.Cnd_today.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_cd.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_loc_nm.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_rem_stk_vld_pd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_vld_pd_typ_Group.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_trg_stk_vld_dt.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_rem_stk_lmt_pd_typ_Group.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_trg_stk_lmt_dt.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_typ_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0100.MAUBP_ItmTyp_S.ENABLE);
		p.Cnd_unreg_lmt_flg.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_disp_mrp_use_dt_flg.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_itm_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.ENABLE_SRCH);
		p.Cnd_ver_no.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_no.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sublot_no.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_quality_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_gd_cd.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_gd_nm.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sno_wrk_no_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMSUB.MSUBP0020.MSUBP_SnoWrkNo_S.ENABLE_SRCH);
		p.Cnd_stk_id_typ.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_stk_id_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_pack_unit_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_fr.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_first_gr_dt_to.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_str_ln_cd.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_str_ln_nm.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_insp_schd_no.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_lot_rmrks.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Cnd_insp_cnt_rmrks.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char1.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char2.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_sub_char3.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Cnd_itm_grp_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0250.MAUBP_ItmGrp_S.ENABLE);

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Cnd2]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Cnd2(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Ctrl(MSBFP_LotInspSchdReg p){

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[RPnl]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_RPnl(MSBFP_LotInspSchdReg p){
		p.RPnl_dwnld.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_BulkSet(MSBFP_LotInspSchdReg p){
		p.BulkSet_st_dt_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);
		p.BulkSet_end_dt_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP0110.MAUBP_YmdHm_H.READ_ONLY);

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Rslt]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Rslt(MSBFP_LotInspSchdReg p){
		p.columnRslt_check.putMode(p, DEL_INSP_SCHD, MCMode.REQUIRED);
		p.columnRslt_itm_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_cd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_itm_typ_d_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_itm_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRslt_lot_no.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sublot_no.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ver_no.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_sno_wrk_no_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRslt_ac_dt.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_can_ac_dt_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5240.MAUBP_CanAcDt_D.REQUIRED);
		p.Rslt_st_dt_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.Rslt_end_dt_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5320.MAUBP_YmdHm_D.READ_ONLY);
		p.columnRslt_pack_unit_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_unit_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_pack_dec_place.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_pack_unit_qty_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_pack_insp_qty_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_base_unit_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_unit_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_base_dec_place.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_base_unit_qty_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Rslt_base_unit_insp_qty_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.INVISIBLE);
		p.columnRslt_first_gr_dt.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_unreg_lmt_flg.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_lmt_dt_frm_typ.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt_frm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_vld_dt.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_dt.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_mrp_use_dt.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_loc_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_loc_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_str_ln_cd_none_flg.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_stk_arrv_bp_cd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_arrv_bp_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wg_cd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_wg_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_in_xfr_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_quality_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_insp_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_id_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_gd_cd.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_gd_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lmt_up_flg.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_def_lmt_ctl_categ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_stk_bp_cd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Rslt_act_cont_fctr_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5290.MAUBP_ActContFctr_D.INVISIBLE);
		p.Rslt_std_cont_fctr_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5280.MAUBP_StdContFctr_D.INVISIBLE);
		p.Rslt_cont_fctr_qty_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5260.MAUBP_ContQty_D.INVISIBLE);
		p.columnRslt_cont_fctr_unit_cd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_unit_nm.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_flg.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_rnd_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_cont_fctr_dec_place.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_insp_cnt_rmrks.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_lot_rmrks.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char1.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char2.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_sub_char3.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_mtd_typ_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_insp_schd_no.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.Rslt_rts_msg_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.Rslt_itm_grp_p_PPanel.putStatus(DEL_INSP_SCHD, mcframe.clientMAUB.MAUBP5170.MAUBP_ItmGrp_D.READ_ONLY);
		p.columnRslt_ins_usr_id.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_usr_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_id.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_func_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_ins_ts.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_id.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_usr_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_id.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_func_nm.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_ts.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_srv_req_no.putMode(p, DEL_INSP_SCHD, MCMode.READ_ONLY);
		p.columnRslt_upd_cntr.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_fix_no.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_asst_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_base_unit_rnd_typ.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_dmn_qty.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.columnRslt_pack_conv_qty.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_Btn(MSBFP_LotInspSchdReg p){
		p.Btn_open_MSBFP0030.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);
		p.Btn_upd_lmt_schd.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_upd_schd.putMode(p, DEL_INSP_SCHD, MCMode.DISABLE);
		p.Btn_del_lmt_schdt.putMode(p, DEL_INSP_SCHD, MCMode.INVISIBLE);
		p.Btn_del_schd.putMode(p, DEL_INSP_SCHD, MCMode.ENABLE);

	}

	/**
	 * [DEL_INSP_SCHD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL__INSP__SCHD_EastBtn(MSBFP_LotInspSchdReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH_LMT_UP;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBFP_LotInspSchdReg_MC.setTableConfigRslt((MSBFP_LotInspSchdReg)this);
	}

	/**
	 * [Rslt]ブロックのTableの設定
	 */
	protected static void setTableConfigRslt(MSBFP_LotInspSchdReg p) {
		p.columnRslt_check.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.check_META);
		p.RsltTable.addColumnConfig(p.columnRslt_check);
		p.columnRslt_itm_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.itm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ);
		p.columnRslt_itm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.itm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_nm);
		p.columnRslt_itm_typ_d_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.itm_typ_d_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_cd);
		p.columnRslt_itm_typ_d_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.itm_typ_d_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_itm_typ_d_nm);
		p.RsltTable.addTable(p.Rslt_itm_p_PPanel.ItmTable);
		p.columnRslt_lot_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_no);
		p.columnRslt_sublot_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.sublot_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sublot_no);
		p.columnRslt_ver_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ver_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ver_no);
		p.RsltTable.addTable(p.Rslt_sno_wrk_no_p_PPanel.SnoWrkNoTable);
		p.columnRslt_ac_dt.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ac_dt_META);
		p.columnRslt_ac_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ac_dt);
		p.RsltTable.addTable(p.Rslt_can_ac_dt_p_PPanel.CanAcDtTable);
		p.RsltTable.addTable(p.Rslt_st_dt_p_PPanel.YmdHmTable);
		p.RsltTable.addTable(p.Rslt_end_dt_p_PPanel.YmdHmTable);
		p.columnRslt_pack_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.pack_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_cd);
		p.columnRslt_pack_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.pack_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_unit_nm);
		p.columnRslt_pack_dec_place.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.pack_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_dec_place);
		p.RsltTable.addTable(p.Rslt_pack_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_pack_insp_qty_p_PPanel.QtyTable);
		p.columnRslt_base_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.base_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_cd);
		p.columnRslt_base_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.base_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_nm);
		p.columnRslt_base_dec_place.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.base_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_dec_place);
		p.RsltTable.addTable(p.Rslt_base_unit_qty_p_PPanel.QtyTable);
		p.RsltTable.addTable(p.Rslt_base_unit_insp_qty_p_PPanel.QtyTable);
		p.columnRslt_first_gr_dt.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.first_gr_dt_META);
		p.columnRslt_first_gr_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_first_gr_dt);
		p.columnRslt_unreg_lmt_flg.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.unreg_lmt_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_unreg_lmt_flg);
		p.columnRslt_lmt_dt_frm_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lmt_dt_frm_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ);
		p.columnRslt_lmt_dt_frm_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lmt_dt_frm_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm_typ_nm);
		p.columnRslt_lmt_dt_frm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lmt_dt_frm_META);
		p.columnRslt_lmt_dt_frm.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt_frm);
		p.columnRslt_vld_dt.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.vld_dt_META);
		p.columnRslt_vld_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_vld_dt);
		p.columnRslt_lmt_dt.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lmt_dt_META);
		p.columnRslt_lmt_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_dt);
		p.columnRslt_mrp_use_dt.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.mrp_use_dt_META);
		p.columnRslt_mrp_use_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_mrp_use_dt);
		p.columnRslt_loc_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.loc_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_cd);
		p.columnRslt_loc_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.loc_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_loc_nm);
		p.columnRslt_str_ln_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.str_ln_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd);
		p.columnRslt_str_ln_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.str_ln_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_nm);
		p.columnRslt_str_ln_cd_none_flg.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.str_ln_cd_none_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_str_ln_cd_none_flg);
		p.columnRslt_stk_arrv_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_arrv_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_cd);
		p.columnRslt_stk_arrv_bp_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_arrv_bp_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_arrv_bp_nm);
		p.columnRslt_wg_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.wg_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_cd);
		p.columnRslt_wg_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.wg_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_wg_nm);
		p.columnRslt_in_xfr_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.in_xfr_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_in_xfr_typ);
		p.columnRslt_quality_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.quality_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ);
		p.columnRslt_quality_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.quality_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_quality_typ_nm);
		p.columnRslt_stk_insp_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_insp_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_insp_typ);
		p.columnRslt_stk_id_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_id_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ);
		p.columnRslt_stk_id_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_id_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_id_typ_nm);
		p.columnRslt_gd_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.gd_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_cd);
		p.columnRslt_gd_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.gd_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_gd_nm);
		p.columnRslt_lmt_up_flg.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lmt_up_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lmt_up_flg);
		p.columnRslt_def_lmt_ctl_categ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.def_lmt_ctl_categ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_def_lmt_ctl_categ);
		p.columnRslt_stk_bp_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.stk_bp_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_stk_bp_cd);
		p.RsltTable.addTable(p.Rslt_act_cont_fctr_p_PPanel.ActContFctrTable);
		p.RsltTable.addTable(p.Rslt_std_cont_fctr_p_PPanel.StdContFctrTable);
		p.RsltTable.addTable(p.Rslt_cont_fctr_qty_p_PPanel.ContQtyTable);
		p.columnRslt_cont_fctr_unit_cd.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.cont_fctr_unit_cd_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_unit_cd);
		p.columnRslt_cont_fctr_unit_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.cont_fctr_unit_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_unit_nm);
		p.columnRslt_cont_fctr_flg.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.cont_fctr_flg_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_flg);
		p.columnRslt_cont_fctr_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.cont_fctr_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_rnd_typ);
		p.columnRslt_cont_fctr_dec_place.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.cont_fctr_dec_place_META);
		p.RsltTable.addColumnConfig(p.columnRslt_cont_fctr_dec_place);
		p.columnRslt_insp_cnt_rmrks.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.insp_cnt_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_cnt_rmrks);
		p.columnRslt_lot_rmrks.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.lot_rmrks_META);
		p.RsltTable.addColumnConfig(p.columnRslt_lot_rmrks);
		p.columnRslt_sub_char1.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.sub_char1_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char1);
		p.columnRslt_sub_char2.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.sub_char2_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char2);
		p.columnRslt_sub_char3.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.sub_char3_META);
		p.RsltTable.addColumnConfig(p.columnRslt_sub_char3);
		p.columnRslt_insp_mtd_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.insp_mtd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ);
		p.columnRslt_insp_mtd_typ_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.insp_mtd_typ_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_mtd_typ_nm);
		p.columnRslt_insp_schd_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.insp_schd_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_insp_schd_no);
		p.RsltTable.addTable(p.Rslt_rts_msg_p_PPanel.RtnMsgTable);
		p.RsltTable.addTable(p.Rslt_itm_grp_p_PPanel.ItmGrpTable);
		p.columnRslt_ins_usr_id.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ins_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_id);
		p.columnRslt_ins_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ins_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_usr_nm);
		p.columnRslt_ins_func_id.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ins_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_id);
		p.columnRslt_ins_func_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ins_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_func_nm);
		p.columnRslt_ins_ts.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.ins_ts_META);
		p.columnRslt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_ins_ts);
		p.columnRslt_upd_usr_id.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_usr_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_id);
		p.columnRslt_upd_usr_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_usr_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_usr_nm);
		p.columnRslt_upd_func_id.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_func_id_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_id);
		p.columnRslt_upd_func_nm.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_func_nm_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_func_nm);
		p.columnRslt_upd_ts.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_ts_META);
		p.columnRslt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_ts);
		p.columnRslt_upd_srv_req_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_srv_req_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_srv_req_no);
		p.columnRslt_upd_cntr.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.upd_cntr_META);
		p.RsltTable.addColumnConfig(p.columnRslt_upd_cntr);
		p.columnRslt_fix_no_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.fix_no_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no_typ);
		p.columnRslt_fix_no.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.fix_no_META);
		p.RsltTable.addColumnConfig(p.columnRslt_fix_no);
		p.columnRslt_asst_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.asst_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_asst_typ);
		p.columnRslt_base_unit_rnd_typ.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.base_unit_rnd_typ_META);
		p.RsltTable.addColumnConfig(p.columnRslt_base_unit_rnd_typ);
		p.columnRslt_pack_dmn_qty.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.pack_dmn_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_dmn_qty);
		p.columnRslt_pack_conv_qty.setMeta(mcframe.clientMSBF.MSBFP0010.RsltR.pack_conv_qty_META);
		p.RsltTable.addColumnConfig(p.columnRslt_pack_conv_qty);
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
		Cnd_loc_cd.getListConfig().setPutter(getCnd_loc_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_lot_no.getListConfig().setPutter(getCnd_lot_no_ListPutter());
		Cnd_sublot_no.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sublot_no.getListConfig().setPutter(getCnd_sublot_no_ListPutter());
		Cnd_quality_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_quality_typ.getListConfig().setPutter(getCnd_quality_typ_ListPutter());
		Cnd_gd_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_gd_cd.getListConfig().setPutter(getCnd_gd_cd_ListPutter());
		Cnd_stk_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_stk_id_typ.getListConfig().setPutter(getCnd_stk_id_typ_ListPutter());
		Cnd_pack_unit_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_pack_unit_cd.getListConfig().setPutter(getCnd_pack_unit_cd_ListPutter());
		Cnd_str_ln_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_str_ln_cd.getListConfig().setPutter(getCnd_str_ln_cd_ListPutter());
	}

	/**
	 * この画面を[SRCH_LMT_UP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_LMT_UPStatus() {
		status = SRCH_LMT_UP;
		setAllStatus(status);
	}

	/**
	 * この画面を[LMT_UP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setLMT_UPStatus() {
		status = LMT_UP;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INSP_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSP_SCHDStatus() {
		status = SRCH_INSP_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[INSP_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSP_SCHDStatus() {
		status = INSP_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_LMT_UP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_LMT_UPStatus() {
		status = SRCH_DEL_LMT_UP;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_LMT_UP]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_LMT_UPStatus() {
		status = DEL_LMT_UP;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_DEL_INSP_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_DEL_INSP_SCHDStatus() {
		status = SRCH_DEL_INSP_SCHD;
		setAllStatus(status);
	}

	/**
	 * この画面を[DEL_INSP_SCHD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDEL_INSP_SCHDStatus() {
		status = DEL_INSP_SCHD;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (SRCH_LMT_UP.equals(status)) {
			setSRCH_LMT_UPStatus();
		}
		else if (LMT_UP.equals(status)) {
			setLMT_UPStatus();
		}
		else if (SRCH_INSP_SCHD.equals(status)) {
			setSRCH_INSP_SCHDStatus();
		}
		else if (INSP_SCHD.equals(status)) {
			setINSP_SCHDStatus();
		}
		else if (SRCH_DEL_LMT_UP.equals(status)) {
			setSRCH_DEL_LMT_UPStatus();
		}
		else if (DEL_LMT_UP.equals(status)) {
			setDEL_LMT_UPStatus();
		}
		else if (SRCH_DEL_INSP_SCHD.equals(status)) {
			setSRCH_DEL_INSP_SCHDStatus();
		}
		else if (DEL_INSP_SCHD.equals(status)) {
			setDEL_INSP_SCHDStatus();
		}
	}

	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Wg");
		return lp;
	}
	 
	/**
	 * [Cnd_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
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
	 * [Cnd_lot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.LotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_sublot_no_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sublot_no_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0070.SublotNo");
		return lp;
	}
	 
	/**
	 * [Cnd_quality_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_quality_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QualityTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_gd_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_gd_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StkGd");
		return lp;
	}
	 
	/**
	 * [Cnd_stk_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_stk_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.StkIdTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_pack_unit_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_pack_unit_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Unit");
		return lp;
	}
	 
	/**
	 * [Cnd_str_ln_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_str_ln_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.StrLn");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_loc_cd) return getCnd_loc_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_cd) return getCnd_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub1) return getCnd_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub2) return getCnd_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_itm_p_PPanel.Itm_itm_sub3) return getCnd_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_lot_no) return getCnd_lot_no(row, info);
		if(combo == Cnd_sublot_no) return getCnd_sublot_no(row, info);
		if(combo == Cnd_quality_typ) return getCnd_quality_typ(row, info);
		if(combo == Cnd_gd_cd) return getCnd_gd_cd(row, info);
		if(combo == Cnd_stk_id_typ) return getCnd_stk_id_typ(row, info);
		if(combo == Cnd_pack_unit_cd) return getCnd_pack_unit_cd(row, info);
		if(combo == Cnd_str_ln_cd) return getCnd_str_ln_cd(row, info);
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
		else if (ap == Btn_open_MSBFP0030) doBtn_open_MSBFP0030(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_upd_lmt_schd) doBtn_upd_lmt_schd(info);
		else if (ap == Btn_upd_schd) doBtn_upd_schd(info);
		else if (ap == Btn_del_lmt_schdt) doBtn_del_lmt_schdt(info);
		else if (ap == Btn_del_schd) doBtn_del_schd(info);
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
	 * [Btn]パネルの[open_MSBFP0030]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MSBFP0030(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_lmt_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_lmt_schd(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_schd(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_lmt_schdt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_lmt_schdt(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_schd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_schd(MCEventInfo info);

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
		if (vc == Cnd_today) return doCnd_today_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_loc_cd) return doCnd_loc_cd_VC(info);
		if (vc == Cnd_loc_nm) return doCnd_loc_nm_VC(info);
		if (vc == Cnd_rem_stk_vld_pd) return doCnd_rem_stk_vld_pd_VC(info);
		if (vc == Cnd_rem_stk_vld_pd_typ_Group) return doCnd_rem_stk_vld_pd_typ_VC(info);
		if (vc == Cnd_trg_stk_vld_dt) return doCnd_trg_stk_vld_dt_VC(info);
		if (vc == Cnd_rem_stk_lmt_pd) return doCnd_rem_stk_lmt_pd_VC(info);
		if (vc == Cnd_rem_stk_lmt_pd_typ_Group) return doCnd_rem_stk_lmt_pd_typ_VC(info);
		if (vc == Cnd_trg_stk_lmt_dt) return doCnd_trg_stk_lmt_dt_VC(info);
		if (vc == Cnd_unreg_lmt_flg) return doCnd_unreg_lmt_flg_VC(info);
		if (vc == Cnd_disp_mrp_use_dt_flg) return doCnd_disp_mrp_use_dt_flg_VC(info);
		if (vc == Cnd_ver_no) return doCnd_ver_no_VC(info);
		if (vc == Cnd_lot_no) return doCnd_lot_no_VC(info);
		if (vc == Cnd_sublot_no) return doCnd_sublot_no_VC(info);
		if (vc == Cnd_quality_typ) return doCnd_quality_typ_VC(info);
		if (vc == Cnd_quality_typ_nm) return doCnd_quality_typ_nm_VC(info);
		if (vc == Cnd_gd_cd) return doCnd_gd_cd_VC(info);
		if (vc == Cnd_gd_nm) return doCnd_gd_nm_VC(info);
		if (vc == Cnd_stk_id_typ) return doCnd_stk_id_typ_VC(info);
		if (vc == Cnd_stk_id_typ_nm) return doCnd_stk_id_typ_nm_VC(info);
		if (vc == Cnd_pack_unit_cd) return doCnd_pack_unit_cd_VC(info);
		if (vc == Cnd_pack_unit_nm) return doCnd_pack_unit_nm_VC(info);
		if (vc == Cnd_first_gr_dt_fr) return doCnd_first_gr_dt_fr_VC(info);
		if (vc == Cnd_first_gr_dt_to) return doCnd_first_gr_dt_to_VC(info);
		if (vc == Cnd_str_ln_cd) return doCnd_str_ln_cd_VC(info);
		if (vc == Cnd_str_ln_nm) return doCnd_str_ln_nm_VC(info);
		if (vc == Cnd_insp_schd_no) return doCnd_insp_schd_no_VC(info);
		if (vc == Cnd_lot_rmrks) return doCnd_lot_rmrks_VC(info);
		if (vc == Cnd_insp_cnt_rmrks) return doCnd_insp_cnt_rmrks_VC(info);
		if (vc == Cnd_sub_char1) return doCnd_sub_char1_VC(info);
		if (vc == Cnd_sub_char2) return doCnd_sub_char2_VC(info);
		if (vc == Cnd_sub_char3) return doCnd_sub_char3_VC(info);
		if (vc == columnRslt_check) return doRslt_check_VC(info);
		if (vc == columnRslt_itm_typ) return doRslt_itm_typ_VC(info);
		if (vc == columnRslt_itm_typ_nm) return doRslt_itm_typ_nm_VC(info);
		if (vc == columnRslt_itm_typ_d_cd) return doRslt_itm_typ_d_cd_VC(info);
		if (vc == columnRslt_itm_typ_d_nm) return doRslt_itm_typ_d_nm_VC(info);
		if (vc == columnRslt_lot_no) return doRslt_lot_no_VC(info);
		if (vc == columnRslt_sublot_no) return doRslt_sublot_no_VC(info);
		if (vc == columnRslt_ver_no) return doRslt_ver_no_VC(info);
		if (vc == columnRslt_ac_dt) return doRslt_ac_dt_VC(info);
		if (vc == columnRslt_pack_unit_cd) return doRslt_pack_unit_cd_VC(info);
		if (vc == columnRslt_pack_unit_nm) return doRslt_pack_unit_nm_VC(info);
		if (vc == columnRslt_pack_dec_place) return doRslt_pack_dec_place_VC(info);
		if (vc == columnRslt_base_unit_cd) return doRslt_base_unit_cd_VC(info);
		if (vc == columnRslt_base_unit_nm) return doRslt_base_unit_nm_VC(info);
		if (vc == columnRslt_base_dec_place) return doRslt_base_dec_place_VC(info);
		if (vc == columnRslt_first_gr_dt) return doRslt_first_gr_dt_VC(info);
		if (vc == columnRslt_unreg_lmt_flg) return doRslt_unreg_lmt_flg_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ) return doRslt_lmt_dt_frm_typ_VC(info);
		if (vc == columnRslt_lmt_dt_frm_typ_nm) return doRslt_lmt_dt_frm_typ_nm_VC(info);
		if (vc == columnRslt_lmt_dt_frm) return doRslt_lmt_dt_frm_VC(info);
		if (vc == columnRslt_vld_dt) return doRslt_vld_dt_VC(info);
		if (vc == columnRslt_lmt_dt) return doRslt_lmt_dt_VC(info);
		if (vc == columnRslt_mrp_use_dt) return doRslt_mrp_use_dt_VC(info);
		if (vc == columnRslt_loc_cd) return doRslt_loc_cd_VC(info);
		if (vc == columnRslt_loc_nm) return doRslt_loc_nm_VC(info);
		if (vc == columnRslt_str_ln_cd) return doRslt_str_ln_cd_VC(info);
		if (vc == columnRslt_str_ln_nm) return doRslt_str_ln_nm_VC(info);
		if (vc == columnRslt_str_ln_cd_none_flg) return doRslt_str_ln_cd_none_flg_VC(info);
		if (vc == columnRslt_stk_arrv_bp_cd) return doRslt_stk_arrv_bp_cd_VC(info);
		if (vc == columnRslt_stk_arrv_bp_nm) return doRslt_stk_arrv_bp_nm_VC(info);
		if (vc == columnRslt_wg_cd) return doRslt_wg_cd_VC(info);
		if (vc == columnRslt_wg_nm) return doRslt_wg_nm_VC(info);
		if (vc == columnRslt_in_xfr_typ) return doRslt_in_xfr_typ_VC(info);
		if (vc == columnRslt_quality_typ) return doRslt_quality_typ_VC(info);
		if (vc == columnRslt_quality_typ_nm) return doRslt_quality_typ_nm_VC(info);
		if (vc == columnRslt_stk_insp_typ) return doRslt_stk_insp_typ_VC(info);
		if (vc == columnRslt_stk_id_typ) return doRslt_stk_id_typ_VC(info);
		if (vc == columnRslt_stk_id_typ_nm) return doRslt_stk_id_typ_nm_VC(info);
		if (vc == columnRslt_gd_cd) return doRslt_gd_cd_VC(info);
		if (vc == columnRslt_gd_nm) return doRslt_gd_nm_VC(info);
		if (vc == columnRslt_lmt_up_flg) return doRslt_lmt_up_flg_VC(info);
		if (vc == columnRslt_def_lmt_ctl_categ) return doRslt_def_lmt_ctl_categ_VC(info);
		if (vc == columnRslt_stk_bp_cd) return doRslt_stk_bp_cd_VC(info);
		if (vc == columnRslt_cont_fctr_unit_cd) return doRslt_cont_fctr_unit_cd_VC(info);
		if (vc == columnRslt_cont_fctr_unit_nm) return doRslt_cont_fctr_unit_nm_VC(info);
		if (vc == columnRslt_cont_fctr_flg) return doRslt_cont_fctr_flg_VC(info);
		if (vc == columnRslt_cont_fctr_rnd_typ) return doRslt_cont_fctr_rnd_typ_VC(info);
		if (vc == columnRslt_cont_fctr_dec_place) return doRslt_cont_fctr_dec_place_VC(info);
		if (vc == columnRslt_insp_cnt_rmrks) return doRslt_insp_cnt_rmrks_VC(info);
		if (vc == columnRslt_lot_rmrks) return doRslt_lot_rmrks_VC(info);
		if (vc == columnRslt_sub_char1) return doRslt_sub_char1_VC(info);
		if (vc == columnRslt_sub_char2) return doRslt_sub_char2_VC(info);
		if (vc == columnRslt_sub_char3) return doRslt_sub_char3_VC(info);
		if (vc == columnRslt_insp_mtd_typ) return doRslt_insp_mtd_typ_VC(info);
		if (vc == columnRslt_insp_mtd_typ_nm) return doRslt_insp_mtd_typ_nm_VC(info);
		if (vc == columnRslt_insp_schd_no) return doRslt_insp_schd_no_VC(info);
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
		if (vc == columnRslt_upd_cntr) return doRslt_upd_cntr_VC(info);
		if (vc == columnRslt_fix_no_typ) return doRslt_fix_no_typ_VC(info);
		if (vc == columnRslt_fix_no) return doRslt_fix_no_VC(info);
		if (vc == columnRslt_asst_typ) return doRslt_asst_typ_VC(info);
		if (vc == columnRslt_base_unit_rnd_typ) return doRslt_base_unit_rnd_typ_VC(info);
		if (vc == columnRslt_pack_dmn_qty) return doRslt_pack_dmn_qty_VC(info);
		if (vc == columnRslt_pack_conv_qty) return doRslt_pack_conv_qty_VC(info);
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
	 * [Cnd]パネルの[today]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_today_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rem_stk_vld_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rem_stk_vld_pd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trg_stk_vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trg_stk_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rem_stk_lmt_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rem_stk_lmt_pd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[trg_stk_lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_trg_stk_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[disp_mrp_use_dt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_disp_mrp_use_dt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ver_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_fr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_first_gr_dt_to_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_schd_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_insp_cnt_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_check_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[ver_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_ver_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[pack_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_dec_place_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_first_gr_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_unreg_lmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_frm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[vld_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_vld_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[mrp_use_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_mrp_use_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_str_ln_cd_none_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_arrv_bp_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_in_xfr_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_quality_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_insp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[gd_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_gd_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lmt_up_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[def_lmt_ctl_categ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_def_lmt_ctl_categ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_stk_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_unit_nm_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_cont_fctr_rnd_typ_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_cnt_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_cnt_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_lot_rmrks_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_mtd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_mtd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_mtd_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_insp_schd_no_VC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[fix_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_fix_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_base_unit_rnd_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_dmn_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_dmn_qty_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Rslt]パネルの[pack_conv_qty]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRslt_pack_conv_qty_VC(MCEventInfo info){
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
		else if (nc == Cnd_today) doCnd_today_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_loc_cd) doCnd_loc_cd_NC(info);
		else if (nc == Cnd_loc_nm) doCnd_loc_nm_NC(info);
		else if (nc == Cnd_rem_stk_vld_pd) doCnd_rem_stk_vld_pd_NC(info);
		else if (nc == Cnd_rem_stk_vld_pd_typ_Group) doCnd_rem_stk_vld_pd_typ_NC(info);
		else if (nc == Cnd_trg_stk_vld_dt) doCnd_trg_stk_vld_dt_NC(info);
		else if (nc == Cnd_rem_stk_lmt_pd) doCnd_rem_stk_lmt_pd_NC(info);
		else if (nc == Cnd_rem_stk_lmt_pd_typ_Group) doCnd_rem_stk_lmt_pd_typ_NC(info);
		else if (nc == Cnd_trg_stk_lmt_dt) doCnd_trg_stk_lmt_dt_NC(info);
		else if (nc == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NC(info);
		else if (nc == Cnd_disp_mrp_use_dt_flg) doCnd_disp_mrp_use_dt_flg_NC(info);
		else if (nc == Cnd_ver_no) doCnd_ver_no_NC(info);
		else if (nc == Cnd_lot_no) doCnd_lot_no_NC(info);
		else if (nc == Cnd_sublot_no) doCnd_sublot_no_NC(info);
		else if (nc == Cnd_quality_typ) doCnd_quality_typ_NC(info);
		else if (nc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NC(info);
		else if (nc == Cnd_gd_cd) doCnd_gd_cd_NC(info);
		else if (nc == Cnd_gd_nm) doCnd_gd_nm_NC(info);
		else if (nc == Cnd_stk_id_typ) doCnd_stk_id_typ_NC(info);
		else if (nc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NC(info);
		else if (nc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NC(info);
		else if (nc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NC(info);
		else if (nc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NC(info);
		else if (nc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NC(info);
		else if (nc == Cnd_str_ln_cd) doCnd_str_ln_cd_NC(info);
		else if (nc == Cnd_str_ln_nm) doCnd_str_ln_nm_NC(info);
		else if (nc == Cnd_insp_schd_no) doCnd_insp_schd_no_NC(info);
		else if (nc == Cnd_lot_rmrks) doCnd_lot_rmrks_NC(info);
		else if (nc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NC(info);
		else if (nc == Cnd_sub_char1) doCnd_sub_char1_NC(info);
		else if (nc == Cnd_sub_char2) doCnd_sub_char2_NC(info);
		else if (nc == Cnd_sub_char3) doCnd_sub_char3_NC(info);
		else if (nc == columnRslt_check) doRslt_check_NC(info);
		else if (nc == columnRslt_itm_typ) doRslt_itm_typ_NC(info);
		else if (nc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NC(info);
		else if (nc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NC(info);
		else if (nc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NC(info);
		else if (nc == columnRslt_lot_no) doRslt_lot_no_NC(info);
		else if (nc == columnRslt_sublot_no) doRslt_sublot_no_NC(info);
		else if (nc == columnRslt_ver_no) doRslt_ver_no_NC(info);
		else if (nc == columnRslt_ac_dt) doRslt_ac_dt_NC(info);
		else if (nc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NC(info);
		else if (nc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NC(info);
		else if (nc == columnRslt_pack_dec_place) doRslt_pack_dec_place_NC(info);
		else if (nc == columnRslt_base_unit_cd) doRslt_base_unit_cd_NC(info);
		else if (nc == columnRslt_base_unit_nm) doRslt_base_unit_nm_NC(info);
		else if (nc == columnRslt_base_dec_place) doRslt_base_dec_place_NC(info);
		else if (nc == columnRslt_first_gr_dt) doRslt_first_gr_dt_NC(info);
		else if (nc == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NC(info);
		else if (nc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NC(info);
		else if (nc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NC(info);
		else if (nc == columnRslt_vld_dt) doRslt_vld_dt_NC(info);
		else if (nc == columnRslt_lmt_dt) doRslt_lmt_dt_NC(info);
		else if (nc == columnRslt_mrp_use_dt) doRslt_mrp_use_dt_NC(info);
		else if (nc == columnRslt_loc_cd) doRslt_loc_cd_NC(info);
		else if (nc == columnRslt_loc_nm) doRslt_loc_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd) doRslt_str_ln_cd_NC(info);
		else if (nc == columnRslt_str_ln_nm) doRslt_str_ln_nm_NC(info);
		else if (nc == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NC(info);
		else if (nc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NC(info);
		else if (nc == columnRslt_wg_cd) doRslt_wg_cd_NC(info);
		else if (nc == columnRslt_wg_nm) doRslt_wg_nm_NC(info);
		else if (nc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NC(info);
		else if (nc == columnRslt_quality_typ) doRslt_quality_typ_NC(info);
		else if (nc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NC(info);
		else if (nc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ) doRslt_stk_id_typ_NC(info);
		else if (nc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NC(info);
		else if (nc == columnRslt_gd_cd) doRslt_gd_cd_NC(info);
		else if (nc == columnRslt_gd_nm) doRslt_gd_nm_NC(info);
		else if (nc == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NC(info);
		else if (nc == columnRslt_def_lmt_ctl_categ) doRslt_def_lmt_ctl_categ_NC(info);
		else if (nc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NC(info);
		else if (nc == columnRslt_cont_fctr_unit_cd) doRslt_cont_fctr_unit_cd_NC(info);
		else if (nc == columnRslt_cont_fctr_unit_nm) doRslt_cont_fctr_unit_nm_NC(info);
		else if (nc == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NC(info);
		else if (nc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NC(info);
		else if (nc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NC(info);
		else if (nc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NC(info);
		else if (nc == columnRslt_lot_rmrks) doRslt_lot_rmrks_NC(info);
		else if (nc == columnRslt_sub_char1) doRslt_sub_char1_NC(info);
		else if (nc == columnRslt_sub_char2) doRslt_sub_char2_NC(info);
		else if (nc == columnRslt_sub_char3) doRslt_sub_char3_NC(info);
		else if (nc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NC(info);
		else if (nc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NC(info);
		else if (nc == columnRslt_insp_schd_no) doRslt_insp_schd_no_NC(info);
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
		else if (nc == columnRslt_upd_cntr) doRslt_upd_cntr_NC(info);
		else if (nc == columnRslt_fix_no_typ) doRslt_fix_no_typ_NC(info);
		else if (nc == columnRslt_fix_no) doRslt_fix_no_NC(info);
		else if (nc == columnRslt_asst_typ) doRslt_asst_typ_NC(info);
		else if (nc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NC(info);
		else if (nc == columnRslt_pack_dmn_qty) doRslt_pack_dmn_qty_NC(info);
		else if (nc == columnRslt_pack_conv_qty) doRslt_pack_conv_qty_NC(info);
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
	 * [Cnd]パネルの[today]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_today_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mrp_use_dt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mrp_use_dt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_use_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_use_dt_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_lmt_ctl_categ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_lmt_ctl_categ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dmn_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dmn_qty_NC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_conv_qty]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_conv_qty_NC(MCEventInfo info){
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
		else if (ne == Cnd_today) doCnd_today_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_loc_cd) doCnd_loc_cd_NE(info);
		else if (ne == Cnd_loc_nm) doCnd_loc_nm_NE(info);
		else if (ne == Cnd_rem_stk_vld_pd) doCnd_rem_stk_vld_pd_NE(info);
		else if (ne == Cnd_rem_stk_vld_pd_typ_Group) doCnd_rem_stk_vld_pd_typ_NE(info);
		else if (ne == Cnd_trg_stk_vld_dt) doCnd_trg_stk_vld_dt_NE(info);
		else if (ne == Cnd_rem_stk_lmt_pd) doCnd_rem_stk_lmt_pd_NE(info);
		else if (ne == Cnd_rem_stk_lmt_pd_typ_Group) doCnd_rem_stk_lmt_pd_typ_NE(info);
		else if (ne == Cnd_trg_stk_lmt_dt) doCnd_trg_stk_lmt_dt_NE(info);
		else if (ne == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NE(info);
		else if (ne == Cnd_disp_mrp_use_dt_flg) doCnd_disp_mrp_use_dt_flg_NE(info);
		else if (ne == Cnd_ver_no) doCnd_ver_no_NE(info);
		else if (ne == Cnd_lot_no) doCnd_lot_no_NE(info);
		else if (ne == Cnd_sublot_no) doCnd_sublot_no_NE(info);
		else if (ne == Cnd_quality_typ) doCnd_quality_typ_NE(info);
		else if (ne == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NE(info);
		else if (ne == Cnd_gd_cd) doCnd_gd_cd_NE(info);
		else if (ne == Cnd_gd_nm) doCnd_gd_nm_NE(info);
		else if (ne == Cnd_stk_id_typ) doCnd_stk_id_typ_NE(info);
		else if (ne == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NE(info);
		else if (ne == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NE(info);
		else if (ne == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NE(info);
		else if (ne == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NE(info);
		else if (ne == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NE(info);
		else if (ne == Cnd_str_ln_cd) doCnd_str_ln_cd_NE(info);
		else if (ne == Cnd_str_ln_nm) doCnd_str_ln_nm_NE(info);
		else if (ne == Cnd_insp_schd_no) doCnd_insp_schd_no_NE(info);
		else if (ne == Cnd_lot_rmrks) doCnd_lot_rmrks_NE(info);
		else if (ne == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NE(info);
		else if (ne == Cnd_sub_char1) doCnd_sub_char1_NE(info);
		else if (ne == Cnd_sub_char2) doCnd_sub_char2_NE(info);
		else if (ne == Cnd_sub_char3) doCnd_sub_char3_NE(info);
		else if (ne == columnRslt_check) doRslt_check_NE(info);
		else if (ne == columnRslt_itm_typ) doRslt_itm_typ_NE(info);
		else if (ne == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NE(info);
		else if (ne == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NE(info);
		else if (ne == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NE(info);
		else if (ne == columnRslt_lot_no) doRslt_lot_no_NE(info);
		else if (ne == columnRslt_sublot_no) doRslt_sublot_no_NE(info);
		else if (ne == columnRslt_ver_no) doRslt_ver_no_NE(info);
		else if (ne == columnRslt_ac_dt) doRslt_ac_dt_NE(info);
		else if (ne == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NE(info);
		else if (ne == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NE(info);
		else if (ne == columnRslt_pack_dec_place) doRslt_pack_dec_place_NE(info);
		else if (ne == columnRslt_base_unit_cd) doRslt_base_unit_cd_NE(info);
		else if (ne == columnRslt_base_unit_nm) doRslt_base_unit_nm_NE(info);
		else if (ne == columnRslt_base_dec_place) doRslt_base_dec_place_NE(info);
		else if (ne == columnRslt_first_gr_dt) doRslt_first_gr_dt_NE(info);
		else if (ne == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NE(info);
		else if (ne == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NE(info);
		else if (ne == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NE(info);
		else if (ne == columnRslt_vld_dt) doRslt_vld_dt_NE(info);
		else if (ne == columnRslt_lmt_dt) doRslt_lmt_dt_NE(info);
		else if (ne == columnRslt_mrp_use_dt) doRslt_mrp_use_dt_NE(info);
		else if (ne == columnRslt_loc_cd) doRslt_loc_cd_NE(info);
		else if (ne == columnRslt_loc_nm) doRslt_loc_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd) doRslt_str_ln_cd_NE(info);
		else if (ne == columnRslt_str_ln_nm) doRslt_str_ln_nm_NE(info);
		else if (ne == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NE(info);
		else if (ne == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NE(info);
		else if (ne == columnRslt_wg_cd) doRslt_wg_cd_NE(info);
		else if (ne == columnRslt_wg_nm) doRslt_wg_nm_NE(info);
		else if (ne == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NE(info);
		else if (ne == columnRslt_quality_typ) doRslt_quality_typ_NE(info);
		else if (ne == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NE(info);
		else if (ne == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ) doRslt_stk_id_typ_NE(info);
		else if (ne == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NE(info);
		else if (ne == columnRslt_gd_cd) doRslt_gd_cd_NE(info);
		else if (ne == columnRslt_gd_nm) doRslt_gd_nm_NE(info);
		else if (ne == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NE(info);
		else if (ne == columnRslt_def_lmt_ctl_categ) doRslt_def_lmt_ctl_categ_NE(info);
		else if (ne == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NE(info);
		else if (ne == columnRslt_cont_fctr_unit_cd) doRslt_cont_fctr_unit_cd_NE(info);
		else if (ne == columnRslt_cont_fctr_unit_nm) doRslt_cont_fctr_unit_nm_NE(info);
		else if (ne == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NE(info);
		else if (ne == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NE(info);
		else if (ne == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NE(info);
		else if (ne == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NE(info);
		else if (ne == columnRslt_lot_rmrks) doRslt_lot_rmrks_NE(info);
		else if (ne == columnRslt_sub_char1) doRslt_sub_char1_NE(info);
		else if (ne == columnRslt_sub_char2) doRslt_sub_char2_NE(info);
		else if (ne == columnRslt_sub_char3) doRslt_sub_char3_NE(info);
		else if (ne == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NE(info);
		else if (ne == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NE(info);
		else if (ne == columnRslt_insp_schd_no) doRslt_insp_schd_no_NE(info);
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
		else if (ne == columnRslt_upd_cntr) doRslt_upd_cntr_NE(info);
		else if (ne == columnRslt_fix_no_typ) doRslt_fix_no_typ_NE(info);
		else if (ne == columnRslt_fix_no) doRslt_fix_no_NE(info);
		else if (ne == columnRslt_asst_typ) doRslt_asst_typ_NE(info);
		else if (ne == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NE(info);
		else if (ne == columnRslt_pack_dmn_qty) doRslt_pack_dmn_qty_NE(info);
		else if (ne == columnRslt_pack_conv_qty) doRslt_pack_conv_qty_NE(info);
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
	 * [Cnd]パネルの[today]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_today_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mrp_use_dt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mrp_use_dt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_use_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_use_dt_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_lmt_ctl_categ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_lmt_ctl_categ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NE(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dmn_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dmn_qty_NE(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_conv_qty]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_conv_qty_NE(MCEventInfo info){
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
		else if (nx == Cnd_today) doCnd_today_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_loc_cd) doCnd_loc_cd_NX(info);
		else if (nx == Cnd_loc_nm) doCnd_loc_nm_NX(info);
		else if (nx == Cnd_rem_stk_vld_pd) doCnd_rem_stk_vld_pd_NX(info);
		else if (nx == Cnd_rem_stk_vld_pd_typ_Group) doCnd_rem_stk_vld_pd_typ_NX(info);
		else if (nx == Cnd_trg_stk_vld_dt) doCnd_trg_stk_vld_dt_NX(info);
		else if (nx == Cnd_rem_stk_lmt_pd) doCnd_rem_stk_lmt_pd_NX(info);
		else if (nx == Cnd_rem_stk_lmt_pd_typ_Group) doCnd_rem_stk_lmt_pd_typ_NX(info);
		else if (nx == Cnd_trg_stk_lmt_dt) doCnd_trg_stk_lmt_dt_NX(info);
		else if (nx == Cnd_unreg_lmt_flg) doCnd_unreg_lmt_flg_NX(info);
		else if (nx == Cnd_disp_mrp_use_dt_flg) doCnd_disp_mrp_use_dt_flg_NX(info);
		else if (nx == Cnd_ver_no) doCnd_ver_no_NX(info);
		else if (nx == Cnd_lot_no) doCnd_lot_no_NX(info);
		else if (nx == Cnd_sublot_no) doCnd_sublot_no_NX(info);
		else if (nx == Cnd_quality_typ) doCnd_quality_typ_NX(info);
		else if (nx == Cnd_quality_typ_nm) doCnd_quality_typ_nm_NX(info);
		else if (nx == Cnd_gd_cd) doCnd_gd_cd_NX(info);
		else if (nx == Cnd_gd_nm) doCnd_gd_nm_NX(info);
		else if (nx == Cnd_stk_id_typ) doCnd_stk_id_typ_NX(info);
		else if (nx == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_NX(info);
		else if (nx == Cnd_pack_unit_cd) doCnd_pack_unit_cd_NX(info);
		else if (nx == Cnd_pack_unit_nm) doCnd_pack_unit_nm_NX(info);
		else if (nx == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_NX(info);
		else if (nx == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_NX(info);
		else if (nx == Cnd_str_ln_cd) doCnd_str_ln_cd_NX(info);
		else if (nx == Cnd_str_ln_nm) doCnd_str_ln_nm_NX(info);
		else if (nx == Cnd_insp_schd_no) doCnd_insp_schd_no_NX(info);
		else if (nx == Cnd_lot_rmrks) doCnd_lot_rmrks_NX(info);
		else if (nx == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_NX(info);
		else if (nx == Cnd_sub_char1) doCnd_sub_char1_NX(info);
		else if (nx == Cnd_sub_char2) doCnd_sub_char2_NX(info);
		else if (nx == Cnd_sub_char3) doCnd_sub_char3_NX(info);
		else if (nx == columnRslt_check) doRslt_check_NX(info);
		else if (nx == columnRslt_itm_typ) doRslt_itm_typ_NX(info);
		else if (nx == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_NX(info);
		else if (nx == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_NX(info);
		else if (nx == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_NX(info);
		else if (nx == columnRslt_lot_no) doRslt_lot_no_NX(info);
		else if (nx == columnRslt_sublot_no) doRslt_sublot_no_NX(info);
		else if (nx == columnRslt_ver_no) doRslt_ver_no_NX(info);
		else if (nx == columnRslt_ac_dt) doRslt_ac_dt_NX(info);
		else if (nx == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_NX(info);
		else if (nx == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_NX(info);
		else if (nx == columnRslt_pack_dec_place) doRslt_pack_dec_place_NX(info);
		else if (nx == columnRslt_base_unit_cd) doRslt_base_unit_cd_NX(info);
		else if (nx == columnRslt_base_unit_nm) doRslt_base_unit_nm_NX(info);
		else if (nx == columnRslt_base_dec_place) doRslt_base_dec_place_NX(info);
		else if (nx == columnRslt_first_gr_dt) doRslt_first_gr_dt_NX(info);
		else if (nx == columnRslt_unreg_lmt_flg) doRslt_unreg_lmt_flg_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_NX(info);
		else if (nx == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_NX(info);
		else if (nx == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_NX(info);
		else if (nx == columnRslt_vld_dt) doRslt_vld_dt_NX(info);
		else if (nx == columnRslt_lmt_dt) doRslt_lmt_dt_NX(info);
		else if (nx == columnRslt_mrp_use_dt) doRslt_mrp_use_dt_NX(info);
		else if (nx == columnRslt_loc_cd) doRslt_loc_cd_NX(info);
		else if (nx == columnRslt_loc_nm) doRslt_loc_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd) doRslt_str_ln_cd_NX(info);
		else if (nx == columnRslt_str_ln_nm) doRslt_str_ln_nm_NX(info);
		else if (nx == columnRslt_str_ln_cd_none_flg) doRslt_str_ln_cd_none_flg_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_NX(info);
		else if (nx == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_NX(info);
		else if (nx == columnRslt_wg_cd) doRslt_wg_cd_NX(info);
		else if (nx == columnRslt_wg_nm) doRslt_wg_nm_NX(info);
		else if (nx == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_NX(info);
		else if (nx == columnRslt_quality_typ) doRslt_quality_typ_NX(info);
		else if (nx == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_NX(info);
		else if (nx == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ) doRslt_stk_id_typ_NX(info);
		else if (nx == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_NX(info);
		else if (nx == columnRslt_gd_cd) doRslt_gd_cd_NX(info);
		else if (nx == columnRslt_gd_nm) doRslt_gd_nm_NX(info);
		else if (nx == columnRslt_lmt_up_flg) doRslt_lmt_up_flg_NX(info);
		else if (nx == columnRslt_def_lmt_ctl_categ) doRslt_def_lmt_ctl_categ_NX(info);
		else if (nx == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_NX(info);
		else if (nx == columnRslt_cont_fctr_unit_cd) doRslt_cont_fctr_unit_cd_NX(info);
		else if (nx == columnRslt_cont_fctr_unit_nm) doRslt_cont_fctr_unit_nm_NX(info);
		else if (nx == columnRslt_cont_fctr_flg) doRslt_cont_fctr_flg_NX(info);
		else if (nx == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_NX(info);
		else if (nx == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_NX(info);
		else if (nx == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_NX(info);
		else if (nx == columnRslt_lot_rmrks) doRslt_lot_rmrks_NX(info);
		else if (nx == columnRslt_sub_char1) doRslt_sub_char1_NX(info);
		else if (nx == columnRslt_sub_char2) doRslt_sub_char2_NX(info);
		else if (nx == columnRslt_sub_char3) doRslt_sub_char3_NX(info);
		else if (nx == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_NX(info);
		else if (nx == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_NX(info);
		else if (nx == columnRslt_insp_schd_no) doRslt_insp_schd_no_NX(info);
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
		else if (nx == columnRslt_upd_cntr) doRslt_upd_cntr_NX(info);
		else if (nx == columnRslt_fix_no_typ) doRslt_fix_no_typ_NX(info);
		else if (nx == columnRslt_fix_no) doRslt_fix_no_NX(info);
		else if (nx == columnRslt_asst_typ) doRslt_asst_typ_NX(info);
		else if (nx == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_NX(info);
		else if (nx == columnRslt_pack_dmn_qty) doRslt_pack_dmn_qty_NX(info);
		else if (nx == columnRslt_pack_conv_qty) doRslt_pack_conv_qty_NX(info);
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
	 * [Cnd]パネルの[today]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_today_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[disp_mrp_use_dt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_disp_mrp_use_dt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_check_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[unreg_lmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_unreg_lmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_use_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_use_dt_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd_none_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_none_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_up_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_up_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_lmt_ctl_categ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_lmt_ctl_categ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_flg_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_mtd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_NX(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dmn_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dmn_qty_NX(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_conv_qty]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_conv_qty_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_today) doCnd_today_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_loc_cd) doCnd_loc_cd_LC(info);
		else if (lc == Cnd_loc_nm) doCnd_loc_nm_LC(info);
		else if (lc == Cnd_rem_stk_vld_pd) doCnd_rem_stk_vld_pd_LC(info);
		else if (lc == Cnd_trg_stk_vld_dt) doCnd_trg_stk_vld_dt_LC(info);
		else if (lc == Cnd_rem_stk_lmt_pd) doCnd_rem_stk_lmt_pd_LC(info);
		else if (lc == Cnd_trg_stk_lmt_dt) doCnd_trg_stk_lmt_dt_LC(info);
		else if (lc == Cnd_ver_no) doCnd_ver_no_LC(info);
		else if (lc == Cnd_lot_no) doCnd_lot_no_LC(info);
		else if (lc == Cnd_sublot_no) doCnd_sublot_no_LC(info);
		else if (lc == Cnd_quality_typ) doCnd_quality_typ_LC(info);
		else if (lc == Cnd_quality_typ_nm) doCnd_quality_typ_nm_LC(info);
		else if (lc == Cnd_gd_cd) doCnd_gd_cd_LC(info);
		else if (lc == Cnd_gd_nm) doCnd_gd_nm_LC(info);
		else if (lc == Cnd_stk_id_typ) doCnd_stk_id_typ_LC(info);
		else if (lc == Cnd_stk_id_typ_nm) doCnd_stk_id_typ_nm_LC(info);
		else if (lc == Cnd_pack_unit_cd) doCnd_pack_unit_cd_LC(info);
		else if (lc == Cnd_pack_unit_nm) doCnd_pack_unit_nm_LC(info);
		else if (lc == Cnd_first_gr_dt_fr) doCnd_first_gr_dt_fr_LC(info);
		else if (lc == Cnd_first_gr_dt_to) doCnd_first_gr_dt_to_LC(info);
		else if (lc == Cnd_str_ln_cd) doCnd_str_ln_cd_LC(info);
		else if (lc == Cnd_str_ln_nm) doCnd_str_ln_nm_LC(info);
		else if (lc == Cnd_insp_schd_no) doCnd_insp_schd_no_LC(info);
		else if (lc == Cnd_lot_rmrks) doCnd_lot_rmrks_LC(info);
		else if (lc == Cnd_insp_cnt_rmrks) doCnd_insp_cnt_rmrks_LC(info);
		else if (lc == Cnd_sub_char1) doCnd_sub_char1_LC(info);
		else if (lc == Cnd_sub_char2) doCnd_sub_char2_LC(info);
		else if (lc == Cnd_sub_char3) doCnd_sub_char3_LC(info);
		else if (lc == columnRslt_itm_typ) doRslt_itm_typ_LC(info);
		else if (lc == columnRslt_itm_typ_nm) doRslt_itm_typ_nm_LC(info);
		else if (lc == columnRslt_itm_typ_d_cd) doRslt_itm_typ_d_cd_LC(info);
		else if (lc == columnRslt_itm_typ_d_nm) doRslt_itm_typ_d_nm_LC(info);
		else if (lc == columnRslt_lot_no) doRslt_lot_no_LC(info);
		else if (lc == columnRslt_sublot_no) doRslt_sublot_no_LC(info);
		else if (lc == columnRslt_ver_no) doRslt_ver_no_LC(info);
		else if (lc == columnRslt_ac_dt) doRslt_ac_dt_LC(info);
		else if (lc == columnRslt_pack_unit_cd) doRslt_pack_unit_cd_LC(info);
		else if (lc == columnRslt_pack_unit_nm) doRslt_pack_unit_nm_LC(info);
		else if (lc == columnRslt_pack_dec_place) doRslt_pack_dec_place_LC(info);
		else if (lc == columnRslt_base_unit_cd) doRslt_base_unit_cd_LC(info);
		else if (lc == columnRslt_base_unit_nm) doRslt_base_unit_nm_LC(info);
		else if (lc == columnRslt_base_dec_place) doRslt_base_dec_place_LC(info);
		else if (lc == columnRslt_first_gr_dt) doRslt_first_gr_dt_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ) doRslt_lmt_dt_frm_typ_LC(info);
		else if (lc == columnRslt_lmt_dt_frm_typ_nm) doRslt_lmt_dt_frm_typ_nm_LC(info);
		else if (lc == columnRslt_lmt_dt_frm) doRslt_lmt_dt_frm_LC(info);
		else if (lc == columnRslt_vld_dt) doRslt_vld_dt_LC(info);
		else if (lc == columnRslt_lmt_dt) doRslt_lmt_dt_LC(info);
		else if (lc == columnRslt_mrp_use_dt) doRslt_mrp_use_dt_LC(info);
		else if (lc == columnRslt_loc_cd) doRslt_loc_cd_LC(info);
		else if (lc == columnRslt_loc_nm) doRslt_loc_nm_LC(info);
		else if (lc == columnRslt_str_ln_cd) doRslt_str_ln_cd_LC(info);
		else if (lc == columnRslt_str_ln_nm) doRslt_str_ln_nm_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_cd) doRslt_stk_arrv_bp_cd_LC(info);
		else if (lc == columnRslt_stk_arrv_bp_nm) doRslt_stk_arrv_bp_nm_LC(info);
		else if (lc == columnRslt_wg_cd) doRslt_wg_cd_LC(info);
		else if (lc == columnRslt_wg_nm) doRslt_wg_nm_LC(info);
		else if (lc == columnRslt_in_xfr_typ) doRslt_in_xfr_typ_LC(info);
		else if (lc == columnRslt_quality_typ) doRslt_quality_typ_LC(info);
		else if (lc == columnRslt_quality_typ_nm) doRslt_quality_typ_nm_LC(info);
		else if (lc == columnRslt_stk_insp_typ) doRslt_stk_insp_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ) doRslt_stk_id_typ_LC(info);
		else if (lc == columnRslt_stk_id_typ_nm) doRslt_stk_id_typ_nm_LC(info);
		else if (lc == columnRslt_gd_cd) doRslt_gd_cd_LC(info);
		else if (lc == columnRslt_gd_nm) doRslt_gd_nm_LC(info);
		else if (lc == columnRslt_def_lmt_ctl_categ) doRslt_def_lmt_ctl_categ_LC(info);
		else if (lc == columnRslt_stk_bp_cd) doRslt_stk_bp_cd_LC(info);
		else if (lc == columnRslt_cont_fctr_unit_cd) doRslt_cont_fctr_unit_cd_LC(info);
		else if (lc == columnRslt_cont_fctr_unit_nm) doRslt_cont_fctr_unit_nm_LC(info);
		else if (lc == columnRslt_cont_fctr_rnd_typ) doRslt_cont_fctr_rnd_typ_LC(info);
		else if (lc == columnRslt_cont_fctr_dec_place) doRslt_cont_fctr_dec_place_LC(info);
		else if (lc == columnRslt_insp_cnt_rmrks) doRslt_insp_cnt_rmrks_LC(info);
		else if (lc == columnRslt_lot_rmrks) doRslt_lot_rmrks_LC(info);
		else if (lc == columnRslt_sub_char1) doRslt_sub_char1_LC(info);
		else if (lc == columnRslt_sub_char2) doRslt_sub_char2_LC(info);
		else if (lc == columnRslt_sub_char3) doRslt_sub_char3_LC(info);
		else if (lc == columnRslt_insp_mtd_typ) doRslt_insp_mtd_typ_LC(info);
		else if (lc == columnRslt_insp_mtd_typ_nm) doRslt_insp_mtd_typ_nm_LC(info);
		else if (lc == columnRslt_insp_schd_no) doRslt_insp_schd_no_LC(info);
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
		else if (lc == columnRslt_upd_cntr) doRslt_upd_cntr_LC(info);
		else if (lc == columnRslt_fix_no_typ) doRslt_fix_no_typ_LC(info);
		else if (lc == columnRslt_fix_no) doRslt_fix_no_LC(info);
		else if (lc == columnRslt_asst_typ) doRslt_asst_typ_LC(info);
		else if (lc == columnRslt_base_unit_rnd_typ) doRslt_base_unit_rnd_typ_LC(info);
		else if (lc == columnRslt_pack_dmn_qty) doRslt_pack_dmn_qty_LC(info);
		else if (lc == columnRslt_pack_conv_qty) doRslt_pack_conv_qty_LC(info);
	}

	/**
	 * [Cnd]パネルの[today]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_today_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_vld_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_vld_pd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rem_stk_lmt_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rem_stk_lmt_pd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[trg_stk_lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_trg_stk_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_fr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_fr_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[first_gr_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_first_gr_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_schd_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_insp_cnt_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ver_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ver_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[ac_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_ac_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dec_place_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[base_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[first_gr_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_first_gr_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt_frm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_frm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[vld_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_vld_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lmt_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lmt_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[mrp_use_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_mrp_use_dt_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[str_ln_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_str_ln_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_arrv_bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_arrv_bp_nm_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[in_xfr_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_in_xfr_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[quality_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_quality_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_insp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_insp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[gd_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_gd_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[def_lmt_ctl_categ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_def_lmt_ctl_categ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[stk_bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_stk_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[cont_fctr_dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_cont_fctr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_cnt_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_cnt_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[lot_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_lot_rmrks_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[insp_mtd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_mtd_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_mtd_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[insp_schd_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_insp_schd_no_LC(MCEventInfo info){
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
	 * [Rslt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[fix_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_fix_no_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[base_unit_rnd_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_base_unit_rnd_typ_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_dmn_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_dmn_qty_LC(MCEventInfo info){
	}

	/**
	 * [Rslt]パネルの[pack_conv_qty]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRslt_pack_conv_qty_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_loc_cd]の作成メソッド
	 */
	public MCList getCnd_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
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

	/**
	 * コンボ／リストのリスト[Cnd_lot_no]の作成メソッド
	 */
	public MCList getCnd_lot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getLotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sublot_no]の作成メソッド
	 */
	public MCList getCnd_sublot_no(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0070.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0070.MSUAP_List", this)).getSublotNo(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_quality_typ]の作成メソッド
	 */
	public MCList getCnd_quality_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQualityTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_gd_cd]の作成メソッド
	 */
	public MCList getCnd_gd_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStkGd(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_stk_id_typ]の作成メソッド
	 */
	public MCList getCnd_stk_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getStkIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_pack_unit_cd]の作成メソッド
	 */
	public MCList getCnd_pack_unit_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUnit(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_str_ln_cd]の作成メソッド
	 */
	public MCList getCnd_str_ln_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getStrLn(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBFL0010.Srch01")) {
			return new MS_MSBFL0010_Srch01Bridge();
		}
		if (id.equals("MS.MSBFL0010.Srch02")) {
			return new MS_MSBFL0010_Srch02Bridge();
		}
		if (id.equals("MS.MSBFL0010.Srch03")) {
			return new MS_MSBFL0010_Srch03Bridge();
		}
		if (id.equals("MS.MSBFL0010.Srch04")) {
			return new MS_MSBFL0010_Srch04Bridge();
		}
		if (id.equals("MS.MSBFL0010.Ins01")) {
			return new MS_MSBFL0010_Ins01Bridge();
		}
		if (id.equals("MS.MSBFL0010.Ins02")) {
			return new MS_MSBFL0010_Ins02Bridge();
		}
		if (id.equals("MS.MSBFL0010.Del01")) {
			return new MS_MSBFL0010_Del01Bridge();
		}
		if (id.equals("MS.MSBFL0010.Del02")) {
			return new MS_MSBFL0010_Del02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBFL0010_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Srch01;

		/** コンストラクタ */
		protected MS_MSBFL0010_Srch01Bridge() {
			p_MS_MSBFL0010_Srch01 = new MCParam(PDef.MS_MSBFL0010_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0010.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Srch01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Srch01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Srch02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Srch02;

		/** コンストラクタ */
		protected MS_MSBFL0010_Srch02Bridge() {
			p_MS_MSBFL0010_Srch02 = new MCParam(PDef.MS_MSBFL0010_Srch02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Srch02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Srch02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Srch02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Srch02.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Srch02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Srch02.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0010.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Srch02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Srch02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Srch02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Srch03]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch03Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Srch03;

		/** コンストラクタ */
		protected MS_MSBFL0010_Srch03Bridge() {
			p_MS_MSBFL0010_Srch03 = new MCParam(PDef.MS_MSBFL0010_Srch03_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Srch03_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Srch03 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Srch03.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Srch03.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Srch03.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Srch03.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0010.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Srch03.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Srch03;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Srch03.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Srch04]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Srch04Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Srch04;

		/** コンストラクタ */
		protected MS_MSBFL0010_Srch04Bridge() {
			p_MS_MSBFL0010_Srch04 = new MCParam(PDef.MS_MSBFL0010_Srch04_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Srch04_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBF.MSBFP0010.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Srch04 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Srch04.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Srch04.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Srch04.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Srch04.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBF.MSBFP0010.CndR up0() {
			return (mcframe.clientMSBF.MSBFP0010.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Srch04.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Srch04;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Srch04.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Ins01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Ins01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Ins01;

		/** コンストラクタ */
		protected MS_MSBFL0010_Ins01Bridge() {
			p_MS_MSBFL0010_Ins01 = new MCParam(PDef.MS_MSBFL0010_Ins01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Ins01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Ins01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Ins01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Ins01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Ins01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Ins01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Ins01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Ins01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Ins01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Ins02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Ins02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Ins02;

		/** コンストラクタ */
		protected MS_MSBFL0010_Ins02Bridge() {
			p_MS_MSBFL0010_Ins02 = new MCParam(PDef.MS_MSBFL0010_Ins02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Ins02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Ins02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Ins02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Ins02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Ins02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Ins02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Ins02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Ins02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Ins02.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Del01;

		/** コンストラクタ */
		protected MS_MSBFL0010_Del01Bridge() {
			p_MS_MSBFL0010_Del01 = new MCParam(PDef.MS_MSBFL0010_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Del01.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Del01.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Del01;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Del01.getContainerParam().getDownBlock(0));
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
	 * [MS_MSBFL0010_Del02]の定型処理のInnerClass
	 */
	protected class MS_MSBFL0010_Del02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBFL0010_Del02;

		/** コンストラクタ */
		protected MS_MSBFL0010_Del02Bridge() {
			p_MS_MSBFL0010_Del02 = new MCParam(PDef.MS_MSBFL0010_Del02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBFL0010_Del02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));

			p_MS_MSBFL0010_Del02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBFL0010_Del02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBFL0010_Del02.addUpBlock(getRsltL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBFL0010_Del02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBFL0010_Del02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> up0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)up(0);
		}

		protected MCList<mcframe.clientMSBF.MSBFP0010.RsltR> down0() {
			return (MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBFL0010_Del02.addDownBlock(MCList.create(mcframe.clientMSBF.MSBFP0010.RsltR.class));
		}
		protected MCParam param() {
			return p_MS_MSBFL0010_Del02;
		}

		protected void show() {
			setRsltL((MCList<mcframe.clientMSBF.MSBFP0010.RsltR>)p_MS_MSBFL0010_Del02.getContainerParam().getDownBlock(0));
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