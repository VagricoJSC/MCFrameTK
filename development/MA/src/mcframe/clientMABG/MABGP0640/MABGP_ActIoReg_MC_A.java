package mcframe.clientMABG.MABGP0640;

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
import mcframe.clientMABG.MABGP0640.MABGP_ActIoReg_MC.MA_MABGL0640_Srch01Caller;
import mcframe.clientMABG.MABGP0640.MABGP_ActIoReg_MC.MA_MABGL0640_Sprt01Caller;
import mcframe.clientMABG.MABGP0640.MABGP_ActIoReg_MC.MA_MABGL0640_Upd01Caller;
import mcframe.clientMABG.MABGP0640.MABGP_ActIoReg_MC.MA_MABGL0640_Del01Caller;

/**
 * 画面"MABGP_ActIoReg"パネルクラスです。<p>
 *
 * 入出庫実績振替マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_ActIoReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
	/** 
	 * モジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getModuleID()}を使用してください。
	 */
	public static final String MODULE_ID = "MA";
	/** 
	 * サブモジュールID<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getSubmoduleID()}を使用してください。
	 */
	public static final String SUBMODULE_ID = "MABG";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABGP0640";

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
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_p_PPanel;
	public MCDateField Cnd_dt;	// [Cnd]の[dt_p.dt]を[Cnd_dt]としてエイリアス定義。
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt_p.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt_p.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt_p.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt_p.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_calc_ctg_cd_Label = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCTextField Cnd_calc_ctg_nm = null;
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
	public MCLabel Cnd_ac_slip_typ_Label = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCTextField Cnd_ac_slip_typ_nm = null;
	public MCLabel Cnd_itm_jnl_cd_Label = null;
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCTextField Cnd_itm_jnl_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_itm_jnl_flg = null;
	public MCLabel Cnd_ac_rsn_cd_Label = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCTextField Cnd_ac_rsn_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_ac_rsn_flg = null;
	public MCLabel Cnd_tgt_dpt_cd_Label = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_tgt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCTextField Cnd_tgt_dpt_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_tgt_dpt_flg = null;
	public MCLabel Cnd_tgt_loc_cd_Label = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_tgt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCTextField Cnd_tgt_loc_nm = null;
	/**
	 * Null 無.<p>
	 *
	 */
	public MCCheckBox Cnd_no_tgt_loc_flg = null;
	public MCLabel Cnd_io_trans_typ_Label = null;
	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_io_trans_typ = null;
	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public MCTextField Cnd_io_trans_typ_nm = null;
	public MCLabel Cnd_memo1_Label = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCTextField Cnd_memo1 = null;
	public MCLabel Cnd_memo2_Label = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCTextField Cnd_memo2 = null;
	public MCLabel Cnd_memo3_Label = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCTextField Cnd_memo3 = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCLabel Cnd_del_flg_lab = null;
	/**
	 * Logical delete. Off 論理削除.オフ.<p>
	 *
	 */
	public MCCheckBox Cnd_off_del_flg = null;
	/**
	 * Logical delete. On 論理削除.オン.<p>
	 *
	 */
	public MCCheckBox Cnd_on_del_flg = null;
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
	// [Bottom]ブロック関連のField定義
	public MCPanel BottomPanel = null;
	// [Bottom]ブロックの項目のField定義
	// [BulkSet]ブロック関連のField定義
	public MCPanel BulkSetPanel = null;
	// [BulkSet]ブロックの項目のField定義
	public MCLabel BulkSet_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField BulkSet_st_dt = null;
	public MCLabel BulkSet_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField BulkSet_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton BulkSet_set_dt = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0640.DtlR> DtlTable = null;
	// [Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnDtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_flg = null;
	/**
	 * Calculation category cd. 計算カテゴリＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_cd = null;
	/**
	 * Calculation category name 計算カテゴリ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_calc_ctg_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_nm = null;
	/**
	 * Accounting slip type 会計伝票区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ = null;
	/**
	 * Accounting slip type name 会計伝票区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_slip_typ_nm = null;
	/**
	 * Priority 優先順位.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prio = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_cd = null;
	/**
	 * Item journal name 品目仕訳名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_jnl_nm = null;
	/**
	 * Accounting reason cd. 会計理由ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_cd = null;
	/**
	 * Accounting reason name 会計理由名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_nm = null;
	/**
	 * No accounting reason 会計理由無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ac_rsn_null_flg = null;
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tgt_dpt_cd = null;
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tgt_dpt_nm = null;
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tgt_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_tgt_loc_nm = null;
	/**
	 * Without Location 場所無.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_null_flg = null;
	/**
	 * GR/GI transfer type 入出庫振替区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_trans_typ = null;
	/**
	 * GR/GI transfer type name 入出庫振替区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_io_trans_typ_nm = null;
	/**
	 * Allocation account cd. 配賦科目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_cd = null;
	/**
	 * Allocation account name 配賦科目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_nm = null;
	/**
	 * Transfer allocation 配賦振替.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_amt_flg = null;
	/**
	 * Allocation WG cd. 配賦ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_wg_cd = null;
	/**
	 * Allocation WG name 配賦ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_wg_nm = null;
	/**
	 * Copy dept. 部門引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_flg = null;
	/**
	 * Allocation destination dept. cd. 配賦先部門ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_cd = null;
	/**
	 * Allocation destination dept. name 配賦先部門名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dpt_nm = null;
	/**
	 * Location copy 場所引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_flg = null;
	/**
	 * Allocation destination location cd. 配賦先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_cd = null;
	/**
	 * Allocation destination location name 配賦先場所名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_loc_nm = null;
	/**
	 * Operation copy 工程引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_flg = null;
	/**
	 * Allocation destination operation cd. 配賦先工程ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_cd = null;
	/**
	 * Allocation destination operation name 配賦先工程名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_oper_nm = null;
	/**
	 * BP copy 取引先引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_flg = null;
	/**
	 * Allocation destination BP cd. 配賦先取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_cd = null;
	/**
	 * Allocation destination BP name 配賦先取引先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bp_nm = null;
	/**
	 * Item category copy 品群引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_flg = null;
	/**
	 * Allocation destination item category cd. 配賦先品群ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_cd = null;
	/**
	 * Allocation destination item category name 配賦先品群名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ctg_nm = null;
	/**
	 * Item copy 品目引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_itm_p_PPanel;
	public MCColumnConfig columnDtl_itm_cd;// [Dtl]の[itm_p.itm_cd]を[columnDtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub1;// [Dtl]の[itm_p.itm_sub1]を[columnDtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub2;// [Dtl]の[itm_p.itm_sub2]を[columnDtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_sub3;// [Dtl]の[itm_p.itm_sub3]を[columnDtl_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_itm_nm;// [Dtl]の[itm_p.itm_nm]を[columnDtl_itm_nm]としてエイリアス定義。
	/**
	 * Lot No. copy ロットＮＯ引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no_flg = null;
	/**
	 * Allocation destination lot No. 配賦先ロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_no = null;
	/**
	 * Sublot No. copy サブロットＮＯ引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no_flg = null;
	/**
	 * Allocation destination sublot No. 配賦先サブロットＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sublot_no = null;
	/**
	 * Copy SEIBAN No. 1 手配ＮＯ１引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1_flg = null;
	/**
	 * Allocation destination SEIBAN No. 1 配賦先手配ＮＯ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno1 = null;
	/**
	 * Copy SEIBAN No. 2 手配ＮＯ２引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2_flg = null;
	/**
	 * Allocation destination SEIBAN No. 2 配賦先手配ＮＯ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno2 = null;
	/**
	 * Copy SEIBAN No. 3 手配ＮＯ３引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3_flg = null;
	/**
	 * Allocation destination SEIBAN No. 3 配賦先手配ＮＯ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno3 = null;
	/**
	 * Copy SEIBAN No. 4 手配ＮＯ４引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4_flg = null;
	/**
	 * Allocation destination SEIBAN No. 4 配賦先手配ＮＯ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sno4 = null;
	/**
	 * Item order No. copy 品目指図ＮＯ引継.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_mfg_inst_no_flg = null;
	/**
	 * Input location type 1 投入場所区分１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ1 = null;
	/**
	 * Input location type 1 name 投入場所区分１名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ1_nm = null;
	/**
	 * Input location type 2 投入場所区分２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ2 = null;
	/**
	 * Input location type 2 name 投入場所区分２名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ2_nm = null;
	/**
	 * Input location type 3 投入場所区分３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ3 = null;
	/**
	 * Input location type 3 name 投入場所区分３名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_inpt_loc_typ3_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnDtl_del_ts = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Correct overlapping period 重複期間補正.<p>
	 *
	 */
	public MCButton Btn_correct_dup_dt = null;
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
	public MCButton Btn_upd = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, FIX, DEL, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABGL0640_Srch01]のCallerの作成 */
	protected MABGP_ActIoReg_MC.MA_MABGL0640_Srch01Caller createMA_MABGL0640_Srch01() {
		MABGP_ActIoReg_MC.MA_MABGL0640_Srch01Caller<MABGP_ActIoReg, MA_MABGL0640_Srch01Bridge>
		caller = ((MABGP_ActIoReg_MC)this).new MA_MABGL0640_Srch01Caller<MABGP_ActIoReg, MA_MABGL0640_Srch01Bridge>(
					(MABGP_ActIoReg)this, new MA_MABGL0640_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0640_Srch01]の呼び出し */
	protected void callMA_MABGL0640_Srch01() {
		MCCaller caller = createMA_MABGL0640_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0640_Sprt01]のCallerの作成 */
	protected MABGP_ActIoReg_MC.MA_MABGL0640_Sprt01Caller createMA_MABGL0640_Sprt01() {
		MABGP_ActIoReg_MC.MA_MABGL0640_Sprt01Caller<MABGP_ActIoReg, MA_MABGL0640_Sprt01Bridge>
		caller = ((MABGP_ActIoReg_MC)this).new MA_MABGL0640_Sprt01Caller<MABGP_ActIoReg, MA_MABGL0640_Sprt01Bridge>(
					(MABGP_ActIoReg)this, new MA_MABGL0640_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABGL0640_Sprt01]の呼び出し */
	protected void callMA_MABGL0640_Sprt01() {
		MCCaller caller = createMA_MABGL0640_Sprt01();
		caller.exec();
	}
	/** [MA_MABGL0640_Upd01]のCallerの作成 */
	protected MABGP_ActIoReg_MC.MA_MABGL0640_Upd01Caller createMA_MABGL0640_Upd01() {
		MABGP_ActIoReg_MC.MA_MABGL0640_Upd01Caller<MABGP_ActIoReg, MA_MABGL0640_Upd01Bridge>
		caller = ((MABGP_ActIoReg_MC)this).new MA_MABGL0640_Upd01Caller<MABGP_ActIoReg, MA_MABGL0640_Upd01Bridge>(
					(MABGP_ActIoReg)this, new MA_MABGL0640_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0640_Upd01]の呼び出し */
	protected void callMA_MABGL0640_Upd01() {
		MCCaller caller = createMA_MABGL0640_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0640_Del01]のCallerの作成 */
	protected MABGP_ActIoReg_MC.MA_MABGL0640_Del01Caller createMA_MABGL0640_Del01() {
		MABGP_ActIoReg_MC.MA_MABGL0640_Del01Caller<MABGP_ActIoReg, MA_MABGL0640_Del01Bridge>
		caller = ((MABGP_ActIoReg_MC)this).new MA_MABGL0640_Del01Caller<MABGP_ActIoReg, MA_MABGL0640_Del01Bridge>(
					(MABGP_ActIoReg)this, new MA_MABGL0640_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0640_Del01]の呼び出し */
	protected void callMA_MABGL0640_Del01() {
		MCCaller caller = createMA_MABGL0640_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0640.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0640.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0640.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0640.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0640.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0640.CndR createCndR() {
		return mcframe.clientMABG.MABGP0640.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABG.MABGP0640.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABG.MABGP0640.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABG.MABGP0640.BulkSetR createBulkSetR() {
		return mcframe.clientMABG.MABGP0640.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0640.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0640.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0640.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0640.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0640.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class);
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
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getBulkSetR())) ret.add(getBulkSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
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
		if(aCnt == getDtlL()) return "Dtl";
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
		if(bId.equals("Dtl")) return getDtlL();
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
		ret.add(BottomPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_ActIoReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_ActIoReg_MC_A(String name) {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_ActIoReg_MC.jbCreateScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateTop((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateFold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateCnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateCtrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateBottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateBulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateDtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateBtn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbCreateEastBtn((MABGP_ActIoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_ActIoReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABGP_ActIoReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABGP_ActIoReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_ActIoReg p) {
		p.Cnd_dt_p_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt_p());
		p.Cnd_dt_p_PPanel.setName("Cnd.dt_p");
		p.Cnd_dt = p.Cnd_dt_p_PPanel.StEndDt_dt;
		p.Cnd_dt.addAliasName("Cnd.dt", p);
		p.Cnd_st_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_p_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_p_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_p_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABGP_ActIoReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Bottom]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBottom(MABGP_ActIoReg p) {
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABGP_ActIoReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_ActIoReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABG.MABGP0640.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
		p.Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABG.MABGP0640.DtlR.$itm_p);
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
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_ActIoReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_ActIoReg p) {
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

	
	/** [Cnd_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Cnd_calc_ctg_cd_p = null;

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_calc_ctg_cd_ListPutter() {
		if (Cnd_calc_ctg_cd_p == null) {
			Cnd_calc_ctg_cd_p = createCnd_calc_ctg_cd_ListPutter(Cnd_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Cnd_calc_ctg_cd_p;
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
	
	
	/** [Cnd_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Cnd_ac_slip_typ_p = null;

	/**
	 * [Cnd_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_slip_typ_ListPutter() {
		if (Cnd_ac_slip_typ_p == null) {
			Cnd_ac_slip_typ_p = createCnd_ac_slip_typ_ListPutter(Cnd_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Cnd_ac_slip_typ_p;
	}
	
	
	/** [Cnd_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Cnd_itm_jnl_cd_p = null;

	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_itm_jnl_cd_ListPutter() {
		if (Cnd_itm_jnl_cd_p == null) {
			Cnd_itm_jnl_cd_p = createCnd_itm_jnl_cd_ListPutter(Cnd_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Cnd_itm_jnl_cd_p;
	}
	
	
	/** [Cnd_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_ac_rsn_cd_p = null;

	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_ac_rsn_cd_ListPutter() {
		if (Cnd_ac_rsn_cd_p == null) {
			Cnd_ac_rsn_cd_p = createCnd_ac_rsn_cd_ListPutter(Cnd_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Cnd_ac_rsn_cd_p;
	}
	
	
	/** [Cnd_tgt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tgt_dpt_cd_p = null;

	/**
	 * [Cnd_tgt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tgt_dpt_cd_ListPutter() {
		if (Cnd_tgt_dpt_cd_p == null) {
			Cnd_tgt_dpt_cd_p = createCnd_tgt_dpt_cd_ListPutter(Cnd_tgt_dpt_cd, "tgt_dpt_cd", "tgt_dpt_nm");

		}
		return Cnd_tgt_dpt_cd_p;
	}
	
	
	/** [Cnd_tgt_loc_cd_ListPutter]の定義 */
	private MCListPutter Cnd_tgt_loc_cd_p = null;

	/**
	 * [Cnd_tgt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_tgt_loc_cd_ListPutter() {
		if (Cnd_tgt_loc_cd_p == null) {
			Cnd_tgt_loc_cd_p = createCnd_tgt_loc_cd_ListPutter(Cnd_tgt_loc_cd, "tgt_loc_cd", "tgt_loc_nm");

		}
		return Cnd_tgt_loc_cd_p;
	}
	
	
	/** [Cnd_io_trans_typ_ListPutter]の定義 */
	private MCListPutter Cnd_io_trans_typ_p = null;

	/**
	 * [Cnd_io_trans_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_io_trans_typ_ListPutter() {
		if (Cnd_io_trans_typ_p == null) {
			Cnd_io_trans_typ_p = createCnd_io_trans_typ_ListPutter(Cnd_io_trans_typ, "io_trans_typ", "io_trans_typ_nm");

		}
		return Cnd_io_trans_typ_p;
	}
	
	
	/** [Dtl_calc_ctg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_calc_ctg_cd_p = null;

	/**
	 * [Dtl_calc_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_calc_ctg_cd_ListPutter() {
		if (Dtl_calc_ctg_cd_p == null) {
			Dtl_calc_ctg_cd_p = createDtl_calc_ctg_cd_ListPutter(columnDtl_calc_ctg_cd, "calc_ctg_cd", "calc_ctg_nm");

		}
		return Dtl_calc_ctg_cd_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_ac_slip_typ_ListPutter]の定義 */
	private MCListPutter Dtl_ac_slip_typ_p = null;

	/**
	 * [Dtl_ac_slip_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_slip_typ_ListPutter() {
		if (Dtl_ac_slip_typ_p == null) {
			Dtl_ac_slip_typ_p = createDtl_ac_slip_typ_ListPutter(columnDtl_ac_slip_typ, "ac_slip_typ", "ac_slip_typ_nm");

		}
		return Dtl_ac_slip_typ_p;
	}
	
	
	/** [Dtl_itm_jnl_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_jnl_cd_p = null;

	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_jnl_cd_ListPutter() {
		if (Dtl_itm_jnl_cd_p == null) {
			Dtl_itm_jnl_cd_p = createDtl_itm_jnl_cd_ListPutter(columnDtl_itm_jnl_cd, "itm_jnl_cd", "itm_jnl_nm");

		}
		return Dtl_itm_jnl_cd_p;
	}
	
	
	/** [Dtl_ac_rsn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ac_rsn_cd_p = null;

	/**
	 * [Dtl_ac_rsn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ac_rsn_cd_ListPutter() {
		if (Dtl_ac_rsn_cd_p == null) {
			Dtl_ac_rsn_cd_p = createDtl_ac_rsn_cd_ListPutter(columnDtl_ac_rsn_cd, "ac_rsn_cd", "ac_rsn_nm");

		}
		return Dtl_ac_rsn_cd_p;
	}
	
	
	/** [Dtl_tgt_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_tgt_dpt_cd_p = null;

	/**
	 * [Dtl_tgt_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_tgt_dpt_cd_ListPutter() {
		if (Dtl_tgt_dpt_cd_p == null) {
			Dtl_tgt_dpt_cd_p = createDtl_tgt_dpt_cd_ListPutter(columnDtl_tgt_dpt_cd, "tgt_dpt_cd", "tgt_dpt_nm");

		}
		return Dtl_tgt_dpt_cd_p;
	}
	
	
	/** [Dtl_tgt_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_tgt_loc_cd_p = null;

	/**
	 * [Dtl_tgt_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_tgt_loc_cd_ListPutter() {
		if (Dtl_tgt_loc_cd_p == null) {
			Dtl_tgt_loc_cd_p = createDtl_tgt_loc_cd_ListPutter(columnDtl_tgt_loc_cd, "tgt_loc_cd", "tgt_loc_nm");

		}
		return Dtl_tgt_loc_cd_p;
	}
	
	
	/** [Dtl_io_trans_typ_ListPutter]の定義 */
	private MCListPutter Dtl_io_trans_typ_p = null;

	/**
	 * [Dtl_io_trans_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_io_trans_typ_ListPutter() {
		if (Dtl_io_trans_typ_p == null) {
			Dtl_io_trans_typ_p = createDtl_io_trans_typ_ListPutter(columnDtl_io_trans_typ, "io_trans_typ", "io_trans_typ_nm");

		}
		return Dtl_io_trans_typ_p;
	}
	
	
	/** [Dtl_alc_ac_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ac_cd_p = null;

	/**
	 * [Dtl_alc_ac_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ac_cd_ListPutter() {
		if (Dtl_alc_ac_cd_p == null) {
			Dtl_alc_ac_cd_p = createDtl_alc_ac_cd_ListPutter(columnDtl_alc_ac_cd, "alc_ac_cd", "alc_ac_nm");

		}
		return Dtl_alc_ac_cd_p;
	}
	
	
	/** [Dtl_alc_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_alc_wg_cd_p = null;

	/**
	 * [Dtl_alc_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_wg_cd_ListPutter() {
		if (Dtl_alc_wg_cd_p == null) {
			Dtl_alc_wg_cd_p = createDtl_alc_wg_cd_ListPutter(columnDtl_alc_wg_cd, "alc_wg_cd", "alc_wg_nm");

		}
		return Dtl_alc_wg_cd_p;
	}
	
	
	/** [Dtl_dpt_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dpt_cd_p = null;

	/**
	 * [Dtl_dpt_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dpt_cd_ListPutter() {
		if (Dtl_dpt_cd_p == null) {
			Dtl_dpt_cd_p = createDtl_dpt_cd_ListPutter(columnDtl_dpt_cd, "dpt_cd", "dpt_nm");

		}
		return Dtl_dpt_cd_p;
	}
	
	
	/** [Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Dtl_loc_cd_p = null;

	/**
	 * [Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_loc_cd_ListPutter() {
		if (Dtl_loc_cd_p == null) {
			Dtl_loc_cd_p = createDtl_loc_cd_ListPutter(columnDtl_loc_cd, "loc_cd", "loc_nm");

		}
		return Dtl_loc_cd_p;
	}
	
	
	/** [Dtl_oper_cd_ListPutter]の定義 */
	private MCListPutter Dtl_oper_cd_p = null;

	/**
	 * [Dtl_oper_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_oper_cd_ListPutter() {
		if (Dtl_oper_cd_p == null) {
			Dtl_oper_cd_p = createDtl_oper_cd_ListPutter(columnDtl_oper_cd, "oper_cd", "oper_nm");

		}
		return Dtl_oper_cd_p;
	}
	
	
	/** [Dtl_bp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_bp_cd_p = null;

	/**
	 * [Dtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_bp_cd_ListPutter() {
		if (Dtl_bp_cd_p == null) {
			Dtl_bp_cd_p = createDtl_bp_cd_ListPutter(columnDtl_bp_cd, "bp_cd", "bp_nm");

		}
		return Dtl_bp_cd_p;
	}
	
	
	/** [Dtl_ctg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_ctg_cd_p = null;

	/**
	 * [Dtl_ctg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_ctg_cd_ListPutter() {
		if (Dtl_ctg_cd_p == null) {
			Dtl_ctg_cd_p = createDtl_ctg_cd_ListPutter(columnDtl_ctg_cd, "ctg_cd", "ctg_nm");

		}
		return Dtl_ctg_cd_p;
	}
	
	
	/** [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_itm_p_PPanel_columnItm_itm_cd_p = createDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_cd, "itm_cd", "itm_nm","itm_sub1","itm_sub2","itm_sub3");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub1, "itm_sub1", "itm_nm","itm_sub2","itm_sub3");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub2, "itm_sub2", "itm_nm","itm_sub3");
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
			Dtl_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_itm_p_PPanel.columnItm_itm_sub3, "itm_sub3", "itm_nm");
		}
		return Dtl_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	
	
	/** [Dtl_inpt_loc_typ1_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_loc_typ1_p = null;

	/**
	 * [Dtl_inpt_loc_typ1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_loc_typ1_ListPutter() {
		if (Dtl_inpt_loc_typ1_p == null) {
			Dtl_inpt_loc_typ1_p = createDtl_inpt_loc_typ1_ListPutter(columnDtl_inpt_loc_typ1, "inpt_loc_typ1", "inpt_loc_typ1_nm");

		}
		return Dtl_inpt_loc_typ1_p;
	}
	
	
	/** [Dtl_inpt_loc_typ2_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_loc_typ2_p = null;

	/**
	 * [Dtl_inpt_loc_typ2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_loc_typ2_ListPutter() {
		if (Dtl_inpt_loc_typ2_p == null) {
			Dtl_inpt_loc_typ2_p = createDtl_inpt_loc_typ2_ListPutter(columnDtl_inpt_loc_typ2, "inpt_loc_typ2", "inpt_loc_typ2_nm");

		}
		return Dtl_inpt_loc_typ2_p;
	}
	
	
	/** [Dtl_inpt_loc_typ3_ListPutter]の定義 */
	private MCListPutter Dtl_inpt_loc_typ3_p = null;

	/**
	 * [Dtl_inpt_loc_typ3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_inpt_loc_typ3_ListPutter() {
		if (Dtl_inpt_loc_typ3_p == null) {
			Dtl_inpt_loc_typ3_p = createDtl_inpt_loc_typ3_ListPutter(columnDtl_inpt_loc_typ3, "inpt_loc_typ3", "inpt_loc_typ3_nm");

		}
		return Dtl_inpt_loc_typ3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_ActIoReg create(){
		MABGP_ActIoReg p = new MABGP_ActIoReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_ActIoReg create(String name){
		MABGP_ActIoReg p = new MABGP_ActIoReg(name);
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
		MABGP_ActIoReg_MC.jbfInitScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitTop((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitFold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitCnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitCtrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitBottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitBulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitDtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitBtn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbfInitEastBtn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitTop((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitFold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitCnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitCtrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitBottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitBulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitDtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitBtn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.jbInitEastBtn((MABGP_ActIoReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_calc_ctg_cd_Label = p.beansFactory.createLabel("Cnd.calc_ctg_cd_Label");
		p.Cnd_calc_ctg_cd = p.beansFactory.createTextComboBox("Cnd.calc_ctg_cd");
		p.Cnd_calc_ctg_cd.setLabel(p.Cnd_calc_ctg_cd_Label);
		p.Cnd_calc_ctg_nm = p.beansFactory.createTextField("Cnd.calc_ctg_nm");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_ac_slip_typ_Label = p.beansFactory.createLabel("Cnd.ac_slip_typ_Label");
		p.Cnd_ac_slip_typ = p.beansFactory.createTextComboBox("Cnd.ac_slip_typ");
		p.Cnd_ac_slip_typ.setLabel(p.Cnd_ac_slip_typ_Label);
		p.Cnd_ac_slip_typ_nm = p.beansFactory.createTextField("Cnd.ac_slip_typ_nm");
		p.Cnd_itm_jnl_cd_Label = p.beansFactory.createLabel("Cnd.itm_jnl_cd_Label");
		p.Cnd_itm_jnl_cd = p.beansFactory.createTextComboBox("Cnd.itm_jnl_cd");
		p.Cnd_itm_jnl_cd.setLabel(p.Cnd_itm_jnl_cd_Label);
		p.Cnd_itm_jnl_nm = p.beansFactory.createTextField("Cnd.itm_jnl_nm");
		p.Cnd_no_itm_jnl_flg = p.beansFactory.createCheckBox("Cnd.no_itm_jnl_flg");
		p.Cnd_ac_rsn_cd_Label = p.beansFactory.createLabel("Cnd.ac_rsn_cd_Label");
		p.Cnd_ac_rsn_cd = p.beansFactory.createTextComboBox("Cnd.ac_rsn_cd");
		p.Cnd_ac_rsn_cd.setLabel(p.Cnd_ac_rsn_cd_Label);
		p.Cnd_ac_rsn_nm = p.beansFactory.createTextField("Cnd.ac_rsn_nm");
		p.Cnd_no_ac_rsn_flg = p.beansFactory.createCheckBox("Cnd.no_ac_rsn_flg");
		p.Cnd_tgt_dpt_cd_Label = p.beansFactory.createLabel("Cnd.tgt_dpt_cd_Label");
		p.Cnd_tgt_dpt_cd = p.beansFactory.createTextComboBox("Cnd.tgt_dpt_cd");
		p.Cnd_tgt_dpt_cd.setLabel(p.Cnd_tgt_dpt_cd_Label);
		p.Cnd_tgt_dpt_nm = p.beansFactory.createTextField("Cnd.tgt_dpt_nm");
		p.Cnd_no_tgt_dpt_flg = p.beansFactory.createCheckBox("Cnd.no_tgt_dpt_flg");
		p.Cnd_tgt_loc_cd_Label = p.beansFactory.createLabel("Cnd.tgt_loc_cd_Label");
		p.Cnd_tgt_loc_cd = p.beansFactory.createTextField("Cnd.tgt_loc_cd");
		p.Cnd_tgt_loc_cd.setLabel(p.Cnd_tgt_loc_cd_Label);
		p.Cnd_tgt_loc_nm = p.beansFactory.createTextField("Cnd.tgt_loc_nm");
		p.Cnd_no_tgt_loc_flg = p.beansFactory.createCheckBox("Cnd.no_tgt_loc_flg");
		p.Cnd_io_trans_typ_Label = p.beansFactory.createLabel("Cnd.io_trans_typ_Label");
		p.Cnd_io_trans_typ = p.beansFactory.createTextComboBox("Cnd.io_trans_typ");
		p.Cnd_io_trans_typ.setLabel(p.Cnd_io_trans_typ_Label);
		p.Cnd_io_trans_typ_nm = p.beansFactory.createTextField("Cnd.io_trans_typ_nm");
		p.Cnd_memo1_Label = p.beansFactory.createLabel("Cnd.memo1_Label");
		p.Cnd_memo1 = p.beansFactory.createTextField("Cnd.memo1");
		p.Cnd_memo1.setLabel(p.Cnd_memo1_Label);
		p.Cnd_memo2_Label = p.beansFactory.createLabel("Cnd.memo2_Label");
		p.Cnd_memo2 = p.beansFactory.createTextField("Cnd.memo2");
		p.Cnd_memo2.setLabel(p.Cnd_memo2_Label);
		p.Cnd_memo3_Label = p.beansFactory.createLabel("Cnd.memo3_Label");
		p.Cnd_memo3 = p.beansFactory.createTextField("Cnd.memo3");
		p.Cnd_memo3.setLabel(p.Cnd_memo3_Label);
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBottom(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.BottomPanel = p.beansFactory.createPanel("Bottom");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel = p.beansFactory.createPanel("BulkSet");
		// ブロックの項目の初期化
		p.BulkSet_st_dt_Label = p.beansFactory.createLabel("BulkSet.st_dt_Label");
		p.BulkSet_st_dt = p.beansFactory.createDateField("BulkSet.st_dt");
		p.BulkSet_st_dt.setLabel(p.BulkSet_st_dt_Label);
		p.BulkSet_end_dt_Label = p.beansFactory.createLabel("BulkSet.end_dt_Label");
		p.BulkSet_end_dt = p.beansFactory.createDateField("BulkSet.end_dt");
		p.BulkSet_end_dt.setLabel(p.BulkSet_end_dt_Label);
		p.BulkSet_set_dt = p.beansFactory.createButton("BulkSet.set_dt");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_calc_ctg_cd = p.beansFactory.createTableColumn("Dtl.calc_ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_calc_ctg_nm = p.beansFactory.createTableColumn("Dtl.calc_ctg_nm", MCColumnType.TEXT);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_wg_nm = p.beansFactory.createTableColumn("Dtl.wg_nm", MCColumnType.TEXT);
		p.columnDtl_ac_slip_typ = p.beansFactory.createTableColumn("Dtl.ac_slip_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("Dtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnDtl_prio = p.beansFactory.createTableColumn("Dtl.prio", MCColumnType.NUMBER);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_ac_rsn_cd = p.beansFactory.createTableColumn("Dtl.ac_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_rsn_nm = p.beansFactory.createTableColumn("Dtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_ac_rsn_null_flg = p.beansFactory.createTableColumn("Dtl.ac_rsn_null_flg", MCColumnType.CHECK);
		p.columnDtl_tgt_dpt_cd = p.beansFactory.createTableColumn("Dtl.tgt_dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_tgt_dpt_nm = p.beansFactory.createTableColumn("Dtl.tgt_dpt_nm", MCColumnType.TEXT);
		p.columnDtl_tgt_loc_cd = p.beansFactory.createTableColumn("Dtl.tgt_loc_cd", MCColumnType.TEXT);
		p.columnDtl_tgt_loc_nm = p.beansFactory.createTableColumn("Dtl.tgt_loc_nm", MCColumnType.TEXT);
		p.columnDtl_loc_null_flg = p.beansFactory.createTableColumn("Dtl.loc_null_flg", MCColumnType.CHECK);
		p.columnDtl_io_trans_typ = p.beansFactory.createTableColumn("Dtl.io_trans_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_io_trans_typ_nm = p.beansFactory.createTableColumn("Dtl.io_trans_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alc_ac_cd = p.beansFactory.createTableColumn("Dtl.alc_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_nm = p.beansFactory.createTableColumn("Dtl.alc_ac_nm", MCColumnType.TEXT);
		p.columnDtl_alc_amt_flg = p.beansFactory.createTableColumn("Dtl.alc_amt_flg", MCColumnType.CHECK);
		p.columnDtl_alc_wg_cd = p.beansFactory.createTableColumn("Dtl.alc_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_wg_nm = p.beansFactory.createTableColumn("Dtl.alc_wg_nm", MCColumnType.TEXT);
		p.columnDtl_dpt_flg = p.beansFactory.createTableColumn("Dtl.dpt_flg", MCColumnType.CHECK);
		p.columnDtl_dpt_cd = p.beansFactory.createTableColumn("Dtl.dpt_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_dpt_nm = p.beansFactory.createTableColumn("Dtl.dpt_nm", MCColumnType.TEXT);
		p.columnDtl_loc_flg = p.beansFactory.createTableColumn("Dtl.loc_flg", MCColumnType.CHECK);
		p.columnDtl_loc_cd = p.beansFactory.createTableColumn("Dtl.loc_cd", MCColumnType.TEXT);
		p.columnDtl_loc_nm = p.beansFactory.createTableColumn("Dtl.loc_nm", MCColumnType.TEXT);
		p.columnDtl_oper_flg = p.beansFactory.createTableColumn("Dtl.oper_flg", MCColumnType.CHECK);
		p.columnDtl_oper_cd = p.beansFactory.createTableColumn("Dtl.oper_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_oper_nm = p.beansFactory.createTableColumn("Dtl.oper_nm", MCColumnType.TEXT);
		p.columnDtl_bp_flg = p.beansFactory.createTableColumn("Dtl.bp_flg", MCColumnType.CHECK);
		p.columnDtl_bp_cd = p.beansFactory.createTableColumn("Dtl.bp_cd", MCColumnType.TEXT);
		p.columnDtl_bp_nm = p.beansFactory.createTableColumn("Dtl.bp_nm", MCColumnType.TEXT);
		p.columnDtl_ctg_flg = p.beansFactory.createTableColumn("Dtl.ctg_flg", MCColumnType.CHECK);
		p.columnDtl_ctg_cd = p.beansFactory.createTableColumn("Dtl.ctg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ctg_nm = p.beansFactory.createTableColumn("Dtl.ctg_nm", MCColumnType.TEXT);
		p.columnDtl_itm_flg = p.beansFactory.createTableColumn("Dtl.itm_flg", MCColumnType.CHECK);
		p.columnDtl_lot_no_flg = p.beansFactory.createTableColumn("Dtl.lot_no_flg", MCColumnType.CHECK);
		p.columnDtl_lot_no = p.beansFactory.createTableColumn("Dtl.lot_no", MCColumnType.TEXT);
		p.columnDtl_sublot_no_flg = p.beansFactory.createTableColumn("Dtl.sublot_no_flg", MCColumnType.CHECK);
		p.columnDtl_sublot_no = p.beansFactory.createTableColumn("Dtl.sublot_no", MCColumnType.TEXT);
		p.columnDtl_sno1_flg = p.beansFactory.createTableColumn("Dtl.sno1_flg", MCColumnType.CHECK);
		p.columnDtl_sno1 = p.beansFactory.createTableColumn("Dtl.sno1", MCColumnType.TEXT);
		p.columnDtl_sno2_flg = p.beansFactory.createTableColumn("Dtl.sno2_flg", MCColumnType.CHECK);
		p.columnDtl_sno2 = p.beansFactory.createTableColumn("Dtl.sno2", MCColumnType.TEXT);
		p.columnDtl_sno3_flg = p.beansFactory.createTableColumn("Dtl.sno3_flg", MCColumnType.CHECK);
		p.columnDtl_sno3 = p.beansFactory.createTableColumn("Dtl.sno3", MCColumnType.TEXT);
		p.columnDtl_sno4_flg = p.beansFactory.createTableColumn("Dtl.sno4_flg", MCColumnType.CHECK);
		p.columnDtl_sno4 = p.beansFactory.createTableColumn("Dtl.sno4", MCColumnType.TEXT);
		p.columnDtl_itm_mfg_inst_no_flg = p.beansFactory.createTableColumn("Dtl.itm_mfg_inst_no_flg", MCColumnType.CHECK);
		p.columnDtl_inpt_loc_typ1 = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ1", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_loc_typ1_nm = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ1_nm", MCColumnType.TEXT);
		p.columnDtl_inpt_loc_typ2 = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ2", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_loc_typ2_nm = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ2_nm", MCColumnType.TEXT);
		p.columnDtl_inpt_loc_typ3 = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ3", MCColumnType.TEXT_COMBO);
		p.columnDtl_inpt_loc_typ3_nm = p.beansFactory.createTableColumn("Dtl.inpt_loc_typ3_nm", MCColumnType.TEXT);
		p.columnDtl_memo1 = p.beansFactory.createTableColumn("Dtl.memo1", MCColumnType.TEXT);
		p.columnDtl_memo2 = p.beansFactory.createTableColumn("Dtl.memo2", MCColumnType.TEXT);
		p.columnDtl_memo3 = p.beansFactory.createTableColumn("Dtl.memo3", MCColumnType.TEXT);
		p.columnDtl_ins_usr_id = p.beansFactory.createTableColumn("Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnDtl_ins_usr_nm = p.beansFactory.createTableColumn("Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnDtl_ins_ts = p.beansFactory.createTableColumn("Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_ins_func_id = p.beansFactory.createTableColumn("Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnDtl_ins_func_nm = p.beansFactory.createTableColumn("Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_cntr = p.beansFactory.createTableColumn("Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnDtl_upd_usr_id = p.beansFactory.createTableColumn("Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnDtl_upd_usr_nm = p.beansFactory.createTableColumn("Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnDtl_upd_ts = p.beansFactory.createTableColumn("Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnDtl_upd_func_id = p.beansFactory.createTableColumn("Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnDtl_upd_func_nm = p.beansFactory.createTableColumn("Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnDtl_upd_srv_req_no = p.beansFactory.createTableColumn("Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnDtl_del_usr_id = p.beansFactory.createTableColumn("Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnDtl_del_usr_nm = p.beansFactory.createTableColumn("Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnDtl_del_ts = p.beansFactory.createTableColumn("Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_correct_dup_dt = p.beansFactory.createButton("Btn.correct_dup_dt");
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_ActIoReg p) {
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
	protected static void jbInitTop(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.BottomPanel);
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
	protected static void jbInitFold(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndPanel.add(p.Cnd_dt_p_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_p_PPanel);
		p.Cnd_dt_p_PPanel.setNextBeans(p.Cnd_calc_ctg_cd);
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
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.ope_META);
		p.Cnd_calc_ctg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_calc_ctg_cd, true);
		p.Cnd_calc_ctg_cd.setLinkBeans(p.Cnd_calc_ctg_nm);
		p.CndPanel.add(p.Cnd_calc_ctg_cd_Label);
		p.CndPanel.add(p.Cnd_calc_ctg_cd);
		p.Cnd_calc_ctg_cd.setNextBeans(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.calc_ctg_cd_META);
		p.CndPanel.add(p.Cnd_calc_ctg_nm);
		p.Cnd_calc_ctg_nm.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_calc_ctg_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.calc_ctg_nm_META);
		p.setPluralValueEnable(p.Cnd_calc_ctg_nm, true);
		p.Cnd_wg_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_wg_cd, true);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_ac_slip_typ);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.wg_nm_META);
		p.setPluralValueEnable(p.Cnd_wg_nm, true);
		p.Cnd_ac_slip_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_slip_typ, true);
		p.Cnd_ac_slip_typ.setLinkBeans(p.Cnd_ac_slip_typ_nm);
		p.CndPanel.add(p.Cnd_ac_slip_typ_Label);
		p.CndPanel.add(p.Cnd_ac_slip_typ);
		p.Cnd_ac_slip_typ.setNextBeans(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.ac_slip_typ_META);
		p.CndPanel.add(p.Cnd_ac_slip_typ_nm);
		p.Cnd_ac_slip_typ_nm.setNextBeans(p.Cnd_itm_jnl_cd);
		p.Cnd_ac_slip_typ_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.ac_slip_typ_nm_META);
		p.Cnd_itm_jnl_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_itm_jnl_cd, true);
		p.Cnd_itm_jnl_cd.setLinkBeans(p.Cnd_itm_jnl_nm);
		p.CndPanel.add(p.Cnd_itm_jnl_cd_Label);
		p.CndPanel.add(p.Cnd_itm_jnl_cd);
		p.Cnd_itm_jnl_cd.setNextBeans(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.itm_jnl_cd_META);
		p.CndPanel.add(p.Cnd_itm_jnl_nm);
		p.Cnd_itm_jnl_nm.setNextBeans(p.Cnd_no_itm_jnl_flg);
		p.Cnd_itm_jnl_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.itm_jnl_nm_META);
		p.setPluralValueEnable(p.Cnd_itm_jnl_nm, true);
		p.CndPanel.add(p.Cnd_no_itm_jnl_flg);
		p.Cnd_no_itm_jnl_flg.setNextBeans(p.Cnd_ac_rsn_cd);
		p.Cnd_no_itm_jnl_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.no_itm_jnl_flg_META);
		p.Cnd_ac_rsn_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_ac_rsn_cd, true);
		p.Cnd_ac_rsn_cd.setLinkBeans(p.Cnd_ac_rsn_nm);
		p.CndPanel.add(p.Cnd_ac_rsn_cd_Label);
		p.CndPanel.add(p.Cnd_ac_rsn_cd);
		p.Cnd_ac_rsn_cd.setNextBeans(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.ac_rsn_cd_META);
		p.CndPanel.add(p.Cnd_ac_rsn_nm);
		p.Cnd_ac_rsn_nm.setNextBeans(p.Cnd_no_ac_rsn_flg);
		p.Cnd_ac_rsn_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.ac_rsn_nm_META);
		p.setPluralValueEnable(p.Cnd_ac_rsn_nm, true);
		p.CndPanel.add(p.Cnd_no_ac_rsn_flg);
		p.Cnd_no_ac_rsn_flg.setNextBeans(p.Cnd_tgt_dpt_cd);
		p.Cnd_no_ac_rsn_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.no_ac_rsn_flg_META);
		p.Cnd_tgt_dpt_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tgt_dpt_cd, true);
		p.Cnd_tgt_dpt_cd.setLinkBeans(p.Cnd_tgt_dpt_nm);
		p.CndPanel.add(p.Cnd_tgt_dpt_cd_Label);
		p.CndPanel.add(p.Cnd_tgt_dpt_cd);
		p.Cnd_tgt_dpt_cd.setNextBeans(p.Cnd_tgt_dpt_nm);
		p.Cnd_tgt_dpt_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.tgt_dpt_cd_META);
		p.CndPanel.add(p.Cnd_tgt_dpt_nm);
		p.Cnd_tgt_dpt_nm.setNextBeans(p.Cnd_no_tgt_dpt_flg);
		p.Cnd_tgt_dpt_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.tgt_dpt_nm_META);
		p.setPluralValueEnable(p.Cnd_tgt_dpt_nm, true);
		p.CndPanel.add(p.Cnd_no_tgt_dpt_flg);
		p.Cnd_no_tgt_dpt_flg.setNextBeans(p.Cnd_tgt_loc_cd);
		p.Cnd_no_tgt_dpt_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.no_tgt_dpt_flg_META);
		p.CndPanel.add(p.Cnd_tgt_loc_cd_Label);
		p.CndPanel.add(p.Cnd_tgt_loc_cd);
		p.Cnd_tgt_loc_cd.setNextBeans(p.Cnd_tgt_loc_nm);
		p.Cnd_tgt_loc_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.tgt_loc_cd_META);
		p.Cnd_tgt_loc_cd.addLinkBeans(p.Cnd_tgt_loc_nm);
		p.Cnd_tgt_loc_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_tgt_loc_cd, true);
		p.CndPanel.add(p.Cnd_tgt_loc_nm);
		p.Cnd_tgt_loc_nm.setNextBeans(p.Cnd_no_tgt_loc_flg);
		p.Cnd_tgt_loc_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.tgt_loc_nm_META);
		p.setPluralValueEnable(p.Cnd_tgt_loc_nm, true);
		p.CndPanel.add(p.Cnd_no_tgt_loc_flg);
		p.Cnd_no_tgt_loc_flg.setNextBeans(p.Cnd_io_trans_typ);
		p.Cnd_no_tgt_loc_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.no_tgt_loc_flg_META);
		p.Cnd_io_trans_typ.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_io_trans_typ, true);
		p.Cnd_io_trans_typ.setLinkBeans(p.Cnd_io_trans_typ_nm);
		p.CndPanel.add(p.Cnd_io_trans_typ_Label);
		p.CndPanel.add(p.Cnd_io_trans_typ);
		p.Cnd_io_trans_typ.setNextBeans(p.Cnd_io_trans_typ_nm);
		p.Cnd_io_trans_typ.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.io_trans_typ_META);
		p.CndPanel.add(p.Cnd_io_trans_typ_nm);
		p.Cnd_io_trans_typ_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_io_trans_typ_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.io_trans_typ_nm_META);
		p.CndPanel.add(p.Cnd_memo1_Label);
		p.CndPanel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.CndPanel.add(p.Cnd_memo2_Label);
		p.CndPanel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.CndPanel.add(p.Cnd_memo3_Label);
		p.CndPanel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABG.MABGP0640.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Bottom]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBottom(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.add(p.BottomPanel);
		p.BottomPanel.setNextBeans(p.BtnPanel);
		p.BottomPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.BottomPanel.add(p.BulkSetPanel, null);
		p.BottomPanel.setLastBeans(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BottomPanel.add(p.DtlPanel, null);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.BulkSetPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABG.MABGP0640.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABG.MABGP0640.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_ActIoReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_correct_dup_dt.setFunctionKey(MCFunctionKey.F8);
		p.BtnPanel.add(p.Btn_correct_dup_dt);
		p.BtnPanel.setLastBeans(p.Btn_correct_dup_dt);
		p.Btn_correct_dup_dt.setNextBeans(p.Btn_select_all);
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.Btn_select_all.setNextBeans(p.Btn_deselect_all);
		p.Btn_deselect_all.setIcon("DESELECT_ALL");
		p.Btn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.BtnPanel.add(p.Btn_deselect_all);
		p.Btn_deselect_all.setNextBeans(p.Btn_radd);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd);
		p.Btn_upd.setIcon("REGISTER");
		p.Btn_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd);
		p.Btn_del.setIcon("DELETE");
		p.Btn_del.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del);
		p.EastBtnPanel.add(p.Btn_del);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABGP_ActIoReg p) {
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
		MABGP_ActIoReg_MC.mcInitScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitTop((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitFold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitCnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitCtrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitBottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitBulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitDtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitBtn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.mcInitEastBtn((MABGP_ActIoReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_ActIoReg_MC.statusInitUPD_ScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Top((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Fold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Cnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Ctrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Bottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_BulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Dtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_Btn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitUPD_EastBtn((MABGP_ActIoReg)this);

		// [FIX]ステータスのモードの設定
		MABGP_ActIoReg_MC.statusInitFIX_ScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Top((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Fold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Cnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Ctrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Bottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_BulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Dtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_Btn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitFIX_EastBtn((MABGP_ActIoReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_ActIoReg_MC.statusInitDEL_ScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Top((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Fold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Cnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Ctrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Bottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_BulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Dtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_Btn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitDEL_EastBtn((MABGP_ActIoReg)this);

		// [REF]ステータスのモードの設定
		MABGP_ActIoReg_MC.statusInitREF_ScreenOpe((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Top((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Fold((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Cnd((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Ctrl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Bottom((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_BulkSet((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Dtl((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_Btn((MABGP_ActIoReg)this);
		MABGP_ActIoReg_MC.statusInitREF_EastBtn((MABGP_ActIoReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_ActIoReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABGP_ActIoReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABGP_ActIoReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_ActIoReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_calc_ctg_cd.setListListener(p);
		p.Cnd_calc_ctg_cd.addAllListener(p);
		p.Cnd_calc_ctg_nm.setListListener(p);
		p.Cnd_calc_ctg_nm.addAllListener(p);
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_ac_slip_typ.setListListener(p);
		p.Cnd_ac_slip_typ.addAllListener(p);
		p.Cnd_ac_slip_typ_nm.setListListener(p);
		p.Cnd_ac_slip_typ_nm.addAllListener(p);
		p.Cnd_itm_jnl_cd.setListListener(p);
		p.Cnd_itm_jnl_cd.addAllListener(p);
		p.Cnd_itm_jnl_nm.setListListener(p);
		p.Cnd_itm_jnl_nm.addAllListener(p);
		p.Cnd_no_itm_jnl_flg.addAllListener(p);
		p.Cnd_ac_rsn_cd.setListListener(p);
		p.Cnd_ac_rsn_cd.addAllListener(p);
		p.Cnd_ac_rsn_nm.setListListener(p);
		p.Cnd_ac_rsn_nm.addAllListener(p);
		p.Cnd_no_ac_rsn_flg.addAllListener(p);
		p.Cnd_tgt_dpt_cd.setListListener(p);
		p.Cnd_tgt_dpt_cd.addAllListener(p);
		p.Cnd_tgt_dpt_nm.setListListener(p);
		p.Cnd_tgt_dpt_nm.addAllListener(p);
		p.Cnd_no_tgt_dpt_flg.addAllListener(p);
		p.Cnd_tgt_loc_cd.setListListener(p);
		p.Cnd_tgt_loc_cd.addAllListener(p);
		p.Cnd_tgt_loc_nm.setListListener(p);
		p.Cnd_tgt_loc_nm.addAllListener(p);
		p.Cnd_no_tgt_loc_flg.addAllListener(p);
		p.Cnd_io_trans_typ.setListListener(p);
		p.Cnd_io_trans_typ.addAllListener(p);
		p.Cnd_io_trans_typ_nm.setListListener(p);
		p.Cnd_io_trans_typ_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABGP_ActIoReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Bottom]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBottom(MABGP_ActIoReg p) {
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABGP_ActIoReg p) {
		p.BulkSet_st_dt.setListListener(p);
		p.BulkSet_st_dt.addAllListener(p);
		p.BulkSet_end_dt.setListListener(p);
		p.BulkSet_end_dt.addAllListener(p);
		p.BulkSet_set_dt.addAllListener(p);
		p.BulkSet_set_dt.setAPMethodName("doBulkSet_set_dt");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_ActIoReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_calc_ctg_cd.addAllListener(p);
		p.columnDtl_calc_ctg_cd.setListListener(p);
		p.columnDtl_calc_ctg_nm.addAllListener(p);
		p.columnDtl_calc_ctg_nm.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.columnDtl_wg_nm.addAllListener(p);
		p.columnDtl_wg_nm.setListListener(p);
		p.columnDtl_ac_slip_typ.addAllListener(p);
		p.columnDtl_ac_slip_typ.setListListener(p);
		p.columnDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnDtl_ac_slip_typ_nm.setListListener(p);
		p.columnDtl_prio.addAllListener(p);
		p.columnDtl_prio.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_ac_rsn_cd.addAllListener(p);
		p.columnDtl_ac_rsn_cd.setListListener(p);
		p.columnDtl_ac_rsn_nm.addAllListener(p);
		p.columnDtl_ac_rsn_nm.setListListener(p);
		p.columnDtl_ac_rsn_null_flg.addAllListener(p);
		p.columnDtl_tgt_dpt_cd.addAllListener(p);
		p.columnDtl_tgt_dpt_cd.setListListener(p);
		p.columnDtl_tgt_dpt_nm.addAllListener(p);
		p.columnDtl_tgt_dpt_nm.setListListener(p);
		p.columnDtl_tgt_loc_cd.addAllListener(p);
		p.columnDtl_tgt_loc_cd.setListListener(p);
		p.columnDtl_tgt_loc_nm.addAllListener(p);
		p.columnDtl_tgt_loc_nm.setListListener(p);
		p.columnDtl_loc_null_flg.addAllListener(p);
		p.columnDtl_io_trans_typ.addAllListener(p);
		p.columnDtl_io_trans_typ.setListListener(p);
		p.columnDtl_io_trans_typ_nm.addAllListener(p);
		p.columnDtl_io_trans_typ_nm.setListListener(p);
		p.columnDtl_alc_ac_cd.addAllListener(p);
		p.columnDtl_alc_ac_cd.setListListener(p);
		p.columnDtl_alc_ac_nm.addAllListener(p);
		p.columnDtl_alc_ac_nm.setListListener(p);
		p.columnDtl_alc_amt_flg.addAllListener(p);
		p.columnDtl_alc_wg_cd.addAllListener(p);
		p.columnDtl_alc_wg_cd.setListListener(p);
		p.columnDtl_alc_wg_nm.addAllListener(p);
		p.columnDtl_alc_wg_nm.setListListener(p);
		p.columnDtl_dpt_flg.addAllListener(p);
		p.columnDtl_dpt_cd.addAllListener(p);
		p.columnDtl_dpt_cd.setListListener(p);
		p.columnDtl_dpt_nm.addAllListener(p);
		p.columnDtl_dpt_nm.setListListener(p);
		p.columnDtl_loc_flg.addAllListener(p);
		p.columnDtl_loc_cd.addAllListener(p);
		p.columnDtl_loc_cd.setListListener(p);
		p.columnDtl_loc_nm.addAllListener(p);
		p.columnDtl_loc_nm.setListListener(p);
		p.columnDtl_oper_flg.addAllListener(p);
		p.columnDtl_oper_cd.addAllListener(p);
		p.columnDtl_oper_cd.setListListener(p);
		p.columnDtl_oper_nm.addAllListener(p);
		p.columnDtl_oper_nm.setListListener(p);
		p.columnDtl_bp_flg.addAllListener(p);
		p.columnDtl_bp_cd.addAllListener(p);
		p.columnDtl_bp_cd.setListListener(p);
		p.columnDtl_bp_nm.addAllListener(p);
		p.columnDtl_bp_nm.setListListener(p);
		p.columnDtl_ctg_flg.addAllListener(p);
		p.columnDtl_ctg_cd.addAllListener(p);
		p.columnDtl_ctg_cd.setListListener(p);
		p.columnDtl_ctg_nm.addAllListener(p);
		p.columnDtl_ctg_nm.setListListener(p);
		p.columnDtl_itm_flg.addAllListener(p);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_lot_no_flg.addAllListener(p);
		p.columnDtl_lot_no.addAllListener(p);
		p.columnDtl_lot_no.setListListener(p);
		p.columnDtl_sublot_no_flg.addAllListener(p);
		p.columnDtl_sublot_no.addAllListener(p);
		p.columnDtl_sublot_no.setListListener(p);
		p.columnDtl_sno1_flg.addAllListener(p);
		p.columnDtl_sno1.addAllListener(p);
		p.columnDtl_sno1.setListListener(p);
		p.columnDtl_sno2_flg.addAllListener(p);
		p.columnDtl_sno2.addAllListener(p);
		p.columnDtl_sno2.setListListener(p);
		p.columnDtl_sno3_flg.addAllListener(p);
		p.columnDtl_sno3.addAllListener(p);
		p.columnDtl_sno3.setListListener(p);
		p.columnDtl_sno4_flg.addAllListener(p);
		p.columnDtl_sno4.addAllListener(p);
		p.columnDtl_sno4.setListListener(p);
		p.columnDtl_itm_mfg_inst_no_flg.addAllListener(p);
		p.columnDtl_inpt_loc_typ1.addAllListener(p);
		p.columnDtl_inpt_loc_typ1.setListListener(p);
		p.columnDtl_inpt_loc_typ1_nm.addAllListener(p);
		p.columnDtl_inpt_loc_typ1_nm.setListListener(p);
		p.columnDtl_inpt_loc_typ2.addAllListener(p);
		p.columnDtl_inpt_loc_typ2.setListListener(p);
		p.columnDtl_inpt_loc_typ2_nm.addAllListener(p);
		p.columnDtl_inpt_loc_typ2_nm.setListListener(p);
		p.columnDtl_inpt_loc_typ3.addAllListener(p);
		p.columnDtl_inpt_loc_typ3.setListListener(p);
		p.columnDtl_inpt_loc_typ3_nm.addAllListener(p);
		p.columnDtl_inpt_loc_typ3_nm.setListListener(p);
		p.columnDtl_memo1.addAllListener(p);
		p.columnDtl_memo1.setListListener(p);
		p.columnDtl_memo2.addAllListener(p);
		p.columnDtl_memo2.setListListener(p);
		p.columnDtl_memo3.addAllListener(p);
		p.columnDtl_memo3.setListListener(p);
		p.columnDtl_ins_usr_id.addAllListener(p);
		p.columnDtl_ins_usr_id.setListListener(p);
		p.columnDtl_ins_usr_nm.addAllListener(p);
		p.columnDtl_ins_usr_nm.setListListener(p);
		p.columnDtl_ins_ts.addAllListener(p);
		p.columnDtl_ins_ts.setListListener(p);
		p.columnDtl_ins_func_id.addAllListener(p);
		p.columnDtl_ins_func_id.setListListener(p);
		p.columnDtl_ins_func_nm.addAllListener(p);
		p.columnDtl_ins_func_nm.setListListener(p);
		p.columnDtl_upd_cntr.addAllListener(p);
		p.columnDtl_upd_cntr.setListListener(p);
		p.columnDtl_upd_usr_id.addAllListener(p);
		p.columnDtl_upd_usr_id.setListListener(p);
		p.columnDtl_upd_usr_nm.addAllListener(p);
		p.columnDtl_upd_usr_nm.setListListener(p);
		p.columnDtl_upd_ts.addAllListener(p);
		p.columnDtl_upd_ts.setListListener(p);
		p.columnDtl_upd_func_id.addAllListener(p);
		p.columnDtl_upd_func_id.setListListener(p);
		p.columnDtl_upd_func_nm.addAllListener(p);
		p.columnDtl_upd_func_nm.setListListener(p);
		p.columnDtl_upd_srv_req_no.addAllListener(p);
		p.columnDtl_upd_srv_req_no.setListListener(p);
		p.columnDtl_del_usr_id.addAllListener(p);
		p.columnDtl_del_usr_id.setListListener(p);
		p.columnDtl_del_usr_nm.addAllListener(p);
		p.columnDtl_del_usr_nm.setListListener(p);
		p.columnDtl_del_ts.addAllListener(p);
		p.columnDtl_del_ts.setListListener(p);
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_ActIoReg p) {
		p.Btn_correct_dup_dt.addAllListener(p);
		p.Btn_correct_dup_dt.setAPMethodName("doBtn_correct_dup_dt");
		p.Btn_select_all.addAllListener(p);
		p.Btn_select_all.setAPMethodName("doBtn_select_all");
		p.Btn_deselect_all.addAllListener(p);
		p.Btn_deselect_all.setAPMethodName("doBtn_deselect_all");
		p.Btn_radd.addAllListener(p);
		p.Btn_radd.setAPMethodName("doBtn_radd");
		p.Btn_rdel.addAllListener(p);
		p.Btn_rdel.setAPMethodName("doBtn_rdel");
		p.Btn_rcopy.addAllListener(p);
		p.Btn_rcopy.setAPMethodName("doBtn_rcopy");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_ActIoReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_ActIoReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABGP_ActIoReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABGP_ActIoReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_ActIoReg p){
		p.Cnd_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_itm_jnl_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_ac_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tgt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tgt_dpt_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_tgt_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_tgt_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_tgt_loc_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_no_tgt_loc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_io_trans_typ.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_io_trans_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABGP_ActIoReg p){

	}

	/**
	 * [UPD]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Bottom(MABGP_ActIoReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABGP_ActIoReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_ActIoReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_calc_ctg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_calc_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ac_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_tgt_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tgt_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_tgt_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_null_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_io_trans_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_io_trans_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alc_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_amt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_alc_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_alc_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dpt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_dpt_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dpt_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_loc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_oper_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_oper_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_oper_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_bp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_bp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ctg_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_ctg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ctg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.ENABLE);
		p.columnDtl_lot_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_lot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sublot_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sublot_no.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno1_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno2_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno3_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_sno4_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sno4.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_itm_mfg_inst_no_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_inpt_loc_typ1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inpt_loc_typ1_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inpt_loc_typ2_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_inpt_loc_typ3_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_ActIoReg p){
		p.Btn_correct_dup_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABGP_ActIoReg p){
		p.Cnd_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_no_itm_jnl_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_ac_rsn_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_tgt_dpt_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_tgt_dpt_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_no_tgt_dpt_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_tgt_loc_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_tgt_loc_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_no_tgt_loc_flg.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_io_trans_typ.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_io_trans_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Bottom(MABGP_ActIoReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABGP_ActIoReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABGP_ActIoReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_null_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_null_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_amt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ctg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ctg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ctg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_lot_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sno4.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABGP_ActIoReg p){
		p.Btn_correct_dup_dt.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_ActIoReg p){
		p.Cnd_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_itm_jnl_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_ac_rsn_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_tgt_dpt_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tgt_dpt_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_tgt_dpt_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_tgt_loc_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_tgt_loc_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_no_tgt_loc_flg.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_io_trans_typ.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_io_trans_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Bottom(MABGP_ActIoReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABGP_ActIoReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_ActIoReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_null_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_amt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ctg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_lot_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sno4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_ActIoReg p){
		p.Btn_correct_dup_dt.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_ActIoReg p){
		p.Cnd_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_calc_ctg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_calc_ctg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_itm_jnl_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_itm_jnl_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_itm_jnl_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_ac_rsn_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_ac_rsn_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_ac_rsn_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tgt_dpt_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tgt_dpt_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_tgt_dpt_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_tgt_loc_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_tgt_loc_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_no_tgt_loc_flg.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_io_trans_typ.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_io_trans_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[Bottom]ブロックのモードの設定
	 */
	protected static void statusInitREF_Bottom(MABGP_ActIoReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABGP_ActIoReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_ActIoReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_calc_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tgt_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_tgt_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_null_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_io_trans_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_amt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dpt_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_oper_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ctg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_lot_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_lot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sublot_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sno4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_mfg_inst_no_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ1_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ2_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_inpt_loc_typ3_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_ActIoReg p){
		p.Btn_correct_dup_dt.putMode(p, REF, MCMode.DISABLE);
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_ActIoReg p){

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return UPD;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABGP_ActIoReg_MC.setTableConfigDtl((MABGP_ActIoReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_ActIoReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0640.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_calc_ctg_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.calc_ctg_cd_META);
		p.columnDtl_calc_ctg_cd.addLinkBeans(p.columnDtl_calc_ctg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_cd);
		p.columnDtl_calc_ctg_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.calc_ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_calc_ctg_nm);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.wg_cd_META);
		p.columnDtl_wg_cd.addLinkBeans(p.columnDtl_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.columnDtl_wg_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_nm);
		p.columnDtl_ac_slip_typ.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ac_slip_typ_META);
		p.columnDtl_ac_slip_typ.addLinkBeans(p.columnDtl_ac_slip_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ);
		p.columnDtl_ac_slip_typ_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ac_slip_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ_nm);
		p.columnDtl_prio.setMeta(mcframe.clientMABG.MABGP0640.DtlR.prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prio);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.itm_jnl_cd_META);
		p.columnDtl_itm_jnl_cd.addLinkBeans(p.columnDtl_itm_jnl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_ac_rsn_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ac_rsn_cd_META);
		p.columnDtl_ac_rsn_cd.addLinkBeans(p.columnDtl_ac_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_cd);
		p.columnDtl_ac_rsn_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ac_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_nm);
		p.columnDtl_ac_rsn_null_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ac_rsn_null_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_null_flg);
		p.columnDtl_tgt_dpt_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.tgt_dpt_cd_META);
		p.columnDtl_tgt_dpt_cd.addLinkBeans(p.columnDtl_tgt_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_tgt_dpt_cd);
		p.columnDtl_tgt_dpt_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.tgt_dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tgt_dpt_nm);
		p.columnDtl_tgt_loc_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.tgt_loc_cd_META);
		p.columnDtl_tgt_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_tgt_loc_cd.addLinkBeans(p.columnDtl_tgt_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_tgt_loc_cd);
		p.columnDtl_tgt_loc_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.tgt_loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_tgt_loc_nm);
		p.columnDtl_loc_null_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.loc_null_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_null_flg);
		p.columnDtl_io_trans_typ.setMeta(mcframe.clientMABG.MABGP0640.DtlR.io_trans_typ_META);
		p.columnDtl_io_trans_typ.addLinkBeans(p.columnDtl_io_trans_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_io_trans_typ);
		p.columnDtl_io_trans_typ_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.io_trans_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_io_trans_typ_nm);
		p.columnDtl_alc_ac_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.alc_ac_cd_META);
		p.columnDtl_alc_ac_cd.addLinkBeans(p.columnDtl_alc_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_cd);
		p.columnDtl_alc_ac_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.alc_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_nm);
		p.columnDtl_alc_amt_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.alc_amt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_amt_flg);
		p.columnDtl_alc_wg_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.alc_wg_cd_META);
		p.columnDtl_alc_wg_cd.addLinkBeans(p.columnDtl_alc_wg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_wg_cd);
		p.columnDtl_alc_wg_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.alc_wg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_wg_nm);
		p.columnDtl_dpt_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.dpt_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_flg);
		p.columnDtl_dpt_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.dpt_cd_META);
		p.columnDtl_dpt_cd.addLinkBeans(p.columnDtl_dpt_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_cd);
		p.columnDtl_dpt_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.dpt_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dpt_nm);
		p.columnDtl_loc_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.loc_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_flg);
		p.columnDtl_loc_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.loc_cd_META);
		p.columnDtl_loc_cd.setListType(MCListType.STRICT);
		p.columnDtl_loc_cd.addLinkBeans(p.columnDtl_loc_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_cd);
		p.columnDtl_loc_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.loc_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_loc_nm);
		p.columnDtl_oper_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.oper_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_flg);
		p.columnDtl_oper_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.oper_cd_META);
		p.columnDtl_oper_cd.addLinkBeans(p.columnDtl_oper_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_cd);
		p.columnDtl_oper_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.oper_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_oper_nm);
		p.columnDtl_bp_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.bp_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_flg);
		p.columnDtl_bp_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.bp_cd_META);
		p.columnDtl_bp_cd.setListType(MCListType.STRICT);
		p.columnDtl_bp_cd.addLinkBeans(p.columnDtl_bp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_cd);
		p.columnDtl_bp_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.bp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bp_nm);
		p.columnDtl_ctg_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ctg_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_flg);
		p.columnDtl_ctg_cd.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ctg_cd_META);
		p.columnDtl_ctg_cd.addLinkBeans(p.columnDtl_ctg_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_cd);
		p.columnDtl_ctg_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ctg_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ctg_nm);
		p.columnDtl_itm_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.itm_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_flg);
		p.DtlTable.addTable(p.Dtl_itm_p_PPanel.ItmTable);
		p.Dtl_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub1, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub2, p.columnDtl_itm_sub3);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_itm_nm, p.columnDtl_itm_sub3);
		p.Dtl_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_itm_nm);
		p.columnDtl_lot_no_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.lot_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no_flg);
		p.columnDtl_lot_no.setMeta(mcframe.clientMABG.MABGP0640.DtlR.lot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_no);
		p.columnDtl_sublot_no_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sublot_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no_flg);
		p.columnDtl_sublot_no.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sublot_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sublot_no);
		p.columnDtl_sno1_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno1_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1_flg);
		p.columnDtl_sno1.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno1);
		p.columnDtl_sno2_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno2_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2_flg);
		p.columnDtl_sno2.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno2);
		p.columnDtl_sno3_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno3_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3_flg);
		p.columnDtl_sno3.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno3);
		p.columnDtl_sno4_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno4_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4_flg);
		p.columnDtl_sno4.setMeta(mcframe.clientMABG.MABGP0640.DtlR.sno4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sno4);
		p.columnDtl_itm_mfg_inst_no_flg.setMeta(mcframe.clientMABG.MABGP0640.DtlR.itm_mfg_inst_no_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_mfg_inst_no_flg);
		p.columnDtl_inpt_loc_typ1.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ1_META);
		p.columnDtl_inpt_loc_typ1.addLinkBeans(p.columnDtl_inpt_loc_typ1_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ1);
		p.columnDtl_inpt_loc_typ1_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ1_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ1_nm);
		p.columnDtl_inpt_loc_typ2.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ2_META);
		p.columnDtl_inpt_loc_typ2.addLinkBeans(p.columnDtl_inpt_loc_typ2_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ2);
		p.columnDtl_inpt_loc_typ2_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ2_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ2_nm);
		p.columnDtl_inpt_loc_typ3.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ3_META);
		p.columnDtl_inpt_loc_typ3.addLinkBeans(p.columnDtl_inpt_loc_typ3_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ3);
		p.columnDtl_inpt_loc_typ3_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.inpt_loc_typ3_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_inpt_loc_typ3_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0640.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0640.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0640.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0640.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0640.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0640.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0640.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_calc_ctg_cd.getListConfig().setPutter(getCnd_calc_ctg_cd_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_slip_typ.getListConfig().setPutter(getCnd_ac_slip_typ_ListPutter());
		Cnd_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_itm_jnl_cd.getListConfig().setPutter(getCnd_itm_jnl_cd_ListPutter());
		Cnd_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_ac_rsn_cd.getListConfig().setPutter(getCnd_ac_rsn_cd_ListPutter());
		Cnd_tgt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_tgt_dpt_cd.getListConfig().setPutter(getCnd_tgt_dpt_cd_ListPutter());
		Cnd_tgt_loc_cd.getListConfig().setPutter(getCnd_tgt_loc_cd_ListPutter());
		Cnd_io_trans_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_io_trans_typ.getListConfig().setPutter(getCnd_io_trans_typ_ListPutter());
		columnDtl_calc_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_calc_ctg_cd.getListConfig().setPutter(getDtl_calc_ctg_cd_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		columnDtl_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_slip_typ.getListConfig().setPutter(getDtl_ac_slip_typ_ListPutter());
		columnDtl_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_jnl_cd.getListConfig().setPutter(getDtl_itm_jnl_cd_ListPutter());
		columnDtl_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_rsn_cd.getListConfig().setPutter(getDtl_ac_rsn_cd_ListPutter());
		columnDtl_tgt_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_tgt_dpt_cd.getListConfig().setPutter(getDtl_tgt_dpt_cd_ListPutter());
		columnDtl_tgt_loc_cd.getListConfig().setPutter(getDtl_tgt_loc_cd_ListPutter());
		columnDtl_io_trans_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_io_trans_typ.getListConfig().setPutter(getDtl_io_trans_typ_ListPutter());
		columnDtl_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_cd.getListConfig().setPutter(getDtl_alc_ac_cd_ListPutter());
		columnDtl_alc_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_wg_cd.getListConfig().setPutter(getDtl_alc_wg_cd_ListPutter());
		columnDtl_dpt_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_dpt_cd.getListConfig().setPutter(getDtl_dpt_cd_ListPutter());
		columnDtl_loc_cd.getListConfig().setPutter(getDtl_loc_cd_ListPutter());
		columnDtl_oper_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_oper_cd.getListConfig().setPutter(getDtl_oper_cd_ListPutter());
		columnDtl_bp_cd.getListConfig().setPutter(getDtl_bp_cd_ListPutter());
		columnDtl_ctg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ctg_cd.getListConfig().setPutter(getDtl_ctg_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
		columnDtl_inpt_loc_typ1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_loc_typ1.getListConfig().setPutter(getDtl_inpt_loc_typ1_ListPutter());
		columnDtl_inpt_loc_typ2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_loc_typ2.getListConfig().setPutter(getDtl_inpt_loc_typ2_ListPutter());
		columnDtl_inpt_loc_typ3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_inpt_loc_typ3.getListConfig().setPutter(getDtl_inpt_loc_typ3_ListPutter());
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
	 * この画面を[FIX]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIXStatus() {
		status = FIX;
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
	 * この画面を[REF]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setREFStatus() {
		status = REF;
		setAllStatus(status);
	}


	/**
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
	}

	/**
	 * この画面のステータスを返します。
	 *
	 * @return ステータス
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * [Cnd_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Cnd_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcxferAcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Cnd_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Cnd_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Cnd_tgt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tgt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Cnd_tgt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_tgt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Cnd_io_trans_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_io_trans_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IoTransTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_calc_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_calc_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CalcCtg");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcxferAcSlipTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Dtl_ac_rsn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_rsn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcRsn");
		return lp;
	}
	 
	/**
	 * [Dtl_tgt_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_tgt_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Dtl_tgt_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_tgt_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_io_trans_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_io_trans_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.IoTransTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ac_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ac_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAc");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostWg");
		return lp;
	}
	 
	/**
	 * [Dtl_dpt_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dpt_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostDpt");
		return lp;
	}
	 
	/**
	 * [Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Dtl_oper_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_oper_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Oper");
		return lp;
	}
	 
	/**
	 * [Dtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_ctg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ctg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostCtg");
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
	 * [Dtl_inpt_loc_typ1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_loc_typ1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptLocTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_loc_typ2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_loc_typ2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptLocTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_inpt_loc_typ3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_inpt_loc_typ3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.InptLocTyp");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_calc_ctg_cd) return getCnd_calc_ctg_cd(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_ac_slip_typ) return getCnd_ac_slip_typ(row, info);
		if(combo == Cnd_itm_jnl_cd) return getCnd_itm_jnl_cd(row, info);
		if(combo == Cnd_ac_rsn_cd) return getCnd_ac_rsn_cd(row, info);
		if(combo == Cnd_tgt_dpt_cd) return getCnd_tgt_dpt_cd(row, info);
		if(combo == Cnd_tgt_loc_cd) return getCnd_tgt_loc_cd(row, info);
		if(combo == Cnd_io_trans_typ) return getCnd_io_trans_typ(row, info);
		if(combo == columnDtl_calc_ctg_cd) return getDtl_calc_ctg_cd(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == columnDtl_ac_slip_typ) return getDtl_ac_slip_typ(row, info);
		if(combo == columnDtl_itm_jnl_cd) return getDtl_itm_jnl_cd(row, info);
		if(combo == columnDtl_ac_rsn_cd) return getDtl_ac_rsn_cd(row, info);
		if(combo == columnDtl_tgt_dpt_cd) return getDtl_tgt_dpt_cd(row, info);
		if(combo == columnDtl_tgt_loc_cd) return getDtl_tgt_loc_cd(row, info);
		if(combo == columnDtl_io_trans_typ) return getDtl_io_trans_typ(row, info);
		if(combo == columnDtl_alc_ac_cd) return getDtl_alc_ac_cd(row, info);
		if(combo == columnDtl_alc_wg_cd) return getDtl_alc_wg_cd(row, info);
		if(combo == columnDtl_dpt_cd) return getDtl_dpt_cd(row, info);
		if(combo == columnDtl_loc_cd) return getDtl_loc_cd(row, info);
		if(combo == columnDtl_oper_cd) return getDtl_oper_cd(row, info);
		if(combo == columnDtl_bp_cd) return getDtl_bp_cd(row, info);
		if(combo == columnDtl_ctg_cd) return getDtl_ctg_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_cd) return getDtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub1) return getDtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub2) return getDtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_itm_p_PPanel.columnItm_itm_sub3) return getDtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_inpt_loc_typ1) return getDtl_inpt_loc_typ1(row, info);
		if(combo == columnDtl_inpt_loc_typ2) return getDtl_inpt_loc_typ2(row, info);
		if(combo == columnDtl_inpt_loc_typ3) return getDtl_inpt_loc_typ3(row, info);
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
		else if (ap == BulkSet_set_dt) doBulkSet_set_dt(info);
		else if (ap == Btn_correct_dup_dt) doBtn_correct_dup_dt(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [BulkSet]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBulkSet_set_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[correct_dup_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_correct_dup_dt(MCEventInfo info);

	/**
	 * [Btn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_select_all(MCEventInfo info);

	/**
	 * [Btn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_deselect_all(MCEventInfo info);

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
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_calc_ctg_cd) return doCnd_calc_ctg_cd_VC(info);
		if (vc == Cnd_calc_ctg_nm) return doCnd_calc_ctg_nm_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_ac_slip_typ) return doCnd_ac_slip_typ_VC(info);
		if (vc == Cnd_ac_slip_typ_nm) return doCnd_ac_slip_typ_nm_VC(info);
		if (vc == Cnd_itm_jnl_cd) return doCnd_itm_jnl_cd_VC(info);
		if (vc == Cnd_itm_jnl_nm) return doCnd_itm_jnl_nm_VC(info);
		if (vc == Cnd_no_itm_jnl_flg) return doCnd_no_itm_jnl_flg_VC(info);
		if (vc == Cnd_ac_rsn_cd) return doCnd_ac_rsn_cd_VC(info);
		if (vc == Cnd_ac_rsn_nm) return doCnd_ac_rsn_nm_VC(info);
		if (vc == Cnd_no_ac_rsn_flg) return doCnd_no_ac_rsn_flg_VC(info);
		if (vc == Cnd_tgt_dpt_cd) return doCnd_tgt_dpt_cd_VC(info);
		if (vc == Cnd_tgt_dpt_nm) return doCnd_tgt_dpt_nm_VC(info);
		if (vc == Cnd_no_tgt_dpt_flg) return doCnd_no_tgt_dpt_flg_VC(info);
		if (vc == Cnd_tgt_loc_cd) return doCnd_tgt_loc_cd_VC(info);
		if (vc == Cnd_tgt_loc_nm) return doCnd_tgt_loc_nm_VC(info);
		if (vc == Cnd_no_tgt_loc_flg) return doCnd_no_tgt_loc_flg_VC(info);
		if (vc == Cnd_io_trans_typ) return doCnd_io_trans_typ_VC(info);
		if (vc == Cnd_io_trans_typ_nm) return doCnd_io_trans_typ_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_calc_ctg_cd) return doDtl_calc_ctg_cd_VC(info);
		if (vc == columnDtl_calc_ctg_nm) return doDtl_calc_ctg_nm_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_wg_nm) return doDtl_wg_nm_VC(info);
		if (vc == columnDtl_ac_slip_typ) return doDtl_ac_slip_typ_VC(info);
		if (vc == columnDtl_ac_slip_typ_nm) return doDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnDtl_prio) return doDtl_prio_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_ac_rsn_cd) return doDtl_ac_rsn_cd_VC(info);
		if (vc == columnDtl_ac_rsn_nm) return doDtl_ac_rsn_nm_VC(info);
		if (vc == columnDtl_ac_rsn_null_flg) return doDtl_ac_rsn_null_flg_VC(info);
		if (vc == columnDtl_tgt_dpt_cd) return doDtl_tgt_dpt_cd_VC(info);
		if (vc == columnDtl_tgt_dpt_nm) return doDtl_tgt_dpt_nm_VC(info);
		if (vc == columnDtl_tgt_loc_cd) return doDtl_tgt_loc_cd_VC(info);
		if (vc == columnDtl_tgt_loc_nm) return doDtl_tgt_loc_nm_VC(info);
		if (vc == columnDtl_loc_null_flg) return doDtl_loc_null_flg_VC(info);
		if (vc == columnDtl_io_trans_typ) return doDtl_io_trans_typ_VC(info);
		if (vc == columnDtl_io_trans_typ_nm) return doDtl_io_trans_typ_nm_VC(info);
		if (vc == columnDtl_alc_ac_cd) return doDtl_alc_ac_cd_VC(info);
		if (vc == columnDtl_alc_ac_nm) return doDtl_alc_ac_nm_VC(info);
		if (vc == columnDtl_alc_amt_flg) return doDtl_alc_amt_flg_VC(info);
		if (vc == columnDtl_alc_wg_cd) return doDtl_alc_wg_cd_VC(info);
		if (vc == columnDtl_alc_wg_nm) return doDtl_alc_wg_nm_VC(info);
		if (vc == columnDtl_dpt_flg) return doDtl_dpt_flg_VC(info);
		if (vc == columnDtl_dpt_cd) return doDtl_dpt_cd_VC(info);
		if (vc == columnDtl_dpt_nm) return doDtl_dpt_nm_VC(info);
		if (vc == columnDtl_loc_flg) return doDtl_loc_flg_VC(info);
		if (vc == columnDtl_loc_cd) return doDtl_loc_cd_VC(info);
		if (vc == columnDtl_loc_nm) return doDtl_loc_nm_VC(info);
		if (vc == columnDtl_oper_flg) return doDtl_oper_flg_VC(info);
		if (vc == columnDtl_oper_cd) return doDtl_oper_cd_VC(info);
		if (vc == columnDtl_oper_nm) return doDtl_oper_nm_VC(info);
		if (vc == columnDtl_bp_flg) return doDtl_bp_flg_VC(info);
		if (vc == columnDtl_bp_cd) return doDtl_bp_cd_VC(info);
		if (vc == columnDtl_bp_nm) return doDtl_bp_nm_VC(info);
		if (vc == columnDtl_ctg_flg) return doDtl_ctg_flg_VC(info);
		if (vc == columnDtl_ctg_cd) return doDtl_ctg_cd_VC(info);
		if (vc == columnDtl_ctg_nm) return doDtl_ctg_nm_VC(info);
		if (vc == columnDtl_itm_flg) return doDtl_itm_flg_VC(info);
		if (vc == columnDtl_lot_no_flg) return doDtl_lot_no_flg_VC(info);
		if (vc == columnDtl_lot_no) return doDtl_lot_no_VC(info);
		if (vc == columnDtl_sublot_no_flg) return doDtl_sublot_no_flg_VC(info);
		if (vc == columnDtl_sublot_no) return doDtl_sublot_no_VC(info);
		if (vc == columnDtl_sno1_flg) return doDtl_sno1_flg_VC(info);
		if (vc == columnDtl_sno1) return doDtl_sno1_VC(info);
		if (vc == columnDtl_sno2_flg) return doDtl_sno2_flg_VC(info);
		if (vc == columnDtl_sno2) return doDtl_sno2_VC(info);
		if (vc == columnDtl_sno3_flg) return doDtl_sno3_flg_VC(info);
		if (vc == columnDtl_sno3) return doDtl_sno3_VC(info);
		if (vc == columnDtl_sno4_flg) return doDtl_sno4_flg_VC(info);
		if (vc == columnDtl_sno4) return doDtl_sno4_VC(info);
		if (vc == columnDtl_itm_mfg_inst_no_flg) return doDtl_itm_mfg_inst_no_flg_VC(info);
		if (vc == columnDtl_inpt_loc_typ1) return doDtl_inpt_loc_typ1_VC(info);
		if (vc == columnDtl_inpt_loc_typ1_nm) return doDtl_inpt_loc_typ1_nm_VC(info);
		if (vc == columnDtl_inpt_loc_typ2) return doDtl_inpt_loc_typ2_VC(info);
		if (vc == columnDtl_inpt_loc_typ2_nm) return doDtl_inpt_loc_typ2_nm_VC(info);
		if (vc == columnDtl_inpt_loc_typ3) return doDtl_inpt_loc_typ3_VC(info);
		if (vc == columnDtl_inpt_loc_typ3_nm) return doDtl_inpt_loc_typ3_nm_VC(info);
		if (vc == columnDtl_memo1) return doDtl_memo1_VC(info);
		if (vc == columnDtl_memo2) return doDtl_memo2_VC(info);
		if (vc == columnDtl_memo3) return doDtl_memo3_VC(info);
		if (vc == columnDtl_ins_usr_id) return doDtl_ins_usr_id_VC(info);
		if (vc == columnDtl_ins_usr_nm) return doDtl_ins_usr_nm_VC(info);
		if (vc == columnDtl_ins_ts) return doDtl_ins_ts_VC(info);
		if (vc == columnDtl_ins_func_id) return doDtl_ins_func_id_VC(info);
		if (vc == columnDtl_ins_func_nm) return doDtl_ins_func_nm_VC(info);
		if (vc == columnDtl_upd_cntr) return doDtl_upd_cntr_VC(info);
		if (vc == columnDtl_upd_usr_id) return doDtl_upd_usr_id_VC(info);
		if (vc == columnDtl_upd_usr_nm) return doDtl_upd_usr_nm_VC(info);
		if (vc == columnDtl_upd_ts) return doDtl_upd_ts_VC(info);
		if (vc == columnDtl_upd_func_id) return doDtl_upd_func_id_VC(info);
		if (vc == columnDtl_upd_func_nm) return doDtl_upd_func_nm_VC(info);
		if (vc == columnDtl_upd_srv_req_no) return doDtl_upd_srv_req_no_VC(info);
		if (vc == columnDtl_del_usr_id) return doDtl_del_usr_id_VC(info);
		if (vc == columnDtl_del_usr_nm) return doDtl_del_usr_nm_VC(info);
		if (vc == columnDtl_del_ts) return doDtl_del_ts_VC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_calc_ctg_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_itm_jnl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_itm_jnl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_ac_rsn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_tgt_dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_tgt_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tgt_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[tgt_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_tgt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[no_tgt_loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_no_tgt_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_trans_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_trans_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[io_trans_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_io_trans_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_off_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_on_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [BulkSet]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doBulkSet_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_calc_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_slip_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_jnl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ac_rsn_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ac_rsn_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tgt_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tgt_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tgt_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tgt_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[tgt_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_tgt_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_null_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_null_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_trans_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[io_trans_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_io_trans_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_amt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_amt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dpt_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_flg_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[oper_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_oper_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ctg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sublot_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sublot_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sno4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sno4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_mfg_inst_no_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ1_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ2_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_inpt_loc_typ3_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_del_ts_VC(MCEventInfo info){
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
		if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NC(info);
		else if (nc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NC(info);
		else if (nc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NC(info);
		else if (nc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NC(info);
		else if (nc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NC(info);
		else if (nc == Cnd_no_itm_jnl_flg) doCnd_no_itm_jnl_flg_NC(info);
		else if (nc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NC(info);
		else if (nc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NC(info);
		else if (nc == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NC(info);
		else if (nc == Cnd_tgt_dpt_cd) doCnd_tgt_dpt_cd_NC(info);
		else if (nc == Cnd_tgt_dpt_nm) doCnd_tgt_dpt_nm_NC(info);
		else if (nc == Cnd_no_tgt_dpt_flg) doCnd_no_tgt_dpt_flg_NC(info);
		else if (nc == Cnd_tgt_loc_cd) doCnd_tgt_loc_cd_NC(info);
		else if (nc == Cnd_tgt_loc_nm) doCnd_tgt_loc_nm_NC(info);
		else if (nc == Cnd_no_tgt_loc_flg) doCnd_no_tgt_loc_flg_NC(info);
		else if (nc == Cnd_io_trans_typ) doCnd_io_trans_typ_NC(info);
		else if (nc == Cnd_io_trans_typ_nm) doCnd_io_trans_typ_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NC(info);
		else if (nc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_wg_nm) doDtl_wg_nm_NC(info);
		else if (nc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NC(info);
		else if (nc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnDtl_prio) doDtl_prio_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NC(info);
		else if (nc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NC(info);
		else if (nc == columnDtl_ac_rsn_null_flg) doDtl_ac_rsn_null_flg_NC(info);
		else if (nc == columnDtl_tgt_dpt_cd) doDtl_tgt_dpt_cd_NC(info);
		else if (nc == columnDtl_tgt_dpt_nm) doDtl_tgt_dpt_nm_NC(info);
		else if (nc == columnDtl_tgt_loc_cd) doDtl_tgt_loc_cd_NC(info);
		else if (nc == columnDtl_tgt_loc_nm) doDtl_tgt_loc_nm_NC(info);
		else if (nc == columnDtl_loc_null_flg) doDtl_loc_null_flg_NC(info);
		else if (nc == columnDtl_io_trans_typ) doDtl_io_trans_typ_NC(info);
		else if (nc == columnDtl_io_trans_typ_nm) doDtl_io_trans_typ_nm_NC(info);
		else if (nc == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NC(info);
		else if (nc == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NC(info);
		else if (nc == columnDtl_alc_amt_flg) doDtl_alc_amt_flg_NC(info);
		else if (nc == columnDtl_alc_wg_cd) doDtl_alc_wg_cd_NC(info);
		else if (nc == columnDtl_alc_wg_nm) doDtl_alc_wg_nm_NC(info);
		else if (nc == columnDtl_dpt_flg) doDtl_dpt_flg_NC(info);
		else if (nc == columnDtl_dpt_cd) doDtl_dpt_cd_NC(info);
		else if (nc == columnDtl_dpt_nm) doDtl_dpt_nm_NC(info);
		else if (nc == columnDtl_loc_flg) doDtl_loc_flg_NC(info);
		else if (nc == columnDtl_loc_cd) doDtl_loc_cd_NC(info);
		else if (nc == columnDtl_loc_nm) doDtl_loc_nm_NC(info);
		else if (nc == columnDtl_oper_flg) doDtl_oper_flg_NC(info);
		else if (nc == columnDtl_oper_cd) doDtl_oper_cd_NC(info);
		else if (nc == columnDtl_oper_nm) doDtl_oper_nm_NC(info);
		else if (nc == columnDtl_bp_flg) doDtl_bp_flg_NC(info);
		else if (nc == columnDtl_bp_cd) doDtl_bp_cd_NC(info);
		else if (nc == columnDtl_bp_nm) doDtl_bp_nm_NC(info);
		else if (nc == columnDtl_ctg_flg) doDtl_ctg_flg_NC(info);
		else if (nc == columnDtl_ctg_cd) doDtl_ctg_cd_NC(info);
		else if (nc == columnDtl_ctg_nm) doDtl_ctg_nm_NC(info);
		else if (nc == columnDtl_itm_flg) doDtl_itm_flg_NC(info);
		else if (nc == columnDtl_lot_no_flg) doDtl_lot_no_flg_NC(info);
		else if (nc == columnDtl_lot_no) doDtl_lot_no_NC(info);
		else if (nc == columnDtl_sublot_no_flg) doDtl_sublot_no_flg_NC(info);
		else if (nc == columnDtl_sublot_no) doDtl_sublot_no_NC(info);
		else if (nc == columnDtl_sno1_flg) doDtl_sno1_flg_NC(info);
		else if (nc == columnDtl_sno1) doDtl_sno1_NC(info);
		else if (nc == columnDtl_sno2_flg) doDtl_sno2_flg_NC(info);
		else if (nc == columnDtl_sno2) doDtl_sno2_NC(info);
		else if (nc == columnDtl_sno3_flg) doDtl_sno3_flg_NC(info);
		else if (nc == columnDtl_sno3) doDtl_sno3_NC(info);
		else if (nc == columnDtl_sno4_flg) doDtl_sno4_flg_NC(info);
		else if (nc == columnDtl_sno4) doDtl_sno4_NC(info);
		else if (nc == columnDtl_itm_mfg_inst_no_flg) doDtl_itm_mfg_inst_no_flg_NC(info);
		else if (nc == columnDtl_inpt_loc_typ1) doDtl_inpt_loc_typ1_NC(info);
		else if (nc == columnDtl_inpt_loc_typ1_nm) doDtl_inpt_loc_typ1_nm_NC(info);
		else if (nc == columnDtl_inpt_loc_typ2) doDtl_inpt_loc_typ2_NC(info);
		else if (nc == columnDtl_inpt_loc_typ2_nm) doDtl_inpt_loc_typ2_nm_NC(info);
		else if (nc == columnDtl_inpt_loc_typ3) doDtl_inpt_loc_typ3_NC(info);
		else if (nc == columnDtl_inpt_loc_typ3_nm) doDtl_inpt_loc_typ3_nm_NC(info);
		else if (nc == columnDtl_memo1) doDtl_memo1_NC(info);
		else if (nc == columnDtl_memo2) doDtl_memo2_NC(info);
		else if (nc == columnDtl_memo3) doDtl_memo3_NC(info);
		else if (nc == columnDtl_ins_usr_id) doDtl_ins_usr_id_NC(info);
		else if (nc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NC(info);
		else if (nc == columnDtl_ins_ts) doDtl_ins_ts_NC(info);
		else if (nc == columnDtl_ins_func_id) doDtl_ins_func_id_NC(info);
		else if (nc == columnDtl_ins_func_nm) doDtl_ins_func_nm_NC(info);
		else if (nc == columnDtl_upd_cntr) doDtl_upd_cntr_NC(info);
		else if (nc == columnDtl_upd_usr_id) doDtl_upd_usr_id_NC(info);
		else if (nc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NC(info);
		else if (nc == columnDtl_upd_ts) doDtl_upd_ts_NC(info);
		else if (nc == columnDtl_upd_func_id) doDtl_upd_func_id_NC(info);
		else if (nc == columnDtl_upd_func_nm) doDtl_upd_func_nm_NC(info);
		else if (nc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NC(info);
		else if (nc == columnDtl_del_usr_id) doDtl_del_usr_id_NC(info);
		else if (nc == columnDtl_del_usr_nm) doDtl_del_usr_nm_NC(info);
		else if (nc == columnDtl_del_ts) doDtl_del_ts_NC(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm_jnl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm_jnl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_null_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_null_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_amt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_amt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NE(info);
		else if (ne == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NE(info);
		else if (ne == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NE(info);
		else if (ne == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NE(info);
		else if (ne == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NE(info);
		else if (ne == Cnd_no_itm_jnl_flg) doCnd_no_itm_jnl_flg_NE(info);
		else if (ne == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NE(info);
		else if (ne == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NE(info);
		else if (ne == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NE(info);
		else if (ne == Cnd_tgt_dpt_cd) doCnd_tgt_dpt_cd_NE(info);
		else if (ne == Cnd_tgt_dpt_nm) doCnd_tgt_dpt_nm_NE(info);
		else if (ne == Cnd_no_tgt_dpt_flg) doCnd_no_tgt_dpt_flg_NE(info);
		else if (ne == Cnd_tgt_loc_cd) doCnd_tgt_loc_cd_NE(info);
		else if (ne == Cnd_tgt_loc_nm) doCnd_tgt_loc_nm_NE(info);
		else if (ne == Cnd_no_tgt_loc_flg) doCnd_no_tgt_loc_flg_NE(info);
		else if (ne == Cnd_io_trans_typ) doCnd_io_trans_typ_NE(info);
		else if (ne == Cnd_io_trans_typ_nm) doCnd_io_trans_typ_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NE(info);
		else if (ne == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_wg_nm) doDtl_wg_nm_NE(info);
		else if (ne == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NE(info);
		else if (ne == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnDtl_prio) doDtl_prio_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NE(info);
		else if (ne == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NE(info);
		else if (ne == columnDtl_ac_rsn_null_flg) doDtl_ac_rsn_null_flg_NE(info);
		else if (ne == columnDtl_tgt_dpt_cd) doDtl_tgt_dpt_cd_NE(info);
		else if (ne == columnDtl_tgt_dpt_nm) doDtl_tgt_dpt_nm_NE(info);
		else if (ne == columnDtl_tgt_loc_cd) doDtl_tgt_loc_cd_NE(info);
		else if (ne == columnDtl_tgt_loc_nm) doDtl_tgt_loc_nm_NE(info);
		else if (ne == columnDtl_loc_null_flg) doDtl_loc_null_flg_NE(info);
		else if (ne == columnDtl_io_trans_typ) doDtl_io_trans_typ_NE(info);
		else if (ne == columnDtl_io_trans_typ_nm) doDtl_io_trans_typ_nm_NE(info);
		else if (ne == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NE(info);
		else if (ne == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NE(info);
		else if (ne == columnDtl_alc_amt_flg) doDtl_alc_amt_flg_NE(info);
		else if (ne == columnDtl_alc_wg_cd) doDtl_alc_wg_cd_NE(info);
		else if (ne == columnDtl_alc_wg_nm) doDtl_alc_wg_nm_NE(info);
		else if (ne == columnDtl_dpt_flg) doDtl_dpt_flg_NE(info);
		else if (ne == columnDtl_dpt_cd) doDtl_dpt_cd_NE(info);
		else if (ne == columnDtl_dpt_nm) doDtl_dpt_nm_NE(info);
		else if (ne == columnDtl_loc_flg) doDtl_loc_flg_NE(info);
		else if (ne == columnDtl_loc_cd) doDtl_loc_cd_NE(info);
		else if (ne == columnDtl_loc_nm) doDtl_loc_nm_NE(info);
		else if (ne == columnDtl_oper_flg) doDtl_oper_flg_NE(info);
		else if (ne == columnDtl_oper_cd) doDtl_oper_cd_NE(info);
		else if (ne == columnDtl_oper_nm) doDtl_oper_nm_NE(info);
		else if (ne == columnDtl_bp_flg) doDtl_bp_flg_NE(info);
		else if (ne == columnDtl_bp_cd) doDtl_bp_cd_NE(info);
		else if (ne == columnDtl_bp_nm) doDtl_bp_nm_NE(info);
		else if (ne == columnDtl_ctg_flg) doDtl_ctg_flg_NE(info);
		else if (ne == columnDtl_ctg_cd) doDtl_ctg_cd_NE(info);
		else if (ne == columnDtl_ctg_nm) doDtl_ctg_nm_NE(info);
		else if (ne == columnDtl_itm_flg) doDtl_itm_flg_NE(info);
		else if (ne == columnDtl_lot_no_flg) doDtl_lot_no_flg_NE(info);
		else if (ne == columnDtl_lot_no) doDtl_lot_no_NE(info);
		else if (ne == columnDtl_sublot_no_flg) doDtl_sublot_no_flg_NE(info);
		else if (ne == columnDtl_sublot_no) doDtl_sublot_no_NE(info);
		else if (ne == columnDtl_sno1_flg) doDtl_sno1_flg_NE(info);
		else if (ne == columnDtl_sno1) doDtl_sno1_NE(info);
		else if (ne == columnDtl_sno2_flg) doDtl_sno2_flg_NE(info);
		else if (ne == columnDtl_sno2) doDtl_sno2_NE(info);
		else if (ne == columnDtl_sno3_flg) doDtl_sno3_flg_NE(info);
		else if (ne == columnDtl_sno3) doDtl_sno3_NE(info);
		else if (ne == columnDtl_sno4_flg) doDtl_sno4_flg_NE(info);
		else if (ne == columnDtl_sno4) doDtl_sno4_NE(info);
		else if (ne == columnDtl_itm_mfg_inst_no_flg) doDtl_itm_mfg_inst_no_flg_NE(info);
		else if (ne == columnDtl_inpt_loc_typ1) doDtl_inpt_loc_typ1_NE(info);
		else if (ne == columnDtl_inpt_loc_typ1_nm) doDtl_inpt_loc_typ1_nm_NE(info);
		else if (ne == columnDtl_inpt_loc_typ2) doDtl_inpt_loc_typ2_NE(info);
		else if (ne == columnDtl_inpt_loc_typ2_nm) doDtl_inpt_loc_typ2_nm_NE(info);
		else if (ne == columnDtl_inpt_loc_typ3) doDtl_inpt_loc_typ3_NE(info);
		else if (ne == columnDtl_inpt_loc_typ3_nm) doDtl_inpt_loc_typ3_nm_NE(info);
		else if (ne == columnDtl_memo1) doDtl_memo1_NE(info);
		else if (ne == columnDtl_memo2) doDtl_memo2_NE(info);
		else if (ne == columnDtl_memo3) doDtl_memo3_NE(info);
		else if (ne == columnDtl_ins_usr_id) doDtl_ins_usr_id_NE(info);
		else if (ne == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NE(info);
		else if (ne == columnDtl_ins_ts) doDtl_ins_ts_NE(info);
		else if (ne == columnDtl_ins_func_id) doDtl_ins_func_id_NE(info);
		else if (ne == columnDtl_ins_func_nm) doDtl_ins_func_nm_NE(info);
		else if (ne == columnDtl_upd_cntr) doDtl_upd_cntr_NE(info);
		else if (ne == columnDtl_upd_usr_id) doDtl_upd_usr_id_NE(info);
		else if (ne == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NE(info);
		else if (ne == columnDtl_upd_ts) doDtl_upd_ts_NE(info);
		else if (ne == columnDtl_upd_func_id) doDtl_upd_func_id_NE(info);
		else if (ne == columnDtl_upd_func_nm) doDtl_upd_func_nm_NE(info);
		else if (ne == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NE(info);
		else if (ne == columnDtl_del_usr_id) doDtl_del_usr_id_NE(info);
		else if (ne == columnDtl_del_usr_nm) doDtl_del_usr_nm_NE(info);
		else if (ne == columnDtl_del_ts) doDtl_del_ts_NE(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm_jnl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm_jnl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_null_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_null_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_amt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_amt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_NX(info);
		else if (nx == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_ac_slip_typ) doCnd_ac_slip_typ_NX(info);
		else if (nx == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_NX(info);
		else if (nx == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_NX(info);
		else if (nx == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_NX(info);
		else if (nx == Cnd_no_itm_jnl_flg) doCnd_no_itm_jnl_flg_NX(info);
		else if (nx == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_NX(info);
		else if (nx == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_NX(info);
		else if (nx == Cnd_no_ac_rsn_flg) doCnd_no_ac_rsn_flg_NX(info);
		else if (nx == Cnd_tgt_dpt_cd) doCnd_tgt_dpt_cd_NX(info);
		else if (nx == Cnd_tgt_dpt_nm) doCnd_tgt_dpt_nm_NX(info);
		else if (nx == Cnd_no_tgt_dpt_flg) doCnd_no_tgt_dpt_flg_NX(info);
		else if (nx == Cnd_tgt_loc_cd) doCnd_tgt_loc_cd_NX(info);
		else if (nx == Cnd_tgt_loc_nm) doCnd_tgt_loc_nm_NX(info);
		else if (nx == Cnd_no_tgt_loc_flg) doCnd_no_tgt_loc_flg_NX(info);
		else if (nx == Cnd_io_trans_typ) doCnd_io_trans_typ_NX(info);
		else if (nx == Cnd_io_trans_typ_nm) doCnd_io_trans_typ_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_NX(info);
		else if (nx == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_wg_nm) doDtl_wg_nm_NX(info);
		else if (nx == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NX(info);
		else if (nx == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnDtl_prio) doDtl_prio_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NX(info);
		else if (nx == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NX(info);
		else if (nx == columnDtl_ac_rsn_null_flg) doDtl_ac_rsn_null_flg_NX(info);
		else if (nx == columnDtl_tgt_dpt_cd) doDtl_tgt_dpt_cd_NX(info);
		else if (nx == columnDtl_tgt_dpt_nm) doDtl_tgt_dpt_nm_NX(info);
		else if (nx == columnDtl_tgt_loc_cd) doDtl_tgt_loc_cd_NX(info);
		else if (nx == columnDtl_tgt_loc_nm) doDtl_tgt_loc_nm_NX(info);
		else if (nx == columnDtl_loc_null_flg) doDtl_loc_null_flg_NX(info);
		else if (nx == columnDtl_io_trans_typ) doDtl_io_trans_typ_NX(info);
		else if (nx == columnDtl_io_trans_typ_nm) doDtl_io_trans_typ_nm_NX(info);
		else if (nx == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NX(info);
		else if (nx == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NX(info);
		else if (nx == columnDtl_alc_amt_flg) doDtl_alc_amt_flg_NX(info);
		else if (nx == columnDtl_alc_wg_cd) doDtl_alc_wg_cd_NX(info);
		else if (nx == columnDtl_alc_wg_nm) doDtl_alc_wg_nm_NX(info);
		else if (nx == columnDtl_dpt_flg) doDtl_dpt_flg_NX(info);
		else if (nx == columnDtl_dpt_cd) doDtl_dpt_cd_NX(info);
		else if (nx == columnDtl_dpt_nm) doDtl_dpt_nm_NX(info);
		else if (nx == columnDtl_loc_flg) doDtl_loc_flg_NX(info);
		else if (nx == columnDtl_loc_cd) doDtl_loc_cd_NX(info);
		else if (nx == columnDtl_loc_nm) doDtl_loc_nm_NX(info);
		else if (nx == columnDtl_oper_flg) doDtl_oper_flg_NX(info);
		else if (nx == columnDtl_oper_cd) doDtl_oper_cd_NX(info);
		else if (nx == columnDtl_oper_nm) doDtl_oper_nm_NX(info);
		else if (nx == columnDtl_bp_flg) doDtl_bp_flg_NX(info);
		else if (nx == columnDtl_bp_cd) doDtl_bp_cd_NX(info);
		else if (nx == columnDtl_bp_nm) doDtl_bp_nm_NX(info);
		else if (nx == columnDtl_ctg_flg) doDtl_ctg_flg_NX(info);
		else if (nx == columnDtl_ctg_cd) doDtl_ctg_cd_NX(info);
		else if (nx == columnDtl_ctg_nm) doDtl_ctg_nm_NX(info);
		else if (nx == columnDtl_itm_flg) doDtl_itm_flg_NX(info);
		else if (nx == columnDtl_lot_no_flg) doDtl_lot_no_flg_NX(info);
		else if (nx == columnDtl_lot_no) doDtl_lot_no_NX(info);
		else if (nx == columnDtl_sublot_no_flg) doDtl_sublot_no_flg_NX(info);
		else if (nx == columnDtl_sublot_no) doDtl_sublot_no_NX(info);
		else if (nx == columnDtl_sno1_flg) doDtl_sno1_flg_NX(info);
		else if (nx == columnDtl_sno1) doDtl_sno1_NX(info);
		else if (nx == columnDtl_sno2_flg) doDtl_sno2_flg_NX(info);
		else if (nx == columnDtl_sno2) doDtl_sno2_NX(info);
		else if (nx == columnDtl_sno3_flg) doDtl_sno3_flg_NX(info);
		else if (nx == columnDtl_sno3) doDtl_sno3_NX(info);
		else if (nx == columnDtl_sno4_flg) doDtl_sno4_flg_NX(info);
		else if (nx == columnDtl_sno4) doDtl_sno4_NX(info);
		else if (nx == columnDtl_itm_mfg_inst_no_flg) doDtl_itm_mfg_inst_no_flg_NX(info);
		else if (nx == columnDtl_inpt_loc_typ1) doDtl_inpt_loc_typ1_NX(info);
		else if (nx == columnDtl_inpt_loc_typ1_nm) doDtl_inpt_loc_typ1_nm_NX(info);
		else if (nx == columnDtl_inpt_loc_typ2) doDtl_inpt_loc_typ2_NX(info);
		else if (nx == columnDtl_inpt_loc_typ2_nm) doDtl_inpt_loc_typ2_nm_NX(info);
		else if (nx == columnDtl_inpt_loc_typ3) doDtl_inpt_loc_typ3_NX(info);
		else if (nx == columnDtl_inpt_loc_typ3_nm) doDtl_inpt_loc_typ3_nm_NX(info);
		else if (nx == columnDtl_memo1) doDtl_memo1_NX(info);
		else if (nx == columnDtl_memo2) doDtl_memo2_NX(info);
		else if (nx == columnDtl_memo3) doDtl_memo3_NX(info);
		else if (nx == columnDtl_ins_usr_id) doDtl_ins_usr_id_NX(info);
		else if (nx == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_NX(info);
		else if (nx == columnDtl_ins_ts) doDtl_ins_ts_NX(info);
		else if (nx == columnDtl_ins_func_id) doDtl_ins_func_id_NX(info);
		else if (nx == columnDtl_ins_func_nm) doDtl_ins_func_nm_NX(info);
		else if (nx == columnDtl_upd_cntr) doDtl_upd_cntr_NX(info);
		else if (nx == columnDtl_upd_usr_id) doDtl_upd_usr_id_NX(info);
		else if (nx == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_NX(info);
		else if (nx == columnDtl_upd_ts) doDtl_upd_ts_NX(info);
		else if (nx == columnDtl_upd_func_id) doDtl_upd_func_id_NX(info);
		else if (nx == columnDtl_upd_func_nm) doDtl_upd_func_nm_NX(info);
		else if (nx == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_NX(info);
		else if (nx == columnDtl_del_usr_id) doDtl_del_usr_id_NX(info);
		else if (nx == columnDtl_del_usr_nm) doDtl_del_usr_nm_NX(info);
		else if (nx == columnDtl_del_ts) doDtl_del_ts_NX(info);
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
	 * [Cnd]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_itm_jnl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_itm_jnl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_ac_rsn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_ac_rsn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[no_tgt_loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_no_tgt_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[off_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_off_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[on_del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_on_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_null_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_null_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_amt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_amt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_mfg_inst_no_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_mfg_inst_no_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Cnd_calc_ctg_cd) doCnd_calc_ctg_cd_LC(info);
		else if (lc == Cnd_calc_ctg_nm) doCnd_calc_ctg_nm_LC(info);
		else if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_ac_slip_typ) doCnd_ac_slip_typ_LC(info);
		else if (lc == Cnd_ac_slip_typ_nm) doCnd_ac_slip_typ_nm_LC(info);
		else if (lc == Cnd_itm_jnl_cd) doCnd_itm_jnl_cd_LC(info);
		else if (lc == Cnd_itm_jnl_nm) doCnd_itm_jnl_nm_LC(info);
		else if (lc == Cnd_ac_rsn_cd) doCnd_ac_rsn_cd_LC(info);
		else if (lc == Cnd_ac_rsn_nm) doCnd_ac_rsn_nm_LC(info);
		else if (lc == Cnd_tgt_dpt_cd) doCnd_tgt_dpt_cd_LC(info);
		else if (lc == Cnd_tgt_dpt_nm) doCnd_tgt_dpt_nm_LC(info);
		else if (lc == Cnd_tgt_loc_cd) doCnd_tgt_loc_cd_LC(info);
		else if (lc == Cnd_tgt_loc_nm) doCnd_tgt_loc_nm_LC(info);
		else if (lc == Cnd_io_trans_typ) doCnd_io_trans_typ_LC(info);
		else if (lc == Cnd_io_trans_typ_nm) doCnd_io_trans_typ_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_calc_ctg_cd) doDtl_calc_ctg_cd_LC(info);
		else if (lc == columnDtl_calc_ctg_nm) doDtl_calc_ctg_nm_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_wg_nm) doDtl_wg_nm_LC(info);
		else if (lc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_LC(info);
		else if (lc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnDtl_prio) doDtl_prio_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_LC(info);
		else if (lc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_LC(info);
		else if (lc == columnDtl_tgt_dpt_cd) doDtl_tgt_dpt_cd_LC(info);
		else if (lc == columnDtl_tgt_dpt_nm) doDtl_tgt_dpt_nm_LC(info);
		else if (lc == columnDtl_tgt_loc_cd) doDtl_tgt_loc_cd_LC(info);
		else if (lc == columnDtl_tgt_loc_nm) doDtl_tgt_loc_nm_LC(info);
		else if (lc == columnDtl_io_trans_typ) doDtl_io_trans_typ_LC(info);
		else if (lc == columnDtl_io_trans_typ_nm) doDtl_io_trans_typ_nm_LC(info);
		else if (lc == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_LC(info);
		else if (lc == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_LC(info);
		else if (lc == columnDtl_alc_wg_cd) doDtl_alc_wg_cd_LC(info);
		else if (lc == columnDtl_alc_wg_nm) doDtl_alc_wg_nm_LC(info);
		else if (lc == columnDtl_dpt_cd) doDtl_dpt_cd_LC(info);
		else if (lc == columnDtl_dpt_nm) doDtl_dpt_nm_LC(info);
		else if (lc == columnDtl_loc_cd) doDtl_loc_cd_LC(info);
		else if (lc == columnDtl_loc_nm) doDtl_loc_nm_LC(info);
		else if (lc == columnDtl_oper_cd) doDtl_oper_cd_LC(info);
		else if (lc == columnDtl_oper_nm) doDtl_oper_nm_LC(info);
		else if (lc == columnDtl_bp_cd) doDtl_bp_cd_LC(info);
		else if (lc == columnDtl_bp_nm) doDtl_bp_nm_LC(info);
		else if (lc == columnDtl_ctg_cd) doDtl_ctg_cd_LC(info);
		else if (lc == columnDtl_ctg_nm) doDtl_ctg_nm_LC(info);
		else if (lc == columnDtl_lot_no) doDtl_lot_no_LC(info);
		else if (lc == columnDtl_sublot_no) doDtl_sublot_no_LC(info);
		else if (lc == columnDtl_sno1) doDtl_sno1_LC(info);
		else if (lc == columnDtl_sno2) doDtl_sno2_LC(info);
		else if (lc == columnDtl_sno3) doDtl_sno3_LC(info);
		else if (lc == columnDtl_sno4) doDtl_sno4_LC(info);
		else if (lc == columnDtl_inpt_loc_typ1) doDtl_inpt_loc_typ1_LC(info);
		else if (lc == columnDtl_inpt_loc_typ1_nm) doDtl_inpt_loc_typ1_nm_LC(info);
		else if (lc == columnDtl_inpt_loc_typ2) doDtl_inpt_loc_typ2_LC(info);
		else if (lc == columnDtl_inpt_loc_typ2_nm) doDtl_inpt_loc_typ2_nm_LC(info);
		else if (lc == columnDtl_inpt_loc_typ3) doDtl_inpt_loc_typ3_LC(info);
		else if (lc == columnDtl_inpt_loc_typ3_nm) doDtl_inpt_loc_typ3_nm_LC(info);
		else if (lc == columnDtl_memo1) doDtl_memo1_LC(info);
		else if (lc == columnDtl_memo2) doDtl_memo2_LC(info);
		else if (lc == columnDtl_memo3) doDtl_memo3_LC(info);
		else if (lc == columnDtl_ins_usr_id) doDtl_ins_usr_id_LC(info);
		else if (lc == columnDtl_ins_usr_nm) doDtl_ins_usr_nm_LC(info);
		else if (lc == columnDtl_ins_ts) doDtl_ins_ts_LC(info);
		else if (lc == columnDtl_ins_func_id) doDtl_ins_func_id_LC(info);
		else if (lc == columnDtl_ins_func_nm) doDtl_ins_func_nm_LC(info);
		else if (lc == columnDtl_upd_cntr) doDtl_upd_cntr_LC(info);
		else if (lc == columnDtl_upd_usr_id) doDtl_upd_usr_id_LC(info);
		else if (lc == columnDtl_upd_usr_nm) doDtl_upd_usr_nm_LC(info);
		else if (lc == columnDtl_upd_ts) doDtl_upd_ts_LC(info);
		else if (lc == columnDtl_upd_func_id) doDtl_upd_func_id_LC(info);
		else if (lc == columnDtl_upd_func_nm) doDtl_upd_func_nm_LC(info);
		else if (lc == columnDtl_upd_srv_req_no) doDtl_upd_srv_req_no_LC(info);
		else if (lc == columnDtl_del_usr_id) doDtl_del_usr_id_LC(info);
		else if (lc == columnDtl_del_usr_nm) doDtl_del_usr_nm_LC(info);
		else if (lc == columnDtl_del_ts) doDtl_del_ts_LC(info);
	}

	/**
	 * [Cnd]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_calc_ctg_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[tgt_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_tgt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[io_trans_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_io_trans_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_memo3_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [BulkSet]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doBulkSet_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[calc_ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_calc_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_slip_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_slip_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_jnl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_jnl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ac_rsn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ac_rsn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[tgt_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_tgt_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[io_trans_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_io_trans_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dpt_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dpt_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[oper_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_oper_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ctg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ctg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sublot_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sublot_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sno4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sno4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ1_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ1_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ2_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ2_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[inpt_loc_typ3_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_inpt_loc_typ3_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_calc_ctg_cd]の作成メソッド
	 */
	public MCList getCnd_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_slip_typ]の作成メソッド
	 */
	public MCList getCnd_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcxferAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_itm_jnl_cd]の作成メソッド
	 */
	public MCList getCnd_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_ac_rsn_cd]の作成メソッド
	 */
	public MCList getCnd_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tgt_dpt_cd]の作成メソッド
	 */
	public MCList getCnd_tgt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_tgt_loc_cd]の作成メソッド
	 */
	public MCList getCnd_tgt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_io_trans_typ]の作成メソッド
	 */
	public MCList getCnd_io_trans_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIoTransTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_calc_ctg_cd]の作成メソッド
	 */
	public MCList getDtl_calc_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCalcCtg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_slip_typ]の作成メソッド
	 */
	public MCList getDtl_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcxferAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_tgt_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_tgt_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_tgt_loc_cd]の作成メソッド
	 */
	public MCList getDtl_tgt_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_io_trans_typ]の作成メソッド
	 */
	public MCList getDtl_io_trans_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getIoTransTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_cd]の作成メソッド
	 */
	public MCList getDtl_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_wg_cd]の作成メソッド
	 */
	public MCList getDtl_alc_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dpt_cd]の作成メソッド
	 */
	public MCList getDtl_dpt_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostDpt(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_loc_cd]の作成メソッド
	 */
	public MCList getDtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_oper_cd]の作成メソッド
	 */
	public MCList getDtl_oper_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getOper(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_bp_cd]の作成メソッド
	 */
	public MCList getDtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ctg_cd]の作成メソッド
	 */
	public MCList getDtl_ctg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostCtg(row, info);
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
	 * コンボ／リストのリスト[columnDtl_inpt_loc_typ1]の作成メソッド
	 */
	public MCList getDtl_inpt_loc_typ1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptLocTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_loc_typ2]の作成メソッド
	 */
	public MCList getDtl_inpt_loc_typ2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptLocTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_inpt_loc_typ3]の作成メソッド
	 */
	public MCList getDtl_inpt_loc_typ3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getInptLocTyp(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0640.Srch01")) {
			return new MA_MABGL0640_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0640.Sprt01")) {
			return new MA_MABGL0640_Sprt01Bridge();
		}
		if (id.equals("MA.MABGL0640.Upd01")) {
			return new MA_MABGL0640_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0640.Del01")) {
			return new MA_MABGL0640_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0640_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0640_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0640_Srch01Bridge() {
			p_MA_MABGL0640_Srch01 = new MCParam(PDef.MA_MABGL0640_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0640_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0640.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));

			p_MA_MABGL0640_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0640_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0640_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0640_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0640_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0640.CndR up0() {
			return (mcframe.clientMABG.MABGP0640.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0640.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0640.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0640_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0640_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0640.DtlR>)p_MA_MABGL0640_Srch01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MA_MABGL0640_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0640_Sprt01;

		/** コンストラクタ */
		protected MA_MABGL0640_Sprt01Bridge() {
			p_MA_MABGL0640_Sprt01 = new MCParam(PDef.MA_MABGL0640_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0640_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));

			p_MA_MABGL0640_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0640_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0640_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0640_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0640_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0640.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0640.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0640.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0640.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABGL0640_Sprt01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0640_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0640.DtlR>)p_MA_MABGL0640_Sprt01.getContainerParam().getDownBlock(0));
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
	/**
	 * [MA_MABGL0640_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0640_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0640_Upd01Bridge() {
			p_MA_MABGL0640_Upd01 = new MCParam(PDef.MA_MABGL0640_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0640_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));
			// Down

			p_MA_MABGL0640_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0640_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0640_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0640_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0640_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0640.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0640.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0640_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABGL0640_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0640_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0640_Del01;

		/** コンストラクタ */
		protected MA_MABGL0640_Del01Bridge() {
			p_MA_MABGL0640_Del01 = new MCParam(PDef.MA_MABGL0640_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0640_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0640.DtlR.class));
			// Down

			p_MA_MABGL0640_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0640_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0640_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0640_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0640_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0640.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0640.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0640_Del01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}