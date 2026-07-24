package mcframe.clientMABS.MABSP0210;

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
import mcframe.clientMABS.MABSP0210.MABSP_LotInhReg_MC.MA_MABSL0210_Srch01Caller;
import mcframe.clientMABS.MABSP0210.MABSP_LotInhReg_MC.MA_MABSL0210_Upd01Caller;
import mcframe.clientMABS.MABSP0210.MABSP_LotInhReg_MC.MA_MABSL0210_Del01Caller;
import mcframe.clientMABS.MABSP0210.MABSP_LotInhReg_MC.MA_MABSL0210_Sprt01Caller;

/**
 * 画面"MABSP_LotInhReg"パネルクラスです。<p>
 *
 * ロット継承機能に関する情報を登録します。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_LotInhReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SUBMODULE_ID = "MABS";
	/** 
	 * 画面ID<p>
	 *
	 * 画面はモジュールIDと画面IDで一意に特定できます。<br>
	 * 画面インスタンスから参照する場合には{@link #getScreenID()}を使用してください。
	 */
	public static final String SCREEN_ID = "MABSP0210";

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
	// [RegTarget]ブロック関連のField定義
	public MCPanel RegTargetPanel = null;
	public MCTitledBorder RegTargetTitledBorder = null;
	// [RegTarget]ブロックの項目のField定義
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
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3 UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	/**
	 * Common 共通.<p>
	 *
	 */
	public MCCheckBox Cnd_cmn_flg = null;
	/**
	 * WG ワーキンググループ.<p>
	 *
	 */
	public MCCheckBox Cnd_wg_flg = null;
	/**
	 * Search (Common) 検索する（共通）.<p>
	 *
	 */
	public MCButton Cnd_srch_cmn = null;
	/**
	 * Search (WG) 検索する（ワーキンググループ）.<p>
	 *
	 */
	public MCButton Cnd_srch_wg = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_par_itm_p_PPanel;
	public MCTextField Cnd_par_itm_cd;	// [Cnd]の[par_itm_p.itm_cd]を[Cnd_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub1;	// [Cnd]の[par_itm_p.itm_sub1]を[Cnd_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub2;	// [Cnd]の[par_itm_p.itm_sub2]を[Cnd_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_par_itm_sub3;	// [Cnd]の[par_itm_p.itm_sub3]を[Cnd_par_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_par_itm_nm;	// [Cnd]の[par_itm_p.itm_nm]を[Cnd_par_itm_nm]としてエイリアス定義。
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
	public MCLabel Cnd_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextComboBox Cnd_bom_ptn = null;
	public MCLabel Cnd_lot_inh_col_typ_Label = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCTextComboBox Cnd_lot_inh_col_typ = null;
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public MCTextField Cnd_lot_inh_col_typ_nm = null;
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
	// [Tbl]ブロック関連のField定義
	public MCPanel TblPanel = null;
	public MCTabbedPane TblTab = null;
	// [Tbl]ブロックの項目のField定義
	// [Hdr1]ブロック関連のField定義
	public MCPanel Hdr1Panel = null;
	// [Hdr1]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	// [Hdr]ブロックの項目のField定義
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCCheckBox Hdr_del_flg = null;
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_par_itm_p_PPanel;
	public MCTextField Hdr_par_itm_cd;	// [Hdr]の[par_itm_p.itm_cd]を[Hdr_par_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub1;	// [Hdr]の[par_itm_p.itm_sub1]を[Hdr_par_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub2;	// [Hdr]の[par_itm_p.itm_sub2]を[Hdr_par_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_par_itm_sub3;	// [Hdr]の[par_itm_p.itm_sub3]を[Hdr_par_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_par_itm_nm;	// [Hdr]の[par_itm_p.itm_nm]を[Hdr_par_itm_nm]としてエイリアス定義。
	public MCLabel Hdr_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField Hdr_wg_nm = null;
	public MCLabel Hdr_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextField Hdr_bom_ptn = null;
	public MCLabel Hdr_lot_inh_col_typ_Label = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_lot_inh_col_typ = null;
	/**
	 * Copy column type name 継承項目区分名.<p>
	 *
	 */
	public MCTextField Hdr_lot_inh_col_typ_nm = null;
	public MCLabel Hdr_lot_inh_typ_Label = null;
	/**
	 * Copy method type 継承方法区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_lot_inh_typ = null;
	/**
	 * Copy method type name 継承方法区分名.<p>
	 *
	 */
	public MCTextField Hdr_lot_inh_typ_nm = null;
	public MCLabel Hdr_add_concat_col_Label = null;
	/**
	 * Additional join column type 追加結合項目区分.<p>
	 *
	 */
	public MCTextComboBox Hdr_add_concat_col = null;
	/**
	 * Additional join column type name 追加結合項目区分名.<p>
	 *
	 */
	public MCTextField Hdr_add_concat_col_nm = null;
	/**
	 * Error when number of digits exceeded 桁数超過時エラー.<p>
	 *
	 */
	public MCCheckBox Hdr_overflow_err_flg = null;
	public MCLabel Hdr_memo1_Label = null;
	/**
	 * Memo 1 (Copy-to) メモ１（継承先）.<p>
	 *
	 */
	public MCTextField Hdr_memo1 = null;
	public MCLabel Hdr_memo2_Label = null;
	/**
	 * Memo 2 (Copy-to) メモ２（継承先）.<p>
	 *
	 */
	public MCTextField Hdr_memo2 = null;
	public MCLabel Hdr_memo3_Label = null;
	/**
	 * Memo 3 (Copy-to) メモ３（継承先）.<p>
	 *
	 */
	public MCTextField Hdr_memo3 = null;
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
	public MCLabel Hdr_del_usr_id_Label = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCTextField Hdr_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCTextField Hdr_del_usr_nm = null;
	public MCLabel Hdr_del_ts_Label = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestampField Hdr_del_ts = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	// [Hdr2]ブロック関連のField定義
	public MCPanel Hdr2Panel = null;
	// [Hdr2]ブロックの項目のField定義
	// [BtmDtl]ブロック関連のField定義
	public MCPanel BtmDtlPanel = null;
	// [BtmDtl]ブロックの項目のField定義
	// [LotInhSrc]ブロック関連のField定義
	public MCPanel LotInhSrcPanel = null;
	// [LotInhSrc]ブロックの項目のField定義
	// [ChdSet]ブロック関連のField定義
	public MCPanel ChdSetPanel = null;
	// [ChdSet]ブロックの項目のField定義
	public MCLabel ChdSet_wg_cd_Label = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCTextComboBox ChdSet_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCTextField ChdSet_wg_nm = null;
	public MCLabel ChdSet_base_dt_Label = null;
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDateField ChdSet_base_dt = null;
	public MCLabel ChdSet_par_itm_cd_Label = null;
	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public MCTextField ChdSet_par_itm_cd = null;
	public MCLabel ChdSet_par_itm_sub1_Label = null;
	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public MCTextField ChdSet_par_itm_sub1 = null;
	public MCLabel ChdSet_par_itm_sub2_Label = null;
	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public MCTextField ChdSet_par_itm_sub2 = null;
	public MCLabel ChdSet_par_itm_sub3_Label = null;
	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public MCTextField ChdSet_par_itm_sub3 = null;
	public MCLabel ChdSet_bom_ptn_Label = null;
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCTextField ChdSet_bom_ptn = null;
	public MCLabel ChdSet_lot_inh_col_typ_Label = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCTextField ChdSet_lot_inh_col_typ = null;
	/**
	 * Child item explosion 子品目展開.<p>
	 *
	 */
	public MCButton ChdSet_chd_srch = null;
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP0210.DtlR> DtlTable = null;
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
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_par_itm_p_PPanel;
	public MCColumnConfig columnDtl_par_itm_cd;// [Dtl]の[par_itm_p.itm_cd]を[columnDtl_par_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub1;// [Dtl]の[par_itm_p.itm_sub1]を[columnDtl_par_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub2;// [Dtl]の[par_itm_p.itm_sub2]を[columnDtl_par_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_par_itm_sub3;// [Dtl]の[par_itm_p.itm_sub3]を[columnDtl_par_itm_sub3]としてエイリアス定義。
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public MCColumnConfig columnDtl_bom_ptn = null;
	/**
	 * Copy column type 継承項目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_lot_inh_col_typ = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_wg_cd = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Dtl_chd_itm_p_PPanel;
	public MCColumnConfig columnDtl_chd_itm_cd;// [Dtl]の[chd_itm_p.itm_cd]を[columnDtl_chd_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub1;// [Dtl]の[chd_itm_p.itm_sub1]を[columnDtl_chd_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub2;// [Dtl]の[chd_itm_p.itm_sub2]を[columnDtl_chd_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_sub3;// [Dtl]の[chd_itm_p.itm_sub3]を[columnDtl_chd_itm_sub3]としてエイリアス定義。
	public MCColumnConfig columnDtl_chd_itm_nm;// [Dtl]の[chd_itm_p.itm_nm]を[columnDtl_chd_itm_nm]としてエイリアス定義。
	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ = null;
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_nm = null;
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_cd = null;
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_chd_itm_typ_d_nm = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_prio = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Memo 1 (Copy-from) メモ１（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo1 = null;
	/**
	 * Memo 2 (Copy-from) メモ２（継承元）.<p>
	 *
	 */
	public MCColumnConfig columnDtl_memo2 = null;
	/**
	 * Memo 3 (Copy-from) メモ３（継承元）.<p>
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
	public MCButton Btn_upd_cmn = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Btn_upd_wg = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_cmn = null;
	/**
	 * Delete 削除する.<p>
	 *
	 */
	public MCButton Btn_del_wg = null;
	// [EastBtn]ブロック関連のField定義
	public MCPanel EastBtnPanel = null;
	// [EastBtn]ブロックの項目のField定義
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, SRCH, MOD, DEL, REF, FIX_U, FIX};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL0210_Srch01]のCallerの作成 */
	protected MABSP_LotInhReg_MC.MA_MABSL0210_Srch01Caller createMA_MABSL0210_Srch01() {
		MABSP_LotInhReg_MC.MA_MABSL0210_Srch01Caller<MABSP_LotInhReg, MA_MABSL0210_Srch01Bridge>
		caller = ((MABSP_LotInhReg_MC)this).new MA_MABSL0210_Srch01Caller<MABSP_LotInhReg, MA_MABSL0210_Srch01Bridge>(
					(MABSP_LotInhReg)this, new MA_MABSL0210_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0210_Srch01]の呼び出し */
	protected void callMA_MABSL0210_Srch01() {
		MCCaller caller = createMA_MABSL0210_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0210_Upd01]のCallerの作成 */
	protected MABSP_LotInhReg_MC.MA_MABSL0210_Upd01Caller createMA_MABSL0210_Upd01() {
		MABSP_LotInhReg_MC.MA_MABSL0210_Upd01Caller<MABSP_LotInhReg, MA_MABSL0210_Upd01Bridge>
		caller = ((MABSP_LotInhReg_MC)this).new MA_MABSL0210_Upd01Caller<MABSP_LotInhReg, MA_MABSL0210_Upd01Bridge>(
					(MABSP_LotInhReg)this, new MA_MABSL0210_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0210_Upd01]の呼び出し */
	protected void callMA_MABSL0210_Upd01() {
		MCCaller caller = createMA_MABSL0210_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0210_Del01]のCallerの作成 */
	protected MABSP_LotInhReg_MC.MA_MABSL0210_Del01Caller createMA_MABSL0210_Del01() {
		MABSP_LotInhReg_MC.MA_MABSL0210_Del01Caller<MABSP_LotInhReg, MA_MABSL0210_Del01Bridge>
		caller = ((MABSP_LotInhReg_MC)this).new MA_MABSL0210_Del01Caller<MABSP_LotInhReg, MA_MABSL0210_Del01Bridge>(
					(MABSP_LotInhReg)this, new MA_MABSL0210_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0210_Del01]の呼び出し */
	protected void callMA_MABSL0210_Del01() {
		MCCaller caller = createMA_MABSL0210_Del01();
		caller.exec();
	}
	/** [MA_MABSL0210_Sprt01]のCallerの作成 */
	protected MABSP_LotInhReg_MC.MA_MABSL0210_Sprt01Caller createMA_MABSL0210_Sprt01() {
		MABSP_LotInhReg_MC.MA_MABSL0210_Sprt01Caller<MABSP_LotInhReg, MA_MABSL0210_Sprt01Bridge>
		caller = ((MABSP_LotInhReg_MC)this).new MA_MABSL0210_Sprt01Caller<MABSP_LotInhReg, MA_MABSL0210_Sprt01Bridge>(
					(MABSP_LotInhReg)this, new MA_MABSL0210_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0210_Sprt01]の呼び出し */
	protected void callMA_MABSL0210_Sprt01() {
		MCCaller caller = createMA_MABSL0210_Sprt01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0210.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0210.HdrR aHdrR;
	/** [ChdSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0210.ChdSetR aChdSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0210.DtlR> aDtlL;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0210.HdrR> aHdrAllL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0210.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0210.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0210.CndR createCndR() {
		return mcframe.clientMABS.MABSP0210.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABS.MABSP0210.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP0210.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP0210.HdrR createHdrR() {
		return mcframe.clientMABS.MABSP0210.HdrR.create();
	}

	/**
	 * 項目コピーによってaChdSetRを設定します。
	 *
	 * aChdSetRのインスタンスは変更されません。
	 *
	 * @param row ChdSetR
	 */
	public void setChdSetR(mcframe.clientMABS.MABSP0210.ChdSetR row) {
		if (row != null) {
			MCRow.copyall(getChdSetR(), row);
		}
	}

	/**
	 * [ChdSet]ブロックのコンテナaChdSetRを返します。
	 *
	 * @return ChdSetR
	 */
	public mcframe.clientMABS.MABSP0210.ChdSetR getChdSetR() {
		return aChdSetR;
	}

	/**
	 * aChdSetRを作成します。
	 *
	 * @return ChdSetR
	 */
	public mcframe.clientMABS.MABSP0210.ChdSetR createChdSetR() {
		return mcframe.clientMABS.MABSP0210.ChdSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0210.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0210.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0210.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0210.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0210.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class);
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
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABS.MABSP0210.HdrR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0210.HdrR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABS.MABSP0210.HdrR createHdrAllR() {
		return mcframe.clientMABS.MABSP0210.HdrR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP0210.HdrR> createHdrAllL() {
		return MCList.create(mcframe.clientMABS.MABSP0210.HdrR.class);
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
		if(!MCCollectionUtil.contains(ret, getChdSetR())) ret.add(getChdSetR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getHdrAllL())) ret.add(getHdrAllL());
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
		if(aCnt == getChdSetR()) return "ChdSet";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getHdrAllL()) return "HdrAll";
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
		if(bId.equals("ChdSet")) return getChdSetR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("HdrAll")) return getHdrAllL();
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
		ret.add(RegTargetPanel);
		ret.add(TopPanel);
		ret.add(FoldPanel);
		ret.add(CndPanel);
		ret.add(CtrlPanel);
		ret.add(TblPanel);
		ret.add(Hdr1Panel);
		ret.add(HdrPanel);
		ret.add(Hdr2Panel);
		ret.add(BtmDtlPanel);
		ret.add(LotInhSrcPanel);
		ret.add(ChdSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_LotInhReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aChdSetR = createChdSetR();
		aDtlL = createDtlL();
		aHdrAllL = createHdrAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_LotInhReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aChdSetR = createChdSetR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aHdrAllL = createHdrAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_LotInhReg_MC.jbCreateScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateRegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateTop((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateFold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateCnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateCtrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateTbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateHdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateHdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateHdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateBtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateLotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbCreateEastBtn((MABSP_LotInhReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_LotInhReg p) {
	}

	/**
	 * [RegTarget]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateRegTarget(MABSP_LotInhReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_LotInhReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_LotInhReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_LotInhReg p) {
		p.Cnd_dt_PPanel = mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.create(p.getCndR().dt());
		p.Cnd_dt_PPanel.setName("Cnd.dt");
		p.Cnd_st_dt_fr = p.Cnd_dt_PPanel.StEndDt_st_dt_fr;
		p.Cnd_st_dt_fr.addAliasName("Cnd.st_dt_fr", p);
		p.Cnd_st_dt_to = p.Cnd_dt_PPanel.StEndDt_st_dt_to;
		p.Cnd_st_dt_to.addAliasName("Cnd.st_dt_to", p);
		p.Cnd_end_dt_fr = p.Cnd_dt_PPanel.StEndDt_end_dt_fr;
		p.Cnd_end_dt_fr.addAliasName("Cnd.end_dt_fr", p);
		p.Cnd_end_dt_to = p.Cnd_dt_PPanel.StEndDt_end_dt_to;
		p.Cnd_end_dt_to.addAliasName("Cnd.end_dt_to", p);
		p.Cnd_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().par_itm_p());
		p.Cnd_par_itm_p_PPanel.setName("Cnd.par_itm_p");
		p.Cnd_par_itm_cd = p.Cnd_par_itm_p_PPanel.Itm_itm_cd;
		p.Cnd_par_itm_cd.addAliasName("Cnd.par_itm_cd", p);
		p.Cnd_par_itm_sub1 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub1;
		p.Cnd_par_itm_sub1.addAliasName("Cnd.par_itm_sub1", p);
		p.Cnd_par_itm_sub2 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub2;
		p.Cnd_par_itm_sub2.addAliasName("Cnd.par_itm_sub2", p);
		p.Cnd_par_itm_sub3 = p.Cnd_par_itm_p_PPanel.Itm_itm_sub3;
		p.Cnd_par_itm_sub3.addAliasName("Cnd.par_itm_sub3", p);
		p.Cnd_par_itm_nm = p.Cnd_par_itm_p_PPanel.Itm_itm_nm;
		p.Cnd_par_itm_nm.addAliasName("Cnd.par_itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_LotInhReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABSP_LotInhReg p) {
	}

	/**
	 * [Hdr1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr1(MABSP_LotInhReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_LotInhReg p) {
		p.Hdr_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().par_itm_p());
		p.Hdr_par_itm_p_PPanel.setName("Hdr.par_itm_p");
		p.Hdr_par_itm_cd = p.Hdr_par_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_par_itm_cd.addAliasName("Hdr.par_itm_cd", p);
		p.Hdr_par_itm_sub1 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_par_itm_sub1.addAliasName("Hdr.par_itm_sub1", p);
		p.Hdr_par_itm_sub2 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_par_itm_sub2.addAliasName("Hdr.par_itm_sub2", p);
		p.Hdr_par_itm_sub3 = p.Hdr_par_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_par_itm_sub3.addAliasName("Hdr.par_itm_sub3", p);
		p.Hdr_par_itm_nm = p.Hdr_par_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_par_itm_nm.addAliasName("Hdr.par_itm_nm", p);
	}

	/**
	 * [Hdr2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr2(MABSP_LotInhReg p) {
	}

	/**
	 * [BtmDtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtmDtl(MABSP_LotInhReg p) {
	}

	/**
	 * [LotInhSrc]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLotInhSrc(MABSP_LotInhReg p) {
	}

	/**
	 * [ChdSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateChdSet(MABSP_LotInhReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_LotInhReg p) {
		p.Dtl_par_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0210.DtlR.$par_itm_p);
		p.Dtl_par_itm_p_PPanel.setName("Dtl.par_itm_p");
		p.columnDtl_par_itm_cd = p.Dtl_par_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_par_itm_cd.addAliasName("Dtl.par_itm_cd", p);
		p.columnDtl_par_itm_sub1 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_par_itm_sub1.addAliasName("Dtl.par_itm_sub1", p);
		p.columnDtl_par_itm_sub2 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_par_itm_sub2.addAliasName("Dtl.par_itm_sub2", p);
		p.columnDtl_par_itm_sub3 = p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_par_itm_sub3.addAliasName("Dtl.par_itm_sub3", p);
		p.Dtl_chd_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP0210.DtlR.$chd_itm_p);
		p.Dtl_chd_itm_p_PPanel.setName("Dtl.chd_itm_p");
		p.columnDtl_chd_itm_cd = p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd;
		p.columnDtl_chd_itm_cd.addAliasName("Dtl.chd_itm_cd", p);
		p.columnDtl_chd_itm_sub1 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1;
		p.columnDtl_chd_itm_sub1.addAliasName("Dtl.chd_itm_sub1", p);
		p.columnDtl_chd_itm_sub2 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2;
		p.columnDtl_chd_itm_sub2.addAliasName("Dtl.chd_itm_sub2", p);
		p.columnDtl_chd_itm_sub3 = p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3;
		p.columnDtl_chd_itm_sub3.addAliasName("Dtl.chd_itm_sub3", p);
		p.columnDtl_chd_itm_nm = p.Dtl_chd_itm_p_PPanel.columnItm_itm_nm;
		p.columnDtl_chd_itm_nm.addAliasName("Dtl.chd_itm_nm", p);
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0210.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_LotInhReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_LotInhReg p) {
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

	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_cd_p = createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub1_p = createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub2_p = createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Cnd_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Cnd_par_itm_p_PPanel_Itm_itm_sub3_p = createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Cnd_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm");
		}
		return Cnd_par_itm_p_PPanel_Itm_itm_sub3_p;
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
	
	
	/** [Cnd_bom_ptn_ListPutter]の定義 */
	private MCListPutter Cnd_bom_ptn_p = null;

	/**
	 * [Cnd_bom_ptn_ListPutter]の取得
	 */
	protected MCListPutter getCnd_bom_ptn_ListPutter() {
		if (Cnd_bom_ptn_p == null) {
			Cnd_bom_ptn_p = createCnd_bom_ptn_ListPutter(Cnd_bom_ptn, "bom_ptn");

		}
		return Cnd_bom_ptn_p;
	}
	
	
	/** [Cnd_lot_inh_col_typ_ListPutter]の定義 */
	private MCListPutter Cnd_lot_inh_col_typ_p = null;

	/**
	 * [Cnd_lot_inh_col_typ_ListPutter]の取得
	 */
	protected MCListPutter getCnd_lot_inh_col_typ_ListPutter() {
		if (Cnd_lot_inh_col_typ_p == null) {
			Cnd_lot_inh_col_typ_p = createCnd_lot_inh_col_typ_ListPutter(Cnd_lot_inh_col_typ, "lot_inh_col_typ", "lot_inh_col_typ_nm");

		}
		return Cnd_lot_inh_col_typ_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_cd_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_cd_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_cd_p = createHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_cd, "par_itm_cd", "par_itm_nm","par_itm_sub1","par_itm_sub2","par_itm_sub3","bom_ptn");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_cd_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub1_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub1_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub1_p = createHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub1, "par_itm_sub1", "par_itm_nm","par_itm_sub2","par_itm_sub3","bom_ptn");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub1_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub2_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub2_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub2_p = createHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub2, "par_itm_sub2", "par_itm_nm","par_itm_sub3","bom_ptn");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub2_p;
	}
	
	
	/** [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Hdr_par_itm_p_PPanel_Itm_itm_sub3_p = null;

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter() {
		if (Hdr_par_itm_p_PPanel_Itm_itm_sub3_p == null) {
			Hdr_par_itm_p_PPanel_Itm_itm_sub3_p = createHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(Hdr_par_itm_p_PPanel.Itm_itm_sub3, "par_itm_sub3", "par_itm_nm","bom_ptn");
		}
		return Hdr_par_itm_p_PPanel_Itm_itm_sub3_p;
	}
	
	
	/** [Hdr_wg_cd_ListPutter]の定義 */
	private MCListPutter Hdr_wg_cd_p = null;

	/**
	 * [Hdr_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_wg_cd_ListPutter() {
		if (Hdr_wg_cd_p == null) {
			Hdr_wg_cd_p = createHdr_wg_cd_ListPutter(Hdr_wg_cd, "wg_cd", "wg_nm");

		}
		return Hdr_wg_cd_p;
	}
	
	
	/** [Hdr_lot_inh_col_typ_ListPutter]の定義 */
	private MCListPutter Hdr_lot_inh_col_typ_p = null;

	/**
	 * [Hdr_lot_inh_col_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_lot_inh_col_typ_ListPutter() {
		if (Hdr_lot_inh_col_typ_p == null) {
			Hdr_lot_inh_col_typ_p = createHdr_lot_inh_col_typ_ListPutter(Hdr_lot_inh_col_typ, "lot_inh_col_typ", "lot_inh_col_typ_nm");

		}
		return Hdr_lot_inh_col_typ_p;
	}
	
	
	/** [Hdr_lot_inh_typ_ListPutter]の定義 */
	private MCListPutter Hdr_lot_inh_typ_p = null;

	/**
	 * [Hdr_lot_inh_typ_ListPutter]の取得
	 */
	protected MCListPutter getHdr_lot_inh_typ_ListPutter() {
		if (Hdr_lot_inh_typ_p == null) {
			Hdr_lot_inh_typ_p = createHdr_lot_inh_typ_ListPutter(Hdr_lot_inh_typ, "lot_inh_typ", "lot_inh_typ_nm");

		}
		return Hdr_lot_inh_typ_p;
	}
	
	
	/** [Hdr_add_concat_col_ListPutter]の定義 */
	private MCListPutter Hdr_add_concat_col_p = null;

	/**
	 * [Hdr_add_concat_col_ListPutter]の取得
	 */
	protected MCListPutter getHdr_add_concat_col_ListPutter() {
		if (Hdr_add_concat_col_p == null) {
			Hdr_add_concat_col_p = createHdr_add_concat_col_ListPutter(Hdr_add_concat_col, "add_concat_col", "add_concat_col_nm");

		}
		return Hdr_add_concat_col_p;
	}
	
	
	/** [ChdSet_wg_cd_ListPutter]の定義 */
	private MCListPutter ChdSet_wg_cd_p = null;

	/**
	 * [ChdSet_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getChdSet_wg_cd_ListPutter() {
		if (ChdSet_wg_cd_p == null) {
			ChdSet_wg_cd_p = createChdSet_wg_cd_ListPutter(ChdSet_wg_cd, "wg_cd", "wg_nm");

		}
		return ChdSet_wg_cd_p;
	}
	
	
	/** [Dtl_lot_inh_col_typ_ListPutter]の定義 */
	private MCListPutter Dtl_lot_inh_col_typ_p = null;

	/**
	 * [Dtl_lot_inh_col_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_lot_inh_col_typ_ListPutter() {
		if (Dtl_lot_inh_col_typ_p == null) {
			Dtl_lot_inh_col_typ_p = createDtl_lot_inh_col_typ_ListPutter(columnDtl_lot_inh_col_typ, "lot_inh_col_typ");

		}
		return Dtl_lot_inh_col_typ_p;
	}
	
	
	/** [Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Dtl_wg_cd_p = null;

	/**
	 * [Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_wg_cd_ListPutter() {
		if (Dtl_wg_cd_p == null) {
			Dtl_wg_cd_p = createDtl_wg_cd_ListPutter(columnDtl_wg_cd, "wg_cd");

		}
		return Dtl_wg_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p = createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_cd, "chd_itm_cd", "chd_itm_nm","chd_itm_sub1","chd_itm_sub2","chd_itm_sub3","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_cd_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub1, "chd_itm_sub1", "chd_itm_nm","chd_itm_sub2","chd_itm_sub3","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub2, "chd_itm_sub2", "chd_itm_nm","chd_itm_sub3","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_p;
	}
	
	
	/** [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の定義 */
	private MCListPutter Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = null;

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter() {
		if (Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p == null) {
			Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p = createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(Dtl_chd_itm_p_PPanel.columnItm_itm_sub3, "chd_itm_sub3", "chd_itm_nm","chd_itm_typ","chd_itm_typ_nm","chd_itm_typ_d_cd","chd_itm_typ_d_nm");
		}
		return Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LotInhReg create(){
		MABSP_LotInhReg p = new MABSP_LotInhReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_LotInhReg create(String name){
		MABSP_LotInhReg p = new MABSP_LotInhReg(name);
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
		MABSP_LotInhReg_MC.jbfInitScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitRegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitTop((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitFold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitCnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitCtrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitTbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitHdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitHdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitHdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitBtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitLotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbfInitEastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitRegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitTop((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitFold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitCnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitCtrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitTbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitHdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitHdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitHdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitBtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitLotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.jbInitEastBtn((MABSP_LotInhReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitRegTarget(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel = p.beansFactory.createPanel("RegTarget");
		p.RegTargetTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cmn_flg = p.beansFactory.createCheckBox("Cnd.cmn_flg");
		p.Cnd_wg_flg = p.beansFactory.createCheckBox("Cnd.wg_flg");
		p.Cnd_srch_cmn = p.beansFactory.createButton("Cnd.srch_cmn");
		p.Cnd_srch_wg = p.beansFactory.createButton("Cnd.srch_wg");
		p.Cnd_wg_cd_Label = p.beansFactory.createLabel("Cnd.wg_cd_Label");
		p.Cnd_wg_cd = p.beansFactory.createTextComboBox("Cnd.wg_cd");
		p.Cnd_wg_cd.setLabel(p.Cnd_wg_cd_Label);
		p.Cnd_wg_nm = p.beansFactory.createTextField("Cnd.wg_nm");
		p.Cnd_bom_ptn_Label = p.beansFactory.createLabel("Cnd.bom_ptn_Label");
		p.Cnd_bom_ptn = p.beansFactory.createTextComboBox("Cnd.bom_ptn");
		p.Cnd_bom_ptn.setLabel(p.Cnd_bom_ptn_Label);
		p.Cnd_lot_inh_col_typ_Label = p.beansFactory.createLabel("Cnd.lot_inh_col_typ_Label");
		p.Cnd_lot_inh_col_typ = p.beansFactory.createTextComboBox("Cnd.lot_inh_col_typ");
		p.Cnd_lot_inh_col_typ.setLabel(p.Cnd_lot_inh_col_typ_Label);
		p.Cnd_lot_inh_col_typ_nm = p.beansFactory.createTextField("Cnd.lot_inh_col_typ_nm");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		p.TblTab = p.beansFactory.createTabbedPane("Tbl.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr1(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel = p.beansFactory.createPanel("Hdr1");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		// ブロックの項目の初期化
		p.Hdr_del_flg = p.beansFactory.createCheckBox("Hdr.del_flg");
		p.Hdr_wg_cd_Label = p.beansFactory.createLabel("Hdr.wg_cd_Label");
		p.Hdr_wg_cd = p.beansFactory.createTextComboBox("Hdr.wg_cd");
		p.Hdr_wg_cd.setLabel(p.Hdr_wg_cd_Label);
		p.Hdr_wg_nm = p.beansFactory.createTextField("Hdr.wg_nm");
		p.Hdr_bom_ptn_Label = p.beansFactory.createLabel("Hdr.bom_ptn_Label");
		p.Hdr_bom_ptn = p.beansFactory.createTextField("Hdr.bom_ptn");
		p.Hdr_bom_ptn.setLabel(p.Hdr_bom_ptn_Label);
		p.Hdr_lot_inh_col_typ_Label = p.beansFactory.createLabel("Hdr.lot_inh_col_typ_Label");
		p.Hdr_lot_inh_col_typ = p.beansFactory.createTextComboBox("Hdr.lot_inh_col_typ");
		p.Hdr_lot_inh_col_typ.setLabel(p.Hdr_lot_inh_col_typ_Label);
		p.Hdr_lot_inh_col_typ_nm = p.beansFactory.createTextField("Hdr.lot_inh_col_typ_nm");
		p.Hdr_lot_inh_typ_Label = p.beansFactory.createLabel("Hdr.lot_inh_typ_Label");
		p.Hdr_lot_inh_typ = p.beansFactory.createTextComboBox("Hdr.lot_inh_typ");
		p.Hdr_lot_inh_typ.setLabel(p.Hdr_lot_inh_typ_Label);
		p.Hdr_lot_inh_typ_nm = p.beansFactory.createTextField("Hdr.lot_inh_typ_nm");
		p.Hdr_add_concat_col_Label = p.beansFactory.createLabel("Hdr.add_concat_col_Label");
		p.Hdr_add_concat_col = p.beansFactory.createTextComboBox("Hdr.add_concat_col");
		p.Hdr_add_concat_col.setLabel(p.Hdr_add_concat_col_Label);
		p.Hdr_add_concat_col_nm = p.beansFactory.createTextField("Hdr.add_concat_col_nm");
		p.Hdr_overflow_err_flg = p.beansFactory.createCheckBox("Hdr.overflow_err_flg");
		p.Hdr_memo1_Label = p.beansFactory.createLabel("Hdr.memo1_Label");
		p.Hdr_memo1 = p.beansFactory.createTextField("Hdr.memo1");
		p.Hdr_memo1.setLabel(p.Hdr_memo1_Label);
		p.Hdr_memo2_Label = p.beansFactory.createLabel("Hdr.memo2_Label");
		p.Hdr_memo2 = p.beansFactory.createTextField("Hdr.memo2");
		p.Hdr_memo2.setLabel(p.Hdr_memo2_Label);
		p.Hdr_memo3_Label = p.beansFactory.createLabel("Hdr.memo3_Label");
		p.Hdr_memo3 = p.beansFactory.createTextField("Hdr.memo3");
		p.Hdr_memo3.setLabel(p.Hdr_memo3_Label);
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
		p.Hdr_del_usr_id_Label = p.beansFactory.createLabel("Hdr.del_usr_id_Label");
		p.Hdr_del_usr_id = p.beansFactory.createTextField("Hdr.del_usr_id");
		p.Hdr_del_usr_id.setLabel(p.Hdr_del_usr_id_Label);
		p.Hdr_del_usr_nm = p.beansFactory.createTextField("Hdr.del_usr_nm");
		p.Hdr_del_ts_Label = p.beansFactory.createLabel("Hdr.del_ts_Label");
		p.Hdr_del_ts = p.beansFactory.createTimestampField("Hdr.del_ts");
		p.Hdr_del_ts.setLabel(p.Hdr_del_ts_Label);
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr2(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel = p.beansFactory.createPanel("Hdr2");
		// ブロックの項目の初期化
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtmDtl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.BtmDtlPanel = p.beansFactory.createPanel("BtmDtl");
		// ブロックの項目の初期化
	}

	/**
	 * [LotInhSrc]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLotInhSrc(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.LotInhSrcPanel = p.beansFactory.createPanel("LotInhSrc");
		// ブロックの項目の初期化
	}

	/**
	 * [ChdSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitChdSet(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.ChdSetPanel = p.beansFactory.createPanel("ChdSet");
		// ブロックの項目の初期化
		p.ChdSet_wg_cd_Label = p.beansFactory.createLabel("ChdSet.wg_cd_Label");
		p.ChdSet_wg_cd = p.beansFactory.createTextComboBox("ChdSet.wg_cd");
		p.ChdSet_wg_cd.setLabel(p.ChdSet_wg_cd_Label);
		p.ChdSet_wg_nm = p.beansFactory.createTextField("ChdSet.wg_nm");
		p.ChdSet_base_dt_Label = p.beansFactory.createLabel("ChdSet.base_dt_Label");
		p.ChdSet_base_dt = p.beansFactory.createDateField("ChdSet.base_dt");
		p.ChdSet_base_dt.setLabel(p.ChdSet_base_dt_Label);
		p.ChdSet_par_itm_cd_Label = p.beansFactory.createLabel("ChdSet.par_itm_cd_Label");
		p.ChdSet_par_itm_cd = p.beansFactory.createTextField("ChdSet.par_itm_cd");
		p.ChdSet_par_itm_cd.setLabel(p.ChdSet_par_itm_cd_Label);
		p.ChdSet_par_itm_sub1_Label = p.beansFactory.createLabel("ChdSet.par_itm_sub1_Label");
		p.ChdSet_par_itm_sub1 = p.beansFactory.createTextField("ChdSet.par_itm_sub1");
		p.ChdSet_par_itm_sub1.setLabel(p.ChdSet_par_itm_sub1_Label);
		p.ChdSet_par_itm_sub2_Label = p.beansFactory.createLabel("ChdSet.par_itm_sub2_Label");
		p.ChdSet_par_itm_sub2 = p.beansFactory.createTextField("ChdSet.par_itm_sub2");
		p.ChdSet_par_itm_sub2.setLabel(p.ChdSet_par_itm_sub2_Label);
		p.ChdSet_par_itm_sub3_Label = p.beansFactory.createLabel("ChdSet.par_itm_sub3_Label");
		p.ChdSet_par_itm_sub3 = p.beansFactory.createTextField("ChdSet.par_itm_sub3");
		p.ChdSet_par_itm_sub3.setLabel(p.ChdSet_par_itm_sub3_Label);
		p.ChdSet_bom_ptn_Label = p.beansFactory.createLabel("ChdSet.bom_ptn_Label");
		p.ChdSet_bom_ptn = p.beansFactory.createTextField("ChdSet.bom_ptn");
		p.ChdSet_bom_ptn.setLabel(p.ChdSet_bom_ptn_Label);
		p.ChdSet_lot_inh_col_typ_Label = p.beansFactory.createLabel("ChdSet.lot_inh_col_typ_Label");
		p.ChdSet_lot_inh_col_typ = p.beansFactory.createTextField("ChdSet.lot_inh_col_typ");
		p.ChdSet_lot_inh_col_typ.setLabel(p.ChdSet_lot_inh_col_typ_Label);
		p.ChdSet_chd_srch = p.beansFactory.createButton("ChdSet.chd_srch");
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_bom_ptn = p.beansFactory.createTableColumn("Dtl.bom_ptn", MCColumnType.TEXT);
		p.columnDtl_lot_inh_col_typ = p.beansFactory.createTableColumn("Dtl.lot_inh_col_typ", MCColumnType.TEXT_COMBO_FREE);
		p.columnDtl_wg_cd = p.beansFactory.createTableColumn("Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_chd_itm_typ = p.beansFactory.createTableColumn("Dtl.chd_itm_typ", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_nm", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_cd = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_cd", MCColumnType.TEXT);
		p.columnDtl_chd_itm_typ_d_nm = p.beansFactory.createTableColumn("Dtl.chd_itm_typ_d_nm", MCColumnType.TEXT);
		p.columnDtl_prio = p.beansFactory.createTableColumn("Dtl.prio", MCColumnType.NUMBER);
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
	protected static void jbfInitBtn(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_select_all = p.beansFactory.createButton("Btn.select_all", "no_border");
		p.Btn_deselect_all = p.beansFactory.createButton("Btn.deselect_all", "no_border");
		p.Btn_radd = p.beansFactory.createButton("Btn.radd", "no_border");
		p.Btn_rdel = p.beansFactory.createButton("Btn.rdel", "no_border");
		p.Btn_rcopy = p.beansFactory.createButton("Btn.rcopy", "no_border");
		p.Btn_upd_cmn = p.beansFactory.createButton("Btn.upd_cmn", "upd");
		p.Btn_upd_wg = p.beansFactory.createButton("Btn.upd_wg", "upd");
		p.Btn_del_cmn = p.beansFactory.createButton("Btn.del_cmn", "del");
		p.Btn_del_wg = p.beansFactory.createButton("Btn.del_wg", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.RegTargetPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [RegTarget]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitRegTarget(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.RegTargetPanel.setBorder(p.RegTargetTitledBorder);
		p.add(p.RegTargetPanel);
		p.RegTargetPanel.setNextBeans(p.TopPanel);
		p.RegTargetPanel.setValueCheck(false);
		p.RegTargetPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.RegTargetPanel.setLayoutPosition("NWXC");
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTop(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.TblPanel);
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
	protected static void jbInitFold(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ScreenOpePanel.setLastBeans(p.Cnd_ope_Group);
		p.Cnd_ope_Group.setFirstBeans(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setActionCommand("0");
		p.Cnd_ope_Group.add(p.Cnd_ope_UPD);
		p.ScreenOpePanel.add(p.Cnd_ope_UPD);
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setActionCommand("4");
		p.Cnd_ope_Group.add(p.Cnd_ope_MOD);
		p.ScreenOpePanel.add(p.Cnd_ope_MOD);
		p.Cnd_ope_MOD.setNextBeans(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setActionCommand("1");
		p.Cnd_ope_Group.add(p.Cnd_ope_DEL);
		p.ScreenOpePanel.add(p.Cnd_ope_DEL);
		p.Cnd_ope_DEL.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.ope_META);
		p.RegTargetPanel.add(p.Cnd_cmn_flg);
		p.RegTargetPanel.setLastBeans(p.Cnd_cmn_flg);
		p.Cnd_cmn_flg.setNextBeans(p.Cnd_wg_flg);
		p.Cnd_cmn_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.cmn_flg_META);
		p.RegTargetPanel.add(p.Cnd_wg_flg);
		p.Cnd_wg_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.wg_flg_META);
		p.Cnd_srch_cmn.setIcon("SEARCH");
		p.Cnd_srch_cmn.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_cmn);
		p.CndPanel.setLastBeans(p.Cnd_srch_cmn);
		p.Cnd_srch_cmn.setNextBeans(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setIcon("SEARCH");
		p.Cnd_srch_wg.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch_wg);
		p.Cnd_srch_wg.setNextBeans(p.Cnd_dt_PPanel);
		p.CndPanel.add(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_par_itm_p_PPanel);
		p.CndPanel.add(p.Cnd_par_itm_p_PPanel);
		p.Cnd_par_itm_p_PPanel.setNextBeans(p.Cnd_wg_cd);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_cd, false);
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub1,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub1, false);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub2,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub2, false);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Cnd_par_itm_nm,p.Cnd_par_itm_sub3);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_par_itm_p_PPanel.Itm_itm_sub3, false);
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Cnd_par_itm_nm);
		p.Cnd_wg_cd.setListType(MCListType.STRICT);
		p.Cnd_wg_cd.setLinkBeans(p.Cnd_wg_nm);
		p.CndPanel.add(p.Cnd_wg_cd_Label);
		p.CndPanel.add(p.Cnd_wg_cd);
		p.Cnd_wg_cd.setNextBeans(p.Cnd_wg_nm);
		p.Cnd_wg_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.wg_cd_META);
		p.CndPanel.add(p.Cnd_wg_nm);
		p.Cnd_wg_nm.setNextBeans(p.Cnd_bom_ptn);
		p.Cnd_wg_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.wg_nm_META);
		p.Cnd_bom_ptn.setListType(MCListType.FREE);
		p.CndPanel.add(p.Cnd_bom_ptn_Label);
		p.CndPanel.add(p.Cnd_bom_ptn);
		p.Cnd_bom_ptn.setNextBeans(p.Cnd_lot_inh_col_typ);
		p.Cnd_bom_ptn.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.bom_ptn_META);
		p.Cnd_lot_inh_col_typ.setListType(MCListType.STRICT);
		p.Cnd_lot_inh_col_typ.setLinkBeans(p.Cnd_lot_inh_col_typ_nm);
		p.CndPanel.add(p.Cnd_lot_inh_col_typ_Label);
		p.CndPanel.add(p.Cnd_lot_inh_col_typ);
		p.Cnd_lot_inh_col_typ.setNextBeans(p.Cnd_lot_inh_col_typ_nm);
		p.Cnd_lot_inh_col_typ.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.lot_inh_col_typ_META);
		p.CndPanel.add(p.Cnd_lot_inh_col_typ_nm);
		p.Cnd_lot_inh_col_typ_nm.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_lot_inh_col_typ_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.lot_inh_col_typ_nm_META);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0210.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTbl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtmDtlPanel);
		p.TblPanel.add(p.TblTab);
		p.TblPanel.setLastBeans(p.TblTab);
		p.TblPanel.setLayoutPosition("CBCT+");
		// ブロックの項目の初期化
		p.TblTab.add(p.Hdr1Panel, "Tbl.Hdr1");
		p.TblTab.setLastBeans(p.Hdr1Panel);
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.TblTab.add(p.Hdr2Panel, "Tbl.Hdr2");
	}

	/**
	 * [Hdr1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr1(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.Hdr1Panel.setNextBeans(p.Hdr2Panel);
		p.Hdr1Panel.setLayoutPosition("C+");
		// ブロックの項目の初期化
		p.Hdr1Panel.add(p.HdrPanel, null);
		p.Hdr1Panel.setLastBeans(p.HdrPanel);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_del_flg);
		p.HdrPanel.setLastBeans(p.Hdr_del_flg);
		p.Hdr_del_flg.setNextBeans(p.Hdr_par_itm_p_PPanel);
		p.Hdr_del_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.del_flg_META);
		p.HdrPanel.add(p.Hdr_par_itm_p_PPanel);
		p.Hdr_par_itm_p_PPanel.setNextBeans(p.Hdr_wg_cd);
		p.Hdr_par_itm_p_PPanel.Itm_itm_cd.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub1,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub1.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub2,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub2.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_par_itm_sub3,p.Hdr_bom_ptn);
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub3.setLinkBeans(p.Hdr_par_itm_nm,p.Hdr_bom_ptn);
		p.Hdr_wg_cd.setListType(MCListType.STRICT);
		p.Hdr_wg_cd.setLinkBeans(p.Hdr_wg_nm);
		p.HdrPanel.add(p.Hdr_wg_cd_Label);
		p.HdrPanel.add(p.Hdr_wg_cd);
		p.Hdr_wg_cd.setNextBeans(p.Hdr_wg_nm);
		p.Hdr_wg_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.wg_cd_META);
		p.HdrPanel.add(p.Hdr_wg_nm);
		p.Hdr_wg_nm.setNextBeans(p.Hdr_bom_ptn);
		p.Hdr_wg_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.wg_nm_META);
		p.HdrPanel.add(p.Hdr_bom_ptn_Label);
		p.HdrPanel.add(p.Hdr_bom_ptn);
		p.Hdr_bom_ptn.setNextBeans(p.Hdr_lot_inh_col_typ);
		p.Hdr_bom_ptn.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.bom_ptn_META);
		p.Hdr_lot_inh_col_typ.setListType(MCListType.FREE);
		p.Hdr_lot_inh_col_typ.setLinkBeans(p.Hdr_lot_inh_col_typ_nm);
		p.HdrPanel.add(p.Hdr_lot_inh_col_typ_Label);
		p.HdrPanel.add(p.Hdr_lot_inh_col_typ);
		p.Hdr_lot_inh_col_typ.setNextBeans(p.Hdr_lot_inh_col_typ_nm);
		p.Hdr_lot_inh_col_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.lot_inh_col_typ_META);
		p.HdrPanel.add(p.Hdr_lot_inh_col_typ_nm);
		p.Hdr_lot_inh_col_typ_nm.setNextBeans(p.Hdr_lot_inh_typ);
		p.Hdr_lot_inh_col_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.lot_inh_col_typ_nm_META);
		p.Hdr_lot_inh_typ.setListType(MCListType.STRICT);
		p.Hdr_lot_inh_typ.setLinkBeans(p.Hdr_lot_inh_typ_nm);
		p.HdrPanel.add(p.Hdr_lot_inh_typ_Label);
		p.HdrPanel.add(p.Hdr_lot_inh_typ);
		p.Hdr_lot_inh_typ.setNextBeans(p.Hdr_lot_inh_typ_nm);
		p.Hdr_lot_inh_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.lot_inh_typ_META);
		p.HdrPanel.add(p.Hdr_lot_inh_typ_nm);
		p.Hdr_lot_inh_typ_nm.setNextBeans(p.Hdr_add_concat_col);
		p.Hdr_lot_inh_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.lot_inh_typ_nm_META);
		p.Hdr_add_concat_col.setListType(MCListType.STRICT);
		p.Hdr_add_concat_col.setLinkBeans(p.Hdr_add_concat_col_nm);
		p.HdrPanel.add(p.Hdr_add_concat_col_Label);
		p.HdrPanel.add(p.Hdr_add_concat_col);
		p.Hdr_add_concat_col.setNextBeans(p.Hdr_add_concat_col_nm);
		p.Hdr_add_concat_col.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.add_concat_col_META);
		p.HdrPanel.add(p.Hdr_add_concat_col_nm);
		p.Hdr_add_concat_col_nm.setNextBeans(p.Hdr_overflow_err_flg);
		p.Hdr_add_concat_col_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.add_concat_col_nm_META);
		p.HdrPanel.add(p.Hdr_overflow_err_flg);
		p.Hdr_overflow_err_flg.setNextBeans(p.Hdr_memo1);
		p.Hdr_overflow_err_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.overflow_err_flg_META);
		p.HdrPanel.add(p.Hdr_memo1_Label);
		p.HdrPanel.add(p.Hdr_memo1);
		p.Hdr_memo1.setNextBeans(p.Hdr_memo2);
		p.Hdr_memo1.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.memo1_META);
		p.HdrPanel.add(p.Hdr_memo2_Label);
		p.HdrPanel.add(p.Hdr_memo2);
		p.Hdr_memo2.setNextBeans(p.Hdr_memo3);
		p.Hdr_memo2.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.memo2_META);
		p.HdrPanel.add(p.Hdr_memo3_Label);
		p.HdrPanel.add(p.Hdr_memo3);
		p.Hdr_memo3.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.memo3_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_usr_id);
		p.Hdr2Panel.setLastBeans(p.Hdr_ins_usr_id);
		p.Hdr_ins_usr_id.setNextBeans(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_id.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.ins_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_usr_nm);
		p.Hdr_ins_usr_nm.setNextBeans(p.Hdr_ins_func_id);
		p.Hdr_ins_usr_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.ins_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_ins_func_id);
		p.Hdr_ins_func_id.setNextBeans(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_id.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.ins_func_id_META);
		p.Hdr2Panel.add(p.Hdr_ins_func_nm);
		p.Hdr_ins_func_nm.setNextBeans(p.Hdr_upd_usr_id);
		p.Hdr_ins_func_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.ins_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_usr_id);
		p.Hdr_upd_usr_id.setNextBeans(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_id.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_usr_nm);
		p.Hdr_upd_usr_nm.setNextBeans(p.Hdr_upd_func_id);
		p.Hdr_upd_usr_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_id_Label);
		p.Hdr2Panel.add(p.Hdr_upd_func_id);
		p.Hdr_upd_func_id.setNextBeans(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_id.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_func_id_META);
		p.Hdr2Panel.add(p.Hdr_upd_func_nm);
		p.Hdr_upd_func_nm.setNextBeans(p.Hdr_ins_ts);
		p.Hdr_upd_func_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_func_nm_META);
		p.Hdr2Panel.add(p.Hdr_ins_ts_Label);
		p.Hdr2Panel.add(p.Hdr_ins_ts);
		p.Hdr_ins_ts.setNextBeans(p.Hdr_upd_ts);
		p.Hdr_ins_ts.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.ins_ts_META);
		p.Hdr_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_ts_Label);
		p.Hdr2Panel.add(p.Hdr_upd_ts);
		p.Hdr_upd_ts.setNextBeans(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_ts.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_ts_META);
		p.Hdr_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no_Label);
		p.Hdr2Panel.add(p.Hdr_upd_srv_req_no);
		p.Hdr_upd_srv_req_no.setNextBeans(p.Hdr_del_usr_id);
		p.Hdr_upd_srv_req_no.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_srv_req_no_META);
		p.Hdr2Panel.add(p.Hdr_del_usr_id_Label);
		p.Hdr2Panel.add(p.Hdr_del_usr_id);
		p.Hdr_del_usr_id.setNextBeans(p.Hdr_del_usr_nm);
		p.Hdr_del_usr_id.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.del_usr_id_META);
		p.Hdr2Panel.add(p.Hdr_del_usr_nm);
		p.Hdr_del_usr_nm.setNextBeans(p.Hdr_del_ts);
		p.Hdr_del_usr_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.del_usr_nm_META);
		p.Hdr2Panel.add(p.Hdr_del_ts_Label);
		p.Hdr2Panel.add(p.Hdr_del_ts);
		p.Hdr_del_ts.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_del_ts.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.del_ts_META);
		p.Hdr_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Hdr2Panel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMABS.MABSP0210.HdrR.upd_cntr_META);
	}

	/**
	 * [Hdr2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr2(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.Hdr2Panel.setLayoutPosition("S");
		// ブロックの項目の初期化
	}

	/**
	 * [BtmDtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtmDtl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.add(p.BtmDtlPanel);
		p.BtmDtlPanel.setNextBeans(p.BtnPanel);
		p.BtmDtlPanel.setLayoutPosition("CBCB+");
		// ブロックの項目の初期化
		p.BtmDtlPanel.add(p.LotInhSrcPanel, null);
		p.BtmDtlPanel.setLastBeans(p.LotInhSrcPanel);
	}

	/**
	 * [LotInhSrc]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLotInhSrc(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.LotInhSrcPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.LotInhSrcPanel.add(p.ChdSetPanel, null);
		p.LotInhSrcPanel.setLastBeans(p.ChdSetPanel);
		p.ChdSetPanel.setNextBeans(p.DtlPanel);
		p.LotInhSrcPanel.add(p.DtlPanel, null);
	}

	/**
	 * [ChdSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitChdSet(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.ChdSetPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.ChdSet_wg_cd.setListType(MCListType.STRICT);
		p.ChdSet_wg_cd.setLinkBeans(p.ChdSet_wg_nm);
		p.ChdSetPanel.add(p.ChdSet_wg_cd_Label);
		p.ChdSetPanel.add(p.ChdSet_wg_cd);
		p.ChdSetPanel.setLastBeans(p.ChdSet_wg_cd);
		p.ChdSet_wg_cd.setNextBeans(p.ChdSet_wg_nm);
		p.ChdSet_wg_cd.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.wg_cd_META);
		p.ChdSetPanel.add(p.ChdSet_wg_nm);
		p.ChdSet_wg_nm.setNextBeans(p.ChdSet_base_dt);
		p.ChdSet_wg_nm.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.wg_nm_META);
		p.ChdSetPanel.add(p.ChdSet_base_dt_Label);
		p.ChdSetPanel.add(p.ChdSet_base_dt);
		p.ChdSet_base_dt.setNextBeans(p.ChdSet_par_itm_cd);
		p.ChdSet_base_dt.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.base_dt_META);
		p.ChdSet_base_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.ChdSetPanel.add(p.ChdSet_par_itm_cd_Label);
		p.ChdSetPanel.add(p.ChdSet_par_itm_cd);
		p.ChdSet_par_itm_cd.setNextBeans(p.ChdSet_par_itm_sub1);
		p.ChdSet_par_itm_cd.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.par_itm_cd_META);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub1_Label);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub1);
		p.ChdSet_par_itm_sub1.setNextBeans(p.ChdSet_par_itm_sub2);
		p.ChdSet_par_itm_sub1.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.par_itm_sub1_META);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub2_Label);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub2);
		p.ChdSet_par_itm_sub2.setNextBeans(p.ChdSet_par_itm_sub3);
		p.ChdSet_par_itm_sub2.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.par_itm_sub2_META);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub3_Label);
		p.ChdSetPanel.add(p.ChdSet_par_itm_sub3);
		p.ChdSet_par_itm_sub3.setNextBeans(p.ChdSet_bom_ptn);
		p.ChdSet_par_itm_sub3.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.par_itm_sub3_META);
		p.ChdSetPanel.add(p.ChdSet_bom_ptn_Label);
		p.ChdSetPanel.add(p.ChdSet_bom_ptn);
		p.ChdSet_bom_ptn.setNextBeans(p.ChdSet_lot_inh_col_typ);
		p.ChdSet_bom_ptn.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.bom_ptn_META);
		p.ChdSetPanel.add(p.ChdSet_lot_inh_col_typ_Label);
		p.ChdSetPanel.add(p.ChdSet_lot_inh_col_typ);
		p.ChdSet_lot_inh_col_typ.setNextBeans(p.ChdSet_chd_srch);
		p.ChdSet_lot_inh_col_typ.setRow(p.getChdSetR(), mcframe.clientMABS.MABSP0210.ChdSetR.lot_inh_col_typ_META);
		p.ChdSet_chd_srch.setFunctionKey(MCFunctionKey.F4);
		p.ChdSetPanel.add(p.ChdSet_chd_srch);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_LotInhReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_select_all.setIcon("SELECT_ALL");
		p.Btn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.BtnPanel.add(p.Btn_select_all);
		p.BtnPanel.setLastBeans(p.Btn_select_all);
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
		p.Btn_rcopy.setNextBeans(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setIcon("REGISTER");
		p.Btn_upd_cmn.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_cmn);
		p.Btn_upd_cmn.setNextBeans(p.Btn_upd_wg);
		p.Btn_upd_wg.setIcon("REGISTER");
		p.Btn_upd_wg.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Btn_upd_wg);
		p.Btn_del_cmn.setIcon("DELETE");
		p.Btn_del_cmn.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.setLastBeans(p.Btn_del_cmn);
		p.EastBtnPanel.add(p.Btn_del_cmn);
		p.Btn_del_cmn.setNextBeans(p.Btn_del_wg);
		p.Btn_del_wg.setIcon("DELETE");
		p.Btn_del_wg.setFunctionKey(MCFunctionKey.F12);
		p.EastBtnPanel.add(p.Btn_del_wg);
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitEastBtn(MABSP_LotInhReg p) {
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
		MABSP_LotInhReg_MC.mcInitScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitRegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitTop((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitFold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitCnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitCtrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitTbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitHdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitHdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitHdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitBtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitLotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.mcInitEastBtn((MABSP_LotInhReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitUPD_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitUPD_HdrAll((MABSP_LotInhReg)this);

		// [SRCH]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitSRCH_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitSRCH_HdrAll((MABSP_LotInhReg)this);

		// [MOD]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitMOD_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitMOD_HdrAll((MABSP_LotInhReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitDEL_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitDEL_HdrAll((MABSP_LotInhReg)this);

		// [REF]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitREF_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitREF_HdrAll((MABSP_LotInhReg)this);

		// [FIX_U]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitFIX__U_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX__U_HdrAll((MABSP_LotInhReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_LotInhReg_MC.statusInitFIX_ScreenOpe((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_RegTarget((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Top((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Fold((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Cnd((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Ctrl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Tbl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Hdr1((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Hdr((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Hdr2((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_BtmDtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_LotInhSrc((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_ChdSet((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Dtl((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_Btn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_EastBtn((MABSP_LotInhReg)this);
		MABSP_LotInhReg_MC.statusInitFIX_HdrAll((MABSP_LotInhReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_LotInhReg p) {
	}

	/**
	 *  [RegTarget]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitRegTarget(MABSP_LotInhReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_LotInhReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_LotInhReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_LotInhReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cmn_flg.addAllListener(p);
		p.Cnd_wg_flg.addAllListener(p);
		p.Cnd_srch_cmn.addAllListener(p);
		p.Cnd_srch_cmn.setAPMethodName("doCnd_srch_cmn");
		p.Cnd_srch_wg.addAllListener(p);
		p.Cnd_srch_wg.setAPMethodName("doCnd_srch_wg");
		p.Cnd_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Cnd_wg_cd.setListListener(p);
		p.Cnd_wg_cd.addAllListener(p);
		p.Cnd_wg_nm.setListListener(p);
		p.Cnd_wg_nm.addAllListener(p);
		p.Cnd_bom_ptn.setListListener(p);
		p.Cnd_bom_ptn.addAllListener(p);
		p.Cnd_lot_inh_col_typ.setListListener(p);
		p.Cnd_lot_inh_col_typ.addAllListener(p);
		p.Cnd_lot_inh_col_typ_nm.setListListener(p);
		p.Cnd_lot_inh_col_typ_nm.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_LotInhReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABSP_LotInhReg p) {
		p.TblTab.addAllListener(p);
	}

	/**
	 *  [Hdr1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr1(MABSP_LotInhReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_LotInhReg p) {
		p.Hdr_del_flg.addAllListener(p);
		p.Hdr_par_itm_p_PPanel.Itm_itm_cd.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub1.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub2.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_par_itm_p_PPanel.Itm_itm_sub3.setListListener(p);	// 埋め込み画面の項目に対してEventListenerを差し込む。
		p.Hdr_wg_cd.setListListener(p);
		p.Hdr_wg_cd.addAllListener(p);
		p.Hdr_wg_nm.setListListener(p);
		p.Hdr_wg_nm.addAllListener(p);
		p.Hdr_bom_ptn.setListListener(p);
		p.Hdr_bom_ptn.addAllListener(p);
		p.Hdr_lot_inh_col_typ.setListListener(p);
		p.Hdr_lot_inh_col_typ.addAllListener(p);
		p.Hdr_lot_inh_col_typ_nm.setListListener(p);
		p.Hdr_lot_inh_col_typ_nm.addAllListener(p);
		p.Hdr_lot_inh_typ.setListListener(p);
		p.Hdr_lot_inh_typ.addAllListener(p);
		p.Hdr_lot_inh_typ_nm.setListListener(p);
		p.Hdr_lot_inh_typ_nm.addAllListener(p);
		p.Hdr_add_concat_col.setListListener(p);
		p.Hdr_add_concat_col.addAllListener(p);
		p.Hdr_add_concat_col_nm.setListListener(p);
		p.Hdr_add_concat_col_nm.addAllListener(p);
		p.Hdr_overflow_err_flg.addAllListener(p);
		p.Hdr_memo1.setListListener(p);
		p.Hdr_memo1.addAllListener(p);
		p.Hdr_memo2.setListListener(p);
		p.Hdr_memo2.addAllListener(p);
		p.Hdr_memo3.setListListener(p);
		p.Hdr_memo3.addAllListener(p);
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
		p.Hdr_del_usr_id.setListListener(p);
		p.Hdr_del_usr_id.addAllListener(p);
		p.Hdr_del_usr_nm.setListListener(p);
		p.Hdr_del_usr_nm.addAllListener(p);
		p.Hdr_del_ts.setListListener(p);
		p.Hdr_del_ts.addAllListener(p);
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
	}

	/**
	 *  [Hdr2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr2(MABSP_LotInhReg p) {
	}

	/**
	 *  [BtmDtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtmDtl(MABSP_LotInhReg p) {
	}

	/**
	 *  [LotInhSrc]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLotInhSrc(MABSP_LotInhReg p) {
	}

	/**
	 *  [ChdSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitChdSet(MABSP_LotInhReg p) {
		p.ChdSet_wg_cd.setListListener(p);
		p.ChdSet_wg_cd.addAllListener(p);
		p.ChdSet_wg_nm.setListListener(p);
		p.ChdSet_wg_nm.addAllListener(p);
		p.ChdSet_base_dt.setListListener(p);
		p.ChdSet_base_dt.addAllListener(p);
		p.ChdSet_par_itm_cd.setListListener(p);
		p.ChdSet_par_itm_cd.addAllListener(p);
		p.ChdSet_par_itm_sub1.setListListener(p);
		p.ChdSet_par_itm_sub1.addAllListener(p);
		p.ChdSet_par_itm_sub2.setListListener(p);
		p.ChdSet_par_itm_sub2.addAllListener(p);
		p.ChdSet_par_itm_sub3.setListListener(p);
		p.ChdSet_par_itm_sub3.addAllListener(p);
		p.ChdSet_bom_ptn.setListListener(p);
		p.ChdSet_bom_ptn.addAllListener(p);
		p.ChdSet_lot_inh_col_typ.setListListener(p);
		p.ChdSet_lot_inh_col_typ.addAllListener(p);
		p.ChdSet_chd_srch.addAllListener(p);
		p.ChdSet_chd_srch.setAPMethodName("doChdSet_chd_srch");
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABSP_LotInhReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.Dtl_par_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_par_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_bom_ptn.addAllListener(p);
		p.columnDtl_bom_ptn.setListListener(p);
		p.columnDtl_lot_inh_col_typ.addAllListener(p);
		p.columnDtl_lot_inh_col_typ.setListListener(p);
		p.columnDtl_wg_cd.addAllListener(p);
		p.columnDtl_wg_cd.setListListener(p);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnDtl_chd_itm_typ.addAllListener(p);
		p.columnDtl_chd_itm_typ.setListListener(p);
		p.columnDtl_chd_itm_typ_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_nm.setListListener(p);
		p.columnDtl_chd_itm_typ_d_cd.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_cd.setListListener(p);
		p.columnDtl_chd_itm_typ_d_nm.addAllListener(p);
		p.columnDtl_chd_itm_typ_d_nm.setListListener(p);
		p.columnDtl_prio.addAllListener(p);
		p.columnDtl_prio.setListListener(p);
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
	protected static void mcInitBtn(MABSP_LotInhReg p) {
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
		p.Btn_upd_cmn.addAllListener(p);
		p.Btn_upd_cmn.setAPMethodName("doBtn_upd_cmn");
		p.Btn_upd_wg.addAllListener(p);
		p.Btn_upd_wg.setAPMethodName("doBtn_upd_wg");
		p.Btn_del_cmn.addAllListener(p);
		p.Btn_del_cmn.setAPMethodName("doBtn_del_cmn");
		p.Btn_del_wg.addAllListener(p);
		p.Btn_del_wg.setAPMethodName("doBtn_del_wg");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABSP_LotInhReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitUPD_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lot_inh_col_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Hdr_wg_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_lot_inh_col_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_lot_inh_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_add_concat_col_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_memo3.putMode(p, UPD, MCMode.ENABLE);
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
		p.Hdr_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.ChdSet_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, UPD, MCMode.ENABLE);
		p.ChdSet_par_itm_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_par_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_itm_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitUPD_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, UPD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_add_concat_col_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
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
		p.Hdr_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ChdSet_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.ChdSet_par_itm_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, SRCH, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitMOD_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Top(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, MOD, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, MOD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, MOD, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, MOD, MCMode.REQUIRED);
		p.Hdr_lot_inh_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, MOD, MCMode.ENABLE);
		p.Hdr_add_concat_col_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Hdr_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.Hdr_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.Hdr_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.Hdr_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);

	}

	/**
	 * [MOD]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, MOD, MCMode.ENABLE);
		p.ChdSet_wg_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, MOD, MCMode.ENABLE);
		p.ChdSet_par_itm_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.REQUIRED);
		p.Dtl_par_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.REQUIRED);
		p.columnDtl_chd_itm_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, MOD, MCMode.REQUIRED);
		p.Dtl_dt_p_PPanel.putStatus(MOD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_radd.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_rdel.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_rcopy.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd_cmn.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_upd_wg.putMode(p, MOD, MCMode.ENABLE);
		p.Btn_del_cmn.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [MOD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitDEL_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, DEL, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_add_concat_col_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_memo3.putMode(p, DEL, MCMode.READ_ONLY);
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
		p.Hdr_del_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);

	}

	/**
	 * [DEL]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.ChdSet_wg_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.ChdSet_par_itm_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitDEL_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_del_wg.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [DEL]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitREF_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, REF, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_add_concat_col_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_memo3.putMode(p, REF, MCMode.READ_ONLY);
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
		p.Hdr_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitREF_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.ChdSet_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.ChdSet_par_itm_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitREF_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Btn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Top(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.READ_ONLY);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Cnd_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lot_inh_col_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_del_flg_lab.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_on_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_add_concat_col_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
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
		p.Hdr_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ChdSet_wg_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.ChdSet_par_itm_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX_U, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [FIX_U]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_HdrAll(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[RegTarget]ブロックのモードの設定
	 */
	protected static void statusInitFIX_RegTarget(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_LotInhReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_cmn_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_wg_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_srch_cmn.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_srch_wg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_wg_cd.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_bom_ptn.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_lot_inh_col_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr1(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABSP_LotInhReg p){
		p.Hdr_del_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_bom_ptn.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lot_inh_col_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_lot_inh_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_add_concat_col.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_add_concat_col_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_overflow_err_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_del_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[Hdr2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr2(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[BtmDtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BtmDtl(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[LotInhSrc]ブロックのモードの設定
	 */
	protected static void statusInitFIX_LotInhSrc(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[ChdSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ChdSet(MABSP_LotInhReg p){
		p.ChdSet_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.ChdSet_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.ChdSet_base_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.ChdSet_par_itm_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub1.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub2.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_par_itm_sub3.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_lot_inh_col_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.ChdSet_chd_srch.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_LotInhReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_par_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnDtl_bom_ptn.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_lot_inh_col_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnDtl_wg_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.Dtl_chd_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.READ_ONLY);
		p.columnDtl_chd_itm_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_chd_itm_typ_d_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
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
	protected static void statusInitFIX_Btn(MABSP_LotInhReg p){
		p.Btn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_rcopy.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_upd_wg.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_cmn.putMode(p, FIX, MCMode.DISABLE);
		p.Btn_del_wg.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_EastBtn(MABSP_LotInhReg p){

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABSP_LotInhReg p){

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
		MABSP_LotInhReg_MC.setTableConfigDtl((MABSP_LotInhReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_LotInhReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0210.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0210.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.DtlTable.addTable(p.Dtl_par_itm_p_PPanel.ItmTable);
		p.columnDtl_bom_ptn.setMeta(mcframe.clientMABS.MABSP0210.DtlR.bom_ptn_META);
		p.DtlTable.addColumnConfig(p.columnDtl_bom_ptn);
		p.columnDtl_lot_inh_col_typ.setMeta(mcframe.clientMABS.MABSP0210.DtlR.lot_inh_col_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_lot_inh_col_typ);
		p.columnDtl_wg_cd.setMeta(mcframe.clientMABS.MABSP0210.DtlR.wg_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_wg_cd);
		p.DtlTable.addTable(p.Dtl_chd_itm_p_PPanel.ItmTable);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_cd.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub1, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub2, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_sub3, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm);
		p.Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setLinkBeans(p.columnDtl_chd_itm_nm, p.columnDtl_chd_itm_typ, p.columnDtl_chd_itm_typ_nm, p.columnDtl_chd_itm_typ_d_cd, p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_chd_itm_typ.setMeta(mcframe.clientMABS.MABSP0210.DtlR.chd_itm_typ_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ);
		p.columnDtl_chd_itm_typ_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.chd_itm_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_nm);
		p.columnDtl_chd_itm_typ_d_cd.setMeta(mcframe.clientMABS.MABSP0210.DtlR.chd_itm_typ_d_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_cd);
		p.columnDtl_chd_itm_typ_d_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.chd_itm_typ_d_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_chd_itm_typ_d_nm);
		p.columnDtl_prio.setMeta(mcframe.clientMABS.MABSP0210.DtlR.prio_META);
		p.DtlTable.addColumnConfig(p.columnDtl_prio);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0210.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0210.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0210.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0210.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0210.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0210.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0210.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0210.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0210.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0210.DtlR.del_ts_META);
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
		Cnd_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Cnd_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_wg_cd.getListConfig().setPutter(getCnd_wg_cd_ListPutter());
		Cnd_bom_ptn.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_bom_ptn.getListConfig().setPutter(getCnd_bom_ptn_ListPutter());
		Cnd_lot_inh_col_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_lot_inh_col_typ.getListConfig().setPutter(getCnd_lot_inh_col_typ_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_cd.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub1.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub2.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter());
		Hdr_par_itm_p_PPanel.Itm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_par_itm_p_PPanel.Itm_itm_sub3.getListConfig().setPutter(getHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter());
		Hdr_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_wg_cd.getListConfig().setPutter(getHdr_wg_cd_ListPutter());
		Hdr_lot_inh_col_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_lot_inh_col_typ.getListConfig().setPutter(getHdr_lot_inh_col_typ_ListPutter());
		Hdr_lot_inh_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_lot_inh_typ.getListConfig().setPutter(getHdr_lot_inh_typ_ListPutter());
		Hdr_add_concat_col.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_add_concat_col.getListConfig().setPutter(getHdr_add_concat_col_ListPutter());
		ChdSet_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		ChdSet_wg_cd.getListConfig().setPutter(getChdSet_wg_cd_ListPutter());
		columnDtl_lot_inh_col_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_lot_inh_col_typ.getListConfig().setPutter(getDtl_lot_inh_col_typ_ListPutter());
		columnDtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_wg_cd.getListConfig().setPutter(getDtl_wg_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_cd.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub1.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub2.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Dtl_chd_itm_p_PPanel.columnItm_itm_sub3.getListConfig().setPutter(getDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter());
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
	 * この画面を[SRCH]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setSRCHStatus() {
		status = SRCH;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
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
	 * この画面を[FIX_U]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_UStatus() {
		status = FIX_U;
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
	 * この画面のステータスを設定します。
	 *
	 * @param status ステータス
	 */
	public void setStatus(String status) {
		super.setStatus(status);
		if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (REF.equals(status)) {
			setREFStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Cnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Cnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
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
	 * [Cnd_bom_ptn_ListPutter]の作成
	 */
	protected MCListPutter createCnd_bom_ptn_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BomPtn");
		return lp;
	}
	 
	/**
	 * [Cnd_lot_inh_col_typ_ListPutter]の作成
	 */
	protected MCListPutter createCnd_lot_inh_col_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotInhColTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Hdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createHdr_par_itm_p_PPanel_Itm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub3");
		return lp;
	}

	/**
	 * [Hdr_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Hdr_lot_inh_col_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_lot_inh_col_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotInhColTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_lot_inh_typ_ListPutter]の作成
	 */
	protected MCListPutter createHdr_lot_inh_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotInhTyp");
		return lp;
	}
	 
	/**
	 * [Hdr_add_concat_col_ListPutter]の作成
	 */
	protected MCListPutter createHdr_add_concat_col_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AddConcatColTyp");
		return lp;
	}
	 
	/**
	 * [ChdSet_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createChdSet_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Dtl_lot_inh_col_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_lot_inh_col_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LotInhColTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgWg");
		return lp;
	}
	 
	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Itm");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub1");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmSub2");
		return lp;
	}

	/**
	 * [Dtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_chd_itm_p_PPanel_columnItm_itm_sub3_ListPutter(MCLinkBeans compo, String... columns) {
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
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_cd) return getCnd_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub1) return getCnd_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub2) return getCnd_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Cnd_par_itm_p_PPanel.Itm_itm_sub3) return getCnd_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Cnd_wg_cd) return getCnd_wg_cd(row, info);
		if(combo == Cnd_bom_ptn) return getCnd_bom_ptn(row, info);
		if(combo == Cnd_lot_inh_col_typ) return getCnd_lot_inh_col_typ(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_cd) return getHdr_par_itm_p_PPanel_Itm_itm_cd(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub1) return getHdr_par_itm_p_PPanel_Itm_itm_sub1(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub2) return getHdr_par_itm_p_PPanel_Itm_itm_sub2(row, info);
		if(combo == Hdr_par_itm_p_PPanel.Itm_itm_sub3) return getHdr_par_itm_p_PPanel_Itm_itm_sub3(row, info);
		if(combo == Hdr_wg_cd) return getHdr_wg_cd(row, info);
		if(combo == Hdr_lot_inh_col_typ) return getHdr_lot_inh_col_typ(row, info);
		if(combo == Hdr_lot_inh_typ) return getHdr_lot_inh_typ(row, info);
		if(combo == Hdr_add_concat_col) return getHdr_add_concat_col(row, info);
		if(combo == ChdSet_wg_cd) return getChdSet_wg_cd(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_cd) return getDtl_par_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub1) return getDtl_par_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub2) return getDtl_par_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_par_itm_p_PPanel.columnItm_itm_sub3) return getDtl_par_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnDtl_lot_inh_col_typ) return getDtl_lot_inh_col_typ(row, info);
		if(combo == columnDtl_wg_cd) return getDtl_wg_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_cd) return getDtl_chd_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub1) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub2) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Dtl_chd_itm_p_PPanel.columnItm_itm_sub3) return getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(row, info);
		return null;
	}

	/**
	 * ActionPerformedイベントが実行されたときに呼び出されます。
	 *
	 * @param ap ActionPerformedイベントが実行されたGUI部品
	 */
	public void doAPEvent(MCAPBeans ap, MCEventInfo info) {
		super.doAPEvent(ap, info);
		if (ap == Cnd_srch_cmn) doCnd_srch_cmn(info);
		else if (ap == Cnd_srch_wg) doCnd_srch_wg(info);
		else if (ap == Ctrl_ctrl_PPanel.Ope_srch) doCtrl_ctrl_Ope_srch(info);
		else if (ap == ChdSet_chd_srch) doChdSet_chd_srch(info);
		else if (ap == Btn_select_all) doBtn_select_all(info);
		else if (ap == Btn_deselect_all) doBtn_deselect_all(info);
		else if (ap == Btn_radd) doBtn_radd(info);
		else if (ap == Btn_rdel) doBtn_rdel(info);
		else if (ap == Btn_rcopy) doBtn_rcopy(info);
		else if (ap == Btn_upd_cmn) doBtn_upd_cmn(info);
		else if (ap == Btn_upd_wg) doBtn_upd_wg(info);
		else if (ap == Btn_del_cmn) doBtn_del_cmn(info);
		else if (ap == Btn_del_wg) doBtn_del_wg(info);
	}

	/**
	 * [Cnd]パネルの[srch_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_cmn(MCEventInfo info);

	/**
	 * [Cnd]パネルの[srch_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch_wg(MCEventInfo info);

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [ChdSet]パネルの[chd_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doChdSet_chd_srch(MCEventInfo info);

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
	 * [Btn]パネルの[upd_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[upd_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_upd_wg(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_cmn]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_cmn(MCEventInfo info);

	/**
	 * [Btn]パネルの[del_wg]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_del_wg(MCEventInfo info);

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
		if (vc == TblTab) return doTbl_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cmn_flg) return doCnd_cmn_flg_VC(info);
		if (vc == Cnd_wg_flg) return doCnd_wg_flg_VC(info);
		if (vc == Cnd_wg_cd) return doCnd_wg_cd_VC(info);
		if (vc == Cnd_wg_nm) return doCnd_wg_nm_VC(info);
		if (vc == Cnd_bom_ptn) return doCnd_bom_ptn_VC(info);
		if (vc == Cnd_lot_inh_col_typ) return doCnd_lot_inh_col_typ_VC(info);
		if (vc == Cnd_lot_inh_col_typ_nm) return doCnd_lot_inh_col_typ_nm_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_del_flg) return doHdr_del_flg_VC(info);
		if (vc == Hdr_wg_cd) return doHdr_wg_cd_VC(info);
		if (vc == Hdr_wg_nm) return doHdr_wg_nm_VC(info);
		if (vc == Hdr_bom_ptn) return doHdr_bom_ptn_VC(info);
		if (vc == Hdr_lot_inh_col_typ) return doHdr_lot_inh_col_typ_VC(info);
		if (vc == Hdr_lot_inh_col_typ_nm) return doHdr_lot_inh_col_typ_nm_VC(info);
		if (vc == Hdr_lot_inh_typ) return doHdr_lot_inh_typ_VC(info);
		if (vc == Hdr_lot_inh_typ_nm) return doHdr_lot_inh_typ_nm_VC(info);
		if (vc == Hdr_add_concat_col) return doHdr_add_concat_col_VC(info);
		if (vc == Hdr_add_concat_col_nm) return doHdr_add_concat_col_nm_VC(info);
		if (vc == Hdr_overflow_err_flg) return doHdr_overflow_err_flg_VC(info);
		if (vc == Hdr_memo1) return doHdr_memo1_VC(info);
		if (vc == Hdr_memo2) return doHdr_memo2_VC(info);
		if (vc == Hdr_memo3) return doHdr_memo3_VC(info);
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
		if (vc == Hdr_del_usr_id) return doHdr_del_usr_id_VC(info);
		if (vc == Hdr_del_usr_nm) return doHdr_del_usr_nm_VC(info);
		if (vc == Hdr_del_ts) return doHdr_del_ts_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == ChdSet_wg_cd) return doChdSet_wg_cd_VC(info);
		if (vc == ChdSet_wg_nm) return doChdSet_wg_nm_VC(info);
		if (vc == ChdSet_base_dt) return doChdSet_base_dt_VC(info);
		if (vc == ChdSet_par_itm_cd) return doChdSet_par_itm_cd_VC(info);
		if (vc == ChdSet_par_itm_sub1) return doChdSet_par_itm_sub1_VC(info);
		if (vc == ChdSet_par_itm_sub2) return doChdSet_par_itm_sub2_VC(info);
		if (vc == ChdSet_par_itm_sub3) return doChdSet_par_itm_sub3_VC(info);
		if (vc == ChdSet_bom_ptn) return doChdSet_bom_ptn_VC(info);
		if (vc == ChdSet_lot_inh_col_typ) return doChdSet_lot_inh_col_typ_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_bom_ptn) return doDtl_bom_ptn_VC(info);
		if (vc == columnDtl_lot_inh_col_typ) return doDtl_lot_inh_col_typ_VC(info);
		if (vc == columnDtl_wg_cd) return doDtl_wg_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ) return doDtl_chd_itm_typ_VC(info);
		if (vc == columnDtl_chd_itm_typ_nm) return doDtl_chd_itm_typ_nm_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_cd) return doDtl_chd_itm_typ_d_cd_VC(info);
		if (vc == columnDtl_chd_itm_typ_d_nm) return doDtl_chd_itm_typ_d_nm_VC(info);
		if (vc == columnDtl_prio) return doDtl_prio_VC(info);
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
	 * [Tbl]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doTbl_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cmn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[wg_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_wg_flg_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_inh_col_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_lot_inh_col_typ_nm_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_inh_col_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_inh_col_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_inh_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_lot_inh_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[add_concat_col]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_add_concat_col_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[add_concat_col_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_add_concat_col_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[overflow_err_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_overflow_err_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_memo3_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[base_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_base_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[par_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_par_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_par_itm_sub1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_par_itm_sub2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_par_itm_sub3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [ChdSet]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doChdSet_lot_inh_col_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_bom_ptn_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_lot_inh_col_typ_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[chd_itm_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_chd_itm_typ_d_nm_VC(MCEventInfo info){
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
		if (nc == TblTab) doTbl_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cmn_flg) doCnd_cmn_flg_NC(info);
		else if (nc == Cnd_wg_flg) doCnd_wg_flg_NC(info);
		else if (nc == Cnd_wg_cd) doCnd_wg_cd_NC(info);
		else if (nc == Cnd_wg_nm) doCnd_wg_nm_NC(info);
		else if (nc == Cnd_bom_ptn) doCnd_bom_ptn_NC(info);
		else if (nc == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NC(info);
		else if (nc == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_del_flg) doHdr_del_flg_NC(info);
		else if (nc == Hdr_wg_cd) doHdr_wg_cd_NC(info);
		else if (nc == Hdr_wg_nm) doHdr_wg_nm_NC(info);
		else if (nc == Hdr_bom_ptn) doHdr_bom_ptn_NC(info);
		else if (nc == Hdr_lot_inh_col_typ) doHdr_lot_inh_col_typ_NC(info);
		else if (nc == Hdr_lot_inh_col_typ_nm) doHdr_lot_inh_col_typ_nm_NC(info);
		else if (nc == Hdr_lot_inh_typ) doHdr_lot_inh_typ_NC(info);
		else if (nc == Hdr_lot_inh_typ_nm) doHdr_lot_inh_typ_nm_NC(info);
		else if (nc == Hdr_add_concat_col) doHdr_add_concat_col_NC(info);
		else if (nc == Hdr_add_concat_col_nm) doHdr_add_concat_col_nm_NC(info);
		else if (nc == Hdr_overflow_err_flg) doHdr_overflow_err_flg_NC(info);
		else if (nc == Hdr_memo1) doHdr_memo1_NC(info);
		else if (nc == Hdr_memo2) doHdr_memo2_NC(info);
		else if (nc == Hdr_memo3) doHdr_memo3_NC(info);
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
		else if (nc == Hdr_del_usr_id) doHdr_del_usr_id_NC(info);
		else if (nc == Hdr_del_usr_nm) doHdr_del_usr_nm_NC(info);
		else if (nc == Hdr_del_ts) doHdr_del_ts_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == ChdSet_wg_cd) doChdSet_wg_cd_NC(info);
		else if (nc == ChdSet_wg_nm) doChdSet_wg_nm_NC(info);
		else if (nc == ChdSet_base_dt) doChdSet_base_dt_NC(info);
		else if (nc == ChdSet_par_itm_cd) doChdSet_par_itm_cd_NC(info);
		else if (nc == ChdSet_par_itm_sub1) doChdSet_par_itm_sub1_NC(info);
		else if (nc == ChdSet_par_itm_sub2) doChdSet_par_itm_sub2_NC(info);
		else if (nc == ChdSet_par_itm_sub3) doChdSet_par_itm_sub3_NC(info);
		else if (nc == ChdSet_bom_ptn) doChdSet_bom_ptn_NC(info);
		else if (nc == ChdSet_lot_inh_col_typ) doChdSet_lot_inh_col_typ_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_bom_ptn) doDtl_bom_ptn_NC(info);
		else if (nc == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NC(info);
		else if (nc == columnDtl_wg_cd) doDtl_wg_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NC(info);
		else if (nc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NC(info);
		else if (nc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NC(info);
		else if (nc == columnDtl_prio) doDtl_prio_NC(info);
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
	 * [Tbl]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTbl_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[overflow_err_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_overflow_err_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo3_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[base_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_base_dt_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub1_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub2_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub3_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_lot_inh_col_typ_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NC(MCEventInfo info){
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
		if (ne == TblTab) doTbl_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cmn_flg) doCnd_cmn_flg_NE(info);
		else if (ne == Cnd_wg_flg) doCnd_wg_flg_NE(info);
		else if (ne == Cnd_wg_cd) doCnd_wg_cd_NE(info);
		else if (ne == Cnd_wg_nm) doCnd_wg_nm_NE(info);
		else if (ne == Cnd_bom_ptn) doCnd_bom_ptn_NE(info);
		else if (ne == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NE(info);
		else if (ne == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_del_flg) doHdr_del_flg_NE(info);
		else if (ne == Hdr_wg_cd) doHdr_wg_cd_NE(info);
		else if (ne == Hdr_wg_nm) doHdr_wg_nm_NE(info);
		else if (ne == Hdr_bom_ptn) doHdr_bom_ptn_NE(info);
		else if (ne == Hdr_lot_inh_col_typ) doHdr_lot_inh_col_typ_NE(info);
		else if (ne == Hdr_lot_inh_col_typ_nm) doHdr_lot_inh_col_typ_nm_NE(info);
		else if (ne == Hdr_lot_inh_typ) doHdr_lot_inh_typ_NE(info);
		else if (ne == Hdr_lot_inh_typ_nm) doHdr_lot_inh_typ_nm_NE(info);
		else if (ne == Hdr_add_concat_col) doHdr_add_concat_col_NE(info);
		else if (ne == Hdr_add_concat_col_nm) doHdr_add_concat_col_nm_NE(info);
		else if (ne == Hdr_overflow_err_flg) doHdr_overflow_err_flg_NE(info);
		else if (ne == Hdr_memo1) doHdr_memo1_NE(info);
		else if (ne == Hdr_memo2) doHdr_memo2_NE(info);
		else if (ne == Hdr_memo3) doHdr_memo3_NE(info);
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
		else if (ne == Hdr_del_usr_id) doHdr_del_usr_id_NE(info);
		else if (ne == Hdr_del_usr_nm) doHdr_del_usr_nm_NE(info);
		else if (ne == Hdr_del_ts) doHdr_del_ts_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == ChdSet_wg_cd) doChdSet_wg_cd_NE(info);
		else if (ne == ChdSet_wg_nm) doChdSet_wg_nm_NE(info);
		else if (ne == ChdSet_base_dt) doChdSet_base_dt_NE(info);
		else if (ne == ChdSet_par_itm_cd) doChdSet_par_itm_cd_NE(info);
		else if (ne == ChdSet_par_itm_sub1) doChdSet_par_itm_sub1_NE(info);
		else if (ne == ChdSet_par_itm_sub2) doChdSet_par_itm_sub2_NE(info);
		else if (ne == ChdSet_par_itm_sub3) doChdSet_par_itm_sub3_NE(info);
		else if (ne == ChdSet_bom_ptn) doChdSet_bom_ptn_NE(info);
		else if (ne == ChdSet_lot_inh_col_typ) doChdSet_lot_inh_col_typ_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_bom_ptn) doDtl_bom_ptn_NE(info);
		else if (ne == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NE(info);
		else if (ne == columnDtl_wg_cd) doDtl_wg_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NE(info);
		else if (ne == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NE(info);
		else if (ne == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NE(info);
		else if (ne == columnDtl_prio) doDtl_prio_NE(info);
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
	 * [Tbl]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTbl_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[overflow_err_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_overflow_err_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo3_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[base_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_base_dt_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub1_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub2_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub3_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_lot_inh_col_typ_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NE(MCEventInfo info){
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
		if (nx == TblTab) doTbl_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cmn_flg) doCnd_cmn_flg_NX(info);
		else if (nx == Cnd_wg_flg) doCnd_wg_flg_NX(info);
		else if (nx == Cnd_wg_cd) doCnd_wg_cd_NX(info);
		else if (nx == Cnd_wg_nm) doCnd_wg_nm_NX(info);
		else if (nx == Cnd_bom_ptn) doCnd_bom_ptn_NX(info);
		else if (nx == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_NX(info);
		else if (nx == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_del_flg) doHdr_del_flg_NX(info);
		else if (nx == Hdr_wg_cd) doHdr_wg_cd_NX(info);
		else if (nx == Hdr_wg_nm) doHdr_wg_nm_NX(info);
		else if (nx == Hdr_bom_ptn) doHdr_bom_ptn_NX(info);
		else if (nx == Hdr_lot_inh_col_typ) doHdr_lot_inh_col_typ_NX(info);
		else if (nx == Hdr_lot_inh_col_typ_nm) doHdr_lot_inh_col_typ_nm_NX(info);
		else if (nx == Hdr_lot_inh_typ) doHdr_lot_inh_typ_NX(info);
		else if (nx == Hdr_lot_inh_typ_nm) doHdr_lot_inh_typ_nm_NX(info);
		else if (nx == Hdr_add_concat_col) doHdr_add_concat_col_NX(info);
		else if (nx == Hdr_add_concat_col_nm) doHdr_add_concat_col_nm_NX(info);
		else if (nx == Hdr_overflow_err_flg) doHdr_overflow_err_flg_NX(info);
		else if (nx == Hdr_memo1) doHdr_memo1_NX(info);
		else if (nx == Hdr_memo2) doHdr_memo2_NX(info);
		else if (nx == Hdr_memo3) doHdr_memo3_NX(info);
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
		else if (nx == Hdr_del_usr_id) doHdr_del_usr_id_NX(info);
		else if (nx == Hdr_del_usr_nm) doHdr_del_usr_nm_NX(info);
		else if (nx == Hdr_del_ts) doHdr_del_ts_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == ChdSet_wg_cd) doChdSet_wg_cd_NX(info);
		else if (nx == ChdSet_wg_nm) doChdSet_wg_nm_NX(info);
		else if (nx == ChdSet_base_dt) doChdSet_base_dt_NX(info);
		else if (nx == ChdSet_par_itm_cd) doChdSet_par_itm_cd_NX(info);
		else if (nx == ChdSet_par_itm_sub1) doChdSet_par_itm_sub1_NX(info);
		else if (nx == ChdSet_par_itm_sub2) doChdSet_par_itm_sub2_NX(info);
		else if (nx == ChdSet_par_itm_sub3) doChdSet_par_itm_sub3_NX(info);
		else if (nx == ChdSet_bom_ptn) doChdSet_bom_ptn_NX(info);
		else if (nx == ChdSet_lot_inh_col_typ) doChdSet_lot_inh_col_typ_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_bom_ptn) doDtl_bom_ptn_NX(info);
		else if (nx == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_NX(info);
		else if (nx == columnDtl_wg_cd) doDtl_wg_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_NX(info);
		else if (nx == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_NX(info);
		else if (nx == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_NX(info);
		else if (nx == columnDtl_prio) doDtl_prio_NX(info);
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
	 * [Tbl]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doTbl_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cmn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cmn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[wg_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_wg_flg_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[overflow_err_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_overflow_err_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo3_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[base_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_base_dt_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub1_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub2_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub3_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_lot_inh_col_typ_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[bom_ptn]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_NX(MCEventInfo info){
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
		if (lc == Cnd_wg_cd) doCnd_wg_cd_LC(info);
		else if (lc == Cnd_wg_nm) doCnd_wg_nm_LC(info);
		else if (lc == Cnd_bom_ptn) doCnd_bom_ptn_LC(info);
		else if (lc == Cnd_lot_inh_col_typ) doCnd_lot_inh_col_typ_LC(info);
		else if (lc == Cnd_lot_inh_col_typ_nm) doCnd_lot_inh_col_typ_nm_LC(info);
		else if (lc == Hdr_wg_cd) doHdr_wg_cd_LC(info);
		else if (lc == Hdr_wg_nm) doHdr_wg_nm_LC(info);
		else if (lc == Hdr_bom_ptn) doHdr_bom_ptn_LC(info);
		else if (lc == Hdr_lot_inh_col_typ) doHdr_lot_inh_col_typ_LC(info);
		else if (lc == Hdr_lot_inh_col_typ_nm) doHdr_lot_inh_col_typ_nm_LC(info);
		else if (lc == Hdr_lot_inh_typ) doHdr_lot_inh_typ_LC(info);
		else if (lc == Hdr_lot_inh_typ_nm) doHdr_lot_inh_typ_nm_LC(info);
		else if (lc == Hdr_add_concat_col) doHdr_add_concat_col_LC(info);
		else if (lc == Hdr_add_concat_col_nm) doHdr_add_concat_col_nm_LC(info);
		else if (lc == Hdr_memo1) doHdr_memo1_LC(info);
		else if (lc == Hdr_memo2) doHdr_memo2_LC(info);
		else if (lc == Hdr_memo3) doHdr_memo3_LC(info);
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
		else if (lc == Hdr_del_usr_id) doHdr_del_usr_id_LC(info);
		else if (lc == Hdr_del_usr_nm) doHdr_del_usr_nm_LC(info);
		else if (lc == Hdr_del_ts) doHdr_del_ts_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == ChdSet_wg_cd) doChdSet_wg_cd_LC(info);
		else if (lc == ChdSet_wg_nm) doChdSet_wg_nm_LC(info);
		else if (lc == ChdSet_base_dt) doChdSet_base_dt_LC(info);
		else if (lc == ChdSet_par_itm_cd) doChdSet_par_itm_cd_LC(info);
		else if (lc == ChdSet_par_itm_sub1) doChdSet_par_itm_sub1_LC(info);
		else if (lc == ChdSet_par_itm_sub2) doChdSet_par_itm_sub2_LC(info);
		else if (lc == ChdSet_par_itm_sub3) doChdSet_par_itm_sub3_LC(info);
		else if (lc == ChdSet_bom_ptn) doChdSet_bom_ptn_LC(info);
		else if (lc == ChdSet_lot_inh_col_typ) doChdSet_lot_inh_col_typ_LC(info);
		else if (lc == columnDtl_bom_ptn) doDtl_bom_ptn_LC(info);
		else if (lc == columnDtl_lot_inh_col_typ) doDtl_lot_inh_col_typ_LC(info);
		else if (lc == columnDtl_wg_cd) doDtl_wg_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ) doDtl_chd_itm_typ_LC(info);
		else if (lc == columnDtl_chd_itm_typ_nm) doDtl_chd_itm_typ_nm_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_cd) doDtl_chd_itm_typ_d_cd_LC(info);
		else if (lc == columnDtl_chd_itm_typ_d_nm) doDtl_chd_itm_typ_d_nm_LC(info);
		else if (lc == columnDtl_prio) doDtl_prio_LC(info);
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
	 * [Cnd]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[lot_inh_col_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_lot_inh_col_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_col_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_col_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[lot_inh_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_lot_inh_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[add_concat_col_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_add_concat_col_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_memo3_LC(MCEventInfo info){
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
	 * [Hdr]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[base_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_base_dt_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub1_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub2_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[par_itm_sub3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_par_itm_sub3_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [ChdSet]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doChdSet_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[bom_ptn]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_bom_ptn_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[lot_inh_col_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_lot_inh_col_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[chd_itm_typ_d_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_chd_itm_typ_d_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_prio_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getCnd_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_wg_cd]の作成メソッド
	 */
	public MCList getCnd_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_bom_ptn]の作成メソッド
	 */
	public MCList getCnd_bom_ptn(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBomPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_lot_inh_col_typ]の作成メソッド
	 */
	public MCList getCnd_lot_inh_col_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotInhColTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_cd]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub1]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub2]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_par_itm_p_PPanel_Itm_itm_sub3]の作成メソッド
	 */
	public MCList getHdr_par_itm_p_PPanel_Itm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_wg_cd]の作成メソッド
	 */
	public MCList getHdr_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_lot_inh_col_typ]の作成メソッド
	 */
	public MCList getHdr_lot_inh_col_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotInhColTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_lot_inh_typ]の作成メソッド
	 */
	public MCList getHdr_lot_inh_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotInhTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_add_concat_col]の作成メソッド
	 */
	public MCList getHdr_add_concat_col(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAddConcatColTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[ChdSet_wg_cd]の作成メソッド
	 */
	public MCList getChdSet_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_par_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_par_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_lot_inh_col_typ]の作成メソッド
	 */
	public MCList getDtl_lot_inh_col_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLotInhColTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_wg_cd]の作成メソッド
	 */
	public MCList getDtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Dtl_chd_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getDtl_chd_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0210.Srch01")) {
			return new MA_MABSL0210_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0210.Upd01")) {
			return new MA_MABSL0210_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0210.Del01")) {
			return new MA_MABSL0210_Del01Bridge();
		}
		if (id.equals("MA.MABSL0210.Sprt01")) {
			return new MA_MABSL0210_Sprt01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0210_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0210_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0210_Srch01Bridge() {
			p_MA_MABSL0210_Srch01 = new MCParam(PDef.MA_MABSL0210_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0210_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0210.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.HdrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));

			p_MA_MABSL0210_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0210_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0210_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0210_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0210_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0210.CndR up0() {
			return (mcframe.clientMABS.MABSP0210.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0210.HdrR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0210.HdrR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0210.DtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP0210.DtlR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABSL0210_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.HdrR.class));
			p_MA_MABSL0210_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0210_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABS.MABSP0210.HdrR>)p_MA_MABSL0210_Srch01.getContainerParam().getDownBlock(0));
			setDtlL((MCList<mcframe.clientMABS.MABSP0210.DtlR>)p_MA_MABSL0210_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getHdrAllL().clear();
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getDtlL());
			return result;
		}
	}
	/**
	 * [MA_MABSL0210_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0210_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0210_Upd01Bridge() {
			p_MA_MABSL0210_Upd01 = new MCParam(PDef.MA_MABSL0210_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0210_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0210.HdrR.class));
			// Down

			p_MA_MABSL0210_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0210_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0210_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABSL0210_Upd01.addUpBlock(getHdrAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0210_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0210_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0210.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0210.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP0210.HdrR> up1() {
			return (MCList<mcframe.clientMABS.MABSP0210.HdrR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0210_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getHdrAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABSL0210_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0210_Del01;

		/** コンストラクタ */
		protected MA_MABSL0210_Del01Bridge() {
			p_MA_MABSL0210_Del01 = new MCParam(PDef.MA_MABSL0210_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0210_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));
			// Down

			p_MA_MABSL0210_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0210_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0210_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0210_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0210_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0210.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0210.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0210_Del01;
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
	 * [MA_MABSL0210_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0210_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0210_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0210_Sprt01Bridge() {
			p_MA_MABSL0210_Sprt01 = new MCParam(PDef.MA_MABSL0210_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0210_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0210.ChdSetR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));

			p_MA_MABSL0210_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0210_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0210_Sprt01.addUpBlock(getChdSetR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0210_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0210_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0210.ChdSetR up0() {
			return (mcframe.clientMABS.MABSP0210.ChdSetR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0210.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0210.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0210_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0210.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0210_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0210.DtlR>)p_MA_MABSL0210_Sprt01.getContainerParam().getDownBlock(0));
		}

		protected void clear() {
			getDtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getChdSetR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			return result;
		}
	}
}