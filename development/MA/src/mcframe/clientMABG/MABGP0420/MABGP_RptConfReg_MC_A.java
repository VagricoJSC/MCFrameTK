package mcframe.clientMABG.MABGP0420;

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
import mcframe.clientMABG.MABGP0420.MABGP_RptConfReg_MC.MA_MABGL0420_Srch01Caller;
import mcframe.clientMABG.MABGP0420.MABGP_RptConfReg_MC.MA_MABGL0420_Upd01Caller;
import mcframe.clientMABG.MABGP0420.MABGP_RptConfReg_MC.MA_MABGL0420_Del01Caller;

/**
 * 画面"MABGP_RptConfReg"パネルクラスです。<p>
 *
 * 原価レポート構成マスタの検索、更新、削除を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABGP_RptConfReg_MC_A extends mcframe.clientMAUD.MAUDP1020.MAUDP_LCLRLBase{
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
	public static final String SCREEN_ID = "MABGP0420";

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
	// [Mst]ブロック関連のField定義
	public MCPanel MstPanel = null;
	// [Mst]ブロックの項目のField定義
	public MCLabel Mst_mst_set_typ_nm_Label = null;
	/**
	 * Management 管理.<p>
	 *
	 */
	public MCTextField Mst_mst_set_typ_nm = null;
	// [Cnd]ブロック関連のField定義
	public MCPanel CndPanel = null;
	public MCTitledBorder CndTitledBorder = null;
	// [Cnd]ブロックの項目のField定義
	/**
	 * UPD,Create,0;MOD,Modify,4;DEL,Delete (Administrator),1;REF,View,3; UPD,登録する,0;MOD,訂正する,4;DEL,削除する（管理者）,1;REF,参照する,3;.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_MOD = null;
	public MCRadioButton Cnd_ope_DEL = null;
	public MCRadioButton Cnd_ope_REF = null;
	public MCLabel Cnd_rpt_ptn_cd_Label = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Cnd_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCTextField Cnd_rpt_ptn_nm = null;
	/**
	 * Search 検索する.<p>
	 *
	 */
	public MCButton Cnd_srch = null;
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public MCLabel Hdr_rpt_ptn_cd_Label = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCTextComboBox Hdr_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCTextField Hdr_rpt_ptn_nm = null;
	// [Wrk]ブロック関連のField定義
	public MCPanel WrkPanel = null;
	// [Wrk]ブロックの項目のField定義
	// [Dtl]ブロック関連のField定義
	public MCPanel DtlPanel = null;
	public MCScrollPane DtlScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0420.DtlR> DtlTable = null;
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
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_ptn_cd = null;
	/**
	 * Report pattern name レポートパタン名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_ptn_nm = null;
	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_row_cd = null;
	/**
	 * Prefix 接頭語.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_pre_word = null;
	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_row_nm_lcl = null;
	/**
	 * Standard Report row name 標準レポート行名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_row_nm = null;
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_seq = null;
	/**
	 * Aggregation row 集計行.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sml_flg = null;
	/**
	 * Hide 非表示.<p>
	 *
	 */
	public MCColumnConfig columnDtl_hdn_flg = null;
	/**
	 * Report type レポート対象区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_tgt_typ = null;
	/**
	 * Report type name レポート対象区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_rpt_tgt_typ_nm = null;
	/**
	 * Cost GR/GI type 原価入出庫区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_io_typ = null;
	/**
	 * Cost GR/GI type name 原価入出庫区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_cost_io_typ_nm = null;
	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ = null;
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_asst_typ_nm = null;
	/**
	 * Standard 標準.<p>
	 *
	 */
	public MCColumnConfig columnDtl_std_flg = null;
	/**
	 * Quantity unit type 数量単位区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qty_unit_typ = null;
	/**
	 * Quantity unit type name 数量単位区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_qty_unit_typ_nm = null;
	/**
	 * Allocation account group cd. 1 配賦科目グループＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_cd1 = null;
	/**
	 * Allocation account group name 1 配賦科目グループ名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_nm1 = null;
	/**
	 * Allocation account group cd. 2 配賦科目グループＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_cd2 = null;
	/**
	 * Allocation account group name 2 配賦科目グループ名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_nm2 = null;
	/**
	 * Allocation account group cd. 3 配賦科目グループＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_cd3 = null;
	/**
	 * Allocation account group name 3 配賦科目グループ名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_alc_ac_grp_nm3 = null;
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
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd1 = null;
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm1 = null;
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd2 = null;
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm2 = null;
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd3 = null;
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm3 = null;
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd4 = null;
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm4 = null;
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd5 = null;
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm5 = null;
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd6 = null;
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm6 = null;
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd7 = null;
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm7 = null;
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd8 = null;
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm8 = null;
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd9 = null;
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm9 = null;
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_cd10 = null;
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public MCColumnConfig columnDtl_itm_grp_nm10 = null;
	/**
	 * Cost element type 費目区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_typ = null;
	/**
	 * Cost element type name 費目区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_typ_nm = null;
	/**
	 * Direct/Indirect type 直間区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_direct_typ = null;
	/**
	 * Direct/Indirect type name 直間区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_direct_typ_nm = null;
	/**
	 * Constant/variable type 固変区分.<p>
	 *
	 */
	public MCColumnConfig columnDtl_var_typ = null;
	/**
	 * Fixed/variable type name 固変区分名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_var_typ_nm = null;
	/**
	 * Cost element group cd. 費目グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_grp_cd = null;
	/**
	 * Cost element group name 費目グループ名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_grp_nm = null;
	/**
	 * Cost element cd. 費目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_cd = null;
	/**
	 * Cost element name 費目名.<p>
	 *
	 */
	public MCColumnConfig columnDtl_expns_nm = null;
	public mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D Dtl_fg_p_PPanel;
	public MCColumnConfig columnDtl_fg_r;// [Dtl]の[fg_p.red]を[columnDtl_fg_r]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_g;// [Dtl]の[fg_p.green]を[columnDtl_fg_g]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_b;// [Dtl]の[fg_p.blue]を[columnDtl_fg_b]としてエイリアス定義。
	public MCColumnConfig columnDtl_fg_color;// [Dtl]の[fg_p.color]を[columnDtl_fg_color]としてエイリアス定義。
	public mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D Dtl_bg_p_PPanel;
	public MCColumnConfig columnDtl_bg_r;// [Dtl]の[bg_p.red]を[columnDtl_bg_r]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_g;// [Dtl]の[bg_p.green]を[columnDtl_bg_g]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_b;// [Dtl]の[bg_p.blue]を[columnDtl_bg_b]としてエイリアス定義。
	public MCColumnConfig columnDtl_bg_color;// [Dtl]の[bg_p.color]を[columnDtl_bg_color]としてエイリアス定義。
	/**
	 * Sample サンプル.<p>
	 *
	 */
	public MCColumnConfig columnDtl_sample = null;
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
	// [DtlBtn]ブロック関連のField定義
	public MCPanel DtlBtnPanel = null;
	// [DtlBtn]ブロックの項目のField定義
	public mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H DtlBtn_menu_move_p_PPanel;
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton DtlBtn_rcopy = null;
	// [LclWrk]ブロック関連のField定義
	public MCPanel LclWrkPanel = null;
	// [LclWrk]ブロックの項目のField定義
	// [Lcl]ブロック関連のField定義
	public MCPanel LclPanel = null;
	public MCScrollPane LclScrollPane = null;
	public MCTable2<mcframe.clientMABG.MABGP0420.LclR> LclTable = null;
	// [Lcl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnLcl_check = null;
	/**
	 * Report pattern cd. レポートパタンＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_rpt_ptn_cd = null;
	/**
	 * Report row cd. レポート行ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_rpt_row_cd = null;
	/**
	 * Locale cd. ロケールＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_cd = null;
	/**
	 * Locale name ロケール名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_lcl_nm = null;
	/**
	 * Report row name レポート行名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_rpt_row_nm = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnLcl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnLcl_upd_srv_req_no = null;
	// [LclBtn]ブロック関連のField定義
	public MCPanel LclBtnPanel = null;
	// [LclBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton LclBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton LclBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton LclBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton LclBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton LclBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Cost report aggregation row master entry 原価レポート行集計マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABGP0430 = null;
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
	/** [UPD_FIX_H]モードを表す定数 */
	public static final String UPD_FIX_H = "UPD_FIX_H";
	/** [FIX_U]モードを表す定数 */
	public static final String FIX_U = "FIX_U";
	/** [MOD]モードを表す定数 */
	public static final String MOD = "MOD";
	/** [MOD_FIX_H]モードを表す定数 */
	public static final String MOD_FIX_H = "MOD_FIX_H";
	/** [FIX_M]モードを表す定数 */
	public static final String FIX_M = "FIX_M";
	/** [DEL]モードを表す定数 */
	public static final String DEL = "DEL";
	/** [FIX_D]モードを表す定数 */
	public static final String FIX_D = "FIX_D";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{UPD, UPD_FIX_H, FIX_U, MOD, MOD_FIX_H, FIX_M, DEL, FIX_D, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABGL0420_Srch01]のCallerの作成 */
	protected MABGP_RptConfReg_MC.MA_MABGL0420_Srch01Caller createMA_MABGL0420_Srch01() {
		MABGP_RptConfReg_MC.MA_MABGL0420_Srch01Caller<MABGP_RptConfReg, MA_MABGL0420_Srch01Bridge>
		caller = ((MABGP_RptConfReg_MC)this).new MA_MABGL0420_Srch01Caller<MABGP_RptConfReg, MA_MABGL0420_Srch01Bridge>(
					(MABGP_RptConfReg)this, new MA_MABGL0420_Srch01Bridge());
		return caller;
	}
	/** [MA_MABGL0420_Srch01]の呼び出し */
	protected void callMA_MABGL0420_Srch01() {
		MCCaller caller = createMA_MABGL0420_Srch01();
		caller.exec();
	}
	/** [MA_MABGL0420_Upd01]のCallerの作成 */
	protected MABGP_RptConfReg_MC.MA_MABGL0420_Upd01Caller createMA_MABGL0420_Upd01() {
		MABGP_RptConfReg_MC.MA_MABGL0420_Upd01Caller<MABGP_RptConfReg, MA_MABGL0420_Upd01Bridge>
		caller = ((MABGP_RptConfReg_MC)this).new MA_MABGL0420_Upd01Caller<MABGP_RptConfReg, MA_MABGL0420_Upd01Bridge>(
					(MABGP_RptConfReg)this, new MA_MABGL0420_Upd01Bridge());
		return caller;
	}
	/** [MA_MABGL0420_Upd01]の呼び出し */
	protected void callMA_MABGL0420_Upd01() {
		MCCaller caller = createMA_MABGL0420_Upd01();
		caller.exec();
	}
	/** [MA_MABGL0420_Del01]のCallerの作成 */
	protected MABGP_RptConfReg_MC.MA_MABGL0420_Del01Caller createMA_MABGL0420_Del01() {
		MABGP_RptConfReg_MC.MA_MABGL0420_Del01Caller<MABGP_RptConfReg, MA_MABGL0420_Del01Bridge>
		caller = ((MABGP_RptConfReg_MC)this).new MA_MABGL0420_Del01Caller<MABGP_RptConfReg, MA_MABGL0420_Del01Bridge>(
					(MABGP_RptConfReg)this, new MA_MABGL0420_Del01Bridge());
		return caller;
	}
	/** [MA_MABGL0420_Del01]の呼び出し */
	protected void callMA_MABGL0420_Del01() {
		MCCaller caller = createMA_MABGL0420_Del01();
		caller.exec();
	}
	/** [Mst]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0420.MstR aMstR;
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0420.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABG.MABGP0420.HdrR aHdrR;
	/** [Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0420.DtlR> aDtlL;
	/** [Lcl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0420.LclR> aLclL;
	/** [LclAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABG.MABGP0420.LclR> aLclAllL;

	/**
	 * 項目コピーによってaMstRを設定します。
	 *
	 * aMstRのインスタンスは変更されません。
	 *
	 * @param row MstR
	 */
	public void setMstR(mcframe.clientMABG.MABGP0420.MstR row) {
		if (row != null) {
			MCRow.copyall(getMstR(), row);
		}
	}

	/**
	 * [Mst]ブロックのコンテナaMstRを返します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0420.MstR getMstR() {
		return aMstR;
	}

	/**
	 * aMstRを作成します。
	 *
	 * @return MstR
	 */
	public mcframe.clientMABG.MABGP0420.MstR createMstR() {
		return mcframe.clientMABG.MABGP0420.MstR.create();
	}

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABG.MABGP0420.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0420.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABG.MABGP0420.CndR createCndR() {
		return mcframe.clientMABG.MABGP0420.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABG.MABGP0420.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0420.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABG.MABGP0420.HdrR createHdrR() {
		return mcframe.clientMABG.MABGP0420.HdrR.create();
	}

	/**
	 * コピーによってaDtlLを設定します。
	 *
	 * aDtlLのインスタンスは変更されません。
	 *
	 * @param dataset DtlL
	 */
	public void setDtlL(MCList<mcframe.clientMABG.MABGP0420.DtlR> aList) {
		if (getDtlL() != aList) {
			getDtlL().setAll(aList);
		}
	}

	/**
	 * [Dtl]ブロックのコンテナaDtlLを返します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.DtlR> getDtlL() {
		return aDtlL;
	}

	/**
	 * aDtlRを作成します。
	 *
	 * @return DtlR
	 */
	public mcframe.clientMABG.MABGP0420.DtlR createDtlR() {
		return mcframe.clientMABG.MABGP0420.DtlR.create();
	}

	/**
	 * aDtlLを作成します。
	 *
	 * @return DtlL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.DtlR> createDtlL() {
		return MCList.create(mcframe.clientMABG.MABGP0420.DtlR.class);
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
	 * コピーによってaLclLを設定します。
	 *
	 * aLclLのインスタンスは変更されません。
	 *
	 * @param dataset LclL
	 */
	public void setLclL(MCList<mcframe.clientMABG.MABGP0420.LclR> aList) {
		if (getLclL() != aList) {
			getLclL().setAll(aList);
		}
	}

	/**
	 * [Lcl]ブロックのコンテナaLclLを返します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.LclR> getLclL() {
		return aLclL;
	}

	/**
	 * aLclRを作成します。
	 *
	 * @return LclR
	 */
	public mcframe.clientMABG.MABGP0420.LclR createLclR() {
		return mcframe.clientMABG.MABGP0420.LclR.create();
	}

	/**
	 * aLclLを作成します。
	 *
	 * @return LclL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.LclR> createLclL() {
		return MCList.create(mcframe.clientMABG.MABGP0420.LclR.class);
	}

	/**
	 * LclTableを初期化します。
	 */
	protected void createLclTable(){
		if(LclTable == null){
			LclTable = beansFactory.createTable2("Lcl.table");
		}
	}

	/**
	 * コピーによってaLclAllLを設定します。
	 *
	 * aLclAllLのインスタンスは変更されません。
	 *
	 * @param dataset LclAllL
	 */
	public void setLclAllL(MCList<mcframe.clientMABG.MABGP0420.LclR> aList) {
		if (getLclAllL() != aList) {
			getLclAllL().setAll(aList);
		}
	}

	/**
	 * [LclAll]ブロックのコンテナaLclAllLを返します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.LclR> getLclAllL() {
		return aLclAllL;
	}

	/**
	 * aLclAllRを作成します。
	 *
	 * @return LclAllR
	 */
	public mcframe.clientMABG.MABGP0420.LclR createLclAllR() {
		return mcframe.clientMABG.MABGP0420.LclR.create();
	}

	/**
	 * aLclAllLを作成します。
	 *
	 * @return LclAllL
	 */
	public MCList<mcframe.clientMABG.MABGP0420.LclR> createLclAllL() {
		return MCList.create(mcframe.clientMABG.MABGP0420.LclR.class);
	}

	/**
	 * 保持するコンテナのListを返します。
	 *
	 * @return コンテナのList
	 */
	public List<MCContainer> getContainers(){
		List<MCContainer> ret = super.getContainers();
		if(!MCCollectionUtil.contains(ret, getMstR())) ret.add(getMstR());
		if(!MCCollectionUtil.contains(ret, getCndR())) ret.add(getCndR());
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getDtlL())) ret.add(getDtlL());
		if(!MCCollectionUtil.contains(ret, getLclL())) ret.add(getLclL());
		if(!MCCollectionUtil.contains(ret, getLclAllL())) ret.add(getLclAllL());
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
		if(aCnt == getMstR()) return "Mst";
		if(aCnt == getCndR()) return "Cnd";
		if(aCnt == getHdrR()) return "Hdr";
		if(aCnt == getDtlL()) return "Dtl";
		if(aCnt == getLclL()) return "Lcl";
		if(aCnt == getLclAllL()) return "LclAll";
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
		if(bId.equals("Mst")) return getMstR();
		if(bId.equals("Cnd")) return getCndR();
		if(bId.equals("Hdr")) return getHdrR();
		if(bId.equals("Dtl")) return getDtlL();
		if(bId.equals("Lcl")) return getLclL();
		if(bId.equals("LclAll")) return getLclAllL();
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
		ret.add(MstPanel);
		ret.add(CndPanel);
		ret.add(HdrPanel);
		ret.add(WrkPanel);
		ret.add(DtlPanel);
		ret.add(DtlBtnPanel);
		ret.add(LclWrkPanel);
		ret.add(LclPanel);
		ret.add(LclBtnPanel);
		ret.add(BtnPanel);
		ret.add(EastBtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABGP_RptConfReg_MC_A() {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		aLclL = createLclL();
		aLclAllL = createLclAllL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABGP_RptConfReg_MC_A(String name) {
		aMstR = createMstR();
		aCndR = createCndR();
		aHdrR = createHdrR();
		aDtlL = createDtlL();
		createDtlTable();
		DtlTable.setRowName(name);
		aLclL = createLclL();
		createLclTable();
		LclTable.setRowName(name);
		aLclAllL = createLclAllL();
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABGP_RptConfReg_MC.jbCreateScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateMst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateCnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateHdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateDtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateDtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateLclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateLcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateLclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbCreateEastBtn((MABGP_RptConfReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABGP_RptConfReg p) {
	}

	/**
	 * [Mst]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateMst(MABGP_RptConfReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABGP_RptConfReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABGP_RptConfReg p) {
	}

	/**
	 * [Wrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk(MABGP_RptConfReg p) {
	}

	/**
	 * [Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtl(MABGP_RptConfReg p) {
		p.Dtl_fg_p_PPanel = mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.create(mcframe.clientMABG.MABGP0420.DtlR.$fg_p);
		p.Dtl_fg_p_PPanel.setName("Dtl.fg_p");
		p.columnDtl_fg_r = p.Dtl_fg_p_PPanel.columnColor_red;
		p.columnDtl_fg_r.addAliasName("Dtl.fg_r", p);
		p.columnDtl_fg_g = p.Dtl_fg_p_PPanel.columnColor_green;
		p.columnDtl_fg_g.addAliasName("Dtl.fg_g", p);
		p.columnDtl_fg_b = p.Dtl_fg_p_PPanel.columnColor_blue;
		p.columnDtl_fg_b.addAliasName("Dtl.fg_b", p);
		p.columnDtl_fg_color = p.Dtl_fg_p_PPanel.columnColor_color;
		p.columnDtl_fg_color.addAliasName("Dtl.fg_color", p);
		p.Dtl_bg_p_PPanel = mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.create(mcframe.clientMABG.MABGP0420.DtlR.$bg_p);
		p.Dtl_bg_p_PPanel.setName("Dtl.bg_p");
		p.columnDtl_bg_r = p.Dtl_bg_p_PPanel.columnColor_red;
		p.columnDtl_bg_r.addAliasName("Dtl.bg_r", p);
		p.columnDtl_bg_g = p.Dtl_bg_p_PPanel.columnColor_green;
		p.columnDtl_bg_g.addAliasName("Dtl.bg_g", p);
		p.columnDtl_bg_b = p.Dtl_bg_p_PPanel.columnColor_blue;
		p.columnDtl_bg_b.addAliasName("Dtl.bg_b", p);
		p.columnDtl_bg_color = p.Dtl_bg_p_PPanel.columnColor_color;
		p.columnDtl_bg_color.addAliasName("Dtl.bg_color", p);
	}

	/**
	 * [DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlBtn(MABGP_RptConfReg p) {
		p.DtlBtn_menu_move_p_PPanel = mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.create();
		p.DtlBtn_menu_move_p_PPanel.setName("DtlBtn.menu_move_p");
	}

	/**
	 * [LclWrk]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclWrk(MABGP_RptConfReg p) {
	}

	/**
	 * [Lcl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLcl(MABGP_RptConfReg p) {
	}

	/**
	 * [LclBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateLclBtn(MABGP_RptConfReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABGP_RptConfReg p) {
	}

	/**
	 * [EastBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateEastBtn(MABGP_RptConfReg p) {
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

	
	/** [Cnd_rpt_ptn_cd_ListPutter]の定義 */
	private MCListPutter Cnd_rpt_ptn_cd_p = null;

	/**
	 * [Cnd_rpt_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getCnd_rpt_ptn_cd_ListPutter() {
		if (Cnd_rpt_ptn_cd_p == null) {
			Cnd_rpt_ptn_cd_p = createCnd_rpt_ptn_cd_ListPutter(Cnd_rpt_ptn_cd, "rpt_ptn_cd", "rpt_ptn_nm");

		}
		return Cnd_rpt_ptn_cd_p;
	}
	
	
	/** [Hdr_rpt_ptn_cd_ListPutter]の定義 */
	private MCListPutter Hdr_rpt_ptn_cd_p = null;

	/**
	 * [Hdr_rpt_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getHdr_rpt_ptn_cd_ListPutter() {
		if (Hdr_rpt_ptn_cd_p == null) {
			Hdr_rpt_ptn_cd_p = createHdr_rpt_ptn_cd_ListPutter(Hdr_rpt_ptn_cd, "rpt_ptn_cd", "rpt_ptn_nm");

		}
		return Hdr_rpt_ptn_cd_p;
	}
	
	
	/** [Dtl_rpt_ptn_cd_ListPutter]の定義 */
	private MCListPutter Dtl_rpt_ptn_cd_p = null;

	/**
	 * [Dtl_rpt_ptn_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rpt_ptn_cd_ListPutter() {
		if (Dtl_rpt_ptn_cd_p == null) {
			Dtl_rpt_ptn_cd_p = createDtl_rpt_ptn_cd_ListPutter(columnDtl_rpt_ptn_cd, "rpt_ptn_cd", "rpt_ptn_nm");

		}
		return Dtl_rpt_ptn_cd_p;
	}
	
	
	/** [Dtl_rpt_tgt_typ_ListPutter]の定義 */
	private MCListPutter Dtl_rpt_tgt_typ_p = null;

	/**
	 * [Dtl_rpt_tgt_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_rpt_tgt_typ_ListPutter() {
		if (Dtl_rpt_tgt_typ_p == null) {
			Dtl_rpt_tgt_typ_p = createDtl_rpt_tgt_typ_ListPutter(columnDtl_rpt_tgt_typ, "rpt_tgt_typ", "rpt_tgt_typ_nm");

		}
		return Dtl_rpt_tgt_typ_p;
	}
	
	
	/** [Dtl_cost_io_typ_ListPutter]の定義 */
	private MCListPutter Dtl_cost_io_typ_p = null;

	/**
	 * [Dtl_cost_io_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_cost_io_typ_ListPutter() {
		if (Dtl_cost_io_typ_p == null) {
			Dtl_cost_io_typ_p = createDtl_cost_io_typ_ListPutter(columnDtl_cost_io_typ, "cost_io_typ", "cost_io_typ_nm");

		}
		return Dtl_cost_io_typ_p;
	}
	
	
	/** [Dtl_asst_typ_ListPutter]の定義 */
	private MCListPutter Dtl_asst_typ_p = null;

	/**
	 * [Dtl_asst_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_asst_typ_ListPutter() {
		if (Dtl_asst_typ_p == null) {
			Dtl_asst_typ_p = createDtl_asst_typ_ListPutter(columnDtl_asst_typ, "asst_typ", "asst_typ_nm");

		}
		return Dtl_asst_typ_p;
	}
	
	
	/** [Dtl_qty_unit_typ_ListPutter]の定義 */
	private MCListPutter Dtl_qty_unit_typ_p = null;

	/**
	 * [Dtl_qty_unit_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_qty_unit_typ_ListPutter() {
		if (Dtl_qty_unit_typ_p == null) {
			Dtl_qty_unit_typ_p = createDtl_qty_unit_typ_ListPutter(columnDtl_qty_unit_typ, "qty_unit_typ", "qty_unit_typ_nm");

		}
		return Dtl_qty_unit_typ_p;
	}
	
	
	/** [Dtl_alc_ac_grp_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ac_grp_cd1_p = null;

	/**
	 * [Dtl_alc_ac_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ac_grp_cd1_ListPutter() {
		if (Dtl_alc_ac_grp_cd1_p == null) {
			Dtl_alc_ac_grp_cd1_p = createDtl_alc_ac_grp_cd1_ListPutter(columnDtl_alc_ac_grp_cd1, "alc_ac_grp_cd1", "alc_ac_grp_nm1");

		}
		return Dtl_alc_ac_grp_cd1_p;
	}
	
	
	/** [Dtl_alc_ac_grp_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ac_grp_cd2_p = null;

	/**
	 * [Dtl_alc_ac_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ac_grp_cd2_ListPutter() {
		if (Dtl_alc_ac_grp_cd2_p == null) {
			Dtl_alc_ac_grp_cd2_p = createDtl_alc_ac_grp_cd2_ListPutter(columnDtl_alc_ac_grp_cd2, "alc_ac_grp_cd2", "alc_ac_grp_nm2");

		}
		return Dtl_alc_ac_grp_cd2_p;
	}
	
	
	/** [Dtl_alc_ac_grp_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_alc_ac_grp_cd3_p = null;

	/**
	 * [Dtl_alc_ac_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_alc_ac_grp_cd3_ListPutter() {
		if (Dtl_alc_ac_grp_cd3_p == null) {
			Dtl_alc_ac_grp_cd3_p = createDtl_alc_ac_grp_cd3_ListPutter(columnDtl_alc_ac_grp_cd3, "alc_ac_grp_cd3", "alc_ac_grp_nm3");

		}
		return Dtl_alc_ac_grp_cd3_p;
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
	
	
	/** [Dtl_itm_grp_cd1_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd1_p = null;

	/**
	 * [Dtl_itm_grp_cd1_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd1_ListPutter() {
		if (Dtl_itm_grp_cd1_p == null) {
			Dtl_itm_grp_cd1_p = createDtl_itm_grp_cd1_ListPutter(columnDtl_itm_grp_cd1, "itm_grp_cd1", "itm_grp_nm1");

		}
		return Dtl_itm_grp_cd1_p;
	}
	
	
	/** [Dtl_itm_grp_cd2_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd2_p = null;

	/**
	 * [Dtl_itm_grp_cd2_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd2_ListPutter() {
		if (Dtl_itm_grp_cd2_p == null) {
			Dtl_itm_grp_cd2_p = createDtl_itm_grp_cd2_ListPutter(columnDtl_itm_grp_cd2, "itm_grp_cd2", "itm_grp_nm2");

		}
		return Dtl_itm_grp_cd2_p;
	}
	
	
	/** [Dtl_itm_grp_cd3_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd3_p = null;

	/**
	 * [Dtl_itm_grp_cd3_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd3_ListPutter() {
		if (Dtl_itm_grp_cd3_p == null) {
			Dtl_itm_grp_cd3_p = createDtl_itm_grp_cd3_ListPutter(columnDtl_itm_grp_cd3, "itm_grp_cd3", "itm_grp_nm3");

		}
		return Dtl_itm_grp_cd3_p;
	}
	
	
	/** [Dtl_itm_grp_cd4_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd4_p = null;

	/**
	 * [Dtl_itm_grp_cd4_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd4_ListPutter() {
		if (Dtl_itm_grp_cd4_p == null) {
			Dtl_itm_grp_cd4_p = createDtl_itm_grp_cd4_ListPutter(columnDtl_itm_grp_cd4, "itm_grp_cd4", "itm_grp_nm4");

		}
		return Dtl_itm_grp_cd4_p;
	}
	
	
	/** [Dtl_itm_grp_cd5_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd5_p = null;

	/**
	 * [Dtl_itm_grp_cd5_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd5_ListPutter() {
		if (Dtl_itm_grp_cd5_p == null) {
			Dtl_itm_grp_cd5_p = createDtl_itm_grp_cd5_ListPutter(columnDtl_itm_grp_cd5, "itm_grp_cd5", "itm_grp_nm5");

		}
		return Dtl_itm_grp_cd5_p;
	}
	
	
	/** [Dtl_itm_grp_cd6_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd6_p = null;

	/**
	 * [Dtl_itm_grp_cd6_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd6_ListPutter() {
		if (Dtl_itm_grp_cd6_p == null) {
			Dtl_itm_grp_cd6_p = createDtl_itm_grp_cd6_ListPutter(columnDtl_itm_grp_cd6, "itm_grp_cd6", "itm_grp_nm6");

		}
		return Dtl_itm_grp_cd6_p;
	}
	
	
	/** [Dtl_itm_grp_cd7_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd7_p = null;

	/**
	 * [Dtl_itm_grp_cd7_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd7_ListPutter() {
		if (Dtl_itm_grp_cd7_p == null) {
			Dtl_itm_grp_cd7_p = createDtl_itm_grp_cd7_ListPutter(columnDtl_itm_grp_cd7, "itm_grp_cd7", "itm_grp_nm7");

		}
		return Dtl_itm_grp_cd7_p;
	}
	
	
	/** [Dtl_itm_grp_cd8_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd8_p = null;

	/**
	 * [Dtl_itm_grp_cd8_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd8_ListPutter() {
		if (Dtl_itm_grp_cd8_p == null) {
			Dtl_itm_grp_cd8_p = createDtl_itm_grp_cd8_ListPutter(columnDtl_itm_grp_cd8, "itm_grp_cd8", "itm_grp_nm8");

		}
		return Dtl_itm_grp_cd8_p;
	}
	
	
	/** [Dtl_itm_grp_cd9_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd9_p = null;

	/**
	 * [Dtl_itm_grp_cd9_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd9_ListPutter() {
		if (Dtl_itm_grp_cd9_p == null) {
			Dtl_itm_grp_cd9_p = createDtl_itm_grp_cd9_ListPutter(columnDtl_itm_grp_cd9, "itm_grp_cd9", "itm_grp_nm9");

		}
		return Dtl_itm_grp_cd9_p;
	}
	
	
	/** [Dtl_itm_grp_cd10_ListPutter]の定義 */
	private MCListPutter Dtl_itm_grp_cd10_p = null;

	/**
	 * [Dtl_itm_grp_cd10_ListPutter]の取得
	 */
	protected MCListPutter getDtl_itm_grp_cd10_ListPutter() {
		if (Dtl_itm_grp_cd10_p == null) {
			Dtl_itm_grp_cd10_p = createDtl_itm_grp_cd10_ListPutter(columnDtl_itm_grp_cd10, "itm_grp_cd10", "itm_grp_nm10");

		}
		return Dtl_itm_grp_cd10_p;
	}
	
	
	/** [Dtl_expns_typ_ListPutter]の定義 */
	private MCListPutter Dtl_expns_typ_p = null;

	/**
	 * [Dtl_expns_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_expns_typ_ListPutter() {
		if (Dtl_expns_typ_p == null) {
			Dtl_expns_typ_p = createDtl_expns_typ_ListPutter(columnDtl_expns_typ, "expns_typ", "expns_typ_nm");

		}
		return Dtl_expns_typ_p;
	}
	
	
	/** [Dtl_direct_typ_ListPutter]の定義 */
	private MCListPutter Dtl_direct_typ_p = null;

	/**
	 * [Dtl_direct_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_direct_typ_ListPutter() {
		if (Dtl_direct_typ_p == null) {
			Dtl_direct_typ_p = createDtl_direct_typ_ListPutter(columnDtl_direct_typ, "direct_typ", "direct_typ_nm");

		}
		return Dtl_direct_typ_p;
	}
	
	
	/** [Dtl_var_typ_ListPutter]の定義 */
	private MCListPutter Dtl_var_typ_p = null;

	/**
	 * [Dtl_var_typ_ListPutter]の取得
	 */
	protected MCListPutter getDtl_var_typ_ListPutter() {
		if (Dtl_var_typ_p == null) {
			Dtl_var_typ_p = createDtl_var_typ_ListPutter(columnDtl_var_typ, "var_typ", "var_typ_nm");

		}
		return Dtl_var_typ_p;
	}
	
	
	/** [Dtl_expns_grp_cd_ListPutter]の定義 */
	private MCListPutter Dtl_expns_grp_cd_p = null;

	/**
	 * [Dtl_expns_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_expns_grp_cd_ListPutter() {
		if (Dtl_expns_grp_cd_p == null) {
			Dtl_expns_grp_cd_p = createDtl_expns_grp_cd_ListPutter(columnDtl_expns_grp_cd, "expns_grp_cd", "expns_grp_nm");

		}
		return Dtl_expns_grp_cd_p;
	}
	
	
	/** [Dtl_expns_cd_ListPutter]の定義 */
	private MCListPutter Dtl_expns_cd_p = null;

	/**
	 * [Dtl_expns_cd_ListPutter]の取得
	 */
	protected MCListPutter getDtl_expns_cd_ListPutter() {
		if (Dtl_expns_cd_p == null) {
			Dtl_expns_cd_p = createDtl_expns_cd_ListPutter(columnDtl_expns_cd, "expns_cd", "expns_nm");

		}
		return Dtl_expns_cd_p;
	}
	
	
	/** [Lcl_lcl_cd_ListPutter]の定義 */
	private MCListPutter Lcl_lcl_cd_p = null;

	/**
	 * [Lcl_lcl_cd_ListPutter]の取得
	 */
	protected MCListPutter getLcl_lcl_cd_ListPutter() {
		if (Lcl_lcl_cd_p == null) {
			Lcl_lcl_cd_p = createLcl_lcl_cd_ListPutter(columnLcl_lcl_cd, "lcl_cd", "lcl_nm");

		}
		return Lcl_lcl_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_RptConfReg create(){
		MABGP_RptConfReg p = new MABGP_RptConfReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABGP_RptConfReg create(String name){
		MABGP_RptConfReg p = new MABGP_RptConfReg(name);
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
		MABGP_RptConfReg_MC.jbfInitScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitMst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitCnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitHdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitDtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitDtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitLclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitLcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitLclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbfInitEastBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitMst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitCnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitHdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitDtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitDtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitLclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitLcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitLclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.jbInitEastBtn((MABGP_RptConfReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitMst(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.MstPanel = p.beansFactory.createPanel("Mst");
		// ブロックの項目の初期化
		p.Mst_mst_set_typ_nm_Label = p.beansFactory.createLabel("Mst.mst_set_typ_nm_Label");
		p.Mst_mst_set_typ_nm = p.beansFactory.createTextField("Mst.mst_set_typ_nm");
		p.Mst_mst_set_typ_nm.setLabel(p.Mst_mst_set_typ_nm_Label);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_MOD = p.beansFactory.createRadioButton("Cnd.ope_MOD");
		p.Cnd_ope_DEL = p.beansFactory.createRadioButton("Cnd.ope_DEL");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_rpt_ptn_cd_Label = p.beansFactory.createLabel("Cnd.rpt_ptn_cd_Label");
		p.Cnd_rpt_ptn_cd = p.beansFactory.createTextComboBox("Cnd.rpt_ptn_cd");
		p.Cnd_rpt_ptn_cd.setLabel(p.Cnd_rpt_ptn_cd_Label);
		p.Cnd_rpt_ptn_nm = p.beansFactory.createTextField("Cnd.rpt_ptn_nm");
		p.Cnd_srch = p.beansFactory.createButton("Cnd.srch", "srch");
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_rpt_ptn_cd_Label = p.beansFactory.createLabel("Hdr.rpt_ptn_cd_Label");
		p.Hdr_rpt_ptn_cd = p.beansFactory.createTextComboBox("Hdr.rpt_ptn_cd");
		p.Hdr_rpt_ptn_cd.setLabel(p.Hdr_rpt_ptn_cd_Label);
		p.Hdr_rpt_ptn_nm = p.beansFactory.createTextField("Hdr.rpt_ptn_nm");
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.WrkPanel = p.beansFactory.createPanel("Wrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtl(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.DtlPanel = p.beansFactory.createPanel("Dtl");
		p.DtlScrollPane = p.beansFactory.createScrollPane("Dtl.scroll");
		p.createDtlTable();
		// ブロックの項目の初期化
		p.columnDtl_check = p.beansFactory.createTableColumn("Dtl.check", MCColumnType.CHECK);
		p.columnDtl_del_flg = p.beansFactory.createTableColumn("Dtl.del_flg", MCColumnType.CHECK);
		p.columnDtl_rpt_ptn_cd = p.beansFactory.createTableColumn("Dtl.rpt_ptn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_rpt_ptn_nm = p.beansFactory.createTableColumn("Dtl.rpt_ptn_nm", MCColumnType.TEXT);
		p.columnDtl_rpt_row_cd = p.beansFactory.createTableColumn("Dtl.rpt_row_cd", MCColumnType.TEXT);
		p.columnDtl_rpt_pre_word = p.beansFactory.createTableColumn("Dtl.rpt_pre_word", MCColumnType.TEXT);
		p.columnDtl_rpt_row_nm_lcl = p.beansFactory.createTableColumn("Dtl.rpt_row_nm_lcl", MCColumnType.TEXT);
		p.columnDtl_rpt_row_nm = p.beansFactory.createTableColumn("Dtl.rpt_row_nm", MCColumnType.TEXT);
		p.columnDtl_rpt_seq = p.beansFactory.createTableColumn("Dtl.rpt_seq", MCColumnType.NUMBER);
		p.columnDtl_sml_flg = p.beansFactory.createTableColumn("Dtl.sml_flg", MCColumnType.CHECK);
		p.columnDtl_hdn_flg = p.beansFactory.createTableColumn("Dtl.hdn_flg", MCColumnType.CHECK);
		p.columnDtl_rpt_tgt_typ = p.beansFactory.createTableColumn("Dtl.rpt_tgt_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_rpt_tgt_typ_nm = p.beansFactory.createTableColumn("Dtl.rpt_tgt_typ_nm", MCColumnType.TEXT);
		p.columnDtl_cost_io_typ = p.beansFactory.createTableColumn("Dtl.cost_io_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_cost_io_typ_nm = p.beansFactory.createTableColumn("Dtl.cost_io_typ_nm", MCColumnType.TEXT);
		p.columnDtl_asst_typ = p.beansFactory.createTableColumn("Dtl.asst_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_asst_typ_nm = p.beansFactory.createTableColumn("Dtl.asst_typ_nm", MCColumnType.TEXT);
		p.columnDtl_std_flg = p.beansFactory.createTableColumn("Dtl.std_flg", MCColumnType.CHECK);
		p.columnDtl_qty_unit_typ = p.beansFactory.createTableColumn("Dtl.qty_unit_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_qty_unit_typ_nm = p.beansFactory.createTableColumn("Dtl.qty_unit_typ_nm", MCColumnType.TEXT);
		p.columnDtl_alc_ac_grp_cd1 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_grp_nm1 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_nm1", MCColumnType.TEXT);
		p.columnDtl_alc_ac_grp_cd2 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_grp_nm2 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_nm2", MCColumnType.TEXT);
		p.columnDtl_alc_ac_grp_cd3 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_grp_nm3 = p.beansFactory.createTableColumn("Dtl.alc_ac_grp_nm3", MCColumnType.TEXT);
		p.columnDtl_alc_ac_cd = p.beansFactory.createTableColumn("Dtl.alc_ac_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_alc_ac_nm = p.beansFactory.createTableColumn("Dtl.alc_ac_nm", MCColumnType.TEXT);
		p.columnDtl_ac_slip_typ = p.beansFactory.createTableColumn("Dtl.ac_slip_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_slip_typ_nm = p.beansFactory.createTableColumn("Dtl.ac_slip_typ_nm", MCColumnType.TEXT);
		p.columnDtl_ac_rsn_cd = p.beansFactory.createTableColumn("Dtl.ac_rsn_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_ac_rsn_nm = p.beansFactory.createTableColumn("Dtl.ac_rsn_nm", MCColumnType.TEXT);
		p.columnDtl_itm_jnl_cd = p.beansFactory.createTableColumn("Dtl.itm_jnl_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_jnl_nm = p.beansFactory.createTableColumn("Dtl.itm_jnl_nm", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd1 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd1", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm1 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm1", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd2 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd2", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm2 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm2", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd3 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd3", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm3 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm3", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd4 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd4", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm4 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm4", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd5 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd5", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm5 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm5", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd6 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd6", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm6 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm6", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd7 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd7", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm7 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm7", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd8 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd8", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm8 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm8", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd9 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd9", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm9 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm9", MCColumnType.TEXT);
		p.columnDtl_itm_grp_cd10 = p.beansFactory.createTableColumn("Dtl.itm_grp_cd10", MCColumnType.TEXT_COMBO);
		p.columnDtl_itm_grp_nm10 = p.beansFactory.createTableColumn("Dtl.itm_grp_nm10", MCColumnType.TEXT);
		p.columnDtl_expns_typ = p.beansFactory.createTableColumn("Dtl.expns_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_expns_typ_nm = p.beansFactory.createTableColumn("Dtl.expns_typ_nm", MCColumnType.TEXT);
		p.columnDtl_direct_typ = p.beansFactory.createTableColumn("Dtl.direct_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_direct_typ_nm = p.beansFactory.createTableColumn("Dtl.direct_typ_nm", MCColumnType.TEXT);
		p.columnDtl_var_typ = p.beansFactory.createTableColumn("Dtl.var_typ", MCColumnType.TEXT_COMBO);
		p.columnDtl_var_typ_nm = p.beansFactory.createTableColumn("Dtl.var_typ_nm", MCColumnType.TEXT);
		p.columnDtl_expns_grp_cd = p.beansFactory.createTableColumn("Dtl.expns_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_expns_grp_nm = p.beansFactory.createTableColumn("Dtl.expns_grp_nm", MCColumnType.TEXT);
		p.columnDtl_expns_cd = p.beansFactory.createTableColumn("Dtl.expns_cd", MCColumnType.TEXT_COMBO);
		p.columnDtl_expns_nm = p.beansFactory.createTableColumn("Dtl.expns_nm", MCColumnType.TEXT);
		p.columnDtl_sample = p.beansFactory.createTableColumn("Dtl.sample", MCColumnType.TEXT);
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
	 * [DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel = p.beansFactory.createPanel("DtlBtn");
		// ブロックの項目の初期化
		p.DtlBtn_select_all = p.beansFactory.createButton("DtlBtn.select_all", "no_border");
		p.DtlBtn_deselect_all = p.beansFactory.createButton("DtlBtn.deselect_all", "no_border");
		p.DtlBtn_radd = p.beansFactory.createButton("DtlBtn.radd", "no_border");
		p.DtlBtn_rdel = p.beansFactory.createButton("DtlBtn.rdel", "no_border");
		p.DtlBtn_rcopy = p.beansFactory.createButton("DtlBtn.rcopy", "no_border");
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclWrk(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.LclWrkPanel = p.beansFactory.createPanel("LclWrk");
		// ブロックの項目の初期化
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLcl(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.LclPanel = p.beansFactory.createPanel("Lcl");
		p.LclScrollPane = p.beansFactory.createScrollPane("Lcl.scroll");
		p.createLclTable();
		// ブロックの項目の初期化
		p.columnLcl_check = p.beansFactory.createTableColumn("Lcl.check", MCColumnType.CHECK);
		p.columnLcl_rpt_ptn_cd = p.beansFactory.createTableColumn("Lcl.rpt_ptn_cd", MCColumnType.TEXT);
		p.columnLcl_rpt_row_cd = p.beansFactory.createTableColumn("Lcl.rpt_row_cd", MCColumnType.TEXT);
		p.columnLcl_lcl_cd = p.beansFactory.createTableColumn("Lcl.lcl_cd", MCColumnType.TEXT_COMBO);
		p.columnLcl_lcl_nm = p.beansFactory.createTableColumn("Lcl.lcl_nm", MCColumnType.TEXT);
		p.columnLcl_rpt_row_nm = p.beansFactory.createTableColumn("Lcl.rpt_row_nm", MCColumnType.TEXT);
		p.columnLcl_memo1 = p.beansFactory.createTableColumn("Lcl.memo1", MCColumnType.TEXT);
		p.columnLcl_memo2 = p.beansFactory.createTableColumn("Lcl.memo2", MCColumnType.TEXT);
		p.columnLcl_memo3 = p.beansFactory.createTableColumn("Lcl.memo3", MCColumnType.TEXT);
		p.columnLcl_ins_usr_id = p.beansFactory.createTableColumn("Lcl.ins_usr_id", MCColumnType.TEXT);
		p.columnLcl_ins_usr_nm = p.beansFactory.createTableColumn("Lcl.ins_usr_nm", MCColumnType.TEXT);
		p.columnLcl_ins_ts = p.beansFactory.createTableColumn("Lcl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_ins_func_id = p.beansFactory.createTableColumn("Lcl.ins_func_id", MCColumnType.TEXT);
		p.columnLcl_ins_func_nm = p.beansFactory.createTableColumn("Lcl.ins_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_cntr = p.beansFactory.createTableColumn("Lcl.upd_cntr", MCColumnType.NUMBER);
		p.columnLcl_upd_usr_id = p.beansFactory.createTableColumn("Lcl.upd_usr_id", MCColumnType.TEXT);
		p.columnLcl_upd_usr_nm = p.beansFactory.createTableColumn("Lcl.upd_usr_nm", MCColumnType.TEXT);
		p.columnLcl_upd_ts = p.beansFactory.createTableColumn("Lcl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnLcl_upd_func_id = p.beansFactory.createTableColumn("Lcl.upd_func_id", MCColumnType.TEXT);
		p.columnLcl_upd_func_nm = p.beansFactory.createTableColumn("Lcl.upd_func_nm", MCColumnType.TEXT);
		p.columnLcl_upd_srv_req_no = p.beansFactory.createTableColumn("Lcl.upd_srv_req_no", MCColumnType.TEXT);
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitLclBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel = p.beansFactory.createPanel("LclBtn");
		// ブロックの項目の初期化
		p.LclBtn_select_all = p.beansFactory.createButton("LclBtn.select_all", "no_border");
		p.LclBtn_deselect_all = p.beansFactory.createButton("LclBtn.deselect_all", "no_border");
		p.LclBtn_radd = p.beansFactory.createButton("LclBtn.radd", "no_border");
		p.LclBtn_rdel = p.beansFactory.createButton("LclBtn.rdel", "no_border");
		p.LclBtn_rcopy = p.beansFactory.createButton("LclBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0430 = p.beansFactory.createButton("Btn.open_MABGP0430", "open");
		p.Btn_upd = p.beansFactory.createButton("Btn.upd", "upd");
		p.Btn_del = p.beansFactory.createButton("Btn.del", "del");
	}

	/**
	 * [EastBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitEastBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.EastBtnPanel = p.beansFactory.createPanel("EastBtn");
		// ブロックの項目の初期化
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel.setBorder(p.ScreenOpeTitledBorder);
		p.add(p.ScreenOpePanel);
		p.setLastBeans(p.ScreenOpePanel);
		p.ScreenOpePanel.setNextBeans(p.MstPanel);
		p.ScreenOpePanel.setValueCheck(false);
		p.ScreenOpePanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.ScreenOpePanel.setLayoutPosition("NW");
		// ブロックの項目の初期化
	}

	/**
	 * [Mst]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitMst(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.add(p.MstPanel);
		p.MstPanel.setNextBeans(p.CndPanel);
		p.MstPanel.setLayoutPosition("NE");
		// ブロックの項目の初期化
		p.MstPanel.add(p.Mst_mst_set_typ_nm_Label);
		p.MstPanel.add(p.Mst_mst_set_typ_nm);
		p.MstPanel.setLastBeans(p.Mst_mst_set_typ_nm);
		p.Mst_mst_set_typ_nm.setRow(p.getMstR(), mcframe.clientMABG.MABGP0420.MstR.mst_set_typ_nm_META);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.CndPanel.setBorder(p.CndTitledBorder);
		p.add(p.CndPanel);
		p.CndPanel.setNextBeans(p.HdrPanel);
		p.CndPanel.setValueCheck(false);
		p.CndPanel.setExtValue(MCPanel.SRCH_CND_SETTING_PANEL, true);
		p.CndPanel.setLayoutPosition("NS");
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
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABG.MABGP0420.CndR.ope_META);
		p.Cnd_rpt_ptn_cd.setListType(MCListType.FREE);
		p.Cnd_rpt_ptn_cd.setLinkBeans(p.Cnd_rpt_ptn_nm);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd_Label);
		p.CndPanel.add(p.Cnd_rpt_ptn_cd);
		p.CndPanel.setLastBeans(p.Cnd_rpt_ptn_cd);
		p.Cnd_rpt_ptn_cd.setNextBeans(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_cd.setRow(p.getCndR(), mcframe.clientMABG.MABGP0420.CndR.rpt_ptn_cd_META);
		p.CndPanel.add(p.Cnd_rpt_ptn_nm);
		p.Cnd_rpt_ptn_nm.setNextBeans(p.Cnd_srch);
		p.Cnd_rpt_ptn_nm.setRow(p.getCndR(), mcframe.clientMABG.MABGP0420.CndR.rpt_ptn_nm_META);
		p.Cnd_srch.setIcon("SEARCH");
		p.Cnd_srch.setFunctionKey(MCFunctionKey.F1);
		p.CndPanel.add(p.Cnd_srch);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.add(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.WrkPanel);
		p.HdrPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.Hdr_rpt_ptn_cd.setListType(MCListType.STRICT);
		p.Hdr_rpt_ptn_cd.setLinkBeans(p.Hdr_rpt_ptn_nm);
		p.HdrPanel.add(p.Hdr_rpt_ptn_cd_Label);
		p.HdrPanel.add(p.Hdr_rpt_ptn_cd);
		p.HdrPanel.setLastBeans(p.Hdr_rpt_ptn_cd);
		p.Hdr_rpt_ptn_cd.setNextBeans(p.Hdr_rpt_ptn_nm);
		p.Hdr_rpt_ptn_cd.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0420.HdrR.rpt_ptn_cd_META);
		p.HdrPanel.add(p.Hdr_rpt_ptn_nm);
		p.Hdr_rpt_ptn_nm.setRow(p.getHdrR(), mcframe.clientMABG.MABGP0420.HdrR.rpt_ptn_nm_META);
	}

	/**
	 * [Wrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.add(p.WrkPanel);
		p.WrkPanel.setNextBeans(p.LclWrkPanel);
		p.WrkPanel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.WrkPanel.add(p.DtlPanel, null);
		p.WrkPanel.setLastBeans(p.DtlPanel);
		p.DtlPanel.setNextBeans(p.DtlBtnPanel);
		p.WrkPanel.add(p.DtlBtnPanel, null);
	}

	/**
	 * [Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtl(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.DtlPanel.add(p.DtlScrollPane);
		p.DtlPanel.setLastBeans(p.DtlTable);
		p.DtlScrollPane.setViewportView(p.DtlTable);
		p.DtlTable.setList(p.getDtlL());
		p.DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.DtlBtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.DtlBtnPanel.add(p.DtlBtn_menu_move_p_PPanel);
		p.DtlBtnPanel.setLastBeans(p.DtlBtn_menu_move_p_PPanel);
		p.DtlBtn_menu_move_p_PPanel.setNextBeans(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setIcon("SELECT_ALL");
		p.DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.DtlBtnPanel.add(p.DtlBtn_select_all);
		p.DtlBtn_select_all.setNextBeans(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.DtlBtnPanel.add(p.DtlBtn_deselect_all);
		p.DtlBtn_deselect_all.setNextBeans(p.DtlBtn_radd);
		p.DtlBtn_radd.setIcon("INSERT_RECORD");
		p.DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.DtlBtnPanel.add(p.DtlBtn_radd);
		p.DtlBtn_radd.setNextBeans(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.DtlBtnPanel.add(p.DtlBtn_rdel);
		p.DtlBtn_rdel.setNextBeans(p.DtlBtn_rcopy);
		p.DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.DtlBtnPanel.add(p.DtlBtn_rcopy);
	}

	/**
	 * [LclWrk]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclWrk(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.add(p.LclWrkPanel);
		p.LclWrkPanel.setNextBeans(p.BtnPanel);
		p.LclWrkPanel.setLayoutPosition("CBC+");
		// ブロックの項目の初期化
		p.LclWrkPanel.add(p.LclPanel, null);
		p.LclWrkPanel.setLastBeans(p.LclPanel);
		p.LclPanel.setNextBeans(p.LclBtnPanel);
		p.LclWrkPanel.add(p.LclBtnPanel, null);
	}

	/**
	 * [Lcl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLcl(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.LclPanel.add(p.LclScrollPane);
		p.LclPanel.setLastBeans(p.LclTable);
		p.LclScrollPane.setViewportView(p.LclTable);
		p.LclTable.setList(p.getLclL());
		p.LclPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [LclBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitLclBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.LclBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.LclBtn_select_all.setIcon("SELECT_ALL");
		p.LclBtn_select_all.setFunctionKey(MCFunctionKey.F15);
		p.LclBtnPanel.add(p.LclBtn_select_all);
		p.LclBtnPanel.setLastBeans(p.LclBtn_select_all);
		p.LclBtn_select_all.setNextBeans(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setIcon("DESELECT_ALL");
		p.LclBtn_deselect_all.setFunctionKey(MCFunctionKey.F16);
		p.LclBtnPanel.add(p.LclBtn_deselect_all);
		p.LclBtn_deselect_all.setNextBeans(p.LclBtn_radd);
		p.LclBtn_radd.setIcon("INSERT_RECORD");
		p.LclBtn_radd.setFunctionKey(MCFunctionKey.F7);
		p.LclBtnPanel.add(p.LclBtn_radd);
		p.LclBtn_radd.setNextBeans(p.LclBtn_rdel);
		p.LclBtn_rdel.setIcon("DELETE_RECORD");
		p.LclBtn_rdel.setFunctionKey(MCFunctionKey.F8);
		p.LclBtnPanel.add(p.LclBtn_rdel);
		p.LclBtn_rdel.setNextBeans(p.LclBtn_rcopy);
		p.LclBtn_rcopy.setIcon("COPY_RECORD");
		p.LclBtn_rcopy.setFunctionKey(MCFunctionKey.F23);
		p.LclBtnPanel.add(p.LclBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABGP_RptConfReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setNextBeans(p.EastBtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABGP0430.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABGP0430);
		p.BtnPanel.setLastBeans(p.Btn_open_MABGP0430);
		p.Btn_open_MABGP0430.setNextBeans(p.Btn_upd);
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
	protected static void jbInitEastBtn(MABGP_RptConfReg p) {
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
		MABGP_RptConfReg_MC.mcInitScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitMst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitCnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitHdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitDtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitDtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitLclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitLcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitLclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.mcInitEastBtn((MABGP_RptConfReg)this);

		// [UPD]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitUPD_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD_EastBtn((MABGP_RptConfReg)this);

		// [UPD_FIX_H]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitUPD__FIX__H_EastBtn((MABGP_RptConfReg)this);

		// [FIX_U]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitFIX__U_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__U_EastBtn((MABGP_RptConfReg)this);

		// [MOD]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitMOD_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD_EastBtn((MABGP_RptConfReg)this);

		// [MOD_FIX_H]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitMOD__FIX__H_EastBtn((MABGP_RptConfReg)this);

		// [FIX_M]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitFIX__M_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__M_EastBtn((MABGP_RptConfReg)this);

		// [DEL]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitDEL_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitDEL_EastBtn((MABGP_RptConfReg)this);

		// [FIX_D]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitFIX__D_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitFIX__D_EastBtn((MABGP_RptConfReg)this);

		// [REF]ステータスのモードの設定
		MABGP_RptConfReg_MC.statusInitREF_ScreenOpe((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Mst((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Cnd((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Hdr((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Wrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Dtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_DtlBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_LclWrk((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Lcl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_LclAll((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_LclBtn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_Btn((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.statusInitREF_EastBtn((MABGP_RptConfReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABGP_RptConfReg p) {
	}

	/**
	 *  [Mst]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitMst(MABGP_RptConfReg p) {
		p.Mst_mst_set_typ_nm.setListListener(p);
		p.Mst_mst_set_typ_nm.addAllListener(p);
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABGP_RptConfReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_MOD.addAllListener(p);
		p.Cnd_ope_DEL.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_rpt_ptn_cd.setListListener(p);
		p.Cnd_rpt_ptn_cd.addAllListener(p);
		p.Cnd_rpt_ptn_nm.setListListener(p);
		p.Cnd_rpt_ptn_nm.addAllListener(p);
		p.Cnd_srch.addAllListener(p);
		p.Cnd_srch.setAPMethodName("doCnd_srch");
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABGP_RptConfReg p) {
		p.Hdr_rpt_ptn_cd.setListListener(p);
		p.Hdr_rpt_ptn_cd.addAllListener(p);
		p.Hdr_rpt_ptn_nm.setListListener(p);
		p.Hdr_rpt_ptn_nm.addAllListener(p);
	}

	/**
	 *  [Wrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk(MABGP_RptConfReg p) {
	}

	/**
	 *  [Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtl(MABGP_RptConfReg p) {
		p.DtlTable.addAllListener(p);
		p.columnDtl_check.addAllListener(p);
		p.columnDtl_del_flg.addAllListener(p);
		p.columnDtl_rpt_ptn_cd.addAllListener(p);
		p.columnDtl_rpt_ptn_cd.setListListener(p);
		p.columnDtl_rpt_ptn_nm.addAllListener(p);
		p.columnDtl_rpt_ptn_nm.setListListener(p);
		p.columnDtl_rpt_row_cd.addAllListener(p);
		p.columnDtl_rpt_row_cd.setListListener(p);
		p.columnDtl_rpt_pre_word.addAllListener(p);
		p.columnDtl_rpt_pre_word.setListListener(p);
		p.columnDtl_rpt_row_nm_lcl.addAllListener(p);
		p.columnDtl_rpt_row_nm_lcl.setListListener(p);
		p.columnDtl_rpt_row_nm.addAllListener(p);
		p.columnDtl_rpt_row_nm.setListListener(p);
		p.columnDtl_rpt_seq.addAllListener(p);
		p.columnDtl_rpt_seq.setListListener(p);
		p.columnDtl_sml_flg.addAllListener(p);
		p.columnDtl_hdn_flg.addAllListener(p);
		p.columnDtl_rpt_tgt_typ.addAllListener(p);
		p.columnDtl_rpt_tgt_typ.setListListener(p);
		p.columnDtl_rpt_tgt_typ_nm.addAllListener(p);
		p.columnDtl_rpt_tgt_typ_nm.setListListener(p);
		p.columnDtl_cost_io_typ.addAllListener(p);
		p.columnDtl_cost_io_typ.setListListener(p);
		p.columnDtl_cost_io_typ_nm.addAllListener(p);
		p.columnDtl_cost_io_typ_nm.setListListener(p);
		p.columnDtl_asst_typ.addAllListener(p);
		p.columnDtl_asst_typ.setListListener(p);
		p.columnDtl_asst_typ_nm.addAllListener(p);
		p.columnDtl_asst_typ_nm.setListListener(p);
		p.columnDtl_std_flg.addAllListener(p);
		p.columnDtl_qty_unit_typ.addAllListener(p);
		p.columnDtl_qty_unit_typ.setListListener(p);
		p.columnDtl_qty_unit_typ_nm.addAllListener(p);
		p.columnDtl_qty_unit_typ_nm.setListListener(p);
		p.columnDtl_alc_ac_grp_cd1.addAllListener(p);
		p.columnDtl_alc_ac_grp_cd1.setListListener(p);
		p.columnDtl_alc_ac_grp_nm1.addAllListener(p);
		p.columnDtl_alc_ac_grp_nm1.setListListener(p);
		p.columnDtl_alc_ac_grp_cd2.addAllListener(p);
		p.columnDtl_alc_ac_grp_cd2.setListListener(p);
		p.columnDtl_alc_ac_grp_nm2.addAllListener(p);
		p.columnDtl_alc_ac_grp_nm2.setListListener(p);
		p.columnDtl_alc_ac_grp_cd3.addAllListener(p);
		p.columnDtl_alc_ac_grp_cd3.setListListener(p);
		p.columnDtl_alc_ac_grp_nm3.addAllListener(p);
		p.columnDtl_alc_ac_grp_nm3.setListListener(p);
		p.columnDtl_alc_ac_cd.addAllListener(p);
		p.columnDtl_alc_ac_cd.setListListener(p);
		p.columnDtl_alc_ac_nm.addAllListener(p);
		p.columnDtl_alc_ac_nm.setListListener(p);
		p.columnDtl_ac_slip_typ.addAllListener(p);
		p.columnDtl_ac_slip_typ.setListListener(p);
		p.columnDtl_ac_slip_typ_nm.addAllListener(p);
		p.columnDtl_ac_slip_typ_nm.setListListener(p);
		p.columnDtl_ac_rsn_cd.addAllListener(p);
		p.columnDtl_ac_rsn_cd.setListListener(p);
		p.columnDtl_ac_rsn_nm.addAllListener(p);
		p.columnDtl_ac_rsn_nm.setListListener(p);
		p.columnDtl_itm_jnl_cd.addAllListener(p);
		p.columnDtl_itm_jnl_cd.setListListener(p);
		p.columnDtl_itm_jnl_nm.addAllListener(p);
		p.columnDtl_itm_jnl_nm.setListListener(p);
		p.columnDtl_itm_grp_cd1.addAllListener(p);
		p.columnDtl_itm_grp_cd1.setListListener(p);
		p.columnDtl_itm_grp_nm1.addAllListener(p);
		p.columnDtl_itm_grp_nm1.setListListener(p);
		p.columnDtl_itm_grp_cd2.addAllListener(p);
		p.columnDtl_itm_grp_cd2.setListListener(p);
		p.columnDtl_itm_grp_nm2.addAllListener(p);
		p.columnDtl_itm_grp_nm2.setListListener(p);
		p.columnDtl_itm_grp_cd3.addAllListener(p);
		p.columnDtl_itm_grp_cd3.setListListener(p);
		p.columnDtl_itm_grp_nm3.addAllListener(p);
		p.columnDtl_itm_grp_nm3.setListListener(p);
		p.columnDtl_itm_grp_cd4.addAllListener(p);
		p.columnDtl_itm_grp_cd4.setListListener(p);
		p.columnDtl_itm_grp_nm4.addAllListener(p);
		p.columnDtl_itm_grp_nm4.setListListener(p);
		p.columnDtl_itm_grp_cd5.addAllListener(p);
		p.columnDtl_itm_grp_cd5.setListListener(p);
		p.columnDtl_itm_grp_nm5.addAllListener(p);
		p.columnDtl_itm_grp_nm5.setListListener(p);
		p.columnDtl_itm_grp_cd6.addAllListener(p);
		p.columnDtl_itm_grp_cd6.setListListener(p);
		p.columnDtl_itm_grp_nm6.addAllListener(p);
		p.columnDtl_itm_grp_nm6.setListListener(p);
		p.columnDtl_itm_grp_cd7.addAllListener(p);
		p.columnDtl_itm_grp_cd7.setListListener(p);
		p.columnDtl_itm_grp_nm7.addAllListener(p);
		p.columnDtl_itm_grp_nm7.setListListener(p);
		p.columnDtl_itm_grp_cd8.addAllListener(p);
		p.columnDtl_itm_grp_cd8.setListListener(p);
		p.columnDtl_itm_grp_nm8.addAllListener(p);
		p.columnDtl_itm_grp_nm8.setListListener(p);
		p.columnDtl_itm_grp_cd9.addAllListener(p);
		p.columnDtl_itm_grp_cd9.setListListener(p);
		p.columnDtl_itm_grp_nm9.addAllListener(p);
		p.columnDtl_itm_grp_nm9.setListListener(p);
		p.columnDtl_itm_grp_cd10.addAllListener(p);
		p.columnDtl_itm_grp_cd10.setListListener(p);
		p.columnDtl_itm_grp_nm10.addAllListener(p);
		p.columnDtl_itm_grp_nm10.setListListener(p);
		p.columnDtl_expns_typ.addAllListener(p);
		p.columnDtl_expns_typ.setListListener(p);
		p.columnDtl_expns_typ_nm.addAllListener(p);
		p.columnDtl_expns_typ_nm.setListListener(p);
		p.columnDtl_direct_typ.addAllListener(p);
		p.columnDtl_direct_typ.setListListener(p);
		p.columnDtl_direct_typ_nm.addAllListener(p);
		p.columnDtl_direct_typ_nm.setListListener(p);
		p.columnDtl_var_typ.addAllListener(p);
		p.columnDtl_var_typ.setListListener(p);
		p.columnDtl_var_typ_nm.addAllListener(p);
		p.columnDtl_var_typ_nm.setListListener(p);
		p.columnDtl_expns_grp_cd.addAllListener(p);
		p.columnDtl_expns_grp_cd.setListListener(p);
		p.columnDtl_expns_grp_nm.addAllListener(p);
		p.columnDtl_expns_grp_nm.setListListener(p);
		p.columnDtl_expns_cd.addAllListener(p);
		p.columnDtl_expns_cd.setListListener(p);
		p.columnDtl_expns_nm.addAllListener(p);
		p.columnDtl_expns_nm.setListListener(p);
		p.columnDtl_sample.addAllListener(p);
		p.columnDtl_sample.setListListener(p);
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
	 *  [DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlBtn(MABGP_RptConfReg p) {
		p.DtlBtn_select_all.addAllListener(p);
		p.DtlBtn_select_all.setAPMethodName("doDtlBtn_select_all");
		p.DtlBtn_deselect_all.addAllListener(p);
		p.DtlBtn_deselect_all.setAPMethodName("doDtlBtn_deselect_all");
		p.DtlBtn_radd.addAllListener(p);
		p.DtlBtn_radd.setAPMethodName("doDtlBtn_radd");
		p.DtlBtn_rdel.addAllListener(p);
		p.DtlBtn_rdel.setAPMethodName("doDtlBtn_rdel");
		p.DtlBtn_rcopy.addAllListener(p);
		p.DtlBtn_rcopy.setAPMethodName("doDtlBtn_rcopy");
	}

	/**
	 *  [LclWrk]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclWrk(MABGP_RptConfReg p) {
	}

	/**
	 *  [Lcl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLcl(MABGP_RptConfReg p) {
		p.LclTable.addAllListener(p);
		p.columnLcl_check.addAllListener(p);
		p.columnLcl_rpt_ptn_cd.addAllListener(p);
		p.columnLcl_rpt_ptn_cd.setListListener(p);
		p.columnLcl_rpt_row_cd.addAllListener(p);
		p.columnLcl_rpt_row_cd.setListListener(p);
		p.columnLcl_lcl_cd.addAllListener(p);
		p.columnLcl_lcl_cd.setListListener(p);
		p.columnLcl_lcl_nm.addAllListener(p);
		p.columnLcl_lcl_nm.setListListener(p);
		p.columnLcl_rpt_row_nm.addAllListener(p);
		p.columnLcl_rpt_row_nm.setListListener(p);
		p.columnLcl_memo1.addAllListener(p);
		p.columnLcl_memo1.setListListener(p);
		p.columnLcl_memo2.addAllListener(p);
		p.columnLcl_memo2.setListListener(p);
		p.columnLcl_memo3.addAllListener(p);
		p.columnLcl_memo3.setListListener(p);
		p.columnLcl_ins_usr_id.addAllListener(p);
		p.columnLcl_ins_usr_id.setListListener(p);
		p.columnLcl_ins_usr_nm.addAllListener(p);
		p.columnLcl_ins_usr_nm.setListListener(p);
		p.columnLcl_ins_ts.addAllListener(p);
		p.columnLcl_ins_ts.setListListener(p);
		p.columnLcl_ins_func_id.addAllListener(p);
		p.columnLcl_ins_func_id.setListListener(p);
		p.columnLcl_ins_func_nm.addAllListener(p);
		p.columnLcl_ins_func_nm.setListListener(p);
		p.columnLcl_upd_cntr.addAllListener(p);
		p.columnLcl_upd_cntr.setListListener(p);
		p.columnLcl_upd_usr_id.addAllListener(p);
		p.columnLcl_upd_usr_id.setListListener(p);
		p.columnLcl_upd_usr_nm.addAllListener(p);
		p.columnLcl_upd_usr_nm.setListListener(p);
		p.columnLcl_upd_ts.addAllListener(p);
		p.columnLcl_upd_ts.setListListener(p);
		p.columnLcl_upd_func_id.addAllListener(p);
		p.columnLcl_upd_func_id.setListListener(p);
		p.columnLcl_upd_func_nm.addAllListener(p);
		p.columnLcl_upd_func_nm.setListListener(p);
		p.columnLcl_upd_srv_req_no.addAllListener(p);
		p.columnLcl_upd_srv_req_no.setListListener(p);
	}

	/**
	 *  [LclBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitLclBtn(MABGP_RptConfReg p) {
		p.LclBtn_select_all.addAllListener(p);
		p.LclBtn_select_all.setAPMethodName("doLclBtn_select_all");
		p.LclBtn_deselect_all.addAllListener(p);
		p.LclBtn_deselect_all.setAPMethodName("doLclBtn_deselect_all");
		p.LclBtn_radd.addAllListener(p);
		p.LclBtn_radd.setAPMethodName("doLclBtn_radd");
		p.LclBtn_rdel.addAllListener(p);
		p.LclBtn_rdel.setAPMethodName("doLclBtn_rdel");
		p.LclBtn_rcopy.addAllListener(p);
		p.LclBtn_rcopy.setAPMethodName("doLclBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABGP_RptConfReg p) {
		p.Btn_open_MABGP0430.addAllListener(p);
		p.Btn_open_MABGP0430.setAPMethodName("doBtn_open_MABGP0430");
		p.Btn_upd.addAllListener(p);
		p.Btn_upd.setAPMethodName("doBtn_upd");
		p.Btn_del.addAllListener(p);
		p.Btn_del.setAPMethodName("doBtn_del");
	}

	/**
	 *  [EastBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitEastBtn(MABGP_RptConfReg p) {
	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [UPD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_rpt_ptn_nm.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [UPD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
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
	 * [UPD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(UPD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [UPD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [UPD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, UPD, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, UPD, MCMode.DISABLE);
		p.Btn_del.putMode(p, UPD, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, UPD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.Hdr_rpt_ptn_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_ptn_cd.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_pre_word.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_seq.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_hdn_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_tgt_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_cost_io_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_asst_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_qty_unit_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_qty_unit_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ac_slip_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ac_rsn_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_jnl_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm1.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm2.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm3.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm4.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm5.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm6.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm7.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm8.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm9.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm10.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_direct_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_var_typ_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_grp_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.Dtl_bg_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.columnDtl_sample.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(UPD_FIX_H, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.DtlBtn_select_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, UPD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_rpt_ptn_cd.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, UPD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, UPD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, UPD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [UPD_FIX_H]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, UPD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, UPD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, UPD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [UPD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD__FIX__H_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_U, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_rpt_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_U, MCMode.READ_ONLY);
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
	 * [FIX_U]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_U, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_U, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_U, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_U, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_U]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_U]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_U, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, FIX_U, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_U, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_U, MCMode.DISABLE);

	}

	/**
	 * [FIX_U]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__U_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [MOD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [MOD]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, MOD, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD, MCMode.ENABLE);

	}

	/**
	 * [MOD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [MOD]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, MOD, MCMode.READ_ONLY);
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
	 * [MOD]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(MOD, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, MOD, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [MOD]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, MOD, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, MOD, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, MOD, MCMode.READ_ONLY);

	}

	/**
	 * [MOD]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [MOD]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, MOD, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_upd.putMode(p, MOD, MCMode.DISABLE);
		p.Btn_del.putMode(p, MOD, MCMode.DISABLE);

	}

	/**
	 * [MOD]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_ptn_cd.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_pre_word.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_seq.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_hdn_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_rpt_tgt_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_cost_io_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_asst_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnDtl_qty_unit_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_qty_unit_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_alc_ac_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ac_slip_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ac_rsn_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_jnl_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm1.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm2.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm3.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm4.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm5.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm6.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm7.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm8.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm9.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_itm_grp_nm10.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_direct_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_var_typ_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_grp_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_expns_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.Dtl_bg_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.ENABLE);
		p.columnDtl_sample.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_memo3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnDtl_ins_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(MOD_FIX_H, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.ENABLE);
		p.DtlBtn_select_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rdel.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.DtlBtn_rcopy.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_rpt_ptn_cd.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_lcl_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, MOD_FIX_H, MCMode.REQUIRED);
		p.columnLcl_memo1.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo2.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_memo3.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.columnLcl_ins_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, MOD_FIX_H, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, MOD_FIX_H, MCMode.READ_ONLY);

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [MOD_FIX_H]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_deselect_all.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_radd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rdel.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.LclBtn_rcopy.putMode(p, MOD_FIX_H, MCMode.ENABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_upd.putMode(p, MOD_FIX_H, MCMode.ENABLE);
		p.Btn_del.putMode(p, MOD_FIX_H, MCMode.DISABLE);

	}

	/**
	 * [MOD_FIX_H]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitMOD__FIX__H_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, FIX_M, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_M, MCMode.ENABLE);

	}

	/**
	 * [FIX_M]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_M, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_M, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_M, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_M, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_M, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_M]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_M]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_M, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, FIX_M, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_M, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_M, MCMode.DISABLE);

	}

	/**
	 * [FIX_M]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__M_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [DEL]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitDEL_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [DEL]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, DEL, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [DEL]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, DEL, MCMode.REQUIRED);
		p.columnDtl_del_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, DEL, MCMode.READ_ONLY);
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
	 * [DEL]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(DEL, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_deselect_all.putMode(p, DEL, MCMode.ENABLE);
		p.DtlBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [DEL]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, DEL, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, DEL, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, DEL, MCMode.READ_ONLY);

	}

	/**
	 * [DEL]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [DEL]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, DEL, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, DEL, MCMode.DISABLE);

	}

	/**
	 * [DEL]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, DEL, MCMode.ENABLE);
		p.Btn_upd.putMode(p, DEL, MCMode.DISABLE);
		p.Btn_del.putMode(p, DEL, MCMode.ENABLE);

	}

	/**
	 * [DEL]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitDEL_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, FIX_D, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, FIX_D, MCMode.ENABLE);

	}

	/**
	 * [FIX_D]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_memo3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnDtl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnDtl_del_ts.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(FIX_D, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_rpt_ptn_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, FIX_D, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, FIX_D, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, FIX_D, MCMode.READ_ONLY);

	}

	/**
	 * [FIX_D]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [FIX_D]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, FIX_D, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, FIX_D, MCMode.ENABLE);
		p.Btn_upd.putMode(p, FIX_D, MCMode.DISABLE);
		p.Btn_del.putMode(p, FIX_D, MCMode.DISABLE);

	}

	/**
	 * [FIX_D]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX__D_EastBtn(MABGP_RptConfReg p){

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABGP_RptConfReg p){

	}

	/**
	 * [REF]ステータスの[Mst]ブロックのモードの設定
	 */
	protected static void statusInitREF_Mst(MABGP_RptConfReg p){
		p.Mst_mst_set_typ_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABGP_RptConfReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_cd.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_srch.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABGP_RptConfReg p){
		p.Hdr_rpt_ptn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_rpt_ptn_nm.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk(MABGP_RptConfReg p){

	}

	/**
	 * [REF]ステータスの[Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Dtl(MABGP_RptConfReg p){
		p.columnDtl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rpt_ptn_nm.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_rpt_row_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_pre_word.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm_lcl.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_row_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_seq.putMode(p, REF, MCMode.INVISIBLE);
		p.columnDtl_sml_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_hdn_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_rpt_tgt_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_cost_io_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_asst_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_std_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_qty_unit_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_alc_ac_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_slip_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_ac_rsn_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_jnl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm4.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm5.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm6.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm7.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm8.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm9.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_cd10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_itm_grp_nm10.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_direct_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_direct_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_var_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_var_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnDtl_expns_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Dtl_fg_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.Dtl_bg_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0120.FSUBP_Color_D.READ_ONLY);
		p.columnDtl_sample.putMode(p, REF, MCMode.READ_ONLY);
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
	 * [REF]ステータスの[DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlBtn(MABGP_RptConfReg p){
		p.DtlBtn_menu_move_p_PPanel.putStatus(REF, mcframe.clientFSUB.FSUBP0060.FSUBP_RowMove_H.DISABLE);
		p.DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[LclWrk]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclWrk(MABGP_RptConfReg p){

	}

	/**
	 * [REF]ステータスの[Lcl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Lcl(MABGP_RptConfReg p){
		p.columnLcl_check.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_rpt_ptn_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_rpt_row_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_lcl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_lcl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_rpt_row_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnLcl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnLcl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[LclAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclAll(MABGP_RptConfReg p){

	}

	/**
	 * [REF]ステータスの[LclBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_LclBtn(MABGP_RptConfReg p){
		p.LclBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.LclBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABGP_RptConfReg p){
		p.Btn_open_MABGP0430.putMode(p, REF, MCMode.ENABLE);
		p.Btn_upd.putMode(p, REF, MCMode.DISABLE);
		p.Btn_del.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[EastBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_EastBtn(MABGP_RptConfReg p){

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
		MABGP_RptConfReg_MC.setTableConfigDtl((MABGP_RptConfReg)this);
		MABGP_RptConfReg_MC.setTableConfigLcl((MABGP_RptConfReg)this);
	}

	/**
	 * [Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigDtl(MABGP_RptConfReg p) {
		p.columnDtl_check.setMeta(mcframe.clientMABG.MABGP0420.DtlR.check_META);
		p.DtlTable.addColumnConfig(p.columnDtl_check);
		p.columnDtl_del_flg.setMeta(mcframe.clientMABG.MABGP0420.DtlR.del_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_flg);
		p.columnDtl_rpt_ptn_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_ptn_cd_META);
		p.columnDtl_rpt_ptn_cd.addLinkBeans(p.columnDtl_rpt_ptn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_ptn_cd);
		p.columnDtl_rpt_ptn_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_ptn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_ptn_nm);
		p.columnDtl_rpt_row_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_row_cd_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_row_cd);
		p.columnDtl_rpt_pre_word.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_pre_word_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_pre_word);
		p.columnDtl_rpt_row_nm_lcl.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_row_nm_lcl_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_row_nm_lcl);
		p.columnDtl_rpt_row_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_row_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_row_nm);
		p.columnDtl_rpt_seq.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_seq_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_seq);
		p.columnDtl_sml_flg.setMeta(mcframe.clientMABG.MABGP0420.DtlR.sml_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sml_flg);
		p.columnDtl_hdn_flg.setMeta(mcframe.clientMABG.MABGP0420.DtlR.hdn_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_hdn_flg);
		p.columnDtl_rpt_tgt_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_tgt_typ_META);
		p.columnDtl_rpt_tgt_typ.addLinkBeans(p.columnDtl_rpt_tgt_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_tgt_typ);
		p.columnDtl_rpt_tgt_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.rpt_tgt_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_rpt_tgt_typ_nm);
		p.columnDtl_cost_io_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.cost_io_typ_META);
		p.columnDtl_cost_io_typ.addLinkBeans(p.columnDtl_cost_io_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_io_typ);
		p.columnDtl_cost_io_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.cost_io_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_cost_io_typ_nm);
		p.columnDtl_asst_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.asst_typ_META);
		p.columnDtl_asst_typ.addLinkBeans(p.columnDtl_asst_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ);
		p.columnDtl_asst_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.asst_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_asst_typ_nm);
		p.columnDtl_std_flg.setMeta(mcframe.clientMABG.MABGP0420.DtlR.std_flg_META);
		p.DtlTable.addColumnConfig(p.columnDtl_std_flg);
		p.columnDtl_qty_unit_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.qty_unit_typ_META);
		p.columnDtl_qty_unit_typ.addLinkBeans(p.columnDtl_qty_unit_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_qty_unit_typ);
		p.columnDtl_qty_unit_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.qty_unit_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_qty_unit_typ_nm);
		p.columnDtl_alc_ac_grp_cd1.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_cd1_META);
		p.columnDtl_alc_ac_grp_cd1.addLinkBeans(p.columnDtl_alc_ac_grp_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_cd1);
		p.columnDtl_alc_ac_grp_nm1.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_nm1);
		p.columnDtl_alc_ac_grp_cd2.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_cd2_META);
		p.columnDtl_alc_ac_grp_cd2.addLinkBeans(p.columnDtl_alc_ac_grp_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_cd2);
		p.columnDtl_alc_ac_grp_nm2.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_nm2);
		p.columnDtl_alc_ac_grp_cd3.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_cd3_META);
		p.columnDtl_alc_ac_grp_cd3.addLinkBeans(p.columnDtl_alc_ac_grp_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_cd3);
		p.columnDtl_alc_ac_grp_nm3.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_grp_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_grp_nm3);
		p.columnDtl_alc_ac_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_cd_META);
		p.columnDtl_alc_ac_cd.addLinkBeans(p.columnDtl_alc_ac_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_cd);
		p.columnDtl_alc_ac_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.alc_ac_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_alc_ac_nm);
		p.columnDtl_ac_slip_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ac_slip_typ_META);
		p.columnDtl_ac_slip_typ.addLinkBeans(p.columnDtl_ac_slip_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ);
		p.columnDtl_ac_slip_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ac_slip_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_slip_typ_nm);
		p.columnDtl_ac_rsn_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ac_rsn_cd_META);
		p.columnDtl_ac_rsn_cd.addLinkBeans(p.columnDtl_ac_rsn_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_cd);
		p.columnDtl_ac_rsn_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ac_rsn_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ac_rsn_nm);
		p.columnDtl_itm_jnl_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_jnl_cd_META);
		p.columnDtl_itm_jnl_cd.addLinkBeans(p.columnDtl_itm_jnl_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_cd);
		p.columnDtl_itm_jnl_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_jnl_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_jnl_nm);
		p.columnDtl_itm_grp_cd1.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd1_META);
		p.columnDtl_itm_grp_cd1.addLinkBeans(p.columnDtl_itm_grp_nm1);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd1);
		p.columnDtl_itm_grp_nm1.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm1);
		p.columnDtl_itm_grp_cd2.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd2_META);
		p.columnDtl_itm_grp_cd2.addLinkBeans(p.columnDtl_itm_grp_nm2);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd2);
		p.columnDtl_itm_grp_nm2.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm2);
		p.columnDtl_itm_grp_cd3.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd3_META);
		p.columnDtl_itm_grp_cd3.addLinkBeans(p.columnDtl_itm_grp_nm3);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd3);
		p.columnDtl_itm_grp_nm3.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm3);
		p.columnDtl_itm_grp_cd4.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd4_META);
		p.columnDtl_itm_grp_cd4.addLinkBeans(p.columnDtl_itm_grp_nm4);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd4);
		p.columnDtl_itm_grp_nm4.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm4_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm4);
		p.columnDtl_itm_grp_cd5.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd5_META);
		p.columnDtl_itm_grp_cd5.addLinkBeans(p.columnDtl_itm_grp_nm5);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd5);
		p.columnDtl_itm_grp_nm5.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm5_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm5);
		p.columnDtl_itm_grp_cd6.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd6_META);
		p.columnDtl_itm_grp_cd6.addLinkBeans(p.columnDtl_itm_grp_nm6);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd6);
		p.columnDtl_itm_grp_nm6.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm6_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm6);
		p.columnDtl_itm_grp_cd7.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd7_META);
		p.columnDtl_itm_grp_cd7.addLinkBeans(p.columnDtl_itm_grp_nm7);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd7);
		p.columnDtl_itm_grp_nm7.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm7_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm7);
		p.columnDtl_itm_grp_cd8.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd8_META);
		p.columnDtl_itm_grp_cd8.addLinkBeans(p.columnDtl_itm_grp_nm8);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd8);
		p.columnDtl_itm_grp_nm8.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm8_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm8);
		p.columnDtl_itm_grp_cd9.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd9_META);
		p.columnDtl_itm_grp_cd9.addLinkBeans(p.columnDtl_itm_grp_nm9);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd9);
		p.columnDtl_itm_grp_nm9.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm9_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm9);
		p.columnDtl_itm_grp_cd10.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_cd10_META);
		p.columnDtl_itm_grp_cd10.addLinkBeans(p.columnDtl_itm_grp_nm10);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_cd10);
		p.columnDtl_itm_grp_nm10.setMeta(mcframe.clientMABG.MABGP0420.DtlR.itm_grp_nm10_META);
		p.DtlTable.addColumnConfig(p.columnDtl_itm_grp_nm10);
		p.columnDtl_expns_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_typ_META);
		p.columnDtl_expns_typ.addLinkBeans(p.columnDtl_expns_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_typ);
		p.columnDtl_expns_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_typ_nm);
		p.columnDtl_direct_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.direct_typ_META);
		p.columnDtl_direct_typ.addLinkBeans(p.columnDtl_direct_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_direct_typ);
		p.columnDtl_direct_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.direct_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_direct_typ_nm);
		p.columnDtl_var_typ.setMeta(mcframe.clientMABG.MABGP0420.DtlR.var_typ_META);
		p.columnDtl_var_typ.addLinkBeans(p.columnDtl_var_typ_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_var_typ);
		p.columnDtl_var_typ_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.var_typ_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_var_typ_nm);
		p.columnDtl_expns_grp_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_grp_cd_META);
		p.columnDtl_expns_grp_cd.addLinkBeans(p.columnDtl_expns_grp_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_grp_cd);
		p.columnDtl_expns_grp_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_grp_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_grp_nm);
		p.columnDtl_expns_cd.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_cd_META);
		p.columnDtl_expns_cd.addLinkBeans(p.columnDtl_expns_nm);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_cd);
		p.columnDtl_expns_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.expns_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_expns_nm);
		p.DtlTable.addTable(p.Dtl_fg_p_PPanel.ColorTable);
		p.DtlTable.addTable(p.Dtl_bg_p_PPanel.ColorTable);
		p.columnDtl_sample.setMeta(mcframe.clientMABG.MABGP0420.DtlR.sample_META);
		p.DtlTable.addColumnConfig(p.columnDtl_sample);
		p.columnDtl_memo1.setMeta(mcframe.clientMABG.MABGP0420.DtlR.memo1_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo1);
		p.columnDtl_memo2.setMeta(mcframe.clientMABG.MABGP0420.DtlR.memo2_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo2);
		p.columnDtl_memo3.setMeta(mcframe.clientMABG.MABGP0420.DtlR.memo3_META);
		p.DtlTable.addColumnConfig(p.columnDtl_memo3);
		p.columnDtl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ins_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_id);
		p.columnDtl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ins_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_usr_nm);
		p.columnDtl_ins_ts.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ins_ts_META);
		p.columnDtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_ts);
		p.columnDtl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ins_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_id);
		p.columnDtl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.ins_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_ins_func_nm);
		p.columnDtl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_cntr_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_cntr);
		p.columnDtl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_id);
		p.columnDtl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_usr_nm);
		p.columnDtl_upd_ts.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_ts_META);
		p.columnDtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_ts);
		p.columnDtl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_func_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_id);
		p.columnDtl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_func_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_func_nm);
		p.columnDtl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0420.DtlR.upd_srv_req_no_META);
		p.DtlTable.addColumnConfig(p.columnDtl_upd_srv_req_no);
		p.columnDtl_del_usr_id.setMeta(mcframe.clientMABG.MABGP0420.DtlR.del_usr_id_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_id);
		p.columnDtl_del_usr_nm.setMeta(mcframe.clientMABG.MABGP0420.DtlR.del_usr_nm_META);
		p.DtlTable.addColumnConfig(p.columnDtl_del_usr_nm);
		p.columnDtl_del_ts.setMeta(mcframe.clientMABG.MABGP0420.DtlR.del_ts_META);
		p.columnDtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.DtlTable.addColumnConfig(p.columnDtl_del_ts);
		// スクロール固定カラムの指定
		p.DtlTable.setUnscrollColumn(p.columnDtl_del_flg);
	}

	/**
	 * [Lcl]ブロックのTableの設定
	 */
	protected static void setTableConfigLcl(MABGP_RptConfReg p) {
		p.columnLcl_check.setMeta(mcframe.clientMABG.MABGP0420.LclR.check_META);
		p.LclTable.addColumnConfig(p.columnLcl_check);
		p.columnLcl_rpt_ptn_cd.setMeta(mcframe.clientMABG.MABGP0420.LclR.rpt_ptn_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_rpt_ptn_cd);
		p.columnLcl_rpt_row_cd.setMeta(mcframe.clientMABG.MABGP0420.LclR.rpt_row_cd_META);
		p.LclTable.addColumnConfig(p.columnLcl_rpt_row_cd);
		p.columnLcl_lcl_cd.setMeta(mcframe.clientMABG.MABGP0420.LclR.lcl_cd_META);
		p.columnLcl_lcl_cd.addLinkBeans(p.columnLcl_lcl_nm);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_cd);
		p.columnLcl_lcl_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.lcl_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_lcl_nm);
		p.columnLcl_rpt_row_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.rpt_row_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_rpt_row_nm);
		p.columnLcl_memo1.setMeta(mcframe.clientMABG.MABGP0420.LclR.memo1_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo1);
		p.columnLcl_memo2.setMeta(mcframe.clientMABG.MABGP0420.LclR.memo2_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo2);
		p.columnLcl_memo3.setMeta(mcframe.clientMABG.MABGP0420.LclR.memo3_META);
		p.LclTable.addColumnConfig(p.columnLcl_memo3);
		p.columnLcl_ins_usr_id.setMeta(mcframe.clientMABG.MABGP0420.LclR.ins_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_id);
		p.columnLcl_ins_usr_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.ins_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_usr_nm);
		p.columnLcl_ins_ts.setMeta(mcframe.clientMABG.MABGP0420.LclR.ins_ts_META);
		p.columnLcl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_ins_ts);
		p.columnLcl_ins_func_id.setMeta(mcframe.clientMABG.MABGP0420.LclR.ins_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_id);
		p.columnLcl_ins_func_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.ins_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_ins_func_nm);
		p.columnLcl_upd_cntr.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_cntr_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_cntr);
		p.columnLcl_upd_usr_id.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_usr_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_id);
		p.columnLcl_upd_usr_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_usr_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_usr_nm);
		p.columnLcl_upd_ts.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_ts_META);
		p.columnLcl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.LclTable.addColumnConfig(p.columnLcl_upd_ts);
		p.columnLcl_upd_func_id.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_func_id_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_id);
		p.columnLcl_upd_func_nm.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_func_nm_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_func_nm);
		p.columnLcl_upd_srv_req_no.setMeta(mcframe.clientMABG.MABGP0420.LclR.upd_srv_req_no_META);
		p.LclTable.addColumnConfig(p.columnLcl_upd_srv_req_no);
		// スクロール固定カラムの指定
		p.LclTable.setUnscrollColumn(p.columnLcl_lcl_cd);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		Cnd_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Cnd_rpt_ptn_cd.getListConfig().setPutter(getCnd_rpt_ptn_cd_ListPutter());
		Hdr_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		Hdr_rpt_ptn_cd.getListConfig().setPutter(getHdr_rpt_ptn_cd_ListPutter());
		columnDtl_rpt_ptn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rpt_ptn_cd.getListConfig().setPutter(getDtl_rpt_ptn_cd_ListPutter());
		columnDtl_rpt_tgt_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_rpt_tgt_typ.getListConfig().setPutter(getDtl_rpt_tgt_typ_ListPutter());
		columnDtl_cost_io_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_cost_io_typ.getListConfig().setPutter(getDtl_cost_io_typ_ListPutter());
		columnDtl_asst_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_asst_typ.getListConfig().setPutter(getDtl_asst_typ_ListPutter());
		columnDtl_qty_unit_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_qty_unit_typ.getListConfig().setPutter(getDtl_qty_unit_typ_ListPutter());
		columnDtl_alc_ac_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_grp_cd1.getListConfig().setPutter(getDtl_alc_ac_grp_cd1_ListPutter());
		columnDtl_alc_ac_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_grp_cd2.getListConfig().setPutter(getDtl_alc_ac_grp_cd2_ListPutter());
		columnDtl_alc_ac_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_grp_cd3.getListConfig().setPutter(getDtl_alc_ac_grp_cd3_ListPutter());
		columnDtl_alc_ac_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_alc_ac_cd.getListConfig().setPutter(getDtl_alc_ac_cd_ListPutter());
		columnDtl_ac_slip_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_slip_typ.getListConfig().setPutter(getDtl_ac_slip_typ_ListPutter());
		columnDtl_ac_rsn_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_ac_rsn_cd.getListConfig().setPutter(getDtl_ac_rsn_cd_ListPutter());
		columnDtl_itm_jnl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_jnl_cd.getListConfig().setPutter(getDtl_itm_jnl_cd_ListPutter());
		columnDtl_itm_grp_cd1.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd1.getListConfig().setPutter(getDtl_itm_grp_cd1_ListPutter());
		columnDtl_itm_grp_cd2.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd2.getListConfig().setPutter(getDtl_itm_grp_cd2_ListPutter());
		columnDtl_itm_grp_cd3.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd3.getListConfig().setPutter(getDtl_itm_grp_cd3_ListPutter());
		columnDtl_itm_grp_cd4.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd4.getListConfig().setPutter(getDtl_itm_grp_cd4_ListPutter());
		columnDtl_itm_grp_cd5.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd5.getListConfig().setPutter(getDtl_itm_grp_cd5_ListPutter());
		columnDtl_itm_grp_cd6.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd6.getListConfig().setPutter(getDtl_itm_grp_cd6_ListPutter());
		columnDtl_itm_grp_cd7.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd7.getListConfig().setPutter(getDtl_itm_grp_cd7_ListPutter());
		columnDtl_itm_grp_cd8.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd8.getListConfig().setPutter(getDtl_itm_grp_cd8_ListPutter());
		columnDtl_itm_grp_cd9.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd9.getListConfig().setPutter(getDtl_itm_grp_cd9_ListPutter());
		columnDtl_itm_grp_cd10.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_itm_grp_cd10.getListConfig().setPutter(getDtl_itm_grp_cd10_ListPutter());
		columnDtl_expns_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_expns_typ.getListConfig().setPutter(getDtl_expns_typ_ListPutter());
		columnDtl_direct_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_direct_typ.getListConfig().setPutter(getDtl_direct_typ_ListPutter());
		columnDtl_var_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_var_typ.getListConfig().setPutter(getDtl_var_typ_ListPutter());
		columnDtl_expns_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_expns_grp_cd.getListConfig().setPutter(getDtl_expns_grp_cd_ListPutter());
		columnDtl_expns_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnDtl_expns_cd.getListConfig().setPutter(getDtl_expns_cd_ListPutter());
		columnLcl_lcl_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnLcl_lcl_cd.getListConfig().setPutter(getLcl_lcl_cd_ListPutter());
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
	 * この画面を[UPD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setUPD_FIX_HStatus() {
		status = UPD_FIX_H;
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
	 * この画面を[MOD]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMODStatus() {
		status = MOD;
		setAllStatus(status);
	}

	/**
	 * この画面を[MOD_FIX_H]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setMOD_FIX_HStatus() {
		status = MOD_FIX_H;
		setAllStatus(status);
	}

	/**
	 * この画面を[FIX_M]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_MStatus() {
		status = FIX_M;
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
	 * この画面を[FIX_D]ステータスに設定します。
	 */
	@SuppressWarnings("deprecation")
	public void setFIX_DStatus() {
		status = FIX_D;
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
		else if (UPD_FIX_H.equals(status)) {
			setUPD_FIX_HStatus();
		}
		else if (FIX_U.equals(status)) {
			setFIX_UStatus();
		}
		else if (MOD.equals(status)) {
			setMODStatus();
		}
		else if (MOD_FIX_H.equals(status)) {
			setMOD_FIX_HStatus();
		}
		else if (FIX_M.equals(status)) {
			setFIX_MStatus();
		}
		else if (DEL.equals(status)) {
			setDELStatus();
		}
		else if (FIX_D.equals(status)) {
			setFIX_DStatus();
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
	 * [Cnd_rpt_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createCnd_rpt_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptPtn");
		return lp;
	}
	 
	/**
	 * [Hdr_rpt_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createHdr_rpt_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptPtnNotInRptConf");
		return lp;
	}
	 
	/**
	 * [Dtl_rpt_ptn_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rpt_ptn_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptPtn");
		return lp;
	}
	 
	/**
	 * [Dtl_rpt_tgt_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_rpt_tgt_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.RptTgtTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_cost_io_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_cost_io_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.CostIoTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_asst_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_asst_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AsstTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_qty_unit_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_qty_unit_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.QtyUnitTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ac_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ac_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp1");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ac_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ac_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp2");
		return lp;
	}
	 
	/**
	 * [Dtl_alc_ac_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_alc_ac_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AlcAcGrp3");
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
	 * [Dtl_ac_slip_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_ac_slip_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.AcSlipTyp");
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
	 * [Dtl_itm_jnl_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_jnl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmJnl");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd1_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd1_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp1");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd2_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd2_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp2");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd3_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd3_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp3");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd4_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd4_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp4");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd5_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd5_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp5");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd6_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd6_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp6");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd7_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd7_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp7");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd8_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd8_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp8");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd9_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd9_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp9");
		return lp;
	}
	 
	/**
	 * [Dtl_itm_grp_cd10_ListPutter]の作成
	 */
	protected MCListPutter createDtl_itm_grp_cd10_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ItmGrp10");
		return lp;
	}
	 
	/**
	 * [Dtl_expns_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_expns_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpnsTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_direct_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_direct_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DirectTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_var_typ_ListPutter]の作成
	 */
	protected MCListPutter createDtl_var_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.VarTyp");
		return lp;
	}
	 
	/**
	 * [Dtl_expns_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_expns_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.ExpnsGrp");
		return lp;
	}
	 
	/**
	 * [Dtl_expns_cd_ListPutter]の作成
	 */
	protected MCListPutter createDtl_expns_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Expns");
		return lp;
	}
	 
	/**
	 * [Lcl_lcl_cd_ListPutter]の作成
	 */
	protected MCListPutter createLcl_lcl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LocaleEntry");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Cnd_rpt_ptn_cd) return getCnd_rpt_ptn_cd(row, info);
		if(combo == Hdr_rpt_ptn_cd) return getHdr_rpt_ptn_cd(row, info);
		if(combo == columnDtl_rpt_ptn_cd) return getDtl_rpt_ptn_cd(row, info);
		if(combo == columnDtl_rpt_tgt_typ) return getDtl_rpt_tgt_typ(row, info);
		if(combo == columnDtl_cost_io_typ) return getDtl_cost_io_typ(row, info);
		if(combo == columnDtl_asst_typ) return getDtl_asst_typ(row, info);
		if(combo == columnDtl_qty_unit_typ) return getDtl_qty_unit_typ(row, info);
		if(combo == columnDtl_alc_ac_grp_cd1) return getDtl_alc_ac_grp_cd1(row, info);
		if(combo == columnDtl_alc_ac_grp_cd2) return getDtl_alc_ac_grp_cd2(row, info);
		if(combo == columnDtl_alc_ac_grp_cd3) return getDtl_alc_ac_grp_cd3(row, info);
		if(combo == columnDtl_alc_ac_cd) return getDtl_alc_ac_cd(row, info);
		if(combo == columnDtl_ac_slip_typ) return getDtl_ac_slip_typ(row, info);
		if(combo == columnDtl_ac_rsn_cd) return getDtl_ac_rsn_cd(row, info);
		if(combo == columnDtl_itm_jnl_cd) return getDtl_itm_jnl_cd(row, info);
		if(combo == columnDtl_itm_grp_cd1) return getDtl_itm_grp_cd1(row, info);
		if(combo == columnDtl_itm_grp_cd2) return getDtl_itm_grp_cd2(row, info);
		if(combo == columnDtl_itm_grp_cd3) return getDtl_itm_grp_cd3(row, info);
		if(combo == columnDtl_itm_grp_cd4) return getDtl_itm_grp_cd4(row, info);
		if(combo == columnDtl_itm_grp_cd5) return getDtl_itm_grp_cd5(row, info);
		if(combo == columnDtl_itm_grp_cd6) return getDtl_itm_grp_cd6(row, info);
		if(combo == columnDtl_itm_grp_cd7) return getDtl_itm_grp_cd7(row, info);
		if(combo == columnDtl_itm_grp_cd8) return getDtl_itm_grp_cd8(row, info);
		if(combo == columnDtl_itm_grp_cd9) return getDtl_itm_grp_cd9(row, info);
		if(combo == columnDtl_itm_grp_cd10) return getDtl_itm_grp_cd10(row, info);
		if(combo == columnDtl_expns_typ) return getDtl_expns_typ(row, info);
		if(combo == columnDtl_direct_typ) return getDtl_direct_typ(row, info);
		if(combo == columnDtl_var_typ) return getDtl_var_typ(row, info);
		if(combo == columnDtl_expns_grp_cd) return getDtl_expns_grp_cd(row, info);
		if(combo == columnDtl_expns_cd) return getDtl_expns_cd(row, info);
		if(combo == columnLcl_lcl_cd) return getLcl_lcl_cd(row, info);
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
		else if (ap == DtlBtn_select_all) doDtlBtn_select_all(info);
		else if (ap == DtlBtn_deselect_all) doDtlBtn_deselect_all(info);
		else if (ap == DtlBtn_radd) doDtlBtn_radd(info);
		else if (ap == DtlBtn_rdel) doDtlBtn_rdel(info);
		else if (ap == DtlBtn_rcopy) doDtlBtn_rcopy(info);
		else if (ap == LclBtn_select_all) doLclBtn_select_all(info);
		else if (ap == LclBtn_deselect_all) doLclBtn_deselect_all(info);
		else if (ap == LclBtn_radd) doLclBtn_radd(info);
		else if (ap == LclBtn_rdel) doLclBtn_rdel(info);
		else if (ap == LclBtn_rcopy) doLclBtn_rcopy(info);
		else if (ap == Btn_open_MABGP0430) doBtn_open_MABGP0430(info);
		else if (ap == Btn_upd) doBtn_upd(info);
		else if (ap == Btn_del) doBtn_del(info);
	}

	/**
	 * [Cnd]パネルの[srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCnd_srch(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_select_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_radd(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rdel(MCEventInfo info);

	/**
	 * [DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doDtlBtn_rcopy(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_select_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_deselect_all(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_radd(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rdel(MCEventInfo info);

	/**
	 * [LclBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doLclBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABGP0430]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABGP0430(MCEventInfo info);

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
		if (vc == LclTable) return doLcl_VC(info);
		if (vc == Mst_mst_set_typ_nm) return doMst_mst_set_typ_nm_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_rpt_ptn_cd) return doCnd_rpt_ptn_cd_VC(info);
		if (vc == Cnd_rpt_ptn_nm) return doCnd_rpt_ptn_nm_VC(info);
		if (vc == Hdr_rpt_ptn_cd) return doHdr_rpt_ptn_cd_VC(info);
		if (vc == Hdr_rpt_ptn_nm) return doHdr_rpt_ptn_nm_VC(info);
		if (vc == columnDtl_check) return doDtl_check_VC(info);
		if (vc == columnDtl_del_flg) return doDtl_del_flg_VC(info);
		if (vc == columnDtl_rpt_ptn_cd) return doDtl_rpt_ptn_cd_VC(info);
		if (vc == columnDtl_rpt_ptn_nm) return doDtl_rpt_ptn_nm_VC(info);
		if (vc == columnDtl_rpt_row_cd) return doDtl_rpt_row_cd_VC(info);
		if (vc == columnDtl_rpt_pre_word) return doDtl_rpt_pre_word_VC(info);
		if (vc == columnDtl_rpt_row_nm_lcl) return doDtl_rpt_row_nm_lcl_VC(info);
		if (vc == columnDtl_rpt_row_nm) return doDtl_rpt_row_nm_VC(info);
		if (vc == columnDtl_rpt_seq) return doDtl_rpt_seq_VC(info);
		if (vc == columnDtl_sml_flg) return doDtl_sml_flg_VC(info);
		if (vc == columnDtl_hdn_flg) return doDtl_hdn_flg_VC(info);
		if (vc == columnDtl_rpt_tgt_typ) return doDtl_rpt_tgt_typ_VC(info);
		if (vc == columnDtl_rpt_tgt_typ_nm) return doDtl_rpt_tgt_typ_nm_VC(info);
		if (vc == columnDtl_cost_io_typ) return doDtl_cost_io_typ_VC(info);
		if (vc == columnDtl_cost_io_typ_nm) return doDtl_cost_io_typ_nm_VC(info);
		if (vc == columnDtl_asst_typ) return doDtl_asst_typ_VC(info);
		if (vc == columnDtl_asst_typ_nm) return doDtl_asst_typ_nm_VC(info);
		if (vc == columnDtl_std_flg) return doDtl_std_flg_VC(info);
		if (vc == columnDtl_qty_unit_typ) return doDtl_qty_unit_typ_VC(info);
		if (vc == columnDtl_qty_unit_typ_nm) return doDtl_qty_unit_typ_nm_VC(info);
		if (vc == columnDtl_alc_ac_grp_cd1) return doDtl_alc_ac_grp_cd1_VC(info);
		if (vc == columnDtl_alc_ac_grp_nm1) return doDtl_alc_ac_grp_nm1_VC(info);
		if (vc == columnDtl_alc_ac_grp_cd2) return doDtl_alc_ac_grp_cd2_VC(info);
		if (vc == columnDtl_alc_ac_grp_nm2) return doDtl_alc_ac_grp_nm2_VC(info);
		if (vc == columnDtl_alc_ac_grp_cd3) return doDtl_alc_ac_grp_cd3_VC(info);
		if (vc == columnDtl_alc_ac_grp_nm3) return doDtl_alc_ac_grp_nm3_VC(info);
		if (vc == columnDtl_alc_ac_cd) return doDtl_alc_ac_cd_VC(info);
		if (vc == columnDtl_alc_ac_nm) return doDtl_alc_ac_nm_VC(info);
		if (vc == columnDtl_ac_slip_typ) return doDtl_ac_slip_typ_VC(info);
		if (vc == columnDtl_ac_slip_typ_nm) return doDtl_ac_slip_typ_nm_VC(info);
		if (vc == columnDtl_ac_rsn_cd) return doDtl_ac_rsn_cd_VC(info);
		if (vc == columnDtl_ac_rsn_nm) return doDtl_ac_rsn_nm_VC(info);
		if (vc == columnDtl_itm_jnl_cd) return doDtl_itm_jnl_cd_VC(info);
		if (vc == columnDtl_itm_jnl_nm) return doDtl_itm_jnl_nm_VC(info);
		if (vc == columnDtl_itm_grp_cd1) return doDtl_itm_grp_cd1_VC(info);
		if (vc == columnDtl_itm_grp_nm1) return doDtl_itm_grp_nm1_VC(info);
		if (vc == columnDtl_itm_grp_cd2) return doDtl_itm_grp_cd2_VC(info);
		if (vc == columnDtl_itm_grp_nm2) return doDtl_itm_grp_nm2_VC(info);
		if (vc == columnDtl_itm_grp_cd3) return doDtl_itm_grp_cd3_VC(info);
		if (vc == columnDtl_itm_grp_nm3) return doDtl_itm_grp_nm3_VC(info);
		if (vc == columnDtl_itm_grp_cd4) return doDtl_itm_grp_cd4_VC(info);
		if (vc == columnDtl_itm_grp_nm4) return doDtl_itm_grp_nm4_VC(info);
		if (vc == columnDtl_itm_grp_cd5) return doDtl_itm_grp_cd5_VC(info);
		if (vc == columnDtl_itm_grp_nm5) return doDtl_itm_grp_nm5_VC(info);
		if (vc == columnDtl_itm_grp_cd6) return doDtl_itm_grp_cd6_VC(info);
		if (vc == columnDtl_itm_grp_nm6) return doDtl_itm_grp_nm6_VC(info);
		if (vc == columnDtl_itm_grp_cd7) return doDtl_itm_grp_cd7_VC(info);
		if (vc == columnDtl_itm_grp_nm7) return doDtl_itm_grp_nm7_VC(info);
		if (vc == columnDtl_itm_grp_cd8) return doDtl_itm_grp_cd8_VC(info);
		if (vc == columnDtl_itm_grp_nm8) return doDtl_itm_grp_nm8_VC(info);
		if (vc == columnDtl_itm_grp_cd9) return doDtl_itm_grp_cd9_VC(info);
		if (vc == columnDtl_itm_grp_nm9) return doDtl_itm_grp_nm9_VC(info);
		if (vc == columnDtl_itm_grp_cd10) return doDtl_itm_grp_cd10_VC(info);
		if (vc == columnDtl_itm_grp_nm10) return doDtl_itm_grp_nm10_VC(info);
		if (vc == columnDtl_expns_typ) return doDtl_expns_typ_VC(info);
		if (vc == columnDtl_expns_typ_nm) return doDtl_expns_typ_nm_VC(info);
		if (vc == columnDtl_direct_typ) return doDtl_direct_typ_VC(info);
		if (vc == columnDtl_direct_typ_nm) return doDtl_direct_typ_nm_VC(info);
		if (vc == columnDtl_var_typ) return doDtl_var_typ_VC(info);
		if (vc == columnDtl_var_typ_nm) return doDtl_var_typ_nm_VC(info);
		if (vc == columnDtl_expns_grp_cd) return doDtl_expns_grp_cd_VC(info);
		if (vc == columnDtl_expns_grp_nm) return doDtl_expns_grp_nm_VC(info);
		if (vc == columnDtl_expns_cd) return doDtl_expns_cd_VC(info);
		if (vc == columnDtl_expns_nm) return doDtl_expns_nm_VC(info);
		if (vc == columnDtl_sample) return doDtl_sample_VC(info);
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
		if (vc == columnLcl_check) return doLcl_check_VC(info);
		if (vc == columnLcl_rpt_ptn_cd) return doLcl_rpt_ptn_cd_VC(info);
		if (vc == columnLcl_rpt_row_cd) return doLcl_rpt_row_cd_VC(info);
		if (vc == columnLcl_lcl_cd) return doLcl_lcl_cd_VC(info);
		if (vc == columnLcl_lcl_nm) return doLcl_lcl_nm_VC(info);
		if (vc == columnLcl_rpt_row_nm) return doLcl_rpt_row_nm_VC(info);
		if (vc == columnLcl_memo1) return doLcl_memo1_VC(info);
		if (vc == columnLcl_memo2) return doLcl_memo2_VC(info);
		if (vc == columnLcl_memo3) return doLcl_memo3_VC(info);
		if (vc == columnLcl_ins_usr_id) return doLcl_ins_usr_id_VC(info);
		if (vc == columnLcl_ins_usr_nm) return doLcl_ins_usr_nm_VC(info);
		if (vc == columnLcl_ins_ts) return doLcl_ins_ts_VC(info);
		if (vc == columnLcl_ins_func_id) return doLcl_ins_func_id_VC(info);
		if (vc == columnLcl_ins_func_nm) return doLcl_ins_func_nm_VC(info);
		if (vc == columnLcl_upd_cntr) return doLcl_upd_cntr_VC(info);
		if (vc == columnLcl_upd_usr_id) return doLcl_upd_usr_id_VC(info);
		if (vc == columnLcl_upd_usr_nm) return doLcl_upd_usr_nm_VC(info);
		if (vc == columnLcl_upd_ts) return doLcl_upd_ts_VC(info);
		if (vc == columnLcl_upd_func_id) return doLcl_upd_func_id_VC(info);
		if (vc == columnLcl_upd_func_nm) return doLcl_upd_func_nm_VC(info);
		if (vc == columnLcl_upd_srv_req_no) return doLcl_upd_srv_req_no_VC(info);
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
	 * [Lcl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doMst_mst_set_typ_nm_VC(MCEventInfo info){
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
	 * [Cnd]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doCnd_rpt_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_rpt_ptn_nm_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_ptn_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_row_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_row_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_pre_word]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_pre_word_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm_lcl]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_row_nm_lcl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_row_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_seq]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_seq_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sml_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sml_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[hdn_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_hdn_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_tgt_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_rpt_tgt_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_io_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_io_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[cost_io_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_cost_io_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_asst_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[std_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_std_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qty_unit_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_qty_unit_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_alc_ac_grp_nm3_VC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_grp_cd1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm4_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm5_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm6_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm7_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm8_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm9_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_cd10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_itm_grp_nm10_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[direct_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_direct_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[direct_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_direct_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[var_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_var_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[var_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_var_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[expns_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_expns_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Dtl]パネルの[sample]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtl_sample_VC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[rpt_ptn_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_rpt_ptn_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[rpt_row_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_rpt_row_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_lcl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[rpt_row_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_rpt_row_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doLcl_upd_srv_req_no_VC(MCEventInfo info){
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
		else if (nc == LclTable) doLcl_NC(info);
		else if (nc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NC(info);
		else if (nc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NC(info);
		else if (nc == Hdr_rpt_ptn_cd) doHdr_rpt_ptn_cd_NC(info);
		else if (nc == Hdr_rpt_ptn_nm) doHdr_rpt_ptn_nm_NC(info);
		else if (nc == columnDtl_check) doDtl_check_NC(info);
		else if (nc == columnDtl_del_flg) doDtl_del_flg_NC(info);
		else if (nc == columnDtl_rpt_ptn_cd) doDtl_rpt_ptn_cd_NC(info);
		else if (nc == columnDtl_rpt_ptn_nm) doDtl_rpt_ptn_nm_NC(info);
		else if (nc == columnDtl_rpt_row_cd) doDtl_rpt_row_cd_NC(info);
		else if (nc == columnDtl_rpt_pre_word) doDtl_rpt_pre_word_NC(info);
		else if (nc == columnDtl_rpt_row_nm_lcl) doDtl_rpt_row_nm_lcl_NC(info);
		else if (nc == columnDtl_rpt_row_nm) doDtl_rpt_row_nm_NC(info);
		else if (nc == columnDtl_rpt_seq) doDtl_rpt_seq_NC(info);
		else if (nc == columnDtl_sml_flg) doDtl_sml_flg_NC(info);
		else if (nc == columnDtl_hdn_flg) doDtl_hdn_flg_NC(info);
		else if (nc == columnDtl_rpt_tgt_typ) doDtl_rpt_tgt_typ_NC(info);
		else if (nc == columnDtl_rpt_tgt_typ_nm) doDtl_rpt_tgt_typ_nm_NC(info);
		else if (nc == columnDtl_cost_io_typ) doDtl_cost_io_typ_NC(info);
		else if (nc == columnDtl_cost_io_typ_nm) doDtl_cost_io_typ_nm_NC(info);
		else if (nc == columnDtl_asst_typ) doDtl_asst_typ_NC(info);
		else if (nc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NC(info);
		else if (nc == columnDtl_std_flg) doDtl_std_flg_NC(info);
		else if (nc == columnDtl_qty_unit_typ) doDtl_qty_unit_typ_NC(info);
		else if (nc == columnDtl_qty_unit_typ_nm) doDtl_qty_unit_typ_nm_NC(info);
		else if (nc == columnDtl_alc_ac_grp_cd1) doDtl_alc_ac_grp_cd1_NC(info);
		else if (nc == columnDtl_alc_ac_grp_nm1) doDtl_alc_ac_grp_nm1_NC(info);
		else if (nc == columnDtl_alc_ac_grp_cd2) doDtl_alc_ac_grp_cd2_NC(info);
		else if (nc == columnDtl_alc_ac_grp_nm2) doDtl_alc_ac_grp_nm2_NC(info);
		else if (nc == columnDtl_alc_ac_grp_cd3) doDtl_alc_ac_grp_cd3_NC(info);
		else if (nc == columnDtl_alc_ac_grp_nm3) doDtl_alc_ac_grp_nm3_NC(info);
		else if (nc == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NC(info);
		else if (nc == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NC(info);
		else if (nc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NC(info);
		else if (nc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NC(info);
		else if (nc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NC(info);
		else if (nc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NC(info);
		else if (nc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NC(info);
		else if (nc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NC(info);
		else if (nc == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NC(info);
		else if (nc == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NC(info);
		else if (nc == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NC(info);
		else if (nc == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NC(info);
		else if (nc == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NC(info);
		else if (nc == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NC(info);
		else if (nc == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NC(info);
		else if (nc == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NC(info);
		else if (nc == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NC(info);
		else if (nc == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NC(info);
		else if (nc == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NC(info);
		else if (nc == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NC(info);
		else if (nc == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NC(info);
		else if (nc == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NC(info);
		else if (nc == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NC(info);
		else if (nc == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NC(info);
		else if (nc == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NC(info);
		else if (nc == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NC(info);
		else if (nc == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NC(info);
		else if (nc == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NC(info);
		else if (nc == columnDtl_expns_typ) doDtl_expns_typ_NC(info);
		else if (nc == columnDtl_expns_typ_nm) doDtl_expns_typ_nm_NC(info);
		else if (nc == columnDtl_direct_typ) doDtl_direct_typ_NC(info);
		else if (nc == columnDtl_direct_typ_nm) doDtl_direct_typ_nm_NC(info);
		else if (nc == columnDtl_var_typ) doDtl_var_typ_NC(info);
		else if (nc == columnDtl_var_typ_nm) doDtl_var_typ_nm_NC(info);
		else if (nc == columnDtl_expns_grp_cd) doDtl_expns_grp_cd_NC(info);
		else if (nc == columnDtl_expns_grp_nm) doDtl_expns_grp_nm_NC(info);
		else if (nc == columnDtl_expns_cd) doDtl_expns_cd_NC(info);
		else if (nc == columnDtl_expns_nm) doDtl_expns_nm_NC(info);
		else if (nc == columnDtl_sample) doDtl_sample_NC(info);
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
		else if (nc == columnLcl_check) doLcl_check_NC(info);
		else if (nc == columnLcl_rpt_ptn_cd) doLcl_rpt_ptn_cd_NC(info);
		else if (nc == columnLcl_rpt_row_cd) doLcl_rpt_row_cd_NC(info);
		else if (nc == columnLcl_lcl_cd) doLcl_lcl_cd_NC(info);
		else if (nc == columnLcl_lcl_nm) doLcl_lcl_nm_NC(info);
		else if (nc == columnLcl_rpt_row_nm) doLcl_rpt_row_nm_NC(info);
		else if (nc == columnLcl_memo1) doLcl_memo1_NC(info);
		else if (nc == columnLcl_memo2) doLcl_memo2_NC(info);
		else if (nc == columnLcl_memo3) doLcl_memo3_NC(info);
		else if (nc == columnLcl_ins_usr_id) doLcl_ins_usr_id_NC(info);
		else if (nc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NC(info);
		else if (nc == columnLcl_ins_ts) doLcl_ins_ts_NC(info);
		else if (nc == columnLcl_ins_func_id) doLcl_ins_func_id_NC(info);
		else if (nc == columnLcl_ins_func_nm) doLcl_ins_func_nm_NC(info);
		else if (nc == columnLcl_upd_cntr) doLcl_upd_cntr_NC(info);
		else if (nc == columnLcl_upd_usr_id) doLcl_upd_usr_id_NC(info);
		else if (nc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NC(info);
		else if (nc == columnLcl_upd_ts) doLcl_upd_ts_NC(info);
		else if (nc == columnLcl_upd_func_id) doLcl_upd_func_id_NC(info);
		else if (nc == columnLcl_upd_func_nm) doLcl_upd_func_nm_NC(info);
		else if (nc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NC(info);
	}

	/**
	 * [Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NC(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_nm_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_pre_word]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_pre_word_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm_lcl]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_lcl_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_seq]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_seq_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sml_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sml_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdn_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdn_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm3_NC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NC(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_ptn_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_ptn_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NC(MCEventInfo info){
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
		else if (ne == LclTable) doLcl_NE(info);
		else if (ne == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NE(info);
		else if (ne == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NE(info);
		else if (ne == Hdr_rpt_ptn_cd) doHdr_rpt_ptn_cd_NE(info);
		else if (ne == Hdr_rpt_ptn_nm) doHdr_rpt_ptn_nm_NE(info);
		else if (ne == columnDtl_check) doDtl_check_NE(info);
		else if (ne == columnDtl_del_flg) doDtl_del_flg_NE(info);
		else if (ne == columnDtl_rpt_ptn_cd) doDtl_rpt_ptn_cd_NE(info);
		else if (ne == columnDtl_rpt_ptn_nm) doDtl_rpt_ptn_nm_NE(info);
		else if (ne == columnDtl_rpt_row_cd) doDtl_rpt_row_cd_NE(info);
		else if (ne == columnDtl_rpt_pre_word) doDtl_rpt_pre_word_NE(info);
		else if (ne == columnDtl_rpt_row_nm_lcl) doDtl_rpt_row_nm_lcl_NE(info);
		else if (ne == columnDtl_rpt_row_nm) doDtl_rpt_row_nm_NE(info);
		else if (ne == columnDtl_rpt_seq) doDtl_rpt_seq_NE(info);
		else if (ne == columnDtl_sml_flg) doDtl_sml_flg_NE(info);
		else if (ne == columnDtl_hdn_flg) doDtl_hdn_flg_NE(info);
		else if (ne == columnDtl_rpt_tgt_typ) doDtl_rpt_tgt_typ_NE(info);
		else if (ne == columnDtl_rpt_tgt_typ_nm) doDtl_rpt_tgt_typ_nm_NE(info);
		else if (ne == columnDtl_cost_io_typ) doDtl_cost_io_typ_NE(info);
		else if (ne == columnDtl_cost_io_typ_nm) doDtl_cost_io_typ_nm_NE(info);
		else if (ne == columnDtl_asst_typ) doDtl_asst_typ_NE(info);
		else if (ne == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NE(info);
		else if (ne == columnDtl_std_flg) doDtl_std_flg_NE(info);
		else if (ne == columnDtl_qty_unit_typ) doDtl_qty_unit_typ_NE(info);
		else if (ne == columnDtl_qty_unit_typ_nm) doDtl_qty_unit_typ_nm_NE(info);
		else if (ne == columnDtl_alc_ac_grp_cd1) doDtl_alc_ac_grp_cd1_NE(info);
		else if (ne == columnDtl_alc_ac_grp_nm1) doDtl_alc_ac_grp_nm1_NE(info);
		else if (ne == columnDtl_alc_ac_grp_cd2) doDtl_alc_ac_grp_cd2_NE(info);
		else if (ne == columnDtl_alc_ac_grp_nm2) doDtl_alc_ac_grp_nm2_NE(info);
		else if (ne == columnDtl_alc_ac_grp_cd3) doDtl_alc_ac_grp_cd3_NE(info);
		else if (ne == columnDtl_alc_ac_grp_nm3) doDtl_alc_ac_grp_nm3_NE(info);
		else if (ne == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NE(info);
		else if (ne == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NE(info);
		else if (ne == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NE(info);
		else if (ne == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NE(info);
		else if (ne == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NE(info);
		else if (ne == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NE(info);
		else if (ne == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NE(info);
		else if (ne == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NE(info);
		else if (ne == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NE(info);
		else if (ne == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NE(info);
		else if (ne == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NE(info);
		else if (ne == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NE(info);
		else if (ne == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NE(info);
		else if (ne == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NE(info);
		else if (ne == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NE(info);
		else if (ne == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NE(info);
		else if (ne == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NE(info);
		else if (ne == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NE(info);
		else if (ne == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NE(info);
		else if (ne == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NE(info);
		else if (ne == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NE(info);
		else if (ne == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NE(info);
		else if (ne == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NE(info);
		else if (ne == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NE(info);
		else if (ne == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NE(info);
		else if (ne == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NE(info);
		else if (ne == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NE(info);
		else if (ne == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NE(info);
		else if (ne == columnDtl_expns_typ) doDtl_expns_typ_NE(info);
		else if (ne == columnDtl_expns_typ_nm) doDtl_expns_typ_nm_NE(info);
		else if (ne == columnDtl_direct_typ) doDtl_direct_typ_NE(info);
		else if (ne == columnDtl_direct_typ_nm) doDtl_direct_typ_nm_NE(info);
		else if (ne == columnDtl_var_typ) doDtl_var_typ_NE(info);
		else if (ne == columnDtl_var_typ_nm) doDtl_var_typ_nm_NE(info);
		else if (ne == columnDtl_expns_grp_cd) doDtl_expns_grp_cd_NE(info);
		else if (ne == columnDtl_expns_grp_nm) doDtl_expns_grp_nm_NE(info);
		else if (ne == columnDtl_expns_cd) doDtl_expns_cd_NE(info);
		else if (ne == columnDtl_expns_nm) doDtl_expns_nm_NE(info);
		else if (ne == columnDtl_sample) doDtl_sample_NE(info);
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
		else if (ne == columnLcl_check) doLcl_check_NE(info);
		else if (ne == columnLcl_rpt_ptn_cd) doLcl_rpt_ptn_cd_NE(info);
		else if (ne == columnLcl_rpt_row_cd) doLcl_rpt_row_cd_NE(info);
		else if (ne == columnLcl_lcl_cd) doLcl_lcl_cd_NE(info);
		else if (ne == columnLcl_lcl_nm) doLcl_lcl_nm_NE(info);
		else if (ne == columnLcl_rpt_row_nm) doLcl_rpt_row_nm_NE(info);
		else if (ne == columnLcl_memo1) doLcl_memo1_NE(info);
		else if (ne == columnLcl_memo2) doLcl_memo2_NE(info);
		else if (ne == columnLcl_memo3) doLcl_memo3_NE(info);
		else if (ne == columnLcl_ins_usr_id) doLcl_ins_usr_id_NE(info);
		else if (ne == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NE(info);
		else if (ne == columnLcl_ins_ts) doLcl_ins_ts_NE(info);
		else if (ne == columnLcl_ins_func_id) doLcl_ins_func_id_NE(info);
		else if (ne == columnLcl_ins_func_nm) doLcl_ins_func_nm_NE(info);
		else if (ne == columnLcl_upd_cntr) doLcl_upd_cntr_NE(info);
		else if (ne == columnLcl_upd_usr_id) doLcl_upd_usr_id_NE(info);
		else if (ne == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NE(info);
		else if (ne == columnLcl_upd_ts) doLcl_upd_ts_NE(info);
		else if (ne == columnLcl_upd_func_id) doLcl_upd_func_id_NE(info);
		else if (ne == columnLcl_upd_func_nm) doLcl_upd_func_nm_NE(info);
		else if (ne == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NE(info);
	}

	/**
	 * [Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NE(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_nm_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_pre_word]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_pre_word_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm_lcl]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_lcl_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_seq]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_seq_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sml_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sml_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdn_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdn_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm3_NE(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NE(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NE(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_ptn_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_ptn_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NE(MCEventInfo info){
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
		else if (nx == LclTable) doLcl_NX(info);
		else if (nx == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_NX(info);
		else if (nx == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_NX(info);
		else if (nx == Hdr_rpt_ptn_cd) doHdr_rpt_ptn_cd_NX(info);
		else if (nx == Hdr_rpt_ptn_nm) doHdr_rpt_ptn_nm_NX(info);
		else if (nx == columnDtl_check) doDtl_check_NX(info);
		else if (nx == columnDtl_del_flg) doDtl_del_flg_NX(info);
		else if (nx == columnDtl_rpt_ptn_cd) doDtl_rpt_ptn_cd_NX(info);
		else if (nx == columnDtl_rpt_ptn_nm) doDtl_rpt_ptn_nm_NX(info);
		else if (nx == columnDtl_rpt_row_cd) doDtl_rpt_row_cd_NX(info);
		else if (nx == columnDtl_rpt_pre_word) doDtl_rpt_pre_word_NX(info);
		else if (nx == columnDtl_rpt_row_nm_lcl) doDtl_rpt_row_nm_lcl_NX(info);
		else if (nx == columnDtl_rpt_row_nm) doDtl_rpt_row_nm_NX(info);
		else if (nx == columnDtl_rpt_seq) doDtl_rpt_seq_NX(info);
		else if (nx == columnDtl_sml_flg) doDtl_sml_flg_NX(info);
		else if (nx == columnDtl_hdn_flg) doDtl_hdn_flg_NX(info);
		else if (nx == columnDtl_rpt_tgt_typ) doDtl_rpt_tgt_typ_NX(info);
		else if (nx == columnDtl_rpt_tgt_typ_nm) doDtl_rpt_tgt_typ_nm_NX(info);
		else if (nx == columnDtl_cost_io_typ) doDtl_cost_io_typ_NX(info);
		else if (nx == columnDtl_cost_io_typ_nm) doDtl_cost_io_typ_nm_NX(info);
		else if (nx == columnDtl_asst_typ) doDtl_asst_typ_NX(info);
		else if (nx == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_NX(info);
		else if (nx == columnDtl_std_flg) doDtl_std_flg_NX(info);
		else if (nx == columnDtl_qty_unit_typ) doDtl_qty_unit_typ_NX(info);
		else if (nx == columnDtl_qty_unit_typ_nm) doDtl_qty_unit_typ_nm_NX(info);
		else if (nx == columnDtl_alc_ac_grp_cd1) doDtl_alc_ac_grp_cd1_NX(info);
		else if (nx == columnDtl_alc_ac_grp_nm1) doDtl_alc_ac_grp_nm1_NX(info);
		else if (nx == columnDtl_alc_ac_grp_cd2) doDtl_alc_ac_grp_cd2_NX(info);
		else if (nx == columnDtl_alc_ac_grp_nm2) doDtl_alc_ac_grp_nm2_NX(info);
		else if (nx == columnDtl_alc_ac_grp_cd3) doDtl_alc_ac_grp_cd3_NX(info);
		else if (nx == columnDtl_alc_ac_grp_nm3) doDtl_alc_ac_grp_nm3_NX(info);
		else if (nx == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_NX(info);
		else if (nx == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_NX(info);
		else if (nx == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_NX(info);
		else if (nx == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_NX(info);
		else if (nx == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_NX(info);
		else if (nx == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_NX(info);
		else if (nx == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_NX(info);
		else if (nx == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_NX(info);
		else if (nx == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_NX(info);
		else if (nx == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_NX(info);
		else if (nx == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_NX(info);
		else if (nx == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_NX(info);
		else if (nx == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_NX(info);
		else if (nx == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_NX(info);
		else if (nx == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_NX(info);
		else if (nx == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_NX(info);
		else if (nx == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_NX(info);
		else if (nx == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_NX(info);
		else if (nx == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_NX(info);
		else if (nx == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_NX(info);
		else if (nx == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_NX(info);
		else if (nx == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_NX(info);
		else if (nx == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_NX(info);
		else if (nx == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_NX(info);
		else if (nx == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_NX(info);
		else if (nx == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_NX(info);
		else if (nx == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_NX(info);
		else if (nx == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_NX(info);
		else if (nx == columnDtl_expns_typ) doDtl_expns_typ_NX(info);
		else if (nx == columnDtl_expns_typ_nm) doDtl_expns_typ_nm_NX(info);
		else if (nx == columnDtl_direct_typ) doDtl_direct_typ_NX(info);
		else if (nx == columnDtl_direct_typ_nm) doDtl_direct_typ_nm_NX(info);
		else if (nx == columnDtl_var_typ) doDtl_var_typ_NX(info);
		else if (nx == columnDtl_var_typ_nm) doDtl_var_typ_nm_NX(info);
		else if (nx == columnDtl_expns_grp_cd) doDtl_expns_grp_cd_NX(info);
		else if (nx == columnDtl_expns_grp_nm) doDtl_expns_grp_nm_NX(info);
		else if (nx == columnDtl_expns_cd) doDtl_expns_cd_NX(info);
		else if (nx == columnDtl_expns_nm) doDtl_expns_nm_NX(info);
		else if (nx == columnDtl_sample) doDtl_sample_NX(info);
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
		else if (nx == columnLcl_check) doLcl_check_NX(info);
		else if (nx == columnLcl_rpt_ptn_cd) doLcl_rpt_ptn_cd_NX(info);
		else if (nx == columnLcl_rpt_row_cd) doLcl_rpt_row_cd_NX(info);
		else if (nx == columnLcl_lcl_cd) doLcl_lcl_cd_NX(info);
		else if (nx == columnLcl_lcl_nm) doLcl_lcl_nm_NX(info);
		else if (nx == columnLcl_rpt_row_nm) doLcl_rpt_row_nm_NX(info);
		else if (nx == columnLcl_memo1) doLcl_memo1_NX(info);
		else if (nx == columnLcl_memo2) doLcl_memo2_NX(info);
		else if (nx == columnLcl_memo3) doLcl_memo3_NX(info);
		else if (nx == columnLcl_ins_usr_id) doLcl_ins_usr_id_NX(info);
		else if (nx == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_NX(info);
		else if (nx == columnLcl_ins_ts) doLcl_ins_ts_NX(info);
		else if (nx == columnLcl_ins_func_id) doLcl_ins_func_id_NX(info);
		else if (nx == columnLcl_ins_func_nm) doLcl_ins_func_nm_NX(info);
		else if (nx == columnLcl_upd_cntr) doLcl_upd_cntr_NX(info);
		else if (nx == columnLcl_upd_usr_id) doLcl_upd_usr_id_NX(info);
		else if (nx == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_NX(info);
		else if (nx == columnLcl_upd_ts) doLcl_upd_ts_NX(info);
		else if (nx == columnLcl_upd_func_id) doLcl_upd_func_id_NX(info);
		else if (nx == columnLcl_upd_func_nm) doLcl_upd_func_nm_NX(info);
		else if (nx == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_NX(info);
	}

	/**
	 * [Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_NX(MCEventInfo info){
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_nm_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_pre_word]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_pre_word_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm_lcl]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_lcl_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_seq]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_seq_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sml_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sml_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[hdn_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_hdn_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[std_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_std_flg_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm3_NX(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_grp_cd1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_NX(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_NX(MCEventInfo info){
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
	 * [Lcl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_check_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_ptn_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_ptn_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Mst_mst_set_typ_nm) doMst_mst_set_typ_nm_LC(info);
		else if (lc == Cnd_rpt_ptn_cd) doCnd_rpt_ptn_cd_LC(info);
		else if (lc == Cnd_rpt_ptn_nm) doCnd_rpt_ptn_nm_LC(info);
		else if (lc == Hdr_rpt_ptn_cd) doHdr_rpt_ptn_cd_LC(info);
		else if (lc == Hdr_rpt_ptn_nm) doHdr_rpt_ptn_nm_LC(info);
		else if (lc == columnDtl_rpt_ptn_cd) doDtl_rpt_ptn_cd_LC(info);
		else if (lc == columnDtl_rpt_ptn_nm) doDtl_rpt_ptn_nm_LC(info);
		else if (lc == columnDtl_rpt_row_cd) doDtl_rpt_row_cd_LC(info);
		else if (lc == columnDtl_rpt_pre_word) doDtl_rpt_pre_word_LC(info);
		else if (lc == columnDtl_rpt_row_nm_lcl) doDtl_rpt_row_nm_lcl_LC(info);
		else if (lc == columnDtl_rpt_row_nm) doDtl_rpt_row_nm_LC(info);
		else if (lc == columnDtl_rpt_seq) doDtl_rpt_seq_LC(info);
		else if (lc == columnDtl_rpt_tgt_typ) doDtl_rpt_tgt_typ_LC(info);
		else if (lc == columnDtl_rpt_tgt_typ_nm) doDtl_rpt_tgt_typ_nm_LC(info);
		else if (lc == columnDtl_cost_io_typ) doDtl_cost_io_typ_LC(info);
		else if (lc == columnDtl_cost_io_typ_nm) doDtl_cost_io_typ_nm_LC(info);
		else if (lc == columnDtl_asst_typ) doDtl_asst_typ_LC(info);
		else if (lc == columnDtl_asst_typ_nm) doDtl_asst_typ_nm_LC(info);
		else if (lc == columnDtl_qty_unit_typ) doDtl_qty_unit_typ_LC(info);
		else if (lc == columnDtl_qty_unit_typ_nm) doDtl_qty_unit_typ_nm_LC(info);
		else if (lc == columnDtl_alc_ac_grp_cd1) doDtl_alc_ac_grp_cd1_LC(info);
		else if (lc == columnDtl_alc_ac_grp_nm1) doDtl_alc_ac_grp_nm1_LC(info);
		else if (lc == columnDtl_alc_ac_grp_cd2) doDtl_alc_ac_grp_cd2_LC(info);
		else if (lc == columnDtl_alc_ac_grp_nm2) doDtl_alc_ac_grp_nm2_LC(info);
		else if (lc == columnDtl_alc_ac_grp_cd3) doDtl_alc_ac_grp_cd3_LC(info);
		else if (lc == columnDtl_alc_ac_grp_nm3) doDtl_alc_ac_grp_nm3_LC(info);
		else if (lc == columnDtl_alc_ac_cd) doDtl_alc_ac_cd_LC(info);
		else if (lc == columnDtl_alc_ac_nm) doDtl_alc_ac_nm_LC(info);
		else if (lc == columnDtl_ac_slip_typ) doDtl_ac_slip_typ_LC(info);
		else if (lc == columnDtl_ac_slip_typ_nm) doDtl_ac_slip_typ_nm_LC(info);
		else if (lc == columnDtl_ac_rsn_cd) doDtl_ac_rsn_cd_LC(info);
		else if (lc == columnDtl_ac_rsn_nm) doDtl_ac_rsn_nm_LC(info);
		else if (lc == columnDtl_itm_jnl_cd) doDtl_itm_jnl_cd_LC(info);
		else if (lc == columnDtl_itm_jnl_nm) doDtl_itm_jnl_nm_LC(info);
		else if (lc == columnDtl_itm_grp_cd1) doDtl_itm_grp_cd1_LC(info);
		else if (lc == columnDtl_itm_grp_nm1) doDtl_itm_grp_nm1_LC(info);
		else if (lc == columnDtl_itm_grp_cd2) doDtl_itm_grp_cd2_LC(info);
		else if (lc == columnDtl_itm_grp_nm2) doDtl_itm_grp_nm2_LC(info);
		else if (lc == columnDtl_itm_grp_cd3) doDtl_itm_grp_cd3_LC(info);
		else if (lc == columnDtl_itm_grp_nm3) doDtl_itm_grp_nm3_LC(info);
		else if (lc == columnDtl_itm_grp_cd4) doDtl_itm_grp_cd4_LC(info);
		else if (lc == columnDtl_itm_grp_nm4) doDtl_itm_grp_nm4_LC(info);
		else if (lc == columnDtl_itm_grp_cd5) doDtl_itm_grp_cd5_LC(info);
		else if (lc == columnDtl_itm_grp_nm5) doDtl_itm_grp_nm5_LC(info);
		else if (lc == columnDtl_itm_grp_cd6) doDtl_itm_grp_cd6_LC(info);
		else if (lc == columnDtl_itm_grp_nm6) doDtl_itm_grp_nm6_LC(info);
		else if (lc == columnDtl_itm_grp_cd7) doDtl_itm_grp_cd7_LC(info);
		else if (lc == columnDtl_itm_grp_nm7) doDtl_itm_grp_nm7_LC(info);
		else if (lc == columnDtl_itm_grp_cd8) doDtl_itm_grp_cd8_LC(info);
		else if (lc == columnDtl_itm_grp_nm8) doDtl_itm_grp_nm8_LC(info);
		else if (lc == columnDtl_itm_grp_cd9) doDtl_itm_grp_cd9_LC(info);
		else if (lc == columnDtl_itm_grp_nm9) doDtl_itm_grp_nm9_LC(info);
		else if (lc == columnDtl_itm_grp_cd10) doDtl_itm_grp_cd10_LC(info);
		else if (lc == columnDtl_itm_grp_nm10) doDtl_itm_grp_nm10_LC(info);
		else if (lc == columnDtl_expns_typ) doDtl_expns_typ_LC(info);
		else if (lc == columnDtl_expns_typ_nm) doDtl_expns_typ_nm_LC(info);
		else if (lc == columnDtl_direct_typ) doDtl_direct_typ_LC(info);
		else if (lc == columnDtl_direct_typ_nm) doDtl_direct_typ_nm_LC(info);
		else if (lc == columnDtl_var_typ) doDtl_var_typ_LC(info);
		else if (lc == columnDtl_var_typ_nm) doDtl_var_typ_nm_LC(info);
		else if (lc == columnDtl_expns_grp_cd) doDtl_expns_grp_cd_LC(info);
		else if (lc == columnDtl_expns_grp_nm) doDtl_expns_grp_nm_LC(info);
		else if (lc == columnDtl_expns_cd) doDtl_expns_cd_LC(info);
		else if (lc == columnDtl_expns_nm) doDtl_expns_nm_LC(info);
		else if (lc == columnDtl_sample) doDtl_sample_LC(info);
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
		else if (lc == columnLcl_rpt_ptn_cd) doLcl_rpt_ptn_cd_LC(info);
		else if (lc == columnLcl_rpt_row_cd) doLcl_rpt_row_cd_LC(info);
		else if (lc == columnLcl_lcl_cd) doLcl_lcl_cd_LC(info);
		else if (lc == columnLcl_lcl_nm) doLcl_lcl_nm_LC(info);
		else if (lc == columnLcl_rpt_row_nm) doLcl_rpt_row_nm_LC(info);
		else if (lc == columnLcl_memo1) doLcl_memo1_LC(info);
		else if (lc == columnLcl_memo2) doLcl_memo2_LC(info);
		else if (lc == columnLcl_memo3) doLcl_memo3_LC(info);
		else if (lc == columnLcl_ins_usr_id) doLcl_ins_usr_id_LC(info);
		else if (lc == columnLcl_ins_usr_nm) doLcl_ins_usr_nm_LC(info);
		else if (lc == columnLcl_ins_ts) doLcl_ins_ts_LC(info);
		else if (lc == columnLcl_ins_func_id) doLcl_ins_func_id_LC(info);
		else if (lc == columnLcl_ins_func_nm) doLcl_ins_func_nm_LC(info);
		else if (lc == columnLcl_upd_cntr) doLcl_upd_cntr_LC(info);
		else if (lc == columnLcl_upd_usr_id) doLcl_upd_usr_id_LC(info);
		else if (lc == columnLcl_upd_usr_nm) doLcl_upd_usr_nm_LC(info);
		else if (lc == columnLcl_upd_ts) doLcl_upd_ts_LC(info);
		else if (lc == columnLcl_upd_func_id) doLcl_upd_func_id_LC(info);
		else if (lc == columnLcl_upd_func_nm) doLcl_upd_func_nm_LC(info);
		else if (lc == columnLcl_upd_srv_req_no) doLcl_upd_srv_req_no_LC(info);
	}

	/**
	 * [Mst]パネルの[mst_set_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doMst_mst_set_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_ptn_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_ptn_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_pre_word]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_pre_word_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm_lcl]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_lcl_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_row_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_row_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_seq]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_seq_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[rpt_tgt_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_rpt_tgt_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[cost_io_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_cost_io_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[asst_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_asst_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[qty_unit_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_qty_unit_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[alc_ac_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_alc_ac_grp_nm3_LC(MCEventInfo info){
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
	 * [Dtl]パネルの[itm_grp_cd1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm1_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm2_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm3_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm4]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm4_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm5]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm5_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm6]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm6_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm7]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm7_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm8]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm8_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm9]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm9_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_cd10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_cd10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[itm_grp_nm10]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_itm_grp_nm10_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[direct_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_direct_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[var_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_var_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_cd_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[expns_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_expns_nm_LC(MCEventInfo info){
	}

	/**
	 * [Dtl]パネルの[sample]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtl_sample_LC(MCEventInfo info){
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
	 * [Lcl]パネルの[rpt_ptn_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_ptn_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[lcl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_lcl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[rpt_row_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_rpt_row_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Lcl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doLcl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Cnd_rpt_ptn_cd]の作成メソッド
	 */
	public MCList getCnd_rpt_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[Hdr_rpt_ptn_cd]の作成メソッド
	 */
	public MCList getHdr_rpt_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptPtnNotInRptConf(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rpt_ptn_cd]の作成メソッド
	 */
	public MCList getDtl_rpt_ptn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptPtn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_rpt_tgt_typ]の作成メソッド
	 */
	public MCList getDtl_rpt_tgt_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getRptTgtTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_cost_io_typ]の作成メソッド
	 */
	public MCList getDtl_cost_io_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getCostIoTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_asst_typ]の作成メソッド
	 */
	public MCList getDtl_asst_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAsstTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_qty_unit_typ]の作成メソッド
	 */
	public MCList getDtl_qty_unit_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getQtyUnitTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_grp_cd1]の作成メソッド
	 */
	public MCList getDtl_alc_ac_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_grp_cd2]の作成メソッド
	 */
	public MCList getDtl_alc_ac_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_grp_cd3]の作成メソッド
	 */
	public MCList getDtl_alc_ac_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAcGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_alc_ac_cd]の作成メソッド
	 */
	public MCList getDtl_alc_ac_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAlcAc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_slip_typ]の作成メソッド
	 */
	public MCList getDtl_ac_slip_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcSlipTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_ac_rsn_cd]の作成メソッド
	 */
	public MCList getDtl_ac_rsn_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getAcRsn(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_jnl_cd]の作成メソッド
	 */
	public MCList getDtl_itm_jnl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmJnl(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd1]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp1(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd2]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp2(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd3]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd4]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd4(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp4(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd5]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd5(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp5(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd6]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd6(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp6(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd7]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd7(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp7(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd8]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd8(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp8(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd9]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd9(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp9(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_itm_grp_cd10]の作成メソッド
	 */
	public MCList getDtl_itm_grp_cd10(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmGrp10(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_expns_typ]の作成メソッド
	 */
	public MCList getDtl_expns_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpnsTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_direct_typ]の作成メソッド
	 */
	public MCList getDtl_direct_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDirectTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_var_typ]の作成メソッド
	 */
	public MCList getDtl_var_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getVarTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_expns_grp_cd]の作成メソッド
	 */
	public MCList getDtl_expns_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpnsGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnDtl_expns_cd]の作成メソッド
	 */
	public MCList getDtl_expns_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getExpns(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnLcl_lcl_cd]の作成メソッド
	 */
	public MCList getLcl_lcl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLocaleEntry(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABGL0420.Srch01")) {
			return new MA_MABGL0420_Srch01Bridge();
		}
		if (id.equals("MA.MABGL0420.Upd01")) {
			return new MA_MABGL0420_Upd01Bridge();
		}
		if (id.equals("MA.MABGL0420.Del01")) {
			return new MA_MABGL0420_Del01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABGL0420_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0420_Srch01;

		/** コンストラクタ */
		protected MA_MABGL0420_Srch01Bridge() {
			p_MA_MABGL0420_Srch01 = new MCParam(PDef.MA_MABGL0420_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0420_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABG.MABGP0420.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0420.DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0420.LclR.class));

			p_MA_MABGL0420_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0420_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0420_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0420_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0420_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABG.MABGP0420.CndR up0() {
			return (mcframe.clientMABG.MABGP0420.CndR)up(0);
		}

		protected MCList<mcframe.clientMABG.MABGP0420.DtlR> down0() {
			return (MCList<mcframe.clientMABG.MABGP0420.DtlR>)down(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0420.LclR> down1() {
			return (MCList<mcframe.clientMABG.MABGP0420.LclR>)down(1);
		}

		protected void setupDownParam() {
			p_MA_MABGL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0420.DtlR.class));
			p_MA_MABGL0420_Srch01.addDownBlock(MCList.create(mcframe.clientMABG.MABGP0420.LclR.class));
		}
		protected MCParam param() {
			return p_MA_MABGL0420_Srch01;
		}

		protected void show() {
			setDtlL((MCList<mcframe.clientMABG.MABGP0420.DtlR>)p_MA_MABGL0420_Srch01.getContainerParam().getDownBlock(0));
			setLclAllL((MCList<mcframe.clientMABG.MABGP0420.LclR>)p_MA_MABGL0420_Srch01.getContainerParam().getDownBlock(1));
		}

		protected void clear() {
			getDtlL().clear();
			getLclAllL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
	}
	/**
	 * [MA_MABGL0420_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0420_Upd01;

		/** コンストラクタ */
		protected MA_MABGL0420_Upd01Bridge() {
			p_MA_MABGL0420_Upd01 = new MCParam(PDef.MA_MABGL0420_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0420_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0420.DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0420.LclR.class));
			// Down

			p_MA_MABGL0420_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0420_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0420_Upd01.addUpBlock(getDtlL().shallowClone());
			p_MA_MABGL0420_Upd01.addUpBlock(getLclAllL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0420_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0420_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0420.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0420.DtlR>)up(0);
		}
		protected MCList<mcframe.clientMABG.MABGP0420.LclR> up1() {
			return (MCList<mcframe.clientMABG.MABGP0420.LclR>)up(1);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0420_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getDtlL());
			result.add(getLclAllL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
	/**
	 * [MA_MABGL0420_Del01]の定型処理のInnerClass
	 */
	protected class MA_MABGL0420_Del01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABGL0420_Del01;

		/** コンストラクタ */
		protected MA_MABGL0420_Del01Bridge() {
			p_MA_MABGL0420_Del01 = new MCParam(PDef.MA_MABGL0420_Del01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABGL0420_Del01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABG.MABGP0420.DtlR.class));
			// Down

			p_MA_MABGL0420_Del01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABGL0420_Del01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABGL0420_Del01.addUpBlock(getDtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABGL0420_Del01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABGL0420_Del01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABG.MABGP0420.DtlR> up0() {
			return (MCList<mcframe.clientMABG.MABGP0420.DtlR>)up(0);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABGL0420_Del01;
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