package mcframe.clientMABS.MABSP0230;

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
import mcframe.clientMABS.MABSP0230.MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Srch01Caller;
import mcframe.clientMABS.MABSP0230.MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Sprt01Caller;
import mcframe.clientMABS.MABSP0230.MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Upd01Caller;
import mcframe.clientMABS.MABSP0230.MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Del01Caller;

/**
 * 画面"MABSP_CstSlsUpriRankReg"パネルクラスです。<p>
 *
 * 得意先販売単価ランクマスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_CstSlsUpriRankReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP0230";

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
	// [CndTab]ブロック関連のField定義
	public MCPanel CndTabPanel = null;
	public MCTabbedPane CndTabTab = null;
	// [CndTab]ブロックの項目のField定義
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create/Modify,0;DEL,Delete (Administrator),1;REF,View,3 UPD,登録・訂正する,0;DEL,削除する（管理者）,1;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public MCLabel Cnd_cst_cd_Label = null;
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_cst_cd = null;
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public MCTextField Cnd_cst_nm = null;
	public MCLabel Cnd_dlv_cd_Label = null;
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCTextField Cnd_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCTextField Cnd_dlv_nm = null;
	public MCLabel Cnd_dest_cd1_Label = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm1 = null;
	public MCLabel Cnd_dest_cd2_Label = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm2 = null;
	public MCLabel Cnd_dest_cd3_Label = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCTextField Cnd_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCTextField Cnd_dest_nm3 = null;
	public MCLabel Cnd_sls_upri_rank_cd_Label = null;
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_sls_upri_rank_cd = null;
	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public MCTextField Cnd_sls_upri_rank_nm = null;
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
	public MCLabel Cnd_cst_grp_cd1_Label = null;
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd1 = null;
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm1 = null;
	public MCLabel Cnd_cst_grp_cd2_Label = null;
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd2 = null;
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm2 = null;
	public MCLabel Cnd_cst_grp_cd3_Label = null;
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd3 = null;
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm3 = null;
	public MCLabel Cnd_cst_grp_cd4_Label = null;
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd4 = null;
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm4 = null;
	public MCLabel Cnd_cst_grp_cd5_Label = null;
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd5 = null;
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm5 = null;
	public MCLabel Cnd_cst_grp_cd6_Label = null;
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd6 = null;
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm6 = null;
	public MCLabel Cnd_cst_grp_cd7_Label = null;
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd7 = null;
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm7 = null;
	public MCLabel Cnd_cst_grp_cd8_Label = null;
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd8 = null;
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm8 = null;
	public MCLabel Cnd_cst_grp_cd9_Label = null;
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd9 = null;
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm9 = null;
	public MCLabel Cnd_cst_grp_cd10_Label = null;
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_cst_grp_cd10 = null;
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_cst_grp_nm10 = null;
	public MCLabel Cnd_dlv_grp_cd1_Label = null;
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd1 = null;
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm1 = null;
	public MCLabel Cnd_dlv_grp_cd2_Label = null;
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd2 = null;
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm2 = null;
	public MCLabel Cnd_dlv_grp_cd3_Label = null;
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd3 = null;
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm3 = null;
	public MCLabel Cnd_dlv_grp_cd4_Label = null;
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd4 = null;
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm4 = null;
	public MCLabel Cnd_dlv_grp_cd5_Label = null;
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd5 = null;
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm5 = null;
	public MCLabel Cnd_dlv_grp_cd6_Label = null;
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd6 = null;
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm6 = null;
	public MCLabel Cnd_dlv_grp_cd7_Label = null;
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd7 = null;
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm7 = null;
	public MCLabel Cnd_dlv_grp_cd8_Label = null;
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd8 = null;
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm8 = null;
	public MCLabel Cnd_dlv_grp_cd9_Label = null;
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd9 = null;
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm9 = null;
	public MCLabel Cnd_dlv_grp_cd10_Label = null;
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public MCTextComboBox Cnd_dlv_grp_cd10 = null;
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public MCTextField Cnd_dlv_grp_nm10 = null;
	// [Tab1]ブロック関連のField定義
	public MCPanel Tab1Panel = null;
	// [Tab1]ブロックの項目のField定義
	// [Tab2]ブロック関連のField定義
	public MCPanel Tab2Panel = null;
	// [Tab2]ブロックの項目のField定義
	// [Tab3]ブロック関連のField定義
	public MCPanel Tab3Panel = null;
	// [Tab3]ブロックの項目のField定義
	// [Ctrl]ブロック関連のField定義
	public MCPanel CtrlPanel = null;
	// [Ctrl]ブロックの項目のField定義
	public mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit Ctrl_ctrl_PPanel;
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
	public MCTable2<mcframe.clientMABS.MABSP0230.DtlR> DtlTable = null;
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_cd = null;
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dlv_nm = null;
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd1 = null;
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm1 = null;
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd2 = null;
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm2 = null;
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_cd3 = null;
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_dest_nm3 = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Dtl_dt_p_PPanel;
	public MCColumnConfig columnDtl_st_dt_key;// [Dtl]の[dt_p.st_dt_key]を[columnDtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnDtl_st_dt;// [Dtl]の[dt_p.st_dt]を[columnDtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnDtl_end_dt;// [Dtl]の[dt_p.end_dt]を[columnDtl_end_dt]としてエイリアス定義。
	/**
	 * Sales unit price rank cd. 販売単価ランクＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_rank_cd = null;
	/**
	 * Sales unit price rank name 販売単価ランク名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sls_upri_rank_nm = null;
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
	
	/** [MA_MABSL0230_Srch01]のCallerの作成 */
	protected MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Srch01Caller createMA_MABSL0230_Srch01() {
		MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Srch01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Srch01Bridge>
		caller = ((MABSP_CstSlsUpriRankReg_MC)this).new MA_MABSL0230_Srch01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Srch01Bridge>(
					(MABSP_CstSlsUpriRankReg)this, new MA_MABSL0230_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL0230_Srch01]の呼び出し */
	protected void callMA_MABSL0230_Srch01() {
		MCCaller caller = createMA_MABSL0230_Srch01();
		caller.exec();
	}
	/** [MA_MABSL0230_Sprt01]のCallerの作成 */
	protected MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Sprt01Caller createMA_MABSL0230_Sprt01() {
		MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Sprt01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Sprt01Bridge>
		caller = ((MABSP_CstSlsUpriRankReg_MC)this).new MA_MABSL0230_Sprt01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Sprt01Bridge>(
					(MABSP_CstSlsUpriRankReg)this, new MA_MABSL0230_Sprt01Bridge());
		return caller;
	}
	/** [MA_MABSL0230_Sprt01]の呼び出し */
	protected void callMA_MABSL0230_Sprt01() {
		MCCaller caller = createMA_MABSL0230_Sprt01();
		caller.exec();
	}
	/** [MA_MABSL0230_Upd01]のCallerの作成 */
	protected MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Upd01Caller createMA_MABSL0230_Upd01() {
		MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Upd01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Upd01Bridge>
		caller = ((MABSP_CstSlsUpriRankReg_MC)this).new MA_MABSL0230_Upd01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Upd01Bridge>(
					(MABSP_CstSlsUpriRankReg)this, new MA_MABSL0230_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL0230_Upd01]の呼び出し */
	protected void callMA_MABSL0230_Upd01() {
		MCCaller caller = createMA_MABSL0230_Upd01();
		caller.exec();
	}
	/** [MA_MABSL0230_Del01]のCallerの作成 */
	protected MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Del01Caller createMA_MABSL0230_Del01() {
		MABSP_CstSlsUpriRankReg_MC.MA_MABSL0230_Del01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Del01Bridge>
		caller = ((MABSP_CstSlsUpriRankReg_MC)this).new MA_MABSL0230_Del01Caller<MABSP_CstSlsUpriRankReg, MA_MABSL0230_Del01Bridge>(
					(MABSP_CstSlsUpriRankReg)this, new MA_MABSL0230_Del01Bridge());
		return caller;
	}
	/** [MA_MABSL0230_Del01]の呼び出し */
	protected void callMA_MABSL0230_Del01() {
		MCCaller caller = createMA_MABSL0230_Del01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0230.CndR aCndR;
	/** [BulkSet]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP0230.BulkSetR aBulkSetR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP0230.DtlR> aDtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP0230.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0230.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP0230.CndR createCndR() {
		return mcframe.clientMABS.MABSP0230.CndR.create();
	}

	/**
	 * 項目コピーによってaBulkSetRを設定します。
	 *
	 * aBulkSetRのインスタンスは変更されません。
	 *
	 * @param row BulkSetR
	 */
	public void setBulkSetR(mcframe.clientMABS.MABSP0230.BulkSetR row) {
		if (row != null) {
			MCRow.copyall(getBulkSetR(), row);
		}
	}

	/**
	 * [BulkSet]ブロックのコンテナaBulkSetRを返します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0230.BulkSetR getBulkSetR() {
		return aBulkSetR;
	}

	/**
	 * aBulkSetRを作成します。
	 *
	 * @return BulkSetR
	 */
	public mcframe.clientMABS.MABSP0230.BulkSetR createBulkSetR() {
		return mcframe.clientMABS.MABSP0230.BulkSetR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABS.MABSP0230.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0230.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABS.MABSP0230.DtlR createDtlR() {
		return mcframe.clientMABS.MABSP0230.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP0230.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class);
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
		ret.add(CndTabPanel);
		ret.add(CndPanel);
		ret.add(Tab1Panel);
		ret.add(Tab2Panel);
		ret.add(Tab3Panel);
		ret.add(CtrlPanel);
		ret.add(BulkSetPanel);
		ret.add(DtlPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_CstSlsUpriRankReg_MC_A() {
		aCndR = createCndR();
		aBulkSetR = createBulkSetR();
		aDtlL = createDtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_CstSlsUpriRankReg_MC_A(String name) {
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
		MABSP_CstSlsUpriRankReg_MC.jbCreateScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateTop((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateFold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateCndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateCnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateTab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateTab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateTab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateCtrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateBulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateDtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateBtn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbCreateEastBtn((MABSP_CstSlsUpriRankReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [CndTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCndTab(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_CstSlsUpriRankReg p) {
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
	}

	/**
	 * [Tab1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab1(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Tab2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab2(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Tab3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTab3(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_CstSlsUpriRankReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [BulkSet]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBulkSet(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABSP_CstSlsUpriRankReg p) {
		p.Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP0230.DtlR.$dt_p);
		p.Dtl_dt_p_PPanel.setName("Dtl.dt_p");
		p.columnDtl_st_dt_key = p.Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnDtl_st_dt_key.addAliasName("Dtl.st_dt_key", p);
		p.columnDtl_st_dt = p.Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnDtl_st_dt.addAliasName("Dtl.st_dt", p);
		p.columnDtl_end_dt = p.Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnDtl_end_dt.addAliasName("Dtl.end_dt", p);
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABSP_CstSlsUpriRankReg p) {
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

	
	/** [Cnd_cst_cd_ListPutter]の定義 */
	private MCListPutter Cnd_cst_cd_p = null;

	/**
	 * [Cnd_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_cd_ListPutter() {
		if (Cnd_cst_cd_p == null) {
			Cnd_cst_cd_p = createCnd_cst_cd_ListPutter(Cnd_cst_cd, "cst_cd", "cst_nm");

		}
		return Cnd_cst_cd_p;
	}
	
	
	/** [Cnd_dlv_cd_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_cd_p = null;

	/**
	 * [Cnd_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_cd_ListPutter() {
		if (Cnd_dlv_cd_p == null) {
			Cnd_dlv_cd_p = createCnd_dlv_cd_ListPutter(Cnd_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Cnd_dlv_cd_p;
	}
	
	
	/** [Cnd_dest_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd1_p = null;

	/**
	 * [Cnd_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd1_ListPutter() {
		if (Cnd_dest_cd1_p == null) {
			Cnd_dest_cd1_p = createCnd_dest_cd1_ListPutter(Cnd_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Cnd_dest_cd1_p;
	}
	
	
	/** [Cnd_dest_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd2_p = null;

	/**
	 * [Cnd_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd2_ListPutter() {
		if (Cnd_dest_cd2_p == null) {
			Cnd_dest_cd2_p = createCnd_dest_cd2_ListPutter(Cnd_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Cnd_dest_cd2_p;
	}
	
	
	/** [Cnd_dest_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dest_cd3_p = null;

	/**
	 * [Cnd_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dest_cd3_ListPutter() {
		if (Cnd_dest_cd3_p == null) {
			Cnd_dest_cd3_p = createCnd_dest_cd3_ListPutter(Cnd_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Cnd_dest_cd3_p;
	}
	
	
	/** [Cnd_sls_upri_rank_cd_ListPutter]の定義 */
	private MCListPutter Cnd_sls_upri_rank_cd_p = null;

	/**
	 * [Cnd_sls_upri_rank_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_sls_upri_rank_cd_ListPutter() {
		if (Cnd_sls_upri_rank_cd_p == null) {
			Cnd_sls_upri_rank_cd_p = createCnd_sls_upri_rank_cd_ListPutter(Cnd_sls_upri_rank_cd, "sls_upri_rank_cd", "sls_upri_rank_nm");

		}
		return Cnd_sls_upri_rank_cd_p;
	}
	
	
	/** [Cnd_cst_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd1_p = null;

	/**
	 * [Cnd_cst_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd1_ListPutter() {
		if (Cnd_cst_grp_cd1_p == null) {
			Cnd_cst_grp_cd1_p = createCnd_cst_grp_cd1_ListPutter(Cnd_cst_grp_cd1, "cst_grp_cd1", "cst_grp_nm1");

		}
		return Cnd_cst_grp_cd1_p;
	}
	
	
	/** [Cnd_cst_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd2_p = null;

	/**
	 * [Cnd_cst_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd2_ListPutter() {
		if (Cnd_cst_grp_cd2_p == null) {
			Cnd_cst_grp_cd2_p = createCnd_cst_grp_cd2_ListPutter(Cnd_cst_grp_cd2, "cst_grp_cd2", "cst_grp_nm2");

		}
		return Cnd_cst_grp_cd2_p;
	}
	
	
	/** [Cnd_cst_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd3_p = null;

	/**
	 * [Cnd_cst_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd3_ListPutter() {
		if (Cnd_cst_grp_cd3_p == null) {
			Cnd_cst_grp_cd3_p = createCnd_cst_grp_cd3_ListPutter(Cnd_cst_grp_cd3, "cst_grp_cd3", "cst_grp_nm3");

		}
		return Cnd_cst_grp_cd3_p;
	}
	
	
	/** [Cnd_cst_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd4_p = null;

	/**
	 * [Cnd_cst_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd4_ListPutter() {
		if (Cnd_cst_grp_cd4_p == null) {
			Cnd_cst_grp_cd4_p = createCnd_cst_grp_cd4_ListPutter(Cnd_cst_grp_cd4, "cst_grp_cd4", "cst_grp_nm4");

		}
		return Cnd_cst_grp_cd4_p;
	}
	
	
	/** [Cnd_cst_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd5_p = null;

	/**
	 * [Cnd_cst_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd5_ListPutter() {
		if (Cnd_cst_grp_cd5_p == null) {
			Cnd_cst_grp_cd5_p = createCnd_cst_grp_cd5_ListPutter(Cnd_cst_grp_cd5, "cst_grp_cd5", "cst_grp_nm5");

		}
		return Cnd_cst_grp_cd5_p;
	}
	
	
	/** [Cnd_cst_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd6_p = null;

	/**
	 * [Cnd_cst_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd6_ListPutter() {
		if (Cnd_cst_grp_cd6_p == null) {
			Cnd_cst_grp_cd6_p = createCnd_cst_grp_cd6_ListPutter(Cnd_cst_grp_cd6, "cst_grp_cd6", "cst_grp_nm6");

		}
		return Cnd_cst_grp_cd6_p;
	}
	
	
	/** [Cnd_cst_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd7_p = null;

	/**
	 * [Cnd_cst_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd7_ListPutter() {
		if (Cnd_cst_grp_cd7_p == null) {
			Cnd_cst_grp_cd7_p = createCnd_cst_grp_cd7_ListPutter(Cnd_cst_grp_cd7, "cst_grp_cd7", "cst_grp_nm7");

		}
		return Cnd_cst_grp_cd7_p;
	}
	
	
	/** [Cnd_cst_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd8_p = null;

	/**
	 * [Cnd_cst_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd8_ListPutter() {
		if (Cnd_cst_grp_cd8_p == null) {
			Cnd_cst_grp_cd8_p = createCnd_cst_grp_cd8_ListPutter(Cnd_cst_grp_cd8, "cst_grp_cd8", "cst_grp_nm8");

		}
		return Cnd_cst_grp_cd8_p;
	}
	
	
	/** [Cnd_cst_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd9_p = null;

	/**
	 * [Cnd_cst_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd9_ListPutter() {
		if (Cnd_cst_grp_cd9_p == null) {
			Cnd_cst_grp_cd9_p = createCnd_cst_grp_cd9_ListPutter(Cnd_cst_grp_cd9, "cst_grp_cd9", "cst_grp_nm9");

		}
		return Cnd_cst_grp_cd9_p;
	}
	
	
	/** [Cnd_cst_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_cst_grp_cd10_p = null;

	/**
	 * [Cnd_cst_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_cst_grp_cd10_ListPutter() {
		if (Cnd_cst_grp_cd10_p == null) {
			Cnd_cst_grp_cd10_p = createCnd_cst_grp_cd10_ListPutter(Cnd_cst_grp_cd10, "cst_grp_cd10", "cst_grp_nm10");

		}
		return Cnd_cst_grp_cd10_p;
	}
	
	
	/** [Cnd_dlv_grp_cd1_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd1_p = null;

	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd1_ListPutter() {
		if (Cnd_dlv_grp_cd1_p == null) {
			Cnd_dlv_grp_cd1_p = createCnd_dlv_grp_cd1_ListPutter(Cnd_dlv_grp_cd1, "dlv_grp_cd1", "dlv_grp_nm1");

		}
		return Cnd_dlv_grp_cd1_p;
	}
	
	
	/** [Cnd_dlv_grp_cd2_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd2_p = null;

	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd2_ListPutter() {
		if (Cnd_dlv_grp_cd2_p == null) {
			Cnd_dlv_grp_cd2_p = createCnd_dlv_grp_cd2_ListPutter(Cnd_dlv_grp_cd2, "dlv_grp_cd2", "dlv_grp_nm2");

		}
		return Cnd_dlv_grp_cd2_p;
	}
	
	
	/** [Cnd_dlv_grp_cd3_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd3_p = null;

	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd3_ListPutter() {
		if (Cnd_dlv_grp_cd3_p == null) {
			Cnd_dlv_grp_cd3_p = createCnd_dlv_grp_cd3_ListPutter(Cnd_dlv_grp_cd3, "dlv_grp_cd3", "dlv_grp_nm3");

		}
		return Cnd_dlv_grp_cd3_p;
	}
	
	
	/** [Cnd_dlv_grp_cd4_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd4_p = null;

	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd4_ListPutter() {
		if (Cnd_dlv_grp_cd4_p == null) {
			Cnd_dlv_grp_cd4_p = createCnd_dlv_grp_cd4_ListPutter(Cnd_dlv_grp_cd4, "dlv_grp_cd4", "dlv_grp_nm4");

		}
		return Cnd_dlv_grp_cd4_p;
	}
	
	
	/** [Cnd_dlv_grp_cd5_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd5_p = null;

	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd5_ListPutter() {
		if (Cnd_dlv_grp_cd5_p == null) {
			Cnd_dlv_grp_cd5_p = createCnd_dlv_grp_cd5_ListPutter(Cnd_dlv_grp_cd5, "dlv_grp_cd5", "dlv_grp_nm5");

		}
		return Cnd_dlv_grp_cd5_p;
	}
	
	
	/** [Cnd_dlv_grp_cd6_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd6_p = null;

	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd6_ListPutter() {
		if (Cnd_dlv_grp_cd6_p == null) {
			Cnd_dlv_grp_cd6_p = createCnd_dlv_grp_cd6_ListPutter(Cnd_dlv_grp_cd6, "dlv_grp_cd6", "dlv_grp_nm6");

		}
		return Cnd_dlv_grp_cd6_p;
	}
	
	
	/** [Cnd_dlv_grp_cd7_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd7_p = null;

	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd7_ListPutter() {
		if (Cnd_dlv_grp_cd7_p == null) {
			Cnd_dlv_grp_cd7_p = createCnd_dlv_grp_cd7_ListPutter(Cnd_dlv_grp_cd7, "dlv_grp_cd7", "dlv_grp_nm7");

		}
		return Cnd_dlv_grp_cd7_p;
	}
	
	
	/** [Cnd_dlv_grp_cd8_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd8_p = null;

	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd8_ListPutter() {
		if (Cnd_dlv_grp_cd8_p == null) {
			Cnd_dlv_grp_cd8_p = createCnd_dlv_grp_cd8_ListPutter(Cnd_dlv_grp_cd8, "dlv_grp_cd8", "dlv_grp_nm8");

		}
		return Cnd_dlv_grp_cd8_p;
	}
	
	
	/** [Cnd_dlv_grp_cd9_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd9_p = null;

	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd9_ListPutter() {
		if (Cnd_dlv_grp_cd9_p == null) {
			Cnd_dlv_grp_cd9_p = createCnd_dlv_grp_cd9_ListPutter(Cnd_dlv_grp_cd9, "dlv_grp_cd9", "dlv_grp_nm9");

		}
		return Cnd_dlv_grp_cd9_p;
	}
	
	
	/** [Cnd_dlv_grp_cd10_ListPutter]の定義 */
	private MCListPutter Cnd_dlv_grp_cd10_p = null;

	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getCnd_dlv_grp_cd10_ListPutter() {
		if (Cnd_dlv_grp_cd10_p == null) {
			Cnd_dlv_grp_cd10_p = createCnd_dlv_grp_cd10_ListPutter(Cnd_dlv_grp_cd10, "dlv_grp_cd10", "dlv_grp_nm10");

		}
		return Cnd_dlv_grp_cd10_p;
	}
	
	
	/** [Dtl_cst_cd_ListPutter]の定義 */
	private MCListPutter Dtl_cst_cd_p = null;

	/**
	 * [Dtl_cst_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cst_cd_ListPutter() {
		if (Dtl_cst_cd_p == null) {
			Dtl_cst_cd_p = createDtl_cst_cd_ListPutter(columnDtl_cst_cd, "cst_cd", "cst_nm");

		}
		return Dtl_cst_cd_p;
	}
	
	
	/** [Dtl_dlv_cd_ListPutter]の定義 */
	private MCListPutter Dtl_dlv_cd_p = null;

	/**
	 * [Dtl_dlv_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dlv_cd_ListPutter() {
		if (Dtl_dlv_cd_p == null) {
			Dtl_dlv_cd_p = createDtl_dlv_cd_ListPutter(columnDtl_dlv_cd, "dlv_cd", "dlv_nm");

		}
		return Dtl_dlv_cd_p;
	}
	
	
	/** [Dtl_dest_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd1_p = null;

	/**
	 * [Dtl_dest_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd1_ListPutter() {
		if (Dtl_dest_cd1_p == null) {
			Dtl_dest_cd1_p = createDtl_dest_cd1_ListPutter(columnDtl_dest_cd1, "dest_cd1", "dest_nm1");

		}
		return Dtl_dest_cd1_p;
	}
	
	
	/** [Dtl_dest_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd2_p = null;

	/**
	 * [Dtl_dest_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd2_ListPutter() {
		if (Dtl_dest_cd2_p == null) {
			Dtl_dest_cd2_p = createDtl_dest_cd2_ListPutter(columnDtl_dest_cd2, "dest_cd2", "dest_nm2");

		}
		return Dtl_dest_cd2_p;
	}
	
	
	/** [Dtl_dest_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_dest_cd3_p = null;

	/**
	 * [Dtl_dest_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_dest_cd3_ListPutter() {
		if (Dtl_dest_cd3_p == null) {
			Dtl_dest_cd3_p = createDtl_dest_cd3_ListPutter(columnDtl_dest_cd3, "dest_cd3", "dest_nm3");

		}
		return Dtl_dest_cd3_p;
	}
	
	
	/** [Dtl_sls_upri_rank_cd_ListPutter]の定義 */
	private MCListPutter Dtl_sls_upri_rank_cd_p = null;

	/**
	 * [Dtl_sls_upri_rank_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_sls_upri_rank_cd_ListPutter() {
		if (Dtl_sls_upri_rank_cd_p == null) {
			Dtl_sls_upri_rank_cd_p = createDtl_sls_upri_rank_cd_ListPutter(columnDtl_sls_upri_rank_cd, "sls_upri_rank_cd", "sls_upri_rank_nm");

		}
		return Dtl_sls_upri_rank_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_CstSlsUpriRankReg create(){
		MABSP_CstSlsUpriRankReg p = new MABSP_CstSlsUpriRankReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_CstSlsUpriRankReg create(String name){
		MABSP_CstSlsUpriRankReg p = new MABSP_CstSlsUpriRankReg(name);
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
		MABSP_CstSlsUpriRankReg_MC.jbfInitScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitTop((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitFold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitCndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitCnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitTab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitTab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitTab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitCtrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitBulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitDtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitBtn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbfInitEastBtn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitTop((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitFold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitCndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitCnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitTab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitTab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitTab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitCtrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitBulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitDtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitBtn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.jbInitEastBtn((MABSP_CstSlsUpriRankReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCndTab(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.CndTabPanel = p.beansFactory.createPanel("CndTab");
		p.CndTabTab = p.beansFactory.createTabbedPane("CndTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_cst_cd_Label = p.beansFactory.createLabel("Cnd.cst_cd_Label");
		p.Cnd_cst_cd = p.beansFactory.createTextField("Cnd.cst_cd");
		p.Cnd_cst_cd.setLabel(p.Cnd_cst_cd_Label);
		p.Cnd_cst_nm = p.beansFactory.createTextField("Cnd.cst_nm");
		p.Cnd_dlv_cd_Label = p.beansFactory.createLabel("Cnd.dlv_cd_Label");
		p.Cnd_dlv_cd = p.beansFactory.createTextField("Cnd.dlv_cd");
		p.Cnd_dlv_cd.setLabel(p.Cnd_dlv_cd_Label);
		p.Cnd_dlv_nm = p.beansFactory.createTextField("Cnd.dlv_nm");
		p.Cnd_dest_cd1_Label = p.beansFactory.createLabel("Cnd.dest_cd1_Label");
		p.Cnd_dest_cd1 = p.beansFactory.createTextField("Cnd.dest_cd1");
		p.Cnd_dest_cd1.setLabel(p.Cnd_dest_cd1_Label);
		p.Cnd_dest_nm1 = p.beansFactory.createTextField("Cnd.dest_nm1");
		p.Cnd_dest_cd2_Label = p.beansFactory.createLabel("Cnd.dest_cd2_Label");
		p.Cnd_dest_cd2 = p.beansFactory.createTextField("Cnd.dest_cd2");
		p.Cnd_dest_cd2.setLabel(p.Cnd_dest_cd2_Label);
		p.Cnd_dest_nm2 = p.beansFactory.createTextField("Cnd.dest_nm2");
		p.Cnd_dest_cd3_Label = p.beansFactory.createLabel("Cnd.dest_cd3_Label");
		p.Cnd_dest_cd3 = p.beansFactory.createTextField("Cnd.dest_cd3");
		p.Cnd_dest_cd3.setLabel(p.Cnd_dest_cd3_Label);
		p.Cnd_dest_nm3 = p.beansFactory.createTextField("Cnd.dest_nm3");
		p.Cnd_sls_upri_rank_cd_Label = p.beansFactory.createLabel("Cnd.sls_upri_rank_cd_Label");
		p.Cnd_sls_upri_rank_cd = p.beansFactory.createTextComboBox("Cnd.sls_upri_rank_cd");
		p.Cnd_sls_upri_rank_cd.setLabel(p.Cnd_sls_upri_rank_cd_Label);
		p.Cnd_sls_upri_rank_nm = p.beansFactory.createTextField("Cnd.sls_upri_rank_nm");
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
		p.Cnd_cst_grp_cd1_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd1_Label");
		p.Cnd_cst_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd1");
		p.Cnd_cst_grp_cd1.setLabel(p.Cnd_cst_grp_cd1_Label);
		p.Cnd_cst_grp_nm1 = p.beansFactory.createTextField("Cnd.cst_grp_nm1");
		p.Cnd_cst_grp_cd2_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd2_Label");
		p.Cnd_cst_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd2");
		p.Cnd_cst_grp_cd2.setLabel(p.Cnd_cst_grp_cd2_Label);
		p.Cnd_cst_grp_nm2 = p.beansFactory.createTextField("Cnd.cst_grp_nm2");
		p.Cnd_cst_grp_cd3_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd3_Label");
		p.Cnd_cst_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd3");
		p.Cnd_cst_grp_cd3.setLabel(p.Cnd_cst_grp_cd3_Label);
		p.Cnd_cst_grp_nm3 = p.beansFactory.createTextField("Cnd.cst_grp_nm3");
		p.Cnd_cst_grp_cd4_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd4_Label");
		p.Cnd_cst_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd4");
		p.Cnd_cst_grp_cd4.setLabel(p.Cnd_cst_grp_cd4_Label);
		p.Cnd_cst_grp_nm4 = p.beansFactory.createTextField("Cnd.cst_grp_nm4");
		p.Cnd_cst_grp_cd5_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd5_Label");
		p.Cnd_cst_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd5");
		p.Cnd_cst_grp_cd5.setLabel(p.Cnd_cst_grp_cd5_Label);
		p.Cnd_cst_grp_nm5 = p.beansFactory.createTextField("Cnd.cst_grp_nm5");
		p.Cnd_cst_grp_cd6_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd6_Label");
		p.Cnd_cst_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd6");
		p.Cnd_cst_grp_cd6.setLabel(p.Cnd_cst_grp_cd6_Label);
		p.Cnd_cst_grp_nm6 = p.beansFactory.createTextField("Cnd.cst_grp_nm6");
		p.Cnd_cst_grp_cd7_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd7_Label");
		p.Cnd_cst_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd7");
		p.Cnd_cst_grp_cd7.setLabel(p.Cnd_cst_grp_cd7_Label);
		p.Cnd_cst_grp_nm7 = p.beansFactory.createTextField("Cnd.cst_grp_nm7");
		p.Cnd_cst_grp_cd8_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd8_Label");
		p.Cnd_cst_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd8");
		p.Cnd_cst_grp_cd8.setLabel(p.Cnd_cst_grp_cd8_Label);
		p.Cnd_cst_grp_nm8 = p.beansFactory.createTextField("Cnd.cst_grp_nm8");
		p.Cnd_cst_grp_cd9_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd9_Label");
		p.Cnd_cst_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd9");
		p.Cnd_cst_grp_cd9.setLabel(p.Cnd_cst_grp_cd9_Label);
		p.Cnd_cst_grp_nm9 = p.beansFactory.createTextField("Cnd.cst_grp_nm9");
		p.Cnd_cst_grp_cd10_Label = p.beansFactory.createLabel("Cnd.cst_grp_cd10_Label");
		p.Cnd_cst_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.cst_grp_cd10");
		p.Cnd_cst_grp_cd10.setLabel(p.Cnd_cst_grp_cd10_Label);
		p.Cnd_cst_grp_nm10 = p.beansFactory.createTextField("Cnd.cst_grp_nm10");
		p.Cnd_dlv_grp_cd1_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd1_Label");
		p.Cnd_dlv_grp_cd1 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd1");
		p.Cnd_dlv_grp_cd1.setLabel(p.Cnd_dlv_grp_cd1_Label);
		p.Cnd_dlv_grp_nm1 = p.beansFactory.createTextField("Cnd.dlv_grp_nm1");
		p.Cnd_dlv_grp_cd2_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd2_Label");
		p.Cnd_dlv_grp_cd2 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd2");
		p.Cnd_dlv_grp_cd2.setLabel(p.Cnd_dlv_grp_cd2_Label);
		p.Cnd_dlv_grp_nm2 = p.beansFactory.createTextField("Cnd.dlv_grp_nm2");
		p.Cnd_dlv_grp_cd3_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd3_Label");
		p.Cnd_dlv_grp_cd3 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd3");
		p.Cnd_dlv_grp_cd3.setLabel(p.Cnd_dlv_grp_cd3_Label);
		p.Cnd_dlv_grp_nm3 = p.beansFactory.createTextField("Cnd.dlv_grp_nm3");
		p.Cnd_dlv_grp_cd4_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd4_Label");
		p.Cnd_dlv_grp_cd4 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd4");
		p.Cnd_dlv_grp_cd4.setLabel(p.Cnd_dlv_grp_cd4_Label);
		p.Cnd_dlv_grp_nm4 = p.beansFactory.createTextField("Cnd.dlv_grp_nm4");
		p.Cnd_dlv_grp_cd5_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd5_Label");
		p.Cnd_dlv_grp_cd5 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd5");
		p.Cnd_dlv_grp_cd5.setLabel(p.Cnd_dlv_grp_cd5_Label);
		p.Cnd_dlv_grp_nm5 = p.beansFactory.createTextField("Cnd.dlv_grp_nm5");
		p.Cnd_dlv_grp_cd6_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd6_Label");
		p.Cnd_dlv_grp_cd6 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd6");
		p.Cnd_dlv_grp_cd6.setLabel(p.Cnd_dlv_grp_cd6_Label);
		p.Cnd_dlv_grp_nm6 = p.beansFactory.createTextField("Cnd.dlv_grp_nm6");
		p.Cnd_dlv_grp_cd7_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd7_Label");
		p.Cnd_dlv_grp_cd7 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd7");
		p.Cnd_dlv_grp_cd7.setLabel(p.Cnd_dlv_grp_cd7_Label);
		p.Cnd_dlv_grp_nm7 = p.beansFactory.createTextField("Cnd.dlv_grp_nm7");
		p.Cnd_dlv_grp_cd8_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd8_Label");
		p.Cnd_dlv_grp_cd8 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd8");
		p.Cnd_dlv_grp_cd8.setLabel(p.Cnd_dlv_grp_cd8_Label);
		p.Cnd_dlv_grp_nm8 = p.beansFactory.createTextField("Cnd.dlv_grp_nm8");
		p.Cnd_dlv_grp_cd9_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd9_Label");
		p.Cnd_dlv_grp_cd9 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd9");
		p.Cnd_dlv_grp_cd9.setLabel(p.Cnd_dlv_grp_cd9_Label);
		p.Cnd_dlv_grp_nm9 = p.beansFactory.createTextField("Cnd.dlv_grp_nm9");
		p.Cnd_dlv_grp_cd10_Label = p.beansFactory.createLabel("Cnd.dlv_grp_cd10_Label");
		p.Cnd_dlv_grp_cd10 = p.beansFactory.createTextComboBox("Cnd.dlv_grp_cd10");
		p.Cnd_dlv_grp_cd10.setLabel(p.Cnd_dlv_grp_cd10_Label);
		p.Cnd_dlv_grp_nm10 = p.beansFactory.createTextField("Cnd.dlv_grp_nm10");
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab1(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.Tab1Panel = p.beansFactory.createPanel("Tab1");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab2(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.Tab2Panel = p.beansFactory.createPanel("Tab2");
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTab3(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.Tab3Panel = p.beansFactory.createPanel("Tab3");
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBulkSet(MABSP_CstSlsUpriRankReg p) {
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
	protected static void jbfInitDtl(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_cst_cd = p.beansFactory.createTableColumn("Dtl.cst_cd", MCColumnType.TEXT);
		p.columnDtl_cst_nm = p.beansFactory.createTableColumn("Dtl.cst_nm", MCColumnType.TEXT);
		p.columnDtl_dlv_cd = p.beansFactory.createTableColumn("Dtl.dlv_cd", MCColumnType.TEXT);
		p.columnDtl_dlv_nm = p.beansFactory.createTableColumn("Dtl.dlv_nm", MCColumnType.TEXT);
		p.columnDtl_dest_cd1 = p.beansFactory.createTableColumn("Dtl.dest_cd1", MCColumnType.TEXT);
		p.columnDtl_dest_nm1 = p.beansFactory.createTableColumn("Dtl.dest_nm1", MCColumnType.TEXT);
		p.columnDtl_dest_cd2 = p.beansFactory.createTableColumn("Dtl.dest_cd2", MCColumnType.TEXT);
		p.columnDtl_dest_nm2 = p.beansFactory.createTableColumn("Dtl.dest_nm2", MCColumnType.TEXT);
		p.columnDtl_dest_cd3 = p.beansFactory.createTableColumn("Dtl.dest_cd3", MCColumnType.TEXT);
		p.columnDtl_dest_nm3 = p.beansFactory.createTableColumn("Dtl.dest_nm3", MCColumnType.TEXT);
		p.columnDtl_sls_upri_rank_cd = p.beansFactory.createTableColumn("Dtl.sls_upri_rank_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_sls_upri_rank_nm = p.beansFactory.createTableColumn("Dtl.sls_upri_rank_nm", MCColumnType.TEXT);
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
	protected static void jbfInitBtn(MABSP_CstSlsUpriRankReg p) {
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
	protected static void jbfInitEastBtn(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_CstSlsUpriRankReg p) {
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
	protected static void jbInitTop(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.add(p.TopPanel);
		p.TopPanel.setNextBeans(p.CndPanel);
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
	protected static void jbInitFold(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndTabPanel, null);
		p.FoldPanel.setLastBeans(p.CndTabPanel);
	}

	/**
	 * [CndTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCndTab(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.CndTabPanel.add(p.CndTabTab);
		p.CndTabPanel.setLastBeans(p.CndTabTab);
		p.CndTabPanel.setValueCheck(false);
		p.CndTabPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndTabPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.CndTabTab.add(p.Tab1Panel, "CndTab.tab1");
		p.CndTabTab.setLastBeans(p.Tab1Panel);
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		p.CndTabTab.add(p.Tab2Panel, "CndTab.tab2");
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		p.CndTabTab.add(p.Tab3Panel, "CndTab.tab3");
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.BulkSetPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("N");
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
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.ope_META);
		p.Tab1Panel.add(p.Cnd_dt_PPanel);
		p.Tab1Panel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_cst_cd);
		p.Tab1Panel.add(p.Cnd_cst_cd_Label);
		p.Tab1Panel.add(p.Cnd_cst_cd);
		p.Cnd_cst_cd.setNextBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_cd_META);
		p.Cnd_cst_cd.addLinkBeans(p.Cnd_cst_nm);
		p.Cnd_cst_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_cd, true);
		p.Tab1Panel.add(p.Cnd_cst_nm);
		p.Cnd_cst_nm.setNextBeans(p.Cnd_dlv_cd);
		p.Cnd_cst_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_nm_META);
		p.setPluralValueEnable(p.Cnd_cst_nm, true);
		p.Tab1Panel.add(p.Cnd_dlv_cd_Label);
		p.Tab1Panel.add(p.Cnd_dlv_cd);
		p.Cnd_dlv_cd.setNextBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_cd_META);
		p.Cnd_dlv_cd.addLinkBeans(p.Cnd_dlv_nm);
		p.Cnd_dlv_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_cd, true);
		p.Tab1Panel.add(p.Cnd_dlv_nm);
		p.Cnd_dlv_nm.setNextBeans(p.Cnd_dest_cd1);
		p.Cnd_dlv_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_nm_META);
		p.setPluralValueEnable(p.Cnd_dlv_nm, true);
		p.Tab1Panel.add(p.Cnd_dest_cd1_Label);
		p.Tab1Panel.add(p.Cnd_dest_cd1);
		p.Cnd_dest_cd1.setNextBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_cd1_META);
		p.Cnd_dest_cd1.addLinkBeans(p.Cnd_dest_nm1);
		p.Cnd_dest_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd1, true);
		p.Tab1Panel.add(p.Cnd_dest_nm1);
		p.Cnd_dest_nm1.setNextBeans(p.Cnd_dest_cd2);
		p.Cnd_dest_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_nm1_META);
		p.setPluralValueEnable(p.Cnd_dest_nm1, true);
		p.Tab1Panel.add(p.Cnd_dest_cd2_Label);
		p.Tab1Panel.add(p.Cnd_dest_cd2);
		p.Cnd_dest_cd2.setNextBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_cd2_META);
		p.Cnd_dest_cd2.addLinkBeans(p.Cnd_dest_nm2);
		p.Cnd_dest_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd2, true);
		p.Tab1Panel.add(p.Cnd_dest_nm2);
		p.Cnd_dest_nm2.setNextBeans(p.Cnd_dest_cd3);
		p.Cnd_dest_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_nm2_META);
		p.setPluralValueEnable(p.Cnd_dest_nm2, true);
		p.Tab1Panel.add(p.Cnd_dest_cd3_Label);
		p.Tab1Panel.add(p.Cnd_dest_cd3);
		p.Cnd_dest_cd3.setNextBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_cd3_META);
		p.Cnd_dest_cd3.addLinkBeans(p.Cnd_dest_nm3);
		p.Cnd_dest_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dest_cd3, true);
		p.Tab1Panel.add(p.Cnd_dest_nm3);
		p.Cnd_dest_nm3.setNextBeans(p.Cnd_sls_upri_rank_cd);
		p.Cnd_dest_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dest_nm3_META);
		p.setPluralValueEnable(p.Cnd_dest_nm3, true);
		p.Cnd_sls_upri_rank_cd.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_sls_upri_rank_cd, true);
		p.Cnd_sls_upri_rank_cd.setLinkBeans(p.Cnd_sls_upri_rank_nm);
		p.Tab1Panel.add(p.Cnd_sls_upri_rank_cd_Label);
		p.Tab1Panel.add(p.Cnd_sls_upri_rank_cd);
		p.Cnd_sls_upri_rank_cd.setNextBeans(p.Cnd_sls_upri_rank_nm);
		p.Cnd_sls_upri_rank_cd.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.sls_upri_rank_cd_META);
		p.Tab1Panel.add(p.Cnd_sls_upri_rank_nm);
		p.Cnd_sls_upri_rank_nm.setNextBeans(p.Cnd_memo1);
		p.Cnd_sls_upri_rank_nm.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.sls_upri_rank_nm_META);
		p.setPluralValueEnable(p.Cnd_sls_upri_rank_nm, true);
		p.Tab1Panel.add(p.Cnd_memo1_Label);
		p.Tab1Panel.add(p.Cnd_memo1);
		p.Cnd_memo1.setNextBeans(p.Cnd_memo2);
		p.Cnd_memo1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.memo1_META);
		p.setPluralValueEnable(p.Cnd_memo1, true);
		p.Tab1Panel.add(p.Cnd_memo2_Label);
		p.Tab1Panel.add(p.Cnd_memo2);
		p.Cnd_memo2.setNextBeans(p.Cnd_memo3);
		p.Cnd_memo2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.memo2_META);
		p.setPluralValueEnable(p.Cnd_memo2, true);
		p.Tab1Panel.add(p.Cnd_memo3_Label);
		p.Tab1Panel.add(p.Cnd_memo3);
		p.Cnd_memo3.setNextBeans(p.Cnd_off_del_flg);
		p.Cnd_memo3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.memo3_META);
		p.setPluralValueEnable(p.Cnd_memo3, true);
		p.Tab1Panel.add(p.Cnd_del_flg_lab);
		p.Tab1Panel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.off_del_flg_META);
		p.Tab1Panel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.on_del_flg_META);
		p.Cnd_cst_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd1, true);
		p.Cnd_cst_grp_cd1.setLinkBeans(p.Cnd_cst_grp_nm1);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd1_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd1);
		p.Tab2Panel.setLastBeans(p.Cnd_cst_grp_cd1);
		p.Cnd_cst_grp_cd1.setNextBeans(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd1_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm1);
		p.Cnd_cst_grp_nm1.setNextBeans(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm1, true);
		p.Cnd_cst_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd2, true);
		p.Cnd_cst_grp_cd2.setLinkBeans(p.Cnd_cst_grp_nm2);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd2_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd2);
		p.Cnd_cst_grp_cd2.setNextBeans(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd2_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm2);
		p.Cnd_cst_grp_nm2.setNextBeans(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm2, true);
		p.Cnd_cst_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd3, true);
		p.Cnd_cst_grp_cd3.setLinkBeans(p.Cnd_cst_grp_nm3);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd3_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd3);
		p.Cnd_cst_grp_cd3.setNextBeans(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd3_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm3);
		p.Cnd_cst_grp_nm3.setNextBeans(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm3, true);
		p.Cnd_cst_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd4, true);
		p.Cnd_cst_grp_cd4.setLinkBeans(p.Cnd_cst_grp_nm4);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd4_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd4);
		p.Cnd_cst_grp_cd4.setNextBeans(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd4_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm4);
		p.Cnd_cst_grp_nm4.setNextBeans(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm4, true);
		p.Cnd_cst_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd5, true);
		p.Cnd_cst_grp_cd5.setLinkBeans(p.Cnd_cst_grp_nm5);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd5_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd5);
		p.Cnd_cst_grp_cd5.setNextBeans(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd5_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm5);
		p.Cnd_cst_grp_nm5.setNextBeans(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm5, true);
		p.Cnd_cst_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd6, true);
		p.Cnd_cst_grp_cd6.setLinkBeans(p.Cnd_cst_grp_nm6);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd6_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd6);
		p.Cnd_cst_grp_cd6.setNextBeans(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd6_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm6);
		p.Cnd_cst_grp_nm6.setNextBeans(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm6, true);
		p.Cnd_cst_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd7, true);
		p.Cnd_cst_grp_cd7.setLinkBeans(p.Cnd_cst_grp_nm7);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd7_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd7);
		p.Cnd_cst_grp_cd7.setNextBeans(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd7_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm7);
		p.Cnd_cst_grp_nm7.setNextBeans(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm7, true);
		p.Cnd_cst_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd8, true);
		p.Cnd_cst_grp_cd8.setLinkBeans(p.Cnd_cst_grp_nm8);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd8_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd8);
		p.Cnd_cst_grp_cd8.setNextBeans(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd8_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm8);
		p.Cnd_cst_grp_nm8.setNextBeans(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm8, true);
		p.Cnd_cst_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd9, true);
		p.Cnd_cst_grp_cd9.setLinkBeans(p.Cnd_cst_grp_nm9);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd9_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd9);
		p.Cnd_cst_grp_cd9.setNextBeans(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd9_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm9);
		p.Cnd_cst_grp_nm9.setNextBeans(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm9, true);
		p.Cnd_cst_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_cst_grp_cd10, true);
		p.Cnd_cst_grp_cd10.setLinkBeans(p.Cnd_cst_grp_nm10);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd10_Label);
		p.Tab2Panel.add(p.Cnd_cst_grp_cd10);
		p.Cnd_cst_grp_cd10.setNextBeans(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_cd10_META);
		p.Tab2Panel.add(p.Cnd_cst_grp_nm10);
		p.Cnd_cst_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.cst_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_cst_grp_nm10, true);
		p.Cnd_dlv_grp_cd1.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd1, true);
		p.Cnd_dlv_grp_cd1.setLinkBeans(p.Cnd_dlv_grp_nm1);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd1_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd1);
		p.Tab3Panel.setLastBeans(p.Cnd_dlv_grp_cd1);
		p.Cnd_dlv_grp_cd1.setNextBeans(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_cd1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd1_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm1);
		p.Cnd_dlv_grp_nm1.setNextBeans(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_nm1.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm1_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm1, true);
		p.Cnd_dlv_grp_cd2.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd2, true);
		p.Cnd_dlv_grp_cd2.setLinkBeans(p.Cnd_dlv_grp_nm2);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd2_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd2);
		p.Cnd_dlv_grp_cd2.setNextBeans(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_cd2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd2_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm2);
		p.Cnd_dlv_grp_nm2.setNextBeans(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_nm2.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm2_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm2, true);
		p.Cnd_dlv_grp_cd3.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd3, true);
		p.Cnd_dlv_grp_cd3.setLinkBeans(p.Cnd_dlv_grp_nm3);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd3_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd3);
		p.Cnd_dlv_grp_cd3.setNextBeans(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_cd3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd3_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm3);
		p.Cnd_dlv_grp_nm3.setNextBeans(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_nm3.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm3_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm3, true);
		p.Cnd_dlv_grp_cd4.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd4, true);
		p.Cnd_dlv_grp_cd4.setLinkBeans(p.Cnd_dlv_grp_nm4);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd4_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd4);
		p.Cnd_dlv_grp_cd4.setNextBeans(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_cd4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd4_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm4);
		p.Cnd_dlv_grp_nm4.setNextBeans(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_nm4.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm4_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm4, true);
		p.Cnd_dlv_grp_cd5.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd5, true);
		p.Cnd_dlv_grp_cd5.setLinkBeans(p.Cnd_dlv_grp_nm5);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd5_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd5);
		p.Cnd_dlv_grp_cd5.setNextBeans(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_cd5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd5_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm5);
		p.Cnd_dlv_grp_nm5.setNextBeans(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_nm5.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm5_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm5, true);
		p.Cnd_dlv_grp_cd6.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd6, true);
		p.Cnd_dlv_grp_cd6.setLinkBeans(p.Cnd_dlv_grp_nm6);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd6_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd6);
		p.Cnd_dlv_grp_cd6.setNextBeans(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_cd6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd6_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm6);
		p.Cnd_dlv_grp_nm6.setNextBeans(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_nm6.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm6_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm6, true);
		p.Cnd_dlv_grp_cd7.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd7, true);
		p.Cnd_dlv_grp_cd7.setLinkBeans(p.Cnd_dlv_grp_nm7);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd7_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd7);
		p.Cnd_dlv_grp_cd7.setNextBeans(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_cd7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd7_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm7);
		p.Cnd_dlv_grp_nm7.setNextBeans(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_nm7.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm7_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm7, true);
		p.Cnd_dlv_grp_cd8.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd8, true);
		p.Cnd_dlv_grp_cd8.setLinkBeans(p.Cnd_dlv_grp_nm8);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd8_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd8);
		p.Cnd_dlv_grp_cd8.setNextBeans(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_cd8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd8_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm8);
		p.Cnd_dlv_grp_nm8.setNextBeans(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_nm8.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm8_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm8, true);
		p.Cnd_dlv_grp_cd9.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd9, true);
		p.Cnd_dlv_grp_cd9.setLinkBeans(p.Cnd_dlv_grp_nm9);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd9_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd9);
		p.Cnd_dlv_grp_cd9.setNextBeans(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_cd9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd9_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm9);
		p.Cnd_dlv_grp_nm9.setNextBeans(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_nm9.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm9_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm9, true);
		p.Cnd_dlv_grp_cd10.setListType(MCListType.FREE);
		p.setPluralValueEnable(p.Cnd_dlv_grp_cd10, true);
		p.Cnd_dlv_grp_cd10.setLinkBeans(p.Cnd_dlv_grp_nm10);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd10_Label);
		p.Tab3Panel.add(p.Cnd_dlv_grp_cd10);
		p.Cnd_dlv_grp_cd10.setNextBeans(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_cd10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_cd10_META);
		p.Tab3Panel.add(p.Cnd_dlv_grp_nm10);
		p.Cnd_dlv_grp_nm10.setRow(p.getCndR(), mcframe.clientMABS.MABSP0230.CndR.dlv_grp_nm10_META);
		p.setPluralValueEnable(p.Cnd_dlv_grp_nm10, true);
	}

	/**
	 * [Tab1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab1(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.Tab1Panel.setNextBeans(p.Tab2Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab2(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.Tab2Panel.setNextBeans(p.Tab3Panel);
		// ブロックの項目の初期化
	}

	/**
	 * [Tab3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitTab3(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		// ブロックの項目の初期化
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.CtrlPanel.setValueCheck(false);
		p.CtrlPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.CtrlPanel.setLayout(new BorderLayout());
		p.CtrlPanel.add(p.Ctrl_ctrl_PPanel, BorderLayout.SOUTH);
		p.CtrlPanel.setLastBeans(p.Ctrl_ctrl_PPanel);
	}

	/**
	 * [BulkSet]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBulkSet(MABSP_CstSlsUpriRankReg p) {
		// ブロック関連の初期化
		p.add(p.BulkSetPanel);
		p.BulkSetPanel.setNextBeans(p.DtlPanel);
		p.BulkSetPanel.setLayoutPosition("CBN");
		// ブロックの項目の初期化
		p.BulkSetPanel.add(p.BulkSet_st_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_st_dt);
		p.BulkSetPanel.setLastBeans(p.BulkSet_st_dt);
		p.BulkSet_st_dt.setNextBeans(p.BulkSet_end_dt);
		p.BulkSet_st_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0230.BulkSetR.st_dt_META);
		p.BulkSet_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSetPanel.add(p.BulkSet_end_dt_Label);
		p.BulkSetPanel.add(p.BulkSet_end_dt);
		p.BulkSet_end_dt.setNextBeans(p.BulkSet_set_dt);
		p.BulkSet_end_dt.setRow(p.getBulkSetR(), mcframe.clientMABS.MABSP0230.BulkSetR.end_dt_META);
		p.BulkSet_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.BulkSet_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.BulkSetPanel.add(p.BulkSet_set_dt);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABSP_CstSlsUpriRankReg p) {
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
	protected static void jbInitBtn(MABSP_CstSlsUpriRankReg p) {
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
	protected static void jbInitEastBtn(MABSP_CstSlsUpriRankReg p) {
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
		MABSP_CstSlsUpriRankReg_MC.mcInitScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitTop((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitFold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitCndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitCnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitTab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitTab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitTab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitCtrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitBulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitDtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitBtn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.mcInitEastBtn((MABSP_CstSlsUpriRankReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_ScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Top((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Fold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_CndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Cnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Tab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Tab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Tab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Ctrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_BulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Dtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_Btn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitUPD_EastBtn((MABSP_CstSlsUpriRankReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_ScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Top((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Fold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_CndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Cnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Tab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Tab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Tab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Ctrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_BulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Dtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_Btn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitFIX_EastBtn((MABSP_CstSlsUpriRankReg)this);

		// [DEL]ステータスのモードの設定
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_ScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Top((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Fold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_CndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Cnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Tab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Tab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Tab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Ctrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_BulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Dtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_Btn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitDEL_EastBtn((MABSP_CstSlsUpriRankReg)this);

		// [REF]ステータスのモードの設定
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_ScreenOpe((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Top((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Fold((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_CndTab((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Cnd((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Tab1((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Tab2((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Tab3((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Ctrl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_BulkSet((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Dtl((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_Btn((MABSP_CstSlsUpriRankReg)this);
		MABSP_CstSlsUpriRankReg_MC.statusInitREF_EastBtn((MABSP_CstSlsUpriRankReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [CndTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCndTab(MABSP_CstSlsUpriRankReg p) {
		p.CndTabTab.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_CstSlsUpriRankReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_cst_cd.setListListener(p);
		p.Cnd_cst_cd.addAllListener(p);
		p.Cnd_cst_nm.setListListener(p);
		p.Cnd_cst_nm.addAllListener(p);
		p.Cnd_dlv_cd.setListListener(p);
		p.Cnd_dlv_cd.addAllListener(p);
		p.Cnd_dlv_nm.setListListener(p);
		p.Cnd_dlv_nm.addAllListener(p);
		p.Cnd_dest_cd1.setListListener(p);
		p.Cnd_dest_cd1.addAllListener(p);
		p.Cnd_dest_nm1.setListListener(p);
		p.Cnd_dest_nm1.addAllListener(p);
		p.Cnd_dest_cd2.setListListener(p);
		p.Cnd_dest_cd2.addAllListener(p);
		p.Cnd_dest_nm2.setListListener(p);
		p.Cnd_dest_nm2.addAllListener(p);
		p.Cnd_dest_cd3.setListListener(p);
		p.Cnd_dest_cd3.addAllListener(p);
		p.Cnd_dest_nm3.setListListener(p);
		p.Cnd_dest_nm3.addAllListener(p);
		p.Cnd_sls_upri_rank_cd.setListListener(p);
		p.Cnd_sls_upri_rank_cd.addAllListener(p);
		p.Cnd_sls_upri_rank_nm.setListListener(p);
		p.Cnd_sls_upri_rank_nm.addAllListener(p);
		p.Cnd_memo1.setListListener(p);
		p.Cnd_memo1.addAllListener(p);
		p.Cnd_memo2.setListListener(p);
		p.Cnd_memo2.addAllListener(p);
		p.Cnd_memo3.setListListener(p);
		p.Cnd_memo3.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
		p.Cnd_cst_grp_cd1.setListListener(p);
		p.Cnd_cst_grp_cd1.addAllListener(p);
		p.Cnd_cst_grp_nm1.setListListener(p);
		p.Cnd_cst_grp_nm1.addAllListener(p);
		p.Cnd_cst_grp_cd2.setListListener(p);
		p.Cnd_cst_grp_cd2.addAllListener(p);
		p.Cnd_cst_grp_nm2.setListListener(p);
		p.Cnd_cst_grp_nm2.addAllListener(p);
		p.Cnd_cst_grp_cd3.setListListener(p);
		p.Cnd_cst_grp_cd3.addAllListener(p);
		p.Cnd_cst_grp_nm3.setListListener(p);
		p.Cnd_cst_grp_nm3.addAllListener(p);
		p.Cnd_cst_grp_cd4.setListListener(p);
		p.Cnd_cst_grp_cd4.addAllListener(p);
		p.Cnd_cst_grp_nm4.setListListener(p);
		p.Cnd_cst_grp_nm4.addAllListener(p);
		p.Cnd_cst_grp_cd5.setListListener(p);
		p.Cnd_cst_grp_cd5.addAllListener(p);
		p.Cnd_cst_grp_nm5.setListListener(p);
		p.Cnd_cst_grp_nm5.addAllListener(p);
		p.Cnd_cst_grp_cd6.setListListener(p);
		p.Cnd_cst_grp_cd6.addAllListener(p);
		p.Cnd_cst_grp_nm6.setListListener(p);
		p.Cnd_cst_grp_nm6.addAllListener(p);
		p.Cnd_cst_grp_cd7.setListListener(p);
		p.Cnd_cst_grp_cd7.addAllListener(p);
		p.Cnd_cst_grp_nm7.setListListener(p);
		p.Cnd_cst_grp_nm7.addAllListener(p);
		p.Cnd_cst_grp_cd8.setListListener(p);
		p.Cnd_cst_grp_cd8.addAllListener(p);
		p.Cnd_cst_grp_nm8.setListListener(p);
		p.Cnd_cst_grp_nm8.addAllListener(p);
		p.Cnd_cst_grp_cd9.setListListener(p);
		p.Cnd_cst_grp_cd9.addAllListener(p);
		p.Cnd_cst_grp_nm9.setListListener(p);
		p.Cnd_cst_grp_nm9.addAllListener(p);
		p.Cnd_cst_grp_cd10.setListListener(p);
		p.Cnd_cst_grp_cd10.addAllListener(p);
		p.Cnd_cst_grp_nm10.setListListener(p);
		p.Cnd_cst_grp_nm10.addAllListener(p);
		p.Cnd_dlv_grp_cd1.setListListener(p);
		p.Cnd_dlv_grp_cd1.addAllListener(p);
		p.Cnd_dlv_grp_nm1.setListListener(p);
		p.Cnd_dlv_grp_nm1.addAllListener(p);
		p.Cnd_dlv_grp_cd2.setListListener(p);
		p.Cnd_dlv_grp_cd2.addAllListener(p);
		p.Cnd_dlv_grp_nm2.setListListener(p);
		p.Cnd_dlv_grp_nm2.addAllListener(p);
		p.Cnd_dlv_grp_cd3.setListListener(p);
		p.Cnd_dlv_grp_cd3.addAllListener(p);
		p.Cnd_dlv_grp_nm3.setListListener(p);
		p.Cnd_dlv_grp_nm3.addAllListener(p);
		p.Cnd_dlv_grp_cd4.setListListener(p);
		p.Cnd_dlv_grp_cd4.addAllListener(p);
		p.Cnd_dlv_grp_nm4.setListListener(p);
		p.Cnd_dlv_grp_nm4.addAllListener(p);
		p.Cnd_dlv_grp_cd5.setListListener(p);
		p.Cnd_dlv_grp_cd5.addAllListener(p);
		p.Cnd_dlv_grp_nm5.setListListener(p);
		p.Cnd_dlv_grp_nm5.addAllListener(p);
		p.Cnd_dlv_grp_cd6.setListListener(p);
		p.Cnd_dlv_grp_cd6.addAllListener(p);
		p.Cnd_dlv_grp_nm6.setListListener(p);
		p.Cnd_dlv_grp_nm6.addAllListener(p);
		p.Cnd_dlv_grp_cd7.setListListener(p);
		p.Cnd_dlv_grp_cd7.addAllListener(p);
		p.Cnd_dlv_grp_nm7.setListListener(p);
		p.Cnd_dlv_grp_nm7.addAllListener(p);
		p.Cnd_dlv_grp_cd8.setListListener(p);
		p.Cnd_dlv_grp_cd8.addAllListener(p);
		p.Cnd_dlv_grp_nm8.setListListener(p);
		p.Cnd_dlv_grp_nm8.addAllListener(p);
		p.Cnd_dlv_grp_cd9.setListListener(p);
		p.Cnd_dlv_grp_cd9.addAllListener(p);
		p.Cnd_dlv_grp_nm9.setListListener(p);
		p.Cnd_dlv_grp_nm9.addAllListener(p);
		p.Cnd_dlv_grp_cd10.setListListener(p);
		p.Cnd_dlv_grp_cd10.addAllListener(p);
		p.Cnd_dlv_grp_nm10.setListListener(p);
		p.Cnd_dlv_grp_nm10.addAllListener(p);
	}

	/**
	 *  [Tab1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab1(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [Tab2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab2(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [Tab3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTab3(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_CstSlsUpriRankReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [BulkSet]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBulkSet(MABSP_CstSlsUpriRankReg p) {
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
	protected static void mcInitDtl(MABSP_CstSlsUpriRankReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_cst_cd.addAllListener(p);
		p.columnDtl_cst_cd.setListListener(p);
		p.columnDtl_cst_nm.addAllListener(p);
		p.columnDtl_cst_nm.setListListener(p);
		p.columnDtl_dlv_cd.addAllListener(p);
		p.columnDtl_dlv_cd.setListListener(p);
		p.columnDtl_dlv_nm.addAllListener(p);
		p.columnDtl_dlv_nm.setListListener(p);
		p.columnDtl_dest_cd1.addAllListener(p);
		p.columnDtl_dest_cd1.setListListener(p);
		p.columnDtl_dest_nm1.addAllListener(p);
		p.columnDtl_dest_nm1.setListListener(p);
		p.columnDtl_dest_cd2.addAllListener(p);
		p.columnDtl_dest_cd2.setListListener(p);
		p.columnDtl_dest_nm2.addAllListener(p);
		p.columnDtl_dest_nm2.setListListener(p);
		p.columnDtl_dest_cd3.addAllListener(p);
		p.columnDtl_dest_cd3.setListListener(p);
		p.columnDtl_dest_nm3.addAllListener(p);
		p.columnDtl_dest_nm3.setListListener(p);
		p.columnDtl_sls_upri_rank_cd.addAllListener(p);
		p.columnDtl_sls_upri_rank_cd.setListListener(p);
		p.columnDtl_sls_upri_rank_nm.addAllListener(p);
		p.columnDtl_sls_upri_rank_nm.setListListener(p);
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
	protected static void mcInitBtn(MABSP_CstSlsUpriRankReg p) {
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
	protected static void mcInitEastBtn(MABSP_CstSlsUpriRankReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_CndTab(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_CstSlsUpriRankReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_cd.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_nm.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab1(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab2(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tab3(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [UPD]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitUPD_BulkSet(MABSP_CstSlsUpriRankReg p){
		p.BulkSet_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.BulkSet_set_dt.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABSP_CstSlsUpriRankReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cst_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_cst_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dlv_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, UPD, MCMode.ENABLE);
		p.columnDtl_dest_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnDtl_sls_upri_rank_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnDtl_sls_upri_rank_nm.putMode(p, UPD, MCMode.READ_ONLY);
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
	protected static void statusInitUPD_Btn(MABSP_CstSlsUpriRankReg p){
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
	protected static void statusInitUPD_EastBtn(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_CndTab(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_CstSlsUpriRankReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_cd.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_nm.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab1(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab2(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tab3(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [FIX]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitFIX_BulkSet(MABSP_CstSlsUpriRankReg p){
		p.BulkSet_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Dtl(MABSP_CstSlsUpriRankReg p){
		p.columnDtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, FIX, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_sls_upri_rank_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_rank_nm.putMode(p, FIX, MCMode.READ_ONLY);
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
	protected static void statusInitFIX_Btn(MABSP_CstSlsUpriRankReg p){
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
	protected static void statusInitFIX_EastBtn(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Top(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Fold(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitDEL_CndTab(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABSP_CstSlsUpriRankReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_cd.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_nm.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, DEL, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab1(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab2(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Tab3(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Ctrl(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [DEL]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitDEL_BulkSet(MABSP_CstSlsUpriRankReg p){
		p.BulkSet_st_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, DEL, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABSP_CstSlsUpriRankReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(DEL, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_sls_upri_rank_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_rank_nm.putMode(p, DEL, MCMode.READ_ONLY);
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
	protected static void statusInitDEL_Btn(MABSP_CstSlsUpriRankReg p){
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
	protected static void statusInitDEL_EastBtn(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[CndTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_CndTab(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_CstSlsUpriRankReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_cst_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dest_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_cd.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_sls_upri_rank_nm.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_memo3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_cst_grp_nm10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm1.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm2.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm3.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm4.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm5.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm6.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm7.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm8.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm9.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_cd10.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_dlv_grp_nm10.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Tab1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab1(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Tab2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab2(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Tab3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tab3(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_CstSlsUpriRankReg p){

	}

	/**
	 * [REF]ステータスの[BulkSet]ブロックのモードの設定
	 */
	protected static void statusInitREF_BulkSet(MABSP_CstSlsUpriRankReg p){
		p.BulkSet_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.BulkSet_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABSP_CstSlsUpriRankReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cst_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dlv_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_dest_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnDtl_sls_upri_rank_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_sls_upri_rank_nm.putMode(p, REF, MCMode.READ_ONLY);
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
	protected static void statusInitREF_Btn(MABSP_CstSlsUpriRankReg p){
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
	protected static void statusInitREF_EastBtn(MABSP_CstSlsUpriRankReg p){

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
		MABSP_CstSlsUpriRankReg_MC.setTableConfigDtl((MABSP_CstSlsUpriRankReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABSP_CstSlsUpriRankReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABS.MABSP0230.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABS.MABSP0230.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_cst_cd.setMeta(mcframe.clientMABS.MABSP0230.DtlR.cst_cd_META);
		p.columnDtl_cst_cd.setListType(MCListType.STRICT);
		p.columnDtl_cst_cd.addLinkBeans(p.columnDtl_cst_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_cd);
		p.columnDtl_cst_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.cst_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cst_nm);
		p.columnDtl_dlv_cd.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dlv_cd_META);
		p.columnDtl_dlv_cd.setListType(MCListType.STRICT);
		p.columnDtl_dlv_cd.addLinkBeans(p.columnDtl_dlv_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_cd);
		p.columnDtl_dlv_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dlv_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dlv_nm);
		p.columnDtl_dest_cd1.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_cd1_META);
		p.columnDtl_dest_cd1.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd1.addLinkBeans(p.columnDtl_dest_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd1);
		p.columnDtl_dest_nm1.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm1);
		p.columnDtl_dest_cd2.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_cd2_META);
		p.columnDtl_dest_cd2.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd2.addLinkBeans(p.columnDtl_dest_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd2);
		p.columnDtl_dest_nm2.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm2);
		p.columnDtl_dest_cd3.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_cd3_META);
		p.columnDtl_dest_cd3.setListType(MCListType.STRICT);
		p.columnDtl_dest_cd3.addLinkBeans(p.columnDtl_dest_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_cd3);
		p.columnDtl_dest_nm3.setMeta(mcframe.clientMABS.MABSP0230.DtlR.dest_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_dest_nm3);
		p.DtlTable.addTable(p.Dtl_dt_p_PPanel.DtTable);
		p.columnDtl_sls_upri_rank_cd.setMeta(mcframe.clientMABS.MABSP0230.DtlR.sls_upri_rank_cd_META);
		p.columnDtl_sls_upri_rank_cd.addLinkBeans(p.columnDtl_sls_upri_rank_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_rank_cd);
		p.columnDtl_sls_upri_rank_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.sls_upri_rank_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sls_upri_rank_nm);
		p.columnDtl_memo1.setMeta(mcframe.clientMABS.MABSP0230.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABS.MABSP0230.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABS.MABSP0230.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP0230.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABS.MABSP0230.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP0230.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP0230.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP0230.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP0230.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABS.MABSP0230.DtlR.del_ts_META);
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
		Cnd_cst_cd.getListConfig().setPutter(getCnd_cst_cd_ListPutter());
		Cnd_dlv_cd.getListConfig().setPutter(getCnd_dlv_cd_ListPutter());
		Cnd_dest_cd1.getListConfig().setPutter(getCnd_dest_cd1_ListPutter());
		Cnd_dest_cd2.getListConfig().setPutter(getCnd_dest_cd2_ListPutter());
		Cnd_dest_cd3.getListConfig().setPutter(getCnd_dest_cd3_ListPutter());
		Cnd_sls_upri_rank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_sls_upri_rank_cd.getListConfig().setPutter(getCnd_sls_upri_rank_cd_ListPutter());
		Cnd_cst_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd1.getListConfig().setPutter(getCnd_cst_grp_cd1_ListPutter());
		Cnd_cst_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd2.getListConfig().setPutter(getCnd_cst_grp_cd2_ListPutter());
		Cnd_cst_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd3.getListConfig().setPutter(getCnd_cst_grp_cd3_ListPutter());
		Cnd_cst_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd4.getListConfig().setPutter(getCnd_cst_grp_cd4_ListPutter());
		Cnd_cst_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd5.getListConfig().setPutter(getCnd_cst_grp_cd5_ListPutter());
		Cnd_cst_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd6.getListConfig().setPutter(getCnd_cst_grp_cd6_ListPutter());
		Cnd_cst_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd7.getListConfig().setPutter(getCnd_cst_grp_cd7_ListPutter());
		Cnd_cst_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd8.getListConfig().setPutter(getCnd_cst_grp_cd8_ListPutter());
		Cnd_cst_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd9.getListConfig().setPutter(getCnd_cst_grp_cd9_ListPutter());
		Cnd_cst_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_cst_grp_cd10.getListConfig().setPutter(getCnd_cst_grp_cd10_ListPutter());
		Cnd_dlv_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd1.getListConfig().setPutter(getCnd_dlv_grp_cd1_ListPutter());
		Cnd_dlv_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd2.getListConfig().setPutter(getCnd_dlv_grp_cd2_ListPutter());
		Cnd_dlv_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd3.getListConfig().setPutter(getCnd_dlv_grp_cd3_ListPutter());
		Cnd_dlv_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd4.getListConfig().setPutter(getCnd_dlv_grp_cd4_ListPutter());
		Cnd_dlv_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd5.getListConfig().setPutter(getCnd_dlv_grp_cd5_ListPutter());
		Cnd_dlv_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd6.getListConfig().setPutter(getCnd_dlv_grp_cd6_ListPutter());
		Cnd_dlv_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd7.getListConfig().setPutter(getCnd_dlv_grp_cd7_ListPutter());
		Cnd_dlv_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd8.getListConfig().setPutter(getCnd_dlv_grp_cd8_ListPutter());
		Cnd_dlv_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd9.getListConfig().setPutter(getCnd_dlv_grp_cd9_ListPutter());
		Cnd_dlv_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_dlv_grp_cd10.getListConfig().setPutter(getCnd_dlv_grp_cd10_ListPutter());
		columnDtl_cst_cd.getListConfig().setPutter(getDtl_cst_cd_ListPutter());
		columnDtl_dlv_cd.getListConfig().setPutter(getDtl_dlv_cd_ListPutter());
		columnDtl_dest_cd1.getListConfig().setPutter(getDtl_dest_cd1_ListPutter());
		columnDtl_dest_cd2.getListConfig().setPutter(getDtl_dest_cd2_ListPutter());
		columnDtl_dest_cd3.getListConfig().setPutter(getDtl_dest_cd3_ListPutter());
		columnDtl_sls_upri_rank_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_sls_upri_rank_cd.getListConfig().setPutter(getDtl_sls_upri_rank_cd_ListPutter());
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
	 * [Cnd_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Cnd_sls_upri_rank_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_sls_upri_rank_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriRank");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_cst_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_cst_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp1");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp2");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp3");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp4");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp5");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp6");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp7");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp8");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp9");
		return lp;
	}
	 
	/**
	 * [Cnd_dlv_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createCnd_dlv_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.BpGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_cst_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cst_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dlv_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dlv_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_dest_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_dest_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Dtl_sls_upri_rank_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_sls_upri_rank_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.SlsUpriRank");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_cst_cd) return getCnd_cst_cd(row, info);
		if(combo == Cnd_dlv_cd) return getCnd_dlv_cd(row, info);
		if(combo == Cnd_dest_cd1) return getCnd_dest_cd1(row, info);
		if(combo == Cnd_dest_cd2) return getCnd_dest_cd2(row, info);
		if(combo == Cnd_dest_cd3) return getCnd_dest_cd3(row, info);
		if(combo == Cnd_sls_upri_rank_cd) return getCnd_sls_upri_rank_cd(row, info);
		if(combo == Cnd_cst_grp_cd1) return getCnd_cst_grp_cd1(row, info);
		if(combo == Cnd_cst_grp_cd2) return getCnd_cst_grp_cd2(row, info);
		if(combo == Cnd_cst_grp_cd3) return getCnd_cst_grp_cd3(row, info);
		if(combo == Cnd_cst_grp_cd4) return getCnd_cst_grp_cd4(row, info);
		if(combo == Cnd_cst_grp_cd5) return getCnd_cst_grp_cd5(row, info);
		if(combo == Cnd_cst_grp_cd6) return getCnd_cst_grp_cd6(row, info);
		if(combo == Cnd_cst_grp_cd7) return getCnd_cst_grp_cd7(row, info);
		if(combo == Cnd_cst_grp_cd8) return getCnd_cst_grp_cd8(row, info);
		if(combo == Cnd_cst_grp_cd9) return getCnd_cst_grp_cd9(row, info);
		if(combo == Cnd_cst_grp_cd10) return getCnd_cst_grp_cd10(row, info);
		if(combo == Cnd_dlv_grp_cd1) return getCnd_dlv_grp_cd1(row, info);
		if(combo == Cnd_dlv_grp_cd2) return getCnd_dlv_grp_cd2(row, info);
		if(combo == Cnd_dlv_grp_cd3) return getCnd_dlv_grp_cd3(row, info);
		if(combo == Cnd_dlv_grp_cd4) return getCnd_dlv_grp_cd4(row, info);
		if(combo == Cnd_dlv_grp_cd5) return getCnd_dlv_grp_cd5(row, info);
		if(combo == Cnd_dlv_grp_cd6) return getCnd_dlv_grp_cd6(row, info);
		if(combo == Cnd_dlv_grp_cd7) return getCnd_dlv_grp_cd7(row, info);
		if(combo == Cnd_dlv_grp_cd8) return getCnd_dlv_grp_cd8(row, info);
		if(combo == Cnd_dlv_grp_cd9) return getCnd_dlv_grp_cd9(row, info);
		if(combo == Cnd_dlv_grp_cd10) return getCnd_dlv_grp_cd10(row, info);
		if(combo == columnDtl_cst_cd) return getDtl_cst_cd(row, info);
		if(combo == columnDtl_dlv_cd) return getDtl_dlv_cd(row, info);
		if(combo == columnDtl_dest_cd1) return getDtl_dest_cd1(row, info);
		if(combo == columnDtl_dest_cd2) return getDtl_dest_cd2(row, info);
		if(combo == columnDtl_dest_cd3) return getDtl_dest_cd3(row, info);
		if(combo == columnDtl_sls_upri_rank_cd) return getDtl_sls_upri_rank_cd(row, info);
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
		if (vc == CndTabTab) return doCndTab_VC(info);
		if (vc == DtlTable) return doDtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_cst_cd) return doCnd_cst_cd_VC(info);
		if (vc == Cnd_cst_nm) return doCnd_cst_nm_VC(info);
		if (vc == Cnd_dlv_cd) return doCnd_dlv_cd_VC(info);
		if (vc == Cnd_dlv_nm) return doCnd_dlv_nm_VC(info);
		if (vc == Cnd_dest_cd1) return doCnd_dest_cd1_VC(info);
		if (vc == Cnd_dest_nm1) return doCnd_dest_nm1_VC(info);
		if (vc == Cnd_dest_cd2) return doCnd_dest_cd2_VC(info);
		if (vc == Cnd_dest_nm2) return doCnd_dest_nm2_VC(info);
		if (vc == Cnd_dest_cd3) return doCnd_dest_cd3_VC(info);
		if (vc == Cnd_dest_nm3) return doCnd_dest_nm3_VC(info);
		if (vc == Cnd_sls_upri_rank_cd) return doCnd_sls_upri_rank_cd_VC(info);
		if (vc == Cnd_sls_upri_rank_nm) return doCnd_sls_upri_rank_nm_VC(info);
		if (vc == Cnd_memo1) return doCnd_memo1_VC(info);
		if (vc == Cnd_memo2) return doCnd_memo2_VC(info);
		if (vc == Cnd_memo3) return doCnd_memo3_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Cnd_cst_grp_cd1) return doCnd_cst_grp_cd1_VC(info);
		if (vc == Cnd_cst_grp_nm1) return doCnd_cst_grp_nm1_VC(info);
		if (vc == Cnd_cst_grp_cd2) return doCnd_cst_grp_cd2_VC(info);
		if (vc == Cnd_cst_grp_nm2) return doCnd_cst_grp_nm2_VC(info);
		if (vc == Cnd_cst_grp_cd3) return doCnd_cst_grp_cd3_VC(info);
		if (vc == Cnd_cst_grp_nm3) return doCnd_cst_grp_nm3_VC(info);
		if (vc == Cnd_cst_grp_cd4) return doCnd_cst_grp_cd4_VC(info);
		if (vc == Cnd_cst_grp_nm4) return doCnd_cst_grp_nm4_VC(info);
		if (vc == Cnd_cst_grp_cd5) return doCnd_cst_grp_cd5_VC(info);
		if (vc == Cnd_cst_grp_nm5) return doCnd_cst_grp_nm5_VC(info);
		if (vc == Cnd_cst_grp_cd6) return doCnd_cst_grp_cd6_VC(info);
		if (vc == Cnd_cst_grp_nm6) return doCnd_cst_grp_nm6_VC(info);
		if (vc == Cnd_cst_grp_cd7) return doCnd_cst_grp_cd7_VC(info);
		if (vc == Cnd_cst_grp_nm7) return doCnd_cst_grp_nm7_VC(info);
		if (vc == Cnd_cst_grp_cd8) return doCnd_cst_grp_cd8_VC(info);
		if (vc == Cnd_cst_grp_nm8) return doCnd_cst_grp_nm8_VC(info);
		if (vc == Cnd_cst_grp_cd9) return doCnd_cst_grp_cd9_VC(info);
		if (vc == Cnd_cst_grp_nm9) return doCnd_cst_grp_nm9_VC(info);
		if (vc == Cnd_cst_grp_cd10) return doCnd_cst_grp_cd10_VC(info);
		if (vc == Cnd_cst_grp_nm10) return doCnd_cst_grp_nm10_VC(info);
		if (vc == Cnd_dlv_grp_cd1) return doCnd_dlv_grp_cd1_VC(info);
		if (vc == Cnd_dlv_grp_nm1) return doCnd_dlv_grp_nm1_VC(info);
		if (vc == Cnd_dlv_grp_cd2) return doCnd_dlv_grp_cd2_VC(info);
		if (vc == Cnd_dlv_grp_nm2) return doCnd_dlv_grp_nm2_VC(info);
		if (vc == Cnd_dlv_grp_cd3) return doCnd_dlv_grp_cd3_VC(info);
		if (vc == Cnd_dlv_grp_nm3) return doCnd_dlv_grp_nm3_VC(info);
		if (vc == Cnd_dlv_grp_cd4) return doCnd_dlv_grp_cd4_VC(info);
		if (vc == Cnd_dlv_grp_nm4) return doCnd_dlv_grp_nm4_VC(info);
		if (vc == Cnd_dlv_grp_cd5) return doCnd_dlv_grp_cd5_VC(info);
		if (vc == Cnd_dlv_grp_nm5) return doCnd_dlv_grp_nm5_VC(info);
		if (vc == Cnd_dlv_grp_cd6) return doCnd_dlv_grp_cd6_VC(info);
		if (vc == Cnd_dlv_grp_nm6) return doCnd_dlv_grp_nm6_VC(info);
		if (vc == Cnd_dlv_grp_cd7) return doCnd_dlv_grp_cd7_VC(info);
		if (vc == Cnd_dlv_grp_nm7) return doCnd_dlv_grp_nm7_VC(info);
		if (vc == Cnd_dlv_grp_cd8) return doCnd_dlv_grp_cd8_VC(info);
		if (vc == Cnd_dlv_grp_nm8) return doCnd_dlv_grp_nm8_VC(info);
		if (vc == Cnd_dlv_grp_cd9) return doCnd_dlv_grp_cd9_VC(info);
		if (vc == Cnd_dlv_grp_nm9) return doCnd_dlv_grp_nm9_VC(info);
		if (vc == Cnd_dlv_grp_cd10) return doCnd_dlv_grp_cd10_VC(info);
		if (vc == Cnd_dlv_grp_nm10) return doCnd_dlv_grp_nm10_VC(info);
		if (vc == BulkSet_st_dt) return doBulkSet_st_dt_VC(info);
		if (vc == BulkSet_end_dt) return doBulkSet_end_dt_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_cst_cd) return doDtl_cst_cd_VC(info);
		if (vc == columnDtl_cst_nm) return doDtl_cst_nm_VC(info);
		if (vc == columnDtl_dlv_cd) return doDtl_dlv_cd_VC(info);
		if (vc == columnDtl_dlv_nm) return doDtl_dlv_nm_VC(info);
		if (vc == columnDtl_dest_cd1) return doDtl_dest_cd1_VC(info);
		if (vc == columnDtl_dest_nm1) return doDtl_dest_nm1_VC(info);
		if (vc == columnDtl_dest_cd2) return doDtl_dest_cd2_VC(info);
		if (vc == columnDtl_dest_nm2) return doDtl_dest_nm2_VC(info);
		if (vc == columnDtl_dest_cd3) return doDtl_dest_cd3_VC(info);
		if (vc == columnDtl_dest_nm3) return doDtl_dest_nm3_VC(info);
		if (vc == columnDtl_sls_upri_rank_cd) return doDtl_sls_upri_rank_cd_VC(info);
		if (vc == columnDtl_sls_upri_rank_nm) return doDtl_sls_upri_rank_nm_VC(info);
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
	 * [CndTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCndTab_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_upri_rank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_sls_upri_rank_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_cst_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_dlv_grp_nm10_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dlv_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_dest_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_rank_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sls_upri_rank_nm_VC(MCEventInfo info){
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
		if (nc == CndTabTab) doCndTab_NC(info);
		else if (nc == DtlTable) doDtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_cst_cd) doCnd_cst_cd_NC(info);
		else if (nc == Cnd_cst_nm) doCnd_cst_nm_NC(info);
		else if (nc == Cnd_dlv_cd) doCnd_dlv_cd_NC(info);
		else if (nc == Cnd_dlv_nm) doCnd_dlv_nm_NC(info);
		else if (nc == Cnd_dest_cd1) doCnd_dest_cd1_NC(info);
		else if (nc == Cnd_dest_nm1) doCnd_dest_nm1_NC(info);
		else if (nc == Cnd_dest_cd2) doCnd_dest_cd2_NC(info);
		else if (nc == Cnd_dest_nm2) doCnd_dest_nm2_NC(info);
		else if (nc == Cnd_dest_cd3) doCnd_dest_cd3_NC(info);
		else if (nc == Cnd_dest_nm3) doCnd_dest_nm3_NC(info);
		else if (nc == Cnd_sls_upri_rank_cd) doCnd_sls_upri_rank_cd_NC(info);
		else if (nc == Cnd_sls_upri_rank_nm) doCnd_sls_upri_rank_nm_NC(info);
		else if (nc == Cnd_memo1) doCnd_memo1_NC(info);
		else if (nc == Cnd_memo2) doCnd_memo2_NC(info);
		else if (nc == Cnd_memo3) doCnd_memo3_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NC(info);
		else if (nc == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NC(info);
		else if (nc == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NC(info);
		else if (nc == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NC(info);
		else if (nc == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NC(info);
		else if (nc == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NC(info);
		else if (nc == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NC(info);
		else if (nc == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NC(info);
		else if (nc == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NC(info);
		else if (nc == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NC(info);
		else if (nc == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NC(info);
		else if (nc == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NC(info);
		else if (nc == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NC(info);
		else if (nc == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NC(info);
		else if (nc == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NC(info);
		else if (nc == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NC(info);
		else if (nc == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NC(info);
		else if (nc == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NC(info);
		else if (nc == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NC(info);
		else if (nc == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NC(info);
		else if (nc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NC(info);
		else if (nc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NC(info);
		else if (nc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NC(info);
		else if (nc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NC(info);
		else if (nc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NC(info);
		else if (nc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NC(info);
		else if (nc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NC(info);
		else if (nc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NC(info);
		else if (nc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NC(info);
		else if (nc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NC(info);
		else if (nc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NC(info);
		else if (nc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NC(info);
		else if (nc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NC(info);
		else if (nc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NC(info);
		else if (nc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NC(info);
		else if (nc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NC(info);
		else if (nc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NC(info);
		else if (nc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NC(info);
		else if (nc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NC(info);
		else if (nc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NC(info);
		else if (nc == BulkSet_st_dt) doBulkSet_st_dt_NC(info);
		else if (nc == BulkSet_end_dt) doBulkSet_end_dt_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_cst_cd) doDtl_cst_cd_NC(info);
		else if (nc == columnDtl_cst_nm) doDtl_cst_nm_NC(info);
		else if (nc == columnDtl_dlv_cd) doDtl_dlv_cd_NC(info);
		else if (nc == columnDtl_dlv_nm) doDtl_dlv_nm_NC(info);
		else if (nc == columnDtl_dest_cd1) doDtl_dest_cd1_NC(info);
		else if (nc == columnDtl_dest_nm1) doDtl_dest_nm1_NC(info);
		else if (nc == columnDtl_dest_cd2) doDtl_dest_cd2_NC(info);
		else if (nc == columnDtl_dest_nm2) doDtl_dest_nm2_NC(info);
		else if (nc == columnDtl_dest_cd3) doDtl_dest_cd3_NC(info);
		else if (nc == columnDtl_dest_nm3) doDtl_dest_nm3_NC(info);
		else if (nc == columnDtl_sls_upri_rank_cd) doDtl_sls_upri_rank_cd_NC(info);
		else if (nc == columnDtl_sls_upri_rank_nm) doDtl_sls_upri_rank_nm_NC(info);
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
	 * [CndTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_nm_NC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_nm_NC(MCEventInfo info){
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
		if (ne == CndTabTab) doCndTab_NE(info);
		else if (ne == DtlTable) doDtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_cst_cd) doCnd_cst_cd_NE(info);
		else if (ne == Cnd_cst_nm) doCnd_cst_nm_NE(info);
		else if (ne == Cnd_dlv_cd) doCnd_dlv_cd_NE(info);
		else if (ne == Cnd_dlv_nm) doCnd_dlv_nm_NE(info);
		else if (ne == Cnd_dest_cd1) doCnd_dest_cd1_NE(info);
		else if (ne == Cnd_dest_nm1) doCnd_dest_nm1_NE(info);
		else if (ne == Cnd_dest_cd2) doCnd_dest_cd2_NE(info);
		else if (ne == Cnd_dest_nm2) doCnd_dest_nm2_NE(info);
		else if (ne == Cnd_dest_cd3) doCnd_dest_cd3_NE(info);
		else if (ne == Cnd_dest_nm3) doCnd_dest_nm3_NE(info);
		else if (ne == Cnd_sls_upri_rank_cd) doCnd_sls_upri_rank_cd_NE(info);
		else if (ne == Cnd_sls_upri_rank_nm) doCnd_sls_upri_rank_nm_NE(info);
		else if (ne == Cnd_memo1) doCnd_memo1_NE(info);
		else if (ne == Cnd_memo2) doCnd_memo2_NE(info);
		else if (ne == Cnd_memo3) doCnd_memo3_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NE(info);
		else if (ne == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NE(info);
		else if (ne == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NE(info);
		else if (ne == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NE(info);
		else if (ne == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NE(info);
		else if (ne == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NE(info);
		else if (ne == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NE(info);
		else if (ne == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NE(info);
		else if (ne == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NE(info);
		else if (ne == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NE(info);
		else if (ne == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NE(info);
		else if (ne == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NE(info);
		else if (ne == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NE(info);
		else if (ne == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NE(info);
		else if (ne == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NE(info);
		else if (ne == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NE(info);
		else if (ne == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NE(info);
		else if (ne == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NE(info);
		else if (ne == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NE(info);
		else if (ne == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NE(info);
		else if (ne == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NE(info);
		else if (ne == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NE(info);
		else if (ne == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NE(info);
		else if (ne == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NE(info);
		else if (ne == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NE(info);
		else if (ne == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NE(info);
		else if (ne == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NE(info);
		else if (ne == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NE(info);
		else if (ne == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NE(info);
		else if (ne == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NE(info);
		else if (ne == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NE(info);
		else if (ne == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NE(info);
		else if (ne == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NE(info);
		else if (ne == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NE(info);
		else if (ne == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NE(info);
		else if (ne == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NE(info);
		else if (ne == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NE(info);
		else if (ne == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NE(info);
		else if (ne == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NE(info);
		else if (ne == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NE(info);
		else if (ne == BulkSet_st_dt) doBulkSet_st_dt_NE(info);
		else if (ne == BulkSet_end_dt) doBulkSet_end_dt_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_cst_cd) doDtl_cst_cd_NE(info);
		else if (ne == columnDtl_cst_nm) doDtl_cst_nm_NE(info);
		else if (ne == columnDtl_dlv_cd) doDtl_dlv_cd_NE(info);
		else if (ne == columnDtl_dlv_nm) doDtl_dlv_nm_NE(info);
		else if (ne == columnDtl_dest_cd1) doDtl_dest_cd1_NE(info);
		else if (ne == columnDtl_dest_nm1) doDtl_dest_nm1_NE(info);
		else if (ne == columnDtl_dest_cd2) doDtl_dest_cd2_NE(info);
		else if (ne == columnDtl_dest_nm2) doDtl_dest_nm2_NE(info);
		else if (ne == columnDtl_dest_cd3) doDtl_dest_cd3_NE(info);
		else if (ne == columnDtl_dest_nm3) doDtl_dest_nm3_NE(info);
		else if (ne == columnDtl_sls_upri_rank_cd) doDtl_sls_upri_rank_cd_NE(info);
		else if (ne == columnDtl_sls_upri_rank_nm) doDtl_sls_upri_rank_nm_NE(info);
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
	 * [CndTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_nm_NE(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_nm_NE(MCEventInfo info){
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
		if (nx == CndTabTab) doCndTab_NX(info);
		else if (nx == DtlTable) doDtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_cst_cd) doCnd_cst_cd_NX(info);
		else if (nx == Cnd_cst_nm) doCnd_cst_nm_NX(info);
		else if (nx == Cnd_dlv_cd) doCnd_dlv_cd_NX(info);
		else if (nx == Cnd_dlv_nm) doCnd_dlv_nm_NX(info);
		else if (nx == Cnd_dest_cd1) doCnd_dest_cd1_NX(info);
		else if (nx == Cnd_dest_nm1) doCnd_dest_nm1_NX(info);
		else if (nx == Cnd_dest_cd2) doCnd_dest_cd2_NX(info);
		else if (nx == Cnd_dest_nm2) doCnd_dest_nm2_NX(info);
		else if (nx == Cnd_dest_cd3) doCnd_dest_cd3_NX(info);
		else if (nx == Cnd_dest_nm3) doCnd_dest_nm3_NX(info);
		else if (nx == Cnd_sls_upri_rank_cd) doCnd_sls_upri_rank_cd_NX(info);
		else if (nx == Cnd_sls_upri_rank_nm) doCnd_sls_upri_rank_nm_NX(info);
		else if (nx == Cnd_memo1) doCnd_memo1_NX(info);
		else if (nx == Cnd_memo2) doCnd_memo2_NX(info);
		else if (nx == Cnd_memo3) doCnd_memo3_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_NX(info);
		else if (nx == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_NX(info);
		else if (nx == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_NX(info);
		else if (nx == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_NX(info);
		else if (nx == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_NX(info);
		else if (nx == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_NX(info);
		else if (nx == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_NX(info);
		else if (nx == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_NX(info);
		else if (nx == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_NX(info);
		else if (nx == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_NX(info);
		else if (nx == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_NX(info);
		else if (nx == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_NX(info);
		else if (nx == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_NX(info);
		else if (nx == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_NX(info);
		else if (nx == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_NX(info);
		else if (nx == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_NX(info);
		else if (nx == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_NX(info);
		else if (nx == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_NX(info);
		else if (nx == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_NX(info);
		else if (nx == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_NX(info);
		else if (nx == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_NX(info);
		else if (nx == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_NX(info);
		else if (nx == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_NX(info);
		else if (nx == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_NX(info);
		else if (nx == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_NX(info);
		else if (nx == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_NX(info);
		else if (nx == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_NX(info);
		else if (nx == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_NX(info);
		else if (nx == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_NX(info);
		else if (nx == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_NX(info);
		else if (nx == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_NX(info);
		else if (nx == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_NX(info);
		else if (nx == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_NX(info);
		else if (nx == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_NX(info);
		else if (nx == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_NX(info);
		else if (nx == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_NX(info);
		else if (nx == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_NX(info);
		else if (nx == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_NX(info);
		else if (nx == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_NX(info);
		else if (nx == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_NX(info);
		else if (nx == BulkSet_st_dt) doBulkSet_st_dt_NX(info);
		else if (nx == BulkSet_end_dt) doBulkSet_end_dt_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_cst_cd) doDtl_cst_cd_NX(info);
		else if (nx == columnDtl_cst_nm) doDtl_cst_nm_NX(info);
		else if (nx == columnDtl_dlv_cd) doDtl_dlv_cd_NX(info);
		else if (nx == columnDtl_dlv_nm) doDtl_dlv_nm_NX(info);
		else if (nx == columnDtl_dest_cd1) doDtl_dest_cd1_NX(info);
		else if (nx == columnDtl_dest_nm1) doDtl_dest_nm1_NX(info);
		else if (nx == columnDtl_dest_cd2) doDtl_dest_cd2_NX(info);
		else if (nx == columnDtl_dest_nm2) doDtl_dest_nm2_NX(info);
		else if (nx == columnDtl_dest_cd3) doDtl_dest_cd3_NX(info);
		else if (nx == columnDtl_dest_nm3) doDtl_dest_nm3_NX(info);
		else if (nx == columnDtl_sls_upri_rank_cd) doDtl_sls_upri_rank_cd_NX(info);
		else if (nx == columnDtl_sls_upri_rank_nm) doDtl_sls_upri_rank_nm_NX(info);
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
	 * [CndTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCndTab_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_nm_NX(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_nm_NX(MCEventInfo info){
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
		if (lc == Cnd_cst_cd) doCnd_cst_cd_LC(info);
		else if (lc == Cnd_cst_nm) doCnd_cst_nm_LC(info);
		else if (lc == Cnd_dlv_cd) doCnd_dlv_cd_LC(info);
		else if (lc == Cnd_dlv_nm) doCnd_dlv_nm_LC(info);
		else if (lc == Cnd_dest_cd1) doCnd_dest_cd1_LC(info);
		else if (lc == Cnd_dest_nm1) doCnd_dest_nm1_LC(info);
		else if (lc == Cnd_dest_cd2) doCnd_dest_cd2_LC(info);
		else if (lc == Cnd_dest_nm2) doCnd_dest_nm2_LC(info);
		else if (lc == Cnd_dest_cd3) doCnd_dest_cd3_LC(info);
		else if (lc == Cnd_dest_nm3) doCnd_dest_nm3_LC(info);
		else if (lc == Cnd_sls_upri_rank_cd) doCnd_sls_upri_rank_cd_LC(info);
		else if (lc == Cnd_sls_upri_rank_nm) doCnd_sls_upri_rank_nm_LC(info);
		else if (lc == Cnd_memo1) doCnd_memo1_LC(info);
		else if (lc == Cnd_memo2) doCnd_memo2_LC(info);
		else if (lc == Cnd_memo3) doCnd_memo3_LC(info);
		else if (lc == Cnd_cst_grp_cd1) doCnd_cst_grp_cd1_LC(info);
		else if (lc == Cnd_cst_grp_nm1) doCnd_cst_grp_nm1_LC(info);
		else if (lc == Cnd_cst_grp_cd2) doCnd_cst_grp_cd2_LC(info);
		else if (lc == Cnd_cst_grp_nm2) doCnd_cst_grp_nm2_LC(info);
		else if (lc == Cnd_cst_grp_cd3) doCnd_cst_grp_cd3_LC(info);
		else if (lc == Cnd_cst_grp_nm3) doCnd_cst_grp_nm3_LC(info);
		else if (lc == Cnd_cst_grp_cd4) doCnd_cst_grp_cd4_LC(info);
		else if (lc == Cnd_cst_grp_nm4) doCnd_cst_grp_nm4_LC(info);
		else if (lc == Cnd_cst_grp_cd5) doCnd_cst_grp_cd5_LC(info);
		else if (lc == Cnd_cst_grp_nm5) doCnd_cst_grp_nm5_LC(info);
		else if (lc == Cnd_cst_grp_cd6) doCnd_cst_grp_cd6_LC(info);
		else if (lc == Cnd_cst_grp_nm6) doCnd_cst_grp_nm6_LC(info);
		else if (lc == Cnd_cst_grp_cd7) doCnd_cst_grp_cd7_LC(info);
		else if (lc == Cnd_cst_grp_nm7) doCnd_cst_grp_nm7_LC(info);
		else if (lc == Cnd_cst_grp_cd8) doCnd_cst_grp_cd8_LC(info);
		else if (lc == Cnd_cst_grp_nm8) doCnd_cst_grp_nm8_LC(info);
		else if (lc == Cnd_cst_grp_cd9) doCnd_cst_grp_cd9_LC(info);
		else if (lc == Cnd_cst_grp_nm9) doCnd_cst_grp_nm9_LC(info);
		else if (lc == Cnd_cst_grp_cd10) doCnd_cst_grp_cd10_LC(info);
		else if (lc == Cnd_cst_grp_nm10) doCnd_cst_grp_nm10_LC(info);
		else if (lc == Cnd_dlv_grp_cd1) doCnd_dlv_grp_cd1_LC(info);
		else if (lc == Cnd_dlv_grp_nm1) doCnd_dlv_grp_nm1_LC(info);
		else if (lc == Cnd_dlv_grp_cd2) doCnd_dlv_grp_cd2_LC(info);
		else if (lc == Cnd_dlv_grp_nm2) doCnd_dlv_grp_nm2_LC(info);
		else if (lc == Cnd_dlv_grp_cd3) doCnd_dlv_grp_cd3_LC(info);
		else if (lc == Cnd_dlv_grp_nm3) doCnd_dlv_grp_nm3_LC(info);
		else if (lc == Cnd_dlv_grp_cd4) doCnd_dlv_grp_cd4_LC(info);
		else if (lc == Cnd_dlv_grp_nm4) doCnd_dlv_grp_nm4_LC(info);
		else if (lc == Cnd_dlv_grp_cd5) doCnd_dlv_grp_cd5_LC(info);
		else if (lc == Cnd_dlv_grp_nm5) doCnd_dlv_grp_nm5_LC(info);
		else if (lc == Cnd_dlv_grp_cd6) doCnd_dlv_grp_cd6_LC(info);
		else if (lc == Cnd_dlv_grp_nm6) doCnd_dlv_grp_nm6_LC(info);
		else if (lc == Cnd_dlv_grp_cd7) doCnd_dlv_grp_cd7_LC(info);
		else if (lc == Cnd_dlv_grp_nm7) doCnd_dlv_grp_nm7_LC(info);
		else if (lc == Cnd_dlv_grp_cd8) doCnd_dlv_grp_cd8_LC(info);
		else if (lc == Cnd_dlv_grp_nm8) doCnd_dlv_grp_nm8_LC(info);
		else if (lc == Cnd_dlv_grp_cd9) doCnd_dlv_grp_cd9_LC(info);
		else if (lc == Cnd_dlv_grp_nm9) doCnd_dlv_grp_nm9_LC(info);
		else if (lc == Cnd_dlv_grp_cd10) doCnd_dlv_grp_cd10_LC(info);
		else if (lc == Cnd_dlv_grp_nm10) doCnd_dlv_grp_nm10_LC(info);
		else if (lc == BulkSet_st_dt) doBulkSet_st_dt_LC(info);
		else if (lc == BulkSet_end_dt) doBulkSet_end_dt_LC(info);
		else if (lc == columnDtl_cst_cd) doDtl_cst_cd_LC(info);
		else if (lc == columnDtl_cst_nm) doDtl_cst_nm_LC(info);
		else if (lc == columnDtl_dlv_cd) doDtl_dlv_cd_LC(info);
		else if (lc == columnDtl_dlv_nm) doDtl_dlv_nm_LC(info);
		else if (lc == columnDtl_dest_cd1) doDtl_dest_cd1_LC(info);
		else if (lc == columnDtl_dest_nm1) doDtl_dest_nm1_LC(info);
		else if (lc == columnDtl_dest_cd2) doDtl_dest_cd2_LC(info);
		else if (lc == columnDtl_dest_nm2) doDtl_dest_nm2_LC(info);
		else if (lc == columnDtl_dest_cd3) doDtl_dest_cd3_LC(info);
		else if (lc == columnDtl_dest_nm3) doDtl_dest_nm3_LC(info);
		else if (lc == columnDtl_sls_upri_rank_cd) doDtl_sls_upri_rank_cd_LC(info);
		else if (lc == columnDtl_sls_upri_rank_nm) doDtl_sls_upri_rank_nm_LC(info);
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
	 * [Cnd]パネルの[cst_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[sls_upri_rank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_sls_upri_rank_nm_LC(MCEventInfo info){
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
	 * [Cnd]パネルの[cst_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[cst_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_cst_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[dlv_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_dlv_grp_nm10_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[dlv_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dlv_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dlv_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[dest_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_dest_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sls_upri_rank_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sls_upri_rank_nm_LC(MCEventInfo info){
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
	 * コンボ／リストのリスト[Cnd_cst_cd]の作成メソッド
	 */
	public MCList getCnd_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_cd]の作成メソッド
	 */
	public MCList getCnd_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd1]の作成メソッド
	 */
	public MCList getCnd_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd2]の作成メソッド
	 */
	public MCList getCnd_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dest_cd3]の作成メソッド
	 */
	public MCList getCnd_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_sls_upri_rank_cd]の作成メソッド
	 */
	public MCList getCnd_sls_upri_rank_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriRank(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_cst_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_cst_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd1]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd2]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd3]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd4]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd5]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd6]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd7]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd8]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd9]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[Cnd_dlv_grp_cd10]の作成メソッド
	 */
	public MCList getCnd_dlv_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBpGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cst_cd]の作成メソッド
	 */
	public MCList getDtl_cst_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dlv_cd]の作成メソッド
	 */
	public MCList getDtl_dlv_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd1]の作成メソッド
	 */
	public MCList getDtl_dest_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd2]の作成メソッド
	 */
	public MCList getDtl_dest_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_dest_cd3]の作成メソッド
	 */
	public MCList getDtl_dest_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_sls_upri_rank_cd]の作成メソッド
	 */
	public MCList getDtl_sls_upri_rank_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getSlsUpriRank(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL0230.Srch01")) {
			return new MA_MABSL0230_Srch01Bridge();
		}
		if (id.equals("MA.MABSL0230.Sprt01")) {
			return new MA_MABSL0230_Sprt01Bridge();
		}
		if (id.equals("MA.MABSL0230.Upd01")) {
			return new MA_MABSL0230_Upd01Bridge();
		}
		if (id.equals("MA.MABSL0230.Del01")) {
			return new MA_MABSL0230_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL0230_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0230_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0230_Srch01;

		/** コンストラクタ */
		protected MA_MABSL0230_Srch01Bridge() {
			p_MA_MABSL0230_Srch01 = new MCParam(PDef.MA_MABSL0230_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0230_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP0230.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));

			p_MA_MABSL0230_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0230_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0230_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0230_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0230_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP0230.CndR up0() {
			return (mcframe.clientMABS.MABSP0230.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0230.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0230.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0230_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0230_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0230.DtlR>)p_MA_MABSL0230_Srch01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0230_Sprt01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0230_Sprt01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0230_Sprt01;

		/** コンストラクタ */
		protected MA_MABSL0230_Sprt01Bridge() {
			p_MA_MABSL0230_Sprt01 = new MCParam(PDef.MA_MABSL0230_Sprt01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0230_Sprt01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));

			p_MA_MABSL0230_Sprt01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0230_Sprt01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0230_Sprt01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0230_Sprt01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0230_Sprt01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0230.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0230.DtlR>)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP0230.DtlR> down0() {
			return (MCList<mcframe.clientMABS.MABSP0230.DtlR>)down(0);
		}

		protected void setupDownParam() {
			p_MA_MABSL0230_Sprt01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL0230_Sprt01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABS.MABSP0230.DtlR>)p_MA_MABSL0230_Sprt01.getContainerParam().getDownBlock(0));
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
	 * [MA_MABSL0230_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0230_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0230_Upd01;

		/** コンストラクタ */
		protected MA_MABSL0230_Upd01Bridge() {
			p_MA_MABSL0230_Upd01 = new MCParam(PDef.MA_MABSL0230_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0230_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));
			// Down

			p_MA_MABSL0230_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0230_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0230_Upd01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0230_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0230_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0230.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0230.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0230_Upd01;
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
	 * [MA_MABSL0230_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABSL0230_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL0230_Del01;

		/** コンストラクタ */
		protected MA_MABSL0230_Del01Bridge() {
			p_MA_MABSL0230_Del01 = new MCParam(PDef.MA_MABSL0230_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL0230_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP0230.DtlR.class));
			// Down

			p_MA_MABSL0230_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL0230_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL0230_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL0230_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL0230_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP0230.DtlR> up0() {
			return (MCList<mcframe.clientMABS.MABSP0230.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL0230_Del01;
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