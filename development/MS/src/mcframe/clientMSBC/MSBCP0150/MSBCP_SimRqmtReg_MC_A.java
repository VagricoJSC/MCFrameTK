package mcframe.clientMSBC.MSBCP0150;

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
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Srch01Caller;
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Sprt01Caller;
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Imp01Caller;
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd01Caller;
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Del01Caller;
import mcframe.clientMSBC.MSBCP0150.MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd02Caller;

/**
 * 画面"MSBCP_SimRqmtReg"パネルクラスです。<p>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MSBCP_SimRqmtReg_MC_A extends mcframe.clientMSUD.MSUDP0010.MSUDP_PanelBase{
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
	public static final String SCREEN_ID = "MSBCP0150";

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
	 * UPD,Create/Modify;DEL,Cancel;REF,View;INT,Execute; UPD,登録・訂正する;DEL,取り消す;REF,参照する;INT,実行する;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCRadioButton Cnd_ope_INT = null;
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
	public MCLabel Cnd_sim_usr_cd_Label = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_sim_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCTextField Cnd_sim_usr_nm = null;
	public MCLabel Cnd_mrp_proc_dt_from_Label = null;
	/**
	 * MRP run date FROM ＭＲＰ実行日ＦＲＯＭ.<p>
	 *
	 */
	public MCDateField Cnd_mrp_proc_dt_from = null;
	public MCLabel Cnd_mrp_proc_dt_to_Label = null;
	/**
	 * MRP run date TO ＭＲＰ実行日ＴＯ.<p>
	 *
	 */
	public MCDateField Cnd_mrp_proc_dt_to = null;
	public MCLabel Cnd_sim_mrp_no_Label = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_no = null;
	public MCLabel Cnd_sim_mrp_typ_Label = null;
	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_sim_mrp_typ = null;
	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_typ_nm = null;
	public MCLabel Cnd_sim_mrp_intr_rmrks_Label = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_intr_rmrks = null;
	public MCLabel Cnd_sim_mrp_sub_char1_Label = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_sub_char1 = null;
	public MCLabel Cnd_sim_mrp_sub_char2_Label = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_sub_char2 = null;
	public MCLabel Cnd_sim_mrp_sub_char3_Label = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCTextField Cnd_sim_mrp_sub_char3 = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [List]ブロック関連のField定義
	public MCPanel ListPanel = null;
	// [List]ブロックの項目のField定義
	// [SimInfo]ブロック関連のField定義
	public MCPanel SimInfoPanel = null;
	// [SimInfo]ブロックの項目のField定義
	// [RsltSim]ブロック関連のField定義
	public MCPanel RsltSimPanel = null;
	public MCTitledBorder RsltSimTitledBorder = null;
	public MCScrollPane RsltSimScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0150.RsltSimR> RsltSimTable = null;
	// [RsltSim]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_check = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_no = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_wg_nm = null;
	/**
	 * Simulation MRP type シミュレーションＭＲＰ区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_typ = null;
	/**
	 * Simulation MRP type name シミュレーションＭＲＰ区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_typ_nm = null;
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_usr_cd = null;
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_usr_nm = null;
	/**
	 * Daily production request 日次生産依頼.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_dly_rqmt_flg = null;
	/**
	 * Inventory 在庫.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_stk_flg = null;
	/**
	 * GR schedule 入庫予定.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_gr_flg = null;
	/**
	 * GI schedule (Except shipping schedule) 出庫予定（出荷予定除く）.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_gi_flg = null;
	/**
	 * Shipping schedule 出荷予定.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ship_flg = null;
	/**
	 * Hierarchy 階層.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_tree_lvl = null;
	/**
	 * MRP run date ＭＲＰ実行日.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_mrp_proc_dt = null;
	/**
	 * Applied 反映済.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_exp_flg = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_sim_mrp_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D RsltSim_rts_msg_p_PPanel;
	public MCColumnConfig columnRsltSim_rtn_sts_typ;// [RsltSim]の[rts_msg_p.rtn_sts_typ]を[columnRsltSim_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_upd_cntr = null;
	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_peg_no1 = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltSim_data_crud_typ = null;
	// [BtnSim]ブロック関連のField定義
	public MCPanel BtnSimPanel = null;
	// [BtnSim]ブロックの項目のField定義
	/**
	 * Order status update for simulation シミュレーション用オーダ確認.<p>
	 *
	 */
	public MCButton BtnSim_open_MSBCP0160 = null;
	/**
	 * Inventory forecasting list for simulation シミュ用在庫推移照会.<p>
	 *
	 */
	public MCButton BtnSim_open_MSBCP0170 = null;
	/**
	 * Inventory forecasting details for simulation シミュ用在庫推移明細照会.<p>
	 *
	 */
	public MCButton BtnSim_open_MSBCP0180 = null;
	/**
	 * Check server process (For personal use) サーバ処理確認（個人用）.<p>
	 *
	 */
	public MCButton BtnSim_open_FSBGP0140 = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton BtnSim_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton BtnSim_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton BtnSim_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton BtnSim_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton BtnSim_rcopy = null;
	// [RqmtInfo]ブロック関連のField定義
	public MCPanel RqmtInfoPanel = null;
	// [RqmtInfo]ブロックの項目のField定義
	// [RsltRqmt]ブロック関連のField定義
	public MCPanel RsltRqmtPanel = null;
	public MCTitledBorder RsltRqmtTitledBorder = null;
	public MCScrollPane RsltRqmtScrollPane = null;
	public MCTable2<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> RsltRqmtTable = null;
	// [RsltRqmt]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_check = null;
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno_sprt_flg = null;
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_no = null;
	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sim_mrp_no = null;
	/**
	 * Due date 納期.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_due_dt = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D RsltRqmt_itm_p_PPanel;
	public MCColumnConfig columnRsltRqmt_itm_cd;// [RsltRqmt]の[itm_p.itm_cd]を[columnRsltRqmt_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_itm_sub1;// [RsltRqmt]の[itm_p.itm_sub1]を[columnRsltRqmt_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_itm_sub2;// [RsltRqmt]の[itm_p.itm_sub2]を[columnRsltRqmt_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_itm_sub3;// [RsltRqmt]の[itm_p.itm_sub3]を[columnRsltRqmt_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_itm_nm;// [RsltRqmt]の[itm_p.itm_nm]を[columnRsltRqmt_itm_nm]としてエイリアス定義。
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_strg_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_strg_loc_nm = null;
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_site_cd = null;
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_site_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_wg_nm = null;
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_strg_loc_grp_cd = null;
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_strg_loc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D RsltRqmt_rqmt_qty_p_PPanel;
	public MCColumnConfig columnRsltRqmt_rqmt_qty;// [RsltRqmt]の[rqmt_qty_p.qty]を[columnRsltRqmt_rqmt_qty]としてエイリアス定義。
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_unit_nm = null;
	/**
	 * Base unit number of decimal places 基準単位小数点有効桁数.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_dec_place = null;
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_mfg_loc_cd = null;
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_mfg_loc_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sppl_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqst_loc_nm = null;
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqst_wg_cd = null;
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqst_wg_nm = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno4_mng_typ = null;
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno1_num_typ = null;
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno2_num_typ = null;
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno3_num_typ = null;
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sno4_num_typ = null;
	/**
	 * Requirements SEIBAN No. 1 required 所要手配ＮＯ１必須.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_sno1_flg = null;
	/**
	 * Requirements SEIBAN No. 2 required 所要手配ＮＯ２必須.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_sno2_flg = null;
	/**
	 * Requirements SEIBAN No. 3 required 所要手配ＮＯ３必須.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_sno3_flg = null;
	/**
	 * Requirements SEIBAN No. 4 required 所要手配ＮＯ４必須.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_sno4_flg = null;
	public mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D RsltRqmt_sno_wrkno_p_PPanel;
	public MCColumnConfig columnRsltRqmt_sno1;// [RsltRqmt]の[sno_wrkno_p.sno1]を[columnRsltRqmt_sno1]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_sno2;// [RsltRqmt]の[sno_wrkno_p.sno2]を[columnRsltRqmt_sno2]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_sno3;// [RsltRqmt]の[sno_wrkno_p.sno3]を[columnRsltRqmt_sno3]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_sno4;// [RsltRqmt]の[sno_wrkno_p.sno4]を[columnRsltRqmt_sno4]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_wrk_no;// [RsltRqmt]の[sno_wrkno_p.wrk_no]を[columnRsltRqmt_wrk_no]としてエイリアス定義。
	public MCColumnConfig columnRsltRqmt_wrk_nm;// [RsltRqmt]の[sno_wrkno_p.wrk_nm]を[columnRsltRqmt_wrk_nm]としてエイリアス定義。
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_typ = null;
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_rqmt_typ_nm = null;
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_intr_rmrks = null;
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sub_char1 = null;
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sub_char2 = null;
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_sub_char3 = null;
	public mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D RsltRqmt_rqmt_rts_msg_p_PPanel;
	public MCColumnConfig columnRsltRqmt_rqmt_rtn_sts_typ;// [RsltRqmt]の[rqmt_rts_msg_p.rtn_sts_typ]を[columnRsltRqmt_rqmt_rtn_sts_typ]としてエイリアス定義。
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_ins_usr_nm = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_ins_func_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_ins_ts = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_usr_nm = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_func_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_ts = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_srv_req_no = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_upd_cntr = null;
	/**
	 * Pegging No. 1 紐付けＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_peg_no1 = null;
	/**
	 * Pegging No. 2 紐付けＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_peg_no2 = null;
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_data_crud_typ = null;
	/**
	 * Unmodifiable 変更不可.<p>
	 *
	 */
	public MCColumnConfig columnRsltRqmt_un_editable_flg = null;
	// [BtnRqmt]ブロック関連のField定義
	public MCPanel BtnRqmtPanel = null;
	// [BtnRqmt]ブロックの項目のField定義
	/**
	 * Order explosion for simulation シミュ用オーダ展開情報照会.<p>
	 *
	 */
	public MCButton BtnRqmt_open_MSBCP0190 = null;
	/**
	 * Select numbering target 発番対象選択.<p>
	 *
	 */
	public MCLabel BtnRqmt_label_sno = null;
	/**
	 * Select all (SEIBAN No. numbering) 全選択（手配ＮＯ発番）.<p>
	 *
	 */
	public MCButton BtnRqmt_sno_select_all = null;
	/**
	 * Release all (SEIBAN No. numbering) 全解除（手配ＮＯ発番）.<p>
	 *
	 */
	public MCButton BtnRqmt_sno_deselect_all = null;
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public MCButton BtnRqmt_sprt_sno = null;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton BtnRqmt_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton BtnRqmt_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton BtnRqmt_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton BtnRqmt_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton BtnRqmt_rcopy = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton BtnRqmt_upd = null;
	/**
	 * Run 実行する.<p>
	 *
	 */
	public MCButton BtnRqmt_upd02 = null;
	/**
	 * Cancel 取り消す.<p>
	 *
	 */
	public MCButton BtnRqmt_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD_HDR]モードを表す定数 */
	public static final String UPD_HDR = "UPD_HDR";
	/** [UPD_DTL]モードを表す定数 */
	public static final String UPD_DTL = "UPD_DTL";
	/** [UPD_FIX]モードを表す定数 */
	public static final String UPD_FIX = "UPD_FIX";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [SRCH_DEL]モードを表す定数 */
	public static final String SRCH_DEL = "SRCH_DEL";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [SRCH_INST]モードを表す定数 */
	public static final String SRCH_INST = "SRCH_INST";
	/** [INST]モードを表す定数 */
	public static final String INST = "INST";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD_HDR, UPD_DTL, UPD_FIX, REF, SRCH_DEL, DEL, SRCH_INST, INST};
	
	/** [MS_MSBCL0150_Srch01]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Srch01Caller createMS_MSBCL0150_Srch01() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Srch01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Srch01Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Srch01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Srch01Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Srch01Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Srch01]の呼び出し */
	protected void callMS_MSBCL0150_Srch01() {
		MCCaller caller = createMS_MSBCL0150_Srch01();
		caller.exec();
	}
	/** [MS_MSBCL0150_Sprt01]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Sprt01Caller createMS_MSBCL0150_Sprt01() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Sprt01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Sprt01Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Sprt01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Sprt01Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Sprt01Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Sprt01]の呼び出し */
	protected void callMS_MSBCL0150_Sprt01() {
		MCCaller caller = createMS_MSBCL0150_Sprt01();
		caller.exec();
	}
	/** [MS_MSBCL0150_Imp01]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Imp01Caller createMS_MSBCL0150_Imp01() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Imp01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Imp01Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Imp01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Imp01Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Imp01Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Imp01]の呼び出し */
	protected void callMS_MSBCL0150_Imp01() {
		MCCaller caller = createMS_MSBCL0150_Imp01();
		caller.exec();
	}
	/** [MS_MSBCL0150_Upd01]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd01Caller createMS_MSBCL0150_Upd01() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Upd01Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Upd01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Upd01Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Upd01Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Upd01]の呼び出し */
	protected void callMS_MSBCL0150_Upd01() {
		MCCaller caller = createMS_MSBCL0150_Upd01();
		caller.exec();
	}
	/** [MS_MSBCL0150_Del01]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Del01Caller createMS_MSBCL0150_Del01() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Del01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Del01Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Del01Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Del01Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Del01Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Del01]の呼び出し */
	protected void callMS_MSBCL0150_Del01() {
		MCCaller caller = createMS_MSBCL0150_Del01();
		caller.exec();
	}
	/** [MS_MSBCL0150_Upd02]のCallerの作成 */
	protected MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd02Caller createMS_MSBCL0150_Upd02() {
		MSBCP_SimRqmtReg_MC.MS_MSBCL0150_Upd02Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Upd02Bridge>
		caller = ((MSBCP_SimRqmtReg_MC)this).new MS_MSBCL0150_Upd02Caller<MSBCP_SimRqmtReg, MS_MSBCL0150_Upd02Bridge>(
					(MSBCP_SimRqmtReg)this, new MS_MSBCL0150_Upd02Bridge());
		return caller;
	}
	/** [MS_MSBCL0150_Upd02]の呼び出し */
	protected void callMS_MSBCL0150_Upd02() {
		MCCaller caller = createMS_MSBCL0150_Upd02();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMSBC.MSBCP0150.CndR aCndR;
	/** [RsltSim]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> aRsltSimL;
	/** [RsltRqmt]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> aRsltRqmtL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMSBC.MSBCP0150.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0150.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMSBC.MSBCP0150.CndR createCndR() {
		return mcframe.clientMSBC.MSBCP0150.CndR.create();
	}

	/**
	 * コピーによってaRsltSimLを設定します。
	 *
	 * aRsltSimLのインスタンスは変更されません。
	 *
	 * @param dataset RsltSimL
	 */
	public void setRsltSimL(MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> aList) {
		if (getRsltSimL() != aList) {
			getRsltSimL().setAll(aList);
		}
	}

	/**
	 * [RsltSim]ブロックのコンテナaRsltSimLを返します。
	 *
	 * @return RsltSimL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> getRsltSimL() {
		return aRsltSimL;
	}

	/**
	 * aRsltSimRを作成します。
	 *
	 * @return RsltSimR
	 */
	public mcframe.clientMSBC.MSBCP0150.RsltSimR createRsltSimR() {
		return mcframe.clientMSBC.MSBCP0150.RsltSimR.create();
	}

	/**
	 * aRsltSimLを作成します。
	 *
	 * @return RsltSimL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> createRsltSimL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class);
	}

	/**
	 * RsltSimTableを初期化します。
	 */
	protected void createRsltSimTable(){
		if(RsltSimTable == null){
			RsltSimTable = beansFactory.createTable2("RsltSim.table");
		}
	}

	/**
	 * コピーによってaRsltRqmtLを設定します。
	 *
	 * aRsltRqmtLのインスタンスは変更されません。
	 *
	 * @param dataset RsltRqmtL
	 */
	public void setRsltRqmtL(MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> aList) {
		if (getRsltRqmtL() != aList) {
			getRsltRqmtL().setAll(aList);
		}
	}

	/**
	 * [RsltRqmt]ブロックのコンテナaRsltRqmtLを返します。
	 *
	 * @return RsltRqmtL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> getRsltRqmtL() {
		return aRsltRqmtL;
	}

	/**
	 * aRsltRqmtRを作成します。
	 *
	 * @return RsltRqmtR
	 */
	public mcframe.clientMSBC.MSBCP0150.RsltRqmtR createRsltRqmtR() {
		return mcframe.clientMSBC.MSBCP0150.RsltRqmtR.create();
	}

	/**
	 * aRsltRqmtLを作成します。
	 *
	 * @return RsltRqmtL
	 */
	public MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> createRsltRqmtL() {
		return MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class);
	}

	/**
	 * RsltRqmtTableを初期化します。
	 */
	protected void createRsltRqmtTable(){
		if(RsltRqmtTable == null){
			RsltRqmtTable = beansFactory.createTable2("RsltRqmt.table");
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
		if(!MCCollectionUtil.contains(ret, getRsltSimL())) ret.add(getRsltSimL());
		if(!MCCollectionUtil.contains(ret, getRsltRqmtL())) ret.add(getRsltRqmtL());
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
		if(aCnt == getRsltSimL()) return "RsltSim";
		if(aCnt == getRsltRqmtL()) return "RsltRqmt";
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
		if(bId.equals("RsltSim")) return getRsltSimL();
		if(bId.equals("RsltRqmt")) return getRsltRqmtL();
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
		ret.add(ListPanel);
		ret.add(SimInfoPanel);
		ret.add(RsltSimPanel);
		ret.add(BtnSimPanel);
		ret.add(RqmtInfoPanel);
		ret.add(RsltRqmtPanel);
		ret.add(BtnRqmtPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MSBCP_SimRqmtReg_MC_A() {
		aCndR = createCndR();
		aRsltSimL = createRsltSimL();
		aRsltRqmtL = createRsltRqmtL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MSBCP_SimRqmtReg_MC_A(String name) {
		aCndR = createCndR();
		aRsltSimL = createRsltSimL();
		createRsltSimTable();
		RsltSimTable.setRowName(name);
		aRsltRqmtL = createRsltRqmtL();
		createRsltRqmtTable();
		RsltRqmtTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MSBCP_SimRqmtReg_MC.jbCreateScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateTop((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateFold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateCnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateCtrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateList((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateSimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateRsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateBtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateRqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateRsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateBtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbCreateEastBtn((MSBCP_SimRqmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MSBCP_SimRqmtReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [List]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateList(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [SimInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateSimInfo(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [RsltSim]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltSim(MSBCP_SimRqmtReg p) {
		p.RsltSim_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.$rts_msg_p);
		p.RsltSim_rts_msg_p_PPanel.setName("RsltSim.rts_msg_p");
		p.columnRsltSim_rtn_sts_typ = p.RsltSim_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRsltSim_rtn_sts_typ.addAliasName("RsltSim.rtn_sts_typ", p);
	}

	/**
	 * [BtnSim]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnSim(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [RqmtInfo]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRqmtInfo(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [RsltRqmt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRsltRqmt(MSBCP_SimRqmtReg p) {
		p.RsltRqmt_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.$itm_p);
		p.RsltRqmt_itm_p_PPanel.setName("RsltRqmt.itm_p");
		p.columnRsltRqmt_itm_cd = p.RsltRqmt_itm_p_PPanel.columnItm_itm_cd;
		p.columnRsltRqmt_itm_cd.addAliasName("RsltRqmt.itm_cd", p);
		p.columnRsltRqmt_itm_sub1 = p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub1;
		p.columnRsltRqmt_itm_sub1.addAliasName("RsltRqmt.itm_sub1", p);
		p.columnRsltRqmt_itm_sub2 = p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub2;
		p.columnRsltRqmt_itm_sub2.addAliasName("RsltRqmt.itm_sub2", p);
		p.columnRsltRqmt_itm_sub3 = p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub3;
		p.columnRsltRqmt_itm_sub3.addAliasName("RsltRqmt.itm_sub3", p);
		p.columnRsltRqmt_itm_nm = p.RsltRqmt_itm_p_PPanel.columnItm_itm_nm;
		p.columnRsltRqmt_itm_nm.addAliasName("RsltRqmt.itm_nm", p);
		p.RsltRqmt_rqmt_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.$rqmt_qty_p);
		p.RsltRqmt_rqmt_qty_p_PPanel.setName("RsltRqmt.rqmt_qty_p");
		p.columnRsltRqmt_rqmt_qty = p.RsltRqmt_rqmt_qty_p_PPanel.columnQty_qty;
		p.columnRsltRqmt_rqmt_qty.addAliasName("RsltRqmt.rqmt_qty", p);
		p.RsltRqmt_sno_wrkno_p_PPanel = mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.$sno_wrkno_p);
		p.RsltRqmt_sno_wrkno_p_PPanel.setName("RsltRqmt.sno_wrkno_p");
		p.columnRsltRqmt_sno1 = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_sno1;
		p.columnRsltRqmt_sno1.addAliasName("RsltRqmt.sno1", p);
		p.columnRsltRqmt_sno2 = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_sno2;
		p.columnRsltRqmt_sno2.addAliasName("RsltRqmt.sno2", p);
		p.columnRsltRqmt_sno3 = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_sno3;
		p.columnRsltRqmt_sno3.addAliasName("RsltRqmt.sno3", p);
		p.columnRsltRqmt_sno4 = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_sno4;
		p.columnRsltRqmt_sno4.addAliasName("RsltRqmt.sno4", p);
		p.columnRsltRqmt_wrk_no = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_wrk_no;
		p.columnRsltRqmt_wrk_no.addAliasName("RsltRqmt.wrk_no", p);
		p.columnRsltRqmt_wrk_nm = p.RsltRqmt_sno_wrkno_p_PPanel.columnSnoWrkNo_wrk_nm;
		p.columnRsltRqmt_wrk_nm.addAliasName("RsltRqmt.wrk_nm", p);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel = mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.$rqmt_rts_msg_p);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.setName("RsltRqmt.rqmt_rts_msg_p");
		p.columnRsltRqmt_rqmt_rtn_sts_typ = p.RsltRqmt_rqmt_rts_msg_p_PPanel.columnRtnMsg_rtn_sts_typ;
		p.columnRsltRqmt_rqmt_rtn_sts_typ.addAliasName("RsltRqmt.rqmt_rtn_sts_typ", p);
	}

	/**
	 * [BtnRqmt]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtnRqmt(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MSBCP_SimRqmtReg p) {
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
	
	
	/** [Cnd_sim_usr_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sim_usr_cd_p = null;

	/**
	 * [Cnd_sim_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sim_usr_cd_ListPutter() {
		if (Cnd_sim_usr_cd_p == null) {
			Cnd_sim_usr_cd_p = createCnd_sim_usr_cd_ListPutter(Cnd_sim_usr_cd, "sim_usr_cd", "sim_usr_nm");

		}
		return Cnd_sim_usr_cd_p;
	}
	
	
	/** [Cnd_sim_mrp_typ_ListPutter]の定義 */
	private MCListPutter Cnd_sim_mrp_typ_p = null;

	/**
	 * [Cnd_sim_mrp_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sim_mrp_typ_ListPutter() {
		if (Cnd_sim_mrp_typ_p == null) {
			Cnd_sim_mrp_typ_p = createCnd_sim_mrp_typ_ListPutter(Cnd_sim_mrp_typ, "sim_mrp_typ", "sim_mrp_typ_nm");

		}
		return Cnd_sim_mrp_typ_p;
	}
	
	
	/** [RsltSim_wg_cd_ListPutter]の定義 */
	private MCListPutter RsltSim_wg_cd_p = null;

	/**
	 * [RsltSim_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltSim_wg_cd_ListPutter() {
		if (RsltSim_wg_cd_p == null) {
			RsltSim_wg_cd_p = createRsltSim_wg_cd_ListPutter(columnRsltSim_wg_cd, "wg_cd", "wg_nm");

		}
		return RsltSim_wg_cd_p;
	}
	
	
	/** [RsltSim_sim_mrp_typ_ListPutter]の定義 */
	private MCListPutter RsltSim_sim_mrp_typ_p = null;

	/**
	 * [RsltSim_sim_mrp_typ_ListPutter]の取得
	 */
	protected MCListPutter getRsltSim_sim_mrp_typ_ListPutter() {
		if (RsltSim_sim_mrp_typ_p == null) {
			RsltSim_sim_mrp_typ_p = createRsltSim_sim_mrp_typ_ListPutter(columnRsltSim_sim_mrp_typ, "sim_mrp_typ", "sim_mrp_typ_nm");

		}
		return RsltSim_sim_mrp_typ_p;
	}
	
	
	/** [RsltSim_sim_usr_cd_ListPutter]の定義 */
	private MCListPutter RsltSim_sim_usr_cd_p = null;

	/**
	 * [RsltSim_sim_usr_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltSim_sim_usr_cd_ListPutter() {
		if (RsltSim_sim_usr_cd_p == null) {
			RsltSim_sim_usr_cd_p = createRsltSim_sim_usr_cd_ListPutter(columnRsltSim_sim_usr_cd, "sim_usr_cd", "sim_usr_nm");

		}
		return RsltSim_sim_usr_cd_p;
	}
	
	
	/** [RsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter RsltRqmt_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (RsltRqmt_itm_p_PPanel_columnItm_itm_cd_p == null) {
			RsltRqmt_itm_p_PPanel_columnItm_itm_cd_p = createRsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter(RsltRqmt_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return RsltRqmt_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_p = createRsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(RsltRqmt_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_p = createRsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(RsltRqmt_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_p = createRsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(RsltRqmt_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm","unit_cd","unit_nm","dec_place","sno1_mng_typ","sno2_mng_typ","sno3_mng_typ","sno4_mng_typ","sno1_num_typ","sno2_num_typ","sno3_num_typ","sno4_num_typ","rqmt_sno1_flg","rqmt_sno2_flg","rqmt_sno3_flg","rqmt_sno4_flg");
		}
		return RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [RsltRqmt_strg_loc_cd_ListPutter]の定義 */
	private MCListPutter RsltRqmt_strg_loc_cd_p = null;

	/**
	 * [RsltRqmt_strg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_strg_loc_cd_ListPutter() {
		if (RsltRqmt_strg_loc_cd_p == null) {
			RsltRqmt_strg_loc_cd_p = createRsltRqmt_strg_loc_cd_ListPutter(columnRsltRqmt_strg_loc_cd, "strg_loc_cd", "strg_loc_nm","site_cd","site_nm","wg_cd","wg_nm","strg_loc_grp_cd","strg_loc_grp_nm");

		}
		return RsltRqmt_strg_loc_cd_p;
	}
	
	
	/** [RsltRqmt_mfg_loc_cd_ListPutter]の定義 */
	private MCListPutter RsltRqmt_mfg_loc_cd_p = null;

	/**
	 * [RsltRqmt_mfg_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_mfg_loc_cd_ListPutter() {
		if (RsltRqmt_mfg_loc_cd_p == null) {
			RsltRqmt_mfg_loc_cd_p = createRsltRqmt_mfg_loc_cd_ListPutter(columnRsltRqmt_mfg_loc_cd, "mfg_loc_cd", "mfg_loc_nm");

		}
		return RsltRqmt_mfg_loc_cd_p;
	}
	
	
	/** [RsltRqmt_sppl_cd_ListPutter]の定義 */
	private MCListPutter RsltRqmt_sppl_cd_p = null;

	/**
	 * [RsltRqmt_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_sppl_cd_ListPutter() {
		if (RsltRqmt_sppl_cd_p == null) {
			RsltRqmt_sppl_cd_p = createRsltRqmt_sppl_cd_ListPutter(columnRsltRqmt_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return RsltRqmt_sppl_cd_p;
	}
	
	
	/** [RsltRqmt_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter RsltRqmt_rqst_loc_cd_p = null;

	/**
	 * [RsltRqmt_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_rqst_loc_cd_ListPutter() {
		if (RsltRqmt_rqst_loc_cd_p == null) {
			RsltRqmt_rqst_loc_cd_p = createRsltRqmt_rqst_loc_cd_ListPutter(columnRsltRqmt_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm","rqst_wg_cd","rqst_wg_nm");

		}
		return RsltRqmt_rqst_loc_cd_p;
	}
	
	
	/** [RsltRqmt_rqmt_typ_ListPutter]の定義 */
	private MCListPutter RsltRqmt_rqmt_typ_p = null;

	/**
	 * [RsltRqmt_rqmt_typ_ListPutter]の取得
	 */
	protected MCListPutter getRsltRqmt_rqmt_typ_ListPutter() {
		if (RsltRqmt_rqmt_typ_p == null) {
			RsltRqmt_rqmt_typ_p = createRsltRqmt_rqmt_typ_ListPutter(columnRsltRqmt_rqmt_typ, "rqmt_typ", "rqmt_typ_nm");

		}
		return RsltRqmt_rqmt_typ_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_SimRqmtReg create(){
		MSBCP_SimRqmtReg p = new MSBCP_SimRqmtReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MSBCP_SimRqmtReg create(String name){
		MSBCP_SimRqmtReg p = new MSBCP_SimRqmtReg(name);
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
		MSBCP_SimRqmtReg_MC.jbfInitScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitTop((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitFold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitCnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitCtrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitList((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitSimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitRsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitBtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitRqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitRsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitBtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbfInitEastBtn((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitTop((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitFold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitCnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitCtrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitList((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitSimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitRsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitBtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitRqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitRsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitBtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.jbInitEastBtn((MSBCP_SimRqmtReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_ope_INT = p.beansFactory.createRadioButton("Cnd.ope_INT");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_sim_usr_cd_Label = p.beansFactory.createLabel("Cnd.sim_usr_cd_Label");
		p.Cnd_sim_usr_cd = p.beansFactory.createTextField("Cnd.sim_usr_cd");
		p.Cnd_sim_usr_cd.setLabel(p.Cnd_sim_usr_cd_Label);
		p.Cnd_sim_usr_nm = p.beansFactory.createTextField("Cnd.sim_usr_nm");
		p.Cnd_mrp_proc_dt_from_Label = p.beansFactory.createLabel("Cnd.mrp_proc_dt_from_Label");
		p.Cnd_mrp_proc_dt_from = p.beansFactory.createDateField("Cnd.mrp_proc_dt_from");
		p.Cnd_mrp_proc_dt_from.setLabel(p.Cnd_mrp_proc_dt_from_Label);
		p.Cnd_mrp_proc_dt_to_Label = p.beansFactory.createLabel("Cnd.mrp_proc_dt_to_Label");
		p.Cnd_mrp_proc_dt_to = p.beansFactory.createDateField("Cnd.mrp_proc_dt_to");
		p.Cnd_mrp_proc_dt_to.setLabel(p.Cnd_mrp_proc_dt_to_Label);
		p.Cnd_sim_mrp_no_Label = p.beansFactory.createLabel("Cnd.sim_mrp_no_Label");
		p.Cnd_sim_mrp_no = p.beansFactory.createTextField("Cnd.sim_mrp_no");
		p.Cnd_sim_mrp_no.setLabel(p.Cnd_sim_mrp_no_Label);
		p.Cnd_sim_mrp_typ_Label = p.beansFactory.createLabel("Cnd.sim_mrp_typ_Label");
		p.Cnd_sim_mrp_typ = p.beansFactory.createTextComboBox("Cnd.sim_mrp_typ");
		p.Cnd_sim_mrp_typ.setLabel(p.Cnd_sim_mrp_typ_Label);
		p.Cnd_sim_mrp_typ_nm = p.beansFactory.createTextField("Cnd.sim_mrp_typ_nm");
		p.Cnd_sim_mrp_intr_rmrks_Label = p.beansFactory.createLabel("Cnd.sim_mrp_intr_rmrks_Label");
		p.Cnd_sim_mrp_intr_rmrks = p.beansFactory.createTextField("Cnd.sim_mrp_intr_rmrks");
		p.Cnd_sim_mrp_intr_rmrks.setLabel(p.Cnd_sim_mrp_intr_rmrks_Label);
		p.Cnd_sim_mrp_sub_char1_Label = p.beansFactory.createLabel("Cnd.sim_mrp_sub_char1_Label");
		p.Cnd_sim_mrp_sub_char1 = p.beansFactory.createTextField("Cnd.sim_mrp_sub_char1");
		p.Cnd_sim_mrp_sub_char1.setLabel(p.Cnd_sim_mrp_sub_char1_Label);
		p.Cnd_sim_mrp_sub_char2_Label = p.beansFactory.createLabel("Cnd.sim_mrp_sub_char2_Label");
		p.Cnd_sim_mrp_sub_char2 = p.beansFactory.createTextField("Cnd.sim_mrp_sub_char2");
		p.Cnd_sim_mrp_sub_char2.setLabel(p.Cnd_sim_mrp_sub_char2_Label);
		p.Cnd_sim_mrp_sub_char3_Label = p.beansFactory.createLabel("Cnd.sim_mrp_sub_char3_Label");
		p.Cnd_sim_mrp_sub_char3 = p.beansFactory.createTextField("Cnd.sim_mrp_sub_char3");
		p.Cnd_sim_mrp_sub_char3.setLabel(p.Cnd_sim_mrp_sub_char3_Label);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [List]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitList(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.ListPanel = p.beansFactory.createPanel("List");
		// ブロックの項目の初期化
	}

	/**
	 * [SimInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitSimInfo(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.SimInfoPanel = p.beansFactory.createPanel("SimInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltSim]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltSim(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RsltSimPanel = p.beansFactory.createPanel("RsltSim");
		p.RsltSimTitledBorder = p.beansFactory.createTitledBorder();
		p.RsltSimScrollPane = p.beansFactory.createScrollPane("RsltSim.scroll");
		p.createRsltSimTable();
		// ブロックの項目の初期化
		p.columnRsltSim_check = p.beansFactory.createTableColumn("RsltSim.check", MCColumnType.CHECK);
		p.columnRsltSim_sim_mrp_no = p.beansFactory.createTableColumn("RsltSim.sim_mrp_no", MCColumnType.TEXT);
		p.columnRsltSim_wg_cd = p.beansFactory.createTableColumn("RsltSim.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnRsltSim_wg_nm = p.beansFactory.createTableColumn("RsltSim.wg_nm", MCColumnType.TEXT);
		p.columnRsltSim_sim_mrp_typ = p.beansFactory.createTableColumn("RsltSim.sim_mrp_typ", MCColumnType.TEXT_COMBO);
		p.columnRsltSim_sim_mrp_typ_nm = p.beansFactory.createTableColumn("RsltSim.sim_mrp_typ_nm", MCColumnType.TEXT);
		p.columnRsltSim_sim_usr_cd = p.beansFactory.createTableColumn("RsltSim.sim_usr_cd", MCColumnType.TEXT);
		p.columnRsltSim_sim_usr_nm = p.beansFactory.createTableColumn("RsltSim.sim_usr_nm", MCColumnType.TEXT);
		p.columnRsltSim_dly_rqmt_flg = p.beansFactory.createTableColumn("RsltSim.dly_rqmt_flg", MCColumnType.CHECK);
		p.columnRsltSim_stk_flg = p.beansFactory.createTableColumn("RsltSim.stk_flg", MCColumnType.CHECK);
		p.columnRsltSim_gr_flg = p.beansFactory.createTableColumn("RsltSim.gr_flg", MCColumnType.CHECK);
		p.columnRsltSim_gi_flg = p.beansFactory.createTableColumn("RsltSim.gi_flg", MCColumnType.CHECK);
		p.columnRsltSim_ship_flg = p.beansFactory.createTableColumn("RsltSim.ship_flg", MCColumnType.CHECK);
		p.columnRsltSim_tree_lvl = p.beansFactory.createTableColumn("RsltSim.tree_lvl", MCColumnType.NUMBER);
		p.columnRsltSim_mrp_proc_dt = p.beansFactory.createTableColumn("RsltSim.mrp_proc_dt", MCColumnType.DATE);
		p.columnRsltSim_exp_flg = p.beansFactory.createTableColumn("RsltSim.exp_flg", MCColumnType.CHECK);
		p.columnRsltSim_sim_mrp_intr_rmrks = p.beansFactory.createTableColumn("RsltSim.sim_mrp_intr_rmrks", MCColumnType.TEXT);
		p.columnRsltSim_sim_mrp_sub_char1 = p.beansFactory.createTableColumn("RsltSim.sim_mrp_sub_char1", MCColumnType.TEXT);
		p.columnRsltSim_sim_mrp_sub_char2 = p.beansFactory.createTableColumn("RsltSim.sim_mrp_sub_char2", MCColumnType.TEXT);
		p.columnRsltSim_sim_mrp_sub_char3 = p.beansFactory.createTableColumn("RsltSim.sim_mrp_sub_char3", MCColumnType.TEXT);
		p.columnRsltSim_ins_usr_id = p.beansFactory.createTableColumn("RsltSim.ins_usr_id", MCColumnType.TEXT);
		p.columnRsltSim_ins_usr_nm = p.beansFactory.createTableColumn("RsltSim.ins_usr_nm", MCColumnType.TEXT);
		p.columnRsltSim_ins_func_id = p.beansFactory.createTableColumn("RsltSim.ins_func_id", MCColumnType.TEXT);
		p.columnRsltSim_ins_func_nm = p.beansFactory.createTableColumn("RsltSim.ins_func_nm", MCColumnType.TEXT);
		p.columnRsltSim_ins_ts = p.beansFactory.createTableColumn("RsltSim.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRsltSim_upd_usr_id = p.beansFactory.createTableColumn("RsltSim.upd_usr_id", MCColumnType.TEXT);
		p.columnRsltSim_upd_usr_nm = p.beansFactory.createTableColumn("RsltSim.upd_usr_nm", MCColumnType.TEXT);
		p.columnRsltSim_upd_func_id = p.beansFactory.createTableColumn("RsltSim.upd_func_id", MCColumnType.TEXT);
		p.columnRsltSim_upd_func_nm = p.beansFactory.createTableColumn("RsltSim.upd_func_nm", MCColumnType.TEXT);
		p.columnRsltSim_upd_ts = p.beansFactory.createTableColumn("RsltSim.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRsltSim_upd_srv_req_no = p.beansFactory.createTableColumn("RsltSim.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRsltSim_upd_cntr = p.beansFactory.createTableColumn("RsltSim.upd_cntr", MCColumnType.NUMBER);
		p.columnRsltSim_peg_no1 = p.beansFactory.createTableColumn("RsltSim.peg_no1", MCColumnType.NUMBER);
		p.columnRsltSim_data_crud_typ = p.beansFactory.createTableColumn("RsltSim.data_crud_typ", MCColumnType.TEXT);
	}

	/**
	 * [BtnSim]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnSim(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.BtnSimPanel = p.beansFactory.createPanel("BtnSim");
		// ブロックの項目の初期化
		p.BtnSim_open_MSBCP0160 = p.beansFactory.createButton("BtnSim.open_MSBCP0160", "open");
		p.BtnSim_open_MSBCP0170 = p.beansFactory.createButton("BtnSim.open_MSBCP0170", "open");
		p.BtnSim_open_MSBCP0180 = p.beansFactory.createButton("BtnSim.open_MSBCP0180", "open");
		p.BtnSim_open_FSBGP0140 = p.beansFactory.createButton("BtnSim.open_FSBGP0140", "open");
		p.BtnSim_select_all = p.beansFactory.createButton("BtnSim.select_all", "no_border");
		p.BtnSim_deselect_all = p.beansFactory.createButton("BtnSim.deselect_all", "no_border");
		p.BtnSim_radd = p.beansFactory.createButton("BtnSim.radd", "no_border");
		p.BtnSim_rdel = p.beansFactory.createButton("BtnSim.rdel", "no_border");
		p.BtnSim_rcopy = p.beansFactory.createButton("BtnSim.rcopy", "no_border");
	}

	/**
	 * [RqmtInfo]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRqmtInfo(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RqmtInfoPanel = p.beansFactory.createPanel("RqmtInfo");
		// ブロックの項目の初期化
	}

	/**
	 * [RsltRqmt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRsltRqmt(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RsltRqmtPanel = p.beansFactory.createPanel("RsltRqmt");
		p.RsltRqmtTitledBorder = p.beansFactory.createTitledBorder();
		p.RsltRqmtScrollPane = p.beansFactory.createScrollPane("RsltRqmt.scroll");
		p.createRsltRqmtTable();
		// ブロックの項目の初期化
		p.columnRsltRqmt_check = p.beansFactory.createTableColumn("RsltRqmt.check", MCColumnType.CHECK);
		p.columnRsltRqmt_sno_sprt_flg = p.beansFactory.createTableColumn("RsltRqmt.sno_sprt_flg", MCColumnType.CHECK);
		p.columnRsltRqmt_rqmt_no = p.beansFactory.createTableColumn("RsltRqmt.rqmt_no", MCColumnType.TEXT);
		p.columnRsltRqmt_sim_mrp_no = p.beansFactory.createTableColumn("RsltRqmt.sim_mrp_no", MCColumnType.TEXT);
		p.columnRsltRqmt_due_dt = p.beansFactory.createTableColumn("RsltRqmt.due_dt", MCColumnType.DATE);
		p.columnRsltRqmt_strg_loc_cd = p.beansFactory.createTableColumn("RsltRqmt.strg_loc_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_strg_loc_nm = p.beansFactory.createTableColumn("RsltRqmt.strg_loc_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_site_cd = p.beansFactory.createTableColumn("RsltRqmt.site_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_site_nm = p.beansFactory.createTableColumn("RsltRqmt.site_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_wg_cd = p.beansFactory.createTableColumn("RsltRqmt.wg_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_wg_nm = p.beansFactory.createTableColumn("RsltRqmt.wg_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_strg_loc_grp_cd = p.beansFactory.createTableColumn("RsltRqmt.strg_loc_grp_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_strg_loc_grp_nm = p.beansFactory.createTableColumn("RsltRqmt.strg_loc_grp_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_unit_cd = p.beansFactory.createTableColumn("RsltRqmt.unit_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_unit_nm = p.beansFactory.createTableColumn("RsltRqmt.unit_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_dec_place = p.beansFactory.createTableColumn("RsltRqmt.dec_place", MCColumnType.NUMBER);
		p.columnRsltRqmt_mfg_loc_cd = p.beansFactory.createTableColumn("RsltRqmt.mfg_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRsltRqmt_mfg_loc_nm = p.beansFactory.createTableColumn("RsltRqmt.mfg_loc_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_sppl_cd = p.beansFactory.createTableColumn("RsltRqmt.sppl_cd", MCColumnType.TEXT_COMBO);
		p.columnRsltRqmt_sppl_nm = p.beansFactory.createTableColumn("RsltRqmt.sppl_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_rqst_loc_cd = p.beansFactory.createTableColumn("RsltRqmt.rqst_loc_cd", MCColumnType.TEXT_COMBO);
		p.columnRsltRqmt_rqst_loc_nm = p.beansFactory.createTableColumn("RsltRqmt.rqst_loc_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_rqst_wg_cd = p.beansFactory.createTableColumn("RsltRqmt.rqst_wg_cd", MCColumnType.TEXT);
		p.columnRsltRqmt_rqst_wg_nm = p.beansFactory.createTableColumn("RsltRqmt.rqst_wg_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_sno1_mng_typ = p.beansFactory.createTableColumn("RsltRqmt.sno1_mng_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno2_mng_typ = p.beansFactory.createTableColumn("RsltRqmt.sno2_mng_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno3_mng_typ = p.beansFactory.createTableColumn("RsltRqmt.sno3_mng_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno4_mng_typ = p.beansFactory.createTableColumn("RsltRqmt.sno4_mng_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno1_num_typ = p.beansFactory.createTableColumn("RsltRqmt.sno1_num_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno2_num_typ = p.beansFactory.createTableColumn("RsltRqmt.sno2_num_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno3_num_typ = p.beansFactory.createTableColumn("RsltRqmt.sno3_num_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_sno4_num_typ = p.beansFactory.createTableColumn("RsltRqmt.sno4_num_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_rqmt_sno1_flg = p.beansFactory.createTableColumn("RsltRqmt.rqmt_sno1_flg", MCColumnType.CHECK);
		p.columnRsltRqmt_rqmt_sno2_flg = p.beansFactory.createTableColumn("RsltRqmt.rqmt_sno2_flg", MCColumnType.CHECK);
		p.columnRsltRqmt_rqmt_sno3_flg = p.beansFactory.createTableColumn("RsltRqmt.rqmt_sno3_flg", MCColumnType.CHECK);
		p.columnRsltRqmt_rqmt_sno4_flg = p.beansFactory.createTableColumn("RsltRqmt.rqmt_sno4_flg", MCColumnType.CHECK);
		p.columnRsltRqmt_rqmt_typ = p.beansFactory.createTableColumn("RsltRqmt.rqmt_typ", MCColumnType.TEXT_COMBO);
		p.columnRsltRqmt_rqmt_typ_nm = p.beansFactory.createTableColumn("RsltRqmt.rqmt_typ_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_intr_rmrks = p.beansFactory.createTableColumn("RsltRqmt.intr_rmrks", MCColumnType.TEXT);
		p.columnRsltRqmt_sub_char1 = p.beansFactory.createTableColumn("RsltRqmt.sub_char1", MCColumnType.TEXT);
		p.columnRsltRqmt_sub_char2 = p.beansFactory.createTableColumn("RsltRqmt.sub_char2", MCColumnType.TEXT);
		p.columnRsltRqmt_sub_char3 = p.beansFactory.createTableColumn("RsltRqmt.sub_char3", MCColumnType.TEXT);
		p.columnRsltRqmt_ins_usr_id = p.beansFactory.createTableColumn("RsltRqmt.ins_usr_id", MCColumnType.TEXT);
		p.columnRsltRqmt_ins_usr_nm = p.beansFactory.createTableColumn("RsltRqmt.ins_usr_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_ins_func_id = p.beansFactory.createTableColumn("RsltRqmt.ins_func_id", MCColumnType.TEXT);
		p.columnRsltRqmt_ins_func_nm = p.beansFactory.createTableColumn("RsltRqmt.ins_func_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_ins_ts = p.beansFactory.createTableColumn("RsltRqmt.ins_ts", MCColumnType.TIMESTAMP);
		p.columnRsltRqmt_upd_usr_id = p.beansFactory.createTableColumn("RsltRqmt.upd_usr_id", MCColumnType.TEXT);
		p.columnRsltRqmt_upd_usr_nm = p.beansFactory.createTableColumn("RsltRqmt.upd_usr_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_upd_func_id = p.beansFactory.createTableColumn("RsltRqmt.upd_func_id", MCColumnType.TEXT);
		p.columnRsltRqmt_upd_func_nm = p.beansFactory.createTableColumn("RsltRqmt.upd_func_nm", MCColumnType.TEXT);
		p.columnRsltRqmt_upd_ts = p.beansFactory.createTableColumn("RsltRqmt.upd_ts", MCColumnType.TIMESTAMP);
		p.columnRsltRqmt_upd_srv_req_no = p.beansFactory.createTableColumn("RsltRqmt.upd_srv_req_no", MCColumnType.TEXT);
		p.columnRsltRqmt_upd_cntr = p.beansFactory.createTableColumn("RsltRqmt.upd_cntr", MCColumnType.NUMBER);
		p.columnRsltRqmt_peg_no1 = p.beansFactory.createTableColumn("RsltRqmt.peg_no1", MCColumnType.NUMBER);
		p.columnRsltRqmt_peg_no2 = p.beansFactory.createTableColumn("RsltRqmt.peg_no2", MCColumnType.NUMBER);
		p.columnRsltRqmt_data_crud_typ = p.beansFactory.createTableColumn("RsltRqmt.data_crud_typ", MCColumnType.TEXT);
		p.columnRsltRqmt_un_editable_flg = p.beansFactory.createTableColumn("RsltRqmt.un_editable_flg", MCColumnType.CHECK);
	}

	/**
	 * [BtnRqmt]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtnRqmt(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.BtnRqmtPanel = p.beansFactory.createPanel("BtnRqmt");
		// ブロックの項目の初期化
		p.BtnRqmt_open_MSBCP0190 = p.beansFactory.createButton("BtnRqmt.open_MSBCP0190", "open");
		p.BtnRqmt_label_sno = p.beansFactory.createLabel("BtnRqmt.label_sno");
		p.BtnRqmt_sno_select_all = p.beansFactory.createButton("BtnRqmt.sno_select_all", "no_border");
		p.BtnRqmt_sno_deselect_all = p.beansFactory.createButton("BtnRqmt.sno_deselect_all", "no_border");
		p.BtnRqmt_sprt_sno = p.beansFactory.createButton("BtnRqmt.sprt_sno");
		p.BtnRqmt_select_all = p.beansFactory.createButton("BtnRqmt.select_all", "no_border");
		p.BtnRqmt_deselect_all = p.beansFactory.createButton("BtnRqmt.deselect_all", "no_border");
		p.BtnRqmt_radd = p.beansFactory.createButton("BtnRqmt.radd", "no_border");
		p.BtnRqmt_rdel = p.beansFactory.createButton("BtnRqmt.rdel", "no_border");
		p.BtnRqmt_rcopy = p.beansFactory.createButton("BtnRqmt.rcopy", "no_border");
		p.BtnRqmt_upd = p.beansFactory.createButton("BtnRqmt.upd", "upd");
		p.BtnRqmt_upd02 = p.beansFactory.createButton("BtnRqmt.upd02", "upd");
		p.BtnRqmt_del = p.beansFactory.createButton("BtnRqmt.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MSBCP_SimRqmtReg p) {
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
	protected static void jbInitTop(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.ListPanel);
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
	protected static void jbInitFold(MSBCP_SimRqmtReg p) {
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
	protected static void jbInitCnd(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("2");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setNextBeans(p.Cnd_ope_INT);
		p.Cnd_ope_INT.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_INT);
		p.ScreenOpePanel.add(p.Cnd_ope_INT);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.ope_META);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.CndPanel.setLastBeans(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_sim_usr_cd);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.CndPanel.add(p.Cnd_sim_usr_cd_Label);
		p.CndPanel.add(p.Cnd_sim_usr_cd);
		p.Cnd_sim_usr_cd.setNextBeans(p.Cnd_sim_usr_nm);
		p.Cnd_sim_usr_cd.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_usr_cd_META);
		p.Cnd_sim_usr_cd.addLinkBeans(p.Cnd_sim_usr_nm);
		p.Cnd_sim_usr_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sim_usr_cd, true);
		p.CndPanel.add(p.Cnd_sim_usr_nm);
		p.Cnd_sim_usr_nm.setNextBeans(p.Cnd_mrp_proc_dt_from);
		p.Cnd_sim_usr_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_usr_nm_META);
		p.setPluralValueEnable(p.Cnd_sim_usr_nm, true);
		p.CndPanel.add(p.Cnd_mrp_proc_dt_from_Label);
		p.CndPanel.add(p.Cnd_mrp_proc_dt_from);
		p.Cnd_mrp_proc_dt_from.setNextBeans(p.Cnd_mrp_proc_dt_to);
		p.Cnd_mrp_proc_dt_from.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.mrp_proc_dt_from_META);
		p.Cnd_mrp_proc_dt_from.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_mrp_proc_dt_to_Label);
		p.CndPanel.add(p.Cnd_mrp_proc_dt_to);
		p.Cnd_mrp_proc_dt_to.setNextBeans(p.Cnd_sim_mrp_no);
		p.Cnd_mrp_proc_dt_to.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.mrp_proc_dt_to_META);
		p.Cnd_mrp_proc_dt_to.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.CndPanel.add(p.Cnd_sim_mrp_no_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_no);
		p.Cnd_sim_mrp_no.setNextBeans(p.Cnd_sim_mrp_typ);
		p.Cnd_sim_mrp_no.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_no_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_no, true);
		p.Cnd_sim_mrp_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sim_mrp_typ, true);
		p.Cnd_sim_mrp_typ.setLinkBeans(p.Cnd_sim_mrp_typ_nm);
		p.CndPanel.add(p.Cnd_sim_mrp_typ_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_typ);
		p.Cnd_sim_mrp_typ.setNextBeans(p.Cnd_sim_mrp_typ_nm);
		p.Cnd_sim_mrp_typ.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_typ_META);
		p.CndPanel.add(p.Cnd_sim_mrp_typ_nm);
		p.Cnd_sim_mrp_typ_nm.setNextBeans(p.Cnd_sim_mrp_intr_rmrks);
		p.Cnd_sim_mrp_typ_nm.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_typ_nm_META);
		p.CndPanel.add(p.Cnd_sim_mrp_intr_rmrks_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_intr_rmrks);
		p.Cnd_sim_mrp_intr_rmrks.setNextBeans(p.Cnd_sim_mrp_sub_char1);
		p.Cnd_sim_mrp_intr_rmrks.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_intr_rmrks_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_intr_rmrks, true);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char1_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char1);
		p.Cnd_sim_mrp_sub_char1.setNextBeans(p.Cnd_sim_mrp_sub_char2);
		p.Cnd_sim_mrp_sub_char1.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_sub_char1_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_sub_char1, true);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char2_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char2);
		p.Cnd_sim_mrp_sub_char2.setNextBeans(p.Cnd_sim_mrp_sub_char3);
		p.Cnd_sim_mrp_sub_char2.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_sub_char2_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_sub_char2, true);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char3_Label);
		p.CndPanel.add(p.Cnd_sim_mrp_sub_char3);
		p.Cnd_sim_mrp_sub_char3.setRow(p.getCndR(), mcframe.clientMSBC.MSBCP0150.CndR.sim_mrp_sub_char3_META);
		p.setPluralValueEnable(p.Cnd_sim_mrp_sub_char3, true);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("SC");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [List]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitList(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.add(p.ListPanel);
		p.ListPanel.setNextBeans(p.BtnRqmtPanel);
		p.ListPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.ListPanel.add(p.SimInfoPanel, null);
		p.ListPanel.setLastBeans(p.SimInfoPanel);
		p.SimInfoPanel.setNextBeans(p.RqmtInfoPanel);
		p.ListPanel.add(p.RqmtInfoPanel, null);
	}

	/**
	 * [SimInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitSimInfo(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.SimInfoPanel.setLayoutPosition("CT+");
		// ブロックの項目の初期化
		p.SimInfoPanel.add(p.RsltSimPanel, null);
		p.SimInfoPanel.setLastBeans(p.RsltSimPanel);
		p.RsltSimPanel.setNextBeans(p.BtnSimPanel);
		p.SimInfoPanel.add(p.BtnSimPanel, null);
	}

	/**
	 * [RsltSim]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltSim(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RsltSimPanel.setBorder(p.RsltSimTitledBorder);
		p.RsltSimPanel.add(p.RsltSimScrollPane);
		p.RsltSimPanel.setLastBeans(p.RsltSimTable);
		p.RsltSimScrollPane.setViewportView(p.RsltSimTable);
		p.RsltSimTable.setList(p.getRsltSimL());
		p.RsltSimPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnSim]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnSim(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.BtnSimPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.BtnSim_open_MSBCP0160.setFunctionKey(MCFunctionKey.F3);
		p.BtnSimPanel.add(p.BtnSim_open_MSBCP0160);
		p.BtnSimPanel.setLastBeans(p.BtnSim_open_MSBCP0160);
		p.BtnSim_open_MSBCP0160.setNextBeans(p.BtnSim_open_MSBCP0170);
		p.BtnSimPanel.add(p.BtnSim_open_MSBCP0170);
		p.BtnSim_open_MSBCP0170.setNextBeans(p.BtnSim_open_MSBCP0180);
		p.BtnSimPanel.add(p.BtnSim_open_MSBCP0180);
		p.BtnSim_open_MSBCP0180.setNextBeans(p.BtnSim_open_FSBGP0140);
		p.BtnSimPanel.add(p.BtnSim_open_FSBGP0140);
		p.BtnSim_open_FSBGP0140.setNextBeans(p.BtnSim_select_all);
		p.BtnSim_select_all.setIcon("SELECT_ALL");
		p.BtnSim_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnSimPanel.add(p.BtnSim_select_all);
		p.BtnSim_select_all.setNextBeans(p.BtnSim_deselect_all);
		p.BtnSim_deselect_all.setIcon("DESELECT_ALL");
		p.BtnSim_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnSimPanel.add(p.BtnSim_deselect_all);
		p.BtnSim_deselect_all.setNextBeans(p.BtnSim_radd);
		p.BtnSim_radd.setIcon("INSERT_RECORD");
		p.BtnSim_radd.setFunctionKey(MCFunctionKey.F5);
		p.BtnSimPanel.add(p.BtnSim_radd);
		p.BtnSim_radd.setNextBeans(p.BtnSim_rdel);
		p.BtnSim_rdel.setIcon("DELETE_RECORD");
		p.BtnSim_rdel.setFunctionKey(MCFunctionKey.F6);
		p.BtnSimPanel.add(p.BtnSim_rdel);
		p.BtnSim_rdel.setNextBeans(p.BtnSim_rcopy);
		p.BtnSim_rcopy.setIcon("COPY_RECORD");
		p.BtnSim_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.BtnSimPanel.add(p.BtnSim_rcopy);
	}

	/**
	 * [RqmtInfo]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRqmtInfo(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RqmtInfoPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.RqmtInfoPanel.add(p.RsltRqmtPanel, null);
		p.RqmtInfoPanel.setLastBeans(p.RsltRqmtPanel);
	}

	/**
	 * [RsltRqmt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRsltRqmt(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.RsltRqmtPanel.setBorder(p.RsltRqmtTitledBorder);
		p.RsltRqmtPanel.add(p.RsltRqmtScrollPane);
		p.RsltRqmtPanel.setLastBeans(p.RsltRqmtTable);
		p.RsltRqmtScrollPane.setViewportView(p.RsltRqmtTable);
		p.RsltRqmtTable.setList(p.getRsltRqmtL());
		p.RsltRqmtPanel.setLayoutPosition("CBC");
		// ブロックの項目の初期化
	}

	/**
	 * [BtnRqmt]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtnRqmt(MSBCP_SimRqmtReg p) {
		// ブロック関連の初期化
		p.add(p.BtnRqmtPanel);
		p.BtnRqmtPanel.setNextBeans(p.EastBtnPanel);
		p.BtnRqmtPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.BtnRqmt_open_MSBCP0190.setFunctionKey(MCFunctionKey.F4);
		p.BtnRqmtPanel.add(p.BtnRqmt_open_MSBCP0190);
		p.BtnRqmtPanel.setLastBeans(p.BtnRqmt_open_MSBCP0190);
		p.BtnRqmt_open_MSBCP0190.setNextBeans(p.BtnRqmt_sno_select_all);
		p.BtnRqmtPanel.add(p.BtnRqmt_label_sno);
		p.BtnRqmt_sno_select_all.setIcon("SELECT_ALL");
		p.BtnRqmt_sno_select_all.setFunctionKey(MCFunctionKey.F7);
		p.BtnRqmtPanel.add(p.BtnRqmt_sno_select_all);
		p.BtnRqmt_sno_select_all.setNextBeans(p.BtnRqmt_sno_deselect_all);
		p.BtnRqmt_sno_deselect_all.setIcon("DESELECT_ALL");
		p.BtnRqmt_sno_deselect_all.setFunctionKey(MCFunctionKey.F8);
		p.BtnRqmtPanel.add(p.BtnRqmt_sno_deselect_all);
		p.BtnRqmt_sno_deselect_all.setNextBeans(p.BtnRqmt_sprt_sno);
		p.BtnRqmt_sprt_sno.setFunctionKey(MCFunctionKey.F23);
		p.BtnRqmtPanel.add(p.BtnRqmt_sprt_sno);
		p.BtnRqmt_sprt_sno.setNextBeans(p.BtnRqmt_select_all);
		p.BtnRqmt_select_all.setIcon("SELECT_ALL");
		p.BtnRqmt_select_all.setFunctionKey(MCFunctionKey.F15);
		p.BtnRqmtPanel.add(p.BtnRqmt_select_all);
		p.BtnRqmt_select_all.setNextBeans(p.BtnRqmt_deselect_all);
		p.BtnRqmt_deselect_all.setIcon("DESELECT_ALL");
		p.BtnRqmt_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.BtnRqmtPanel.add(p.BtnRqmt_deselect_all);
		p.BtnRqmt_deselect_all.setNextBeans(p.BtnRqmt_radd);
		p.BtnRqmt_radd.setIcon("INSERT_RECORD");
		p.BtnRqmt_radd.setFunctionKey(MCFunctionKey.F18);
		p.BtnRqmtPanel.add(p.BtnRqmt_radd);
		p.BtnRqmt_radd.setNextBeans(p.BtnRqmt_rdel);
		p.BtnRqmt_rdel.setIcon("DELETE_RECORD");
		p.BtnRqmt_rdel.setFunctionKey(MCFunctionKey.F19);
		p.BtnRqmtPanel.add(p.BtnRqmt_rdel);
		p.BtnRqmt_rdel.setNextBeans(p.BtnRqmt_rcopy);
		p.BtnRqmt_rcopy.setIcon("COPY_RECORD");
		p.BtnRqmt_rcopy.setFunctionKey(MCFunctionKey.F20);
		p.BtnRqmtPanel.add(p.BtnRqmt_rcopy);
		p.BtnRqmt_rcopy.setNextBeans(p.BtnRqmt_upd);
		p.BtnRqmt_upd.setIcon("REGISTER");
		p.BtnRqmt_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnRqmtPanel.add(p.BtnRqmt_upd);
		p.BtnRqmt_upd.setNextBeans(p.BtnRqmt_upd02);
		p.BtnRqmt_upd02.setIcon("REGISTER");
		p.BtnRqmt_upd02.setFunctionKey(MCFunctionKey.F9);
		p.BtnRqmtPanel.add(p.BtnRqmt_upd02);
		p.BtnRqmt_del.setIcon("CANCEL");
		p.BtnRqmt_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.BtnRqmt_del);
		p.EastBtnPanel.add(p.BtnRqmt_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MSBCP_SimRqmtReg p) {
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
		MSBCP_SimRqmtReg_MC.mcInitScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitTop((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitFold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitCnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitCtrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitList((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitSimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitRsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitBtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitRqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitRsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitBtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.mcInitEastBtn((MSBCP_SimRqmtReg)this);

		// [UPD_HDR]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__HDR_EastBtn((MSBCP_SimRqmtReg)this);

		// [UPD_DTL]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__DTL_EastBtn((MSBCP_SimRqmtReg)this);

		// [UPD_FIX]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitUPD__FIX_EastBtn((MSBCP_SimRqmtReg)this);

		// [REF]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitREF_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitREF_EastBtn((MSBCP_SimRqmtReg)this);

		// [SRCH_DEL]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__DEL_EastBtn((MSBCP_SimRqmtReg)this);

		// [DEL]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitDEL_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitDEL_EastBtn((MSBCP_SimRqmtReg)this);

		// [SRCH_INST]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitSRCH__INST_EastBtn((MSBCP_SimRqmtReg)this);

		// [INST]ステータスのモードの設定
		MSBCP_SimRqmtReg_MC.statusInitINST_ScreenOpe((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_Top((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_Fold((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_Cnd((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_Ctrl((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_List((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_SimInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_RsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_BtnSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_RqmtInfo((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_RsltRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_BtnRqmt((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.statusInitINST_EastBtn((MSBCP_SimRqmtReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MSBCP_SimRqmtReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_ope_INT.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_sim_usr_cd.setListListener(p);
		p.Cnd_sim_usr_cd.addAllListener(p);
		p.Cnd_sim_usr_nm.setListListener(p);
		p.Cnd_sim_usr_nm.addAllListener(p);
		p.Cnd_mrp_proc_dt_from.setListListener(p);
		p.Cnd_mrp_proc_dt_from.addAllListener(p);
		p.Cnd_mrp_proc_dt_to.setListListener(p);
		p.Cnd_mrp_proc_dt_to.addAllListener(p);
		p.Cnd_sim_mrp_no.setListListener(p);
		p.Cnd_sim_mrp_no.addAllListener(p);
		p.Cnd_sim_mrp_typ.setListListener(p);
		p.Cnd_sim_mrp_typ.addAllListener(p);
		p.Cnd_sim_mrp_typ_nm.setListListener(p);
		p.Cnd_sim_mrp_typ_nm.addAllListener(p);
		p.Cnd_sim_mrp_intr_rmrks.setListListener(p);
		p.Cnd_sim_mrp_intr_rmrks.addAllListener(p);
		p.Cnd_sim_mrp_sub_char1.setListListener(p);
		p.Cnd_sim_mrp_sub_char1.addAllListener(p);
		p.Cnd_sim_mrp_sub_char2.setListListener(p);
		p.Cnd_sim_mrp_sub_char2.addAllListener(p);
		p.Cnd_sim_mrp_sub_char3.setListListener(p);
		p.Cnd_sim_mrp_sub_char3.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MSBCP_SimRqmtReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [List]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitList(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [SimInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitSimInfo(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [RsltSim]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltSim(MSBCP_SimRqmtReg p) {
		p.RsltSimTable.addAllListener(p);
		p.columnRsltSim_check.addAllListener(p);
		p.columnRsltSim_sim_mrp_no.addAllListener(p);
		p.columnRsltSim_sim_mrp_no.setListListener(p);
		p.columnRsltSim_wg_cd.addAllListener(p);
		p.columnRsltSim_wg_cd.setListListener(p);
		p.columnRsltSim_wg_nm.addAllListener(p);
		p.columnRsltSim_wg_nm.setListListener(p);
		p.columnRsltSim_sim_mrp_typ.addAllListener(p);
		p.columnRsltSim_sim_mrp_typ.setListListener(p);
		p.columnRsltSim_sim_mrp_typ_nm.addAllListener(p);
		p.columnRsltSim_sim_mrp_typ_nm.setListListener(p);
		p.columnRsltSim_sim_usr_cd.addAllListener(p);
		p.columnRsltSim_sim_usr_cd.setListListener(p);
		p.columnRsltSim_sim_usr_nm.addAllListener(p);
		p.columnRsltSim_sim_usr_nm.setListListener(p);
		p.columnRsltSim_dly_rqmt_flg.addAllListener(p);
		p.columnRsltSim_stk_flg.addAllListener(p);
		p.columnRsltSim_gr_flg.addAllListener(p);
		p.columnRsltSim_gi_flg.addAllListener(p);
		p.columnRsltSim_ship_flg.addAllListener(p);
		p.columnRsltSim_tree_lvl.addAllListener(p);
		p.columnRsltSim_tree_lvl.setListListener(p);
		p.columnRsltSim_mrp_proc_dt.addAllListener(p);
		p.columnRsltSim_mrp_proc_dt.setListListener(p);
		p.columnRsltSim_exp_flg.addAllListener(p);
		p.columnRsltSim_sim_mrp_intr_rmrks.addAllListener(p);
		p.columnRsltSim_sim_mrp_intr_rmrks.setListListener(p);
		p.columnRsltSim_sim_mrp_sub_char1.addAllListener(p);
		p.columnRsltSim_sim_mrp_sub_char1.setListListener(p);
		p.columnRsltSim_sim_mrp_sub_char2.addAllListener(p);
		p.columnRsltSim_sim_mrp_sub_char2.setListListener(p);
		p.columnRsltSim_sim_mrp_sub_char3.addAllListener(p);
		p.columnRsltSim_sim_mrp_sub_char3.setListListener(p);
		p.columnRsltSim_ins_usr_id.addAllListener(p);
		p.columnRsltSim_ins_usr_id.setListListener(p);
		p.columnRsltSim_ins_usr_nm.addAllListener(p);
		p.columnRsltSim_ins_usr_nm.setListListener(p);
		p.columnRsltSim_ins_func_id.addAllListener(p);
		p.columnRsltSim_ins_func_id.setListListener(p);
		p.columnRsltSim_ins_func_nm.addAllListener(p);
		p.columnRsltSim_ins_func_nm.setListListener(p);
		p.columnRsltSim_ins_ts.addAllListener(p);
		p.columnRsltSim_ins_ts.setListListener(p);
		p.columnRsltSim_upd_usr_id.addAllListener(p);
		p.columnRsltSim_upd_usr_id.setListListener(p);
		p.columnRsltSim_upd_usr_nm.addAllListener(p);
		p.columnRsltSim_upd_usr_nm.setListListener(p);
		p.columnRsltSim_upd_func_id.addAllListener(p);
		p.columnRsltSim_upd_func_id.setListListener(p);
		p.columnRsltSim_upd_func_nm.addAllListener(p);
		p.columnRsltSim_upd_func_nm.setListListener(p);
		p.columnRsltSim_upd_ts.addAllListener(p);
		p.columnRsltSim_upd_ts.setListListener(p);
		p.columnRsltSim_upd_srv_req_no.addAllListener(p);
		p.columnRsltSim_upd_srv_req_no.setListListener(p);
		p.columnRsltSim_upd_cntr.addAllListener(p);
		p.columnRsltSim_upd_cntr.setListListener(p);
		p.columnRsltSim_peg_no1.addAllListener(p);
		p.columnRsltSim_peg_no1.setListListener(p);
		p.columnRsltSim_data_crud_typ.addAllListener(p);
		p.columnRsltSim_data_crud_typ.setListListener(p);
	}

	/**
	 *  [BtnSim]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnSim(MSBCP_SimRqmtReg p) {
		p.BtnSim_open_MSBCP0160.addAllListener(p);
		p.BtnSim_open_MSBCP0160.setAPMethodName("doBtnSim_open_MSBCP0160");
		p.BtnSim_open_MSBCP0170.addAllListener(p);
		p.BtnSim_open_MSBCP0170.setAPMethodName("doBtnSim_open_MSBCP0170");
		p.BtnSim_open_MSBCP0180.addAllListener(p);
		p.BtnSim_open_MSBCP0180.setAPMethodName("doBtnSim_open_MSBCP0180");
		p.BtnSim_open_FSBGP0140.addAllListener(p);
		p.BtnSim_open_FSBGP0140.setAPMethodName("doBtnSim_open_FSBGP0140");
		p.BtnSim_select_all.addAllListener(p);
		p.BtnSim_select_all.setAPMethodName("doBtnSim_select_all");
		p.BtnSim_deselect_all.addAllListener(p);
		p.BtnSim_deselect_all.setAPMethodName("doBtnSim_deselect_all");
		p.BtnSim_radd.addAllListener(p);
		p.BtnSim_radd.setAPMethodName("doBtnSim_radd");
		p.BtnSim_rdel.addAllListener(p);
		p.BtnSim_rdel.setAPMethodName("doBtnSim_rdel");
		p.BtnSim_rcopy.addAllListener(p);
		p.BtnSim_rcopy.setAPMethodName("doBtnSim_rcopy");
	}

	/**
	 *  [RqmtInfo]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRqmtInfo(MSBCP_SimRqmtReg p) {
	}

	/**
	 *  [RsltRqmt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRsltRqmt(MSBCP_SimRqmtReg p) {
		p.RsltRqmtTable.addAllListener(p);
		p.columnRsltRqmt_check.addAllListener(p);
		p.columnRsltRqmt_sno_sprt_flg.addAllListener(p);
		p.columnRsltRqmt_rqmt_no.addAllListener(p);
		p.columnRsltRqmt_rqmt_no.setListListener(p);
		p.columnRsltRqmt_sim_mrp_no.addAllListener(p);
		p.columnRsltRqmt_sim_mrp_no.setListListener(p);
		p.columnRsltRqmt_due_dt.addAllListener(p);
		p.columnRsltRqmt_due_dt.setListListener(p);
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnRsltRqmt_strg_loc_cd.addAllListener(p);
		p.columnRsltRqmt_strg_loc_cd.setListListener(p);
		p.columnRsltRqmt_strg_loc_nm.addAllListener(p);
		p.columnRsltRqmt_strg_loc_nm.setListListener(p);
		p.columnRsltRqmt_site_cd.addAllListener(p);
		p.columnRsltRqmt_site_cd.setListListener(p);
		p.columnRsltRqmt_site_nm.addAllListener(p);
		p.columnRsltRqmt_site_nm.setListListener(p);
		p.columnRsltRqmt_wg_cd.addAllListener(p);
		p.columnRsltRqmt_wg_cd.setListListener(p);
		p.columnRsltRqmt_wg_nm.addAllListener(p);
		p.columnRsltRqmt_wg_nm.setListListener(p);
		p.columnRsltRqmt_strg_loc_grp_cd.addAllListener(p);
		p.columnRsltRqmt_strg_loc_grp_cd.setListListener(p);
		p.columnRsltRqmt_strg_loc_grp_nm.addAllListener(p);
		p.columnRsltRqmt_strg_loc_grp_nm.setListListener(p);
		p.columnRsltRqmt_unit_cd.addAllListener(p);
		p.columnRsltRqmt_unit_cd.setListListener(p);
		p.columnRsltRqmt_unit_nm.addAllListener(p);
		p.columnRsltRqmt_unit_nm.setListListener(p);
		p.columnRsltRqmt_dec_place.addAllListener(p);
		p.columnRsltRqmt_dec_place.setListListener(p);
		p.columnRsltRqmt_mfg_loc_cd.addAllListener(p);
		p.columnRsltRqmt_mfg_loc_cd.setListListener(p);
		p.columnRsltRqmt_mfg_loc_nm.addAllListener(p);
		p.columnRsltRqmt_mfg_loc_nm.setListListener(p);
		p.columnRsltRqmt_sppl_cd.addAllListener(p);
		p.columnRsltRqmt_sppl_cd.setListListener(p);
		p.columnRsltRqmt_sppl_nm.addAllListener(p);
		p.columnRsltRqmt_sppl_nm.setListListener(p);
		p.columnRsltRqmt_rqst_loc_cd.addAllListener(p);
		p.columnRsltRqmt_rqst_loc_cd.setListListener(p);
		p.columnRsltRqmt_rqst_loc_nm.addAllListener(p);
		p.columnRsltRqmt_rqst_loc_nm.setListListener(p);
		p.columnRsltRqmt_rqst_wg_cd.addAllListener(p);
		p.columnRsltRqmt_rqst_wg_cd.setListListener(p);
		p.columnRsltRqmt_rqst_wg_nm.addAllListener(p);
		p.columnRsltRqmt_rqst_wg_nm.setListListener(p);
		p.columnRsltRqmt_sno1_mng_typ.addAllListener(p);
		p.columnRsltRqmt_sno1_mng_typ.setListListener(p);
		p.columnRsltRqmt_sno2_mng_typ.addAllListener(p);
		p.columnRsltRqmt_sno2_mng_typ.setListListener(p);
		p.columnRsltRqmt_sno3_mng_typ.addAllListener(p);
		p.columnRsltRqmt_sno3_mng_typ.setListListener(p);
		p.columnRsltRqmt_sno4_mng_typ.addAllListener(p);
		p.columnRsltRqmt_sno4_mng_typ.setListListener(p);
		p.columnRsltRqmt_sno1_num_typ.addAllListener(p);
		p.columnRsltRqmt_sno1_num_typ.setListListener(p);
		p.columnRsltRqmt_sno2_num_typ.addAllListener(p);
		p.columnRsltRqmt_sno2_num_typ.setListListener(p);
		p.columnRsltRqmt_sno3_num_typ.addAllListener(p);
		p.columnRsltRqmt_sno3_num_typ.setListListener(p);
		p.columnRsltRqmt_sno4_num_typ.addAllListener(p);
		p.columnRsltRqmt_sno4_num_typ.setListListener(p);
		p.columnRsltRqmt_rqmt_sno1_flg.addAllListener(p);
		p.columnRsltRqmt_rqmt_sno2_flg.addAllListener(p);
		p.columnRsltRqmt_rqmt_sno3_flg.addAllListener(p);
		p.columnRsltRqmt_rqmt_sno4_flg.addAllListener(p);
		p.columnRsltRqmt_rqmt_typ.addAllListener(p);
		p.columnRsltRqmt_rqmt_typ.setListListener(p);
		p.columnRsltRqmt_rqmt_typ_nm.addAllListener(p);
		p.columnRsltRqmt_rqmt_typ_nm.setListListener(p);
		p.columnRsltRqmt_intr_rmrks.addAllListener(p);
		p.columnRsltRqmt_intr_rmrks.setListListener(p);
		p.columnRsltRqmt_sub_char1.addAllListener(p);
		p.columnRsltRqmt_sub_char1.setListListener(p);
		p.columnRsltRqmt_sub_char2.addAllListener(p);
		p.columnRsltRqmt_sub_char2.setListListener(p);
		p.columnRsltRqmt_sub_char3.addAllListener(p);
		p.columnRsltRqmt_sub_char3.setListListener(p);
		p.columnRsltRqmt_ins_usr_id.addAllListener(p);
		p.columnRsltRqmt_ins_usr_id.setListListener(p);
		p.columnRsltRqmt_ins_usr_nm.addAllListener(p);
		p.columnRsltRqmt_ins_usr_nm.setListListener(p);
		p.columnRsltRqmt_ins_func_id.addAllListener(p);
		p.columnRsltRqmt_ins_func_id.setListListener(p);
		p.columnRsltRqmt_ins_func_nm.addAllListener(p);
		p.columnRsltRqmt_ins_func_nm.setListListener(p);
		p.columnRsltRqmt_ins_ts.addAllListener(p);
		p.columnRsltRqmt_ins_ts.setListListener(p);
		p.columnRsltRqmt_upd_usr_id.addAllListener(p);
		p.columnRsltRqmt_upd_usr_id.setListListener(p);
		p.columnRsltRqmt_upd_usr_nm.addAllListener(p);
		p.columnRsltRqmt_upd_usr_nm.setListListener(p);
		p.columnRsltRqmt_upd_func_id.addAllListener(p);
		p.columnRsltRqmt_upd_func_id.setListListener(p);
		p.columnRsltRqmt_upd_func_nm.addAllListener(p);
		p.columnRsltRqmt_upd_func_nm.setListListener(p);
		p.columnRsltRqmt_upd_ts.addAllListener(p);
		p.columnRsltRqmt_upd_ts.setListListener(p);
		p.columnRsltRqmt_upd_srv_req_no.addAllListener(p);
		p.columnRsltRqmt_upd_srv_req_no.setListListener(p);
		p.columnRsltRqmt_upd_cntr.addAllListener(p);
		p.columnRsltRqmt_upd_cntr.setListListener(p);
		p.columnRsltRqmt_peg_no1.addAllListener(p);
		p.columnRsltRqmt_peg_no1.setListListener(p);
		p.columnRsltRqmt_peg_no2.addAllListener(p);
		p.columnRsltRqmt_peg_no2.setListListener(p);
		p.columnRsltRqmt_data_crud_typ.addAllListener(p);
		p.columnRsltRqmt_data_crud_typ.setListListener(p);
		p.columnRsltRqmt_un_editable_flg.addAllListener(p);
	}

	/**
	 *  [BtnRqmt]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtnRqmt(MSBCP_SimRqmtReg p) {
		p.BtnRqmt_open_MSBCP0190.addAllListener(p);
		p.BtnRqmt_open_MSBCP0190.setAPMethodName("doBtnRqmt_open_MSBCP0190");
		p.BtnRqmt_sno_select_all.addAllListener(p);
		p.BtnRqmt_sno_select_all.setAPMethodName("doBtnRqmt_sno_select_all");
		p.BtnRqmt_sno_deselect_all.addAllListener(p);
		p.BtnRqmt_sno_deselect_all.setAPMethodName("doBtnRqmt_sno_deselect_all");
		p.BtnRqmt_sprt_sno.addAllListener(p);
		p.BtnRqmt_sprt_sno.setAPMethodName("doBtnRqmt_sprt_sno");
		p.BtnRqmt_select_all.addAllListener(p);
		p.BtnRqmt_select_all.setAPMethodName("doBtnRqmt_select_all");
		p.BtnRqmt_deselect_all.addAllListener(p);
		p.BtnRqmt_deselect_all.setAPMethodName("doBtnRqmt_deselect_all");
		p.BtnRqmt_radd.addAllListener(p);
		p.BtnRqmt_radd.setAPMethodName("doBtnRqmt_radd");
		p.BtnRqmt_rdel.addAllListener(p);
		p.BtnRqmt_rdel.setAPMethodName("doBtnRqmt_rdel");
		p.BtnRqmt_rcopy.addAllListener(p);
		p.BtnRqmt_rcopy.setAPMethodName("doBtnRqmt_rcopy");
		p.BtnRqmt_upd.addAllListener(p);
		p.BtnRqmt_upd.setAPMethodName("doBtnRqmt_upd");
		p.BtnRqmt_upd02.addAllListener(p);
		p.BtnRqmt_upd02.setAPMethodName("doBtnRqmt_upd02");
		p.BtnRqmt_del.addAllListener(p);
		p.BtnRqmt_del.setAPMethodName("doBtnRqmt_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MSBCP_SimRqmtReg p) {
	}

	/**
	 * [UPD_HDR]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, UPD_HDR, MCMode.ENABLE);

	}

	/**
	 * [UPD_HDR]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_no.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_wg_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_sim_usr_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_stk_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_gr_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_gi_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_ship_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltSim_tree_lvl.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltSim_mrp_proc_dt.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.RsltSim_rts_msg_p_PPanel.putStatus(UPD_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_HDR]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.BtnSim_deselect_all.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.BtnSim_radd.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.BtnSim_rdel.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.BtnSim_rcopy.putMode(p, UPD_HDR, MCMode.ENABLE);

	}

	/**
	 * [UPD_HDR]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_HDR]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.columnRsltRqmt_rqmt_no.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, UPD_HDR, MCMode.REQUIRED);
		p.RsltRqmt_itm_p_PPanel.putStatus(UPD_HDR, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(UPD_HDR, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRsltRqmt_unit_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(UPD_HDR, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRsltRqmt_rqmt_typ.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char1.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char2.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char3.putMode(p, UPD_HDR, MCMode.ENABLE);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(UPD_HDR, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, UPD_HDR, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, UPD_HDR, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_HDR]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, UPD_HDR, MCMode.DISABLE);
		p.BtnRqmt_upd02.putMode(p, UPD_HDR, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, UPD_HDR, MCMode.DISABLE);

	}

	/**
	 * [UPD_HDR]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__HDR_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, UPD_DTL, MCMode.ENABLE);

	}

	/**
	 * [UPD_DTL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_no.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_wg_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_sim_usr_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_stk_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_gr_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_gi_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_ship_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltSim_tree_lvl.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltSim_mrp_proc_dt.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.RsltSim_rts_msg_p_PPanel.putStatus(UPD_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_DTL]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, UPD_DTL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, UPD_DTL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, UPD_DTL, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, UPD_DTL, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnSim_deselect_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnSim_radd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnSim_rdel.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnSim_rcopy.putMode(p, UPD_DTL, MCMode.ENABLE);

	}

	/**
	 * [UPD_DTL]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_DTL]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltRqmt_rqmt_no.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.RsltRqmt_itm_p_PPanel.putStatus(UPD_DTL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, UPD_DTL, MCMode.REQUIRED);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(UPD_DTL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnRsltRqmt_unit_cd.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_sppl_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(UPD_DTL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.ENABLE);
		p.columnRsltRqmt_rqmt_typ.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char1.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char2.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.columnRsltRqmt_sub_char3.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(UPD_DTL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, UPD_DTL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, UPD_DTL, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_DTL]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, UPD_DTL, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_sprt_sno.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_select_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_deselect_all.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_radd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_rdel.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_rcopy.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_upd.putMode(p, UPD_DTL, MCMode.ENABLE);
		p.BtnRqmt_upd02.putMode(p, UPD_DTL, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, UPD_DTL, MCMode.DISABLE);

	}

	/**
	 * [UPD_DTL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__DTL_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, UPD_FIX, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, UPD_FIX, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, UPD_FIX, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.columnRsltSim_sim_mrp_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_FIX]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_deselect_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_radd.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, UPD_FIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [UPD_FIX]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(UPD_FIX, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(UPD_FIX, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, UPD_FIX, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, UPD_FIX, MCMode.INVISIBLE);

	}

	/**
	 * [UPD_FIX]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, UPD_FIX, MCMode.DISABLE);
		p.BtnRqmt_upd02.putMode(p, UPD_FIX, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, UPD_FIX, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitREF_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, REF, MCMode.DISABLE);
		p.columnRsltSim_sim_mrp_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltSim_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_radd.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, REF, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitREF_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [REF]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitREF_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(REF, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, REF, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, REF, MCMode.DISABLE);
		p.BtnRqmt_upd02.putMode(p, REF, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, SRCH_DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, SRCH_DEL, MCMode.ENABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, SRCH_DEL, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_DEL]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(SRCH_DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, SRCH_DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, SRCH_DEL, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, SRCH_DEL, MCMode.DISABLE);
		p.BtnRqmt_upd02.putMode(p, SRCH_DEL, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, SRCH_DEL, MCMode.DISABLE);

	}

	/**
	 * [SRCH_DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__DEL_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitDEL_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.BtnSim_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.BtnSim_radd.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [DEL]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(DEL, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, DEL, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, DEL, MCMode.DISABLE);
		p.BtnRqmt_upd02.putMode(p, DEL, MCMode.INVISIBLE);
		p.BtnRqmt_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, SRCH_INST, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, SRCH_INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, SRCH_INST, MCMode.ENABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INST]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_select_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_deselect_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_radd.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, SRCH_INST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [SRCH_INST]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(SRCH_INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(SRCH_INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, SRCH_INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, SRCH_INST, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH_INST]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, SRCH_INST, MCMode.INVISIBLE);
		p.BtnRqmt_upd02.putMode(p, SRCH_INST, MCMode.DISABLE);
		p.BtnRqmt_del.putMode(p, SRCH_INST, MCMode.DISABLE);

	}

	/**
	 * [SRCH_INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH__INST_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitINST_ScreenOpe(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitINST_Top(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitINST_Fold(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitINST_Cnd(MSBCP_SimRqmtReg p){
		p.Cnd_ope_Group.putMode(p, INST, MCMode.REQUIRED);
		p.Cnd_wg_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_usr_cd.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_usr_nm.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_from.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_mrp_proc_dt_to.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_no.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.Cnd_sim_mrp_intr_rmrks.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char1.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char2.putMode(p, INST, MCMode.ENABLE);
		p.Cnd_sim_mrp_sub_char3.putMode(p, INST, MCMode.ENABLE);

	}

	/**
	 * [INST]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitINST_Ctrl(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[List]ブロックのモードの設定
	 */
	protected static void statusInitINST_List(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[SimInfo]ブロックのモードの設定
	 */
	protected static void statusInitINST_SimInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[RsltSim]ブロックのモードの設定
	 */
	protected static void statusInitINST_RsltSim(MSBCP_SimRqmtReg p){
		p.columnRsltSim_check.putMode(p, INST, MCMode.REQUIRED);
		p.columnRsltSim_sim_mrp_no.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_wg_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_wg_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_usr_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_dly_rqmt_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_stk_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_gr_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_gi_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_ship_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_tree_lvl.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_mrp_proc_dt.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_exp_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_intr_rmrks.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char1.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char2.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_sim_mrp_sub_char3.putMode(p, INST, MCMode.READ_ONLY);
		p.RsltSim_rts_msg_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.READ_ONLY);
		p.columnRsltSim_ins_usr_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_usr_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_func_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_ins_ts.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_usr_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_func_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_ts.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_srv_req_no.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltSim_upd_cntr.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltSim_peg_no1.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltSim_data_crud_typ.putMode(p, INST, MCMode.INVISIBLE);

	}

	/**
	 * [INST]ステータスの[BtnSim]ブロックのモードの設定
	 */
	protected static void statusInitINST_BtnSim(MSBCP_SimRqmtReg p){
		p.BtnSim_open_MSBCP0160.putMode(p, INST, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0170.putMode(p, INST, MCMode.DISABLE);
		p.BtnSim_open_MSBCP0180.putMode(p, INST, MCMode.DISABLE);
		p.BtnSim_open_FSBGP0140.putMode(p, INST, MCMode.ENABLE);
		p.BtnSim_select_all.putMode(p, INST, MCMode.ENABLE);
		p.BtnSim_deselect_all.putMode(p, INST, MCMode.ENABLE);
		p.BtnSim_radd.putMode(p, INST, MCMode.DISABLE);
		p.BtnSim_rdel.putMode(p, INST, MCMode.DISABLE);
		p.BtnSim_rcopy.putMode(p, INST, MCMode.DISABLE);

	}

	/**
	 * [INST]ステータスの[RqmtInfo]ブロックのモードの設定
	 */
	protected static void statusInitINST_RqmtInfo(MSBCP_SimRqmtReg p){

	}

	/**
	 * [INST]ステータスの[RsltRqmt]ブロックのモードの設定
	 */
	protected static void statusInitINST_RsltRqmt(MSBCP_SimRqmtReg p){
		p.columnRsltRqmt_check.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno_sprt_flg.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_no.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sim_mrp_no.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_due_dt.putMode(p, INST, MCMode.READ_ONLY);
		p.RsltRqmt_itm_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnRsltRqmt_strg_loc_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_site_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_wg_cd.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_wg_nm.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_strg_loc_grp_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_strg_loc_grp_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_qty_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnRsltRqmt_unit_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_unit_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_dec_place.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_mfg_loc_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_mfg_loc_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sppl_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_loc_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_cd.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqst_wg_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sno1_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_mng_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno1_num_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno2_num_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno3_num_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_sno4_num_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno1_flg.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno2_flg.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno3_flg.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_rqmt_sno4_flg.putMode(p, INST, MCMode.INVISIBLE);
		p.RsltRqmt_sno_wrkno_p_PPanel.putStatus(INST, mcframe.clientMSUB.MSUBP5020.MSUBP_SnoWrkNo_D.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_rqmt_typ_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_intr_rmrks.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char1.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char2.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_sub_char3.putMode(p, INST, MCMode.READ_ONLY);
		p.RsltRqmt_rqmt_rts_msg_p_PPanel.putStatus(INST, mcframe.clientMAUB.MAUBP5310.MAUBP_RtnMsg_D.INVISIBLE);
		p.columnRsltRqmt_ins_usr_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_usr_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_func_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_ins_ts.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_usr_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_id.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_func_nm.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_ts.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_srv_req_no.putMode(p, INST, MCMode.READ_ONLY);
		p.columnRsltRqmt_upd_cntr.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no1.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_peg_no2.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_data_crud_typ.putMode(p, INST, MCMode.INVISIBLE);
		p.columnRsltRqmt_un_editable_flg.putMode(p, INST, MCMode.INVISIBLE);

	}

	/**
	 * [INST]ステータスの[BtnRqmt]ブロックのモードの設定
	 */
	protected static void statusInitINST_BtnRqmt(MSBCP_SimRqmtReg p){
		p.BtnRqmt_open_MSBCP0190.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_sno_select_all.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_sno_deselect_all.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_sprt_sno.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_select_all.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_deselect_all.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_radd.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_rdel.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_rcopy.putMode(p, INST, MCMode.DISABLE);
		p.BtnRqmt_upd.putMode(p, INST, MCMode.INVISIBLE);
		p.BtnRqmt_upd02.putMode(p, INST, MCMode.ENABLE);
		p.BtnRqmt_del.putMode(p, INST, MCMode.DISABLE);

	}

	/**
	 * [INST]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitINST_EastBtn(MSBCP_SimRqmtReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD_HDR;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MSBCP_SimRqmtReg_MC.setTableConfigRsltSim((MSBCP_SimRqmtReg)this);
		MSBCP_SimRqmtReg_MC.setTableConfigRsltRqmt((MSBCP_SimRqmtReg)this);
	}

	/**
	 * [RsltSim]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltSim(MSBCP_SimRqmtReg p) {
		p.columnRsltSim_check.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.check_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_check);
		p.columnRsltSim_sim_mrp_no.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_no_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_no);
		p.columnRsltSim_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.wg_cd_META);
		p.columnRsltSim_wg_cd.addLinkBeans(p.columnRsltSim_wg_nm);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_wg_cd);
		p.columnRsltSim_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.wg_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_wg_nm);
		p.columnRsltSim_sim_mrp_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_typ_META);
		p.columnRsltSim_sim_mrp_typ.addLinkBeans(p.columnRsltSim_sim_mrp_typ_nm);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_typ);
		p.columnRsltSim_sim_mrp_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_typ_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_typ_nm);
		p.columnRsltSim_sim_usr_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_usr_cd_META);
		p.columnRsltSim_sim_usr_cd.setListType(MCListType.STRICT);
		p.columnRsltSim_sim_usr_cd.addLinkBeans(p.columnRsltSim_sim_usr_nm);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_usr_cd);
		p.columnRsltSim_sim_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_usr_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_usr_nm);
		p.columnRsltSim_dly_rqmt_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.dly_rqmt_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_dly_rqmt_flg);
		p.columnRsltSim_stk_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.stk_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_stk_flg);
		p.columnRsltSim_gr_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.gr_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_gr_flg);
		p.columnRsltSim_gi_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.gi_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_gi_flg);
		p.columnRsltSim_ship_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ship_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ship_flg);
		p.columnRsltSim_tree_lvl.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.tree_lvl_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_tree_lvl);
		p.columnRsltSim_mrp_proc_dt.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.mrp_proc_dt_META);
		p.columnRsltSim_mrp_proc_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_mrp_proc_dt);
		p.columnRsltSim_exp_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.exp_flg_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_exp_flg);
		p.columnRsltSim_sim_mrp_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_intr_rmrks_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_intr_rmrks);
		p.columnRsltSim_sim_mrp_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_sub_char1_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_sub_char1);
		p.columnRsltSim_sim_mrp_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_sub_char2_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_sub_char2);
		p.columnRsltSim_sim_mrp_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.sim_mrp_sub_char3_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_sim_mrp_sub_char3);
		p.RsltSimTable.addTable(p.RsltSim_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRsltSim_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ins_usr_id_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ins_usr_id);
		p.columnRsltSim_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ins_usr_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ins_usr_nm);
		p.columnRsltSim_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ins_func_id_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ins_func_id);
		p.columnRsltSim_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ins_func_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ins_func_nm);
		p.columnRsltSim_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.ins_ts_META);
		p.columnRsltSim_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_ins_ts);
		p.columnRsltSim_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_usr_id_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_usr_id);
		p.columnRsltSim_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_usr_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_usr_nm);
		p.columnRsltSim_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_func_id_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_func_id);
		p.columnRsltSim_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_func_nm_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_func_nm);
		p.columnRsltSim_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_ts_META);
		p.columnRsltSim_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_ts);
		p.columnRsltSim_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_srv_req_no_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_srv_req_no);
		p.columnRsltSim_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.upd_cntr_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_upd_cntr);
		p.columnRsltSim_peg_no1.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.peg_no1_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_peg_no1);
		p.columnRsltSim_data_crud_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltSimR.data_crud_typ_META);
		p.RsltSimTable.addColumnConfig(p.columnRsltSim_data_crud_typ);
		// スクロール固定カラムの指定
		p.RsltSimTable.setUnscrollColumn(p.columnRsltSim_check);
	}

	/**
	 * [RsltRqmt]ブロックのTableの設定
	 */
	protected static void setTableConfigRsltRqmt(MSBCP_SimRqmtReg p) {
		p.columnRsltRqmt_check.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.check_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_check);
		p.columnRsltRqmt_sno_sprt_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno_sprt_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno_sprt_flg);
		p.columnRsltRqmt_rqmt_no.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_no_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_no);
		p.columnRsltRqmt_sim_mrp_no.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sim_mrp_no_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sim_mrp_no);
		p.columnRsltRqmt_due_dt.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.due_dt_META);
		p.columnRsltRqmt_due_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_due_dt);
		p.RsltRqmtTable.addTable(p.RsltRqmt_itm_p_PPanel.ItmTable);
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnRsltRqmt_itm_nm, p.columnRsltRqmt_itm_sub1, p.columnRsltRqmt_itm_sub2, p.columnRsltRqmt_itm_sub3, p.columnRsltRqmt_unit_cd, p.columnRsltRqmt_unit_nm, p.columnRsltRqmt_dec_place, p.columnRsltRqmt_sno1_mng_typ, p.columnRsltRqmt_sno2_mng_typ, p.columnRsltRqmt_sno3_mng_typ, p.columnRsltRqmt_sno4_mng_typ, p.columnRsltRqmt_sno1_num_typ, p.columnRsltRqmt_sno2_num_typ, p.columnRsltRqmt_sno3_num_typ, p.columnRsltRqmt_sno4_num_typ, p.columnRsltRqmt_rqmt_sno1_flg, p.columnRsltRqmt_rqmt_sno2_flg, p.columnRsltRqmt_rqmt_sno3_flg, p.columnRsltRqmt_rqmt_sno4_flg);
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnRsltRqmt_itm_nm, p.columnRsltRqmt_itm_sub2, p.columnRsltRqmt_itm_sub3, p.columnRsltRqmt_unit_cd, p.columnRsltRqmt_unit_nm, p.columnRsltRqmt_dec_place, p.columnRsltRqmt_sno1_mng_typ, p.columnRsltRqmt_sno2_mng_typ, p.columnRsltRqmt_sno3_mng_typ, p.columnRsltRqmt_sno4_mng_typ, p.columnRsltRqmt_sno1_num_typ, p.columnRsltRqmt_sno2_num_typ, p.columnRsltRqmt_sno3_num_typ, p.columnRsltRqmt_sno4_num_typ, p.columnRsltRqmt_rqmt_sno1_flg, p.columnRsltRqmt_rqmt_sno2_flg, p.columnRsltRqmt_rqmt_sno3_flg, p.columnRsltRqmt_rqmt_sno4_flg);
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnRsltRqmt_itm_nm, p.columnRsltRqmt_itm_sub3, p.columnRsltRqmt_unit_cd, p.columnRsltRqmt_unit_nm, p.columnRsltRqmt_dec_place, p.columnRsltRqmt_sno1_mng_typ, p.columnRsltRqmt_sno2_mng_typ, p.columnRsltRqmt_sno3_mng_typ, p.columnRsltRqmt_sno4_mng_typ, p.columnRsltRqmt_sno1_num_typ, p.columnRsltRqmt_sno2_num_typ, p.columnRsltRqmt_sno3_num_typ, p.columnRsltRqmt_sno4_num_typ, p.columnRsltRqmt_rqmt_sno1_flg, p.columnRsltRqmt_rqmt_sno2_flg, p.columnRsltRqmt_rqmt_sno3_flg, p.columnRsltRqmt_rqmt_sno4_flg);
		p.RsltRqmt_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnRsltRqmt_itm_nm, p.columnRsltRqmt_unit_cd, p.columnRsltRqmt_unit_nm, p.columnRsltRqmt_dec_place, p.columnRsltRqmt_sno1_mng_typ, p.columnRsltRqmt_sno2_mng_typ, p.columnRsltRqmt_sno3_mng_typ, p.columnRsltRqmt_sno4_mng_typ, p.columnRsltRqmt_sno1_num_typ, p.columnRsltRqmt_sno2_num_typ, p.columnRsltRqmt_sno3_num_typ, p.columnRsltRqmt_sno4_num_typ, p.columnRsltRqmt_rqmt_sno1_flg, p.columnRsltRqmt_rqmt_sno2_flg, p.columnRsltRqmt_rqmt_sno3_flg, p.columnRsltRqmt_rqmt_sno4_flg);
		p.columnRsltRqmt_strg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.strg_loc_cd_META);
		p.columnRsltRqmt_strg_loc_cd.setListType(MCListType.STRICT);
		p.columnRsltRqmt_strg_loc_cd.addLinkBeans(p.columnRsltRqmt_strg_loc_nm,p.columnRsltRqmt_site_cd,p.columnRsltRqmt_site_nm,p.columnRsltRqmt_wg_cd,p.columnRsltRqmt_wg_nm,p.columnRsltRqmt_strg_loc_grp_cd,p.columnRsltRqmt_strg_loc_grp_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_strg_loc_cd);
		p.columnRsltRqmt_strg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.strg_loc_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_strg_loc_nm);
		p.columnRsltRqmt_site_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.site_cd_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_site_cd);
		p.columnRsltRqmt_site_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.site_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_site_nm);
		p.columnRsltRqmt_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.wg_cd_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_wg_cd);
		p.columnRsltRqmt_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.wg_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_wg_nm);
		p.columnRsltRqmt_strg_loc_grp_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.strg_loc_grp_cd_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_strg_loc_grp_cd);
		p.columnRsltRqmt_strg_loc_grp_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.strg_loc_grp_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_strg_loc_grp_nm);
		p.RsltRqmtTable.addTable(p.RsltRqmt_rqmt_qty_p_PPanel.QtyTable);
		p.columnRsltRqmt_unit_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.unit_cd_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_unit_cd);
		p.columnRsltRqmt_unit_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.unit_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_unit_nm);
		p.columnRsltRqmt_dec_place.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.dec_place_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_dec_place);
		p.columnRsltRqmt_mfg_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.mfg_loc_cd_META);
		p.columnRsltRqmt_mfg_loc_cd.addLinkBeans(p.columnRsltRqmt_mfg_loc_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_mfg_loc_cd);
		p.columnRsltRqmt_mfg_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.mfg_loc_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_mfg_loc_nm);
		p.columnRsltRqmt_sppl_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sppl_cd_META);
		p.columnRsltRqmt_sppl_cd.addLinkBeans(p.columnRsltRqmt_sppl_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sppl_cd);
		p.columnRsltRqmt_sppl_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sppl_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sppl_nm);
		p.columnRsltRqmt_rqst_loc_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqst_loc_cd_META);
		p.columnRsltRqmt_rqst_loc_cd.addLinkBeans(p.columnRsltRqmt_rqst_loc_nm,p.columnRsltRqmt_rqst_wg_cd,p.columnRsltRqmt_rqst_wg_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqst_loc_cd);
		p.columnRsltRqmt_rqst_loc_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqst_loc_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqst_loc_nm);
		p.columnRsltRqmt_rqst_wg_cd.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqst_wg_cd_META);
		p.columnRsltRqmt_rqst_wg_cd.addLinkBeans(p.columnRsltRqmt_rqst_wg_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqst_wg_cd);
		p.columnRsltRqmt_rqst_wg_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqst_wg_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqst_wg_nm);
		p.columnRsltRqmt_sno1_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno1_mng_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno1_mng_typ);
		p.columnRsltRqmt_sno2_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno2_mng_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno2_mng_typ);
		p.columnRsltRqmt_sno3_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno3_mng_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno3_mng_typ);
		p.columnRsltRqmt_sno4_mng_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno4_mng_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno4_mng_typ);
		p.columnRsltRqmt_sno1_num_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno1_num_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno1_num_typ);
		p.columnRsltRqmt_sno2_num_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno2_num_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno2_num_typ);
		p.columnRsltRqmt_sno3_num_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno3_num_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno3_num_typ);
		p.columnRsltRqmt_sno4_num_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sno4_num_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sno4_num_typ);
		p.columnRsltRqmt_rqmt_sno1_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_sno1_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_sno1_flg);
		p.columnRsltRqmt_rqmt_sno2_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_sno2_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_sno2_flg);
		p.columnRsltRqmt_rqmt_sno3_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_sno3_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_sno3_flg);
		p.columnRsltRqmt_rqmt_sno4_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_sno4_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_sno4_flg);
		p.RsltRqmtTable.addTable(p.RsltRqmt_sno_wrkno_p_PPanel.SnoWrkNoTable);
		p.columnRsltRqmt_rqmt_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_typ_META);
		p.columnRsltRqmt_rqmt_typ.addLinkBeans(p.columnRsltRqmt_rqmt_typ_nm);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_typ);
		p.columnRsltRqmt_rqmt_typ_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.rqmt_typ_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_rqmt_typ_nm);
		p.columnRsltRqmt_intr_rmrks.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.intr_rmrks_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_intr_rmrks);
		p.columnRsltRqmt_sub_char1.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sub_char1_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sub_char1);
		p.columnRsltRqmt_sub_char2.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sub_char2_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sub_char2);
		p.columnRsltRqmt_sub_char3.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.sub_char3_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_sub_char3);
		p.RsltRqmtTable.addTable(p.RsltRqmt_rqmt_rts_msg_p_PPanel.RtnMsgTable);
		p.columnRsltRqmt_ins_usr_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.ins_usr_id_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_ins_usr_id);
		p.columnRsltRqmt_ins_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.ins_usr_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_ins_usr_nm);
		p.columnRsltRqmt_ins_func_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.ins_func_id_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_ins_func_id);
		p.columnRsltRqmt_ins_func_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.ins_func_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_ins_func_nm);
		p.columnRsltRqmt_ins_ts.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.ins_ts_META);
		p.columnRsltRqmt_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_ins_ts);
		p.columnRsltRqmt_upd_usr_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_usr_id_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_usr_id);
		p.columnRsltRqmt_upd_usr_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_usr_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_usr_nm);
		p.columnRsltRqmt_upd_func_id.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_func_id_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_func_id);
		p.columnRsltRqmt_upd_func_nm.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_func_nm_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_func_nm);
		p.columnRsltRqmt_upd_ts.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_ts_META);
		p.columnRsltRqmt_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_ts);
		p.columnRsltRqmt_upd_srv_req_no.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_srv_req_no_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_srv_req_no);
		p.columnRsltRqmt_upd_cntr.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.upd_cntr_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_upd_cntr);
		p.columnRsltRqmt_peg_no1.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.peg_no1_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_peg_no1);
		p.columnRsltRqmt_peg_no2.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.peg_no2_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_peg_no2);
		p.columnRsltRqmt_data_crud_typ.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.data_crud_typ_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_data_crud_typ);
		p.columnRsltRqmt_un_editable_flg.setMeta(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.un_editable_flg_META);
		p.RsltRqmtTable.addColumnConfig(p.columnRsltRqmt_un_editable_flg);
		// スクロール固定カラムの指定
		p.RsltRqmtTable.setUnscrollColumn(p.columnRsltRqmt_check);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_sim_usr_cd.getListConfig().setPutter(getCnd_sim_usr_cd_ListPutter());
		Cnd_sim_mrp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sim_mrp_typ.getListConfig().setPutter(getCnd_sim_mrp_typ_ListPutter());
		columnRsltSim_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltSim_wg_cd.getListConfig().setPutter(getRsltSim_wg_cd_ListPutter());
		columnRsltSim_sim_mrp_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltSim_sim_mrp_typ.getListConfig().setPutter(getRsltSim_sim_mrp_typ_ListPutter());
		columnRsltSim_sim_usr_cd.getListConfig().setPutter(getRsltSim_sim_usr_cd_ListPutter());
		RsltRqmt_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getRsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		RsltRqmt_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnRsltRqmt_strg_loc_cd.getListConfig().setPutter(getRsltRqmt_strg_loc_cd_ListPutter());
		columnRsltRqmt_mfg_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltRqmt_mfg_loc_cd.getListConfig().setPutter(getRsltRqmt_mfg_loc_cd_ListPutter());
		columnRsltRqmt_sppl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltRqmt_sppl_cd.getListConfig().setPutter(getRsltRqmt_sppl_cd_ListPutter());
		columnRsltRqmt_rqst_loc_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltRqmt_rqst_loc_cd.getListConfig().setPutter(getRsltRqmt_rqst_loc_cd_ListPutter());
		columnRsltRqmt_rqmt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnRsltRqmt_rqmt_typ.getListConfig().setPutter(getRsltRqmt_rqmt_typ_ListPutter());
	}

	/**
	 * この画面を[UPD_HDR]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_HDRStatus() {
		status = UPD_HDR;
		setAllStatus(status);
	}

	/**
	 * この画面を[UPD_DTL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_DTLStatus() {
		status = UPD_DTL;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
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
	 * この画面を[DEL]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setDELStatus() {
		status = DEL;
		setAllStatus(status);
	}

	/**
	 * この画面を[SRCH_INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCH_INSTStatus() {
		status = SRCH_INST;
		setAllStatus(status);
	}

	/**
	 * この画面を[INST]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setINSTStatus() {
		status = INST;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD_HDR.equals(status)) {
			setUPD_HDRStatus();
		}
		else if (UPD_DTL.equals(status)) {
			setUPD_DTLStatus();
		}
		else if (UPD_FIX.equals(status)) {
			setUPD_FIXStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (SRCH_DEL.equals(status)) {
			setSRCH_DELStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (SRCH_INST.equals(status)) {
			setSRCH_INSTStatus();
		}
		else if (INST.equals(status)) {
			setINSTStatus();
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
	 * [Cnd_sim_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sim_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [Cnd_sim_mrp_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sim_mrp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SimMrpTyp");
		return lp;
	}
	 
	/**
	 * [RsltSim_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltSim_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [RsltSim_sim_mrp_typ_ListPutter]の作成
	 */
	protected MCListPutter createRsltSim_sim_mrp_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0010.SimMrpTyp");
		return lp;
	}
	 
	/**
	 * [RsltSim_sim_usr_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltSim_sim_usr_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Usr");
		return lp;
	}
	 
	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [RsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [RsltRqmt_strg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_strg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [RsltRqmt_mfg_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_mfg_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlMfgLoc");
		return lp;
	}
	 
	/**
	 * [RsltRqmt_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlSppl");
		return lp;
	}
	 
	/**
	 * [RsltRqmt_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MS.MSUAP0040.ItmDtlRqstLoc");
		return lp;
	}
	 
	/**
	 * [RsltRqmt_rqmt_typ_ListPutter]の作成
	 */
	protected MCListPutter createRsltRqmt_rqmt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RqmtTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_sim_usr_cd) return getCnd_sim_usr_cd(row, info);
		if(combo == Cnd_sim_mrp_typ) return getCnd_sim_mrp_typ(row, info);
		if(combo == columnRsltSim_wg_cd) return getRsltSim_wg_cd(row, info);
		if(combo == columnRsltSim_sim_mrp_typ) return getRsltSim_sim_mrp_typ(row, info);
		if(combo == columnRsltSim_sim_usr_cd) return getRsltSim_sim_usr_cd(row, info);
		if(combo == RsltRqmt_itm_p_PPanel.columnItm_itm_cd) return getRsltRqmt_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == RsltRqmt_itm_p_PPanel.columnItm_itm_sub1) return getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == RsltRqmt_itm_p_PPanel.columnItm_itm_sub2) return getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == RsltRqmt_itm_p_PPanel.columnItm_itm_sub3) return getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnRsltRqmt_strg_loc_cd) return getRsltRqmt_strg_loc_cd(row, info);
		if(combo == columnRsltRqmt_mfg_loc_cd) return getRsltRqmt_mfg_loc_cd(row, info);
		if(combo == columnRsltRqmt_sppl_cd) return getRsltRqmt_sppl_cd(row, info);
		if(combo == columnRsltRqmt_rqst_loc_cd) return getRsltRqmt_rqst_loc_cd(row, info);
		if(combo == columnRsltRqmt_rqmt_typ) return getRsltRqmt_rqmt_typ(row, info);
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
		else if (ap == BtnSim_open_MSBCP0160) doBtnSim_open_MSBCP0160(info);
		else if (ap == BtnSim_open_MSBCP0170) doBtnSim_open_MSBCP0170(info);
		else if (ap == BtnSim_open_MSBCP0180) doBtnSim_open_MSBCP0180(info);
		else if (ap == BtnSim_open_FSBGP0140) doBtnSim_open_FSBGP0140(info);
		else if (ap == BtnSim_select_all) doBtnSim_select_all(info);
		else if (ap == BtnSim_deselect_all) doBtnSim_deselect_all(info);
		else if (ap == BtnSim_radd) doBtnSim_radd(info);
		else if (ap == BtnSim_rdel) doBtnSim_rdel(info);
		else if (ap == BtnSim_rcopy) doBtnSim_rcopy(info);
		else if (ap == BtnRqmt_open_MSBCP0190) doBtnRqmt_open_MSBCP0190(info);
		else if (ap == BtnRqmt_sno_select_all) doBtnRqmt_sno_select_all(info);
		else if (ap == BtnRqmt_sno_deselect_all) doBtnRqmt_sno_deselect_all(info);
		else if (ap == BtnRqmt_sprt_sno) doBtnRqmt_sprt_sno(info);
		else if (ap == BtnRqmt_select_all) doBtnRqmt_select_all(info);
		else if (ap == BtnRqmt_deselect_all) doBtnRqmt_deselect_all(info);
		else if (ap == BtnRqmt_radd) doBtnRqmt_radd(info);
		else if (ap == BtnRqmt_rdel) doBtnRqmt_rdel(info);
		else if (ap == BtnRqmt_rcopy) doBtnRqmt_rcopy(info);
		else if (ap == BtnRqmt_upd) doBtnRqmt_upd(info);
		else if (ap == BtnRqmt_upd02) doBtnRqmt_upd02(info);
		else if (ap == BtnRqmt_del) doBtnRqmt_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[open_MSBCP0160]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_open_MSBCP0160(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[open_MSBCP0170]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_open_MSBCP0170(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[open_MSBCP0180]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_open_MSBCP0180(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[open_FSBGP0140]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_open_FSBGP0140(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_select_all(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_deselect_all(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_radd(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_rdel(MCEventInfo info);

	/**
	 * [BtnSim]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnSim_rcopy(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[open_MSBCP0190]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_open_MSBCP0190(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[sno_select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_sno_select_all(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[sno_deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_sno_deselect_all(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[sprt_sno]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_sprt_sno(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_select_all(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_deselect_all(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_radd(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_rdel(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_rcopy(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_upd(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[upd02]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_upd02(MCEventInfo info);

	/**
	 * [BtnRqmt]パネルの[del]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtnRqmt_del(MCEventInfo info);

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
		if (vc == RsltSimTable) return doRsltSim_VC(info);
		if (vc == RsltRqmtTable) return doRsltRqmt_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_sim_usr_cd) return doCnd_sim_usr_cd_VC(info);
		if (vc == Cnd_sim_usr_nm) return doCnd_sim_usr_nm_VC(info);
		if (vc == Cnd_mrp_proc_dt_from) return doCnd_mrp_proc_dt_from_VC(info);
		if (vc == Cnd_mrp_proc_dt_to) return doCnd_mrp_proc_dt_to_VC(info);
		if (vc == Cnd_sim_mrp_no) return doCnd_sim_mrp_no_VC(info);
		if (vc == Cnd_sim_mrp_typ) return doCnd_sim_mrp_typ_VC(info);
		if (vc == Cnd_sim_mrp_typ_nm) return doCnd_sim_mrp_typ_nm_VC(info);
		if (vc == Cnd_sim_mrp_intr_rmrks) return doCnd_sim_mrp_intr_rmrks_VC(info);
		if (vc == Cnd_sim_mrp_sub_char1) return doCnd_sim_mrp_sub_char1_VC(info);
		if (vc == Cnd_sim_mrp_sub_char2) return doCnd_sim_mrp_sub_char2_VC(info);
		if (vc == Cnd_sim_mrp_sub_char3) return doCnd_sim_mrp_sub_char3_VC(info);
		if (vc == columnRsltSim_check) return doRsltSim_check_VC(info);
		if (vc == columnRsltSim_sim_mrp_no) return doRsltSim_sim_mrp_no_VC(info);
		if (vc == columnRsltSim_wg_cd) return doRsltSim_wg_cd_VC(info);
		if (vc == columnRsltSim_wg_nm) return doRsltSim_wg_nm_VC(info);
		if (vc == columnRsltSim_sim_mrp_typ) return doRsltSim_sim_mrp_typ_VC(info);
		if (vc == columnRsltSim_sim_mrp_typ_nm) return doRsltSim_sim_mrp_typ_nm_VC(info);
		if (vc == columnRsltSim_sim_usr_cd) return doRsltSim_sim_usr_cd_VC(info);
		if (vc == columnRsltSim_sim_usr_nm) return doRsltSim_sim_usr_nm_VC(info);
		if (vc == columnRsltSim_dly_rqmt_flg) return doRsltSim_dly_rqmt_flg_VC(info);
		if (vc == columnRsltSim_stk_flg) return doRsltSim_stk_flg_VC(info);
		if (vc == columnRsltSim_gr_flg) return doRsltSim_gr_flg_VC(info);
		if (vc == columnRsltSim_gi_flg) return doRsltSim_gi_flg_VC(info);
		if (vc == columnRsltSim_ship_flg) return doRsltSim_ship_flg_VC(info);
		if (vc == columnRsltSim_tree_lvl) return doRsltSim_tree_lvl_VC(info);
		if (vc == columnRsltSim_mrp_proc_dt) return doRsltSim_mrp_proc_dt_VC(info);
		if (vc == columnRsltSim_exp_flg) return doRsltSim_exp_flg_VC(info);
		if (vc == columnRsltSim_sim_mrp_intr_rmrks) return doRsltSim_sim_mrp_intr_rmrks_VC(info);
		if (vc == columnRsltSim_sim_mrp_sub_char1) return doRsltSim_sim_mrp_sub_char1_VC(info);
		if (vc == columnRsltSim_sim_mrp_sub_char2) return doRsltSim_sim_mrp_sub_char2_VC(info);
		if (vc == columnRsltSim_sim_mrp_sub_char3) return doRsltSim_sim_mrp_sub_char3_VC(info);
		if (vc == columnRsltSim_ins_usr_id) return doRsltSim_ins_usr_id_VC(info);
		if (vc == columnRsltSim_ins_usr_nm) return doRsltSim_ins_usr_nm_VC(info);
		if (vc == columnRsltSim_ins_func_id) return doRsltSim_ins_func_id_VC(info);
		if (vc == columnRsltSim_ins_func_nm) return doRsltSim_ins_func_nm_VC(info);
		if (vc == columnRsltSim_ins_ts) return doRsltSim_ins_ts_VC(info);
		if (vc == columnRsltSim_upd_usr_id) return doRsltSim_upd_usr_id_VC(info);
		if (vc == columnRsltSim_upd_usr_nm) return doRsltSim_upd_usr_nm_VC(info);
		if (vc == columnRsltSim_upd_func_id) return doRsltSim_upd_func_id_VC(info);
		if (vc == columnRsltSim_upd_func_nm) return doRsltSim_upd_func_nm_VC(info);
		if (vc == columnRsltSim_upd_ts) return doRsltSim_upd_ts_VC(info);
		if (vc == columnRsltSim_upd_srv_req_no) return doRsltSim_upd_srv_req_no_VC(info);
		if (vc == columnRsltSim_upd_cntr) return doRsltSim_upd_cntr_VC(info);
		if (vc == columnRsltSim_peg_no1) return doRsltSim_peg_no1_VC(info);
		if (vc == columnRsltSim_data_crud_typ) return doRsltSim_data_crud_typ_VC(info);
		if (vc == columnRsltRqmt_check) return doRsltRqmt_check_VC(info);
		if (vc == columnRsltRqmt_sno_sprt_flg) return doRsltRqmt_sno_sprt_flg_VC(info);
		if (vc == columnRsltRqmt_rqmt_no) return doRsltRqmt_rqmt_no_VC(info);
		if (vc == columnRsltRqmt_sim_mrp_no) return doRsltRqmt_sim_mrp_no_VC(info);
		if (vc == columnRsltRqmt_due_dt) return doRsltRqmt_due_dt_VC(info);
		if (vc == columnRsltRqmt_strg_loc_cd) return doRsltRqmt_strg_loc_cd_VC(info);
		if (vc == columnRsltRqmt_strg_loc_nm) return doRsltRqmt_strg_loc_nm_VC(info);
		if (vc == columnRsltRqmt_site_cd) return doRsltRqmt_site_cd_VC(info);
		if (vc == columnRsltRqmt_site_nm) return doRsltRqmt_site_nm_VC(info);
		if (vc == columnRsltRqmt_wg_cd) return doRsltRqmt_wg_cd_VC(info);
		if (vc == columnRsltRqmt_wg_nm) return doRsltRqmt_wg_nm_VC(info);
		if (vc == columnRsltRqmt_strg_loc_grp_cd) return doRsltRqmt_strg_loc_grp_cd_VC(info);
		if (vc == columnRsltRqmt_strg_loc_grp_nm) return doRsltRqmt_strg_loc_grp_nm_VC(info);
		if (vc == columnRsltRqmt_unit_cd) return doRsltRqmt_unit_cd_VC(info);
		if (vc == columnRsltRqmt_unit_nm) return doRsltRqmt_unit_nm_VC(info);
		if (vc == columnRsltRqmt_dec_place) return doRsltRqmt_dec_place_VC(info);
		if (vc == columnRsltRqmt_mfg_loc_cd) return doRsltRqmt_mfg_loc_cd_VC(info);
		if (vc == columnRsltRqmt_mfg_loc_nm) return doRsltRqmt_mfg_loc_nm_VC(info);
		if (vc == columnRsltRqmt_sppl_cd) return doRsltRqmt_sppl_cd_VC(info);
		if (vc == columnRsltRqmt_sppl_nm) return doRsltRqmt_sppl_nm_VC(info);
		if (vc == columnRsltRqmt_rqst_loc_cd) return doRsltRqmt_rqst_loc_cd_VC(info);
		if (vc == columnRsltRqmt_rqst_loc_nm) return doRsltRqmt_rqst_loc_nm_VC(info);
		if (vc == columnRsltRqmt_rqst_wg_cd) return doRsltRqmt_rqst_wg_cd_VC(info);
		if (vc == columnRsltRqmt_rqst_wg_nm) return doRsltRqmt_rqst_wg_nm_VC(info);
		if (vc == columnRsltRqmt_sno1_mng_typ) return doRsltRqmt_sno1_mng_typ_VC(info);
		if (vc == columnRsltRqmt_sno2_mng_typ) return doRsltRqmt_sno2_mng_typ_VC(info);
		if (vc == columnRsltRqmt_sno3_mng_typ) return doRsltRqmt_sno3_mng_typ_VC(info);
		if (vc == columnRsltRqmt_sno4_mng_typ) return doRsltRqmt_sno4_mng_typ_VC(info);
		if (vc == columnRsltRqmt_sno1_num_typ) return doRsltRqmt_sno1_num_typ_VC(info);
		if (vc == columnRsltRqmt_sno2_num_typ) return doRsltRqmt_sno2_num_typ_VC(info);
		if (vc == columnRsltRqmt_sno3_num_typ) return doRsltRqmt_sno3_num_typ_VC(info);
		if (vc == columnRsltRqmt_sno4_num_typ) return doRsltRqmt_sno4_num_typ_VC(info);
		if (vc == columnRsltRqmt_rqmt_sno1_flg) return doRsltRqmt_rqmt_sno1_flg_VC(info);
		if (vc == columnRsltRqmt_rqmt_sno2_flg) return doRsltRqmt_rqmt_sno2_flg_VC(info);
		if (vc == columnRsltRqmt_rqmt_sno3_flg) return doRsltRqmt_rqmt_sno3_flg_VC(info);
		if (vc == columnRsltRqmt_rqmt_sno4_flg) return doRsltRqmt_rqmt_sno4_flg_VC(info);
		if (vc == columnRsltRqmt_rqmt_typ) return doRsltRqmt_rqmt_typ_VC(info);
		if (vc == columnRsltRqmt_rqmt_typ_nm) return doRsltRqmt_rqmt_typ_nm_VC(info);
		if (vc == columnRsltRqmt_intr_rmrks) return doRsltRqmt_intr_rmrks_VC(info);
		if (vc == columnRsltRqmt_sub_char1) return doRsltRqmt_sub_char1_VC(info);
		if (vc == columnRsltRqmt_sub_char2) return doRsltRqmt_sub_char2_VC(info);
		if (vc == columnRsltRqmt_sub_char3) return doRsltRqmt_sub_char3_VC(info);
		if (vc == columnRsltRqmt_ins_usr_id) return doRsltRqmt_ins_usr_id_VC(info);
		if (vc == columnRsltRqmt_ins_usr_nm) return doRsltRqmt_ins_usr_nm_VC(info);
		if (vc == columnRsltRqmt_ins_func_id) return doRsltRqmt_ins_func_id_VC(info);
		if (vc == columnRsltRqmt_ins_func_nm) return doRsltRqmt_ins_func_nm_VC(info);
		if (vc == columnRsltRqmt_ins_ts) return doRsltRqmt_ins_ts_VC(info);
		if (vc == columnRsltRqmt_upd_usr_id) return doRsltRqmt_upd_usr_id_VC(info);
		if (vc == columnRsltRqmt_upd_usr_nm) return doRsltRqmt_upd_usr_nm_VC(info);
		if (vc == columnRsltRqmt_upd_func_id) return doRsltRqmt_upd_func_id_VC(info);
		if (vc == columnRsltRqmt_upd_func_nm) return doRsltRqmt_upd_func_nm_VC(info);
		if (vc == columnRsltRqmt_upd_ts) return doRsltRqmt_upd_ts_VC(info);
		if (vc == columnRsltRqmt_upd_srv_req_no) return doRsltRqmt_upd_srv_req_no_VC(info);
		if (vc == columnRsltRqmt_upd_cntr) return doRsltRqmt_upd_cntr_VC(info);
		if (vc == columnRsltRqmt_peg_no1) return doRsltRqmt_peg_no1_VC(info);
		if (vc == columnRsltRqmt_peg_no2) return doRsltRqmt_peg_no2_VC(info);
		if (vc == columnRsltRqmt_data_crud_typ) return doRsltRqmt_data_crud_typ_VC(info);
		if (vc == columnRsltRqmt_un_editable_flg) return doRsltRqmt_un_editable_flg_VC(info);
		return true;
	}

	/**
	 * [RsltSim]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sim_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_from]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_proc_dt_from_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_to]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_mrp_proc_dt_to_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[sim_mrp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sim_mrp_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_usr_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_usr_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[dly_rqmt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_dly_rqmt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[stk_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_stk_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[gr_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_gr_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[gi_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_gi_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ship_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ship_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[tree_lvl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_tree_lvl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[mrp_proc_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_mrp_proc_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[exp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_exp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_sim_mrp_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[peg_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_peg_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltSim]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltSim_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno_sprt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno_sprt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sim_mrp_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sim_mrp_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[due_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_due_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_strg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_strg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[site_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_site_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[site_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_site_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_strg_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_strg_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_mfg_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_mfg_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno1_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno1_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno2_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno2_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno3_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno3_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sno4_num_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sno4_num_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_rqmt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[intr_rmrks]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_intr_rmrks_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sub_char1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sub_char1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sub_char2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sub_char2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[sub_char3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_sub_char3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[peg_no1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_peg_no1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[peg_no2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_peg_no2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[data_crud_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_data_crud_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [RsltRqmt]パネルの[un_editable_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doRsltRqmt_un_editable_flg_VC(MCEventInfo info){
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
		if (nc == RsltSimTable) doRsltSim_NC(info);
		else if (nc == RsltRqmtTable) doRsltRqmt_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_sim_usr_cd) doCnd_sim_usr_cd_NC(info);
		else if (nc == Cnd_sim_usr_nm) doCnd_sim_usr_nm_NC(info);
		else if (nc == Cnd_mrp_proc_dt_from) doCnd_mrp_proc_dt_from_NC(info);
		else if (nc == Cnd_mrp_proc_dt_to) doCnd_mrp_proc_dt_to_NC(info);
		else if (nc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NC(info);
		else if (nc == Cnd_sim_mrp_typ) doCnd_sim_mrp_typ_NC(info);
		else if (nc == Cnd_sim_mrp_typ_nm) doCnd_sim_mrp_typ_nm_NC(info);
		else if (nc == Cnd_sim_mrp_intr_rmrks) doCnd_sim_mrp_intr_rmrks_NC(info);
		else if (nc == Cnd_sim_mrp_sub_char1) doCnd_sim_mrp_sub_char1_NC(info);
		else if (nc == Cnd_sim_mrp_sub_char2) doCnd_sim_mrp_sub_char2_NC(info);
		else if (nc == Cnd_sim_mrp_sub_char3) doCnd_sim_mrp_sub_char3_NC(info);
		else if (nc == columnRsltSim_check) doRsltSim_check_NC(info);
		else if (nc == columnRsltSim_sim_mrp_no) doRsltSim_sim_mrp_no_NC(info);
		else if (nc == columnRsltSim_wg_cd) doRsltSim_wg_cd_NC(info);
		else if (nc == columnRsltSim_wg_nm) doRsltSim_wg_nm_NC(info);
		else if (nc == columnRsltSim_sim_mrp_typ) doRsltSim_sim_mrp_typ_NC(info);
		else if (nc == columnRsltSim_sim_mrp_typ_nm) doRsltSim_sim_mrp_typ_nm_NC(info);
		else if (nc == columnRsltSim_sim_usr_cd) doRsltSim_sim_usr_cd_NC(info);
		else if (nc == columnRsltSim_sim_usr_nm) doRsltSim_sim_usr_nm_NC(info);
		else if (nc == columnRsltSim_dly_rqmt_flg) doRsltSim_dly_rqmt_flg_NC(info);
		else if (nc == columnRsltSim_stk_flg) doRsltSim_stk_flg_NC(info);
		else if (nc == columnRsltSim_gr_flg) doRsltSim_gr_flg_NC(info);
		else if (nc == columnRsltSim_gi_flg) doRsltSim_gi_flg_NC(info);
		else if (nc == columnRsltSim_ship_flg) doRsltSim_ship_flg_NC(info);
		else if (nc == columnRsltSim_tree_lvl) doRsltSim_tree_lvl_NC(info);
		else if (nc == columnRsltSim_mrp_proc_dt) doRsltSim_mrp_proc_dt_NC(info);
		else if (nc == columnRsltSim_exp_flg) doRsltSim_exp_flg_NC(info);
		else if (nc == columnRsltSim_sim_mrp_intr_rmrks) doRsltSim_sim_mrp_intr_rmrks_NC(info);
		else if (nc == columnRsltSim_sim_mrp_sub_char1) doRsltSim_sim_mrp_sub_char1_NC(info);
		else if (nc == columnRsltSim_sim_mrp_sub_char2) doRsltSim_sim_mrp_sub_char2_NC(info);
		else if (nc == columnRsltSim_sim_mrp_sub_char3) doRsltSim_sim_mrp_sub_char3_NC(info);
		else if (nc == columnRsltSim_ins_usr_id) doRsltSim_ins_usr_id_NC(info);
		else if (nc == columnRsltSim_ins_usr_nm) doRsltSim_ins_usr_nm_NC(info);
		else if (nc == columnRsltSim_ins_func_id) doRsltSim_ins_func_id_NC(info);
		else if (nc == columnRsltSim_ins_func_nm) doRsltSim_ins_func_nm_NC(info);
		else if (nc == columnRsltSim_ins_ts) doRsltSim_ins_ts_NC(info);
		else if (nc == columnRsltSim_upd_usr_id) doRsltSim_upd_usr_id_NC(info);
		else if (nc == columnRsltSim_upd_usr_nm) doRsltSim_upd_usr_nm_NC(info);
		else if (nc == columnRsltSim_upd_func_id) doRsltSim_upd_func_id_NC(info);
		else if (nc == columnRsltSim_upd_func_nm) doRsltSim_upd_func_nm_NC(info);
		else if (nc == columnRsltSim_upd_ts) doRsltSim_upd_ts_NC(info);
		else if (nc == columnRsltSim_upd_srv_req_no) doRsltSim_upd_srv_req_no_NC(info);
		else if (nc == columnRsltSim_upd_cntr) doRsltSim_upd_cntr_NC(info);
		else if (nc == columnRsltSim_peg_no1) doRsltSim_peg_no1_NC(info);
		else if (nc == columnRsltSim_data_crud_typ) doRsltSim_data_crud_typ_NC(info);
		else if (nc == columnRsltRqmt_check) doRsltRqmt_check_NC(info);
		else if (nc == columnRsltRqmt_sno_sprt_flg) doRsltRqmt_sno_sprt_flg_NC(info);
		else if (nc == columnRsltRqmt_rqmt_no) doRsltRqmt_rqmt_no_NC(info);
		else if (nc == columnRsltRqmt_sim_mrp_no) doRsltRqmt_sim_mrp_no_NC(info);
		else if (nc == columnRsltRqmt_due_dt) doRsltRqmt_due_dt_NC(info);
		else if (nc == columnRsltRqmt_strg_loc_cd) doRsltRqmt_strg_loc_cd_NC(info);
		else if (nc == columnRsltRqmt_strg_loc_nm) doRsltRqmt_strg_loc_nm_NC(info);
		else if (nc == columnRsltRqmt_site_cd) doRsltRqmt_site_cd_NC(info);
		else if (nc == columnRsltRqmt_site_nm) doRsltRqmt_site_nm_NC(info);
		else if (nc == columnRsltRqmt_wg_cd) doRsltRqmt_wg_cd_NC(info);
		else if (nc == columnRsltRqmt_wg_nm) doRsltRqmt_wg_nm_NC(info);
		else if (nc == columnRsltRqmt_strg_loc_grp_cd) doRsltRqmt_strg_loc_grp_cd_NC(info);
		else if (nc == columnRsltRqmt_strg_loc_grp_nm) doRsltRqmt_strg_loc_grp_nm_NC(info);
		else if (nc == columnRsltRqmt_unit_cd) doRsltRqmt_unit_cd_NC(info);
		else if (nc == columnRsltRqmt_unit_nm) doRsltRqmt_unit_nm_NC(info);
		else if (nc == columnRsltRqmt_dec_place) doRsltRqmt_dec_place_NC(info);
		else if (nc == columnRsltRqmt_mfg_loc_cd) doRsltRqmt_mfg_loc_cd_NC(info);
		else if (nc == columnRsltRqmt_mfg_loc_nm) doRsltRqmt_mfg_loc_nm_NC(info);
		else if (nc == columnRsltRqmt_sppl_cd) doRsltRqmt_sppl_cd_NC(info);
		else if (nc == columnRsltRqmt_sppl_nm) doRsltRqmt_sppl_nm_NC(info);
		else if (nc == columnRsltRqmt_rqst_loc_cd) doRsltRqmt_rqst_loc_cd_NC(info);
		else if (nc == columnRsltRqmt_rqst_loc_nm) doRsltRqmt_rqst_loc_nm_NC(info);
		else if (nc == columnRsltRqmt_rqst_wg_cd) doRsltRqmt_rqst_wg_cd_NC(info);
		else if (nc == columnRsltRqmt_rqst_wg_nm) doRsltRqmt_rqst_wg_nm_NC(info);
		else if (nc == columnRsltRqmt_sno1_mng_typ) doRsltRqmt_sno1_mng_typ_NC(info);
		else if (nc == columnRsltRqmt_sno2_mng_typ) doRsltRqmt_sno2_mng_typ_NC(info);
		else if (nc == columnRsltRqmt_sno3_mng_typ) doRsltRqmt_sno3_mng_typ_NC(info);
		else if (nc == columnRsltRqmt_sno4_mng_typ) doRsltRqmt_sno4_mng_typ_NC(info);
		else if (nc == columnRsltRqmt_sno1_num_typ) doRsltRqmt_sno1_num_typ_NC(info);
		else if (nc == columnRsltRqmt_sno2_num_typ) doRsltRqmt_sno2_num_typ_NC(info);
		else if (nc == columnRsltRqmt_sno3_num_typ) doRsltRqmt_sno3_num_typ_NC(info);
		else if (nc == columnRsltRqmt_sno4_num_typ) doRsltRqmt_sno4_num_typ_NC(info);
		else if (nc == columnRsltRqmt_rqmt_sno1_flg) doRsltRqmt_rqmt_sno1_flg_NC(info);
		else if (nc == columnRsltRqmt_rqmt_sno2_flg) doRsltRqmt_rqmt_sno2_flg_NC(info);
		else if (nc == columnRsltRqmt_rqmt_sno3_flg) doRsltRqmt_rqmt_sno3_flg_NC(info);
		else if (nc == columnRsltRqmt_rqmt_sno4_flg) doRsltRqmt_rqmt_sno4_flg_NC(info);
		else if (nc == columnRsltRqmt_rqmt_typ) doRsltRqmt_rqmt_typ_NC(info);
		else if (nc == columnRsltRqmt_rqmt_typ_nm) doRsltRqmt_rqmt_typ_nm_NC(info);
		else if (nc == columnRsltRqmt_intr_rmrks) doRsltRqmt_intr_rmrks_NC(info);
		else if (nc == columnRsltRqmt_sub_char1) doRsltRqmt_sub_char1_NC(info);
		else if (nc == columnRsltRqmt_sub_char2) doRsltRqmt_sub_char2_NC(info);
		else if (nc == columnRsltRqmt_sub_char3) doRsltRqmt_sub_char3_NC(info);
		else if (nc == columnRsltRqmt_ins_usr_id) doRsltRqmt_ins_usr_id_NC(info);
		else if (nc == columnRsltRqmt_ins_usr_nm) doRsltRqmt_ins_usr_nm_NC(info);
		else if (nc == columnRsltRqmt_ins_func_id) doRsltRqmt_ins_func_id_NC(info);
		else if (nc == columnRsltRqmt_ins_func_nm) doRsltRqmt_ins_func_nm_NC(info);
		else if (nc == columnRsltRqmt_ins_ts) doRsltRqmt_ins_ts_NC(info);
		else if (nc == columnRsltRqmt_upd_usr_id) doRsltRqmt_upd_usr_id_NC(info);
		else if (nc == columnRsltRqmt_upd_usr_nm) doRsltRqmt_upd_usr_nm_NC(info);
		else if (nc == columnRsltRqmt_upd_func_id) doRsltRqmt_upd_func_id_NC(info);
		else if (nc == columnRsltRqmt_upd_func_nm) doRsltRqmt_upd_func_nm_NC(info);
		else if (nc == columnRsltRqmt_upd_ts) doRsltRqmt_upd_ts_NC(info);
		else if (nc == columnRsltRqmt_upd_srv_req_no) doRsltRqmt_upd_srv_req_no_NC(info);
		else if (nc == columnRsltRqmt_upd_cntr) doRsltRqmt_upd_cntr_NC(info);
		else if (nc == columnRsltRqmt_peg_no1) doRsltRqmt_peg_no1_NC(info);
		else if (nc == columnRsltRqmt_peg_no2) doRsltRqmt_peg_no2_NC(info);
		else if (nc == columnRsltRqmt_data_crud_typ) doRsltRqmt_data_crud_typ_NC(info);
		else if (nc == columnRsltRqmt_un_editable_flg) doRsltRqmt_un_editable_flg_NC(info);
	}

	/**
	 * [RsltSim]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[sim_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_from]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_from_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_to]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_to_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_check_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[dly_rqmt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_dly_rqmt_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[stk_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_stk_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gr_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gr_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gi_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gi_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ship_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ship_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[tree_lvl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_tree_lvl_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[mrp_proc_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_mrp_proc_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[exp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_exp_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[peg_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_peg_no1_NC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_check_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno_sprt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno_sprt_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sim_mrp_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sim_mrp_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[due_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_due_dt_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_num_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_num_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[intr_rmrks]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_intr_rmrks_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char1_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char2_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char3_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no1_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no2_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[data_crud_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_data_crud_typ_NC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[un_editable_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_un_editable_flg_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == RsltSimTable) doRsltSim_NE(info);
		else if (ne == RsltRqmtTable) doRsltRqmt_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_sim_usr_cd) doCnd_sim_usr_cd_NE(info);
		else if (ne == Cnd_sim_usr_nm) doCnd_sim_usr_nm_NE(info);
		else if (ne == Cnd_mrp_proc_dt_from) doCnd_mrp_proc_dt_from_NE(info);
		else if (ne == Cnd_mrp_proc_dt_to) doCnd_mrp_proc_dt_to_NE(info);
		else if (ne == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NE(info);
		else if (ne == Cnd_sim_mrp_typ) doCnd_sim_mrp_typ_NE(info);
		else if (ne == Cnd_sim_mrp_typ_nm) doCnd_sim_mrp_typ_nm_NE(info);
		else if (ne == Cnd_sim_mrp_intr_rmrks) doCnd_sim_mrp_intr_rmrks_NE(info);
		else if (ne == Cnd_sim_mrp_sub_char1) doCnd_sim_mrp_sub_char1_NE(info);
		else if (ne == Cnd_sim_mrp_sub_char2) doCnd_sim_mrp_sub_char2_NE(info);
		else if (ne == Cnd_sim_mrp_sub_char3) doCnd_sim_mrp_sub_char3_NE(info);
		else if (ne == columnRsltSim_check) doRsltSim_check_NE(info);
		else if (ne == columnRsltSim_sim_mrp_no) doRsltSim_sim_mrp_no_NE(info);
		else if (ne == columnRsltSim_wg_cd) doRsltSim_wg_cd_NE(info);
		else if (ne == columnRsltSim_wg_nm) doRsltSim_wg_nm_NE(info);
		else if (ne == columnRsltSim_sim_mrp_typ) doRsltSim_sim_mrp_typ_NE(info);
		else if (ne == columnRsltSim_sim_mrp_typ_nm) doRsltSim_sim_mrp_typ_nm_NE(info);
		else if (ne == columnRsltSim_sim_usr_cd) doRsltSim_sim_usr_cd_NE(info);
		else if (ne == columnRsltSim_sim_usr_nm) doRsltSim_sim_usr_nm_NE(info);
		else if (ne == columnRsltSim_dly_rqmt_flg) doRsltSim_dly_rqmt_flg_NE(info);
		else if (ne == columnRsltSim_stk_flg) doRsltSim_stk_flg_NE(info);
		else if (ne == columnRsltSim_gr_flg) doRsltSim_gr_flg_NE(info);
		else if (ne == columnRsltSim_gi_flg) doRsltSim_gi_flg_NE(info);
		else if (ne == columnRsltSim_ship_flg) doRsltSim_ship_flg_NE(info);
		else if (ne == columnRsltSim_tree_lvl) doRsltSim_tree_lvl_NE(info);
		else if (ne == columnRsltSim_mrp_proc_dt) doRsltSim_mrp_proc_dt_NE(info);
		else if (ne == columnRsltSim_exp_flg) doRsltSim_exp_flg_NE(info);
		else if (ne == columnRsltSim_sim_mrp_intr_rmrks) doRsltSim_sim_mrp_intr_rmrks_NE(info);
		else if (ne == columnRsltSim_sim_mrp_sub_char1) doRsltSim_sim_mrp_sub_char1_NE(info);
		else if (ne == columnRsltSim_sim_mrp_sub_char2) doRsltSim_sim_mrp_sub_char2_NE(info);
		else if (ne == columnRsltSim_sim_mrp_sub_char3) doRsltSim_sim_mrp_sub_char3_NE(info);
		else if (ne == columnRsltSim_ins_usr_id) doRsltSim_ins_usr_id_NE(info);
		else if (ne == columnRsltSim_ins_usr_nm) doRsltSim_ins_usr_nm_NE(info);
		else if (ne == columnRsltSim_ins_func_id) doRsltSim_ins_func_id_NE(info);
		else if (ne == columnRsltSim_ins_func_nm) doRsltSim_ins_func_nm_NE(info);
		else if (ne == columnRsltSim_ins_ts) doRsltSim_ins_ts_NE(info);
		else if (ne == columnRsltSim_upd_usr_id) doRsltSim_upd_usr_id_NE(info);
		else if (ne == columnRsltSim_upd_usr_nm) doRsltSim_upd_usr_nm_NE(info);
		else if (ne == columnRsltSim_upd_func_id) doRsltSim_upd_func_id_NE(info);
		else if (ne == columnRsltSim_upd_func_nm) doRsltSim_upd_func_nm_NE(info);
		else if (ne == columnRsltSim_upd_ts) doRsltSim_upd_ts_NE(info);
		else if (ne == columnRsltSim_upd_srv_req_no) doRsltSim_upd_srv_req_no_NE(info);
		else if (ne == columnRsltSim_upd_cntr) doRsltSim_upd_cntr_NE(info);
		else if (ne == columnRsltSim_peg_no1) doRsltSim_peg_no1_NE(info);
		else if (ne == columnRsltSim_data_crud_typ) doRsltSim_data_crud_typ_NE(info);
		else if (ne == columnRsltRqmt_check) doRsltRqmt_check_NE(info);
		else if (ne == columnRsltRqmt_sno_sprt_flg) doRsltRqmt_sno_sprt_flg_NE(info);
		else if (ne == columnRsltRqmt_rqmt_no) doRsltRqmt_rqmt_no_NE(info);
		else if (ne == columnRsltRqmt_sim_mrp_no) doRsltRqmt_sim_mrp_no_NE(info);
		else if (ne == columnRsltRqmt_due_dt) doRsltRqmt_due_dt_NE(info);
		else if (ne == columnRsltRqmt_strg_loc_cd) doRsltRqmt_strg_loc_cd_NE(info);
		else if (ne == columnRsltRqmt_strg_loc_nm) doRsltRqmt_strg_loc_nm_NE(info);
		else if (ne == columnRsltRqmt_site_cd) doRsltRqmt_site_cd_NE(info);
		else if (ne == columnRsltRqmt_site_nm) doRsltRqmt_site_nm_NE(info);
		else if (ne == columnRsltRqmt_wg_cd) doRsltRqmt_wg_cd_NE(info);
		else if (ne == columnRsltRqmt_wg_nm) doRsltRqmt_wg_nm_NE(info);
		else if (ne == columnRsltRqmt_strg_loc_grp_cd) doRsltRqmt_strg_loc_grp_cd_NE(info);
		else if (ne == columnRsltRqmt_strg_loc_grp_nm) doRsltRqmt_strg_loc_grp_nm_NE(info);
		else if (ne == columnRsltRqmt_unit_cd) doRsltRqmt_unit_cd_NE(info);
		else if (ne == columnRsltRqmt_unit_nm) doRsltRqmt_unit_nm_NE(info);
		else if (ne == columnRsltRqmt_dec_place) doRsltRqmt_dec_place_NE(info);
		else if (ne == columnRsltRqmt_mfg_loc_cd) doRsltRqmt_mfg_loc_cd_NE(info);
		else if (ne == columnRsltRqmt_mfg_loc_nm) doRsltRqmt_mfg_loc_nm_NE(info);
		else if (ne == columnRsltRqmt_sppl_cd) doRsltRqmt_sppl_cd_NE(info);
		else if (ne == columnRsltRqmt_sppl_nm) doRsltRqmt_sppl_nm_NE(info);
		else if (ne == columnRsltRqmt_rqst_loc_cd) doRsltRqmt_rqst_loc_cd_NE(info);
		else if (ne == columnRsltRqmt_rqst_loc_nm) doRsltRqmt_rqst_loc_nm_NE(info);
		else if (ne == columnRsltRqmt_rqst_wg_cd) doRsltRqmt_rqst_wg_cd_NE(info);
		else if (ne == columnRsltRqmt_rqst_wg_nm) doRsltRqmt_rqst_wg_nm_NE(info);
		else if (ne == columnRsltRqmt_sno1_mng_typ) doRsltRqmt_sno1_mng_typ_NE(info);
		else if (ne == columnRsltRqmt_sno2_mng_typ) doRsltRqmt_sno2_mng_typ_NE(info);
		else if (ne == columnRsltRqmt_sno3_mng_typ) doRsltRqmt_sno3_mng_typ_NE(info);
		else if (ne == columnRsltRqmt_sno4_mng_typ) doRsltRqmt_sno4_mng_typ_NE(info);
		else if (ne == columnRsltRqmt_sno1_num_typ) doRsltRqmt_sno1_num_typ_NE(info);
		else if (ne == columnRsltRqmt_sno2_num_typ) doRsltRqmt_sno2_num_typ_NE(info);
		else if (ne == columnRsltRqmt_sno3_num_typ) doRsltRqmt_sno3_num_typ_NE(info);
		else if (ne == columnRsltRqmt_sno4_num_typ) doRsltRqmt_sno4_num_typ_NE(info);
		else if (ne == columnRsltRqmt_rqmt_sno1_flg) doRsltRqmt_rqmt_sno1_flg_NE(info);
		else if (ne == columnRsltRqmt_rqmt_sno2_flg) doRsltRqmt_rqmt_sno2_flg_NE(info);
		else if (ne == columnRsltRqmt_rqmt_sno3_flg) doRsltRqmt_rqmt_sno3_flg_NE(info);
		else if (ne == columnRsltRqmt_rqmt_sno4_flg) doRsltRqmt_rqmt_sno4_flg_NE(info);
		else if (ne == columnRsltRqmt_rqmt_typ) doRsltRqmt_rqmt_typ_NE(info);
		else if (ne == columnRsltRqmt_rqmt_typ_nm) doRsltRqmt_rqmt_typ_nm_NE(info);
		else if (ne == columnRsltRqmt_intr_rmrks) doRsltRqmt_intr_rmrks_NE(info);
		else if (ne == columnRsltRqmt_sub_char1) doRsltRqmt_sub_char1_NE(info);
		else if (ne == columnRsltRqmt_sub_char2) doRsltRqmt_sub_char2_NE(info);
		else if (ne == columnRsltRqmt_sub_char3) doRsltRqmt_sub_char3_NE(info);
		else if (ne == columnRsltRqmt_ins_usr_id) doRsltRqmt_ins_usr_id_NE(info);
		else if (ne == columnRsltRqmt_ins_usr_nm) doRsltRqmt_ins_usr_nm_NE(info);
		else if (ne == columnRsltRqmt_ins_func_id) doRsltRqmt_ins_func_id_NE(info);
		else if (ne == columnRsltRqmt_ins_func_nm) doRsltRqmt_ins_func_nm_NE(info);
		else if (ne == columnRsltRqmt_ins_ts) doRsltRqmt_ins_ts_NE(info);
		else if (ne == columnRsltRqmt_upd_usr_id) doRsltRqmt_upd_usr_id_NE(info);
		else if (ne == columnRsltRqmt_upd_usr_nm) doRsltRqmt_upd_usr_nm_NE(info);
		else if (ne == columnRsltRqmt_upd_func_id) doRsltRqmt_upd_func_id_NE(info);
		else if (ne == columnRsltRqmt_upd_func_nm) doRsltRqmt_upd_func_nm_NE(info);
		else if (ne == columnRsltRqmt_upd_ts) doRsltRqmt_upd_ts_NE(info);
		else if (ne == columnRsltRqmt_upd_srv_req_no) doRsltRqmt_upd_srv_req_no_NE(info);
		else if (ne == columnRsltRqmt_upd_cntr) doRsltRqmt_upd_cntr_NE(info);
		else if (ne == columnRsltRqmt_peg_no1) doRsltRqmt_peg_no1_NE(info);
		else if (ne == columnRsltRqmt_peg_no2) doRsltRqmt_peg_no2_NE(info);
		else if (ne == columnRsltRqmt_data_crud_typ) doRsltRqmt_data_crud_typ_NE(info);
		else if (ne == columnRsltRqmt_un_editable_flg) doRsltRqmt_un_editable_flg_NE(info);
	}

	/**
	 * [RsltSim]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[sim_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_from]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_from_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_to]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_to_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_check_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[dly_rqmt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_dly_rqmt_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[stk_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_stk_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gr_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gr_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gi_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gi_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ship_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ship_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[tree_lvl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_tree_lvl_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[mrp_proc_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_mrp_proc_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[exp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_exp_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[peg_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_peg_no1_NE(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_check_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno_sprt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno_sprt_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sim_mrp_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sim_mrp_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[due_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_due_dt_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_num_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_num_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[intr_rmrks]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_intr_rmrks_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char1_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char2_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char3_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no1_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no2_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[data_crud_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_data_crud_typ_NE(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[un_editable_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_un_editable_flg_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == RsltSimTable) doRsltSim_NX(info);
		else if (nx == RsltRqmtTable) doRsltRqmt_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_sim_usr_cd) doCnd_sim_usr_cd_NX(info);
		else if (nx == Cnd_sim_usr_nm) doCnd_sim_usr_nm_NX(info);
		else if (nx == Cnd_mrp_proc_dt_from) doCnd_mrp_proc_dt_from_NX(info);
		else if (nx == Cnd_mrp_proc_dt_to) doCnd_mrp_proc_dt_to_NX(info);
		else if (nx == Cnd_sim_mrp_no) doCnd_sim_mrp_no_NX(info);
		else if (nx == Cnd_sim_mrp_typ) doCnd_sim_mrp_typ_NX(info);
		else if (nx == Cnd_sim_mrp_typ_nm) doCnd_sim_mrp_typ_nm_NX(info);
		else if (nx == Cnd_sim_mrp_intr_rmrks) doCnd_sim_mrp_intr_rmrks_NX(info);
		else if (nx == Cnd_sim_mrp_sub_char1) doCnd_sim_mrp_sub_char1_NX(info);
		else if (nx == Cnd_sim_mrp_sub_char2) doCnd_sim_mrp_sub_char2_NX(info);
		else if (nx == Cnd_sim_mrp_sub_char3) doCnd_sim_mrp_sub_char3_NX(info);
		else if (nx == columnRsltSim_check) doRsltSim_check_NX(info);
		else if (nx == columnRsltSim_sim_mrp_no) doRsltSim_sim_mrp_no_NX(info);
		else if (nx == columnRsltSim_wg_cd) doRsltSim_wg_cd_NX(info);
		else if (nx == columnRsltSim_wg_nm) doRsltSim_wg_nm_NX(info);
		else if (nx == columnRsltSim_sim_mrp_typ) doRsltSim_sim_mrp_typ_NX(info);
		else if (nx == columnRsltSim_sim_mrp_typ_nm) doRsltSim_sim_mrp_typ_nm_NX(info);
		else if (nx == columnRsltSim_sim_usr_cd) doRsltSim_sim_usr_cd_NX(info);
		else if (nx == columnRsltSim_sim_usr_nm) doRsltSim_sim_usr_nm_NX(info);
		else if (nx == columnRsltSim_dly_rqmt_flg) doRsltSim_dly_rqmt_flg_NX(info);
		else if (nx == columnRsltSim_stk_flg) doRsltSim_stk_flg_NX(info);
		else if (nx == columnRsltSim_gr_flg) doRsltSim_gr_flg_NX(info);
		else if (nx == columnRsltSim_gi_flg) doRsltSim_gi_flg_NX(info);
		else if (nx == columnRsltSim_ship_flg) doRsltSim_ship_flg_NX(info);
		else if (nx == columnRsltSim_tree_lvl) doRsltSim_tree_lvl_NX(info);
		else if (nx == columnRsltSim_mrp_proc_dt) doRsltSim_mrp_proc_dt_NX(info);
		else if (nx == columnRsltSim_exp_flg) doRsltSim_exp_flg_NX(info);
		else if (nx == columnRsltSim_sim_mrp_intr_rmrks) doRsltSim_sim_mrp_intr_rmrks_NX(info);
		else if (nx == columnRsltSim_sim_mrp_sub_char1) doRsltSim_sim_mrp_sub_char1_NX(info);
		else if (nx == columnRsltSim_sim_mrp_sub_char2) doRsltSim_sim_mrp_sub_char2_NX(info);
		else if (nx == columnRsltSim_sim_mrp_sub_char3) doRsltSim_sim_mrp_sub_char3_NX(info);
		else if (nx == columnRsltSim_ins_usr_id) doRsltSim_ins_usr_id_NX(info);
		else if (nx == columnRsltSim_ins_usr_nm) doRsltSim_ins_usr_nm_NX(info);
		else if (nx == columnRsltSim_ins_func_id) doRsltSim_ins_func_id_NX(info);
		else if (nx == columnRsltSim_ins_func_nm) doRsltSim_ins_func_nm_NX(info);
		else if (nx == columnRsltSim_ins_ts) doRsltSim_ins_ts_NX(info);
		else if (nx == columnRsltSim_upd_usr_id) doRsltSim_upd_usr_id_NX(info);
		else if (nx == columnRsltSim_upd_usr_nm) doRsltSim_upd_usr_nm_NX(info);
		else if (nx == columnRsltSim_upd_func_id) doRsltSim_upd_func_id_NX(info);
		else if (nx == columnRsltSim_upd_func_nm) doRsltSim_upd_func_nm_NX(info);
		else if (nx == columnRsltSim_upd_ts) doRsltSim_upd_ts_NX(info);
		else if (nx == columnRsltSim_upd_srv_req_no) doRsltSim_upd_srv_req_no_NX(info);
		else if (nx == columnRsltSim_upd_cntr) doRsltSim_upd_cntr_NX(info);
		else if (nx == columnRsltSim_peg_no1) doRsltSim_peg_no1_NX(info);
		else if (nx == columnRsltSim_data_crud_typ) doRsltSim_data_crud_typ_NX(info);
		else if (nx == columnRsltRqmt_check) doRsltRqmt_check_NX(info);
		else if (nx == columnRsltRqmt_sno_sprt_flg) doRsltRqmt_sno_sprt_flg_NX(info);
		else if (nx == columnRsltRqmt_rqmt_no) doRsltRqmt_rqmt_no_NX(info);
		else if (nx == columnRsltRqmt_sim_mrp_no) doRsltRqmt_sim_mrp_no_NX(info);
		else if (nx == columnRsltRqmt_due_dt) doRsltRqmt_due_dt_NX(info);
		else if (nx == columnRsltRqmt_strg_loc_cd) doRsltRqmt_strg_loc_cd_NX(info);
		else if (nx == columnRsltRqmt_strg_loc_nm) doRsltRqmt_strg_loc_nm_NX(info);
		else if (nx == columnRsltRqmt_site_cd) doRsltRqmt_site_cd_NX(info);
		else if (nx == columnRsltRqmt_site_nm) doRsltRqmt_site_nm_NX(info);
		else if (nx == columnRsltRqmt_wg_cd) doRsltRqmt_wg_cd_NX(info);
		else if (nx == columnRsltRqmt_wg_nm) doRsltRqmt_wg_nm_NX(info);
		else if (nx == columnRsltRqmt_strg_loc_grp_cd) doRsltRqmt_strg_loc_grp_cd_NX(info);
		else if (nx == columnRsltRqmt_strg_loc_grp_nm) doRsltRqmt_strg_loc_grp_nm_NX(info);
		else if (nx == columnRsltRqmt_unit_cd) doRsltRqmt_unit_cd_NX(info);
		else if (nx == columnRsltRqmt_unit_nm) doRsltRqmt_unit_nm_NX(info);
		else if (nx == columnRsltRqmt_dec_place) doRsltRqmt_dec_place_NX(info);
		else if (nx == columnRsltRqmt_mfg_loc_cd) doRsltRqmt_mfg_loc_cd_NX(info);
		else if (nx == columnRsltRqmt_mfg_loc_nm) doRsltRqmt_mfg_loc_nm_NX(info);
		else if (nx == columnRsltRqmt_sppl_cd) doRsltRqmt_sppl_cd_NX(info);
		else if (nx == columnRsltRqmt_sppl_nm) doRsltRqmt_sppl_nm_NX(info);
		else if (nx == columnRsltRqmt_rqst_loc_cd) doRsltRqmt_rqst_loc_cd_NX(info);
		else if (nx == columnRsltRqmt_rqst_loc_nm) doRsltRqmt_rqst_loc_nm_NX(info);
		else if (nx == columnRsltRqmt_rqst_wg_cd) doRsltRqmt_rqst_wg_cd_NX(info);
		else if (nx == columnRsltRqmt_rqst_wg_nm) doRsltRqmt_rqst_wg_nm_NX(info);
		else if (nx == columnRsltRqmt_sno1_mng_typ) doRsltRqmt_sno1_mng_typ_NX(info);
		else if (nx == columnRsltRqmt_sno2_mng_typ) doRsltRqmt_sno2_mng_typ_NX(info);
		else if (nx == columnRsltRqmt_sno3_mng_typ) doRsltRqmt_sno3_mng_typ_NX(info);
		else if (nx == columnRsltRqmt_sno4_mng_typ) doRsltRqmt_sno4_mng_typ_NX(info);
		else if (nx == columnRsltRqmt_sno1_num_typ) doRsltRqmt_sno1_num_typ_NX(info);
		else if (nx == columnRsltRqmt_sno2_num_typ) doRsltRqmt_sno2_num_typ_NX(info);
		else if (nx == columnRsltRqmt_sno3_num_typ) doRsltRqmt_sno3_num_typ_NX(info);
		else if (nx == columnRsltRqmt_sno4_num_typ) doRsltRqmt_sno4_num_typ_NX(info);
		else if (nx == columnRsltRqmt_rqmt_sno1_flg) doRsltRqmt_rqmt_sno1_flg_NX(info);
		else if (nx == columnRsltRqmt_rqmt_sno2_flg) doRsltRqmt_rqmt_sno2_flg_NX(info);
		else if (nx == columnRsltRqmt_rqmt_sno3_flg) doRsltRqmt_rqmt_sno3_flg_NX(info);
		else if (nx == columnRsltRqmt_rqmt_sno4_flg) doRsltRqmt_rqmt_sno4_flg_NX(info);
		else if (nx == columnRsltRqmt_rqmt_typ) doRsltRqmt_rqmt_typ_NX(info);
		else if (nx == columnRsltRqmt_rqmt_typ_nm) doRsltRqmt_rqmt_typ_nm_NX(info);
		else if (nx == columnRsltRqmt_intr_rmrks) doRsltRqmt_intr_rmrks_NX(info);
		else if (nx == columnRsltRqmt_sub_char1) doRsltRqmt_sub_char1_NX(info);
		else if (nx == columnRsltRqmt_sub_char2) doRsltRqmt_sub_char2_NX(info);
		else if (nx == columnRsltRqmt_sub_char3) doRsltRqmt_sub_char3_NX(info);
		else if (nx == columnRsltRqmt_ins_usr_id) doRsltRqmt_ins_usr_id_NX(info);
		else if (nx == columnRsltRqmt_ins_usr_nm) doRsltRqmt_ins_usr_nm_NX(info);
		else if (nx == columnRsltRqmt_ins_func_id) doRsltRqmt_ins_func_id_NX(info);
		else if (nx == columnRsltRqmt_ins_func_nm) doRsltRqmt_ins_func_nm_NX(info);
		else if (nx == columnRsltRqmt_ins_ts) doRsltRqmt_ins_ts_NX(info);
		else if (nx == columnRsltRqmt_upd_usr_id) doRsltRqmt_upd_usr_id_NX(info);
		else if (nx == columnRsltRqmt_upd_usr_nm) doRsltRqmt_upd_usr_nm_NX(info);
		else if (nx == columnRsltRqmt_upd_func_id) doRsltRqmt_upd_func_id_NX(info);
		else if (nx == columnRsltRqmt_upd_func_nm) doRsltRqmt_upd_func_nm_NX(info);
		else if (nx == columnRsltRqmt_upd_ts) doRsltRqmt_upd_ts_NX(info);
		else if (nx == columnRsltRqmt_upd_srv_req_no) doRsltRqmt_upd_srv_req_no_NX(info);
		else if (nx == columnRsltRqmt_upd_cntr) doRsltRqmt_upd_cntr_NX(info);
		else if (nx == columnRsltRqmt_peg_no1) doRsltRqmt_peg_no1_NX(info);
		else if (nx == columnRsltRqmt_peg_no2) doRsltRqmt_peg_no2_NX(info);
		else if (nx == columnRsltRqmt_data_crud_typ) doRsltRqmt_data_crud_typ_NX(info);
		else if (nx == columnRsltRqmt_un_editable_flg) doRsltRqmt_un_editable_flg_NX(info);
	}

	/**
	 * [RsltSim]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[sim_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_from]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_from_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_to]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_to_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_check_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[dly_rqmt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_dly_rqmt_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[stk_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_stk_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gr_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gr_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[gi_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_gi_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ship_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ship_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[tree_lvl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_tree_lvl_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[mrp_proc_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_mrp_proc_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[exp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_exp_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[peg_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_peg_no1_NX(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_check_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno_sprt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno_sprt_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sim_mrp_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sim_mrp_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[due_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_due_dt_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_num_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_num_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[intr_rmrks]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_intr_rmrks_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char1_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char2_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char3_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no1_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no2_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[data_crud_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_data_crud_typ_NX(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[un_editable_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_un_editable_flg_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_sim_usr_cd) doCnd_sim_usr_cd_LC(info);
		else if (lc == Cnd_sim_usr_nm) doCnd_sim_usr_nm_LC(info);
		else if (lc == Cnd_mrp_proc_dt_from) doCnd_mrp_proc_dt_from_LC(info);
		else if (lc == Cnd_mrp_proc_dt_to) doCnd_mrp_proc_dt_to_LC(info);
		else if (lc == Cnd_sim_mrp_no) doCnd_sim_mrp_no_LC(info);
		else if (lc == Cnd_sim_mrp_typ) doCnd_sim_mrp_typ_LC(info);
		else if (lc == Cnd_sim_mrp_typ_nm) doCnd_sim_mrp_typ_nm_LC(info);
		else if (lc == Cnd_sim_mrp_intr_rmrks) doCnd_sim_mrp_intr_rmrks_LC(info);
		else if (lc == Cnd_sim_mrp_sub_char1) doCnd_sim_mrp_sub_char1_LC(info);
		else if (lc == Cnd_sim_mrp_sub_char2) doCnd_sim_mrp_sub_char2_LC(info);
		else if (lc == Cnd_sim_mrp_sub_char3) doCnd_sim_mrp_sub_char3_LC(info);
		else if (lc == columnRsltSim_sim_mrp_no) doRsltSim_sim_mrp_no_LC(info);
		else if (lc == columnRsltSim_wg_cd) doRsltSim_wg_cd_LC(info);
		else if (lc == columnRsltSim_wg_nm) doRsltSim_wg_nm_LC(info);
		else if (lc == columnRsltSim_sim_mrp_typ) doRsltSim_sim_mrp_typ_LC(info);
		else if (lc == columnRsltSim_sim_mrp_typ_nm) doRsltSim_sim_mrp_typ_nm_LC(info);
		else if (lc == columnRsltSim_sim_usr_cd) doRsltSim_sim_usr_cd_LC(info);
		else if (lc == columnRsltSim_sim_usr_nm) doRsltSim_sim_usr_nm_LC(info);
		else if (lc == columnRsltSim_tree_lvl) doRsltSim_tree_lvl_LC(info);
		else if (lc == columnRsltSim_mrp_proc_dt) doRsltSim_mrp_proc_dt_LC(info);
		else if (lc == columnRsltSim_sim_mrp_intr_rmrks) doRsltSim_sim_mrp_intr_rmrks_LC(info);
		else if (lc == columnRsltSim_sim_mrp_sub_char1) doRsltSim_sim_mrp_sub_char1_LC(info);
		else if (lc == columnRsltSim_sim_mrp_sub_char2) doRsltSim_sim_mrp_sub_char2_LC(info);
		else if (lc == columnRsltSim_sim_mrp_sub_char3) doRsltSim_sim_mrp_sub_char3_LC(info);
		else if (lc == columnRsltSim_ins_usr_id) doRsltSim_ins_usr_id_LC(info);
		else if (lc == columnRsltSim_ins_usr_nm) doRsltSim_ins_usr_nm_LC(info);
		else if (lc == columnRsltSim_ins_func_id) doRsltSim_ins_func_id_LC(info);
		else if (lc == columnRsltSim_ins_func_nm) doRsltSim_ins_func_nm_LC(info);
		else if (lc == columnRsltSim_ins_ts) doRsltSim_ins_ts_LC(info);
		else if (lc == columnRsltSim_upd_usr_id) doRsltSim_upd_usr_id_LC(info);
		else if (lc == columnRsltSim_upd_usr_nm) doRsltSim_upd_usr_nm_LC(info);
		else if (lc == columnRsltSim_upd_func_id) doRsltSim_upd_func_id_LC(info);
		else if (lc == columnRsltSim_upd_func_nm) doRsltSim_upd_func_nm_LC(info);
		else if (lc == columnRsltSim_upd_ts) doRsltSim_upd_ts_LC(info);
		else if (lc == columnRsltSim_upd_srv_req_no) doRsltSim_upd_srv_req_no_LC(info);
		else if (lc == columnRsltSim_upd_cntr) doRsltSim_upd_cntr_LC(info);
		else if (lc == columnRsltSim_peg_no1) doRsltSim_peg_no1_LC(info);
		else if (lc == columnRsltSim_data_crud_typ) doRsltSim_data_crud_typ_LC(info);
		else if (lc == columnRsltRqmt_rqmt_no) doRsltRqmt_rqmt_no_LC(info);
		else if (lc == columnRsltRqmt_sim_mrp_no) doRsltRqmt_sim_mrp_no_LC(info);
		else if (lc == columnRsltRqmt_due_dt) doRsltRqmt_due_dt_LC(info);
		else if (lc == columnRsltRqmt_strg_loc_cd) doRsltRqmt_strg_loc_cd_LC(info);
		else if (lc == columnRsltRqmt_strg_loc_nm) doRsltRqmt_strg_loc_nm_LC(info);
		else if (lc == columnRsltRqmt_site_cd) doRsltRqmt_site_cd_LC(info);
		else if (lc == columnRsltRqmt_site_nm) doRsltRqmt_site_nm_LC(info);
		else if (lc == columnRsltRqmt_wg_cd) doRsltRqmt_wg_cd_LC(info);
		else if (lc == columnRsltRqmt_wg_nm) doRsltRqmt_wg_nm_LC(info);
		else if (lc == columnRsltRqmt_strg_loc_grp_cd) doRsltRqmt_strg_loc_grp_cd_LC(info);
		else if (lc == columnRsltRqmt_strg_loc_grp_nm) doRsltRqmt_strg_loc_grp_nm_LC(info);
		else if (lc == columnRsltRqmt_unit_cd) doRsltRqmt_unit_cd_LC(info);
		else if (lc == columnRsltRqmt_unit_nm) doRsltRqmt_unit_nm_LC(info);
		else if (lc == columnRsltRqmt_dec_place) doRsltRqmt_dec_place_LC(info);
		else if (lc == columnRsltRqmt_mfg_loc_cd) doRsltRqmt_mfg_loc_cd_LC(info);
		else if (lc == columnRsltRqmt_mfg_loc_nm) doRsltRqmt_mfg_loc_nm_LC(info);
		else if (lc == columnRsltRqmt_sppl_cd) doRsltRqmt_sppl_cd_LC(info);
		else if (lc == columnRsltRqmt_sppl_nm) doRsltRqmt_sppl_nm_LC(info);
		else if (lc == columnRsltRqmt_rqst_loc_cd) doRsltRqmt_rqst_loc_cd_LC(info);
		else if (lc == columnRsltRqmt_rqst_loc_nm) doRsltRqmt_rqst_loc_nm_LC(info);
		else if (lc == columnRsltRqmt_rqst_wg_cd) doRsltRqmt_rqst_wg_cd_LC(info);
		else if (lc == columnRsltRqmt_rqst_wg_nm) doRsltRqmt_rqst_wg_nm_LC(info);
		else if (lc == columnRsltRqmt_sno1_mng_typ) doRsltRqmt_sno1_mng_typ_LC(info);
		else if (lc == columnRsltRqmt_sno2_mng_typ) doRsltRqmt_sno2_mng_typ_LC(info);
		else if (lc == columnRsltRqmt_sno3_mng_typ) doRsltRqmt_sno3_mng_typ_LC(info);
		else if (lc == columnRsltRqmt_sno4_mng_typ) doRsltRqmt_sno4_mng_typ_LC(info);
		else if (lc == columnRsltRqmt_sno1_num_typ) doRsltRqmt_sno1_num_typ_LC(info);
		else if (lc == columnRsltRqmt_sno2_num_typ) doRsltRqmt_sno2_num_typ_LC(info);
		else if (lc == columnRsltRqmt_sno3_num_typ) doRsltRqmt_sno3_num_typ_LC(info);
		else if (lc == columnRsltRqmt_sno4_num_typ) doRsltRqmt_sno4_num_typ_LC(info);
		else if (lc == columnRsltRqmt_rqmt_typ) doRsltRqmt_rqmt_typ_LC(info);
		else if (lc == columnRsltRqmt_rqmt_typ_nm) doRsltRqmt_rqmt_typ_nm_LC(info);
		else if (lc == columnRsltRqmt_intr_rmrks) doRsltRqmt_intr_rmrks_LC(info);
		else if (lc == columnRsltRqmt_sub_char1) doRsltRqmt_sub_char1_LC(info);
		else if (lc == columnRsltRqmt_sub_char2) doRsltRqmt_sub_char2_LC(info);
		else if (lc == columnRsltRqmt_sub_char3) doRsltRqmt_sub_char3_LC(info);
		else if (lc == columnRsltRqmt_ins_usr_id) doRsltRqmt_ins_usr_id_LC(info);
		else if (lc == columnRsltRqmt_ins_usr_nm) doRsltRqmt_ins_usr_nm_LC(info);
		else if (lc == columnRsltRqmt_ins_func_id) doRsltRqmt_ins_func_id_LC(info);
		else if (lc == columnRsltRqmt_ins_func_nm) doRsltRqmt_ins_func_nm_LC(info);
		else if (lc == columnRsltRqmt_ins_ts) doRsltRqmt_ins_ts_LC(info);
		else if (lc == columnRsltRqmt_upd_usr_id) doRsltRqmt_upd_usr_id_LC(info);
		else if (lc == columnRsltRqmt_upd_usr_nm) doRsltRqmt_upd_usr_nm_LC(info);
		else if (lc == columnRsltRqmt_upd_func_id) doRsltRqmt_upd_func_id_LC(info);
		else if (lc == columnRsltRqmt_upd_func_nm) doRsltRqmt_upd_func_nm_LC(info);
		else if (lc == columnRsltRqmt_upd_ts) doRsltRqmt_upd_ts_LC(info);
		else if (lc == columnRsltRqmt_upd_srv_req_no) doRsltRqmt_upd_srv_req_no_LC(info);
		else if (lc == columnRsltRqmt_upd_cntr) doRsltRqmt_upd_cntr_LC(info);
		else if (lc == columnRsltRqmt_peg_no1) doRsltRqmt_peg_no1_LC(info);
		else if (lc == columnRsltRqmt_peg_no2) doRsltRqmt_peg_no2_LC(info);
		else if (lc == columnRsltRqmt_data_crud_typ) doRsltRqmt_data_crud_typ_LC(info);
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
	 * [Cnd]パネルの[sim_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_from]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_from_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[mrp_proc_dt_to]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_mrp_proc_dt_to_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_no_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sim_mrp_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sim_mrp_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[tree_lvl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_tree_lvl_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[mrp_proc_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_mrp_proc_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[sim_mrp_sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_sim_mrp_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[peg_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_peg_no1_LC(MCEventInfo info){
	}

	/**
	 * [RsltSim]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltSim_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sim_mrp_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sim_mrp_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[due_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_due_dt_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[site_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_site_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[strg_loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_strg_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[mfg_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_mfg_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno1_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno1_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno2_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno2_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno3_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno3_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sno4_num_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sno4_num_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[rqmt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_rqmt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[intr_rmrks]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_intr_rmrks_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char1_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char2_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[sub_char3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_sub_char3_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no1_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[peg_no2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_peg_no2_LC(MCEventInfo info){
	}

	/**
	 * [RsltRqmt]パネルの[data_crud_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doRsltRqmt_data_crud_typ_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sim_usr_cd]の作成メソッド
	 */
	public MCList getCnd_sim_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sim_mrp_typ]の作成メソッド
	 */
	public MCList getCnd_sim_mrp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSimMrpTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltSim_wg_cd]の作成メソッド
	 */
	public MCList getRsltSim_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltSim_sim_mrp_typ]の作成メソッド
	 */
	public MCList getRsltSim_sim_mrp_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0010.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0010.MSUAP_List", this)).getSimMrpTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltSim_sim_usr_cd]の作成メソッド
	 */
	public MCList getRsltSim_sim_usr_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getUsr(row, info);
	}

	/**
	 * コンボ／リストのリスト[RsltRqmt_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[RsltRqmt_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[RsltRqmt_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[RsltRqmt_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getRsltRqmt_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltRqmt_strg_loc_cd]の作成メソッド
	 */
	public MCList getRsltRqmt_strg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltRqmt_mfg_loc_cd]の作成メソッド
	 */
	public MCList getRsltRqmt_mfg_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlMfgLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltRqmt_sppl_cd]の作成メソッド
	 */
	public MCList getRsltRqmt_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlSppl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltRqmt_rqst_loc_cd]の作成メソッド
	 */
	public MCList getRsltRqmt_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMSUA.MSUAP0040.MSUAP_List)MCListLogic.create("mcframe.clientMSUA.MSUAP0040.MSUAP_List", this)).getItmDtlRqstLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnRsltRqmt_rqmt_typ]の作成メソッド
	 */
	public MCList getRsltRqmt_rqmt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRqmtTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MS.MSBCL0150.Srch01")) {
			return new MS_MSBCL0150_Srch01Bridge();
		}
		if (id.equals("MS.MSBCL0150.Sprt01")) {
			return new MS_MSBCL0150_Sprt01Bridge();
		}
		if (id.equals("MS.MSBCL0150.Imp01")) {
			return new MS_MSBCL0150_Imp01Bridge();
		}
		if (id.equals("MS.MSBCL0150.Upd01")) {
			return new MS_MSBCL0150_Upd01Bridge();
		}
		if (id.equals("MS.MSBCL0150.Del01")) {
			return new MS_MSBCL0150_Del01Bridge();
		}
		if (id.equals("MS.MSBCL0150.Upd02")) {
			return new MS_MSBCL0150_Upd02Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MS_MSBCL0150_Srch01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Srch01;

		/** コンストラクタ */
		protected MS_MSBCL0150_Srch01Bridge() {
			p_MS_MSBCL0150_Srch01 = new MCParam(PDef.MS_MSBCL0150_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMSBC.MSBCP0150.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));

			p_MS_MSBCL0150_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMSBC.MSBCP0150.CndR up0() {
			return (mcframe.clientMSBC.MSBCP0150.CndR)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			p_MS_MSBCL0150_Srch01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Srch01;
		}

		protected void show() {
			setRsltSimL((MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)p_MS_MSBCL0150_Srch01.getContainerParam().getDownBlock(0));
			setRsltRqmtL((MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)p_MS_MSBCL0150_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltSimL().clear();
			getRsltRqmtL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			result.add(getRsltRqmtL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0150_Sprt01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Sprt01;

		/** コンストラクタ */
		protected MS_MSBCL0150_Sprt01Bridge() {
			p_MS_MSBCL0150_Sprt01 = new MCParam(PDef.MS_MSBCL0150_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));

			p_MS_MSBCL0150_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Sprt01.addUpBlock(getRsltRqmtL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0150_Sprt01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Sprt01;
		}

		protected void show() {
			setRsltRqmtL((MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)p_MS_MSBCL0150_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltRqmtL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltRqmtL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltRqmtL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0150_Imp01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Imp01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Imp01;

		/** コンストラクタ */
		protected MS_MSBCL0150_Imp01Bridge() {
			p_MS_MSBCL0150_Imp01 = new MCParam(PDef.MS_MSBCL0150_Imp01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Imp01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));

			p_MS_MSBCL0150_Imp01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Imp01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Imp01.addUpBlock(getRsltRqmtL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Imp01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Imp01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0150_Imp01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Imp01;
		}

		protected void show() {
			setRsltRqmtL((MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)p_MS_MSBCL0150_Imp01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltRqmtL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltRqmtL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltRqmtL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0150_Upd01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Upd01;

		/** コンストラクタ */
		protected MS_MSBCL0150_Upd01Bridge() {
			p_MS_MSBCL0150_Upd01 = new MCParam(PDef.MS_MSBCL0150_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));

			p_MS_MSBCL0150_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Upd01.addUpBlock(getRsltSimL().shallowClone());
			p_MS_MSBCL0150_Upd01.addUpBlock(getRsltRqmtL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)up(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> up1() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)up(1);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)down(0);
		}
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR> down1() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)down(1);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0150_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			p_MS_MSBCL0150_Upd01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltRqmtR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Upd01;
		}

		protected void show() {
			setRsltSimL((MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)p_MS_MSBCL0150_Upd01.getContainerParam().getDownBlock(0));
			setRsltRqmtL((MCList<mcframe.clientMSBC.MSBCP0150.RsltRqmtR>)p_MS_MSBCL0150_Upd01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getRsltSimL().clear();
			getRsltRqmtL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			result.add(getRsltRqmtL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			result.add(getRsltRqmtL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0150_Del01]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Del01;

		/** コンストラクタ */
		protected MS_MSBCL0150_Del01Bridge() {
			p_MS_MSBCL0150_Del01 = new MCParam(PDef.MS_MSBCL0150_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));

			p_MS_MSBCL0150_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Del01.addUpBlock(getRsltSimL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)up(0);
		}

		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> down0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)down(0);
		}

		protected void setupDownParam() {
			p_MS_MSBCL0150_Del01.addDownBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Del01;
		}

		protected void show() {
			setRsltSimL((MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)p_MS_MSBCL0150_Del01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getRsltSimL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			return result;
		}
	}
	/**
	 * [MS_MSBCL0150_Upd02]の定型処理のInnerClass
	 */
	protected class MS_MSBCL0150_Upd02Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MS_MSBCL0150_Upd02;

		/** コンストラクタ */
		protected MS_MSBCL0150_Upd02Bridge() {
			p_MS_MSBCL0150_Upd02 = new MCParam(PDef.MS_MSBCL0150_Upd02_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MS_MSBCL0150_Upd02_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMSBC.MSBCP0150.RsltSimR.class));
			// Down

			p_MS_MSBCL0150_Upd02 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MS_MSBCL0150_Upd02.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MS_MSBCL0150_Upd02.addUpBlock(getRsltSimL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MS_MSBCL0150_Upd02.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MS_MSBCL0150_Upd02.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR> up0() {
			return (MCList<mcframe.clientMSBC.MSBCP0150.RsltSimR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MS_MSBCL0150_Upd02;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getRsltSimL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}