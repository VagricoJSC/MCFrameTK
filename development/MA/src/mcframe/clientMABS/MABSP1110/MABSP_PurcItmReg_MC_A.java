package mcframe.clientMABS.MABSP1110;

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
import mcframe.clientMABS.MABSP1110.MABSP_PurcItmReg_MC.MA_MABSL1110_Srch01Caller;
import mcframe.clientMABS.MABSP1110.MABSP_PurcItmReg_MC.MA_MABSL1110_Upd01Caller;

/**
 * 画面"MABSP_PurcItmReg"パネルクラスです。<p>
 *
 * 購買品関連の検索、更新を行います。<br>
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract public class MABSP_PurcItmReg_MC_A extends mcframe.clientMAUD.MAUDP1010.MAUDP_RLBase{
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
	public static final String SCREEN_ID = "MABSP1110";

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
	 * UPD,Create/Modify,0;REF,View,3 UPD,登録・訂正する,0;REF,参照する,3.<p>
	 *
	 */
	public MCButtonGroup Cnd_ope_Group = null;
	public MCRadioButton Cnd_ope_UPD = null;
	public MCRadioButton Cnd_ope_REF = null;
	public mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H Cnd_dt_PPanel;
	public MCDateField Cnd_st_dt_fr;	// [Cnd]の[dt.st_dt_fr]を[Cnd_st_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_st_dt_to;	// [Cnd]の[dt.st_dt_to]を[Cnd_st_dt_to]としてエイリアス定義。
	public MCDateField Cnd_end_dt_fr;	// [Cnd]の[dt.end_dt_fr]を[Cnd_end_dt_fr]としてエイリアス定義。
	public MCDateField Cnd_end_dt_to;	// [Cnd]の[dt.end_dt_to]を[Cnd_end_dt_to]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Cnd_itm_PPanel;
	public MCTextField Cnd_itm_cd;	// [Cnd]の[itm.itm_cd]を[Cnd_itm_cd]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub1;	// [Cnd]の[itm.itm_sub1]を[Cnd_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub2;	// [Cnd]の[itm.itm_sub2]を[Cnd_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Cnd_itm_sub3;	// [Cnd]の[itm.itm_sub3]を[Cnd_itm_sub3]としてエイリアス定義。
	public MCTextField Cnd_itm_nm;	// [Cnd]の[itm.itm_nm]を[Cnd_itm_nm]としてエイリアス定義。
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
	// [Tbl]ブロックの項目のField定義
	// [Hdr]ブロック関連のField定義
	public MCPanel HdrPanel = null;
	public MCTitledBorder HdrTitledBorder = null;
	// [Hdr]ブロックの項目のField定義
	public mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H Hdr_itm_p_PPanel;
	public MCTextField Hdr_itm_cd;	// [Hdr]の[itm_p.itm_cd]を[Hdr_itm_cd]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub1;	// [Hdr]の[itm_p.itm_sub1]を[Hdr_itm_sub1]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub2;	// [Hdr]の[itm_p.itm_sub2]を[Hdr_itm_sub2]としてエイリアス定義。
	public MCTextComboBox Hdr_itm_sub3;	// [Hdr]の[itm_p.itm_sub3]を[Hdr_itm_sub3]としてエイリアス定義。
	public MCTextField Hdr_itm_nm;	// [Hdr]の[itm_p.itm_nm]を[Hdr_itm_nm]としてエイリアス定義。
	public MCLabel Hdr_unit_cd_Label = null;
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public MCTextField Hdr_unit_cd = null;
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public MCTextField Hdr_unit_nm = null;
	public MCLabel Hdr_stk_mng_typ_Label = null;
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public MCTextField Hdr_stk_mng_typ = null;
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public MCTextField Hdr_stk_mng_typ_nm = null;
	public MCLabel Hdr_asset_mng_typ_Label = null;
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public MCTextField Hdr_asset_mng_typ = null;
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public MCTextField Hdr_asset_mng_typ_nm = null;
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumberField Hdr_dec_place = null;
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public MCCheckBox Hdr_sundry_itm_flg = null;
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno1_mng_typ = null;
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno2_mng_typ = null;
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno3_mng_typ = null;
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public MCTextField Hdr_sno4_mng_typ = null;
	/**
	 * Purchase 購買.<p>
	 *
	 */
	public MCLabel Hdr_purc_lbl = null;
	/**
	 * For purchasing 購買対象.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_flg = null;
	/**
	 * Purchase configured 購買設定済.<p>
	 *
	 */
	public MCCheckBox Hdr_purc_input_flg = null;
	/**
	 * Update 更新する.<p>
	 *
	 */
	public MCButton Hdr_upd = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumberField Hdr_upd_cntr = null;
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCCheckBox Hdr_check = null;
	// [DtlTab]ブロック関連のField定義
	public MCPanel DtlTabPanel = null;
	public MCTabbedPane DtlTabTab = null;
	// [DtlTab]ブロックの項目のField定義
	// [Wrk1]ブロック関連のField定義
	public MCPanel Wrk1Panel = null;
	// [Wrk1]ブロックの項目のField定義
	// [Wrk1SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk1SetDtHdrPanel = null;
	// [Wrk1SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk1SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk1SetDtHdr_st_dt = null;
	public MCLabel Wrk1SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk1SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk1SetDtHdr_set_dt = null;
	// [Wrk1Dtl]ブロック関連のField定義
	public MCPanel Wrk1DtlPanel = null;
	public MCScrollPane Wrk1DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk1DtlR> Wrk1DtlTable = null;
	// [Wrk1Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk1Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_itm_cd;// [Wrk1Dtl]の[itm_p.itm_cd]を[columnWrk1Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub1;// [Wrk1Dtl]の[itm_p.itm_sub1]を[columnWrk1Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub2;// [Wrk1Dtl]の[itm_p.itm_sub2]を[columnWrk1Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_itm_sub3;// [Wrk1Dtl]の[itm_p.itm_sub3]を[columnWrk1Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_wg_nm = null;
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sppl_nm = null;
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_maker_cd = null;
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_maker_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk1Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_st_dt_key;// [Wrk1Dtl]の[dt_p.st_dt_key]を[columnWrk1Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_st_dt;// [Wrk1Dtl]の[dt_p.st_dt]を[columnWrk1Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_end_dt;// [Wrk1Dtl]の[dt_p.end_dt]を[columnWrk1Dtl_end_dt]としてエイリアス定義。
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_id_typ = null;
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_id_typ_nm = null;
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_purc_lt_add_qty_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_purc_lt_add_qty;// [Wrk1Dtl]の[purc_lt_add_qty_p.qty]を[columnWrk1Dtl_purc_lt_add_qty]としてエイリアス定義。
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_basis_typ = null;
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_purc_basis_typ_nm = null;
	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_accpt_insp_lt = null;
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_buf_lt = null;
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ord_fix_pd = null;
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_day_week_typ = null;
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_day_week_typ_nm = null;
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_sz_week = null;
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_lot_sz_pd = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_min_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_min_lot_qty;// [Wrk1Dtl]の[min_lot_qty_p.qty]を[columnWrk1Dtl_min_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_batch_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_batch_lot_qty;// [Wrk1Dtl]の[batch_lot_qty_p.qty]を[columnWrk1Dtl_batch_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk1Dtl_max_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_max_lot_qty;// [Wrk1Dtl]の[max_lot_qty_p.qty]を[columnWrk1Dtl_max_lot_qty]としてエイリアス定義。
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_max_order = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_prio = null;
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_order_ratio = null;
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_pre_po_tgt_flg = null;
	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_wg_cd = null;
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_rqst_wg_nm = null;
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_po_batch_flg = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Wrk1Dtl_sno_p_PPanel;
	public MCColumnConfig columnWrk1Dtl_sno1;// [Wrk1Dtl]の[sno_p.sno1]を[columnWrk1Dtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno2;// [Wrk1Dtl]の[sno_p.sno2]を[columnWrk1Dtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno3;// [Wrk1Dtl]の[sno_p.sno3]を[columnWrk1Dtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnWrk1Dtl_sno4;// [Wrk1Dtl]の[sno_p.sno4]を[columnWrk1Dtl_sno4]としてエイリアス定義。
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_not_mrp_flg = null;
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_cost_ratio = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk1Dtl_del_ts = null;
	// [Wrk1DtlBtn]ブロック関連のField定義
	public MCPanel Wrk1DtlBtnPanel = null;
	// [Wrk1DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk1DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk1DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk1DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk1DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk1DtlBtn_rcopy = null;
	// [Wrk2]ブロック関連のField定義
	public MCPanel Wrk2Panel = null;
	// [Wrk2]ブロックの項目のField定義
	// [Wrk2SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk2SetDtHdrPanel = null;
	// [Wrk2SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk2SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk2SetDtHdr_st_dt = null;
	public MCLabel Wrk2SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk2SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk2SetDtHdr_set_dt = null;
	// [Wrk2Dtl]ブロック関連のField定義
	public MCPanel Wrk2DtlPanel = null;
	public MCScrollPane Wrk2DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk2DtlR> Wrk2DtlTable = null;
	// [Wrk2Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk2Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_itm_cd;// [Wrk2Dtl]の[itm_p.itm_cd]を[columnWrk2Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub1;// [Wrk2Dtl]の[itm_p.itm_sub1]を[columnWrk2Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub2;// [Wrk2Dtl]の[itm_p.itm_sub2]を[columnWrk2Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_itm_sub3;// [Wrk2Dtl]の[itm_p.itm_sub3]を[columnWrk2Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_wg_nm = null;
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_rqst_loc_cd = null;
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_rqst_loc_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk2Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_st_dt_key;// [Wrk2Dtl]の[dt_p.st_dt_key]を[columnWrk2Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_st_dt;// [Wrk2Dtl]の[dt_p.st_dt]を[columnWrk2Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_end_dt;// [Wrk2Dtl]の[dt_p.end_dt]を[columnWrk2Dtl_end_dt]としてエイリアス定義。
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_buf_lt = null;
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ord_fix_pd = null;
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sz_day_week_typ = null;
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sz_day_week_typ_nm = null;
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_sz_week = null;
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_lot_sz_pd = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk2Dtl_min_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_min_lot_qty;// [Wrk2Dtl]の[min_lot_qty_p.qty]を[columnWrk2Dtl_min_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk2Dtl_batch_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_batch_lot_qty;// [Wrk2Dtl]の[batch_lot_qty_p.qty]を[columnWrk2Dtl_batch_lot_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk2Dtl_max_lot_qty_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_max_lot_qty;// [Wrk2Dtl]の[max_lot_qty_p.qty]を[columnWrk2Dtl_max_lot_qty]としてエイリアス定義。
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_max_order = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_prio = null;
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_order_ratio = null;
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_pre_po_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D Wrk2Dtl_sno_p_PPanel;
	public MCColumnConfig columnWrk2Dtl_sno1;// [Wrk2Dtl]の[sno_p.sno1]を[columnWrk2Dtl_sno1]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno2;// [Wrk2Dtl]の[sno_p.sno2]を[columnWrk2Dtl_sno2]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno3;// [Wrk2Dtl]の[sno_p.sno3]を[columnWrk2Dtl_sno3]としてエイリアス定義。
	public MCColumnConfig columnWrk2Dtl_sno4;// [Wrk2Dtl]の[sno_p.sno4]を[columnWrk2Dtl_sno4]としてエイリアス定義。
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_not_mrp_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk2Dtl_del_ts = null;
	// [Wrk2DtlBtn]ブロック関連のField定義
	public MCPanel Wrk2DtlBtnPanel = null;
	// [Wrk2DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk2DtlBtn_rcopy = null;
	// [Wrk3]ブロック関連のField定義
	public MCPanel Wrk3Panel = null;
	// [Wrk3]ブロックの項目のField定義
	// [Wrk3Dtl]ブロック関連のField定義
	public MCPanel Wrk3DtlPanel = null;
	public MCScrollPane Wrk3DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk3DtlR> Wrk3DtlTable = null;
	// [Wrk3Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk3Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk3Dtl_itm_cd;// [Wrk3Dtl]の[itm_p.itm_cd]を[columnWrk3Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub1;// [Wrk3Dtl]の[itm_p.itm_sub1]を[columnWrk3Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub2;// [Wrk3Dtl]の[itm_p.itm_sub2]を[columnWrk3Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk3Dtl_itm_sub3;// [Wrk3Dtl]の[itm_p.itm_sub3]を[columnWrk3Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_cd = null;
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_loc_grp_nm = null;
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_prio = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk3Dtl_del_ts = null;
	// [Wrk3DtlBtn]ブロック関連のField定義
	public MCPanel Wrk3DtlBtnPanel = null;
	// [Wrk3DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk3DtlBtn_rcopy = null;
	// [Wrk4]ブロック関連のField定義
	public MCPanel Wrk4Panel = null;
	// [Wrk4]ブロックの項目のField定義
	// [Wrk4Dtl]ブロック関連のField定義
	public MCPanel Wrk4DtlPanel = null;
	public MCScrollPane Wrk4DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk4DtlR> Wrk4DtlTable = null;
	// [Wrk4Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk4Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk4Dtl_itm_cd;// [Wrk4Dtl]の[itm_p.itm_cd]を[columnWrk4Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub1;// [Wrk4Dtl]の[itm_p.itm_sub1]を[columnWrk4Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub2;// [Wrk4Dtl]の[itm_p.itm_sub2]を[columnWrk4Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk4Dtl_itm_sub3;// [Wrk4Dtl]の[itm_p.itm_sub3]を[columnWrk4Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Location cd. (Destination) 移動先場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_to_loc_cd = null;
	/**
	 * Destination location name 移動先場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_to_loc_nm = null;
	/**
	 * Destination WG cd. 移動先ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_to_wg_cd = null;
	/**
	 * Destination WG name 移動先ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_to_wg_nm = null;
	/**
	 * Destination location distribution group cd. 移動先物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_to_lg_grp_cd = null;
	/**
	 * Source location cd. 移動元場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_fr_loc_cd = null;
	/**
	 * Source location name 移動元場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_fr_loc_nm = null;
	/**
	 * Source WG cd. 移動元ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_fr_wg_cd = null;
	/**
	 * Source distribution group cd. 移動元物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_fr_lg_grp_cd = null;
	/**
	 * Allocation priority 引当優先順.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_prio = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk4Dtl_xfr_lot_unit_qty_p_PPanel;
	public MCColumnConfig columnWrk4Dtl_xfr_lot_unit_qty;// [Wrk4Dtl]の[xfr_lot_unit_qty_p.qty]を[columnWrk4Dtl_xfr_lot_unit_qty]としてエイリアス定義。
	/**
	 * Specify input location 投入場所指定.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_in_loc_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk4Dtl_del_ts = null;
	// [Wrk4DtlBtn]ブロック関連のField定義
	public MCPanel Wrk4DtlBtnPanel = null;
	// [Wrk4DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk4DtlBtn_rcopy = null;
	// [Wrk5]ブロック関連のField定義
	public MCPanel Wrk5Panel = null;
	// [Wrk5]ブロックの項目のField定義
	// [Wrk5SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk5SetDtHdrPanel = null;
	// [Wrk5SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk5SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk5SetDtHdr_st_dt = null;
	public MCLabel Wrk5SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk5SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk5SetDtHdr_set_dt = null;
	// [Wrk5Dtl]ブロック関連のField定義
	public MCPanel Wrk5DtlPanel = null;
	public MCScrollPane Wrk5DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk5DtlR> Wrk5DtlTable = null;
	// [Wrk5Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk5Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_itm_cd;// [Wrk5Dtl]の[itm_p.itm_cd]を[columnWrk5Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub1;// [Wrk5Dtl]の[itm_p.itm_sub1]を[columnWrk5Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub2;// [Wrk5Dtl]の[itm_p.itm_sub2]を[columnWrk5Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_itm_sub3;// [Wrk5Dtl]の[itm_p.itm_sub3]を[columnWrk5Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_cd = null;
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_nm = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_loc_grp_nm = null;
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_alloc_grp_cd = null;
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_alloc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk5Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_st_dt_key;// [Wrk5Dtl]の[dt_p.st_dt_key]を[columnWrk5Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_st_dt;// [Wrk5Dtl]の[dt_p.st_dt]を[columnWrk5Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_end_dt;// [Wrk5Dtl]の[dt_p.end_dt]を[columnWrk5Dtl_end_dt]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_buf_qty_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_buf_qty;// [Wrk5Dtl]の[buf_qty_p.qty]を[columnWrk5Dtl_buf_qty]としてエイリアス定義。
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_rord_stk_qty_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_rord_stk_qty;// [Wrk5Dtl]の[rord_stk_qty_p.qty]を[columnWrk5Dtl_rord_stk_qty]としてエイリアス定義。
	/**
	 * Include GI schedule 出庫予定含む.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_schd_flg = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk5Dtl_rord_rqst_qty_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_rord_rqst_qty;// [Wrk5Dtl]の[rord_rqst_qty_p.qty]を[columnWrk5Dtl_rord_rqst_qty]としてエイリアス定義。
	/**
	 * Lot sizing ロットサイジング.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_lot_sizing_flg = null;
	/**
	 * GI location at reorder point cd. 発注点出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_loc_cd = null;
	/**
	 * GI location at reorder point name 発注点出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_loc_nm = null;
	/**
	 * For GI rack/line at reorder point 発注点出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln1_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln1_p.str_ln_cd]を[columnWrk5Dtl_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln1_p.str_ln_nm]を[columnWrk5Dtl_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln1_p.str_ln_cd_none_flg]を[columnWrk5Dtl_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Input item GI location cd. 投入品出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_loc_cd = null;
	/**
	 * Input item GI location name 投入品出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_loc_nm = null;
	/**
	 * For input item GI rack/line 投入品出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln2_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln2_p.str_ln_cd]を[columnWrk5Dtl_inpt_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln2_p.str_ln_nm]を[columnWrk5Dtl_inpt_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln2_p.str_ln_cd_none_flg]を[columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Shipping item GI location cd. 出荷品出庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_loc_cd = null;
	/**
	 * Shipping item GI location name 出荷品出庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_loc_nm = null;
	/**
	 * For shipping item GI rack/line 出荷品出庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_tgt_flg = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk5Dtl_str_ln3_p_PPanel;
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_cd;// [Wrk5Dtl]の[str_ln3_p.str_ln_cd]を[columnWrk5Dtl_ship_gi_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_nm;// [Wrk5Dtl]の[str_ln3_p.str_ln_nm]を[columnWrk5Dtl_ship_gi_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk5Dtl_ship_gi_str_ln_cd_none_flg;// [Wrk5Dtl]の[str_ln3_p.str_ln_cd_none_flg]を[columnWrk5Dtl_ship_gi_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk5Dtl_del_ts = null;
	// [Wrk5DtlBtn]ブロック関連のField定義
	public MCPanel Wrk5DtlBtnPanel = null;
	// [Wrk5DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk5DtlBtn_rcopy = null;
	// [Wrk6]ブロック関連のField定義
	public MCPanel Wrk6Panel = null;
	// [Wrk6]ブロックの項目のField定義
	// [Wrk6SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk6SetDtHdrPanel = null;
	// [Wrk6SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk6SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk6SetDtHdr_st_dt = null;
	public MCLabel Wrk6SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk6SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk6SetDtHdr_set_dt = null;
	// [Wrk6Dtl]ブロック関連のField定義
	public MCPanel Wrk6DtlPanel = null;
	public MCScrollPane Wrk6DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk6DtlR> Wrk6DtlTable = null;
	// [Wrk6Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk6Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_itm_cd;// [Wrk6Dtl]の[itm_p.itm_cd]を[columnWrk6Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub1;// [Wrk6Dtl]の[itm_p.itm_sub1]を[columnWrk6Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub2;// [Wrk6Dtl]の[itm_p.itm_sub2]を[columnWrk6Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_itm_sub3;// [Wrk6Dtl]の[itm_p.itm_sub3]を[columnWrk6Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_sppl_cd = null;
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_sppl_nm = null;
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_lg_grp_cd = null;
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_lg_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk6Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_st_dt_key;// [Wrk6Dtl]の[dt_p.st_dt_key]を[columnWrk6Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_st_dt;// [Wrk6Dtl]の[dt_p.st_dt]を[columnWrk6Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk6Dtl_end_dt;// [Wrk6Dtl]の[dt_p.end_dt]を[columnWrk6Dtl_end_dt]としてエイリアス定義。
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_purc_lt = null;
	public mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D Wrk6Dtl_purc_lt_add_qty_p_PPanel;
	public MCColumnConfig columnWrk6Dtl_purc_lt_add_qty;// [Wrk6Dtl]の[purc_lt_add_qty_p.qty]を[columnWrk6Dtl_purc_lt_add_qty]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk6Dtl_del_ts = null;
	// [Wrk6DtlBtn]ブロック関連のField定義
	public MCPanel Wrk6DtlBtnPanel = null;
	// [Wrk6DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk6DtlBtn_rcopy = null;
	// [Wrk7]ブロック関連のField定義
	public MCPanel Wrk7Panel = null;
	// [Wrk7]ブロックの項目のField定義
	// [Wrk7SetDtHdr]ブロック関連のField定義
	public MCPanel Wrk7SetDtHdrPanel = null;
	// [Wrk7SetDtHdr]ブロックの項目のField定義
	public MCLabel Wrk7SetDtHdr_st_dt_Label = null;
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDateField Wrk7SetDtHdr_st_dt = null;
	public MCLabel Wrk7SetDtHdr_end_dt_Label = null;
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDateField Wrk7SetDtHdr_end_dt = null;
	/**
	 * Applied date update 適用日反映.<p>
	 *
	 */
	public MCButton Wrk7SetDtHdr_set_dt = null;
	// [Wrk7Dtl]ブロック関連のField定義
	public MCPanel Wrk7DtlPanel = null;
	public MCScrollPane Wrk7DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk7DtlR> Wrk7DtlTable = null;
	// [Wrk7Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk7Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk7Dtl_itm_cd;// [Wrk7Dtl]の[itm_p.itm_cd]を[columnWrk7Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub1;// [Wrk7Dtl]の[itm_p.itm_sub1]を[columnWrk7Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub2;// [Wrk7Dtl]の[itm_p.itm_sub2]を[columnWrk7Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_itm_sub3;// [Wrk7Dtl]の[itm_p.itm_sub3]を[columnWrk7Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_bp_cd = null;
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_bp_nm = null;
	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_sppl_flg = null;
	/**
	 * Customer 得意先.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_cst_flg = null;
	public mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D Wrk7Dtl_dt_p_PPanel;
	public MCColumnConfig columnWrk7Dtl_st_dt_key;// [Wrk7Dtl]の[dt_p.st_dt_key]を[columnWrk7Dtl_st_dt_key]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_st_dt;// [Wrk7Dtl]の[dt_p.st_dt]を[columnWrk7Dtl_st_dt]としてエイリアス定義。
	public MCColumnConfig columnWrk7Dtl_end_dt;// [Wrk7Dtl]の[dt_p.end_dt]を[columnWrk7Dtl_end_dt]としてエイリアス定義。
	/**
	 * BP item cd. 取引先品目ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_bp_itm_cd = null;
	/**
	 * BP item name 取引先品名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_bp_itm_nm = null;
	/**
	 * Default デフォルト.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_def_flg = null;
	/**
	 * Purchase forecast group cd. 購買内示グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_pf_grp_cd = null;
	/**
	 * Purchase forecast group name 購買内示グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_pf_grp_nm = null;
	/**
	 * Purchase forecast firm 購買内示確定.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_pf_fix_flg = null;
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_purc_commit_flg = null;
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk7Dtl_del_ts = null;
	// [Wrk7DtlBtn]ブロック関連のField定義
	public MCPanel Wrk7DtlBtnPanel = null;
	// [Wrk7DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk7DtlBtn_rcopy = null;
	// [Wrk8]ブロック関連のField定義
	public MCPanel Wrk8Panel = null;
	// [Wrk8]ブロックの項目のField定義
	// [Wrk8Dtl]ブロック関連のField定義
	public MCPanel Wrk8DtlPanel = null;
	public MCScrollPane Wrk8DtlScrollPane = null;
	public MCTable2<mcframe.clientMABS.MABSP1110.Wrk8DtlR> Wrk8DtlTable = null;
	// [Wrk8Dtl]ブロックの項目のField定義
	/**
	 * Select 選択.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_check = null;
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_del_flg = null;
	public mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D Wrk8Dtl_itm_p_PPanel;
	public MCColumnConfig columnWrk8Dtl_itm_cd;// [Wrk8Dtl]の[itm_p.itm_cd]を[columnWrk8Dtl_itm_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk8Dtl_itm_sub1;// [Wrk8Dtl]の[itm_p.itm_sub1]を[columnWrk8Dtl_itm_sub1]としてエイリアス定義。
	public MCColumnConfig columnWrk8Dtl_itm_sub2;// [Wrk8Dtl]の[itm_p.itm_sub2]を[columnWrk8Dtl_itm_sub2]としてエイリアス定義。
	public MCColumnConfig columnWrk8Dtl_itm_sub3;// [Wrk8Dtl]の[itm_p.itm_sub3]を[columnWrk8Dtl_itm_sub3]としてエイリアス定義。
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_loc_cd = null;
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_loc_nm = null;
	/**
	 * For GR rack/line 入庫棚・ライン対象.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_str_ln_tgt_flg = null;
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_wg_cd = null;
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_wg_nm = null;
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_loc_grp_cd = null;
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_loc_grp_nm = null;
	public mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D Wrk8Dtl_str_ln_p_PPanel;
	public MCColumnConfig columnWrk8Dtl_str_ln_cd;// [Wrk8Dtl]の[str_ln_p.str_ln_cd]を[columnWrk8Dtl_str_ln_cd]としてエイリアス定義。
	public MCColumnConfig columnWrk8Dtl_str_ln_nm;// [Wrk8Dtl]の[str_ln_p.str_ln_nm]を[columnWrk8Dtl_str_ln_nm]としてエイリアス定義。
	public MCColumnConfig columnWrk8Dtl_str_ln_cd_none_flg;// [Wrk8Dtl]の[str_ln_p.str_ln_cd_none_flg]を[columnWrk8Dtl_str_ln_cd_none_flg]としてエイリアス定義。
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_memo1 = null;
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_memo2 = null;
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_memo3 = null;
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_ins_usr_id = null;
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_ins_usr_nm = null;
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_ins_ts = null;
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_ins_func_id = null;
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_ins_func_nm = null;
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_cntr = null;
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_usr_id = null;
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_usr_nm = null;
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_ts = null;
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_func_id = null;
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_func_nm = null;
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_upd_srv_req_no = null;
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_del_usr_id = null;
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_del_usr_nm = null;
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCColumnConfig columnWrk8Dtl_del_ts = null;
	// [Wrk8DtlBtn]ブロック関連のField定義
	public MCPanel Wrk8DtlBtnPanel = null;
	// [Wrk8DtlBtn]ブロックの項目のField定義
	/**
	 * Select all 全選択.<p>
	 *
	 */
	public MCButton Wrk8DtlBtn_select_all = null;
	/**
	 * Release all 全解除.<p>
	 *
	 */
	public MCButton Wrk8DtlBtn_deselect_all = null;
	/**
	 * Add row 行追加.<p>
	 *
	 */
	public MCButton Wrk8DtlBtn_radd = null;
	/**
	 * Delete row 行削除.<p>
	 *
	 */
	public MCButton Wrk8DtlBtn_rdel = null;
	/**
	 * Copy row 行コピー.<p>
	 *
	 */
	public MCButton Wrk8DtlBtn_rcopy = null;
	// [Btn]ブロック関連のField定義
	public MCPanel BtnPanel = null;
	// [Btn]ブロックの項目のField定義
	/**
	 * Purchase unit price master entry 購買単価マスタ登録.<p>
	 *
	 */
	public MCButton Btn_open_MABSP0120 = null;
	/** [SRCH]モードを表す定数 */
	public static final String SRCH = "SRCH";
	/** [UPD]モードを表す定数 */
	public static final String UPD = "UPD";
	/** [FIX]モードを表す定数 */
	public static final String FIX = "FIX";
	/** [REF]モードを表す定数 */
	public static final String REF = "REF";

	/** 
	 * ステータスの配列<p>
	 *
	 * 画面インスタンスから参照する場合には{@link #getStatusSet()}を使用してください。
	 */
	public static final String[] statusArray = new String[]{SRCH, UPD, FIX, REF};

	/** 
	 * 有効になっているステータス
	 *
	 * @deprecated 参照する場合には{@link #getStatus()}を使用してください。
	 */
	@Deprecated
	protected String status = null;
	
	/** [MA_MABSL1110_Srch01]のCallerの作成 */
	protected MABSP_PurcItmReg_MC.MA_MABSL1110_Srch01Caller createMA_MABSL1110_Srch01() {
		MABSP_PurcItmReg_MC.MA_MABSL1110_Srch01Caller<MABSP_PurcItmReg, MA_MABSL1110_Srch01Bridge>
		caller = ((MABSP_PurcItmReg_MC)this).new MA_MABSL1110_Srch01Caller<MABSP_PurcItmReg, MA_MABSL1110_Srch01Bridge>(
					(MABSP_PurcItmReg)this, new MA_MABSL1110_Srch01Bridge());
		return caller;
	}
	/** [MA_MABSL1110_Srch01]の呼び出し */
	protected void callMA_MABSL1110_Srch01() {
		MCCaller caller = createMA_MABSL1110_Srch01();
		caller.exec();
	}
	/** [MA_MABSL1110_Upd01]のCallerの作成 */
	protected MABSP_PurcItmReg_MC.MA_MABSL1110_Upd01Caller createMA_MABSL1110_Upd01() {
		MABSP_PurcItmReg_MC.MA_MABSL1110_Upd01Caller<MABSP_PurcItmReg, MA_MABSL1110_Upd01Bridge>
		caller = ((MABSP_PurcItmReg_MC)this).new MA_MABSL1110_Upd01Caller<MABSP_PurcItmReg, MA_MABSL1110_Upd01Bridge>(
					(MABSP_PurcItmReg)this, new MA_MABSL1110_Upd01Bridge());
		return caller;
	}
	/** [MA_MABSL1110_Upd01]の呼び出し */
	protected void callMA_MABSL1110_Upd01() {
		MCCaller caller = createMA_MABSL1110_Upd01();
		caller.exec();
	}
	/** [Cnd]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.CndR aCndR;
	/** [Hdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.HdrR aHdrR;
	/** [HdrAll]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.HdrR> aHdrAllL;
	/** [Wrk1SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR aWrk1SetDtHdrR;
	/** [Wrk1Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> aWrk1DtlL;
	/** [Wrk2SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR aWrk2SetDtHdrR;
	/** [Wrk2Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> aWrk2DtlL;
	/** [Wrk3Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> aWrk3DtlL;
	/** [Wrk4Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> aWrk4DtlL;
	/** [Wrk5SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR aWrk5SetDtHdrR;
	/** [Wrk5Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> aWrk5DtlL;
	/** [Wrk6SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR aWrk6SetDtHdrR;
	/** [Wrk6Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> aWrk6DtlL;
	/** [Wrk7SetDtHdr]ブロックのコンテナField定義 */
	private final mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR aWrk7SetDtHdrR;
	/** [Wrk7Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> aWrk7DtlL;
	/** [Wrk8Dtl]ブロックのコンテナField定義 */
	private final MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> aWrk8DtlL;

	/**
	 * 項目コピーによってaCndRを設定します。
	 *
	 * aCndRのインスタンスは変更されません。
	 *
	 * @param row CndR
	 */
	public void setCndR(mcframe.clientMABS.MABSP1110.CndR row) {
		if (row != null) {
			MCRow.copyall(getCndR(), row);
		}
	}

	/**
	 * [Cnd]ブロックのコンテナaCndRを返します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1110.CndR getCndR() {
		return aCndR;
	}

	/**
	 * aCndRを作成します。
	 *
	 * @return CndR
	 */
	public mcframe.clientMABS.MABSP1110.CndR createCndR() {
		return mcframe.clientMABS.MABSP1110.CndR.create();
	}

	/**
	 * 項目コピーによってaHdrRを設定します。
	 *
	 * aHdrRのインスタンスは変更されません。
	 *
	 * @param row HdrR
	 */
	public void setHdrR(mcframe.clientMABS.MABSP1110.HdrR row) {
		if (row != null) {
			MCRow.copyall(getHdrR(), row);
		}
	}

	/**
	 * [Hdr]ブロックのコンテナaHdrRを返します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1110.HdrR getHdrR() {
		return aHdrR;
	}

	/**
	 * aHdrRを作成します。
	 *
	 * @return HdrR
	 */
	public mcframe.clientMABS.MABSP1110.HdrR createHdrR() {
		return mcframe.clientMABS.MABSP1110.HdrR.create();
	}

	/**
	 * コピーによってaHdrAllLを設定します。
	 *
	 * aHdrAllLのインスタンスは変更されません。
	 *
	 * @param dataset HdrAllL
	 */
	public void setHdrAllL(MCList<mcframe.clientMABS.MABSP1110.HdrR> aList) {
		if (getHdrAllL() != aList) {
			getHdrAllL().setAll(aList);
		}
	}

	/**
	 * [HdrAll]ブロックのコンテナaHdrAllLを返します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.HdrR> getHdrAllL() {
		return aHdrAllL;
	}

	/**
	 * aHdrAllRを作成します。
	 *
	 * @return HdrAllR
	 */
	public mcframe.clientMABS.MABSP1110.HdrR createHdrAllR() {
		return mcframe.clientMABS.MABSP1110.HdrR.create();
	}

	/**
	 * aHdrAllLを作成します。
	 *
	 * @return HdrAllL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.HdrR> createHdrAllL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.HdrR.class);
	}

	/**
	 * 項目コピーによってaWrk1SetDtHdrRを設定します。
	 *
	 * aWrk1SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk1SetDtHdrR
	 */
	public void setWrk1SetDtHdrR(mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk1SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk1SetDtHdr]ブロックのコンテナaWrk1SetDtHdrRを返します。
	 *
	 * @return Wrk1SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR getWrk1SetDtHdrR() {
		return aWrk1SetDtHdrR;
	}

	/**
	 * aWrk1SetDtHdrRを作成します。
	 *
	 * @return Wrk1SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR createWrk1SetDtHdrR() {
		return mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk1DtlLを設定します。
	 *
	 * aWrk1DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk1DtlL
	 */
	public void setWrk1DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> aList) {
		if (getWrk1DtlL() != aList) {
			getWrk1DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk1Dtl]ブロックのコンテナaWrk1DtlLを返します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> getWrk1DtlL() {
		return aWrk1DtlL;
	}

	/**
	 * aWrk1DtlRを作成します。
	 *
	 * @return Wrk1DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk1DtlR createWrk1DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk1DtlR.create();
	}

	/**
	 * aWrk1DtlLを作成します。
	 *
	 * @return Wrk1DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> createWrk1DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.class);
	}

	/**
	 * Wrk1DtlTableを初期化します。
	 */
	protected void createWrk1DtlTable(){
		if(Wrk1DtlTable == null){
			Wrk1DtlTable = beansFactory.createTable2("Wrk1Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk2SetDtHdrRを設定します。
	 *
	 * aWrk2SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk2SetDtHdrR
	 */
	public void setWrk2SetDtHdrR(mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk2SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk2SetDtHdr]ブロックのコンテナaWrk2SetDtHdrRを返します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR getWrk2SetDtHdrR() {
		return aWrk2SetDtHdrR;
	}

	/**
	 * aWrk2SetDtHdrRを作成します。
	 *
	 * @return Wrk2SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR createWrk2SetDtHdrR() {
		return mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk2DtlLを設定します。
	 *
	 * aWrk2DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk2DtlL
	 */
	public void setWrk2DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> aList) {
		if (getWrk2DtlL() != aList) {
			getWrk2DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk2Dtl]ブロックのコンテナaWrk2DtlLを返します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> getWrk2DtlL() {
		return aWrk2DtlL;
	}

	/**
	 * aWrk2DtlRを作成します。
	 *
	 * @return Wrk2DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk2DtlR createWrk2DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk2DtlR.create();
	}

	/**
	 * aWrk2DtlLを作成します。
	 *
	 * @return Wrk2DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> createWrk2DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.class);
	}

	/**
	 * Wrk2DtlTableを初期化します。
	 */
	protected void createWrk2DtlTable(){
		if(Wrk2DtlTable == null){
			Wrk2DtlTable = beansFactory.createTable2("Wrk2Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk3DtlLを設定します。
	 *
	 * aWrk3DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk3DtlL
	 */
	public void setWrk3DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> aList) {
		if (getWrk3DtlL() != aList) {
			getWrk3DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk3Dtl]ブロックのコンテナaWrk3DtlLを返します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> getWrk3DtlL() {
		return aWrk3DtlL;
	}

	/**
	 * aWrk3DtlRを作成します。
	 *
	 * @return Wrk3DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk3DtlR createWrk3DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk3DtlR.create();
	}

	/**
	 * aWrk3DtlLを作成します。
	 *
	 * @return Wrk3DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> createWrk3DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk3DtlR.class);
	}

	/**
	 * Wrk3DtlTableを初期化します。
	 */
	protected void createWrk3DtlTable(){
		if(Wrk3DtlTable == null){
			Wrk3DtlTable = beansFactory.createTable2("Wrk3Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk4DtlLを設定します。
	 *
	 * aWrk4DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk4DtlL
	 */
	public void setWrk4DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> aList) {
		if (getWrk4DtlL() != aList) {
			getWrk4DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk4Dtl]ブロックのコンテナaWrk4DtlLを返します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> getWrk4DtlL() {
		return aWrk4DtlL;
	}

	/**
	 * aWrk4DtlRを作成します。
	 *
	 * @return Wrk4DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk4DtlR createWrk4DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk4DtlR.create();
	}

	/**
	 * aWrk4DtlLを作成します。
	 *
	 * @return Wrk4DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> createWrk4DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.class);
	}

	/**
	 * Wrk4DtlTableを初期化します。
	 */
	protected void createWrk4DtlTable(){
		if(Wrk4DtlTable == null){
			Wrk4DtlTable = beansFactory.createTable2("Wrk4Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk5SetDtHdrRを設定します。
	 *
	 * aWrk5SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk5SetDtHdrR
	 */
	public void setWrk5SetDtHdrR(mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk5SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk5SetDtHdr]ブロックのコンテナaWrk5SetDtHdrRを返します。
	 *
	 * @return Wrk5SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR getWrk5SetDtHdrR() {
		return aWrk5SetDtHdrR;
	}

	/**
	 * aWrk5SetDtHdrRを作成します。
	 *
	 * @return Wrk5SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR createWrk5SetDtHdrR() {
		return mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk5DtlLを設定します。
	 *
	 * aWrk5DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk5DtlL
	 */
	public void setWrk5DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> aList) {
		if (getWrk5DtlL() != aList) {
			getWrk5DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk5Dtl]ブロックのコンテナaWrk5DtlLを返します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> getWrk5DtlL() {
		return aWrk5DtlL;
	}

	/**
	 * aWrk5DtlRを作成します。
	 *
	 * @return Wrk5DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk5DtlR createWrk5DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk5DtlR.create();
	}

	/**
	 * aWrk5DtlLを作成します。
	 *
	 * @return Wrk5DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> createWrk5DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.class);
	}

	/**
	 * Wrk5DtlTableを初期化します。
	 */
	protected void createWrk5DtlTable(){
		if(Wrk5DtlTable == null){
			Wrk5DtlTable = beansFactory.createTable2("Wrk5Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk6SetDtHdrRを設定します。
	 *
	 * aWrk6SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk6SetDtHdrR
	 */
	public void setWrk6SetDtHdrR(mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk6SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk6SetDtHdr]ブロックのコンテナaWrk6SetDtHdrRを返します。
	 *
	 * @return Wrk6SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR getWrk6SetDtHdrR() {
		return aWrk6SetDtHdrR;
	}

	/**
	 * aWrk6SetDtHdrRを作成します。
	 *
	 * @return Wrk6SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR createWrk6SetDtHdrR() {
		return mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk6DtlLを設定します。
	 *
	 * aWrk6DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk6DtlL
	 */
	public void setWrk6DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> aList) {
		if (getWrk6DtlL() != aList) {
			getWrk6DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk6Dtl]ブロックのコンテナaWrk6DtlLを返します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> getWrk6DtlL() {
		return aWrk6DtlL;
	}

	/**
	 * aWrk6DtlRを作成します。
	 *
	 * @return Wrk6DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk6DtlR createWrk6DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk6DtlR.create();
	}

	/**
	 * aWrk6DtlLを作成します。
	 *
	 * @return Wrk6DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> createWrk6DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.class);
	}

	/**
	 * Wrk6DtlTableを初期化します。
	 */
	protected void createWrk6DtlTable(){
		if(Wrk6DtlTable == null){
			Wrk6DtlTable = beansFactory.createTable2("Wrk6Dtl.table");
		}
	}

	/**
	 * 項目コピーによってaWrk7SetDtHdrRを設定します。
	 *
	 * aWrk7SetDtHdrRのインスタンスは変更されません。
	 *
	 * @param row Wrk7SetDtHdrR
	 */
	public void setWrk7SetDtHdrR(mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR row) {
		if (row != null) {
			MCRow.copyall(getWrk7SetDtHdrR(), row);
		}
	}

	/**
	 * [Wrk7SetDtHdr]ブロックのコンテナaWrk7SetDtHdrRを返します。
	 *
	 * @return Wrk7SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR getWrk7SetDtHdrR() {
		return aWrk7SetDtHdrR;
	}

	/**
	 * aWrk7SetDtHdrRを作成します。
	 *
	 * @return Wrk7SetDtHdrR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR createWrk7SetDtHdrR() {
		return mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR.create();
	}

	/**
	 * コピーによってaWrk7DtlLを設定します。
	 *
	 * aWrk7DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk7DtlL
	 */
	public void setWrk7DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> aList) {
		if (getWrk7DtlL() != aList) {
			getWrk7DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk7Dtl]ブロックのコンテナaWrk7DtlLを返します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> getWrk7DtlL() {
		return aWrk7DtlL;
	}

	/**
	 * aWrk7DtlRを作成します。
	 *
	 * @return Wrk7DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk7DtlR createWrk7DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk7DtlR.create();
	}

	/**
	 * aWrk7DtlLを作成します。
	 *
	 * @return Wrk7DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> createWrk7DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.class);
	}

	/**
	 * Wrk7DtlTableを初期化します。
	 */
	protected void createWrk7DtlTable(){
		if(Wrk7DtlTable == null){
			Wrk7DtlTable = beansFactory.createTable2("Wrk7Dtl.table");
		}
	}

	/**
	 * コピーによってaWrk8DtlLを設定します。
	 *
	 * aWrk8DtlLのインスタンスは変更されません。
	 *
	 * @param dataset Wrk8DtlL
	 */
	public void setWrk8DtlL(MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> aList) {
		if (getWrk8DtlL() != aList) {
			getWrk8DtlL().setAll(aList);
		}
	}

	/**
	 * [Wrk8Dtl]ブロックのコンテナaWrk8DtlLを返します。
	 *
	 * @return Wrk8DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> getWrk8DtlL() {
		return aWrk8DtlL;
	}

	/**
	 * aWrk8DtlRを作成します。
	 *
	 * @return Wrk8DtlR
	 */
	public mcframe.clientMABS.MABSP1110.Wrk8DtlR createWrk8DtlR() {
		return mcframe.clientMABS.MABSP1110.Wrk8DtlR.create();
	}

	/**
	 * aWrk8DtlLを作成します。
	 *
	 * @return Wrk8DtlL
	 */
	public MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> createWrk8DtlL() {
		return MCList.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.class);
	}

	/**
	 * Wrk8DtlTableを初期化します。
	 */
	protected void createWrk8DtlTable(){
		if(Wrk8DtlTable == null){
			Wrk8DtlTable = beansFactory.createTable2("Wrk8Dtl.table");
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
		if(!MCCollectionUtil.contains(ret, getHdrR())) ret.add(getHdrR());
		if(!MCCollectionUtil.contains(ret, getHdrAllL())) ret.add(getHdrAllL());
		if(!MCCollectionUtil.contains(ret, getWrk1SetDtHdrR())) ret.add(getWrk1SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk1DtlL())) ret.add(getWrk1DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk2SetDtHdrR())) ret.add(getWrk2SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk2DtlL())) ret.add(getWrk2DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk3DtlL())) ret.add(getWrk3DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk4DtlL())) ret.add(getWrk4DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk5SetDtHdrR())) ret.add(getWrk5SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk5DtlL())) ret.add(getWrk5DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk6SetDtHdrR())) ret.add(getWrk6SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk6DtlL())) ret.add(getWrk6DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk7SetDtHdrR())) ret.add(getWrk7SetDtHdrR());
		if(!MCCollectionUtil.contains(ret, getWrk7DtlL())) ret.add(getWrk7DtlL());
		if(!MCCollectionUtil.contains(ret, getWrk8DtlL())) ret.add(getWrk8DtlL());
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
		if(aCnt == getHdrAllL()) return "HdrAll";
		if(aCnt == getWrk1SetDtHdrR()) return "Wrk1SetDtHdr";
		if(aCnt == getWrk1DtlL()) return "Wrk1Dtl";
		if(aCnt == getWrk2SetDtHdrR()) return "Wrk2SetDtHdr";
		if(aCnt == getWrk2DtlL()) return "Wrk2Dtl";
		if(aCnt == getWrk3DtlL()) return "Wrk3Dtl";
		if(aCnt == getWrk4DtlL()) return "Wrk4Dtl";
		if(aCnt == getWrk5SetDtHdrR()) return "Wrk5SetDtHdr";
		if(aCnt == getWrk5DtlL()) return "Wrk5Dtl";
		if(aCnt == getWrk6SetDtHdrR()) return "Wrk6SetDtHdr";
		if(aCnt == getWrk6DtlL()) return "Wrk6Dtl";
		if(aCnt == getWrk7SetDtHdrR()) return "Wrk7SetDtHdr";
		if(aCnt == getWrk7DtlL()) return "Wrk7Dtl";
		if(aCnt == getWrk8DtlL()) return "Wrk8Dtl";
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
		if(bId.equals("HdrAll")) return getHdrAllL();
		if(bId.equals("Wrk1SetDtHdr")) return getWrk1SetDtHdrR();
		if(bId.equals("Wrk1Dtl")) return getWrk1DtlL();
		if(bId.equals("Wrk2SetDtHdr")) return getWrk2SetDtHdrR();
		if(bId.equals("Wrk2Dtl")) return getWrk2DtlL();
		if(bId.equals("Wrk3Dtl")) return getWrk3DtlL();
		if(bId.equals("Wrk4Dtl")) return getWrk4DtlL();
		if(bId.equals("Wrk5SetDtHdr")) return getWrk5SetDtHdrR();
		if(bId.equals("Wrk5Dtl")) return getWrk5DtlL();
		if(bId.equals("Wrk6SetDtHdr")) return getWrk6SetDtHdrR();
		if(bId.equals("Wrk6Dtl")) return getWrk6DtlL();
		if(bId.equals("Wrk7SetDtHdr")) return getWrk7SetDtHdrR();
		if(bId.equals("Wrk7Dtl")) return getWrk7DtlL();
		if(bId.equals("Wrk8Dtl")) return getWrk8DtlL();
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
		ret.add(TblPanel);
		ret.add(HdrPanel);
		ret.add(DtlTabPanel);
		ret.add(Wrk1Panel);
		ret.add(Wrk1SetDtHdrPanel);
		ret.add(Wrk1DtlPanel);
		ret.add(Wrk1DtlBtnPanel);
		ret.add(Wrk2Panel);
		ret.add(Wrk2SetDtHdrPanel);
		ret.add(Wrk2DtlPanel);
		ret.add(Wrk2DtlBtnPanel);
		ret.add(Wrk3Panel);
		ret.add(Wrk3DtlPanel);
		ret.add(Wrk3DtlBtnPanel);
		ret.add(Wrk4Panel);
		ret.add(Wrk4DtlPanel);
		ret.add(Wrk4DtlBtnPanel);
		ret.add(Wrk5Panel);
		ret.add(Wrk5SetDtHdrPanel);
		ret.add(Wrk5DtlPanel);
		ret.add(Wrk5DtlBtnPanel);
		ret.add(Wrk6Panel);
		ret.add(Wrk6SetDtHdrPanel);
		ret.add(Wrk6DtlPanel);
		ret.add(Wrk6DtlBtnPanel);
		ret.add(Wrk7Panel);
		ret.add(Wrk7SetDtHdrPanel);
		ret.add(Wrk7DtlPanel);
		ret.add(Wrk7DtlBtnPanel);
		ret.add(Wrk8Panel);
		ret.add(Wrk8DtlPanel);
		ret.add(Wrk8DtlBtnPanel);
		ret.add(BtnPanel);
		return ret;
	}

	/**
	 * コンストラクタです。通常の画面として作成するときに使用します。
	 */
	public MABSP_PurcItmReg_MC_A() {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aHdrAllL = createHdrAllL();
		aWrk1SetDtHdrR = createWrk1SetDtHdrR();
		aWrk1DtlL = createWrk1DtlL();
		aWrk2SetDtHdrR = createWrk2SetDtHdrR();
		aWrk2DtlL = createWrk2DtlL();
		aWrk3DtlL = createWrk3DtlL();
		aWrk4DtlL = createWrk4DtlL();
		aWrk5SetDtHdrR = createWrk5SetDtHdrR();
		aWrk5DtlL = createWrk5DtlL();
		aWrk6SetDtHdrR = createWrk6SetDtHdrR();
		aWrk6DtlL = createWrk6DtlL();
		aWrk7SetDtHdrR = createWrk7SetDtHdrR();
		aWrk7DtlL = createWrk7DtlL();
		aWrk8DtlL = createWrk8DtlL();

	}

	/**
	 * コンストラクタです。埋込カラムとして作成するときに使用します。
	 *
	 * @param name 対応するInnerRow項目名
	 */
	public MABSP_PurcItmReg_MC_A(String name) {
		aCndR = createCndR();
		aHdrR = createHdrR();
		aHdrAllL = createHdrAllL();
		aWrk1SetDtHdrR = createWrk1SetDtHdrR();
		aWrk1DtlL = createWrk1DtlL();
		createWrk1DtlTable();
		Wrk1DtlTable.setRowName(name);
		aWrk2SetDtHdrR = createWrk2SetDtHdrR();
		aWrk2DtlL = createWrk2DtlL();
		createWrk2DtlTable();
		Wrk2DtlTable.setRowName(name);
		aWrk3DtlL = createWrk3DtlL();
		createWrk3DtlTable();
		Wrk3DtlTable.setRowName(name);
		aWrk4DtlL = createWrk4DtlL();
		createWrk4DtlTable();
		Wrk4DtlTable.setRowName(name);
		aWrk5SetDtHdrR = createWrk5SetDtHdrR();
		aWrk5DtlL = createWrk5DtlL();
		createWrk5DtlTable();
		Wrk5DtlTable.setRowName(name);
		aWrk6SetDtHdrR = createWrk6SetDtHdrR();
		aWrk6DtlL = createWrk6DtlL();
		createWrk6DtlTable();
		Wrk6DtlTable.setRowName(name);
		aWrk7SetDtHdrR = createWrk7SetDtHdrR();
		aWrk7DtlL = createWrk7DtlL();
		createWrk7DtlTable();
		Wrk7DtlTable.setRowName(name);
		aWrk8DtlL = createWrk8DtlL();
		createWrk8DtlTable();
		Wrk8DtlTable.setRowName(name);
	}


	/**
	 * 埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	public void jbCreate(){
		super.jbCreate();
		MABSP_PurcItmReg_MC.jbCreateScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateTop((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateFold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateCnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateCtrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateTbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateDtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateWrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbCreateBtn((MABSP_PurcItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateScreenOpe(MABSP_PurcItmReg p) {
	}

	/**
	 * [Top]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTop(MABSP_PurcItmReg p) {
	}

	/**
	 * [Fold]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateFold(MABSP_PurcItmReg p) {
	}

	/**
	 * [Cnd]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCnd(MABSP_PurcItmReg p) {
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
		p.Cnd_itm_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getCndR().itm());
		p.Cnd_itm_PPanel.setName("Cnd.itm");
		p.Cnd_itm_cd = p.Cnd_itm_PPanel.Itm_itm_cd;
		p.Cnd_itm_cd.addAliasName("Cnd.itm_cd", p);
		p.Cnd_itm_sub1 = p.Cnd_itm_PPanel.Itm_itm_sub1;
		p.Cnd_itm_sub1.addAliasName("Cnd.itm_sub1", p);
		p.Cnd_itm_sub2 = p.Cnd_itm_PPanel.Itm_itm_sub2;
		p.Cnd_itm_sub2.addAliasName("Cnd.itm_sub2", p);
		p.Cnd_itm_sub3 = p.Cnd_itm_PPanel.Itm_itm_sub3;
		p.Cnd_itm_sub3.addAliasName("Cnd.itm_sub3", p);
		p.Cnd_itm_nm = p.Cnd_itm_PPanel.Itm_itm_nm;
		p.Cnd_itm_nm.addAliasName("Cnd.itm_nm", p);
	}

	/**
	 * [Ctrl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateCtrl(MABSP_PurcItmReg p) {
		p.Ctrl_ctrl_PPanel = mcframe.clientFXBA.FXBAP0130.FXBAP_ExpandUnit.create();
		p.Ctrl_ctrl_PPanel.setName("Ctrl.ctrl");
	}

	/**
	 * [Tbl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateTbl(MABSP_PurcItmReg p) {
	}

	/**
	 * [Hdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateHdr(MABSP_PurcItmReg p) {
		p.Hdr_itm_p_PPanel = mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.create(p.getHdrR().itm_p());
		p.Hdr_itm_p_PPanel.setName("Hdr.itm_p");
		p.Hdr_itm_cd = p.Hdr_itm_p_PPanel.Itm_itm_cd;
		p.Hdr_itm_cd.addAliasName("Hdr.itm_cd", p);
		p.Hdr_itm_sub1 = p.Hdr_itm_p_PPanel.Itm_itm_sub1;
		p.Hdr_itm_sub1.addAliasName("Hdr.itm_sub1", p);
		p.Hdr_itm_sub2 = p.Hdr_itm_p_PPanel.Itm_itm_sub2;
		p.Hdr_itm_sub2.addAliasName("Hdr.itm_sub2", p);
		p.Hdr_itm_sub3 = p.Hdr_itm_p_PPanel.Itm_itm_sub3;
		p.Hdr_itm_sub3.addAliasName("Hdr.itm_sub3", p);
		p.Hdr_itm_nm = p.Hdr_itm_p_PPanel.Itm_itm_nm;
		p.Hdr_itm_nm.addAliasName("Hdr.itm_nm", p);
	}

	/**
	 * [DtlTab]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateDtlTab(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk1]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk1SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1SetDtHdr(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk1Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1Dtl(MABSP_PurcItmReg p) {
		p.Wrk1Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$itm_p);
		p.Wrk1Dtl_itm_p_PPanel.setName("Wrk1Dtl.itm_p");
		p.columnWrk1Dtl_itm_cd = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk1Dtl_itm_cd.addAliasName("Wrk1Dtl.itm_cd", p);
		p.columnWrk1Dtl_itm_sub1 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk1Dtl_itm_sub1.addAliasName("Wrk1Dtl.itm_sub1", p);
		p.columnWrk1Dtl_itm_sub2 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk1Dtl_itm_sub2.addAliasName("Wrk1Dtl.itm_sub2", p);
		p.columnWrk1Dtl_itm_sub3 = p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk1Dtl_itm_sub3.addAliasName("Wrk1Dtl.itm_sub3", p);
		p.Wrk1Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$dt_p);
		p.Wrk1Dtl_dt_p_PPanel.setName("Wrk1Dtl.dt_p");
		p.columnWrk1Dtl_st_dt_key = p.Wrk1Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk1Dtl_st_dt_key.addAliasName("Wrk1Dtl.st_dt_key", p);
		p.columnWrk1Dtl_st_dt = p.Wrk1Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk1Dtl_st_dt.addAliasName("Wrk1Dtl.st_dt", p);
		p.columnWrk1Dtl_end_dt = p.Wrk1Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk1Dtl_end_dt.addAliasName("Wrk1Dtl.end_dt", p);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$purc_lt_add_qty_p);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.setName("Wrk1Dtl.purc_lt_add_qty_p");
		p.columnWrk1Dtl_purc_lt_add_qty = p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_purc_lt_add_qty.addAliasName("Wrk1Dtl.purc_lt_add_qty", p);
		p.Wrk1Dtl_min_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$min_lot_qty_p);
		p.Wrk1Dtl_min_lot_qty_p_PPanel.setName("Wrk1Dtl.min_lot_qty_p");
		p.columnWrk1Dtl_min_lot_qty = p.Wrk1Dtl_min_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_min_lot_qty.addAliasName("Wrk1Dtl.min_lot_qty", p);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$batch_lot_qty_p);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel.setName("Wrk1Dtl.batch_lot_qty_p");
		p.columnWrk1Dtl_batch_lot_qty = p.Wrk1Dtl_batch_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_batch_lot_qty.addAliasName("Wrk1Dtl.batch_lot_qty", p);
		p.Wrk1Dtl_max_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$max_lot_qty_p);
		p.Wrk1Dtl_max_lot_qty_p_PPanel.setName("Wrk1Dtl.max_lot_qty_p");
		p.columnWrk1Dtl_max_lot_qty = p.Wrk1Dtl_max_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk1Dtl_max_lot_qty.addAliasName("Wrk1Dtl.max_lot_qty", p);
		p.Wrk1Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.$sno_p);
		p.Wrk1Dtl_sno_p_PPanel.setName("Wrk1Dtl.sno_p");
		p.columnWrk1Dtl_sno1 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnWrk1Dtl_sno1.addAliasName("Wrk1Dtl.sno1", p);
		p.columnWrk1Dtl_sno2 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnWrk1Dtl_sno2.addAliasName("Wrk1Dtl.sno2", p);
		p.columnWrk1Dtl_sno3 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnWrk1Dtl_sno3.addAliasName("Wrk1Dtl.sno3", p);
		p.columnWrk1Dtl_sno4 = p.Wrk1Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnWrk1Dtl_sno4.addAliasName("Wrk1Dtl.sno4", p);
	}

	/**
	 * [Wrk1DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk1DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk2]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2SetDtHdr(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk2Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2Dtl(MABSP_PurcItmReg p) {
		p.Wrk2Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$itm_p);
		p.Wrk2Dtl_itm_p_PPanel.setName("Wrk2Dtl.itm_p");
		p.columnWrk2Dtl_itm_cd = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk2Dtl_itm_cd.addAliasName("Wrk2Dtl.itm_cd", p);
		p.columnWrk2Dtl_itm_sub1 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk2Dtl_itm_sub1.addAliasName("Wrk2Dtl.itm_sub1", p);
		p.columnWrk2Dtl_itm_sub2 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk2Dtl_itm_sub2.addAliasName("Wrk2Dtl.itm_sub2", p);
		p.columnWrk2Dtl_itm_sub3 = p.Wrk2Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk2Dtl_itm_sub3.addAliasName("Wrk2Dtl.itm_sub3", p);
		p.Wrk2Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$dt_p);
		p.Wrk2Dtl_dt_p_PPanel.setName("Wrk2Dtl.dt_p");
		p.columnWrk2Dtl_st_dt_key = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk2Dtl_st_dt_key.addAliasName("Wrk2Dtl.st_dt_key", p);
		p.columnWrk2Dtl_st_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk2Dtl_st_dt.addAliasName("Wrk2Dtl.st_dt", p);
		p.columnWrk2Dtl_end_dt = p.Wrk2Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk2Dtl_end_dt.addAliasName("Wrk2Dtl.end_dt", p);
		p.Wrk2Dtl_min_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$min_lot_qty_p);
		p.Wrk2Dtl_min_lot_qty_p_PPanel.setName("Wrk2Dtl.min_lot_qty_p");
		p.columnWrk2Dtl_min_lot_qty = p.Wrk2Dtl_min_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk2Dtl_min_lot_qty.addAliasName("Wrk2Dtl.min_lot_qty", p);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$batch_lot_qty_p);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel.setName("Wrk2Dtl.batch_lot_qty_p");
		p.columnWrk2Dtl_batch_lot_qty = p.Wrk2Dtl_batch_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk2Dtl_batch_lot_qty.addAliasName("Wrk2Dtl.batch_lot_qty", p);
		p.Wrk2Dtl_max_lot_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$max_lot_qty_p);
		p.Wrk2Dtl_max_lot_qty_p_PPanel.setName("Wrk2Dtl.max_lot_qty_p");
		p.columnWrk2Dtl_max_lot_qty = p.Wrk2Dtl_max_lot_qty_p_PPanel.columnQty_qty;
		p.columnWrk2Dtl_max_lot_qty.addAliasName("Wrk2Dtl.max_lot_qty", p);
		p.Wrk2Dtl_sno_p_PPanel = mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.$sno_p);
		p.Wrk2Dtl_sno_p_PPanel.setName("Wrk2Dtl.sno_p");
		p.columnWrk2Dtl_sno1 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno1;
		p.columnWrk2Dtl_sno1.addAliasName("Wrk2Dtl.sno1", p);
		p.columnWrk2Dtl_sno2 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno2;
		p.columnWrk2Dtl_sno2.addAliasName("Wrk2Dtl.sno2", p);
		p.columnWrk2Dtl_sno3 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno3;
		p.columnWrk2Dtl_sno3.addAliasName("Wrk2Dtl.sno3", p);
		p.columnWrk2Dtl_sno4 = p.Wrk2Dtl_sno_p_PPanel.columnSno_sno4;
		p.columnWrk2Dtl_sno4.addAliasName("Wrk2Dtl.sno4", p);
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk2DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk3]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk3Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3Dtl(MABSP_PurcItmReg p) {
		p.Wrk3Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk3DtlR.$itm_p);
		p.Wrk3Dtl_itm_p_PPanel.setName("Wrk3Dtl.itm_p");
		p.columnWrk3Dtl_itm_cd = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk3Dtl_itm_cd.addAliasName("Wrk3Dtl.itm_cd", p);
		p.columnWrk3Dtl_itm_sub1 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk3Dtl_itm_sub1.addAliasName("Wrk3Dtl.itm_sub1", p);
		p.columnWrk3Dtl_itm_sub2 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk3Dtl_itm_sub2.addAliasName("Wrk3Dtl.itm_sub2", p);
		p.columnWrk3Dtl_itm_sub3 = p.Wrk3Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk3Dtl_itm_sub3.addAliasName("Wrk3Dtl.itm_sub3", p);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk3DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk4]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk4Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4Dtl(MABSP_PurcItmReg p) {
		p.Wrk4Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.$itm_p);
		p.Wrk4Dtl_itm_p_PPanel.setName("Wrk4Dtl.itm_p");
		p.columnWrk4Dtl_itm_cd = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk4Dtl_itm_cd.addAliasName("Wrk4Dtl.itm_cd", p);
		p.columnWrk4Dtl_itm_sub1 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk4Dtl_itm_sub1.addAliasName("Wrk4Dtl.itm_sub1", p);
		p.columnWrk4Dtl_itm_sub2 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk4Dtl_itm_sub2.addAliasName("Wrk4Dtl.itm_sub2", p);
		p.columnWrk4Dtl_itm_sub3 = p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk4Dtl_itm_sub3.addAliasName("Wrk4Dtl.itm_sub3", p);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.$xfr_lot_unit_qty_p);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.setName("Wrk4Dtl.xfr_lot_unit_qty_p");
		p.columnWrk4Dtl_xfr_lot_unit_qty = p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.columnQty_qty;
		p.columnWrk4Dtl_xfr_lot_unit_qty.addAliasName("Wrk4Dtl.xfr_lot_unit_qty", p);
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk4DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk5]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk5SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5SetDtHdr(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk5Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5Dtl(MABSP_PurcItmReg p) {
		p.Wrk5Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$itm_p);
		p.Wrk5Dtl_itm_p_PPanel.setName("Wrk5Dtl.itm_p");
		p.columnWrk5Dtl_itm_cd = p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk5Dtl_itm_cd.addAliasName("Wrk5Dtl.itm_cd", p);
		p.columnWrk5Dtl_itm_sub1 = p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk5Dtl_itm_sub1.addAliasName("Wrk5Dtl.itm_sub1", p);
		p.columnWrk5Dtl_itm_sub2 = p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk5Dtl_itm_sub2.addAliasName("Wrk5Dtl.itm_sub2", p);
		p.columnWrk5Dtl_itm_sub3 = p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk5Dtl_itm_sub3.addAliasName("Wrk5Dtl.itm_sub3", p);
		p.Wrk5Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$dt_p);
		p.Wrk5Dtl_dt_p_PPanel.setName("Wrk5Dtl.dt_p");
		p.columnWrk5Dtl_st_dt_key = p.Wrk5Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk5Dtl_st_dt_key.addAliasName("Wrk5Dtl.st_dt_key", p);
		p.columnWrk5Dtl_st_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk5Dtl_st_dt.addAliasName("Wrk5Dtl.st_dt", p);
		p.columnWrk5Dtl_end_dt = p.Wrk5Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk5Dtl_end_dt.addAliasName("Wrk5Dtl.end_dt", p);
		p.Wrk5Dtl_buf_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$buf_qty_p);
		p.Wrk5Dtl_buf_qty_p_PPanel.setName("Wrk5Dtl.buf_qty_p");
		p.columnWrk5Dtl_buf_qty = p.Wrk5Dtl_buf_qty_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_buf_qty.addAliasName("Wrk5Dtl.buf_qty", p);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$rord_stk_qty_p);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel.setName("Wrk5Dtl.rord_stk_qty_p");
		p.columnWrk5Dtl_rord_stk_qty = p.Wrk5Dtl_rord_stk_qty_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_rord_stk_qty.addAliasName("Wrk5Dtl.rord_stk_qty", p);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$rord_rqst_qty_p);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel.setName("Wrk5Dtl.rord_rqst_qty_p");
		p.columnWrk5Dtl_rord_rqst_qty = p.Wrk5Dtl_rord_rqst_qty_p_PPanel.columnQty_qty;
		p.columnWrk5Dtl_rord_rqst_qty.addAliasName("Wrk5Dtl.rord_rqst_qty", p);
		p.Wrk5Dtl_str_ln1_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$str_ln1_p);
		p.Wrk5Dtl_str_ln1_p_PPanel.setName("Wrk5Dtl.str_ln1_p");
		p.columnWrk5Dtl_gi_str_ln_cd = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_gi_str_ln_cd.addAliasName("Wrk5Dtl.gi_str_ln_cd", p);
		p.columnWrk5Dtl_gi_str_ln_nm = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_gi_str_ln_nm.addAliasName("Wrk5Dtl.gi_str_ln_nm", p);
		p.columnWrk5Dtl_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.gi_str_ln_cd_none_flg", p);
		p.Wrk5Dtl_str_ln2_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$str_ln2_p);
		p.Wrk5Dtl_str_ln2_p_PPanel.setName("Wrk5Dtl.str_ln2_p");
		p.columnWrk5Dtl_inpt_gi_str_ln_cd = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_inpt_gi_str_ln_cd.addAliasName("Wrk5Dtl.inpt_gi_str_ln_cd", p);
		p.columnWrk5Dtl_inpt_gi_str_ln_nm = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_inpt_gi_str_ln_nm.addAliasName("Wrk5Dtl.inpt_gi_str_ln_nm", p);
		p.columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_inpt_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.inpt_gi_str_ln_cd_none_flg", p);
		p.Wrk5Dtl_str_ln3_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.$str_ln3_p);
		p.Wrk5Dtl_str_ln3_p_PPanel.setName("Wrk5Dtl.str_ln3_p");
		p.columnWrk5Dtl_ship_gi_str_ln_cd = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk5Dtl_ship_gi_str_ln_cd.addAliasName("Wrk5Dtl.ship_gi_str_ln_cd", p);
		p.columnWrk5Dtl_ship_gi_str_ln_nm = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk5Dtl_ship_gi_str_ln_nm.addAliasName("Wrk5Dtl.ship_gi_str_ln_nm", p);
		p.columnWrk5Dtl_ship_gi_str_ln_cd_none_flg = p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk5Dtl_ship_gi_str_ln_cd_none_flg.addAliasName("Wrk5Dtl.ship_gi_str_ln_cd_none_flg", p);
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk5DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk6]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk6SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6SetDtHdr(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk6Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6Dtl(MABSP_PurcItmReg p) {
		p.Wrk6Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.$itm_p);
		p.Wrk6Dtl_itm_p_PPanel.setName("Wrk6Dtl.itm_p");
		p.columnWrk6Dtl_itm_cd = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk6Dtl_itm_cd.addAliasName("Wrk6Dtl.itm_cd", p);
		p.columnWrk6Dtl_itm_sub1 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk6Dtl_itm_sub1.addAliasName("Wrk6Dtl.itm_sub1", p);
		p.columnWrk6Dtl_itm_sub2 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk6Dtl_itm_sub2.addAliasName("Wrk6Dtl.itm_sub2", p);
		p.columnWrk6Dtl_itm_sub3 = p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk6Dtl_itm_sub3.addAliasName("Wrk6Dtl.itm_sub3", p);
		p.Wrk6Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.$dt_p);
		p.Wrk6Dtl_dt_p_PPanel.setName("Wrk6Dtl.dt_p");
		p.columnWrk6Dtl_st_dt_key = p.Wrk6Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk6Dtl_st_dt_key.addAliasName("Wrk6Dtl.st_dt_key", p);
		p.columnWrk6Dtl_st_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk6Dtl_st_dt.addAliasName("Wrk6Dtl.st_dt", p);
		p.columnWrk6Dtl_end_dt = p.Wrk6Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk6Dtl_end_dt.addAliasName("Wrk6Dtl.end_dt", p);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel = mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.$purc_lt_add_qty_p);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.setName("Wrk6Dtl.purc_lt_add_qty_p");
		p.columnWrk6Dtl_purc_lt_add_qty = p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.columnQty_qty;
		p.columnWrk6Dtl_purc_lt_add_qty.addAliasName("Wrk6Dtl.purc_lt_add_qty", p);
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk6DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk7]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk7SetDtHdr]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7SetDtHdr(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk7Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7Dtl(MABSP_PurcItmReg p) {
		p.Wrk7Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.$itm_p);
		p.Wrk7Dtl_itm_p_PPanel.setName("Wrk7Dtl.itm_p");
		p.columnWrk7Dtl_itm_cd = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk7Dtl_itm_cd.addAliasName("Wrk7Dtl.itm_cd", p);
		p.columnWrk7Dtl_itm_sub1 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk7Dtl_itm_sub1.addAliasName("Wrk7Dtl.itm_sub1", p);
		p.columnWrk7Dtl_itm_sub2 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk7Dtl_itm_sub2.addAliasName("Wrk7Dtl.itm_sub2", p);
		p.columnWrk7Dtl_itm_sub3 = p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk7Dtl_itm_sub3.addAliasName("Wrk7Dtl.itm_sub3", p);
		p.Wrk7Dtl_dt_p_PPanel = mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.$dt_p);
		p.Wrk7Dtl_dt_p_PPanel.setName("Wrk7Dtl.dt_p");
		p.columnWrk7Dtl_st_dt_key = p.Wrk7Dtl_dt_p_PPanel.columnDt_st_dt_key;
		p.columnWrk7Dtl_st_dt_key.addAliasName("Wrk7Dtl.st_dt_key", p);
		p.columnWrk7Dtl_st_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_st_dt;
		p.columnWrk7Dtl_st_dt.addAliasName("Wrk7Dtl.st_dt", p);
		p.columnWrk7Dtl_end_dt = p.Wrk7Dtl_dt_p_PPanel.columnDt_end_dt;
		p.columnWrk7Dtl_end_dt.addAliasName("Wrk7Dtl.end_dt", p);
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk7DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk8]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk8(MABSP_PurcItmReg p) {
	}

	/**
	 * [Wrk8Dtl]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk8Dtl(MABSP_PurcItmReg p) {
		p.Wrk8Dtl_itm_p_PPanel = mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.$itm_p);
		p.Wrk8Dtl_itm_p_PPanel.setName("Wrk8Dtl.itm_p");
		p.columnWrk8Dtl_itm_cd = p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_cd;
		p.columnWrk8Dtl_itm_cd.addAliasName("Wrk8Dtl.itm_cd", p);
		p.columnWrk8Dtl_itm_sub1 = p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub1;
		p.columnWrk8Dtl_itm_sub1.addAliasName("Wrk8Dtl.itm_sub1", p);
		p.columnWrk8Dtl_itm_sub2 = p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub2;
		p.columnWrk8Dtl_itm_sub2.addAliasName("Wrk8Dtl.itm_sub2", p);
		p.columnWrk8Dtl_itm_sub3 = p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub3;
		p.columnWrk8Dtl_itm_sub3.addAliasName("Wrk8Dtl.itm_sub3", p);
		p.Wrk8Dtl_str_ln_p_PPanel = mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.$str_ln_p);
		p.Wrk8Dtl_str_ln_p_PPanel.setName("Wrk8Dtl.str_ln_p");
		p.columnWrk8Dtl_str_ln_cd = p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd;
		p.columnWrk8Dtl_str_ln_cd.addAliasName("Wrk8Dtl.str_ln_cd", p);
		p.columnWrk8Dtl_str_ln_nm = p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_nm;
		p.columnWrk8Dtl_str_ln_nm.addAliasName("Wrk8Dtl.str_ln_nm", p);
		p.columnWrk8Dtl_str_ln_cd_none_flg = p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg;
		p.columnWrk8Dtl_str_ln_cd_none_flg.addAliasName("Wrk8Dtl.str_ln_cd_none_flg", p);
	}

	/**
	 * [Wrk8DtlBtn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateWrk8DtlBtn(MABSP_PurcItmReg p) {
	}

	/**
	 * [Btn]ブロック関連の埋め込み画面Fieldとエイリアス定義されたGUI部品Fieldの初期化を行います。
	 */
	protected static void jbCreateBtn(MABSP_PurcItmReg p) {
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

	
	/** [Wrk1Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_wg_cd_p = null;

	/**
	 * [Wrk1Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_wg_cd_ListPutter() {
		if (Wrk1Dtl_wg_cd_p == null) {
			Wrk1Dtl_wg_cd_p = createWrk1Dtl_wg_cd_ListPutter(columnWrk1Dtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Wrk1Dtl_wg_cd_p;
	}
	
	
	/** [Wrk1Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_sppl_cd_p = null;

	/**
	 * [Wrk1Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_sppl_cd_ListPutter() {
		if (Wrk1Dtl_sppl_cd_p == null) {
			Wrk1Dtl_sppl_cd_p = createWrk1Dtl_sppl_cd_ListPutter(columnWrk1Dtl_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Wrk1Dtl_sppl_cd_p;
	}
	
	
	/** [Wrk1Dtl_maker_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_maker_cd_p = null;

	/**
	 * [Wrk1Dtl_maker_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_maker_cd_ListPutter() {
		if (Wrk1Dtl_maker_cd_p == null) {
			Wrk1Dtl_maker_cd_p = createWrk1Dtl_maker_cd_ListPutter(columnWrk1Dtl_maker_cd, "maker_cd", "maker_nm");

		}
		return Wrk1Dtl_maker_cd_p;
	}
	
	
	/** [Wrk1Dtl_purc_id_typ_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_purc_id_typ_p = null;

	/**
	 * [Wrk1Dtl_purc_id_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_purc_id_typ_ListPutter() {
		if (Wrk1Dtl_purc_id_typ_p == null) {
			Wrk1Dtl_purc_id_typ_p = createWrk1Dtl_purc_id_typ_ListPutter(columnWrk1Dtl_purc_id_typ, "purc_id_typ", "purc_id_typ_nm");

		}
		return Wrk1Dtl_purc_id_typ_p;
	}
	
	
	/** [Wrk1Dtl_purc_basis_typ_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_purc_basis_typ_p = null;

	/**
	 * [Wrk1Dtl_purc_basis_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_purc_basis_typ_ListPutter() {
		if (Wrk1Dtl_purc_basis_typ_p == null) {
			Wrk1Dtl_purc_basis_typ_p = createWrk1Dtl_purc_basis_typ_ListPutter(columnWrk1Dtl_purc_basis_typ, "purc_basis_typ", "purc_basis_typ_nm");

		}
		return Wrk1Dtl_purc_basis_typ_p;
	}
	
	
	/** [Wrk1Dtl_sz_day_week_typ_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_sz_day_week_typ_p = null;

	/**
	 * [Wrk1Dtl_sz_day_week_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_sz_day_week_typ_ListPutter() {
		if (Wrk1Dtl_sz_day_week_typ_p == null) {
			Wrk1Dtl_sz_day_week_typ_p = createWrk1Dtl_sz_day_week_typ_ListPutter(columnWrk1Dtl_sz_day_week_typ, "sz_day_week_typ", "sz_day_week_typ_nm");

		}
		return Wrk1Dtl_sz_day_week_typ_p;
	}
	
	
	/** [Wrk1Dtl_rqst_wg_cd_ListPutter]の定義 */
	private MCListPutter Wrk1Dtl_rqst_wg_cd_p = null;

	/**
	 * [Wrk1Dtl_rqst_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk1Dtl_rqst_wg_cd_ListPutter() {
		if (Wrk1Dtl_rqst_wg_cd_p == null) {
			Wrk1Dtl_rqst_wg_cd_p = createWrk1Dtl_rqst_wg_cd_ListPutter(columnWrk1Dtl_rqst_wg_cd, "rqst_wg_cd", "rqst_wg_nm");

		}
		return Wrk1Dtl_rqst_wg_cd_p;
	}
	
	
	/** [Wrk2Dtl_wg_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_wg_cd_p = null;

	/**
	 * [Wrk2Dtl_wg_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_wg_cd_ListPutter() {
		if (Wrk2Dtl_wg_cd_p == null) {
			Wrk2Dtl_wg_cd_p = createWrk2Dtl_wg_cd_ListPutter(columnWrk2Dtl_wg_cd, "wg_cd", "wg_nm");

		}
		return Wrk2Dtl_wg_cd_p;
	}
	
	
	/** [Wrk2Dtl_rqst_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_rqst_loc_cd_p = null;

	/**
	 * [Wrk2Dtl_rqst_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_rqst_loc_cd_ListPutter() {
		if (Wrk2Dtl_rqst_loc_cd_p == null) {
			Wrk2Dtl_rqst_loc_cd_p = createWrk2Dtl_rqst_loc_cd_ListPutter(columnWrk2Dtl_rqst_loc_cd, "rqst_loc_cd", "rqst_loc_nm");

		}
		return Wrk2Dtl_rqst_loc_cd_p;
	}
	
	
	/** [Wrk2Dtl_sz_day_week_typ_ListPutter]の定義 */
	private MCListPutter Wrk2Dtl_sz_day_week_typ_p = null;

	/**
	 * [Wrk2Dtl_sz_day_week_typ_ListPutter]の取得
	 */
	protected MCListPutter getWrk2Dtl_sz_day_week_typ_ListPutter() {
		if (Wrk2Dtl_sz_day_week_typ_p == null) {
			Wrk2Dtl_sz_day_week_typ_p = createWrk2Dtl_sz_day_week_typ_ListPutter(columnWrk2Dtl_sz_day_week_typ, "sz_day_week_typ", "sz_day_week_typ_nm");

		}
		return Wrk2Dtl_sz_day_week_typ_p;
	}
	
	
	/** [Wrk3Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk3Dtl_loc_cd_p = null;

	/**
	 * [Wrk3Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk3Dtl_loc_cd_ListPutter() {
		if (Wrk3Dtl_loc_cd_p == null) {
			Wrk3Dtl_loc_cd_p = createWrk3Dtl_loc_cd_ListPutter(columnWrk3Dtl_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm","loc_grp_cd","loc_grp_nm");

		}
		return Wrk3Dtl_loc_cd_p;
	}
	
	
	/** [Wrk4Dtl_to_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_to_loc_cd_p = null;

	/**
	 * [Wrk4Dtl_to_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_to_loc_cd_ListPutter() {
		if (Wrk4Dtl_to_loc_cd_p == null) {
			Wrk4Dtl_to_loc_cd_p = createWrk4Dtl_to_loc_cd_ListPutter(columnWrk4Dtl_to_loc_cd, "to_loc_cd", "to_loc_nm","to_wg_cd","to_wg_nm","to_lg_grp_cd");

		}
		return Wrk4Dtl_to_loc_cd_p;
	}
	
	
	/** [Wrk4Dtl_fr_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk4Dtl_fr_loc_cd_p = null;

	/**
	 * [Wrk4Dtl_fr_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk4Dtl_fr_loc_cd_ListPutter() {
		if (Wrk4Dtl_fr_loc_cd_p == null) {
			Wrk4Dtl_fr_loc_cd_p = createWrk4Dtl_fr_loc_cd_ListPutter(columnWrk4Dtl_fr_loc_cd, "fr_loc_cd", "fr_loc_nm","fr_wg_cd","fr_lg_grp_cd");

		}
		return Wrk4Dtl_fr_loc_cd_p;
	}
	
	
	/** [Wrk5Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_loc_cd_p = null;

	/**
	 * [Wrk5Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_loc_cd_ListPutter() {
		if (Wrk5Dtl_loc_cd_p == null) {
			Wrk5Dtl_loc_cd_p = createWrk5Dtl_loc_cd_ListPutter(columnWrk5Dtl_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm","loc_grp_cd","loc_grp_nm","alloc_grp_cd","alloc_grp_nm");

		}
		return Wrk5Dtl_loc_cd_p;
	}
	
	
	/** [Wrk5Dtl_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_gi_loc_cd_p = null;

	/**
	 * [Wrk5Dtl_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_gi_loc_cd_ListPutter() {
		if (Wrk5Dtl_gi_loc_cd_p == null) {
			Wrk5Dtl_gi_loc_cd_p = createWrk5Dtl_gi_loc_cd_ListPutter(columnWrk5Dtl_gi_loc_cd, "gi_loc_cd", "gi_loc_nm","gi_str_ln_tgt_flg");

		}
		return Wrk5Dtl_gi_loc_cd_p;
	}
	
	
	/** [Wrk5Dtl_inpt_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_inpt_gi_loc_cd_p = null;

	/**
	 * [Wrk5Dtl_inpt_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_inpt_gi_loc_cd_ListPutter() {
		if (Wrk5Dtl_inpt_gi_loc_cd_p == null) {
			Wrk5Dtl_inpt_gi_loc_cd_p = createWrk5Dtl_inpt_gi_loc_cd_ListPutter(columnWrk5Dtl_inpt_gi_loc_cd, "inpt_gi_loc_cd", "inpt_gi_loc_nm","inpt_gi_str_ln_tgt_flg");

		}
		return Wrk5Dtl_inpt_gi_loc_cd_p;
	}
	
	
	/** [Wrk5Dtl_ship_gi_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk5Dtl_ship_gi_loc_cd_p = null;

	/**
	 * [Wrk5Dtl_ship_gi_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk5Dtl_ship_gi_loc_cd_ListPutter() {
		if (Wrk5Dtl_ship_gi_loc_cd_p == null) {
			Wrk5Dtl_ship_gi_loc_cd_p = createWrk5Dtl_ship_gi_loc_cd_ListPutter(columnWrk5Dtl_ship_gi_loc_cd, "ship_gi_loc_cd", "ship_gi_loc_nm","ship_gi_str_ln_tgt_flg");

		}
		return Wrk5Dtl_ship_gi_loc_cd_p;
	}
	
	
	/** [Wrk6Dtl_sppl_cd_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_sppl_cd_p = null;

	/**
	 * [Wrk6Dtl_sppl_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_sppl_cd_ListPutter() {
		if (Wrk6Dtl_sppl_cd_p == null) {
			Wrk6Dtl_sppl_cd_p = createWrk6Dtl_sppl_cd_ListPutter(columnWrk6Dtl_sppl_cd, "sppl_cd", "sppl_nm");

		}
		return Wrk6Dtl_sppl_cd_p;
	}
	
	
	/** [Wrk6Dtl_lg_grp_cd_ListPutter]の定義 */
	private MCListPutter Wrk6Dtl_lg_grp_cd_p = null;

	/**
	 * [Wrk6Dtl_lg_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk6Dtl_lg_grp_cd_ListPutter() {
		if (Wrk6Dtl_lg_grp_cd_p == null) {
			Wrk6Dtl_lg_grp_cd_p = createWrk6Dtl_lg_grp_cd_ListPutter(columnWrk6Dtl_lg_grp_cd, "lg_grp_cd", "lg_grp_nm");

		}
		return Wrk6Dtl_lg_grp_cd_p;
	}
	
	
	/** [Wrk7Dtl_bp_cd_ListPutter]の定義 */
	private MCListPutter Wrk7Dtl_bp_cd_p = null;

	/**
	 * [Wrk7Dtl_bp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk7Dtl_bp_cd_ListPutter() {
		if (Wrk7Dtl_bp_cd_p == null) {
			Wrk7Dtl_bp_cd_p = createWrk7Dtl_bp_cd_ListPutter(columnWrk7Dtl_bp_cd, "bp_cd", "bp_nm","sppl_flg","cst_flg");

		}
		return Wrk7Dtl_bp_cd_p;
	}
	
	
	/** [Wrk7Dtl_pf_grp_cd_ListPutter]の定義 */
	private MCListPutter Wrk7Dtl_pf_grp_cd_p = null;

	/**
	 * [Wrk7Dtl_pf_grp_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk7Dtl_pf_grp_cd_ListPutter() {
		if (Wrk7Dtl_pf_grp_cd_p == null) {
			Wrk7Dtl_pf_grp_cd_p = createWrk7Dtl_pf_grp_cd_ListPutter(columnWrk7Dtl_pf_grp_cd, "pf_grp_cd", "pf_grp_nm");

		}
		return Wrk7Dtl_pf_grp_cd_p;
	}
	
	
	/** [Wrk8Dtl_loc_cd_ListPutter]の定義 */
	private MCListPutter Wrk8Dtl_loc_cd_p = null;

	/**
	 * [Wrk8Dtl_loc_cd_ListPutter]の取得
	 */
	protected MCListPutter getWrk8Dtl_loc_cd_ListPutter() {
		if (Wrk8Dtl_loc_cd_p == null) {
			Wrk8Dtl_loc_cd_p = createWrk8Dtl_loc_cd_ListPutter(columnWrk8Dtl_loc_cd, "loc_cd", "loc_nm","wg_cd","wg_nm","loc_grp_cd","loc_grp_nm","str_ln_tgt_flg");

		}
		return Wrk8Dtl_loc_cd_p;
	}
	

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_PurcItmReg create(){
		MABSP_PurcItmReg p = new MABSP_PurcItmReg();
		p.jbCreate();
		setParts(p);
		p.appInit();
		return p;
	}

	/**
	 * この画面を埋め込み画面として作成します。
	 */
	public static MABSP_PurcItmReg create(String name){
		MABSP_PurcItmReg p = new MABSP_PurcItmReg(name);
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
		MABSP_PurcItmReg_MC.jbfInitScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitTop((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitFold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitCnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitCtrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitTbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitDtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitWrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbfInitBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitTop((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitFold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitCnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitCtrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitTbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitDtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitWrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.jbInitBtn((MABSP_PurcItmReg)this);
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitScreenOpe(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.ScreenOpePanel = p.beansFactory.createPanel("ScreenOpe");
		p.ScreenOpeTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
	}

	/**
	 * [Top]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTop(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.TopPanel = p.beansFactory.createPanel("Top");
		// ブロックの項目の初期化
	}

	/**
	 * [Fold]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitFold(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel = p.beansFactory.createPanel("Fold");
		p.FoldBasePanel = p.beansFactory.createPanel("Fold.base");
		p.FoldScrollPane = p.beansFactory.createScrollPane("Fold.scroll");
		// ブロックの項目の初期化
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCnd(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.CndPanel = p.beansFactory.createPanel("Cnd");
		p.CndTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Cnd_ope_Group = p.beansFactory.createButtonGroup("Cnd.ope");
		p.Cnd_ope_UPD = p.beansFactory.createRadioButton("Cnd.ope_UPD");
		p.Cnd_ope_REF = p.beansFactory.createRadioButton("Cnd.ope_REF");
		p.Cnd_del_flg_lab = p.beansFactory.createLabel("Cnd.del_flg_lab");
		p.Cnd_off_del_flg = p.beansFactory.createCheckBox("Cnd.off_del_flg");
		p.Cnd_on_del_flg = p.beansFactory.createCheckBox("Cnd.on_del_flg");
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitCtrl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.CtrlPanel = p.beansFactory.createPanel("Ctrl");
		// ブロックの項目の初期化
	}

	/**
	 * [Tbl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitTbl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.TblPanel = p.beansFactory.createPanel("Tbl");
		// ブロックの項目の初期化
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.HdrPanel = p.beansFactory.createPanel("Hdr");
		p.HdrTitledBorder = p.beansFactory.createTitledBorder();
		// ブロックの項目の初期化
		p.Hdr_unit_cd_Label = p.beansFactory.createLabel("Hdr.unit_cd_Label");
		p.Hdr_unit_cd = p.beansFactory.createTextField("Hdr.unit_cd");
		p.Hdr_unit_cd.setLabel(p.Hdr_unit_cd_Label);
		p.Hdr_unit_nm = p.beansFactory.createTextField("Hdr.unit_nm");
		p.Hdr_stk_mng_typ_Label = p.beansFactory.createLabel("Hdr.stk_mng_typ_Label");
		p.Hdr_stk_mng_typ = p.beansFactory.createTextField("Hdr.stk_mng_typ");
		p.Hdr_stk_mng_typ.setLabel(p.Hdr_stk_mng_typ_Label);
		p.Hdr_stk_mng_typ_nm = p.beansFactory.createTextField("Hdr.stk_mng_typ_nm");
		p.Hdr_asset_mng_typ_Label = p.beansFactory.createLabel("Hdr.asset_mng_typ_Label");
		p.Hdr_asset_mng_typ = p.beansFactory.createTextField("Hdr.asset_mng_typ");
		p.Hdr_asset_mng_typ.setLabel(p.Hdr_asset_mng_typ_Label);
		p.Hdr_asset_mng_typ_nm = p.beansFactory.createTextField("Hdr.asset_mng_typ_nm");
		p.Hdr_dec_place = p.beansFactory.createNumberField("Hdr.dec_place");
		p.Hdr_sundry_itm_flg = p.beansFactory.createCheckBox("Hdr.sundry_itm_flg");
		p.Hdr_sno1_mng_typ = p.beansFactory.createTextField("Hdr.sno1_mng_typ");
		p.Hdr_sno2_mng_typ = p.beansFactory.createTextField("Hdr.sno2_mng_typ");
		p.Hdr_sno3_mng_typ = p.beansFactory.createTextField("Hdr.sno3_mng_typ");
		p.Hdr_sno4_mng_typ = p.beansFactory.createTextField("Hdr.sno4_mng_typ");
		p.Hdr_purc_lbl = p.beansFactory.createLabel("Hdr.purc_lbl");
		p.Hdr_purc_flg = p.beansFactory.createCheckBox("Hdr.purc_flg");
		p.Hdr_purc_input_flg = p.beansFactory.createCheckBox("Hdr.purc_input_flg");
		p.Hdr_upd = p.beansFactory.createButton("Hdr.upd", "upd");
		p.Hdr_upd_cntr = p.beansFactory.createNumberField("Hdr.upd_cntr");
		p.Hdr_check = p.beansFactory.createCheckBox("Hdr.check");
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitDtlTab(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel = p.beansFactory.createPanel("DtlTab");
		p.DtlTabTab = p.beansFactory.createTabbedPane("DtlTab.tab");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1Panel = p.beansFactory.createPanel("Wrk1");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1SetDtHdrPanel = p.beansFactory.createPanel("Wrk1SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk1SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk1SetDtHdr.st_dt_Label");
		p.Wrk1SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk1SetDtHdr.st_dt");
		p.Wrk1SetDtHdr_st_dt.setLabel(p.Wrk1SetDtHdr_st_dt_Label);
		p.Wrk1SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk1SetDtHdr.end_dt_Label");
		p.Wrk1SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk1SetDtHdr.end_dt");
		p.Wrk1SetDtHdr_end_dt.setLabel(p.Wrk1SetDtHdr_end_dt_Label);
		p.Wrk1SetDtHdr_set_dt = p.beansFactory.createButton("Wrk1SetDtHdr.set_dt");
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1DtlPanel = p.beansFactory.createPanel("Wrk1Dtl");
		p.Wrk1DtlScrollPane = p.beansFactory.createScrollPane("Wrk1Dtl.scroll");
		p.createWrk1DtlTable();
		// ブロックの項目の初期化
		p.columnWrk1Dtl_check = p.beansFactory.createTableColumn("Wrk1Dtl.check", MCColumnType.CHECK);
		p.columnWrk1Dtl_del_flg = p.beansFactory.createTableColumn("Wrk1Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk1Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk1Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_sppl_cd = p.beansFactory.createTableColumn("Wrk1Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_sppl_nm = p.beansFactory.createTableColumn("Wrk1Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_maker_cd = p.beansFactory.createTableColumn("Wrk1Dtl.maker_cd", MCColumnType.TEXT);
		p.columnWrk1Dtl_maker_nm = p.beansFactory.createTableColumn("Wrk1Dtl.maker_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_purc_id_typ = p.beansFactory.createTableColumn("Wrk1Dtl.purc_id_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_purc_id_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.purc_id_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_purc_lt = p.beansFactory.createTableColumn("Wrk1Dtl.purc_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_purc_basis_typ = p.beansFactory.createTableColumn("Wrk1Dtl.purc_basis_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_purc_basis_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.purc_basis_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_accpt_insp_lt = p.beansFactory.createTableColumn("Wrk1Dtl.accpt_insp_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_buf_lt = p.beansFactory.createTableColumn("Wrk1Dtl.buf_lt", MCColumnType.NUMBER);
		p.columnWrk1Dtl_ord_fix_pd = p.beansFactory.createTableColumn("Wrk1Dtl.ord_fix_pd", MCColumnType.NUMBER);
		p.columnWrk1Dtl_sz_day_week_typ = p.beansFactory.createTableColumn("Wrk1Dtl.sz_day_week_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_sz_day_week_typ_nm = p.beansFactory.createTableColumn("Wrk1Dtl.sz_day_week_typ_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_sz_week = p.beansFactory.createTableColumn("Wrk1Dtl.sz_week", MCColumnType.NUMBER);
		p.columnWrk1Dtl_lot_sz_pd = p.beansFactory.createTableColumn("Wrk1Dtl.lot_sz_pd", MCColumnType.NUMBER);
		p.columnWrk1Dtl_max_order = p.beansFactory.createTableColumn("Wrk1Dtl.max_order", MCColumnType.NUMBER);
		p.columnWrk1Dtl_prio = p.beansFactory.createTableColumn("Wrk1Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_order_ratio = p.beansFactory.createTableColumn("Wrk1Dtl.order_ratio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_pre_po_tgt_flg = p.beansFactory.createTableColumn("Wrk1Dtl.pre_po_tgt_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_rqst_wg_cd = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk1Dtl_rqst_wg_nm = p.beansFactory.createTableColumn("Wrk1Dtl.rqst_wg_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_po_batch_flg = p.beansFactory.createTableColumn("Wrk1Dtl.po_batch_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_not_mrp_flg = p.beansFactory.createTableColumn("Wrk1Dtl.not_mrp_flg", MCColumnType.CHECK);
		p.columnWrk1Dtl_cost_ratio = p.beansFactory.createTableColumn("Wrk1Dtl.cost_ratio", MCColumnType.NUMBER);
		p.columnWrk1Dtl_memo1 = p.beansFactory.createTableColumn("Wrk1Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk1Dtl_memo2 = p.beansFactory.createTableColumn("Wrk1Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk1Dtl_memo3 = p.beansFactory.createTableColumn("Wrk1Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk1Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk1Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk1Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk1Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk1Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk1Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk1Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk1Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk1Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk1Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk1Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk1Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk1Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk1Dtl_del_ts = p.beansFactory.createTableColumn("Wrk1Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk1DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk1DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1DtlBtnPanel = p.beansFactory.createPanel("Wrk1DtlBtn");
		// ブロックの項目の初期化
		p.Wrk1DtlBtn_select_all = p.beansFactory.createButton("Wrk1DtlBtn.select_all", "no_border");
		p.Wrk1DtlBtn_deselect_all = p.beansFactory.createButton("Wrk1DtlBtn.deselect_all", "no_border");
		p.Wrk1DtlBtn_radd = p.beansFactory.createButton("Wrk1DtlBtn.radd", "no_border");
		p.Wrk1DtlBtn_rdel = p.beansFactory.createButton("Wrk1DtlBtn.rdel", "no_border");
		p.Wrk1DtlBtn_rcopy = p.beansFactory.createButton("Wrk1DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2Panel = p.beansFactory.createPanel("Wrk2");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2SetDtHdrPanel = p.beansFactory.createPanel("Wrk2SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk2SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk2SetDtHdr.st_dt_Label");
		p.Wrk2SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk2SetDtHdr.st_dt");
		p.Wrk2SetDtHdr_st_dt.setLabel(p.Wrk2SetDtHdr_st_dt_Label);
		p.Wrk2SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk2SetDtHdr.end_dt_Label");
		p.Wrk2SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk2SetDtHdr.end_dt");
		p.Wrk2SetDtHdr_end_dt.setLabel(p.Wrk2SetDtHdr_end_dt_Label);
		p.Wrk2SetDtHdr_set_dt = p.beansFactory.createButton("Wrk2SetDtHdr.set_dt");
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel = p.beansFactory.createPanel("Wrk2Dtl");
		p.Wrk2DtlScrollPane = p.beansFactory.createScrollPane("Wrk2Dtl.scroll");
		p.createWrk2DtlTable();
		// ブロックの項目の初期化
		p.columnWrk2Dtl_check = p.beansFactory.createTableColumn("Wrk2Dtl.check", MCColumnType.CHECK);
		p.columnWrk2Dtl_del_flg = p.beansFactory.createTableColumn("Wrk2Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk2Dtl.wg_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk2Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_rqst_loc_cd = p.beansFactory.createTableColumn("Wrk2Dtl.rqst_loc_cd", MCColumnType.TEXT);
		p.columnWrk2Dtl_rqst_loc_nm = p.beansFactory.createTableColumn("Wrk2Dtl.rqst_loc_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_buf_lt = p.beansFactory.createTableColumn("Wrk2Dtl.buf_lt", MCColumnType.NUMBER);
		p.columnWrk2Dtl_ord_fix_pd = p.beansFactory.createTableColumn("Wrk2Dtl.ord_fix_pd", MCColumnType.NUMBER);
		p.columnWrk2Dtl_sz_day_week_typ = p.beansFactory.createTableColumn("Wrk2Dtl.sz_day_week_typ", MCColumnType.TEXT_COMBO);
		p.columnWrk2Dtl_sz_day_week_typ_nm = p.beansFactory.createTableColumn("Wrk2Dtl.sz_day_week_typ_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_sz_week = p.beansFactory.createTableColumn("Wrk2Dtl.sz_week", MCColumnType.NUMBER);
		p.columnWrk2Dtl_lot_sz_pd = p.beansFactory.createTableColumn("Wrk2Dtl.lot_sz_pd", MCColumnType.NUMBER);
		p.columnWrk2Dtl_max_order = p.beansFactory.createTableColumn("Wrk2Dtl.max_order", MCColumnType.NUMBER);
		p.columnWrk2Dtl_prio = p.beansFactory.createTableColumn("Wrk2Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk2Dtl_order_ratio = p.beansFactory.createTableColumn("Wrk2Dtl.order_ratio", MCColumnType.NUMBER);
		p.columnWrk2Dtl_pre_po_tgt_flg = p.beansFactory.createTableColumn("Wrk2Dtl.pre_po_tgt_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_not_mrp_flg = p.beansFactory.createTableColumn("Wrk2Dtl.not_mrp_flg", MCColumnType.CHECK);
		p.columnWrk2Dtl_memo1 = p.beansFactory.createTableColumn("Wrk2Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo2 = p.beansFactory.createTableColumn("Wrk2Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk2Dtl_memo3 = p.beansFactory.createTableColumn("Wrk2Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk2Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk2Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk2Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk2Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk2Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk2Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk2Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk2Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk2Dtl_del_ts = p.beansFactory.createTableColumn("Wrk2Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk2DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlBtnPanel = p.beansFactory.createPanel("Wrk2DtlBtn");
		// ブロックの項目の初期化
		p.Wrk2DtlBtn_select_all = p.beansFactory.createButton("Wrk2DtlBtn.select_all", "no_border");
		p.Wrk2DtlBtn_deselect_all = p.beansFactory.createButton("Wrk2DtlBtn.deselect_all", "no_border");
		p.Wrk2DtlBtn_radd = p.beansFactory.createButton("Wrk2DtlBtn.radd", "no_border");
		p.Wrk2DtlBtn_rdel = p.beansFactory.createButton("Wrk2DtlBtn.rdel", "no_border");
		p.Wrk2DtlBtn_rcopy = p.beansFactory.createButton("Wrk2DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel = p.beansFactory.createPanel("Wrk3");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel = p.beansFactory.createPanel("Wrk3Dtl");
		p.Wrk3DtlScrollPane = p.beansFactory.createScrollPane("Wrk3Dtl.scroll");
		p.createWrk3DtlTable();
		// ブロックの項目の初期化
		p.columnWrk3Dtl_check = p.beansFactory.createTableColumn("Wrk3Dtl.check", MCColumnType.CHECK);
		p.columnWrk3Dtl_del_flg = p.beansFactory.createTableColumn("Wrk3Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk3Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk3Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk3Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk3Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk3Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_loc_grp_cd = p.beansFactory.createTableColumn("Wrk3Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnWrk3Dtl_loc_grp_nm = p.beansFactory.createTableColumn("Wrk3Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_prio = p.beansFactory.createTableColumn("Wrk3Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk3Dtl_memo1 = p.beansFactory.createTableColumn("Wrk3Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo2 = p.beansFactory.createTableColumn("Wrk3Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk3Dtl_memo3 = p.beansFactory.createTableColumn("Wrk3Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk3Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk3Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk3Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk3Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk3Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk3Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk3Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk3Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk3Dtl_del_ts = p.beansFactory.createTableColumn("Wrk3Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk3DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel = p.beansFactory.createPanel("Wrk3DtlBtn");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all = p.beansFactory.createButton("Wrk3DtlBtn.select_all", "no_border");
		p.Wrk3DtlBtn_deselect_all = p.beansFactory.createButton("Wrk3DtlBtn.deselect_all", "no_border");
		p.Wrk3DtlBtn_radd = p.beansFactory.createButton("Wrk3DtlBtn.radd", "no_border");
		p.Wrk3DtlBtn_rdel = p.beansFactory.createButton("Wrk3DtlBtn.rdel", "no_border");
		p.Wrk3DtlBtn_rcopy = p.beansFactory.createButton("Wrk3DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk4]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4Panel = p.beansFactory.createPanel("Wrk4");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel = p.beansFactory.createPanel("Wrk4Dtl");
		p.Wrk4DtlScrollPane = p.beansFactory.createScrollPane("Wrk4Dtl.scroll");
		p.createWrk4DtlTable();
		// ブロックの項目の初期化
		p.columnWrk4Dtl_check = p.beansFactory.createTableColumn("Wrk4Dtl.check", MCColumnType.CHECK);
		p.columnWrk4Dtl_del_flg = p.beansFactory.createTableColumn("Wrk4Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_to_loc_cd = p.beansFactory.createTableColumn("Wrk4Dtl.to_loc_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_to_loc_nm = p.beansFactory.createTableColumn("Wrk4Dtl.to_loc_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_to_wg_cd = p.beansFactory.createTableColumn("Wrk4Dtl.to_wg_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_to_wg_nm = p.beansFactory.createTableColumn("Wrk4Dtl.to_wg_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_to_lg_grp_cd = p.beansFactory.createTableColumn("Wrk4Dtl.to_lg_grp_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_fr_loc_cd = p.beansFactory.createTableColumn("Wrk4Dtl.fr_loc_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_fr_loc_nm = p.beansFactory.createTableColumn("Wrk4Dtl.fr_loc_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_fr_wg_cd = p.beansFactory.createTableColumn("Wrk4Dtl.fr_wg_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_fr_lg_grp_cd = p.beansFactory.createTableColumn("Wrk4Dtl.fr_lg_grp_cd", MCColumnType.TEXT);
		p.columnWrk4Dtl_prio = p.beansFactory.createTableColumn("Wrk4Dtl.prio", MCColumnType.NUMBER);
		p.columnWrk4Dtl_in_loc_flg = p.beansFactory.createTableColumn("Wrk4Dtl.in_loc_flg", MCColumnType.CHECK);
		p.columnWrk4Dtl_memo1 = p.beansFactory.createTableColumn("Wrk4Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo2 = p.beansFactory.createTableColumn("Wrk4Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk4Dtl_memo3 = p.beansFactory.createTableColumn("Wrk4Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk4Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk4Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk4Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk4Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk4Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk4Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk4Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk4Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk4Dtl_del_ts = p.beansFactory.createTableColumn("Wrk4Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk4DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlBtnPanel = p.beansFactory.createPanel("Wrk4DtlBtn");
		// ブロックの項目の初期化
		p.Wrk4DtlBtn_select_all = p.beansFactory.createButton("Wrk4DtlBtn.select_all", "no_border");
		p.Wrk4DtlBtn_deselect_all = p.beansFactory.createButton("Wrk4DtlBtn.deselect_all", "no_border");
		p.Wrk4DtlBtn_radd = p.beansFactory.createButton("Wrk4DtlBtn.radd", "no_border");
		p.Wrk4DtlBtn_rdel = p.beansFactory.createButton("Wrk4DtlBtn.rdel", "no_border");
		p.Wrk4DtlBtn_rcopy = p.beansFactory.createButton("Wrk4DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel = p.beansFactory.createPanel("Wrk5");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5SetDtHdrPanel = p.beansFactory.createPanel("Wrk5SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk5SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk5SetDtHdr.st_dt_Label");
		p.Wrk5SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk5SetDtHdr.st_dt");
		p.Wrk5SetDtHdr_st_dt.setLabel(p.Wrk5SetDtHdr_st_dt_Label);
		p.Wrk5SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk5SetDtHdr.end_dt_Label");
		p.Wrk5SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk5SetDtHdr.end_dt");
		p.Wrk5SetDtHdr_end_dt.setLabel(p.Wrk5SetDtHdr_end_dt_Label);
		p.Wrk5SetDtHdr_set_dt = p.beansFactory.createButton("Wrk5SetDtHdr.set_dt");
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel = p.beansFactory.createPanel("Wrk5Dtl");
		p.Wrk5DtlScrollPane = p.beansFactory.createScrollPane("Wrk5Dtl.scroll");
		p.createWrk5DtlTable();
		// ブロックの項目の初期化
		p.columnWrk5Dtl_check = p.beansFactory.createTableColumn("Wrk5Dtl.check", MCColumnType.CHECK);
		p.columnWrk5Dtl_del_flg = p.beansFactory.createTableColumn("Wrk5Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk5Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk5Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_loc_grp_cd = p.beansFactory.createTableColumn("Wrk5Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_loc_grp_nm = p.beansFactory.createTableColumn("Wrk5Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_alloc_grp_cd = p.beansFactory.createTableColumn("Wrk5Dtl.alloc_grp_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_alloc_grp_nm = p.beansFactory.createTableColumn("Wrk5Dtl.alloc_grp_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_schd_flg = p.beansFactory.createTableColumn("Wrk5Dtl.gi_schd_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_lot_sizing_flg = p.beansFactory.createTableColumn("Wrk5Dtl.lot_sizing_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_inpt_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_inpt_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.inpt_gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_ship_gi_loc_cd = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_loc_cd", MCColumnType.TEXT);
		p.columnWrk5Dtl_ship_gi_loc_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_loc_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk5Dtl.ship_gi_str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk5Dtl_memo1 = p.beansFactory.createTableColumn("Wrk5Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo2 = p.beansFactory.createTableColumn("Wrk5Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk5Dtl_memo3 = p.beansFactory.createTableColumn("Wrk5Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk5Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk5Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk5Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk5Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk5Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk5Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk5Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk5Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk5Dtl_del_ts = p.beansFactory.createTableColumn("Wrk5Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk5DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlBtnPanel = p.beansFactory.createPanel("Wrk5DtlBtn");
		// ブロックの項目の初期化
		p.Wrk5DtlBtn_select_all = p.beansFactory.createButton("Wrk5DtlBtn.select_all", "no_border");
		p.Wrk5DtlBtn_deselect_all = p.beansFactory.createButton("Wrk5DtlBtn.deselect_all", "no_border");
		p.Wrk5DtlBtn_radd = p.beansFactory.createButton("Wrk5DtlBtn.radd", "no_border");
		p.Wrk5DtlBtn_rdel = p.beansFactory.createButton("Wrk5DtlBtn.rdel", "no_border");
		p.Wrk5DtlBtn_rcopy = p.beansFactory.createButton("Wrk5DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk6]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6Panel = p.beansFactory.createPanel("Wrk6");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk6SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6SetDtHdrPanel = p.beansFactory.createPanel("Wrk6SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk6SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk6SetDtHdr.st_dt_Label");
		p.Wrk6SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk6SetDtHdr.st_dt");
		p.Wrk6SetDtHdr_st_dt.setLabel(p.Wrk6SetDtHdr_st_dt_Label);
		p.Wrk6SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk6SetDtHdr.end_dt_Label");
		p.Wrk6SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk6SetDtHdr.end_dt");
		p.Wrk6SetDtHdr_end_dt.setLabel(p.Wrk6SetDtHdr_end_dt_Label);
		p.Wrk6SetDtHdr_set_dt = p.beansFactory.createButton("Wrk6SetDtHdr.set_dt");
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel = p.beansFactory.createPanel("Wrk6Dtl");
		p.Wrk6DtlScrollPane = p.beansFactory.createScrollPane("Wrk6Dtl.scroll");
		p.createWrk6DtlTable();
		// ブロックの項目の初期化
		p.columnWrk6Dtl_check = p.beansFactory.createTableColumn("Wrk6Dtl.check", MCColumnType.CHECK);
		p.columnWrk6Dtl_del_flg = p.beansFactory.createTableColumn("Wrk6Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk6Dtl_sppl_cd = p.beansFactory.createTableColumn("Wrk6Dtl.sppl_cd", MCColumnType.TEXT);
		p.columnWrk6Dtl_sppl_nm = p.beansFactory.createTableColumn("Wrk6Dtl.sppl_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_lg_grp_cd = p.beansFactory.createTableColumn("Wrk6Dtl.lg_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk6Dtl_lg_grp_nm = p.beansFactory.createTableColumn("Wrk6Dtl.lg_grp_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_purc_lt = p.beansFactory.createTableColumn("Wrk6Dtl.purc_lt", MCColumnType.NUMBER);
		p.columnWrk6Dtl_memo1 = p.beansFactory.createTableColumn("Wrk6Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo2 = p.beansFactory.createTableColumn("Wrk6Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk6Dtl_memo3 = p.beansFactory.createTableColumn("Wrk6Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk6Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk6Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk6Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk6Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk6Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk6Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk6Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk6Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk6Dtl_del_ts = p.beansFactory.createTableColumn("Wrk6Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk6DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlBtnPanel = p.beansFactory.createPanel("Wrk6DtlBtn");
		// ブロックの項目の初期化
		p.Wrk6DtlBtn_select_all = p.beansFactory.createButton("Wrk6DtlBtn.select_all", "no_border");
		p.Wrk6DtlBtn_deselect_all = p.beansFactory.createButton("Wrk6DtlBtn.deselect_all", "no_border");
		p.Wrk6DtlBtn_radd = p.beansFactory.createButton("Wrk6DtlBtn.radd", "no_border");
		p.Wrk6DtlBtn_rdel = p.beansFactory.createButton("Wrk6DtlBtn.rdel", "no_border");
		p.Wrk6DtlBtn_rcopy = p.beansFactory.createButton("Wrk6DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk7]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7Panel = p.beansFactory.createPanel("Wrk7");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk7SetDtHdr]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7SetDtHdrPanel = p.beansFactory.createPanel("Wrk7SetDtHdr");
		// ブロックの項目の初期化
		p.Wrk7SetDtHdr_st_dt_Label = p.beansFactory.createLabel("Wrk7SetDtHdr.st_dt_Label");
		p.Wrk7SetDtHdr_st_dt = p.beansFactory.createDateField("Wrk7SetDtHdr.st_dt");
		p.Wrk7SetDtHdr_st_dt.setLabel(p.Wrk7SetDtHdr_st_dt_Label);
		p.Wrk7SetDtHdr_end_dt_Label = p.beansFactory.createLabel("Wrk7SetDtHdr.end_dt_Label");
		p.Wrk7SetDtHdr_end_dt = p.beansFactory.createDateField("Wrk7SetDtHdr.end_dt");
		p.Wrk7SetDtHdr_end_dt.setLabel(p.Wrk7SetDtHdr_end_dt_Label);
		p.Wrk7SetDtHdr_set_dt = p.beansFactory.createButton("Wrk7SetDtHdr.set_dt");
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel = p.beansFactory.createPanel("Wrk7Dtl");
		p.Wrk7DtlScrollPane = p.beansFactory.createScrollPane("Wrk7Dtl.scroll");
		p.createWrk7DtlTable();
		// ブロックの項目の初期化
		p.columnWrk7Dtl_check = p.beansFactory.createTableColumn("Wrk7Dtl.check", MCColumnType.CHECK);
		p.columnWrk7Dtl_del_flg = p.beansFactory.createTableColumn("Wrk7Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_bp_cd = p.beansFactory.createTableColumn("Wrk7Dtl.bp_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_bp_nm = p.beansFactory.createTableColumn("Wrk7Dtl.bp_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_sppl_flg = p.beansFactory.createTableColumn("Wrk7Dtl.sppl_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_cst_flg = p.beansFactory.createTableColumn("Wrk7Dtl.cst_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_bp_itm_cd = p.beansFactory.createTableColumn("Wrk7Dtl.bp_itm_cd", MCColumnType.TEXT);
		p.columnWrk7Dtl_bp_itm_nm = p.beansFactory.createTableColumn("Wrk7Dtl.bp_itm_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_def_flg = p.beansFactory.createTableColumn("Wrk7Dtl.def_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_pf_grp_cd = p.beansFactory.createTableColumn("Wrk7Dtl.pf_grp_cd", MCColumnType.TEXT_COMBO);
		p.columnWrk7Dtl_pf_grp_nm = p.beansFactory.createTableColumn("Wrk7Dtl.pf_grp_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_pf_fix_flg = p.beansFactory.createTableColumn("Wrk7Dtl.pf_fix_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_purc_commit_flg = p.beansFactory.createTableColumn("Wrk7Dtl.purc_commit_flg", MCColumnType.CHECK);
		p.columnWrk7Dtl_memo1 = p.beansFactory.createTableColumn("Wrk7Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo2 = p.beansFactory.createTableColumn("Wrk7Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk7Dtl_memo3 = p.beansFactory.createTableColumn("Wrk7Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk7Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk7Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk7Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk7Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk7Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk7Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk7Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk7Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk7Dtl_del_ts = p.beansFactory.createTableColumn("Wrk7Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk7DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlBtnPanel = p.beansFactory.createPanel("Wrk7DtlBtn");
		// ブロックの項目の初期化
		p.Wrk7DtlBtn_select_all = p.beansFactory.createButton("Wrk7DtlBtn.select_all", "no_border");
		p.Wrk7DtlBtn_deselect_all = p.beansFactory.createButton("Wrk7DtlBtn.deselect_all", "no_border");
		p.Wrk7DtlBtn_radd = p.beansFactory.createButton("Wrk7DtlBtn.radd", "no_border");
		p.Wrk7DtlBtn_rdel = p.beansFactory.createButton("Wrk7DtlBtn.rdel", "no_border");
		p.Wrk7DtlBtn_rcopy = p.beansFactory.createButton("Wrk7DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Wrk8]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk8(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8Panel = p.beansFactory.createPanel("Wrk8");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk8Dtl]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk8Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8DtlPanel = p.beansFactory.createPanel("Wrk8Dtl");
		p.Wrk8DtlScrollPane = p.beansFactory.createScrollPane("Wrk8Dtl.scroll");
		p.createWrk8DtlTable();
		// ブロックの項目の初期化
		p.columnWrk8Dtl_check = p.beansFactory.createTableColumn("Wrk8Dtl.check", MCColumnType.CHECK);
		p.columnWrk8Dtl_del_flg = p.beansFactory.createTableColumn("Wrk8Dtl.del_flg", MCColumnType.CHECK);
		p.columnWrk8Dtl_loc_cd = p.beansFactory.createTableColumn("Wrk8Dtl.loc_cd", MCColumnType.TEXT);
		p.columnWrk8Dtl_loc_nm = p.beansFactory.createTableColumn("Wrk8Dtl.loc_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_str_ln_tgt_flg = p.beansFactory.createTableColumn("Wrk8Dtl.str_ln_tgt_flg", MCColumnType.CHECK);
		p.columnWrk8Dtl_wg_cd = p.beansFactory.createTableColumn("Wrk8Dtl.wg_cd", MCColumnType.TEXT);
		p.columnWrk8Dtl_wg_nm = p.beansFactory.createTableColumn("Wrk8Dtl.wg_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_loc_grp_cd = p.beansFactory.createTableColumn("Wrk8Dtl.loc_grp_cd", MCColumnType.TEXT);
		p.columnWrk8Dtl_loc_grp_nm = p.beansFactory.createTableColumn("Wrk8Dtl.loc_grp_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_memo1 = p.beansFactory.createTableColumn("Wrk8Dtl.memo1", MCColumnType.TEXT);
		p.columnWrk8Dtl_memo2 = p.beansFactory.createTableColumn("Wrk8Dtl.memo2", MCColumnType.TEXT);
		p.columnWrk8Dtl_memo3 = p.beansFactory.createTableColumn("Wrk8Dtl.memo3", MCColumnType.TEXT);
		p.columnWrk8Dtl_ins_usr_id = p.beansFactory.createTableColumn("Wrk8Dtl.ins_usr_id", MCColumnType.TEXT);
		p.columnWrk8Dtl_ins_usr_nm = p.beansFactory.createTableColumn("Wrk8Dtl.ins_usr_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_ins_ts = p.beansFactory.createTableColumn("Wrk8Dtl.ins_ts", MCColumnType.TIMESTAMP);
		p.columnWrk8Dtl_ins_func_id = p.beansFactory.createTableColumn("Wrk8Dtl.ins_func_id", MCColumnType.TEXT);
		p.columnWrk8Dtl_ins_func_nm = p.beansFactory.createTableColumn("Wrk8Dtl.ins_func_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_upd_cntr = p.beansFactory.createTableColumn("Wrk8Dtl.upd_cntr", MCColumnType.NUMBER);
		p.columnWrk8Dtl_upd_usr_id = p.beansFactory.createTableColumn("Wrk8Dtl.upd_usr_id", MCColumnType.TEXT);
		p.columnWrk8Dtl_upd_usr_nm = p.beansFactory.createTableColumn("Wrk8Dtl.upd_usr_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_upd_ts = p.beansFactory.createTableColumn("Wrk8Dtl.upd_ts", MCColumnType.TIMESTAMP);
		p.columnWrk8Dtl_upd_func_id = p.beansFactory.createTableColumn("Wrk8Dtl.upd_func_id", MCColumnType.TEXT);
		p.columnWrk8Dtl_upd_func_nm = p.beansFactory.createTableColumn("Wrk8Dtl.upd_func_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_upd_srv_req_no = p.beansFactory.createTableColumn("Wrk8Dtl.upd_srv_req_no", MCColumnType.TEXT);
		p.columnWrk8Dtl_del_usr_id = p.beansFactory.createTableColumn("Wrk8Dtl.del_usr_id", MCColumnType.TEXT);
		p.columnWrk8Dtl_del_usr_nm = p.beansFactory.createTableColumn("Wrk8Dtl.del_usr_nm", MCColumnType.TEXT);
		p.columnWrk8Dtl_del_ts = p.beansFactory.createTableColumn("Wrk8Dtl.del_ts", MCColumnType.TIMESTAMP);
	}

	/**
	 * [Wrk8DtlBtn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitWrk8DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8DtlBtnPanel = p.beansFactory.createPanel("Wrk8DtlBtn");
		// ブロックの項目の初期化
		p.Wrk8DtlBtn_select_all = p.beansFactory.createButton("Wrk8DtlBtn.select_all", "no_border");
		p.Wrk8DtlBtn_deselect_all = p.beansFactory.createButton("Wrk8DtlBtn.deselect_all", "no_border");
		p.Wrk8DtlBtn_radd = p.beansFactory.createButton("Wrk8DtlBtn.radd", "no_border");
		p.Wrk8DtlBtn_rdel = p.beansFactory.createButton("Wrk8DtlBtn.rdel", "no_border");
		p.Wrk8DtlBtn_rcopy = p.beansFactory.createButton("Wrk8DtlBtn.rcopy", "no_border");
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定１
	 */
	protected static void jbfInitBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.BtnPanel = p.beansFactory.createPanel("Btn");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0120 = p.beansFactory.createButton("Btn.open_MABSP0120", "open");
	}

	/**
	 * [ScreenOpe]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitScreenOpe(MABSP_PurcItmReg p) {
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
	protected static void jbInitTop(MABSP_PurcItmReg p) {
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
	protected static void jbInitFold(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.FoldPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.FoldPanel.add(p.CndPanel, null);
		p.FoldPanel.setLastBeans(p.CndPanel);
	}

	/**
	 * [Cnd]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCnd(MABSP_PurcItmReg p) {
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
		p.Cnd_ope_UPD.setNextBeans(p.Cnd_ope_REF);
		p.Cnd_ope_REF.setActionCommand("3");
		p.Cnd_ope_Group.add(p.Cnd_ope_REF);
		p.ScreenOpePanel.add(p.Cnd_ope_REF);
		p.Cnd_ope_Group.setRow(p.getCndR(), mcframe.clientMABS.MABSP1110.CndR.ope_META);
		p.CndPanel.add(p.Cnd_dt_PPanel);
		p.CndPanel.setLastBeans(p.Cnd_dt_PPanel);
		p.Cnd_dt_PPanel.setNextBeans(p.Cnd_itm_PPanel);
		p.CndPanel.add(p.Cnd_itm_PPanel);
		p.Cnd_itm_PPanel.setNextBeans(p.Cnd_off_del_flg);
		p.CndPanel.add(p.Cnd_del_flg_lab);
		p.CndPanel.add(p.Cnd_off_del_flg);
		p.Cnd_off_del_flg.setNextBeans(p.Cnd_on_del_flg);
		p.Cnd_off_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1110.CndR.off_del_flg_META);
		p.CndPanel.add(p.Cnd_on_del_flg);
		p.Cnd_on_del_flg.setRow(p.getCndR(), mcframe.clientMABS.MABSP1110.CndR.on_del_flg_META);
	}

	/**
	 * [Ctrl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitCtrl(MABSP_PurcItmReg p) {
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
	protected static void jbInitTbl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.add(p.TblPanel);
		p.TblPanel.setNextBeans(p.BtnPanel);
		p.TblPanel.setLayoutPosition("CB+");
		// ブロックの項目の初期化
		p.TblPanel.add(p.HdrPanel, null);
		p.TblPanel.setLastBeans(p.HdrPanel);
		p.HdrPanel.setNextBeans(p.DtlTabPanel);
		p.TblPanel.add(p.DtlTabPanel, null);
	}

	/**
	 * [Hdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.HdrPanel.setBorder(p.HdrTitledBorder);
		p.HdrPanel.setValueCheck(false);
		p.HdrPanel.setLayoutPosition("NS");
		// ブロックの項目の初期化
		p.HdrPanel.add(p.Hdr_itm_p_PPanel);
		p.HdrPanel.setLastBeans(p.Hdr_itm_p_PPanel);
		p.Hdr_itm_p_PPanel.setNextBeans(p.Hdr_unit_cd);
		p.HdrPanel.add(p.Hdr_unit_cd_Label);
		p.HdrPanel.add(p.Hdr_unit_cd);
		p.Hdr_unit_cd.setNextBeans(p.Hdr_unit_nm);
		p.Hdr_unit_cd.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.unit_cd_META);
		p.HdrPanel.add(p.Hdr_unit_nm);
		p.Hdr_unit_nm.setNextBeans(p.Hdr_stk_mng_typ);
		p.Hdr_unit_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.unit_nm_META);
		p.HdrPanel.add(p.Hdr_stk_mng_typ_Label);
		p.HdrPanel.add(p.Hdr_stk_mng_typ);
		p.Hdr_stk_mng_typ.setNextBeans(p.Hdr_stk_mng_typ_nm);
		p.Hdr_stk_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.stk_mng_typ_META);
		p.HdrPanel.add(p.Hdr_stk_mng_typ_nm);
		p.Hdr_stk_mng_typ_nm.setNextBeans(p.Hdr_asset_mng_typ);
		p.Hdr_stk_mng_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.stk_mng_typ_nm_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_Label);
		p.HdrPanel.add(p.Hdr_asset_mng_typ);
		p.Hdr_asset_mng_typ.setNextBeans(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.asset_mng_typ_META);
		p.HdrPanel.add(p.Hdr_asset_mng_typ_nm);
		p.Hdr_asset_mng_typ_nm.setNextBeans(p.Hdr_dec_place);
		p.Hdr_asset_mng_typ_nm.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.asset_mng_typ_nm_META);
		p.HdrPanel.add(p.Hdr_dec_place);
		p.Hdr_dec_place.setNextBeans(p.Hdr_sundry_itm_flg);
		p.Hdr_dec_place.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.dec_place_META);
		p.HdrPanel.add(p.Hdr_sundry_itm_flg);
		p.Hdr_sundry_itm_flg.setNextBeans(p.Hdr_sno1_mng_typ);
		p.Hdr_sundry_itm_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.sundry_itm_flg_META);
		p.HdrPanel.add(p.Hdr_sno1_mng_typ);
		p.Hdr_sno1_mng_typ.setNextBeans(p.Hdr_sno2_mng_typ);
		p.Hdr_sno1_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.sno1_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno2_mng_typ);
		p.Hdr_sno2_mng_typ.setNextBeans(p.Hdr_sno3_mng_typ);
		p.Hdr_sno2_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.sno2_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno3_mng_typ);
		p.Hdr_sno3_mng_typ.setNextBeans(p.Hdr_sno4_mng_typ);
		p.Hdr_sno3_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.sno3_mng_typ_META);
		p.HdrPanel.add(p.Hdr_sno4_mng_typ);
		p.Hdr_sno4_mng_typ.setNextBeans(p.Hdr_upd_cntr);
		p.Hdr_sno4_mng_typ.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.sno4_mng_typ_META);
		p.BtnPanel.add(p.Hdr_purc_lbl);
		p.BtnPanel.add(p.Hdr_purc_flg);
		p.Hdr_purc_flg.setNextBeans(p.Hdr_purc_input_flg);
		p.Hdr_purc_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.purc_flg_META);
		p.BtnPanel.add(p.Hdr_purc_input_flg);
		p.Hdr_purc_input_flg.setNextBeans(p.Hdr_upd);
		p.Hdr_purc_input_flg.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.purc_input_flg_META);
		p.Hdr_upd.setIcon("REGISTER");
		p.Hdr_upd.setFunctionKey(MCFunctionKey.F9);
		p.BtnPanel.add(p.Hdr_upd);
		p.HdrPanel.add(p.Hdr_upd_cntr);
		p.Hdr_upd_cntr.setNextBeans(p.Hdr_check);
		p.Hdr_upd_cntr.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.upd_cntr_META);
		p.HdrPanel.add(p.Hdr_check);
		p.Hdr_check.setRow(p.getHdrR(), mcframe.clientMABS.MABSP1110.HdrR.check_META);
	}

	/**
	 * [DtlTab]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitDtlTab(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.DtlTabPanel.add(p.DtlTabTab);
		p.DtlTabPanel.setLastBeans(p.DtlTabTab);
		p.DtlTabPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
		p.DtlTabTab.add(p.Wrk1Panel, "DtlTab.tab1");
		p.DtlTabTab.setLastBeans(p.Wrk1Panel);
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.DtlTabTab.add(p.Wrk2Panel, "DtlTab.tab2");
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.DtlTabTab.add(p.Wrk3Panel, "DtlTab.tab3");
		p.Wrk3Panel.setNextBeans(p.Wrk8Panel);
		p.DtlTabTab.add(p.Wrk8Panel, "DtlTab.tab4");
		p.Wrk8Panel.setNextBeans(p.Wrk4Panel);
		p.DtlTabTab.add(p.Wrk4Panel, "DtlTab.tab5");
		p.Wrk4Panel.setNextBeans(p.Wrk5Panel);
		p.DtlTabTab.add(p.Wrk5Panel, "DtlTab.tab6");
		p.Wrk5Panel.setNextBeans(p.Wrk6Panel);
		p.DtlTabTab.add(p.Wrk6Panel, "DtlTab.tab7");
		p.Wrk6Panel.setNextBeans(p.Wrk7Panel);
		p.DtlTabTab.add(p.Wrk7Panel, "DtlTab.tab8");
	}

	/**
	 * [Wrk1]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1Panel.setNextBeans(p.Wrk2Panel);
		p.Wrk1Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk1Panel.add(p.Wrk1SetDtHdrPanel, null);
		p.Wrk1Panel.setLastBeans(p.Wrk1SetDtHdrPanel);
		p.Wrk1SetDtHdrPanel.setNextBeans(p.Wrk1DtlPanel);
		p.Wrk1Panel.add(p.Wrk1DtlPanel, null);
		p.Wrk1DtlPanel.setNextBeans(p.Wrk1DtlBtnPanel);
		p.Wrk1Panel.add(p.Wrk1DtlBtnPanel, null);
	}

	/**
	 * [Wrk1SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1SetDtHdrPanel.setValueCheck(false);
		p.Wrk1SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_st_dt_Label);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_st_dt);
		p.Wrk1SetDtHdrPanel.setLastBeans(p.Wrk1SetDtHdr_st_dt);
		p.Wrk1SetDtHdr_st_dt.setNextBeans(p.Wrk1SetDtHdr_end_dt);
		p.Wrk1SetDtHdr_st_dt.setRow(p.getWrk1SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR.st_dt_META);
		p.Wrk1SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_end_dt_Label);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_end_dt);
		p.Wrk1SetDtHdr_end_dt.setNextBeans(p.Wrk1SetDtHdr_set_dt);
		p.Wrk1SetDtHdr_end_dt.setRow(p.getWrk1SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk1SetDtHdrR.end_dt_META);
		p.Wrk1SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk1SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk1SetDtHdrPanel.add(p.Wrk1SetDtHdr_set_dt);
	}

	/**
	 * [Wrk1Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1DtlPanel.add(p.Wrk1DtlScrollPane);
		p.Wrk1DtlPanel.setLastBeans(p.Wrk1DtlTable);
		p.Wrk1DtlScrollPane.setViewportView(p.Wrk1DtlTable);
		p.Wrk1DtlTable.setList(p.getWrk1DtlL());
		p.Wrk1DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk1DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk1DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk1DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk1DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk1DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk1DtlBtnPanel.add(p.Wrk1DtlBtn_select_all);
		p.Wrk1DtlBtnPanel.setLastBeans(p.Wrk1DtlBtn_select_all);
		p.Wrk1DtlBtn_select_all.setNextBeans(p.Wrk1DtlBtn_deselect_all);
		p.Wrk1DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk1DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk1DtlBtnPanel.add(p.Wrk1DtlBtn_deselect_all);
		p.Wrk1DtlBtn_deselect_all.setNextBeans(p.Wrk1DtlBtn_radd);
		p.Wrk1DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk1DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk1DtlBtnPanel.add(p.Wrk1DtlBtn_radd);
		p.Wrk1DtlBtn_radd.setNextBeans(p.Wrk1DtlBtn_rdel);
		p.Wrk1DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk1DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk1DtlBtnPanel.add(p.Wrk1DtlBtn_rdel);
		p.Wrk1DtlBtn_rdel.setNextBeans(p.Wrk1DtlBtn_rcopy);
		p.Wrk1DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk1DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk1DtlBtnPanel.add(p.Wrk1DtlBtn_rcopy);
	}

	/**
	 * [Wrk2]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2Panel.setNextBeans(p.Wrk3Panel);
		p.Wrk2Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk2Panel.add(p.Wrk2SetDtHdrPanel, null);
		p.Wrk2Panel.setLastBeans(p.Wrk2SetDtHdrPanel);
		p.Wrk2SetDtHdrPanel.setNextBeans(p.Wrk2DtlPanel);
		p.Wrk2Panel.add(p.Wrk2DtlPanel, null);
		p.Wrk2DtlPanel.setNextBeans(p.Wrk2DtlBtnPanel);
		p.Wrk2Panel.add(p.Wrk2DtlBtnPanel, null);
	}

	/**
	 * [Wrk2SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2SetDtHdrPanel.setValueCheck(false);
		p.Wrk2SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdrPanel.setLastBeans(p.Wrk2SetDtHdr_st_dt);
		p.Wrk2SetDtHdr_st_dt.setNextBeans(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_st_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR.st_dt_META);
		p.Wrk2SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt_Label);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_end_dt);
		p.Wrk2SetDtHdr_end_dt.setNextBeans(p.Wrk2SetDtHdr_set_dt);
		p.Wrk2SetDtHdr_end_dt.setRow(p.getWrk2SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk2SetDtHdrR.end_dt_META);
		p.Wrk2SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk2SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk2SetDtHdrPanel.add(p.Wrk2SetDtHdr_set_dt);
	}

	/**
	 * [Wrk2Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlPanel.add(p.Wrk2DtlScrollPane);
		p.Wrk2DtlPanel.setLastBeans(p.Wrk2DtlTable);
		p.Wrk2DtlScrollPane.setViewportView(p.Wrk2DtlTable);
		p.Wrk2DtlTable.setList(p.getWrk2DtlL());
		p.Wrk2DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk2DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk2DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk2DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk2DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk2DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_select_all);
		p.Wrk2DtlBtnPanel.setLastBeans(p.Wrk2DtlBtn_select_all);
		p.Wrk2DtlBtn_select_all.setNextBeans(p.Wrk2DtlBtn_deselect_all);
		p.Wrk2DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk2DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_deselect_all);
		p.Wrk2DtlBtn_deselect_all.setNextBeans(p.Wrk2DtlBtn_radd);
		p.Wrk2DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk2DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_radd);
		p.Wrk2DtlBtn_radd.setNextBeans(p.Wrk2DtlBtn_rdel);
		p.Wrk2DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk2DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_rdel);
		p.Wrk2DtlBtn_rdel.setNextBeans(p.Wrk2DtlBtn_rcopy);
		p.Wrk2DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk2DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk2DtlBtnPanel.add(p.Wrk2DtlBtn_rcopy);
	}

	/**
	 * [Wrk3]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3Panel.setNextBeans(p.Wrk8Panel);
		p.Wrk3Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk3Panel.add(p.Wrk3DtlPanel, null);
		p.Wrk3Panel.setLastBeans(p.Wrk3DtlPanel);
		p.Wrk3DtlPanel.setNextBeans(p.Wrk3DtlBtnPanel);
		p.Wrk3Panel.add(p.Wrk3DtlBtnPanel, null);
	}

	/**
	 * [Wrk3Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlPanel.add(p.Wrk3DtlScrollPane);
		p.Wrk3DtlPanel.setLastBeans(p.Wrk3DtlTable);
		p.Wrk3DtlScrollPane.setViewportView(p.Wrk3DtlTable);
		p.Wrk3DtlTable.setList(p.getWrk3DtlL());
		p.Wrk3DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk3DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk3DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk3DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk3DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk3DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtnPanel.setLastBeans(p.Wrk3DtlBtn_select_all);
		p.Wrk3DtlBtn_select_all.setNextBeans(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk3DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_deselect_all);
		p.Wrk3DtlBtn_deselect_all.setNextBeans(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk3DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_radd);
		p.Wrk3DtlBtn_radd.setNextBeans(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk3DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rdel);
		p.Wrk3DtlBtn_rdel.setNextBeans(p.Wrk3DtlBtn_rcopy);
		p.Wrk3DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk3DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk3DtlBtnPanel.add(p.Wrk3DtlBtn_rcopy);
	}

	/**
	 * [Wrk4]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4Panel.setNextBeans(p.Wrk5Panel);
		p.Wrk4Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk4Panel.add(p.Wrk4DtlPanel, null);
		p.Wrk4Panel.setLastBeans(p.Wrk4DtlPanel);
		p.Wrk4DtlPanel.setNextBeans(p.Wrk4DtlBtnPanel);
		p.Wrk4Panel.add(p.Wrk4DtlBtnPanel, null);
	}

	/**
	 * [Wrk4Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlPanel.add(p.Wrk4DtlScrollPane);
		p.Wrk4DtlPanel.setLastBeans(p.Wrk4DtlTable);
		p.Wrk4DtlScrollPane.setViewportView(p.Wrk4DtlTable);
		p.Wrk4DtlTable.setList(p.getWrk4DtlL());
		p.Wrk4DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk4DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk4DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk4DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk4DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk4DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_select_all);
		p.Wrk4DtlBtnPanel.setLastBeans(p.Wrk4DtlBtn_select_all);
		p.Wrk4DtlBtn_select_all.setNextBeans(p.Wrk4DtlBtn_deselect_all);
		p.Wrk4DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk4DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_deselect_all);
		p.Wrk4DtlBtn_deselect_all.setNextBeans(p.Wrk4DtlBtn_radd);
		p.Wrk4DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk4DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_radd);
		p.Wrk4DtlBtn_radd.setNextBeans(p.Wrk4DtlBtn_rdel);
		p.Wrk4DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk4DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_rdel);
		p.Wrk4DtlBtn_rdel.setNextBeans(p.Wrk4DtlBtn_rcopy);
		p.Wrk4DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk4DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk4DtlBtnPanel.add(p.Wrk4DtlBtn_rcopy);
	}

	/**
	 * [Wrk5]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5Panel.setNextBeans(p.Wrk6Panel);
		p.Wrk5Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk5Panel.add(p.Wrk5SetDtHdrPanel, null);
		p.Wrk5Panel.setLastBeans(p.Wrk5SetDtHdrPanel);
		p.Wrk5SetDtHdrPanel.setNextBeans(p.Wrk5DtlPanel);
		p.Wrk5Panel.add(p.Wrk5DtlPanel, null);
		p.Wrk5DtlPanel.setNextBeans(p.Wrk5DtlBtnPanel);
		p.Wrk5Panel.add(p.Wrk5DtlBtnPanel, null);
	}

	/**
	 * [Wrk5SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5SetDtHdrPanel.setValueCheck(false);
		p.Wrk5SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk5SetDtHdrPanel.add(p.Wrk5SetDtHdr_st_dt_Label);
		p.Wrk5SetDtHdrPanel.add(p.Wrk5SetDtHdr_st_dt);
		p.Wrk5SetDtHdrPanel.setLastBeans(p.Wrk5SetDtHdr_st_dt);
		p.Wrk5SetDtHdr_st_dt.setNextBeans(p.Wrk5SetDtHdr_end_dt);
		p.Wrk5SetDtHdr_st_dt.setRow(p.getWrk5SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR.st_dt_META);
		p.Wrk5SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk5SetDtHdrPanel.add(p.Wrk5SetDtHdr_end_dt_Label);
		p.Wrk5SetDtHdrPanel.add(p.Wrk5SetDtHdr_end_dt);
		p.Wrk5SetDtHdr_end_dt.setNextBeans(p.Wrk5SetDtHdr_set_dt);
		p.Wrk5SetDtHdr_end_dt.setRow(p.getWrk5SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk5SetDtHdrR.end_dt_META);
		p.Wrk5SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk5SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk5SetDtHdrPanel.add(p.Wrk5SetDtHdr_set_dt);
	}

	/**
	 * [Wrk5Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlPanel.add(p.Wrk5DtlScrollPane);
		p.Wrk5DtlPanel.setLastBeans(p.Wrk5DtlTable);
		p.Wrk5DtlScrollPane.setViewportView(p.Wrk5DtlTable);
		p.Wrk5DtlTable.setList(p.getWrk5DtlL());
		p.Wrk5DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk5DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk5DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk5DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk5DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk5DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_select_all);
		p.Wrk5DtlBtnPanel.setLastBeans(p.Wrk5DtlBtn_select_all);
		p.Wrk5DtlBtn_select_all.setNextBeans(p.Wrk5DtlBtn_deselect_all);
		p.Wrk5DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk5DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_deselect_all);
		p.Wrk5DtlBtn_deselect_all.setNextBeans(p.Wrk5DtlBtn_radd);
		p.Wrk5DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk5DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_radd);
		p.Wrk5DtlBtn_radd.setNextBeans(p.Wrk5DtlBtn_rdel);
		p.Wrk5DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk5DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_rdel);
		p.Wrk5DtlBtn_rdel.setNextBeans(p.Wrk5DtlBtn_rcopy);
		p.Wrk5DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk5DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk5DtlBtnPanel.add(p.Wrk5DtlBtn_rcopy);
	}

	/**
	 * [Wrk6]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6Panel.setNextBeans(p.Wrk7Panel);
		p.Wrk6Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk6Panel.add(p.Wrk6SetDtHdrPanel, null);
		p.Wrk6Panel.setLastBeans(p.Wrk6SetDtHdrPanel);
		p.Wrk6SetDtHdrPanel.setNextBeans(p.Wrk6DtlPanel);
		p.Wrk6Panel.add(p.Wrk6DtlPanel, null);
		p.Wrk6DtlPanel.setNextBeans(p.Wrk6DtlBtnPanel);
		p.Wrk6Panel.add(p.Wrk6DtlBtnPanel, null);
	}

	/**
	 * [Wrk6SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6SetDtHdrPanel.setValueCheck(false);
		p.Wrk6SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk6SetDtHdrPanel.add(p.Wrk6SetDtHdr_st_dt_Label);
		p.Wrk6SetDtHdrPanel.add(p.Wrk6SetDtHdr_st_dt);
		p.Wrk6SetDtHdrPanel.setLastBeans(p.Wrk6SetDtHdr_st_dt);
		p.Wrk6SetDtHdr_st_dt.setNextBeans(p.Wrk6SetDtHdr_end_dt);
		p.Wrk6SetDtHdr_st_dt.setRow(p.getWrk6SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR.st_dt_META);
		p.Wrk6SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk6SetDtHdrPanel.add(p.Wrk6SetDtHdr_end_dt_Label);
		p.Wrk6SetDtHdrPanel.add(p.Wrk6SetDtHdr_end_dt);
		p.Wrk6SetDtHdr_end_dt.setNextBeans(p.Wrk6SetDtHdr_set_dt);
		p.Wrk6SetDtHdr_end_dt.setRow(p.getWrk6SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk6SetDtHdrR.end_dt_META);
		p.Wrk6SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk6SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk6SetDtHdrPanel.add(p.Wrk6SetDtHdr_set_dt);
	}

	/**
	 * [Wrk6Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlPanel.add(p.Wrk6DtlScrollPane);
		p.Wrk6DtlPanel.setLastBeans(p.Wrk6DtlTable);
		p.Wrk6DtlScrollPane.setViewportView(p.Wrk6DtlTable);
		p.Wrk6DtlTable.setList(p.getWrk6DtlL());
		p.Wrk6DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk6DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk6DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk6DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk6DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk6DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_select_all);
		p.Wrk6DtlBtnPanel.setLastBeans(p.Wrk6DtlBtn_select_all);
		p.Wrk6DtlBtn_select_all.setNextBeans(p.Wrk6DtlBtn_deselect_all);
		p.Wrk6DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk6DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_deselect_all);
		p.Wrk6DtlBtn_deselect_all.setNextBeans(p.Wrk6DtlBtn_radd);
		p.Wrk6DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk6DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_radd);
		p.Wrk6DtlBtn_radd.setNextBeans(p.Wrk6DtlBtn_rdel);
		p.Wrk6DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk6DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_rdel);
		p.Wrk6DtlBtn_rdel.setNextBeans(p.Wrk6DtlBtn_rcopy);
		p.Wrk6DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk6DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk6DtlBtnPanel.add(p.Wrk6DtlBtn_rcopy);
	}

	/**
	 * [Wrk7]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk7Panel.add(p.Wrk7SetDtHdrPanel, null);
		p.Wrk7Panel.setLastBeans(p.Wrk7SetDtHdrPanel);
		p.Wrk7SetDtHdrPanel.setNextBeans(p.Wrk7DtlPanel);
		p.Wrk7Panel.add(p.Wrk7DtlPanel, null);
		p.Wrk7DtlPanel.setNextBeans(p.Wrk7DtlBtnPanel);
		p.Wrk7Panel.add(p.Wrk7DtlBtnPanel, null);
	}

	/**
	 * [Wrk7SetDtHdr]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7SetDtHdr(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7SetDtHdrPanel.setValueCheck(false);
		p.Wrk7SetDtHdrPanel.setLayoutPosition("N");
		// ブロックの項目の初期化
		p.Wrk7SetDtHdrPanel.add(p.Wrk7SetDtHdr_st_dt_Label);
		p.Wrk7SetDtHdrPanel.add(p.Wrk7SetDtHdr_st_dt);
		p.Wrk7SetDtHdrPanel.setLastBeans(p.Wrk7SetDtHdr_st_dt);
		p.Wrk7SetDtHdr_st_dt.setNextBeans(p.Wrk7SetDtHdr_end_dt);
		p.Wrk7SetDtHdr_st_dt.setRow(p.getWrk7SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR.st_dt_META);
		p.Wrk7SetDtHdr_st_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk7SetDtHdrPanel.add(p.Wrk7SetDtHdr_end_dt_Label);
		p.Wrk7SetDtHdrPanel.add(p.Wrk7SetDtHdr_end_dt);
		p.Wrk7SetDtHdr_end_dt.setNextBeans(p.Wrk7SetDtHdr_set_dt);
		p.Wrk7SetDtHdr_end_dt.setRow(p.getWrk7SetDtHdrR(), mcframe.clientMABS.MABSP1110.Wrk7SetDtHdrR.end_dt_META);
		p.Wrk7SetDtHdr_end_dt.setFormatID(mcframe.commonMA.meta.MA_META.DT_FORMAT);
		p.Wrk7SetDtHdr_set_dt.setFunctionKey(MCFunctionKey.F7);
		p.Wrk7SetDtHdrPanel.add(p.Wrk7SetDtHdr_set_dt);
	}

	/**
	 * [Wrk7Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlPanel.add(p.Wrk7DtlScrollPane);
		p.Wrk7DtlPanel.setLastBeans(p.Wrk7DtlTable);
		p.Wrk7DtlScrollPane.setViewportView(p.Wrk7DtlTable);
		p.Wrk7DtlTable.setList(p.getWrk7DtlL());
		p.Wrk7DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk7DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk7DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk7DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk7DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk7DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_select_all);
		p.Wrk7DtlBtnPanel.setLastBeans(p.Wrk7DtlBtn_select_all);
		p.Wrk7DtlBtn_select_all.setNextBeans(p.Wrk7DtlBtn_deselect_all);
		p.Wrk7DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk7DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_deselect_all);
		p.Wrk7DtlBtn_deselect_all.setNextBeans(p.Wrk7DtlBtn_radd);
		p.Wrk7DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk7DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_radd);
		p.Wrk7DtlBtn_radd.setNextBeans(p.Wrk7DtlBtn_rdel);
		p.Wrk7DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk7DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_rdel);
		p.Wrk7DtlBtn_rdel.setNextBeans(p.Wrk7DtlBtn_rcopy);
		p.Wrk7DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk7DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk7DtlBtnPanel.add(p.Wrk7DtlBtn_rcopy);
	}

	/**
	 * [Wrk8]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk8(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8Panel.setNextBeans(p.Wrk4Panel);
		p.Wrk8Panel.setLayoutPosition("CTC+");
		// ブロックの項目の初期化
		p.Wrk8Panel.add(p.Wrk8DtlPanel, null);
		p.Wrk8Panel.setLastBeans(p.Wrk8DtlPanel);
		p.Wrk8DtlPanel.setNextBeans(p.Wrk8DtlBtnPanel);
		p.Wrk8Panel.add(p.Wrk8DtlBtnPanel, null);
	}

	/**
	 * [Wrk8Dtl]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk8Dtl(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8DtlPanel.add(p.Wrk8DtlScrollPane);
		p.Wrk8DtlPanel.setLastBeans(p.Wrk8DtlTable);
		p.Wrk8DtlScrollPane.setViewportView(p.Wrk8DtlTable);
		p.Wrk8DtlTable.setList(p.getWrk8DtlL());
		p.Wrk8DtlPanel.setLayoutPosition("C");
		// ブロックの項目の初期化
	}

	/**
	 * [Wrk8DtlBtn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitWrk8DtlBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.Wrk8DtlBtnPanel.setLayoutPosition("S");
		// ブロックの項目の初期化
		p.Wrk8DtlBtn_select_all.setIcon("SELECT_ALL");
		p.Wrk8DtlBtn_select_all.setFunctionKey(MCFunctionKey.F13);
		p.Wrk8DtlBtnPanel.add(p.Wrk8DtlBtn_select_all);
		p.Wrk8DtlBtnPanel.setLastBeans(p.Wrk8DtlBtn_select_all);
		p.Wrk8DtlBtn_select_all.setNextBeans(p.Wrk8DtlBtn_deselect_all);
		p.Wrk8DtlBtn_deselect_all.setIcon("DESELECT_ALL");
		p.Wrk8DtlBtn_deselect_all.setFunctionKey(MCFunctionKey.F14);
		p.Wrk8DtlBtnPanel.add(p.Wrk8DtlBtn_deselect_all);
		p.Wrk8DtlBtn_deselect_all.setNextBeans(p.Wrk8DtlBtn_radd);
		p.Wrk8DtlBtn_radd.setIcon("INSERT_RECORD");
		p.Wrk8DtlBtn_radd.setFunctionKey(MCFunctionKey.F5);
		p.Wrk8DtlBtnPanel.add(p.Wrk8DtlBtn_radd);
		p.Wrk8DtlBtn_radd.setNextBeans(p.Wrk8DtlBtn_rdel);
		p.Wrk8DtlBtn_rdel.setIcon("DELETE_RECORD");
		p.Wrk8DtlBtn_rdel.setFunctionKey(MCFunctionKey.F6);
		p.Wrk8DtlBtnPanel.add(p.Wrk8DtlBtn_rdel);
		p.Wrk8DtlBtn_rdel.setNextBeans(p.Wrk8DtlBtn_rcopy);
		p.Wrk8DtlBtn_rcopy.setIcon("COPY_RECORD");
		p.Wrk8DtlBtn_rcopy.setFunctionKey(MCFunctionKey.F17);
		p.Wrk8DtlBtnPanel.add(p.Wrk8DtlBtn_rcopy);
	}

	/**
	 * [Btn]ブロック関連の画面部品初期設定２
	 */
	protected static void jbInitBtn(MABSP_PurcItmReg p) {
		// ブロック関連の初期化
		p.add(p.BtnPanel);
		p.BtnPanel.setLayoutPosition("SW");
		// ブロックの項目の初期化
		p.Btn_open_MABSP0120.setFunctionKey(MCFunctionKey.F3);
		p.BtnPanel.add(p.Btn_open_MABSP0120);
		p.BtnPanel.setLastBeans(p.Btn_open_MABSP0120);
		p.Btn_open_MABSP0120.setNextBeans(p.Hdr_purc_flg);
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
		MABSP_PurcItmReg_MC.mcInitScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitTop((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitFold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitCnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitCtrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitTbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitDtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitWrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.mcInitBtn((MABSP_PurcItmReg)this);

		// [SRCH]ステータスのモードの設定
		MABSP_PurcItmReg_MC.statusInitSRCH_ScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Top((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Fold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Cnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Ctrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Tbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Hdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_HdrAll((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_DtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Wrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitSRCH_Btn((MABSP_PurcItmReg)this);

		// [UPD]ステータスのモードの設定
		MABSP_PurcItmReg_MC.statusInitUPD_ScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Top((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Fold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Cnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Ctrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Tbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Hdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_HdrAll((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_DtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Wrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitUPD_Btn((MABSP_PurcItmReg)this);

		// [FIX]ステータスのモードの設定
		MABSP_PurcItmReg_MC.statusInitFIX_ScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Top((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Fold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Cnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Ctrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Tbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Hdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_HdrAll((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_DtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Wrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitFIX_Btn((MABSP_PurcItmReg)this);

		// [REF]ステータスのモードの設定
		MABSP_PurcItmReg_MC.statusInitREF_ScreenOpe((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Top((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Fold((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Cnd((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Ctrl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Tbl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Hdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_HdrAll((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_DtlTab((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk1((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk1SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk1DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk2((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk2SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk2DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk3((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk3DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk4((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk4DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk5((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk5SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk5DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk6((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk6SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk6DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk7((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk7SetDtHdr((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk7DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk8((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk8Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Wrk8DtlBtn((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.statusInitREF_Btn((MABSP_PurcItmReg)this);

	}

	/**
	 *  [ScreenOpe]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitScreenOpe(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Top]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTop(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Fold]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitFold(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Cnd]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCnd(MABSP_PurcItmReg p) {
		p.Cnd_ope_Group.addAllListener(p);
		p.Cnd_ope_UPD.addAllListener(p);
		p.Cnd_ope_REF.addAllListener(p);
		p.Cnd_off_del_flg.addAllListener(p);
		p.Cnd_on_del_flg.addAllListener(p);
	}

	/**
	 *  [Ctrl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitCtrl(MABSP_PurcItmReg p) {
		p.Ctrl_ctrl_PPanel.Ope_srch.addAllListener(p);
	}

	/**
	 *  [Tbl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitTbl(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Hdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitHdr(MABSP_PurcItmReg p) {
		p.Hdr_unit_cd.setListListener(p);
		p.Hdr_unit_cd.addAllListener(p);
		p.Hdr_unit_nm.setListListener(p);
		p.Hdr_unit_nm.addAllListener(p);
		p.Hdr_stk_mng_typ.setListListener(p);
		p.Hdr_stk_mng_typ.addAllListener(p);
		p.Hdr_stk_mng_typ_nm.setListListener(p);
		p.Hdr_stk_mng_typ_nm.addAllListener(p);
		p.Hdr_asset_mng_typ.setListListener(p);
		p.Hdr_asset_mng_typ.addAllListener(p);
		p.Hdr_asset_mng_typ_nm.setListListener(p);
		p.Hdr_asset_mng_typ_nm.addAllListener(p);
		p.Hdr_dec_place.setListListener(p);
		p.Hdr_dec_place.addAllListener(p);
		p.Hdr_sundry_itm_flg.addAllListener(p);
		p.Hdr_sno1_mng_typ.setListListener(p);
		p.Hdr_sno1_mng_typ.addAllListener(p);
		p.Hdr_sno2_mng_typ.setListListener(p);
		p.Hdr_sno2_mng_typ.addAllListener(p);
		p.Hdr_sno3_mng_typ.setListListener(p);
		p.Hdr_sno3_mng_typ.addAllListener(p);
		p.Hdr_sno4_mng_typ.setListListener(p);
		p.Hdr_sno4_mng_typ.addAllListener(p);
		p.Hdr_purc_flg.addAllListener(p);
		p.Hdr_purc_input_flg.addAllListener(p);
		p.Hdr_upd.addAllListener(p);
		p.Hdr_upd.setAPMethodName("doHdr_upd");
		p.Hdr_upd_cntr.setListListener(p);
		p.Hdr_upd_cntr.addAllListener(p);
		p.Hdr_check.addAllListener(p);
	}

	/**
	 *  [DtlTab]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitDtlTab(MABSP_PurcItmReg p) {
		p.DtlTabTab.addAllListener(p);
	}

	/**
	 *  [Wrk1]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk1SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1SetDtHdr(MABSP_PurcItmReg p) {
		p.Wrk1SetDtHdr_st_dt.setListListener(p);
		p.Wrk1SetDtHdr_st_dt.addAllListener(p);
		p.Wrk1SetDtHdr_end_dt.setListListener(p);
		p.Wrk1SetDtHdr_end_dt.addAllListener(p);
		p.Wrk1SetDtHdr_set_dt.addAllListener(p);
		p.Wrk1SetDtHdr_set_dt.setAPMethodName("doWrk1SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk1Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1Dtl(MABSP_PurcItmReg p) {
		p.Wrk1DtlTable.addAllListener(p);
		p.columnWrk1Dtl_check.addAllListener(p);
		p.columnWrk1Dtl_del_flg.addAllListener(p);
		p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk1Dtl_wg_cd.addAllListener(p);
		p.columnWrk1Dtl_wg_cd.setListListener(p);
		p.columnWrk1Dtl_wg_nm.addAllListener(p);
		p.columnWrk1Dtl_wg_nm.setListListener(p);
		p.columnWrk1Dtl_sppl_cd.addAllListener(p);
		p.columnWrk1Dtl_sppl_cd.setListListener(p);
		p.columnWrk1Dtl_sppl_nm.addAllListener(p);
		p.columnWrk1Dtl_sppl_nm.setListListener(p);
		p.columnWrk1Dtl_maker_cd.addAllListener(p);
		p.columnWrk1Dtl_maker_cd.setListListener(p);
		p.columnWrk1Dtl_maker_nm.addAllListener(p);
		p.columnWrk1Dtl_maker_nm.setListListener(p);
		p.columnWrk1Dtl_purc_id_typ.addAllListener(p);
		p.columnWrk1Dtl_purc_id_typ.setListListener(p);
		p.columnWrk1Dtl_purc_id_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_purc_id_typ_nm.setListListener(p);
		p.columnWrk1Dtl_purc_lt.addAllListener(p);
		p.columnWrk1Dtl_purc_lt.setListListener(p);
		p.columnWrk1Dtl_purc_basis_typ.addAllListener(p);
		p.columnWrk1Dtl_purc_basis_typ.setListListener(p);
		p.columnWrk1Dtl_purc_basis_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_purc_basis_typ_nm.setListListener(p);
		p.columnWrk1Dtl_accpt_insp_lt.addAllListener(p);
		p.columnWrk1Dtl_accpt_insp_lt.setListListener(p);
		p.columnWrk1Dtl_buf_lt.addAllListener(p);
		p.columnWrk1Dtl_buf_lt.setListListener(p);
		p.columnWrk1Dtl_ord_fix_pd.addAllListener(p);
		p.columnWrk1Dtl_ord_fix_pd.setListListener(p);
		p.columnWrk1Dtl_sz_day_week_typ.addAllListener(p);
		p.columnWrk1Dtl_sz_day_week_typ.setListListener(p);
		p.columnWrk1Dtl_sz_day_week_typ_nm.addAllListener(p);
		p.columnWrk1Dtl_sz_day_week_typ_nm.setListListener(p);
		p.columnWrk1Dtl_sz_week.addAllListener(p);
		p.columnWrk1Dtl_sz_week.setListListener(p);
		p.columnWrk1Dtl_lot_sz_pd.addAllListener(p);
		p.columnWrk1Dtl_lot_sz_pd.setListListener(p);
		p.columnWrk1Dtl_max_order.addAllListener(p);
		p.columnWrk1Dtl_max_order.setListListener(p);
		p.columnWrk1Dtl_prio.addAllListener(p);
		p.columnWrk1Dtl_prio.setListListener(p);
		p.columnWrk1Dtl_order_ratio.addAllListener(p);
		p.columnWrk1Dtl_order_ratio.setListListener(p);
		p.columnWrk1Dtl_pre_po_tgt_flg.addAllListener(p);
		p.columnWrk1Dtl_rqst_wg_cd.addAllListener(p);
		p.columnWrk1Dtl_rqst_wg_cd.setListListener(p);
		p.columnWrk1Dtl_rqst_wg_nm.addAllListener(p);
		p.columnWrk1Dtl_rqst_wg_nm.setListListener(p);
		p.columnWrk1Dtl_po_batch_flg.addAllListener(p);
		p.columnWrk1Dtl_not_mrp_flg.addAllListener(p);
		p.columnWrk1Dtl_cost_ratio.addAllListener(p);
		p.columnWrk1Dtl_cost_ratio.setListListener(p);
		p.columnWrk1Dtl_memo1.addAllListener(p);
		p.columnWrk1Dtl_memo1.setListListener(p);
		p.columnWrk1Dtl_memo2.addAllListener(p);
		p.columnWrk1Dtl_memo2.setListListener(p);
		p.columnWrk1Dtl_memo3.addAllListener(p);
		p.columnWrk1Dtl_memo3.setListListener(p);
		p.columnWrk1Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk1Dtl_ins_usr_id.setListListener(p);
		p.columnWrk1Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk1Dtl_ins_ts.addAllListener(p);
		p.columnWrk1Dtl_ins_ts.setListListener(p);
		p.columnWrk1Dtl_ins_func_id.addAllListener(p);
		p.columnWrk1Dtl_ins_func_id.setListListener(p);
		p.columnWrk1Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk1Dtl_ins_func_nm.setListListener(p);
		p.columnWrk1Dtl_upd_cntr.addAllListener(p);
		p.columnWrk1Dtl_upd_cntr.setListListener(p);
		p.columnWrk1Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk1Dtl_upd_usr_id.setListListener(p);
		p.columnWrk1Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk1Dtl_upd_ts.addAllListener(p);
		p.columnWrk1Dtl_upd_ts.setListListener(p);
		p.columnWrk1Dtl_upd_func_id.addAllListener(p);
		p.columnWrk1Dtl_upd_func_id.setListListener(p);
		p.columnWrk1Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk1Dtl_upd_func_nm.setListListener(p);
		p.columnWrk1Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk1Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk1Dtl_del_usr_id.addAllListener(p);
		p.columnWrk1Dtl_del_usr_id.setListListener(p);
		p.columnWrk1Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk1Dtl_del_usr_nm.setListListener(p);
		p.columnWrk1Dtl_del_ts.addAllListener(p);
		p.columnWrk1Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk1DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk1DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk1DtlBtn_select_all.addAllListener(p);
		p.Wrk1DtlBtn_select_all.setAPMethodName("doWrk1DtlBtn_select_all");
		p.Wrk1DtlBtn_deselect_all.addAllListener(p);
		p.Wrk1DtlBtn_deselect_all.setAPMethodName("doWrk1DtlBtn_deselect_all");
		p.Wrk1DtlBtn_radd.addAllListener(p);
		p.Wrk1DtlBtn_radd.setAPMethodName("doWrk1DtlBtn_radd");
		p.Wrk1DtlBtn_rdel.addAllListener(p);
		p.Wrk1DtlBtn_rdel.setAPMethodName("doWrk1DtlBtn_rdel");
		p.Wrk1DtlBtn_rcopy.addAllListener(p);
		p.Wrk1DtlBtn_rcopy.setAPMethodName("doWrk1DtlBtn_rcopy");
	}

	/**
	 *  [Wrk2]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk2SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2SetDtHdr(MABSP_PurcItmReg p) {
		p.Wrk2SetDtHdr_st_dt.setListListener(p);
		p.Wrk2SetDtHdr_st_dt.addAllListener(p);
		p.Wrk2SetDtHdr_end_dt.setListListener(p);
		p.Wrk2SetDtHdr_end_dt.addAllListener(p);
		p.Wrk2SetDtHdr_set_dt.addAllListener(p);
		p.Wrk2SetDtHdr_set_dt.setAPMethodName("doWrk2SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk2Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2Dtl(MABSP_PurcItmReg p) {
		p.Wrk2DtlTable.addAllListener(p);
		p.columnWrk2Dtl_check.addAllListener(p);
		p.columnWrk2Dtl_del_flg.addAllListener(p);
		p.columnWrk2Dtl_wg_cd.addAllListener(p);
		p.columnWrk2Dtl_wg_cd.setListListener(p);
		p.columnWrk2Dtl_wg_nm.addAllListener(p);
		p.columnWrk2Dtl_wg_nm.setListListener(p);
		p.columnWrk2Dtl_rqst_loc_cd.addAllListener(p);
		p.columnWrk2Dtl_rqst_loc_cd.setListListener(p);
		p.columnWrk2Dtl_rqst_loc_nm.addAllListener(p);
		p.columnWrk2Dtl_rqst_loc_nm.setListListener(p);
		p.columnWrk2Dtl_buf_lt.addAllListener(p);
		p.columnWrk2Dtl_buf_lt.setListListener(p);
		p.columnWrk2Dtl_ord_fix_pd.addAllListener(p);
		p.columnWrk2Dtl_ord_fix_pd.setListListener(p);
		p.columnWrk2Dtl_sz_day_week_typ.addAllListener(p);
		p.columnWrk2Dtl_sz_day_week_typ.setListListener(p);
		p.columnWrk2Dtl_sz_day_week_typ_nm.addAllListener(p);
		p.columnWrk2Dtl_sz_day_week_typ_nm.setListListener(p);
		p.columnWrk2Dtl_sz_week.addAllListener(p);
		p.columnWrk2Dtl_sz_week.setListListener(p);
		p.columnWrk2Dtl_lot_sz_pd.addAllListener(p);
		p.columnWrk2Dtl_lot_sz_pd.setListListener(p);
		p.columnWrk2Dtl_max_order.addAllListener(p);
		p.columnWrk2Dtl_max_order.setListListener(p);
		p.columnWrk2Dtl_prio.addAllListener(p);
		p.columnWrk2Dtl_prio.setListListener(p);
		p.columnWrk2Dtl_order_ratio.addAllListener(p);
		p.columnWrk2Dtl_order_ratio.setListListener(p);
		p.columnWrk2Dtl_pre_po_tgt_flg.addAllListener(p);
		p.columnWrk2Dtl_not_mrp_flg.addAllListener(p);
		p.columnWrk2Dtl_memo1.addAllListener(p);
		p.columnWrk2Dtl_memo1.setListListener(p);
		p.columnWrk2Dtl_memo2.addAllListener(p);
		p.columnWrk2Dtl_memo2.setListListener(p);
		p.columnWrk2Dtl_memo3.addAllListener(p);
		p.columnWrk2Dtl_memo3.setListListener(p);
		p.columnWrk2Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_id.setListListener(p);
		p.columnWrk2Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk2Dtl_ins_ts.addAllListener(p);
		p.columnWrk2Dtl_ins_ts.setListListener(p);
		p.columnWrk2Dtl_ins_func_id.addAllListener(p);
		p.columnWrk2Dtl_ins_func_id.setListListener(p);
		p.columnWrk2Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk2Dtl_ins_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_cntr.addAllListener(p);
		p.columnWrk2Dtl_upd_cntr.setListListener(p);
		p.columnWrk2Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_id.setListListener(p);
		p.columnWrk2Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk2Dtl_upd_ts.addAllListener(p);
		p.columnWrk2Dtl_upd_ts.setListListener(p);
		p.columnWrk2Dtl_upd_func_id.addAllListener(p);
		p.columnWrk2Dtl_upd_func_id.setListListener(p);
		p.columnWrk2Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk2Dtl_upd_func_nm.setListListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk2Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk2Dtl_del_usr_id.addAllListener(p);
		p.columnWrk2Dtl_del_usr_id.setListListener(p);
		p.columnWrk2Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk2Dtl_del_usr_nm.setListListener(p);
		p.columnWrk2Dtl_del_ts.addAllListener(p);
		p.columnWrk2Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk2DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk2DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk2DtlBtn_select_all.addAllListener(p);
		p.Wrk2DtlBtn_select_all.setAPMethodName("doWrk2DtlBtn_select_all");
		p.Wrk2DtlBtn_deselect_all.addAllListener(p);
		p.Wrk2DtlBtn_deselect_all.setAPMethodName("doWrk2DtlBtn_deselect_all");
		p.Wrk2DtlBtn_radd.addAllListener(p);
		p.Wrk2DtlBtn_radd.setAPMethodName("doWrk2DtlBtn_radd");
		p.Wrk2DtlBtn_rdel.addAllListener(p);
		p.Wrk2DtlBtn_rdel.setAPMethodName("doWrk2DtlBtn_rdel");
		p.Wrk2DtlBtn_rcopy.addAllListener(p);
		p.Wrk2DtlBtn_rcopy.setAPMethodName("doWrk2DtlBtn_rcopy");
	}

	/**
	 *  [Wrk3]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk3Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3Dtl(MABSP_PurcItmReg p) {
		p.Wrk3DtlTable.addAllListener(p);
		p.columnWrk3Dtl_check.addAllListener(p);
		p.columnWrk3Dtl_del_flg.addAllListener(p);
		p.columnWrk3Dtl_loc_cd.addAllListener(p);
		p.columnWrk3Dtl_loc_cd.setListListener(p);
		p.columnWrk3Dtl_loc_nm.addAllListener(p);
		p.columnWrk3Dtl_loc_nm.setListListener(p);
		p.columnWrk3Dtl_wg_cd.addAllListener(p);
		p.columnWrk3Dtl_wg_cd.setListListener(p);
		p.columnWrk3Dtl_wg_nm.addAllListener(p);
		p.columnWrk3Dtl_wg_nm.setListListener(p);
		p.columnWrk3Dtl_loc_grp_cd.addAllListener(p);
		p.columnWrk3Dtl_loc_grp_cd.setListListener(p);
		p.columnWrk3Dtl_loc_grp_nm.addAllListener(p);
		p.columnWrk3Dtl_loc_grp_nm.setListListener(p);
		p.columnWrk3Dtl_prio.addAllListener(p);
		p.columnWrk3Dtl_prio.setListListener(p);
		p.columnWrk3Dtl_memo1.addAllListener(p);
		p.columnWrk3Dtl_memo1.setListListener(p);
		p.columnWrk3Dtl_memo2.addAllListener(p);
		p.columnWrk3Dtl_memo2.setListListener(p);
		p.columnWrk3Dtl_memo3.addAllListener(p);
		p.columnWrk3Dtl_memo3.setListListener(p);
		p.columnWrk3Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_id.setListListener(p);
		p.columnWrk3Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk3Dtl_ins_ts.addAllListener(p);
		p.columnWrk3Dtl_ins_ts.setListListener(p);
		p.columnWrk3Dtl_ins_func_id.addAllListener(p);
		p.columnWrk3Dtl_ins_func_id.setListListener(p);
		p.columnWrk3Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk3Dtl_ins_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_cntr.addAllListener(p);
		p.columnWrk3Dtl_upd_cntr.setListListener(p);
		p.columnWrk3Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_id.setListListener(p);
		p.columnWrk3Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk3Dtl_upd_ts.addAllListener(p);
		p.columnWrk3Dtl_upd_ts.setListListener(p);
		p.columnWrk3Dtl_upd_func_id.addAllListener(p);
		p.columnWrk3Dtl_upd_func_id.setListListener(p);
		p.columnWrk3Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk3Dtl_upd_func_nm.setListListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk3Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk3Dtl_del_usr_id.addAllListener(p);
		p.columnWrk3Dtl_del_usr_id.setListListener(p);
		p.columnWrk3Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk3Dtl_del_usr_nm.setListListener(p);
		p.columnWrk3Dtl_del_ts.addAllListener(p);
		p.columnWrk3Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk3DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk3DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk3DtlBtn_select_all.addAllListener(p);
		p.Wrk3DtlBtn_select_all.setAPMethodName("doWrk3DtlBtn_select_all");
		p.Wrk3DtlBtn_deselect_all.addAllListener(p);
		p.Wrk3DtlBtn_deselect_all.setAPMethodName("doWrk3DtlBtn_deselect_all");
		p.Wrk3DtlBtn_radd.addAllListener(p);
		p.Wrk3DtlBtn_radd.setAPMethodName("doWrk3DtlBtn_radd");
		p.Wrk3DtlBtn_rdel.addAllListener(p);
		p.Wrk3DtlBtn_rdel.setAPMethodName("doWrk3DtlBtn_rdel");
		p.Wrk3DtlBtn_rcopy.addAllListener(p);
		p.Wrk3DtlBtn_rcopy.setAPMethodName("doWrk3DtlBtn_rcopy");
	}

	/**
	 *  [Wrk4]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk4Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4Dtl(MABSP_PurcItmReg p) {
		p.Wrk4DtlTable.addAllListener(p);
		p.columnWrk4Dtl_check.addAllListener(p);
		p.columnWrk4Dtl_del_flg.addAllListener(p);
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk4Dtl_to_loc_cd.addAllListener(p);
		p.columnWrk4Dtl_to_loc_cd.setListListener(p);
		p.columnWrk4Dtl_to_loc_nm.addAllListener(p);
		p.columnWrk4Dtl_to_loc_nm.setListListener(p);
		p.columnWrk4Dtl_to_wg_cd.addAllListener(p);
		p.columnWrk4Dtl_to_wg_cd.setListListener(p);
		p.columnWrk4Dtl_to_wg_nm.addAllListener(p);
		p.columnWrk4Dtl_to_wg_nm.setListListener(p);
		p.columnWrk4Dtl_to_lg_grp_cd.addAllListener(p);
		p.columnWrk4Dtl_to_lg_grp_cd.setListListener(p);
		p.columnWrk4Dtl_fr_loc_cd.addAllListener(p);
		p.columnWrk4Dtl_fr_loc_cd.setListListener(p);
		p.columnWrk4Dtl_fr_loc_nm.addAllListener(p);
		p.columnWrk4Dtl_fr_loc_nm.setListListener(p);
		p.columnWrk4Dtl_fr_wg_cd.addAllListener(p);
		p.columnWrk4Dtl_fr_wg_cd.setListListener(p);
		p.columnWrk4Dtl_fr_lg_grp_cd.addAllListener(p);
		p.columnWrk4Dtl_fr_lg_grp_cd.setListListener(p);
		p.columnWrk4Dtl_prio.addAllListener(p);
		p.columnWrk4Dtl_prio.setListListener(p);
		p.columnWrk4Dtl_in_loc_flg.addAllListener(p);
		p.columnWrk4Dtl_memo1.addAllListener(p);
		p.columnWrk4Dtl_memo1.setListListener(p);
		p.columnWrk4Dtl_memo2.addAllListener(p);
		p.columnWrk4Dtl_memo2.setListListener(p);
		p.columnWrk4Dtl_memo3.addAllListener(p);
		p.columnWrk4Dtl_memo3.setListListener(p);
		p.columnWrk4Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_id.setListListener(p);
		p.columnWrk4Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk4Dtl_ins_ts.addAllListener(p);
		p.columnWrk4Dtl_ins_ts.setListListener(p);
		p.columnWrk4Dtl_ins_func_id.addAllListener(p);
		p.columnWrk4Dtl_ins_func_id.setListListener(p);
		p.columnWrk4Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk4Dtl_ins_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_cntr.addAllListener(p);
		p.columnWrk4Dtl_upd_cntr.setListListener(p);
		p.columnWrk4Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_id.setListListener(p);
		p.columnWrk4Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk4Dtl_upd_ts.addAllListener(p);
		p.columnWrk4Dtl_upd_ts.setListListener(p);
		p.columnWrk4Dtl_upd_func_id.addAllListener(p);
		p.columnWrk4Dtl_upd_func_id.setListListener(p);
		p.columnWrk4Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk4Dtl_upd_func_nm.setListListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk4Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk4Dtl_del_usr_id.addAllListener(p);
		p.columnWrk4Dtl_del_usr_id.setListListener(p);
		p.columnWrk4Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk4Dtl_del_usr_nm.setListListener(p);
		p.columnWrk4Dtl_del_ts.addAllListener(p);
		p.columnWrk4Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk4DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk4DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk4DtlBtn_select_all.addAllListener(p);
		p.Wrk4DtlBtn_select_all.setAPMethodName("doWrk4DtlBtn_select_all");
		p.Wrk4DtlBtn_deselect_all.addAllListener(p);
		p.Wrk4DtlBtn_deselect_all.setAPMethodName("doWrk4DtlBtn_deselect_all");
		p.Wrk4DtlBtn_radd.addAllListener(p);
		p.Wrk4DtlBtn_radd.setAPMethodName("doWrk4DtlBtn_radd");
		p.Wrk4DtlBtn_rdel.addAllListener(p);
		p.Wrk4DtlBtn_rdel.setAPMethodName("doWrk4DtlBtn_rdel");
		p.Wrk4DtlBtn_rcopy.addAllListener(p);
		p.Wrk4DtlBtn_rcopy.setAPMethodName("doWrk4DtlBtn_rcopy");
	}

	/**
	 *  [Wrk5]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk5SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5SetDtHdr(MABSP_PurcItmReg p) {
		p.Wrk5SetDtHdr_st_dt.setListListener(p);
		p.Wrk5SetDtHdr_st_dt.addAllListener(p);
		p.Wrk5SetDtHdr_end_dt.setListListener(p);
		p.Wrk5SetDtHdr_end_dt.addAllListener(p);
		p.Wrk5SetDtHdr_set_dt.addAllListener(p);
		p.Wrk5SetDtHdr_set_dt.setAPMethodName("doWrk5SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk5Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5Dtl(MABSP_PurcItmReg p) {
		p.Wrk5DtlTable.addAllListener(p);
		p.columnWrk5Dtl_check.addAllListener(p);
		p.columnWrk5Dtl_del_flg.addAllListener(p);
		p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk5Dtl_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_loc_cd.setListListener(p);
		p.columnWrk5Dtl_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_loc_nm.setListListener(p);
		p.columnWrk5Dtl_wg_cd.addAllListener(p);
		p.columnWrk5Dtl_wg_cd.setListListener(p);
		p.columnWrk5Dtl_wg_nm.addAllListener(p);
		p.columnWrk5Dtl_wg_nm.setListListener(p);
		p.columnWrk5Dtl_loc_grp_cd.addAllListener(p);
		p.columnWrk5Dtl_loc_grp_cd.setListListener(p);
		p.columnWrk5Dtl_loc_grp_nm.addAllListener(p);
		p.columnWrk5Dtl_loc_grp_nm.setListListener(p);
		p.columnWrk5Dtl_alloc_grp_cd.addAllListener(p);
		p.columnWrk5Dtl_alloc_grp_cd.setListListener(p);
		p.columnWrk5Dtl_alloc_grp_nm.addAllListener(p);
		p.columnWrk5Dtl_alloc_grp_nm.setListListener(p);
		p.columnWrk5Dtl_gi_schd_flg.addAllListener(p);
		p.columnWrk5Dtl_lot_sizing_flg.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_inpt_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_cd.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_cd.setListListener(p);
		p.columnWrk5Dtl_ship_gi_loc_nm.addAllListener(p);
		p.columnWrk5Dtl_ship_gi_loc_nm.setListListener(p);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk5Dtl_memo1.addAllListener(p);
		p.columnWrk5Dtl_memo1.setListListener(p);
		p.columnWrk5Dtl_memo2.addAllListener(p);
		p.columnWrk5Dtl_memo2.setListListener(p);
		p.columnWrk5Dtl_memo3.addAllListener(p);
		p.columnWrk5Dtl_memo3.setListListener(p);
		p.columnWrk5Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_id.setListListener(p);
		p.columnWrk5Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk5Dtl_ins_ts.addAllListener(p);
		p.columnWrk5Dtl_ins_ts.setListListener(p);
		p.columnWrk5Dtl_ins_func_id.addAllListener(p);
		p.columnWrk5Dtl_ins_func_id.setListListener(p);
		p.columnWrk5Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk5Dtl_ins_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_cntr.addAllListener(p);
		p.columnWrk5Dtl_upd_cntr.setListListener(p);
		p.columnWrk5Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_id.setListListener(p);
		p.columnWrk5Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk5Dtl_upd_ts.addAllListener(p);
		p.columnWrk5Dtl_upd_ts.setListListener(p);
		p.columnWrk5Dtl_upd_func_id.addAllListener(p);
		p.columnWrk5Dtl_upd_func_id.setListListener(p);
		p.columnWrk5Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk5Dtl_upd_func_nm.setListListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk5Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk5Dtl_del_usr_id.addAllListener(p);
		p.columnWrk5Dtl_del_usr_id.setListListener(p);
		p.columnWrk5Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk5Dtl_del_usr_nm.setListListener(p);
		p.columnWrk5Dtl_del_ts.addAllListener(p);
		p.columnWrk5Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk5DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk5DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk5DtlBtn_select_all.addAllListener(p);
		p.Wrk5DtlBtn_select_all.setAPMethodName("doWrk5DtlBtn_select_all");
		p.Wrk5DtlBtn_deselect_all.addAllListener(p);
		p.Wrk5DtlBtn_deselect_all.setAPMethodName("doWrk5DtlBtn_deselect_all");
		p.Wrk5DtlBtn_radd.addAllListener(p);
		p.Wrk5DtlBtn_radd.setAPMethodName("doWrk5DtlBtn_radd");
		p.Wrk5DtlBtn_rdel.addAllListener(p);
		p.Wrk5DtlBtn_rdel.setAPMethodName("doWrk5DtlBtn_rdel");
		p.Wrk5DtlBtn_rcopy.addAllListener(p);
		p.Wrk5DtlBtn_rcopy.setAPMethodName("doWrk5DtlBtn_rcopy");
	}

	/**
	 *  [Wrk6]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk6SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6SetDtHdr(MABSP_PurcItmReg p) {
		p.Wrk6SetDtHdr_st_dt.setListListener(p);
		p.Wrk6SetDtHdr_st_dt.addAllListener(p);
		p.Wrk6SetDtHdr_end_dt.setListListener(p);
		p.Wrk6SetDtHdr_end_dt.addAllListener(p);
		p.Wrk6SetDtHdr_set_dt.addAllListener(p);
		p.Wrk6SetDtHdr_set_dt.setAPMethodName("doWrk6SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk6Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6Dtl(MABSP_PurcItmReg p) {
		p.Wrk6DtlTable.addAllListener(p);
		p.columnWrk6Dtl_check.addAllListener(p);
		p.columnWrk6Dtl_del_flg.addAllListener(p);
		p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk6Dtl_sppl_cd.addAllListener(p);
		p.columnWrk6Dtl_sppl_cd.setListListener(p);
		p.columnWrk6Dtl_sppl_nm.addAllListener(p);
		p.columnWrk6Dtl_sppl_nm.setListListener(p);
		p.columnWrk6Dtl_lg_grp_cd.addAllListener(p);
		p.columnWrk6Dtl_lg_grp_cd.setListListener(p);
		p.columnWrk6Dtl_lg_grp_nm.addAllListener(p);
		p.columnWrk6Dtl_lg_grp_nm.setListListener(p);
		p.columnWrk6Dtl_purc_lt.addAllListener(p);
		p.columnWrk6Dtl_purc_lt.setListListener(p);
		p.columnWrk6Dtl_memo1.addAllListener(p);
		p.columnWrk6Dtl_memo1.setListListener(p);
		p.columnWrk6Dtl_memo2.addAllListener(p);
		p.columnWrk6Dtl_memo2.setListListener(p);
		p.columnWrk6Dtl_memo3.addAllListener(p);
		p.columnWrk6Dtl_memo3.setListListener(p);
		p.columnWrk6Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_id.setListListener(p);
		p.columnWrk6Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk6Dtl_ins_ts.addAllListener(p);
		p.columnWrk6Dtl_ins_ts.setListListener(p);
		p.columnWrk6Dtl_ins_func_id.addAllListener(p);
		p.columnWrk6Dtl_ins_func_id.setListListener(p);
		p.columnWrk6Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk6Dtl_ins_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_cntr.addAllListener(p);
		p.columnWrk6Dtl_upd_cntr.setListListener(p);
		p.columnWrk6Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_id.setListListener(p);
		p.columnWrk6Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk6Dtl_upd_ts.addAllListener(p);
		p.columnWrk6Dtl_upd_ts.setListListener(p);
		p.columnWrk6Dtl_upd_func_id.addAllListener(p);
		p.columnWrk6Dtl_upd_func_id.setListListener(p);
		p.columnWrk6Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk6Dtl_upd_func_nm.setListListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk6Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk6Dtl_del_usr_id.addAllListener(p);
		p.columnWrk6Dtl_del_usr_id.setListListener(p);
		p.columnWrk6Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk6Dtl_del_usr_nm.setListListener(p);
		p.columnWrk6Dtl_del_ts.addAllListener(p);
		p.columnWrk6Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk6DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk6DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk6DtlBtn_select_all.addAllListener(p);
		p.Wrk6DtlBtn_select_all.setAPMethodName("doWrk6DtlBtn_select_all");
		p.Wrk6DtlBtn_deselect_all.addAllListener(p);
		p.Wrk6DtlBtn_deselect_all.setAPMethodName("doWrk6DtlBtn_deselect_all");
		p.Wrk6DtlBtn_radd.addAllListener(p);
		p.Wrk6DtlBtn_radd.setAPMethodName("doWrk6DtlBtn_radd");
		p.Wrk6DtlBtn_rdel.addAllListener(p);
		p.Wrk6DtlBtn_rdel.setAPMethodName("doWrk6DtlBtn_rdel");
		p.Wrk6DtlBtn_rcopy.addAllListener(p);
		p.Wrk6DtlBtn_rcopy.setAPMethodName("doWrk6DtlBtn_rcopy");
	}

	/**
	 *  [Wrk7]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk7SetDtHdr]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7SetDtHdr(MABSP_PurcItmReg p) {
		p.Wrk7SetDtHdr_st_dt.setListListener(p);
		p.Wrk7SetDtHdr_st_dt.addAllListener(p);
		p.Wrk7SetDtHdr_end_dt.setListListener(p);
		p.Wrk7SetDtHdr_end_dt.addAllListener(p);
		p.Wrk7SetDtHdr_set_dt.addAllListener(p);
		p.Wrk7SetDtHdr_set_dt.setAPMethodName("doWrk7SetDtHdr_set_dt");
	}

	/**
	 *  [Wrk7Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7Dtl(MABSP_PurcItmReg p) {
		p.Wrk7DtlTable.addAllListener(p);
		p.columnWrk7Dtl_check.addAllListener(p);
		p.columnWrk7Dtl_del_flg.addAllListener(p);
		p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk7Dtl_bp_cd.addAllListener(p);
		p.columnWrk7Dtl_bp_cd.setListListener(p);
		p.columnWrk7Dtl_bp_nm.addAllListener(p);
		p.columnWrk7Dtl_bp_nm.setListListener(p);
		p.columnWrk7Dtl_sppl_flg.addAllListener(p);
		p.columnWrk7Dtl_cst_flg.addAllListener(p);
		p.columnWrk7Dtl_bp_itm_cd.addAllListener(p);
		p.columnWrk7Dtl_bp_itm_cd.setListListener(p);
		p.columnWrk7Dtl_bp_itm_nm.addAllListener(p);
		p.columnWrk7Dtl_bp_itm_nm.setListListener(p);
		p.columnWrk7Dtl_def_flg.addAllListener(p);
		p.columnWrk7Dtl_pf_grp_cd.addAllListener(p);
		p.columnWrk7Dtl_pf_grp_cd.setListListener(p);
		p.columnWrk7Dtl_pf_grp_nm.addAllListener(p);
		p.columnWrk7Dtl_pf_grp_nm.setListListener(p);
		p.columnWrk7Dtl_pf_fix_flg.addAllListener(p);
		p.columnWrk7Dtl_purc_commit_flg.addAllListener(p);
		p.columnWrk7Dtl_memo1.addAllListener(p);
		p.columnWrk7Dtl_memo1.setListListener(p);
		p.columnWrk7Dtl_memo2.addAllListener(p);
		p.columnWrk7Dtl_memo2.setListListener(p);
		p.columnWrk7Dtl_memo3.addAllListener(p);
		p.columnWrk7Dtl_memo3.setListListener(p);
		p.columnWrk7Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_id.setListListener(p);
		p.columnWrk7Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk7Dtl_ins_ts.addAllListener(p);
		p.columnWrk7Dtl_ins_ts.setListListener(p);
		p.columnWrk7Dtl_ins_func_id.addAllListener(p);
		p.columnWrk7Dtl_ins_func_id.setListListener(p);
		p.columnWrk7Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk7Dtl_ins_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_cntr.addAllListener(p);
		p.columnWrk7Dtl_upd_cntr.setListListener(p);
		p.columnWrk7Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_id.setListListener(p);
		p.columnWrk7Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk7Dtl_upd_ts.addAllListener(p);
		p.columnWrk7Dtl_upd_ts.setListListener(p);
		p.columnWrk7Dtl_upd_func_id.addAllListener(p);
		p.columnWrk7Dtl_upd_func_id.setListListener(p);
		p.columnWrk7Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk7Dtl_upd_func_nm.setListListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk7Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk7Dtl_del_usr_id.addAllListener(p);
		p.columnWrk7Dtl_del_usr_id.setListListener(p);
		p.columnWrk7Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk7Dtl_del_usr_nm.setListListener(p);
		p.columnWrk7Dtl_del_ts.addAllListener(p);
		p.columnWrk7Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk7DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk7DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk7DtlBtn_select_all.addAllListener(p);
		p.Wrk7DtlBtn_select_all.setAPMethodName("doWrk7DtlBtn_select_all");
		p.Wrk7DtlBtn_deselect_all.addAllListener(p);
		p.Wrk7DtlBtn_deselect_all.setAPMethodName("doWrk7DtlBtn_deselect_all");
		p.Wrk7DtlBtn_radd.addAllListener(p);
		p.Wrk7DtlBtn_radd.setAPMethodName("doWrk7DtlBtn_radd");
		p.Wrk7DtlBtn_rdel.addAllListener(p);
		p.Wrk7DtlBtn_rdel.setAPMethodName("doWrk7DtlBtn_rdel");
		p.Wrk7DtlBtn_rcopy.addAllListener(p);
		p.Wrk7DtlBtn_rcopy.setAPMethodName("doWrk7DtlBtn_rcopy");
	}

	/**
	 *  [Wrk8]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk8(MABSP_PurcItmReg p) {
	}

	/**
	 *  [Wrk8Dtl]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk8Dtl(MABSP_PurcItmReg p) {
		p.Wrk8DtlTable.addAllListener(p);
		p.columnWrk8Dtl_check.addAllListener(p);
		p.columnWrk8Dtl_del_flg.addAllListener(p);
		p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_cd.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub1.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub2.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub3.setListListener(p);	// 埋め込みカラムの項目に対してEventListenerを差し込む。
		p.columnWrk8Dtl_loc_cd.addAllListener(p);
		p.columnWrk8Dtl_loc_cd.setListListener(p);
		p.columnWrk8Dtl_loc_nm.addAllListener(p);
		p.columnWrk8Dtl_loc_nm.setListListener(p);
		p.columnWrk8Dtl_str_ln_tgt_flg.addAllListener(p);
		p.columnWrk8Dtl_wg_cd.addAllListener(p);
		p.columnWrk8Dtl_wg_cd.setListListener(p);
		p.columnWrk8Dtl_wg_nm.addAllListener(p);
		p.columnWrk8Dtl_wg_nm.setListListener(p);
		p.columnWrk8Dtl_loc_grp_cd.addAllListener(p);
		p.columnWrk8Dtl_loc_grp_cd.setListListener(p);
		p.columnWrk8Dtl_loc_grp_nm.addAllListener(p);
		p.columnWrk8Dtl_loc_grp_nm.setListListener(p);
		p.columnWrk8Dtl_memo1.addAllListener(p);
		p.columnWrk8Dtl_memo1.setListListener(p);
		p.columnWrk8Dtl_memo2.addAllListener(p);
		p.columnWrk8Dtl_memo2.setListListener(p);
		p.columnWrk8Dtl_memo3.addAllListener(p);
		p.columnWrk8Dtl_memo3.setListListener(p);
		p.columnWrk8Dtl_ins_usr_id.addAllListener(p);
		p.columnWrk8Dtl_ins_usr_id.setListListener(p);
		p.columnWrk8Dtl_ins_usr_nm.addAllListener(p);
		p.columnWrk8Dtl_ins_usr_nm.setListListener(p);
		p.columnWrk8Dtl_ins_ts.addAllListener(p);
		p.columnWrk8Dtl_ins_ts.setListListener(p);
		p.columnWrk8Dtl_ins_func_id.addAllListener(p);
		p.columnWrk8Dtl_ins_func_id.setListListener(p);
		p.columnWrk8Dtl_ins_func_nm.addAllListener(p);
		p.columnWrk8Dtl_ins_func_nm.setListListener(p);
		p.columnWrk8Dtl_upd_cntr.addAllListener(p);
		p.columnWrk8Dtl_upd_cntr.setListListener(p);
		p.columnWrk8Dtl_upd_usr_id.addAllListener(p);
		p.columnWrk8Dtl_upd_usr_id.setListListener(p);
		p.columnWrk8Dtl_upd_usr_nm.addAllListener(p);
		p.columnWrk8Dtl_upd_usr_nm.setListListener(p);
		p.columnWrk8Dtl_upd_ts.addAllListener(p);
		p.columnWrk8Dtl_upd_ts.setListListener(p);
		p.columnWrk8Dtl_upd_func_id.addAllListener(p);
		p.columnWrk8Dtl_upd_func_id.setListListener(p);
		p.columnWrk8Dtl_upd_func_nm.addAllListener(p);
		p.columnWrk8Dtl_upd_func_nm.setListListener(p);
		p.columnWrk8Dtl_upd_srv_req_no.addAllListener(p);
		p.columnWrk8Dtl_upd_srv_req_no.setListListener(p);
		p.columnWrk8Dtl_del_usr_id.addAllListener(p);
		p.columnWrk8Dtl_del_usr_id.setListListener(p);
		p.columnWrk8Dtl_del_usr_nm.addAllListener(p);
		p.columnWrk8Dtl_del_usr_nm.setListListener(p);
		p.columnWrk8Dtl_del_ts.addAllListener(p);
		p.columnWrk8Dtl_del_ts.setListListener(p);
	}

	/**
	 *  [Wrk8DtlBtn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitWrk8DtlBtn(MABSP_PurcItmReg p) {
		p.Wrk8DtlBtn_select_all.addAllListener(p);
		p.Wrk8DtlBtn_select_all.setAPMethodName("doWrk8DtlBtn_select_all");
		p.Wrk8DtlBtn_deselect_all.addAllListener(p);
		p.Wrk8DtlBtn_deselect_all.setAPMethodName("doWrk8DtlBtn_deselect_all");
		p.Wrk8DtlBtn_radd.addAllListener(p);
		p.Wrk8DtlBtn_radd.setAPMethodName("doWrk8DtlBtn_radd");
		p.Wrk8DtlBtn_rdel.addAllListener(p);
		p.Wrk8DtlBtn_rdel.setAPMethodName("doWrk8DtlBtn_rdel");
		p.Wrk8DtlBtn_rcopy.addAllListener(p);
		p.Wrk8DtlBtn_rcopy.setAPMethodName("doWrk8DtlBtn_rcopy");
	}

	/**
	 *  [Btn]ブロックの画面部品初期設定（MCFrame仕様）
	 */
	protected static void mcInitBtn(MABSP_PurcItmReg p) {
		p.Btn_open_MABSP0120.addAllListener(p);
		p.Btn_open_MABSP0120.setAPMethodName("doBtn_open_MABSP0120");
	}

	/**
	 * [SRCH]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_ScreenOpe(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Top(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Fold(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Cnd(MABSP_PurcItmReg p){
		p.Cnd_ope_Group.putMode(p, SRCH, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, SRCH, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, SRCH, MCMode.ENABLE);

	}

	/**
	 * [SRCH]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Ctrl(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Tbl(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Hdr(MABSP_PurcItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sundry_itm_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_purc_lbl.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_purc_input_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, SRCH, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, SRCH, MCMode.INVISIBLE);

	}

	/**
	 * [SRCH]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_HdrAll(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_DtlTab(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk1SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1Dtl(MABSP_PurcItmReg p){
		p.columnWrk1Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_buf_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_min_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_max_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_max_order.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_order_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_cost_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk1DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk1DtlBtn(MABSP_PurcItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2Dtl(MABSP_PurcItmReg p){
		p.columnWrk2Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_buf_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ord_fix_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_week.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_sz_pd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_min_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_max_lot_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk2Dtl_max_order.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_order_ratio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_po_tgt_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk2Dtl_not_mrp_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk2DtlBtn(MABSP_PurcItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3Dtl(MABSP_PurcItmReg p){
		p.columnWrk3Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk3DtlBtn(MABSP_PurcItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4Dtl(MABSP_PurcItmReg p){
		p.columnWrk4Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_to_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_wg_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_lg_grp_cd.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_prio.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk4Dtl_in_loc_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk4DtlBtn(MABSP_PurcItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk5SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk5SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5Dtl(MABSP_PurcItmReg p){
		p.columnWrk5Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk5Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Wrk5Dtl_buf_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk5DtlBtn(MABSP_PurcItmReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk6SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk6SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6Dtl(MABSP_PurcItmReg p){
		p.columnWrk6Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk6Dtl_sppl_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_sppl_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_purc_lt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk6DtlBtn(MABSP_PurcItmReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk7SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk7SetDtHdr_st_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_end_dt.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_set_dt.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7Dtl(MABSP_PurcItmReg p){
		p.columnWrk7Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk7Dtl_bp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk7Dtl_cst_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_def_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_fix_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_purc_commit_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk7DtlBtn(MABSP_PurcItmReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Wrk8]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk8(MABSP_PurcItmReg p){

	}

	/**
	 * [SRCH]ステータスの[Wrk8Dtl]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk8Dtl(MABSP_PurcItmReg p){
		p.columnWrk8Dtl_check.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_flg.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk8Dtl_itm_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk8Dtl_loc_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_str_ln_tgt_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk8Dtl_wg_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_wg_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_cd.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.putStatus(SRCH, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk8Dtl_memo1.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo2.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo3.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_cntr.putMode(p, SRCH, MCMode.INVISIBLE);
		p.columnWrk8Dtl_upd_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_ts.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_srv_req_no.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_id.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_nm.putMode(p, SRCH, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_ts.putMode(p, SRCH, MCMode.READ_ONLY);

	}

	/**
	 * [SRCH]ステータスの[Wrk8DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Wrk8DtlBtn(MABSP_PurcItmReg p){
		p.Wrk8DtlBtn_select_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk8DtlBtn_deselect_all.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk8DtlBtn_radd.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk8DtlBtn_rdel.putMode(p, SRCH, MCMode.DISABLE);
		p.Wrk8DtlBtn_rcopy.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [SRCH]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitSRCH_Btn(MABSP_PurcItmReg p){
		p.Btn_open_MABSP0120.putMode(p, SRCH, MCMode.DISABLE);

	}

	/**
	 * [UPD]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitUPD_ScreenOpe(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Top(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Fold(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Cnd(MABSP_PurcItmReg p){
		p.Cnd_ope_Group.putMode(p, UPD, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, UPD, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Ctrl(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Tbl(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Hdr(MABSP_PurcItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sundry_itm_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_purc_lbl.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_flg.putMode(p, UPD, MCMode.READ_ONLY);
		p.Hdr_purc_input_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Hdr_upd.putMode(p, UPD, MCMode.ENABLE);
		p.Hdr_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, UPD, MCMode.INVISIBLE);

	}

	/**
	 * [UPD]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitUPD_HdrAll(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitUPD_DtlTab(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk1SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1Dtl(MABSP_PurcItmReg p){
		p.columnWrk1Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_maker_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnWrk1Dtl_purc_basis_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_purc_basis_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_buf_lt.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1Dtl_min_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Wrk1Dtl_max_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnWrk1Dtl_max_order.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_prio.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_order_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk1Dtl_cost_ratio.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk1DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk1DtlBtn(MABSP_PurcItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2Dtl(MABSP_PurcItmReg p){
		p.columnWrk2Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_rqst_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk2Dtl_buf_lt.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_ord_fix_pd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_sz_day_week_typ.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_sz_day_week_typ_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_week.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_lot_sz_pd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2Dtl_min_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.Wrk2Dtl_max_lot_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.REQUIRED);
		p.columnWrk2Dtl_max_order.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_prio.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_order_ratio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_pre_po_tgt_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.ENABLE);
		p.columnWrk2Dtl_not_mrp_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk2Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk2DtlBtn(MABSP_PurcItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3Dtl(MABSP_PurcItmReg p){
		p.columnWrk3Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk3Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk3DtlBtn(MABSP_PurcItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4Dtl(MABSP_PurcItmReg p){
		p.columnWrk4Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_to_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_to_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_fr_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_wg_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_lg_grp_cd.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_prio.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnWrk4Dtl_in_loc_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk4Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk4DtlBtn(MABSP_PurcItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk5SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk5SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5Dtl(MABSP_PurcItmReg p){
		p.columnWrk5Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk5Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk5Dtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.Wrk5Dtl_buf_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.ENABLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk5DtlBtn(MABSP_PurcItmReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk6SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk6SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6Dtl(MABSP_PurcItmReg p){
		p.columnWrk6Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk6Dtl_sppl_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_sppl_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk6Dtl_lg_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk6Dtl_purc_lt.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.ENABLE);
		p.columnWrk6Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk6DtlBtn(MABSP_PurcItmReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk7SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk7SetDtHdr_st_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7SetDtHdr_end_dt.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7SetDtHdr_set_dt.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7Dtl(MABSP_PurcItmReg p){
		p.columnWrk7Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk7Dtl_bp_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_bp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk7Dtl_cst_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.REQUIRED);
		p.columnWrk7Dtl_bp_itm_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_bp_itm_nm.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_def_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_pf_grp_cd.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_pf_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_fix_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_purc_commit_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk7Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk7DtlBtn(MABSP_PurcItmReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Wrk8]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk8(MABSP_PurcItmReg p){

	}

	/**
	 * [UPD]ステータスの[Wrk8Dtl]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk8Dtl(MABSP_PurcItmReg p){
		p.columnWrk8Dtl_check.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk8Dtl_del_flg.putMode(p, UPD, MCMode.REQUIRED);
		p.Wrk8Dtl_itm_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk8Dtl_loc_cd.putMode(p, UPD, MCMode.REQUIRED);
		p.columnWrk8Dtl_loc_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_str_ln_tgt_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk8Dtl_wg_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_wg_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_cd.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.putStatus(UPD, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.REQUIRED);
		p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk8Dtl_memo1.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk8Dtl_memo2.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk8Dtl_memo3.putMode(p, UPD, MCMode.ENABLE);
		p.columnWrk8Dtl_ins_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_cntr.putMode(p, UPD, MCMode.INVISIBLE);
		p.columnWrk8Dtl_upd_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_ts.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_srv_req_no.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_id.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_nm.putMode(p, UPD, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_ts.putMode(p, UPD, MCMode.READ_ONLY);

	}

	/**
	 * [UPD]ステータスの[Wrk8DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Wrk8DtlBtn(MABSP_PurcItmReg p){
		p.Wrk8DtlBtn_select_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk8DtlBtn_deselect_all.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk8DtlBtn_radd.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk8DtlBtn_rdel.putMode(p, UPD, MCMode.ENABLE);
		p.Wrk8DtlBtn_rcopy.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [UPD]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitUPD_Btn(MABSP_PurcItmReg p){
		p.Btn_open_MABSP0120.putMode(p, UPD, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitFIX_ScreenOpe(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Top(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Fold(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Cnd(MABSP_PurcItmReg p){
		p.Cnd_ope_Group.putMode(p, FIX, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, FIX, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [FIX]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Ctrl(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Tbl(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Hdr(MABSP_PurcItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sundry_itm_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_purc_lbl.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_purc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_purc_input_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, FIX, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, FIX, MCMode.INVISIBLE);

	}

	/**
	 * [FIX]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitFIX_HdrAll(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitFIX_DtlTab(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk1SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1Dtl(MABSP_PurcItmReg p){
		p.columnWrk1Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_buf_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_min_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_max_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_max_order.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_order_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_cost_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk1DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk1DtlBtn(MABSP_PurcItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2Dtl(MABSP_PurcItmReg p){
		p.columnWrk2Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_buf_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ord_fix_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_week.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_sz_pd.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_min_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_max_lot_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk2Dtl_max_order.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_order_ratio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_po_tgt_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk2Dtl_not_mrp_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk2DtlBtn(MABSP_PurcItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3Dtl(MABSP_PurcItmReg p){
		p.columnWrk3Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk3DtlBtn(MABSP_PurcItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4Dtl(MABSP_PurcItmReg p){
		p.columnWrk4Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_to_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_lg_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_wg_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_lg_grp_cd.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_prio.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk4Dtl_in_loc_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk4DtlBtn(MABSP_PurcItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk5SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk5SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5Dtl(MABSP_PurcItmReg p){
		p.columnWrk5Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk5Dtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Wrk5Dtl_buf_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk5DtlBtn(MABSP_PurcItmReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk6SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk6SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6Dtl(MABSP_PurcItmReg p){
		p.columnWrk6Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk6Dtl_sppl_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_sppl_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_purc_lt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk6DtlBtn(MABSP_PurcItmReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk7SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk7SetDtHdr_st_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_end_dt.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_set_dt.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7Dtl(MABSP_PurcItmReg p){
		p.columnWrk7Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk7Dtl_bp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk7Dtl_cst_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_def_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_fix_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_purc_commit_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk7DtlBtn(MABSP_PurcItmReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Wrk8]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk8(MABSP_PurcItmReg p){

	}

	/**
	 * [FIX]ステータスの[Wrk8Dtl]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk8Dtl(MABSP_PurcItmReg p){
		p.columnWrk8Dtl_check.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_flg.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk8Dtl_itm_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk8Dtl_loc_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_str_ln_tgt_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk8Dtl_wg_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_wg_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_cd.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.putStatus(FIX, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk8Dtl_memo1.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo2.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo3.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_cntr.putMode(p, FIX, MCMode.INVISIBLE);
		p.columnWrk8Dtl_upd_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_ts.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_srv_req_no.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_id.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_nm.putMode(p, FIX, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_ts.putMode(p, FIX, MCMode.READ_ONLY);

	}

	/**
	 * [FIX]ステータスの[Wrk8DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Wrk8DtlBtn(MABSP_PurcItmReg p){
		p.Wrk8DtlBtn_select_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk8DtlBtn_deselect_all.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk8DtlBtn_radd.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk8DtlBtn_rdel.putMode(p, FIX, MCMode.DISABLE);
		p.Wrk8DtlBtn_rcopy.putMode(p, FIX, MCMode.DISABLE);

	}

	/**
	 * [FIX]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitFIX_Btn(MABSP_PurcItmReg p){
		p.Btn_open_MABSP0120.putMode(p, FIX, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[ScreenOpe]ブロックのモードの設定
	 */
	protected static void statusInitREF_ScreenOpe(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Top]ブロックのモードの設定
	 */
	protected static void statusInitREF_Top(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Fold]ブロックのモードの設定
	 */
	protected static void statusInitREF_Fold(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Cnd]ブロックのモードの設定
	 */
	protected static void statusInitREF_Cnd(MABSP_PurcItmReg p){
		p.Cnd_ope_Group.putMode(p, REF, MCMode.REQUIRED);
		p.Cnd_dt_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0020.MAUBP_StEndDt_Fr_To_H.ENABLE);
		p.Cnd_itm_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.REQUIRED);
		p.Cnd_itm_PPanel.Itm_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Cnd_off_del_flg.putMode(p, REF, MCMode.ENABLE);
		p.Cnd_on_del_flg.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * [REF]ステータスの[Ctrl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Ctrl(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Tbl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Tbl(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Hdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Hdr(MABSP_PurcItmReg p){
		p.Hdr_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP0030.MAUBP_Itm_H.READ_ONLY);
		p.Hdr_unit_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_unit_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_stk_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_asset_mng_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_dec_place.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sundry_itm_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_sno1_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno2_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno3_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_sno4_mng_typ.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_purc_lbl.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_purc_input_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Hdr_upd.putMode(p, REF, MCMode.DISABLE);
		p.Hdr_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.Hdr_check.putMode(p, REF, MCMode.INVISIBLE);

	}

	/**
	 * [REF]ステータスの[HdrAll]ブロックのモードの設定
	 */
	protected static void statusInitREF_HdrAll(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[DtlTab]ブロックのモードの設定
	 */
	protected static void statusInitREF_DtlTab(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk1SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk1SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk1Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1Dtl(MABSP_PurcItmReg p){
		p.columnWrk1Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk1Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_maker_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_id_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_purc_basis_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_accpt_insp_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_buf_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ord_fix_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_sz_week.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_lot_sz_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_min_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_batch_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk1Dtl_max_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk1Dtl_max_order.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_order_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_pre_po_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_rqst_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_po_batch_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk1Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk1Dtl_not_mrp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_cost_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk1Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk1Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk1DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk1DtlBtn(MABSP_PurcItmReg p){
		p.Wrk1DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk1DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk2SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk2SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk2Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2Dtl(MABSP_PurcItmReg p){
		p.columnWrk2Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk2Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_rqst_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk2Dtl_buf_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ord_fix_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_day_week_typ_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_sz_week.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_lot_sz_pd.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_min_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_batch_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk2Dtl_max_lot_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk2Dtl_max_order.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_order_ratio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_pre_po_tgt_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk2Dtl_sno_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5070.MAUBP_Sno_D.READ_ONLY);
		p.columnWrk2Dtl_not_mrp_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk2Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk2Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk2DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk2DtlBtn(MABSP_PurcItmReg p){
		p.Wrk2DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk2DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk3]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk3Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3Dtl(MABSP_PurcItmReg p){
		p.columnWrk3Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk3Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk3Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk3Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk3Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk3DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk3DtlBtn(MABSP_PurcItmReg p){
		p.Wrk3DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk3DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk4]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk4Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4Dtl(MABSP_PurcItmReg p){
		p.columnWrk4Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk4Dtl_to_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_to_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_fr_wg_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_fr_lg_grp_cd.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_prio.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk4Dtl_in_loc_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk4Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk4Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk4DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk4DtlBtn(MABSP_PurcItmReg p){
		p.Wrk4DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk4DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk5]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk5SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk5SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk5Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5Dtl(MABSP_PurcItmReg p){
		p.columnWrk5Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk5Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_alloc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.Wrk5Dtl_buf_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.Wrk5Dtl_rord_stk_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_gi_schd_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk5Dtl_rord_rqst_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk5Dtl_lot_sizing_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln1_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln1_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_inpt_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln2_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln2_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_ship_gi_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk5Dtl_str_ln3_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk5Dtl_str_ln3_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk5Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk5Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk5DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk5DtlBtn(MABSP_PurcItmReg p){
		p.Wrk5DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk5DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk6]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk6SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk6SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk6Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6Dtl(MABSP_PurcItmReg p){
		p.columnWrk6Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk6Dtl_sppl_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_sppl_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_lg_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk6Dtl_purc_lt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5040.MAUBP_Qty_D.READ_ONLY);
		p.columnWrk6Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk6Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk6Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk6DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk6DtlBtn(MABSP_PurcItmReg p){
		p.Wrk6DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk6DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk7]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk7SetDtHdr]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7SetDtHdr(MABSP_PurcItmReg p){
		p.Wrk7SetDtHdr_st_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_end_dt.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7SetDtHdr_set_dt.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk7Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7Dtl(MABSP_PurcItmReg p){
		p.columnWrk7Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk7Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk7Dtl_bp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_sppl_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk7Dtl_cst_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.Wrk7Dtl_dt_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5010.MAUBP_StDt_EndDt_D.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_bp_itm_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_def_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_pf_fix_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_purc_commit_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk7Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk7Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk7DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk7DtlBtn(MABSP_PurcItmReg p){
		p.Wrk7DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk7DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Wrk8]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk8(MABSP_PurcItmReg p){

	}

	/**
	 * [REF]ステータスの[Wrk8Dtl]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk8Dtl(MABSP_PurcItmReg p){
		p.columnWrk8Dtl_check.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_flg.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk8Dtl_itm_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5030.MAUBP_Itm_D.INVISIBLE);
		p.columnWrk8Dtl_loc_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_str_ln_tgt_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk8Dtl_wg_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_wg_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_cd.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_loc_grp_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.putStatus(REF, mcframe.clientMAUB.MAUBP5120.MAUBP_StrLn_D.READ_ONLY);
		p.Wrk8Dtl_str_ln_p_PPanel.columnStrLn_str_ln_cd_none_flg.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk8Dtl_memo1.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo2.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_memo3.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_ins_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_cntr.putMode(p, REF, MCMode.INVISIBLE);
		p.columnWrk8Dtl_upd_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_ts.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_func_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_upd_srv_req_no.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_id.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_usr_nm.putMode(p, REF, MCMode.READ_ONLY);
		p.columnWrk8Dtl_del_ts.putMode(p, REF, MCMode.READ_ONLY);

	}

	/**
	 * [REF]ステータスの[Wrk8DtlBtn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Wrk8DtlBtn(MABSP_PurcItmReg p){
		p.Wrk8DtlBtn_select_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk8DtlBtn_deselect_all.putMode(p, REF, MCMode.DISABLE);
		p.Wrk8DtlBtn_radd.putMode(p, REF, MCMode.DISABLE);
		p.Wrk8DtlBtn_rdel.putMode(p, REF, MCMode.DISABLE);
		p.Wrk8DtlBtn_rcopy.putMode(p, REF, MCMode.DISABLE);

	}

	/**
	 * [REF]ステータスの[Btn]ブロックのモードの設定
	 */
	protected static void statusInitREF_Btn(MABSP_PurcItmReg p){
		p.Btn_open_MABSP0120.putMode(p, REF, MCMode.ENABLE);

	}

	/**
	 * 初期ステータスの文字列を返します。
	 */
	public String getInitStatus() {
		return SRCH;
	}

	/**
	 * Table/Treeの設定
	 */
	protected void setTableConfig() {
		super.setTableConfig();
		MABSP_PurcItmReg_MC.setTableConfigWrk1Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk2Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk3Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk4Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk5Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk6Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk7Dtl((MABSP_PurcItmReg)this);
		MABSP_PurcItmReg_MC.setTableConfigWrk8Dtl((MABSP_PurcItmReg)this);
	}

	/**
	 * [Wrk1Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk1Dtl(MABSP_PurcItmReg p) {
		p.columnWrk1Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.check_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_check);
		p.columnWrk1Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.del_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_flg);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk1Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.wg_cd_META);
		p.columnWrk1Dtl_wg_cd.addLinkBeans(p.columnWrk1Dtl_wg_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_wg_cd);
		p.columnWrk1Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.wg_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_wg_nm);
		p.columnWrk1Dtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.sppl_cd_META);
		p.columnWrk1Dtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnWrk1Dtl_sppl_cd.addLinkBeans(p.columnWrk1Dtl_sppl_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sppl_cd);
		p.columnWrk1Dtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.sppl_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sppl_nm);
		p.columnWrk1Dtl_maker_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.maker_cd_META);
		p.columnWrk1Dtl_maker_cd.setListType(MCListType.STRICT);
		p.columnWrk1Dtl_maker_cd.addLinkBeans(p.columnWrk1Dtl_maker_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_maker_cd);
		p.columnWrk1Dtl_maker_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.maker_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_maker_nm);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_dt_p_PPanel.DtTable);
		p.columnWrk1Dtl_purc_id_typ.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.purc_id_typ_META);
		p.columnWrk1Dtl_purc_id_typ.addLinkBeans(p.columnWrk1Dtl_purc_id_typ_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_id_typ);
		p.columnWrk1Dtl_purc_id_typ_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.purc_id_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_id_typ_nm);
		p.columnWrk1Dtl_purc_lt.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.purc_lt_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_lt);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_purc_lt_add_qty_p_PPanel.QtyTable);
		p.columnWrk1Dtl_purc_basis_typ.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.purc_basis_typ_META);
		p.columnWrk1Dtl_purc_basis_typ.addLinkBeans(p.columnWrk1Dtl_purc_basis_typ_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_basis_typ);
		p.columnWrk1Dtl_purc_basis_typ_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.purc_basis_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_purc_basis_typ_nm);
		p.columnWrk1Dtl_accpt_insp_lt.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.accpt_insp_lt_META);
		p.columnWrk1Dtl_accpt_insp_lt.setMinusEnable(true);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_accpt_insp_lt);
		p.columnWrk1Dtl_buf_lt.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.buf_lt_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_buf_lt);
		p.columnWrk1Dtl_ord_fix_pd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ord_fix_pd_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ord_fix_pd);
		p.columnWrk1Dtl_sz_day_week_typ.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.sz_day_week_typ_META);
		p.columnWrk1Dtl_sz_day_week_typ.addLinkBeans(p.columnWrk1Dtl_sz_day_week_typ_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_day_week_typ);
		p.columnWrk1Dtl_sz_day_week_typ_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.sz_day_week_typ_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_day_week_typ_nm);
		p.columnWrk1Dtl_sz_week.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.sz_week_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_sz_week);
		p.columnWrk1Dtl_lot_sz_pd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.lot_sz_pd_META);
		p.columnWrk1Dtl_lot_sz_pd.setMinusEnable(true);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_lot_sz_pd);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_min_lot_qty_p_PPanel.QtyTable);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_batch_lot_qty_p_PPanel.QtyTable);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_max_lot_qty_p_PPanel.QtyTable);
		p.columnWrk1Dtl_max_order.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.max_order_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_max_order);
		p.columnWrk1Dtl_prio.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.prio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_prio);
		p.columnWrk1Dtl_order_ratio.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.order_ratio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_order_ratio);
		p.columnWrk1Dtl_pre_po_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.pre_po_tgt_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_pre_po_tgt_flg);
		p.columnWrk1Dtl_rqst_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.rqst_wg_cd_META);
		p.columnWrk1Dtl_rqst_wg_cd.addLinkBeans(p.columnWrk1Dtl_rqst_wg_nm);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_wg_cd);
		p.columnWrk1Dtl_rqst_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.rqst_wg_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_rqst_wg_nm);
		p.columnWrk1Dtl_po_batch_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.po_batch_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_po_batch_flg);
		p.Wrk1DtlTable.addTable(p.Wrk1Dtl_sno_p_PPanel.SnoTable);
		p.columnWrk1Dtl_not_mrp_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.not_mrp_flg_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_not_mrp_flg);
		p.columnWrk1Dtl_cost_ratio.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.cost_ratio_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_cost_ratio);
		p.columnWrk1Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.memo1_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo1);
		p.columnWrk1Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.memo2_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo2);
		p.columnWrk1Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.memo3_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_memo3);
		p.columnWrk1Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ins_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_id);
		p.columnWrk1Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ins_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_usr_nm);
		p.columnWrk1Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ins_ts_META);
		p.columnWrk1Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_ts);
		p.columnWrk1Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ins_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_id);
		p.columnWrk1Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.ins_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_ins_func_nm);
		p.columnWrk1Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_cntr_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_cntr);
		p.columnWrk1Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_id);
		p.columnWrk1Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_usr_nm);
		p.columnWrk1Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_ts_META);
		p.columnWrk1Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_ts);
		p.columnWrk1Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_func_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_id);
		p.columnWrk1Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_func_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_func_nm);
		p.columnWrk1Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.upd_srv_req_no_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_upd_srv_req_no);
		p.columnWrk1Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.del_usr_id_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_id);
		p.columnWrk1Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.del_usr_nm_META);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_usr_nm);
		p.columnWrk1Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk1DtlR.del_ts_META);
		p.columnWrk1Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk1DtlTable.addColumnConfig(p.columnWrk1Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk1DtlTable.setUnscrollColumn(p.columnWrk1Dtl_del_flg);
	}

	/**
	 * [Wrk2Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk2Dtl(MABSP_PurcItmReg p) {
		p.columnWrk2Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.check_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_check);
		p.columnWrk2Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.del_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_flg);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk2Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.wg_cd_META);
		p.columnWrk2Dtl_wg_cd.addLinkBeans(p.columnWrk2Dtl_wg_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_cd);
		p.columnWrk2Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.wg_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_wg_nm);
		p.columnWrk2Dtl_rqst_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.rqst_loc_cd_META);
		p.columnWrk2Dtl_rqst_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk2Dtl_rqst_loc_cd.addLinkBeans(p.columnWrk2Dtl_rqst_loc_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_rqst_loc_cd);
		p.columnWrk2Dtl_rqst_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.rqst_loc_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_rqst_loc_nm);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_dt_p_PPanel.DtTable);
		p.columnWrk2Dtl_buf_lt.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.buf_lt_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_buf_lt);
		p.columnWrk2Dtl_ord_fix_pd.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ord_fix_pd_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ord_fix_pd);
		p.columnWrk2Dtl_sz_day_week_typ.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.sz_day_week_typ_META);
		p.columnWrk2Dtl_sz_day_week_typ.addLinkBeans(p.columnWrk2Dtl_sz_day_week_typ_nm);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sz_day_week_typ);
		p.columnWrk2Dtl_sz_day_week_typ_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.sz_day_week_typ_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sz_day_week_typ_nm);
		p.columnWrk2Dtl_sz_week.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.sz_week_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_sz_week);
		p.columnWrk2Dtl_lot_sz_pd.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.lot_sz_pd_META);
		p.columnWrk2Dtl_lot_sz_pd.setMinusEnable(true);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_lot_sz_pd);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_min_lot_qty_p_PPanel.QtyTable);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_batch_lot_qty_p_PPanel.QtyTable);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_max_lot_qty_p_PPanel.QtyTable);
		p.columnWrk2Dtl_max_order.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.max_order_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_max_order);
		p.columnWrk2Dtl_prio.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.prio_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_prio);
		p.columnWrk2Dtl_order_ratio.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.order_ratio_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_order_ratio);
		p.columnWrk2Dtl_pre_po_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.pre_po_tgt_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_pre_po_tgt_flg);
		p.Wrk2DtlTable.addTable(p.Wrk2Dtl_sno_p_PPanel.SnoTable);
		p.columnWrk2Dtl_not_mrp_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.not_mrp_flg_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_not_mrp_flg);
		p.columnWrk2Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.memo1_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo1);
		p.columnWrk2Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.memo2_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo2);
		p.columnWrk2Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.memo3_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_memo3);
		p.columnWrk2Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ins_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_id);
		p.columnWrk2Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ins_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_usr_nm);
		p.columnWrk2Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ins_ts_META);
		p.columnWrk2Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_ts);
		p.columnWrk2Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ins_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_id);
		p.columnWrk2Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.ins_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_ins_func_nm);
		p.columnWrk2Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_cntr_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_cntr);
		p.columnWrk2Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_id);
		p.columnWrk2Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_usr_nm);
		p.columnWrk2Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_ts_META);
		p.columnWrk2Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_ts);
		p.columnWrk2Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_func_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_id);
		p.columnWrk2Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_func_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_func_nm);
		p.columnWrk2Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.upd_srv_req_no_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_upd_srv_req_no);
		p.columnWrk2Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.del_usr_id_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_id);
		p.columnWrk2Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.del_usr_nm_META);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_usr_nm);
		p.columnWrk2Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk2DtlR.del_ts_META);
		p.columnWrk2Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk2DtlTable.addColumnConfig(p.columnWrk2Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk2DtlTable.setUnscrollColumn(p.columnWrk2Dtl_del_flg);
	}

	/**
	 * [Wrk3Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk3Dtl(MABSP_PurcItmReg p) {
		p.columnWrk3Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.check_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_check);
		p.columnWrk3Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.del_flg_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_flg);
		p.Wrk3DtlTable.addTable(p.Wrk3Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk3Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.loc_cd_META);
		p.columnWrk3Dtl_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk3Dtl_loc_cd.addLinkBeans(p.columnWrk3Dtl_loc_nm,p.columnWrk3Dtl_wg_cd,p.columnWrk3Dtl_wg_nm,p.columnWrk3Dtl_loc_grp_cd,p.columnWrk3Dtl_loc_grp_nm);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_cd);
		p.columnWrk3Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.loc_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_nm);
		p.columnWrk3Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.wg_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_cd);
		p.columnWrk3Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.wg_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_wg_nm);
		p.columnWrk3Dtl_loc_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.loc_grp_cd_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_grp_cd);
		p.columnWrk3Dtl_loc_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.loc_grp_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_loc_grp_nm);
		p.columnWrk3Dtl_prio.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.prio_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_prio);
		p.columnWrk3Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.memo1_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo1);
		p.columnWrk3Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.memo2_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo2);
		p.columnWrk3Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.memo3_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_memo3);
		p.columnWrk3Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.ins_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_id);
		p.columnWrk3Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.ins_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_usr_nm);
		p.columnWrk3Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.ins_ts_META);
		p.columnWrk3Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_ts);
		p.columnWrk3Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.ins_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_id);
		p.columnWrk3Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.ins_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_ins_func_nm);
		p.columnWrk3Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_cntr_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_cntr);
		p.columnWrk3Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_id);
		p.columnWrk3Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_usr_nm);
		p.columnWrk3Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_ts_META);
		p.columnWrk3Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_ts);
		p.columnWrk3Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_func_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_id);
		p.columnWrk3Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_func_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_func_nm);
		p.columnWrk3Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.upd_srv_req_no_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_upd_srv_req_no);
		p.columnWrk3Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.del_usr_id_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_id);
		p.columnWrk3Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.del_usr_nm_META);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_usr_nm);
		p.columnWrk3Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk3DtlR.del_ts_META);
		p.columnWrk3Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk3DtlTable.addColumnConfig(p.columnWrk3Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk3DtlTable.setUnscrollColumn(p.columnWrk3Dtl_del_flg);
	}

	/**
	 * [Wrk4Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk4Dtl(MABSP_PurcItmReg p) {
		p.columnWrk4Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.check_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_check);
		p.columnWrk4Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.del_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_flg);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk4Dtl_to_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.to_loc_cd_META);
		p.columnWrk4Dtl_to_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk4Dtl_to_loc_cd.addLinkBeans(p.columnWrk4Dtl_to_loc_nm,p.columnWrk4Dtl_to_wg_cd,p.columnWrk4Dtl_to_wg_nm,p.columnWrk4Dtl_to_lg_grp_cd);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_to_loc_cd);
		p.columnWrk4Dtl_to_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.to_loc_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_to_loc_nm);
		p.columnWrk4Dtl_to_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.to_wg_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_to_wg_cd);
		p.columnWrk4Dtl_to_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.to_wg_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_to_wg_nm);
		p.columnWrk4Dtl_to_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.to_lg_grp_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_to_lg_grp_cd);
		p.columnWrk4Dtl_fr_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.fr_loc_cd_META);
		p.columnWrk4Dtl_fr_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk4Dtl_fr_loc_cd.addLinkBeans(p.columnWrk4Dtl_fr_loc_nm,p.columnWrk4Dtl_fr_wg_cd,p.columnWrk4Dtl_fr_lg_grp_cd);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_fr_loc_cd);
		p.columnWrk4Dtl_fr_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.fr_loc_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_fr_loc_nm);
		p.columnWrk4Dtl_fr_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.fr_wg_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_fr_wg_cd);
		p.columnWrk4Dtl_fr_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.fr_lg_grp_cd_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_fr_lg_grp_cd);
		p.columnWrk4Dtl_prio.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.prio_META);
		p.columnWrk4Dtl_prio.setMinusEnable(true);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_prio);
		p.Wrk4DtlTable.addTable(p.Wrk4Dtl_xfr_lot_unit_qty_p_PPanel.QtyTable);
		p.columnWrk4Dtl_in_loc_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.in_loc_flg_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_in_loc_flg);
		p.columnWrk4Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.memo1_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo1);
		p.columnWrk4Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.memo2_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo2);
		p.columnWrk4Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.memo3_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_memo3);
		p.columnWrk4Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.ins_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_id);
		p.columnWrk4Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.ins_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_usr_nm);
		p.columnWrk4Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.ins_ts_META);
		p.columnWrk4Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_ts);
		p.columnWrk4Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.ins_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_id);
		p.columnWrk4Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.ins_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_ins_func_nm);
		p.columnWrk4Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_cntr_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_cntr);
		p.columnWrk4Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_id);
		p.columnWrk4Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_usr_nm);
		p.columnWrk4Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_ts_META);
		p.columnWrk4Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_ts);
		p.columnWrk4Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_func_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_id);
		p.columnWrk4Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_func_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_func_nm);
		p.columnWrk4Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.upd_srv_req_no_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_upd_srv_req_no);
		p.columnWrk4Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.del_usr_id_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_id);
		p.columnWrk4Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.del_usr_nm_META);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_usr_nm);
		p.columnWrk4Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk4DtlR.del_ts_META);
		p.columnWrk4Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk4DtlTable.addColumnConfig(p.columnWrk4Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk4DtlTable.setUnscrollColumn(p.columnWrk4Dtl_del_flg);
	}

	/**
	 * [Wrk5Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk5Dtl(MABSP_PurcItmReg p) {
		p.columnWrk5Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.check_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_check);
		p.columnWrk5Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.del_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk5Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.loc_cd_META);
		p.columnWrk5Dtl_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk5Dtl_loc_cd.addLinkBeans(p.columnWrk5Dtl_loc_nm,p.columnWrk5Dtl_wg_cd,p.columnWrk5Dtl_wg_nm,p.columnWrk5Dtl_loc_grp_cd,p.columnWrk5Dtl_loc_grp_nm,p.columnWrk5Dtl_alloc_grp_cd,p.columnWrk5Dtl_alloc_grp_nm);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_cd);
		p.columnWrk5Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_nm);
		p.columnWrk5Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.wg_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_wg_cd);
		p.columnWrk5Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.wg_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_wg_nm);
		p.columnWrk5Dtl_loc_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.loc_grp_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_grp_cd);
		p.columnWrk5Dtl_loc_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.loc_grp_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_loc_grp_nm);
		p.columnWrk5Dtl_alloc_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.alloc_grp_cd_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_alloc_grp_cd);
		p.columnWrk5Dtl_alloc_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.alloc_grp_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_alloc_grp_nm);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_dt_p_PPanel.DtTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_buf_qty_p_PPanel.QtyTable);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_rord_stk_qty_p_PPanel.QtyTable);
		p.columnWrk5Dtl_gi_schd_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.gi_schd_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_schd_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_rord_rqst_qty_p_PPanel.QtyTable);
		p.columnWrk5Dtl_lot_sizing_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.lot_sizing_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_lot_sizing_flg);
		p.columnWrk5Dtl_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.gi_loc_cd_META);
		p.columnWrk5Dtl_gi_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk5Dtl_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_gi_loc_nm,p.columnWrk5Dtl_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_loc_cd);
		p.columnWrk5Dtl_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_loc_nm);
		p.columnWrk5Dtl_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln1_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_inpt_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.inpt_gi_loc_cd_META);
		p.columnWrk5Dtl_inpt_gi_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk5Dtl_inpt_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_inpt_gi_loc_nm,p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_loc_cd);
		p.columnWrk5Dtl_inpt_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.inpt_gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_loc_nm);
		p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.inpt_gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_inpt_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln2_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_ship_gi_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ship_gi_loc_cd_META);
		p.columnWrk5Dtl_ship_gi_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk5Dtl_ship_gi_loc_cd.addLinkBeans(p.columnWrk5Dtl_ship_gi_loc_nm,p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_loc_cd);
		p.columnWrk5Dtl_ship_gi_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ship_gi_loc_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_loc_nm);
		p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ship_gi_str_ln_tgt_flg_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ship_gi_str_ln_tgt_flg);
		p.Wrk5DtlTable.addTable(p.Wrk5Dtl_str_ln3_p_PPanel.StrLnTable);
		p.columnWrk5Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.memo1_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo1);
		p.columnWrk5Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.memo2_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo2);
		p.columnWrk5Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.memo3_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_memo3);
		p.columnWrk5Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ins_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_id);
		p.columnWrk5Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ins_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_usr_nm);
		p.columnWrk5Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ins_ts_META);
		p.columnWrk5Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_ts);
		p.columnWrk5Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ins_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_id);
		p.columnWrk5Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.ins_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_ins_func_nm);
		p.columnWrk5Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_cntr_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_cntr);
		p.columnWrk5Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_id);
		p.columnWrk5Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_usr_nm);
		p.columnWrk5Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_ts_META);
		p.columnWrk5Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_ts);
		p.columnWrk5Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_func_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_id);
		p.columnWrk5Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_func_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_func_nm);
		p.columnWrk5Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.upd_srv_req_no_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_upd_srv_req_no);
		p.columnWrk5Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.del_usr_id_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_id);
		p.columnWrk5Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.del_usr_nm_META);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_usr_nm);
		p.columnWrk5Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk5DtlR.del_ts_META);
		p.columnWrk5Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk5DtlTable.addColumnConfig(p.columnWrk5Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk5DtlTable.setUnscrollColumn(p.columnWrk5Dtl_del_flg);
	}

	/**
	 * [Wrk6Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk6Dtl(MABSP_PurcItmReg p) {
		p.columnWrk6Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.check_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_check);
		p.columnWrk6Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.del_flg_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_flg);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk6Dtl_sppl_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.sppl_cd_META);
		p.columnWrk6Dtl_sppl_cd.setListType(MCListType.STRICT);
		p.columnWrk6Dtl_sppl_cd.addLinkBeans(p.columnWrk6Dtl_sppl_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_sppl_cd);
		p.columnWrk6Dtl_sppl_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.sppl_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_sppl_nm);
		p.columnWrk6Dtl_lg_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.lg_grp_cd_META);
		p.columnWrk6Dtl_lg_grp_cd.addLinkBeans(p.columnWrk6Dtl_lg_grp_nm);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_lg_grp_cd);
		p.columnWrk6Dtl_lg_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.lg_grp_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_lg_grp_nm);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_dt_p_PPanel.DtTable);
		p.columnWrk6Dtl_purc_lt.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.purc_lt_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_purc_lt);
		p.Wrk6DtlTable.addTable(p.Wrk6Dtl_purc_lt_add_qty_p_PPanel.QtyTable);
		p.columnWrk6Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.memo1_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo1);
		p.columnWrk6Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.memo2_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo2);
		p.columnWrk6Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.memo3_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_memo3);
		p.columnWrk6Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.ins_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_id);
		p.columnWrk6Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.ins_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_usr_nm);
		p.columnWrk6Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.ins_ts_META);
		p.columnWrk6Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_ts);
		p.columnWrk6Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.ins_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_id);
		p.columnWrk6Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.ins_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_ins_func_nm);
		p.columnWrk6Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_cntr_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_cntr);
		p.columnWrk6Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_id);
		p.columnWrk6Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_usr_nm);
		p.columnWrk6Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_ts_META);
		p.columnWrk6Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_ts);
		p.columnWrk6Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_func_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_id);
		p.columnWrk6Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_func_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_func_nm);
		p.columnWrk6Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.upd_srv_req_no_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_upd_srv_req_no);
		p.columnWrk6Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.del_usr_id_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_id);
		p.columnWrk6Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.del_usr_nm_META);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_usr_nm);
		p.columnWrk6Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk6DtlR.del_ts_META);
		p.columnWrk6Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk6DtlTable.addColumnConfig(p.columnWrk6Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk6DtlTable.setUnscrollColumn(p.columnWrk6Dtl_del_flg);
	}

	/**
	 * [Wrk7Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk7Dtl(MABSP_PurcItmReg p) {
		p.columnWrk7Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.check_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_check);
		p.columnWrk7Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.del_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_flg);
		p.Wrk7DtlTable.addTable(p.Wrk7Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk7Dtl_bp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.bp_cd_META);
		p.columnWrk7Dtl_bp_cd.setListType(MCListType.STRICT);
		p.columnWrk7Dtl_bp_cd.addLinkBeans(p.columnWrk7Dtl_bp_nm,p.columnWrk7Dtl_sppl_flg,p.columnWrk7Dtl_cst_flg);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_bp_cd);
		p.columnWrk7Dtl_bp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.bp_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_bp_nm);
		p.columnWrk7Dtl_sppl_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.sppl_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_sppl_flg);
		p.columnWrk7Dtl_cst_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.cst_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_cst_flg);
		p.Wrk7DtlTable.addTable(p.Wrk7Dtl_dt_p_PPanel.DtTable);
		p.columnWrk7Dtl_bp_itm_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.bp_itm_cd_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_bp_itm_cd);
		p.columnWrk7Dtl_bp_itm_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.bp_itm_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_bp_itm_nm);
		p.columnWrk7Dtl_def_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.def_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_def_flg);
		p.columnWrk7Dtl_pf_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.pf_grp_cd_META);
		p.columnWrk7Dtl_pf_grp_cd.addLinkBeans(p.columnWrk7Dtl_pf_grp_nm);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_pf_grp_cd);
		p.columnWrk7Dtl_pf_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.pf_grp_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_pf_grp_nm);
		p.columnWrk7Dtl_pf_fix_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.pf_fix_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_pf_fix_flg);
		p.columnWrk7Dtl_purc_commit_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.purc_commit_flg_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_purc_commit_flg);
		p.columnWrk7Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.memo1_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo1);
		p.columnWrk7Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.memo2_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo2);
		p.columnWrk7Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.memo3_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_memo3);
		p.columnWrk7Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.ins_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_id);
		p.columnWrk7Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.ins_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_usr_nm);
		p.columnWrk7Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.ins_ts_META);
		p.columnWrk7Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_ts);
		p.columnWrk7Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.ins_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_id);
		p.columnWrk7Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.ins_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_ins_func_nm);
		p.columnWrk7Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_cntr_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_cntr);
		p.columnWrk7Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_id);
		p.columnWrk7Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_usr_nm);
		p.columnWrk7Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_ts_META);
		p.columnWrk7Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_ts);
		p.columnWrk7Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_func_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_id);
		p.columnWrk7Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_func_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_func_nm);
		p.columnWrk7Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.upd_srv_req_no_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_upd_srv_req_no);
		p.columnWrk7Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.del_usr_id_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_id);
		p.columnWrk7Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.del_usr_nm_META);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_usr_nm);
		p.columnWrk7Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk7DtlR.del_ts_META);
		p.columnWrk7Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk7DtlTable.addColumnConfig(p.columnWrk7Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk7DtlTable.setUnscrollColumn(p.columnWrk7Dtl_del_flg);
	}

	/**
	 * [Wrk8Dtl]ブロックのTableの設定
	 */
	protected static void setTableConfigWrk8Dtl(MABSP_PurcItmReg p) {
		p.columnWrk8Dtl_check.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.check_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_check);
		p.columnWrk8Dtl_del_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.del_flg_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_del_flg);
		p.Wrk8DtlTable.addTable(p.Wrk8Dtl_itm_p_PPanel.ItmTable);
		p.columnWrk8Dtl_loc_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.loc_cd_META);
		p.columnWrk8Dtl_loc_cd.setListType(MCListType.STRICT);
		p.columnWrk8Dtl_loc_cd.addLinkBeans(p.columnWrk8Dtl_loc_nm,p.columnWrk8Dtl_wg_cd,p.columnWrk8Dtl_wg_nm,p.columnWrk8Dtl_loc_grp_cd,p.columnWrk8Dtl_loc_grp_nm,p.columnWrk8Dtl_str_ln_tgt_flg);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_loc_cd);
		p.columnWrk8Dtl_loc_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.loc_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_loc_nm);
		p.columnWrk8Dtl_str_ln_tgt_flg.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.str_ln_tgt_flg_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_str_ln_tgt_flg);
		p.columnWrk8Dtl_wg_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.wg_cd_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_wg_cd);
		p.columnWrk8Dtl_wg_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.wg_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_wg_nm);
		p.columnWrk8Dtl_loc_grp_cd.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.loc_grp_cd_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_loc_grp_cd);
		p.columnWrk8Dtl_loc_grp_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.loc_grp_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_loc_grp_nm);
		p.Wrk8DtlTable.addTable(p.Wrk8Dtl_str_ln_p_PPanel.StrLnTable);
		p.columnWrk8Dtl_memo1.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.memo1_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_memo1);
		p.columnWrk8Dtl_memo2.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.memo2_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_memo2);
		p.columnWrk8Dtl_memo3.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.memo3_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_memo3);
		p.columnWrk8Dtl_ins_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.ins_usr_id_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_ins_usr_id);
		p.columnWrk8Dtl_ins_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.ins_usr_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_ins_usr_nm);
		p.columnWrk8Dtl_ins_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.ins_ts_META);
		p.columnWrk8Dtl_ins_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_ins_ts);
		p.columnWrk8Dtl_ins_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.ins_func_id_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_ins_func_id);
		p.columnWrk8Dtl_ins_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.ins_func_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_ins_func_nm);
		p.columnWrk8Dtl_upd_cntr.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_cntr_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_cntr);
		p.columnWrk8Dtl_upd_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_usr_id_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_usr_id);
		p.columnWrk8Dtl_upd_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_usr_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_usr_nm);
		p.columnWrk8Dtl_upd_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_ts_META);
		p.columnWrk8Dtl_upd_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_ts);
		p.columnWrk8Dtl_upd_func_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_func_id_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_func_id);
		p.columnWrk8Dtl_upd_func_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_func_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_func_nm);
		p.columnWrk8Dtl_upd_srv_req_no.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.upd_srv_req_no_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_upd_srv_req_no);
		p.columnWrk8Dtl_del_usr_id.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.del_usr_id_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_del_usr_id);
		p.columnWrk8Dtl_del_usr_nm.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.del_usr_nm_META);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_del_usr_nm);
		p.columnWrk8Dtl_del_ts.setMeta(mcframe.clientMABS.MABSP1110.Wrk8DtlR.del_ts_META);
		p.columnWrk8Dtl_del_ts.setFormatID(mcframe.commonMA.meta.MA_META.SYS_TS_FORMAT);
		p.Wrk8DtlTable.addColumnConfig(p.columnWrk8Dtl_del_ts);
		// スクロール固定カラムの指定
		p.Wrk8DtlTable.setUnscrollColumn(p.columnWrk8Dtl_del_flg);
	}

	/**
	 * コンボボックスの初期設定
	 */
	protected void listInit() {
		super.listInit();
		columnWrk1Dtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_wg_cd.getListConfig().setPutter(getWrk1Dtl_wg_cd_ListPutter());
		columnWrk1Dtl_sppl_cd.getListConfig().setPutter(getWrk1Dtl_sppl_cd_ListPutter());
		columnWrk1Dtl_maker_cd.getListConfig().setPutter(getWrk1Dtl_maker_cd_ListPutter());
		columnWrk1Dtl_purc_id_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_purc_id_typ.getListConfig().setPutter(getWrk1Dtl_purc_id_typ_ListPutter());
		columnWrk1Dtl_purc_basis_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_purc_basis_typ.getListConfig().setPutter(getWrk1Dtl_purc_basis_typ_ListPutter());
		columnWrk1Dtl_sz_day_week_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_sz_day_week_typ.getListConfig().setPutter(getWrk1Dtl_sz_day_week_typ_ListPutter());
		columnWrk1Dtl_rqst_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk1Dtl_rqst_wg_cd.getListConfig().setPutter(getWrk1Dtl_rqst_wg_cd_ListPutter());
		columnWrk2Dtl_wg_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_wg_cd.getListConfig().setPutter(getWrk2Dtl_wg_cd_ListPutter());
		columnWrk2Dtl_rqst_loc_cd.getListConfig().setPutter(getWrk2Dtl_rqst_loc_cd_ListPutter());
		columnWrk2Dtl_sz_day_week_typ.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk2Dtl_sz_day_week_typ.getListConfig().setPutter(getWrk2Dtl_sz_day_week_typ_ListPutter());
		columnWrk3Dtl_loc_cd.getListConfig().setPutter(getWrk3Dtl_loc_cd_ListPutter());
		columnWrk4Dtl_to_loc_cd.getListConfig().setPutter(getWrk4Dtl_to_loc_cd_ListPutter());
		columnWrk4Dtl_fr_loc_cd.getListConfig().setPutter(getWrk4Dtl_fr_loc_cd_ListPutter());
		columnWrk5Dtl_loc_cd.getListConfig().setPutter(getWrk5Dtl_loc_cd_ListPutter());
		columnWrk5Dtl_gi_loc_cd.getListConfig().setPutter(getWrk5Dtl_gi_loc_cd_ListPutter());
		columnWrk5Dtl_inpt_gi_loc_cd.getListConfig().setPutter(getWrk5Dtl_inpt_gi_loc_cd_ListPutter());
		columnWrk5Dtl_ship_gi_loc_cd.getListConfig().setPutter(getWrk5Dtl_ship_gi_loc_cd_ListPutter());
		columnWrk6Dtl_sppl_cd.getListConfig().setPutter(getWrk6Dtl_sppl_cd_ListPutter());
		columnWrk6Dtl_lg_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk6Dtl_lg_grp_cd.getListConfig().setPutter(getWrk6Dtl_lg_grp_cd_ListPutter());
		columnWrk7Dtl_bp_cd.getListConfig().setPutter(getWrk7Dtl_bp_cd_ListPutter());
		columnWrk7Dtl_pf_grp_cd.setListVisibleColumn(MCListLogic.getViewColumnName());
		columnWrk7Dtl_pf_grp_cd.getListConfig().setPutter(getWrk7Dtl_pf_grp_cd_ListPutter());
		columnWrk8Dtl_loc_cd.getListConfig().setPutter(getWrk8Dtl_loc_cd_ListPutter());
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
		if (SRCH.equals(status)) {
			setSRCHStatus();
		}
		else if (UPD.equals(status)) {
			setUPDStatus();
		}
		else if (FIX.equals(status)) {
			setFIXStatus();
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
	 * [Wrk1Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgOrSlsWg");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_maker_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_maker_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_purc_id_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_purc_id_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcIdTyp");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_purc_basis_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_purc_basis_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcBasisTyp");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_sz_day_week_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_sz_day_week_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DayWeekTyp");
		return lp;
	}
	 
	/**
	 * [Wrk1Dtl_rqst_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk1Dtl_rqst_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PurcWg");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_wg_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_wg_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgOrMfgOrSlsWg");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_rqst_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_rqst_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk2Dtl_sz_day_week_typ_ListPutter]の作成
	 */
	protected MCListPutter createWrk2Dtl_sz_day_week_typ_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.DayWeekTyp");
		return lp;
	}
	 
	/**
	 * [Wrk3Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk3Dtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_to_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_to_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk4Dtl_fr_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk4Dtl_fr_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_inpt_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_inpt_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk5Dtl_ship_gi_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk5Dtl_ship_gi_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_sppl_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_sppl_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk6Dtl_lg_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk6Dtl_lg_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.LgGrp");
		return lp;
	}
	 
	/**
	 * [Wrk7Dtl_bp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk7Dtl_bp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Bp");
		return lp;
	}
	 
	/**
	 * [Wrk7Dtl_pf_grp_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk7Dtl_pf_grp_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.PfGrp");
		return lp;
	}
	 
	/**
	 * [Wrk8Dtl_loc_cd_ListPutter]の作成
	 */
	protected MCListPutter createWrk8Dtl_loc_cd_ListPutter(MCLinkBeans compo, String... columns) {
		MCListPutter lp = new MCListPutter(compo, columns);
		lp.setListLogicId("MA.MAUAP0010.Loc");
		return lp;
	}
	 

	/**
	 * リストを保持する画面部品のリストを返します。
	 */
	public MCList getList(MCEventBeans combo, MCRow row, MCEventInfo info) {
		MCList list = super.getList(combo, row, info);
		if(list != null) return list;
		if(combo == Wrk1Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk1Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk1Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk1Dtl_wg_cd) return getWrk1Dtl_wg_cd(row, info);
		if(combo == columnWrk1Dtl_sppl_cd) return getWrk1Dtl_sppl_cd(row, info);
		if(combo == columnWrk1Dtl_maker_cd) return getWrk1Dtl_maker_cd(row, info);
		if(combo == columnWrk1Dtl_purc_id_typ) return getWrk1Dtl_purc_id_typ(row, info);
		if(combo == columnWrk1Dtl_purc_basis_typ) return getWrk1Dtl_purc_basis_typ(row, info);
		if(combo == columnWrk1Dtl_sz_day_week_typ) return getWrk1Dtl_sz_day_week_typ(row, info);
		if(combo == columnWrk1Dtl_rqst_wg_cd) return getWrk1Dtl_rqst_wg_cd(row, info);
		if(combo == columnWrk2Dtl_wg_cd) return getWrk2Dtl_wg_cd(row, info);
		if(combo == columnWrk2Dtl_rqst_loc_cd) return getWrk2Dtl_rqst_loc_cd(row, info);
		if(combo == columnWrk2Dtl_sz_day_week_typ) return getWrk2Dtl_sz_day_week_typ(row, info);
		if(combo == columnWrk3Dtl_loc_cd) return getWrk3Dtl_loc_cd(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk4Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk4Dtl_to_loc_cd) return getWrk4Dtl_to_loc_cd(row, info);
		if(combo == columnWrk4Dtl_fr_loc_cd) return getWrk4Dtl_fr_loc_cd(row, info);
		if(combo == Wrk5Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk5Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk5Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk5Dtl_loc_cd) return getWrk5Dtl_loc_cd(row, info);
		if(combo == columnWrk5Dtl_gi_loc_cd) return getWrk5Dtl_gi_loc_cd(row, info);
		if(combo == columnWrk5Dtl_inpt_gi_loc_cd) return getWrk5Dtl_inpt_gi_loc_cd(row, info);
		if(combo == columnWrk5Dtl_ship_gi_loc_cd) return getWrk5Dtl_ship_gi_loc_cd(row, info);
		if(combo == Wrk6Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk6Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk6Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk6Dtl_sppl_cd) return getWrk6Dtl_sppl_cd(row, info);
		if(combo == columnWrk6Dtl_lg_grp_cd) return getWrk6Dtl_lg_grp_cd(row, info);
		if(combo == Wrk7Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk7Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk7Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk7Dtl_bp_cd) return getWrk7Dtl_bp_cd(row, info);
		if(combo == columnWrk7Dtl_pf_grp_cd) return getWrk7Dtl_pf_grp_cd(row, info);
		if(combo == Wrk8Dtl_itm_p_PPanel.columnItm_itm_cd) return getWrk8Dtl_itm_p_PPanel_columnItm_itm_cd(row, info);
		if(combo == Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub1) return getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub1(row, info);
		if(combo == Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub2) return getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub2(row, info);
		if(combo == Wrk8Dtl_itm_p_PPanel.columnItm_itm_sub3) return getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub3(row, info);
		if(combo == columnWrk8Dtl_loc_cd) return getWrk8Dtl_loc_cd(row, info);
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
		else if (ap == Hdr_upd) doHdr_upd(info);
		else if (ap == Wrk1SetDtHdr_set_dt) doWrk1SetDtHdr_set_dt(info);
		else if (ap == Wrk1DtlBtn_select_all) doWrk1DtlBtn_select_all(info);
		else if (ap == Wrk1DtlBtn_deselect_all) doWrk1DtlBtn_deselect_all(info);
		else if (ap == Wrk1DtlBtn_radd) doWrk1DtlBtn_radd(info);
		else if (ap == Wrk1DtlBtn_rdel) doWrk1DtlBtn_rdel(info);
		else if (ap == Wrk1DtlBtn_rcopy) doWrk1DtlBtn_rcopy(info);
		else if (ap == Wrk2SetDtHdr_set_dt) doWrk2SetDtHdr_set_dt(info);
		else if (ap == Wrk2DtlBtn_select_all) doWrk2DtlBtn_select_all(info);
		else if (ap == Wrk2DtlBtn_deselect_all) doWrk2DtlBtn_deselect_all(info);
		else if (ap == Wrk2DtlBtn_radd) doWrk2DtlBtn_radd(info);
		else if (ap == Wrk2DtlBtn_rdel) doWrk2DtlBtn_rdel(info);
		else if (ap == Wrk2DtlBtn_rcopy) doWrk2DtlBtn_rcopy(info);
		else if (ap == Wrk3DtlBtn_select_all) doWrk3DtlBtn_select_all(info);
		else if (ap == Wrk3DtlBtn_deselect_all) doWrk3DtlBtn_deselect_all(info);
		else if (ap == Wrk3DtlBtn_radd) doWrk3DtlBtn_radd(info);
		else if (ap == Wrk3DtlBtn_rdel) doWrk3DtlBtn_rdel(info);
		else if (ap == Wrk3DtlBtn_rcopy) doWrk3DtlBtn_rcopy(info);
		else if (ap == Wrk4DtlBtn_select_all) doWrk4DtlBtn_select_all(info);
		else if (ap == Wrk4DtlBtn_deselect_all) doWrk4DtlBtn_deselect_all(info);
		else if (ap == Wrk4DtlBtn_radd) doWrk4DtlBtn_radd(info);
		else if (ap == Wrk4DtlBtn_rdel) doWrk4DtlBtn_rdel(info);
		else if (ap == Wrk4DtlBtn_rcopy) doWrk4DtlBtn_rcopy(info);
		else if (ap == Wrk5SetDtHdr_set_dt) doWrk5SetDtHdr_set_dt(info);
		else if (ap == Wrk5DtlBtn_select_all) doWrk5DtlBtn_select_all(info);
		else if (ap == Wrk5DtlBtn_deselect_all) doWrk5DtlBtn_deselect_all(info);
		else if (ap == Wrk5DtlBtn_radd) doWrk5DtlBtn_radd(info);
		else if (ap == Wrk5DtlBtn_rdel) doWrk5DtlBtn_rdel(info);
		else if (ap == Wrk5DtlBtn_rcopy) doWrk5DtlBtn_rcopy(info);
		else if (ap == Wrk6SetDtHdr_set_dt) doWrk6SetDtHdr_set_dt(info);
		else if (ap == Wrk6DtlBtn_select_all) doWrk6DtlBtn_select_all(info);
		else if (ap == Wrk6DtlBtn_deselect_all) doWrk6DtlBtn_deselect_all(info);
		else if (ap == Wrk6DtlBtn_radd) doWrk6DtlBtn_radd(info);
		else if (ap == Wrk6DtlBtn_rdel) doWrk6DtlBtn_rdel(info);
		else if (ap == Wrk6DtlBtn_rcopy) doWrk6DtlBtn_rcopy(info);
		else if (ap == Wrk7SetDtHdr_set_dt) doWrk7SetDtHdr_set_dt(info);
		else if (ap == Wrk7DtlBtn_select_all) doWrk7DtlBtn_select_all(info);
		else if (ap == Wrk7DtlBtn_deselect_all) doWrk7DtlBtn_deselect_all(info);
		else if (ap == Wrk7DtlBtn_radd) doWrk7DtlBtn_radd(info);
		else if (ap == Wrk7DtlBtn_rdel) doWrk7DtlBtn_rdel(info);
		else if (ap == Wrk7DtlBtn_rcopy) doWrk7DtlBtn_rcopy(info);
		else if (ap == Wrk8DtlBtn_select_all) doWrk8DtlBtn_select_all(info);
		else if (ap == Wrk8DtlBtn_deselect_all) doWrk8DtlBtn_deselect_all(info);
		else if (ap == Wrk8DtlBtn_radd) doWrk8DtlBtn_radd(info);
		else if (ap == Wrk8DtlBtn_rdel) doWrk8DtlBtn_rdel(info);
		else if (ap == Wrk8DtlBtn_rcopy) doWrk8DtlBtn_rcopy(info);
		else if (ap == Btn_open_MABSP0120) doBtn_open_MABSP0120(info);
	}

	/**
	 * [Ctrl]パネルの[ctrl_Ope_srch]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doCtrl_ctrl_Ope_srch(MCEventInfo info);

	/**
	 * [Hdr]パネルの[upd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doHdr_upd(MCEventInfo info);

	/**
	 * [Wrk1SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk1DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk1DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk1DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk1DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk1DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk1DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk2SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk2DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk2DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk3DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk3DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk4DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk4DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk5SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk5DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk5DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk6SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk6DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk6DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk7SetDtHdr]パネルの[set_dt]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7SetDtHdr_set_dt(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk7DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk7DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Wrk8DtlBtn]パネルの[select_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk8DtlBtn_select_all(MCEventInfo info);

	/**
	 * [Wrk8DtlBtn]パネルの[deselect_all]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk8DtlBtn_deselect_all(MCEventInfo info);

	/**
	 * [Wrk8DtlBtn]パネルの[radd]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk8DtlBtn_radd(MCEventInfo info);

	/**
	 * [Wrk8DtlBtn]パネルの[rdel]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk8DtlBtn_rdel(MCEventInfo info);

	/**
	 * [Wrk8DtlBtn]パネルの[rcopy]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doWrk8DtlBtn_rcopy(MCEventInfo info);

	/**
	 * [Btn]パネルの[open_MABSP0120]ボタンが押下されたときに呼び出されます。
	 */
	abstract public void doBtn_open_MABSP0120(MCEventInfo info);

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
		if (vc == DtlTabTab) return doDtlTab_VC(info);
		if (vc == Wrk1DtlTable) return doWrk1Dtl_VC(info);
		if (vc == Wrk2DtlTable) return doWrk2Dtl_VC(info);
		if (vc == Wrk3DtlTable) return doWrk3Dtl_VC(info);
		if (vc == Wrk4DtlTable) return doWrk4Dtl_VC(info);
		if (vc == Wrk5DtlTable) return doWrk5Dtl_VC(info);
		if (vc == Wrk6DtlTable) return doWrk6Dtl_VC(info);
		if (vc == Wrk7DtlTable) return doWrk7Dtl_VC(info);
		if (vc == Wrk8DtlTable) return doWrk8Dtl_VC(info);
		if (vc == Cnd_ope_Group) return doCnd_ope_VC(info);
		if (vc == Cnd_off_del_flg) return doCnd_off_del_flg_VC(info);
		if (vc == Cnd_on_del_flg) return doCnd_on_del_flg_VC(info);
		if (vc == Hdr_unit_cd) return doHdr_unit_cd_VC(info);
		if (vc == Hdr_unit_nm) return doHdr_unit_nm_VC(info);
		if (vc == Hdr_stk_mng_typ) return doHdr_stk_mng_typ_VC(info);
		if (vc == Hdr_stk_mng_typ_nm) return doHdr_stk_mng_typ_nm_VC(info);
		if (vc == Hdr_asset_mng_typ) return doHdr_asset_mng_typ_VC(info);
		if (vc == Hdr_asset_mng_typ_nm) return doHdr_asset_mng_typ_nm_VC(info);
		if (vc == Hdr_dec_place) return doHdr_dec_place_VC(info);
		if (vc == Hdr_sundry_itm_flg) return doHdr_sundry_itm_flg_VC(info);
		if (vc == Hdr_sno1_mng_typ) return doHdr_sno1_mng_typ_VC(info);
		if (vc == Hdr_sno2_mng_typ) return doHdr_sno2_mng_typ_VC(info);
		if (vc == Hdr_sno3_mng_typ) return doHdr_sno3_mng_typ_VC(info);
		if (vc == Hdr_sno4_mng_typ) return doHdr_sno4_mng_typ_VC(info);
		if (vc == Hdr_purc_flg) return doHdr_purc_flg_VC(info);
		if (vc == Hdr_purc_input_flg) return doHdr_purc_input_flg_VC(info);
		if (vc == Hdr_upd_cntr) return doHdr_upd_cntr_VC(info);
		if (vc == Hdr_check) return doHdr_check_VC(info);
		if (vc == Wrk1SetDtHdr_st_dt) return doWrk1SetDtHdr_st_dt_VC(info);
		if (vc == Wrk1SetDtHdr_end_dt) return doWrk1SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk1Dtl_check) return doWrk1Dtl_check_VC(info);
		if (vc == columnWrk1Dtl_del_flg) return doWrk1Dtl_del_flg_VC(info);
		if (vc == columnWrk1Dtl_wg_cd) return doWrk1Dtl_wg_cd_VC(info);
		if (vc == columnWrk1Dtl_wg_nm) return doWrk1Dtl_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_sppl_cd) return doWrk1Dtl_sppl_cd_VC(info);
		if (vc == columnWrk1Dtl_sppl_nm) return doWrk1Dtl_sppl_nm_VC(info);
		if (vc == columnWrk1Dtl_maker_cd) return doWrk1Dtl_maker_cd_VC(info);
		if (vc == columnWrk1Dtl_maker_nm) return doWrk1Dtl_maker_nm_VC(info);
		if (vc == columnWrk1Dtl_purc_id_typ) return doWrk1Dtl_purc_id_typ_VC(info);
		if (vc == columnWrk1Dtl_purc_id_typ_nm) return doWrk1Dtl_purc_id_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_purc_lt) return doWrk1Dtl_purc_lt_VC(info);
		if (vc == columnWrk1Dtl_purc_basis_typ) return doWrk1Dtl_purc_basis_typ_VC(info);
		if (vc == columnWrk1Dtl_purc_basis_typ_nm) return doWrk1Dtl_purc_basis_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_accpt_insp_lt) return doWrk1Dtl_accpt_insp_lt_VC(info);
		if (vc == columnWrk1Dtl_buf_lt) return doWrk1Dtl_buf_lt_VC(info);
		if (vc == columnWrk1Dtl_ord_fix_pd) return doWrk1Dtl_ord_fix_pd_VC(info);
		if (vc == columnWrk1Dtl_sz_day_week_typ) return doWrk1Dtl_sz_day_week_typ_VC(info);
		if (vc == columnWrk1Dtl_sz_day_week_typ_nm) return doWrk1Dtl_sz_day_week_typ_nm_VC(info);
		if (vc == columnWrk1Dtl_sz_week) return doWrk1Dtl_sz_week_VC(info);
		if (vc == columnWrk1Dtl_lot_sz_pd) return doWrk1Dtl_lot_sz_pd_VC(info);
		if (vc == columnWrk1Dtl_max_order) return doWrk1Dtl_max_order_VC(info);
		if (vc == columnWrk1Dtl_prio) return doWrk1Dtl_prio_VC(info);
		if (vc == columnWrk1Dtl_order_ratio) return doWrk1Dtl_order_ratio_VC(info);
		if (vc == columnWrk1Dtl_pre_po_tgt_flg) return doWrk1Dtl_pre_po_tgt_flg_VC(info);
		if (vc == columnWrk1Dtl_rqst_wg_cd) return doWrk1Dtl_rqst_wg_cd_VC(info);
		if (vc == columnWrk1Dtl_rqst_wg_nm) return doWrk1Dtl_rqst_wg_nm_VC(info);
		if (vc == columnWrk1Dtl_po_batch_flg) return doWrk1Dtl_po_batch_flg_VC(info);
		if (vc == columnWrk1Dtl_not_mrp_flg) return doWrk1Dtl_not_mrp_flg_VC(info);
		if (vc == columnWrk1Dtl_cost_ratio) return doWrk1Dtl_cost_ratio_VC(info);
		if (vc == columnWrk1Dtl_memo1) return doWrk1Dtl_memo1_VC(info);
		if (vc == columnWrk1Dtl_memo2) return doWrk1Dtl_memo2_VC(info);
		if (vc == columnWrk1Dtl_memo3) return doWrk1Dtl_memo3_VC(info);
		if (vc == columnWrk1Dtl_ins_usr_id) return doWrk1Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk1Dtl_ins_usr_nm) return doWrk1Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_ins_ts) return doWrk1Dtl_ins_ts_VC(info);
		if (vc == columnWrk1Dtl_ins_func_id) return doWrk1Dtl_ins_func_id_VC(info);
		if (vc == columnWrk1Dtl_ins_func_nm) return doWrk1Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_cntr) return doWrk1Dtl_upd_cntr_VC(info);
		if (vc == columnWrk1Dtl_upd_usr_id) return doWrk1Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk1Dtl_upd_usr_nm) return doWrk1Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_ts) return doWrk1Dtl_upd_ts_VC(info);
		if (vc == columnWrk1Dtl_upd_func_id) return doWrk1Dtl_upd_func_id_VC(info);
		if (vc == columnWrk1Dtl_upd_func_nm) return doWrk1Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk1Dtl_upd_srv_req_no) return doWrk1Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk1Dtl_del_usr_id) return doWrk1Dtl_del_usr_id_VC(info);
		if (vc == columnWrk1Dtl_del_usr_nm) return doWrk1Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk1Dtl_del_ts) return doWrk1Dtl_del_ts_VC(info);
		if (vc == Wrk2SetDtHdr_st_dt) return doWrk2SetDtHdr_st_dt_VC(info);
		if (vc == Wrk2SetDtHdr_end_dt) return doWrk2SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk2Dtl_check) return doWrk2Dtl_check_VC(info);
		if (vc == columnWrk2Dtl_del_flg) return doWrk2Dtl_del_flg_VC(info);
		if (vc == columnWrk2Dtl_wg_cd) return doWrk2Dtl_wg_cd_VC(info);
		if (vc == columnWrk2Dtl_wg_nm) return doWrk2Dtl_wg_nm_VC(info);
		if (vc == columnWrk2Dtl_rqst_loc_cd) return doWrk2Dtl_rqst_loc_cd_VC(info);
		if (vc == columnWrk2Dtl_rqst_loc_nm) return doWrk2Dtl_rqst_loc_nm_VC(info);
		if (vc == columnWrk2Dtl_buf_lt) return doWrk2Dtl_buf_lt_VC(info);
		if (vc == columnWrk2Dtl_ord_fix_pd) return doWrk2Dtl_ord_fix_pd_VC(info);
		if (vc == columnWrk2Dtl_sz_day_week_typ) return doWrk2Dtl_sz_day_week_typ_VC(info);
		if (vc == columnWrk2Dtl_sz_day_week_typ_nm) return doWrk2Dtl_sz_day_week_typ_nm_VC(info);
		if (vc == columnWrk2Dtl_sz_week) return doWrk2Dtl_sz_week_VC(info);
		if (vc == columnWrk2Dtl_lot_sz_pd) return doWrk2Dtl_lot_sz_pd_VC(info);
		if (vc == columnWrk2Dtl_max_order) return doWrk2Dtl_max_order_VC(info);
		if (vc == columnWrk2Dtl_prio) return doWrk2Dtl_prio_VC(info);
		if (vc == columnWrk2Dtl_order_ratio) return doWrk2Dtl_order_ratio_VC(info);
		if (vc == columnWrk2Dtl_pre_po_tgt_flg) return doWrk2Dtl_pre_po_tgt_flg_VC(info);
		if (vc == columnWrk2Dtl_not_mrp_flg) return doWrk2Dtl_not_mrp_flg_VC(info);
		if (vc == columnWrk2Dtl_memo1) return doWrk2Dtl_memo1_VC(info);
		if (vc == columnWrk2Dtl_memo2) return doWrk2Dtl_memo2_VC(info);
		if (vc == columnWrk2Dtl_memo3) return doWrk2Dtl_memo3_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_id) return doWrk2Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk2Dtl_ins_usr_nm) return doWrk2Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_ins_ts) return doWrk2Dtl_ins_ts_VC(info);
		if (vc == columnWrk2Dtl_ins_func_id) return doWrk2Dtl_ins_func_id_VC(info);
		if (vc == columnWrk2Dtl_ins_func_nm) return doWrk2Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_cntr) return doWrk2Dtl_upd_cntr_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_id) return doWrk2Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk2Dtl_upd_usr_nm) return doWrk2Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_ts) return doWrk2Dtl_upd_ts_VC(info);
		if (vc == columnWrk2Dtl_upd_func_id) return doWrk2Dtl_upd_func_id_VC(info);
		if (vc == columnWrk2Dtl_upd_func_nm) return doWrk2Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk2Dtl_upd_srv_req_no) return doWrk2Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk2Dtl_del_usr_id) return doWrk2Dtl_del_usr_id_VC(info);
		if (vc == columnWrk2Dtl_del_usr_nm) return doWrk2Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk2Dtl_del_ts) return doWrk2Dtl_del_ts_VC(info);
		if (vc == columnWrk3Dtl_check) return doWrk3Dtl_check_VC(info);
		if (vc == columnWrk3Dtl_del_flg) return doWrk3Dtl_del_flg_VC(info);
		if (vc == columnWrk3Dtl_loc_cd) return doWrk3Dtl_loc_cd_VC(info);
		if (vc == columnWrk3Dtl_loc_nm) return doWrk3Dtl_loc_nm_VC(info);
		if (vc == columnWrk3Dtl_wg_cd) return doWrk3Dtl_wg_cd_VC(info);
		if (vc == columnWrk3Dtl_wg_nm) return doWrk3Dtl_wg_nm_VC(info);
		if (vc == columnWrk3Dtl_loc_grp_cd) return doWrk3Dtl_loc_grp_cd_VC(info);
		if (vc == columnWrk3Dtl_loc_grp_nm) return doWrk3Dtl_loc_grp_nm_VC(info);
		if (vc == columnWrk3Dtl_prio) return doWrk3Dtl_prio_VC(info);
		if (vc == columnWrk3Dtl_memo1) return doWrk3Dtl_memo1_VC(info);
		if (vc == columnWrk3Dtl_memo2) return doWrk3Dtl_memo2_VC(info);
		if (vc == columnWrk3Dtl_memo3) return doWrk3Dtl_memo3_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_id) return doWrk3Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk3Dtl_ins_usr_nm) return doWrk3Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_ins_ts) return doWrk3Dtl_ins_ts_VC(info);
		if (vc == columnWrk3Dtl_ins_func_id) return doWrk3Dtl_ins_func_id_VC(info);
		if (vc == columnWrk3Dtl_ins_func_nm) return doWrk3Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_cntr) return doWrk3Dtl_upd_cntr_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_id) return doWrk3Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk3Dtl_upd_usr_nm) return doWrk3Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_ts) return doWrk3Dtl_upd_ts_VC(info);
		if (vc == columnWrk3Dtl_upd_func_id) return doWrk3Dtl_upd_func_id_VC(info);
		if (vc == columnWrk3Dtl_upd_func_nm) return doWrk3Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk3Dtl_upd_srv_req_no) return doWrk3Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk3Dtl_del_usr_id) return doWrk3Dtl_del_usr_id_VC(info);
		if (vc == columnWrk3Dtl_del_usr_nm) return doWrk3Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk3Dtl_del_ts) return doWrk3Dtl_del_ts_VC(info);
		if (vc == columnWrk4Dtl_check) return doWrk4Dtl_check_VC(info);
		if (vc == columnWrk4Dtl_del_flg) return doWrk4Dtl_del_flg_VC(info);
		if (vc == columnWrk4Dtl_to_loc_cd) return doWrk4Dtl_to_loc_cd_VC(info);
		if (vc == columnWrk4Dtl_to_loc_nm) return doWrk4Dtl_to_loc_nm_VC(info);
		if (vc == columnWrk4Dtl_to_wg_cd) return doWrk4Dtl_to_wg_cd_VC(info);
		if (vc == columnWrk4Dtl_to_wg_nm) return doWrk4Dtl_to_wg_nm_VC(info);
		if (vc == columnWrk4Dtl_to_lg_grp_cd) return doWrk4Dtl_to_lg_grp_cd_VC(info);
		if (vc == columnWrk4Dtl_fr_loc_cd) return doWrk4Dtl_fr_loc_cd_VC(info);
		if (vc == columnWrk4Dtl_fr_loc_nm) return doWrk4Dtl_fr_loc_nm_VC(info);
		if (vc == columnWrk4Dtl_fr_wg_cd) return doWrk4Dtl_fr_wg_cd_VC(info);
		if (vc == columnWrk4Dtl_fr_lg_grp_cd) return doWrk4Dtl_fr_lg_grp_cd_VC(info);
		if (vc == columnWrk4Dtl_prio) return doWrk4Dtl_prio_VC(info);
		if (vc == columnWrk4Dtl_in_loc_flg) return doWrk4Dtl_in_loc_flg_VC(info);
		if (vc == columnWrk4Dtl_memo1) return doWrk4Dtl_memo1_VC(info);
		if (vc == columnWrk4Dtl_memo2) return doWrk4Dtl_memo2_VC(info);
		if (vc == columnWrk4Dtl_memo3) return doWrk4Dtl_memo3_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_id) return doWrk4Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk4Dtl_ins_usr_nm) return doWrk4Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_ins_ts) return doWrk4Dtl_ins_ts_VC(info);
		if (vc == columnWrk4Dtl_ins_func_id) return doWrk4Dtl_ins_func_id_VC(info);
		if (vc == columnWrk4Dtl_ins_func_nm) return doWrk4Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_cntr) return doWrk4Dtl_upd_cntr_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_id) return doWrk4Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk4Dtl_upd_usr_nm) return doWrk4Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_ts) return doWrk4Dtl_upd_ts_VC(info);
		if (vc == columnWrk4Dtl_upd_func_id) return doWrk4Dtl_upd_func_id_VC(info);
		if (vc == columnWrk4Dtl_upd_func_nm) return doWrk4Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk4Dtl_upd_srv_req_no) return doWrk4Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk4Dtl_del_usr_id) return doWrk4Dtl_del_usr_id_VC(info);
		if (vc == columnWrk4Dtl_del_usr_nm) return doWrk4Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk4Dtl_del_ts) return doWrk4Dtl_del_ts_VC(info);
		if (vc == Wrk5SetDtHdr_st_dt) return doWrk5SetDtHdr_st_dt_VC(info);
		if (vc == Wrk5SetDtHdr_end_dt) return doWrk5SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk5Dtl_check) return doWrk5Dtl_check_VC(info);
		if (vc == columnWrk5Dtl_del_flg) return doWrk5Dtl_del_flg_VC(info);
		if (vc == columnWrk5Dtl_loc_cd) return doWrk5Dtl_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_loc_nm) return doWrk5Dtl_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_wg_cd) return doWrk5Dtl_wg_cd_VC(info);
		if (vc == columnWrk5Dtl_wg_nm) return doWrk5Dtl_wg_nm_VC(info);
		if (vc == columnWrk5Dtl_loc_grp_cd) return doWrk5Dtl_loc_grp_cd_VC(info);
		if (vc == columnWrk5Dtl_loc_grp_nm) return doWrk5Dtl_loc_grp_nm_VC(info);
		if (vc == columnWrk5Dtl_alloc_grp_cd) return doWrk5Dtl_alloc_grp_cd_VC(info);
		if (vc == columnWrk5Dtl_alloc_grp_nm) return doWrk5Dtl_alloc_grp_nm_VC(info);
		if (vc == columnWrk5Dtl_gi_schd_flg) return doWrk5Dtl_gi_schd_flg_VC(info);
		if (vc == columnWrk5Dtl_lot_sizing_flg) return doWrk5Dtl_lot_sizing_flg_VC(info);
		if (vc == columnWrk5Dtl_gi_loc_cd) return doWrk5Dtl_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_gi_loc_nm) return doWrk5Dtl_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_gi_str_ln_tgt_flg) return doWrk5Dtl_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_loc_cd) return doWrk5Dtl_inpt_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_loc_nm) return doWrk5Dtl_inpt_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) return doWrk5Dtl_inpt_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_loc_cd) return doWrk5Dtl_ship_gi_loc_cd_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_loc_nm) return doWrk5Dtl_ship_gi_loc_nm_VC(info);
		if (vc == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) return doWrk5Dtl_ship_gi_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk5Dtl_memo1) return doWrk5Dtl_memo1_VC(info);
		if (vc == columnWrk5Dtl_memo2) return doWrk5Dtl_memo2_VC(info);
		if (vc == columnWrk5Dtl_memo3) return doWrk5Dtl_memo3_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_id) return doWrk5Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk5Dtl_ins_usr_nm) return doWrk5Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_ins_ts) return doWrk5Dtl_ins_ts_VC(info);
		if (vc == columnWrk5Dtl_ins_func_id) return doWrk5Dtl_ins_func_id_VC(info);
		if (vc == columnWrk5Dtl_ins_func_nm) return doWrk5Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_cntr) return doWrk5Dtl_upd_cntr_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_id) return doWrk5Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk5Dtl_upd_usr_nm) return doWrk5Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_ts) return doWrk5Dtl_upd_ts_VC(info);
		if (vc == columnWrk5Dtl_upd_func_id) return doWrk5Dtl_upd_func_id_VC(info);
		if (vc == columnWrk5Dtl_upd_func_nm) return doWrk5Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk5Dtl_upd_srv_req_no) return doWrk5Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk5Dtl_del_usr_id) return doWrk5Dtl_del_usr_id_VC(info);
		if (vc == columnWrk5Dtl_del_usr_nm) return doWrk5Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk5Dtl_del_ts) return doWrk5Dtl_del_ts_VC(info);
		if (vc == Wrk6SetDtHdr_st_dt) return doWrk6SetDtHdr_st_dt_VC(info);
		if (vc == Wrk6SetDtHdr_end_dt) return doWrk6SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk6Dtl_check) return doWrk6Dtl_check_VC(info);
		if (vc == columnWrk6Dtl_del_flg) return doWrk6Dtl_del_flg_VC(info);
		if (vc == columnWrk6Dtl_sppl_cd) return doWrk6Dtl_sppl_cd_VC(info);
		if (vc == columnWrk6Dtl_sppl_nm) return doWrk6Dtl_sppl_nm_VC(info);
		if (vc == columnWrk6Dtl_lg_grp_cd) return doWrk6Dtl_lg_grp_cd_VC(info);
		if (vc == columnWrk6Dtl_lg_grp_nm) return doWrk6Dtl_lg_grp_nm_VC(info);
		if (vc == columnWrk6Dtl_purc_lt) return doWrk6Dtl_purc_lt_VC(info);
		if (vc == columnWrk6Dtl_memo1) return doWrk6Dtl_memo1_VC(info);
		if (vc == columnWrk6Dtl_memo2) return doWrk6Dtl_memo2_VC(info);
		if (vc == columnWrk6Dtl_memo3) return doWrk6Dtl_memo3_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_id) return doWrk6Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk6Dtl_ins_usr_nm) return doWrk6Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_ins_ts) return doWrk6Dtl_ins_ts_VC(info);
		if (vc == columnWrk6Dtl_ins_func_id) return doWrk6Dtl_ins_func_id_VC(info);
		if (vc == columnWrk6Dtl_ins_func_nm) return doWrk6Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_cntr) return doWrk6Dtl_upd_cntr_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_id) return doWrk6Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk6Dtl_upd_usr_nm) return doWrk6Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_ts) return doWrk6Dtl_upd_ts_VC(info);
		if (vc == columnWrk6Dtl_upd_func_id) return doWrk6Dtl_upd_func_id_VC(info);
		if (vc == columnWrk6Dtl_upd_func_nm) return doWrk6Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk6Dtl_upd_srv_req_no) return doWrk6Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk6Dtl_del_usr_id) return doWrk6Dtl_del_usr_id_VC(info);
		if (vc == columnWrk6Dtl_del_usr_nm) return doWrk6Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk6Dtl_del_ts) return doWrk6Dtl_del_ts_VC(info);
		if (vc == Wrk7SetDtHdr_st_dt) return doWrk7SetDtHdr_st_dt_VC(info);
		if (vc == Wrk7SetDtHdr_end_dt) return doWrk7SetDtHdr_end_dt_VC(info);
		if (vc == columnWrk7Dtl_check) return doWrk7Dtl_check_VC(info);
		if (vc == columnWrk7Dtl_del_flg) return doWrk7Dtl_del_flg_VC(info);
		if (vc == columnWrk7Dtl_bp_cd) return doWrk7Dtl_bp_cd_VC(info);
		if (vc == columnWrk7Dtl_bp_nm) return doWrk7Dtl_bp_nm_VC(info);
		if (vc == columnWrk7Dtl_sppl_flg) return doWrk7Dtl_sppl_flg_VC(info);
		if (vc == columnWrk7Dtl_cst_flg) return doWrk7Dtl_cst_flg_VC(info);
		if (vc == columnWrk7Dtl_bp_itm_cd) return doWrk7Dtl_bp_itm_cd_VC(info);
		if (vc == columnWrk7Dtl_bp_itm_nm) return doWrk7Dtl_bp_itm_nm_VC(info);
		if (vc == columnWrk7Dtl_def_flg) return doWrk7Dtl_def_flg_VC(info);
		if (vc == columnWrk7Dtl_pf_grp_cd) return doWrk7Dtl_pf_grp_cd_VC(info);
		if (vc == columnWrk7Dtl_pf_grp_nm) return doWrk7Dtl_pf_grp_nm_VC(info);
		if (vc == columnWrk7Dtl_pf_fix_flg) return doWrk7Dtl_pf_fix_flg_VC(info);
		if (vc == columnWrk7Dtl_purc_commit_flg) return doWrk7Dtl_purc_commit_flg_VC(info);
		if (vc == columnWrk7Dtl_memo1) return doWrk7Dtl_memo1_VC(info);
		if (vc == columnWrk7Dtl_memo2) return doWrk7Dtl_memo2_VC(info);
		if (vc == columnWrk7Dtl_memo3) return doWrk7Dtl_memo3_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_id) return doWrk7Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk7Dtl_ins_usr_nm) return doWrk7Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_ins_ts) return doWrk7Dtl_ins_ts_VC(info);
		if (vc == columnWrk7Dtl_ins_func_id) return doWrk7Dtl_ins_func_id_VC(info);
		if (vc == columnWrk7Dtl_ins_func_nm) return doWrk7Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_cntr) return doWrk7Dtl_upd_cntr_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_id) return doWrk7Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk7Dtl_upd_usr_nm) return doWrk7Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_ts) return doWrk7Dtl_upd_ts_VC(info);
		if (vc == columnWrk7Dtl_upd_func_id) return doWrk7Dtl_upd_func_id_VC(info);
		if (vc == columnWrk7Dtl_upd_func_nm) return doWrk7Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk7Dtl_upd_srv_req_no) return doWrk7Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk7Dtl_del_usr_id) return doWrk7Dtl_del_usr_id_VC(info);
		if (vc == columnWrk7Dtl_del_usr_nm) return doWrk7Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk7Dtl_del_ts) return doWrk7Dtl_del_ts_VC(info);
		if (vc == columnWrk8Dtl_check) return doWrk8Dtl_check_VC(info);
		if (vc == columnWrk8Dtl_del_flg) return doWrk8Dtl_del_flg_VC(info);
		if (vc == columnWrk8Dtl_loc_cd) return doWrk8Dtl_loc_cd_VC(info);
		if (vc == columnWrk8Dtl_loc_nm) return doWrk8Dtl_loc_nm_VC(info);
		if (vc == columnWrk8Dtl_str_ln_tgt_flg) return doWrk8Dtl_str_ln_tgt_flg_VC(info);
		if (vc == columnWrk8Dtl_wg_cd) return doWrk8Dtl_wg_cd_VC(info);
		if (vc == columnWrk8Dtl_wg_nm) return doWrk8Dtl_wg_nm_VC(info);
		if (vc == columnWrk8Dtl_loc_grp_cd) return doWrk8Dtl_loc_grp_cd_VC(info);
		if (vc == columnWrk8Dtl_loc_grp_nm) return doWrk8Dtl_loc_grp_nm_VC(info);
		if (vc == columnWrk8Dtl_memo1) return doWrk8Dtl_memo1_VC(info);
		if (vc == columnWrk8Dtl_memo2) return doWrk8Dtl_memo2_VC(info);
		if (vc == columnWrk8Dtl_memo3) return doWrk8Dtl_memo3_VC(info);
		if (vc == columnWrk8Dtl_ins_usr_id) return doWrk8Dtl_ins_usr_id_VC(info);
		if (vc == columnWrk8Dtl_ins_usr_nm) return doWrk8Dtl_ins_usr_nm_VC(info);
		if (vc == columnWrk8Dtl_ins_ts) return doWrk8Dtl_ins_ts_VC(info);
		if (vc == columnWrk8Dtl_ins_func_id) return doWrk8Dtl_ins_func_id_VC(info);
		if (vc == columnWrk8Dtl_ins_func_nm) return doWrk8Dtl_ins_func_nm_VC(info);
		if (vc == columnWrk8Dtl_upd_cntr) return doWrk8Dtl_upd_cntr_VC(info);
		if (vc == columnWrk8Dtl_upd_usr_id) return doWrk8Dtl_upd_usr_id_VC(info);
		if (vc == columnWrk8Dtl_upd_usr_nm) return doWrk8Dtl_upd_usr_nm_VC(info);
		if (vc == columnWrk8Dtl_upd_ts) return doWrk8Dtl_upd_ts_VC(info);
		if (vc == columnWrk8Dtl_upd_func_id) return doWrk8Dtl_upd_func_id_VC(info);
		if (vc == columnWrk8Dtl_upd_func_nm) return doWrk8Dtl_upd_func_nm_VC(info);
		if (vc == columnWrk8Dtl_upd_srv_req_no) return doWrk8Dtl_upd_srv_req_no_VC(info);
		if (vc == columnWrk8Dtl_del_usr_id) return doWrk8Dtl_del_usr_id_VC(info);
		if (vc == columnWrk8Dtl_del_usr_nm) return doWrk8Dtl_del_usr_nm_VC(info);
		if (vc == columnWrk8Dtl_del_ts) return doWrk8Dtl_del_ts_VC(info);
		return true;
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doDtlTab_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]Tableの選択行が変更される際のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[unit_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_unit_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_stk_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_stk_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asset_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_asset_mng_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[dec_place]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_dec_place_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sundry_itm_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sundry_itm_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno1_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno2_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno3_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_sno4_mng_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Hdr]パネルの[purc_input_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_purc_input_flg_VC(MCEventInfo info){
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
	 * [Hdr]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doHdr_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_maker_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_maker_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_id_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_id_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_basis_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_purc_basis_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_accpt_insp_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_buf_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ord_fix_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_sz_week_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_lot_sz_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_max_order_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_order_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_pre_po_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_rqst_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_po_batch_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_not_mrp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_cost_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk1Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_rqst_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_rqst_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[buf_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_buf_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ord_fix_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ord_fix_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sz_day_week_typ_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sz_day_week_typ_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_week]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_sz_week_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_sz_pd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_lot_sz_pd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[max_order]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_max_order_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[order_ratio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_order_ratio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_po_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_pre_po_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[not_mrp_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_not_mrp_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk2Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk3Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_to_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_to_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_to_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_to_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[to_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_to_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_fr_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_fr_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_fr_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_fr_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_prio_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[in_loc_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_in_loc_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk4Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_alloc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_alloc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_schd_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_lot_sizing_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_inpt_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ship_gi_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk5Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_sppl_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_sppl_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_lg_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_lg_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[purc_lt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_purc_lt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk6Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[st_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7SetDtHdr_st_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[end_dt]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7SetDtHdr_end_dt_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_bp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_bp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_sppl_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[cst_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_cst_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_bp_itm_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_bp_itm_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[def_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_def_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_pf_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_pf_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_fix_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_pf_fix_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[purc_commit_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_purc_commit_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk7Dtl_del_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[check]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_check_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[del_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_del_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_loc_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_loc_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[str_ln_tgt_flg]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_str_ln_tgt_flg_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_wg_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_wg_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_cd]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_loc_grp_cd_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_loc_grp_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[memo1]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_memo1_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[memo2]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_memo2_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[memo3]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_memo3_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_ins_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_ins_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_ins_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_ins_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_ins_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_cntr]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_cntr_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_ts_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_func_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_func_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_srv_req_no]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_upd_srv_req_no_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_id]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_del_usr_id_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_nm]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_del_usr_nm_VC(MCEventInfo info){
		return true;
	}

	/**
	 * [Wrk8Dtl]パネルの[del_ts]のValidationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 * @return ValidationChangeイベントの結果
	 */
	public boolean doWrk8Dtl_del_ts_VC(MCEventInfo info){
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
		if (nc == DtlTabTab) doDtlTab_NC(info);
		else if (nc == Wrk1DtlTable) doWrk1Dtl_NC(info);
		else if (nc == Wrk2DtlTable) doWrk2Dtl_NC(info);
		else if (nc == Wrk3DtlTable) doWrk3Dtl_NC(info);
		else if (nc == Wrk4DtlTable) doWrk4Dtl_NC(info);
		else if (nc == Wrk5DtlTable) doWrk5Dtl_NC(info);
		else if (nc == Wrk6DtlTable) doWrk6Dtl_NC(info);
		else if (nc == Wrk7DtlTable) doWrk7Dtl_NC(info);
		else if (nc == Wrk8DtlTable) doWrk8Dtl_NC(info);
		else if (nc == Cnd_ope_Group) doCnd_ope_NC(info);
		else if (nc == Cnd_off_del_flg) doCnd_off_del_flg_NC(info);
		else if (nc == Cnd_on_del_flg) doCnd_on_del_flg_NC(info);
		else if (nc == Hdr_unit_cd) doHdr_unit_cd_NC(info);
		else if (nc == Hdr_unit_nm) doHdr_unit_nm_NC(info);
		else if (nc == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NC(info);
		else if (nc == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NC(info);
		else if (nc == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NC(info);
		else if (nc == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NC(info);
		else if (nc == Hdr_dec_place) doHdr_dec_place_NC(info);
		else if (nc == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NC(info);
		else if (nc == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NC(info);
		else if (nc == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NC(info);
		else if (nc == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NC(info);
		else if (nc == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NC(info);
		else if (nc == Hdr_purc_flg) doHdr_purc_flg_NC(info);
		else if (nc == Hdr_purc_input_flg) doHdr_purc_input_flg_NC(info);
		else if (nc == Hdr_upd_cntr) doHdr_upd_cntr_NC(info);
		else if (nc == Hdr_check) doHdr_check_NC(info);
		else if (nc == Wrk1SetDtHdr_st_dt) doWrk1SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk1SetDtHdr_end_dt) doWrk1SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk1Dtl_check) doWrk1Dtl_check_NC(info);
		else if (nc == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NC(info);
		else if (nc == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NC(info);
		else if (nc == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NC(info);
		else if (nc == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NC(info);
		else if (nc == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NC(info);
		else if (nc == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NC(info);
		else if (nc == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NC(info);
		else if (nc == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NC(info);
		else if (nc == columnWrk1Dtl_purc_basis_typ) doWrk1Dtl_purc_basis_typ_NC(info);
		else if (nc == columnWrk1Dtl_purc_basis_typ_nm) doWrk1Dtl_purc_basis_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NC(info);
		else if (nc == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NC(info);
		else if (nc == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NC(info);
		else if (nc == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NC(info);
		else if (nc == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NC(info);
		else if (nc == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NC(info);
		else if (nc == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NC(info);
		else if (nc == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NC(info);
		else if (nc == columnWrk1Dtl_prio) doWrk1Dtl_prio_NC(info);
		else if (nc == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NC(info);
		else if (nc == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NC(info);
		else if (nc == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NC(info);
		else if (nc == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NC(info);
		else if (nc == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NC(info);
		else if (nc == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NC(info);
		else if (nc == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NC(info);
		else if (nc == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NC(info);
		else if (nc == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NC(info);
		else if (nc == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NC(info);
		else if (nc == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NC(info);
		else if (nc == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NC(info);
		else if (nc == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NC(info);
		else if (nc == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk2Dtl_check) doWrk2Dtl_check_NC(info);
		else if (nc == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NC(info);
		else if (nc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NC(info);
		else if (nc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NC(info);
		else if (nc == columnWrk2Dtl_rqst_loc_cd) doWrk2Dtl_rqst_loc_cd_NC(info);
		else if (nc == columnWrk2Dtl_rqst_loc_nm) doWrk2Dtl_rqst_loc_nm_NC(info);
		else if (nc == columnWrk2Dtl_buf_lt) doWrk2Dtl_buf_lt_NC(info);
		else if (nc == columnWrk2Dtl_ord_fix_pd) doWrk2Dtl_ord_fix_pd_NC(info);
		else if (nc == columnWrk2Dtl_sz_day_week_typ) doWrk2Dtl_sz_day_week_typ_NC(info);
		else if (nc == columnWrk2Dtl_sz_day_week_typ_nm) doWrk2Dtl_sz_day_week_typ_nm_NC(info);
		else if (nc == columnWrk2Dtl_sz_week) doWrk2Dtl_sz_week_NC(info);
		else if (nc == columnWrk2Dtl_lot_sz_pd) doWrk2Dtl_lot_sz_pd_NC(info);
		else if (nc == columnWrk2Dtl_max_order) doWrk2Dtl_max_order_NC(info);
		else if (nc == columnWrk2Dtl_prio) doWrk2Dtl_prio_NC(info);
		else if (nc == columnWrk2Dtl_order_ratio) doWrk2Dtl_order_ratio_NC(info);
		else if (nc == columnWrk2Dtl_pre_po_tgt_flg) doWrk2Dtl_pre_po_tgt_flg_NC(info);
		else if (nc == columnWrk2Dtl_not_mrp_flg) doWrk2Dtl_not_mrp_flg_NC(info);
		else if (nc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NC(info);
		else if (nc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NC(info);
		else if (nc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NC(info);
		else if (nc == columnWrk3Dtl_check) doWrk3Dtl_check_NC(info);
		else if (nc == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NC(info);
		else if (nc == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NC(info);
		else if (nc == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NC(info);
		else if (nc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NC(info);
		else if (nc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NC(info);
		else if (nc == columnWrk3Dtl_loc_grp_cd) doWrk3Dtl_loc_grp_cd_NC(info);
		else if (nc == columnWrk3Dtl_loc_grp_nm) doWrk3Dtl_loc_grp_nm_NC(info);
		else if (nc == columnWrk3Dtl_prio) doWrk3Dtl_prio_NC(info);
		else if (nc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NC(info);
		else if (nc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NC(info);
		else if (nc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NC(info);
		else if (nc == columnWrk4Dtl_check) doWrk4Dtl_check_NC(info);
		else if (nc == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NC(info);
		else if (nc == columnWrk4Dtl_to_loc_cd) doWrk4Dtl_to_loc_cd_NC(info);
		else if (nc == columnWrk4Dtl_to_loc_nm) doWrk4Dtl_to_loc_nm_NC(info);
		else if (nc == columnWrk4Dtl_to_wg_cd) doWrk4Dtl_to_wg_cd_NC(info);
		else if (nc == columnWrk4Dtl_to_wg_nm) doWrk4Dtl_to_wg_nm_NC(info);
		else if (nc == columnWrk4Dtl_to_lg_grp_cd) doWrk4Dtl_to_lg_grp_cd_NC(info);
		else if (nc == columnWrk4Dtl_fr_loc_cd) doWrk4Dtl_fr_loc_cd_NC(info);
		else if (nc == columnWrk4Dtl_fr_loc_nm) doWrk4Dtl_fr_loc_nm_NC(info);
		else if (nc == columnWrk4Dtl_fr_wg_cd) doWrk4Dtl_fr_wg_cd_NC(info);
		else if (nc == columnWrk4Dtl_fr_lg_grp_cd) doWrk4Dtl_fr_lg_grp_cd_NC(info);
		else if (nc == columnWrk4Dtl_prio) doWrk4Dtl_prio_NC(info);
		else if (nc == columnWrk4Dtl_in_loc_flg) doWrk4Dtl_in_loc_flg_NC(info);
		else if (nc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NC(info);
		else if (nc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NC(info);
		else if (nc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NC(info);
		else if (nc == Wrk5SetDtHdr_st_dt) doWrk5SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk5SetDtHdr_end_dt) doWrk5SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk5Dtl_check) doWrk5Dtl_check_NC(info);
		else if (nc == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NC(info);
		else if (nc == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NC(info);
		else if (nc == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NC(info);
		else if (nc == columnWrk5Dtl_loc_grp_cd) doWrk5Dtl_loc_grp_cd_NC(info);
		else if (nc == columnWrk5Dtl_loc_grp_nm) doWrk5Dtl_loc_grp_nm_NC(info);
		else if (nc == columnWrk5Dtl_alloc_grp_cd) doWrk5Dtl_alloc_grp_cd_NC(info);
		else if (nc == columnWrk5Dtl_alloc_grp_nm) doWrk5Dtl_alloc_grp_nm_NC(info);
		else if (nc == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NC(info);
		else if (nc == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NC(info);
		else if (nc == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NC(info);
		else if (nc == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NC(info);
		else if (nc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NC(info);
		else if (nc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NC(info);
		else if (nc == Wrk6SetDtHdr_st_dt) doWrk6SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk6SetDtHdr_end_dt) doWrk6SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk6Dtl_check) doWrk6Dtl_check_NC(info);
		else if (nc == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NC(info);
		else if (nc == columnWrk6Dtl_sppl_cd) doWrk6Dtl_sppl_cd_NC(info);
		else if (nc == columnWrk6Dtl_sppl_nm) doWrk6Dtl_sppl_nm_NC(info);
		else if (nc == columnWrk6Dtl_lg_grp_cd) doWrk6Dtl_lg_grp_cd_NC(info);
		else if (nc == columnWrk6Dtl_lg_grp_nm) doWrk6Dtl_lg_grp_nm_NC(info);
		else if (nc == columnWrk6Dtl_purc_lt) doWrk6Dtl_purc_lt_NC(info);
		else if (nc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NC(info);
		else if (nc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NC(info);
		else if (nc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NC(info);
		else if (nc == Wrk7SetDtHdr_st_dt) doWrk7SetDtHdr_st_dt_NC(info);
		else if (nc == Wrk7SetDtHdr_end_dt) doWrk7SetDtHdr_end_dt_NC(info);
		else if (nc == columnWrk7Dtl_check) doWrk7Dtl_check_NC(info);
		else if (nc == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NC(info);
		else if (nc == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NC(info);
		else if (nc == columnWrk7Dtl_bp_nm) doWrk7Dtl_bp_nm_NC(info);
		else if (nc == columnWrk7Dtl_sppl_flg) doWrk7Dtl_sppl_flg_NC(info);
		else if (nc == columnWrk7Dtl_cst_flg) doWrk7Dtl_cst_flg_NC(info);
		else if (nc == columnWrk7Dtl_bp_itm_cd) doWrk7Dtl_bp_itm_cd_NC(info);
		else if (nc == columnWrk7Dtl_bp_itm_nm) doWrk7Dtl_bp_itm_nm_NC(info);
		else if (nc == columnWrk7Dtl_def_flg) doWrk7Dtl_def_flg_NC(info);
		else if (nc == columnWrk7Dtl_pf_grp_cd) doWrk7Dtl_pf_grp_cd_NC(info);
		else if (nc == columnWrk7Dtl_pf_grp_nm) doWrk7Dtl_pf_grp_nm_NC(info);
		else if (nc == columnWrk7Dtl_pf_fix_flg) doWrk7Dtl_pf_fix_flg_NC(info);
		else if (nc == columnWrk7Dtl_purc_commit_flg) doWrk7Dtl_purc_commit_flg_NC(info);
		else if (nc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NC(info);
		else if (nc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NC(info);
		else if (nc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NC(info);
		else if (nc == columnWrk8Dtl_check) doWrk8Dtl_check_NC(info);
		else if (nc == columnWrk8Dtl_del_flg) doWrk8Dtl_del_flg_NC(info);
		else if (nc == columnWrk8Dtl_loc_cd) doWrk8Dtl_loc_cd_NC(info);
		else if (nc == columnWrk8Dtl_loc_nm) doWrk8Dtl_loc_nm_NC(info);
		else if (nc == columnWrk8Dtl_str_ln_tgt_flg) doWrk8Dtl_str_ln_tgt_flg_NC(info);
		else if (nc == columnWrk8Dtl_wg_cd) doWrk8Dtl_wg_cd_NC(info);
		else if (nc == columnWrk8Dtl_wg_nm) doWrk8Dtl_wg_nm_NC(info);
		else if (nc == columnWrk8Dtl_loc_grp_cd) doWrk8Dtl_loc_grp_cd_NC(info);
		else if (nc == columnWrk8Dtl_loc_grp_nm) doWrk8Dtl_loc_grp_nm_NC(info);
		else if (nc == columnWrk8Dtl_memo1) doWrk8Dtl_memo1_NC(info);
		else if (nc == columnWrk8Dtl_memo2) doWrk8Dtl_memo2_NC(info);
		else if (nc == columnWrk8Dtl_memo3) doWrk8Dtl_memo3_NC(info);
		else if (nc == columnWrk8Dtl_ins_usr_id) doWrk8Dtl_ins_usr_id_NC(info);
		else if (nc == columnWrk8Dtl_ins_usr_nm) doWrk8Dtl_ins_usr_nm_NC(info);
		else if (nc == columnWrk8Dtl_ins_ts) doWrk8Dtl_ins_ts_NC(info);
		else if (nc == columnWrk8Dtl_ins_func_id) doWrk8Dtl_ins_func_id_NC(info);
		else if (nc == columnWrk8Dtl_ins_func_nm) doWrk8Dtl_ins_func_nm_NC(info);
		else if (nc == columnWrk8Dtl_upd_cntr) doWrk8Dtl_upd_cntr_NC(info);
		else if (nc == columnWrk8Dtl_upd_usr_id) doWrk8Dtl_upd_usr_id_NC(info);
		else if (nc == columnWrk8Dtl_upd_usr_nm) doWrk8Dtl_upd_usr_nm_NC(info);
		else if (nc == columnWrk8Dtl_upd_ts) doWrk8Dtl_upd_ts_NC(info);
		else if (nc == columnWrk8Dtl_upd_func_id) doWrk8Dtl_upd_func_id_NC(info);
		else if (nc == columnWrk8Dtl_upd_func_nm) doWrk8Dtl_upd_func_nm_NC(info);
		else if (nc == columnWrk8Dtl_upd_srv_req_no) doWrk8Dtl_upd_srv_req_no_NC(info);
		else if (nc == columnWrk8Dtl_del_usr_id) doWrk8Dtl_del_usr_id_NC(info);
		else if (nc == columnWrk8Dtl_del_usr_nm) doWrk8Dtl_del_usr_nm_NC(info);
		else if (nc == columnWrk8Dtl_del_ts) doWrk8Dtl_del_ts_NC(info);
	}

	/**
	 * [DtlTab]Tabの選択Tabが変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]Tableの選択行が変更された際のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_NC(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NC(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_input_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_input_flg_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[buf_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_buf_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ord_fix_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ord_fix_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_week]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_week_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_sz_pd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_sz_pd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[max_order]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_max_order_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[order_ratio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_order_ratio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_po_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_po_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_mrp_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_mrp_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[in_loc_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_in_loc_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[purc_lt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_purc_lt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[st_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_st_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[end_dt]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_end_dt_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[cst_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_cst_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[def_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_def_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_fix_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_fix_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[purc_commit_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_purc_commit_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[check]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_check_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[str_ln_tgt_flg]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_str_ln_tgt_flg_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_cd]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_cd_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo1]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo1_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo2]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo2_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo3]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo3_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_cntr]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_cntr_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_ts_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_srv_req_no]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_srv_req_no_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_id]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_id_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_nm]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_nm_NC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_ts]のNotificationChangeイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_ts_NC(MCEventInfo info){
	}

	/**
	 * NotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param ne イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNEEvent(MCNEBeans ne, MCEventInfo info) {
		super.doNEEvent(ne, info);
		if (ne == DtlTabTab) doDtlTab_NE(info);
		else if (ne == Wrk1DtlTable) doWrk1Dtl_NE(info);
		else if (ne == Wrk2DtlTable) doWrk2Dtl_NE(info);
		else if (ne == Wrk3DtlTable) doWrk3Dtl_NE(info);
		else if (ne == Wrk4DtlTable) doWrk4Dtl_NE(info);
		else if (ne == Wrk5DtlTable) doWrk5Dtl_NE(info);
		else if (ne == Wrk6DtlTable) doWrk6Dtl_NE(info);
		else if (ne == Wrk7DtlTable) doWrk7Dtl_NE(info);
		else if (ne == Wrk8DtlTable) doWrk8Dtl_NE(info);
		else if (ne == Cnd_ope_Group) doCnd_ope_NE(info);
		else if (ne == Cnd_off_del_flg) doCnd_off_del_flg_NE(info);
		else if (ne == Cnd_on_del_flg) doCnd_on_del_flg_NE(info);
		else if (ne == Hdr_unit_cd) doHdr_unit_cd_NE(info);
		else if (ne == Hdr_unit_nm) doHdr_unit_nm_NE(info);
		else if (ne == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NE(info);
		else if (ne == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NE(info);
		else if (ne == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NE(info);
		else if (ne == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NE(info);
		else if (ne == Hdr_dec_place) doHdr_dec_place_NE(info);
		else if (ne == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NE(info);
		else if (ne == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NE(info);
		else if (ne == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NE(info);
		else if (ne == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NE(info);
		else if (ne == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NE(info);
		else if (ne == Hdr_purc_flg) doHdr_purc_flg_NE(info);
		else if (ne == Hdr_purc_input_flg) doHdr_purc_input_flg_NE(info);
		else if (ne == Hdr_upd_cntr) doHdr_upd_cntr_NE(info);
		else if (ne == Hdr_check) doHdr_check_NE(info);
		else if (ne == Wrk1SetDtHdr_st_dt) doWrk1SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk1SetDtHdr_end_dt) doWrk1SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk1Dtl_check) doWrk1Dtl_check_NE(info);
		else if (ne == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NE(info);
		else if (ne == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NE(info);
		else if (ne == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NE(info);
		else if (ne == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NE(info);
		else if (ne == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NE(info);
		else if (ne == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NE(info);
		else if (ne == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NE(info);
		else if (ne == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NE(info);
		else if (ne == columnWrk1Dtl_purc_basis_typ) doWrk1Dtl_purc_basis_typ_NE(info);
		else if (ne == columnWrk1Dtl_purc_basis_typ_nm) doWrk1Dtl_purc_basis_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NE(info);
		else if (ne == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NE(info);
		else if (ne == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NE(info);
		else if (ne == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NE(info);
		else if (ne == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NE(info);
		else if (ne == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NE(info);
		else if (ne == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NE(info);
		else if (ne == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NE(info);
		else if (ne == columnWrk1Dtl_prio) doWrk1Dtl_prio_NE(info);
		else if (ne == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NE(info);
		else if (ne == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NE(info);
		else if (ne == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NE(info);
		else if (ne == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NE(info);
		else if (ne == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NE(info);
		else if (ne == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NE(info);
		else if (ne == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NE(info);
		else if (ne == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NE(info);
		else if (ne == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NE(info);
		else if (ne == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NE(info);
		else if (ne == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NE(info);
		else if (ne == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NE(info);
		else if (ne == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NE(info);
		else if (ne == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk2Dtl_check) doWrk2Dtl_check_NE(info);
		else if (ne == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NE(info);
		else if (ne == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NE(info);
		else if (ne == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NE(info);
		else if (ne == columnWrk2Dtl_rqst_loc_cd) doWrk2Dtl_rqst_loc_cd_NE(info);
		else if (ne == columnWrk2Dtl_rqst_loc_nm) doWrk2Dtl_rqst_loc_nm_NE(info);
		else if (ne == columnWrk2Dtl_buf_lt) doWrk2Dtl_buf_lt_NE(info);
		else if (ne == columnWrk2Dtl_ord_fix_pd) doWrk2Dtl_ord_fix_pd_NE(info);
		else if (ne == columnWrk2Dtl_sz_day_week_typ) doWrk2Dtl_sz_day_week_typ_NE(info);
		else if (ne == columnWrk2Dtl_sz_day_week_typ_nm) doWrk2Dtl_sz_day_week_typ_nm_NE(info);
		else if (ne == columnWrk2Dtl_sz_week) doWrk2Dtl_sz_week_NE(info);
		else if (ne == columnWrk2Dtl_lot_sz_pd) doWrk2Dtl_lot_sz_pd_NE(info);
		else if (ne == columnWrk2Dtl_max_order) doWrk2Dtl_max_order_NE(info);
		else if (ne == columnWrk2Dtl_prio) doWrk2Dtl_prio_NE(info);
		else if (ne == columnWrk2Dtl_order_ratio) doWrk2Dtl_order_ratio_NE(info);
		else if (ne == columnWrk2Dtl_pre_po_tgt_flg) doWrk2Dtl_pre_po_tgt_flg_NE(info);
		else if (ne == columnWrk2Dtl_not_mrp_flg) doWrk2Dtl_not_mrp_flg_NE(info);
		else if (ne == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NE(info);
		else if (ne == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NE(info);
		else if (ne == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NE(info);
		else if (ne == columnWrk3Dtl_check) doWrk3Dtl_check_NE(info);
		else if (ne == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NE(info);
		else if (ne == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NE(info);
		else if (ne == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NE(info);
		else if (ne == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NE(info);
		else if (ne == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NE(info);
		else if (ne == columnWrk3Dtl_loc_grp_cd) doWrk3Dtl_loc_grp_cd_NE(info);
		else if (ne == columnWrk3Dtl_loc_grp_nm) doWrk3Dtl_loc_grp_nm_NE(info);
		else if (ne == columnWrk3Dtl_prio) doWrk3Dtl_prio_NE(info);
		else if (ne == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NE(info);
		else if (ne == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NE(info);
		else if (ne == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NE(info);
		else if (ne == columnWrk4Dtl_check) doWrk4Dtl_check_NE(info);
		else if (ne == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NE(info);
		else if (ne == columnWrk4Dtl_to_loc_cd) doWrk4Dtl_to_loc_cd_NE(info);
		else if (ne == columnWrk4Dtl_to_loc_nm) doWrk4Dtl_to_loc_nm_NE(info);
		else if (ne == columnWrk4Dtl_to_wg_cd) doWrk4Dtl_to_wg_cd_NE(info);
		else if (ne == columnWrk4Dtl_to_wg_nm) doWrk4Dtl_to_wg_nm_NE(info);
		else if (ne == columnWrk4Dtl_to_lg_grp_cd) doWrk4Dtl_to_lg_grp_cd_NE(info);
		else if (ne == columnWrk4Dtl_fr_loc_cd) doWrk4Dtl_fr_loc_cd_NE(info);
		else if (ne == columnWrk4Dtl_fr_loc_nm) doWrk4Dtl_fr_loc_nm_NE(info);
		else if (ne == columnWrk4Dtl_fr_wg_cd) doWrk4Dtl_fr_wg_cd_NE(info);
		else if (ne == columnWrk4Dtl_fr_lg_grp_cd) doWrk4Dtl_fr_lg_grp_cd_NE(info);
		else if (ne == columnWrk4Dtl_prio) doWrk4Dtl_prio_NE(info);
		else if (ne == columnWrk4Dtl_in_loc_flg) doWrk4Dtl_in_loc_flg_NE(info);
		else if (ne == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NE(info);
		else if (ne == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NE(info);
		else if (ne == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NE(info);
		else if (ne == Wrk5SetDtHdr_st_dt) doWrk5SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk5SetDtHdr_end_dt) doWrk5SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk5Dtl_check) doWrk5Dtl_check_NE(info);
		else if (ne == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NE(info);
		else if (ne == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NE(info);
		else if (ne == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NE(info);
		else if (ne == columnWrk5Dtl_loc_grp_cd) doWrk5Dtl_loc_grp_cd_NE(info);
		else if (ne == columnWrk5Dtl_loc_grp_nm) doWrk5Dtl_loc_grp_nm_NE(info);
		else if (ne == columnWrk5Dtl_alloc_grp_cd) doWrk5Dtl_alloc_grp_cd_NE(info);
		else if (ne == columnWrk5Dtl_alloc_grp_nm) doWrk5Dtl_alloc_grp_nm_NE(info);
		else if (ne == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NE(info);
		else if (ne == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NE(info);
		else if (ne == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NE(info);
		else if (ne == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NE(info);
		else if (ne == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NE(info);
		else if (ne == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NE(info);
		else if (ne == Wrk6SetDtHdr_st_dt) doWrk6SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk6SetDtHdr_end_dt) doWrk6SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk6Dtl_check) doWrk6Dtl_check_NE(info);
		else if (ne == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NE(info);
		else if (ne == columnWrk6Dtl_sppl_cd) doWrk6Dtl_sppl_cd_NE(info);
		else if (ne == columnWrk6Dtl_sppl_nm) doWrk6Dtl_sppl_nm_NE(info);
		else if (ne == columnWrk6Dtl_lg_grp_cd) doWrk6Dtl_lg_grp_cd_NE(info);
		else if (ne == columnWrk6Dtl_lg_grp_nm) doWrk6Dtl_lg_grp_nm_NE(info);
		else if (ne == columnWrk6Dtl_purc_lt) doWrk6Dtl_purc_lt_NE(info);
		else if (ne == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NE(info);
		else if (ne == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NE(info);
		else if (ne == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NE(info);
		else if (ne == Wrk7SetDtHdr_st_dt) doWrk7SetDtHdr_st_dt_NE(info);
		else if (ne == Wrk7SetDtHdr_end_dt) doWrk7SetDtHdr_end_dt_NE(info);
		else if (ne == columnWrk7Dtl_check) doWrk7Dtl_check_NE(info);
		else if (ne == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NE(info);
		else if (ne == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NE(info);
		else if (ne == columnWrk7Dtl_bp_nm) doWrk7Dtl_bp_nm_NE(info);
		else if (ne == columnWrk7Dtl_sppl_flg) doWrk7Dtl_sppl_flg_NE(info);
		else if (ne == columnWrk7Dtl_cst_flg) doWrk7Dtl_cst_flg_NE(info);
		else if (ne == columnWrk7Dtl_bp_itm_cd) doWrk7Dtl_bp_itm_cd_NE(info);
		else if (ne == columnWrk7Dtl_bp_itm_nm) doWrk7Dtl_bp_itm_nm_NE(info);
		else if (ne == columnWrk7Dtl_def_flg) doWrk7Dtl_def_flg_NE(info);
		else if (ne == columnWrk7Dtl_pf_grp_cd) doWrk7Dtl_pf_grp_cd_NE(info);
		else if (ne == columnWrk7Dtl_pf_grp_nm) doWrk7Dtl_pf_grp_nm_NE(info);
		else if (ne == columnWrk7Dtl_pf_fix_flg) doWrk7Dtl_pf_fix_flg_NE(info);
		else if (ne == columnWrk7Dtl_purc_commit_flg) doWrk7Dtl_purc_commit_flg_NE(info);
		else if (ne == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NE(info);
		else if (ne == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NE(info);
		else if (ne == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NE(info);
		else if (ne == columnWrk8Dtl_check) doWrk8Dtl_check_NE(info);
		else if (ne == columnWrk8Dtl_del_flg) doWrk8Dtl_del_flg_NE(info);
		else if (ne == columnWrk8Dtl_loc_cd) doWrk8Dtl_loc_cd_NE(info);
		else if (ne == columnWrk8Dtl_loc_nm) doWrk8Dtl_loc_nm_NE(info);
		else if (ne == columnWrk8Dtl_str_ln_tgt_flg) doWrk8Dtl_str_ln_tgt_flg_NE(info);
		else if (ne == columnWrk8Dtl_wg_cd) doWrk8Dtl_wg_cd_NE(info);
		else if (ne == columnWrk8Dtl_wg_nm) doWrk8Dtl_wg_nm_NE(info);
		else if (ne == columnWrk8Dtl_loc_grp_cd) doWrk8Dtl_loc_grp_cd_NE(info);
		else if (ne == columnWrk8Dtl_loc_grp_nm) doWrk8Dtl_loc_grp_nm_NE(info);
		else if (ne == columnWrk8Dtl_memo1) doWrk8Dtl_memo1_NE(info);
		else if (ne == columnWrk8Dtl_memo2) doWrk8Dtl_memo2_NE(info);
		else if (ne == columnWrk8Dtl_memo3) doWrk8Dtl_memo3_NE(info);
		else if (ne == columnWrk8Dtl_ins_usr_id) doWrk8Dtl_ins_usr_id_NE(info);
		else if (ne == columnWrk8Dtl_ins_usr_nm) doWrk8Dtl_ins_usr_nm_NE(info);
		else if (ne == columnWrk8Dtl_ins_ts) doWrk8Dtl_ins_ts_NE(info);
		else if (ne == columnWrk8Dtl_ins_func_id) doWrk8Dtl_ins_func_id_NE(info);
		else if (ne == columnWrk8Dtl_ins_func_nm) doWrk8Dtl_ins_func_nm_NE(info);
		else if (ne == columnWrk8Dtl_upd_cntr) doWrk8Dtl_upd_cntr_NE(info);
		else if (ne == columnWrk8Dtl_upd_usr_id) doWrk8Dtl_upd_usr_id_NE(info);
		else if (ne == columnWrk8Dtl_upd_usr_nm) doWrk8Dtl_upd_usr_nm_NE(info);
		else if (ne == columnWrk8Dtl_upd_ts) doWrk8Dtl_upd_ts_NE(info);
		else if (ne == columnWrk8Dtl_upd_func_id) doWrk8Dtl_upd_func_id_NE(info);
		else if (ne == columnWrk8Dtl_upd_func_nm) doWrk8Dtl_upd_func_nm_NE(info);
		else if (ne == columnWrk8Dtl_upd_srv_req_no) doWrk8Dtl_upd_srv_req_no_NE(info);
		else if (ne == columnWrk8Dtl_del_usr_id) doWrk8Dtl_del_usr_id_NE(info);
		else if (ne == columnWrk8Dtl_del_usr_nm) doWrk8Dtl_del_usr_nm_NE(info);
		else if (ne == columnWrk8Dtl_del_ts) doWrk8Dtl_del_ts_NE(info);
	}

	/**
	 * [DtlTab]TabのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]TableのNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_NE(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NE(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_input_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_input_flg_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[buf_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_buf_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ord_fix_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ord_fix_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_week]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_week_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_sz_pd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_sz_pd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[max_order]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_max_order_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[order_ratio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_order_ratio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_po_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_po_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_mrp_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_mrp_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[in_loc_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_in_loc_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[purc_lt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_purc_lt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[st_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_st_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[end_dt]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_end_dt_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[cst_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_cst_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[def_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_def_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_fix_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_fix_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[purc_commit_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_purc_commit_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[check]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_check_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[str_ln_tgt_flg]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_str_ln_tgt_flg_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_cd]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_cd_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo1]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo1_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo2]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo2_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo3]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo3_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_cntr]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_cntr_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_ts_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_srv_req_no]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_srv_req_no_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_id]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_id_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_nm]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_nm_NE(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_ts]のNotificationEntryイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_ts_NE(MCEventInfo info){
	}

	/**
	 * NotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param nx イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doNXEvent(MCNXBeans nx, MCEventInfo info) {
		super.doNXEvent(nx, info);
		if (nx == DtlTabTab) doDtlTab_NX(info);
		else if (nx == Wrk1DtlTable) doWrk1Dtl_NX(info);
		else if (nx == Wrk2DtlTable) doWrk2Dtl_NX(info);
		else if (nx == Wrk3DtlTable) doWrk3Dtl_NX(info);
		else if (nx == Wrk4DtlTable) doWrk4Dtl_NX(info);
		else if (nx == Wrk5DtlTable) doWrk5Dtl_NX(info);
		else if (nx == Wrk6DtlTable) doWrk6Dtl_NX(info);
		else if (nx == Wrk7DtlTable) doWrk7Dtl_NX(info);
		else if (nx == Wrk8DtlTable) doWrk8Dtl_NX(info);
		else if (nx == Cnd_ope_Group) doCnd_ope_NX(info);
		else if (nx == Cnd_off_del_flg) doCnd_off_del_flg_NX(info);
		else if (nx == Cnd_on_del_flg) doCnd_on_del_flg_NX(info);
		else if (nx == Hdr_unit_cd) doHdr_unit_cd_NX(info);
		else if (nx == Hdr_unit_nm) doHdr_unit_nm_NX(info);
		else if (nx == Hdr_stk_mng_typ) doHdr_stk_mng_typ_NX(info);
		else if (nx == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_NX(info);
		else if (nx == Hdr_asset_mng_typ) doHdr_asset_mng_typ_NX(info);
		else if (nx == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_NX(info);
		else if (nx == Hdr_dec_place) doHdr_dec_place_NX(info);
		else if (nx == Hdr_sundry_itm_flg) doHdr_sundry_itm_flg_NX(info);
		else if (nx == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_NX(info);
		else if (nx == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_NX(info);
		else if (nx == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_NX(info);
		else if (nx == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_NX(info);
		else if (nx == Hdr_purc_flg) doHdr_purc_flg_NX(info);
		else if (nx == Hdr_purc_input_flg) doHdr_purc_input_flg_NX(info);
		else if (nx == Hdr_upd_cntr) doHdr_upd_cntr_NX(info);
		else if (nx == Hdr_check) doHdr_check_NX(info);
		else if (nx == Wrk1SetDtHdr_st_dt) doWrk1SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk1SetDtHdr_end_dt) doWrk1SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk1Dtl_check) doWrk1Dtl_check_NX(info);
		else if (nx == columnWrk1Dtl_del_flg) doWrk1Dtl_del_flg_NX(info);
		else if (nx == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_NX(info);
		else if (nx == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_NX(info);
		else if (nx == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_NX(info);
		else if (nx == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_NX(info);
		else if (nx == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_NX(info);
		else if (nx == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_NX(info);
		else if (nx == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_NX(info);
		else if (nx == columnWrk1Dtl_purc_basis_typ) doWrk1Dtl_purc_basis_typ_NX(info);
		else if (nx == columnWrk1Dtl_purc_basis_typ_nm) doWrk1Dtl_purc_basis_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_NX(info);
		else if (nx == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_NX(info);
		else if (nx == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_NX(info);
		else if (nx == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_NX(info);
		else if (nx == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_NX(info);
		else if (nx == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_NX(info);
		else if (nx == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_NX(info);
		else if (nx == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_NX(info);
		else if (nx == columnWrk1Dtl_prio) doWrk1Dtl_prio_NX(info);
		else if (nx == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_NX(info);
		else if (nx == columnWrk1Dtl_pre_po_tgt_flg) doWrk1Dtl_pre_po_tgt_flg_NX(info);
		else if (nx == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_NX(info);
		else if (nx == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_NX(info);
		else if (nx == columnWrk1Dtl_po_batch_flg) doWrk1Dtl_po_batch_flg_NX(info);
		else if (nx == columnWrk1Dtl_not_mrp_flg) doWrk1Dtl_not_mrp_flg_NX(info);
		else if (nx == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_NX(info);
		else if (nx == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_NX(info);
		else if (nx == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_NX(info);
		else if (nx == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_NX(info);
		else if (nx == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_NX(info);
		else if (nx == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_NX(info);
		else if (nx == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_NX(info);
		else if (nx == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk2Dtl_check) doWrk2Dtl_check_NX(info);
		else if (nx == columnWrk2Dtl_del_flg) doWrk2Dtl_del_flg_NX(info);
		else if (nx == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_NX(info);
		else if (nx == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_NX(info);
		else if (nx == columnWrk2Dtl_rqst_loc_cd) doWrk2Dtl_rqst_loc_cd_NX(info);
		else if (nx == columnWrk2Dtl_rqst_loc_nm) doWrk2Dtl_rqst_loc_nm_NX(info);
		else if (nx == columnWrk2Dtl_buf_lt) doWrk2Dtl_buf_lt_NX(info);
		else if (nx == columnWrk2Dtl_ord_fix_pd) doWrk2Dtl_ord_fix_pd_NX(info);
		else if (nx == columnWrk2Dtl_sz_day_week_typ) doWrk2Dtl_sz_day_week_typ_NX(info);
		else if (nx == columnWrk2Dtl_sz_day_week_typ_nm) doWrk2Dtl_sz_day_week_typ_nm_NX(info);
		else if (nx == columnWrk2Dtl_sz_week) doWrk2Dtl_sz_week_NX(info);
		else if (nx == columnWrk2Dtl_lot_sz_pd) doWrk2Dtl_lot_sz_pd_NX(info);
		else if (nx == columnWrk2Dtl_max_order) doWrk2Dtl_max_order_NX(info);
		else if (nx == columnWrk2Dtl_prio) doWrk2Dtl_prio_NX(info);
		else if (nx == columnWrk2Dtl_order_ratio) doWrk2Dtl_order_ratio_NX(info);
		else if (nx == columnWrk2Dtl_pre_po_tgt_flg) doWrk2Dtl_pre_po_tgt_flg_NX(info);
		else if (nx == columnWrk2Dtl_not_mrp_flg) doWrk2Dtl_not_mrp_flg_NX(info);
		else if (nx == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_NX(info);
		else if (nx == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_NX(info);
		else if (nx == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_NX(info);
		else if (nx == columnWrk3Dtl_check) doWrk3Dtl_check_NX(info);
		else if (nx == columnWrk3Dtl_del_flg) doWrk3Dtl_del_flg_NX(info);
		else if (nx == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_NX(info);
		else if (nx == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_NX(info);
		else if (nx == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_NX(info);
		else if (nx == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_NX(info);
		else if (nx == columnWrk3Dtl_loc_grp_cd) doWrk3Dtl_loc_grp_cd_NX(info);
		else if (nx == columnWrk3Dtl_loc_grp_nm) doWrk3Dtl_loc_grp_nm_NX(info);
		else if (nx == columnWrk3Dtl_prio) doWrk3Dtl_prio_NX(info);
		else if (nx == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_NX(info);
		else if (nx == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_NX(info);
		else if (nx == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_NX(info);
		else if (nx == columnWrk4Dtl_check) doWrk4Dtl_check_NX(info);
		else if (nx == columnWrk4Dtl_del_flg) doWrk4Dtl_del_flg_NX(info);
		else if (nx == columnWrk4Dtl_to_loc_cd) doWrk4Dtl_to_loc_cd_NX(info);
		else if (nx == columnWrk4Dtl_to_loc_nm) doWrk4Dtl_to_loc_nm_NX(info);
		else if (nx == columnWrk4Dtl_to_wg_cd) doWrk4Dtl_to_wg_cd_NX(info);
		else if (nx == columnWrk4Dtl_to_wg_nm) doWrk4Dtl_to_wg_nm_NX(info);
		else if (nx == columnWrk4Dtl_to_lg_grp_cd) doWrk4Dtl_to_lg_grp_cd_NX(info);
		else if (nx == columnWrk4Dtl_fr_loc_cd) doWrk4Dtl_fr_loc_cd_NX(info);
		else if (nx == columnWrk4Dtl_fr_loc_nm) doWrk4Dtl_fr_loc_nm_NX(info);
		else if (nx == columnWrk4Dtl_fr_wg_cd) doWrk4Dtl_fr_wg_cd_NX(info);
		else if (nx == columnWrk4Dtl_fr_lg_grp_cd) doWrk4Dtl_fr_lg_grp_cd_NX(info);
		else if (nx == columnWrk4Dtl_prio) doWrk4Dtl_prio_NX(info);
		else if (nx == columnWrk4Dtl_in_loc_flg) doWrk4Dtl_in_loc_flg_NX(info);
		else if (nx == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_NX(info);
		else if (nx == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_NX(info);
		else if (nx == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_NX(info);
		else if (nx == Wrk5SetDtHdr_st_dt) doWrk5SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk5SetDtHdr_end_dt) doWrk5SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk5Dtl_check) doWrk5Dtl_check_NX(info);
		else if (nx == columnWrk5Dtl_del_flg) doWrk5Dtl_del_flg_NX(info);
		else if (nx == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_NX(info);
		else if (nx == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_NX(info);
		else if (nx == columnWrk5Dtl_loc_grp_cd) doWrk5Dtl_loc_grp_cd_NX(info);
		else if (nx == columnWrk5Dtl_loc_grp_nm) doWrk5Dtl_loc_grp_nm_NX(info);
		else if (nx == columnWrk5Dtl_alloc_grp_cd) doWrk5Dtl_alloc_grp_cd_NX(info);
		else if (nx == columnWrk5Dtl_alloc_grp_nm) doWrk5Dtl_alloc_grp_nm_NX(info);
		else if (nx == columnWrk5Dtl_gi_schd_flg) doWrk5Dtl_gi_schd_flg_NX(info);
		else if (nx == columnWrk5Dtl_lot_sizing_flg) doWrk5Dtl_lot_sizing_flg_NX(info);
		else if (nx == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_gi_str_ln_tgt_flg) doWrk5Dtl_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_inpt_gi_str_ln_tgt_flg) doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_NX(info);
		else if (nx == columnWrk5Dtl_ship_gi_str_ln_tgt_flg) doWrk5Dtl_ship_gi_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_NX(info);
		else if (nx == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_NX(info);
		else if (nx == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_NX(info);
		else if (nx == Wrk6SetDtHdr_st_dt) doWrk6SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk6SetDtHdr_end_dt) doWrk6SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk6Dtl_check) doWrk6Dtl_check_NX(info);
		else if (nx == columnWrk6Dtl_del_flg) doWrk6Dtl_del_flg_NX(info);
		else if (nx == columnWrk6Dtl_sppl_cd) doWrk6Dtl_sppl_cd_NX(info);
		else if (nx == columnWrk6Dtl_sppl_nm) doWrk6Dtl_sppl_nm_NX(info);
		else if (nx == columnWrk6Dtl_lg_grp_cd) doWrk6Dtl_lg_grp_cd_NX(info);
		else if (nx == columnWrk6Dtl_lg_grp_nm) doWrk6Dtl_lg_grp_nm_NX(info);
		else if (nx == columnWrk6Dtl_purc_lt) doWrk6Dtl_purc_lt_NX(info);
		else if (nx == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_NX(info);
		else if (nx == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_NX(info);
		else if (nx == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_NX(info);
		else if (nx == Wrk7SetDtHdr_st_dt) doWrk7SetDtHdr_st_dt_NX(info);
		else if (nx == Wrk7SetDtHdr_end_dt) doWrk7SetDtHdr_end_dt_NX(info);
		else if (nx == columnWrk7Dtl_check) doWrk7Dtl_check_NX(info);
		else if (nx == columnWrk7Dtl_del_flg) doWrk7Dtl_del_flg_NX(info);
		else if (nx == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_NX(info);
		else if (nx == columnWrk7Dtl_bp_nm) doWrk7Dtl_bp_nm_NX(info);
		else if (nx == columnWrk7Dtl_sppl_flg) doWrk7Dtl_sppl_flg_NX(info);
		else if (nx == columnWrk7Dtl_cst_flg) doWrk7Dtl_cst_flg_NX(info);
		else if (nx == columnWrk7Dtl_bp_itm_cd) doWrk7Dtl_bp_itm_cd_NX(info);
		else if (nx == columnWrk7Dtl_bp_itm_nm) doWrk7Dtl_bp_itm_nm_NX(info);
		else if (nx == columnWrk7Dtl_def_flg) doWrk7Dtl_def_flg_NX(info);
		else if (nx == columnWrk7Dtl_pf_grp_cd) doWrk7Dtl_pf_grp_cd_NX(info);
		else if (nx == columnWrk7Dtl_pf_grp_nm) doWrk7Dtl_pf_grp_nm_NX(info);
		else if (nx == columnWrk7Dtl_pf_fix_flg) doWrk7Dtl_pf_fix_flg_NX(info);
		else if (nx == columnWrk7Dtl_purc_commit_flg) doWrk7Dtl_purc_commit_flg_NX(info);
		else if (nx == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_NX(info);
		else if (nx == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_NX(info);
		else if (nx == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_NX(info);
		else if (nx == columnWrk8Dtl_check) doWrk8Dtl_check_NX(info);
		else if (nx == columnWrk8Dtl_del_flg) doWrk8Dtl_del_flg_NX(info);
		else if (nx == columnWrk8Dtl_loc_cd) doWrk8Dtl_loc_cd_NX(info);
		else if (nx == columnWrk8Dtl_loc_nm) doWrk8Dtl_loc_nm_NX(info);
		else if (nx == columnWrk8Dtl_str_ln_tgt_flg) doWrk8Dtl_str_ln_tgt_flg_NX(info);
		else if (nx == columnWrk8Dtl_wg_cd) doWrk8Dtl_wg_cd_NX(info);
		else if (nx == columnWrk8Dtl_wg_nm) doWrk8Dtl_wg_nm_NX(info);
		else if (nx == columnWrk8Dtl_loc_grp_cd) doWrk8Dtl_loc_grp_cd_NX(info);
		else if (nx == columnWrk8Dtl_loc_grp_nm) doWrk8Dtl_loc_grp_nm_NX(info);
		else if (nx == columnWrk8Dtl_memo1) doWrk8Dtl_memo1_NX(info);
		else if (nx == columnWrk8Dtl_memo2) doWrk8Dtl_memo2_NX(info);
		else if (nx == columnWrk8Dtl_memo3) doWrk8Dtl_memo3_NX(info);
		else if (nx == columnWrk8Dtl_ins_usr_id) doWrk8Dtl_ins_usr_id_NX(info);
		else if (nx == columnWrk8Dtl_ins_usr_nm) doWrk8Dtl_ins_usr_nm_NX(info);
		else if (nx == columnWrk8Dtl_ins_ts) doWrk8Dtl_ins_ts_NX(info);
		else if (nx == columnWrk8Dtl_ins_func_id) doWrk8Dtl_ins_func_id_NX(info);
		else if (nx == columnWrk8Dtl_ins_func_nm) doWrk8Dtl_ins_func_nm_NX(info);
		else if (nx == columnWrk8Dtl_upd_cntr) doWrk8Dtl_upd_cntr_NX(info);
		else if (nx == columnWrk8Dtl_upd_usr_id) doWrk8Dtl_upd_usr_id_NX(info);
		else if (nx == columnWrk8Dtl_upd_usr_nm) doWrk8Dtl_upd_usr_nm_NX(info);
		else if (nx == columnWrk8Dtl_upd_ts) doWrk8Dtl_upd_ts_NX(info);
		else if (nx == columnWrk8Dtl_upd_func_id) doWrk8Dtl_upd_func_id_NX(info);
		else if (nx == columnWrk8Dtl_upd_func_nm) doWrk8Dtl_upd_func_nm_NX(info);
		else if (nx == columnWrk8Dtl_upd_srv_req_no) doWrk8Dtl_upd_srv_req_no_NX(info);
		else if (nx == columnWrk8Dtl_del_usr_id) doWrk8Dtl_del_usr_id_NX(info);
		else if (nx == columnWrk8Dtl_del_usr_nm) doWrk8Dtl_del_usr_nm_NX(info);
		else if (nx == columnWrk8Dtl_del_ts) doWrk8Dtl_del_ts_NX(info);
	}

	/**
	 * [DtlTab]TabのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doDtlTab_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]TableのNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_NX(MCEventInfo info){
	}

	/**
	 * [Cnd]パネルの[ope]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doCnd_ope_NX(MCEventInfo info){
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
	 * [Hdr]パネルの[unit_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sundry_itm_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sundry_itm_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[purc_input_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_purc_input_flg_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[pre_po_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_pre_po_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[po_batch_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_po_batch_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[not_mrp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_not_mrp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[buf_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_buf_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ord_fix_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ord_fix_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_week]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_week_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_sz_pd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_sz_pd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[max_order]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_max_order_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[order_ratio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_order_ratio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[pre_po_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_pre_po_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[not_mrp_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_not_mrp_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[in_loc_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_in_loc_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_schd_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_schd_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[lot_sizing_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_lot_sizing_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[purc_lt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_purc_lt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[st_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_st_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[end_dt]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_end_dt_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[sppl_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_sppl_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[cst_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_cst_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[def_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_def_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_fix_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_fix_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[purc_commit_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_purc_commit_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[check]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_check_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[str_ln_tgt_flg]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_str_ln_tgt_flg_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_cd]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_cd_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo1]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo1_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo2]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo2_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo3]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo3_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_cntr]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_cntr_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_ts_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_srv_req_no]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_srv_req_no_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_id]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_id_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_nm]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_nm_NX(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_ts]のNotificationExitイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_ts_NX(MCEventInfo info){
	}

	/**
	 * ListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param lc イベント対象のGUI部品
	 * @param info イベント情報
	 */
	public void doLCEvent(MCLCBeans lc, MCEventInfo info) {
		super.doLCEvent(lc, info);
		if (lc == Hdr_unit_cd) doHdr_unit_cd_LC(info);
		else if (lc == Hdr_unit_nm) doHdr_unit_nm_LC(info);
		else if (lc == Hdr_stk_mng_typ) doHdr_stk_mng_typ_LC(info);
		else if (lc == Hdr_stk_mng_typ_nm) doHdr_stk_mng_typ_nm_LC(info);
		else if (lc == Hdr_asset_mng_typ) doHdr_asset_mng_typ_LC(info);
		else if (lc == Hdr_asset_mng_typ_nm) doHdr_asset_mng_typ_nm_LC(info);
		else if (lc == Hdr_dec_place) doHdr_dec_place_LC(info);
		else if (lc == Hdr_sno1_mng_typ) doHdr_sno1_mng_typ_LC(info);
		else if (lc == Hdr_sno2_mng_typ) doHdr_sno2_mng_typ_LC(info);
		else if (lc == Hdr_sno3_mng_typ) doHdr_sno3_mng_typ_LC(info);
		else if (lc == Hdr_sno4_mng_typ) doHdr_sno4_mng_typ_LC(info);
		else if (lc == Hdr_upd_cntr) doHdr_upd_cntr_LC(info);
		else if (lc == Wrk1SetDtHdr_st_dt) doWrk1SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk1SetDtHdr_end_dt) doWrk1SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk1Dtl_wg_cd) doWrk1Dtl_wg_cd_LC(info);
		else if (lc == columnWrk1Dtl_wg_nm) doWrk1Dtl_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_sppl_cd) doWrk1Dtl_sppl_cd_LC(info);
		else if (lc == columnWrk1Dtl_sppl_nm) doWrk1Dtl_sppl_nm_LC(info);
		else if (lc == columnWrk1Dtl_maker_cd) doWrk1Dtl_maker_cd_LC(info);
		else if (lc == columnWrk1Dtl_maker_nm) doWrk1Dtl_maker_nm_LC(info);
		else if (lc == columnWrk1Dtl_purc_id_typ) doWrk1Dtl_purc_id_typ_LC(info);
		else if (lc == columnWrk1Dtl_purc_id_typ_nm) doWrk1Dtl_purc_id_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_purc_lt) doWrk1Dtl_purc_lt_LC(info);
		else if (lc == columnWrk1Dtl_purc_basis_typ) doWrk1Dtl_purc_basis_typ_LC(info);
		else if (lc == columnWrk1Dtl_purc_basis_typ_nm) doWrk1Dtl_purc_basis_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_accpt_insp_lt) doWrk1Dtl_accpt_insp_lt_LC(info);
		else if (lc == columnWrk1Dtl_buf_lt) doWrk1Dtl_buf_lt_LC(info);
		else if (lc == columnWrk1Dtl_ord_fix_pd) doWrk1Dtl_ord_fix_pd_LC(info);
		else if (lc == columnWrk1Dtl_sz_day_week_typ) doWrk1Dtl_sz_day_week_typ_LC(info);
		else if (lc == columnWrk1Dtl_sz_day_week_typ_nm) doWrk1Dtl_sz_day_week_typ_nm_LC(info);
		else if (lc == columnWrk1Dtl_sz_week) doWrk1Dtl_sz_week_LC(info);
		else if (lc == columnWrk1Dtl_lot_sz_pd) doWrk1Dtl_lot_sz_pd_LC(info);
		else if (lc == columnWrk1Dtl_max_order) doWrk1Dtl_max_order_LC(info);
		else if (lc == columnWrk1Dtl_prio) doWrk1Dtl_prio_LC(info);
		else if (lc == columnWrk1Dtl_order_ratio) doWrk1Dtl_order_ratio_LC(info);
		else if (lc == columnWrk1Dtl_rqst_wg_cd) doWrk1Dtl_rqst_wg_cd_LC(info);
		else if (lc == columnWrk1Dtl_rqst_wg_nm) doWrk1Dtl_rqst_wg_nm_LC(info);
		else if (lc == columnWrk1Dtl_cost_ratio) doWrk1Dtl_cost_ratio_LC(info);
		else if (lc == columnWrk1Dtl_memo1) doWrk1Dtl_memo1_LC(info);
		else if (lc == columnWrk1Dtl_memo2) doWrk1Dtl_memo2_LC(info);
		else if (lc == columnWrk1Dtl_memo3) doWrk1Dtl_memo3_LC(info);
		else if (lc == columnWrk1Dtl_ins_usr_id) doWrk1Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_ins_usr_nm) doWrk1Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_ins_ts) doWrk1Dtl_ins_ts_LC(info);
		else if (lc == columnWrk1Dtl_ins_func_id) doWrk1Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk1Dtl_ins_func_nm) doWrk1Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_cntr) doWrk1Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk1Dtl_upd_usr_id) doWrk1Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_upd_usr_nm) doWrk1Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_ts) doWrk1Dtl_upd_ts_LC(info);
		else if (lc == columnWrk1Dtl_upd_func_id) doWrk1Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk1Dtl_upd_func_nm) doWrk1Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk1Dtl_upd_srv_req_no) doWrk1Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk1Dtl_del_usr_id) doWrk1Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk1Dtl_del_usr_nm) doWrk1Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk1Dtl_del_ts) doWrk1Dtl_del_ts_LC(info);
		else if (lc == Wrk2SetDtHdr_st_dt) doWrk2SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk2SetDtHdr_end_dt) doWrk2SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk2Dtl_wg_cd) doWrk2Dtl_wg_cd_LC(info);
		else if (lc == columnWrk2Dtl_wg_nm) doWrk2Dtl_wg_nm_LC(info);
		else if (lc == columnWrk2Dtl_rqst_loc_cd) doWrk2Dtl_rqst_loc_cd_LC(info);
		else if (lc == columnWrk2Dtl_rqst_loc_nm) doWrk2Dtl_rqst_loc_nm_LC(info);
		else if (lc == columnWrk2Dtl_buf_lt) doWrk2Dtl_buf_lt_LC(info);
		else if (lc == columnWrk2Dtl_ord_fix_pd) doWrk2Dtl_ord_fix_pd_LC(info);
		else if (lc == columnWrk2Dtl_sz_day_week_typ) doWrk2Dtl_sz_day_week_typ_LC(info);
		else if (lc == columnWrk2Dtl_sz_day_week_typ_nm) doWrk2Dtl_sz_day_week_typ_nm_LC(info);
		else if (lc == columnWrk2Dtl_sz_week) doWrk2Dtl_sz_week_LC(info);
		else if (lc == columnWrk2Dtl_lot_sz_pd) doWrk2Dtl_lot_sz_pd_LC(info);
		else if (lc == columnWrk2Dtl_max_order) doWrk2Dtl_max_order_LC(info);
		else if (lc == columnWrk2Dtl_prio) doWrk2Dtl_prio_LC(info);
		else if (lc == columnWrk2Dtl_order_ratio) doWrk2Dtl_order_ratio_LC(info);
		else if (lc == columnWrk2Dtl_memo1) doWrk2Dtl_memo1_LC(info);
		else if (lc == columnWrk2Dtl_memo2) doWrk2Dtl_memo2_LC(info);
		else if (lc == columnWrk2Dtl_memo3) doWrk2Dtl_memo3_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_id) doWrk2Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_usr_nm) doWrk2Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_ins_ts) doWrk2Dtl_ins_ts_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_id) doWrk2Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk2Dtl_ins_func_nm) doWrk2Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_cntr) doWrk2Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_id) doWrk2Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_usr_nm) doWrk2Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_ts) doWrk2Dtl_upd_ts_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_id) doWrk2Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk2Dtl_upd_func_nm) doWrk2Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk2Dtl_upd_srv_req_no) doWrk2Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_id) doWrk2Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk2Dtl_del_usr_nm) doWrk2Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk2Dtl_del_ts) doWrk2Dtl_del_ts_LC(info);
		else if (lc == columnWrk3Dtl_loc_cd) doWrk3Dtl_loc_cd_LC(info);
		else if (lc == columnWrk3Dtl_loc_nm) doWrk3Dtl_loc_nm_LC(info);
		else if (lc == columnWrk3Dtl_wg_cd) doWrk3Dtl_wg_cd_LC(info);
		else if (lc == columnWrk3Dtl_wg_nm) doWrk3Dtl_wg_nm_LC(info);
		else if (lc == columnWrk3Dtl_loc_grp_cd) doWrk3Dtl_loc_grp_cd_LC(info);
		else if (lc == columnWrk3Dtl_loc_grp_nm) doWrk3Dtl_loc_grp_nm_LC(info);
		else if (lc == columnWrk3Dtl_prio) doWrk3Dtl_prio_LC(info);
		else if (lc == columnWrk3Dtl_memo1) doWrk3Dtl_memo1_LC(info);
		else if (lc == columnWrk3Dtl_memo2) doWrk3Dtl_memo2_LC(info);
		else if (lc == columnWrk3Dtl_memo3) doWrk3Dtl_memo3_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_id) doWrk3Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_usr_nm) doWrk3Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_ins_ts) doWrk3Dtl_ins_ts_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_id) doWrk3Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk3Dtl_ins_func_nm) doWrk3Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_cntr) doWrk3Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_id) doWrk3Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_usr_nm) doWrk3Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_ts) doWrk3Dtl_upd_ts_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_id) doWrk3Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk3Dtl_upd_func_nm) doWrk3Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk3Dtl_upd_srv_req_no) doWrk3Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_id) doWrk3Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk3Dtl_del_usr_nm) doWrk3Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk3Dtl_del_ts) doWrk3Dtl_del_ts_LC(info);
		else if (lc == columnWrk4Dtl_to_loc_cd) doWrk4Dtl_to_loc_cd_LC(info);
		else if (lc == columnWrk4Dtl_to_loc_nm) doWrk4Dtl_to_loc_nm_LC(info);
		else if (lc == columnWrk4Dtl_to_wg_cd) doWrk4Dtl_to_wg_cd_LC(info);
		else if (lc == columnWrk4Dtl_to_wg_nm) doWrk4Dtl_to_wg_nm_LC(info);
		else if (lc == columnWrk4Dtl_to_lg_grp_cd) doWrk4Dtl_to_lg_grp_cd_LC(info);
		else if (lc == columnWrk4Dtl_fr_loc_cd) doWrk4Dtl_fr_loc_cd_LC(info);
		else if (lc == columnWrk4Dtl_fr_loc_nm) doWrk4Dtl_fr_loc_nm_LC(info);
		else if (lc == columnWrk4Dtl_fr_wg_cd) doWrk4Dtl_fr_wg_cd_LC(info);
		else if (lc == columnWrk4Dtl_fr_lg_grp_cd) doWrk4Dtl_fr_lg_grp_cd_LC(info);
		else if (lc == columnWrk4Dtl_prio) doWrk4Dtl_prio_LC(info);
		else if (lc == columnWrk4Dtl_memo1) doWrk4Dtl_memo1_LC(info);
		else if (lc == columnWrk4Dtl_memo2) doWrk4Dtl_memo2_LC(info);
		else if (lc == columnWrk4Dtl_memo3) doWrk4Dtl_memo3_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_id) doWrk4Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_usr_nm) doWrk4Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_ins_ts) doWrk4Dtl_ins_ts_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_id) doWrk4Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk4Dtl_ins_func_nm) doWrk4Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_cntr) doWrk4Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_id) doWrk4Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_usr_nm) doWrk4Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_ts) doWrk4Dtl_upd_ts_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_id) doWrk4Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk4Dtl_upd_func_nm) doWrk4Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk4Dtl_upd_srv_req_no) doWrk4Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_id) doWrk4Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk4Dtl_del_usr_nm) doWrk4Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk4Dtl_del_ts) doWrk4Dtl_del_ts_LC(info);
		else if (lc == Wrk5SetDtHdr_st_dt) doWrk5SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk5SetDtHdr_end_dt) doWrk5SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk5Dtl_loc_cd) doWrk5Dtl_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_loc_nm) doWrk5Dtl_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_wg_cd) doWrk5Dtl_wg_cd_LC(info);
		else if (lc == columnWrk5Dtl_wg_nm) doWrk5Dtl_wg_nm_LC(info);
		else if (lc == columnWrk5Dtl_loc_grp_cd) doWrk5Dtl_loc_grp_cd_LC(info);
		else if (lc == columnWrk5Dtl_loc_grp_nm) doWrk5Dtl_loc_grp_nm_LC(info);
		else if (lc == columnWrk5Dtl_alloc_grp_cd) doWrk5Dtl_alloc_grp_cd_LC(info);
		else if (lc == columnWrk5Dtl_alloc_grp_nm) doWrk5Dtl_alloc_grp_nm_LC(info);
		else if (lc == columnWrk5Dtl_gi_loc_cd) doWrk5Dtl_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_gi_loc_nm) doWrk5Dtl_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_inpt_gi_loc_cd) doWrk5Dtl_inpt_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_inpt_gi_loc_nm) doWrk5Dtl_inpt_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_ship_gi_loc_cd) doWrk5Dtl_ship_gi_loc_cd_LC(info);
		else if (lc == columnWrk5Dtl_ship_gi_loc_nm) doWrk5Dtl_ship_gi_loc_nm_LC(info);
		else if (lc == columnWrk5Dtl_memo1) doWrk5Dtl_memo1_LC(info);
		else if (lc == columnWrk5Dtl_memo2) doWrk5Dtl_memo2_LC(info);
		else if (lc == columnWrk5Dtl_memo3) doWrk5Dtl_memo3_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_id) doWrk5Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_usr_nm) doWrk5Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_ins_ts) doWrk5Dtl_ins_ts_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_id) doWrk5Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk5Dtl_ins_func_nm) doWrk5Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_cntr) doWrk5Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_id) doWrk5Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_usr_nm) doWrk5Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_ts) doWrk5Dtl_upd_ts_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_id) doWrk5Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk5Dtl_upd_func_nm) doWrk5Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk5Dtl_upd_srv_req_no) doWrk5Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_id) doWrk5Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk5Dtl_del_usr_nm) doWrk5Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk5Dtl_del_ts) doWrk5Dtl_del_ts_LC(info);
		else if (lc == Wrk6SetDtHdr_st_dt) doWrk6SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk6SetDtHdr_end_dt) doWrk6SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk6Dtl_sppl_cd) doWrk6Dtl_sppl_cd_LC(info);
		else if (lc == columnWrk6Dtl_sppl_nm) doWrk6Dtl_sppl_nm_LC(info);
		else if (lc == columnWrk6Dtl_lg_grp_cd) doWrk6Dtl_lg_grp_cd_LC(info);
		else if (lc == columnWrk6Dtl_lg_grp_nm) doWrk6Dtl_lg_grp_nm_LC(info);
		else if (lc == columnWrk6Dtl_purc_lt) doWrk6Dtl_purc_lt_LC(info);
		else if (lc == columnWrk6Dtl_memo1) doWrk6Dtl_memo1_LC(info);
		else if (lc == columnWrk6Dtl_memo2) doWrk6Dtl_memo2_LC(info);
		else if (lc == columnWrk6Dtl_memo3) doWrk6Dtl_memo3_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_id) doWrk6Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_usr_nm) doWrk6Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_ins_ts) doWrk6Dtl_ins_ts_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_id) doWrk6Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk6Dtl_ins_func_nm) doWrk6Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_cntr) doWrk6Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_id) doWrk6Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_usr_nm) doWrk6Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_ts) doWrk6Dtl_upd_ts_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_id) doWrk6Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk6Dtl_upd_func_nm) doWrk6Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk6Dtl_upd_srv_req_no) doWrk6Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_id) doWrk6Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk6Dtl_del_usr_nm) doWrk6Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk6Dtl_del_ts) doWrk6Dtl_del_ts_LC(info);
		else if (lc == Wrk7SetDtHdr_st_dt) doWrk7SetDtHdr_st_dt_LC(info);
		else if (lc == Wrk7SetDtHdr_end_dt) doWrk7SetDtHdr_end_dt_LC(info);
		else if (lc == columnWrk7Dtl_bp_cd) doWrk7Dtl_bp_cd_LC(info);
		else if (lc == columnWrk7Dtl_bp_nm) doWrk7Dtl_bp_nm_LC(info);
		else if (lc == columnWrk7Dtl_bp_itm_cd) doWrk7Dtl_bp_itm_cd_LC(info);
		else if (lc == columnWrk7Dtl_bp_itm_nm) doWrk7Dtl_bp_itm_nm_LC(info);
		else if (lc == columnWrk7Dtl_pf_grp_cd) doWrk7Dtl_pf_grp_cd_LC(info);
		else if (lc == columnWrk7Dtl_pf_grp_nm) doWrk7Dtl_pf_grp_nm_LC(info);
		else if (lc == columnWrk7Dtl_memo1) doWrk7Dtl_memo1_LC(info);
		else if (lc == columnWrk7Dtl_memo2) doWrk7Dtl_memo2_LC(info);
		else if (lc == columnWrk7Dtl_memo3) doWrk7Dtl_memo3_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_id) doWrk7Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_usr_nm) doWrk7Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_ins_ts) doWrk7Dtl_ins_ts_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_id) doWrk7Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk7Dtl_ins_func_nm) doWrk7Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_cntr) doWrk7Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_id) doWrk7Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_usr_nm) doWrk7Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_ts) doWrk7Dtl_upd_ts_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_id) doWrk7Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk7Dtl_upd_func_nm) doWrk7Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk7Dtl_upd_srv_req_no) doWrk7Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_id) doWrk7Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk7Dtl_del_usr_nm) doWrk7Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk7Dtl_del_ts) doWrk7Dtl_del_ts_LC(info);
		else if (lc == columnWrk8Dtl_loc_cd) doWrk8Dtl_loc_cd_LC(info);
		else if (lc == columnWrk8Dtl_loc_nm) doWrk8Dtl_loc_nm_LC(info);
		else if (lc == columnWrk8Dtl_wg_cd) doWrk8Dtl_wg_cd_LC(info);
		else if (lc == columnWrk8Dtl_wg_nm) doWrk8Dtl_wg_nm_LC(info);
		else if (lc == columnWrk8Dtl_loc_grp_cd) doWrk8Dtl_loc_grp_cd_LC(info);
		else if (lc == columnWrk8Dtl_loc_grp_nm) doWrk8Dtl_loc_grp_nm_LC(info);
		else if (lc == columnWrk8Dtl_memo1) doWrk8Dtl_memo1_LC(info);
		else if (lc == columnWrk8Dtl_memo2) doWrk8Dtl_memo2_LC(info);
		else if (lc == columnWrk8Dtl_memo3) doWrk8Dtl_memo3_LC(info);
		else if (lc == columnWrk8Dtl_ins_usr_id) doWrk8Dtl_ins_usr_id_LC(info);
		else if (lc == columnWrk8Dtl_ins_usr_nm) doWrk8Dtl_ins_usr_nm_LC(info);
		else if (lc == columnWrk8Dtl_ins_ts) doWrk8Dtl_ins_ts_LC(info);
		else if (lc == columnWrk8Dtl_ins_func_id) doWrk8Dtl_ins_func_id_LC(info);
		else if (lc == columnWrk8Dtl_ins_func_nm) doWrk8Dtl_ins_func_nm_LC(info);
		else if (lc == columnWrk8Dtl_upd_cntr) doWrk8Dtl_upd_cntr_LC(info);
		else if (lc == columnWrk8Dtl_upd_usr_id) doWrk8Dtl_upd_usr_id_LC(info);
		else if (lc == columnWrk8Dtl_upd_usr_nm) doWrk8Dtl_upd_usr_nm_LC(info);
		else if (lc == columnWrk8Dtl_upd_ts) doWrk8Dtl_upd_ts_LC(info);
		else if (lc == columnWrk8Dtl_upd_func_id) doWrk8Dtl_upd_func_id_LC(info);
		else if (lc == columnWrk8Dtl_upd_func_nm) doWrk8Dtl_upd_func_nm_LC(info);
		else if (lc == columnWrk8Dtl_upd_srv_req_no) doWrk8Dtl_upd_srv_req_no_LC(info);
		else if (lc == columnWrk8Dtl_del_usr_id) doWrk8Dtl_del_usr_id_LC(info);
		else if (lc == columnWrk8Dtl_del_usr_nm) doWrk8Dtl_del_usr_nm_LC(info);
		else if (lc == columnWrk8Dtl_del_ts) doWrk8Dtl_del_ts_LC(info);
	}

	/**
	 * [Hdr]パネルの[unit_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_cd_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[unit_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_unit_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[stk_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_stk_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[asset_mng_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_asset_mng_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[dec_place]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_dec_place_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno1_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno1_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno2_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno2_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno3_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno3_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[sno4_mng_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_sno4_mng_typ_LC(MCEventInfo info){
	}

	/**
	 * [Hdr]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doHdr_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[maker_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_maker_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_id_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_id_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[purc_basis_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_purc_basis_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[accpt_insp_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_accpt_insp_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[buf_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_buf_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ord_fix_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ord_fix_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[sz_week]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_sz_week_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[lot_sz_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_lot_sz_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[max_order]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_max_order_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[order_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_order_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[rqst_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_rqst_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[cost_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_cost_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk1Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk1Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[rqst_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_rqst_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[buf_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_buf_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ord_fix_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ord_fix_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_day_week_typ_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_day_week_typ_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[sz_week]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_sz_week_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[lot_sz_pd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_lot_sz_pd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[max_order]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_max_order_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[order_ratio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_order_ratio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk2Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk2Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk3Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk3Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[to_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_to_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[fr_lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_fr_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[prio]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_prio_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk4Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk4Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[alloc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_alloc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[inpt_gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_inpt_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ship_gi_loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ship_gi_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk5Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk5Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[sppl_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_sppl_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[lg_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_lg_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[purc_lt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_purc_lt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk6Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk6Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[st_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_st_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7SetDtHdr]パネルの[end_dt]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7SetDtHdr_end_dt_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[bp_itm_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_bp_itm_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[pf_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_pf_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk7Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk7Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[wg_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_wg_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_cd]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_cd_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[loc_grp_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_loc_grp_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo1]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo1_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo2]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo2_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[memo3]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_memo3_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[ins_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_ins_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_cntr]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_cntr_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_ts_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_func_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_func_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[upd_srv_req_no]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_upd_srv_req_no_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_id]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_id_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_usr_nm]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_usr_nm_LC(MCEventInfo info){
	}

	/**
	 * [Wrk8Dtl]パネルの[del_ts]のListChangedイベントが実行されたときに呼び出されます。
	 *
	 * @param info イベント情報
	 */
	public void doWrk8Dtl_del_ts_LC(MCEventInfo info){
	}

	/**
	 * コンボ／リストのリスト[Wrk1Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk1Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk1Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk1Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk1Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_wg_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgOrSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_sppl_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_maker_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_maker_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_purc_id_typ]の作成メソッド
	 */
	public MCList getWrk1Dtl_purc_id_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcIdTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_purc_basis_typ]の作成メソッド
	 */
	public MCList getWrk1Dtl_purc_basis_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcBasisTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_sz_day_week_typ]の作成メソッド
	 */
	public MCList getWrk1Dtl_sz_day_week_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDayWeekTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk1Dtl_rqst_wg_cd]の作成メソッド
	 */
	public MCList getWrk1Dtl_rqst_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPurcWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_wg_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_wg_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgOrMfgOrSlsWg(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_rqst_loc_cd]の作成メソッド
	 */
	public MCList getWrk2Dtl_rqst_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk2Dtl_sz_day_week_typ]の作成メソッド
	 */
	public MCList getWrk2Dtl_sz_day_week_typ(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getDayWeekTyp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk3Dtl_loc_cd]の作成メソッド
	 */
	public MCList getWrk3Dtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk4Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk4Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk4Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk4Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk4Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_to_loc_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_to_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk4Dtl_fr_loc_cd]の作成メソッド
	 */
	public MCList getWrk4Dtl_fr_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk5Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk5Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk5Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk5Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk5Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_loc_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_gi_loc_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_inpt_gi_loc_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_inpt_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk5Dtl_ship_gi_loc_cd]の作成メソッド
	 */
	public MCList getWrk5Dtl_ship_gi_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk6Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk6Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk6Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk6Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk6Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk6Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_sppl_cd]の作成メソッド
	 */
	public MCList getWrk6Dtl_sppl_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk6Dtl_lg_grp_cd]の作成メソッド
	 */
	public MCList getWrk6Dtl_lg_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLgGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk7Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk7Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk7Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk7Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk7Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk7Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk7Dtl_bp_cd]の作成メソッド
	 */
	public MCList getWrk7Dtl_bp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getBp(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk7Dtl_pf_grp_cd]の作成メソッド
	 */
	public MCList getWrk7Dtl_pf_grp_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getPfGrp(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk8Dtl_itm_p_PPanel_columnItm_itm_cd]の作成メソッド
	 */
	public MCList getWrk8Dtl_itm_p_PPanel_columnItm_itm_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItm(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk8Dtl_itm_p_PPanel_columnItm_itm_sub1]の作成メソッド
	 */
	public MCList getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub1(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub1(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk8Dtl_itm_p_PPanel_columnItm_itm_sub2]の作成メソッド
	 */
	public MCList getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub2(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub2(row, info);
	}

	/**
	 * コンボ／リストのリスト[Wrk8Dtl_itm_p_PPanel_columnItm_itm_sub3]の作成メソッド
	 */
	public MCList getWrk8Dtl_itm_p_PPanel_columnItm_itm_sub3(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getItmSub3(row, info);
	}

	/**
	 * コンボ／リストのリスト[columnWrk8Dtl_loc_cd]の作成メソッド
	 */
	public MCList getWrk8Dtl_loc_cd(MCRow row, MCEventInfo info){
		return ((mcframe.clientMAUA.MAUAP0010.MAUAP_List)MCListLogic.create("mcframe.clientMAUA.MAUAP0010.MAUAP_List", this)).getLoc(row, info);
	}

	@Override
	public MCCallerPanelBridge createBridge(String id) {
		if (id.equals("MA.MABSL1110.Srch01")) {
			return new MA_MABSL1110_Srch01Bridge();
		}
		if (id.equals("MA.MABSL1110.Upd01")) {
			return new MA_MABSL1110_Upd01Bridge();
		}
		return super.createBridge(id);
	}
	/**
	 * [MA_MABSL1110_Srch01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1110_Srch01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1110_Srch01;

		/** コンストラクタ */
		protected MA_MABSL1110_Srch01Bridge() {
			p_MA_MABSL1110_Srch01 = new MCParam(PDef.MA_MABSL1110_Srch01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1110_Srch01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(mcframe.clientMABS.MABSP1110.CndR.create());
			// Down
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.HdrR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk3DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.class));
			param.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.class));

			p_MA_MABSL1110_Srch01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1110_Srch01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1110_Srch01.addUpBlock(getCndR());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1110_Srch01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(i);
		}
		
		protected mcframe.clientMABS.MABSP1110.CndR up0() {
			return (mcframe.clientMABS.MABSP1110.CndR)up(0);
		}

		protected MCList<mcframe.clientMABS.MABSP1110.HdrR> down0() {
			return (MCList<mcframe.clientMABS.MABSP1110.HdrR>)down(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> down1() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR>)down(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> down2() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR>)down(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> down3() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR>)down(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> down4() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR>)down(4);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> down5() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR>)down(5);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> down6() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR>)down(6);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> down7() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR>)down(7);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> down8() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR>)down(8);
		}

		protected void setupDownParam() {
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.HdrR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk3DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.class));
			p_MA_MABSL1110_Srch01.addDownBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.class));
		}
		protected MCParam param() {
			return p_MA_MABSL1110_Srch01;
		}

		protected void show() {
			setHdrAllL((MCList<mcframe.clientMABS.MABSP1110.HdrR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(0));
			setWrk1DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(1));
			setWrk2DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(2));
			setWrk3DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(3));
			setWrk4DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(4));
			setWrk5DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(5));
			setWrk6DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(6));
			setWrk7DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(7));
			setWrk8DtlL((MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR>)p_MA_MABSL1110_Srch01.getContainerParam().getDownBlock(8));
		}

		protected void clear() {
			getHdrAllL().clear();
			getWrk1DtlL().clear();
			getWrk2DtlL().clear();
			getWrk3DtlL().clear();
			getWrk4DtlL().clear();
			getWrk5DtlL().clear();
			getWrk6DtlL().clear();
			getWrk7DtlL().clear();
			getWrk8DtlL().clear();
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getCndR());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk1DtlL());
			result.add(getWrk2DtlL());
			result.add(getWrk3DtlL());
			result.add(getWrk4DtlL());
			result.add(getWrk5DtlL());
			result.add(getWrk6DtlL());
			result.add(getWrk7DtlL());
			result.add(getWrk8DtlL());
			return result;
		}
	}
	/**
	 * [MA_MABSL1110_Upd01]の定型処理のInnerClass
	 */
	protected class MA_MABSL1110_Upd01Bridge extends MCCallerPanelBridge {
		/**
		 * 電文パラメータ<p>
		 * 
		 * 参照する場合には{@link #param()}を使用してください。
		 */
		MCParam p_MA_MABSL1110_Upd01;

		/** コンストラクタ */
		protected MA_MABSL1110_Upd01Bridge() {
			p_MA_MABSL1110_Upd01 = new MCParam(PDef.MA_MABSL1110_Upd01_INFO);
		}

		@Override
		public MCParam createAsyncParam() {
			MCParam param = new MCParam(PDef.MA_MABSL1110_Upd01_INFO);
			param.setReqSrcId(getScreenID());
			// Up
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.HdrR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk1DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk2DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk3DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk4DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk5DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk6DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk7DtlR.class));
			param.addUpBlock(MCList.create(mcframe.clientMABS.MABSP1110.Wrk8DtlR.class));
			// Down

			p_MA_MABSL1110_Upd01 = param;
			return param;
		}

		/** パラメータを通信用に設定します。*/
		protected void setupParam() {
			p_MA_MABSL1110_Upd01.setReqSrcId(getScreenID());
			setupUpParam();
			setupDownParam();
		}

		protected void setupUpParam() {
			p_MA_MABSL1110_Upd01.addUpBlock(getHdrAllL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk1DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk2DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk3DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk4DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk5DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk6DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk7DtlL().shallowClone());
			p_MA_MABSL1110_Upd01.addUpBlock(getWrk8DtlL().shallowClone());
		}

		protected MCContainer up(int i) {
			return p_MA_MABSL1110_Upd01.getContainerParam().getUpBlock(i);
		}
		
		protected MCContainer down(int i) {
			return p_MA_MABSL1110_Upd01.getContainerParam().getDownBlock(i);
		}
		
		protected MCList<mcframe.clientMABS.MABSP1110.HdrR> up0() {
			return (MCList<mcframe.clientMABS.MABSP1110.HdrR>)up(0);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR> up1() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk1DtlR>)up(1);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR> up2() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk2DtlR>)up(2);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR> up3() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk3DtlR>)up(3);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR> up4() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk4DtlR>)up(4);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR> up5() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk5DtlR>)up(5);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR> up6() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk6DtlR>)up(6);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR> up7() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk7DtlR>)up(7);
		}
		protected MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR> up8() {
			return (MCList<mcframe.clientMABS.MABSP1110.Wrk8DtlR>)up(8);
		}


		protected void setupDownParam() {
		}
		protected MCParam param() {
			return p_MA_MABSL1110_Upd01;
		}

		protected void show() {
		}

		protected void clear() {
		}
		
		protected List<MCContainer> getUpBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			result.add(getHdrAllL());
			result.add(getWrk1DtlL());
			result.add(getWrk2DtlL());
			result.add(getWrk3DtlL());
			result.add(getWrk4DtlL());
			result.add(getWrk5DtlL());
			result.add(getWrk6DtlL());
			result.add(getWrk7DtlL());
			result.add(getWrk8DtlL());
			return result;
		}
		
		protected List<MCContainer> getDownBlocks() {
			List<MCContainer> result = new ArrayList<MCContainer>();
			return result;
		}
	}
}